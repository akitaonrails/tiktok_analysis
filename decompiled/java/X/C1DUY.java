package X;

import com.ss.android.ugc.aweme.creation.publish.album.IAlbumPreuploadManager;

/* JADX INFO: renamed from: X.1DUY, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
@C09DV(c = "com.ss.android.ugc.aweme.creation.sender.mediasendingsteps.AwaitPreuploadStep", f = "AwaitPreuploadStep.kt", l = {79, 81}, m = "execute")
public final class C1DUY extends AbstractC23140094w {
    public C869590Y9l LL;
    public IAlbumPreuploadManager LLILLJJLI;
    public long LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1DUX LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1DUY(C1DUX c1dux, InterfaceC1364105Vn<? super C1DUY> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c1dux;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AwaitPreuploadStep@a8a2.execute$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(null, this);
        C1C7U.LIZIZ("AwaitPreuploadStep@a8a2.execute$1");
        return objLIZ;
    }
}
