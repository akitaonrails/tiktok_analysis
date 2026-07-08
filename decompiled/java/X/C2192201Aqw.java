package X;

import com.ss.android.ugc.aweme.minis.page.main.fragment.MiniGameFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1Aqw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.page.main.fragment.MiniGameFragment$loadDebugGame$1$onSuccess$coreJs$1", f = "MiniGameFragment.kt", l = {3185}, m = "invokeSuspend")
public final class C2192201Aqw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ MiniGameFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2192201Aqw(MiniGameFragment miniGameFragment, InterfaceC1364105Vn<? super C2192201Aqw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = miniGameFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2192201Aqw(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("MiniGameFragment@6eb9.loadDebugGame$1$onSuccess$coreJs$1");
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
            final C099F c099fLIZIZ = C090F.LIZIZ();
            C09ZS c09zs = C09ZS.LIZ;
            final MiniGameFragment miniGameFragment = this.LLILLJJLI;
            C09ZV c09zv = new C09ZV() { // from class: X.1Aqx
                @Override // X.C09ZV
                public final void LIZ(String str) {
                    c099fLIZIZ.LJIIZILJ(str);
                }

                @Override // X.C09ZV
                public final void LIZIZ(String str) {
                    miniGameFragment.VT(str);
                }
            };
            c09zs.getClass();
            C09ZS.LJ(c09zv);
            this.LL = 1;
            obj = c099fLIZIZ.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MiniGameFragment@6eb9.loadDebugGame$1$onSuccess$coreJs$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MiniGameFragment@6eb9.loadDebugGame$1$onSuccess$coreJs$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
