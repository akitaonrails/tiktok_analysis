package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ELW, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ELW {
    public static final C0ELW INFO_STICKER;
    public static final /* synthetic */ C0ELW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0ELW LYRIC_STICKER;
    public static final C0ELW TEXT_STICKER;
    public static final C0ELW VIDEO;

    public static InterfaceC2044707zh<C0ELW> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0ELW c0elw = new C0ELW("VIDEO", 0);
        VIDEO = c0elw;
        C0ELW c0elw2 = new C0ELW("TEXT_STICKER", 1);
        TEXT_STICKER = c0elw2;
        C0ELW c0elw3 = new C0ELW("INFO_STICKER", 2);
        INFO_STICKER = c0elw3;
        C0ELW c0elw4 = new C0ELW("LYRIC_STICKER", 3);
        LYRIC_STICKER = c0elw4;
        C0ELW[] c0elwArr = {c0elw, c0elw2, c0elw3, c0elw4};
        LL = c0elwArr;
        LLILLJJLI = new C2254308sP(c0elwArr);
    }

    public static C0ELW[] values() {
        return (C0ELW[]) LL.clone();
    }

    public static C0ELW valueOf(String str) {
        return (C0ELW) C08FF.LIZ(C0ELW.class, str);
    }

    public C0ELW(String str, int i) {
    }
}
