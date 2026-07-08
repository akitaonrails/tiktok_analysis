package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.05ij, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.utils.downloader.AITemplateAssetDownloader$downloadData$3", f = "AITemplateAssetDownloader.kt", l = {}, m = "invokeSuspend")
public final class C1429905ij extends C09AX implements InterfaceC1631620sYq<Pair<? extends Integer, ? extends NLEModel>, Pair<? extends Integer, ? extends AVMusic>, InterfaceC1364105Vn<? super Pair<? extends NLEModel, ? extends AVMusic>>, Object> {
    public /* synthetic */ Pair LL;
    public /* synthetic */ Pair LLILLJJLI;
    public final /* synthetic */ InterfaceC1437705jz<C1412860ms0> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1429905ij(InterfaceC1437705jz<C1412860ms0> interfaceC1437705jz, InterfaceC1364105Vn<? super C1429905ij> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = interfaceC1437705jz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AITemplateAssetDownloader@2497.downloadData$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Pair pair = this.LL;
        Pair pair2 = this.LLILLJJLI;
        this.LLILLL.onProgress((int) ((((Number) pair.getFirst()).floatValue() * 0.5f) + (((Number) pair2.getFirst()).floatValue() * 0.5f)));
        Pair pair3 = new Pair(pair.getSecond(), pair2.getSecond());
        C1C7U.LIZIZ("AITemplateAssetDownloader@2497.downloadData$3");
        return pair3;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Pair<? extends Integer, ? extends NLEModel> pair, Pair<? extends Integer, ? extends AVMusic> pair2, InterfaceC1364105Vn<? super Pair<? extends NLEModel, ? extends AVMusic>> interfaceC1364105Vn) {
        C1429905ij c1429905ij = new C1429905ij(this.LLILLL, interfaceC1364105Vn);
        c1429905ij.LL = pair;
        c1429905ij.LLILLJJLI = pair2;
        return c1429905ij.invokeSuspend(Unit.LIZ);
    }
}
