package X;

import android.content.Context;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.pipo.settings.PipoStandaloneContainerLoadingConfigSettings;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS592S0100000_13;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uzl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1725190uzl extends AbstractC1538690q8x {
    public DialogC1389650mGZ LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(510));

    @Override // X.AbstractC1538690q8x
    public String LJI() {
        return "pipo_hybrid";
    }

    public static void LJII(SparkContext sparkContext) {
        C1537510q73 c1537510q73 = sparkContext.extraRuntimeInfo;
        for (Map.Entry entry : ((LinkedHashMap) C2097608Jq.LJIIJ(new Pair("priority_region", C1717770unn.LJIIIIZZ().getCurrentRegionCode()))).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (c1537510q73 == null || !c1537510q73.containsKey((Object) str)) {
                sparkContext.LJJLIIIJ(value, str);
            }
        }
        C1717770unn.LIZJ().isOffline();
    }

    public static Map LJIIIIZZ(SparkContext sparkContext) {
        boolean z;
        String str;
        int iLJIIJJI = C12ES.LJIIJJI(C1717770unn.LIZJ().getApplicationContext());
        EnumC1540340qBc enumC1540340qBcLJIIZILJ = null;
        if (sparkContext != null) {
            enumC1540340qBcLJIIZILJ = sparkContext.LJIIZILJ(null);
        }
        if (enumC1540340qBcLJIIZILJ == EnumC1540340qBc.DARK) {
            z = true;
        } else {
            z = false;
        }
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("__status_bar_height", String.valueOf(iLJIIJJI));
        if (z) {
            str = "dark";
        } else {
            str = "light";
        }
        pairArr[1] = new Pair("__app_theme", str);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public static String LJIIIZ(JSONObject jSONObject) {
        Object c098200Yq;
        if (jSONObject != null) {
            try {
                c098200Yq = C09RB.LJIILLIIL(C09R4.LIZIZ(jSONObject.keys()), "&", null, null, new AwS592S0100000_13(jSONObject, 101), 30);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = "";
            }
            String str = (String) c098200Yq;
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    public static void LJIILJJIL(SparkContext sparkContext) {
        InterfaceC2217701Bqy interfaceC2217701Bqy;
        C1725300uzw c1725300uzw;
        C1545810qKR c1545810qKR;
        List<InterfaceC2217701Bqy> list;
        InterfaceC2217701Bqy next;
        if (sparkContext != null && (c1545810qKR = (C1545810qKR) sparkContext.LJFF(C1545810qKR.class)) != null && (list = c1545810qKR.LL) != null) {
            Iterator<InterfaceC2217701Bqy> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next instanceof C1725300uzw) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            interfaceC2217701Bqy = next;
        } else {
            interfaceC2217701Bqy = null;
        }
        if ((interfaceC2217701Bqy instanceof C1725300uzw) && (c1725300uzw = (C1725300uzw) interfaceC2217701Bqy) != null) {
            c1725300uzw.LLJIJIL = true;
        }
    }

    public static SpannableString LJIIJ(Context context, String str) {
        int iIntValue;
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("  ");
        sbLIZ.append(str);
        SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
        if (context != null) {
            TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(context, R.raw.icon_lock_fill);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(11.0f)));
            tuxIconDrawable.setBounds(0, 0, iLIZIZ, iLIZIZ);
            tuxIconDrawable.LJFF(iIntValue);
            if (Build.VERSION.SDK_INT >= 29) {
                i = 2;
            } else {
                i = 0;
            }
            C786410Ut5.p2(spannableString, new ImageSpan(tuxIconDrawable, i), 0, 1, 17);
        }
        return spannableString;
    }

    @Override // X.AbstractC1538690q8x
    public void LJ(SparkContext sparkContext, String str) {
        super.LJ(sparkContext, str);
        LJIIL(sparkContext, str);
    }

    @Override // X.AbstractC1538690q8x
    public void LJFF(SparkContext sparkContext, String str) {
        super.LJFF(sparkContext, str);
        LJIIL(sparkContext, str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(30:0|2|(1:5)|6|(1:8)|9|(1:11)(1:33)|12|(22:14|(0)|18|(1:30)(3:(1:21)(1:29)|22|(1:26)(0))|(1:28)|267|34|(1:36)|42|(2:274|44)|47|(1:49)(1:53)|50|(1:52)(1:54)|269|55|271|(2:57|(3:(2:60|62)(1:61)|63|(4:65|66|(1:70)|71))(2:72|(3:(2:75|77)(1:76)|78|(1:80))(2:81|(3:(2:84|86)(1:85)|87|(1:91)))))(0)|96|(1:98)(2:105|(6:107|(1:109)(1:185)|110|(1:112)(1:184)|113|(3:183|159|(4:161|263|186|(17:261|188|259|189|272|190|265|191|(1:196)(2:195|197)|198|(1:200)(1:201)|(1:205)|(1:209)|(1:219)(8:(1:216)|221|(1:226)(1:225)|227|(1:229)(1:230)|(2:232|234)(1:233)|235|(6:237|(1:239)|240|(4:243|(3:320|245|323)(1:322)|321|241)|319|246)(1:257))|220|221|(7:223|226|227|(0)(0)|(0)(0)|235|(0)(0))(0))(0))(1:258))(6:117|(4:120|(1:297)(5:280|127|(1:129)(1:182)|130|(1:300)(4:283|136|(4:139|(1:309)(3:305|141|(3:307|143|(3:284|145|(2:176|(3:289|156|(2:288|158)(1:304))(4:287|162|(1:291)(3:166|(3:169|(2:318|316)|167)|292)|158))(5:149|(3:152|(2:313|154)(1:314)|150)|312|176|(0)(0)))(1:311))(5:306|177|(2:179|(1:286)(1:310))(1:285)|145|(3:147|176|(0)(0))(0)))|308|137)|301))|293|118)|276|183|159|(0)(0)))(0))|99|(1:325)(2:103|104))(1:31)|32|18|(0)(0)|(0)|267|34|(0)|42|(0)|47|(0)(0)|50|(0)(0)|269|55|271|(0)(0)|96|(0)(0)|99|(2:101|325)(1:324)) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e8, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e9, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
        X.C1AF0.LJ(r3);
        r4 = r3.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f3, code lost:
    
        if (r4 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f5, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f7, code lost:
    
        X.C1725270uzt.LJFF("207", r4, r11, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x021b, code lost:
    
        r3 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x021d, code lost:
    
        r3 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x021e, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
        X.C1AF0.LJ(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0101 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3 A[Catch: all -> 0x00e8, TRY_LEAVE, TryCatch #4 {all -> 0x00e8, blocks: (B:34:0x00c2, B:36:0x00d3), top: B:267:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0137 A[Catch: all -> 0x021b, TryCatch #5 {all -> 0x021b, blocks: (B:55:0x012f, B:57:0x0137, B:62:0x014c, B:63:0x0151, B:65:0x015b), top: B:269:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a3 A[Catch: all -> 0x021d, TryCatch #6 {all -> 0x021d, blocks: (B:68:0x0163, B:71:0x016c, B:72:0x01a3, B:77:0x01b0, B:78:0x01b5, B:80:0x01bf, B:81:0x01d3, B:86:0x01e8, B:87:0x01ee, B:89:0x01f4, B:91:0x0202), top: B:271:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x022e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(final com.bytedance.hybrid.spark.SparkContext r42, java.lang.String r43) {
        /*
            Method dump skipped, instruction units count: 1543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1725190uzl.LJIIL(com.bytedance.hybrid.spark.SparkContext, java.lang.String):void");
    }

    public static void LJIIJJI(C1725190uzl c1725190uzl, boolean z, String str, int i) {
        DialogC1389650mGZ dialogC1389650mGZ;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        c1725190uzl.getClass();
        try {
            if (Intrinsics.LJFF(((PipoStandaloneContainerLoadingConfigSettings.PipoStandaloneContainerLoadingConfigModel) PipoStandaloneContainerLoadingConfigSettings.LIZIZ.getValue()).enableLoading, Boolean.TRUE) && (dialogC1389650mGZ = c1725190uzl.LIZIZ) != null && dialogC1389650mGZ.isShowing()) {
                if (z || PipoStandaloneContainerLoadingConfigSettings.LIZ(str)) {
                    DialogC1389650mGZ dialogC1389650mGZ2 = c1725190uzl.LIZIZ;
                    if (dialogC1389650mGZ2 != null) {
                        dialogC1389650mGZ2.dismiss();
                        C785410UrT.LIZ(dialogC1389650mGZ2);
                    }
                    c1725190uzl.LIZIZ = null;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013e A[Catch: all -> 0x0172, TRY_LEAVE, TryCatch #1 {all -> 0x0172, blocks: (B:35:0x007f, B:40:0x008a, B:42:0x0090, B:43:0x0096, B:47:0x009f, B:48:0x00a3, B:53:0x00be, B:54:0x00c4, B:56:0x00ce, B:87:0x0133, B:89:0x013e, B:80:0x011b, B:86:0x012f, B:32:0x0071, B:34:0x0079), top: B:150:0x0071 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILIIL(android.webkit.WebView r18, com.bytedance.hybrid.spark.SparkContext r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1725190uzl.LJIILIIL(android.webkit.WebView, com.bytedance.hybrid.spark.SparkContext, java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }
}
