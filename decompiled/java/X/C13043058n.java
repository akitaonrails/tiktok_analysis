package X;

import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.image.music.MediaPlayerManagerServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.058n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.music.MediaPlayerManagerServiceImpl$waitCopyMusicPathDone$1$1", f = "MediaPlayerManagerServiceImpl.kt", l = {110}, m = "invokeSuspend")
public final class C13043058n extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MediaPlayerManagerServiceImpl LLILLJJLI;
    public final /* synthetic */ MusicBuzModel LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13043058n(MediaPlayerManagerServiceImpl mediaPlayerManagerServiceImpl, MusicBuzModel musicBuzModel, String str, InterfaceC1364105Vn<? super C13043058n> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mediaPlayerManagerServiceImpl;
        this.LLILLL = musicBuzModel;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C13043058n(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediaPlayerManagerServiceImpl@312d.waitCopyMusicPathDone$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            MediaPlayerManagerServiceImpl mediaPlayerManagerServiceImpl = this.LLILLJJLI;
            MusicBuzModel musicBuzModel = this.LLILLL;
            String str = this.LLILZ;
            this.LL = 1;
            if (C13044058o.LIZ(mediaPlayerManagerServiceImpl, musicBuzModel, str, false, this, 12) == objLJFF) {
                C1C7U.LIZIZ("MediaPlayerManagerServiceImpl@312d.waitCopyMusicPathDone$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediaPlayerManagerServiceImpl@312d.waitCopyMusicPathDone$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
