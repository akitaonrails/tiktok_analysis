package X;

import Y.ARunnableS130S0100000_30;
import android.hardware.camera2.CameraAccessException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.main.replace.OpenEditPageHandlerActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.14dF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20308314dF implements InterfaceC19515111Wr {
    public final int $t;
    public Object l0;

    public static final void onCanceled$0(C20308314dF c20308314dF) {
    }

    public static final void onCanceled$1(C20308314dF c20308314dF) {
    }

    @Override // X.InterfaceC19515111Wr
    public final void LIZ(C0HWO... c0hwoArr) throws CameraAccessException {
        switch (this.$t) {
            case 0:
                LIZ$0(this, c0hwoArr);
                break;
            case 1:
                LIZ$1(this, c0hwoArr);
                break;
        }
    }

    @Override // X.InterfaceC19515111Wr
    public final void onCanceled() {
        switch (this.$t) {
            case 0:
                onCanceled$0(this);
                break;
            case 1:
                onCanceled$1(this);
                break;
        }
    }

    public C20308314dF(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C20308314dF c20308314dF, C0HWO... c0hwoArr) throws CameraAccessException {
        if (c0hwoArr.length != 0 && c0hwoArr[0].LIZIZ == EnumC442280HVy.GRANTED) {
            C20296814bO c20296814bO = (C20296814bO) c20308314dF.l0;
            c20296814bO.LJI = true;
            c20296814bO.LIZJ();
        } else {
            C12ES.LJI(2131851932, ((C20296814bO) c20308314dF.l0).LIZ);
            C20296814bO c20296814bO2 = (C20296814bO) c20308314dF.l0;
            C786410Ut5.LJLIIL(2000L, c20296814bO2.LJIILLIIL, new ARunnableS130S0100000_30(c20296814bO2, 10));
        }
    }

    public static final void LIZ$1(C20308314dF c20308314dF, C0HWO... c0hwoArr) {
        List listLJJLIIIJILLIZJL;
        String str;
        int length = c0hwoArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            C0HWO c0hwo = c0hwoArr[i];
            if (Intrinsics.LJFF(c0hwo.LIZ, "android.permission.READ_MEDIA_VIDEO")) {
                if (c0hwo != null && c0hwo.LIZ()) {
                    ((OpenEditPageHandlerActivity) c20308314dF.l0).openVideoEdit();
                    return;
                }
            } else {
                i++;
            }
        }
        int length2 = c0hwoArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                break;
            }
            C0HWO c0hwo2 = c0hwoArr[i2];
            if (Intrinsics.LJFF(c0hwo2.LIZ, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED")) {
                if (!c0hwo2.LIZ()) {
                    OpenEditPageHandlerActivity.handleFromTTS$openRecord((OpenEditPageHandlerActivity) c20308314dF.l0);
                    return;
                }
            } else {
                i2++;
            }
        }
        try {
            String stringExtra = ((OpenEditPageHandlerActivity) c20308314dF.l0).getIntent().getStringExtra("media_path");
            if (stringExtra != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(stringExtra, new String[]{"/"}, 0, 6)) != null && (str = (String) C13LP.LJJLIIIJL(listLJJLIIIJILLIZJL)) != null && str.length() != 0) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C20131113pl((OpenEditPageHandlerActivity) c20308314dF.l0, str, null), 3);
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        OpenEditPageHandlerActivity.handleFromTTS$openRecord((OpenEditPageHandlerActivity) c20308314dF.l0);
    }
}
