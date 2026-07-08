package X;

import com.ss.android.ugc.gamora.recorder.greenscreen.e0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mlS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1408800mlS extends C09AY implements Function0<Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ e0 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1408800mlS(long j, e0 e0Var) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = e0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1408810mlT c1408810mlT = C1408810mlT.LIZ;
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.LL);
        c1408810mlT.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(iCurrentTimeMillis, "duration");
        C20684815ws.LJIILLIIL("capture_green_screen_download_cancel", c0lab.LIZ);
        this.LLILLJJLI.LLJJIJIIJIL.LJII(Boolean.FALSE);
        return Unit.LIZ;
    }
}
