package X;

import android.content.Intent;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03yP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1017503yP {
    public static final C1017503yP LIZ = new C1017503yP();

    public static List LIZIZ(Intent intent) {
        String strLIZ;
        boolean z;
        if (intent != null) {
            try {
                strLIZ = LIZ(intent, "container_params");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        } else {
            strLIZ = null;
        }
        if (strLIZ == null || strLIZ.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            JSONArray jSONArray = new JSONArray(strLIZ);
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(C786410Ut5.J3(JSONArrayProtectorUtils.getJSONObject(jSONArray, i)));
            }
            return arrayList;
        }
        return null;
    }

    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void LIZLLL(String str, Map map) {
        Object c098200Yq;
        try {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("page_name", str);
            jSONObject.put("rd_pdp_monitor_version", "v4190");
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                C03PA.LIZ(jSONObject, (String) entry.getKey(), entry.getValue());
            }
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("tiktokec_rd_pdp_page_intercept", jSONObject);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1AF0.LJ(thM5exceptionOrNullimpl);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(73:0|2|(5:4|(1:16)(1:8)|9|(1:11)|12)|13|(1:15)(1:17)|(2:501|18)|(1:22)(1:85)|23|(1:25)(1:84)|26|(1:28)|29|(1:31)(1:83)|32|(1:34)|(1:36)(1:82)|37|(1:81)(2:39|(2:43|(1:80)(1:49)))|50|(1:79)(2:52|(2:54|(1:78)(1:58)))|59|(50:72|(0)(2:75|(1:77)(1:71))|495|86|(1:88)(1:90)|89|(11:92|491|93|509|94|(1:99)(3:98|507|100)|101|(1:103)|104|(2:106|514)(1:513)|113)|511|(1:213)(2:119|(0))|121|(1:125)|126|(1:128)(1:212)|129|(1:211)(2:133|(0))|135|(1:138)|(1:140)|(1:142)|143|(18:145|(3:149|(1:151)|152)|153|(2:155|(3:157|(4:160|(3:520|162|(1:537)(13:518|166|503|167|505|168|(1:173)(3:172|497|174)|175|(1:177)|178|(1:189)|190|538))(3:515|191|(5:521|200|(1:202)(1:210)|203|(1:531)(3:527|209|532))(3:524|195|(1:534)(3:523|199|535)))|528|158)|517))|(1:215)|216|(1:218)|219|(2:227|(3:235|(1:239)|240))|241|(4:245|(1:247)(1:254)|248|(11:499|255|(1:263)(1:259)|260|(2:262|264)|265|(1:274)|275|(1:281)|282|(3:286|(1:290)|291)))|292|(3:294|(5:296|(1:298)(1:328)|299|(1:301)(1:327)|302)(1:329)|303)|304|(1:307)|308|(5:312|(1:314)|315|(1:317)|318)|319)|320|(1:324)|(2:493|330)|333|(32:335|(1:337)|(27:478|(0)(2:481|(6:349|(1:351)(2:484|(0)(2:487|(2:355|(1:357))(0)))|352|(1:354)(0)|355|(0))(0))|358|(2:362|(1:364)(1:477))(0)|365|(12:367|(1:369)|370|(1:372)|373|(1:375)|376|(1:378)|379|(1:381)|382|(1:385))(1:476)|386|(2:390|(2:392|(1:394)))(0)|395|(1:399)|400|(1:402)(1:475)|403|(3:405|(1:407)|408)|(10:468|(0)(2:471|(2:416|(1:474)(1:420))(0))|421|(5:439|(3:441|(1:443)(2:463|(1:465)(1:466))|444)(1:467)|(2:446|(1:460)(3:450|(1:457)(1:459)|458))(1:461)|462|(4:452|455|457|458)(3:455|457|458))(3:425|(1:427)(1:438)|428)|429|(1:431)(1:437)|432|(1:434)|435|436)(1:412)|413|(1:415)(0)|416|(2:418|474)(0)|421|(5:439|(0)(0)|(0)(0)|462|(0)(0))(0)|429|(0)(0)|432|(0)|435|436)(1:345)|346|(1:348)(0)|349|(0)(0)|352|(0)(0)|355|(0)|358|(3:360|362|(0)(0))(0)|365|(0)(0)|386|(3:388|390|(0))(0)|395|(2:397|399)(0)|400|(0)(0)|403|(0)|(3:410|468|(0)(4:413|(0)(0)|416|(0)(0)))(0)|421|(0)(0)|429|(0)(0)|432|(0)|435|436)(1:490)|338|(1:341)|(3:343|478|(0)(8:346|(0)(0)|349|(0)(0)|352|(0)(0)|355|(0)))(0)|358|(0)(0)|365|(0)(0)|386|(0)(0)|395|(0)(0)|400|(0)(0)|403|(0)|(0)(0)|421|(0)(0)|429|(0)(0)|432|(0)|435|436)(1:65)|66|(0)(1:70)|71|495|86|(0)(0)|89|(0)|511|(2:117|213)(0)|121|(2:123|125)(0)|126|(0)(0)|129|(2:131|211)(0)|135|(1:138)|(0)|(0)|143|(0)|320|(2:322|324)(0)|(0)|333|(0)(0)|338|(1:341)|(0)(0)|358|(0)(0)|365|(0)(0)|386|(0)(0)|395|(0)(0)|400|(0)(0)|403|(0)|(0)(0)|421|(0)(0)|429|(0)(0)|432|(0)|435|436) */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cd, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01ce, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2);
        r24 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x05e9 A[PHI: r17 r22 r23 r37
      0x05e9: PHI (r17v3 java.lang.Boolean) = (r17v1 java.lang.Boolean), (r17v4 java.lang.Boolean) binds: [B:488:0x0867, B:356:0x05e7] A[DONT_GENERATE, DONT_INLINE]
      0x05e9: PHI (r22v4 java.lang.Float) = (r22v2 java.lang.Float), (r22v5 java.lang.Float) binds: [B:488:0x0867, B:356:0x05e7] A[DONT_GENERATE, DONT_INLINE]
      0x05e9: PHI (r23v5 java.lang.Float) = (r23v3 java.lang.Float), (r23v6 java.lang.Float) binds: [B:488:0x0867, B:356:0x05e7] A[DONT_GENERATE, DONT_INLINE]
      0x05e9: PHI (r37v2 boolean) = (r37v0 boolean), (r37v3 boolean) binds: [B:488:0x0867, B:356:0x05e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0672 A[PHI: r6
      0x0672: PHI (r6v18 java.lang.String) = (r6v2 java.lang.String), (r6v19 java.lang.String) binds: [B:391:0x0670, B:389:0x066d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:397:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x06ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x07bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:461:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x082f A[PHI: r54
      0x082f: PHI (r54v1 boolean) = (r54v0 boolean), (r54v5 boolean) binds: [B:469:0x082b, B:414:0x06cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0835 A[PHI: r54 r55
      0x0835: PHI (r54v2 boolean) = (r54v1 boolean), (r54v4 boolean), (r54v4 boolean) binds: [B:472:0x0831, B:417:0x06d7, B:419:0x06dd] A[DONT_GENERATE, DONT_INLINE]
      0x0835: PHI (r55v1 java.lang.Integer) = (r55v0 java.lang.Integer), (r55v3 java.lang.Integer), (r55v3 java.lang.Integer) binds: [B:472:0x0831, B:417:0x06d7, B:419:0x06dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x084b A[PHI: r12
      0x084b: PHI (r12v3 java.lang.String) = (r12v1 java.lang.String), (r12v4 java.lang.String) binds: [B:363:0x05f7, B:361:0x05f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0859 A[PHI: r23
      0x0859: PHI (r23v1 java.lang.Float) = (r23v0 java.lang.Float), (r23v9 java.lang.Float) binds: [B:479:0x0855, B:347:0x05bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:484:0x085f A[PHI: r22 r23
      0x085f: PHI (r22v1 java.lang.Float) = (r22v0 java.lang.Float), (r22v7 java.lang.Float) binds: [B:482:0x085b, B:350:0x05cb] A[DONT_GENERATE, DONT_INLINE]
      0x085f: PHI (r23v2 java.lang.Float) = (r23v1 java.lang.Float), (r23v8 java.lang.Float) binds: [B:482:0x085b, B:350:0x05cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0865 A[PHI: r17 r22 r23
      0x0865: PHI (r17v1 java.lang.Boolean) = (r17v0 java.lang.Boolean), (r17v5 java.lang.Boolean) binds: [B:485:0x0861, B:353:0x05db] A[DONT_GENERATE, DONT_INLINE]
      0x0865: PHI (r22v2 java.lang.Float) = (r22v1 java.lang.Float), (r22v6 java.lang.Float) binds: [B:485:0x0861, B:353:0x05db] A[DONT_GENERATE, DONT_INLINE]
      0x0865: PHI (r23v3 java.lang.Float) = (r23v2 java.lang.Float), (r23v7 java.lang.Float) binds: [B:485:0x0861, B:353:0x05db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:490:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0571 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0141 A[PHI: r32
      0x0141: PHI (r32v1 boolean) = (r32v0 boolean), (r32v4 boolean), (r32v4 boolean) binds: [B:73:0x013e, B:67:0x0129, B:69:0x012f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0167 A[Catch: Exception -> 0x01cd, TryCatch #2 {Exception -> 0x01cd, blocks: (B:86:0x0163, B:88:0x0167, B:89:0x016d, B:92:0x017e, B:93:0x0186, B:94:0x018f, B:96:0x0195, B:100:0x01a5, B:101:0x01af, B:104:0x01b8, B:106:0x01bc, B:113:0x01ca, B:99:0x019b, B:112:0x01c7), top: B:495:0x0163 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017e A[Catch: Exception -> 0x01cd, TRY_LEAVE, TryCatch #2 {Exception -> 0x01cd, blocks: (B:86:0x0163, B:88:0x0167, B:89:0x016d, B:92:0x017e, B:93:0x0186, B:94:0x018f, B:96:0x0195, B:100:0x01a5, B:101:0x01af, B:104:0x01b8, B:106:0x01bc, B:113:0x01ca, B:99:0x019b, B:112:0x01c7), top: B:495:0x0163 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(com.bytedance.router.RouteIntent r63, java.lang.String r64, java.lang.Integer r65, X.C19EG r66) {
        /*
            Method dump skipped, instruction units count: 2158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1017503yP.LIZJ(com.bytedance.router.RouteIntent, java.lang.String, java.lang.Integer, X.19EG):void");
    }
}
