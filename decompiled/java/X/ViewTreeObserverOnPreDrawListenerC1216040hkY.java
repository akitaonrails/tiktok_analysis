package X;

import android.view.ViewTreeObserver;
import com.ss.android.ugc.profile.business.ur.editprofileassem.EditProfileBioCellAssem;

/* JADX INFO: renamed from: X.0hkY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class ViewTreeObserverOnPreDrawListenerC1216040hkY implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ EditProfileBioCellAssem LL;

    public ViewTreeObserverOnPreDrawListenerC1216040hkY(EditProfileBioCellAssem editProfileBioCellAssem) {
        this.LL = editProfileBioCellAssem;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C0P0T c0p0t = this.LL.LLJILLL;
        if (c0p0t == null) {
            return true;
        }
        c0p0t.LJ();
        return true;
    }
}
