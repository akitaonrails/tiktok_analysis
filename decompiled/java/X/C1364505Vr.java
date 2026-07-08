package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Vr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.startup.EditorProLoaderComponent$startWithoutNotify$2", f = "EditorProLoaderComponent.kt", l = {443}, m = "invokeSuspend")
public final class C1364505Vr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0ELA LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1364505Vr(C0ELA c0ela, InterfaceC1364105Vn<? super C1364505Vr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0ela;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1364505Vr(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProLoaderComponent@12f.startWithoutNotify$2");
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
            AnonymousClass0957<C0EHI> anonymousClass0957 = this.LLILLJJLI.LLJJIJI;
            if (anonymousClass0957 != null) {
                this.LL = 1;
                obj = anonymousClass0957.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("EditorProLoaderComponent@12f.startWithoutNotify$2");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EditorProLoaderComponent@12f.startWithoutNotify$2");
            return unit;
        }
        C0EHI c0ehi = (C0EHI) obj;
        if (c0ehi != null) {
            this.LLILLJJLI.X1(c0ehi);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EditorProLoaderComponent@12f.startWithoutNotify$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
