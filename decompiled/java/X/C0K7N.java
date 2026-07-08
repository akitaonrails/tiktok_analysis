package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.repository.PrivilegeRepository;

/* JADX INFO: renamed from: X.0K7N, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K7N extends LruCache<String, PrivilegeRepository> {
    public static final C0K7N LIZ = new C0K7N();

    public C0K7N() {
        super(100);
    }
}
