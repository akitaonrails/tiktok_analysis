package X;

import android.app.Activity;
import androidx.activity.ComponentActivity;
import androidx.cardview.widget.CardView;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0KZd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.hybrid.jsb.impl.GetLiveFloatWindowStatusMethod$handle$1", f = "GetLiveFloatWindowStatusMethod.kt", l = {}, m = "invokeSuspend")
public final class C519550KZd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C519570KZf LLILLJJLI;
    public final /* synthetic */ InterfaceC519590KZh LLILLL;
    public final /* synthetic */ CompletionBlock<InterfaceC519580KZg> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C519550KZd(C519570KZf c519570KZf, InterfaceC519590KZh interfaceC519590KZh, CompletionBlock<InterfaceC519580KZg> completionBlock, InterfaceC1364105Vn<? super C519550KZd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c519570KZf;
        this.LLILLL = interfaceC519590KZh;
        this.LLILZ = completionBlock;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C519550KZd c519550KZd = new C519550KZd(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c519550KZd.LL = obj;
        return c519550KZd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Activity activityLIZLLL;
        ComponentActivity componentActivity;
        String strLIZJ;
        C519740KZw c519740KZw;
        InterfaceC519660KZo delegate;
        Object c098200Yq;
        String str;
        String str2 = "";
        C1C7U.LIZ("GetLiveFloatWindowStatusMethod@c825.handle$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC634840OvC interfaceC634840OvC = this.LLILLJJLI.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            activityLIZLLL = interfaceC634840OvC.LIZLLL();
        } else {
            activityLIZLLL = null;
        }
        if (activityLIZLLL instanceof ComponentActivity) {
            componentActivity = (ComponentActivity) activityLIZLLL;
        } else {
            componentActivity = null;
        }
        if (componentActivity != null) {
            InterfaceC519590KZh interfaceC519590KZh = this.LLILLL;
            CompletionBlock<InterfaceC519580KZg> completionBlock = this.LLILZ;
            int iHashCode = componentActivity.hashCode();
            if (interfaceC519590KZh.getId() != null && !Intrinsics.LJFF(String.valueOf(iHashCode), interfaceC519590KZh.getId())) {
                C2382909Vj.LIZ(completionBlock, 0, "id not match!!", null, 4);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("GetLiveFloatWindowStatusMethod@c825.handle$1");
                return unit;
            }
            C473630Ihl c473630IhlLJJJJJL = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJJJJL();
            if (c473630IhlLJJJJJL != null && c473630IhlLJJJJJL.LIZ(componentActivity, null, null) && Intrinsics.LJFF(interfaceC519590KZh.getSmallWindowType(), C2286608xc.LJ(1))) {
                strLIZJ = c473630IhlLJJJJJL.LIZIZ(String.valueOf(componentActivity.hashCode()));
            } else {
                CardView cardView = (CardView) componentActivity.findViewById(R.id.gi8);
                if ((cardView instanceof C519740KZw) && (c519740KZw = (C519740KZw) cardView) != null && (delegate = c519740KZw.getDelegate()) != null) {
                    strLIZJ = delegate.LIZJ();
                } else {
                    strLIZJ = null;
                }
            }
            try {
                if (strLIZJ == null) {
                    str = "";
                } else {
                    str = strLIZJ;
                }
                JSONObject jSONObject = new JSONObject(str);
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC519580KZg.class, null);
                InterfaceC519580KZg interfaceC519580KZg = (InterfaceC519580KZg) xBaseModelLIZJ;
                interfaceC519580KZg.setMute(Boolean.valueOf(jSONObject.optBoolean("is_mute")));
                interfaceC519580KZg.setRoomId(jSONObject.optString("room_id"));
                interfaceC519580KZg.setManualClose(Boolean.valueOf(jSONObject.optBoolean("manual_close")));
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "success");
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("status == ");
                if (strLIZJ != null) {
                    str2 = strLIZJ;
                }
                sbLIZ.append(str2);
                C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
            }
        } else {
            C2382909Vj.LIZ(this.LLILZ, 0, "context is null!!", null, 4);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GetLiveFloatWindowStatusMethod@c825.handle$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
