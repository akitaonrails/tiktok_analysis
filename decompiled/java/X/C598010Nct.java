package X;

import com.lynx.tasm.TemplateData;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.lynx.hybrid.LynxKitView$load$2$7", f = "LynxKitView.kt", l = {463}, m = "invokeSuspend")
public final class C598010Nct extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass0957<TemplateData> LLILLJJLI;
    public final /* synthetic */ C1537710q7N LLILLL;
    public final /* synthetic */ Map<String, TemplateData> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598010Nct(AnonymousClass0957<TemplateData> anonymousClass0957, C1537710q7N c1537710q7N, Map<String, TemplateData> map, InterfaceC1364105Vn<? super C598010Nct> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass0957;
        this.LLILLL = c1537710q7N;
        this.LLILZ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C598010Nct(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LynxKitView@5201.load$2$7");
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
            AnonymousClass0957<TemplateData> anonymousClass0957 = this.LLILLJJLI;
            this.LL = 1;
            obj = anonymousClass0957.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LynxKitView@5201.load$2$7");
                return objLJFF;
            }
        }
        TemplateData templateData = (TemplateData) obj;
        if (templateData != null) {
            Map<String, TemplateData> map = this.LLILZ;
            C1537710q7N c1537710q7N = this.LLILLL;
            map.clear();
            C1537710q7N.LJIILLIIL(templateData, map);
            Iterator it2 = ((LinkedHashMap) c1537710q7N.LLJI).values().iterator();
            while (it2.hasNext()) {
                C1537710q7N.LJIILLIIL((TemplateData) it2.next(), map);
            }
            for (TemplateData templateData2 : map.values()) {
                templateData2.LJ = true;
                super/*com.lynx.tasm.LynxView*/.updateData(templateData2);
            }
        }
        this.LLILLL.LJIIZILJ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LynxKitView@5201.load$2$7");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
