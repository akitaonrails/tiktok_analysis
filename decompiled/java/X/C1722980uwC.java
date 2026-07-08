package X;

import com.ss.android.ugc.aweme.home.repo.network.data.NewUserGuideInfoResponse;
import com.ss.android.ugc.aweme.home.repo.network.data.ServiceComponentResponse;
import java.util.Map;

/* JADX INFO: renamed from: X.0uwC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1722980uwC {
    public final InterfaceC1722860uw0 LIZ;

    public C1722980uwC(InterfaceC1722860uw0 interfaceC1722860uw0) {
        this.LIZ = interfaceC1722860uw0;
    }

    public static C1723030uwH LIZIZ(NewUserGuideInfoResponse newUserGuideInfoResponse) {
        boolean zBooleanValue;
        String str = newUserGuideInfoResponse.title;
        String str2 = null;
        if (str == null && newUserGuideInfoResponse.desc == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invalid NewUserGuideInfo ");
            sbLIZ.append(newUserGuideInfoResponse);
            C2188811AlT.LIZIZ(sbLIZ);
            return null;
        }
        String str3 = newUserGuideInfoResponse.desc;
        Map<String, String> map = newUserGuideInfoResponse.iconMap;
        if (map != null) {
            str2 = map.get("android");
        }
        String str4 = newUserGuideInfoResponse.noticeKey;
        Boolean bool = newUserGuideInfoResponse.canClose;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        return new C1723030uwH(str, str3, str2, zBooleanValue, str4);
    }

    public static C1723010uwF LIZJ(ServiceComponentResponse serviceComponentResponse) {
        String str;
        String str2 = serviceComponentResponse.title;
        String str3 = null;
        if (str2 != null && (str = serviceComponentResponse.link) != null) {
            Map<String, String> map = serviceComponentResponse.iconMap;
            if (map != null) {
                str3 = map.get("android");
            }
            return new C1723010uwF(str2, str, str3);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("invalid Service Component ");
        sbLIZ.append(serviceComponentResponse);
        C2188811AlT.LIZIZ(sbLIZ);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LIZ(X.C1722790uvt r6, X.C1722980uwC r7, X.C759410Tqd r8, X.InterfaceC1364105Vn r9) {
        /*
            boolean r0 = r9 instanceof X.C1722990uwD
            if (r0 == 0) goto L4a
            r5 = r9
            X.0uwD r5 = (X.C1722990uwD) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r2 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 != r1) goto L50
            X.0cH9 r3 = r5.LL
            X.C155000ia.LIZIZ(r2)
        L24:
            X.0brW r2 = (X.AbstractC989720brW) r2
            X.C1005610cH9.LIZIZ(r3, r2)
            return r2
        L2a:
            X.C155000ia.LIZIZ(r2)
            X.0cH9 r3 = new X.0cH9
            java.lang.String r0 = "homepage_info"
            r3.<init>(r0)
            r5.LL = r3
            r5.LLILZ = r1
            r7.getClass()
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0uwB r1 = new X.0uwB
            r0 = 0
            r1.<init>(r6, r7, r8, r0)
            java.lang.Object r2 = X.C23250099c.LJI(r5, r2, r1)
            if (r2 != r4) goto L24
            return r4
        L4a:
            X.0uwD r5 = new X.0uwD
            r5.<init>(r7, r9)
            goto L12
        L50:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1722980uwC.LIZ(X.0uvt, X.0uwC, X.0Tqd, X.05Vn):java.lang.Object");
    }
}
