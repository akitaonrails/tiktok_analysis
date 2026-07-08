package X;

import android.util.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.09jX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2454109jX extends C09AY implements Function0<String> {
    public C2454109jX() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return new String(Base64.decode("YW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfQ09OVEFDVFM=", 0), Charsets.UTF_8);
    }
}
