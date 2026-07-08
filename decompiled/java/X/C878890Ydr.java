package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ydr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C878890Ydr {
    public static WeakReference<Function0<Boolean>> LIZ;

    public static String LIZ(C0Y8T c0y8t) {
        if (C0CYO.LIZJ.LJIIIIZZ() && c0y8t.getConversationTags().contains(EnumC879080YeA.MESSAGE_REQUEST_SPAM.getValue())) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static boolean LIZIZ(C0Y8T c0y8t) {
        return Intrinsics.LJFF(LIZ(c0y8t), "1");
    }
}
