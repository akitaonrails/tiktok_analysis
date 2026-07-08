package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0gf0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1174160gf0 {
    public static final void LIZIZ(C1749280vcc c1749280vcc) {
        c1749280vcc.setLayoutVariant(1);
        C1546210qL5.LIZ.getClass();
        C1180060goW.LJIIIZ(C814420VxA.LIZIZ(C1546210qL5.LIZ(319)), c1749280vcc);
        c1749280vcc.setTopMargin(C814420VxA.LIZIZ(C1546210qL5.LIZ(16)));
    }

    public static final void LIZ(C1722300uv6 c1722300uv6, InterfaceC1181010gq3 interfaceC1181010gq3, Context context, String str, PoiListApi.PoiDetailResponse poiDetailResponse, String str2, String str3) {
        String name;
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.n6;
        Drawable drawableLIZ = c0hti.LIZ(context);
        c1722300uv6.LIZJ = 2;
        c1722300uv6.LIZ = drawableLIZ;
        Object[] objArr = new Object[1];
        if (poiDetailResponse == null || (name = poiDetailResponse.getName()) == null) {
            name = "";
        }
        objArr[0] = name;
        c1722300uv6.LJIIIIZZ = context.getString(2131824978, objArr);
        c1722300uv6.LJIIIZ = new C444700HcC(interfaceC1181010gq3, context, str2, str3, poiDetailResponse, str);
    }
}
