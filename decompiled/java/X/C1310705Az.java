package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.texttoimage.Text2ImageApiResp;
import com.ss.android.ugc.aweme.texttoimage.Text2ImageGenerator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Az, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.Text2ImageGenerator$startResourceListPrefetch$1", f = "Text2ImageGenerator.kt", l = {261}, m = "invokeSuspend")
public final class C1310705Az extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Text2ImageApiResp>, Object> {
    public int LL;
    public final /* synthetic */ Text2ImageGenerator LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ Function0<Unit> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1310705Az(Text2ImageGenerator text2ImageGenerator, String str, String str2, String str3, boolean z, boolean z2, String str4, boolean z3, Function0<Unit> function0, InterfaceC1364105Vn<? super C1310705Az> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = text2ImageGenerator;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = z;
        this.LLIZ = z2;
        this.LLIZLLLIL = str4;
        this.LLJ = z3;
        this.LLJI = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1310705Az(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Text2ImageGenerator@4a7d.startResourceListPrefetch$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                Text2ImageGenerator text2ImageGenerator = this.LLILLJJLI;
                String str = this.LLILLL;
                String str2 = this.LLILZ;
                String str3 = this.LLILZIL;
                boolean z = this.LLILZLL;
                boolean z2 = this.LLIZ;
                String str4 = this.LLIZLLLIL;
                boolean z3 = this.LLJ;
                this.LL = 1;
                text2ImageGenerator.getClass();
                obj = C23250099c.LJI(this, C0PEM.LIZJ, new C064O(text2ImageGenerator, str, str2, str3, z, z2, str4, z3, null));
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("Text2ImageGenerator@4a7d.startResourceListPrefetch$1");
                    return objLJFF;
                }
            }
            Text2ImageApiResp text2ImageApiResp = (Text2ImageApiResp) obj;
            this.LLJI.invoke();
            C1C7U.LIZIZ("Text2ImageGenerator@4a7d.startResourceListPrefetch$1");
            return text2ImageApiResp;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJI.invoke();
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Text2ImageApiResp> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
