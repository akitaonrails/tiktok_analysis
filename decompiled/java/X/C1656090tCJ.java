package X;

import android.app.Application;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0tCJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1656090tCJ implements InterfaceC576950Mk1 {
    public static final int[] LJJ = {360, 640};
    public final Application LIZ;
    public final String LIZIZ;
    public final InterfaceC2254001DKc LIZJ;
    public int LIZLLL;
    public int LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final InterfaceC1656270tCb LJII;
    public final InterfaceC1650190t2n LJIIIIZZ;
    public final C2248208rQ LJIIIZ;
    public final int LJIIJ;
    public ExtractFramesModel LJIIJJI;
    public volatile boolean LJIIL;
    public String LJIILIIL = UUID.randomUUID().toString();
    public final C2248208rQ LJIILJJIL;
    public InterfaceC1656400tCo LJIILL;
    public String LJIILLIIL;
    public ScheduledExecutorService LJIIZILJ;
    public final AtomicBoolean LJIJ;
    public long LJIJI;
    public String LJIJJ;
    public volatile boolean LJIJJLI;
    public final HashMap<String, Boolean> LJIL;

    public final void LIZ(RunnableC1656100tCK runnableC1656100tCK, int i) {
        ScheduledExecutorService scheduledExecutorService = this.LJIIZILJ;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            this.LJIIZILJ = C807400Vlq.LJ();
        }
        this.LJIIZILJ.schedule(runnableC1656100tCK, i, TimeUnit.MILLISECONDS);
    }

    public final void LIZIZ(final int i, final String str, String str2, final String str3, final long j, int i2, long j2) {
        int i3;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LJIJI;
        C15O7.LIZIZ(new Callable() { // from class: X.0nON
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("DefaultFrameExtractor@8ea6.handleExtractResult$1");
                if (str3 != null) {
                    this.LJIIJJI.addEffectFrameAtLastSegment(new FrameItem(str3, 1, -1, false, null, null));
                }
                if (i == 0) {
                    this.LJIJJLI = true;
                    ExtractFramesModel extractFramesModel = this.LJIIJJI;
                    FrameItem frameItem = new FrameItem(str, 1, -1, false, null, null);
                    frameItem.setTimeStamp(j);
                    extractFramesModel.addFrameAtLastSegment(frameItem);
                } else {
                    InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Default Frame Extractor Fail : ret ");
                    sbLIZ.append(i);
                    interfaceC1463990oCTLIZLLL.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                }
                C1C7U.LIZIZ("DefaultFrameExtractor@8ea6.handleExtractResult$1");
                return null;
            }
        }, C15O7.LJIIIIZZ, null);
        InterfaceC1656400tCo interfaceC1656400tCo = this.LJIILL;
        if (interfaceC1656400tCo != null) {
            ((C1656300tCe) interfaceC1656400tCo).LIZ.ma(System.currentTimeMillis() - j2);
        }
        RunnableC1656100tCK runnableC1656100tCK = new RunnableC1656100tCK(this, str2, i2 + 1);
        long j3 = this.LJIIJ;
        if (jCurrentTimeMillis > j3) {
            i3 = 0;
        } else {
            i3 = (int) (j3 - jCurrentTimeMillis);
        }
        LIZ(runnableC1656100tCK, i3);
    }

    public C1656090tCJ(Application application, String str, InterfaceC2254001DKc interfaceC2254001DKc, int i, int i2, boolean z, boolean z2, InterfaceC1656270tCb interfaceC1656270tCb, InterfaceC1650190t2n interfaceC1650190t2n, C2298108zT c2298108zT, int i3) {
        this.LIZ = application;
        this.LIZIZ = str;
        this.LIZJ = interfaceC2254001DKc;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = interfaceC1656270tCb;
        this.LJIIIIZZ = interfaceC1650190t2n;
        this.LJIIIZ = c2298108zT;
        this.LJIIJ = i3;
        this.LJIIJJI = new ExtractFramesModel(str);
        this.LJIILJJIL = c2298108zT == null ? new C2248208rQ(application) : c2298108zT;
        this.LJIJ = new AtomicBoolean(false);
        this.LJIL = new HashMap<>();
    }
}
