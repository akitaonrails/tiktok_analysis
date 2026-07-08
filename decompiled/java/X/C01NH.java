package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.01NH, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.utils.downloader.EffectAssetDownloader$downloadData$2", f = "EffectAssetDownloader.kt", l = {}, m = "invokeSuspend")
public final class C01NH extends C09AX implements InterfaceC1631620sYq<C443120HZe<? extends Integer, ? extends Effect, ? extends Boolean>, C443120HZe<? extends Integer, ? extends AVMusic, ? extends Boolean>, InterfaceC1364105Vn<? super Pair<? extends C443120HZe<? extends Integer, ? extends Effect, ? extends Boolean>, ? extends C443120HZe<? extends Integer, ? extends AVMusic, ? extends Boolean>>>, Object> {
    public /* synthetic */ C443120HZe LL;
    public /* synthetic */ C443120HZe LLILLJJLI;

    public C01NH(InterfaceC1364105Vn<? super C01NH> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectAssetDownloader@f641.downloadData$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Pair pair = new Pair(this.LL, this.LLILLJJLI);
        C1C7U.LIZIZ("EffectAssetDownloader@f641.downloadData$2");
        return pair;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C443120HZe<? extends Integer, ? extends Effect, ? extends Boolean> c443120HZe, C443120HZe<? extends Integer, ? extends AVMusic, ? extends Boolean> c443120HZe2, InterfaceC1364105Vn<? super Pair<? extends C443120HZe<? extends Integer, ? extends Effect, ? extends Boolean>, ? extends C443120HZe<? extends Integer, ? extends AVMusic, ? extends Boolean>>> interfaceC1364105Vn) {
        C01NH c01nh = new C01NH(interfaceC1364105Vn);
        c01nh.LL = c443120HZe;
        c01nh.LLILLJJLI = c443120HZe2;
        return c01nh.invokeSuspend(Unit.LIZ);
    }
}
