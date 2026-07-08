package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QHd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C667750QHd extends C0Q3N {
    public static final /* synthetic */ int LJIIJ = 0;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;

    /* JADX WARN: Illegal instructions before constructor call */
    @InterfaceC1294060jmO
    public C667750QHd() {
        C650950Pg5.Companion.getClass();
        C650960Pg6 c650960Pg6LIZJ = C646000PVm.LIZJ();
        this(c650960Pg6LIZJ == null ? new C650960Pg6(new C664000Q2s("discovery", null, true, true, "", "", 0, 0, false, "", "", ""), new C0Q8L(null, null, null), new C664030Q2v(null, null, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE), new C650940Pg4(null, "", Boolean.FALSE, ""), new C0PYE(0L), new C669560QOc(new C672110QXx(null, null, null, null, null), false, "", false, false, "", "", "", "", "", "", "", null, "", null, "", null, null, false, null, null, false, null, "", null), new C0QJN("", null, null, null, null, null)) : c650960Pg6LIZJ);
    }

    public final C0Q47<C667770QHf> LIZIZ() {
        return (C0Q47) this.LJFF.getValue();
    }

    public final C0Q47<C667700QGy> LIZJ() {
        return (C0Q47) this.LJI.getValue();
    }

    public final boolean LIZLLL() {
        return ((C667970QHz) ((C0Q47) this.LIZLLL.getValue()).LIZIZ()).LIZ;
    }

    public final void LJ() {
        LIZ(new InterfaceC663910Q2j() { // from class: X.0QI8
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C667750QHd(InterfaceC665370Q7z interfaceC665370Q7z) {
        C650950Pg5.Companion.getClass();
        C650960Pg6 c650960Pg6LJIIIIZZ = C646000PVm.LJIIIIZZ(interfaceC665370Q7z);
        this(c650960Pg6LJIIIIZZ == null ? new C650960Pg6(new C664000Q2s("discovery", null, true, true, "", "", 0, 0, false, "", "", ""), new C0Q8L(null, null, null), new C664030Q2v(null, null, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE), new C650940Pg4(null, "", Boolean.FALSE, ""), new C0PYE(0L), new C669560QOc(new C672110QXx(null, null, null, null, null), false, "", false, false, "", "", "", "", "", "", "", null, "", null, "", null, null, false, null, null, false, null, "", null), new C0QJN("", null, null, null, null, null)) : c650960Pg6LJIIIIZZ);
    }

    public final void LJFF(String str) {
        LIZ(new C0Q4R(str));
    }

    public C667750QHd(C650960Pg6 c650960Pg6) {
        super(c650960Pg6);
        this.LIZJ = C452501pT.LIZIZ(new C667850QHn(c650960Pg6));
        this.LIZLLL = C452501pT.LIZIZ(new C667860QHo(c650960Pg6));
        this.LJ = C452501pT.LIZIZ(new C667830QHl(c650960Pg6));
        this.LJFF = C452501pT.LIZIZ(new C667820QHk(c650960Pg6));
        this.LJI = C452501pT.LIZIZ(new C0QH4(c650960Pg6));
        this.LJII = C452501pT.LIZIZ(new C0Q4B(c650960Pg6));
        this.LJIIIIZZ = C452501pT.LIZIZ(new C667880QHq(c650960Pg6));
        this.LJIIIZ = C452501pT.LIZIZ(new C0Q4M(c650960Pg6));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C667750QHd(Context context, Fragment fragment) {
        C19EG c19egLIZIZ;
        C646000PVm c646000PVm = C650950Pg5.Companion;
        if (context != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(context);
        } else {
            c19egLIZIZ = null;
        }
        c646000PVm.getClass();
        C650960Pg6 c650960Pg6LJII = C646000PVm.LJII(fragment, c19egLIZIZ);
        this(c650960Pg6LJII == null ? new C650960Pg6(new C664000Q2s("discovery", null, true, true, "", "", 0, 0, false, "", "", ""), new C0Q8L(null, null, null), new C664030Q2v(null, null, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE), new C650940Pg4(null, "", Boolean.FALSE, ""), new C0PYE(0L), new C669560QOc(new C672110QXx(null, null, null, null, null), false, "", false, false, "", "", "", "", "", "", "", null, "", null, "", null, null, false, null, null, false, null, "", null), new C0QJN("", null, null, null, null, null)) : c650960Pg6LJII);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C667750QHd(Fragment fragment, LifecycleOwner lifecycleOwner) {
        C650950Pg5.Companion.getClass();
        C650960Pg6 c650960Pg6LJII = C646000PVm.LJII(fragment, lifecycleOwner);
        this(c650960Pg6LJII == null ? new C650960Pg6(new C664000Q2s("discovery", null, true, true, "", "", 0, 0, false, "", "", ""), new C0Q8L(null, null, null), new C664030Q2v(null, null, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE), new C650940Pg4(null, "", Boolean.FALSE, ""), new C0PYE(0L), new C669560QOc(new C672110QXx(null, null, null, null, null), false, "", false, false, "", "", "", "", "", "", "", null, "", null, "", null, null, false, null, null, false, null, "", null), new C0QJN("", null, null, null, null, null)) : c650960Pg6LJII);
    }

    public static JSONObject LJI(C0QI6 c0qi6, C667770QHf c667770QHf, C667760QHe c667760QHe) throws JSONException {
        int i;
        JSONObject jSONObject = new JSONObject();
        long jCurrentTimeMillis = 0;
        if (c0qi6 != null) {
            jSONObject.put("sug_after_search", c0qi6.LIZJ ? 1 : 0);
            if (c0qi6.LIZIZ > 0) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_cleared", i);
            long j = c0qi6.LIZIZ;
            if (j > 0) {
                jSONObject.put("cleared_time", j);
                jSONObject.put("content_before_clear", c0qi6.LIZ);
            }
        }
        if (c667770QHf != null) {
            jSONObject.put("session_first_search", c667770QHf.LIZ ? 1 : 0);
            jSONObject.put("last_search_query", c667770QHf.LJFF);
            jSONObject.put("last_search_source", c667770QHf.LJ);
            jSONObject.put("last_search_group_id", c667770QHf.LIZLLL);
            jSONObject.put("has_effective_click", c667770QHf.LIZJ ? 1 : 0);
            jSONObject.put("total_play_time", c667770QHf.LJII);
            if (c667770QHf.LIZIZ != 0) {
                jCurrentTimeMillis = System.currentTimeMillis() - c667770QHf.LIZIZ;
            }
            jSONObject.put("last_search_time_interval", jCurrentTimeMillis);
        }
        if (c667760QHe != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first_enter_search_blank", String.valueOf(c667760QHe.LIZIZ ? 1 : 0));
                jSONObject2.put("time_enter_search_blank", c667760QHe.LIZLLL);
                jSONObject2.put("request_time", c667760QHe.LIZJ);
                jSONObject2.put("source_enter_search_blank", c667760QHe.LJ);
                jSONObject2.put("method_enter_search_blank", c667760QHe.LJFF);
                jSONObject2.put("last_ten_group_infos", C08JS.LIZLLL(c667760QHe.LJI));
                jSONObject.put("search_recom_signal", C786410Ut5.J3(jSONObject2));
                return jSONObject;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jSONObject;
    }
}
