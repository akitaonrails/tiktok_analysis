package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10rA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19375410rA implements Cloneable {
    public static C19375410rA LLJJ;
    public String LL = "";
    public String LLILLJJLI = "";
    public String LLILLL = "";
    public Integer LLILZ = 0;
    public Character LLILZIL = '.';
    public Character LLILZLL = ',';
    public String LLIZ = "";
    public String LLIZLLLIL = "";
    public String LLJ = "";
    public List<C19375710rD> LLJI = null;
    public List<C19375710rD> LLJIJIL = null;
    public String LLJILJIL = "";
    public String LLJILJILJ = "";
    public C19375610rC LLJILLL = null;

    public static C19375410rA LIZ() {
        List<C19375710rD> listLIZ;
        C19375410rA c19375410rA = LLJJ;
        if (c19375410rA != null) {
            return c19375410rA;
        }
        C19375410rA c19375410rA2 = new C19375410rA();
        c19375410rA2.LL = "en";
        c19375410rA2.LLILLL = "{0}";
        c19375410rA2.LLILLJJLI = "#,##0.###";
        c19375410rA2.LLILZ = 4;
        c19375410rA2.LLILZIL = '.';
        c19375410rA2.LLILZLL = ',';
        c19375410rA2.LLIZ = "{0}%";
        c19375410rA2.LLIZLLLIL = "{0}‰";
        c19375410rA2.LLJ = "#E0";
        c19375410rA2.LLJILJILJ = "{0}";
        c19375410rA2.LLJILJIL = "{0}";
        List<C19375710rD> listLIZ2 = null;
        try {
            listLIZ = C19375510rB.LIZ(new JSONObject("{\"4digit\":{\"one\":\"0thousand\",\"other\":\"0thousand\"},\"7digit\":{\"one\":\"0million\",\"other\":\"0million\"},\"10digit\":{\"one\":\"0billion\",\"other\":\"0billion\"},\"13digit\":{\"one\":\"0trillion\",\"other\":\"0trillion\"}}"));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            listLIZ = null;
        }
        c19375410rA2.LLJI = listLIZ;
        try {
            listLIZ2 = C19375510rB.LIZ(new JSONObject("{\"4digit\":{\"one\":\"0K\",\"other\":\"0K\"},\"7digit\":{\"one\":\"0M\",\"other\":\"0M\"},\"10digit\":{\"one\":\"0B\",\"other\":\"0B\"},\"13digit\":{\"one\":\"0T\",\"other\":\"0T\"}}"));
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        c19375410rA2.LLJIJIL = listLIZ2;
        C19375610rC c19375610rC = new C19375610rC();
        c19375610rC.LL = new C19375910rF("{0}–{1}", "from {0} to {1}");
        c19375610rC.LLILLJJLI = new C19375910rF("~{0}", "about {0}");
        c19375610rC.LLILLL = new C19375910rF("{0}+", "at least {0}");
        c19375610rC.LLILZ = new C19375910rF("≤{0}", "at most {0}");
        c19375410rA2.LLJILLL = c19375610rC;
        LLJJ = c19375410rA2;
        return c19375410rA2;
    }

    public final boolean LIZIZ() {
        return (TextUtils.isEmpty(this.LL) || TextUtils.isEmpty(this.LLILLJJLI)) ? false : true;
    }

    public final Object clone() {
        C19375410rA c19375410rA = (C19375410rA) super.clone();
        c19375410rA.LLILLL = this.LLILLL;
        c19375410rA.LL = this.LL;
        c19375410rA.LLILLJJLI = this.LLILLJJLI;
        c19375410rA.LLILZ = this.LLILZ;
        c19375410rA.LLILZIL = this.LLILZIL;
        c19375410rA.LLILZLL = this.LLILZLL;
        c19375410rA.LLIZ = this.LLIZ;
        c19375410rA.LLIZLLLIL = this.LLIZLLLIL;
        c19375410rA.LLJ = this.LLJ;
        c19375410rA.LLJI = new ArrayList();
        Iterator<C19375710rD> it2 = this.LLJI.iterator();
        while (it2.hasNext()) {
            c19375410rA.LLJI.add(it2.next().clone());
        }
        c19375410rA.LLJIJIL = new ArrayList();
        Iterator<C19375710rD> it3 = this.LLJIJIL.iterator();
        while (it3.hasNext()) {
            c19375410rA.LLJIJIL.add(it3.next().clone());
        }
        c19375410rA.LLJILLL = this.LLJILLL.clone();
        return c19375410rA;
    }
}
