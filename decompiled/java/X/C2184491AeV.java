package X;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* JADX INFO: renamed from: X.1AeV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2184491AeV {
    public Configuration LIZIZ;
    public boolean LIZJ;
    public int LIZ = -1;
    public final ComponentCallbacksC2184541Aea LIZLLL = new ComponentCallbacks() { // from class: X.1Aea
        @Override // android.content.ComponentCallbacks
        public final void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks
        public final void onConfigurationChanged(Configuration configuration) {
            C2184491AeV c2184491AeV = this.LL;
            c2184491AeV.LIZJ = false;
            c2184491AeV.LIZIZ = configuration;
        }
    };
}
