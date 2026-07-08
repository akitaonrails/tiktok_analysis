package X;

import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import kotlin.text.Regex;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0uqF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1719290uqF {
    public static long LIZJ;
    public static final C1719290uqF LIZ = new C1719290uqF();
    public static String LIZIZ = "";
    public static String LIZLLL = "";

    public static C1714620uii LIZ(String str, String str2) {
        SecureRandom secureRandom = new SecureRandom();
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        do {
            stringBuffer.append("abcdefghijklmnopkrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".charAt(secureRandom.nextInt(62)));
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
        return new C1714620uii(strLIZIZ, strLIZIZ2);
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
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C1713570uh1 r7, kotlin.jvm.functions.Function0<kotlin.Unit> r8, kotlin.jvm.functions.Function1<? super X.C0X52<com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse<com.bytedance.pipo.verify.base.model.response.GetIdentityPubKeyResponse>>, kotlin.Unit> r9, X.InterfaceC1364105Vn<? super java.lang.String> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof X.C1719300uqG
            if (r0 == 0) goto L70
            r5 = r10
            X.0uqG r5 = (X.C1719300uqG) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L70
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r1 = 1
            if (r0 == 0) goto L44
            if (r0 != r1) goto L76
            kotlin.jvm.functions.Function1 r9 = r5.LL
            X.C155000ia.LIZIZ(r4)
        L24:
            X.0X52 r4 = (X.C0X52) r4
        L26:
            if (r9 == 0) goto L2b
            r9.invoke(r4)
        L2b:
            if (r4 == 0) goto L3d
            T r0 = r4.LIZIZ
            com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse r0 = (com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse) r0
            if (r0 == 0) goto L3d
            T r0 = r0.data
            com.bytedance.pipo.verify.base.model.response.GetIdentityPubKeyResponse r0 = (com.bytedance.pipo.verify.base.model.response.GetIdentityPubKeyResponse) r0
            if (r0 == 0) goto L3d
            java.lang.String r0 = r0.publicKey
            if (r0 != 0) goto L3f
        L3d:
            java.lang.String r0 = ""
        L3f:
            X.C1719290uqF.LIZLLL = r0
        L41:
            java.lang.String r0 = X.C1719290uqF.LIZLLL
            return r0
        L44:
            X.C155000ia.LIZIZ(r4)
            java.lang.String r0 = X.C1719290uqF.LIZLLL
            int r0 = r0.length()
            if (r0 != 0) goto L41
            if (r8 == 0) goto L54
            r8.invoke()
        L54:
            r4 = 0
            if (r7 == 0) goto L26
            r5.LL = r9
            r5.LLILZ = r1
            X.0ugx r2 = r7.LJ()
            r2.getClass()
            X.1DFB r1 = X.C0PEM.LIZJ
            X.0uWN r0 = new X.0uWN
            r0.<init>(r2, r4)
            java.lang.Object r4 = X.C23250099c.LJI(r5, r1, r0)
            if (r4 != r3) goto L24
            return r3
        L70:
            X.0uqG r5 = new X.0uqG
            r5.<init>(r6, r10)
            goto L12
        L76:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1719290uqF.LIZJ(X.0uh1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C1713570uh1 r10, kotlin.jvm.functions.Function0<kotlin.Unit> r11, kotlin.jvm.functions.Function1<? super X.C0X52<com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse<com.bytedance.pipo.verify.base.model.response.GetPinPublicKeyResponse>>, kotlin.Unit> r12, X.InterfaceC1364105Vn<? super java.lang.String> r13) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r13 instanceof X.C1719310uqH
            if (r0 == 0) goto L8f
            r6 = r13
            X.0uqH r6 = (X.C1719310uqH) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8f
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r1 = r6.LLILLJJLI
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r5 = 0
            r8 = 1
            if (r0 == 0) goto L54
            if (r0 != r8) goto L96
            kotlin.jvm.functions.Function1 r12 = r6.LL
            X.C155000ia.LIZIZ(r1)
        L25:
            X.0X52 r1 = (X.C0X52) r1
        L27:
            if (r12 == 0) goto L2c
            r12.invoke(r1)
        L2c:
            if (r1 == 0) goto L4f
            T r0 = r1.LIZIZ
            com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse r0 = (com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse) r0
            if (r0 == 0) goto L4f
            T r0 = r0.data
            com.bytedance.pipo.verify.base.model.response.GetPinPublicKeyResponse r0 = (com.bytedance.pipo.verify.base.model.response.GetPinPublicKeyResponse) r0
            if (r0 == 0) goto L4f
            java.lang.String r2 = r0.publicKey
            if (r2 == 0) goto L4f
            int r0 = r2.length()
            if (r0 == 0) goto L4f
            long r0 = java.lang.System.currentTimeMillis()
            X.C1719290uqF.LIZJ = r0
            X.C1719290uqF.LIZIZ = r2
        L4c:
            java.lang.String r0 = X.C1719290uqF.LIZIZ
            return r0
        L4f:
            java.lang.String r0 = ""
            X.C1719290uqF.LIZIZ = r0
            goto L4c
        L54:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r0 = X.C1719290uqF.LIZIZ
            int r0 = r0.length()
            if (r0 == 0) goto L6d
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = X.C1719290uqF.LIZJ
            long r3 = r3 - r0
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L4c
        L6d:
            if (r11 == 0) goto L72
            r11.invoke()
        L72:
            if (r10 == 0) goto L8d
            r6.LL = r12
            r6.LLILZ = r8
            X.0ugx r2 = r10.LJ()
            r2.getClass()
            X.1DFB r1 = X.C0PEM.LIZJ
            X.0uWH r0 = new X.0uWH
            r0.<init>(r2, r5)
            java.lang.Object r1 = X.C23250099c.LJI(r6, r1, r0)
            if (r1 != r7) goto L25
            return r7
        L8d:
            r1 = r5
            goto L27
        L8f:
            X.0uqH r6 = new X.0uqH
            r6.<init>(r9, r13)
            goto L12
        L96:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1719290uqF.LIZLLL(X.0uh1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }
}
