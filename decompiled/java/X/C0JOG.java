package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.location_api.service.view.FypLocationHintDialogFragment;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0JOG, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JOG {
    public static InterfaceC1207430hWf LIZ(Activity activity, String str, String str2) {
        ViewGroup viewGroup;
        final C19EG c19eg;
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        View decorView = null;
        if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null && !c19eg.isFinishing() && !c19eg.isDestroyed()) {
            FragmentManager supportFragmentManager = c19eg.getSupportFragmentManager();
            if (supportFragmentManager.LJJJJZI("fyp_location_hint_dialog") instanceof FypLocationHintDialogFragment) {
                return new InterfaceC1207430hWf(c19eg) { // from class: X.0JOH
                    public final WeakReference<C19EG> LL;

                    @Override // X.InterfaceC1207430hWf
                    public final void hide() {
                        DialogFragment dialogFragment;
                        C19EG c19eg2 = this.LL.get();
                        if (c19eg2 == null) {
                            return;
                        }
                        Fragment fragmentLJJJJZI = c19eg2.getSupportFragmentManager().LJJJJZI("fyp_location_hint_dialog");
                        if (!(fragmentLJJJJZI instanceof FypLocationHintDialogFragment) || (dialogFragment = (DialogFragment) fragmentLJJJJZI) == null) {
                            return;
                        }
                        dialogFragment.dismissAllowingStateLoss();
                    }

                    {
                        this.LL = new WeakReference<>(c19eg);
                    }
                };
            }
            try {
                C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
                FypLocationHintDialogFragment fypLocationHintDialogFragment = new FypLocationHintDialogFragment();
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("arg_title_text", str, bundle);
                C786410Ut5.LJJJI("arg_content_text", str2, bundle);
                fypLocationHintDialogFragment.setArguments(bundle);
                c19ehLJIIJ.LIZLLL(fypLocationHintDialogFragment, "fyp_location_hint_dialog");
                c19ehLJIIJ.LJIIL();
                return new InterfaceC1207430hWf(c19eg) { // from class: X.0JOH
                    public final WeakReference<C19EG> LL;

                    @Override // X.InterfaceC1207430hWf
                    public final void hide() {
                        DialogFragment dialogFragment;
                        C19EG c19eg2 = this.LL.get();
                        if (c19eg2 == null) {
                            return;
                        }
                        Fragment fragmentLJJJJZI = c19eg2.getSupportFragmentManager().LJJJJZI("fyp_location_hint_dialog");
                        if (!(fragmentLJJJJZI instanceof FypLocationHintDialogFragment) || (dialogFragment = (DialogFragment) fragmentLJJJJZI) == null) {
                            return;
                        }
                        dialogFragment.dismissAllowingStateLoss();
                    }

                    {
                        this.LL = new WeakReference<>(c19eg);
                    }
                };
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C20625115nF c20625115nF = new C20625115nF(activity);
        c20625115nF.LL.setText(str2);
        Window window = activity.getWindow();
        if (window != null) {
            decorView = window.getDecorView();
        }
        if ((decorView instanceof ViewGroup) && (viewGroup = (ViewGroup) decorView) != null) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            c20625115nF.LIZIZ(viewGroup);
            viewGroup.addView(c20625115nF, layoutParams);
        }
        return c20625115nF;
    }
}
