package X;

import Y.ARunnableS7S1201000_31;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15LA, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15LA extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1661100tKO LL;
    public final /* synthetic */ MusicModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C15LG LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15LA(C1661100tKO c1661100tKO, MusicModel musicModel, String str, boolean z, C15LG c15lg, String str2, int i) {
        super(0);
        this.LL = c1661100tKO;
        this.LLILLJJLI = musicModel;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = c15lg;
        this.LLILZLL = str2;
        this.LLIZ = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1661180tKW.LIZJ(C1661180tKW.LIZ, this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, true);
        MusicModel musicModel = this.LLILLJJLI;
        C15LG c15lg = this.LLILZIL;
        C371410EhH.LIZIZ(new ARunnableS7S1201000_31(musicModel, this.LLIZ, this.LLILZLL, c15lg, 3));
        return Unit.LIZ;
    }
}
