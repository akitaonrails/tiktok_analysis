package X;

import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.image.music.MediaPlayerManagerServiceImpl;

/* JADX INFO: renamed from: X.141L, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.music.MediaPlayerManagerServiceImpl", f = "MediaPlayerManagerServiceImpl.kt", l = {129}, m = "replaceMusicPathIfNeed")
public final class C141L extends AbstractC23140094w {
    public MusicBuzModel LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public C141N LLILZ;
    public long LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ MediaPlayerManagerServiceImpl LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C141L(MediaPlayerManagerServiceImpl mediaPlayerManagerServiceImpl, InterfaceC1364105Vn<? super C141L> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = mediaPlayerManagerServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediaPlayerManagerServiceImpl@312d.replaceMusicPathIfNeed$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLIZ.LIZIZ(null, null, false, false, this);
        C1C7U.LIZIZ("MediaPlayerManagerServiceImpl@312d.replaceMusicPathIfNeed$1");
        return objLIZIZ;
    }
}
