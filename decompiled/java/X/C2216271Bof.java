package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bof, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2216271Bof {
    public static final C2216271Bof LIZ = new C2216271Bof();
    public static final boolean[] LIZIZ;
    public static final boolean[] LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ea  */
    static {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2216271Bof.<clinit>():void");
    }

    public static Pair LIZ(String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new Pair(Boolean.valueOf(jSONObject.optBoolean("is_fast_import", false)), Boolean.valueOf(jSONObject.optBoolean("depend_hwdecode", false)));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C201955140j.LJI("expand_hw_decoder_list_by_bytebench", new Throwable("json parse fail"));
                Boolean bool = Boolean.FALSE;
                return new Pair(bool, bool);
            }
        }
        Boolean bool2 = Boolean.FALSE;
        return new Pair(bool2, bool2);
    }
}
