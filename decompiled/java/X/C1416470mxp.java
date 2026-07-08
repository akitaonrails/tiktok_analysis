package X;

import android.util.LruCache;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetUtilsKt;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS136S1100000_22;
import kotlin.jvm.internal.AwS636S0100000_22;

/* JADX INFO: renamed from: X.0mxp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1416470mxp implements InterfaceC1416020mx6<C1412860ms0> {
    public final LifecycleOwner LL;
    public final InterfaceC1635410sex LLILLJJLI;
    public final Function2<String, String, IMusicRequestParam> LLILLL;
    public final InterfaceC1453200nv4 LLILZ;
    public final Function0<InterfaceC1414530muh> LLILZIL;
    public final Function0<VideoPublishEditModel> LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(485));
    public final Map<String, C09AE> LLIZLLLIL = Collections.synchronizedMap(new LinkedHashMap());
    public final C11NJ LLJ = new C11NJ();

    @Override // X.InterfaceC1416020mx6
    public final boolean LIZ(C1412860ms0 c1412860ms0) {
        C1412870ms1 c1412870ms1 = C1412870ms1.LIZ;
        Asset asset = c1412860ms0.LIZ;
        c1412870ms1.getClass();
        if (C1412870ms1.LIZJ(asset) == MixEditingMaterialType.EFFECT_TYPE) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1416020mx6
    public final void LIZIZ(C1412860ms0 c1412860ms0) {
        C1412860ms0 c1412860ms02 = c1412860ms0;
        Asset asset = c1412860ms02.LIZ;
        this.LLILLJJLI.LJII(AssetUtilsKt.convertAssetToEffect(asset, new AwS636S0100000_22(asset, 62)));
        String music_id = c1412860ms02.LIZ.getBusiness_extra().getMusic_id();
        String asset_id = c1412860ms02.LIZ.getAsset_id();
        if (C123100dR.LIZ(music_id)) {
            C1416830myP.LIZ.getClass();
            C1416830myP.LIZ(music_id, asset_id, false);
        }
        C09AE c09ae = this.LLIZLLLIL.get(asset_id);
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.LLIZLLLIL.remove(asset_id);
    }

    @Override // X.InterfaceC1416020mx6
    public final /* bridge */ /* synthetic */ boolean LIZLLL(C1412860ms0 c1412860ms0) {
        return true;
    }

    public static void LJ(final C094D c094d, final String str, String str2) {
        C1416830myP.LIZJ(C1416830myP.LIZ, str, str2, new InterfaceC1416820myO() { // from class: X.0mxn
            @Override // X.InterfaceC1416820myO
            public final void onStart() {
                c094d.LJIIIIZZ(new C443120HZe<>(0, null, Boolean.FALSE));
            }

            @Override // X.InterfaceC1416820myO
            public final void onProgress(int i) {
                c094d.LJIIIIZZ(new C443120HZe<>(Integer.valueOf(i), null, Boolean.FALSE));
            }

            @Override // X.InterfaceC1416820myO
            public final void LIZ(Integer num, String str3) {
                int iIntValue;
                C0MJ8 c0mj8 = C0MJ8.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(" downloadMusic failed - ");
                sbLIZ.append(str3);
                C201955140j.LJIIIIZZ(c0mj8, "MusicDownloadManager", C2188811AlT.LIZIZ(sbLIZ));
                if (num != null && num.intValue() == -1002) {
                    c094d.LJIIIIZZ(new C443120HZe<>(100, null, Boolean.FALSE));
                    c094d.LJIIJJI(null);
                    return;
                }
                C094D<C443120HZe<Integer, ? extends AVMusic, Boolean>> c094d2 = c094d;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = -1;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append(" ,downloadMusic - ");
                sbLIZ2.append(str3);
                c094d2.LJIIJJI(new C1416460mxo(iIntValue, C2188811AlT.LIZIZ(sbLIZ2)));
            }

            @Override // X.InterfaceC1416820myO
            public final void LIZIZ(AVMusic aVMusic, boolean z) {
                C0MJ8 c0mj8 = C0MJ8.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("EffectAssetDownloader downloadMusic success-->musicId:");
                sbLIZ.append(str);
                C201955140j.LJIILL(c0mj8, "MusicDownloadManager", C2188811AlT.LIZIZ(sbLIZ));
                c094d.LJIIIIZZ(new C443120HZe<>(100, aVMusic, Boolean.valueOf(z)));
                c094d.LJIIJJI(null);
            }
        });
    }

    @Override // X.InterfaceC1416020mx6
    public final void LIZJ(C1412860ms0 c1412860ms0, boolean z, InterfaceC1437705jz<C1412860ms0> interfaceC1437705jz) {
        C1412860ms0 c1412860ms02 = c1412860ms0;
        String asset_id = c1412860ms02.LIZ.getAsset_id();
        String music_id = c1412860ms02.LIZ.getBusiness_extra().getMusic_id();
        Asset asset = c1412860ms02.LIZ;
        Effect effectConvertAssetToEffect = AssetUtilsKt.convertAssetToEffect(asset, new AwS636S0100000_22(asset, 62));
        AnonymousClass0956 anonymousClass0956LJJI = C09IC.LJJI(LifecycleOwnerKt.getLifecycleScope(this.LL), new C861640Xr8(new C1437105jt(this, music_id, interfaceC1437705jz, c1412860ms02, null), new C2501109r7(new C1430105il(interfaceC1437705jz, null), C09IC.LJIL(new C414301jJ(C09IC.LJ(new C1416560mxy(this, effectConvertAssetToEffect, z, null)), C1416120mxG.LIZLLL(new C1466840oH4(new C05RH(new C516501zn(((LruCache) this.LLIZ.getValue()).get(effectConvertAssetToEffect.getEffectId()), 1)), 8), C09IC.LJ(new C1416430mxl(music_id, this, asset_id, effectConvertAssetToEffect, null))), new C01NH(null)), C0PEM.LIZJ), 0)));
        this.LLIZLLLIL.put(asset_id, anonymousClass0956LJJI);
        anonymousClass0956LJJI.LJII(new AwS136S1100000_22(this, asset_id, 7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1416470mxp(LifecycleOwner lifecycleOwner, InterfaceC1635410sex interfaceC1635410sex, Function2<? super String, ? super String, ? extends IMusicRequestParam> function2, InterfaceC1453200nv4 interfaceC1453200nv4, Function0<? extends InterfaceC1414530muh> function0, Function0<? extends VideoPublishEditModel> function02) {
        this.LL = lifecycleOwner;
        this.LLILLJJLI = interfaceC1635410sex;
        this.LLILLL = function2;
        this.LLILZ = interfaceC1453200nv4;
        this.LLILZIL = function0;
        this.LLILZLL = function02;
    }
}
