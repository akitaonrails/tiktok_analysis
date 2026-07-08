package X;

import com.ss.android.ugc.aweme.im.chatlist.impl.model.SessionConverterDeps;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IAz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C462310IAz {
    public static final String LIZ(C869590Y9l c869590Y9l, Function2<? super IMUser, ? super String, String> function2) {
        boolean z;
        String strLJIIL = C0ZDX.LJIIL(c869590Y9l);
        boolean zLIZ = C462300IAy.LIZ();
        if ((strLJIIL.length() != 0 || !C0ZDX.LJJJJIZL(c869590Y9l)) && !Intrinsics.LJFF(strLJIIL, C461720I8s.LIZIZ())) {
            if (!C0ZDX.LJJIJIIJIL(c869590Y9l)) {
                if (zLIZ) {
                    return C1383370m6R.LJIIJ(2131831544);
                }
                return C1383370m6R.LJIIJ(2131831142);
            }
            if (strLJIIL.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                IMUser iMUserLIZ = SessionConverterDeps.LIZLLL().LIZ(strLJIIL);
                if (zLIZ) {
                    return C1710306mr.LIZIZ(2131831539, function2.invoke(iMUserLIZ, c869590Y9l.getConversationId()));
                }
                return C1710306mr.LIZIZ(2131831141, function2.invoke(iMUserLIZ, c869590Y9l.getConversationId()));
            }
            IMUser iMUserLIZ2 = SessionConverterDeps.LIZLLL().LIZ(String.valueOf(c869590Y9l.getSender()));
            if (zLIZ) {
                return C1710306mr.LIZIZ(2131831539, function2.invoke(iMUserLIZ2, c869590Y9l.getConversationId()));
            }
            return C1710306mr.LIZIZ(2131831141, function2.invoke(iMUserLIZ2, c869590Y9l.getConversationId()));
        }
        if (zLIZ) {
            return C1383370m6R.LJIIJ(2131831540);
        }
        return C1383370m6R.LJIIJ(2131831148);
    }
}
