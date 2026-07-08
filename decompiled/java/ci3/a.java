package ci3;

import X.C0W9T;
import X.C0W9U;
import X.C0WP5;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes14.dex */
public class a extends HandlerThread {
    public final C0W9T bpeaTraceContext;

    public final C0W9T getBpeaTraceContext() {
        return this.bpeaTraceContext;
    }

    public a(String str) {
        C0W9T c0w9tLIZIZ;
        super(str);
        if (C0WP5.LIZ && C0WP5.LIZJ) {
            c0w9tLIZIZ = C0W9U.LIZIZ();
        } else {
            c0w9tLIZIZ = null;
        }
        this.bpeaTraceContext = c0w9tLIZIZ;
    }

    public a(String str, int i) {
        C0W9T c0w9tLIZIZ;
        super(str, i);
        if (C0WP5.LIZ && C0WP5.LIZJ) {
            c0w9tLIZIZ = C0W9U.LIZIZ();
        } else {
            c0w9tLIZIZ = null;
        }
        this.bpeaTraceContext = c0w9tLIZIZ;
    }
}
