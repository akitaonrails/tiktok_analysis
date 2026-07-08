package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ncB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1441490ncB {
    public int LIZIZ;
    public Integer LIZJ;
    public Boolean LIZLLL;
    public Boolean LJ;
    public Integer LJFF;
    public int LJI;
    public long LJIIIIZZ;
    public String LIZ = "";
    public Boolean LJII = Boolean.FALSE;
    public String LJIIIZ = "";

    public final JSONObject LIZ() {
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("stage", 2);
        c543670LTx.LIZ.put("aweme_id", this.LIZ);
        c543670LTx.LIZ.put("match_factors", Integer.valueOf(this.LIZIZ));
        c543670LTx.LIZ.put("origin", this.LIZJ);
        c543670LTx.LIZ.put("is_draft", this.LIZLLL);
        c543670LTx.LIZ.put("is_backup", this.LJ);
        Integer num = this.LJFF;
        c543670LTx.LIZ.put("err_code", Integer.valueOf(num != null ? num.intValue() : 0));
        c543670LTx.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(this.LJI));
        c543670LTx.LIZ.put("is_retry", this.LJII);
        c543670LTx.LIZ.put("upload_err_code", Long.valueOf(this.LJIIIIZZ));
        c543670LTx.LIZ.put("description", this.LJIIIZ);
        return c543670LTx.LJ();
    }
}
