package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RVn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC696970RVn {
    public static final EnumC696970RVn DEFAULT;
    public static final /* synthetic */ EnumC696970RVn[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC696970RVn ON_SELECTED;
    public static final EnumC696970RVn UN_SELECTED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC696970RVn> getEntries() {
        return LLILLL;
    }

    static {
        EnumC696970RVn enumC696970RVn = new EnumC696970RVn(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC696970RVn;
        EnumC696970RVn enumC696970RVn2 = new EnumC696970RVn("ON_SELECTED", 1, 1);
        ON_SELECTED = enumC696970RVn2;
        EnumC696970RVn enumC696970RVn3 = new EnumC696970RVn("UN_SELECTED", 2, 2);
        UN_SELECTED = enumC696970RVn3;
        EnumC696970RVn[] enumC696970RVnArr = {enumC696970RVn, enumC696970RVn2, enumC696970RVn3};
        LLILLJJLI = enumC696970RVnArr;
        LLILLL = new C2254308sP(enumC696970RVnArr);
    }

    public static EnumC696970RVn[] values() {
        return (EnumC696970RVn[]) LLILLJJLI.clone();
    }

    public final int getDescription() {
        return this.LL;
    }

    public static EnumC696970RVn valueOf(String str) {
        return (EnumC696970RVn) C08FF.LIZ(EnumC696970RVn.class, str);
    }

    public EnumC696970RVn(String str, int i, int i2) {
        this.LL = i2;
    }
}
