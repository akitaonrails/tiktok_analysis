package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Vp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.startup.EditorProLoaderComponent$startWithoutNotify$1", f = "EditorProLoaderComponent.kt", l = {439}, m = "invokeSuspend")
public final class C1364305Vp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0EHI>, Object> {
    public int LL;
    public final /* synthetic */ C0ELA LLILLJJLI;
    public final /* synthetic */ C0ELH LLILLL;
    public final /* synthetic */ C0EL6 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1364305Vp(C0ELA c0ela, C0ELH c0elh, C0EL6 c0el6, InterfaceC1364105Vn<? super C1364305Vp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0ela;
        this.LLILLL = c0elh;
        this.LLILZ = c0el6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1364305Vp(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProLoaderComponent@12f.startWithoutNotify$1");
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
            C0ELA c0ela = this.LLILLJJLI;
            C0ELH c0elh = this.LLILLL;
            C0EL6 c0el6 = this.LLILZ;
            this.LL = 1;
            obj = c0ela.c3(c0elh, c0el6, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EditorProLoaderComponent@12f.startWithoutNotify$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("EditorProLoaderComponent@12f.startWithoutNotify$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0EHI> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
