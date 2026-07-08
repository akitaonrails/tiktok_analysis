package X;

import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ORI, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.BulletinGeckoManager$enterInboxAndCheck$1", f = "BulletinGeckoManager.kt", l = {}, m = "invokeSuspend")
public final class C0ORI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LifecycleCoroutineScope LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ORI(LifecycleCoroutineScope lifecycleCoroutineScope, Context context, InterfaceC1364105Vn<? super C0ORI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = lifecycleCoroutineScope;
        this.LLILLJJLI = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ORI(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinGeckoManager@3a47.enterInboxAndCheck$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C620010OTn.LIZ.getClass();
        C0ORH c0orhLIZIZ = C620010OTn.LIZIZ();
        boolean z = !c0orhLIZIZ.LIZIZ;
        boolean z2 = !C620010OTn.LIZIZ;
        if (!z && !z2) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("BulletinGeckoManager@3a47.enterInboxAndCheck$1");
            return unit;
        }
        C620010OTn.LIZ(c0orhLIZIZ, z, z2, this.LL, this.LLILLJJLI);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BulletinGeckoManager@3a47.enterInboxAndCheck$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
