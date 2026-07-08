package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RVo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC696980RVo {
    public static final EnumC696980RVo DEFAULT;
    public static final /* synthetic */ EnumC696980RVo[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC696980RVo ON_SELECTED;
    public static final EnumC696980RVo UN_SELECTED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC696980RVo> getEntries() {
        return LLILLL;
    }

    static {
        EnumC696980RVo enumC696980RVo = new EnumC696980RVo(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC696980RVo;
        EnumC696980RVo enumC696980RVo2 = new EnumC696980RVo("ON_SELECTED", 1, 1);
        ON_SELECTED = enumC696980RVo2;
        EnumC696980RVo enumC696980RVo3 = new EnumC696980RVo("UN_SELECTED", 2, 2);
        UN_SELECTED = enumC696980RVo3;
        EnumC696980RVo[] enumC696980RVoArr = {enumC696980RVo, enumC696980RVo2, enumC696980RVo3};
        LLILLJJLI = enumC696980RVoArr;
        LLILLL = new C2254308sP(enumC696980RVoArr);
    }

    public static EnumC696980RVo[] values() {
        return (EnumC696980RVo[]) LLILLJJLI.clone();
    }

    public final int getDescription() {
        return this.LL;
    }

    public static EnumC696980RVo valueOf(String str) {
        return (EnumC696980RVo) C08FF.LIZ(EnumC696980RVo.class, str);
    }

    public EnumC696980RVo(String str, int i, int i2) {
        this.LL = i2;
    }
}
