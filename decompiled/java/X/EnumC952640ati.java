package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ati, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC952640ati {
    public static final EnumC952640ati BANNERS;
    public static final C952630ath Companion;
    public static final EnumC952640ati DEFAULT;
    public static final Set<EnumC952640ati> EXCLUDED_FROM_PANEL;
    public static final EnumC952640ati FRIENDS;
    public static final EnumC952640ati FRIEND_LIST_SEARCH;
    public static final EnumC952640ati LEAGUE_RECOMMEND;
    public static final /* synthetic */ EnumC952640ati[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC952640ati RECOMMEND;
    public final int LL;

    public static InterfaceC2044707zh<EnumC952640ati> getEntries() {
        return LLILLL;
    }

    static {
        EnumC952640ati enumC952640ati = new EnumC952640ati(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC952640ati;
        EnumC952640ati enumC952640ati2 = new EnumC952640ati("BANNERS", 1, 1);
        BANNERS = enumC952640ati2;
        EnumC952640ati enumC952640ati3 = new EnumC952640ati("FRIENDS", 2, 2);
        FRIENDS = enumC952640ati3;
        EnumC952640ati enumC952640ati4 = new EnumC952640ati("RECOMMEND", 3, 3);
        RECOMMEND = enumC952640ati4;
        EnumC952640ati enumC952640ati5 = new EnumC952640ati("LEAGUE_RECOMMEND", 4, 4);
        LEAGUE_RECOMMEND = enumC952640ati5;
        EnumC952640ati enumC952640ati6 = new EnumC952640ati("FRIEND_LIST_SEARCH", 5, 7);
        FRIEND_LIST_SEARCH = enumC952640ati6;
        EnumC952640ati[] enumC952640atiArr = {enumC952640ati, enumC952640ati2, enumC952640ati3, enumC952640ati4, enumC952640ati5, enumC952640ati6};
        LLILLJJLI = enumC952640atiArr;
        LLILLL = new C2254308sP(enumC952640atiArr);
        Companion = new C952630ath();
        EXCLUDED_FROM_PANEL = C13LQ.LJLIIL(new EnumC952640ati[]{enumC952640ati5, enumC952640ati6});
    }

    public static EnumC952640ati[] values() {
        return (EnumC952640ati[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC952640ati valueOf(String str) {
        return (EnumC952640ati) C08FF.LIZ(EnumC952640ati.class, str);
    }

    public EnumC952640ati(String str, int i, int i2) {
        this.LL = i2;
    }
}
