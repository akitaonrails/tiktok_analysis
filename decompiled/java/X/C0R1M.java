package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0R1M, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R1M {
    public static final C0R1M CHOOSE_FROM_ALBUM;
    public static final C0R1M DEFAULT;
    public static final /* synthetic */ C0R1M[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0R1M TAKE_PHOTO;
    public final String LL;

    public static InterfaceC2044707zh<C0R1M> getEntries() {
        return LLILLL;
    }

    static {
        C0R1M c0r1m = new C0R1M(LivePreviewCTASmartDisplayManager.DEFAULT, 0, "default");
        DEFAULT = c0r1m;
        C0R1M c0r1m2 = new C0R1M("TAKE_PHOTO", 1, "take_photo");
        TAKE_PHOTO = c0r1m2;
        C0R1M c0r1m3 = new C0R1M("CHOOSE_FROM_ALBUM", 2, "choose_from_album");
        CHOOSE_FROM_ALBUM = c0r1m3;
        C0R1M[] c0r1mArr = {c0r1m, c0r1m2, c0r1m3};
        LLILLJJLI = c0r1mArr;
        LLILLL = new C2254308sP(c0r1mArr);
    }

    public static C0R1M[] values() {
        return (C0R1M[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0R1M valueOf(String str) {
        return (C0R1M) C08FF.LIZ(C0R1M.class, str);
    }

    public C0R1M(String str, int i, String str2) {
        this.LL = str2;
    }
}
