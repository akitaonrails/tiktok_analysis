package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.05iZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.utils.downloader.PUGCTemplateAssetDownloader$downloadData$2$2", f = "PUGCTemplateAssetDownloader.kt", l = {}, m = "invokeSuspend")
public final class C1428905iZ extends C09AX implements InterfaceC1631620sYq<Pair<? extends Integer, ? extends NLEModel>, Pair<? extends Integer, ? extends AVMusic>, InterfaceC1364105Vn<? super C443120HZe<? extends NLEModel, ? extends AVMusic, ? extends Boolean>>, Object> {
    public /* synthetic */ Pair LL;
    public /* synthetic */ Pair LLILLJJLI;
    public final /* synthetic */ InterfaceC1437705jz<C1412860ms0> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1428905iZ(InterfaceC1437705jz<C1412860ms0> interfaceC1437705jz, InterfaceC1364105Vn<? super C1428905iZ> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = interfaceC1437705jz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PUGCTemplateAssetDownloader@82cc.downloadData$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Pair pair = this.LL;
        Pair pair2 = this.LLILLJJLI;
        this.LLILLL.onProgress((int) ((((Number) pair.getFirst()).floatValue() * 0.5f) + (((Number) pair2.getFirst()).floatValue() * 0.5f)));
        C443120HZe c443120HZe = new C443120HZe(pair.getSecond(), pair2.getSecond(), false);
        C1C7U.LIZIZ("PUGCTemplateAssetDownloader@82cc.downloadData$2$2");
        return c443120HZe;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Pair<? extends Integer, ? extends NLEModel> pair, Pair<? extends Integer, ? extends AVMusic> pair2, InterfaceC1364105Vn<? super C443120HZe<? extends NLEModel, ? extends AVMusic, ? extends Boolean>> interfaceC1364105Vn) {
        C1428905iZ c1428905iZ = new C1428905iZ(this.LLILLL, interfaceC1364105Vn);
        c1428905iZ.LL = pair;
        c1428905iZ.LLILLJJLI = pair2;
        return c1428905iZ.invokeSuspend(Unit.LIZ);
    }
}
