package X;

import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xZ5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1823970xZ5 extends C09AY implements Function1<Uri.Builder, Unit> {
    public C1823970xZ5() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Uri.Builder builder) {
        Uri.Builder builder2 = builder;
        if (C1148720fzy.LIZ()) {
            builder2.appendQueryParameter("enable_code_cache", "1");
            builder2.appendQueryParameter("auto_continue_load", "1");
        }
        return Unit.LIZ;
    }
}
