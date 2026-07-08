package X;

import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Vz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.startup.EditorProLoaderComponent$startLoad$1$1", f = "EditorProLoaderComponent.kt", l = {}, m = "invokeSuspend")
public final class C1365305Vz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0EHI LL;
    public final /* synthetic */ C0ELA LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1365305Vz(C0EHI c0ehi, C0ELA c0ela, InterfaceC1364105Vn<? super C1365305Vz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0ehi;
        this.LLILLJJLI = c0ela;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1365305Vz(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProLoaderComponent@12f.startLoad$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EditModelProvider.Companion.getClass();
        C0E1T.LIZ().setEditModel(this.LL.LIZ.LIZ);
        this.LLILLJJLI.LLJILJIL.setValue(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditorProLoaderComponent@12f.startLoad$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
