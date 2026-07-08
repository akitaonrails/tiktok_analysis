package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0oBY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.StickPointVideoPresenter$startDefaultStickPointNew$1$1", f = "StickPointVideoPresenter.kt", l = {}, m = "invokeSuspend")
public final class C1463420oBY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1168704hh LL;
    public final /* synthetic */ InterfaceC358010E1v LLILLJJLI;
    public final /* synthetic */ C1463030oAv LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1463420oBY(C1168704hh c1168704hh, InterfaceC358010E1v interfaceC358010E1v, C1463030oAv c1463030oAv, int i, boolean z, InterfaceC1364105Vn<? super C1463420oBY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1168704hh;
        this.LLILLJJLI = interfaceC358010E1v;
        this.LLILLL = c1463030oAv;
        this.LLILZ = i;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1463420oBY(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1463670oBx c1463670oBx;
        int i;
        C1463670oBx c1463670oBx2;
        C1C7U.LIZ("StickPointVideoPresenter@671e.startDefaultStickPointNew$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1168704hh c1168704hh = this.LL;
        Unit unit = null;
        if (c1168704hh == null) {
            InterfaceC358010E1v interfaceC358010E1v = this.LLILLJJLI;
            if (interfaceC358010E1v != null) {
                interfaceC358010E1v.onFailed();
                unit = Unit.LIZ;
            }
        } else {
            List<Integer> list = c1168704hh.LIZIZ;
            if (list != null) {
                C1463030oAv c1463030oAv = this.LLILLL;
                InterfaceC1463300oBM interfaceC1463300oBM = c1463030oAv.LJI;
                if (interfaceC1463300oBM != null) {
                    interfaceC1463300oBM.LIZLLL(list);
                }
                InterfaceC1452170ntP interfaceC1452170ntP = c1463030oAv.LIZ;
                if (interfaceC1452170ntP != null) {
                    int size = list.size();
                    Iterable iterableLJIIIZ = C1697810uHb.LJIIIZ(list);
                    if (!(iterableLJIIIZ instanceof Collection) || !((Collection) iterableLJIIIZ).isEmpty()) {
                        C531650Kt9 it2 = iterableLJIIIZ.iterator();
                        while (true) {
                            if (!it2.LLILLL) {
                                break;
                            }
                            int iNextInt = it2.nextInt();
                            if (((Number) ListProtector.get(list, iNextInt)).intValue() != iNextInt) {
                                int[] iArr = new int[size];
                                for (int i2 = 0; i2 < size; i2++) {
                                    iArr[i2] = i2;
                                }
                                for (int i3 = 0; i3 < size; i3++) {
                                    int iIntValue = ((Number) ListProtector.get(list, i3)).intValue();
                                    int i4 = iArr[iIntValue];
                                    if (i4 != i3) {
                                        if (((Boolean) C272440Am2.LIZ.getValue()).booleanValue()) {
                                            if ((interfaceC1452170ntP instanceof C1463670oBx) && (c1463670oBx2 = (C1463670oBx) interfaceC1452170ntP) != null) {
                                                C347200DjK.LIZIZ(c1463670oBx2.LIZLLL().LIZ, i4, i3, false);
                                            }
                                        } else {
                                            interfaceC1452170ntP.fg(i4, i3);
                                        }
                                        if (i4 > i3) {
                                            for (int i5 = 0; i5 < size; i5++) {
                                                if (i5 != iIntValue && i3 <= (i = iArr[i5]) && i < i4) {
                                                    iArr[i5] = i + 1;
                                                }
                                            }
                                        } else {
                                            for (int i6 = 0; i6 < size; i6++) {
                                                if (i6 != iIntValue) {
                                                    int i7 = i4 + 1;
                                                    int i8 = iArr[i6];
                                                    if (i7 <= i8 && i8 <= i3) {
                                                        iArr[i6] = i8 - 1;
                                                    }
                                                }
                                            }
                                        }
                                        iArr[iIntValue] = i3;
                                    }
                                }
                                if (((Boolean) C272440Am2.LIZ.getValue()).booleanValue()) {
                                    if ((interfaceC1452170ntP instanceof C1463670oBx) && (c1463670oBx = (C1463670oBx) interfaceC1452170ntP) != null) {
                                        c1463670oBx.LIZLLL().LIZ.commit();
                                    }
                                } else {
                                    interfaceC1452170ntP.updateAlgorithmFromNormal();
                                }
                            }
                        }
                    }
                }
            }
            this.LLILLL.LJFF(this.LLILZ, this.LLILZIL, this.LL.LIZ);
            InterfaceC358010E1v interfaceC358010E1v2 = this.LLILLJJLI;
            if (interfaceC358010E1v2 != null) {
                interfaceC358010E1v2.LIZ(0);
                unit = Unit.LIZ;
            }
        }
        C1C7U.LIZIZ("StickPointVideoPresenter@671e.startDefaultStickPointNew$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
