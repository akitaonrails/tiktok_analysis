package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFragment;
import com.ss.ugc.android.editor.bottom.panel.EditorContextFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EJk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C362580EJk {
    public final Integer LIZ;
    public C19EG LIZIZ;

    public C362580EJk() {
        this(null);
    }

    public C362580EJk(Integer num) {
        this.LIZ = num;
    }

    public static void LIZ(Fragment fragment) {
        C19EG activity;
        FragmentManager supportFragmentManager;
        Fragment fragmentLJJJJZI;
        if (fragment.getActivity() != null && (activity = fragment.getActivity()) != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (fragmentLJJJJZI = supportFragmentManager.LJJJJZI(fragment.getClass().getCanonicalName())) != null && fragmentLJJJJZI.isAdded()) {
            C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
            c19ehLJIIJ.LJIIZILJ(fragment);
            c19ehLJIIJ.LJIIL();
            C13E8<Fragment> c13e8 = C369630EeP.LIZ;
            if (!c13e8.isEmpty()) {
                c13e8.removeLast();
            }
        }
    }

    public final void LIZJ(EditorContextFragment editorContextFragment) {
        Integer num;
        Integer num2 = this.LIZ;
        if ((num2 == null || num2.intValue() != 0) && this.LIZIZ != null) {
            FragmentManager supportFragmentManager = this.LIZIZ.getSupportFragmentManager();
            C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
            Fragment fragmentLJJJJZI = supportFragmentManager.LJJJJZI(editorContextFragment.getClass().getCanonicalName());
            if (fragmentLJJJJZI != null && fragmentLJJJJZI.isAdded()) {
                if (fragmentLJJJJZI.isHidden()) {
                    c19ehLJIIJ.LJJIFFI(fragmentLJJJJZI);
                }
            } else {
                if (((Boolean) C285980BIu.LIZ.getValue()).booleanValue() && (num = this.LIZ) != null) {
                    int iIntValue = num.intValue();
                    C19EG c19eg = this.LIZIZ;
                    if (c19eg == null || c19eg.findViewById(iIntValue) == null) {
                        return;
                    }
                }
                c19ehLJIIJ.LIZJ(this.LIZ.intValue(), editorContextFragment, editorContextFragment.getClass().getCanonicalName());
            }
            c19ehLJIIJ.LJIIL();
            C369630EeP.LIZ.addLast(editorContextFragment);
            return;
        }
        throw new IllegalStateException("containerId or hostActivity is null.");
    }

    public static void LIZIZ(C362580EJk c362580EJk, InlineCaptionFragment inlineCaptionFragment) {
        FragmentManager supportFragmentManager;
        Fragment fragmentLJJJJZI;
        C19EG c19eg = c362580EJk.LIZIZ;
        if (c19eg != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null && (fragmentLJJJJZI = supportFragmentManager.LJJJJZI(inlineCaptionFragment.getClass().getCanonicalName())) != null && fragmentLJJJJZI.isAdded()) {
            boolean zLJFF = Intrinsics.LJFF(fragmentLJJJJZI, inlineCaptionFragment);
            Fragment fragment = inlineCaptionFragment;
            if (!zLJFF) {
                fragment = fragmentLJJJJZI;
            }
            C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
            c19ehLJIIJ.LJIIZILJ(fragment);
            c19ehLJIIJ.LJIIL();
            C13E8<Fragment> c13e8 = C369630EeP.LIZ;
            if (!c13e8.isEmpty()) {
                c13e8.removeLast();
            }
        }
    }
}
