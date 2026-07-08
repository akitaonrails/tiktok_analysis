package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.subscription.mainactivityassem.PGCSubsMainActivityAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS198S0000000_11;
import njp.a;

/* JADX INFO: renamed from: X.0SBO, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.mainactivityassem.PGCSubsMainActivityAssem$onCreate$1", f = "PGCSubsMainActivityAssem.kt", l = {}, m = "invokeSuspend")
public final class C0SBO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PGCSubsMainActivityAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SBO(PGCSubsMainActivityAssem pGCSubsMainActivityAssem, InterfaceC1364105Vn<? super C0SBO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = pGCSubsMainActivityAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0SBO(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PGCSubsMainActivityAssem@5293.onCreate$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.bo().LIZJ(new C717120SBa());
        this.LL.bo().LIZJ(new C717140SBc());
        this.LL.bo().LIZJ(new C717130SBb());
        this.LL.bo().LJIIIZ(new C0S8V() { // from class: X.0SBQ
            public final C01GW LIZJ = C452501pT.LIZIZ(new C0SBP());

            @Override // X.C0S8V
            public final C0SBU LIZIZ() {
                return new C0SBU("sov_hotswap");
            }

            @Override // X.C0S8V
            public final boolean LIZJ(Aweme aweme) {
                if (!((C0K77) this.LIZJ.getValue()).LJJIJIIJIL(aweme) && !((C0K77) this.LIZJ.getValue()).LJIL(aweme)) {
                    return false;
                }
                return true;
            }
        });
        this.LL.bo().LJIIIZ(new C0S8V() { // from class: X.0SBS
            public final C01GW LIZJ = C452501pT.LIZIZ(new C0SBT());

            @Override // X.C0S8V
            public final C0SBU LIZIZ() {
                return new C0SBU("sop_hotswap");
            }

            @Override // X.C0S8V
            public final boolean LIZJ(Aweme aweme) {
                return ((C0K77) this.LIZJ.getValue()).LJJJJZI(aweme);
            }
        });
        this.LL.bo().LJIIIZ(new C0S8V() { // from class: X.0SBR
            public final C01GW LIZJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(512));

            @Override // X.C0S8V
            public final C0SBU LIZIZ() {
                return new C0SBU("sov_hotswap");
            }

            @Override // X.C0S8V
            public final boolean LIZJ(Aweme aweme) {
                C0K77 c0k77 = (C0K77) this.LIZJ.getValue();
                if (c0k77 == null || !c0k77.LJJIIZI(aweme)) {
                    return false;
                }
                return true;
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PGCSubsMainActivityAssem@5293.onCreate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
