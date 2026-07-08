package X;

import com.ss.android.ugc.aweme.tako.base.internal.db.MessageDatabase;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yZ0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862360yZ0 {
    public static final C1862360yZ0 LIZ;

    static {
        C1862360yZ0 c1862360yZ0 = new C1862360yZ0();
        LIZ = c1862360yZ0;
        C1862430yZ7.LJIIIZ = new C324760CoE(c1862360yZ0);
        C1862430yZ7.LJIIJ = new C1862390yZ3(c1862360yZ0);
        C1862430yZ7.LJIIJJI = new C1862350yYz(c1862360yZ0);
        C1862430yZ7.LJIIL = new C1862380yZ2(c1862360yZ0);
        C1862430yZ7.LJIILIIL = new C321960Cji(c1862360yZ0);
    }

    public static Message LIZIZ(String str) {
        boolean z;
        InterfaceC1863480yao interfaceC1863480yaoLIZ;
        List<C1862400yZ4> listLJIIJ;
        C1862400yZ4 c1862400yZ4;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        Message message = C1863380yae.LJJIJIL;
        if (message != null && Intrinsics.LJFF(message.uuid, str)) {
            return message;
        }
        MessageDatabase messageDatabase = C1863280yaU.LJIIZILJ;
        if (messageDatabase == null || (interfaceC1863480yaoLIZ = messageDatabase.LIZ()) == null || (listLJIIJ = interfaceC1863480yaoLIZ.LJIIJ(str)) == null || (c1862400yZ4 = (C1862400yZ4) C13LP.LJJJLL(listLJIIJ)) == null) {
            return null;
        }
        return C1862370yZ1.LIZIZ(c1862400yZ4);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0194 A[PHI: r64
      0x0194: PHI (r64v3 java.lang.String) = (r64v0 java.lang.String), (r64v4 java.lang.String) binds: [B:116:0x0192, B:114:0x018e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0237 A[PHI: r64
      0x0237: PHI (r64v1 java.lang.String) = (r64v0 java.lang.String), (r64v3 java.lang.String) binds: [B:116:0x0192, B:118:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0252 A[PHI: r25
      0x0252: PHI (r25v1 int) = (r25v0 int), (r25v5 int) binds: [B:144:0x024e, B:51:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c1 A[PHI: r24 r25
      0x00c1: PHI (r24v1 int) = (r24v0 int), (r24v3 int), (r24v3 int) binds: [B:147:0x0254, B:54:0x00bb, B:56:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x00c1: PHI (r25v2 int) = (r25v1 int), (r25v4 int), (r25v4 int) binds: [B:147:0x0254, B:54:0x00bb, B:56:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.tako.ccl.model.api.Message r84, X.C1862520yZG r85, int r86, com.ss.android.ugc.aweme.tako.ccl.model.api.Extra r87, com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed r88, int r89) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1862360yZ0.LIZ(com.ss.android.ugc.aweme.tako.ccl.model.api.Message, X.0yZG, int, com.ss.android.ugc.aweme.tako.ccl.model.api.Extra, com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed, int):void");
    }
}
