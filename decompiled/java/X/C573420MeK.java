package X;

import Y.AfS177S0100000_8;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.music.model.SimpleMusicRequestParam;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MeK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C573420MeK extends AbstractC573460MeO {
    public C573420MeK(C573380MeG c573380MeG) {
        super(c573380MeG);
    }

    public static C11NZ LIZIZ(C1457520o22 c1457520o22) {
        C1458370o3P.LIZ.getClass();
        String strLJIILLIIL = C1458370o3P.LJIILLIIL();
        if (C1458370o3P.LJIJJ() && strLJIILLIIL != null && c1457520o22.LIZ.LJ != EnumC2274808vi.PANEL_PIC.ordinal()) {
            return C11NZ.LJJJJZ(strLJIILLIIL);
        }
        C11NZ c11nzLIZJ = C1457440o1u.LIZJ(c1457520o22, false, null, 6);
        if (c11nzLIZJ == null) {
            return null;
        }
        long jLIZJ = C2538909xD.LIZJ();
        if (jLIZJ <= 0) {
            return c11nzLIZJ;
        }
        return c11nzLIZJ.LJLJI(jLIZJ, TimeUnit.MILLISECONDS);
    }

    @Override // X.InterfaceC573280Me6
    public final void LIZ(Object obj) {
        String str;
        C11NZ c11nzLIZIZ;
        boolean z;
        int iLIZ;
        C573380MeG c573380MeG;
        List<String> list;
        C573380MeG c573380MeG2 = this.LIZ;
        MusicModel musicModel = c573380MeG2.LJIIJJI;
        if (musicModel != null) {
            AbstractC573460MeO abstractC573460MeO = this.LIZIZ;
            if (abstractC573460MeO != null) {
                abstractC573460MeO.LIZ(musicModel);
                return;
            }
            return;
        }
        boolean z2 = false;
        String str2 = "";
        if (c573380MeG2.LJIILL) {
            InterfaceC573480MeQ interfaceC573480MeQ = c573380MeG2.LIZLLL;
            if (interfaceC573480MeQ != null) {
                MusicModel musicModel2 = new MusicModel();
                musicModel2.setId(Long.MIN_VALUE);
                interfaceC573480MeQ.LIZ(false, musicModel2, "");
                return;
            }
            return;
        }
        this.LIZJ.LIZIZ();
        C573060Mdk c573060Mdk = this.LIZ.LIZ;
        if (c573060Mdk != null) {
            c573060Mdk.LJIIJJI = 3;
        }
        IAnotherMusicService iAnotherMusicService = (IAnotherMusicService) C0CHQ.LIZ().LJJJJL();
        if (iAnotherMusicService != null && !C0L0Y.LIZ()) {
            String str3 = C1443030nef.LJII().LIZIZ;
            if (str3 == null) {
                str3 = "";
            }
            if (!TextUtils.equals(str3, "l8_music_edit_cml") && !TextUtils.equals(str3, "l8_import")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String str4 = null;
                if (!C290920Bak.LIZ() || (c573380MeG = this.LIZ) == null || ((list = c573380MeG.LJ) != null && !list.isEmpty())) {
                    C1458390o3R.LIZ.getClass();
                    C201955140j.LJIILIIL("MusicCapsuleProcessTracker", "startProcess");
                    C1458390o3R.LIZLLL();
                    C1458390o3R.LJIIIIZZ.set(true);
                    C1452640nuA.LIZJ = null;
                }
                C1458410o3T c1458410o3TDl = iAnotherMusicService.dl();
                List<String> list2 = this.LIZ.LJ;
                if (!C0CHQ.LIZ().LJIILJJIL().LIZ() && C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_recommend_music_with_frame_multi_picture", true) != 0 && C0CHQ.LIZ().getAccountService().isLogin() && list2 != null && !list2.isEmpty()) {
                    C1458390o3R.LIZ.getClass();
                    C1458390o3R.LJJII(true);
                    C1457520o22 c1457520o22 = new C1457520o22(list2);
                    String str5 = C1443030nef.LJII().LIZJ;
                    if (str5 != null) {
                        str2 = str5;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fetchMusicImpl size:");
                    sbLIZ.append(list2.size());
                    C201955140j.LJIILIIL("AIMusicConfigHelper", C2188811AlT.LIZIZ(sbLIZ));
                    if (list2.size() > 1) {
                        C2288408xu c2288408xu = c1457520o22.LIZ;
                        c2288408xu.LIZJ = "upload";
                        c2288408xu.LIZIZ = "multi_photo";
                        if (!Intrinsics.LJFF(str2, "direct_shoot")) {
                            c1457520o22.LIZ.LIZ = 1;
                        }
                    }
                    if (C1452450ntr.LIZ()) {
                        C2253508sH.LIZ.getClass();
                        c11nzLIZIZ = C2253508sH.LJIIIIZZ();
                        if (list2.size() > 1 && c11nzLIZIZ != null) {
                            str = "cloud_understanding_key";
                        } else {
                            c11nzLIZIZ = LIZIZ(c1457520o22);
                        }
                    } else {
                        c11nzLIZIZ = LIZIZ(c1457520o22);
                    }
                    str = "tos_uri";
                } else {
                    str = "demotion";
                    c11nzLIZIZ = null;
                }
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_request_more_capsule_music_and_insert_panel", true, false) && C2296708zF.LIZ() > 1) {
                    z = true;
                } else {
                    z = false;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("hitPreRequestMultiMusic:");
                sbLIZ2.append(z);
                C201955140j.LJIILIIL("EditMusicPanelOptHelper", C2188811AlT.LIZIZ(sbLIZ2));
                if (z) {
                    iLIZ = C2296708zF.LIZ();
                } else {
                    iLIZ = 2;
                }
                C573380MeG c573380MeG3 = this.LIZ;
                String str6 = c573380MeG3.LJFF;
                Map<String, ? extends Object> map = c573380MeG3.LJIILLIIL;
                if (((Boolean) C277720AuY.LIZ.getValue()).booleanValue()) {
                    str4 = "video_edit_page";
                }
                SimpleMusicRequestParam simpleMusicRequestParam = new SimpleMusicRequestParam(false, 0L, 0, str6, null, false, null, str3, "multi_photo", "upload", null, null, null, null, null, null, null, null, str4, false, false, 0L, false, 0, map, null, null, null, false, false, 0, false, false, null);
                if (list2 == null || list2.isEmpty()) {
                    z2 = true;
                }
                c1458410o3TDl.LIZ(iLIZ, jCurrentTimeMillis, true, "", simpleMusicRequestParam, c11nzLIZIZ, false, !z2, "request_from_album", "", null, str).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS177S0100000_8(this, 97), new AfS177S0100000_8(this, 98));
                return;
            }
            return;
        }
        long jLIZ = this.LIZJ.LIZ();
        C573380MeG c573380MeG4 = this.LIZ;
        C573060Mdk c573060Mdk2 = c573380MeG4.LIZ;
        if (c573060Mdk2 != null) {
            c573060Mdk2.LIZLLL = (int) jLIZ;
            c573060Mdk2.LJIIJ = "musicService null";
            c573060Mdk2.LJIIIZ = 5;
        }
        InterfaceC573480MeQ interfaceC573480MeQ2 = c573380MeG4.LIZLLL;
        if (interfaceC573480MeQ2 != null) {
            interfaceC573480MeQ2.onFailed();
        }
    }
}
