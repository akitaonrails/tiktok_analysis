package X;

import android.view.View;
import kotlin.Unit;

/* JADX INFO: renamed from: X.12Yx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19775712Yx extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19775712Yx(C194350111w c194350111w, C194350111w c194350111w2, InterfaceC1631620sYq<? super Integer, ? super Integer, ? super Integer, Unit> interfaceC1631620sYq) {
        super(4);
        this.$t = interfaceC1631620sYq;
        this.l0 = c194350111w;
        this.l1 = c194350111w2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19775712Yx(C11DL c11dl, C11DL<? extends RECEIVER> c11dl2, InterfaceC1685420txc<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        super(4);
        this.$t = interfaceC1685420txc;
        this.l0 = c11dl;
        this.l1 = c11dl2;
    }

    public static final Object invoke$0(C19775712Yx c19775712Yx, Object obj, Object obj2, Object obj3, Object obj4) {
        InterfaceC874803bO receiver = ((C11DL) c19775712Yx.l0).getReceiver();
        if (receiver != null) {
            ((InterfaceC1685420txc) c19775712Yx.l1).invoke(receiver, obj, obj2, obj3, obj4);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(C19775712Yx c19775712Yx, Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        C20632315oP c20632315oP = ((C194350111w) c19775712Yx.l0).LLILLL;
        View view = null;
        if (c20632315oP == null) {
            c20632315oP = null;
        }
        if (iIntValue4 == c20632315oP.getCurrentItem()) {
            if (iIntValue2 > 0) {
                C194350111w c194350111w = (C194350111w) c19775712Yx.l0;
                c194350111w.LLJJI.put(c194350111w.getCurTabName(), Boolean.TRUE);
                View view2 = ((C194350111w) c19775712Yx.l0).LLJ;
                if (view2 != null) {
                    view = view2;
                }
                C786410Ut5.LJLLLLLL(0, view);
            } else {
                C194350111w c194350111w2 = (C194350111w) c19775712Yx.l0;
                c194350111w2.LLJJI.put(c194350111w2.getCurTabName(), Boolean.FALSE);
                View view3 = ((C194350111w) c19775712Yx.l0).LLJ;
                if (view3 != null) {
                    view = view3;
                }
                C786410Ut5.LJLLLLLL(8, view);
            }
            ((InterfaceC1631620sYq) c19775712Yx.l1).invoke(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3));
        }
        return Unit.LIZ;
    }
}
