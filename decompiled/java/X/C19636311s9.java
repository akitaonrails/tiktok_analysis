package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.GregorianCalendar;

/* JADX INFO: renamed from: X.11s9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19636311s9 {
    public static final long LIZIZ(long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(j);
        return new GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5), gregorianCalendar.get(11), gregorianCalendar.get(12), 0).getTimeInMillis();
    }

    public static final C19637311sJ LIZ(long j, long j2) {
        float f = (j - j2) / 1000.0f;
        if (f > 0.0f) {
            int i = (int) (f / 86400.0f);
            float f2 = (int) (f - (((i * 24.0f) * 60.0f) * 60.0f));
            int i2 = (int) (f2 / 3600.0f);
            float f3 = (int) (f2 - ((i2 * 60.0f) * 60.0f));
            int i3 = (int) (f3 / 60.0f);
            return new C19637311sJ(String.valueOf(i), String.valueOf(i2), String.valueOf(i3), String.valueOf((int) (f3 - (i3 * 60.0f))), j);
        }
        return new C19637311sJ(CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, j);
    }
}
