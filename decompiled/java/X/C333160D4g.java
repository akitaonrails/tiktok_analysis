package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.shop.ShopActivity;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0D4g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C333160D4g extends C09AY implements Function0<Map<String, ? extends String>> {
    public final /* synthetic */ ShopActivity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333160D4g(ShopActivity shopActivity) {
        super(0);
        this.LL = shopActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, ? extends java.lang.String> invoke() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.shop.ShopActivity r3 = r4.LL
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            java.lang.String r2 = "extra_pass_through"
            if (r1 < r0) goto L27
            android.content.Intent r1 = r3.getIntent()
            java.lang.Class<java.io.Serializable> r0 = java.io.Serializable.class
            java.io.Serializable r1 = r1.getSerializableExtra(r2, r0)
            boolean r0 = r1 instanceof java.io.Serializable
            if (r0 == 0) goto L34
        L18:
            java.util.HashMap r1 = (java.util.HashMap) r1
            if (r1 == 0) goto L22
            java.util.Map r0 = X.C2097608Jq.LJIIZILJ(r1)
            if (r0 != 0) goto L26
        L22:
            java.util.Map r0 = X.C2097608Jq.LJ()
        L26:
            return r0
        L27:
            android.content.Intent r0 = r3.getIntent()
            java.io.Serializable r1 = r0.getSerializableExtra(r2)
            boolean r0 = r1 instanceof java.io.Serializable
            if (r0 == 0) goto L34
            goto L18
        L34:
            r1 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C333160D4g.invoke():java.lang.Object");
    }
}
