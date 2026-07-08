package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzbf;

/* JADX INFO: renamed from: X.12ZR, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C12ZR implements InterfaceC19804312e9 {
    public final /* synthetic */ C12Z4 LIZ;

    public C12ZR(C12Z4 c12z4) {
        this.LIZ = c12z4;
    }

    @Override // X.InterfaceC19804312e9
    public final void LIZ(final String str, final String str2, final Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            C19804712eD c19804712eD = this.LIZ.LJIIJJI;
            if (c19804712eD != null) {
                c19804712eD.LJIILJJIL().LJFF.LIZ(str2, "AppId not known when logging event");
                return;
            }
            return;
        }
        this.LIZ.LJIIL().LJIILL(new Runnable(this) { // from class: X.12ZM
            public final /* synthetic */ C12ZR LLILZ;

            public final void LIZ() throws Throwable {
                C19803112dx c19803112dxLJJJJZI = this.LLILZ.LIZ.LJJJJZI();
                String str3 = str2;
                Bundle bundle2 = bundle;
                this.LLILZ.LIZ.LIZ().getClass();
                zzbf zzbfVarLJIJJLI = c19803112dxLJJJJZI.LJIJJLI(str3, bundle2, "auto", System.currentTimeMillis(), false);
                C12Z4 c12z4 = this.LLILZ.LIZ;
                C0W3J.LJIIIIZZ(zzbfVarLJIJJLI);
                c12z4.LJIIZILJ(zzbfVarLJIJJLI, str);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzni@39bc.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzni@39bc.run");
            }

            {
                this.LLILZ = this;
            }
        });
    }
}
