package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdkapi.depend.model.live.CustomTab;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0Kb1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C520410Kb1 {
    public final Context LIZ;
    public final DataChannel LIZIZ;
    public final CustomTab LIZJ;
    public ViewGroup LIZLLL;
    public InterfaceC520420Kb2 LJ;

    public final InterfaceC520420Kb2 LIZ() {
        InterfaceC520420Kb2 interfaceC520420Kb2;
        if (this.LJ == null) {
            IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class);
            C1881370z3f c1881370z3fCe0 = iGamePartnershipService != null ? iGamePartnershipService.Ce0(this.LIZ) : null;
            this.LJ = c1881370z3fCe0;
            if (c1881370z3fCe0 != null) {
                c1881370z3fCe0.LIZ(this.LIZIZ, this.LIZJ.tabSchema);
            }
            ViewGroup viewGroup = this.LIZLLL;
            if (viewGroup != null && (interfaceC520420Kb2 = this.LJ) != null) {
                interfaceC520420Kb2.LIZJ(viewGroup);
            }
        }
        return this.LJ;
    }

    public C520410Kb1(Context context, DataChannel dataChannel, CustomTab customTab) {
        this.LIZ = context;
        this.LIZIZ = dataChannel;
        this.LIZJ = customTab;
    }
}
