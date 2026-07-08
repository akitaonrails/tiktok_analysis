package X;

import android.app.Activity;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Nh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.customize.AIPortraitCustomizeScene$CustomizeRoot$1$1", f = "AIPortraitCustomizeScene.kt", l = {}, m = "invokeSuspend")
public final class C1597506Nh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1686850tzv LL;
    public final /* synthetic */ C05P1<Long> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1597506Nh(C1686850tzv c1686850tzv, C05P1<Long> c05p1, InterfaceC1364105Vn<? super C1597506Nh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1686850tzv;
        this.LLILLJJLI = c05p1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1597506Nh(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Context sceneContext;
        Activity activityLIZ;
        C1C7U.LIZ("AIPortraitCustomizeScene@421b.CustomizeRoot$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LLILLJJLI.getValue().longValue() > 0 && (sceneContext = this.LL.getSceneContext()) != null && (activityLIZ = C06MM.LIZ(sceneContext)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(2131825778);
            c1389890mGx.LJIIJJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIPortraitCustomizeScene@421b.CustomizeRoot$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
