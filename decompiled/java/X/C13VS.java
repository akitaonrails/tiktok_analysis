package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.effectmanager.EffectManager;
import dtj.u7;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.13VS, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13VS {
    public static final C13VS LIZ = new C13VS();
    public static final boolean LIZIZ = ((Boolean) C1D75.LIZ(C1D7G.class)).booleanValue();
    public static final Keva LIZJ = Keva.getRepo("av_effect_storage");

    public static void LIZ() {
        Pair<Long, Long> pair;
        long jLJII;
        if (!u7.LIZ() || u7.LIZIZ()) {
            C0VSJ c0vsj = new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJIILJJIL(""));
            C0VSJ c0vsj2 = new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJLIIIIJ(""));
            C0VSJ c0vsj3 = new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIJIL(""));
            C0VSJ c0vsj4 = new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().genMusicPath(""));
            C0VSJ c0vsj5 = new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJLI(""));
            C0VSJ c0vsj6 = new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService().getCreativeRoot());
            C0VSJ c0vsj7 = new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJFF());
            C0VSJ c0vsj8 = new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService().getPersistentRoot());
            C0VSJ c0vsj9 = new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService().getCacheRoot());
            C0VSJ c0vsj10 = new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIJIIJIL(""));
            C0VSJ c0vsjLJIILIIL = C2354709Kn.LJIILIIL();
            C0VSJ c0vsj11 = c0vsjLJIILIIL != null ? new C0VSJ(c0vsjLJIILIIL, "fresco_custom_cache/tools_default") : null;
            C0VSJ c0vsj12 = new C0VSJ(C08OW.LIZ(C0CHQ.LIZ));
            long jLJII2 = c0vsj.exists() ? C2260008tK.LJII(c0vsj.getAbsolutePath()) : 0L;
            long jLJII3 = c0vsj2.exists() ? C2260008tK.LJII(c0vsj2.getAbsolutePath()) : 0L;
            long jLJII4 = c0vsj3.exists() ? C2260008tK.LJII(c0vsj3.getAbsolutePath()) : 0L;
            long jLJII5 = c0vsj4.exists() ? C2260008tK.LJII(c0vsj4.getAbsolutePath()) : 0L;
            long jLJII6 = c0vsj5.exists() ? C2260008tK.LJII(c0vsj5.getAbsolutePath()) : 0L;
            long jLJII7 = c0vsj6.exists() ? C2260008tK.LJII(c0vsj6.getAbsolutePath()) : 0L;
            long jLJII8 = c0vsj7.exists() ? C2260008tK.LJII(c0vsj7.getAbsolutePath()) : 0L;
            long jLJII9 = c0vsj8.exists() ? C2260008tK.LJII(c0vsj8.getAbsolutePath()) : 0L;
            long jLJII10 = c0vsj9.exists() ? C2260008tK.LJII(c0vsj9.getAbsolutePath()) : 0L;
            long jLJII11 = c0vsj10.exists() ? C2260008tK.LJII(c0vsj10.getAbsolutePath()) : 0L;
            long jLJII12 = c0vsj12.exists() ? C2260008tK.LJII(c0vsj12.getAbsolutePath()) : 0L;
            long j = jLJII2 + jLJII6 + jLJII3 + jLJII4 + jLJII5 + jLJII11 + jLJII7 + jLJII8 + jLJII9 + jLJII10;
            EffectManager effectManagerLLJILJILJ = C1633850scR.LIZ(C0CHQ.LIZ, null).LLJILJILJ();
            if (effectManagerLLJILJILJ == null || (pair = effectManagerLLJILJILJ.getEffectCacheSize()) == null) {
                jLJII = 0;
                pair = new Pair<>(0L, 0L);
            } else {
                jLJII = 0;
            }
            Long first = pair.getFirst();
            Long second = pair.getSecond();
            if (c0vsj11 != null && c0vsj11.exists()) {
                jLJII = C2260008tK.LJII(c0vsj11.getAbsolutePath());
            }
            List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
            C0LAB c0lab = new C0LAB();
            c0lab.LIZIZ(jLJII2, "effect_size");
            c0lab.LIZIZ(jLJII3, "filter_size");
            c0lab.LIZIZ(jLJII4, "mv_size");
            c0lab.LIZIZ(jLJII5, "music_size");
            c0lab.LIZIZ(jLJII6, "effect_model_size");
            c0lab.LIZIZ(jLJII11, "font_size");
            c0lab.LIZIZ(jLJII7, "creative_draft_size");
            c0lab.LIZIZ(jLJII8, "creative_public_size");
            c0lab.LIZIZ(jLJII9, "creative_persistent_size");
            c0lab.LIZIZ(jLJII10, "creative_cache_size");
            c0lab.LIZIZ(j, "storage_size");
            c0lab.LIZIZ(jLJII, "creative_fresco_cache_size");
            c0lab.LIZIZ(first.longValue(), "ep_disk_default_size");
            c0lab.LIZIZ(second.longValue(), "ep_disk_graded_size");
            c0lab.LIZIZ(jLJII12, "cutsame_size");
            C2341909Fp.LIZ("tool_performance_effect_storage_space", c0lab.LIZ);
        }
    }
}
