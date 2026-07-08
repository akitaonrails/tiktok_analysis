package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutDslContentCallback;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLayoutLayerQosMonitor;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uQL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.linkcore.layout.access.LinkMicLayoutStaticDataChannelProviderImpl$getDslContent$2", f = "LinkMicLayoutStaticDataChannelProviderImpl.kt", l = {132}, m = "invokeSuspend")
public final class C1703230uQL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ AbstractC2252651DEx LLILLL;
    public final /* synthetic */ C2182601AbS LLILZ;
    public final /* synthetic */ LinkMicLayoutDslContentCallback LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1703230uQL(String str, AbstractC2252651DEx abstractC2252651DEx, C2182601AbS c2182601AbS, LinkMicLayoutDslContentCallback linkMicLayoutDslContentCallback, InterfaceC1364105Vn<? super C1703230uQL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = abstractC2252651DEx;
        this.LLILZ = c2182601AbS;
        this.LLILZIL = linkMicLayoutDslContentCallback;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1703230uQL(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, X.1Alj] */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, X.1Alj] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Object] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws IOException {
        C1C7U.LIZ("LinkMicLayoutStaticDataChannelProviderImpl@b9eb.getDslContent$2");
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
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getDslContent, start read from remote, layoutKey: ");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(", ctx:");
            sbLIZ.append(this.LLILLL);
            C20441214yg.LJIIIZ("LinkMicLayoutStaticDataChannelProvider", C2188811AlT.LIZIZ(sbLIZ));
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = EnumC2188971Alj.Gecko;
            C259800zU c259800zU2 = new C259800zU();
            ?? LJ = this.LLILZ.LJ(this.LLILLJJLI);
            c259800zU2.element = LJ;
            if (C189200o6.m7isFailureimpl(LJ)) {
                if (LinkMicLayoutLayerQosMonitor.INSTANCE.isEnable()) {
                    this.LLILZ.LJFF();
                }
                C2182601AbS c2182601AbS = this.LLILZ;
                String str = this.LLILLJJLI;
                c2182601AbS.getClass();
                c259800zU2.element = C2182601AbS.LIZLLL(str);
                c259800zU.element = EnumC2188971Alj.Local;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1703220uQK c1703220uQK = new C1703220uQK(this.LLILZ, c259800zU2, c259800zU, this.LLILZIL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c1703220uQK) == objLJFF) {
                C1C7U.LIZIZ("LinkMicLayoutStaticDataChannelProviderImpl@b9eb.getDslContent$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LinkMicLayoutStaticDataChannelProviderImpl@b9eb.getDslContent$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
