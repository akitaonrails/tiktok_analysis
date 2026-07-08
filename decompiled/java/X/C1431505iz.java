package X;

import com.ss.android.ugc.aweme.lemon8.Lemon8AnchorHelper;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05iz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.lemon.button.Lemon8BottomButtonConfigProvider$provideCustomEvents$1$1$invoke$2", f = "Lemon8BottomButtonConfigProvider.kt", l = {}, m = "invokeSuspend")
public final class C1431505iz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Map<String, Object> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1431505iz(Map<String, ? extends Object> map, InterfaceC1364105Vn<? super C1431505iz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1431505iz(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("Lemon8BottomButtonConfigProvider@ccaa.provideCustomEvents$1$1$invoke$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Map<String, Object> map = this.LL;
        Object obj2 = null;
        if (map != null) {
            obj2 = map.get("pid");
        }
        if (!(obj2 instanceof String) || (str = (String) obj2) == null) {
            str = "";
        }
        Lemon8AnchorHelper.LIZ.getClass();
        Lemon8AnchorHelper.LIZLLL(str);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Lemon8BottomButtonConfigProvider@ccaa.provideCustomEvents$1$1$invoke$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
