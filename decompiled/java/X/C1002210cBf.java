package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0cBf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.preload.prewarm.SparkWarmupTask$doPreWarm$1", f = "OptSpeedUpWebviewTask.kt", l = {}, m = "invokeSuspend")
public final class C1002210cBf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1002210cBf(InterfaceC1364105Vn<? super C1002210cBf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1002210cBf(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SparkWarmupTask@47bd.doPreWarm$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C1541950qED.LIZJ.LJIJ();
            C844470XAv.LIZ.getClass();
            C1064720doU.LIZIZ(C844470XAv.LIZ());
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        C1002220cBg.LIZIZ = true;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SparkWarmupTask@47bd.doPreWarm$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1002210cBf(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
