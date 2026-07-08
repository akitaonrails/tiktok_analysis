package X;

import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CheckRule;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ubu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1710400ubu {
    public final EnumC1710490uc3 LIZ;
    public final CheckRule LIZIZ;
    public final Function1<String, String> LIZJ;
    public final EnumC1710410ubv LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C1710400ubu(EnumC1710490uc3 enumC1710490uc3, CheckRule checkRule, Function1<? super String, String> function1, EnumC1710410ubv enumC1710410ubv) {
        String str;
        String str2;
        String str3;
        String str4;
        this.LIZ = enumC1710490uc3;
        this.LIZIZ = checkRule;
        this.LIZJ = function1;
        if (checkRule != null) {
            str = checkRule.type;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "required")) {
            enumC1710410ubv = EnumC1710410ubv.REQUIRED;
        } else {
            if (checkRule != null) {
                str2 = checkRule.type;
            } else {
                str2 = null;
            }
            if (Intrinsics.LJFF(str2, "len_list")) {
                enumC1710410ubv = EnumC1710410ubv.LEN_LIST;
            } else {
                if (checkRule != null) {
                    str3 = checkRule.type;
                } else {
                    str3 = null;
                }
                if (Intrinsics.LJFF(str3, "max_len")) {
                    enumC1710410ubv = EnumC1710410ubv.MAX_LEN;
                } else {
                    if (checkRule != null) {
                        str4 = checkRule.type;
                    } else {
                        str4 = null;
                    }
                    if (Intrinsics.LJFF(str4, "max_year_len")) {
                        enumC1710410ubv = EnumC1710410ubv.MAX_YEAR_LEN;
                    } else {
                        if (Intrinsics.LJFF(checkRule != null ? checkRule.type : null, "regex")) {
                            enumC1710410ubv = EnumC1710410ubv.REGEX;
                        } else if (function1 == 0 || enumC1710410ubv == null) {
                            enumC1710410ubv = EnumC1710410ubv.UNSUPPORTED;
                        }
                    }
                }
            }
        }
        this.LIZLLL = enumC1710410ubv;
    }
}
