package X;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.12Ea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19721412Ea {
    public static C19721612Ec LIZ(Bundle bundle, final VideoPublishViewModel videoPublishViewModel, final C193M c193m) {
        C19721612Ec c19721612Ec;
        if (C10BZ.LIZ()) {
            c19721612Ec = new C19721612Ec(videoPublishViewModel, c193m) { // from class: X.12EY
                @Override // X.C19721612Ec
                public final void LLLILZLLLI() {
                }

                @Override // X.C19721612Ec
                public final void LLLIZZ() {
                }

                @Override // X.C19721612Ec
                public final boolean LLLJ() {
                    return true;
                }

                @Override // X.C19721612Ec
                public final void LLLIL() {
                    Bundle bundle2 = this.mArguments;
                    setTheme((bundle2 == null || bundle2.getBoolean("key_is_single_section", false)) ? R.style.al4 : R.style.al3);
                }

                @Override // X.C19721612Ec
                public final Integer LLLILZ() {
                    return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
                }

                @Override // X.C19721612Ec
                public final void LLLII(View view) {
                    int iIntValue;
                    TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
                    int iIntValue2 = 0;
                    if (tuxNavBar != null) {
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, view.getContext());
                        if (numLIZJ != null) {
                            iIntValue = numLIZJ.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        tuxNavBar.setNavBackground(iIntValue);
                    }
                    RecyclerView recyclerView = this.LLJILJILJ;
                    if (recyclerView != null) {
                        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1b, view.getContext());
                        if (numLIZJ2 != null) {
                            iIntValue2 = numLIZJ2.intValue();
                        }
                        recyclerView.setBackgroundColor(iIntValue2);
                    }
                }

                @Override // X.C19721612Ec
                public final AbstractC1250290idn LLLIIIIL(AwS573S0100000_29 awS573S0100000_29) {
                    C197020126o c197020126o = new C197020126o();
                    c197020126o.LJFF = Integer.valueOf(R.attr.a03);
                    c197020126o.LIZ(awS573S0100000_29);
                    return c197020126o;
                }

                @Override // X.C19721612Ec
                public final void LLLIILIL(TuxNavBar tuxNavBar) {
                    tuxNavBar.LJIIZILJ(false);
                }
            };
        } else {
            c19721612Ec = new C19721612Ec(videoPublishViewModel, c193m);
        }
        c19721612Ec.mArguments = bundle;
        return c19721612Ec;
    }
}
