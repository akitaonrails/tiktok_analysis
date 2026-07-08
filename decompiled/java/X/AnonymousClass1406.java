package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.aigc.C2PACacheItem;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.1406, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.C2PACacheManager$flushListToKeva$1", f = "C2PACacheManager.kt", l = {}, m = "invokeSuspend")
public final class AnonymousClass1406 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public AnonymousClass1406(InterfaceC1364105Vn<? super AnonymousClass1406> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass1406(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("C2PACacheManager@f00c.flushListToKeva$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AnonymousClass1407 anonymousClass1407 = AnonymousClass1407.LIZ;
        CopyOnWriteArrayList<C2PACacheItem> copyOnWriteArrayList = AnonymousClass1407.LIZIZ;
        anonymousClass1407.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start to store cache list，size: ");
        sbLIZ.append(copyOnWriteArrayList.size());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C571450Mb9.LIZIZ(C571430Mb7.LL, C1421580n64.LIZIZ, strLIZIZ);
        AnonymousClass1407.LIZLLL.storeString("c2pa_cache_list", GsonProtectorUtils.toJson((Gson) AnonymousClass1407.LJII.getValue(), copyOnWriteArrayList));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("C2PACacheManager@f00c.flushListToKeva$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new AnonymousClass1406(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
