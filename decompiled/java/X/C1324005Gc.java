package X;

import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Gc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel$loadFeedLayeredCachePaged$1", f = "FeedSkylightListViewModel.kt", l = {626, 629, 633}, m = "invokeSuspend")
public final class C1324005Gc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC1455405mq LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ FeedSkylightListViewModel LLILZ;
    public final /* synthetic */ C05IL LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1324005Gc(FeedSkylightListViewModel feedSkylightListViewModel, C05IL c05il, int i, InterfaceC1364105Vn<? super C1324005Gc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = feedSkylightListViewModel;
        this.LLILZIL = c05il;
        this.LLILZLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1324005Gc c1324005Gc = new C1324005Gc(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1324005Gc.LLILLL = obj;
        return c1324005Gc;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c4 A[Catch: all -> 0x00dd, TRY_ENTER, TryCatch #3 {all -> 0x00dd, blocks: (B:59:0x00d4, B:60:0x00d7, B:55:0x00c4), top: B:71:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ef  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1324005Gc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
