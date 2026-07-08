package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MJ5, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MJ5 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1415130mvf LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ AVMusic LLILZLL;
    public final /* synthetic */ Integer LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ VideoPublishEditModel LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MJ5(C1415130mvf c1415130mvf, String str, String str2, String str3, String str4, AVMusic aVMusic, Integer num, String str5, String str6, String str7, VideoPublishEditModel videoPublishEditModel) {
        super(0);
        this.LL = c1415130mvf;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = aVMusic;
        this.LLIZ = num;
        this.LLIZLLLIL = str5;
        this.LLJ = str6;
        this.LLJI = str7;
        this.LLJIJIL = videoPublishEditModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1415130mvf c1415130mvf = this.LL;
        C23250099c.LIZLLL(c1415130mvf.LJ, null, null, new C0MJ3(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, c1415130mvf, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, null), 3);
        return Unit.LIZ;
    }
}
