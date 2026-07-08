package X;

import com.ss.android.ugc.aweme.pitaya.PitayaLiteModeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.057X, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pitaya.PitayaInitHelper$initPitayaAsync$1", f = "PitayaInitHelper.kt", l = {}, m = "invokeSuspend")
public final class C057X extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ PitayaLiteModeConfig LLILLJJLI;
    public final /* synthetic */ AnonymousClass1457 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C057X(String str, PitayaLiteModeConfig pitayaLiteModeConfig, AnonymousClass1457 anonymousClass1457, InterfaceC1364105Vn<? super C057X> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = pitayaLiteModeConfig;
        this.LLILLL = anonymousClass1457;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C057X(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PitayaInitHelper@8cf2.initPitayaAsync$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AnonymousClass1455.LIZ.LIZLLL(this.LL, this.LLILLJJLI, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PitayaInitHelper@8cf2.initPitayaAsync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
