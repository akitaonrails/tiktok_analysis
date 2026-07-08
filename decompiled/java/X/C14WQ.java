package X;

import android.graphics.Bitmap;
import androidx.fragment.app.FragmentManager;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.pipo.component.nativecamera.NativeCameraMainFragment;

/* JADX INFO: renamed from: X.14WQ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14WQ {
    public static void LIZIZ(NativeCameraMainFragment nativeCameraMainFragment) {
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        C19EH c19ehLJIIJ;
        CompletionBlock<C14WM> completionBlock = C14WP.LLJI;
        if (completionBlock != null) {
            C2382909Vj.LIZ(completionBlock, -7, "User exited page. No data!", null, 4);
        }
        if (nativeCameraMainFragment != null && (c19eg = C14WP.LLJIJIL) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null && (c19ehLJIIJ = supportFragmentManager.LJIIJ()) != null) {
            c19ehLJIIJ.LJIIZILJ(nativeCameraMainFragment);
            c19ehLJIIJ.LJIIJ();
        }
        C14WP.LLJILLL = true;
        C14WP.LLJI = null;
        Bitmap bitmap = C14WP.LLIZ;
        if (bitmap != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        C14WP.LLIZ = null;
        C14WP.LLJI = null;
    }

    public static void LIZ(int i, Exception exc) {
        CompletionBlock<C14WM> completionBlock = C14WP.LLJI;
        if (completionBlock != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("User exit page due to an error: ");
            sbLIZ.append(exc);
            sbLIZ.append(". No data!");
            C2382909Vj.LIZ(completionBlock, i, C2188811AlT.LIZIZ(sbLIZ), null, 4);
        }
        C14WP.LLJI = null;
        Bitmap bitmap = C14WP.LLIZ;
        if (bitmap != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        C14WP.LLIZ = null;
        C14WP.LLJI = null;
    }
}
