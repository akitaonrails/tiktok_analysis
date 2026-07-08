package X;

import android.net.Uri;
import com.tiktok.forestx.RequestParamsX;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS567S0100000_23;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0q7f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1537890q7f {
    public static final C1537890q7f LIZ = new C1537890q7f();
    public static final Map<String, String> LIZIZ = new LinkedHashMap();

    public static EnumC1533980q1M LIZLLL(EnumC1299880jvm enumC1299880jvm) {
        switch (C1299890jvn.LIZ[enumC1299880jvm.ordinal()]) {
            case 1:
                return EnumC1533980q1M.LYNX_TEMPLATE;
            case 2:
                return EnumC1533980q1M.LYNX_IMAGE;
            case 3:
                return EnumC1533980q1M.LYNX_FONT;
            case 4:
                return EnumC1533980q1M.LYNX_SVG;
            case 5:
                return EnumC1533980q1M.LYNX_VIDEO;
            case 6:
                return EnumC1533980q1M.LYNX_EXTERNAL_JS;
            case 7:
                return EnumC1533980q1M.LYNX_LOTTIE;
            case 8:
                return EnumC1533980q1M.LYNX_COMPONENT;
            case BdTuring.TYPE_ECAF /* 9 */:
                return EnumC1533980q1M.LYNX_I18N;
            default:
                return EnumC1533980q1M.LYNX_CHILD_RESOURCE;
        }
    }

    public static String LIZIZ(C1537480q70 c1537480q70, String str) {
        Uri uriLIZ;
        if (str.length() == 0) {
            InterfaceC1531560pxS interfaceC1531560pxS = c1537480q70.hybridParams;
            if (interfaceC1531560pxS != null && (uriLIZ = interfaceC1531560pxS.LIZ()) != null) {
                return uriLIZ.toString();
            }
            return null;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x02c8 A[PHI: r14
      0x02c8: PHI (r14v6 X.0Q8l) = (r14v5 X.0Q8l), (r14v4 X.0Q8l), (r14v3 X.0Q8l) binds: [B:147:0x02e6, B:142:0x02d7, B:137:0x02c6] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1309760kBi LIZJ(X.C1537910q7h r38, final X.C1537480q70 r39, android.content.Context r40, java.lang.String r41) {
        /*
            Method dump skipped, instruction units count: 1155
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1537890q7f.LIZJ(X.0q7h, X.0q70, android.content.Context, java.lang.String):X.0kBi");
    }

    public static void LIZ(C1537480q70 c1537480q70, C1301600jyY c1301600jyY, InterfaceC1290540jgi interfaceC1290540jgi, RequestParamsX requestParamsX, Function1 function1) {
        int i;
        C1532310pyf c1532310pyfLIZ;
        C1533020pzo c1533020pzoLJIILJJIL = C1537480q70.LJIILJJIL(c1537480q70, true, null, 2);
        if (c1533020pzoLJIILJJIL == null) {
            if (interfaceC1290540jgi != null) {
                interfaceC1290540jgi.LIZ(C1289590jfB.LIZ(new Exception("resource service is null")));
                return;
            }
            return;
        }
        JSONArray jSONArray = C1533710q0v.LIZ;
        String strLIZLLL = C1533710q0v.LIZLLL(null, requestParamsX, c1301600jyY.LIZ);
        EnumC1533980q1M enumC1533980q1M = requestParamsX.resourceScene;
        if (enumC1533980q1M == EnumC1533980q1M.LYNX_COMPONENT || enumC1533980q1M == EnumC1533980q1M.LYNX_TEMPLATE) {
            requestParamsX.cacheFreshTime = Long.MAX_VALUE;
        }
        C1533720q0w c1533720q0w = C1533720q0w.LIZ;
        C1533760q10 c1533760q10 = c1537480q70.mainDocumentGeckoInfo;
        c1533720q0w.getClass();
        C1533510q0b c1533510q0bLIZJ = C1533720q0w.LIZJ(strLIZLLL, c1533760q10);
        if (c1533510q0bLIZJ != null) {
            requestParamsX.channel = c1533510q0bLIZJ.LIZIZ;
            requestParamsX.bundle = c1533510q0bLIZJ.LIZJ;
            requestParamsX.accessKey = c1533510q0bLIZJ.LIZ;
            requestParamsX.setGeckoSource(EnumC1507260pKG.SPARK_MANIFEST);
        }
        EnumC1299900jvo enumC1299900jvo = c1301600jyY.LIZJ;
        if (enumC1299900jvo == null) {
            i = -1;
        } else {
            i = C1299890jvn.LIZIZ[enumC1299900jvo.ordinal()];
            if (i == 1) {
                C1532970pzj c1532970pzjLIZIZ = c1533020pzoLJIILJJIL.LIZIZ(strLIZLLL, requestParamsX);
                if (c1532970pzjLIZIZ != null && (c1532310pyfLIZ = c1532970pzjLIZIZ.LIZ()) != null) {
                    if (!c1532310pyfLIZ.isSuccess()) {
                        if (interfaceC1290540jgi != null) {
                            interfaceC1290540jgi.LIZ(C1289590jfB.LIZ(new Exception(c1532310pyfLIZ.LIZJ.LIZJ())));
                            return;
                        }
                        return;
                    } else {
                        C1289590jfB c1289590jfB = (C1289590jfB) function1.invoke(c1532310pyfLIZ);
                        if (interfaceC1290540jgi == null) {
                            return;
                        }
                        interfaceC1290540jgi.LIZ(c1289590jfB);
                        return;
                    }
                }
                if (interfaceC1290540jgi != null) {
                    interfaceC1290540jgi.LIZ(C1289590jfB.LIZ(new Exception("response is null")));
                    return;
                }
                return;
            }
        }
        if (i != 2) {
            if (c1533020pzoLJIILJJIL.LIZ(strLIZLLL, requestParamsX, new C1538080q7y(interfaceC1290540jgi, function1)) == null && interfaceC1290540jgi != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cannot fetch resource for ");
                sbLIZ.append(c1301600jyY.LIZ);
                interfaceC1290540jgi.LIZ(C1289590jfB.LIZ(new Exception(C2188811AlT.LIZIZ(sbLIZ))));
                return;
            }
            return;
        }
        C1538040q7u c1538040q7u = new C1538040q7u(interfaceC1290540jgi, function1);
        String str = c1533020pzoLJIILJJIL.LJIIIZ;
        if (str != null) {
            String str2 = requestParamsX.accessKey;
            if (str2 != null) {
                str = str2;
            }
            requestParamsX.accessKey = str;
        }
        C1541080qCo c1541080qCoLIZLLL = c1533020pzoLJIILJJIL.LIZLLL(new C1532900pzc(c1533020pzoLJIILJJIL.LJIIIIZZ, strLIZLLL, requestParamsX, true), c1533020pzoLJIILJJIL.LJIIJJI, requestParamsX.source, null, null, c1538040q7u);
        if (c1541080qCoLIZLLL != null) {
            C1532960pzi.LJ(new AwS567S0100000_23(c1541080qCoLIZLLL, (C1541080qCo<C1532310pyf>) 224));
            return;
        }
        c1538040q7u.invoke(C1532950pzh.LJFF.getValue());
        if (interfaceC1290540jgi == null) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("cannot fetch resource for ");
        sbLIZ2.append(c1301600jyY.LIZ);
        interfaceC1290540jgi.LIZ(C1289590jfB.LIZ(new Exception(C2188811AlT.LIZIZ(sbLIZ2))));
    }
}
