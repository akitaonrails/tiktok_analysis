package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nug, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.helper.SessionListPreloadHelper$defaultPreloadRefactorVH$1", f = "SessionListPreloadHelper.kt", l = {}, m = "invokeSuspend")
public final class C609040Nug extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1387200mCc LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C609040Nug(AbstractC1387200mCc abstractC1387200mCc, InterfaceC1364105Vn<? super C609040Nug> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1387200mCc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C609040Nug(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        LifecycleOwner lifecycleOwnerLJFF;
        Lifecycle lifecycle;
        C1C7U.LIZ("SessionListPreloadHelper@4a7b.defaultPreloadRefactorVH$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC1387200mCc abstractC1387200mCc = this.LL;
        if (abstractC1387200mCc != null && (lifecycleOwnerLJFF = abstractC1387200mCc.LJFF()) != null && (lifecycle = lifecycleOwnerLJFF.getLifecycle()) != null) {
            C506101y7.LIZ(lifecycle, new Runnable() { // from class: X.0Nuh
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SessionListPreloadHelper@4a7b.defaultPreloadRefactorVH$1$1");
                    try {
                        C888590YtV.LJFF.clear();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SessionListPreloadHelper@4a7b.defaultPreloadRefactorVH$1$1");
                }
            });
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SessionListPreloadHelper@4a7b.defaultPreloadRefactorVH$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
