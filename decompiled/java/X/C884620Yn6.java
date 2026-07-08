package X;

import com.ss.android.ugc.aweme.im.core.chatlist.impl.engine.ChatListEngine;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yn6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.core.chatlist.impl.engine.ChatListEngine$dataSourceObserver$2$1$onQueryResult$4", f = "ChatListEngine.kt", l = {}, m = "invokeSuspend")
public final class C884620Yn6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ChatListEngine LL;
    public final /* synthetic */ InterfaceC879010Ye3 LLILLJJLI;
    public final /* synthetic */ List<C879540Yeu<?>> LLILLL;
    public final /* synthetic */ List<C879540Yeu<?>> LLILZ;
    public final /* synthetic */ C878550YdJ LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C884620Yn6(ChatListEngine chatListEngine, InterfaceC879010Ye3 interfaceC879010Ye3, List<? extends C879540Yeu<?>> list, List<? extends C879540Yeu<?>> list2, C878550YdJ c878550YdJ, boolean z, boolean z2, String str, InterfaceC1364105Vn<? super C884620Yn6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = chatListEngine;
        this.LLILLJJLI = interfaceC879010Ye3;
        this.LLILLL = list;
        this.LLILZ = list2;
        this.LLILZIL = c878550YdJ;
        this.LLILZLL = z;
        this.LLIZ = z2;
        this.LLIZLLLIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C884620Yn6(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListEngine@4c4f.dataSourceObserver$2$1$onQueryResult$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJJIIJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatListEngine@4c4f.dataSourceObserver$2$1$onQueryResult$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
