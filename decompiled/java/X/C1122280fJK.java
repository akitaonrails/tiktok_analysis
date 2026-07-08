package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.commentdetector.HighIntentCommentDetectorViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import webcast.api.smb.ReportHighIntentUserReq;

/* JADX INFO: renamed from: X.0fJK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122280fJK extends C09AY implements Function1<AbstractC1122140fJ6, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ HighIntentCommentDetectorViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function1<Float, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122280fJK(long j, HighIntentCommentDetectorViewModel highIntentCommentDetectorViewModel, String str, C1122780fK8 c1122780fK8) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = highIntentCommentDetectorViewModel;
        this.LLILLL = str;
        this.LLILZ = c1122780fK8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1122140fJ6 abstractC1122140fJ6) throws JSONException {
        int i;
        String secUid;
        long id;
        User owner;
        AbstractC1122140fJ6 abstractC1122140fJ62 = abstractC1122140fJ6;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LL;
        if (abstractC1122140fJ62 instanceof C1122130fJ5) {
            float fLIZ = C1122290fJL.LIZ(((C1122130fJ5) abstractC1122140fJ62).LIZ);
            this.LLILLJJLI.getClass();
            if (fLIZ > 0.5f) {
                i = 1;
            } else {
                i = 0;
            }
            HighIntentCommentDetectorViewModel.xQ2(this.LLILLJJLI, i, jCurrentTimeMillis, fLIZ, null, 16);
            if (i == 1) {
                HighIntentCommentDetectorViewModel highIntentCommentDetectorViewModel = this.LLILLJJLI;
                String str = this.LLILLL;
                if (highIntentCommentDetectorViewModel.LLILZIL != null && highIntentCommentDetectorViewModel.LL != null) {
                    ReportHighIntentUserReq reportHighIntentUserReq = new ReportHighIntentUserReq();
                    Room room = highIntentCommentDetectorViewModel.LLILZIL;
                    if (room == null || (owner = room.getOwner()) == null || (secUid = owner.getSecUid()) == null) {
                        secUid = "";
                    }
                    reportHighIntentUserReq.secAnchorId = secUid;
                    Room room2 = highIntentCommentDetectorViewModel.LLILZIL;
                    if (room2 != null) {
                        id = room2.getId();
                    } else {
                        id = 0;
                    }
                    reportHighIntentUserReq.roomId = id;
                    reportHighIntentUserReq.commentText = str;
                    C1808280x9m.LJFF(highIntentCommentDetectorViewModel.LL.postHighIntentUserData(reportHighIntentUserReq).LJIILIIL(new C0UO0()), null, "/smb/efficiency/report_high_intent_user/", null, 13).LJJLJ();
                }
                this.LLILZ.invoke(Float.valueOf(fLIZ));
            }
        } else if (abstractC1122140fJ62 instanceof C1122120fJ4) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C1122120fJ4 c1122120fJ4 = (C1122120fJ4) abstractC1122140fJ62;
            sbLIZ.append(c1122120fJ4.LIZ.LIZ);
            sbLIZ.append(' ');
            sbLIZ.append(c1122120fJ4.LIZ.LIZIZ);
            HighIntentCommentDetectorViewModel.xQ2(this.LLILLJJLI, -1, jCurrentTimeMillis, 0.0f, C2188811AlT.LIZIZ(sbLIZ), 4);
            this.LLILLJJLI.yQ2(this.LLILLL, new C163300jv(this.LLILZ));
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }
}
