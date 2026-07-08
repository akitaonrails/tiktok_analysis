package X;

import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Dd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21247918Dd {
    public static final /* synthetic */ int LJ = 0;
    public C589920NBu<Object> LIZ;
    public PageInfo LIZIZ;
    public EnumC21248118Df LIZJ = EnumC21248118Df.NOT_SURE;
    public boolean LIZLLL;

    public final String toString() {
        if (C18CS.LIZ.LIZLLL().LJIJI() != 1) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("pageInfo", String.valueOf(this.LIZIZ));
                jSONObject.put("flag", this.LIZJ.toString());
                jSONObject.put("sentEvent", this.LIZLLL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            return C786410Ut5.J3(jSONObject);
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append('{');
        C21248018De.LIZJ("pageInfo", sb);
        PageInfo pageInfo = this.LIZIZ;
        sb.append(pageInfo != null ? pageInfo.toString() : "null");
        C21248018De.LJ(sb, "flag", this.LIZJ.toString());
        C21248018De.LIZ(sb, "sentEvent", Boolean.valueOf(this.LIZLLL));
        sb.append('}');
        return sb.toString();
    }
}
