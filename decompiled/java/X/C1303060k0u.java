package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.FullDsl;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0k0u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.linkcore.dsl.LiveDslManagerV2$handleIO$1", f = "LiveDslManagerV2.kt", l = {317, 325}, m = "invokeSuspend")
public final class C1303060k0u extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1303170k15 LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1303060k0u(C1303170k15 c1303170k15, String str, Function0<Unit> function0, InterfaceC1364105Vn<? super C1303060k0u> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1303170k15;
        this.LLILZ = str;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1303060k0u(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException, IOException {
        Object c098200Yq;
        String str;
        C1C7U.LIZ("LiveDslManagerV2@f6ff.handleIO$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        boolean z = true;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLL.getClass();
            C1AZW.LJFF(C1303170k15.LJII(187), "GsonHelper.get().fromJson FAILED", th.getMessage(), null);
            this.LLILLL.getClass();
            String strLJII = C1303170k15.LJII(316);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dslSource:");
            sbLIZ.append(this.LLILLL.LIZ);
            sbLIZ.append(", dslString:");
            sbLIZ.append(str);
            C1AZW.LJFF(strLJII, C2188811AlT.LIZIZ(sbLIZ), null, null);
            if (this.LLILLL.LIZ != EnumC1154700g9c.LOCAL) {
                z = false;
            }
            C1303200k18.LIZJ(z, 10002, th.toString());
            C1CC2.LIZ("LinkMic DSL deserialized exception occurs.", th);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1439305kF c1439305kF = new C1439305kF(this.LLILZIL, null);
            this.LL = null;
            this.LLILLJJLI = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c1439305kF) == objLJFF) {
                C1C7U.LIZIZ("LiveDslManagerV2@f6ff.handleIO$1");
                return objLJFF;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LiveDslManagerV2@f6ff.handleIO$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("handle IO ");
            sbLIZ2.append(C786410Ut5.u3().getName());
            C20441214yg.LJIIIZ("LiveDslManagerV2", C2188811AlT.LIZIZ(sbLIZ2));
            C1303170k15 c1303170k15 = this.LLILLL;
            String str2 = this.LLILZ;
            if (!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
                try {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(str2);
                    sbLIZ3.append("_handleIO-309");
                    c098200Yq = c1303170k15.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
            } else {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(str2);
                sbLIZ4.append("_handleIO-309");
                c098200Yq = c1303170k15.LIZIZ(C2188811AlT.LIZIZ(sbLIZ4));
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            str = (String) c098200Yq;
            FullDsl fullDsl = (FullDsl) C19748512Ol.LIZIZ.LJII(str, FullDsl.class);
            if (fullDsl != null) {
                this.LLILLL.LIZLLL(fullDsl);
            }
            C1DFH c1dfh2 = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
            C1439205kE c1439205kE = new C1439205kE(this.LLILZIL, null);
            this.LL = str;
            this.LLILLJJLI = 1;
            obj = C23250099c.LJI(this, abstractC2238408pq2, c1439205kE);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiveDslManagerV2@f6ff.handleIO$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LiveDslManagerV2@f6ff.handleIO$1");
        return unit2;
    }
}
