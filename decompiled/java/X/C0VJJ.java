package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0VJJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0VJJ {
    public String LIZ;
    public String LIZIZ = "";
    public long LIZJ;
    public long LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public final ArrayList<String> LJIIIZ;
    public boolean LJIIJ;
    public JSONArray LJIIJJI;
    public final HashMap<String, JSONArray> LJIIL;

    public final boolean LIZ() {
        return this.LIZIZ.equals("TimedWaiting") || this.LIZIZ.equals("Waiting") || this.LIZIZ.equals("Blocked");
    }

    public final boolean LIZIZ() {
        if (!this.LIZIZ.equals("Native")) {
            return false;
        }
        for (int i = this.LJI; i < this.LJIIIZ.size(); i++) {
            String str = (String) ListProtector.get(this.LJIIIZ, i);
            if (str.startsWith("  at")) {
                return str.contains("BinderProxy.transactNative");
            }
            if (str.startsWith("  native: #") && (str.contains("__futex_wait_ex") || str.startsWith("talkWithDriver"))) {
                return true;
            }
        }
        return false;
    }

    public final boolean LIZJ() {
        int i;
        int length = 0;
        if (this.LJIIIZ.size() <= 5) {
            return false;
        }
        String str = (String) ListProtector.get(this.LJIIIZ, 0);
        Pattern patternCompile = PatternProtector.compile("^\"(.*)\"(?: daemon)? prio=-?\\d+ (.*)$");
        Pattern patternCompile2 = PatternProtector.compile("tid=(\\d+) ([a-zA-Z]+)$");
        Matcher matcher = patternCompile.matcher(str);
        if (matcher.find() && matcher.groupCount() == 2) {
            this.LIZ = matcher.group(1);
            String strGroup = matcher.group(2);
            Matcher matcher2 = patternCompile2.matcher(strGroup);
            if (matcher2.find() && matcher2.groupCount() == 2) {
                CastIntegerProtector.parseInt(matcher2.group(1));
                this.LIZIZ = matcher2.group(2);
                this.LJII = true;
            } else if ("(not attached)".equals(strGroup)) {
                this.LJII = false;
            }
            if (!this.LJII) {
                i = 1;
            } else {
                if (!((String) ListProtector.get(this.LJIIIZ, 1)).startsWith("  | group=")) {
                    return false;
                }
                i = 2;
            }
            int i2 = i + 1;
            Matcher matcher3 = PatternProtector.compile("^  \\| sysTid=(\\d+) nice=(-?)(\\d+) .*$").matcher((String) ListProtector.get(this.LJIIIZ, i));
            if (!matcher3.find() || matcher3.groupCount() != 3) {
                return false;
            }
            this.LJ = CastIntegerProtector.parseInt(matcher3.group(1));
            this.LJFF = CastIntegerProtector.parseInt(matcher3.group(3));
            if ("-".equals(matcher3.group(2))) {
                this.LJFF = -this.LJFF;
            }
            HashMap<String, JSONArray> map = this.LJIIL;
            if (map != null) {
                this.LJIIJJI = map.get(matcher3.group(1));
            }
            int i3 = i2 + 1;
            Matcher matcher4 = PatternProtector.compile("^  \\| state=([A-Z?]) schedstat=\\((.*)\\) utm=(\\d+) stm=(\\d+) core=(\\d+) HZ=\\d+$").matcher((String) ListProtector.get(this.LJIIIZ, i2));
            if (!matcher4.find() || matcher4.groupCount() != 5) {
                return false;
            }
            matcher4.group(1);
            this.LIZJ = CastLongProtector.parseLong(matcher4.group(3));
            this.LIZLLL = CastLongProtector.parseLong(matcher4.group(4));
            CastIntegerProtector.parseInt(matcher4.group(5));
            String strGroup2 = matcher4.group(2);
            if (strGroup2 != null) {
                String[] strArrSplit = strGroup2.trim().split(" ");
                if (strArrSplit.length == 3) {
                    CastLongProtector.parseLong(strArrSplit[0]);
                    CastLongProtector.parseLong(strArrSplit[1]);
                    CastLongProtector.parseLong(strArrSplit[2]);
                }
            }
            if (this.LJII) {
                int i4 = i3 + 1;
                if (!((String) ListProtector.get(this.LJIIIZ, i3)).startsWith("  | stack=")) {
                    return false;
                }
                i3 = i4;
            }
            if (this.LJII && ((String) ListProtector.get(this.LJIIIZ, i3)).startsWith("  | held mutexes=")) {
                i3++;
            }
            ArrayList<String> arrayList = this.LJIIIZ;
            if (i3 < arrayList.size()) {
                String str2 = (String) ListProtector.get(arrayList, i3);
                if (this.LJIIJJI != null && str2.contains("Unwind failed for thread")) {
                    this.LJIIIIZZ = true;
                    try {
                        this.LJIIIZ.remove(i3);
                        int i5 = 0;
                        int i6 = i3;
                        while (i5 < this.LJIIJJI.length()) {
                            this.LJIIIZ.add(i6, JSONArrayProtectorUtils.getString(this.LJIIJJI, i5));
                            i5++;
                            i6++;
                        }
                        length = this.LJIIJJI.length();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
            this.LJI = i3 + length;
            return true;
        }
        return false;
    }

    public C0VJJ(ArrayList<String> arrayList, HashMap<String, JSONArray> map) {
        this.LJIIIZ = arrayList;
        this.LJIIL = map;
    }
}
