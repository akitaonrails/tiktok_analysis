package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0im5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class ViewOnClickListenerC1255430im5 implements View.OnClickListener {
    public final WeakReference<InterfaceC1255400im2> LL;
    public final SignificantUserInfo LLILLJJLI;
    public final Context LLILLL;
    public final C19EG LLILZ;
    public final C1255390im1 LLILZIL;
    public final String LLILZLL;
    public final Bundle LLIZ;
    public boolean LLIZLLLIL;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ() {
        this.LLIZLLLIL = false;
        InterfaceC1255400im2 interfaceC1255400im2 = this.LL.get();
        if (interfaceC1255400im2 != 0) {
            if (!(interfaceC1255400im2 instanceof Fragment)) {
                synchronized (this.LLILZ) {
                    try {
                        if (!this.LLILZ.isFinishing()) {
                            interfaceC1255400im2.dismiss();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return;
            }
            synchronized (interfaceC1255400im2) {
                try {
                    boolean z = ((Fragment) interfaceC1255400im2).getActivity() == null || ((Fragment) interfaceC1255400im2).getActivity().isFinishing();
                    boolean z2 = ((Fragment) interfaceC1255400im2).isRemoving() || ((Fragment) interfaceC1255400im2).isDetached() || ((Fragment) interfaceC1255400im2).getView() == null || ((Fragment) interfaceC1255400im2).getFragmentManager() == null;
                    if (!z || !z2) {
                        if (interfaceC1255400im2 instanceof BottomSheetDialogFragment) {
                            ((BottomSheetDialogFragment) interfaceC1255400im2).dismissAllowingStateLoss();
                        } else {
                            interfaceC1255400im2.dismiss();
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac A[PHI: r11
      0x00ac: PHI (r11v2 boolean) = (r11v1 boolean), (r11v4 boolean) binds: [B:37:0x00a9, B:21:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(final android.view.View r14) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC1255430im5.onClick(android.view.View):void");
    }

    public ViewOnClickListenerC1255430im5(WeakReference<InterfaceC1255400im2> weakReference, SignificantUserInfo significantUserInfo, Context context, C19EG c19eg, C1255390im1 c1255390im1, String str, Bundle bundle) {
        this.LL = weakReference;
        this.LLILLJJLI = significantUserInfo;
        this.LLILLL = context;
        this.LLILZ = c19eg;
        this.LLILZIL = c1255390im1;
        this.LLILZLL = str;
        this.LLIZ = bundle;
    }
}
