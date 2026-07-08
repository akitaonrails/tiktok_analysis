package X;

import Y.AfS116S0300000_27;
import Y.AfS161S0200000_27;
import Y.AfS196S0100000_27;
import Y.AfS71S0400000_27;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0xFo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1812020xFo extends C09W5 {
    public C11JF LLILLL;
    public FollowPair LLILZ;

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final void release() {
        super.release();
        C11JF c11jf = this.LLILLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }

    public static HashMap LIZLLL(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject.optString(next));
        }
        return map;
    }

    @Override // X.AbstractC1549150qPp
    public final boolean shouldUseOriginalData(InterfaceC634840OvC interfaceC634840OvC) {
        EnumC1063300dmC enumC1063300dmC;
        C1543410qGZ c1543410qGZLIZJ;
        C1543190qGD c1543190qGD;
        if (interfaceC634840OvC != null && (c1543410qGZLIZJ = interfaceC634840OvC.LIZJ()) != null && (c1543190qGD = c1543410qGZLIZJ.LIZ.LIZ) != null) {
            enumC1063300dmC = c1543190qGD.LJIILJJIL;
        } else {
            enumC1063300dmC = null;
        }
        if (enumC1063300dmC == EnumC1063300dmC.WEB) {
            return true;
        }
        return false;
    }

    public final void LIZJ(Context context, FollowPair followPair, CompletionBlock<C09W6> completionBlock) {
        this.LLILZ = followPair;
        if (!UserService.getInstance().user().isLogin()) {
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null) {
                InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                C476760Imo c476760Imo = new C476760Imo();
                c476760Imo.LIZ = C497740JfY.LJIJI(2131853574);
                c476760Imo.LIZJ = -1;
                c476760Imo.LJ = "search_result";
                c476760Imo.LIZLLL = "recommend";
                c476760Imo.LJFF = "follow";
                this.LLILLL = (C11JF) interfaceC500940JkiUser.LJIILL(activityLIZ, new C501600Jlm(c476760Imo)).LJJLL(new AfS71S0400000_27(this, context, followPair, completionBlock, 1), new AfS196S0100000_27(completionBlock, 35));
                return;
            }
            return;
        }
        if (followPair.LJ) {
            InterfaceC500940Jki interfaceC500940JkiUser2 = UserService.getInstance().user();
            C1099430eiT c1099430eiT = new C1099430eiT();
            c1099430eiT.LIZIZ(followPair.LIZ);
            c1099430eiT.LJ(followPair.LIZIZ);
            c1099430eiT.LIZLLL = followPair.LJFF;
            c1099430eiT.LIZLLL();
            c1099430eiT.LJ = followPair.LIZLLL;
            c1099430eiT.LIZLLL();
            c1099430eiT.LJI = followPair.LJI;
            c1099430eiT.LIZLLL();
            c1099430eiT.LIZLLL();
            this.LLILLL = (C11JF) interfaceC500940JkiUser2.LIZ(c1099430eiT.LIZJ()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS161S0200000_27(completionBlock, this, 8), new AfS116S0300000_27(this, context, completionBlock, 1));
            return;
        }
        InterfaceC500940Jki interfaceC500940JkiUser3 = UserService.getInstance().user();
        C1113650f5P c1113650f5P = new C1113650f5P();
        c1113650f5P.LIZIZ(followPair.LIZ);
        c1113650f5P.LIZJ();
        c1113650f5P.LJ = followPair.LJFF;
        c1113650f5P.LJFF = followPair.LIZLLL;
        c1113650f5P.LIZLLL(followPair.followStatus);
        c1113650f5P.getClass();
        this.LLILLL = (C11JF) interfaceC500940JkiUser3.LJI(new C1812120xFy(c1113650f5P)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS161S0200000_27(completionBlock, this, 9), new AfS196S0100000_27(completionBlock, 36));
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [X.0xFq] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        final Context context;
        long j;
        JSONObject json = xBaseParamModel.toJSON();
        String strOptString = json.optString("type");
        final JSONObject jSONObjectOptJSONObject = json.optJSONObject("args");
        HashMap<String, String> mapLIZLLL = null;
        if (jSONObjectOptJSONObject == null) {
            C2382909Vj.LIZ(completionBlock, 0, "args in null", null, 4);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            final long jLongValue = 0;
            if (Intrinsics.LJFF(strOptString, "follow")) {
                Long lLJIILIIL = C2095008Iq.LJIILIIL(jSONObjectOptJSONObject.optString("user_id"));
                try {
                    j = CastLongProtector.parseLong(JSONObjectProtectorUtils.getString(jSONObjectOptJSONObject, "room_id"));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
                    StackTraceElement[] stackTrace = e.getStackTrace();
                    c1143300frELJIIJJI.getClass();
                    AbstractC1143290frD.LJIIJ(stackTrace, 5);
                    j = 0;
                }
                jSONObjectOptJSONObject.optString("from_label");
                jSONObjectOptJSONObject.optString("url");
                FollowPair followPair = new FollowPair();
                followPair.LIZLLL = EnumC1812050xFr.FromWeb;
                if (lLJIILIIL != null) {
                    jLongValue = lLJIILIIL.longValue();
                }
                followPair.LIZ = jLongValue;
                followPair.LIZIZ = j;
                followPair.LJ = true;
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("send_log");
                if (jSONObjectOptJSONObject2 != null) {
                    mapLIZLLL = LIZLLL(jSONObjectOptJSONObject2);
                }
                followPair.LJFF = mapLIZLLL;
                if (mapLIZLLL != null && (Intrinsics.LJFF("program_list", mapLIZLLL.get("click_user_position")) || Intrinsics.LJFF("program_list_new", mapLIZLLL.get("click_user_position")))) {
                    followPair.LJI = true;
                }
                LIZJ(context, followPair, completionBlock);
                return;
            }
            if (Intrinsics.LJFF(strOptString, "unfollow")) {
                Long lLJIILIIL2 = C2095008Iq.LJIILIIL(jSONObjectOptJSONObject.optString("user_id"));
                if (lLJIILIIL2 != null) {
                    jLongValue = lLJIILIIL2.longValue();
                }
                final String strOptString2 = jSONObjectOptJSONObject.optString("from_label", "");
                final String strOptString3 = jSONObjectOptJSONObject.optString("url", "");
                String strLJIJI = C497740JfY.LJIJI(2131852008);
                final ?? r7 = new DialogInterface.OnClickListener(jSONObjectOptJSONObject, jLongValue, strOptString3, strOptString2, this, context, completionBlock) { // from class: X.0xFq
                    public final /* synthetic */ JSONObject LL;
                    public final /* synthetic */ long LLILLJJLI;
                    public final /* synthetic */ String LLILLL;
                    public final /* synthetic */ C1812020xFo LLILZ;
                    public final /* synthetic */ Context LLILZIL;
                    public final /* synthetic */ CompletionBlock<C09W6> LLILZLL;

                    {
                        this.LLILLL = strOptString2;
                        this.LLILZ = this;
                        this.LLILZIL = context;
                        this.LLILZLL = completionBlock;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        int i2;
                        HashMap<String, String> mapLIZLLL2;
                        try {
                            i2 = JSONObjectProtectorUtils.getInt(this.LL, "follow_status");
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            i2 = 0;
                        }
                        FollowPair followPair2 = new FollowPair();
                        followPair2.followStatus = i2;
                        followPair2.LIZLLL = EnumC1812050xFr.FromWeb;
                        followPair2.LIZ = this.LLILLJJLI;
                        JSONObject jSONObjectOptJSONObject3 = this.LL.optJSONObject("send_log");
                        if (jSONObjectOptJSONObject3 != null) {
                            this.LLILZ.getClass();
                            mapLIZLLL2 = C1812020xFo.LIZLLL(jSONObjectOptJSONObject3);
                        } else {
                            mapLIZLLL2 = null;
                        }
                        followPair2.LJFF = mapLIZLLL2;
                        this.LLILZ.LIZJ(this.LLILZIL, followPair2, this.LLILZLL);
                    }
                };
                C19GO c19go = new C19GO(context);
                c19go.LIZLLL = strLJIJI;
                c19go.LIZJ(2131851524, new DialogInterface.OnClickListener() { // from class: X.0xFt
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                }, false);
                c19go.LJ(2131854999, new DialogInterface.OnClickListener() { // from class: X.0Ji0
                    public final /* synthetic */ String LLILLL = "";
                    public final /* synthetic */ boolean LLILZ = false;
                    public final /* synthetic */ String LLILZIL = "";
                    public final /* synthetic */ String LLILZLL = "";

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        try {
                            new JSONObject().put("source", strOptString2);
                        } catch (JSONException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        HashMap map = new HashMap();
                        map.put("follow_source", strOptString2);
                        map.put("user_id", String.valueOf(jLongValue));
                        map.put("enter_from", this.LLILLL);
                        map.put("source", this.LLILLL);
                        if (this.LLILZ) {
                            map.put("event_type", "click");
                            map.put("event_belong", "video");
                            map.put("event_module", "toast");
                            if (!C2093608Ic.LJ(this.LLILZIL)) {
                                map.put("event_page", this.LLILZIL);
                            }
                            if (!C2093608Ic.LJ(this.LLILZLL)) {
                                map.put("enter_from", this.LLILZLL);
                            }
                        }
                        C474500IjA c474500IjALIZJ = C0IJT.LIZJ("unfollow_popup_confirm");
                        c474500IjALIZJ.LJJIIZI(map);
                        c474500IjALIZJ.LIZ();
                        DialogInterface.OnClickListener onClickListener = r7;
                        if (onClickListener != null) {
                            onClickListener.onClick(dialogInterface, i);
                        }
                    }
                }, false);
                C786410Ut5.M4(c19go.LIZ());
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, "unsupported type param", null, 4);
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "context in null", null, 4);
    }
}
