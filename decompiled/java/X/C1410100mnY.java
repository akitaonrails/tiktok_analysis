package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mnY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editorpro.adddrafts.AddDraftsComponent$loadLatestData$1", f = "AddDraftsComponent.kt", l = {106, 118}, m = "invokeSuspend")
public final class C1410100mnY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0M4M LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1410170mnf LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410100mnY(C1410170mnf c1410170mnf, int i, InterfaceC1364105Vn<? super C1410100mnY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c1410170mnf;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1410100mnY c1410100mnY = new C1410100mnY(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1410100mnY.LLILLL = obj;
        return c1410100mnY;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C0M4M c0m4m;
        C1C7U.LIZ("AddDraftsComponent@623d.loadLatestData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AddDraftsComponent@623d.loadLatestData$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0m4m = this.LL;
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLL;
            c0m4m = new C0M4M(false, false, EnumC562220M3g.NORMAL, (C562260M3k) null, 27);
            C099G c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1410120mna(this.LLILZ, c0m4m, null), 3);
            this.LLILLL = interfaceC497601wk;
            this.LL = c0m4m;
            this.LLILLJJLI = 1;
            if (c099gLIZIZ.LJLIIIL(this) == objLJFF) {
                C1C7U.LIZIZ("AddDraftsComponent@623d.loadLatestData$1");
                return objLJFF;
            }
        }
        C099G c099gLIZIZ2 = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1410110mnZ(this.LLILZ, c0m4m, this.LLILZIL, null), 3);
        this.LLILLL = null;
        this.LL = null;
        this.LLILLJJLI = 2;
        if (c099gLIZIZ2.LJLIIIL(this) == objLJFF) {
            C1C7U.LIZIZ("AddDraftsComponent@623d.loadLatestData$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AddDraftsComponent@623d.loadLatestData$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
