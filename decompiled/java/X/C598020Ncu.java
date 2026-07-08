package X;

import com.lynx.tasm.TemplateData;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ncu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.lynx.hybrid.LynxKitView$load$2$6", f = "LynxKitView.kt", l = {454}, m = "invokeSuspend")
public final class C598020Ncu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1537710q7N LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C1537710q7N LLILZ;
    public final /* synthetic */ Map<String, TemplateData> LLILZIL;
    public final /* synthetic */ AnonymousClass0957<TemplateData> LLILZLL;
    public final /* synthetic */ byte[] LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ long LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598020Ncu(C1537710q7N c1537710q7N, Map<String, TemplateData> map, AnonymousClass0957<TemplateData> anonymousClass0957, byte[] bArr, String str, long j, InterfaceC1364105Vn<? super C598020Ncu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c1537710q7N;
        this.LLILZIL = map;
        this.LLILZLL = anonymousClass0957;
        this.LLIZ = bArr;
        this.LLIZLLLIL = str;
        this.LLJ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C598020Ncu(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map<String, TemplateData> map;
        C1C7U.LIZ("LynxKitView@5201.load$2$6");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                map = (Map) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1537710q7N c1537710q7N = this.LLILZ;
            map = this.LLILZIL;
            AnonymousClass0957<TemplateData> anonymousClass0957 = this.LLILZLL;
            this.LL = c1537710q7N;
            this.LLILLJJLI = map;
            this.LLILLL = 1;
            obj = anonymousClass0957.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LynxKitView@5201.load$2$6");
                return objLJFF;
            }
        }
        C1537710q7N.LJIILLIIL((TemplateData) obj, map);
        this.LLILZ.LJJIIZ(this.LLIZ, this.LLILZIL, this.LLIZLLLIL, this.LLJ);
        this.LLILZ.LJIIZILJ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LynxKitView@5201.load$2$6");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
