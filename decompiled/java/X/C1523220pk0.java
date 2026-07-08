package X;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pk0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1523220pk0 extends C09AY implements Function0<SimpleDateFormat> {
    public C1523220pk0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final SimpleDateFormat invoke() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }
}
