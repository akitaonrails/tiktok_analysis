package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.gamora.editorpro.creationflow.scheme.EditorProSchemeLoadingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09om, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.creationflow.scheme.EditorProSchemeLoadingActivity$goEPAI$1", f = "EditorProSchemeLoadingActivity.kt", l = {61}, m = "invokeSuspend")
public final class C2486609om extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C259800zU<String> LLILLJJLI;
    public final /* synthetic */ EditorProSchemeLoadingActivity LLILLL;
    public final /* synthetic */ CreativeInfo LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2486609om(CreativeInfo creativeInfo, EditorProSchemeLoadingActivity editorProSchemeLoadingActivity, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn, C259800zU c259800zU) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c259800zU;
        this.LLILLL = editorProSchemeLoadingActivity;
        this.LLILZ = creativeInfo;
        this.LLILZIL = str;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C259800zU<String> c259800zU = this.LLILLJJLI;
        return new C2486609om(this.LLILZ, this.LLILLL, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn, c259800zU);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProSchemeLoadingActivity@b8d8.goEPAI$1");
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
            C259800zU<String> c259800zU = this.LLILLJJLI;
            EditorProSchemeLoadingActivity editorProSchemeLoadingActivity = this.LLILLL;
            CreativeInfo creativeInfo = this.LLILZ;
            editorProSchemeLoadingActivity.getClass();
            InterfaceC570310MYj pathService = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
            EnumC20228214Cy enumC20228214Cy = EnumC20228214Cy.EDITOR_PRO_AIGC;
            String strLJIILJJIL = pathService.LJIILJJIL(creativeInfo, enumC20228214Cy, "grey_editor_bg.png", false);
            boolean zLIZJ = C2286708xd.LIZJ(strLJIILJJIL);
            T tLIZJ = strLJIILJJIL;
            if (!zLIZJ) {
                C2486309oj.LIZ.getClass();
                tLIZJ = C2486309oj.LIZJ(C2486309oj.LIZ(720, 1280), C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZJ(creativeInfo, enumC20228214Cy, "grey_editor_bg.png", true));
            }
            if (tLIZJ == 0) {
                tLIZJ = "";
            }
            c259800zU.element = tLIZJ;
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C2486709on c2486709on = new C2486709on(this.LLILZ, this.LLILLL, this.LLILZIL, this.LLILZLL, null, this.LLILLJJLI);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c2486709on) == objLJFF) {
                C1C7U.LIZIZ("EditorProSchemeLoadingActivity@b8d8.goEPAI$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditorProSchemeLoadingActivity@b8d8.goEPAI$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
