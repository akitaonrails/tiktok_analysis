package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15Yw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pns.serviceimp.sync.DataSyncEngineer$syncInBackground$1", f = "DataSyncEngineer.kt", l = {152, 79, 164, 164}, m = "invokeSuspend")
public final class C20540015Yw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public C1DEV LLILZ;
    public C20539915Yv LLILZIL;
    public Function1 LLILZLL;
    public int LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ Integer LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ C20539915Yv LLJILJIL;
    public final /* synthetic */ Function1<Boolean, Unit> LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20540015Yw(int i, Integer num, String str, C20539915Yv c20539915Yv, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C20540015Yw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = i;
        this.LLJI = num;
        this.LLJIJIL = str;
        this.LLJILJIL = c20539915Yv;
        this.LLJILJILJ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C20540015Yw c20540015Yw = new C20540015Yw(this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
        c20540015Yw.LLIZLLLIL = obj;
        return c20540015Yw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0156 A[Catch: all -> 0x01fa, TryCatch #6 {all -> 0x01fa, blocks: (B:55:0x014e, B:57:0x0156, B:58:0x0163, B:60:0x0169, B:61:0x0177, B:62:0x0183, B:64:0x018c, B:65:0x0190, B:54:0x0143), top: B:123:0x0143 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018c A[Catch: all -> 0x01fa, TryCatch #6 {all -> 0x01fa, blocks: (B:55:0x014e, B:57:0x0156, B:58:0x0163, B:60:0x0169, B:61:0x0177, B:62:0x0183, B:64:0x018c, B:65:0x0190, B:54:0x0143), top: B:123:0x0143 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0246  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20540015Yw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
