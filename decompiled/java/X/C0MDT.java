package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MDT, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.ailive.AILivePhotoInnerRootComponent$applyAILive$2", f = "AILivePhotoInnerRootComponent.kt", l = {396}, m = "invokeSuspend")
public final class C0MDT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C564830MDh LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MDT(C564830MDh c564830MDh, boolean z, InterfaceC1364105Vn<? super C0MDT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c564830MDh;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MDT(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AILivePhotoInnerRootComponent@b484.applyAILive$2");
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
            InterfaceC23228098g interfaceC23228098gU5 = this.LLILLJJLI.U5();
            String str = this.LLILLJJLI.T2().LIZLLL;
            this.LL = 1;
            obj = interfaceC23228098gU5.z10(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AILivePhotoInnerRootComponent@b484.applyAILive$2");
                return objLJFF;
            }
        }
        C07XE c07xe = (C07XE) obj;
        if (c07xe instanceof C07XD) {
            this.LLILLJJLI.s7(((C07XD) c07xe).LIZ);
            this.LLILLJJLI.getEditModel().getAILivePhotoModel().pageDataCache.fallbackToOldModel = false;
        } else if (c07xe instanceof C07XF) {
            if (((C07XF) c07xe).LIZ) {
                String strLIZ = C274160Aoo.LIZ();
                if (strLIZ.length() > 0) {
                    this.LLILLJJLI.s7(strLIZ);
                }
                this.LLILLJJLI.getEditModel().getAILivePhotoModel().pageDataCache.fallbackToOldModel = true;
            } else {
                this.LLILLJJLI.getEditModel().getAILivePhotoModel().pageDataCache.fallbackToOldModel = null;
            }
        } else {
            throw new C1954807lC();
        }
        this.LLILLJJLI.o7(this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AILivePhotoInnerRootComponent@b484.applyAILive$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
