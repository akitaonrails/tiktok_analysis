package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.p;
import com.google.gson.q;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SQE, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SQE {
    public static final EnumC705650Rm7 LIZ(AnchorCommonStruct anchorCommonStruct) {
        String strLJIL;
        try {
            new p();
            String extra = anchorCommonStruct.getExtra();
            if (extra == null) {
                extra = "";
            }
            q qVarLJJIJIIJI = p.LIZJ(extra).LJIILIIL().LJJIJIIJI("toast_type");
            if (qVarLJJIJIIJI != null && (strLJIL = qVarLJJIJIIJI.LJIL()) != null) {
                EnumC705650Rm7.Companion.getClass();
                EnumC705650Rm7 enumC705650Rm7 = EnumC705650Rm7.SUCCESS;
                if (!Intrinsics.LJFF(strLJIL, enumC705650Rm7.getValue())) {
                    EnumC705650Rm7 enumC705650Rm72 = EnumC705650Rm7.FAILED;
                    if (!Intrinsics.LJFF(strLJIL, enumC705650Rm72.getValue())) {
                        EnumC705650Rm7 enumC705650Rm73 = EnumC705650Rm7.PENDING;
                        if (!Intrinsics.LJFF(strLJIL, enumC705650Rm73.getValue())) {
                            EnumC705650Rm7 enumC705650Rm74 = EnumC705650Rm7.TNS_VIOLATION;
                            if (Intrinsics.LJFF(strLJIL, enumC705650Rm74.getValue())) {
                                return enumC705650Rm74;
                            }
                        } else {
                            return enumC705650Rm73;
                        }
                    } else {
                        return enumC705650Rm72;
                    }
                } else {
                    return enumC705650Rm7;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return null;
    }
}
