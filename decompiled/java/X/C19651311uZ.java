package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ogc.news.anchor.producer.NewsAnchorPublishViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11uZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19651311uZ extends C09AY implements Function1<C19654511v5, C19654511v5> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C19513311Vz LLILLJJLI;
    public final /* synthetic */ NewsAnchorPublishViewModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19651311uZ(boolean z, C19513311Vz c19513311Vz, NewsAnchorPublishViewModel newsAnchorPublishViewModel, String str, String str2) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = c19513311Vz;
        this.LLILLL = newsAnchorPublishViewModel;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C19654511v5 invoke(C19654511v5 c19654511v5) {
        UrlModel urlModel;
        int iIntValue;
        C19654511v5 c19654511v52 = c19654511v5;
        C19653911uz c19653911uz = new C19653911uz(Boolean.FALSE);
        Integer numValueOf = null;
        if (this.LL) {
            urlModel = this.LLILLJJLI.LIZJ;
            Integer num = this.LLILLL.LLILZLL.titleMaximumLength;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 35;
            }
            numValueOf = Integer.valueOf(iIntValue);
        } else {
            urlModel = null;
        }
        return C19654511v5.LIZ(c19654511v52, new C19654911v9(Boolean.valueOf(this.LL), urlModel, numValueOf, this.LLILZ), null, new C1556320qbO(this.LLILZIL), null, c19653911uz, new C291001Au(new C19653711ux(this.LL)), null, 74);
    }
}
