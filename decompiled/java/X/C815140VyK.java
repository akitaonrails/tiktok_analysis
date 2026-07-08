package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0VyK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C815140VyK {
    public static final C815140VyK LIZ = new C815140VyK();
    public static final C815150VyL LIZIZ = new C815190VyP() { // from class: X.0VyL
        @Override // X.C815190VyP
        public final void LIZJ(Context context, C814730Vxf c814730Vxf, Bitmap bitmap, Bitmap bitmap2, C813610Vvr c813610Vvr) throws Throwable {
            super.LIZJ(context, c814730Vxf, bitmap, bitmap2, c813610Vvr);
        }
    };
    public static final Map<String, C815190VyP> LIZJ = C2097608Jq.LJIIIIZZ(new Pair("oppo", new C815190VyP() { // from class: X.0VyJ
        @Override // X.C815190VyP
        public final void LIZJ(Context context, C814730Vxf c814730Vxf, Bitmap bitmap, Bitmap bitmap2, C813610Vvr c813610Vvr) throws Throwable {
            boolean z;
            long j;
            Bitmap bitmapLIZ = C815340Vye.LIZ(bitmap2);
            if (bitmapLIZ == null) {
                bitmapLIZ = BitmapFactory.decodeResource(context.getResources(), R.drawable.c5w);
            }
            IconCompat iconCompatLIZLLL = IconCompat.LIZLLL(bitmapLIZ);
            if (bitmap != null) {
                z = true;
            } else {
                z = false;
            }
            C815290VyZ c815290VyZ = new C815290VyZ();
            String str = c814730Vxf.text;
            c815290VyZ.LIZ = str;
            C815260VyW c815260VyW = new C815260VyW(c815290VyZ);
            C815290VyZ c815290VyZ2 = new C815290VyZ();
            if (!z) {
                str = c814730Vxf.title;
            }
            c815290VyZ2.LIZ = str;
            c815290VyZ2.LIZIZ = iconCompatLIZLLL;
            C815260VyW c815260VyW2 = new C815260VyW(c815290VyZ2);
            C814750Vxh c814750Vxh = new C814750Vxh(c815260VyW);
            c814750Vxh.LJII = c814730Vxf.title;
            C814760Vxi c814760Vxi = new C814760Vxi(c814730Vxf.text, System.currentTimeMillis(), c815260VyW2);
            if (z) {
                Uri uriLIZIZ = C815190VyP.LIZIZ(context, bitmap);
                c814760Vxi.LJ = "image/*";
                c814760Vxi.LJFF = uriLIZIZ;
            }
            c814750Vxh.LJIIIZ(c814760Vxi);
            if (bitmap != null) {
                c813610Vvr.LJIIIIZZ(bitmap);
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(c814730Vxf.openUrl), "conv_short_id");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                if (C08A4.LIZIZ(Long.valueOf(c814730Vxf.id))) {
                    j = c814730Vxf.id;
                } else {
                    j = c814730Vxf.rid64;
                }
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = String.valueOf(j);
            }
            c813610Vvr.LJIJJ = "msg";
            c813610Vvr.LJJIII = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
            c813610Vvr.LJJIIJ = new C813680Vvy(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            c813610Vvr.LIZJ.add(c815260VyW);
            c813610Vvr.LJIIJJI = true;
            c813610Vvr.LJIIJ(c814750Vxh);
            c813610Vvr.LJJIIZI.when = System.currentTimeMillis();
            C815190VyP.LIZ(context, c814730Vxf, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, iconCompatLIZLLL);
        }
    }), new Pair("vivo", new C815190VyP() { // from class: X.0VyI
        @Override // X.C815190VyP
        public final void LIZJ(Context context, C814730Vxf c814730Vxf, Bitmap bitmap, Bitmap bitmap2, C813610Vvr c813610Vvr) throws Throwable {
            boolean z;
            String str;
            long j;
            Bitmap bitmapLIZ = C815340Vye.LIZ(bitmap2);
            if (bitmapLIZ == null) {
                bitmapLIZ = BitmapFactory.decodeResource(context.getResources(), R.drawable.c5w);
            }
            IconCompat iconCompatLIZLLL = IconCompat.LIZLLL(bitmapLIZ);
            if (bitmap != null) {
                z = true;
            } else {
                z = false;
            }
            C815290VyZ c815290VyZ = new C815290VyZ();
            String str2 = c814730Vxf.text;
            c815290VyZ.LIZ = str2;
            C815260VyW c815260VyW = new C815260VyW(c815290VyZ);
            C815290VyZ c815290VyZ2 = new C815290VyZ();
            if (!z) {
                str2 = c814730Vxf.title;
            }
            c815290VyZ2.LIZ = str2;
            c815290VyZ2.LIZIZ = iconCompatLIZLLL;
            C815260VyW c815260VyW2 = new C815260VyW(c815290VyZ2);
            C814750Vxh c814750Vxh = new C814750Vxh(c815260VyW);
            c814750Vxh.LJIIIIZZ = Boolean.valueOf(z);
            if (z) {
                str = "";
            } else {
                str = c814730Vxf.text;
            }
            C814760Vxi c814760Vxi = new C814760Vxi(str, System.currentTimeMillis(), c815260VyW2);
            if (z) {
                Uri uriLIZIZ = C815190VyP.LIZIZ(context, bitmap);
                c814760Vxi.LJ = "image/*";
                c814760Vxi.LJFF = uriLIZIZ;
            }
            c814750Vxh.LJIIIZ(c814760Vxi);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(c814730Vxf.openUrl), "conv_short_id");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                if (C08A4.LIZIZ(Long.valueOf(c814730Vxf.id))) {
                    j = c814730Vxf.id;
                } else {
                    j = c814730Vxf.rid64;
                }
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = String.valueOf(j);
            }
            c813610Vvr.LJIJJ = "msg";
            c813610Vvr.LJJIII = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
            c813610Vvr.LJJIIJ = new C813680Vvy(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            c813610Vvr.LIZJ.add(c815260VyW);
            c813610Vvr.LJIIJJI = true;
            c813610Vvr.LJIIJ(c814750Vxh);
            c813610Vvr.LJJIIZI.when = System.currentTimeMillis();
            C815190VyP.LIZ(context, c814730Vxf, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, iconCompatLIZLLL);
        }
    }), new Pair("honor", new C815190VyP() { // from class: X.0VyH
        /* JADX WARN: Removed duplicated region for block: B:41:0x0122  */
        @Override // X.C815190VyP
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LIZJ(android.content.Context r11, X.C814730Vxf r12, android.graphics.Bitmap r13, android.graphics.Bitmap r14, X.C813610Vvr r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 297
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C815110VyH.LIZJ(android.content.Context, X.0Vxf, android.graphics.Bitmap, android.graphics.Bitmap, X.0Vvr):void");
        }
    }), new Pair("infinix", new C815190VyP() { // from class: X.0VyM
        @Override // X.C815190VyP
        public final void LIZJ(Context context, C814730Vxf c814730Vxf, Bitmap bitmap, Bitmap bitmap2, C813610Vvr c813610Vvr) throws Throwable {
            super.LIZJ(context, c814730Vxf, bitmap, bitmap2, c813610Vvr);
        }
    }));
}
