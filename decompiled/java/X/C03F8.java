package X;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticsDescription;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS109S0101000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03F8, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03F8 {
    public final String LIZ;
    public final View LIZIZ;
    public TuxSheet LIZJ;
    public final HashSet<Integer> LIZLLL = new HashSet<>();

    public C03F8(View view, String str) {
        this.LIZ = str;
        this.LIZIZ = view;
    }

    public final void LIZIZ(LogisticDTO logisticDTO, int i) {
        if (this.LIZLLL.contains(Integer.valueOf(i))) {
            return;
        }
        this.LIZLLL.add(Integer.valueOf(i));
        View view = this.LIZIZ;
        if (view != null) {
            C1748720vbi.LIZLLL(view, new AnonymousClass0486(), new AwS109S0101000_1(logisticDTO, i, 11));
        }
    }

    public final void LIZJ(final LogisticsDescription logisticsDescription, String str, final String str2) {
        Context context;
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        TuxSheet tuxSheet;
        View view = this.LIZIZ;
        if (view != null && (context = view.getContext()) != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            C7971039l c7971039lLIZIZ = C808003Dq.LIZIZ(context, logisticsDescription, Boolean.TRUE);
            C0OM1 c0om1 = new C0OM1();
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = str;
            c0om1.LIZJ = c1250250idj;
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
            c1251150ifB.LIZJ(new AwS545S0100000_1(this, 1816));
            c0om1.LIZIZ(c1251150ifB);
            c0om1.LIZLLL = true;
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJJIJIL = c0om1;
            tuxSheet2.LLJJJ = null;
            tuxSheet2.LLJJIII = c7971039lLIZIZ;
            c1390920mIc.LJIIIIZZ(0);
            TuxSheet tuxSheet3 = c1390920mIc.LIZ;
            tuxSheet3.LLJJIJIIJIL = true;
            tuxSheet3.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.03F9
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Float fLJIIIIZZ;
                    String priceVal;
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    Set<String> set = C03FA.LIZ;
                    String str3 = this.LIZ;
                    Price price = logisticsDescription.shippingFee;
                    String currency = null;
                    if (price != null && (priceVal = price.getPriceVal()) != null) {
                        fLJIIIIZZ = C2327809Ae.LJIIIIZZ(priceVal);
                    } else {
                        fLJIIIIZZ = null;
                    }
                    Price price2 = logisticsDescription.shippingFee;
                    if (price2 != null) {
                        currency = price2.getCurrency();
                    }
                    C03FA.LJIIIZ(str3, fLJIIIIZZ, currency, Long.valueOf(jElapsedRealtime2), str2, 32);
                }
            };
            tuxSheet3.LLJLILLLLZIIL = false;
            this.LIZJ = tuxSheet3;
            if ((context instanceof C19GS) && (c19eg = (C19EG) context) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null && (tuxSheet = this.LIZJ) != null) {
                tuxSheet.show(supportFragmentManager, "next_day_delivery");
            }
        }
    }

    public final void LIZ(View view, String str, LogisticsDescription logisticsDescription, Map map, LogisticDTO logisticDTO) {
        String str2;
        String strLIZ;
        String strLIZLLL;
        Float fLJIIIIZZ;
        String priceVal;
        Float fLJIIIIZZ2;
        String currency;
        String priceVal2;
        Context context;
        String strLIZLLL2;
        try {
            if (C123100dR.LIZ(str)) {
                Uri uri = UriProtector.parse(str);
                String scheme = uri.getScheme();
                String str3 = "";
                if (scheme == null) {
                    scheme = "";
                }
                String host = uri.getHost();
                if (host == null) {
                    host = "";
                }
                String path = uri.getPath();
                if (path == null) {
                    path = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "type");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                    str3 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                }
                if (!Intrinsics.LJFF(scheme, "ec_action://") && !Intrinsics.LJFF(host, "ec")) {
                    if (((Boolean) C140100gB.LIZ.getValue()).booleanValue() && (context = view.getContext()) != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        View view2 = this.LIZIZ;
                        if (view2 != null && (strLIZLLL2 = C960603pE.LIZLLL(view2)) != null) {
                            linkedHashMap.put("intro_sheet_node_id", strLIZLLL2);
                        }
                        C919503ib.LIZIZ(context, str, linkedHashMap, false).open();
                        return;
                    }
                    return;
                }
                if (map == null || (str2 = (String) map.get("logistic_description_name")) == null) {
                    str2 = "next_day_delivery";
                }
                if (logisticDTO == null || (strLIZ = logisticDTO.deliveryName) == null) {
                    C903803g4.LIZ.getClass();
                    strLIZ = C903803g4.LIZ();
                }
                if (Intrinsics.LJFF(path, "/popup")) {
                    String currency2 = null;
                    if (Intrinsics.LJFF(str3, "next_day_delivery")) {
                        if (logisticsDescription != null) {
                            C03FA.LIZLLL("next_day_delivery_info", null, null, null, null, "1", null, null);
                            String str4 = this.LIZ;
                            Price price = logisticsDescription.shippingFee;
                            if (price != null && (priceVal2 = price.getPriceVal()) != null) {
                                fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(priceVal2);
                            } else {
                                fLJIIIIZZ2 = null;
                            }
                            Price price2 = logisticsDescription.shippingFee;
                            if (price2 != null) {
                                currency = price2.getCurrency();
                            } else {
                                currency = null;
                            }
                            C03FA.LJIIIIZZ(str4, fLJIIIIZZ2, currency, null, 24);
                            LIZJ(logisticsDescription, strLIZ, str2);
                            return;
                        }
                        return;
                    }
                    if (Intrinsics.LJFF(str3, "3_day_delivery") && logisticsDescription != null) {
                        Set<String> set = C03FA.LIZ;
                        C03FA.LIZLLL(str2, null, null, null, null, C893803eS.LIZ(false), null, null);
                        String str5 = this.LIZ;
                        Price price3 = logisticsDescription.shippingFee;
                        if (price3 != null && (priceVal = price3.getPriceVal()) != null) {
                            fLJIIIIZZ = C2327809Ae.LJIIIIZZ(priceVal);
                        } else {
                            fLJIIIIZZ = null;
                        }
                        Price price4 = logisticsDescription.shippingFee;
                        if (price4 != null) {
                            currency2 = price4.getCurrency();
                        }
                        C03FA.LJIIIIZZ(str5, fLJIIIIZZ, currency2, str2, 16);
                        LIZJ(logisticsDescription, strLIZ, str2);
                        return;
                    }
                    return;
                }
                Context context2 = view.getContext();
                if (context2 != null) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    View view3 = this.LIZIZ;
                    if (view3 != null && (strLIZLLL = C960603pE.LIZLLL(view3)) != null) {
                        linkedHashMap2.put("intro_sheet_node_id", strLIZLLL);
                    }
                    C919503ib.LIZIZ(context2, str, linkedHashMap2, false).open();
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
