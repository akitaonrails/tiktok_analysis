package X;

import Y.AgS202S0200000_12;
import Y.AgS293S0100000_12;
import Y.AgS84S0110000_12;
import com.bytedance.android.live.broadcast.stablemode.ModuleDecision;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UcC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.broadcast.stablemode.LiveAnchorDowngradeBus$subscribeModule$1", f = "LiveAnchorDowngradeBus.kt", l = {227}, m = "invokeSuspend")
public final class C775940UcC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EnumC775910Uc9 LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function1<ModuleDecision, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C775940UcC(EnumC775910Uc9 enumC775910Uc9, boolean z, Function1<? super ModuleDecision, Unit> function1, InterfaceC1364105Vn<? super C775940UcC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = enumC775910Uc9;
        this.LLILLL = z;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C775940UcC(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0UcF] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveAnchorDowngradeBus@2e07.subscribeModule$1");
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
            final C2252331DDr c2252331DDr = C775900Uc8.LIZ;
            final EnumC775910Uc9 enumC775910Uc9 = this.LLILLJJLI;
            final ?? r1 = new InterfaceC346201Wa<ModuleDecision>() { // from class: X.0UcF
                @Override // X.InterfaceC346201Wa
                public final Object collect(InterfaceC346701Wf<? super ModuleDecision> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Object objCollect = c2252331DDr.collect(new AgS202S0200000_12(interfaceC346701Wf, enumC775910Uc9, 4), interfaceC1364105Vn);
                    if (objCollect == C099R.LJFF()) {
                        return objCollect;
                    }
                    return Unit.LIZ;
                }
            };
            final boolean z = this.LLILLL;
            InterfaceC346201Wa<ModuleDecision> interfaceC346201Wa = new InterfaceC346201Wa<ModuleDecision>() { // from class: X.0UcD
                @Override // X.InterfaceC346201Wa
                public final Object collect(InterfaceC346701Wf<? super ModuleDecision> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Object objCollect = r1.collect(new AgS84S0110000_12(interfaceC346701Wf, z, 1), interfaceC1364105Vn);
                    if (objCollect == C099R.LJFF()) {
                        return objCollect;
                    }
                    return Unit.LIZ;
                }
            };
            AgS293S0100000_12 agS293S0100000_12 = new AgS293S0100000_12(this.LLILZ, 36);
            this.LL = 1;
            if (interfaceC346201Wa.collect(agS293S0100000_12, this) == objLJFF) {
                C1C7U.LIZIZ("LiveAnchorDowngradeBus@2e07.subscribeModule$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveAnchorDowngradeBus@2e07.subscribeModule$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
