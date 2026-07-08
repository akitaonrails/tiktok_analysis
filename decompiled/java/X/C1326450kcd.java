package X;

import android.net.Uri;
import java.io.File;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0kcd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.tools.utils.BaseEffectIconCache$createCacheFile$1", f = "EffectIconCacheHelper.kt", l = {}, m = "invokeSuspend")
public final class C1326450kcd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1326460kce<Object> LL;
    public final /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1326450kcd(InterfaceC1326460kce<Object> interfaceC1326460kce, Object obj, String str, InterfaceC1364105Vn<? super C1326450kcd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1326460kce;
        this.LLILLJJLI = obj;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1326450kcd(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        File file;
        C1333180knU c1333180knULJIIIZ;
        Iterable iterableValues;
        C1C7U.LIZ("BaseEffectIconCache@6c30.createCacheFile$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String strLIZJ = this.LL.LIZJ(this.LLILLJJLI);
        if (strLIZJ == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("BaseEffectIconCache@6c30.createCacheFile$1");
            return unit;
        }
        if (C1326470kcf.LJ(this.LL, this.LLILLJJLI, new C0VSJ(strLIZJ))) {
            this.LL.LIZ(1, this.LLILLL);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("BaseEffectIconCache@6c30.createCacheFile$1");
            return unit2;
        }
        Uri uriLJ = this.LL.LJ(this.LLILLJJLI);
        if (uriLJ == null) {
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("BaseEffectIconCache@6c30.createCacheFile$1");
            return unit3;
        }
        C592490NLr c592490NLrLIZ = C1324810kZz.LJI().LIZ(C1325710kbR.LIZ(uriLJ), null);
        Class<?> cls = C1322200kVm.LIZ;
        InterfaceC1317730kOZ interfaceC1317730kOZLJIIJ = C1328130kfL.LJIILIIL().LJIILL().LJIIJ(c592490NLrLIZ);
        if (interfaceC1317730kOZLJIIJ == null && (c1333180knULJIIIZ = C1328130kfL.LJIILIIL().LJIIIZ()) != null && (iterableValues = c1333180knULJIIIZ.values()) != null) {
            Iterator it2 = iterableValues.iterator();
            while (it2.hasNext() && (interfaceC1317730kOZLJIIJ = ((InterfaceC1326920kdO) it2.next()).LJIIJ(c592490NLrLIZ)) == null) {
            }
        }
        if ((interfaceC1317730kOZLJIIJ instanceof C1335740krc) && (file = ((C1335740krc) interfaceC1317730kOZLJIIJ).LIZ) != null && file.exists()) {
            if (C2286708xd.LJFF(file.getPath(), strLIZJ)) {
                C1322200kVm.LIZ().LIZLLL(uriLJ);
            } else {
                Boolean.valueOf(C2286708xd.LJIJ(strLIZJ));
            }
            this.LL.LIZ(2, this.LLILLL);
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("BaseEffectIconCache@6c30.createCacheFile$1");
            return unit4;
        }
        this.LL.LIZ(0, this.LLILLL);
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("BaseEffectIconCache@6c30.createCacheFile$1");
        return unit5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
