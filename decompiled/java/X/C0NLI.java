package X;

import com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabDynamicIconInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NLI, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hometab.base.tabicon.iconfile.IconFileManager$prepareIconResource$1", f = "IconFileManager.kt", l = {69, 70}, m = "invokeSuspend")
public final class C0NLI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0NLJ LLILLJJLI;
    public final /* synthetic */ List<TabDynamicIconInfo> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NLI(C0NLJ c0nlj, List<TabDynamicIconInfo> list, InterfaceC1364105Vn<? super C0NLI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0nlj;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NLI(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[LOOP:0: B:8:0x002c->B:10:0x0032, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092 A[LOOP:2: B:29:0x008c->B:31:0x0092, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8 A[LOOP:4: B:39:0x00d2->B:41:0x00d8, LOOP_END] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NLI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
