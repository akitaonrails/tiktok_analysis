package X;

import Y.ARunnableS124S0100000_24;
import com.ss.android.ugc.aweme.festival.common.IFestivalService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0sDH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1618250sDH implements InterfaceC1590360rUI {
    public final Function0<Unit> LIZ;
    public final C19EG LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0sDG] */
    public final void LIZ() {
        IFestivalService iFestivalService = (IFestivalService) PluggableExtentionKt.pluggableSpi$default(IFestivalService.class, false, false, false, 14, null);
        if (iFestivalService != 0) {
            iFestivalService.LIZ(new InterfaceC197013126h() { // from class: X.0sDG
                @Override // X.InterfaceC197013126h
                public final void LIZ() {
                    C810560Vqw.LIZJ(new ARunnableS124S0100000_24(this.LIZ, 110));
                }
            });
        }
    }

    @Override // X.InterfaceC1590360rUI
    public final void onDestroyView() {
        EventBus.LIZLLL().LJJI(this);
    }

    @C14EU
    public final void onFestivalDataEvent(C828020We0 c828020We0) {
        LIZ();
        C19278110bT c19278110bT = C1618260sDI.LIZ;
        C1618260sDI.LIZ = new C19278110bT();
        C19277910bR.LJII().LJIIIZ();
    }

    public C1618250sDH(C19EG c19eg, Function0 function0) {
        this.LIZ = function0;
        this.LIZIZ = c19eg;
        EventBus.LIZLLL().LJIJJ(this);
    }
}
