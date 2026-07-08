package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.core.content.FileProvider;
import androidx.core.graphics.drawable.IconCompat;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0VyP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C815190VyP {
    public static Uri LIZIZ(Context context, Bitmap bitmap) throws Throwable {
        C0VSJ c0vsj = new C0VSJ(C786410Ut5.w2(context), "share_content_cache");
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("push_");
        sbLIZ.append(System.currentTimeMillis() % ((long) 5));
        sbLIZ.append(".jpg");
        C0VSJ c0vsj2 = new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ));
        Throwable th = null;
        try {
            C0VSV c0vsv = new C0VSV(c0vsj2);
            if (bitmap != null) {
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, c0vsv);
                } catch (Throwable th2) {
                    try {
                        TryCatchGuardChecker.doCheck(th2);
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th2;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    C2107108Nh.LIZ(c0vsv, th);
                                    throw th;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
            }
            C2107108Nh.LIZ(c0vsv, null);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(context.getPackageName());
            sbLIZ2.append(".fileprovider");
            return FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(context, C2188811AlT.LIZIZ(sbLIZ2), c0vsj2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("createImageAttachmentUri error: ");
            sbLIZ3.append(e);
            C2188811AlT.LIZIZ(sbLIZ3);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(2:13|(14:15|(0)|18|(1:20)(1:(2:23|(3:25|(4:27|(4:30|(3:102|32|105)(1:104)|103|28)|101|33)|34)(1:111)))|21|88|55|(4:57|(4:60|(3:94|62|97)(1:96)|95|58)|93|63)|64|65|(2:68|66)|98|75|76)(1:85))(1:35)|88|55|(0)|64|65|(1:66)|98|75|76) */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01e7, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ea, code lost:
    
        r1 = X.C815220VyS.LIZIZ(r16).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01f8, code lost:
    
        r0 = r1.next();
        java.util.Collections.singletonList(r4);
        r0.getClass();
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a1 A[Catch: Exception -> 0x01e6, all -> 0x0209, TryCatch #2 {Exception -> 0x01e6, blocks: (B:55:0x0193, B:57:0x01a1, B:58:0x01a7, B:60:0x01ad, B:62:0x01b7, B:63:0x01bb, B:64:0x01c3), top: B:88:0x0193, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01db A[LOOP:2: B:66:0x01d5->B:68:0x01db, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.content.Context r16, X.C814730Vxf r17, java.lang.String r18, androidx.core.graphics.drawable.IconCompat r19) {
        /*
            Method dump skipped, instruction units count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C815190VyP.LIZ(android.content.Context, X.0Vxf, java.lang.String, androidx.core.graphics.drawable.IconCompat):void");
    }

    public void LIZJ(Context context, C814730Vxf c814730Vxf, Bitmap bitmap, Bitmap bitmap2, C813610Vvr c813610Vvr) throws Throwable {
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
        if (z) {
            str = "";
        } else {
            str = c814730Vxf.text;
        }
        C814760Vxi c814760Vxi = new C814760Vxi(str, System.currentTimeMillis(), c815260VyW2);
        if (z) {
            Uri uriLIZIZ = LIZIZ(context, bitmap);
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
        LIZ(context, c814730Vxf, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, iconCompatLIZLLL);
    }
}
