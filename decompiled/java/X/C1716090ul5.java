package X;

import android.graphics.Bitmap;
import android.util.Base64;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.a0;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0ul5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1716090ul5 extends AbstractC1716120ul8 {
    public final int LLILLL = 1;

    /* JADX WARN: Multi-variable type inference failed */
    public static String LIZJ(String str) {
        char[] cArrLLFFF;
        Object obj;
        Object c098200Yq;
        char[] charArray;
        boolean z;
        T t = 0;
        if (str != null && (charArray = str.toCharArray()) != null) {
            ArrayList arrayList = new ArrayList();
            for (char c : charArray) {
                if ('0' <= c && c < ':') {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(Character.valueOf(c));
                }
            }
            cArrLLFFF = C13LP.LLFFF(arrayList);
        } else {
            cArrLLFFF = null;
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        C259800zU c259800zU2 = new C259800zU();
        c259800zU2.element = "";
        if (cArrLLFFF != null) {
            String str2 = new String(cArrLLFFF);
            try {
                String strLJJLIIIJLLLLLLLZ = a0.LJJLIIIJLLLLLLLZ(str2, new IntRange(0, 1));
                C189200o6.m2constructorimpl(strLJJLIIIJLLLLLLLZ);
                obj = strLJJLIIIJLLLLLLLZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq2 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq2);
                obj = c098200Yq2;
            }
            boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
            T t2 = obj;
            if (zM7isFailureimpl) {
                t2 = 0;
            }
            c259800zU.element = t2;
            try {
                c098200Yq = str2.substring(2, Math.min(str2.length(), 4));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                t = c098200Yq;
            }
            c259800zU2.element = t;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) c259800zU.element);
        sbLIZ.append('/');
        sbLIZ.append((String) c259800zU2.element);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static InterfaceC1716140ulA LIZLLL(C1715400ujy c1715400ujy) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        String strLJ = LJ(c1715400ujy.LJ);
        String strLJ2 = LJ(c1715400ujy.LJFF);
        boolean z = true;
        if (c1715400ujy.LJIIIZ != null) {
            boolValueOf = Boolean.valueOf(!r0.booleanValue());
        } else {
            boolValueOf = null;
        }
        if (c1715400ujy.LJIIJJI != null) {
            boolValueOf2 = Boolean.valueOf(!r0.booleanValue());
        } else {
            boolValueOf2 = null;
        }
        if (strLJ == null && strLJ2 == null && boolValueOf == null && boolValueOf2 == null) {
            return null;
        }
        InterfaceC1716140ulA interfaceC1716140ulA = (InterfaceC1716140ulA) C1909107dp.LIZJ(InterfaceC1716140ulA.class, null);
        interfaceC1716140ulA.setBackImage(strLJ);
        interfaceC1716140ulA.setBackImageMasked(strLJ2);
        if (boolValueOf == null) {
            boolValueOf = Boolean.FALSE;
        }
        interfaceC1716140ulA.setPhotocopy(boolValueOf);
        interfaceC1716140ulA.setPhotocopyScore(c1715400ujy.LJIILJJIL);
        if (boolValueOf2 == null) {
            boolValueOf2 = Boolean.FALSE;
        }
        interfaceC1716140ulA.setScreen(boolValueOf2);
        interfaceC1716140ulA.setScreenScore(c1715400ujy.LJIILLIIL);
        Boolean boolValueOf3 = c1715400ujy.LJIIL;
        if (boolValueOf3 == null) {
            Boolean boolIsPhotocopy = interfaceC1716140ulA.isPhotocopy();
            Boolean bool = Boolean.TRUE;
            if (!Intrinsics.LJFF(boolIsPhotocopy, bool) && !Intrinsics.LJFF(interfaceC1716140ulA.isScreen(), bool)) {
                z = false;
            }
            boolValueOf3 = Boolean.valueOf(z);
        }
        interfaceC1716140ulA.setFraud(boolValueOf3);
        return interfaceC1716140ulA;
    }

    public static String LJ(Bitmap bitmap) {
        Object c098200Yq;
        Object obj = null;
        if (bitmap == null) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
            c098200Yq = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    public static InterfaceC1716150ulB LJFF(C1715400ujy c1715400ujy) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        String strLJ = LJ(c1715400ujy.LIZIZ);
        String strLJ2 = LJ(c1715400ujy.LIZJ);
        boolean z = true;
        if (c1715400ujy.LJIIIIZZ != null) {
            boolValueOf = Boolean.valueOf(!r0.booleanValue());
        } else {
            boolValueOf = null;
        }
        if (c1715400ujy.LJIIJ != null) {
            boolValueOf2 = Boolean.valueOf(!r0.booleanValue());
        } else {
            boolValueOf2 = null;
        }
        if (strLJ == null && strLJ2 == null && boolValueOf == null && boolValueOf2 == null) {
            return null;
        }
        InterfaceC1716150ulB interfaceC1716150ulB = (InterfaceC1716150ulB) C1909107dp.LIZJ(InterfaceC1716150ulB.class, null);
        interfaceC1716150ulB.setFrontImage(strLJ);
        interfaceC1716150ulB.setFrontImageMasked(strLJ2);
        if (boolValueOf == null) {
            boolValueOf = Boolean.FALSE;
        }
        interfaceC1716150ulB.setPhotocopy(boolValueOf);
        interfaceC1716150ulB.setPhotocopyScore(c1715400ujy.LJIILIIL);
        if (boolValueOf2 == null) {
            boolValueOf2 = Boolean.FALSE;
        }
        interfaceC1716150ulB.setScreen(boolValueOf2);
        interfaceC1716150ulB.setScreenScore(c1715400ujy.LJIILL);
        Boolean boolValueOf3 = c1715400ujy.LJIIL;
        if (boolValueOf3 == null) {
            Boolean boolIsPhotocopy = interfaceC1716150ulB.isPhotocopy();
            Boolean bool = Boolean.TRUE;
            if (!Intrinsics.LJFF(boolIsPhotocopy, bool) && !Intrinsics.LJFF(interfaceC1716150ulB.isScreen(), bool)) {
                z = false;
            }
            boolValueOf3 = Boolean.valueOf(z);
        }
        interfaceC1716150ulB.setFraud(boolValueOf3);
        return interfaceC1716150ulB;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1723850uxb LJII(X.InterfaceC1716110ul7 r14) {
        /*
            java.lang.String r1 = r14.getCategory()
            java.lang.String r0 = "fraud"
            r9 = 1
            boolean r5 = kotlin.text.u.LJIJI(r1, r0, r9)
            X.0uxb r3 = new X.0uxb
            r0 = 2
            int[] r4 = new int[r0]
            r4 = {x0058: FILL_ARRAY_DATA , data: [1, 2} // fill-array
            java.lang.String r1 = r14.getScanScope()
            java.lang.String r0 = "double_side"
            boolean r6 = kotlin.text.u.LJIJI(r1, r0, r9)
            r7 = 0
            java.lang.Boolean r1 = r14.getGalleryUpload()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r8 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            java.lang.Boolean r0 = r14.getShowSecurityTips()
            if (r0 == 0) goto L32
            boolean r9 = r0.booleanValue()
        L32:
            java.lang.Number r0 = r14.getTimeout()
            if (r0 == 0) goto L53
            long r1 = r0.longValue()
            r10 = 1
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 >= 0) goto L55
        L42:
            if (r5 == 0) goto L50
            X.0ukG r12 = X.EnumC1715580ukG.DARK
        L46:
            java.lang.String r13 = r14.getEnterFrom()
            r14 = 512(0x200, float:7.17E-43)
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r13, r14)
            return r3
        L50:
            X.0ukG r12 = X.EnumC1715580ukG.TRANSPARENT
            goto L46
        L53:
            r1 = 60
        L55:
            r10 = r1
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1716090ul5.LJII(X.0ul7):X.0uxb");
    }

    public static void LJIIIIZZ(String str, String str2, String str3) throws JSONException {
        new C1716050ul1(null).LIZIZ("rd_pipo_ocr_jsb_call", new C0TIT(str3, str, str2));
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) throws JSONException {
        Object c098200Yq;
        final InterfaceC1716110ul7 interfaceC1716110ul7 = (InterfaceC1716110ul7) xBaseParamModel;
        LJIIIIZZ("start", null, interfaceC1716110ul7.getEnterFrom());
        try {
            IPipoCcdcService iPipoCcdcService = (IPipoCcdcService) PluggableExtentionKt.pluggableSpi$default(IPipoCcdcService.class, false, false, false, 14, null);
            if (iPipoCcdcService != null && iPipoCcdcService.LJIIIZ(interfaceC1716110ul7.getEnterFrom())) {
                iPipoCcdcService.LIZIZ(LJII(interfaceC1716110ul7), new InterfaceC1722230uuz() { // from class: X.0ul6
                    @Override // X.InterfaceC1722230uuz
                    public final void LIZ(int i, int i2, String str, C1715400ujy c1715400ujy, String str2) throws JSONException {
                        Object c098200Yq2;
                        CompletionBlock<InterfaceC1716130ul9> completionBlock2 = completionBlock;
                        C1716090ul5 c1716090ul5 = this;
                        String enterFrom = interfaceC1716110ul7.getEnterFrom();
                        c1716090ul5.getClass();
                        InterfaceC1716130ul9 interfaceC1716130ul9 = (InterfaceC1716130ul9) C1909107dp.LIZJ(InterfaceC1716130ul9.class, null);
                        try {
                            if (Intrinsics.LJFF(str2, "gallery_select")) {
                                interfaceC1716130ul9.setOutcome("AlbumUpload");
                                C1716090ul5.LJIIIIZZ("album_upload", null, enterFrom);
                            } else if (Intrinsics.LJFF(str, "Timeout")) {
                                interfaceC1716130ul9.setOutcome("Timeout");
                                C1716090ul5.LJIIIIZZ("fail", "timeout", enterFrom);
                            } else if (i2 == 104) {
                                interfaceC1716130ul9.setOutcome("NoCameraAccess");
                                C1716090ul5.LJIIIIZZ("fail", "no_camera_access", enterFrom);
                            } else if (i == c1716090ul5.LLILLL && c1715400ujy != null) {
                                String str3 = c1715400ujy.LIZ;
                                if (str3 == null) {
                                    str3 = c1715400ujy.LJII;
                                }
                                interfaceC1716130ul9.setCardNumber(str3);
                                interfaceC1716130ul9.setExpireDate(C1716090ul5.LIZJ(c1715400ujy.LJI));
                                interfaceC1716130ul9.setCardholderName(c1715400ujy.LIZLLL);
                                interfaceC1716130ul9.setFrontCard(C1716090ul5.LJFF(c1715400ujy));
                                interfaceC1716130ul9.setBackCard(C1716090ul5.LIZLLL(c1715400ujy));
                                interfaceC1716130ul9.setOutcome("Success");
                                C1716090ul5.LJIIIIZZ("success", null, enterFrom);
                            } else {
                                interfaceC1716130ul9.setOutcome("UserCancel");
                                C1716090ul5.LJIIIIZZ("fail", "user_cancel_or_error", enterFrom);
                            }
                            c098200Yq2 = Unit.LIZ;
                            C189200o6.m2constructorimpl(c098200Yq2);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq2 = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        }
                        if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) != null) {
                            interfaceC1716130ul9.setCardNumber("");
                            interfaceC1716130ul9.setExpireDate("");
                            interfaceC1716130ul9.setCardholderName("");
                            interfaceC1716130ul9.setOutcome("UserCancel");
                            C1716090ul5.LJIIIIZZ("fail", "exception_in_callback", enterFrom);
                        }
                        completionBlock2.onSuccess(interfaceC1716130ul9, "");
                    }
                }, null);
            } else {
                LJIIIIZZ("fail", "ocr_not_supported", interfaceC1716110ul7.getEnterFrom());
                C2382909Vj.LIZ(completionBlock, 0, "entrance ocr_not_supported", null, 4);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exception: ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            LJIIIIZZ("fail", C2188811AlT.LIZIZ(sbLIZ), interfaceC1716110ul7.getEnterFrom());
            C2382909Vj.LIZ(completionBlock, 0, C1717770unn.LIZJ().getApplicationContext().getString(2131834217), null, 4);
        }
    }
}
