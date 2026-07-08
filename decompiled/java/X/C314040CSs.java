package X;

import android.content.ContentResolver;
import android.text.TextUtils;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CSs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C314040CSs extends C09AY implements Function0<String> {
    public C314040CSs() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        C844470XAv.LIZ.getClass();
        ContentResolver contentResolver = C844470XAv.LIZ().getContentResolver();
        if (!TextUtils.equals("android_id", "android_id")) {
            return C2204961BRm.LLIIIL(contentResolver, "android_id", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqkdpjH0nw84MbD0RRW0uJVtyFm", null));
        }
        if (C10EU.LJIILIIL() && C20123713oZ.LIZ()) {
            return "";
        }
        if (TextUtils.isEmpty(C20123713oZ.LIZ)) {
            C20123713oZ.LIZ = C2204961BRm.LLIIIL(contentResolver, "android_id", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqkdpjH0nw84MbD0RRW0uJVtyFm", null));
        }
        return C20123713oZ.LIZ;
    }
}
