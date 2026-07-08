package X;

import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.InteractPlayListBottomBarAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0SXu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.InteractPlayListBottomBarAssem$onViewFinishInflate$1$2$1", f = "PlayListBottomBarAssem.kt", l = {330}, m = "invokeSuspend")
public final class C723040SXu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC723050SXv LLILLJJLI;
    public final /* synthetic */ InteractPlayListBottomBarAssem LLILLL;
    public final /* synthetic */ C197039127h LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C723040SXu(InterfaceC723050SXv interfaceC723050SXv, InteractPlayListBottomBarAssem interactPlayListBottomBarAssem, C197039127h c197039127h, InterfaceC1364105Vn<? super C723040SXu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC723050SXv;
        this.LLILLL = interactPlayListBottomBarAssem;
        this.LLILZ = c197039127h;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C723040SXu(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InteractPlayListBottomBarAssem@6241.onViewFinishInflate$1$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1DFB c1dfb = C0PEM.LIZJ;
            C723020SXs c723020SXs = new C723020SXs(this.LLILLJJLI, this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c723020SXs) == objLJFF) {
                C1C7U.LIZIZ("InteractPlayListBottomBarAssem@6241.onViewFinishInflate$1$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InteractPlayListBottomBarAssem@6241.onViewFinishInflate$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
