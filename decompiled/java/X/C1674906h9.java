package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06h9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1674906h9 {
    public final Keva LIZ;

    public C1674906h9(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prompt_ufc_keva_");
        sbLIZ.append(str);
        this.LIZ = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final boolean LIZIZ(long j, String str) {
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sa_creation_inline_shown_");
        sbLIZ.append(str);
        if (keva.getLong(C2188811AlT.LIZIZ(sbLIZ), -1L) == j) {
            return true;
        }
        return false;
    }

    public final boolean LIZ(InterfaceC1677406hY interfaceC1677406hY, String str, String str2) {
        if (interfaceC1677406hY == EnumC1670906gV.SA_RECEIVE_INLINE_MESSAGE) {
            Long lLJIILIIL = C2095008Iq.LJIILIIL(str2);
            if (lLJIILIIL != null) {
                return LIZIZ(lLJIILIIL.longValue(), str);
            }
            return false;
        }
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(interfaceC1677406hY.getPromptId());
        sbLIZ.append("_inline_shown_");
        sbLIZ.append(str);
        return Intrinsics.LJFF(keva.getString(C2188811AlT.LIZIZ(sbLIZ), ""), str2);
    }

    public final void LIZJ(EnumC1670906gV enumC1670906gV, String str, String str2) {
        if (enumC1670906gV == EnumC1670906gV.SA_RECEIVE_INLINE_MESSAGE) {
            Long lLJIILIIL = C2095008Iq.LJIILIIL(str2);
            if (lLJIILIIL != null && LIZIZ(lLJIILIIL.longValue(), str)) {
                Keva keva = this.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sa_creation_inline_shown_");
                sbLIZ.append(str);
                keva.erase(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            return;
        }
        if (LIZ(enumC1670906gV, str, str2)) {
            Keva keva2 = this.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(enumC1670906gV.getPromptId());
            sbLIZ2.append('_');
            sbLIZ2.append(str);
            keva2.erase(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}
