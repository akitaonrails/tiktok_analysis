package X;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0T5q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C741200T5q extends C09AY implements Function1<Context, Context> {
    public C741200T5q() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Context invoke(Context context) {
        Context context2 = context;
        if (context2 instanceof ContextWrapper) {
            return ((ContextWrapper) context2).getBaseContext();
        }
        return null;
    }
}
