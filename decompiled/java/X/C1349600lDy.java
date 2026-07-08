package X;

import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardVMAbility;

/* JADX INFO: renamed from: X.0lDy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1349600lDy extends AbstractC813200VvC {
    public InterfaceC665370Q7z LL;
    public final /* synthetic */ C1349590lDx LLILLJJLI;

    public C1349600lDy(C1349590lDx c1349590lDx) {
        this.LLILLJJLI = c1349590lDx;
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        InterfaceC665370Q7z interfaceC665370Q7z;
        IKeyboardVMAbility iKeyboardVMAbilityLJIIIIZZ;
        super.onFragmentDestroyed(fragmentManager, fragment);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFragmentDestroyed ");
        sbLIZ.append(fragment.getTag());
        C2188811AlT.LIZIZ(sbLIZ);
        String tag = fragment.getTag();
        if (tag != null) {
            int iHashCode = tag.hashCode();
            if (iHashCode != -2016937051) {
                if (iHashCode == 1352480329 && tag.equals("single_keyboard_input") && (interfaceC665370Q7z = this.LL) != null && (iKeyboardVMAbilityLJIIIIZZ = C1345760l7m.LJIIIIZZ(fragment, interfaceC665370Q7z)) != null) {
                    iKeyboardVMAbilityLJIIIIZZ.tP1(this.LLILLJJLI.LJIIJJI);
                    return;
                }
                return;
            }
            if (!tag.equals("comment_long_press_panel")) {
                return;
            }
            C1349590lDx c1349590lDx = this.LLILLJJLI;
            if (c1349590lDx.LJ <= 0) {
                return;
            }
            c1349590lDx.LJFF += SystemClock.elapsedRealtime() - this.LLILLJJLI.LJ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("longPressPageShowTotalTime =  ");
            sbLIZ2.append(this.LLILLJJLI.LJFF);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
        InterfaceC665370Q7z interfaceC665370Q7z;
        IKeyboardVMAbility iKeyboardVMAbilityLJIIIIZZ;
        super.onFragmentStarted(fragmentManager, fragment);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFragmentStarted ");
        sbLIZ.append(fragment.getTag());
        C2188811AlT.LIZIZ(sbLIZ);
        String tag = fragment.getTag();
        if (tag != null) {
            int iHashCode = tag.hashCode();
            if (iHashCode != -2016937051) {
                if (iHashCode == 1352480329 && tag.equals("single_keyboard_input") && (interfaceC665370Q7z = this.LL) != null && (iKeyboardVMAbilityLJIIIIZZ = C1345760l7m.LJIIIIZZ(fragment, interfaceC665370Q7z)) != null) {
                    iKeyboardVMAbilityLJIIIIZZ.Qu0(this.LLILLJJLI.LJIIJJI);
                    return;
                }
                return;
            }
            if (!tag.equals("comment_long_press_panel")) {
                return;
            }
            this.LLILLJJLI.LJ = SystemClock.elapsedRealtime();
        }
    }
}
