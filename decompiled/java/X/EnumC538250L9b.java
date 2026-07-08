package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L9b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC538250L9b {
    public static final EnumC538250L9b ALL;
    public static final C538260L9c Companion;
    public static final EnumC538250L9b DEFAULT;
    public static final EnumC538250L9b GLANCE;
    public static final EnumC538250L9b LIVE_PHOTO;
    public static final /* synthetic */ EnumC538250L9b[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC538250L9b PHOTO;
    public static final EnumC538250L9b VIDEO;
    public final int LL;

    public static InterfaceC2044707zh<EnumC538250L9b> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0L9c] */
    static {
        EnumC538250L9b enumC538250L9b = new EnumC538250L9b(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC538250L9b;
        EnumC538250L9b enumC538250L9b2 = new EnumC538250L9b("ALL", 1, 1);
        ALL = enumC538250L9b2;
        EnumC538250L9b enumC538250L9b3 = new EnumC538250L9b("PHOTO", 2, 2);
        PHOTO = enumC538250L9b3;
        EnumC538250L9b enumC538250L9b4 = new EnumC538250L9b("VIDEO", 3, 3);
        VIDEO = enumC538250L9b4;
        EnumC538250L9b enumC538250L9b5 = new EnumC538250L9b("GLANCE", 4, 4);
        GLANCE = enumC538250L9b5;
        EnumC538250L9b enumC538250L9b6 = new EnumC538250L9b("LIVE_PHOTO", 5, 5);
        LIVE_PHOTO = enumC538250L9b6;
        EnumC538250L9b[] enumC538250L9bArr = {enumC538250L9b, enumC538250L9b2, enumC538250L9b3, enumC538250L9b4, enumC538250L9b5, enumC538250L9b6};
        LLILLJJLI = enumC538250L9bArr;
        LLILLL = new C2254308sP(enumC538250L9bArr);
        Companion = new Object() { // from class: X.0L9c
        };
    }

    public static EnumC538250L9b[] values() {
        return (EnumC538250L9b[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC538250L9b valueOf(String str) {
        return (EnumC538250L9b) C08FF.LIZ(EnumC538250L9b.class, str);
    }

    public EnumC538250L9b(String str, int i, int i2) {
        this.LL = i2;
    }
}
