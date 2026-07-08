package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uSm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.effectplatform.impl.DefaultResourceProvider$categoryFetch$1", f = "DefaultResourceProvider.kt", l = {581, 591, 592, 596, 604, 607, 618, 622, 630, 631}, m = "invokeSuspend")
public final class C1704740uSm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public CategoryPageModel LLILLJJLI;
    public C1705310uTh LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public final /* synthetic */ boolean LLJILJIL;
    public final /* synthetic */ boolean LLJILJILJ;
    public final /* synthetic */ C1705310uTh LLJILLL;
    public final /* synthetic */ String LLJJ;
    public final /* synthetic */ String LLJJI;
    public final /* synthetic */ int LLJJIII;
    public final /* synthetic */ int LLJJIJI;
    public final /* synthetic */ int LLJJIJIIJIL;
    public final /* synthetic */ String LLJJIJIL;
    public final /* synthetic */ AbstractC1705790uUT<T> LLJJJ;
    public final /* synthetic */ InterfaceC1705380uTo<T> LLJJJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1704740uSm(boolean z, boolean z2, C1705310uTh c1705310uTh, String str, String str2, int i, int i2, int i3, String str3, AbstractC1705790uUT<T> abstractC1705790uUT, InterfaceC1705380uTo<? super T> interfaceC1705380uTo, InterfaceC1364105Vn<? super C1704740uSm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJILJIL = z;
        this.LLJILJILJ = z2;
        this.LLJILLL = c1705310uTh;
        this.LLJJ = str;
        this.LLJJI = str2;
        this.LLJJIII = i;
        this.LLJJIJI = i2;
        this.LLJJIJIIJIL = i3;
        this.LLJJIJIL = str3;
        this.LLJJJ = abstractC1705790uUT;
        this.LLJJJIL = interfaceC1705380uTo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1704740uSm(this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL, this.LLJJIJIL, this.LLJJJ, this.LLJJJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0219  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1704740uSm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
