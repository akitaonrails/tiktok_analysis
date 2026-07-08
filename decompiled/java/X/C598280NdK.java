package X;

import com.lynx.tasm.TemplateBundle;
import com.lynx.tasm.TemplateData;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0NdK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.lynx.hybrid.lite.LiteLynxKitView$load$8$6", f = "LiteLynxKitView.kt", l = {1815}, m = "invokeSuspend")
public final class C598280NdK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1537720q7O LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C1537720q7O LLILZ;
    public final /* synthetic */ Map<String, TemplateData> LLILZIL;
    public final /* synthetic */ AnonymousClass0957<TemplateData> LLILZLL;
    public final /* synthetic */ byte[] LLIZ;
    public final /* synthetic */ TemplateBundle LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ long LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598280NdK(C1537720q7O c1537720q7O, Map<String, TemplateData> map, AnonymousClass0957<TemplateData> anonymousClass0957, byte[] bArr, TemplateBundle templateBundle, String str, long j, InterfaceC1364105Vn<? super C598280NdK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c1537720q7O;
        this.LLILZIL = map;
        this.LLILZLL = anonymousClass0957;
        this.LLIZ = bArr;
        this.LLIZLLLIL = templateBundle;
        this.LLJ = str;
        this.LLJI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C598280NdK(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        Map<String, TemplateData> map;
        C1C7U.LIZ("LiteLynxKitView@73dd.load$8$6");
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
            C1537720q7O c1537720q7O = this.LLILZ;
            map = this.LLILZIL;
            AnonymousClass0957<TemplateData> anonymousClass0957 = this.LLILZLL;
            this.LL = c1537720q7O;
            this.LLILLJJLI = map;
            this.LLILLL = 1;
            obj = anonymousClass0957.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiteLynxKitView@73dd.load$8$6");
                return objLJFF;
            }
        }
        C1537720q7O.LJIILLIIL((TemplateData) obj, map);
        this.LLILZ.LJJIJIL(this.LLIZ, this.LLIZLLLIL, this.LLILZIL, this.LLJ, this.LLJI);
        this.LLILZ.LJIIZILJ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiteLynxKitView@73dd.load$8$6");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
