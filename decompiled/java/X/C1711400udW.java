package X;

import Y.ARunnableS101S0100000_1;
import android.os.Looper;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.RawTextAndIcon;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.RetentionSecurityInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.SecurityInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.SecurityInfoItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.AwS140S1100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: renamed from: X.0udW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1711400udW {
    public static final C1711400udW LIZ = new C1711400udW();
    public static final HashMap<String, Integer> LIZIZ = new HashMap<>();

    public static boolean LIZ(String str) {
        Integer num;
        if (str.length() == 0) {
            return false;
        }
        HashMap<String, Integer> map = LIZIZ;
        if (map.containsKey(str) && (num = map.get(str)) != null && num.intValue() >= 2) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(String str, C19EG c19eg, C1709570uaZ c1709570uaZ, EnumC1709240ua2 enumC1709240ua2, InterfaceC1711410udX interfaceC1711410udX) {
        RawTextAndIcon rawTextAndIconLJJIIZI;
        SecurityInfo securityInfo;
        RetentionSecurityInfo retentionSecurityInfo;
        LinearLayout linearLayout;
        String str2;
        TuxTextView tuxTextView;
        int iIntValue;
        Integer num;
        if (!LIZ(str)) {
            interfaceC1711410udX.LIZIZ();
            return;
        }
        boolean z = true;
        if (str.length() != 0) {
            HashMap<String, Integer> map = LIZIZ;
            if (map.containsKey(str) && (num = map.get(str)) != null) {
                map.put(str, Integer.valueOf(num.intValue() + 1));
            } else {
                map.put(str, 1);
            }
        }
        if (c1709570uaZ != null && (rawTextAndIconLJJIIZI = c1709570uaZ.LJJIIZI()) != null && (securityInfo = rawTextAndIconLJJIIZI.securityInfo) != null && (retentionSecurityInfo = securityInfo.retentionSecurityInfo) != null) {
            C770750ULh c770750ULh = new C770750ULh();
            String str3 = retentionSecurityInfo.title;
            if (str3 != null) {
                c770750ULh.LJ = str3;
            }
            ArrayList<SecurityInfoItem> arrayList = retentionSecurityInfo.contentItems;
            if (arrayList != null) {
                LIZ.getClass();
                if (arrayList.isEmpty()) {
                    linearLayout = null;
                } else {
                    linearLayout = new LinearLayout(c19eg);
                    linearLayout.setOrientation(1);
                    for (SecurityInfoItem securityInfoItem : arrayList) {
                        LinearLayout linearLayout2 = new LinearLayout(c19eg);
                        linearLayout2.setOrientation(0);
                        if (linearLayout.getChildCount() > 0) {
                            linearLayout2.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                        }
                        SmartImageView smartImageView = new SmartImageView(c19eg);
                        C786410Ut5.G6(smartImageView, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))));
                        smartImageView.setBackgroundColor(0);
                        String str4 = securityInfoItem.iconUrl;
                        String str5 = "";
                        if (str4 == null) {
                            str2 = "";
                        } else {
                            str2 = str4;
                        }
                        if (c19eg instanceof C19EG) {
                            C1711340udQ c1711340udQ = C1711340udQ.LIZ;
                            String str6 = securityInfoItem.darkModeIconUrl;
                            c1711340udQ.getClass();
                            String strLIZ = C1711340udQ.LIZ(c19eg, str4, str6);
                            if (strLIZ != null) {
                                str5 = strLIZ;
                            }
                            str2 = str5;
                        }
                        linearLayout2.addView(smartImageView);
                        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
                        c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.CENTER_CROP;
                        c1331670kl3LJIIIZ.LJJI(smartImageView);
                        C786410Ut5.h3(c1331670kl3LJIIIZ);
                        if (c19eg != null) {
                            tuxTextView = new TuxTextView(c19eg, null, 6, 0);
                            C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2, 1.0f));
                            tuxTextView.setText(securityInfoItem.text);
                            tuxTextView.setTuxFont(41);
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, c19eg);
                            if (numLIZJ != null) {
                                iIntValue = numLIZJ.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            tuxTextView.setTextColor(iIntValue);
                            tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                            tuxTextView.setMinHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                            tuxTextView.setGravity(16);
                        } else {
                            tuxTextView = null;
                        }
                        linearLayout2.addView(tuxTextView);
                        linearLayout.addView(linearLayout2);
                    }
                }
                c770750ULh.LJIILIIL = linearLayout;
                c770750ULh.LJIILJJIL = false;
                z = true;
            }
            c770750ULh.LJIILLIIL = z;
            c770750ULh.LJI(retentionSecurityInfo.buttonSaveText, new AwS605S0100000_26(interfaceC1711410udX, 514));
            c770750ULh.LJII(retentionSecurityInfo.buttonNoText, new AwS140S1100000_26(str, interfaceC1711410udX, 31));
            c770750ULh.LJIJ = z;
            if (c19eg != null) {
                TuxSheet tuxSheet = c770750ULh.LIZIZ().LIZ;
                tuxSheet.LLILLL = z;
                tuxSheet.LL = new DialogInterfaceOnCancelListenerC1775850wJT(interfaceC1711410udX, 4);
                tuxSheet.show(c19eg.getSupportFragmentManager(), "showRetentionDialog");
                if (enumC1709240ua2 == EnumC1709240ua2.TOKO) {
                    C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS101S0100000_1(c19eg, 37));
                }
            }
        }
    }
}
