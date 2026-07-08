package X;

import com.bytedance.pipo.googlepay.pushprovisioning.EphemeralKeyProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Wr2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.bytedance.pipo.googlepay.pushprovisioning.EphemeralKeyProvider$createEphemeralKey$1", f = "TokenizeGooglePayFragment.kt", l = {297, 302, 310}, m = "invokeSuspend")
public final class C836100Wr2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EphemeralKeyProvider LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC834570WoZ LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C836100Wr2(EphemeralKeyProvider ephemeralKeyProvider, String str, InterfaceC834570WoZ interfaceC834570WoZ, InterfaceC1364105Vn<? super C836100Wr2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = ephemeralKeyProvider;
        this.LLILLL = str;
        this.LLILZ = interfaceC834570WoZ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C836100Wr2(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C836100Wr2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
