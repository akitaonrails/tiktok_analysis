package X;

import com.ss.android.ugc.aweme.im.sticker.api.model.MixStudioFestiveSettings;
import java.time.format.DateTimeFormatter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yh0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1867320yh0 extends C09AY implements Function0<DateTimeFormatter> {
    public C1867320yh0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final DateTimeFormatter invoke() {
        return DateTimeFormatter.ofPattern(MixStudioFestiveSettings.INSTANCE.getConfig().festiveTimeFormatterPattern);
    }
}
