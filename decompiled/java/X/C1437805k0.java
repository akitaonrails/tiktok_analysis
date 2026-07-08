package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05k0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.utils.downloader.AutoPickTemplateAssetDownloader$downloadData$4", f = "AutoPickTemplateAssetDownloader.kt", l = {}, m = "invokeSuspend")
public final class C1437805k0 extends C09AX implements Function2<C443120HZe<? extends NLEModel, ? extends AVMusic, ? extends Boolean>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Asset LLILLL;
    public final /* synthetic */ InterfaceC1437705jz<C1412860ms0> LLILZ;
    public final /* synthetic */ C1412860ms0 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1437805k0(String str, Asset asset, InterfaceC1437705jz<C1412860ms0> interfaceC1437705jz, C1412860ms0 c1412860ms0, InterfaceC1364105Vn<? super C1437805k0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = asset;
        this.LLILZ = interfaceC1437705jz;
        this.LLILZIL = c1412860ms0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1437805k0 c1437805k0 = new C1437805k0(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1437805k0.LL = obj;
        return c1437805k0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoPickTemplateAssetDownloader@c432.downloadData$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C443120HZe c443120HZe = (C443120HZe) this.LL;
        if (c443120HZe.getFirst() != null && c443120HZe.getSecond() != null) {
            Object first = c443120HZe.getFirst();
            if (first != null) {
                NLEModel nLEModel = (NLEModel) first;
                C0EYQ.LJFF(nLEModel, EnumC1412640mre.AUTO_PICK_TEMPLATE.getValue(), null);
                Object second = c443120HZe.getSecond();
                if (second != null) {
                    AVMusic aVMusic = (AVMusic) second;
                    C0MJ8 c0mj8 = C0MJ8.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("AutoPickTemplateAssetDownloader -> download completed successfully assetId=");
                    sbLIZ.append(this.LLILLJJLI);
                    sbLIZ.append(", fromCache=");
                    sbLIZ.append(((Boolean) c443120HZe.getThird()).booleanValue());
                    C201955140j.LIZJ(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
                    C1414150mu5.LIZJ(this.LLILLL, nLEModel, aVMusic);
                    this.LLILZ.LIZIZ(C1412860ms0.LIZ(this.LLILZIL, new C1413040msI(nLEModel, aVMusic)), ((Boolean) c443120HZe.getThird()).booleanValue());
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
        C1C7U.LIZIZ("AutoPickTemplateAssetDownloader@c432.downloadData$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C443120HZe<? extends NLEModel, ? extends AVMusic, ? extends Boolean> c443120HZe, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c443120HZe, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
