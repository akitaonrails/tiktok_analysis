package X;

import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0YB0, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YB0 extends C09AY implements Function1<String, CharSequence> {
    public C0YB0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(String str) {
        Regex.Companion.getClass();
        return Pattern.quote(str);
    }
}
