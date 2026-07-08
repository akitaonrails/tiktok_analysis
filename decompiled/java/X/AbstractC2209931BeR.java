package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1BeR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2209931BeR implements Cloneable {
    public static final SimpleDateFormat LLJJJJ = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    public static final C2210191Ber LLJJJJJIL = new C08UT<HashMap<String, AbstractC2209931BeR>>() { // from class: X.1Ber
        @Override // X.C08UT
        public final Object LIZ() {
            HashMap map = new HashMap();
            map.put("page", new C2209991BeX());
            map.put("launch", new C2209971BeV());
            map.put("terminate", new C2210011BeZ());
            map.put("pack", new C2209881BeM());
            AbstractC2209931BeR[] abstractC2209931BeRArrLIZLLL = AbstractC2209931BeR.LIZLLL();
            int i = 0;
            do {
                AbstractC2209931BeR abstractC2209931BeR = abstractC2209931BeRArrLIZLLL[i];
                map.put(abstractC2209931BeR.LJIIIZ(), abstractC2209931BeR);
                i++;
            } while (i < 3);
            return map;
        }
    };
    public long LL;
    public long LLILLJJLI;
    public long LLILLL;
    public String LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public int LLJJ = -1;
    public int LLJJI;
    public long LLJJIII;
    public long LLJJIJI;
    public int LLJJIJIIJIL;
    public final List<String> LLJJIJIL;
    public C2210811Bfr LLJJJ;
    public JSONObject LLJJJIL;

    public static AbstractC2209931BeR[] LIZLLL() {
        return new AbstractC2209931BeR[]{new C2209961BeU(), new C2209941BeS(null, null, null), new C2209981BeW(null, "", new JSONObject())};
    }

    public String LJFF() {
        return null;
    }

    public abstract String LJII();

    public abstract String LJIIIZ();

    public abstract JSONObject LJIJ();

    public List<String> LJ() {
        return Arrays.asList("_id", "integer primary key autoincrement", "local_time_ms", "integer", "tea_event_index", "integer", "nt", "integer", "user_id", "integer", "uid", "integer", "session_id", "varchar", "user_unique_id", "varchar", "ab_sdk_version", "varchar", "user_type", "integer", "user_is_login", "integer", "user_is_auth", "integer", "_app_id", "varchar", "priority", "integer", "forward", "integer", "_local_event_id", "varchar", "monitor_id", "integer", "event_stained", "integer");
    }

    public final InterfaceC2209561Bdq LJIIIIZZ() {
        InterfaceC2209561Bdq interfaceC2209561Bdq = (InterfaceC2209561Bdq) ((ConcurrentHashMap) AbstractC20103413lI.LIZJ).get(this.LLJILJILJ);
        return interfaceC2209561Bdq != null ? interfaceC2209561Bdq : C2209791BeD.LJIJJ();
    }

    public final JSONObject LJIILJJIL() {
        JSONObject jSONObject = new JSONObject();
        try {
            this.LLJILLL = LLJJJJ.format(new Date(this.LLILLJJLI));
            jSONObject = LJIJ();
            return jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2209901BeO c2209901BeOLIZ = C1BF5.LIZ(this.LLJILJILJ);
            if (c2209901BeOLIZ != null) {
                c2209901BeOLIZ.LJJJJLI.LIZIZ(EnumC2210021Bea.PACK_ERROR_COUNT, 1);
                if (th instanceof JSONException) {
                    c2209901BeOLIZ.LJJJJLI.LIZIZ(EnumC2210021Bea.JSON_ERROR_COUNT, 1);
                }
                C2209921BeQ c2209921BeQ = c2209901BeOLIZ.LJJJJLI;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(LJIIIZ());
                sbLIZ.append(" to pack json failed");
                c2209921BeQ.LJI(C2188811AlT.LIZIZ(sbLIZ), th, true);
            }
            LJIIIIZZ().LJIILLIIL(4, this.LLJJIJIL, "toPackJson failed", th, new Object[0]);
            return jSONObject;
        }
    }

    public AbstractC2209931BeR() {
        LJIIL(0L);
        long jIncrementAndGet = C830270Whd.LIZ.incrementAndGet();
        this.LLJJIII = jIncrementAndGet;
        this.LLJJIJI = jIncrementAndGet;
        this.LLJJIJIL = Collections.singletonList(LJIIIZ());
    }

    @Override // 
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public AbstractC2209931BeR clone() {
        try {
            AbstractC2209931BeR abstractC2209931BeR = (AbstractC2209931BeR) super.clone();
            abstractC2209931BeR.getClass();
            long jIncrementAndGet = C830270Whd.LIZ.incrementAndGet();
            abstractC2209931BeR.LLJJIII = jIncrementAndGet;
            abstractC2209931BeR.LLJJIJI = jIncrementAndGet;
            return abstractC2209931BeR;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJIIIIZZ().LJIILLIIL(4, this.LLJJIJIL, "Clone data failed", th, new Object[0]);
            return null;
        }
    }

    public final String LIZIZ() {
        List<String> listLJ = LJ();
        if (listLJ == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("create table if not exists ");
        sb.append(LJIIIZ());
        sb.append(e3.h);
        for (int i = 0; i < listLJ.size(); i += 2) {
            sb.append((String) ListProtector.get(listLJ, i));
            sb.append(" ");
            sb.append((String) ListProtector.get(listLJ, i + 1));
            sb.append(",");
        }
        sb.delete(sb.length() - 1, sb.length());
        sb.append(")");
        return sb.toString();
    }

    public String LJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sid:");
        sbLIZ.append(this.LLILZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public long LJIILIIL() {
        String strLJI = LJI();
        long length = C2200271B9l.LJII(strLJI) ? 0 + ((long) strLJI.length()) : 0L;
        String strLJFF = LJFF();
        return C2200271B9l.LJII(strLJFF) ? length + ((long) strLJFF.length()) : length;
    }

    public String toString() {
        String strLJIIIZ = LJIIIZ();
        if (!getClass().getSimpleName().equalsIgnoreCase(strLJIIIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJIIIZ);
            sbLIZ.append(", ");
            sbLIZ.append(getClass().getSimpleName());
            strLJIIIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        String strSubstring = this.LLILZ;
        String str = "-";
        if (strSubstring != null) {
            int iIndexOf = strSubstring.indexOf("-");
            if (iIndexOf >= 0) {
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
            str = strSubstring;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("{");
        sbLIZ2.append(strLJIIIZ);
        sbLIZ2.append(", ");
        sbLIZ2.append(LJI());
        sbLIZ2.append(", ");
        sbLIZ2.append(str);
        sbLIZ2.append(", ");
        sbLIZ2.append(this.LLILLJJLI);
        sbLIZ2.append(", id=");
        sbLIZ2.append(this.LLJJIII);
        sbLIZ2.append("}");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(org.json.JSONObject r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.LLJILJILJ
            X.1BeO r0 = X.C1BF5.LIZ(r0)
            if (r0 == 0) goto L55
            boolean r0 = r0.LJJI
            if (r0 == 0) goto L55
            r5 = 1
        Ld:
            r3 = 0
            if (r5 != 0) goto L17
            long r1 = r6.LLILZIL
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L20
        L17:
            java.lang.String r2 = "user_id"
            long r0 = r6.LLILZIL
            r7.put(r2, r0)
            if (r5 != 0) goto L26
        L20:
            long r1 = r6.LLILZLL
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L2f
        L26:
            java.lang.String r2 = "uid"
            long r0 = r6.LLILZLL
            r7.put(r2, r0)
            if (r5 != 0) goto L33
        L2f:
            int r0 = r6.LLJI
            if (r0 <= 0) goto L3c
        L33:
            java.lang.String r1 = "user_type"
            int r0 = r6.LLJI
            r7.put(r1, r0)
            if (r5 != 0) goto L40
        L3c:
            int r0 = r6.LLJIJIL
            if (r0 <= 0) goto L49
        L40:
            java.lang.String r1 = "user_is_login"
            int r0 = r6.LLJIJIL
            r7.put(r1, r0)
            if (r5 != 0) goto L4d
        L49:
            int r0 = r6.LLJILJIL
            if (r0 <= 0) goto L54
        L4d:
            java.lang.String r1 = "user_is_auth"
            int r0 = r6.LLJILJIL
            r7.put(r1, r0)
        L54:
            return
        L55:
            r5 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2209931BeR.LIZJ(org.json.JSONObject):void");
    }

    public void LJIIJ(Cursor cursor) {
        this.LL = cursor.getLong(0);
        this.LLILLJJLI = cursor.getLong(1);
        this.LLILLL = cursor.getLong(2);
        this.LLJ = cursor.getInt(3);
        this.LLILZIL = cursor.getLong(4);
        this.LLILZLL = cursor.getLong(5);
        this.LLILZ = cursor.getString(6);
        this.LLIZ = cursor.getString(7);
        this.LLIZLLLIL = cursor.getString(8);
        this.LLJI = cursor.getInt(9);
        this.LLJIJIL = cursor.getInt(10);
        this.LLJILJIL = cursor.getInt(11);
        this.LLJILJILJ = cursor.getString(12);
        this.LLJJ = cursor.getInt(13);
        this.LLJJI = cursor.getInt(14);
        String string = cursor.getString(15);
        if (C2200271B9l.LJII(string)) {
            try {
                this.LLJJIII = CastLongProtector.parseLong(string);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        this.LLJJIJI = cursor.getLong(16);
        this.LLJJIJIIJIL = cursor.getInt(17);
    }

    public AbstractC2209931BeR LJIIJJI(JSONObject jSONObject) {
        this.LLILLJJLI = jSONObject.optLong("local_time_ms", 0L);
        this.LL = 0L;
        this.LLILLL = 0L;
        this.LLJ = 0;
        this.LLILZIL = 0L;
        this.LLILZLL = 0L;
        this.LLILZ = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJI = 0;
        this.LLJIJIL = 0;
        this.LLJILJIL = 0;
        this.LLJILJILJ = jSONObject.optString("_app_id");
        this.LLJJ = jSONObject.optInt("priority", -1);
        this.LLJJI = jSONObject.optInt("forward");
        this.LLJJIII = jSONObject.optLong("_local_event_id", 0L);
        this.LLJJIJI = jSONObject.optLong("monitor_id", 0L);
        return this;
    }

    public final void LJIIL(long j) {
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        this.LLILLJJLI = j;
    }

    public void LJIILL(ContentValues contentValues) {
        contentValues.put("local_time_ms", Long.valueOf(this.LLILLJJLI));
        contentValues.put("tea_event_index", Long.valueOf(this.LLILLL));
        contentValues.put("nt", Integer.valueOf(this.LLJ));
        contentValues.put("user_id", Long.valueOf(this.LLILZIL));
        contentValues.put("uid", Long.valueOf(this.LLILZLL));
        contentValues.put("session_id", this.LLILZ);
        contentValues.put("user_unique_id", this.LLIZ);
        contentValues.put("ab_sdk_version", this.LLIZLLLIL);
        contentValues.put("user_type", Integer.valueOf(this.LLJI));
        contentValues.put("user_is_login", Integer.valueOf(this.LLJIJIL));
        contentValues.put("user_is_auth", Integer.valueOf(this.LLJILJIL));
        contentValues.put("_app_id", this.LLJILJILJ);
        contentValues.put("priority", Integer.valueOf(this.LLJJ));
        contentValues.put("forward", Integer.valueOf(this.LLJJI));
        contentValues.put("_local_event_id", String.valueOf(this.LLJJIII));
        contentValues.put("monitor_id", Long.valueOf(this.LLJJIJI));
        contentValues.put("event_stained", Integer.valueOf(this.LLJJIJIIJIL));
    }

    public void LJIILLIIL(JSONObject jSONObject) {
        jSONObject.put("local_time_ms", this.LLILLJJLI);
        jSONObject.put("_app_id", this.LLJILJILJ);
        jSONObject.put("priority", this.LLJJ);
        jSONObject.put("forward", this.LLJJI);
        jSONObject.put("_local_event_id", this.LLJJIII);
        jSONObject.put("monitor_id", this.LLJJIJI);
    }
}
