package X;

import com.bytedance.ies.cutsame.cut_android.NLEPrepareListener;
import com.bytedance.ies.cutsame.resourcefetcher.NetworkFileFetcher;
import com.bytedance.ies.nle.editor_jni.NLEModelDownloader;
import com.ss.android.ugc.cut_reportor_interface.ICutReporter;

/* JADX INFO: renamed from: X.0nHm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1428840nHm {
    public final String LIZ;
    public final Boolean LIZIZ;
    public final boolean LIZJ;
    public final NetworkFileFetcher LIZLLL;
    public final NLEModelDownloader LJ;
    public final EnumC539100LCi LJFF;
    public final ICutReporter LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final NLEPrepareListener LJIIIZ;

    public /* synthetic */ C1428840nHm(String str, Boolean bool, boolean z, NLEModelDownloader nLEModelDownloader, EnumC539100LCi enumC539100LCi, ICutReporter iCutReporter, boolean z2, boolean z3, NLEPrepareListener nLEPrepareListener, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : bool, z, (NetworkFileFetcher) null, (i & 16) != 0 ? null : nLEModelDownloader, (i & 32) != 0 ? null : enumC539100LCi, (i & 64) == 0 ? iCutReporter : null, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3, nLEPrepareListener);
    }

    public C1428840nHm(String str, Boolean bool, boolean z, NetworkFileFetcher networkFileFetcher, NLEModelDownloader nLEModelDownloader, EnumC539100LCi enumC539100LCi, ICutReporter iCutReporter, boolean z2, boolean z3, NLEPrepareListener nLEPrepareListener) {
        this.LIZ = str;
        this.LIZIZ = bool;
        this.LIZJ = z;
        this.LIZLLL = networkFileFetcher;
        this.LJ = nLEModelDownloader;
        this.LJFF = enumC539100LCi;
        this.LJI = iCutReporter;
        this.LJII = z2;
        this.LJIIIIZZ = z3;
        this.LJIIIZ = nLEPrepareListener;
    }
}
