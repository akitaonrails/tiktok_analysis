package Y;

import X.AbstractC21673619ry;
import X.AbstractC2180011ATn;
import X.C03DZ;
import X.C1389880mGw;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1A3Q;
import X.C1A3S;
import X.C1A3T;
import X.C1A3V;
import X.C1AU3;
import X.C21636819m2;
import X.C2180021ATo;
import X.C2180231AUj;
import X.C2180251AUl;
import X.C2219091BtD;
import X.C419910GdJ;
import X.C443120HZe;
import X.C675940QfI;
import X.C679750QlR;
import X.EnumC2180071ATt;
import X.InterfaceC1441305kZ;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.HistoryRecordFragment;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.vm.HistoryRecordPageVM;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS399S0200000_33;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public class AObjectS250S0100000_33 implements InterfaceC1441305kZ {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onChanged$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onChanged$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onChanged$13(this, obj);
                break;
            case 14:
                onChanged$14(this, obj);
                break;
        }
    }

    public AObjectS250S0100000_33(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObjectS250S0100000_33 aObjectS250S0100000_33, Object obj) {
        ((HistoryRecordFragment) aObjectS250S0100000_33.l0).MR().LJJ(new AwS399S0200000_33((HistoryRecordFragment) aObjectS250S0100000_33.l0, (Boolean) obj, 6), "delete");
    }

    public static final void onChanged$1(AObjectS250S0100000_33 aObjectS250S0100000_33, Object obj) {
        Integer num = (Integer) obj;
        ((HistoryRecordFragment) aObjectS250S0100000_33.l0).OR().LJIILL(((HistoryRecordFragment) aObjectS250S0100000_33.l0).OR().LJII(num.intValue()), true);
        ((HistoryRecordFragment) aObjectS250S0100000_33.l0).NR().setCurrentItem(num.intValue());
        ((HistoryRecordFragment) aObjectS250S0100000_33.l0).MR().LJJ(new AwS612S0100000_33((HistoryRecordFragment) aObjectS250S0100000_33.l0, 57), "delete");
    }

    public static final void onChanged$10(AObjectS250S0100000_33 aObjectS250S0100000_33, Object obj) {
        ((C2180231AUj) aObjectS250S0100000_33.l0).T2();
    }

    public static final void onChanged$11(AObjectS250S0100000_33 aObjectS250S0100000_33, Object obj) {
        C443120HZe c443120HZe = (C443120HZe) obj;
        ((C2180231AUj) aObjectS250S0100000_33.l0).w2(((Number) c443120HZe.getFirst()).intValue(), ((Number) c443120HZe.getSecond()).intValue(), ((Number) c443120HZe.getThird()).intValue());
    }

    public static final void onChanged$12(AObjectS250S0100000_33 aObjectS250S0100000_33, Object obj) {
        ((C21636819m2) aObjectS250S0100000_33.l0).invalidate();
    }

    public static final void onChanged$13(AObjectS250S0100000_33 aObjectS250S0100000_33, Object obj) {
        h0<Boolean> h0Var;
        h0<Boolean> h0Var2;
        Integer num = (Integer) obj;
        HistoryRecordFragment historyRecordFragment = (HistoryRecordFragment) aObjectS250S0100000_33.l0;
        HistoryRecordPageVM historyRecordPageVM = historyRecordFragment.LLILZ;
        HistoryRecordPageVM historyRecordPageVM2 = null;
        if (historyRecordPageVM == null) {
            historyRecordPageVM = null;
        }
        Integer num2 = historyRecordPageVM.LLILLL;
        if (num2 != null) {
            int iIntValue = num2.intValue();
            HistoryRecordPageVM historyRecordPageVM3 = historyRecordFragment.LLILZ;
            if (historyRecordPageVM3 == null) {
                historyRecordPageVM3 = null;
            }
            C1A3S c1a3sWQ2 = historyRecordPageVM3.wQ2(iIntValue);
            if (c1a3sWQ2 != null && (h0Var2 = c1a3sWQ2.LJIIL) != null) {
                h0Var2.LIZIZ(historyRecordFragment.LLIZ);
            }
        }
        HistoryRecordPageVM historyRecordPageVM4 = ((HistoryRecordFragment) aObjectS250S0100000_33.l0).LLILZ;
        if (historyRecordPageVM4 != null) {
            historyRecordPageVM2 = historyRecordPageVM4;
        }
        C1A3S c1a3sWQ22 = historyRecordPageVM2.wQ2(num.intValue());
        if (c1a3sWQ22 != null && (h0Var = c1a3sWQ22.LJIIL) != null) {
            HistoryRecordFragment historyRecordFragment2 = (HistoryRecordFragment) aObjectS250S0100000_33.l0;
            h0Var.LIZ(historyRecordFragment2, historyRecordFragment2.LLIZ);
        }
    }

    public static final void onChanged$14(AObjectS250S0100000_33 aObjectS250S0100000_33, Object obj) {
        C679750QlR c679750QlR;
        C1A3T c1a3t = (C1A3T) obj;
        ((C1A3Q) aObjectS250S0100000_33.l0).LLILLJJLI.LJIIJ.LJ = Long.valueOf(System.currentTimeMillis());
        C675940QfI.LIZ(new AwS612S0100000_33((C1A3Q) aObjectS250S0100000_33.l0, 270));
        if (c1a3t != null) {
            int i = C1A3V.LIZ[c1a3t.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            C1389880mGw c1389880mGw = new C1389880mGw(((C1A3Q) aObjectS250S0100000_33.l0).LL);
                            c1389880mGw.LJIIIIZZ(2131832569);
                            c1389880mGw.LIZLLL(3000L);
                            c1389880mGw.LJIIJ();
                            AbstractC21673619ry adapter = ((C1A3Q) aObjectS250S0100000_33.l0).LLILZ.getAdapter();
                            if (adapter != null) {
                                ((C1A3Q) aObjectS250S0100000_33.l0).LLILZ.smoothScrollToPosition(Math.max(adapter.getItemCount() - 2, 0));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    C1389880mGw c1389880mGw2 = new C1389880mGw(((C1A3Q) aObjectS250S0100000_33.l0).LL);
                    c1389880mGw2.LJIIIIZZ(R.string.m25);
                    c1389880mGw2.LIZLLL(3000L);
                    c1389880mGw2.LJIIJ();
                    AbstractC21673619ry adapter2 = ((C1A3Q) aObjectS250S0100000_33.l0).LLILZ.getAdapter();
                    if (adapter2 == null) {
                        return;
                    }
                    ((C1A3Q) aObjectS250S0100000_33.l0).LLILZ.smoothScrollToPosition(adapter2.getItemCount() - 2);
                    return;
                }
                C03DZ.LIZ(((C1A3Q) aObjectS250S0100000_33.l0).LLILZLL);
                C03DZ.LIZJ(((C1A3Q) aObjectS250S0100000_33.l0).LLILZIL);
                C1749280vcc c1749280vcc = ((C1A3Q) aObjectS250S0100000_33.l0).LLILZIL;
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_large_watch_history;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
                c1722300uv6.LIZJ = 0;
                c1722300uv6.LIZIZ = c419910GdJ;
                C1A3S c1a3s = ((C1A3Q) aObjectS250S0100000_33.l0).LLILLJJLI;
                c1722300uv6.LJI = c1a3s.LJI;
                c1722300uv6.LJIIIIZZ = c1a3s.LJII;
                c1749280vcc.setStatus(c1722300uv6);
                return;
            }
            AbstractC21673619ry adapter3 = ((C1A3Q) aObjectS250S0100000_33.l0).LLILZ.getAdapter();
            if ((adapter3 instanceof C679750QlR) && (c679750QlR = (C679750QlR) adapter3) != null) {
                c679750QlR.LLLFZ(((C1A3Q) aObjectS250S0100000_33.l0).LLILLJJLI.LJIILIIL);
            }
            C03DZ.LIZJ(((C1A3Q) aObjectS250S0100000_33.l0).LLILZLL);
            C03DZ.LIZ(((C1A3Q) aObjectS250S0100000_33.l0).LLILZIL);
        }
    }

    public static final void onChanged$2(AObjectS250S0100000_33 aObjectS250S0100000_33, Object obj) {
        C2219091BtD.LIZLLL().i("livephoto: onCameraChange end");
        ((AbstractC2180011ATn) aObjectS250S0100000_33.l0).Bz0();
        ((AbstractC2180011ATn) aObjectS250S0100000_33.l0).LLJILJIL = false;
    }

    public static final void onChanged$3(AObjectS250S0100000_33 aObjectS250S0100000_33, Object obj) {
        C2219091BtD.LIZLLL().i("livephoto: onCameraChange start");
        ((AbstractC2180011ATn) aObjectS250S0100000_33.l0).LLJILJIL = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$4(AObjectS250S0100000_33 aObjectS250S0100000_33, Object obj) {
        C2219091BtD.LIZLLL().i("livephoto: close camera event");
        if (((AbstractC2180011ATn) aObjectS250S0100000_33.l0).LLIZ.LIZJ.LIZJ() == EnumC2180071ATt.LIVE_PHOTO_RECORDING) {
            C2180021ATo c2180021ATo = ((AbstractC2180011ATn) aObjectS250S0100000_33.l0).LLIZ;
            final EnumC2180071ATt enumC2180071ATt = (EnumC2180071ATt) c2180021ATo.LIZJ.LIZJ();
            c2180021ATo.LIZ(new C1AU3(enumC2180071ATt) { // from class: X.1ATz
                @Override // X.C1AU3
                public final EnumC2180071ATt LIZ() {
                    return C2180111ATx.LIZ[this.LIZ.ordinal()] == 1 ? EnumC2180071ATt.EXITING_SHOOT_PAGE : this.LIZ;
                }
            });
            ((AbstractC2180011ATn) aObjectS250S0100000_33.l0).E3();
            C2180021ATo c2180021ATo2 = ((AbstractC2180011ATn) aObjectS250S0100000_33.l0).LLIZ;
            final EnumC2180071ATt enumC2180071ATt2 = (EnumC2180071ATt) c2180021ATo2.LIZJ.LIZJ();
            c2180021ATo2.LIZ(new C1AU3(enumC2180071ATt2) { // from class: X.1ATq
                @Override // X.C1AU3
                public final EnumC2180071ATt LIZ() {
                    int i = C2180081ATu.LIZ[this.LIZ.ordinal()];
                    return i != 1 ? i != 2 ? i != 3 ? this.LIZ : EnumC2180071ATt.END : EnumC2180071ATt.NORMAL_SHOOT : EnumC2180071ATt.TAKING_PHOTO;
                }
            });
            return;
        }
        if (((AbstractC2180011ATn) aObjectS250S0100000_33.l0).LLIZ.LIZJ.LIZJ() != EnumC2180071ATt.NORMAL_SHOOT) {
            return;
        }
        C2180021ATo c2180021ATo3 = ((AbstractC2180011ATn) aObjectS250S0100000_33.l0).LLIZ;
        final EnumC2180071ATt enumC2180071ATt3 = (EnumC2180071ATt) c2180021ATo3.LIZJ.LIZJ();
        c2180021ATo3.LIZ(new C1AU3(enumC2180071ATt3) { // from class: X.1AU2
            @Override // X.C1AU3
            public final EnumC2180071ATt LIZ() {
                return EnumC2180071ATt.END;
            }
        });
    }

    public static final void onChanged$5(AObjectS250S0100000_33 aObjectS250S0100000_33, Object obj) {
        ((EditCaptionScene) aObjectS250S0100000_33.l0).LLLIIL = null;
    }

    public static final void onChanged$6(AObjectS250S0100000_33 aObjectS250S0100000_33, Object obj) {
        C2180251AUl c2180251AUl = (C2180251AUl) obj;
        ((C2180231AUj) aObjectS250S0100000_33.l0).Z1(c2180251AUl.LIZ, c2180251AUl.LIZIZ, c2180251AUl.LIZJ, c2180251AUl.LIZLLL);
    }

    public static final void onChanged$7(AObjectS250S0100000_33 aObjectS250S0100000_33, Object obj) {
        ((C2180231AUj) aObjectS250S0100000_33.l0).H2();
    }

    public static final void onChanged$8(AObjectS250S0100000_33 aObjectS250S0100000_33, Object obj) {
        ((C2180231AUj) aObjectS250S0100000_33.l0).o2(((Boolean) obj).booleanValue());
    }

    public static final void onChanged$9(AObjectS250S0100000_33 aObjectS250S0100000_33, Object obj) {
        ((C2180231AUj) aObjectS250S0100000_33.l0).G2();
    }
}
