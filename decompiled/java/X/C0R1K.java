package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0R1K, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.util.SharePanelLayoutPreloader$preloadRes$1", f = "SharePanelLayoutPreloader.kt", l = {}, m = "invokeSuspend")
public final class C0R1K extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Activity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0R1K(Activity activity, InterfaceC1364105Vn<? super C0R1K> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0R1K(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SharePanelLayoutPreloader@3e71.preloadRes$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        do {
            arrayList.add(C2286608xc.LJ(R.layout.cpk));
            i2++;
        } while (i2 < 2);
        arrayList.add(C2286608xc.LJ(R.layout.cru));
        do {
            arrayList.add(C2286608xc.LJ(R.layout.cn0));
            i++;
        } while (i < 6);
        arrayList.add(C2286608xc.LJ(R.layout.crw));
        Activity activity = this.LL;
        if (activity != null && !C0R1H.LIZ(activity)) {
            C21146717pB.LJI(activity, arrayList);
        }
        C910820ZoG.LIZ.getClass();
        C910820ZoG.LIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SharePanelLayoutPreloader@3e71.preloadRes$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
