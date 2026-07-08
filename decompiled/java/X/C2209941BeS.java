package X;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BeS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2209941BeS extends AbstractC2209931BeR {
    public String LLJJJJLIIL;
    public JSONObject LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public String LLJLIL;
    public final boolean LLJLILLLLZIIL;

    @Override // X.AbstractC2209931BeR
    public String LJIIIZ() {
        return "eventv3";
    }

    @Override // X.AbstractC2209931BeR
    public final JSONObject LJIJ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("local_time_ms", this.LLILLJJLI);
        jSONObject.put("tea_event_index", this.LLILLL);
        jSONObject.put("session_id", this.LLILZ);
        LIZJ(jSONObject);
        if (!TextUtils.isEmpty(this.LLIZ)) {
            jSONObject.put("user_unique_id", this.LLIZ);
        }
        jSONObject.put("event", this.LLJL);
        if (this.LLJJLIIIJLLLLLLLZ) {
            jSONObject.put("is_bav", 1);
        }
        if (TextUtils.isEmpty(this.LLJJJJLIIL)) {
            JSONObject jSONObject2 = this.LLJJL;
            if (jSONObject2 != null) {
                C2210241Bew.LIZIZ(this, jSONObject2);
                jSONObject.put("params", jSONObject2);
            }
        } else {
            JSONObject jSONObject3 = new JSONObject(this.LLJJJJLIIL);
            C2210241Bew.LIZIZ(this, jSONObject3);
            jSONObject.put("params", jSONObject3);
        }
        if (this.LLJ != EnumC804620VhM.UNKNOWN.getValue()) {
            jSONObject.put("nt", this.LLJ);
        }
        jSONObject.put("datetime", this.LLJILLL);
        if (!TextUtils.isEmpty(this.LLIZLLLIL)) {
            jSONObject.put("ab_sdk_version", this.LLIZLLLIL);
        }
        if (!TextUtils.isEmpty(this.LLJLIL)) {
            jSONObject.put("disable_personalization", CastIntegerProtector.valueOf(this.LLJLIL));
        }
        long j = this.LLJJIII;
        if (j > 0) {
            jSONObject.put("event_id", j);
        }
        long j2 = this.LLJJIJI;
        if (j2 > 0) {
            jSONObject.put("monitor_id", String.valueOf(j2));
        }
        int i = this.LLJJIJIIJIL;
        if (i > 0) {
            jSONObject.put("event_stained", i);
        }
        C2210811Bfr c2210811Bfr = this.LLJJJ;
        if (c2210811Bfr != null) {
            jSONObject.putOpt("__pid", c2210811Bfr.LIZ);
            jSONObject.putOpt("__pname", c2210811Bfr.LIZIZ);
            jSONObject.putOpt("__sdk_pid", c2210811Bfr.LIZJ);
        }
        return jSONObject;
    }

    public final void LJIJI() {
        JSONObject jSONObject = this.LLJJL;
        if (jSONObject != null) {
            LJIJJ(C786410Ut5.J3(jSONObject));
        }
    }

    @Override // X.AbstractC2209931BeR
    /* JADX INFO: renamed from: LIZ */
    public final AbstractC2209931BeR clone() {
        C2209941BeS c2209941BeS = (C2209941BeS) super.clone();
        c2209941BeS.LJIJI();
        return c2209941BeS;
    }

    @Override // X.AbstractC2209931BeR
    public final List<String> LJ() {
        List<String> listLJ = super.LJ();
        ArrayList arrayList = new ArrayList(listLJ.size());
        arrayList.addAll(listLJ);
        arrayList.addAll(Arrays.asList("event", "varchar", "params", "varchar", "is_bav", "integer", "disable_personalization", "varchar", "page_info", "varchar"));
        return arrayList;
    }

    @Override // X.AbstractC2209931BeR
    public final long LJIILIIL() {
        return super.LJIILIIL();
    }

    @Override // X.AbstractC2209931BeR
    public final /* bridge */ /* synthetic */ Object clone() {
        return clone();
    }

    @Override // X.AbstractC2209931BeR
    public final String LJFF() {
        return this.LLJJJJLIIL;
    }

    @Override // X.AbstractC2209931BeR
    public final String LJI() {
        return this.LLJL;
    }

    @Override // X.AbstractC2209931BeR
    public final String LJII() {
        return this.LLJL;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    @Override // X.AbstractC2209931BeR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(android.database.Cursor r5) {
        /*
            r4 = this;
            super.LJIIJ(r5)
            r0 = 18
            java.lang.String r0 = r5.getString(r0)
            r4.LLJL = r0
            r0 = 19
            java.lang.String r0 = r5.getString(r0)
            r4.LJIJJ(r0)
            r0 = 20
            int r1 = r5.getInt(r0)
            r0 = 1
            if (r1 == r0) goto L1e
            r0 = 0
        L1e:
            r4.LLJJLIIIJLLLLLLLZ = r0
            r0 = 21
            java.lang.String r0 = r5.getString(r0)
            r4.LLJLIL = r0
            r0 = 22
            java.lang.String r2 = r5.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L6c
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L68
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = "pid"
            java.lang.String r3 = r1.optString(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = "pName"
            java.lang.String r2 = r1.optString(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = "sdkPageId"
            java.lang.String r1 = r1.optString(r0)     // Catch: java.lang.Throwable -> L63
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L5d
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L5d
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L63
            if (r0 != 0) goto L6c
        L5d:
            X.1Bfr r0 = new X.1Bfr     // Catch: java.lang.Throwable -> L63
            r0.<init>(r3, r2, r1)     // Catch: java.lang.Throwable -> L63
            goto L6d
        L63:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L68
            goto L6c
        L68:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L6c:
            r0 = 0
        L6d:
            r4.LLJJJ = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2209941BeS.LJIIJ(android.database.Cursor):void");
    }

    @Override // X.AbstractC2209931BeR
    public final AbstractC2209931BeR LJIIJJI(JSONObject jSONObject) {
        super.LJIIJJI(jSONObject);
        this.LLJL = jSONObject.optString("event", null);
        LJIJJ(jSONObject.optString("params", null));
        this.LLJJLIIIJLLLLLLLZ = jSONObject.optBoolean("is_bav", false);
        this.LLJLIL = jSONObject.optString("disable_personalization", null);
        return this;
    }

    @Override // X.AbstractC2209931BeR
    public final void LJIILL(ContentValues contentValues) throws JSONException {
        String strJ3;
        C2209541Bdo c2209541Bdo;
        C2209541Bdo c2209541Bdo2;
        super.LJIILL(contentValues);
        contentValues.put("event", this.LLJL);
        if (C2210531BfP.LIZ) {
            strJ3 = C2210061Bee.LIZIZ(this.LLJILJILJ, EnumC2176421AFs.V3_EVENT, this.LLJL, this.LLJJJJLIIL);
        } else {
            strJ3 = this.LLJJJJLIIL;
        }
        String strJ32 = null;
        if (strJ3 != null) {
            C2209901BeO c2209901BeOLIZ = C1BF5.LIZ(this.LLJILJILJ);
            if (c2209901BeOLIZ != null && (c2209541Bdo2 = c2209901BeOLIZ.LJLIIL) != null) {
                for (InterfaceC2211441Bgs interfaceC2211441Bgs : (CopyOnWriteArrayList) c2209541Bdo2.LIZ) {
                    if (interfaceC2211441Bgs instanceof AbstractC2210771Bfn) {
                        strJ3 = ((AbstractC2210771Bfn) interfaceC2211441Bgs).LIZIZ(this, strJ3);
                    }
                }
            }
        } else {
            JSONObject jSONObject = this.LLJJL;
            C2209901BeO c2209901BeOLIZ2 = C1BF5.LIZ(this.LLJILJILJ);
            if (c2209901BeOLIZ2 != null && (c2209541Bdo = c2209901BeOLIZ2.LJLIIL) != null) {
                for (InterfaceC2211441Bgs interfaceC2211441Bgs2 : (CopyOnWriteArrayList) c2209541Bdo.LIZ) {
                    if (interfaceC2211441Bgs2 instanceof AbstractC2210771Bfn) {
                        ((AbstractC2210771Bfn) interfaceC2211441Bgs2).LIZJ(this, jSONObject);
                    }
                }
            }
            if (jSONObject != null) {
                strJ3 = C786410Ut5.J3(jSONObject);
            }
        }
        contentValues.put("params", strJ3);
        contentValues.put("is_bav", Integer.valueOf(this.LLJJLIIIJLLLLLLLZ ? 1 : 0));
        contentValues.put("disable_personalization", this.LLJLIL);
        C2210811Bfr c2210811Bfr = this.LLJJJ;
        if (c2210811Bfr != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("pid", c2210811Bfr.LIZ);
            jSONObject2.put("pName", c2210811Bfr.LIZIZ);
            jSONObject2.put("sdkPageId", c2210811Bfr.LIZJ);
            strJ32 = C786410Ut5.J3(jSONObject2);
        }
        contentValues.put("page_info", strJ32);
    }

    @Override // X.AbstractC2209931BeR
    public final void LJIILLIIL(JSONObject jSONObject) throws JSONException {
        super.LJIILLIIL(jSONObject);
        jSONObject.put("event", this.LLJL);
        LJIJI();
        jSONObject.put("params", this.LLJJJJLIIL);
        jSONObject.put("is_bav", this.LLJJLIIIJLLLLLLLZ);
        jSONObject.put("disable_personalization", this.LLJLIL);
    }

    public final void LJIJJ(String str) {
        this.LLJJJJLIIL = str;
        this.LLJJL = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0155, code lost:
    
        r4 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJIJJLI(X.C2209621Bdw r11) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2209941BeS.LJIJJLI(X.1Bdw):void");
    }

    public C2209941BeS(String str, String str2) {
        this.LLJILJILJ = str;
        this.LLJL = str2;
    }

    public C2209941BeS(String str, String str2, String str3) {
        this(str, str2, str3, null, false);
    }

    public C2209941BeS(String str, String str2, String str3, JSONObject jSONObject, boolean z) {
        this.LLJILJILJ = str;
        this.LLJL = str2;
        this.LLJJLIIIJLLLLLLLZ = false;
        this.LLJJJJLIIL = str3;
        this.LLJJL = jSONObject;
        C2209901BeO c2209901BeOLIZ = C1BF5.LIZ(str);
        if (c2209901BeOLIZ != null && c2209901BeOLIZ.LJJJJZ != null) {
            this.LLJLIL = String.valueOf(c2209901BeOLIZ.LJJJJZ);
        }
        this.LLJLILLLLZIIL = z;
    }
}
