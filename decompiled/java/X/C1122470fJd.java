package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.pcs.data.api.PcsApi;
import com.bytedance.android.livesdk.livesetting.subscription.LivePcsIdentifyCommentMethodSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostPCS;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import webcast.api.smb.CommentIdentificationReq;
import webcast.api.smb.CommentIdentificationResp;

/* JADX INFO: renamed from: X.0fJd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122470fJd {
    public final Function1<C1883607Zi, Unit> LIZ;
    public final Function0<Float> LIZIZ;
    public final PcsApi LIZJ;
    public final IHostPCS LIZLLL;
    public final C11NJ LJ;
    public final boolean LJFF;
    public AbstractC1122920fKM LJI;

    public final void LIZ() {
        float fFloatValue = this.LIZIZ.invoke().floatValue();
        C051E.LIZ("comment.trigger", new Pair("current_interaction_score", Float.valueOf(fFloatValue)));
        this.LIZ.invoke(new C1883607Zi(EnumC1122690fJz.COMMENT, fFloatValue, C2097608Jq.LJ()));
    }

    public C1122470fJd(C1122880fKI c1122880fKI, C1122830fKD c1122830fKD) {
        boolean z;
        this.LIZ = c1122880fKI;
        this.LIZIZ = c1122830fKD;
        C480460Ism.LIZ().getClass();
        this.LIZJ = (PcsApi) C480460Ism.LIZIZ(PcsApi.class);
        this.LIZLLL = (IHostPCS) C1161920gLG.LIZJ(IHostPCS.class);
        this.LJ = new C11NJ();
        if (LivePcsIdentifyCommentMethodSetting.INSTANCE.getValue() == 2) {
            z = true;
        } else {
            z = false;
        }
        this.LJFF = z;
    }

    public final void LIZIZ(Room room, String str) {
        String secUid;
        String secUid2;
        boolean z = false;
        if (this.LIZJ == null) {
            C051E.LIZ("comment.server.skip", new Pair("reason", "pcs_api_null"), new Pair("room_id", Long.valueOf(room.getId())));
            return;
        }
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("room_id", Long.valueOf(room.getId()));
        User owner = room.getOwner();
        if (owner == null || (secUid2 = owner.getSecUid()) == null || secUid2.length() == 0) {
            z = true;
        }
        pairArr[1] = new Pair("has_anchor", Boolean.valueOf(!z));
        pairArr[2] = new Pair("comment_length", Integer.valueOf(str.length()));
        C051E.LIZ("comment.server.request", pairArr);
        PcsApi pcsApi = this.LIZJ;
        CommentIdentificationReq commentIdentificationReq = new CommentIdentificationReq();
        User owner2 = room.getOwner();
        if (owner2 == null || (secUid = owner2.getSecUid()) == null) {
            secUid = "";
        }
        commentIdentificationReq.secAnchorId = secUid;
        commentIdentificationReq.roomId = room.getId();
        commentIdentificationReq.commentText = str;
        this.LJ.LIZ(C1808280x9m.LJFF(pcsApi.getHighIntentCommentIdentification(commentIdentificationReq).LJIILIIL(new C0UO0()), null, "/smb/efficiency/comment_identification/", null, 13).LJJLL(new C09JN() { // from class: X.0fJN
            @Override // X.C09JN
            public final void accept(Object obj) {
                Integer numValueOf;
                boolean z2;
                CommentIdentificationResp.ResponseData responseData;
                C1C7U.LIZ("CommentTriggerModel@10ca.useServerModel$disposable$2");
                BaseResponse baseResponse = (BaseResponse) obj;
                if (baseResponse != null && (responseData = (CommentIdentificationResp.ResponseData) baseResponse.data) != null) {
                    numValueOf = Integer.valueOf(responseData.commentIdentifyType);
                } else {
                    numValueOf = null;
                }
                if (numValueOf != null && numValueOf.intValue() == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C051E.LIZ("comment.server.result", new Pair("type", numValueOf), new Pair("triggered", Boolean.valueOf(z2)));
                if (z2) {
                    this.LL.LIZ();
                }
                C1C7U.LIZIZ("CommentTriggerModel@10ca.useServerModel$disposable$2");
            }
        }, new C09JN() { // from class: X.057C
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("CommentTriggerModel@10ca.useServerModel$disposable$3");
                C051E.LIZ("comment.server.error", new Pair("message", ((Throwable) obj).getMessage()));
                C1C7U.LIZIZ("CommentTriggerModel@10ca.useServerModel$disposable$3");
            }
        }));
    }
}
