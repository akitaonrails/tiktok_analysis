package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import java.util.Collections;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YbB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC877230YbB {
    public static final EnumC877230YbB DEFAULT;
    public static final /* synthetic */ EnumC877230YbB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC877230YbB NOT_SENT;
    public static final EnumC877230YbB SEEN;
    public static final EnumC877230YbB SENDING;
    public static final EnumC877230YbB SENT;
    public final Set<Integer> LL;

    public static InterfaceC2044707zh<EnumC877230YbB> getEntries() {
        return LLILLL;
    }

    static {
        EnumC877230YbB enumC877230YbB = new EnumC877230YbB("SENDING", C13LQ.LJLIIL(new Integer[]{0, 1}), 0);
        SENDING = enumC877230YbB;
        EnumC877230YbB enumC877230YbB2 = new EnumC877230YbB("SENT", C0YE1.LIZ, 1);
        SENT = enumC877230YbB2;
        EnumC877230YbB enumC877230YbB3 = new EnumC877230YbB("NOT_SENT", Collections.singleton(3), 2);
        NOT_SENT = enumC877230YbB3;
        C08CX c08cx = C08CX.INSTANCE;
        EnumC877230YbB enumC877230YbB4 = new EnumC877230YbB("SEEN", c08cx, 3);
        SEEN = enumC877230YbB4;
        EnumC877230YbB enumC877230YbB5 = new EnumC877230YbB(LivePreviewCTASmartDisplayManager.DEFAULT, c08cx, 4);
        DEFAULT = enumC877230YbB5;
        EnumC877230YbB[] enumC877230YbBArr = {enumC877230YbB, enumC877230YbB2, enumC877230YbB3, enumC877230YbB4, enumC877230YbB5};
        LLILLJJLI = enumC877230YbBArr;
        LLILLL = new C2254308sP(enumC877230YbBArr);
    }

    public static EnumC877230YbB[] values() {
        return (EnumC877230YbB[]) LLILLJJLI.clone();
    }

    public final Set<Integer> getValue() {
        return this.LL;
    }

    public static EnumC877230YbB valueOf(String str) {
        return (EnumC877230YbB) C08FF.LIZ(EnumC877230YbB.class, str);
    }

    public EnumC877230YbB(String str, Set set, int i) {
        this.LL = set;
    }
}
