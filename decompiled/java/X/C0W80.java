package X;

import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0W80, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W80 extends C09AY implements Function1<Locale, String> {
    public C0W80() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(Locale locale) {
        return locale.toString();
    }
}
