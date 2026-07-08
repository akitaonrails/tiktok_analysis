package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0g4y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151820g4y implements InterfaceC254900yh {
    public final int $t;
    public Object l0;
    public Object l1;

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

    /* JADX WARN: Multi-variable type inference failed */
    public static final void x1$0(C1151820g4y c1151820g4y, int i) {
        InterfaceC1121180fHY interfaceC1121180fHY = (InterfaceC1121180fHY) c1151820g4y.l0;
        if (interfaceC1121180fHY != null) {
            interfaceC1121180fHY.LIZLLL((C1121190fHZ) ((C259800zU) c1151820g4y.l1).element, i, null);
        }
    }

    public static final void x1$1(C1151820g4y c1151820g4y, int i) {
        InterfaceC1121180fHY interfaceC1121180fHY = (InterfaceC1121180fHY) c1151820g4y.l0;
        if (interfaceC1121180fHY != null) {
            interfaceC1121180fHY.LIZLLL((C1121190fHZ) c1151820g4y.l1, i, null);
        }
    }

    public static final void x1$2(C1151820g4y c1151820g4y, int i) {
        ((C1120780fGu) c1151820g4y.l0).LIZLLL((C1121190fHZ) c1151820g4y.l1, i, null);
    }

    public static final void x1$3(C1151820g4y c1151820g4y, int i) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tpBubble dismiss: key=");
            sbLIZ.append(((C254700yf) c1151820g4y.l0).LIZIZ);
            sbLIZ.append(", cause=");
            sbLIZ.append(i);
            C20441214yg.LIZIZ("ToolbarGiftBehavior", C2188811AlT.LIZIZ(sbLIZ));
            ((C1120780fGu) c1151820g4y.l1).LIZIZ(new C1121190fHZ(EnumC1120810fGx.GIFT_GUIDE, EnumC1118040fCU.BUBBLE, 0L, (Integer) null, 24));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void x1$4(C1151820g4y c1151820g4y, int i) {
        ((C1120780fGu) c1151820g4y.l0).LIZLLL((C1121190fHZ) c1151820g4y.l1, i, null);
    }

    public static final void x1$5(C1151820g4y c1151820g4y, int i) {
        ((C1120780fGu) c1151820g4y.l0).LIZLLL((C1121190fHZ) c1151820g4y.l1, i, null);
    }

    public static final void x1$6(C1151820g4y c1151820g4y, int i) {
        ((C1120780fGu) c1151820g4y.l0).LIZIZ((C1121190fHZ) c1151820g4y.l1);
    }

    public static final void x1$7(C1151820g4y c1151820g4y, int i) {
        ((C1120780fGu) c1151820g4y.l0).LIZIZ((C1121190fHZ) c1151820g4y.l1);
    }

    public static final void x1$8(C1151820g4y c1151820g4y, int i) {
        C1119710fFB c1119710fFB = (C1119710fFB) c1151820g4y.l0;
        C1119660fF6 c1119660fF6 = (C1119660fF6) c1151820g4y.l1;
        c1119710fFB.getClass();
        InterfaceC254900yh interfaceC254900yh = c1119660fF6.LJIIZILJ;
        if (interfaceC254900yh != null) {
            interfaceC254900yh.x1(i);
        }
        c1119710fFB.LIZJ = null;
        c1119710fFB.LIZIZ();
    }

    public C1151820g4y(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
