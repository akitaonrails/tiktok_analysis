package X;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.friendstab.guidecard.component.FriendsGuideCardRootAssem;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06vx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1766706vx extends AbstractC468201s0 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1331910klR
    public final void LIZ(Bitmap bitmap) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, bitmap);
                break;
            case 1:
                LIZ$1(this, bitmap);
                break;
            case 2:
                LIZ$2(this, bitmap);
                break;
            default:
                super.LIZ(bitmap);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onFailed(Throwable th) {
        switch (this.$t) {
            case 0:
                onFailed$0(this, th);
                break;
            case 1:
                onFailed$1(this, th);
                break;
            case 2:
                onFailed$2(this, th);
                break;
            default:
                super.onFailed(th);
                break;
        }
    }

    public static final void LIZ$0(C1766706vx c1766706vx, Bitmap bitmap) {
        C554890LpX c554890LpX = C554890LpX.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CelePoster, onComplete, uri = ");
        sbLIZ.append(bitmap);
        C201955140j.LIZJ(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
        Bitmap bitmapG2 = ((C0MPL) c1766706vx.l0).G2(bitmap);
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c1766706vx.l1;
        C189200o6.m2constructorimpl(bitmapG2);
        interfaceC1364105Vn.resumeWith(bitmapG2);
    }

    public static final void LIZ$1(C1766706vx c1766706vx, Bitmap bitmap) {
        if (bitmap == null) {
            c1766706vx.onFailed(null);
            return;
        }
        String str = C1335810krj.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(".png");
        String strLIZJ = C1335810krj.LIZJ(str, C2188811AlT.LIZIZ(sbLIZ));
        try {
            C2112808Pm c2112808Pm = C2112808Pm.LIZ;
            C2112808Pm.LIZLLL(strLIZJ);
            C0VSJ c0vsj = new C0VSJ(strLIZJ);
            C1706630uVp.LJFF("ImageLoader", "onComplete, AmeAnrOpt enable");
            C23250099c.LIZLLL((InterfaceC497601wk) ((C1332210klv) c1766706vx.l0).LIZ.getValue(), C0PEM.LIZJ, null, new C05QX(bitmap, c0vsj, (Function1) c1766706vx.l1, c1766706vx, null), 2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c1766706vx.onFailed(null);
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
    }

    public static final void LIZ$2(C1766706vx c1766706vx, Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        FriendsGuideCardRootAssem friendsGuideCardRootAssem = (FriendsGuideCardRootAssem) c1766706vx.l0;
        int i = ((C118300cf) c1766706vx.l1).element;
        SmartImageView smartImageView = friendsGuideCardRootAssem.LLJZIJLIL;
        if (smartImageView != null) {
            smartImageView.setImageBitmap(bitmap);
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = i;
                layoutParams.height = (height * i) / width;
                C786410Ut5.W5(smartImageView, layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public static final void onFailed$0(C1766706vx c1766706vx, Throwable th) {
        C554890LpX c554890LpX = C554890LpX.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CelePoster, onFailed: e = ");
        sbLIZ.append(th);
        C201955140j.LJII(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c1766706vx.l1;
        C189200o6.m2constructorimpl(null);
        interfaceC1364105Vn.resumeWith(null);
    }

    public static final void onFailed$1(C1766706vx c1766706vx, Throwable th) {
        C1706630uVp.LIZ("ImageLoader", "download fail");
        ((Function1) c1766706vx.l1).invoke(null);
    }

    public static final void onFailed$2(C1766706vx c1766706vx, Throwable th) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on Failed,throwable:");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C2188811AlT.LIZIZ(sbLIZ);
        SmartImageView smartImageView = ((FriendsGuideCardRootAssem) c1766706vx.l0).LLJZIJLIL;
        if (smartImageView != null) {
            C339190DRl.LIZIZ(smartImageView);
        }
    }

    public C1766706vx(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
