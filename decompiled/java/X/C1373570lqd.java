package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lqd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1373570lqd extends C09AY implements Function2<AbstractC1375550ltp, Boolean, Unit> {
    public final /* synthetic */ InterfaceC1369790lkX LL;
    public final /* synthetic */ SharePackage LLILLJJLI;
    public final /* synthetic */ C259800zU<C1375540lto> LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL = "url_photo_form";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1373570lqd(InterfaceC1369790lkX interfaceC1369790lkX, SharePackage sharePackage, C259800zU c259800zU, Context context, String str) {
        super(2);
        this.LL = interfaceC1369790lkX;
        this.LLILLJJLI = sharePackage;
        this.LLILLL = c259800zU;
        this.LLILZ = context;
        this.LLILZIL = str;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, X.0lto] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AbstractC1375550ltp abstractC1375550ltp, Boolean bool) {
        String str;
        String str2;
        bool.booleanValue();
        String str3 = ((C1371430lnB) abstractC1375550ltp).LIZLLL;
        C1373440lqQ c1373440lqQ = C1373440lqQ.LIZ;
        InterfaceC1369790lkX interfaceC1369790lkX = this.LL;
        String str4 = this.LLILLJJLI.itemType;
        c1373440lqQ.getClass();
        boolean zLIZIZ = C1373440lqQ.LIZIZ(interfaceC1369790lkX, str4, 5);
        String str5 = "";
        if (!zLIZIZ) {
            str = "";
            str2 = "";
        } else {
            str = this.LLILLJJLI.description;
            str2 = this.LLILLJJLI.title;
        }
        C259800zU<C1375540lto> c259800zU = this.LLILLL;
        Uri uriLIZ = C2203008k8.LIZ(this.LLILZ, new C0VSJ(this.LLILZIL));
        if (Intrinsics.LJFF(this.LL.key(), "snapchat")) {
            str = "";
        }
        c259800zU.element = new C1375540lto(uriLIZ, str, str2, str3, null, false, 200);
        C1375540lto c1375540lto = this.LLILLL.element;
        String str6 = c1375540lto.LJ;
        if (str6 != null) {
            str5 = str6;
        }
        c1375540lto.LIZIZ("content_url", str5);
        this.LLILLL.element.LIZIZ("media_type", "image/png");
        C786410Ut5.LJJJI("share_form", this.LLILZLL, this.LLILLJJLI.extras);
        final InterfaceC1369790lkX interfaceC1369790lkX2 = this.LL;
        interfaceC1369790lkX2.LJJIIJ(this.LLILLL.element, this.LLILZ, new C0M7Y() { // from class: X.0lqw
            @Override // X.C0M7Y
            public final InterfaceC1362720lZ8 LIZ() {
                return null;
            }

            @Override // X.C0M7Y
            public final View LIZIZ() {
                return null;
            }
        });
        return Unit.LIZ;
    }
}
