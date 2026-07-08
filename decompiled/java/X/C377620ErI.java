package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProAIGCTemplateModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ErI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.EditorProAIGCComponent$createPlaceholder$1$1", f = "EditorProAIGCComponent.kt", l = {}, m = "invokeSuspend")
public final class C377620ErI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C377590ErF LL;
    public final /* synthetic */ AIGCGenerationParam LLILLJJLI;
    public final /* synthetic */ C381540Exc LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ EditorProAIGCTemplateModel LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ Function0<Unit> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C377620ErI(C377590ErF c377590ErF, AIGCGenerationParam aIGCGenerationParam, C381540Exc c381540Exc, String str, String str2, EditorProAIGCTemplateModel editorProAIGCTemplateModel, String str3, boolean z, String str4, Function0<Unit> function0, InterfaceC1364105Vn<? super C377620ErI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c377590ErF;
        this.LLILLJJLI = aIGCGenerationParam;
        this.LLILLL = c381540Exc;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = editorProAIGCTemplateModel;
        this.LLIZ = str3;
        this.LLIZLLLIL = z;
        this.LLJ = str4;
        this.LLJI = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C377620ErI(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        String str;
        C1C7U.LIZ("EditorProAIGCComponent@c6d2.createPlaceholder$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C377590ErF c377590ErF = this.LL;
        AIGCGenerationParam aIGCGenerationParam = this.LLILLJJLI;
        EnumC381960EyI enumC381960EyIB3 = c377590ErF.B3(aIGCGenerationParam.mediaType);
        C381540Exc c381540Exc = this.LLILLL;
        if (c381540Exc != null) {
            i = c381540Exc.LJII;
        } else {
            i = 0;
        }
        if (c381540Exc == null || (str = c381540Exc.LJIJJLI) == null) {
            str = "";
        }
        c377590ErF.bJ0(aIGCGenerationParam, new C377660ErM(true, 0, enumC381960EyIB3, 0, 0, true, this.LLILZ, i, this.LLILZIL, str, 24), this.LL.d6(this.LLILLJJLI), this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ);
        Function0<Unit> function0 = this.LLJI;
        if (function0 != null) {
            function0.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditorProAIGCComponent@c6d2.createPlaceholder$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
