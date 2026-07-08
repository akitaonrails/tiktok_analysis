package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Vq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.startup.EditorProLoaderComponent$testDefaultDispatcher$1$1", f = "EditorProLoaderComponent.kt", l = {670}, m = "invokeSuspend")
public final class C1364405Vq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0ELA LLILLJJLI;
    public final /* synthetic */ EnumC1364705Vt LLILLL;
    public final /* synthetic */ C0ELH LLILZ;
    public final /* synthetic */ C0EL6 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1364405Vq(C0ELA c0ela, EnumC1364705Vt enumC1364705Vt, C0ELH c0elh, C0EL6 c0el6, InterfaceC1364105Vn<? super C1364405Vq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0ela;
        this.LLILLL = enumC1364705Vt;
        this.LLILZ = c0elh;
        this.LLILZIL = c0el6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1364405Vq(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProLoaderComponent@12f.testDefaultDispatcher$1$1");
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
            if (this.LLILLJJLI.LLJILJIL.getValue() != null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("EditorProLoaderComponent@12f.testDefaultDispatcher$1$1");
                return unit;
            }
            int i2 = C1364605Vs.LIZ[this.LLILLL.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    this.LLILLJJLI.Ew1(this.LLILZ, this.LLILZIL);
                    AnonymousClass0957<C0EHI> anonymousClass0957 = this.LLILLJJLI.LLJJIJI;
                    if (anonymousClass0957 != null) {
                        this.LL = 1;
                        obj = anonymousClass0957.LJLIIIL(this);
                        if (obj == objLJFF) {
                            C1C7U.LIZIZ("EditorProLoaderComponent@12f.testDefaultDispatcher$1$1");
                            return objLJFF;
                        }
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                this.LLILLJJLI.I11(this.LLILZ, this.LLILZIL);
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("EditorProLoaderComponent@12f.testDefaultDispatcher$1$1");
            return unit2;
        }
        C0EHI c0ehi = (C0EHI) obj;
        if (c0ehi != null) {
            this.LLILLJJLI.X1(c0ehi);
        }
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("EditorProLoaderComponent@12f.testDefaultDispatcher$1$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
