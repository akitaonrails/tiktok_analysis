package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05jx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.utils.downloader.CCTemplateAssetDownloader$ccTemplateDownloadWithMusic$3", f = "CCTemplateAssetDownloader.kt", l = {}, m = "invokeSuspend")
public final class C1437505jx extends C09AX implements Function2<C443120HZe<? extends NLEModel, ? extends AVMusic, ? extends Boolean>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InterfaceC1437705jz<C1412860ms0> LLILLJJLI;
    public final /* synthetic */ Asset LLILLL;
    public final /* synthetic */ C1412860ms0 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1437505jx(InterfaceC1437705jz<C1412860ms0> interfaceC1437705jz, Asset asset, C1412860ms0 c1412860ms0, InterfaceC1364105Vn<? super C1437505jx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1437705jz;
        this.LLILLL = asset;
        this.LLILZ = c1412860ms0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1437505jx c1437505jx = new C1437505jx(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1437505jx.LL = obj;
        return c1437505jx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CCTemplateAssetDownloader@85b6.ccTemplateDownloadWithMusic$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C443120HZe c443120HZe = (C443120HZe) this.LL;
        if (c443120HZe.getFirst() != null && c443120HZe.getSecond() != null) {
            this.LLILLJJLI.onProgress(100);
            Object first = c443120HZe.getFirst();
            if (first != null) {
                NLEModel nLEModel = (NLEModel) first;
                Object second = c443120HZe.getSecond();
                if (second != null) {
                    AVMusic aVMusic = (AVMusic) second;
                    C1414150mu5.LIZJ(this.LLILLL, nLEModel, aVMusic);
                    this.LLILLJJLI.LIZIZ(C1412860ms0.LIZ(this.LLILZ, new C1413040msI(nLEModel, aVMusic)), ((Boolean) c443120HZe.getThird()).booleanValue());
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("CCTemplateAssetDownloader@85b6.ccTemplateDownloadWithMusic$3");
                    return unit;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CCTemplateAssetDownloader@85b6.ccTemplateDownloadWithMusic$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C443120HZe<? extends NLEModel, ? extends AVMusic, ? extends Boolean> c443120HZe, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c443120HZe, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
