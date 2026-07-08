package X;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.0VKN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0VKN {
    public final Context LIZ;
    public String LIZIZ;
    public C0VOE LIZJ;
    public boolean LIZLLL;

    public final C0VKQ LIZ() {
        if (this.LIZJ == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        if (this.LIZ == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        if (this.LIZLLL && TextUtils.isEmpty(this.LIZIZ)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new C0VKQ(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    public C0VKN(Context context) {
        this.LIZ = context;
    }
}
