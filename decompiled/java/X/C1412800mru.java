package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.SelectMethodType;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1412800mru {
    public static final /* synthetic */ int LJIILLIIL = 0;
    public final MixEditingMaterialType LIZ;
    public String LIZIZ;
    public final UrlModel LIZJ;
    public final Asset LIZLLL;
    public AbstractC1412880ms2 LJ;
    public boolean LJFF;
    public String LJI;
    public SelectMethodType LJII;
    public SelectMethodType LJIIIIZZ;
    public final boolean LJIIIZ;
    public final Integer LJIIJ;
    public int LJIIJJI;
    public final String LJIIL;
    public final boolean LJIILIIL;
    public String LJIILJJIL;
    public final String LJIILL;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C1412800mru() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        this(null, objArr, objArr2, objArr3, objArr4, false, objArr5, objArr6, objArr7, 0 == true ? 1 : 0, objArr8, 0 == true ? 1 : 0, objArr9, 0 == true ? 1 : 0, objArr10, objArr11, 65535);
    }

    public final C1412860ms0 LIZ() {
        Asset asset = this.LIZLLL;
        if (asset == null) {
            return null;
        }
        return new C1412860ms0(asset, this.LJ, this.LJIILL, 12);
    }

    public final String LIZIZ() {
        String asset_id;
        Asset asset = this.LIZLLL;
        return (asset == null || (asset_id = asset.getAsset_id()) == null) ? "" : asset_id;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        String asset_id;
        if (this == obj) {
            return true;
        }
        String asset_id2 = null;
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(C1412800mru.class, cls)) {
            return false;
        }
        C1412800mru c1412800mru = (C1412800mru) obj;
        Asset asset = this.LIZLLL;
        if (asset != null) {
            asset_id = asset.getAsset_id();
        } else {
            asset_id = null;
        }
        Asset asset2 = c1412800mru.LIZLLL;
        if (asset2 != null) {
            asset_id2 = asset2.getAsset_id();
        }
        return Intrinsics.LJFF(asset_id, asset_id2);
    }

    public C1412800mru(MixEditingMaterialType mixEditingMaterialType, String str, UrlModel urlModel, Asset asset, AbstractC1412880ms2 abstractC1412880ms2, boolean z, String str2, SelectMethodType selectMethodType, SelectMethodType selectMethodType2, boolean z2, Integer num, int i, String str3, boolean z3, String str4, String str5) {
        this.LIZ = mixEditingMaterialType;
        this.LIZIZ = str;
        this.LIZJ = urlModel;
        this.LIZLLL = asset;
        this.LJ = abstractC1412880ms2;
        this.LJFF = z;
        this.LJI = str2;
        this.LJII = selectMethodType;
        this.LJIIIIZZ = selectMethodType2;
        this.LJIIIZ = z2;
        this.LJIIJ = num;
        this.LJIIJJI = i;
        this.LJIIL = str3;
        this.LJIILIIL = z3;
        this.LJIILJJIL = str4;
        this.LJIILL = str5;
    }

    public /* synthetic */ C1412800mru(MixEditingMaterialType mixEditingMaterialType, String str, UrlModel urlModel, Asset asset, AbstractC1412880ms2 abstractC1412880ms2, boolean z, String str2, SelectMethodType selectMethodType, SelectMethodType selectMethodType2, boolean z2, Integer num, int i, String str3, boolean z3, String str4, String str5, int i2) {
        this((i2 & 1) != 0 ? MixEditingMaterialType.UNKNOWN_TYPE : mixEditingMaterialType, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : urlModel, (i2 & 8) != 0 ? null : asset, (i2 & 16) != 0 ? null : abstractC1412880ms2, (i2 & 32) != 0 ? true : z, (i2 & 64) != 0 ? "edit_page_mix_material" : str2, (i2 & 128) != 0 ? SelectMethodType.UNSELECT : selectMethodType, (i2 & 256) != 0 ? null : selectMethodType2, (i2 & 512) != 0 ? false : z2, (i2 & 1024) != 0 ? null : num, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0 : i, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str3, (i2 & 8192) == 0 ? z3 : false, (i2 & 16384) != 0 ? null : str4, (i2 & 32768) != 0 ? null : str5);
    }
}
