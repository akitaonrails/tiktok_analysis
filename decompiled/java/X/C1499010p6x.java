package X;

import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0p6x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1499010p6x extends C09AY implements Function0<SimpleDateFormat> {
    public C1499010p6x() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final SimpleDateFormat invoke() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
    }
}
