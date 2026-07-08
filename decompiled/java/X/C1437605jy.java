package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05jy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.utils.downloader.PUGCTemplateAssetDownloader$downloadData$3", f = "PUGCTemplateAssetDownloader.kt", l = {}, m = "invokeSuspend")
public final class C1437605jy extends C09AX implements Function2<C443120HZe<? extends NLEModel, ? extends AVMusic, ? extends Boolean>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Asset LLILLJJLI;
    public final /* synthetic */ InterfaceC1437705jz<C1412860ms0> LLILLL;
    public final /* synthetic */ C1412860ms0 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1437605jy(InterfaceC1437705jz interfaceC1437705jz, Asset asset, C1412860ms0 c1412860ms0, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = asset;
        this.LLILLL = interfaceC1437705jz;
        this.LLILZ = c1412860ms0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1437605jy c1437605jy = new C1437605jy(this.LLILLL, this.LLILLJJLI, this.LLILZ, interfaceC1364105Vn);
        c1437605jy.LL = obj;
        return c1437605jy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AVMusic aVMusic;
        C1C7U.LIZ("PUGCTemplateAssetDownloader@82cc.downloadData$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C443120HZe c443120HZe = (C443120HZe) this.LL;
        if (c443120HZe.getFirst() == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PUGCTemplateAssetDownloader@82cc.downloadData$3");
            return unit;
        }
        String music_id = this.LLILLJJLI.getBusiness_extra().getMusic_id();
        if (music_id != null && music_id.length() != 0 && !C1416120mxG.LIZJ(this.LLILLJJLI) && c443120HZe.getSecond() == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("PUGCTemplateAssetDownloader@82cc.downloadData$3");
            return unit2;
        }
        this.LLILLL.onProgress(100);
        Object first = c443120HZe.getFirst();
        if (first != null) {
            NLEModel nLEModel = (NLEModel) first;
            if (C1416120mxG.LIZJ(this.LLILLJJLI)) {
                aVMusic = (AVMusic) c443120HZe.getSecond();
            } else {
                String music_id2 = this.LLILLJJLI.getBusiness_extra().getMusic_id();
                if (music_id2 != null && music_id2.length() != 0) {
                    Object second = c443120HZe.getSecond();
                    if (second != null) {
                        aVMusic = (AVMusic) second;
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    aVMusic = null;
                }
            }
            C1414150mu5.LIZJ(this.LLILLJJLI, nLEModel, aVMusic);
            this.LLILLL.LIZIZ(C1412860ms0.LIZ(this.LLILZ, new C1413040msI(nLEModel, aVMusic)), ((Boolean) c443120HZe.getThird()).booleanValue());
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("PUGCTemplateAssetDownloader@82cc.downloadData$3");
            return unit3;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C443120HZe<? extends NLEModel, ? extends AVMusic, ? extends Boolean> c443120HZe, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c443120HZe, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
