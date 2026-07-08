package X;

import Y.AfS176S0100000_7;
import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import com.bytedance.android.livesdk.watch.OrientationChangeEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ttpobfuscated.e3;
import webcast.data.SuperFanOfferInfo;
import webcast.data.SuperFanPackage;
import webcast.data.SuperFanPriceInfo;

/* JADX INFO: renamed from: X.0KSa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C517700KSa {
    public static final List<Integer> LIZ(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        int iLJJJ = a0.LJJJ(str, str2, 0, false, 6);
        while (iLJJJ >= 0) {
            arrayList.add(Integer.valueOf(iLJJJ));
            iLJJJ = a0.LJJJ(str, str2, iLJJJ + 1, false, 4);
        }
        return arrayList;
    }

    public static final CharSequence LIZIZ(Context context, C0KS8 c0ks8) {
        String str;
        SuperFanPriceInfo superFanPriceInfo;
        SuperFanPriceInfo superFanPriceInfo2;
        String str2;
        String strLJIJJ;
        SuperFanOfferInfo superFanOfferInfo;
        SuperFanPriceInfo superFanPriceInfo3;
        SuperFanOfferInfo superFanOfferInfo2;
        SuperFanPriceInfo superFanPriceInfo4;
        C0KSW c0ksw = c0ks8.LIZIZ;
        SuperFanPackage superFanPackage = c0ks8.LIZ;
        if (c0ksw != null) {
            String strLIZIZ = c0ksw.LIZIZ();
            String strLIZ = c0ksw.LIZ();
            String str3 = null;
            if (!Intrinsics.LJFF(strLIZIZ, strLIZ)) {
                if (superFanPackage != null && (superFanOfferInfo2 = superFanPackage.offerinfo) != null && (superFanPriceInfo4 = superFanOfferInfo2.secondarycurrencyprice) != null) {
                    str2 = superFanPriceInfo4.moneyDisplay;
                } else {
                    str2 = null;
                }
                if (C1533950q1J.LJ(str2)) {
                    Object[] objArr = new Object[2];
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('(');
                    sbLIZ.append(strLIZ);
                    objArr[0] = C2188811AlT.LIZIZ(sbLIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append(" ≈ ");
                    if (superFanPackage != null && (superFanOfferInfo = superFanPackage.offerinfo) != null && (superFanPriceInfo3 = superFanOfferInfo.secondarycurrencyprice) != null) {
                        str3 = superFanPriceInfo3.moneyDisplay;
                    }
                    sbLIZ2.append(str3);
                    sbLIZ2.append(')');
                    objArr[1] = C2188811AlT.LIZIZ(sbLIZ2);
                    strLJIJJ = C497740JfY.LJIJJ(2131856679, objArr);
                } else {
                    strLJIJJ = C497740JfY.LJIJJ(2131856679, strLIZ, strLIZIZ);
                }
                int iLJJJ = a0.LJJJ(strLJIJJ, strLIZ, 0, false, 6);
                int length = strLIZ.length() + iLJJJ;
                SpannableString spannableString = new SpannableString(strLJIJJ);
                if (iLJJJ >= 0 && length >= 0) {
                    C786410Ut5.p2(spannableString, new StrikethroughSpan(), iLJJJ, length, 33);
                    C786410Ut5.p2(spannableString, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ez3, context)), iLJJJ, length, 33);
                }
                return spannableString;
            }
            Object[] objArr2 = new Object[1];
            if (superFanPackage != null && (superFanPriceInfo2 = superFanPackage.secondarycurrencyprice) != null) {
                str = superFanPriceInfo2.moneyDisplay;
            } else {
                str = null;
            }
            if (C1533950q1J.LJ(str)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append('(');
                sbLIZ3.append(strLIZ);
                sbLIZ3.append(" ≈ ");
                if (superFanPackage != null && (superFanPriceInfo = superFanPackage.secondarycurrencyprice) != null) {
                    str3 = superFanPriceInfo.moneyDisplay;
                }
                sbLIZ3.append(str3);
                sbLIZ3.append(')');
                strLIZ = C2188811AlT.LIZIZ(sbLIZ3);
            }
            objArr2[0] = strLIZ;
            return C497740JfY.LJIJJ(2131856697, objArr2);
        }
        return C497740JfY.LJIJI(2131856698);
    }

    public static final void LIZJ(DataChannel dataChannel, Function0<Unit> function0) {
        Boolean bool;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C0TZM.class)) != null && !bool.booleanValue()) {
            if (dataChannel != null) {
                dataChannel.FQ2(OrientationChangeEvent.class);
            }
            C11NZ.LJLJJLL(700L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS176S0100000_7(function0, 147));
            return;
        }
        function0.invoke();
    }

    public static final void LIZLLL(C16F5 c16f5, String str, int i, int i2, Function0<Unit> function0) {
        int iLJJJ = a0.LJJJ(str, e3.e, 0, false, 6);
        int iLJJJ2 = a0.LJJJ(str, e3.f, 0, false, 6);
        if (iLJJJ != -1 && iLJJJ2 != -1) {
            SpannableString spannableString = new SpannableString(a0.LJJJJZI(iLJJJ, iLJJJ + 1, a0.LJJJJZI(iLJJJ2, iLJJJ2 + 1, str).toString()).toString());
            int i3 = iLJJJ2 - 1;
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(i2), iLJJJ, i3, 33);
            C786410Ut5.p2(spannableString, new C444920HcY(i, false), iLJJJ, i3, 33);
            C786410Ut5.p2(spannableString, new C521540Kcq(i2, function0, 0), iLJJJ, i3, 33);
            c16f5.setText(spannableString);
            c16f5.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}
