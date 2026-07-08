package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.WatchReason;
import com.ss.android.ugc.aweme.feed.model.live.WatchReasonItem;

/* JADX INFO: renamed from: X.1AAF, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AAF {
    public AnonymousClass0956 LIZ;
    public boolean LIZIZ;
    public String LIZJ;
    public EnumC1779530wPP LIZLLL = EnumC1779530wPP.IDLE;
    public WatchReasonItem LJ;

    public final void LIZ(TuxTextView tuxTextView, C1ACA c1aca) {
        LiveRoomStruct liveRoomStruct;
        WatchReason watchReason;
        if (tuxTextView == null) {
            return;
        }
        if (c1aca != null && (liveRoomStruct = c1aca.LIZJ) != null && (watchReason = liveRoomStruct.fypWatchReason) != null && watchReason.isShowed) {
            return;
        }
        EnumC1779530wPP enumC1779530wPP = this.LIZLLL;
        if (enumC1779530wPP == EnumC1779530wPP.PREPARE_SHOW || enumC1779530wPP == EnumC1779530wPP.SHOWING) {
            LIZIZ(tuxTextView, false, c1aca);
        }
    }

    public final void LIZIZ(TuxTextView tuxTextView, boolean z, C1ACA c1aca) {
        C339190DRl.LIZLLL(tuxTextView);
        if (z) {
            if (c1aca != null) {
                c1aca.LJZL = "WATCH_DURATION_NOT";
            }
            C786410Ut5.B5(tuxTextView, 0.0f);
            this.LIZLLL = EnumC1779530wPP.PREPARE_SHOW;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        this.LIZ = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1AAG(z, this, c1aca, tuxTextView, null), 3);
    }
}
