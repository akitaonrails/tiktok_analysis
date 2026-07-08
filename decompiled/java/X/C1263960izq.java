package X;

import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.ExternalRecommendReasonStruct;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS42S2100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0izq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1263960izq {
    public static final C1263960izq LIZ = new C1263960izq();
    public static final LruCache<String, String> LIZIZ = new LruCache<>(100);

    public static boolean LIZIZ(String str) {
        if (str.length() == 0) {
            return false;
        }
        if (Intrinsics.LJFF(str, "1-1") || Intrinsics.LJFF(str, "1-2")) {
            return true;
        }
        return false;
    }

    public static String LIZ(int i, int i2, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('-');
        sbLIZ.append(str2);
        sbLIZ.append('-');
        sbLIZ.append(i);
        sbLIZ.append('-');
        sbLIZ.append(i2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJFF(final TuxTextView tuxTextView, final String str, final String str2, final String str3) {
        Integer num;
        Object tag = tuxTextView.getTag(R.id.xrn);
        Integer numValueOf = null;
        if (tag instanceof Integer) {
            num = (Integer) tag;
        } else {
            num = null;
        }
        if (num == null) {
            if (tuxTextView.getMaxWidth() != Integer.MAX_VALUE) {
                C1263960izq c1263960izq = LIZ;
                int maxWidth = tuxTextView.getMaxWidth();
                c1263960izq.getClass();
                if (tuxTextView.getMaxLines() != 1) {
                    maxWidth = (tuxTextView.getMaxLines() * maxWidth) - (maxWidth / 2);
                }
                numValueOf = Integer.valueOf(maxWidth);
            }
            num = numValueOf;
        }
        if (num != null && num.intValue() > 0 && num.intValue() < Integer.MAX_VALUE) {
            String strLIZ = LIZ(num.intValue(), tuxTextView.getMaxLines(), str, str2);
            String str4 = LIZIZ.get(strLIZ);
            if (str4 != null && str4.length() != 0) {
                tuxTextView.setText(str4);
                return;
            } else {
                LIZJ(str, str2, tuxTextView.getPaint(), num.intValue(), new AwS42S2100000_19(tuxTextView, str3, strLIZ, 4));
                return;
            }
        }
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setText(C786410Ut5.j4(str2, Arrays.copyOf(new Object[]{str}, 1)));
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(tuxTextView, new Runnable() { // from class: X.0izr
            public final void LIZ() {
                C1263960izq c1263960izq2 = C1263960izq.LIZ;
                TuxTextView tuxTextView2 = tuxTextView;
                c1263960izq2.getClass();
                Layout layout = tuxTextView2.getLayout();
                if (layout == null || layout.getEllipsisCount(layout.getLineCount() - 1) <= 0) {
                    return;
                }
                try {
                    TuxTextView tuxTextView3 = tuxTextView;
                    int width = tuxTextView3.getWidth();
                    if (tuxTextView3.getMaxLines() != 1) {
                        width = (tuxTextView3.getMaxLines() * width) - (width / 2);
                    }
                    tuxTextView.setTag(R.id.xrn, Integer.valueOf(width));
                    C1263960izq.LIZJ(str, str2, tuxTextView.getPaint(), width, new C1263990izt(str3, tuxTextView, str, str2, width));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    tuxTextView.setText(str3);
                    int i = C2187451AjH.LIZ;
                    C1720106oR.LIZIZ("ExtReason", "ellipsize fail when pre draw!", th);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ExtReasonHelper@9810.setTextWithEllipsizeOptimize$$inlined$doOnPreDraw$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ExtReasonHelper@9810.setTextWithEllipsizeOptimize$$inlined$doOnPreDraw$1");
            }
        });
    }

    public static void LIZJ(final String str, final String str2, TextPaint textPaint, int i, final Function1 function1) {
        final String string = C13LN.LJLZ(str).toString();
        TextUtils.ellipsize(C786410Ut5.j4(str2, Arrays.copyOf(new Object[]{string}, 1)), textPaint, i, TextUtils.TruncateAt.START, false, new TextUtils.EllipsizeCallback() { // from class: X.0izs
            @Override // android.text.TextUtils.EllipsizeCallback
            public final void ellipsized(int i2, int i3) {
                if (i2 != i3 && i2 >= 0 && i3 >= 0) {
                    if (i3 > string.length()) {
                        function1.invoke(null);
                        int i4 = C2187451AjH.LIZ;
                        C1720106oR.LJI("ExtReason", "ellipsize full name!");
                        return;
                    } else {
                        int length = str.length();
                        function1.invoke(C786410Ut5.j4(str2, Arrays.copyOf(new Object[]{a0.LJJL(str, length - i3, length - i2, "…").toString()}, 1)));
                        return;
                    }
                }
                function1.invoke(C786410Ut5.j4(str2, Arrays.copyOf(new Object[]{str}, 1)));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0db3, X.0dxf] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.C1263960izq r16, com.bytedance.tux.input.TuxTextView r17, com.ss.android.ugc.aweme.profile.model.User r18, com.ss.android.ugc.aweme.feed.model.Aweme r19, int r20) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1263960izq.LIZLLL(X.0izq, com.bytedance.tux.input.TuxTextView, com.ss.android.ugc.aweme.profile.model.User, com.ss.android.ugc.aweme.feed.model.Aweme, int):void");
    }

    public static boolean LJ(TuxTextView tuxTextView, String str, ExternalRecommendReasonStruct externalRecommendReasonStruct, String str2, InterfaceC1056430db7 interfaceC1056430db7, C1056470dbB c1056470dbB) {
        EnumC1070410dxf enumC1070410dxf;
        EnumC1056390db3 reason;
        C1056400db4 c1056400db4;
        String strLIZ;
        boolean z;
        if (externalRecommendReasonStruct == null || !externalRecommendReasonStruct.isValid()) {
            return false;
        }
        try {
            String str3 = externalRecommendReasonStruct.hashedPhoneNumber;
            String str4 = externalRecommendReasonStruct.externalUsername;
            if (str4 != null) {
                strLIZ = C447550Hgn.LIZ(str4);
            } else {
                strLIZ = null;
            }
            if (str3 == null || str3.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                enumC1070410dxf = EnumC1070410dxf.CONTACT;
                try {
                    String strLIZIZ = interfaceC1056430db7.LIZIZ(str3);
                    if (strLIZIZ.length() > 0) {
                        LJFF(tuxTextView, strLIZIZ, str, str2);
                        C1056470dbB.LJ(c1056470dbB, enumC1070410dxf, true, null, 51).LIZLLL(null);
                        return true;
                    }
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    if (!(th instanceof C1056400db4) || (c1056400db4 = th) == null || (reason = c1056400db4.getReason()) == null) {
                        reason = EnumC1056390db3.UNKNOWN;
                    }
                    C1056470dbB.LJ(c1056470dbB, enumC1070410dxf, false, reason, 35).LIZLLL(null);
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("set ");
                    sbLIZ.append(enumC1070410dxf);
                    sbLIZ.append(" reason by group1 fail");
                    C1720106oR.LIZIZ("ExtReason", C2188811AlT.LIZIZ(sbLIZ), th);
                    return false;
                }
            } else {
                enumC1070410dxf = null;
            }
            if (strLIZ != null && !a0.LJJJIL(strLIZ)) {
                EnumC1070410dxf enumC1070410dxf2 = EnumC1070410dxf.FACEBOOK;
                LJFF(tuxTextView, strLIZ, str, str2);
                C1056470dbB.LJ(c1056470dbB, enumC1070410dxf2, true, null, 51).LIZLLL(null);
                return true;
            }
            C1056470dbB.LJ(c1056470dbB, enumC1070410dxf, false, null, 51).LIZLLL(null);
            return false;
        } catch (Throwable th2) {
            th = th2;
            enumC1070410dxf = null;
        }
    }
}
