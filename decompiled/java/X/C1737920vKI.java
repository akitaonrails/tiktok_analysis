package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vKI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.preupload.logic.AmeEffectPrepareLogic$prepare$2", f = "AmeEffectPrepareLogic.kt", l = {69, 76, 81}, m = "invokeSuspend")
public final class C1737920vKI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC1738210vKl LL;
    public C1737870vKD LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C1737970vKN LLILZLL;
    public final /* synthetic */ C1737870vKD LLIZ;
    public final /* synthetic */ InterfaceC1738210vKl LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1737920vKI(C1737970vKN c1737970vKN, C1737870vKD c1737870vKD, InterfaceC1738210vKl interfaceC1738210vKl, InterfaceC1364105Vn<? super C1737920vKI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c1737970vKN;
        this.LLIZ = c1737870vKD;
        this.LLIZLLLIL = interfaceC1738210vKl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1737920vKI c1737920vKI = new C1737920vKI(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c1737920vKI.LLILZIL = obj;
        return c1737920vKI;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0160 A[EDGE_INSN: B:122:0x0160->B:79:0x0160 BREAK  A[LOOP:1: B:61:0x0124->B:123:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x015e A[EDGE_INSN: B:124:0x015e->B:78:0x015e BREAK  A[LOOP:2: B:68:0x0140->B:126:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1737920vKI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
