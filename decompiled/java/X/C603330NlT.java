package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import defpackage.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NlT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.lynx.core.communicate.utils.SearchCommonHorizontalLoadMoreUtil$executeLoadMoreRequest$1$2", f = "SearchCommonHorizontalLoadMoreUtil.kt", l = {}, m = "invokeSuspend")
public final class C603330NlT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC634840OvC LL;
    public final /* synthetic */ CompletionBlock<j.c> LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C603330NlT(InterfaceC634840OvC interfaceC634840OvC, CompletionBlock<j.c> completionBlock, String str, InterfaceC1364105Vn<? super C603330NlT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC634840OvC;
        this.LLILLJJLI = completionBlock;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C603330NlT(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String containerID;
        C1C7U.LIZ("SearchCommonHorizontalLoadMoreUtil@9b2e.executeLoadMoreRequest$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC634840OvC interfaceC634840OvC = this.LL;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        j.c cVar = (j.c) C1909107dp.LIZJ(j.c.class, containerID);
        CompletionBlock<j.c> completionBlock = this.LLILLJJLI;
        cVar.setData(this.LLILLL);
        completionBlock.onSuccess(cVar, "");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchCommonHorizontalLoadMoreUtil@9b2e.executeLoadMoreRequest$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
