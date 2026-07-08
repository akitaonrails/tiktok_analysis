package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.router.SmartRoute;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.08xD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2284108xD extends C09AY implements Function2<String, Context, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Uri LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Uri.Builder LLILZ;
    public final /* synthetic */ C259800zU<Uri> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2284108xD(String str, Uri uri, String str2, Uri.Builder builder, C259800zU<Uri> c259800zU) {
        super(2);
        this.LL = str;
        this.LLILLJJLI = uri;
        this.LLILLL = str2;
        this.LLILZ = builder;
        this.LLILZIL = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Context context) {
        String str2 = str;
        Context context2 = context;
        C2284908xL c2284908xL = C2284908xL.LIZ;
        String str3 = this.LL;
        Uri uri = this.LLILLJJLI;
        String str4 = this.LLILLL;
        c2284908xL.getClass();
        C2284908xL.LIZ(uri, str3, str4);
        Uri.Builder builder = this.LLILZ;
        if (str2 != null) {
            builder.appendQueryParameter("source_btm_token", str2);
        }
        String string = builder.appendQueryParameter("landing_deeplink", this.LLILZIL.element.toString()).build().toString();
        SmartRoute smartRoute = new SmartRoute(context2);
        smartRoute.withUrl(string);
        smartRoute.open();
        return Unit.LIZ;
    }
}
