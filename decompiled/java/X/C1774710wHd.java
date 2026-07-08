package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallStyleDTO;
import kotlin.text.CharsKt__CharJVMKt;

/* JADX INFO: renamed from: X.0wHd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1774710wHd {
    public static final int LIZ(String str) {
        long j;
        try {
            if (str.charAt(0) == '#') {
                String strSubstring = str.substring(1);
                CharsKt__CharJVMKt.checkRadix(16);
                long j2 = CastLongProtector.parseLong(strSubstring, 16);
                if (str.length() != 7) {
                    if (str.length() == 9) {
                        j = ((j2 & 4294967040L) >>> 8) | ((255 & j2) << 24);
                    } else {
                        throw new IllegalArgumentException("Unknown color");
                    }
                } else {
                    j = j2 | 4278190080L;
                }
                return (int) j;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return 0;
    }

    public static final String LIZIZ(String str) {
        if (str == null) {
            return str;
        }
        try {
            String path = UriProtector.parse(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "url")).getPath();
            if (path != null) {
                return path;
            }
            return str;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str;
        }
    }

    public static final void LIZJ(ECMixMallStyleDTO eCMixMallStyleDTO, View view) {
        C19508411Uc c19508411Uc;
        if (view instanceof ViewStub) {
            view = C786410Ut5.LJLLLL((ViewStub) view);
        }
        if ((view instanceof C19508411Uc) && (c19508411Uc = (C19508411Uc) view) != null) {
            c19508411Uc.LIZ(eCMixMallStyleDTO);
        }
    }

    public static final void LIZLLL(ECMixMallStyleDTO eCMixMallStyleDTO, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.bottomMargin = eCMixMallStyleDTO.LIZLLL;
            marginLayoutParams.topMargin = eCMixMallStyleDTO.LIZJ;
            marginLayoutParams.leftMargin = eCMixMallStyleDTO.LIZ;
            marginLayoutParams.rightMargin = eCMixMallStyleDTO.LIZIZ;
        }
    }
}
