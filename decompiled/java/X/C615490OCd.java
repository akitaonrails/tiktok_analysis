package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.addyours.hub.model.HubFeedResponse;

/* JADX INFO: renamed from: X.0OCd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C615490OCd implements InterfaceC736910SvR<InterfaceC615520OCg> {
    public final C615460OCa LL = new InterfaceC615520OCg() { // from class: X.0OCa
        @Override // X.InterfaceC615520OCg
        public final HubFeedResponse LJL(int i, int i2, int i3, long j, long j2) {
            try {
                return C2188608ho.LIZ().fetchHubFeed(j, i, j2, i2, i3).execute().LIZIZ;
            } catch (C0XIR e) {
                TryCatchGuardChecker.doCheck(e);
                e.getMessage();
                return null;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                e2.getMessage();
                return null;
            }
        }
    };

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LL;
    }
}
