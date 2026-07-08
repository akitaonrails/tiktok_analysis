package X;

import Y.AObjectS82S0400000_25;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.effecteditor.swig.UIAnnotationUpdateType;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.compliance.api.model.Donor;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;

/* JADX INFO: renamed from: X.0uIa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698420uIa extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
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
            case 5:
                return invoke$5(this, obj, obj2, obj3, obj4);
            case 6:
                return invoke$6(this, obj, obj2, obj3, obj4);
            case 7:
                return invoke$7(this, obj, obj2, obj3, obj4);
            case 8:
                return invoke$8(this, obj, obj2, obj3, obj4);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1698420uIa(InterfaceC1631620sYq interfaceC1631620sYq, InterfaceC1631620sYq<? super Integer, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq2) {
        super(4);
        this.$t = interfaceC1631620sYq2;
        this.l0 = interfaceC1631620sYq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1698420uIa(InterfaceC1631630sYr interfaceC1631630sYr, InterfaceC1631630sYr<? super Integer, ? super Boolean, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631630sYr2) {
        super(4);
        this.$t = interfaceC1631630sYr2;
        this.l0 = interfaceC1631630sYr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1698420uIa(InterfaceC1665500tRU interfaceC1665500tRU, InterfaceC1665500tRU<String> interfaceC1665500tRU2) {
        super(4);
        this.$t = interfaceC1665500tRU2;
        this.l0 = interfaceC1665500tRU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1698420uIa(C1695120uDG c1695120uDG, int i) {
        super(4);
        this.$t = i;
        this.l0 = c1695120uDG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1698420uIa(l0 l0Var, int i) {
        super(4);
        this.$t = i;
        this.l0 = l0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1698420uIa(List list, int i) {
        super(4);
        this.$t = i;
        this.l0 = list;
    }

    public static final Object invoke$0(C1698420uIa c1698420uIa, Object obj, Object obj2, Object obj3, Object obj4) {
        ((l0) c1698420uIa.l0).LLILZLL.getAudioController().LIZ(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue());
        return Unit.LIZ;
    }

    public static final Object invoke$1(C1698420uIa c1698420uIa, Object obj, Object obj2, Object obj3, Object obj4) {
        Effect effect = (Effect) obj;
        List<C1621190sI1> list = (List) obj2;
        List<C1621190sI1> list2 = (List) obj3;
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        if (DiyPropParser.LIZIZ(effect)) {
            C09IB.LIZ.getClass();
            C09IB.LIZIZ(effect, list2);
            ((l0) c1698420uIa.l0).LLLLLLL = list2.size();
        } else {
            C21356918hz c21356918hz = new C21356918hz();
            if (C2348109Hz.LIZ() && effect != null) {
                c21356918hz.LIZIZ(effect.getSdkExtra());
            }
            if (zBooleanValue) {
                LiveEvent<Pair<Integer, Boolean>> liveEventQ30 = ((l0) c1698420uIa.l0).getCameraApiComponent().Q30();
                l0 l0Var = (l0) c1698420uIa.l0;
                l0Var.getLifecycleOwner();
                liveEventQ30.LIZ(l0Var, new AObjectS82S0400000_25((l0) c1698420uIa.l0, list, list2, c21356918hz, 5));
            } else {
                ((l0) c1698420uIa.l0).a9(list, list2, c21356918hz);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(C1698420uIa c1698420uIa, Object obj, Object obj2, Object obj3, Object obj4) {
        Effect effect = (Effect) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        if (DiyPropParser.LIZIZ(effect)) {
            if (zBooleanValue) {
                C09IB c09ib = C09IB.LIZ;
                C1622300sJo c1622300sJo = new AbstractC1622310sJp() { // from class: X.0sJo
                    {
                        UIAnnotationUpdateType uIAnnotationUpdateType = UIAnnotationUpdateType.UIAnnotationUpdateType_Preview;
                    }
                };
                c09ib.getClass();
                C09IB.LIZ(effect, str2, c1622300sJo);
            } else {
                C1624230sMv c1624230sMvLJIIIZ = DiyPropParser.LJIIIZ(effect);
                if (c1624230sMvLJIIIZ != null && c1624230sMvLJIIIZ.LIZIZ && str.length() == 0) {
                    C09IB c09ib2 = C09IB.LIZ;
                    C1622300sJo c1622300sJo2 = new AbstractC1622310sJp() { // from class: X.0sJo
                        {
                            UIAnnotationUpdateType uIAnnotationUpdateType = UIAnnotationUpdateType.UIAnnotationUpdateType_Preview;
                        }
                    };
                    c09ib2.getClass();
                    C09IB.LIZ(effect, str2, c1622300sJo2);
                } else {
                    C09IB c09ib3 = C09IB.LIZ;
                    C1622320sJq c1622320sJq = C1622320sJq.LIZIZ;
                    c09ib3.getClass();
                    C09IB.LIZ(effect, str2, c1622320sJq);
                }
            }
            ((l0) c1698420uIa.l0).LLLLLLL = 1;
        } else {
            C21356918hz c21356918hz = new C21356918hz();
            if (C2348109Hz.LIZ() && effect != null) {
                c21356918hz.LIZIZ(effect.getSdkExtra());
            }
            ((l0) c1698420uIa.l0).T8(str2, str, c21356918hz);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(C1698420uIa c1698420uIa, Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        int iIntValue = ((Number) obj2).intValue();
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            if (interfaceC1680500tpg.LJJIIJ(obj)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            if (interfaceC1680500tpg.LJIJI(iIntValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg.LJIJJLI(i & 1, z)) {
            Donor donor = (Donor) ListProtector.get((List) c1698420uIa.l0, iIntValue);
            interfaceC1680500tpg.LJJIIJZLJL(-199358984);
            C1674250tfb.LIZLLL(donor, interfaceC1680500tpg, (((i & 14) >> 3) & 14) | Donor.$stable);
            interfaceC1680500tpg.LJ();
        } else {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(C1698420uIa c1698420uIa, Object obj, Object obj2, Object obj3, Object obj4) {
        int i = ((C1693240uAE) obj3).LIZ;
        int i2 = ((C1695610uE3) obj4).LIZ;
        C0NUI c0nuiLIZ = ((C1695120uDG) c1698420uIa.l0).LJ.LIZ((AbstractC1696400uFK) obj, (C1680190tpB) obj2, i, i2);
        if (!(c0nuiLIZ instanceof C0NUJ)) {
            C1695430uDl c1695430uDl = new C1695430uDl(c0nuiLIZ, ((C1695120uDG) c1698420uIa.l0).LJIIIZ);
            ((C1695120uDG) c1698420uIa.l0).LJIIIZ = c1695430uDl;
            return c1695430uDl.LIZJ;
        }
        return c0nuiLIZ.getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(C1698420uIa c1698420uIa, Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        int iIntValue = ((Number) obj2).intValue();
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            if (interfaceC1680500tpg.LJJIIJ(obj)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            if (interfaceC1680500tpg.LJIJI(iIntValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg.LJIJJLI(i & 1, z)) {
            ((Number) ListProtector.get((List) c1698420uIa.l0, iIntValue)).intValue();
            interfaceC1680500tpg.LJJIIJZLJL(-42246789);
            C1674320tfi.LIZLLL(interfaceC1680500tpg, 0);
            interfaceC1680500tpg.LJ();
        } else {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$6(C1698420uIa c1698420uIa, Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj3;
        ((Number) obj4).intValue();
        InterfaceC1665500tRU interfaceC1665500tRU = (InterfaceC1665500tRU) c1698420uIa.l0;
        C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
        C1679920tok c1679920tok = C1679930tol.LIZ;
        InterfaceC1668050tVb.LIZ.getClass();
        C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(c1679920tok, C1668040tVa.LJIIJ, interfaceC1680500tpg, 0);
        int iLIZ = C0MXE.LIZ(interfaceC1680500tpg);
        C13D2 c13d2LJJIFFI = interfaceC1680500tpg.LJJIFFI();
        InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg, c1685760tyA);
        g.LJLIIIL.getClass();
        AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
        if (interfaceC1680500tpg.LJIIJJI() instanceof InterfaceC20032213Zo) {
            interfaceC1680500tpg.LJJIII();
            if (interfaceC1680500tpg.LJJIIZ()) {
                interfaceC1680500tpg.LJJI(aFwS214S0000000_25);
            } else {
                interfaceC1680500tpg.LJIILJJIL();
            }
            C1665930tSB.LIZ(interfaceC1680500tpg, c1688120u1yLIZ, g.a.LJI);
            C1665930tSB.LIZ(interfaceC1680500tpg, c13d2LJJIFFI, g.a.LJFF);
            AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
            if (interfaceC1680500tpg.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg.LJJ(), Integer.valueOf(iLIZ))) {
                interfaceC1680500tpg.LJJIJIIJI(Integer.valueOf(iLIZ));
                interfaceC1680500tpg.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
            }
            C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
            C1685190txF.LIZ((String) interfaceC1665500tRU.get(iIntValue), null, C1670400tZO.LIZIZ(interfaceC1680500tpg).K3(), C1670400tZO.LJ(interfaceC1680500tpg).LJIIZILJ, 0L, 0, 0, false, 0, null, null, interfaceC1680500tpg, 0, 0, 2034);
            float f = 16;
            C1668930tX1.LIZIZ(C1669660tYC.LJJLIIIJJIZ, null, null, C1670400tZO.LIZIZ(interfaceC1680500tpg).N3(), f, f, false, interfaceC1680500tpg, 221232, 68);
            interfaceC1680500tpg.LJIIIZ();
            return Unit.LIZ;
        }
        C0MXE.LIZIZ();
        throw null;
    }

    public static final Object invoke$7(C1698420uIa c1698420uIa, Object obj, Object obj2, Object obj3, Object obj4) {
        ((InterfaceC1631620sYq) c1698420uIa.l0).invoke(Integer.valueOf(((Number) obj2).intValue()), obj3, Integer.valueOf((((Number) obj4).intValue() >> 3) & 14));
        return Unit.LIZ;
    }

    public static final Object invoke$8(C1698420uIa c1698420uIa, Object obj, Object obj2, Object obj3, Object obj4) {
        ((InterfaceC1631630sYr) c1698420uIa.l0).invoke(Integer.valueOf(((Number) obj2).intValue()), Boolean.TRUE, obj3, Integer.valueOf(((((Number) obj4).intValue() >> 3) & 14) | 48));
        return Unit.LIZ;
    }

    public static final Object invoke$9(C1698420uIa c1698420uIa, Object obj, Object obj2, Object obj3, Object obj4) {
        ((InterfaceC1631630sYr) c1698420uIa.l0).invoke(Integer.valueOf(((Number) obj2).intValue()), Boolean.TRUE, obj3, Integer.valueOf(((((Number) obj4).intValue() >> 3) & 14) | 48));
        return Unit.LIZ;
    }
}
