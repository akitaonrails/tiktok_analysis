package X;

import android.content.Context;
import com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model.PrivacyTextWithInlineLink;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.103G, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C103G {
    public static final Map<String, AnonymousClass1031> LIZ = new LinkedHashMap();
    public static C108Z LIZIZ;
    public static C103H LIZJ;
    public static Function2<? super Context, ? super PrivacyTextWithInlineLink, ? extends CharSequence> LIZLLL;

    public static void LIZ(String str, AnonymousClass1031 anonymousClass1031) {
        if (str.length() == 0) {
            return;
        }
        LIZ.put(str, anonymousClass1031);
    }
}
