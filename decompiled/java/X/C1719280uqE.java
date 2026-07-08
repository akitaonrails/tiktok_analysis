package X;

import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Random;
import javax.crypto.Cipher;
import kotlin.text.Regex;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0uqE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1719280uqE {
    public static final C1719280uqE LIZ = new C1719280uqE();
    public static String LIZIZ = "";
    public static long LIZJ;

    static {
        new ArrayList();
    }

    public static C1719260uqC LIZ(String str, String str2) {
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        do {
            stringBuffer.append("abcdefghijklmnopkrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".charAt(random.nextInt(62)));
            i++;
        } while (i < 32);
        String string = stringBuffer.toString();
        String strValueOf = String.valueOf(System.currentTimeMillis());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(strValueOf);
        sbLIZ.append('_');
        sbLIZ.append(string);
        String strLIZIZ = LIZIZ(C2188811AlT.LIZIZ(sbLIZ), str2);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strValueOf);
        sbLIZ2.append('_');
        sbLIZ2.append(string);
        String strLIZIZ2 = LIZIZ(C2188811AlT.LIZIZ(sbLIZ2), str2);
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        if (strLIZIZ2 == null) {
            strLIZIZ2 = "";
        }
        return new C1719260uqC(strLIZIZ, strLIZIZ2);
    }

    public static String LIZIZ(String str, String str2) {
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(new Regex("\t").replace(new Regex("\n").replace(u.LJJIFFI(u.LJJIFFI(str2, "-----BEGIN PUBLIC KEY-----", "", false), "-----END PUBLIC KEY-----", "", false), ""), ""), 0)));
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, publicKeyGeneratePublic);
            return Base64.encodeToString(cipher.doFinal(u.LJIILLIIL(str)), 0);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(com.ss.android.ugc.aweme.foundation.network.PipoAccountApi r10, java.lang.String r11, X.InterfaceC1364105Vn<? super java.lang.String> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof X.C1719270uqD
            if (r0 == 0) goto L22
            r6 = r12
            X.0uqD r6 = (X.C1719270uqD) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r3 = r6.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            java.lang.String r8 = ""
            r5 = 1
            if (r0 == 0) goto L30
            if (r0 != r5) goto L28
            goto L58
        L22:
            X.0uqD r6 = new X.0uqD
            r6.<init>(r9, r12)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r3)
            java.lang.String r0 = X.C1719280uqE.LIZIZ
            int r0 = r0.length()
            if (r0 != 0) goto L4d
            r0 = 1
        L3c:
            if (r0 != 0) goto L4f
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = X.C1719280uqE.LIZJ
            long r3 = r3 - r0
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lb3
            goto L4f
        L4d:
            r0 = 0
            goto L3c
        L4f:
            r6.LLILLL = r5     // Catch: java.lang.Exception -> L9e
            java.lang.Object r3 = r10.getPinPublicKey(r11, r6)     // Catch: java.lang.Exception -> L9e
            if (r3 != r7) goto L5b
            return r7
        L58:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L9e
        L5b:
            X.0X52 r3 = (X.C0X52) r3     // Catch: java.lang.Exception -> L9e
            boolean r0 = r3.LIZJ()     // Catch: java.lang.Exception -> L9e
            if (r0 == 0) goto L90
            T r0 = r3.LIZIZ     // Catch: java.lang.Exception -> L9e
            com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse r0 = (com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse) r0     // Catch: java.lang.Exception -> L9e
            boolean r0 = r0.LIZ()     // Catch: java.lang.Exception -> L9e
            if (r0 == 0) goto L80
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L9e
            X.C1719280uqE.LIZJ = r0     // Catch: java.lang.Exception -> L9e
            T r0 = r3.LIZIZ     // Catch: java.lang.Exception -> L9e
            com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse r0 = (com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse) r0     // Catch: java.lang.Exception -> L9e
            T r0 = r0.data     // Catch: java.lang.Exception -> L9e
            com.ss.android.ugc.aweme.component.verify.pin.model.PinPublicKey r0 = (com.ss.android.ugc.aweme.component.verify.pin.model.PinPublicKey) r0     // Catch: java.lang.Exception -> L9e
            java.lang.String r0 = r0.publicKey     // Catch: java.lang.Exception -> L9e
            X.C1719280uqE.LIZIZ = r0     // Catch: java.lang.Exception -> L9e
            goto Lb3
        L80:
            X.C1719280uqE.LIZIZ = r8     // Catch: java.lang.Exception -> L9e
            X.0ulR r2 = X.C1716310ulR.LIZ     // Catch: java.lang.Exception -> L9e
            X.0ulS r1 = X.EnumC1716320ulS.PUBLIC_KEY     // Catch: java.lang.Exception -> L9e
            T r0 = r3.LIZIZ     // Catch: java.lang.Exception -> L9e
            com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse r0 = (com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse) r0     // Catch: java.lang.Exception -> L9e
            java.lang.String r0 = r0.errorContent     // Catch: java.lang.Exception -> L9e
            X.C1716310ulR.LJIIIIZZ(r2, r1, r0)     // Catch: java.lang.Exception -> L9e
            goto Lb3
        L90:
            X.C1719280uqE.LIZIZ = r8     // Catch: java.lang.Exception -> L9e
            X.0ulR r2 = X.C1716310ulR.LIZ     // Catch: java.lang.Exception -> L9e
            X.0ulS r1 = X.EnumC1716320ulS.PUBLIC_KEY     // Catch: java.lang.Exception -> L9e
            X.08fh r0 = r3.LIZ     // Catch: java.lang.Exception -> L9e
            java.lang.String r0 = r0.LJI     // Catch: java.lang.Exception -> L9e
            X.C1716310ulR.LJIIIIZZ(r2, r1, r0)     // Catch: java.lang.Exception -> L9e
            goto Lb3
        L9e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1719280uqE.LIZIZ = r8
            X.0ulR r2 = X.C1716310ulR.LIZ
            X.0ulS r1 = X.EnumC1716320ulS.PUBLIC_KEY
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto Lb0
            java.lang.String r0 = "exception error"
        Lb0:
            X.C1716310ulR.LJIIIIZZ(r2, r1, r0)
        Lb3:
            java.lang.String r0 = X.C1719280uqE.LIZIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1719280uqE.LIZJ(com.ss.android.ugc.aweme.foundation.network.PipoAccountApi, java.lang.String, X.05Vn):java.lang.Object");
    }
}
