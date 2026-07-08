package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.07jY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1944607jY {
    public final HashMap<String, String> LIZ;
    public final Uri.Builder LIZIZ;

    public final Uri LIZIZ() {
        for (Map.Entry<String, String> entry : this.LIZ.entrySet()) {
            this.LIZIZ.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return this.LIZIZ.build();
    }

    public C1944607jY(HashMap<String, String> map, Uri.Builder builder) {
        this.LIZ = map;
        this.LIZIZ = builder;
    }

    public final void LIZ(String str, String str2) {
        if (!TextUtils.isEmpty(this.LIZ.get("rn_schema"))) {
            this.LIZ.put("rn_schema", UriProtector.parse(this.LIZ.get("rn_schema")).buildUpon().appendQueryParameter(str, str2).build().toString());
        }
        if (!TextUtils.isEmpty(this.LIZ.get("url"))) {
            this.LIZ.put("url", UriProtector.parse(this.LIZ.get("url")).buildUpon().appendQueryParameter(str, str2).build().toString());
        }
    }
}
