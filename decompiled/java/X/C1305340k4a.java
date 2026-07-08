package X;

import Y.ACallableS411S0100000_3;
import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0k4a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1305340k4a implements InterfaceC780290UjD {
    public static String LIZIZ;
    public WeakReference<InterfaceC780310UjF> LIZ;

    @Override // X.InterfaceC780290UjD
    public final String get() {
        String str = LIZIZ;
        if (str != null) {
            return str;
        }
        Context context = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context();
        if (context != null) {
            LIZIZ = (String) C1305440k4k.LIZIZ(context).LIZLLL("hardware_info_cpu_soc", EnumC1305450k4l.STRING, null);
        }
        return LIZIZ;
    }

    @Override // X.InterfaceC780290UjD
    public final void LIZ(InterfaceC780310UjF interfaceC780310UjF) {
        this.LIZ = new WeakReference<>(interfaceC780310UjF);
        C2339809Eu.LIZJ().LIZ(new ACallableS411S0100000_3(this, 3));
    }
}
