package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.FullyRenderedLoggerInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0koW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1333820koW extends C1333900koe {
    public static final InterfaceC1333840koY LIZLLL = (InterfaceC1333840koY) C1332160klq.LJIIIZ().LIZIZ.LJJJIL.LIZ();

    @Override // X.C1320270kSf, X.InterfaceC1325670kbN
    public final void LIZJ(C1325710kbR c1325710kbR, Object obj, String str, boolean z) {
        String path;
        InterfaceC1333840koY interfaceC1333840koY = LIZLLL;
        if (interfaceC1333840koY != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(obj);
            sbLIZ.append("@@");
            sbLIZ.append(interfaceC1333840koY.LIZ());
            obj = C2188811AlT.LIZIZ(sbLIZ);
        }
        int iHashCode = c1325710kbR.hashCode();
        Uri uri = c1325710kbR.LIZIZ;
        boolean z2 = c1325710kbR.LJJJ;
        Uri uri2 = C1326230kcH.LIZ;
        C1326840kdG.LIZ.getClass();
        if (C1326840kdG.LIZIZ.get()) {
            C1326230kcH.LJI.put(Integer.valueOf(iHashCode), str);
        }
        FullyRenderedLoggerInterface fullyRenderedLoggerInterfaceLIZ = C1742540vRk.LIZ();
        if (fullyRenderedLoggerInterfaceLIZ != null) {
            String str2 = null;
            if (uri == null || (path = uri.getPath()) == null) {
                path = null;
            }
            C1334140kp2 c1334140kp2LIZLLL = C1334150kp3.LIZLLL(uri);
            if (c1334140kp2LIZLLL != null) {
                str2 = c1334140kp2LIZLLL.LIZ;
            }
            fullyRenderedLoggerInterfaceLIZ.LJ(path, str2, z2);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1336010ks3.LIZIZ();
        C1333830koX c1333830koX = new C1333830koX();
        c1333830koX.LIZ = jCurrentTimeMillis;
        c1333830koX.LIZLLL = obj;
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            if (C1330620kjM.LJFF) {
                try {
                    jSONObject.put("image_monitor_data", new JSONObject());
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            c1333830koX.LIZJ = jSONObject;
        }
        this.LIZ.put(str, c1333830koX);
        C1336010ks3.LIZIZ();
    }
}
