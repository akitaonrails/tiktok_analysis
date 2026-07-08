package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05in, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.experiments.MixEditingStopPreloadWhenStorageLow$hasEnoughCacheSpace$2", f = "MixEditingExperiment.kt", l = {}, m = "invokeSuspend")
public final class C1430305in extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public C1430305in(InterfaceC1364105Vn<? super C1430305in> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1430305in(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("MixEditingStopPreloadWhenStorageLow@869a.hasEnoughCacheSpace$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1430405io.LIZ.getClass();
        long jLJIILL = C2354709Kn.LJIILL();
        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cache available size: ");
        sbLIZ.append(jLJIILL / ((long) 1048576));
        C201955140j.LIZLLL(c0mj8, "a21740", C2188811AlT.LIZIZ(sbLIZ));
        if (jLJIILL >= ((Number) C1430405io.LIZIZ.getValue()).longValue()) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("MixEditingStopPreloadWhenStorageLow@869a.hasEnoughCacheSpace$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return new C1430305in(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
