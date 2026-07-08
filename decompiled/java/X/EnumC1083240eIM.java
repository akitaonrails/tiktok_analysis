package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eIM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1083240eIM {
    public static final EnumC1083240eIM BOTTOM_BAR;
    public static final C1083250eIN Companion;
    public static final EnumC1083240eIM DEFAULT;
    public static final /* synthetic */ EnumC1083240eIM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1083240eIM RANK_DIALOG;
    public static final EnumC1083240eIM RANK_PAGE;
    public final long LL;

    public static InterfaceC2044707zh<EnumC1083240eIM> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0eIN] */
    static {
        EnumC1083240eIM enumC1083240eIM = new EnumC1083240eIM(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0L);
        DEFAULT = enumC1083240eIM;
        EnumC1083240eIM enumC1083240eIM2 = new EnumC1083240eIM("RANK_DIALOG", 1, 1L);
        RANK_DIALOG = enumC1083240eIM2;
        EnumC1083240eIM enumC1083240eIM3 = new EnumC1083240eIM("RANK_PAGE", 2, 2L);
        RANK_PAGE = enumC1083240eIM3;
        EnumC1083240eIM enumC1083240eIM4 = new EnumC1083240eIM("BOTTOM_BAR", 3, 4L);
        BOTTOM_BAR = enumC1083240eIM4;
        EnumC1083240eIM[] enumC1083240eIMArr = {enumC1083240eIM, enumC1083240eIM2, enumC1083240eIM3, enumC1083240eIM4};
        LLILLJJLI = enumC1083240eIMArr;
        LLILLL = new C2254308sP(enumC1083240eIMArr);
        Companion = new Object() { // from class: X.0eIN
        };
    }

    public static EnumC1083240eIM[] values() {
        return (EnumC1083240eIM[]) LLILLJJLI.clone();
    }

    public final long getScene() {
        return this.LL;
    }

    public static EnumC1083240eIM valueOf(String str) {
        return (EnumC1083240eIM) C08FF.LIZ(EnumC1083240eIM.class, str);
    }

    public EnumC1083240eIM(String str, int i, long j) {
        this.LL = j;
    }
}
