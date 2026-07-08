package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import m14.m;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ori, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1489560ori {
    public long LJII;
    public long LJIIIIZZ;
    public int LJIIIZ;
    public long LJIIJ;
    public String LJIIJJI;
    public int LJIIL;
    public final List<String> LIZ = new ArrayList();
    public final List<String> LIZIZ = new ArrayList();
    public final List<String> LIZJ = new ArrayList();
    public final List<String> LIZLLL = new ArrayList();
    public final List<String> LJ = new ArrayList();
    public final List<String> LJFF = new ArrayList();
    public final List<String> LJI = new ArrayList();
    public List<String> LJIILIIL = new ArrayList();

    public abstract boolean LIZIZ(String str, long j, JSONObject jSONObject);

    public final boolean LIZJ() {
        long j = this.LJII;
        if (j == 0 && this.LJIIIIZZ == 0) {
            return true;
        }
        if (j != -1 && this.LJIIIIZZ != -1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis > this.LJII && jCurrentTimeMillis < this.LJIIIIZZ) {
                return true;
            }
            Logger.debug();
        }
        return false;
    }

    public final boolean LIZLLL(Uri uri) {
        if (!((ArrayList) this.LIZ).isEmpty()) {
            Iterator it2 = ((ArrayList) this.LIZ).iterator();
            while (it2.hasNext()) {
                if (C2088908Gh.LIZIZ(uri.getHost(), (String) it2.next())) {
                }
            }
            Logger.debug();
            return false;
        }
        String path = uri.getPath();
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        if (!((ArrayList) this.LIZIZ).isEmpty()) {
            Iterator it3 = ((ArrayList) this.LIZIZ).iterator();
            while (it3.hasNext()) {
                if (path.equals(it3.next())) {
                    Logger.debug();
                    return true;
                }
            }
        }
        if (!((ArrayList) this.LIZJ).isEmpty()) {
            Iterator it4 = ((ArrayList) this.LIZJ).iterator();
            while (it4.hasNext()) {
                if (path.startsWith((String) it4.next())) {
                    Logger.debug();
                    return true;
                }
            }
        }
        if (!((ArrayList) this.LIZLLL).isEmpty()) {
            Iterator it5 = ((ArrayList) this.LIZLLL).iterator();
            while (it5.hasNext()) {
                if (path.contains((String) it5.next())) {
                    Logger.debug();
                    return true;
                }
            }
        }
        if (!((ArrayList) this.LJ).isEmpty()) {
            Iterator it6 = ((ArrayList) this.LJ).iterator();
            while (it6.hasNext()) {
                if (path.matches((String) it6.next())) {
                    Logger.debug();
                    return true;
                }
            }
        }
        if (!((ArrayList) this.LJFF).isEmpty()) {
            if (!((ArrayList) this.LJI).isEmpty()) {
                Iterator it7 = ((ArrayList) this.LJI).iterator();
                while (it7.hasNext()) {
                    if (path.contains((String) it7.next())) {
                    }
                }
                return false;
            }
            Iterator it8 = ((ArrayList) this.LJFF).iterator();
            while (it8.hasNext()) {
                if (uri.toString().matches((String) it8.next())) {
                    Logger.debug();
                    return true;
                }
            }
        }
        return false;
    }

    public final void LJ(JSONObject jSONObject) {
        LJFF("host_group", this.LIZ, jSONObject, false);
        LJFF("equal_group", this.LIZIZ, jSONObject, false);
        LJFF("prefixes_group", this.LIZJ, jSONObject, false);
        LJFF("contain_group", this.LIZLLL, jSONObject, false);
        LJFF("pattern_group", this.LJ, jSONObject, true);
        LJFF("url_group", this.LJFF, jSONObject, true);
        LJFF("path_contain", this.LJI, jSONObject, false);
    }

    public static void LJFF(String str, List list, JSONObject jSONObject, boolean z) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                String strOptString = jSONArrayOptJSONArray.optString(i);
                if (!TextUtils.isEmpty(strOptString)) {
                    if (z) {
                        if (!TextUtils.isEmpty(strOptString)) {
                            try {
                                PatternProtector.compile(strOptString);
                                ((ArrayList) list).add(strOptString);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                    } else {
                        ((ArrayList) list).add(strOptString);
                    }
                }
            }
        }
    }

    public static AbstractC1489560ori LIZ(String str, JSONObject jSONObject, int i, long j, long j2, long j3, String str2, long j4, List<String> list, int i2) {
        AbstractC1489560ori c09ff;
        if (str.equals("tc")) {
            c09ff = new AbstractC1489540org() { // from class: X.0orh
                public String LJIILL;
                public String LJIILLIIL;
                public String LJIIZILJ;
                public String LJIJ;
                public String LJIJI;
                public boolean LJIJJ;
                public int LJIJJLI = -555;
                public int LJIL = 100;
                public boolean LJJ;

                @Override // X.AbstractC1489540org
                public final int LJII() {
                    return -1;
                }

                @Override // X.AbstractC1489540org
                public final int LJIIIIZZ() {
                    return this.LJIJJLI;
                }

                @Override // X.AbstractC1489540org
                public final boolean LJIIIZ(JSONObject jSONObject2, List list2) {
                    boolean z;
                    LJ(jSONObject2);
                    this.LJIIJJI = jSONObject2.optString("service_name");
                    this.LJIILL = jSONObject2.optString("scheme_replace");
                    this.LJIILLIIL = jSONObject2.optString("host_replace");
                    this.LJIIZILJ = jSONObject2.optString("path_replace");
                    String strOptString = jSONObject2.optString("replace");
                    this.LJIJI = strOptString;
                    if (!TextUtils.isEmpty(strOptString)) {
                        String strOptString2 = jSONObject2.optString("regex");
                        if (!TextUtils.isEmpty(strOptString2)) {
                            try {
                                PatternProtector.compile(strOptString2);
                                this.LJIJ = strOptString2;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                        this.LJJ = true;
                        return true;
                    }
                    if (jSONObject2.optInt("drop") == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.LJIJJ = z;
                    int iOptInt = jSONObject2.optInt("drop_code", -1);
                    if (iOptInt == -555 || (iOptInt >= -5559 && iOptInt <= -5551)) {
                        this.LJIJJLI = iOptInt;
                    }
                    int iOptInt2 = jSONObject2.optInt("possibility", 100);
                    if (iOptInt2 >= 0 && iOptInt2 <= 100) {
                        this.LJIL = iOptInt2;
                    }
                    if ((((ArrayList) this.LIZIZ).isEmpty() && ((ArrayList) this.LIZJ).isEmpty() && ((ArrayList) this.LIZLLL).isEmpty() && ((ArrayList) this.LJ).isEmpty() && ((ArrayList) this.LJFF).isEmpty()) || (!this.LJIJJ && this.LJIILL.isEmpty() && this.LJIILLIIL.isEmpty() && this.LJIIZILJ.isEmpty() && this.LJIJI.isEmpty())) {
                        this.LJJ = true;
                    }
                    ListProtector.set(list2, 0, Boolean.FALSE);
                    return true;
                }

                @Override // X.AbstractC1489540org
                public final EnumC1489530orf LJI(m mVar, String str3, List<String> list2) {
                    Logger.debug();
                    Uri uri = UriProtector.parse(str3);
                    if (!this.LJJ && LIZLLL(uri)) {
                        ListProtector.set(list2, 0, str3);
                        if (this.LJIJJ) {
                            Logger.debug();
                            int i3 = this.LJIL;
                            if (i3 < 100) {
                                if (i3 > 0) {
                                    if (new Random().nextInt(100) >= this.LJIL) {
                                        Logger.debug();
                                    }
                                }
                                return EnumC1489530orf.DISPATCH_NONE;
                            }
                            ListProtector.set(list2, 0, "");
                            return EnumC1489530orf.DISPATCH_DROP;
                        }
                        if (this.LJIILLIIL.isEmpty() && this.LJIILL.isEmpty() && this.LJIIZILJ.isEmpty()) {
                            if (!TextUtils.isEmpty(this.LJIJI) && !TextUtils.isEmpty(this.LJIJ)) {
                                ListProtector.set(list2, 0, str3.replaceAll(this.LJIJ, this.LJIJI));
                                return EnumC1489530orf.DISPATCH_HIT;
                            }
                            return EnumC1489530orf.DISPATCH_NONE;
                        }
                        if (uri.getScheme() != null) {
                            String scheme = uri.getScheme();
                            String str4 = this.LJIILL;
                            if (!TextUtils.isEmpty(str4) && (scheme.equals(str4) || (((scheme.equals("http") || scheme.equals("https")) && (str4.equals("http") || str4.equals("https"))) || ((scheme.equals("ws") || scheme.equals("wss")) && (str4.equals("ws") || str4.equals("wss")))))) {
                                str3 = str3.replaceFirst(uri.getScheme(), this.LJIILL);
                            }
                        }
                        if (uri.getHost() != null && !TextUtils.isEmpty(this.LJIILLIIL)) {
                            str3 = str3.replaceFirst(uri.getHost(), this.LJIILLIIL);
                        }
                        if (uri.getPath() != null && !TextUtils.isEmpty(this.LJIIZILJ)) {
                            str3 = str3.replaceFirst(uri.getPath(), this.LJIIZILJ);
                        }
                        ListProtector.set(list2, 0, str3);
                        return EnumC1489530orf.DISPATCH_HIT;
                    }
                    ListProtector.set(list2, 0, str3);
                    return EnumC1489530orf.DISPATCH_NONE;
                }
            };
        } else {
            c09ff = null;
        }
        if (str.equals("dispatch")) {
            c09ff = new AbstractC1489540org() { // from class: X.0ore
                public AbstractC1489510ord LJIILL;

                @Override // X.AbstractC1489540org
                public final int LJII() {
                    return this.LJIILL.LIZ.ordinal();
                }

                @Override // X.AbstractC1489540org
                public final boolean LJIIIZ(JSONObject jSONObject2, List list2) {
                    AbstractC1489510ord abstractC1489510ord;
                    LJ(jSONObject2);
                    String strOptString = jSONObject2.optString("service_name");
                    if (!TextUtils.isEmpty(strOptString)) {
                        this.LJIIJJI = strOptString;
                    }
                    int iOptInt = jSONObject2.optInt("dispatch_strategy", 0);
                    JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("strategy_info");
                    if (iOptInt >= 0 && iOptInt <= 6) {
                        int i3 = C1489490orb.LIZ[EnumC1489480ora.values()[iOptInt].ordinal()];
                        if (i3 != 1) {
                            if (i3 != 2) {
                                Logger.debug();
                                abstractC1489510ord = new AbstractC1489510ord() { // from class: X.0orc
                                    @Override // X.AbstractC1489510ord
                                    public final void LIZ(m mVar) {
                                    }

                                    @Override // X.AbstractC1489510ord
                                    public final void LIZJ() {
                                    }

                                    {
                                        EnumC1489480ora enumC1489480ora = EnumC1489480ora.UNKNOWN_DISPATCH_STRATEGY;
                                    }

                                    @Override // X.AbstractC1489510ord
                                    public final String LIZIZ(Uri uri) {
                                        return uri.toString();
                                    }
                                };
                            } else {
                                abstractC1489510ord = new AbstractC1489510ord(jSONObjectOptJSONObject) { // from class: X.0orY
                                    public final Map<String, String> LIZJ;

                                    @Override // X.AbstractC1489510ord
                                    public final void LIZJ() {
                                    }

                                    {
                                        super(EnumC1489480ora.REQUEST_HEADER_DISPATCH_STRATEGY);
                                        this.LIZJ = new HashMap();
                                        if (jSONObjectOptJSONObject == null) {
                                            return;
                                        }
                                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                                        while (itKeys.hasNext()) {
                                            String next = itKeys.next();
                                            String strOptString2 = jSONObjectOptJSONObject.optString(next);
                                            if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(strOptString2)) {
                                                this.LIZJ.put(next, strOptString2);
                                            }
                                        }
                                    }

                                    @Override // X.AbstractC1489510ord
                                    public final void LIZ(m mVar) {
                                        if (mVar.LIZLLL != null) {
                                            for (Map.Entry entry : ((HashMap) this.LIZJ).entrySet()) {
                                                mVar.LIZLLL.add(new C080U((String) entry.getKey(), (String) entry.getValue()));
                                            }
                                        }
                                    }

                                    @Override // X.AbstractC1489510ord
                                    public final String LIZIZ(Uri uri) {
                                        return uri.toString();
                                    }
                                };
                            }
                        } else {
                            abstractC1489510ord = new AbstractC1489510ord(jSONObjectOptJSONObject) { // from class: X.0orZ
                                public final Map<String, String> LIZJ;

                                @Override // X.AbstractC1489510ord
                                public final void LIZ(m mVar) {
                                }

                                @Override // X.AbstractC1489510ord
                                public final void LIZJ() {
                                }

                                {
                                    super(EnumC1489480ora.STATIC_DISPATCH_STRATEGY);
                                    this.LIZJ = new HashMap();
                                    if (jSONObjectOptJSONObject == null) {
                                        return;
                                    }
                                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                                    while (itKeys.hasNext()) {
                                        String next = itKeys.next();
                                        String strOptString2 = jSONObjectOptJSONObject.optString(next);
                                        if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(strOptString2)) {
                                            this.LIZJ.put(next, strOptString2);
                                        }
                                    }
                                }

                                @Override // X.AbstractC1489510ord
                                public final String LIZIZ(Uri uri) {
                                    String host = uri.getHost();
                                    String string = uri.toString();
                                    String str3 = (String) ((HashMap) this.LIZJ).get(host);
                                    if (!TextUtils.isEmpty(str3)) {
                                        Logger.debug();
                                        return string.replaceFirst(host, str3);
                                    }
                                    return string;
                                }
                            };
                        }
                        this.LJIILL = abstractC1489510ord;
                        abstractC1489510ord.LIZJ();
                        ListProtector.set(list2, 0, Boolean.FALSE);
                        return true;
                    }
                    this.LJIILL = null;
                    return false;
                }

                @Override // X.AbstractC1489540org
                public final EnumC1489530orf LJI(m mVar, String str3, List<String> list2) {
                    AbstractC1489510ord abstractC1489510ord;
                    Logger.debug();
                    EnumC1489530orf enumC1489530orf = EnumC1489530orf.DISPATCH_NONE;
                    Uri uri = UriProtector.parse(str3);
                    if (uri.getHost() != null && LIZLLL(uri) && (abstractC1489510ord = this.LJIILL) != null) {
                        enumC1489530orf = EnumC1489530orf.DISPATCH_HIT;
                        if (abstractC1489510ord.LIZ == EnumC1489480ora.REQUEST_HEADER_DISPATCH_STRATEGY) {
                            abstractC1489510ord.LIZ(mVar);
                            ListProtector.set(list2, 0, str3);
                            return enumC1489530orf;
                        }
                        String strLIZIZ = abstractC1489510ord.LIZIZ(uri);
                        if (!str3.equals(strLIZIZ)) {
                            ListProtector.set(list2, 0, strLIZIZ);
                        } else {
                            ListProtector.set(list2, 0, str3);
                            return enumC1489530orf;
                        }
                    }
                    return enumC1489530orf;
                }
            };
        }
        if (str.equals("delay")) {
            c09ff = new C09FF();
        } else if (c09ff == null) {
            return null;
        }
        c09ff.LJIIIZ = i;
        c09ff.LJII = j;
        c09ff.LJIIIIZZ = j2;
        c09ff.LJIIJ = j3;
        c09ff.LJIILIIL = list;
        if (i2 < 0) {
            c09ff.LJIIL = Integer.MAX_VALUE;
        } else {
            c09ff.LJIIL = i2;
        }
        if (!c09ff.LIZIZ(str2, j4, jSONObject)) {
            return null;
        }
        return c09ff;
    }
}
