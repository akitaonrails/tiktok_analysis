package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.ur.socialavatar.UpdateSocialAvatarStruct;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0iVY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1245180iVY {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public boolean LIZLLL;
    public EnumC992830bwX LJ;
    public String LJFF;
    public String LJI;
    public UpdateSocialAvatarStruct LJII;

    public final Map<String, String> LIZ() {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(null)) {
            map.put("nickname", null);
        }
        if (!TextUtils.isEmpty(null)) {
            map.put("unique_id", null);
        }
        if (!TextUtils.isEmpty(this.LIZ)) {
            map.put("avatar_uri", this.LIZ);
        }
        if (this.LIZLLL) {
            map.put("video_icon_virtual_URI", "");
        } else if (!TextUtils.isEmpty(this.LIZIZ)) {
            map.put("video_icon_virtual_URI", this.LIZIZ);
        }
        if (!TextUtils.isEmpty(null)) {
            map.put("school_name", null);
        }
        if (!TextUtils.isEmpty(null)) {
            map.put("ins_id", null);
        }
        if (!TextUtils.isEmpty(null)) {
            map.put("google_account", null);
        }
        if (!TextUtils.isEmpty(null)) {
            map.put("youtube_channel_id", null);
        }
        if (!TextUtils.isEmpty(null)) {
            map.put("youtube_channel_title", null);
        }
        String str = this.LJFF;
        if (str != null) {
            map.put("bio_url", str);
        }
        String str2 = this.LJI;
        if (str2 != null) {
            map.put("bio_email", str2);
        }
        EnumC992830bwX enumC992830bwX = this.LJ;
        if (enumC992830bwX != null) {
            map.put("avatar_source", String.valueOf(enumC992830bwX.getValue()));
        }
        if (this.LJII != null) {
            map.put("social_avatar", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), this.LJII));
        }
        String str3 = this.LIZJ;
        if (str3 != null) {
            map.put("static_avatar", str3);
        }
        return map;
    }
}
