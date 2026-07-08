package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.05ii, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.utils.downloader.SoundSyncAssetDownloader$downloadData$2", f = "SoundSyncAssetDownloader.kt", l = {}, m = "invokeSuspend")
public final class C1429805ii extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super Pair<? extends Pair<? extends Integer, ? extends AVMusic>, ? extends Boolean>>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InterfaceC1437705jz<C1412860ms0> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1429805ii(InterfaceC1437705jz<C1412860ms0> interfaceC1437705jz, InterfaceC1364105Vn<? super C1429805ii> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1437705jz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Exception exc;
        C1C7U.LIZ("SoundSyncAssetDownloader@f4a2.downloadData$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Throwable th = (Throwable) this.LL;
        InterfaceC1437705jz<C1412860ms0> interfaceC1437705jz = this.LLILLJJLI;
        if (th instanceof Exception) {
            exc = (Exception) th;
        } else {
            exc = null;
        }
        interfaceC1437705jz.LIZ(exc);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SoundSyncAssetDownloader@f4a2.downloadData$2");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super Pair<? extends Pair<? extends Integer, ? extends AVMusic>, ? extends Boolean>> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C1429805ii c1429805ii = new C1429805ii(this.LLILLJJLI, interfaceC1364105Vn);
        c1429805ii.LL = th;
        return c1429805ii.invokeSuspend(Unit.LIZ);
    }
}
