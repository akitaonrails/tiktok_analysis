package X;

import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0auW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C953140auW extends C09AY implements InterfaceC2280191EMv<String, String, EnumC937290aUx, EnumC953330aup, String, C917840Zza, EnumC952890au7, String, C916750Zxp, Unit> {
    public C953140auW() {
        super(9);
    }

    @Override // X.InterfaceC2280191EMv
    public final Unit os(String str, String str2, EnumC937290aUx enumC937290aUx, EnumC953330aup enumC953330aup, String str3, C917840Zza c917840Zza, EnumC952890au7 enumC952890au7, String str4, C916750Zxp c916750Zxp) {
        Boolean boolValueOf;
        String str5 = str;
        String str6 = str2;
        EnumC937290aUx enumC937290aUx2 = enumC937290aUx;
        EnumC953330aup enumC953330aup2 = enumC953330aup;
        String str7 = str3;
        C917840Zza c917840Zza2 = c917840Zza;
        EnumC952890au7 enumC952890au72 = enumC952890au7;
        String str8 = str4;
        C916750Zxp c916750Zxp2 = c916750Zxp;
        if (str6.length() != 0 && c916750Zxp2.LIZIZ > 0) {
            C953230auf.LIZ.getClass();
            if (!C953230auf.LJIIJJI()) {
                C953610avH.LJJI.getClass();
                if (Intrinsics.LJFF(str6, C953610avH.LJJII)) {
                    C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131853989));
                } else {
                    C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131853961));
                    InterfaceC945610aiN interfaceC945610aiNLIZ = C944400agQ.LIZ();
                    if (interfaceC945610aiNLIZ != null) {
                        boolValueOf = Boolean.valueOf(interfaceC945610aiNLIZ.LJIIIIZZ());
                    } else {
                        boolValueOf = null;
                    }
                    if (C500260Jjc.LJJJI(boolValueOf)) {
                        C953620avI.LIZLLL(LIZ(str6, enumC937290aUx2, enumC953330aup2, str7, null, c917840Zza2, enumC952890au72, c916750Zxp2, str8, null, null, null, str5, ""));
                    } else {
                        C953370aut.LIZLLL(str5, new C953150auX(str6, enumC937290aUx2, enumC953330aup2, str7, c917840Zza2, enumC952890au72, c916750Zxp2, str8, str5));
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C953600avG LIZ(String str, EnumC937290aUx enumC937290aUx, EnumC953330aup enumC953330aup, String str2, Void r24, C917840Zza c917840Zza, EnumC952890au7 enumC952890au7, C916750Zxp c916750Zxp, String str3, String str4, Long l, String str5, String str6, String str7) {
        return new C953600avG(str, str7, enumC937290aUx, enumC953330aup, str2, (WeakReference) r24, c917840Zza, enumC952890au7, Long.valueOf(c916750Zxp.LIZIZ), str3, new C334801Rq(str4, l, str5), c916750Zxp.LIZ, str6, null, 8192);
    }
}
