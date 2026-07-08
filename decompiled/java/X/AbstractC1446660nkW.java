package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nkW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1446660nkW implements InterfaceC1840230xzJ {
    public final Map<Object, C1446670nkX> LIZ;
    public final Map<Object, Object> LIZIZ;
    public final Object LIZJ;
    public final List<Object> LIZLLL;

    public abstract void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2);

    public void LIZIZ(C556300Lro c556300Lro, Object obj, Object obj2) {
    }

    public abstract void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2);

    public void LIZLLL(Object obj, C556300Lro c556300Lro, AbstractC556190Lrd abstractC556190Lrd) {
    }

    public abstract void LJ(Object obj, C1404610meh c1404610meh);

    public abstract void LJFF(Object obj, Object obj2, boolean z, int i, int i2);

    @Override // X.InterfaceC1840230xzJ
    public void onEvent(AbstractC556190Lrd abstractC556190Lrd) {
        List<Object> list = this.LIZLLL;
        if (list != null && (abstractC556190Lrd instanceof C556250Lrj) && list.contains(abstractC556190Lrd.LIZ)) {
            this.LIZIZ.put(abstractC556190Lrd.LIZ, ((C556250Lrj) abstractC556190Lrd).LIZLLL);
        }
        if (this.LIZJ != null && (!Intrinsics.LJFF(r1, abstractC556190Lrd.LIZ))) {
            return;
        }
        if (abstractC556190Lrd instanceof C556240Lri) {
            C556240Lri c556240Lri = (C556240Lri) abstractC556190Lrd;
            this.LIZ.put(abstractC556190Lrd.LIZ, new C1446670nkX(abstractC556190Lrd.LIZIZ, c556240Lri.LIZJ));
            LJ(abstractC556190Lrd.LIZ, c556240Lri.LIZLLL);
            return;
        }
        if (abstractC556190Lrd instanceof C556250Lrj) {
            C1446670nkX c1446670nkX = (C1446670nkX) ((LinkedHashMap) this.LIZ).get(abstractC556190Lrd.LIZ);
            C556300Lro c556300Lro = abstractC556190Lrd.LIZIZ;
            C556300Lro c556300Lro2 = c1446670nkX.LIZ;
            c556300Lro.getClass();
            long j = c556300Lro.LIZ - c556300Lro2.LIZ;
            long j2 = c556300Lro.LIZIZ - c556300Lro2.LIZIZ;
            Object obj = abstractC556190Lrd.LIZ;
            C556250Lrj c556250Lrj = (C556250Lrj) abstractC556190Lrd;
            LJFF(obj, c556250Lrj.LIZLLL, c556250Lrj.LJ, (int) j, (int) j2);
            return;
        }
        if (abstractC556190Lrd instanceof C556230Lrh) {
            C1446670nkX c1446670nkX2 = (C1446670nkX) ((LinkedHashMap) this.LIZ).get(abstractC556190Lrd.LIZ);
            C556300Lro c556300Lro3 = abstractC556190Lrd.LIZIZ;
            C556300Lro c556300Lro4 = c1446670nkX2.LIZ;
            c556300Lro3.getClass();
            LIZJ(abstractC556190Lrd.LIZ, ((C556230Lrh) abstractC556190Lrd).LIZLLL, (int) (c556300Lro3.LIZ - c556300Lro4.LIZ), (int) (c556300Lro3.LIZIZ - c556300Lro4.LIZIZ));
            return;
        }
        if (abstractC556190Lrd instanceof C556150LrZ) {
            C1446670nkX c1446670nkX3 = (C1446670nkX) ((LinkedHashMap) this.LIZ).get(abstractC556190Lrd.LIZ);
            C556300Lro c556300Lro5 = abstractC556190Lrd.LIZIZ;
            C556300Lro c556300Lro6 = c1446670nkX3.LIZ;
            c556300Lro5.getClass();
            LIZ(abstractC556190Lrd.LIZ, ((C556150LrZ) abstractC556190Lrd).LIZLLL, (int) (c556300Lro5.LIZ - c556300Lro6.LIZ), (int) (c556300Lro5.LIZIZ - c556300Lro6.LIZIZ));
            return;
        }
        if (abstractC556190Lrd instanceof C556200Lre) {
            LIZIZ(abstractC556190Lrd.LIZIZ, abstractC556190Lrd.LIZ, ((C556200Lre) abstractC556190Lrd).LIZJ);
        } else {
            LIZLLL(abstractC556190Lrd.LIZ, abstractC556190Lrd.LIZIZ, abstractC556190Lrd);
        }
    }

    public AbstractC1446660nkW(Object obj, List<? extends Object> list) {
        this.LIZJ = obj;
        this.LIZLLL = list;
        this.LIZ = new LinkedHashMap();
        this.LIZIZ = new LinkedHashMap();
    }

    public /* synthetic */ AbstractC1446660nkW(int i, Object obj) {
        this((i & 1) != 0 ? null : obj, (List<? extends Object>) null);
    }
}
