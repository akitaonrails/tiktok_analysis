package X;

import com.zhiliaoapp.musically.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Euo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC379800Euo {
    public static final EnumC379800Euo GENERATE_VIDEO;
    public static final /* synthetic */ EnumC379800Euo[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC379800Euo MODIFY;
    public static final EnumC379800Euo MORE;
    public static final EnumC379800Euo REGENERATE;
    public static final EnumC379800Euo REPORT;
    public final int LL;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<EnumC379800Euo> getEntries() {
        return LLILZ;
    }

    static {
        EnumC379800Euo enumC379800Euo = new EnumC379800Euo("REGENERATE", 0, 2131825359, R.raw.icon_ai_refine);
        REGENERATE = enumC379800Euo;
        EnumC379800Euo enumC379800Euo2 = new EnumC379800Euo("GENERATE_VIDEO", 1, 2131825357, R.raw.icon_video_star);
        GENERATE_VIDEO = enumC379800Euo2;
        EnumC379800Euo enumC379800Euo3 = new EnumC379800Euo("MODIFY", 2, C288220BRk.LIZ() ? 2131825370 : 2131825358, R.raw.icon_pen);
        MODIFY = enumC379800Euo3;
        EnumC379800Euo enumC379800Euo4 = new EnumC379800Euo("REPORT", 3, 2131825360, R.raw.icon_flag);
        REPORT = enumC379800Euo4;
        EnumC379800Euo enumC379800Euo5 = new EnumC379800Euo("MORE", 4, 0, 0);
        MORE = enumC379800Euo5;
        EnumC379800Euo[] enumC379800EuoArr = {enumC379800Euo, enumC379800Euo2, enumC379800Euo3, enumC379800Euo4, enumC379800Euo5};
        LLILLL = enumC379800EuoArr;
        LLILZ = new C2254308sP(enumC379800EuoArr);
    }

    public static EnumC379800Euo[] values() {
        return (EnumC379800Euo[]) LLILLL.clone();
    }

    public final int getIconId() {
        return this.LLILLJJLI;
    }

    public final int getNameId() {
        return this.LL;
    }

    public static EnumC379800Euo valueOf(String str) {
        return (EnumC379800Euo) C08FF.LIZ(EnumC379800Euo.class, str);
    }

    public EnumC379800Euo(String str, int i, int i2, int i3) {
        this.LL = i2;
        this.LLILLJJLI = i3;
    }
}
