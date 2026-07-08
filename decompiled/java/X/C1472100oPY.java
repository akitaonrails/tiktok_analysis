package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: X.0oPY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1472100oPY implements Serializable {
    public final List<String> hosts;
    public final String token;
    public final int version;
    public final String vid;

    public final boolean isValid() {
        return (TextUtils.isEmpty(this.vid) || TextUtils.isEmpty(this.token) || this.hosts.isEmpty()) ? false : true;
    }

    public final String tryGetHost() {
        if (this.hosts.isEmpty()) {
            return null;
        }
        return (String) ListProtector.get(this.hosts, 0);
    }

    public C1472100oPY(String str, String str2, List<String> list, int i) {
        this.vid = str;
        this.token = str2;
        this.hosts = list;
        this.version = i;
    }
}
