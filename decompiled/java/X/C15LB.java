package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15LB, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15LB extends C09AY implements Function0<Unit> {
    public final /* synthetic */ MusicModel LL;
    public final /* synthetic */ C15LG LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15LB(MusicModel musicModel, C15LG c15lg, String str, int i) {
        super(0);
        this.LL = musicModel;
        this.LLILLJJLI = c15lg;
        this.LLILLL = str;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.setDownloadComplete(true);
        this.LL.setDownloadAfterGoNext(false);
        C15LG c15lg = this.LLILLJJLI;
        String str = this.LLILLL;
        c15lg.eL(this.LLILZ, this.LL, str);
        return Unit.LIZ;
    }
}
