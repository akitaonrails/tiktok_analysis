package X;

import com.ss.android.ugc.aweme.creative.model.edit.mixediting.TemplateMobParams;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mqr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.ui.MaterialSelectionDelegate$clearAllMaterialInternal$1$4", f = "MaterialSelectionDelegate.kt", l = {364}, m = "invokeSuspend")
public final class C1412150mqr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C1412800mru LLILLL;
    public final /* synthetic */ C1414130mu3 LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;
    public final /* synthetic */ TemplateMobParams LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1412150mqr(int i, C1412800mru c1412800mru, C1414130mu3 c1414130mu3, String str, Map<String, String> map, TemplateMobParams templateMobParams, boolean z, InterfaceC1364105Vn<? super C1412150mqr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = c1412800mru;
        this.LLILZ = c1414130mu3;
        this.LLILZIL = str;
        this.LLILZLL = map;
        this.LLIZ = templateMobParams;
        this.LLIZLLLIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1412150mqr(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        C1C7U.LIZ("MaterialSelectionDelegate@8b8c.clearAllMaterialInternal$1$4");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
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
            if (this.LLIZLLLIL) {
                i = 1;
            } else {
                i = 2;
            }
            this.LL = 1;
            Object objLJI = C23250099c.LJI(this, C0PEM.LIZ, new C1412190mqv(i, templateMobParams, c1412200mqw, str, map, null));
            if (objLJI != C099R.LJFF()) {
                objLJI = Unit.LIZ;
            }
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("MaterialSelectionDelegate@8b8c.clearAllMaterialInternal$1$4");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MaterialSelectionDelegate@8b8c.clearAllMaterialInternal$1$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
