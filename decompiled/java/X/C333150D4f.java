package X;

import android.os.Build;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.thankyou.ThankYouActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0D4f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C333150D4f extends C09AY implements Function0<C332710D2n> {
    public final /* synthetic */ ThankYouActivity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333150D4f(ThankYouActivity thankYouActivity) {
        super(0);
        this.LL = thankYouActivity;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.0D2n, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.0D2n, java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function0
    public final C332710D2n invoke() {
        if (Build.VERSION.SDK_INT >= 33) {
            ?? serializableExtra = this.LL.getIntent().getSerializableExtra("ucp_entry_context", C332710D2n.class);
            return serializableExtra == 0 ? new C332710D2n(C0DHO.STANDARD, null, null, null) : serializableExtra;
        }
        ?? serializableExtra2 = this.LL.getIntent().getSerializableExtra("ucp_entry_context");
        return (!(serializableExtra2 instanceof C332710D2n) || serializableExtra2 == 0) ? new C332710D2n(C0DHO.STANDARD, null, null, null) : serializableExtra2;
    }
}
