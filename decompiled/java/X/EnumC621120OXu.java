package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OXu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC621120OXu {
    public static final C621130OXv Companion;
    public static final EnumC621120OXu DEFAULT;
    public static final /* synthetic */ EnumC621120OXu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC621120OXu LOADING;
    public static final EnumC621120OXu PLAYING;
    public final int LL;

    public static InterfaceC2044707zh<EnumC621120OXu> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0OXv] */
    static {
        EnumC621120OXu enumC621120OXu = new EnumC621120OXu(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC621120OXu;
        EnumC621120OXu enumC621120OXu2 = new EnumC621120OXu("LOADING", 1, 1);
        LOADING = enumC621120OXu2;
        EnumC621120OXu enumC621120OXu3 = new EnumC621120OXu("PLAYING", 2, 2);
        PLAYING = enumC621120OXu3;
        EnumC621120OXu[] enumC621120OXuArr = {enumC621120OXu, enumC621120OXu2, enumC621120OXu3};
        LLILLJJLI = enumC621120OXuArr;
        LLILLL = new C2254308sP(enumC621120OXuArr);
        Companion = new Object() { // from class: X.0OXv
        };
    }

    public static EnumC621120OXu[] values() {
        return (EnumC621120OXu[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC621120OXu valueOf(String str) {
        return (EnumC621120OXu) C08FF.LIZ(EnumC621120OXu.class, str);
    }

    public EnumC621120OXu(String str, int i, int i2) {
        this.LL = i2;
    }
}
