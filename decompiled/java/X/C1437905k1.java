package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05k1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.utils.downloader.AITemplateAssetDownloader$downloadData$4", f = "AITemplateAssetDownloader.kt", l = {}, m = "invokeSuspend")
public final class C1437905k1 extends C09AX implements Function2<Pair<? extends NLEModel, ? extends AVMusic>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Asset LLILLJJLI;
    public final /* synthetic */ InterfaceC1437705jz<C1412860ms0> LLILLL;
    public final /* synthetic */ C1412860ms0 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1437905k1(InterfaceC1437705jz interfaceC1437705jz, Asset asset, C1412860ms0 c1412860ms0, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = asset;
        this.LLILLL = interfaceC1437705jz;
        this.LLILZ = c1412860ms0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1437905k1 c1437905k1 = new C1437905k1(this.LLILLL, this.LLILLJJLI, this.LLILZ, interfaceC1364105Vn);
        c1437905k1.LL = obj;
        return c1437905k1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AITemplateAssetDownloader@2497.downloadData$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Pair pair = (Pair) this.LL;
        if (pair.getFirst() != null && pair.getSecond() != null) {
            Object first = pair.getFirst();
            if (first != null) {
                NLEModel nLEModel = (NLEModel) first;
                C0EYQ.LJFF(nLEModel, EnumC1412640mre.ALGORITHM_TEMPLATE.getValue(), null);
                Object second = pair.getSecond();
                if (second != null) {
                    C1414150mu5.LIZJ(this.LLILLJJLI, nLEModel, (AVMusic) second);
                    this.LLILLL.LIZIZ(C1412860ms0.LIZ(this.LLILZ, new C1413040msI(nLEModel, (AVMusic) pair.getSecond())), false);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AITemplateAssetDownloader@2497.downloadData$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends NLEModel, ? extends AVMusic> pair, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(pair, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
