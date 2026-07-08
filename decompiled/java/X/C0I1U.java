package X;

import com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.SharePanelEditRootAssem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0I1U, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.SharePanelEditRootAssem$addEmojiPanel$1", f = "SharePanelEditRootAssem.kt", l = {272}, m = "invokeSuspend")
public final class C0I1U extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SharePanelEditRootAssem LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0I1U(SharePanelEditRootAssem sharePanelEditRootAssem, int i, InterfaceC1364105Vn<? super C0I1U> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = sharePanelEditRootAssem;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0I1U(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SharePanelEditRootAssem@14d7.addEmojiPanel$1");
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
            List listLIZ = C456310Huv.LIZ();
            C2238608ps c2238608ps = C2108208Ns.LIZ;
            C0I1V c0i1v = new C0I1V(this.LLILLJJLI, listLIZ, this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c2238608ps, c0i1v) == objLJFF) {
                C1C7U.LIZIZ("SharePanelEditRootAssem@14d7.addEmojiPanel$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SharePanelEditRootAssem@14d7.addEmojiPanel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
