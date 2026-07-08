package X;

import android.content.Context;
import com.ss.android.ugc.aweme.tako.experiment.TakoEnterMethodListExperiment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ySi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.preload.TakoViewPreload$preloadForFirstFrame$1", f = "TakoViewPreload.kt", l = {}, m = "invokeSuspend")
public final class C1858460ySi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1858460ySi(boolean z, String str, boolean z2, Context context, boolean z3, InterfaceC1364105Vn<? super C1858460ySi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = z2;
        this.LLILZ = context;
        this.LLILZIL = z3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1858460ySi(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("TakoViewPreload@2e88.preloadForFirstFrame$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C01GW c01gw = C0B1L.LIZ;
        if (((Number) c01gw.getValue()).intValue() == 1) {
            if (((Boolean) C1859207Py.LIZ.getValue()).booleanValue()) {
                C1858450ySh.LIZ.getClass();
                if (TakoEnterMethodListExperiment.LIZ(false)) {
                    boolean z = this.LL;
                    String str = this.LLILLJJLI;
                    boolean z2 = this.LLILLL;
                    C1168804hi[] c1168804hiArr = new C1168804hi[3];
                    C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
                    if (z) {
                        c13dvLIZIZ.add(Integer.valueOf(R.layout.fr1));
                    }
                    C1855770yON.LIZ.getClass();
                    if (C1855770yON.LIZIZ()) {
                        i = R.layout.fo_;
                    } else {
                        i = R.layout.fo9;
                    }
                    c13dvLIZIZ.add(Integer.valueOf(i));
                    c13dvLIZIZ.add(Integer.valueOf(R.layout.fke));
                    C07QD.LIZ.getClass();
                    if (C07QD.LIZ() && TakoEnterMethodListExperiment.LIZ(false)) {
                        c13dvLIZIZ.add(Integer.valueOf(R.layout.fm0));
                        if (z2) {
                            c13dvLIZIZ.add(Integer.valueOf(R.layout.fm1));
                        }
                    }
                    c1168804hiArr[0] = new C1168804hi("shell", C1697820uHc.LIZ(c13dvLIZIZ));
                    C13DV c13dvLIZIZ2 = C1697820uHc.LIZIZ();
                    c13dvLIZIZ2.addAll(C1858450ySh.LIZ());
                    c1168804hiArr[1] = new C1168804hi("bottom_input", C1697820uHc.LIZ(c13dvLIZIZ2));
                    C13DV c13dvLIZIZ3 = C1697820uHc.LIZIZ();
                    c13dvLIZIZ3.addAll(C1858450ySh.LIZLLL());
                    c13dvLIZIZ3.addAll(C1858450ySh.LIZJ(str));
                    c13dvLIZIZ3.add(Integer.valueOf(R.layout.fmk));
                    c13dvLIZIZ3.add(Integer.valueOf(R.layout.fko));
                    if (C2273971DzX.LIZ()) {
                        c13dvLIZIZ3.add(Integer.valueOf(R.layout.flx));
                    }
                    c1168804hiArr[2] = new C1168804hi("content", C1697820uHc.LIZ(c13dvLIZIZ3));
                    List listLJIIJJI = C1697810uHb.LJIIJJI(c1168804hiArr);
                    ArrayList<C1168804hi> arrayList = new ArrayList();
                    for (Object obj2 : listLJIIJJI) {
                        if (!((C1168804hi) obj2).LIZIZ.isEmpty()) {
                            arrayList.add(obj2);
                        }
                    }
                    Context context = this.LLILZ;
                    for (C1168804hi c1168804hi : arrayList) {
                        C1858450ySh.LIZ.getClass();
                        if (!c1168804hi.LIZIZ.isEmpty()) {
                            C21146717pB.LJI(context, c1168804hi.LIZIZ);
                        }
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoViewPreload@2e88.preloadForFirstFrame$1");
                    return unit;
                }
            }
            C1858450ySh c1858450ySh = C1858450ySh.LIZ;
            boolean z3 = this.LL;
            String str2 = this.LLILLJJLI;
            boolean z4 = this.LLILLL;
            c1858450ySh.getClass();
            List listLIZIZ = C1858450ySh.LIZIZ(str2, z3, true, z4);
            if (!((ArrayList) listLIZIZ).isEmpty()) {
                C21146717pB.LJI(this.LLILZ, listLIZIZ);
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("TakoViewPreload@2e88.preloadForFirstFrame$1");
            return unit2;
        }
        ((Number) c01gw.getValue()).intValue();
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("TakoViewPreload@2e88.preloadForFirstFrame$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
