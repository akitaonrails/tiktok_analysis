package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.01ak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.preload.GeckoMemResourceManager$releaseGeckoFile$2", f = "GeckoMemResourceManager.kt", l = {}, m = "invokeSuspend")
public final class C361201ak extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C361201ak(String str, InterfaceC1364105Vn<? super C361201ak> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C361201ak(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeckoMemResourceManager@3b1f.releaseGeckoFile$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0VSJ c0vsj = new C0VSJ(this.LL);
        if (!c0vsj.isDirectory()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("GeckoMemResourceManager@3b1f.releaseGeckoFile$2");
            return unit;
        }
        File[] fileArrListFiles = c0vsj.listFiles();
        if (fileArrListFiles != null) {
            ArrayList arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                if (!a0.LJJIIZI(file.getName(), e3.d, false)) {
                    arrayList.add(file);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C361401am.LIZ.remove(((File) it2.next()).getName());
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GeckoMemResourceManager@3b1f.releaseGeckoFile$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
