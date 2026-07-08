package X;

import android.icu.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0M3n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C562290M3n extends C09AY implements Function0<SimpleDateFormat> {
    public C562290M3n() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final SimpleDateFormat invoke() {
        return new SimpleDateFormat("MMM d", Locale.ENGLISH);
    }
}
