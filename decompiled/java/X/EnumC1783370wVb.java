package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS269S0000000_27;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wVb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1783370wVb {
    public static final /* synthetic */ EnumC1783370wVb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1783370wVb MUF;
    public static final EnumC1783370wVb MUF_AND_GROUP;
    public final Function1<IMContact, Boolean> LL;

    public static InterfaceC2044707zh<EnumC1783370wVb> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1783370wVb enumC1783370wVb = new EnumC1783370wVb(0, "MUF", AFwS269S0000000_27.get$arr$(34));
        MUF = enumC1783370wVb;
        EnumC1783370wVb enumC1783370wVb2 = new EnumC1783370wVb(1, "MUF_AND_GROUP", AFwS269S0000000_27.get$arr$(35));
        MUF_AND_GROUP = enumC1783370wVb2;
        EnumC1783370wVb[] enumC1783370wVbArr = {enumC1783370wVb, enumC1783370wVb2};
        LLILLJJLI = enumC1783370wVbArr;
        LLILLL = new C2254308sP(enumC1783370wVbArr);
    }

    public static EnumC1783370wVb[] values() {
        return (EnumC1783370wVb[]) LLILLJJLI.clone();
    }

    public final Function1<IMContact, Boolean> getFilter() {
        return this.LL;
    }

    public static EnumC1783370wVb valueOf(String str) {
        return (EnumC1783370wVb) C08FF.LIZ(EnumC1783370wVb.class, str);
    }

    public EnumC1783370wVb(int i, String str, Function1 function1) {
        this.LL = function1;
    }
}
