package X;

import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import java.util.EnumSet;
import java.util.List;

/* JADX INFO: renamed from: X.0bXa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C977360bXa implements InterfaceC975560bUg {
    public final InterfaceC977420bXg LL;
    public EnumC976730bWZ LLILLJJLI;

    @Override // X.InterfaceC975560bUg
    public final void LIZIZ(int i, int i2, List list, List list2, List list3, List list4) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJ(InterfaceC963620bBQ interfaceC963620bBQ) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJFF(InterfaceC963620bBQ interfaceC963620bBQ) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJI(EnumC919170a1j enumC919170a1j) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJII(AbstractC1136060ffY abstractC1136060ffY) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIIIZZ(InterfaceC963620bBQ interfaceC963620bBQ) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIIZ(InterfaceC963620bBQ interfaceC963620bBQ) {
    }

    @Override // X.InterfaceC975560bUg
    public final void vc(List<C954460awe> list, List<C954460awe> list2) {
    }

    @Override // X.InterfaceC975560bUg
    public final void onDestroy() {
        if (SettingsManager.INSTANCE.getBooleanValue("live_match_audience_mvp_reset_enable", true)) {
            this.LL.dismiss();
            this.LL.reset();
        }
        this.LL.onUnload();
    }

    @Override // X.InterfaceC975560bUg
    public final EnumC976730bWZ getPriority() {
        return this.LLILLJJLI;
    }

    public C977360bXa(InterfaceC977420bXg interfaceC977420bXg) {
        this.LL = interfaceC977420bXg;
        EnumSet.noneOf(EnumC963560bBK.class);
        this.LLILLJJLI = EnumC976730bWZ.P1;
    }

    @Override // X.InterfaceC975560bUg
    public final void LIZJ(AbstractC986700bme abstractC986700bme) {
        this.LL.LIZJ(abstractC986700bme);
    }

    @Override // X.InterfaceC975560bUg
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        this.LL.LIZLLL(matchBaseWidget);
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIJJI(InterfaceC963620bBQ interfaceC963620bBQ) {
        C975960bVK c975960bVK;
        InterfaceC977420bXg interfaceC977420bXg = this.LL;
        if (interfaceC963620bBQ instanceof C975960bVK) {
            c975960bVK = (C975960bVK) interfaceC963620bBQ;
        } else {
            c975960bVK = null;
        }
        interfaceC977420bXg.LJFF(c975960bVK);
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIJ(BattleInfoResponse battleInfoResponse, EnumC970440bMQ enumC970440bMQ) {
        this.LL.LJII(battleInfoResponse);
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIL(AbstractC970850bN5 abstractC970850bN5, EnumC970440bMQ enumC970440bMQ) {
        if (abstractC970850bN5 instanceof C970840bN4) {
            this.LL.LJII(((C970840bN4) abstractC970850bN5).LIZ);
            return;
        }
        if (!(abstractC970850bN5 instanceof C970860bN6)) {
            return;
        }
        InterfaceC977420bXg interfaceC977420bXg = this.LL;
        if (!(interfaceC977420bXg instanceof C15FS)) {
            return;
        }
        ((C15FS) interfaceC977420bXg).LJIIJ(((C970860bN6) abstractC970850bN5).LIZ.LJIIJ);
    }
}
