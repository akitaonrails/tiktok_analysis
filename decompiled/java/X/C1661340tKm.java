package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0tKm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1661340tKm implements InterfaceC2385309Wh<InterfaceC1635410sex, Void> {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ ArrayList LIZLLL;
    public final /* synthetic */ C19574811iE LJ;

    @Override // X.InterfaceC2385309Wh
    public final Void then(C15O7<InterfaceC1635410sex> c15o7) {
        Effect effect;
        List<Effect> data;
        C1661090tKN c1661090tKN;
        C1C7U.LIZ("ReuseStickerHelper@c1.download$1");
        C19574811iE c19574811iE = this.LJ;
        if (c19574811iE.LIZ != null) {
            final Map<String, String> mapLJII = c19574811iE.LJII();
            final boolean z = this.LIZ;
            final boolean z2 = this.LIZIZ;
            Runnable runnable = new Runnable() { // from class: X.0tKn
                @Override // java.lang.Runnable
                public final void run() {
                    C1661340tKm c1661340tKm = this.LL;
                    Map<String, String> map = mapLJII;
                    boolean z3 = z;
                    boolean z4 = z2;
                    c1661340tKm.getClass();
                    C1C7U.LIZ("ReuseStickerHelper@c1.download$1$then$1L");
                    C1661130tKR c1661130tKRLJIIJJI = c1661340tKm.LJ.LJIIJJI();
                    C19575111iH c19575111iH = z3 ? null : c1661340tKm.LJ.LJJJZ;
                    String str = (String) ListProtector.get(c1661340tKm.LJ.LIZJ, 0);
                    c1661130tKRLJIIJJI.getClass();
                    c1661130tKRLJIIJJI.LIZ(map, c19575111iH, z4, str, false, false);
                    C1C7U.LIZIZ("ReuseStickerHelper@c1.download$1$then$1L");
                }
            };
            if (C19574811iE.LJI(this.LJ.LJJIIZI) && !this.LIZ && this.LIZJ) {
                C19574811iE c19574811iE2 = this.LJ;
                C1632250sZr c1632250sZr = c19574811iE2.LJJJLL;
                Context context = c19574811iE2.LJIIJ;
                String str = (String) ListProtector.get(this.LIZLLL, 0);
                C19574811iE c19574811iE3 = this.LJ;
                Music music = c19574811iE3.LJIIL;
                ShootExtraData shootExtraData = c19574811iE3.LJ;
                C1661120tKQ c1661120tKQLJIIIZ = c19574811iE3.LJIIIZ();
                C19575111iH c19575111iH = this.LJ.LJJJZ;
                c1632250sZr.getClass();
                if (music == null) {
                    C201955140j.LIZLLL(C20012313Rx.LIZIZ, "lazyEffect", "no music, reuse online download task");
                } else {
                    MusicModel musicModelConvertToMusicModel = music.convertToMusicModel();
                    C1661180tKW.LIZ.getClass();
                    Pair pairLIZLLL = C1661180tKW.LIZLLL(musicModelConvertToMusicModel, null, null);
                    String str2 = (String) pairLIZLLL.getFirst();
                    boolean zBooleanValue = ((Boolean) pairLIZLLL.getSecond()).booleanValue();
                    if (str2 != null && str2.length() != 0) {
                        if (zBooleanValue) {
                            C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("has music cache, go online logic, filePath: ");
                            sbLIZ.append(str2);
                            C201955140j.LIZLLL(c20012313Rx, "lazyEffect", C2188811AlT.LIZIZ(sbLIZ));
                        } else if (C1661280tKg.LIZ() && (c1661090tKN = c1661120tKQLJIIIZ.LJII) != null && c1661090tKN.LJFF) {
                            C201962140q c201962140q = C201962140q.LIZIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("streaming download is ready, path: ");
                            sbLIZ2.append(c1661120tKQLJIIIZ.LJFF());
                            C201955140j.LIZLLL(c201962140q, "lazyEffect", C2188811AlT.LIZIZ(sbLIZ2));
                        } else {
                            c19575111iH.onStart(null);
                            if (c1632250sZr.LIZJ == null && C1398060mU8.LIZ(str) == null) {
                                C23250099c.LIZLLL((InterfaceC497601wk) c1632250sZr.LIZ.getValue(), C0PEM.LIZJ, null, new C1632270sZt(c1632250sZr, runnable, context, str, mapLJII, music, str2, shootExtraData, c1661120tKQLJIIIZ, c19575111iH, null), 2);
                            } else {
                                if (c1632250sZr.LIZJ == null) {
                                    EffectListResponse effectListResponseLIZ = C1398060mU8.LIZ(str);
                                    if (effectListResponseLIZ != null && (data = effectListResponseLIZ.getData()) != null) {
                                        effect = (Effect) C13LP.LJJJLL(data);
                                    } else {
                                        effect = null;
                                    }
                                    c1632250sZr.LIZJ = effect;
                                }
                                Effect effect2 = c1632250sZr.LIZJ;
                                if (effect2 != null) {
                                    C1632250sZr.LIZIZ(str, effect2, music.convertToMusicModel(), str2, shootExtraData, c1661120tKQLJIIIZ, c19575111iH);
                                }
                            }
                        }
                    } else {
                        C201955140j.LIZLLL(C20012313Rx.LIZIZ, "lazyEffect", "music url invalid, go online logic");
                    }
                }
                runnable.run();
            } else {
                runnable.run();
            }
        }
        C1C7U.LIZIZ("ReuseStickerHelper@c1.download$1");
        return null;
    }

    public C1661340tKm(C19574811iE c19574811iE, boolean z, boolean z2, boolean z3, ArrayList arrayList) {
        this.LJ = c19574811iE;
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = arrayList;
    }
}
