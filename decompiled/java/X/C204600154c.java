package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.154c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.music.collect.page.MusicCollectFirstTabPage$loadData$1", f = "MusicCollectFirstTabPage.kt", l = {208, 210}, m = "invokeSuspend")
public final class C204600154c extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C204599154b LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C204600154c(C204599154b c204599154b, boolean z, int i, InterfaceC1364105Vn<? super C204600154c> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c204599154b;
        this.LLILZLL = z;
        this.LLIZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C204600154c c204600154c = new C204600154c(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c204600154c.LLILZ = obj;
        return c204600154c;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027b A[EDGE_INSN: B:137:0x027b->B:122:0x027b BREAK  A[LOOP:2: B:84:0x01c5->B:90:0x01e5], EDGE_INSN: B:140:0x027b->B:122:0x027b BREAK  A[LOOP:3: B:96:0x01fe->B:102:0x0222], EDGE_INSN: B:142:0x027b->B:122:0x027b BREAK  A[LOOP:4: B:110:0x0245->B:116:0x0269]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204600154c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
