package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ju, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.utils.downloader.CCTemplateAssetDownloader$rawCcTemplateDownload$3", f = "CCTemplateAssetDownloader.kt", l = {}, m = "invokeSuspend")
public final class C1437205ju extends C09AX implements Function2<C443120HZe<? extends Integer, ? extends NLEModel, ? extends Boolean>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Asset LLILLJJLI;
    public final /* synthetic */ InterfaceC1437705jz<C1412860ms0> LLILLL;
    public final /* synthetic */ C1412860ms0 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1437205ju(InterfaceC1437705jz interfaceC1437705jz, Asset asset, C1412860ms0 c1412860ms0, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = asset;
        this.LLILLL = interfaceC1437705jz;
        this.LLILZ = c1412860ms0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1437205ju c1437205ju = new C1437205ju(this.LLILLL, this.LLILLJJLI, this.LLILZ, interfaceC1364105Vn);
        c1437205ju.LL = obj;
        return c1437205ju;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CCTemplateAssetDownloader@85b6.rawCcTemplateDownload$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C443120HZe c443120HZe = (C443120HZe) this.LL;
        if (((Number) c443120HZe.getFirst()).intValue() == 100 && c443120HZe.getSecond() != null) {
            Object second = c443120HZe.getSecond();
            if (second != null) {
                NLEModel nLEModel = (NLEModel) second;
                C1414150mu5.LIZJ(this.LLILLJJLI, nLEModel, null);
                this.LLILLL.LIZIZ(C1412860ms0.LIZ(this.LLILZ, new C1413040msI(nLEModel, null)), ((Boolean) c443120HZe.getThird()).booleanValue());
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("CCTemplateAssetDownloader@85b6.rawCcTemplateDownload$3");
                return unit;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        this.LLILLL.onProgress(((Number) c443120HZe.getFirst()).intValue());
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CCTemplateAssetDownloader@85b6.rawCcTemplateDownload$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C443120HZe<? extends Integer, ? extends NLEModel, ? extends Boolean> c443120HZe, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c443120HZe, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
