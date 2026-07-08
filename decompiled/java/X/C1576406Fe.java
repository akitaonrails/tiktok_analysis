package X;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Fe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.view.panel.StreakPanelRouter$openPanel$1", f = "StreakPanelRouter.kt", l = {65, 71}, m = "invokeSuspend")
public final class C1576406Fe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C06G9 LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C06ET LLILZIL;
    public final /* synthetic */ C1576706Fh LLILZLL;
    public final /* synthetic */ Activity LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1576406Fe(C06G9 c06g9, String str, C06ET c06et, C1576706Fh c1576706Fh, Activity activity, InterfaceC1364105Vn<? super C1576406Fe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c06g9;
        this.LLILZ = str;
        this.LLILZIL = c06et;
        this.LLILZLL = c1576706Fh;
        this.LLIZ = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1576406Fe c1576406Fe = new C1576406Fe(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1576406Fe.LLILLJJLI = obj;
        return c1576406Fe;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ad  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1576406Fe.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
