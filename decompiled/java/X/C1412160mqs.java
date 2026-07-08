package X;

import com.ss.android.ugc.aweme.creative.model.edit.mixediting.TemplateMobParams;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mqs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.ui.MaterialSelectionDelegate$clearAllMaterialInternal$1$2", f = "MaterialSelectionDelegate.kt", l = {311}, m = "invokeSuspend")
public final class C1412160mqs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C1412800mru LLILLL;
    public final /* synthetic */ C1414130mu3 LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;
    public final /* synthetic */ TemplateMobParams LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1412160mqs(int i, C1412800mru c1412800mru, C1414130mu3 c1414130mu3, String str, Map<String, String> map, TemplateMobParams templateMobParams, InterfaceC1364105Vn<? super C1412160mqs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = c1412800mru;
        this.LLILZ = c1414130mu3;
        this.LLILZIL = str;
        this.LLILZLL = map;
        this.LLIZ = templateMobParams;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1412160mqs(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MaterialSelectionDelegate@8b8c.clearAllMaterialInternal$1$2");
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
            C1412200mqw c1412200mqw = new C1412200mqw(this.LLILLJJLI, this.LLILLL, this.LLILZ.LLJJJJ);
            String str = this.LLILZIL;
            Map<String, String> map = this.LLILZLL;
            TemplateMobParams templateMobParams = this.LLIZ;
            this.LL = 1;
            if (C1412250mr1.LJFF(c1412200mqw, str, map, templateMobParams, this) == objLJFF) {
                C1C7U.LIZIZ("MaterialSelectionDelegate@8b8c.clearAllMaterialInternal$1$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MaterialSelectionDelegate@8b8c.clearAllMaterialInternal$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
