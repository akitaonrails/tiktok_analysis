package X;

import Y.ARunnableS38S0400000_30;
import Y.AfS186S0100000_17;
import android.content.Context;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.impl.revenue.guardian.api.GuardianApi;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.bduploader.BDImageXUploader;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS561S0100000_17;
import tikcast.api.persona.EditGuardianAutographRequest;
import tikcast.api.persona.PrivilegeImageXUploadedToken;
import tikcast.api.persona.QueryGuardianAutographResponse;

/* JADX INFO: renamed from: X.0fBt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1117670fBt {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public PrivilegeImageXUploadedToken LIZLLL;

    public C1117670fBt(DataChannel dataChannel) {
        long ownerUserId;
        Room room;
        Room room2;
        long id = 0;
        if (dataChannel != null && (room2 = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            ownerUserId = room2.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        this.LIZ = ownerUserId;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            id = room.getId();
        }
        this.LIZIZ = id;
        this.LIZJ = UserService.getInstance().user().getCurrentUserId();
    }

    public final void LIZ(final Context context, final byte[] bArr, final int i, final Function0<Unit> function0, final Function0<Unit> function02) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshTokenAndRetryUpload: re-fetching upload token, attempt=");
        sbLIZ.append(i);
        C20441214yg.LJIIIZ("GuardianAutographPresenter", C2188811AlT.LIZIZ(sbLIZ));
        C480460Ism.LIZ().getClass();
        ((GuardianApi) C480460Ism.LIZLLL(GuardianApi.class)).queryGuardianAutograph(String.valueOf(this.LIZJ), String.valueOf(this.LIZ)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0fBs
            @Override // X.C09JN
            public final void accept(Object obj) {
                QueryGuardianAutographResponse.ResponseData responseData;
                PrivilegeImageXUploadedToken privilegeImageXUploadedToken;
                C1C7U.LIZ("GuardianAutographPresenter@8ef9.refreshTokenAndRetryUpload$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                if (baseResponse != null && (responseData = (QueryGuardianAutographResponse.ResponseData) baseResponse.data) != null && (privilegeImageXUploadedToken = responseData.imageXUploadedToken) != null) {
                    this.LL.LIZLLL = privilegeImageXUploadedToken;
                    this.LL.LIZIZ(context, bArr, i, function0, function02);
                } else {
                    C20441214yg.LJ("GuardianAutographPresenter", "refreshTokenAndRetryUpload: missing token, giving up");
                    function02.invoke();
                }
                C1C7U.LIZIZ("GuardianAutographPresenter@8ef9.refreshTokenAndRetryUpload$1");
            }
        }, new AfS186S0100000_17(function02, 132));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [X.0fBu, java.lang.Object] */
    public final void LIZIZ(final Context context, final byte[] bArr, final int i, final Function0<Unit> function0, final Function0<Unit> function02) {
        Long lLJIILIIL;
        PrivilegeImageXUploadedToken privilegeImageXUploadedToken = this.LIZLLL;
        if (privilegeImageXUploadedToken != null && (lLJIILIIL = C2095008Iq.LJIILIIL(privilegeImageXUploadedToken.expiredTime)) != null && lLJIILIIL.longValue() > System.currentTimeMillis() / 1000) {
            PrivilegeImageXUploadedToken privilegeImageXUploadedToken2 = this.LIZLLL;
            if (privilegeImageXUploadedToken2 == null) {
                privilegeImageXUploadedToken2 = new PrivilegeImageXUploadedToken();
            }
            final C143P c143p = new C143P(context, privilegeImageXUploadedToken2);
            ?? r5 = new C143V() { // from class: X.0fBu
                @Override // X.C143V
                public final void onError(String str) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("upload onError: ");
                    sbLIZ.append(str);
                    sbLIZ.append(", attempt=");
                    sbLIZ.append(i);
                    C20441214yg.LJ("GuardianAutographPresenter", C2188811AlT.LIZIZ(sbLIZ));
                    c143p.LIZ();
                    int i2 = i;
                    if (i2 < 2) {
                        this.LIZ(context, bArr, i2 + 1, function0, function02);
                        return;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("upload retries exhausted after ");
                    sbLIZ2.append(i + 1);
                    sbLIZ2.append(" attempts");
                    C20441214yg.LJ("GuardianAutographPresenter", C2188811AlT.LIZIZ(sbLIZ2));
                    function02.invoke();
                }

                @Override // X.C143V
                public final void onProgress(int i2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("upload onProgress: ");
                    sbLIZ.append(i2);
                    C20441214yg.LIZIZ("GuardianAutographPresenter", C2188811AlT.LIZIZ(sbLIZ));
                }

                @Override // X.C143V
                public final void onSuccess(String str) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("upload onSuccess: tosKey=");
                    sbLIZ.append(str);
                    sbLIZ.append(", attempt=");
                    sbLIZ.append(i);
                    C20441214yg.LJIIIZ("GuardianAutographPresenter", C2188811AlT.LIZIZ(sbLIZ));
                    C1117670fBt c1117670fBt = this;
                    C143P c143p2 = c143p;
                    Function0<Unit> function03 = function0;
                    Function0<Unit> function04 = function02;
                    c1117670fBt.getClass();
                    C480460Ism.LIZ().getClass();
                    GuardianApi guardianApi = (GuardianApi) C480460Ism.LIZLLL(GuardianApi.class);
                    EditGuardianAutographRequest editGuardianAutographRequest = new EditGuardianAutographRequest();
                    editGuardianAutographRequest.anchorId = String.valueOf(c1117670fBt.LIZ);
                    editGuardianAutographRequest.autographUri = str;
                    editGuardianAutographRequest.roomId = String.valueOf(c1117670fBt.LIZIZ);
                    guardianApi.editGuardianAutograph(editGuardianAutographRequest).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C516701zp(function03, function04, c143p2, 8), new C515801zg(function04, c143p2, 54));
                }
            };
            BDImageXUploader bDImageXUploader = c143p.LJ;
            if (bDImageXUploader == null) {
                c143p.LIZIZ(new AwS561S0100000_17((C1117680fBu) r5, 493));
                return;
            } else {
                c143p.LIZLLL.execute(new ARunnableS38S0400000_30(c143p, bDImageXUploader, bArr, r5, 2));
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uploadWithRetry: cached token missing or expired, attempt=");
        sbLIZ.append(i);
        C20441214yg.LJIIIZ("GuardianAutographPresenter", C2188811AlT.LIZIZ(sbLIZ));
        if (i < 2) {
            LIZ(context, bArr, i + 1, function0, function02);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("upload retries exhausted after ");
        sbLIZ2.append(i + 1);
        sbLIZ2.append(" attempts");
        C20441214yg.LJ("GuardianAutographPresenter", C2188811AlT.LIZIZ(sbLIZ2));
        function02.invoke();
    }
}
