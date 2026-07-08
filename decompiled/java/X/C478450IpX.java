package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.feed.TabMGTopLive;

/* JADX INFO: renamed from: X.0IpX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hangout.container.model.MultiTopLiveDataCacheManager$preloadMultiTopLiveData$1$interactJob$1", f = "MultiTopLiveDataCacheManager.kt", l = {127}, m = "invokeSuspend")
public final class C478450IpX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super TabMGTopLive>, Object> {
    public int LL;
    public final /* synthetic */ EnumC479370Ir1 LLILLJJLI;
    public final /* synthetic */ C477580Io8 LLILLL;
    public final /* synthetic */ C479440Ir8 LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ InterfaceC476860Imy LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C478450IpX(EnumC479370Ir1 enumC479370Ir1, C477580Io8 c477580Io8, C479440Ir8 c479440Ir8, String str, InterfaceC476860Imy interfaceC476860Imy, InterfaceC1364105Vn<? super C478450IpX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = enumC479370Ir1;
        this.LLILLL = c477580Io8;
        this.LLILZ = c479440Ir8;
        this.LLILZIL = str;
        this.LLILZLL = interfaceC476860Imy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C478450IpX(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d3  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C478450IpX.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super TabMGTopLive> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
