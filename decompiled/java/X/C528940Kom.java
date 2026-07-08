package X;

import Y.AObjectS383S0100000_8;
import java.util.List;

/* JADX INFO: renamed from: X.0Kom, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C528940Kom implements InterfaceC528950Kon {
    public final /* synthetic */ C529030Kov LIZ;
    public final /* synthetic */ long LIZIZ;

    public /* synthetic */ C528940Kom(C529030Kov c529030Kov, long j) {
        this.LIZ = c529030Kov;
        this.LIZIZ = j;
    }

    public final void LIZ(List list, boolean z) {
        C529030Kov c529030Kov = this.LIZ;
        long j = this.LIZIZ;
        c529030Kov.getClass();
        if (C545820Lau.LIZIZ(c529030Kov) != null && c529030Kov.LLJJIJIIJIL) {
            if (list != null) {
                C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("call onMediaAlbumListLoaded, success = ");
                sbLIZ.append(z);
                sbLIZ.append(", spendTime = ");
                sbLIZ.append(System.currentTimeMillis() - j);
                sbLIZ.append(", albumList = ");
                sbLIZ.append(list);
                C201955140j.LJII(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ));
                if (z) {
                    ViewOnClickListenerC529430KpZ viewOnClickListenerC529430KpZ = c529030Kov.LLJJJIL;
                    viewOnClickListenerC529430KpZ.getClass();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("MvImageAlbumAdapter#updateAlbumList, albumList.size = ");
                    sbLIZ2.append(list.size());
                    C201955140j.LJIILJJIL(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ2));
                    viewOnClickListenerC529430KpZ.LL.clear();
                    viewOnClickListenerC529430KpZ.LL.addAll(list);
                    viewOnClickListenerC529430KpZ.LLLFZ();
                    return;
                }
                return;
            }
            return;
        }
        C530000KqU.LIZIZ("MvChooseAlbumFragment", new AObjectS383S0100000_8(c529030Kov, 5));
    }
}
