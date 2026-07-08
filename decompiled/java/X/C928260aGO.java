package X;

import Y.AfS184S0100000_15;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestManagePanelRefreshDelayTimeSetting;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0aGO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C928260aGO extends AbstractC928280aGQ {
    public boolean LIZIZ;
    public long LIZJ;
    public final long LIZLLL;
    public List<? extends LinkPlayerInfo> LJ;
    public List<? extends LinkPlayerInfo> LJFF;
    public C11JF LJI;
    public final AtomicBoolean LJII;

    public final void LIZIZ() {
        this.LIZIZ = true;
        long j = this.LIZLLL;
        InterfaceC420801kM interfaceC420801kMLJJLL = C19490011Na.LIZ(j, j, TimeUnit.SECONDS).LJIILIIL(new C0UO0()).LJJLL(new AfS184S0100000_15(this, 71), new AfS184S0100000_15(this, 72));
        C11JF c11jf = this.LJI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LJI = (C11JF) interfaceC420801kMLJJLL;
    }

    public final boolean LIZ() {
        List<? extends LinkPlayerInfo> list;
        return this.LIZIZ && System.currentTimeMillis() - this.LIZJ <= this.LIZLLL * ((long) LSPassThroughRecordSizeConfig.DEFAULT) && (list = this.LJ) != null && !((ArrayList) list).isEmpty();
    }

    public C928260aGO(InterfaceC928270aGP interfaceC928270aGP) {
        super(interfaceC928270aGP);
        this.LIZLLL = (long) MultiGuestManagePanelRefreshDelayTimeSetting.INSTANCE.getValue();
        this.LJ = new ArrayList();
        this.LJFF = new ArrayList();
        this.LJII = new AtomicBoolean(false);
    }

    public final void LIZJ(List list, List list2, boolean z) {
        this.LJ = new ArrayList(list);
        this.LJFF = new ArrayList(list2);
        if (z) {
            this.LIZJ = System.currentTimeMillis();
        } else {
            this.LJII.set(true);
        }
    }
}
