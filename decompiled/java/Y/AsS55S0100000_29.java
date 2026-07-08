package Y;

import X.AbstractC1585810rMx;
import X.C10303041d;
import X.C113E;
import X.C12T8;
import X.C12VL;
import X.C12XH;
import X.C12XN;
import X.C19723512Ev;
import X.C19726412Fy;
import X.C19759812Su;
import X.C786410Ut5;
import X.InterfaceC1631620sYq;
import X.InterfaceC19723812Ey;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.discover.ui.TrendsTabFragment;
import com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel;
import com.ss.android.ugc.aweme.effect.FilterEffectTabFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.view.onboarding.ProfileNaviOnboardingFragment;
import com.ss.android.ugc.gamora.editor.sticker.read.panel.EditTTSPanelFragment;
import com.ss.android.ugc.trill.setting.PreferredLanguageSettingFragment;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public class AsS55S0100000_29 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 0:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 1:
                LJJIIJ$1(this, recyclerView, i);
                break;
            case 2:
                LJJIIJ$2(this, recyclerView, i);
                break;
            case 3:
                LJJIIJ$3(this, recyclerView, i);
                break;
            case 4:
                LJJIIJ$4(this, recyclerView, i);
                break;
            case 5:
            case 8:
            default:
                super.LJJIIJ(recyclerView, i);
                break;
            case 6:
                LJJIIJ$5(this, recyclerView, i);
                break;
            case 7:
                LJJIIJ$6(this, recyclerView, i);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJJIIJ$7(this, recyclerView, i);
                break;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 1:
            case 6:
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
            case 2:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            case 3:
                LJJIIZI$2(this, recyclerView, i, i2);
                break;
            case 4:
                LJJIIZI$3(this, recyclerView, i, i2);
                break;
            case 5:
                LJJIIZI$4(this, recyclerView, i, i2);
                break;
            case 7:
                LJJIIZI$5(this, recyclerView, i, i2);
                break;
            case 8:
                LJJIIZI$6(this, recyclerView, i, i2);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJJIIZI$7(this, recyclerView, i, i2);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJJIIZI$8(this, recyclerView, i, i2);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LJJIIZI$9(this, recyclerView, i, i2);
                break;
        }
    }

    public AsS55S0100000_29(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS55S0100000_29 asS55S0100000_29, RecyclerView recyclerView, int i) {
        if (i == 1) {
            C12XH c12xh = (C12XH) asS55S0100000_29.l0;
            c12xh.LJIIZILJ(c12xh.LLJ.getStartX() + C12VL.LIZLLL, false);
            C12XH c12xh2 = (C12XH) asS55S0100000_29.l0;
            c12xh2.LLLJL = true;
            c12xh2.LLJ.setEnabled(false);
            ((C12XH) asS55S0100000_29.l0).LLIZLLLIL.setEnabled(false);
            return;
        }
        if (i != 0) {
            return;
        }
        ((C12XH) asS55S0100000_29.l0).setFocusOnMode(false);
        ((C12XH) asS55S0100000_29.l0).LLJ.setEnabled(true);
        ((C12XH) asS55S0100000_29.l0).LLIZLLLIL.setEnabled(true);
        C12XH c12xh3 = (C12XH) asS55S0100000_29.l0;
        if (c12xh3.LLLJL) {
            c12xh3.LLJJIJIL.LLJILLL.setValue(null);
            C12XH c12xh4 = (C12XH) asS55S0100000_29.l0;
            c12xh4.LLLJL = false;
            if (c12xh4.LLJJIJIL.zQ2().size() <= 8) {
                return;
            }
            ((C12XH) asS55S0100000_29.l0).LLLLIILL.LIZJ();
            return;
        }
        if (c12xh3.getLayoutManager().findFirstCompletelyVisibleItemPosition() == 0) {
            C12XH c12xh5 = (C12XH) asS55S0100000_29.l0;
            c12xh5.LLLIL = 0L;
            c12xh5.LLLILZJ = c12xh5.LLLILZ - 0;
            c12xh5.LLJJIJIL.EQ2(0.0f);
        }
        if (((C12XH) asS55S0100000_29.l0).getLayoutManager().findLastCompletelyVisibleItemPosition() != ((C12XH) asS55S0100000_29.l0).getFrameAdapter().getItemCount() - 1) {
            return;
        }
        C12XH c12xh6 = (C12XH) asS55S0100000_29.l0;
        long j = c12xh6.LLLIILIL;
        c12xh6.LLLILZ = j;
        c12xh6.LLLILZJ = j - c12xh6.LLLIL;
        c12xh6.LLJJIJIL.EQ2(0.0f);
    }

    public static final void LJJIIJ$1(AsS55S0100000_29 asS55S0100000_29, RecyclerView recyclerView, int i) {
        if (i == 1) {
            ((Function0) asS55S0100000_29.l0).invoke();
        }
    }

    public static final void LJJIIJ$2(AsS55S0100000_29 asS55S0100000_29, RecyclerView recyclerView, int i) {
        boolean z;
        FilterEffectTabFragment filterEffectTabFragment = (FilterEffectTabFragment) asS55S0100000_29.l0;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        filterEffectTabFragment.LLJJIJIL = z;
        filterEffectTabFragment.VR(z);
    }

    public static final void LJJIIJ$3(AsS55S0100000_29 asS55S0100000_29, RecyclerView recyclerView, int i) {
        if (i == 0) {
            ((C19726412Fy) asS55S0100000_29.l0).LIZIZ();
        }
    }

    public static final void LJJIIJ$4(AsS55S0100000_29 asS55S0100000_29, RecyclerView recyclerView, int i) {
        if (i == 0) {
            ((C19759812Su) asS55S0100000_29.l0).LLILZLL = false;
        }
        C12T8 c12t8 = ((C19759812Su) asS55S0100000_29.l0).LLILZIL;
        if (c12t8 != null) {
            c12t8.LIZ(i);
        }
    }

    public static final void LJJIIJ$5(AsS55S0100000_29 asS55S0100000_29, RecyclerView recyclerView, int i) {
        ((EditTTSPanelFragment) asS55S0100000_29.l0).MR(true);
    }

    public static final void LJJIIJ$6(AsS55S0100000_29 asS55S0100000_29, RecyclerView recyclerView, int i) {
        InterfaceC19723812Ey interfaceC19723812Ey;
        float fLIZ = ((C19723512Ev) asS55S0100000_29.l0).LIZ();
        if (i != 0) {
            if (i == 1 && (interfaceC19723812Ey = ((C19723512Ev) asS55S0100000_29.l0).LLJI) != null) {
                interfaceC19723812Ey.LJLJI();
                return;
            }
            return;
        }
        InterfaceC19723812Ey interfaceC19723812Ey2 = ((C19723512Ev) asS55S0100000_29.l0).LLJI;
        if (interfaceC19723812Ey2 == null) {
            return;
        }
        interfaceC19723812Ey2.LLL(fLIZ);
    }

    public static final void LJJIIJ$7(AsS55S0100000_29 asS55S0100000_29, RecyclerView recyclerView, int i) {
        boolean z;
        C113E c113e = (C113E) asS55S0100000_29.l0;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        c113e.LJIILJJIL(z);
    }

    public static final void LJJIIZI$0(AsS55S0100000_29 asS55S0100000_29, RecyclerView recyclerView, int i, int i2) {
        if (i == 0) {
            return;
        }
        if (((C12XH) asS55S0100000_29.l0).LLLLII.booleanValue()) {
            C12XH c12xh = (C12XH) asS55S0100000_29.l0;
            c12xh.getClass();
            float fAbs = Math.abs(i) * c12xh.LLJJJJJIL.LIZ;
            if (i > 0) {
                long j = (long) (c12xh.LLLILZ + fAbs);
                c12xh.LLLILZ = j;
                long j2 = c12xh.LLLIILIL;
                if (j >= j2) {
                    c12xh.LLLILZ = j2;
                }
                c12xh.LLLIL = c12xh.LLLILZ - c12xh.LLLL;
            } else {
                long j3 = (long) (c12xh.LLLIL - fAbs);
                c12xh.LLLIL = j3;
                if (j3 <= 0) {
                    c12xh.LLLIL = 0L;
                }
                c12xh.LLLILZ = c12xh.LLLIL + c12xh.LLLL;
            }
            c12xh.LJIL();
            c12xh.LJIJJLI();
            c12xh.LJ();
        } else {
            ((C12XH) asS55S0100000_29.l0).LJIILLIIL(i);
        }
        C12XH c12xh2 = (C12XH) asS55S0100000_29.l0;
        if (!c12xh2.LLLJL) {
            c12xh2.LLJJIJIL.EQ2(c12xh2.LLJLIL);
            C12XH c12xh3 = (C12XH) asS55S0100000_29.l0;
            C12XN c12xn = c12xh3.LLLLIILLL;
            if (c12xn != null) {
                c12xn.LIZ(c12xh3.getSelectedTime());
            }
        }
    }

    public static final void LJJIIZI$1(AsS55S0100000_29 asS55S0100000_29, RecyclerView recyclerView, int i, int i2) {
        FilterEffectTabFragment filterEffectTabFragment = (FilterEffectTabFragment) asS55S0100000_29.l0;
        filterEffectTabFragment.VR(filterEffectTabFragment.LLJJIJIL);
    }

    public static final void LJJIIZI$2(AsS55S0100000_29 asS55S0100000_29, RecyclerView recyclerView, int i, int i2) {
        ((C19726412Fy) asS55S0100000_29.l0).LIZIZ();
    }

    public static final void LJJIIZI$3(AsS55S0100000_29 asS55S0100000_29, RecyclerView recyclerView, int i, int i2) {
        C19759812Su c19759812Su = (C19759812Su) asS55S0100000_29.l0;
        C12T8 c12t8 = c19759812Su.LLILZIL;
        if (c12t8 != null) {
            c12t8.LIZIZ(i, i2, c19759812Su.LLILZLL);
        }
    }

    public static final void LJJIIZI$4(AsS55S0100000_29 asS55S0100000_29, RecyclerView recyclerView, int i, int i2) {
        float fFloatValue;
        TuxTextView tuxTextViewOR;
        TuxTextView tuxTextViewOR2;
        ProfileNaviOnboardingFragment profileNaviOnboardingFragment = (ProfileNaviOnboardingFragment) asS55S0100000_29.l0;
        float fComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        if (fComputeVerticalScrollOffset >= ((Number) profileNaviOnboardingFragment.LLIZLLLIL.getValue()).floatValue()) {
            fFloatValue = 0.0f;
        } else {
            fFloatValue = (((Number) profileNaviOnboardingFragment.LLIZLLLIL.getValue()).floatValue() - fComputeVerticalScrollOffset) / ((Number) profileNaviOnboardingFragment.LLIZLLLIL.getValue()).floatValue();
        }
        View viewFindViewById = profileNaviOnboardingFragment.LLILZLL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view = profileNaviOnboardingFragment.getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.p3f);
            } else {
                viewFindViewById = null;
            }
            profileNaviOnboardingFragment.LLILZLL = (ConstraintLayout) viewFindViewById;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
        if (constraintLayout != null) {
            C786410Ut5.Ub(constraintLayout, fFloatValue);
        }
        View view2 = profileNaviOnboardingFragment.LLILZLL;
        if (view2 == null) {
            View view3 = profileNaviOnboardingFragment.getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.p3f);
            }
            profileNaviOnboardingFragment.LLILZLL = (ConstraintLayout) viewFindViewById2;
            view2 = viewFindViewById2;
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) view2;
        if (constraintLayout2 != null) {
            C786410Ut5.uc(constraintLayout2, fFloatValue);
        }
        if (fFloatValue == 0.0f && (tuxTextViewOR2 = profileNaviOnboardingFragment.OR()) != null && tuxTextViewOR2.getVisibility() == 8) {
            profileNaviOnboardingFragment.UR(true);
        } else {
            if (fFloatValue <= 0.0f || (tuxTextViewOR = profileNaviOnboardingFragment.OR()) == null || tuxTextViewOR.getVisibility() != 0) {
                return;
            }
            profileNaviOnboardingFragment.UR(false);
        }
    }

    public static final void LJJIIZI$5(AsS55S0100000_29 asS55S0100000_29, RecyclerView recyclerView, int i, int i2) {
        C19723512Ev c19723512Ev = (C19723512Ev) asS55S0100000_29.l0;
        c19723512Ev.LLILZIL += i;
        InterfaceC19723812Ey interfaceC19723812Ey = c19723512Ev.LLJI;
        if (interfaceC19723812Ey != null) {
            interfaceC19723812Ey.LJJJJJ(c19723512Ev.LIZ());
        }
    }

    public static final void LJJIIZI$6(AsS55S0100000_29 asS55S0100000_29, RecyclerView recyclerView, int i, int i2) {
        if (Intrinsics.LJFF(((PreferredLanguageSettingFragment) asS55S0100000_29.l0).NR().LLJILJILJ.getValue(), Boolean.TRUE)) {
            PreferredLanguageSettingFragment preferredLanguageSettingFragment = (PreferredLanguageSettingFragment) asS55S0100000_29.l0;
            int i3 = preferredLanguageSettingFragment.LLILZLL + i2;
            preferredLanguageSettingFragment.LLILZLL = i3;
            if (i3 > ((Number) preferredLanguageSettingFragment.LLIZ.getValue()).intValue()) {
                TuxNavBar tuxNavBarMR = ((PreferredLanguageSettingFragment) asS55S0100000_29.l0).MR();
                if (tuxNavBarMR != null) {
                    PreferredLanguageSettingFragment preferredLanguageSettingFragment2 = (PreferredLanguageSettingFragment) asS55S0100000_29.l0;
                    C786410Ut5.C5(tuxNavBarMR, Math.min((preferredLanguageSettingFragment2.LLILZLL - ((Number) preferredLanguageSettingFragment2.LLIZ.getValue()).intValue()) / (((Number) ((PreferredLanguageSettingFragment) asS55S0100000_29.l0).LLIZLLLIL.getValue()).intValue() - ((Number) ((PreferredLanguageSettingFragment) asS55S0100000_29.l0).LLIZ.getValue()).intValue()), 1.0f));
                    return;
                }
                return;
            }
            TuxNavBar tuxNavBarMR2 = ((PreferredLanguageSettingFragment) asS55S0100000_29.l0).MR();
            if (tuxNavBarMR2 == null) {
                return;
            }
            C786410Ut5.C5(tuxNavBarMR2, 0.0f);
        }
    }

    public static final void LJJIIZI$7(AsS55S0100000_29 asS55S0100000_29, RecyclerView recyclerView, int i, int i2) {
        InterfaceC1631620sYq<? super RecyclerView, ? super Integer, ? super Integer, Unit> interfaceC1631620sYq = ((C113E) asS55S0100000_29.l0).LLJZ;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(recyclerView, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public static final void LJJIIZI$8(AsS55S0100000_29 asS55S0100000_29, RecyclerView recyclerView, int i, int i2) {
        C10303041d.LIZ(recyclerView, (Function1) asS55S0100000_29.l0);
    }

    public static final void LJJIIZI$9(AsS55S0100000_29 asS55S0100000_29, RecyclerView recyclerView, int i, int i2) {
        boolean zCanScrollVertically = recyclerView.canScrollVertically(-1);
        if (!Intrinsics.LJFF(((TrendsTabFragment) asS55S0100000_29.l0).LLJJJJ, Boolean.valueOf(zCanScrollVertically))) {
            ((TrendsTabFragment) asS55S0100000_29.l0).LLJJJJ = Boolean.valueOf(zCanScrollVertically);
            TrendsTabViewModel trendsTabViewModelUR = ((TrendsTabFragment) asS55S0100000_29.l0).UR();
            trendsTabViewModelUR.getClass();
            trendsTabViewModelUR.setState(new AwS41S0010000_29(zCanScrollVertically, 1));
        }
    }
}
