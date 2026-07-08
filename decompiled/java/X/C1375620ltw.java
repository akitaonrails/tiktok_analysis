package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ltw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1375620ltw extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C1374300lro LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1376330lv5 LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ SharePackage LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1375620ltw(C1374300lro c1374300lro, Aweme aweme, String str, C1376330lv5 c1376330lv5, String str2, String str3, SharePackage sharePackage, int i) {
        super(1);
        this.LL = c1374300lro;
        this.LLILLJJLI = aweme;
        this.LLILLL = str;
        this.LLILZ = c1376330lv5;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = sharePackage;
        this.LLIZLLLIL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        C1374300lro c1374300lro = this.LL;
        Aweme aweme = this.LLILLJJLI;
        String str = this.LLILLL;
        c1374300lro.getClass();
        C1374300lro.LIZJ(aweme, str, "save_image");
        C1374300lro.LIZ(this.LL, this.LLILZ, this.LLILLJJLI, this.LLILZIL, this.LLILLL, this.LLILZLL, this.LLIZ, 0, false, this.LLIZLLLIL, 64);
        return Unit.LIZ;
    }
}
