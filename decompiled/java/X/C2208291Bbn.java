package X;

import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bbn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2208291Bbn {
    public final CommentImageModel LIZ;
    public long LIZIZ = 0;
    public long LIZJ = 0;
    public int LIZLLL = 0;
    public long LJ = -1;
    public String LJFF = "";
    public String LJI = "";
    public boolean LJII = false;
    public boolean LJIIIIZZ = false;
    public long LJIIIZ = 0;
    public long LJIIJ = 0;
    public long LJIIJJI = 0;
    public long LJIIL = 0;
    public int LJIILIIL = 0;
    public int LJIILJJIL = 0;
    public long LJIILL = -1;
    public String LJIILLIIL = "";
    public int LJIIZILJ = 0;
    public int LJIJ = 0;
    public long LJIJI = 0;
    public String LJIJJ = "jpeg";
    public int LJIJJLI = 0;
    public int LJIL = 0;
    public long LJJ = 0;
    public String LJJI = "jpeg";
    public long LJJIFFI = 0;
    public long LJJII = 0;
    public int LJJIII = 0;
    public long LJJIIJ = -1;
    public String LJJIIJZLJL = "";
    public boolean LJJIIZ = false;
    public boolean LJJIIZI = false;
    public long LJJIJ = 0;
    public long LJJIJIIJI = 0;
    public int LJJIJIIJIL = 0;
    public long LJJIJIL = -1;
    public String LJJIJL = "";
    public int LJJIJLIJ = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2208291Bbn)) {
            return false;
        }
        C2208291Bbn c2208291Bbn = (C2208291Bbn) obj;
        return Intrinsics.LJFF(this.LIZ, c2208291Bbn.LIZ) && this.LIZIZ == c2208291Bbn.LIZIZ && this.LIZJ == c2208291Bbn.LIZJ && this.LIZLLL == c2208291Bbn.LIZLLL && this.LJ == c2208291Bbn.LJ && Intrinsics.LJFF(this.LJFF, c2208291Bbn.LJFF) && Intrinsics.LJFF(this.LJI, c2208291Bbn.LJI) && this.LJII == c2208291Bbn.LJII && this.LJIIIIZZ == c2208291Bbn.LJIIIIZZ && this.LJIIIZ == c2208291Bbn.LJIIIZ && this.LJIIJ == c2208291Bbn.LJIIJ && this.LJIIJJI == c2208291Bbn.LJIIJJI && this.LJIIL == c2208291Bbn.LJIIL && this.LJIILIIL == c2208291Bbn.LJIILIIL && this.LJIILJJIL == c2208291Bbn.LJIILJJIL && this.LJIILL == c2208291Bbn.LJIILL && Intrinsics.LJFF(this.LJIILLIIL, c2208291Bbn.LJIILLIIL) && this.LJIIZILJ == c2208291Bbn.LJIIZILJ && this.LJIJ == c2208291Bbn.LJIJ && this.LJIJI == c2208291Bbn.LJIJI && Intrinsics.LJFF(this.LJIJJ, c2208291Bbn.LJIJJ) && this.LJIJJLI == c2208291Bbn.LJIJJLI && this.LJIL == c2208291Bbn.LJIL && this.LJJ == c2208291Bbn.LJJ && Intrinsics.LJFF(this.LJJI, c2208291Bbn.LJJI) && this.LJJIFFI == c2208291Bbn.LJJIFFI && this.LJJII == c2208291Bbn.LJJII && this.LJJIII == c2208291Bbn.LJJIII && this.LJJIIJ == c2208291Bbn.LJJIIJ && Intrinsics.LJFF(this.LJJIIJZLJL, c2208291Bbn.LJJIIJZLJL) && this.LJJIIZ == c2208291Bbn.LJJIIZ && this.LJJIIZI == c2208291Bbn.LJJIIZI && this.LJJIJ == c2208291Bbn.LJJIJ && this.LJJIJIIJI == c2208291Bbn.LJJIJIIJI && this.LJJIJIIJIL == c2208291Bbn.LJJIJIIJIL && this.LJJIJIL == c2208291Bbn.LJJIJIL && Intrinsics.LJFF(this.LJJIJL, c2208291Bbn.LJJIJL) && this.LJJIJLIJ == c2208291Bbn.LJJIJLIJ;
    }

    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_pre_compress", this.LJII);
        jSONObject.put("compress_duration", this.LJIIJJI - this.LJIIIZ);
        jSONObject.put("compress_video_duration", this.LJIIL - this.LJIIJ);
        jSONObject.put("compress_video_status", this.LJIILJJIL);
        jSONObject.put("is_pre_compress_video", this.LJIIIIZZ);
        jSONObject.put("auth_duration", this.LIZJ - this.LIZIZ);
        jSONObject.put("upload_duration", this.LJJII - this.LJJIFFI);
        jSONObject.put("post_duration", this.LJJIJIIJI - this.LJJIJ);
        jSONObject.put("compress_status", this.LJIILIIL);
        jSONObject.put("auth_status", this.LIZLLL);
        jSONObject.put("upload_status", this.LJJIII);
        jSONObject.put("post_status", this.LJJIJIIJIL);
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, this.LJJIJLIJ);
        jSONObject.put("original_width", this.LJIJJLI);
        jSONObject.put("original_height", this.LJIL);
        jSONObject.put("original_size", this.LJJ);
        jSONObject.put("original_format", this.LJJI);
        jSONObject.put("width", this.LJIIZILJ);
        jSONObject.put("height", this.LJIJ);
        jSONObject.put("size", this.LJIJI);
        jSONObject.put("format", this.LJIJJ);
        jSONObject.put("auth_error_code", this.LJ);
        jSONObject.put("auth_error_msg", this.LJFF);
        jSONObject.put("auth_log_id", this.LJI);
        jSONObject.put("compress_error_code", this.LJIILL);
        jSONObject.put("compress_error_msg", this.LJIILLIIL);
        jSONObject.put("upload_error_code", this.LJJIIJ);
        jSONObject.put("upload_error_msg", this.LJJIIJZLJL);
        jSONObject.put("is_live_photo_upload", this.LJJIIZ ? 1 : 0);
        jSONObject.put("is_live_photo_upload_success", this.LJJIIZI ? 1 : 0);
        jSONObject.put("post_error_code", this.LJJIJIL);
        jSONObject.put("post_error_msg", this.LJJIJL);
        return jSONObject;
    }

    public C2208291Bbn(CommentImageModel commentImageModel) {
        this.LIZ = commentImageModel;
    }
}
