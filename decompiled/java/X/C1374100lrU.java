package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0lrU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1374100lrU extends C09AY implements Function2<AbstractC1375550ltp, Boolean, Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ InterfaceC1369790lkX LLILZIL;
    public final /* synthetic */ SharePackage LLILZLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1374100lrU(Context context, String str, String str2, String str3, InterfaceC1369790lkX interfaceC1369790lkX, SharePackage sharePackage, Function1<? super Boolean, Unit> function1) {
        super(2);
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = interfaceC1369790lkX;
        this.LLILZLL = sharePackage;
        this.LLIZ = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AbstractC1375550ltp abstractC1375550ltp, Boolean bool) {
        bool.booleanValue();
        C1375540lto c1375540lto = new C1375540lto(C08ZO.LIZ(this.LL, new C0VSJ(this.LLILLJJLI)), this.LLILLL, this.LLILZ, ((C1371430lnB) abstractC1375550ltp).LIZLLL, null, false, 200);
        String str = c1375540lto.LJ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c1375540lto.LIZIZ("content_url", str);
        c1375540lto.LIZIZ("media_type", "image/png");
        this.LLILZIL.LJJJIL(c1375540lto, this.LL, null);
        Bundle bundle = this.LLILZLL.extras;
        String str3 = C1373990lrJ.LIZ.get(ShareContentType.LINK_PLUS_PHOTO);
        if (str3 != null) {
            str2 = str3;
        }
        C786410Ut5.LJJJI("share_form", str2, bundle);
        this.LLIZ.invoke(Boolean.TRUE);
        return Unit.LIZ;
    }
}
