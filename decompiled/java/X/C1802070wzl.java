package X;

import Y.ARunnableS127S0100000_27;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minis.api.revisitedu.IMinisRevisitMissionService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: renamed from: X.0wzl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1802070wzl {
    public static final /* synthetic */ int LJIILJJIL = 0;
    public final ViewGroup LIZ;
    public final Function0<Activity> LIZIZ;
    public final Function0<String> LIZJ;
    public final Function0<Boolean> LIZLLL;
    public final Function0<Boolean> LJ;
    public final IMinisRevisitMissionService LJFF;
    public final C1800000wwQ LJI;
    public final Handler LJII;
    public final C1801980wzc LJIIIIZZ;
    public final C1802050wzj LJIIIZ;
    public final C1802110wzp LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public final ARunnableS127S0100000_27 LJIILIIL;

    public C1802070wzl() {
        throw null;
    }

    public final void LIZIZ() {
        this.LJIIJJI = false;
        this.LJII.removeCallbacks(this.LJIILIIL);
        this.LJIIL = false;
        C1801980wzc c1801980wzc = this.LJIIIIZZ;
        c1801980wzc.LJI++;
        c1801980wzc.LJ = null;
        c1801980wzc.LIZIZ.LJ(c1801980wzc);
        c1801980wzc.LJI++;
        c1801980wzc.LIZLLL = null;
        c1801980wzc.LJ = null;
        c1801980wzc.LJFF = null;
        C1802050wzj c1802050wzj = this.LJIIIZ;
        c1802050wzj.LIZ();
        C0F4A c0f4a = c1802050wzj.LJ;
        if (c0f4a != null) {
            c0f4a.LLJJIJI = false;
            c0f4a.LLJJIJIIJIL = false;
            c0f4a.LLJJIJIL = false;
            c0f4a.animate().cancel();
            C786410Ut5.W1(c0f4a, 8);
            c0f4a.LLIZLLLIL = null;
            c0f4a.LLJ = null;
            C786410Ut5.I7(null, c0f4a.LLILZ);
            c0f4a.LLIZ++;
            c0f4a.LLJJJJ = false;
            C786410Ut5.LJJJLZIJ(c0f4a, c1802050wzj.LIZ);
        }
        c1802050wzj.LJ = null;
        this.LJIIJ.LIZ();
    }

    public final boolean LIZ() {
        return this.LIZLLL.invoke().booleanValue() && this.LJ.invoke().booleanValue();
    }

    public C1802070wzl(ViewGroup viewGroup, AwS571S0100000_27 awS571S0100000_27, AwS571S0100000_27 awS571S0100000_272, C1802190wzx c1802190wzx, AwS565S0100000_21 awS565S0100000_21, AwS578S0100000_34 awS578S0100000_34) {
        IMinisRevisitMissionService iMinisRevisitMissionService = (IMinisRevisitMissionService) PluggableExtentionKt.pluggableSpi$default(IMinisRevisitMissionService.class, false, false, false, 14, null);
        C1800000wwQ c1800000wwQ = new C1800000wwQ();
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        this.LIZ = viewGroup;
        this.LIZIZ = awS571S0100000_27;
        this.LIZJ = awS571S0100000_272;
        this.LIZLLL = awS565S0100000_21;
        this.LJ = awS578S0100000_34;
        this.LJFF = iMinisRevisitMissionService;
        this.LJI = c1800000wwQ;
        this.LJII = bPEAHandler;
        this.LJIIIIZZ = new C1801980wzc(C786410Ut5.N3(viewGroup.getContext()), c1802190wzx, iMinisRevisitMissionService);
        this.LJIIIZ = new C1802050wzj(viewGroup, iMinisRevisitMissionService);
        this.LJIIJ = new C1802110wzp(iMinisRevisitMissionService);
        this.LJIILIIL = new ARunnableS127S0100000_27(this, 52);
    }
}
