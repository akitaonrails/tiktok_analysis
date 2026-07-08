package X;

import androidx.lifecycle.MutableLiveData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Vy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.startup.EditorProLoaderComponent$startLoad$1$2", f = "EditorProLoaderComponent.kt", l = {}, m = "invokeSuspend")
public final class C1365205Vy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0ELA LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1365205Vy(C0ELA c0ela, InterfaceC1364105Vn<? super C1365205Vy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0ela;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1365205Vy(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProLoaderComponent@12f.startLoad$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        MutableLiveData<Unit> mutableLiveData = this.LL.LLJILLL;
        Unit unit = Unit.LIZ;
        mutableLiveData.setValue(unit);
        C0ELA c0ela = this.LL;
        c0ela.LLJILJILJ = c0ela.LLJILJIL.getValue();
        C1C7U.LIZIZ("EditorProLoaderComponent@12f.startLoad$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
