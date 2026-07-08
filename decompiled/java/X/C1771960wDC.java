package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.ItemStyle;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0wDC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1771960wDC {
    public static final Integer LIZ(ItemStyle itemStyle, ItemStyle itemStyle2, boolean z) {
        String str;
        if (z) {
            if (itemStyle2 == null) {
                return null;
            }
            str = itemStyle2.bgColor;
        } else {
            if (itemStyle == null) {
                return null;
            }
            str = itemStyle.bgColor;
        }
        if (str == null) {
            return null;
        }
        return Integer.valueOf(C1774710wHd.LIZ(str));
    }

    public static final void LIZJ(View view, String str, Map<String, ?> map, Map<String, ?> map2) {
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("btm", str), new Pair("bcm", map), new Pair("btm_unit_params", map2));
        if (view != null) {
            view.setTag(R.id.gii, mapLJIIIIZZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f1 A[PHI: r7
      0x00f1: PHI (r7v2 com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabItem) = 
      (r7v1 com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabItem)
      (r7v4 com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabItem)
     binds: [B:38:0x00ed, B:13:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.InterfaceC1773310wFN r9, X.C1774040wGY r10, com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabItem r11, com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabBarCardItem r12, int r13, java.lang.String r14, java.lang.String r15, float r16) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1771960wDC.LIZIZ(X.0wFN, X.0wGY, com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabItem, com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabBarCardItem, int, java.lang.String, java.lang.String, float):void");
    }
}
