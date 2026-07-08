package X;

import Y.AgS102S1100000_12;
import Y.AgS84S0110000_12;
import com.bytedance.android.live.broadcast.stablemode.ModuleDecision;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UcJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.broadcast.stablemode.LiveAnchorDowngradeBus$subscribeFeature$job$1", f = "LiveAnchorDowngradeBus.kt", l = {203}, m = "invokeSuspend")
public final class C776010UcJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function2<Boolean, ModuleDecision, Unit> LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C776010UcJ(String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn, Function2 function2, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = function2;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        String str = this.LLILLJJLI;
        boolean z = this.LLILLL;
        return new C776010UcJ(str, this.LLILZIL, interfaceC1364105Vn, this.LLILZ, z);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0UcK] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveAnchorDowngradeBus@2e07.subscribeFeature$job$1");
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
            final String str = this.LLILLJJLI;
            final ?? r1 = new InterfaceC346201Wa<ModuleDecision>() { // from class: X.0UcK
                @Override // X.InterfaceC346201Wa
                public final Object collect(InterfaceC346701Wf<? super ModuleDecision> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Object objCollect = c2252331DDr.collect(new AgS102S1100000_12(interfaceC346701Wf, str, 1), interfaceC1364105Vn);
                    if (objCollect == C099R.LJFF()) {
                        return objCollect;
                    }
                    return Unit.LIZ;
                }
            };
            final boolean z = this.LLILLL;
            InterfaceC346201Wa<ModuleDecision> interfaceC346201Wa = new InterfaceC346201Wa<ModuleDecision>() { // from class: X.0UcI
                @Override // X.InterfaceC346201Wa
                public final Object collect(InterfaceC346701Wf<? super ModuleDecision> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Object objCollect = r1.collect(new AgS84S0110000_12(interfaceC346701Wf, z, 0), interfaceC1364105Vn);
                    if (objCollect == C099R.LJFF()) {
                        return objCollect;
                    }
                    return Unit.LIZ;
                }
            };
            AgS102S1100000_12 agS102S1100000_12 = new AgS102S1100000_12(this.LLILZ, this.LLILZIL, 0);
            this.LL = 1;
            if (interfaceC346201Wa.collect(agS102S1100000_12, this) == objLJFF) {
                C1C7U.LIZIZ("LiveAnchorDowngradeBus@2e07.subscribeFeature$job$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveAnchorDowngradeBus@2e07.subscribeFeature$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
