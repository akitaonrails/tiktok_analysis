package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutDslContentCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uQK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.linkcore.layout.access.LinkMicLayoutStaticDataChannelProviderImpl$getDslContent$2$1", f = "LinkMicLayoutStaticDataChannelProviderImpl.kt", l = {}, m = "invokeSuspend")
public final class C1703220uQK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2182601AbS LL;
    public final /* synthetic */ C259800zU<C189200o6<String>> LLILLJJLI;
    public final /* synthetic */ C259800zU<EnumC2188971Alj> LLILLL;
    public final /* synthetic */ LinkMicLayoutDslContentCallback LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1703220uQK(C2182601AbS c2182601AbS, C259800zU<C189200o6<String>> c259800zU, C259800zU<EnumC2188971Alj> c259800zU2, LinkMicLayoutDslContentCallback linkMicLayoutDslContentCallback, InterfaceC1364105Vn<? super C1703220uQK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2182601AbS;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = c259800zU2;
        this.LLILZ = linkMicLayoutDslContentCallback;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1703220uQK(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        C1C7U.LIZ("LinkMicLayoutStaticDataChannelProviderImpl@b9eb.getDslContent$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2182601AbS c2182601AbS = this.LL;
        C189200o6<String> c189200o6 = this.LLILLJJLI.element;
        EnumC2188971Alj enumC2188971Alj = this.LLILLL.element;
        LinkMicLayoutDslContentCallback linkMicLayoutDslContentCallback = this.LLILZ;
        c2182601AbS.getClass();
        C2182601AbS.LIZIZ(c189200o6, enumC2188971Alj, linkMicLayoutDslContentCallback);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LinkMicLayoutStaticDataChannelProviderImpl@b9eb.getDslContent$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
