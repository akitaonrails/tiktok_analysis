package X;

import com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageReactionAnalytics;
import java.util.Map;

/* JADX INFO: renamed from: X.0YzI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C892180YzI {
    public static final C892180YzI LIZ = new C892180YzI();

    public static final void LIZ(String str, C869590Y9l c869590Y9l, String str2, C0Y8T c0y8t, InterfaceC879330YeZ interfaceC879330YeZ, String str3, Map<String, String> map) {
        C879320YeY.LIZIZ(c869590Y9l.getUuid(), str2, c0y8t, interfaceC879330YeZ);
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("like_method", str);
        c830490Whz.put("emoji_name", C892380Yzc.LIZ.LIZ);
        c830490Whz.put("reaction_type", "emoji");
        if (map != null) {
            c830490Whz.putAll(map);
        }
        if (str3 != null) {
            c830490Whz.put("enter_method", str3);
        }
        IIMMessageReactionAnalytics.LIZ.getClass();
        IIMMessageReactionAnalytics value = C892200YzK.LIZIZ.getValue();
        if (value != null) {
            value.LIZJ(c869590Y9l, c830490Whz, C0I0B.LJFF.LIZIZ());
        }
    }
}
