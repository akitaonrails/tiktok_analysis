package X;

import android.content.Intent;
import android.os.Build;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.shop.ShopActivity;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0D4e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C333140D4e extends C09AY implements Function0<C332710D2n> {
    public final /* synthetic */ ShopActivity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333140D4e(ShopActivity shopActivity) {
        super(0);
        this.LL = shopActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final C332710D2n invoke() {
        C332710D2n serializableExtra;
        Intent intent = this.LL.getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = intent.getSerializableExtra("ucp_entry_context", C332710D2n.class);
        } else {
            Serializable serializableExtra2 = intent.getSerializableExtra("ucp_entry_context");
            if (!(serializableExtra2 instanceof C332710D2n)) {
                serializableExtra2 = null;
            }
            serializableExtra = (C332710D2n) serializableExtra2;
        }
        return serializableExtra == 0 ? new C332710D2n(C0DHO.STANDARD, null, null, null) : serializableExtra;
    }
}
