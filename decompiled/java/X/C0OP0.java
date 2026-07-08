package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OP0, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OP0 {
    public static final C0OP0 AUTO_SHARE;
    public static final C0OP2 Companion;
    public static final C0OP0 DEFAULT;
    public static final /* synthetic */ C0OP0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0OP0 SHARE_PANEL;
    public static final C0OP0 UNKNOWN;
    public static final Map<Integer, C0OP0> typeCache;
    public final int LL;

    public static InterfaceC2044707zh<C0OP0> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0OP2] */
    static {
        C0OP0 c0op0 = new C0OP0("UNKNOWN", 0, -1);
        UNKNOWN = c0op0;
        C0OP0 c0op02 = new C0OP0(LivePreviewCTASmartDisplayManager.DEFAULT, 1, 0);
        DEFAULT = c0op02;
        C0OP0 c0op03 = new C0OP0("AUTO_SHARE", 2, 1);
        AUTO_SHARE = c0op03;
        C0OP0 c0op04 = new C0OP0("SHARE_PANEL", 3, 2);
        SHARE_PANEL = c0op04;
        C0OP0[] c0op0Arr = {c0op0, c0op02, c0op03, c0op04};
        LLILLJJLI = c0op0Arr;
        LLILLL = new C2254308sP(c0op0Arr);
        Companion = new Object() { // from class: X.0OP2
        };
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C0OP0 c0op05 : values()) {
            linkedHashMap.put(Integer.valueOf(c0op05.LL), c0op05);
        }
        typeCache = C2097608Jq.LJIIZILJ(linkedHashMap);
    }

    public static C0OP0[] values() {
        return (C0OP0[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C0OP0 valueOf(String str) {
        return (C0OP0) C08FF.LIZ(C0OP0.class, str);
    }

    public C0OP0(String str, int i, int i2) {
        this.LL = i2;
    }
}
