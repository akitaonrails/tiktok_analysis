package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.share.QuickShareAIInfo;
import com.ss.android.ugc.aweme.base.share.QuickShareCandidate;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.065H, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareRateStore$recordQuickShareInformation$1", f = "QuickShareRateStore.kt", l = {}, m = "invokeSuspend")
public final class C065H extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ double LLILLJJLI;
    public final /* synthetic */ QuickShareCandidate LLILLL;
    public final /* synthetic */ QuickShareAIInfo LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C065H(String str, double d, QuickShareCandidate quickShareCandidate, QuickShareAIInfo quickShareAIInfo, InterfaceC1364105Vn<? super C065H> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = d;
        this.LLILLL = quickShareCandidate;
        this.LLILZ = quickShareAIInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C065H(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String strOptString;
        C1C7U.LIZ("QuickShareRateStore@2cf5.recordQuickShareInformation$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C065M.LIZJ();
        C065M.LJII = C065M.LIZ(C065M.LJFF, C065M.LJII, this.LL, this.LLILLJJLI);
        AnonymousClass0956 anonymousClass0956 = C065M.LJIIIZ;
        if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C065M.LJIIIZ = C23250099c.LIZLLL(C065M.LIZJ, C065M.LIZ, null, new C065J(null), 2);
        }
        QuickShareCandidate quickShareCandidate = this.LLILLL;
        if (quickShareCandidate == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("QuickShareRateStore@2cf5.recordQuickShareInformation$1");
            return unit;
        }
        String str = quickShareCandidate.extraInfo;
        if (str != null && str.length() != 0) {
            try {
                strOptString = new JSONObject(str).optString("strategy_type", null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("parseStrategyType failed: ");
                sbLIZ.append(e);
                C1720006oQ.LIZIZ("QuickShareRateStore", C2188811AlT.LIZIZ(sbLIZ));
                strOptString = null;
            }
        } else {
            strOptString = null;
        }
        if (C065Q.LIZ(strOptString)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("recordQuickShareInformation: strategyType=");
            sbLIZ2.append(strOptString);
            sbLIZ2.append(" in blocklist, skip rateScore");
            C2188811AlT.LIZIZ(sbLIZ2);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("QuickShareRateStore@2cf5.recordQuickShareInformation$1");
            return unit2;
        }
        if (!Intrinsics.LJFF(this.LLILZ.showByCandidateScore, "1")) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("recordQuickShareInformation: showByCandidateScore=");
            sbLIZ3.append(this.LLILZ.showByCandidateScore);
            sbLIZ3.append(" not \"1\", skip rateScore itemId=");
            sbLIZ3.append(this.LL);
            C2188811AlT.LIZIZ(sbLIZ3);
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("QuickShareRateStore@2cf5.recordQuickShareInformation$1");
            return unit3;
        }
        Double d = this.LLILLL.rateScore;
        if (d != null) {
            C065M.LJIIIIZZ = C065M.LIZ(C065M.LJI, C065M.LJIIIIZZ, this.LL, d.doubleValue());
            AnonymousClass0956 anonymousClass09562 = C065M.LJIIJ;
            if (anonymousClass09562 == null || !anonymousClass09562.isActive()) {
                C065M.LJIIJ = C23250099c.LIZLLL(C065M.LIZJ, C065M.LIZ, null, new C065I(null), 2);
            }
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("QuickShareRateStore@2cf5.recordQuickShareInformation$1");
            return unit4;
        }
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("QuickShareRateStore@2cf5.recordQuickShareInformation$1");
        return unit5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
