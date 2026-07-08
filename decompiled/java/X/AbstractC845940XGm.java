package X;

import X.C0XGA;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XGm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC845940XGm<R extends C0XGA> implements InterfaceC846020XGu {
    public final Context LIZ;
    public final String LIZIZ;
    public final C845960XGo LIZJ;
    public final C845980XGq LIZLLL;
    public AbstractC846040XGw LJ;
    public JSONObject LJFF;
    public C845950XGn LJI;
    public boolean LJII;

    public abstract void LJ(R r);

    public abstract void LJFF(JSONObject jSONObject, JSONObject jSONObject2);

    public abstract void LJII(JSONObject jSONObject, JSONObject jSONObject2);

    public abstract R LJIIJ(boolean z, C845980XGq c845980XGq);

    static {
        new Object() { // from class: X.0XGs
        };
        new Object() { // from class: X.0XGt
        };
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0XGi, X.0XGn, java.lang.Object, java.lang.Runnable] */
    public final void LJIIIZ() {
        ?? r4 = new AbstractC845930XGl(this) { // from class: X.0XGn
            public final InterfaceC846020XGu LLIZLLLIL;

            /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0140  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJFF() {
                /*
                    Method dump skipped, instruction units count: 487
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C845950XGn.LJFF():void");
            }

            @Override // X.AbstractRunnableC845900XGi, java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("BaseAccountApi$AccountApiThread@5b95.run");
                try {
                    LJFF();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("BaseAccountApi$AccountApiThread@5b95.run");
            }

            {
                this.LLIZLLLIL = this;
            }
        };
        if (r4.LL.compareAndSet(false, true)) {
            if (AbstractRunnableC845900XGi.LLIZ == null) {
                AbstractRunnableC845900XGi.LLIZ = C845890XGh.LIZ();
            }
            C845890XGh c845890XGh = AbstractRunnableC845900XGi.LLIZ;
            synchronized (c845890XGh) {
                r4.LLILZ = C845890XGh.LJIILIIL.incrementAndGet();
                if (!c845890XGh.LIZ) {
                    c845890XGh.LJFF();
                }
                if (r4.LLILZLL == EnumC845870XGf.IMMEDIATE) {
                    RunnableC823120WQs.LIZIZ(r4);
                } else {
                    r4.LLILLL.removeMessages(0);
                    r4.LLILLL.sendEmptyMessageDelayed(0, 1000L);
                    c845890XGh.LJ.add((InterfaceC845920XGk) r4);
                }
            }
        }
        this.LJI = r4;
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x02bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1067
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC845940XGm.LIZLLL():boolean");
    }

    public static JSONObject LJI(JSONObject jSONObject) {
        JSONObject jSONObject2 = null;
        if (jSONObject.has("data")) {
            try {
                Object objOpt = jSONObject.opt("data");
                if (objOpt == null) {
                    return null;
                }
                if (objOpt instanceof JSONObject) {
                    return (JSONObject) objOpt;
                }
                if (objOpt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objOpt;
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        jSONObject3.put("data", jSONArray);
                        return jSONObject3;
                    } catch (Exception e) {
                        e = e;
                        jSONObject2 = jSONObject3;
                        TryCatchGuardChecker.doCheck(e);
                        return jSONObject2;
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        return jSONObject2;
    }

    public final void LIZIZ(List<C845840XGc> list) {
        try {
            List<C845840XGc> list2 = this.LIZJ.LIZLLL;
            if (list2 != null) {
                list.addAll(list2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZJ(List<C845840XGc> list) {
        String str;
        try {
            Context context = this.LIZ;
            if (context != null) {
                str = C0XO0.LIZLLL(context).LLJJJJJIL;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                list.add(new C845840XGc("x-tt-multi-sids", str));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZ(String str, List list) {
        try {
            String strLIZ = C838780WvM.LIZ(str, "BaseAccountApi");
            if (!TextUtils.isEmpty(strLIZ)) {
                list.add(new C845840XGc("x-tt-passport-csrf-token", strLIZ));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C838780WvM.LIZIZ(str, "BaseAccountApi", new C838820WvQ("BaseAccountApi Exception", e));
        }
    }

    public AbstractC845940XGm(Context context, C845960XGo c845960XGo, AbstractC846040XGw abstractC846040XGw) {
        this.LIZ = C786410Ut5.N3(context);
        this.LIZIZ = c845960XGo.LIZ;
        this.LIZJ = c845960XGo;
        this.LJ = abstractC846040XGw;
        if (abstractC846040XGw != null) {
            abstractC846040XGw.LIZ = this;
        }
        this.LIZLLL = new C845980XGq(c845960XGo);
    }

    public final boolean LJIIIIZZ(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (!"success".equals(str)) {
            this.LJFF = jSONObject;
            if ("error".equals(str) || "exception".equals(str)) {
                if (jSONObject2 == null) {
                    jSONObject2 = jSONObject;
                }
                if (jSONObject2.has("error_code")) {
                    C845980XGq c845980XGq = this.LIZLLL;
                    c845980XGq.LIZIZ = jSONObject2.optInt("error_code", c845980XGq.LIZIZ);
                } else if (jSONObject2.has("code")) {
                    C845980XGq c845980XGq2 = this.LIZLLL;
                    c845980XGq2.LIZIZ = jSONObject2.optInt("code", c845980XGq2.LIZIZ);
                }
                this.LIZLLL.LIZJ = jSONObject2.optString("description");
                C845980XGq c845980XGq3 = this.LIZLLL;
                c845980XGq3.LJ = c845980XGq3.LIZJ;
                jSONObject2.optString("verify_center_decision_conf");
                C845980XGq c845980XGq4 = this.LIZLLL;
                jSONObject2.optString("verify_center_secondary_decision_conf");
                c845980XGq4.getClass();
                C845980XGq c845980XGq5 = this.LIZLLL;
                jSONObject2.optString("oidc_can_use_new_token");
                c845980XGq5.getClass();
                C845980XGq c845980XGq6 = this.LIZLLL;
                jSONObject2.optString("verify_ticket");
                c845980XGq6.getClass();
                C845980XGq c845980XGq7 = this.LIZLLL;
                jSONObject2.optString("passport_domain");
                c845980XGq7.getClass();
                LJFF(jSONObject2, jSONObject);
                return false;
            }
            return false;
        }
        if (jSONObject2 != null) {
            LJII(jSONObject, jSONObject2);
            return true;
        }
        return true;
    }
}
