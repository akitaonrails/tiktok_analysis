package X;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.Iterator;

/* JADX INFO: renamed from: X.1BUR, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BUR extends ContentObserver {
    public final Context LIZ;
    public final AudioManager LIZIZ;
    public final C2205791BUr LIZJ;
    public final InterfaceC2205821BUu LIZLLL;
    public float LJ;

    public C1BUR(BPEAHandler bPEAHandler, Context context, C2205791BUr c2205791BUr, C1BUX c1bux) {
        super(bPEAHandler);
        this.LIZ = context;
        this.LIZIZ = (AudioManager) C786410Ut5.H2(context, "audio");
        this.LIZJ = c2205791BUr;
        this.LIZLLL = c1bux;
    }

    public final float LIZ() {
        int streamVolume = this.LIZIZ.getStreamVolume(3);
        int iZ3 = C786410Ut5.Z3(this.LIZIZ, 3);
        getClass();
        if (iZ3 <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f = streamVolume / iZ3;
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    public final void LIZIZ() {
        InterfaceC2205821BUu interfaceC2205821BUu = this.LIZLLL;
        float f = this.LJ;
        C1BUX c1bux = (C1BUX) interfaceC2205821BUu;
        c1bux.LIZ = f;
        if (c1bux.LJ == null) {
            c1bux.LJ = C21690119ud.LIZJ;
        }
        Iterator<C1BUP> it2 = c1bux.LJ.LIZ().iterator();
        while (it2.hasNext()) {
            C1BUI c1bui = it2.next().LJ;
            c1bui.getClass();
            C1287860jcO.LIZ.LIZ(c1bui.LJI(), "setDeviceVolume", Float.valueOf(f), c1bui.LIZ);
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float fLIZ = LIZ();
        if (fLIZ != this.LJ) {
            this.LJ = fLIZ;
            LIZIZ();
        }
    }
}
