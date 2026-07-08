package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import java.util.Collections;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YbC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC877240YbC {
    public static final EnumC877240YbC DEFAULT;
    public static final /* synthetic */ EnumC877240YbC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC877240YbC NOT_SENT;
    public static final EnumC877240YbC SEEN;
    public static final EnumC877240YbC SENDING;
    public static final EnumC877240YbC SENT;
    public final Set<Integer> LL;

    public static InterfaceC2044707zh<EnumC877240YbC> getEntries() {
        return LLILLL;
    }

    static {
        EnumC877240YbC enumC877240YbC = new EnumC877240YbC("SENDING", C13LQ.LJLIIL(new Integer[]{0, 1}), 0);
        SENDING = enumC877240YbC;
        EnumC877240YbC enumC877240YbC2 = new EnumC877240YbC("SENT", C0YE1.LIZ, 1);
        SENT = enumC877240YbC2;
        EnumC877240YbC enumC877240YbC3 = new EnumC877240YbC("NOT_SENT", Collections.singleton(3), 2);
        NOT_SENT = enumC877240YbC3;
        C08CX c08cx = C08CX.INSTANCE;
        EnumC877240YbC enumC877240YbC4 = new EnumC877240YbC("SEEN", c08cx, 3);
        SEEN = enumC877240YbC4;
        EnumC877240YbC enumC877240YbC5 = new EnumC877240YbC(LivePreviewCTASmartDisplayManager.DEFAULT, c08cx, 4);
        DEFAULT = enumC877240YbC5;
        EnumC877240YbC[] enumC877240YbCArr = {enumC877240YbC, enumC877240YbC2, enumC877240YbC3, enumC877240YbC4, enumC877240YbC5};
        LLILLJJLI = enumC877240YbCArr;
        LLILLL = new C2254308sP(enumC877240YbCArr);
    }

    public static EnumC877240YbC[] values() {
        return (EnumC877240YbC[]) LLILLJJLI.clone();
    }

    public final Set<Integer> getValue() {
        return this.LL;
    }

    public static EnumC877240YbC valueOf(String str) {
        return (EnumC877240YbC) C08FF.LIZ(EnumC877240YbC.class, str);
    }

    public EnumC877240YbC(String str, Set set, int i) {
        this.LL = set;
    }
}
