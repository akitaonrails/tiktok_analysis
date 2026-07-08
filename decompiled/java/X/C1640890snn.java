package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.StickerSetCategory;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0snn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1640890snn {
    public final EnumC1641460soi LIZ;
    public final EnumC1641400soc LIZIZ;
    public final List<Effect> LIZJ;
    public final List<ProviderEffect> LIZLLL;
    public final List<InfoStickerEffect> LJ;
    public final List<Pair<Effect, Integer>> LJFF;
    public final EnumC1412780mrs LJI;
    public final List<StickerSetCategory> LJII;
    public final List<Asset> LJIIIIZZ;

    public C1640890snn() {
        throw null;
    }

    public C1640890snn(EnumC1641460soi enumC1641460soi, EnumC1641400soc enumC1641400soc, List list, List list2, List list3, EnumC1412780mrs enumC1412780mrs, List list4, int i) {
        enumC1641400soc = (i & 2) != 0 ? null : enumC1641400soc;
        list = (i & 4) != 0 ? null : list;
        list2 = (i & 8) != 0 ? null : list2;
        list3 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : list3;
        enumC1412780mrs = (i & 8192) != 0 ? null : enumC1412780mrs;
        list4 = (i & 16384) != 0 ? null : list4;
        this.LIZ = enumC1641460soi;
        this.LIZIZ = enumC1641400soc;
        this.LIZJ = list;
        this.LIZLLL = list2;
        this.LJ = null;
        this.LJFF = list3;
        this.LJI = enumC1412780mrs;
        this.LJII = list4;
        this.LJIIIIZZ = null;
    }
}
