package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mwc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1415720mwc extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C1417310mzB LLILLJJLI;
    public final /* synthetic */ AVMusic LLILLL;
    public final /* synthetic */ C1417330mzD LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C1417310mzB LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1415720mwc(String str, C1417310mzB c1417310mzB, AVMusic aVMusic, C1417330mzD c1417330mzD, String str2, C1417310mzB c1417310mzB2) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = c1417310mzB;
        this.LLILLL = aVMusic;
        this.LLILZ = c1417330mzD;
        this.LLILZIL = str2;
        this.LLILZLL = c1417310mzB2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1415050mvX c1415050mvX = C1415050mvX.LIZ;
        String str = this.LL;
        String str2 = this.LLILLJJLI.LJIIIZ;
        if (str2 == null) {
            str2 = "";
        }
        String strValueOf = String.valueOf(this.LLILLL.id);
        Integer numValueOf = Integer.valueOf(this.LLILZ.Na().getMediaModelList().size());
        String str3 = this.LLILZIL;
        c1415050mvX.getClass();
        C1415050mvX.LJII(numValueOf, str, "apply_music", str2, strValueOf, str3, true);
        this.LLILZ.n5(this.LLILLJJLI, this.LLILZLL);
        String str4 = this.LL;
        c1415050mvX.getClass();
        C1415050mvX.LIZIZ(0, str4, "apply_music", null, null);
        return Unit.LIZ;
    }
}
