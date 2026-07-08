package X;

import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0lqp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1373690lqp extends C09AY implements Function0<Unit> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ AbstractC1375080lt4 LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ SharePackage LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1373690lqp(View view, Aweme aweme, boolean z, int i, String str, AbstractC1375080lt4 abstractC1375080lt4, String str2, SharePackage sharePackage) {
        super(0);
        this.LL = view;
        this.LLILLJJLI = aweme;
        this.LLILLL = z;
        this.LLILZ = i;
        this.LLILZIL = str;
        this.LLILZLL = abstractC1375080lt4;
        this.LLIZ = str2;
        this.LLIZLLLIL = sharePackage;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null) {
            View view = this.LL;
            Aweme aweme = this.LLILLJJLI;
            boolean z = this.LLILLL;
            int i = this.LLILZ;
            String str = this.LLILZIL;
            AbstractC1375080lt4 abstractC1375080lt4 = this.LLILZLL;
            String str2 = this.LLIZ;
            SharePackage sharePackage = this.LLIZLLLIL;
            C1373850lr5.LIZ.getClass();
            C1373540lqa.LJIILL(activityLJFF, view, aweme, z, i, str, abstractC1375080lt4, str2, sharePackage);
        }
        return Unit.LIZ;
    }
}
