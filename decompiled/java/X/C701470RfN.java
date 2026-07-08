package X;

import com.ss.android.ugc.aweme.feed.model.banner.ClientStandardModel;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0RfN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701470RfN implements InterfaceC700330RdX {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Function0<FeedComponentPriorityData> LIZLLL;
    public final Function2<C698680Ras, String, Boolean> LJ;
    public final InterfaceC699200Rbi<?> LJFF;
    public final Function0<ClientStandardModel> LJI;
    public final InterfaceC700740ReC LJII;
    public final InterfaceC700020Rd2<?> LJIIIIZZ;
    public final IFeedDebugService LJIIIZ;
    public final C01GW LJIIJ = C452501pT.LIZIZ(new C701550RfV(this));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new C701820Rfw(this));

    @Override // X.InterfaceC700330RdX
    public final C700720ReA getContext() {
        return (C700720ReA) this.LJIIJ.getValue();
    }

    @Override // X.InterfaceC700330RdX
    public final C701860Rg0 getStore() {
        return (C701860Rg0) this.LJIIJJI.getValue();
    }

    @Override // X.InterfaceC700330RdX
    public final InterfaceC700020Rd2<?> LIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC700330RdX
    public final InterfaceC699200Rbi<?> n6() {
        return this.LJFF;
    }

    public C701470RfN(String str, String str2, String str3, C702320Rgk c702320Rgk, C616130OEp c616130OEp, C699160Rbe c699160Rbe, Function0 function0, InterfaceC700740ReC interfaceC700740ReC, C0RYN c0ryn, IFeedDebugService iFeedDebugService) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = c702320Rgk;
        this.LJ = c616130OEp;
        this.LJFF = c699160Rbe;
        this.LJI = function0;
        this.LJII = interfaceC700740ReC;
        this.LJIIIIZZ = c0ryn;
        this.LJIIIZ = iFeedDebugService;
    }
}
