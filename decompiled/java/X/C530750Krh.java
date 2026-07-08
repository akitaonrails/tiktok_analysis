package X;

import Y.ACallableS0S0114000_3;
import Y.AfS63S0201000_8;
import Y.AfS79S0101000_8;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.experiments.EnablePrivateAlbumWithoutPermissionExperiment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0Krh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530750Krh {
    public static C530750Krh LJFF;
    public final Context LIZ;
    public final HashMap<String, MediaModel> LIZIZ = new HashMap<>();
    public final HashMap<Integer, List<MediaModel>> LIZJ = new HashMap<>();
    public final List<MediaModel> LIZLLL = new ArrayList();
    public final Set<InterfaceC530740Krg> LJ = new HashSet();

    public final void LIZ() {
        ((ArrayList) this.LIZLLL).clear();
    }

    public static Boolean LIZJ() {
        boolean z = false;
        if (EnablePrivateAlbumWithoutPermissionExperiment.isEnabled() && !C0CHQ.LIZ().getAccountService().LIZ()) {
            SettingsManager.LIZLLL().getClass();
            if (!SettingsManager.LIZ("disable_external_media_load_kill_switch", false)) {
                C0LGY.LIZ.getClass();
                if (!C0LGY.LJFF() && !C0LGY.LJI()) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public C530750Krh(Context context) {
        this.LIZ = context;
    }

    public static synchronized void LIZIZ(Context context) {
        if (LJFF == null) {
            LJFF = new C530750Krh(context);
        }
    }

    public final C11JL LIZLLL(int i, int i2, int i3, boolean z, InterfaceC535290Kz1 interfaceC535290Kz1) {
        return LJ(i, i2, i3, z, interfaceC535290Kz1, -1);
    }

    public static C11JF LJFF(int i, int i2, int i3, boolean z, InterfaceC535290Kz1 interfaceC535290Kz1, AbstractC530360Kr4 abstractC530360Kr4) {
        C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadMedia--- withRefreshType:");
        sbLIZ.append(abstractC530360Kr4);
        sbLIZ.append(",mediaType:");
        sbLIZ.append(i);
        sbLIZ.append(",pageSize:");
        sbLIZ.append(i2);
        sbLIZ.append(",pageOffset:");
        sbLIZ.append(i3);
        sbLIZ.append(",livePhoto:");
        sbLIZ.append(z);
        C201955140j.LIZLLL(c533790Kwb, "MediaManager", C2188811AlT.LIZIZ(sbLIZ));
        return (C11JF) C530760Kri.LIZ().LJJIJL(new C535280Kz0(i, i2, i3, z), abstractC530360Kr4).LJJLL(new AfS63S0201000_8(i, abstractC530360Kr4, interfaceC535290Kz1, 0), new AfS63S0201000_8(i, abstractC530360Kr4, interfaceC535290Kz1, 1));
    }

    public final C11JL LJ(final int i, final int i2, int i3, boolean z, final InterfaceC535290Kz1 interfaceC535290Kz1, int i4) {
        return (C11JL) AbstractC19484711Kz.LJIJI(new ACallableS0S0114000_3(this, z, i, i2, i3, i4, 1)).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new C09JN() { // from class: X.0Krf
            /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r9) {
                /*
                    Method dump skipped, instruction units count: 202
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C530730Krf.accept(java.lang.Object):void");
            }
        }, new AfS79S0101000_8(interfaceC535290Kz1, i, 1));
    }
}
