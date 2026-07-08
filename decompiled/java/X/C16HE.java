package X;

import android.widget.CompoundButton;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.choosemusic.cutpanel.CutMusicPanel;
import com.ss.android.ugc.aweme.minis.debug.ui.MinisDebugSettingFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.16HE, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16HE implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                break;
            case 3:
                onCheckedChanged$3(this, compoundButton, z);
                break;
            case 4:
                onCheckedChanged$4(this, compoundButton, z);
                break;
            case 5:
                onCheckedChanged$5(this, compoundButton, z);
                break;
            case 6:
                onCheckedChanged$6(this, compoundButton, z);
                break;
            case 7:
                onCheckedChanged$7(this, compoundButton, z);
                break;
            case 8:
                onCheckedChanged$8(this, compoundButton, z);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onCheckedChanged$9(this, compoundButton, z);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onCheckedChanged$10(this, compoundButton, z);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onCheckedChanged$11(this, compoundButton, z);
                break;
        }
    }

    public C16HE(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCheckedChanged$0(C16HE c16he, CompoundButton compoundButton, boolean z) {
        ((C20428014wY) c16he.l0).itemView.performClick();
    }

    public static final void onCheckedChanged$1(C16HE c16he, CompoundButton compoundButton, boolean z) {
        InterfaceC204573153b interfaceC204573153b;
        C204574153c c204574153c = ((MinisDebugSettingFragment) c16he.l0).LL;
        if (c204574153c != null && (interfaceC204573153b = c204574153c.LIZ) != null) {
            interfaceC204573153b.LIZ(z);
        }
    }

    public static final void onCheckedChanged$10(C16HE c16he, CompoundButton compoundButton, boolean z) {
        C15QI c15qi = ((C15QK) c16he.l0).LLJJJ;
        if (c15qi != null) {
            c15qi.LJ(z);
        }
        ((C15QK) c16he.l0).LLLLLLL(z);
        C15QK c15qk = (C15QK) c16he.l0;
        if (c15qk.LLJJI) {
            c15qk.LLLLLLJ();
        }
        C15QD c15qd = null;
        if (z) {
            C1441830ncj c1441830ncj = ((C15QK) c16he.l0).LLJJIJIIJIL;
            if (c1441830ncj == null) {
                c1441830ncj = null;
            }
            c1441830ncj.LJ();
            C786410Ut5.LLLLLLZZ(((C15QK) c16he.l0).LLLLJ(), 4);
        } else {
            C1441830ncj c1441830ncj2 = ((C15QK) c16he.l0).LLJJIJIIJIL;
            if (c1441830ncj2 == null) {
                c1441830ncj2 = null;
            }
            c1441830ncj2.LIZLLL();
            C786410Ut5.LLLLLLZZ(((C15QK) c16he.l0).LLLLJ(), 0);
        }
        C15QK c15qk2 = (C15QK) c16he.l0;
        c15qk2.LLJJJJ = z;
        C15QD c15qd2 = c15qk2.LLLLII;
        if (c15qd2 != null) {
            c15qd = c15qd2;
        }
        c15qd.LLILZ = z;
        try {
            c15qd.notifyDataSetChanged();
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!z) {
            C352470Drp.LIZ();
        }
    }

    public static final void onCheckedChanged$11(C16HE c16he, CompoundButton compoundButton, boolean z) {
        C0HZQ c0hzq = ((CutMusicPanel) c16he.l0).LLLIZZ;
        if (c0hzq != null) {
            c0hzq.setChecked(z);
        }
        Function1<? super Boolean, Unit> function1 = ((CutMusicPanel) c16he.l0).LLLLIL;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        C15LR c15lr = null;
        if (z) {
            CutMusicPanel cutMusicPanel = (CutMusicPanel) c16he.l0;
            if (cutMusicPanel.LLLLIIIILLL) {
                TuxTextView tuxTextView = cutMusicPanel.LLLILZLLLI;
                if (tuxTextView != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 0);
                }
                TuxTextView tuxTextView2 = ((CutMusicPanel) c16he.l0).LLLJIL;
                if (tuxTextView2 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView2, 8);
                }
                CutMusicPanel cutMusicPanel2 = (CutMusicPanel) c16he.l0;
                C15LR c15lr2 = cutMusicPanel2.LLILZIL;
                if (c15lr2 == null) {
                    c15lr2 = null;
                }
                c15lr2.setLoopWaveColor(cutMusicPanel2.LLLLIIL);
                C15LR c15lr3 = ((CutMusicPanel) c16he.l0).LLILZIL;
                if (c15lr3 != null) {
                    c15lr = c15lr3;
                }
                c15lr.getCutMusicView().LLILLJJLI.LJIILJJIL = true;
                return;
            }
        }
        TuxTextView tuxTextView3 = ((CutMusicPanel) c16he.l0).LLLILZLLLI;
        if (tuxTextView3 != null) {
            C786410Ut5.LLLLZLL(tuxTextView3, 8);
        }
        TuxTextView tuxTextView4 = ((CutMusicPanel) c16he.l0).LLLJIL;
        if (tuxTextView4 != null) {
            C786410Ut5.LLLLZLL(tuxTextView4, 0);
        }
        CutMusicPanel cutMusicPanel3 = (CutMusicPanel) c16he.l0;
        C15LR c15lr4 = cutMusicPanel3.LLILZIL;
        if (c15lr4 == null) {
            c15lr4 = null;
        }
        c15lr4.setLoopWaveColor(cutMusicPanel3.LLLLIILL);
        C15LR c15lr5 = ((CutMusicPanel) c16he.l0).LLILZIL;
        if (c15lr5 != null) {
            c15lr = c15lr5;
        }
        c15lr.getCutMusicView().LLILLJJLI.LJIILJJIL = false;
    }

    public static final void onCheckedChanged$2(C16HE c16he, CompoundButton compoundButton, boolean z) {
        InterfaceC204573153b interfaceC204573153b;
        C2197011Ayh.LIZ.getClass();
        C2197011Ayh.LIZLLL().storeBoolean("IS_NATIVE_GAME_DEBUG_ENABLE_VCONSOLE", z);
        C204574153c c204574153c = ((MinisDebugSettingFragment) c16he.l0).LL;
        if (c204574153c != null && (interfaceC204573153b = c204574153c.LIZ) != null) {
            interfaceC204573153b.LIZIZ(z);
        }
    }

    public static final void onCheckedChanged$3(C16HE c16he, CompoundButton compoundButton, boolean z) {
        if (z) {
            C15QV c15qv = (C15QV) c16he.l0;
            EnumC356130Dxj enumC356130Dxj = EnumC356130Dxj.CROP;
            c15qv.LLLII(enumC356130Dxj);
            ((C15QV) c16he.l0).LLJI.invoke(enumC356130Dxj);
        }
    }

    public static final void onCheckedChanged$4(C16HE c16he, CompoundButton compoundButton, boolean z) {
        if (z) {
            C15QV c15qv = (C15QV) c16he.l0;
            EnumC356130Dxj enumC356130Dxj = EnumC356130Dxj.ORIGIN_SHAPE;
            c15qv.LLLII(enumC356130Dxj);
            ((C15QV) c16he.l0).LLJI.invoke(enumC356130Dxj);
        }
    }

    public static final void onCheckedChanged$5(C16HE c16he, CompoundButton compoundButton, boolean z) {
        if (z) {
            ((C15QX) c16he.l0).LLLII(true);
            ((C15QX) c16he.l0).LLJI.invoke(Boolean.TRUE);
        }
    }

    public static final void onCheckedChanged$6(C16HE c16he, CompoundButton compoundButton, boolean z) {
        if (z) {
            ((C15QX) c16he.l0).LLLII(false);
            ((C15QX) c16he.l0).LLJI.invoke(Boolean.FALSE);
        }
    }

    public static final void onCheckedChanged$7(C16HE c16he, CompoundButton compoundButton, boolean z) {
        boolean zIsChecked;
        compoundButton.isChecked();
        C15QD c15qd = null;
        if (((C15QK) c16he.l0).LLLLILI().LLIZ) {
            C15QD c15qd2 = ((C15QK) c16he.l0).LLLLII;
            if (c15qd2 != null) {
                c15qd = c15qd2;
            }
            zIsChecked = true;
            c15qd.LLLFZ(true);
        } else {
            C15QD c15qd3 = ((C15QK) c16he.l0).LLLLII;
            if (c15qd3 != null) {
                c15qd = c15qd3;
            }
            c15qd.LLLFZ(compoundButton.isChecked());
            zIsChecked = compoundButton.isChecked();
        }
        ((C15QK) c16he.l0).LLLLILI().setIndeterminate(false);
        if (compoundButton.isPressed()) {
            ((C15QK) c16he.l0).LLLLIILL(zIsChecked);
        }
        if (zIsChecked != compoundButton.isChecked()) {
            ((C15QK) c16he.l0).LLLLILI().setChecked(zIsChecked);
        }
        ((C15QK) c16he.l0).LLLLLLJ();
    }

    public static final void onCheckedChanged$8(C16HE c16he, CompoundButton compoundButton, boolean z) {
        if (z) {
            ((C15QZ) c16he.l0).LLLII(true);
            ((C15QZ) c16he.l0).LLJI.invoke(Boolean.TRUE);
        }
    }

    public static final void onCheckedChanged$9(C16HE c16he, CompoundButton compoundButton, boolean z) {
        if (z) {
            ((C15QZ) c16he.l0).LLLII(false);
            ((C15QZ) c16he.l0).LLJI.invoke(Boolean.FALSE);
        }
    }
}
