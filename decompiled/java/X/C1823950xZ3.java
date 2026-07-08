package X;

import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xZ3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1823950xZ3 extends C09AY implements Function1<Uri.Builder, Unit> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1823950xZ3(String str) {
        super(1);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Uri.Builder builder) {
        Uri.Builder builder2 = builder;
        builder2.appendQueryParameter("ttclid", this.LL);
        if (C1148720fzy.LIZ()) {
            builder2.appendQueryParameter("enable_code_cache", "1");
            builder2.appendQueryParameter("auto_continue_load", "1");
        }
        return Unit.LIZ;
    }
}
