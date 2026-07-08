package X;

import android.view.View;
import com.ss.android.ugc.aweme.creative.model.AutoCutCategory;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0oHF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466950oHF extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631630sYr
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1466950oHF(C1413530mt5 c1413530mt5, int i) {
        super(4);
        this.$t = i;
        this.l0 = c1413530mt5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1466950oHF(C1415220mvo c1415220mvo, int i) {
        super(4);
        this.$t = i;
        this.l0 = c1415220mvo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1466950oHF(C1418830n1d c1418830n1d, int i) {
        super(4);
        this.$t = i;
        this.l0 = c1418830n1d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1466950oHF(C1450140nq8 c1450140nq8, int i) {
        super(4);
        this.$t = i;
        this.l0 = c1450140nq8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1466950oHF(C1462730oAR c1462730oAR, int i) {
        super(4);
        this.$t = i;
        this.l0 = c1462730oAR;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(C1466950oHF c1466950oHF, Object obj, Object obj2, Object obj3, Object obj4) {
        C1418830n1d c1418830n1d;
        AutoCutCategory autoCutCategory;
        int iIntValue = ((Number) obj2).intValue();
        AutoCutThemeData autoCutThemeData = (AutoCutThemeData) obj3;
        C1418830n1d c1418830n1d2 = (C1418830n1d) c1466950oHF.l0;
        c1418830n1d2.getClass();
        if (C1417210mz1.LIZ(c1418830n1d2.LLLLLL()) && autoCutThemeData.indexFromSource == EnumC1417170myx.PHOTO_MODE_NONE.getIndex()) {
            ((C1418830n1d) c1466950oHF.l0).LLLLIL().LJIIL.invoke(Boolean.TRUE);
            View view = ((C1418830n1d) c1466950oHF.l0).LLJLILLLLZIIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            ((C1418830n1d) c1466950oHF.l0).LLLLIL().LJIILIIL.invoke();
        } else {
            int i = -1;
            if (((C1418830n1d) c1466950oHF.l0).LLLLLLIL() && autoCutThemeData.indexFromSource == -1) {
                C1418950n1p c1418950n1p = ((C1418830n1d) c1466950oHF.l0).LLLLII;
                if (c1418950n1p == null) {
                    c1418950n1p = null;
                }
                c1418950n1p.LLLIIIIL(0);
                ((C1418830n1d) c1466950oHF.l0).LLLLIL().LJIIJJI.invoke();
            } else {
                ((C1418830n1d) c1466950oHF.l0).LLLLIL().LJIIL.invoke(Boolean.FALSE);
                if (C1418880n1i.LIZIZ() && (autoCutCategory = (c1418830n1d = (C1418830n1d) c1466950oHF.l0).LLLJL) != null) {
                    iIntValue = c1418830n1d.LLLLLLLZIL(autoCutCategory, iIntValue);
                }
                C1418830n1d c1418830n1d3 = (C1418830n1d) c1466950oHF.l0;
                c1418830n1d3.getClass();
                if (C1417210mz1.LIZ(c1418830n1d3.LLLLLL())) {
                    View view2 = ((C1418830n1d) c1466950oHF.l0).LLJLILLLLZIIL;
                    if (view2 != null) {
                        C786410Ut5.LJLLLLLL(0, view2);
                    }
                    ((C1418830n1d) c1466950oHF.l0).LLLLIL().LIZ.invoke(Integer.valueOf(iIntValue), obj4);
                } else {
                    Function2<Integer, Boolean, Unit> function2 = ((C1418830n1d) c1466950oHF.l0).LLLLIL().LIZ;
                    if (!((C1418830n1d) c1466950oHF.l0).LLLLLLIL()) {
                        i = 0;
                    }
                    function2.invoke(Integer.valueOf(iIntValue + i), obj4);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(C1466950oHF c1466950oHF, Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        C1412800mru c1412800mru = (C1412800mru) obj3;
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        InterfaceC1413600mtC interfaceC1413600mtCN5 = ((C1413530mt5) c1466950oHF.l0).n5();
        if (interfaceC1413600mtCN5 != null) {
            interfaceC1413600mtCN5.RQ(iIntValue, iIntValue2, c1412800mru, zBooleanValue, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(C1466950oHF c1466950oHF, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        ((C1415220mvo) c1466950oHF.l0).LLLIL = !C1411980mqa.LIZ();
        ((C1415220mvo) c1466950oHF.l0).F4((String) obj, ((Number) obj2).intValue(), (String) obj3, zBooleanValue);
        return Unit.LIZ;
    }

    public static final Object invoke$3(C1466950oHF c1466950oHF, Object obj, Object obj2, Object obj3, Object obj4) {
        ((Boolean) obj).booleanValue();
        ((C1462730oAR) c1466950oHF.l0).LJIIJ();
        return Unit.LIZ;
    }

    public static final Object invoke$4(C1466950oHF c1466950oHF, Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj).longValue();
        ((Number) obj2).longValue();
        ((Number) obj3).longValue();
        long jLongValue2 = ((Number) obj4).longValue();
        C1450140nq8 c1450140nq8 = (C1450140nq8) c1466950oHF.l0;
        c1450140nq8.LIZ = (int) jLongValue;
        c1450140nq8.LIZIZ = (int) jLongValue2;
        c1450140nq8.getClass();
        return Unit.LIZ;
    }
}
