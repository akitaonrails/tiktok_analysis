package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AFwS248S0000000_14;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZiZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC907290ZiZ {
    public static final C907300Zia Companion;
    public static final /* synthetic */ EnumC907290ZiZ[] LLILZIL;
    public static final /* synthetic */ C2254308sP LLILZLL;
    public static final EnumC907290ZiZ MARKDOWN;
    public static final EnumC907290ZiZ SHARE_COMMENT;
    public static final EnumC907290ZiZ SHARE_USER;
    public static final EnumC907290ZiZ SHARE_VIDEO;
    public static final EnumC907290ZiZ TEXT;
    public final int LL;
    public final int LLILLJJLI;
    public final Integer LLILLL;
    public final Function1<C869590Y9l, String> LLILZ;

    public static InterfaceC2044707zh<EnumC907290ZiZ> getEntries() {
        return LLILZLL;
    }

    static {
        EnumC907290ZiZ enumC907290ZiZ = new EnumC907290ZiZ("TEXT", 0, 7, 3, null, AFwS236S0000000_6.get$arr$(467));
        TEXT = enumC907290ZiZ;
        EnumC907290ZiZ enumC907290ZiZ2 = new EnumC907290ZiZ("MARKDOWN", 1, 1822, 11, null, AFwS248S0000000_14.get$arr$(464));
        MARKDOWN = enumC907290ZiZ2;
        EnumC907290ZiZ enumC907290ZiZ3 = new EnumC907290ZiZ("SHARE_VIDEO", 2, 1809, 7, 2131845588, AFwS248S0000000_14.get$arr$(465));
        SHARE_VIDEO = enumC907290ZiZ3;
        EnumC907290ZiZ enumC907290ZiZ4 = new EnumC907290ZiZ("SHARE_COMMENT", 3, 40, 9, Integer.valueOf(R.string.fij), AFwS236S0000000_6.get$arr$(468));
        SHARE_COMMENT = enumC907290ZiZ4;
        EnumC907290ZiZ enumC907290ZiZ5 = new EnumC907290ZiZ("SHARE_USER", 4, 25, 10, 2131845374, AFwS236S0000000_6.get$arr$(469));
        SHARE_USER = enumC907290ZiZ5;
        EnumC907290ZiZ[] enumC907290ZiZArr = {enumC907290ZiZ, enumC907290ZiZ2, enumC907290ZiZ3, enumC907290ZiZ4, enumC907290ZiZ5};
        LLILZIL = enumC907290ZiZArr;
        LLILZLL = new C2254308sP(enumC907290ZiZArr);
        Companion = new C907300Zia();
    }

    public static EnumC907290ZiZ[] values() {
        return (EnumC907290ZiZ[]) LLILZIL.clone();
    }

    public final Function1<C869590Y9l, String> getFormatter() {
        return this.LLILZ;
    }

    public final Integer getHeaderRes() {
        return this.LLILLL;
    }

    public final int getImSearchContentType() {
        return this.LLILLJJLI;
    }

    public final int getMessageType() {
        return this.LL;
    }

    public static EnumC907290ZiZ valueOf(String str) {
        return (EnumC907290ZiZ) C08FF.LIZ(EnumC907290ZiZ.class, str);
    }

    public EnumC907290ZiZ(String str, int i, int i2, int i3, Integer num, Function1 function1) {
        this.LL = i2;
        this.LLILLJJLI = i3;
        this.LLILLL = num;
        this.LLILZ = function1;
    }
}
