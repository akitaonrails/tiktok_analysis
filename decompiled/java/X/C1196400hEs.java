package X;

import android.widget.PopupWindow;
import com.ss.android.ugc.aweme.poi.experiment.LsComplianceSceneConfig;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hEs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.compliance.PoiComplianceToastManager$awaitCheck$2", f = "PoiComplianceToastManager.kt", l = {}, m = "invokeSuspend")
public final class C1196400hEs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LsComplianceSceneConfig LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;
    public final /* synthetic */ Object LLILZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1196400hEs(LsComplianceSceneConfig lsComplianceSceneConfig, String str, Map<String, String> map, Object obj, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C1196400hEs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = lsComplianceSceneConfig;
        this.LLILLJJLI = str;
        this.LLILLL = map;
        this.LLILZ = obj;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1196400hEs(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiComplianceToastManager@7490.awaitCheck$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1196530hF5 c1196530hF5 = new C1196530hF5(this.LL.toastContent);
        Object obj2 = this.LLILZ;
        final Function1<Boolean, Unit> function1 = this.LLILZIL;
        c1196530hF5.LJJIIJZLJL(obj2);
        c1196530hF5.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: X.0hEt
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                Function1<Boolean, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(Boolean.TRUE);
                }
            }
        });
        c1196530hF5.show();
        C610220Nwa.LIZJ(null, this.LLILLJJLI, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiComplianceToastManager@7490.awaitCheck$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
