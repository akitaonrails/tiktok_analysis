package X;

import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.gamora.editorpro.creationflow.scheme.EditorProSchemeLoadingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09on, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.creationflow.scheme.EditorProSchemeLoadingActivity$goEPAI$1$1", f = "EditorProSchemeLoadingActivity.kt", l = {}, m = "invokeSuspend")
public final class C2486709on extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EditorProSchemeLoadingActivity LL;
    public final /* synthetic */ C259800zU<String> LLILLJJLI;
    public final /* synthetic */ CreativeInfo LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2486709on(CreativeInfo creativeInfo, EditorProSchemeLoadingActivity editorProSchemeLoadingActivity, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn, C259800zU c259800zU) {
        super(2, interfaceC1364105Vn);
        this.LL = editorProSchemeLoadingActivity;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = creativeInfo;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2486709on(this.LLILLL, this.LL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn, this.LLILLJJLI);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProSchemeLoadingActivity@b8d8.goEPAI$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.isFinishing()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EditorProSchemeLoadingActivity@b8d8.goEPAI$1$1");
            return unit;
        }
        if (this.LLILLJJLI.element.length() == 0) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("EditorProSchemeLoadingActivity@b8d8.goEPAI$1$1");
            return unit2;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LL, "//openVideoEdit");
        smartRouteBuildRoute.withParam("media_path", this.LLILLJJLI.element);
        smartRouteBuildRoute.withParam("shoot_way", "ep_ai_link");
        smartRouteBuildRoute.withParam("creation_id", this.LLILLL.getCreationId());
        smartRouteBuildRoute.withParam("ep_ai_enter_source", this.LLILZ);
        smartRouteBuildRoute.withParam("ep_ai_scene", this.LLILZIL);
        smartRouteBuildRoute.open();
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("EditorProSchemeLoadingActivity@b8d8.goEPAI$1$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
