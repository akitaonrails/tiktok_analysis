package X;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xzP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.widget.StoryWidgetMgr$refreshWidgetInternal$job$1", f = "StoryWidgetMgr.kt", l = {144, 152, 159}, m = "invokeSuspend")
public final class C1840290xzP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ List<Integer> LLILZLL;
    public final /* synthetic */ C1838770xwx LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1840290xzP(String str, boolean z, Context context, List<Integer> list, C1838770xwx c1838770xwx, InterfaceC1364105Vn<? super C1840290xzP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = context;
        this.LLILZLL = list;
        this.LLIZ = c1838770xwx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1840290xzP c1840290xzP = new C1840290xzP(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1840290xzP.LLILLJJLI = obj;
        return c1840290xzP;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x023b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1840290xzP.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
