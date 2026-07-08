package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.01NG, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.utils.downloader.SoundSyncAssetDownloader$downloadData$1", f = "SoundSyncAssetDownloader.kt", l = {}, m = "invokeSuspend")
public final class C01NG extends C09AX implements InterfaceC1631620sYq<Pair<? extends Integer, ? extends AVMusic>, Boolean, InterfaceC1364105Vn<? super Pair<? extends Pair<? extends Integer, ? extends AVMusic>, ? extends Boolean>>, Object> {
    public /* synthetic */ Pair LL;
    public /* synthetic */ boolean LLILLJJLI;

    public C01NG(InterfaceC1364105Vn<? super C01NG> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SoundSyncAssetDownloader@f4a2.downloadData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Pair pair = new Pair(this.LL, Boolean.valueOf(this.LLILLJJLI));
        C1C7U.LIZIZ("SoundSyncAssetDownloader@f4a2.downloadData$1");
        return pair;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Pair<? extends Integer, ? extends AVMusic> pair, Boolean bool, InterfaceC1364105Vn<? super Pair<? extends Pair<? extends Integer, ? extends AVMusic>, ? extends Boolean>> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        C01NG c01ng = new C01NG(interfaceC1364105Vn);
        c01ng.LL = pair;
        c01ng.LLILLJJLI = zBooleanValue;
        return c01ng.invokeSuspend(Unit.LIZ);
    }
}
