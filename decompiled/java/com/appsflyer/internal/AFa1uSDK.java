package com.appsflyer.internal;

import X.C0WZX;
import X.C2204961BRm;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vcloud.strategy.StrategyCenter;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class AFa1uSDK {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    public static int $10 = 0;
    public static int $11 = 1;
    public static byte[] AFLogger$LogLevel;
    public static Object AFPurchaseDetails;
    public static Object afErrorLogForExcManagerOnly;
    public static final Map<String, Object> afLogForce;
    public static final Map<Integer, Object> afRDLog;
    public static byte[] getLevel;
    public static long getProductId;
    public static int getPurchaseType;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0068 -> B:8:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String $$c(int r10, int r11, int r12) {
        /*
            int r2 = com.appsflyer.internal.AFa1uSDK.$11
            r0 = r2 | 105(0x69, float:1.47E-43)
            int r1 = r0 << 1
            r0 = r2 ^ 105(0x69, float:1.47E-43)
            int r1 = r1 - r0
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1uSDK.$10 = r2
            int r0 = r10 + 42
            int r4 = r0 + (-1)
            byte[] r10 = com.appsflyer.internal.AFa1uSDK.$$a
            r1 = r12 & (-79)
            r0 = r12 | (-79)
            int r1 = r1 + r0
            r0 = r1 | 80
            int r9 = r0 << 1
            r0 = r1 ^ 80
            int r9 = r9 - r0
            r0 = r11 | 4
            int r3 = r0 << 1
            r0 = r11 ^ 4
            int r3 = r3 - r0
            byte[] r6 = new byte[r9]
            r0 = -1
            int r9 = r9 + r0
            r1 = 89
            if (r10 != 0) goto L7e
            r0 = 19
        L30:
            r5 = 0
            if (r0 == r1) goto L7c
            r1 = r2 & 9
            r0 = r2 | 9
            int r1 = r1 + r0
            int r0 = r1 % 128
            com.appsflyer.internal.AFa1uSDK.$11 = r0
            r1 = r0 ^ 67
            r0 = r0 & 67
            int r0 = r0 << 1
            int r1 = r1 + r0
            int r0 = r1 % 128
            com.appsflyer.internal.AFa1uSDK.$10 = r0
            r8 = r3
            r11 = r9
            r7 = 0
        L4a:
            int r1 = -r3
            r0 = r9 | r1
            int r4 = r0 << 1
            r1 = r1 ^ r9
            int r4 = r4 - r1
            int r0 = r8 + 56
            int r0 = r0 + (-1)
            r1 = r0 ^ (-54)
            r0 = r0 & (-54)
            int r3 = r0 << 1
            int r3 = r3 + r1
            r9 = r11
        L5d:
            byte r0 = (byte) r4
            r6[r7] = r0
            if (r7 != r9) goto L68
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L68:
            r2 = r10[r3]
            int r7 = r7 + 1
            int r0 = com.appsflyer.internal.AFa1uSDK.$10
            r1 = r0 & 97
            r0 = r0 | 97
            int r1 = r1 + r0
            int r0 = r1 % 128
            com.appsflyer.internal.AFa1uSDK.$11 = r0
            r11 = r9
            r9 = r4
            r8 = r3
            r3 = r2
            goto L4a
        L7c:
            r7 = 0
            goto L5d
        L7e:
            r0 = 89
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1uSDK.$$c(int, int, int):java.lang.String");
    }

    public static int AFInAppEventType(Object obj) throws Throwable {
        int i = $11;
        int i2 = (i & 123) + (i | 123);
        $10 = i2 % 128;
        if ((i2 % 2 != 0 ? (char) 24 : (char) 14) != 14) {
            try {
                throw null;
            } finally {
            }
        }
        Object obj2 = afErrorLogForExcManagerOnly;
        $10 = (i + 31) % 128;
        try {
            int iIntValue = ((Integer) C2204961BRm.a0(Class.forName($$c((byte) (-$$a[436]), (short) StrategyCenter.ENABLE_SMART_SERVICE, r7[309]), true, (ClassLoader) AFPurchaseDetails).getMethod($$c(r7[345], (short) 294, r7[13]), Object.class), obj2, new Object[]{obj}, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bRsfeleyw==", new String[]{"01c45"}))).intValue();
            int i3 = $11;
            int i4 = (i3 ^ 7) + ((i3 & 7) << 1);
            $10 = i4 % 128;
            if (i4 % 2 == 0) {
                return iIntValue;
            }
            try {
                throw null;
            } finally {
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void init$0() {
        int i = $11;
        $10 = (((i | 61) << 1) - (i ^ 61)) % 128;
        byte[] bArr = new byte[1003];
        System.arraycopy("t9\u0007\u001b\të\u00153ÅúAìÍ\u000f\u0000\u0001ó\r\u0001\u001bÛþû\u0001!ß\u0002\r\u0004ô\të\u00153Â\u000bó\u00079ÛÚ\u0006ÿ\u000føî\u0003\u0000\r÷ú3Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001ô)ç\u0005ó\nò\u0003\u0006\u00056¿üEÞÞ\u0003\fþò\u0000\të\u00153À\u0005úAìÉ\u0005\u000f#Í\u000f\u0000\u0001óó\nò\u0003\u0006\u00056¿üEìÍ\fý\b@Î\u0011óÿ\nú\u0001\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è0Ûþû\u0001!ß\u0002\r\u0004ô\u0003õö\rþ=»ú\u0006ÿ\u000fø?åÛ!èøþýù5ßí5×\u000bî\u0000'Ý\u000eýÿó\r\u0004ý\u001eÑ\t\u0000ó\u0002ñ.Ýý\u0007ò/Û÷\u0005\tõ\u000f\u0002ñ1âþû\u0003!Û÷\r\u0004ý\u0003õö\rþ=»ú\u0006ÿ\u000fø?êßí2Ýý\u0007ô\u000bÿ\u0006ü\u0002þû\u0003\u0003õö\rþ=»ú\u0006ÿ\u000fø?ìáî\u000e!ßí5×\u000bî\u0000'Ý\u000eýÿó\u0002ñ1Ô\u000bÿ\"âþû\u0003!Û÷ú\u000b\u000bûýÛ-Ñ\u0000+Ï\u0011÷ú Û\t\u000b\u0015ù\u0017øºÿOº\u0005õ\u0000\n\u0001þøøS´\u0007ÿòK\u0015ú\u0016ø\u0015ü\u0014ø\u0015ø\u0018øûýÛ-Ñ\u0000+Ï\u0011÷ú$ïï\u0011ô\bñ\u000fó$íô\b\të\u00153Â\u000bó\u00079ë×\u000bî\u0000'Ý\u000eýÿóó\nò\u0003\u0006\u00056Íñ\u0000BíÑ\u0000)Ûý\r\u0001õù\u000eñ\"í\u0004ý\u0015á\u0002óÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Í5\të\u00153ÅúAêãí\u0013\u0018Ûþû\u0001!ß\u0002\r\u0004ôý\u000eý ßíó\nò\u0003\u0006\u00056¸\r\u0004îIãæì4Ï\u0011÷ú\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è*Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô\u0015õ÷\u0010ò\u0006ì6Ô\u000bÿ\u001fÔ\u0003\u0002\u001aß\u0002\tû\u0007\b\u0002ù\u0002ñ1×\u000bî\u0000'Ý\u000eýÿóË\u0003í\u00132Ë\u0003í\u00132ÿù\u0007ñ\u000f\u0002ñ.\u0002\u000fùì\u0016ûú\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù)ïí\f#Ù\u0007ø\b÷ú\u0001÷ýü\u000eÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Î4\të\u00153ÅúAº\u0007ý\fû÷\u0002ñ$Þ\u0003ÿ\u000bóþû\u0002ñ3ßï\u0004\u0003÷\u0001\u000f\u0015ïí\fó\nò\u0003\u0006\u00056Íñ\u0000BíÞï\u000bó\rõû%ìö\r\u0004ý\u0015õ÷\u0010\u0016é\të\u00153ÅúAèÝý\u0007\u0016Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô\u0002ó\u0017å\tõ\u000f\të\u00153ÅúAåú\nÍ\u0015þõü\u000bú\u0001\u000fí\f\u001cãöÿ\u0002ñ+Û\u0005õ\u000b\bõ+Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001\të\u00153ÅúAèÝý\u0007\u0015ý\u0013øî\u0003\u0000\r÷ú ëü\b\u0018äý\u0000\u0003öô\u0002?Íñ\u0000ý\rúó\u0014óDÅûú\u000fó\u0004\rõ>íûå0¸&\u000fù'\u0000\të\u00153ÅúAèÝý\u0007!ßò\u0010ñ\tùü\u0005ý\u0005-É\u0005\u000f$Ï\u0000\u0011èý\u000eý!×\u000bî\u0000ô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûå0¸&\u000fù'\u0000ô\u0002?Íñ\u0000ý\rúó\u0014ó\u0005\u0011ñô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûå0¼\"\u000fù'\u00ad\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù5Û÷\r\u0002ï\u0005ý\t\u0004ò\të\u00153ÅúAåÛþû\u0001!ß\u0002\r\u0004ô".getBytes("ISO-8859-1"), 0, bArr, 0, 1003);
        $$a = bArr;
        $$b = 60;
        int i2 = $10;
        int i3 = (i2 ^ 17) + ((i2 & 17) << 1);
        $11 = i3 % 128;
        if (i3 % 2 == 0) {
        }
    }

    public static int values(int i) throws Throwable {
        int i2 = $11;
        int i3 = ((i2 | 101) << 1) - (i2 ^ 101);
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            try {
                throw null;
            } finally {
            }
        }
        Object obj = afErrorLogForExcManagerOnly;
        try {
            int iIntValue = ((Integer) C2204961BRm.a0(Class.forName($$c((byte) (-$$a[436]), (short) StrategyCenter.ENABLE_SMART_SERVICE, r7[309]), true, (ClassLoader) AFPurchaseDetails).getMethod($$c((byte) 77, (short) 519, r7[65]), Integer.TYPE), obj, new Object[]{Integer.valueOf(i)}, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bRsfeleyw==", new String[]{"01c45"}))).intValue();
            int i4 = $11;
            int i5 = ((i4 | 53) << 1) - (i4 ^ 53);
            $10 = i5 % 128;
            if (i5 % 2 == 0) {
                return iIntValue;
            }
            try {
                throw null;
            } finally {
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object values(char c, int i, int i2) throws Throwable {
        int i3 = $11;
        int i4 = ((i3 | 31) << 1) - (i3 ^ 31);
        int i5 = i4 % 128;
        $10 = i5;
        if (i4 % 2 != 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Object obj = afErrorLogForExcManagerOnly;
        int i6 = (i5 + 87) % 128;
        $11 = i6;
        $10 = ((i6 + 108) - 1) % 128;
        try {
            Object[] objArr = {Character.valueOf(c), Integer.valueOf(i), Integer.valueOf(i2)};
            byte[] bArr = $$a;
            Class<?> cls = Class.forName($$c((byte) (-bArr[436]), (short) StrategyCenter.ENABLE_SMART_SERVICE, bArr[309]), true, (ClassLoader) AFPurchaseDetails);
            byte b = bArr[345];
            String str$$c = $$c(b, (short) 343, b);
            Class<?> cls2 = Integer.TYPE;
            return C2204961BRm.a0(cls.getMethod(str$$c, Character.TYPE, cls2, cls2), obj, objArr, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bRsfeleyw==", new String[]{"01c45"}));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(30:745|3|(1:5)(1:6)|7|(2:794|8)|(1:10)(22:743|13|(0)(2:20|(2:828|22)(1:25))|(3:790|27|30)|31|(1:(1:34)(3:45|802|46))|(1:36)(5:42|792|43|781|44)|(5:41|47|48|784|49)|55|844|56|(1:58)(11:59|(1:64)|854|65|(1:67)(1:68)|69|(1:71)(1:72)|73|79|(4:80|(21:862|82|(1:(17:675|85|872|86|870|87|868|88|(10:866|90|856|91|850|92|697|93|96|(3:97|(10:98|(1:(1:101)(1:(1:103)(1:104)))(1:105)|846|106|842|107|(3:108|(2:839|122)(5:113|(1:115)(1:116)|117|(1:119)(1:120)|121)|123)|125|(2:689|127)(1:(2:693|129)(1:(3:131|705|132)(8:808|133|729|134|727|135|718|136)))|(1:(1:139))(1:884))|885))(7:763|209|210|754|211|212|880)|628|(3:631|(2:637|(2:893|639)(2:895|640))(2:634|(3:892|636|639)(2:894|640))|629)|876|647|648|772|649|650)(0))(1:220)|221|859|222|840|223|833|224|225|824|226|822|227|228|(6:229|230|814|231|232|(10:234|235|752|236|761|237|243|779|244|(48:723|246|(2:248|250)(1:249)|251|701|252|695|253|(3:255|766|256)|257|691|258|(8:260|807|261|798|262|786|263|(3:265|777|266)(1:897))|267|687|268|685|269|683|270|679|271|677|272|864|273|274|275|852|276|848|277|811|278|835|279|830|280|281|(4:283|809|284|285)|286|287|288|818|289|758|290|(5:292|816|293|294|(17:776|353|774|354|355|(1:357)(1:358)|359|764|360|756|361|750|362|746|363|858|364)(1:883))(1:881))(6:295|296|768|297|298|(31:300|725|301|302|306|(4:307|748|308|(2:310|(3:312|313|(8:315|739|316|735|317|731|318|889)(1:888))(3:882|503|504))(1:887))|319|741|320|709|321|770|329|337|733|338|339|721|340|341|681|342|(4:344|812|345|891)|890|346|347|(1:349)|350|737|351|(0)(0))(31:303|759|304|305|306|(5:307|748|308|(0)(0)|889)|319|741|320|709|321|770|329|337|733|338|339|721|340|341|681|342|(0)|890|346|347|(0)|350|737|351|(0)(0))))(13:238|805|239|804|240|796|241|788|242|243|779|244|(0)(0)))|532|(1:534)(1:535)|536|646)|641|(1:643)(2:877|656))|899)|63|854|65|(0)(0)|69|(0)(0)|73|79|(4:80|(0)|641|(0)(0))|899)|713|17|828|22|(0)|31|(0)|(0)(0)|(6:38|41|47|48|784|49)|55|844|56|(0)(0)|63|854|65|(0)(0)|69|(0)(0)|73|79|(4:80|(0)|641|(0)(0))|899|(2:(0)|(1:801))) */
    /* JADX WARN: Can't wrap try/catch for region: R(33:0|2|745|3|(1:5)(1:6)|7|794|8|(1:10)(22:743|13|(0)(2:20|(2:828|22)(1:25))|(3:790|27|30)|31|(1:(1:34)(3:45|802|46))|(1:36)(5:42|792|43|781|44)|(5:41|47|48|784|49)|55|844|56|(1:58)(11:59|(1:64)|854|65|(1:67)(1:68)|69|(1:71)(1:72)|73|79|(4:80|(21:862|82|(1:(17:675|85|872|86|870|87|868|88|(10:866|90|856|91|850|92|697|93|96|(3:97|(10:98|(1:(1:101)(1:(1:103)(1:104)))(1:105)|846|106|842|107|(3:108|(2:839|122)(5:113|(1:115)(1:116)|117|(1:119)(1:120)|121)|123)|125|(2:689|127)(1:(2:693|129)(1:(3:131|705|132)(8:808|133|729|134|727|135|718|136)))|(1:(1:139))(1:884))|885))(7:763|209|210|754|211|212|880)|628|(3:631|(2:637|(2:893|639)(2:895|640))(2:634|(3:892|636|639)(2:894|640))|629)|876|647|648|772|649|650)(0))(1:220)|221|859|222|840|223|833|224|225|824|226|822|227|228|(6:229|230|814|231|232|(10:234|235|752|236|761|237|243|779|244|(48:723|246|(2:248|250)(1:249)|251|701|252|695|253|(3:255|766|256)|257|691|258|(8:260|807|261|798|262|786|263|(3:265|777|266)(1:897))|267|687|268|685|269|683|270|679|271|677|272|864|273|274|275|852|276|848|277|811|278|835|279|830|280|281|(4:283|809|284|285)|286|287|288|818|289|758|290|(5:292|816|293|294|(17:776|353|774|354|355|(1:357)(1:358)|359|764|360|756|361|750|362|746|363|858|364)(1:883))(1:881))(6:295|296|768|297|298|(31:300|725|301|302|306|(4:307|748|308|(2:310|(3:312|313|(8:315|739|316|735|317|731|318|889)(1:888))(3:882|503|504))(1:887))|319|741|320|709|321|770|329|337|733|338|339|721|340|341|681|342|(4:344|812|345|891)|890|346|347|(1:349)|350|737|351|(0)(0))(31:303|759|304|305|306|(5:307|748|308|(0)(0)|889)|319|741|320|709|321|770|329|337|733|338|339|721|340|341|681|342|(0)|890|346|347|(0)|350|737|351|(0)(0))))(13:238|805|239|804|240|796|241|788|242|243|779|244|(0)(0)))|532|(1:534)(1:535)|536|646)|641|(1:643)(2:877|656))|899)|63|854|65|(0)(0)|69|(0)(0)|73|79|(4:80|(0)|641|(0)(0))|899)|713|17|828|22|(0)|31|(0)|(0)(0)|(6:38|41|47|48|784|49)|55|844|56|(0)(0)|63|854|65|(0)(0)|69|(0)(0)|73|79|(4:80|(0)|641|(0)(0))|899|(2:(0)|(1:801))) */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x06fd, code lost:
    
        r5 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0101, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0102, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0131, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0132, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x03a0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x03a2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x03a3, code lost:
    
        r29 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x03a5, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0135 A[PHI: r4 r13
      0x0135: PHI (r4v7 java.lang.Object) = (r4v6 java.lang.Object), (r4v133 java.lang.Object) binds: [B:21:0x0106, B:24:0x0132] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r13v1 java.lang.Object) = (r13v0 java.lang.Object), (r13v22 java.lang.Object) binds: [B:21:0x0106, B:24:0x0132] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0f6b  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x1062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x130a  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x132b A[Catch: all -> 0x17b1, TryCatch #53 {all -> 0x17b1, blocks: (B:353:0x137c, B:355:0x138b, B:359:0x13b1, B:296:0x0f6d, B:302:0x0fe2, B:339:0x11d9, B:341:0x1270, B:342:0x127b, B:346:0x1321, B:347:0x1327, B:349:0x132b, B:350:0x132d, B:527:0x16b3, B:531:0x16be, B:336:0x11b4, B:328:0x1168, B:321:0x1126, B:331:0x11a8, B:333:0x11b1, B:334:0x11b2, B:351:0x1366, B:329:0x116b, B:528:0x16b6, B:529:0x16bc, B:323:0x115c, B:325:0x1165, B:326:0x1166), top: B:776:0x137c, inners: #17, #23, #32, #50, #83, #102 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x019e A[Catch: Exception -> 0x18d8, TRY_ENTER, TRY_LEAVE, TryCatch #36 {Exception -> 0x18d8, blocks: (B:3:0x0021, B:5:0x003a, B:45:0x0218, B:668:0x18cd, B:670:0x18d6, B:671:0x18d7, B:47:0x0261, B:51:0x02b7, B:53:0x02c0, B:54:0x02c1, B:55:0x02c2, B:56:0x033b, B:65:0x0382, B:69:0x0393, B:73:0x039c, B:80:0x03a9, B:628:0x1814, B:634:0x182e, B:639:0x1837, B:640:0x183d, B:637:0x1833, B:648:0x185d, B:652:0x18a8, B:654:0x18b1, B:655:0x18b2, B:641:0x1840, B:78:0x03a5, B:42:0x019e, B:658:0x18b5, B:660:0x18be, B:661:0x18bf, B:663:0x18c1, B:665:0x18ca, B:666:0x18cb, B:29:0x0162, B:24:0x0132, B:19:0x0102, B:15:0x00d0, B:12:0x0091, B:17:0x00d5, B:13:0x0095, B:649:0x1871, B:650:0x18a6, B:44:0x01f3, B:49:0x027d, B:27:0x0138, B:43:0x01af, B:8:0x0050, B:46:0x023a, B:22:0x0108), top: B:745:0x0021, inners: #19, #35, #51, #56, #58, #61, #62, #63, #67, #84 }] */
    /* JADX WARN: Removed duplicated region for block: B:512:0x1695 A[Catch: all -> 0x180f, TryCatch #100 {all -> 0x180f, blocks: (B:364:0x148b, B:510:0x168c, B:512:0x1695, B:513:0x1696, B:515:0x1698, B:517:0x16a1, B:518:0x16a2, B:520:0x16a4, B:522:0x16ad, B:523:0x16ae, B:532:0x16c1, B:536:0x16e2, B:538:0x16f2, B:542:0x175c, B:544:0x1765, B:545:0x1766, B:547:0x1768, B:549:0x1771, B:550:0x1772, B:552:0x1774, B:554:0x177d, B:555:0x177e, B:557:0x1780, B:559:0x1789, B:560:0x178a, B:562:0x178c, B:564:0x1795, B:565:0x1796, B:569:0x179a, B:571:0x17a3, B:572:0x17a4, B:574:0x17a6, B:576:0x17af, B:577:0x17b0, B:581:0x17b4, B:583:0x17bd, B:584:0x17be, B:366:0x1496, B:368:0x149f, B:369:0x14a0, B:602:0x17de, B:604:0x17e7, B:605:0x17e8, B:609:0x17ec, B:611:0x17f5, B:612:0x17f6, B:614:0x17f8, B:616:0x1801, B:617:0x1802, B:619:0x1804, B:621:0x180d, B:622:0x180e, B:539:0x1727, B:540:0x175a, B:340:0x122c, B:338:0x11b9, B:320:0x10eb, B:308:0x1018, B:236:0x0906, B:361:0x141b, B:360:0x13dc, B:297:0x0f77, B:244:0x0ac2, B:231:0x08b3, B:224:0x080e, B:223:0x07cc), top: B:858:0x148b, inners: #16, #24, #30, #34, #38, #40, #42, #47, #49, #55, #77, #87, #91 }] */
    /* JADX WARN: Removed duplicated region for block: B:513:0x1696 A[Catch: all -> 0x180f, TryCatch #100 {all -> 0x180f, blocks: (B:364:0x148b, B:510:0x168c, B:512:0x1695, B:513:0x1696, B:515:0x1698, B:517:0x16a1, B:518:0x16a2, B:520:0x16a4, B:522:0x16ad, B:523:0x16ae, B:532:0x16c1, B:536:0x16e2, B:538:0x16f2, B:542:0x175c, B:544:0x1765, B:545:0x1766, B:547:0x1768, B:549:0x1771, B:550:0x1772, B:552:0x1774, B:554:0x177d, B:555:0x177e, B:557:0x1780, B:559:0x1789, B:560:0x178a, B:562:0x178c, B:564:0x1795, B:565:0x1796, B:569:0x179a, B:571:0x17a3, B:572:0x17a4, B:574:0x17a6, B:576:0x17af, B:577:0x17b0, B:581:0x17b4, B:583:0x17bd, B:584:0x17be, B:366:0x1496, B:368:0x149f, B:369:0x14a0, B:602:0x17de, B:604:0x17e7, B:605:0x17e8, B:609:0x17ec, B:611:0x17f5, B:612:0x17f6, B:614:0x17f8, B:616:0x1801, B:617:0x1802, B:619:0x1804, B:621:0x180d, B:622:0x180e, B:539:0x1727, B:540:0x175a, B:340:0x122c, B:338:0x11b9, B:320:0x10eb, B:308:0x1018, B:236:0x0906, B:361:0x141b, B:360:0x13dc, B:297:0x0f77, B:244:0x0ac2, B:231:0x08b3, B:224:0x080e, B:223:0x07cc), top: B:858:0x148b, inners: #16, #24, #30, #34, #38, #40, #42, #47, #49, #55, #77, #87, #91 }] */
    /* JADX WARN: Removed duplicated region for block: B:571:0x17a3 A[Catch: all -> 0x180f, TryCatch #100 {all -> 0x180f, blocks: (B:364:0x148b, B:510:0x168c, B:512:0x1695, B:513:0x1696, B:515:0x1698, B:517:0x16a1, B:518:0x16a2, B:520:0x16a4, B:522:0x16ad, B:523:0x16ae, B:532:0x16c1, B:536:0x16e2, B:538:0x16f2, B:542:0x175c, B:544:0x1765, B:545:0x1766, B:547:0x1768, B:549:0x1771, B:550:0x1772, B:552:0x1774, B:554:0x177d, B:555:0x177e, B:557:0x1780, B:559:0x1789, B:560:0x178a, B:562:0x178c, B:564:0x1795, B:565:0x1796, B:569:0x179a, B:571:0x17a3, B:572:0x17a4, B:574:0x17a6, B:576:0x17af, B:577:0x17b0, B:581:0x17b4, B:583:0x17bd, B:584:0x17be, B:366:0x1496, B:368:0x149f, B:369:0x14a0, B:602:0x17de, B:604:0x17e7, B:605:0x17e8, B:609:0x17ec, B:611:0x17f5, B:612:0x17f6, B:614:0x17f8, B:616:0x1801, B:617:0x1802, B:619:0x1804, B:621:0x180d, B:622:0x180e, B:539:0x1727, B:540:0x175a, B:340:0x122c, B:338:0x11b9, B:320:0x10eb, B:308:0x1018, B:236:0x0906, B:361:0x141b, B:360:0x13dc, B:297:0x0f77, B:244:0x0ac2, B:231:0x08b3, B:224:0x080e, B:223:0x07cc), top: B:858:0x148b, inners: #16, #24, #30, #34, #38, #40, #42, #47, #49, #55, #77, #87, #91 }] */
    /* JADX WARN: Removed duplicated region for block: B:572:0x17a4 A[Catch: all -> 0x180f, TryCatch #100 {all -> 0x180f, blocks: (B:364:0x148b, B:510:0x168c, B:512:0x1695, B:513:0x1696, B:515:0x1698, B:517:0x16a1, B:518:0x16a2, B:520:0x16a4, B:522:0x16ad, B:523:0x16ae, B:532:0x16c1, B:536:0x16e2, B:538:0x16f2, B:542:0x175c, B:544:0x1765, B:545:0x1766, B:547:0x1768, B:549:0x1771, B:550:0x1772, B:552:0x1774, B:554:0x177d, B:555:0x177e, B:557:0x1780, B:559:0x1789, B:560:0x178a, B:562:0x178c, B:564:0x1795, B:565:0x1796, B:569:0x179a, B:571:0x17a3, B:572:0x17a4, B:574:0x17a6, B:576:0x17af, B:577:0x17b0, B:581:0x17b4, B:583:0x17bd, B:584:0x17be, B:366:0x1496, B:368:0x149f, B:369:0x14a0, B:602:0x17de, B:604:0x17e7, B:605:0x17e8, B:609:0x17ec, B:611:0x17f5, B:612:0x17f6, B:614:0x17f8, B:616:0x1801, B:617:0x1802, B:619:0x1804, B:621:0x180d, B:622:0x180e, B:539:0x1727, B:540:0x175a, B:340:0x122c, B:338:0x11b9, B:320:0x10eb, B:308:0x1018, B:236:0x0906, B:361:0x141b, B:360:0x13dc, B:297:0x0f77, B:244:0x0ac2, B:231:0x08b3, B:224:0x080e, B:223:0x07cc), top: B:858:0x148b, inners: #16, #24, #30, #34, #38, #40, #42, #47, #49, #55, #77, #87, #91 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x17cb A[Catch: all -> 0x17db, TryCatch #76 {all -> 0x17db, blocks: (B:588:0x17c2, B:590:0x17cb, B:591:0x17cc, B:595:0x17d0, B:597:0x17d9, B:598:0x17da, B:239:0x099f), top: B:805:0x099f, inners: #70 }] */
    /* JADX WARN: Removed duplicated region for block: B:591:0x17cc A[Catch: all -> 0x17db, TRY_LEAVE, TryCatch #76 {all -> 0x17db, blocks: (B:588:0x17c2, B:590:0x17cb, B:591:0x17cc, B:595:0x17d0, B:597:0x17d9, B:598:0x17da, B:239:0x099f), top: B:805:0x099f, inners: #70 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x184d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:723:0x0b1b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:763:0x072c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:776:0x137c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:790:0x0138 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:862:0x03ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:877:0x18b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:883:0x16c1 A[EDGE_INSN: B:883:0x16c1->B:532:0x16c1 BREAK  A[LOOP:4: B:229:0x088e->B:364:0x148b, LOOP_LABEL: LOOP:0: B:80:0x03a9->B:645:0x1852], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:887:0x10de A[EDGE_INSN: B:887:0x10de->B:319:0x10de BREAK  A[LOOP:5: B:307:0x100b->B:889:?], SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    static {
        /*
            Method dump skipped, instruction units count: 6370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1uSDK.<clinit>():void");
    }
}
