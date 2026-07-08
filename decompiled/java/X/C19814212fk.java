package X;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.12fk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19814212fk {
    public final String LIZ;
    public final Bundle LIZIZ;
    public Bundle LIZJ;
    public final /* synthetic */ C19804812eE LIZLLL;

    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011d A[Catch: NumberFormatException | JSONException -> 0x0125, JSONException -> 0x0127, TRY_LEAVE, TryCatch #3 {NumberFormatException | JSONException -> 0x0125, blocks: (B:9:0x0024, B:19:0x0050, B:42:0x0090, B:43:0x009f, B:45:0x00a5, B:47:0x00b3, B:49:0x00c5, B:50:0x00ce, B:51:0x00d2, B:53:0x00d8, B:55:0x00e6, B:57:0x00f8, B:58:0x0101, B:59:0x0105, B:60:0x0111, B:61:0x011d, B:22:0x0059, B:25:0x0063, B:28:0x006d, B:31:0x0077), top: B:77:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle LIZ() {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19814212fk.LIZ():android.os.Bundle");
    }

    public final void LIZIZ(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        SharedPreferences.Editor editorEdit = this.LIZLLL.LJIIZILJ().edit();
        if (bundle2.size() == 0) {
            editorEdit.remove(this.LIZ);
        } else {
            String str = this.LIZ;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                try {
                    Object obj = bundle2.get(str2);
                    if (obj != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("n", str2);
                            if (C19820512gl.LIZ()) {
                                try {
                                    if (this.LIZLLL.LIZ.LJI.LJIJI(null, C19817012gC.LJLILLLLZI)) {
                                        if (obj instanceof String) {
                                            jSONObject.put("v", String.valueOf(obj));
                                            jSONObject.put("t", "s");
                                        } else if (obj instanceof Long) {
                                            jSONObject.put("v", String.valueOf(obj));
                                            jSONObject.put("t", "l");
                                        } else if (obj instanceof int[]) {
                                            jSONObject.put("v", Arrays.toString((int[]) obj));
                                            jSONObject.put("t", "ia");
                                        } else if (obj instanceof long[]) {
                                            jSONObject.put("v", Arrays.toString((long[]) obj));
                                            jSONObject.put("t", "la");
                                        } else if (obj instanceof Double) {
                                            jSONObject.put("v", String.valueOf(obj));
                                            jSONObject.put("t", "d");
                                        } else {
                                            this.LIZLLL.LJIILJJIL().LJFF.LIZ(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                                        }
                                        jSONArray.put(jSONObject);
                                    }
                                } catch (JSONException e) {
                                    e = e;
                                    TryCatchGuardChecker.doCheck(e);
                                    this.LIZLLL.LJIILJJIL().LJFF.LIZ(e, "Cannot serialize bundle value to SharedPreferences");
                                }
                            }
                            jSONObject.put("v", String.valueOf(obj));
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                this.LIZLLL.LJIILJJIL().LJFF.LIZ(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        } catch (JSONException e2) {
                            e = e2;
                        }
                    }
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                } catch (OutOfMemoryError e4) {
                    TryCatchGuardChecker.doCheck(e4);
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.LIZJ = bundle2;
    }

    public C19814212fk(C19804812eE c19804812eE, String str) {
        this.LIZLLL = c19804812eE;
        C0W3J.LJI(str);
        this.LIZ = str;
        this.LIZIZ = new Bundle();
    }
}
