package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabPreloadTTLSetting;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS14S0211000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0Kul, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C532650Kul implements IVideoLegalCheckerAndToastService {
    public final Context LIZ;

    public C532650Kul(Context context) {
        this.LIZ = context;
    }

    public static MediaModel LIZ(String str) {
        int[] iArrLIZIZ = C1404710mer.LIZIZ(str);
        if (iArrLIZIZ == null) {
            return null;
        }
        MediaModel mediaModel = new MediaModel(-1L);
        mediaModel.LJIILL(str);
        mediaModel.width = iArrLIZIZ[0];
        mediaModel.height = iArrLIZIZ[1];
        mediaModel.duration = iArrLIZIZ[3];
        try {
            String strLJ = C20144413ru.LJ(C2471909mP.LJJ(str));
            if (strLJ != null) {
                mediaModel.mimeType = strLJ;
                return mediaModel;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return mediaModel;
    }

    @Override // com.ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService
    public final void isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, int i, Function0<Unit> function0) {
        int i2 = i;
        MediaModel mediaModelLIZ = LIZ(str);
        if (mediaModelLIZ != null) {
            int iLIZIZ = (int) C566050MHz.LIZIZ();
            if (i2 <= 0) {
                i2 = FriendsTabPreloadTTLSetting.DEFAULT;
            }
            new C530070Kqb(this.LIZ).LIZ(mediaModelLIZ, true, iLIZIZ, i2, true, false, false, new AwS587S0100000_8(function0, (Function0<Unit>) 8), new AwS14S0211000_8(z, this, iLIZIZ, 1));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService
    public final void isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, int i, int i2, Function2<? super String, ? super Long, Unit> function2, InterfaceC1631630sYr<? super String, ? super Long, ? super Integer, ? super String, Unit> interfaceC1631630sYr) {
        MediaModel mediaModelLIZ = LIZ(str);
        if (mediaModelLIZ == null) {
            interfaceC1631630sYr.invoke("", 0L, -9, "path is null");
        } else {
            new C530070Kqb(this.LIZ).LIZ(mediaModelLIZ, true, i2, i, true, true, false, new AwS587S0100000_8(function2, (Function2<? super String, ? super Long, Unit>) 7), new AwS14S0211000_8(z, (boolean) this, (C532650Kul) i2, (int) interfaceC1631630sYr, (InterfaceC1631630sYr<? super String, ? super Long, ? super Integer, ? super String, Unit>) 0));
        }
    }
}
