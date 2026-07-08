package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS59S1300000_21;

/* JADX INFO: renamed from: X.0ltu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1375600ltu extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C1374300lro LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1376330lv5 LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ SharePackage LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ C19EG LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1375600ltu(C1374300lro c1374300lro, Aweme aweme, String str, C1376330lv5 c1376330lv5, String str2, String str3, SharePackage sharePackage, int i, C19EG c19eg) {
        super(1);
        this.LL = c1374300lro;
        this.LLILLJJLI = aweme;
        this.LLILLL = str;
        this.LLILZ = c1376330lv5;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = sharePackage;
        this.LLIZLLLIL = i;
        this.LLJ = c19eg;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        boolean z;
        C1374300lro c1374300lro = this.LL;
        Aweme aweme = this.LLILLJJLI;
        String str = this.LLILLL;
        c1374300lro.getClass();
        C1374300lro.LIZJ(aweme, str, "save_video");
        C1375670lu1 c1375670lu1 = C1375670lu1.LIZ;
        Aweme aweme2 = this.LLILLJJLI;
        c1375670lu1.getClass();
        C1375670lu1.LJ(1, 0, aweme2);
        C1374300lro c1374300lro2 = this.LL;
        boolean zLJFF = C721220SQu.LJFF(0, this.LLILLJJLI);
        if (this.LLILLJJLI.getMusic() == null) {
            z = true;
        } else {
            z = false;
        }
        c1374300lro2.getClass();
        if (zLJFF && z) {
            C1374300lro.LIZ(this.LL, this.LLILZ, this.LLILLJJLI, this.LLILZIL, this.LLILLL, this.LLILZLL, this.LLIZ, 0, true, 0, 256);
        } else {
            C1374300lro c1374300lro3 = this.LL;
            Aweme aweme3 = this.LLILLJJLI;
            String str2 = this.LLILZLL;
            String str3 = this.LLILZIL;
            String str4 = this.LLILLL;
            SharePackage sharePackage = this.LLIZ;
            int i = this.LLIZLLLIL;
            c1374300lro3.getClass();
            C1374300lro.LIZIZ(aweme3, str2, str3, str4, 0, sharePackage, i);
            C1376300lv2 c1376300lv2 = C1376300lv2.LIZ;
            Aweme aweme4 = this.LLILLJJLI;
            String str5 = this.LLILZIL;
            AwS59S1300000_21 awS59S1300000_21 = new AwS59S1300000_21(str5, aweme4, this.LLJ, this.LLIZ, 0);
            c1376300lv2.getClass();
            C1376300lv2.LIZJ(aweme4, str5, awS59S1300000_21);
        }
        return Unit.LIZ;
    }
}
