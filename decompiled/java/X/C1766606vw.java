package X;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.friendstab.guidecard.component.FriendsGuideCardRootAssem;

/* JADX INFO: renamed from: X.06vw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1766606vw extends AbstractC468201s0 {
    public final int $t;
    public Object l0;

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

    public C1766606vw(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C1766606vw c1766606vw, Bitmap bitmap) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c1766606vw.l0;
        C189200o6.m2constructorimpl(bitmap);
        interfaceC1364105Vn.resumeWith(bitmap);
    }

    public static final void LIZ$1(C1766606vw c1766606vw, Bitmap bitmap) {
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("BaseEffectNoticeBanner", "loadEffectIcon onCompleted");
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c1766606vw.l0;
        C189200o6.m2constructorimpl(bitmap);
        interfaceC1364105Vn.resumeWith(bitmap);
    }

    public static final void LIZ$2(C1766606vw c1766606vw, Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        ImageView imageView = ((FriendsGuideCardRootAssem) c1766606vw.l0).LLJL;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        ImageView imageView2 = ((FriendsGuideCardRootAssem) c1766606vw.l0).LLJL;
        if (imageView2 != null) {
            float fLIZ = C497820Jfg.LIZ(r0.LJJIJL().getContext()) * 0.4f * 0.36f;
            float width = (bitmap.getWidth() * fLIZ) / bitmap.getHeight();
            ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.width = (int) width;
                marginLayoutParams.height = (int) fLIZ;
                C786410Ut5.W5(imageView2, marginLayoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public static final void onFailed$0(C1766606vw c1766606vw, Throwable th) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c1766606vw.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC1364105Vn.resumeWith(null);
    }

    public static final void onFailed$1(C1766606vw c1766606vw, Throwable th) {
        ALog.e("BaseEffectNoticeBanner", "loadEffectIcon onFailed ", th);
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c1766606vw.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC1364105Vn.resumeWith(null);
    }

    public static final void onFailed$2(C1766606vw c1766606vw, Throwable th) {
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
        ImageView imageView = ((FriendsGuideCardRootAssem) c1766606vw.l0).LLJL;
        if (imageView != null) {
            C339190DRl.LIZIZ(imageView);
        }
    }
}
