package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05js, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.utils.downloader.SoundSyncAssetDownloader$downloadData$3", f = "SoundSyncAssetDownloader.kt", l = {}, m = "invokeSuspend")
public final class C1437005js extends C09AX implements Function2<Pair<? extends Pair<? extends Integer, ? extends AVMusic>, ? extends Boolean>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InterfaceC1437705jz<C1412860ms0> LLILLJJLI;
    public final /* synthetic */ C1412860ms0 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1437005js(InterfaceC1437705jz<C1412860ms0> interfaceC1437705jz, C1412860ms0 c1412860ms0, InterfaceC1364105Vn<? super C1437005js> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1437705jz;
        this.LLILLL = c1412860ms0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1437005js c1437005js = new C1437005js(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1437005js.LL = obj;
        return c1437005js;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SoundSyncAssetDownloader@f4a2.downloadData$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Pair pair = (Pair) this.LL;
        Pair pair2 = (Pair) pair.getFirst();
        boolean zBooleanValue = ((Boolean) pair.getSecond()).booleanValue();
        AVMusic aVMusic = (AVMusic) pair2.getSecond();
        int i = 0;
        boolean z = false;
        if (aVMusic != null && zBooleanValue) {
            InterfaceC1437705jz<C1412860ms0> interfaceC1437705jz = this.LLILLJJLI;
            C1412860ms0 c1412860ms0LIZ = C1412860ms0.LIZ(this.LLILLL, new C1413060msK(aVMusic));
            if (((Number) pair2.getFirst()).intValue() < 0) {
                z = true;
            }
            interfaceC1437705jz.LIZIZ(c1412860ms0LIZ, z);
        } else {
            InterfaceC1437705jz<C1412860ms0> interfaceC1437705jz2 = this.LLILLJJLI;
            int iDoubleValue = (int) (((Number) pair2.getFirst()).doubleValue() * 0.8d);
            if (zBooleanValue) {
                i = 20;
            }
            interfaceC1437705jz2.onProgress(iDoubleValue + i);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SoundSyncAssetDownloader@f4a2.downloadData$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends Pair<? extends Integer, ? extends AVMusic>, ? extends Boolean> pair, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(pair, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
