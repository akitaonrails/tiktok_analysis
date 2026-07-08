package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0In4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC476920In4 {
    public static final EnumC476920In4 BUTTON;
    public static final C477140InQ Companion;
    public static final EnumC476920In4 DEFAULT;
    public static final EnumC476920In4 DRAW;
    public static final EnumC476920In4 ENTER_ROOM;
    public static final /* synthetic */ EnumC476920In4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC476920In4 NULL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC476920In4> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0InQ] */
    static {
        EnumC476920In4 enumC476920In4 = new EnumC476920In4("NULL", 0, "");
        NULL = enumC476920In4;
        EnumC476920In4 enumC476920In42 = new EnumC476920In4(LivePreviewCTASmartDisplayManager.DEFAULT, 1, "default");
        DEFAULT = enumC476920In42;
        EnumC476920In4 enumC476920In43 = new EnumC476920In4("DRAW", 2, "draw");
        DRAW = enumC476920In43;
        EnumC476920In4 enumC476920In44 = new EnumC476920In4("BUTTON", 3, "button");
        BUTTON = enumC476920In44;
        EnumC476920In4 enumC476920In45 = new EnumC476920In4("ENTER_ROOM", 4, "enter_room");
        ENTER_ROOM = enumC476920In45;
        EnumC476920In4[] enumC476920In4Arr = {enumC476920In4, enumC476920In42, enumC476920In43, enumC476920In44, enumC476920In45};
        LLILLJJLI = enumC476920In4Arr;
        LLILLL = new C2254308sP(enumC476920In4Arr);
        Companion = new Object() { // from class: X.0InQ
        };
    }

    public static EnumC476920In4[] values() {
        return (EnumC476920In4[]) LLILLJJLI.clone();
    }

    public final String getReason() {
        return this.LL;
    }

    public static EnumC476920In4 valueOf(String str) {
        return (EnumC476920In4) C08FF.LIZ(EnumC476920In4.class, str);
    }

    public EnumC476920In4(String str, int i, String str2) {
        this.LL = str2;
    }
}
