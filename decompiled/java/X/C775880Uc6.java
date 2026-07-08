package X;

import com.bytedance.android.live.broadcast.stablemode.DowngradeDecision;
import com.bytedance.android.live.broadcast.stablemode.DowngradeInfo;
import com.bytedance.android.live.broadcast.stablemode.ModuleDecision;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Uc6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.broadcast.stablemode.LiveAnchorDowngradeBus$post$1", f = "LiveAnchorDowngradeBus.kt", l = {}, m = "invokeSuspend")
public final class C775880Uc6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ DowngradeDecision LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C775880Uc6(DowngradeDecision downgradeDecision, InterfaceC1364105Vn<? super C775880Uc6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = downgradeDecision;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C775880Uc6 c775880Uc6 = new C775880Uc6(this.LLILLJJLI, interfaceC1364105Vn);
        c775880Uc6.LL = obj;
        return c775880Uc6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String strLJJLIIIJ;
        String str5;
        DowngradeDecision downgradeDecision;
        Object c098200Yq;
        List<Float> list;
        InterfaceC1631620sYq<? super Boolean, ? super EnumC775860Uc4, ? super EnumC775860Uc4, Unit> interfaceC1631620sYq;
        EnumC775890Uc7 enumC775890Uc7;
        DowngradeInfo downgradeInfo;
        C1C7U.LIZ("LiveAnchorDowngradeBus@2e07.post$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        DowngradeDecision downgradeDecision2 = C775900Uc8.LIZLLL;
        if (downgradeDecision2 != null && (downgradeInfo = downgradeDecision2.downgradeInfo) != null) {
            str = downgradeInfo.level;
        } else {
            str = null;
        }
        DowngradeInfo downgradeInfo2 = this.LLILLJJLI.downgradeInfo;
        if (downgradeInfo2 != null) {
            str2 = downgradeInfo2.level;
        } else {
            str2 = null;
        }
        boolean z = !Intrinsics.LJFF(str, str2);
        DowngradeInfo downgradeInfo3 = this.LLILLJJLI.downgradeInfo;
        if (downgradeInfo3 != null) {
            if (z) {
                enumC775890Uc7 = EnumC775890Uc7.CHANGE;
            } else {
                enumC775890Uc7 = EnumC775890Uc7.NO_CHANGE;
            }
            downgradeInfo3.changeType = enumC775890Uc7.getChangeTypeName();
        }
        DowngradeDecision downgradeDecision3 = this.LLILLJJLI;
        C775900Uc8.LIZLLL = downgradeDecision3;
        DowngradeInfo downgradeInfo4 = downgradeDecision3.downgradeInfo;
        if (downgradeInfo4 != null) {
            str3 = downgradeInfo4.level;
            str4 = downgradeInfo4.changeType;
        } else {
            str3 = null;
            str4 = null;
        }
        EnumC775890Uc7 enumC775890Uc72 = EnumC775890Uc7.CHANGE;
        if (Intrinsics.LJFF(str4, enumC775890Uc72.getChangeTypeName()) && (interfaceC1631620sYq = C775900Uc8.LIZIZ) != null) {
            Boolean boolValueOf = Boolean.valueOf(C775900Uc8.LJ);
            EnumC775860Uc4.Companion.getClass();
            interfaceC1631620sYq.invoke(boolValueOf, C775850Uc3.LIZ(str3), C775850Uc3.LIZ(this.LLILLJJLI.downgradeInfo.targetLevel));
        }
        if (C775900Uc8.LJ && (Intrinsics.LJFF(str3, EnumC775860Uc4.MEDIUM.getLevelName()) || Intrinsics.LJFF(str3, EnumC775860Uc4.HEAVY.getLevelName()))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("post: close, decision = ");
            sbLIZ.append(this.LLILLJJLI);
            C20441214yg.LIZIZ("LiveAnchorDowngradeBus", C2188811AlT.LIZIZ(sbLIZ));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("LiveAnchorDowngradeBus@2e07.post$1");
            return unit;
        }
        EnumC775860Uc4.Companion.getClass();
        String strValueOf = String.valueOf(C775850Uc3.LIZ(str3).getLevelValue());
        C1276840jKc.LIZ.getClass();
        Map<String, String> map = C1276840jKc.LJIIL;
        map.put("model_stable_degrade_level", strValueOf);
        C1276840jKc.LJIIJ.put("model_stable_degrade_level", strValueOf);
        DowngradeInfo downgradeInfo5 = this.LLILLJJLI.downgradeInfo;
        String str6 = "";
        if (downgradeInfo5 == null || (list = downgradeInfo5.triggerScores) == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62)) == null) {
            strLJJLIIIJ = "";
        }
        map.put("anchor_stable_mode_host_score", strLJJLIIIJ);
        DowngradeInfo downgradeInfo6 = this.LLILLJJLI.downgradeInfo;
        if (downgradeInfo6 != null) {
            str5 = downgradeInfo6.changeType;
        } else {
            str5 = null;
        }
        if (Intrinsics.LJFF(str5, enumC775890Uc72.getChangeTypeName())) {
            downgradeDecision = this.LLILLJJLI;
        } else {
            downgradeDecision = new DowngradeDecision(this.LLILLJJLI.downgradeInfo, null, 2, null);
        }
        String json = GsonProtectorUtils.toJson(C293501Bt.LIZ(), downgradeDecision);
        if (json != null) {
            str6 = json;
        }
        map.put("anchor_stable_mode_feature", str6);
        DowngradeDecision downgradeDecision4 = this.LLILLJJLI;
        DowngradeInfo downgradeInfo7 = downgradeDecision4.downgradeInfo;
        if (downgradeInfo7 != null) {
            downgradeInfo7.LIZ = C775900Uc8.LJ;
        }
        try {
            c098200Yq = new JSONObject(C293501Bt.LIZ().LJIILL(downgradeDecision4.downgradeInfo));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = new JSONObject();
        }
        JSONObject jSONObject = (JSONObject) c098200Yq;
        DowngradeDecision downgradeDecision5 = this.LLILLJJLI;
        for (ModuleDecision moduleDecision : downgradeDecision5.moduleDecisions) {
            moduleDecision.LIZ = downgradeDecision5.downgradeInfo;
            moduleDecision.LIZIZ = jSONObject;
            C775900Uc8.LIZ.LIZJ(moduleDecision);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LiveAnchorDowngradeBus@2e07.post$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
