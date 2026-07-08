package X;

import android.app.Application;
import com.bytedance.ies.nleeditor.NLE;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.13V8, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13V8 {
    public static final C13V1 LJ = new C13V1();
    public static volatile C13V8 LJFF;
    public final Application LIZ;
    public boolean LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 96));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 314));

    public final void LIZ() {
        if (this.LIZIZ) {
            return;
        }
        TENativeLibsLoader.setLibraryLoad((InterfaceC2109808Oi) this.LIZJ.getValue());
        NLE.INSTANCE.setLibraryLoader(new C2112708Pl((InterfaceC2109808Oi) this.LIZJ.getValue()));
        DownloadableModelSupport.setLibraryLoader((DownloadableModelSupportLibraryLoader) this.LIZLLL.getValue());
        this.LIZIZ = true;
    }

    public C13V8(Application application) {
        this.LIZ = application;
    }
}
