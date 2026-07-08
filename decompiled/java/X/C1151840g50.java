package X;

import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0g50, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151840g50 implements InterfaceC254900yh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC254900yh
    public final void x1(int i) {
        switch (this.$t) {
            case 0:
                x1$0(this, i);
                break;
            case 1:
                x1$1(this, i);
                break;
            case 2:
                x1$2(this, i);
                break;
            case 3:
                x1$3(this, i);
                break;
            case 4:
                x1$4(this, i);
                break;
            case 5:
                x1$5(this, i);
                break;
            case 6:
                x1$6(this, i);
                break;
            case 7:
                x1$7(this, i);
                break;
            case 8:
                x1$8(this, i);
                break;
        }
    }

    public C1151840g50(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void x1$0(C1151840g50 c1151840g50, int i) {
        ((InterfaceC1123790fLl) c1151840g50.l0).onDismiss();
    }

    public static final void x1$1(C1151840g50 c1151840g50, int i) {
        ((C1123280fKw) c1151840g50.l0).LLJILJILJ = false;
    }

    public static final void x1$2(C1151840g50 c1151840g50, int i) {
        if (i == 8 || i == 6) {
            ((C1106110etF) c1151840g50.l0).LLJL = true;
        }
    }

    public static final void x1$3(C1151840g50 c1151840g50, int i) {
        ((C1120780fGu) c1151840g50.l0).LIZLLL(new C1121190fHZ(EnumC1120810fGx.BACKPACK_GIFTS, EnumC1118040fCU.BUBBLE, 0L, (Integer) null, 24), i, null);
    }

    public static final void x1$4(C1151840g50 c1151840g50, int i) {
        ((C1120780fGu) c1151840g50.l0).LIZLLL(new C1121190fHZ(EnumC1120810fGx.GIFT_GUIDE, EnumC1118040fCU.BUBBLE, 0L, (Integer) null, 24), i, null);
    }

    public static final void x1$5(C1151840g50 c1151840g50, int i) {
        ((C1120780fGu) c1151840g50.l0).LIZLLL(new C1121190fHZ(EnumC1120810fGx.MATCH_ITEM, EnumC1118040fCU.BUBBLE, 0L, (Integer) null, 24), i, null);
    }

    public static final void x1$6(C1151840g50 c1151840g50, int i) {
        C1119830fFN c1119830fFN = (C1119830fFN) ((C1120780fGu) c1151840g50.l0).LL.gg0(C1119840fFO.class);
        if (c1119830fFN != null) {
            ((C1120780fGu) c1151840g50.l0).LL.SX0(C1119840fFO.class, new C1119830fFN(c1119830fFN.LIZ, c1119830fFN.LIZIZ, C158B.LIZJ()));
        }
    }

    public static final void x1$7(C1151840g50 c1151840g50, int i) {
        C1121190fHZ c1121190fHZ = new C1121190fHZ(EnumC1120810fGx.COLOR_GIFT, EnumC1118040fCU.BUBBLE, 0L, (Integer) null, 24);
        InterfaceC1121180fHY iView = ((C1120950fHB) c1151840g50.l0).getIView();
        if (iView != null) {
            iView.LIZIZ(c1121190fHZ);
        }
        C1120950fHB c1120950fHB = (C1120950fHB) c1151840g50.l0;
        HandlerHook.viewPostDelay(c1120950fHB, c1120950fHB.LLJJJJJIL, 300L);
        if (i != 1) {
            if (i != 3) {
                C1123450fLD.LIZIZ(EnumC1123510fLJ.OTHER, EnumC1120830fGz.GIFT_COLOR, null);
                return;
            } else {
                C1123450fLD.LIZIZ(EnumC1123510fLJ.USER_CLOSE, EnumC1120830fGz.GIFT_COLOR, null);
                return;
            }
        }
        C1123450fLD.LIZIZ(EnumC1123510fLJ.TIME_UP, EnumC1120830fGz.GIFT_COLOR, null);
    }

    public static final void x1$8(C1151840g50 c1151840g50, int i) {
        C1121190fHZ c1121190fHZ = new C1121190fHZ(EnumC1120810fGx.RANDOM_GIFT, EnumC1118040fCU.BUBBLE, 0L, (Integer) null, 24);
        InterfaceC1121180fHY iView = ((C1120950fHB) c1151840g50.l0).getIView();
        if (iView != null) {
            iView.LIZIZ(c1121190fHZ);
        }
        if (i != 1) {
            if (i != 3) {
                C1123450fLD.LIZIZ(EnumC1123510fLJ.OTHER, EnumC1120830fGz.RANDOM_GIFT, null);
                return;
            } else {
                C1123450fLD.LIZIZ(EnumC1123510fLJ.USER_CLOSE, EnumC1120830fGz.RANDOM_GIFT, null);
                return;
            }
        }
        C1123450fLD.LIZIZ(EnumC1123510fLJ.TIME_UP, EnumC1120830fGz.RANDOM_GIFT, null);
    }
}
