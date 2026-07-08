package X;

import android.os.SystemClock;
import com.bytedance.android.live.iap.service.IapServiceClass;
import com.bytedance.android.livesdk.iap.IapProductDetail;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0wir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1791590wir implements InterfaceC1791300wiO {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ C1617170sBX LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ IapServiceClass LIZLLL;
    public final /* synthetic */ boolean LJ;
    public final /* synthetic */ InterfaceC1791300wiO LJFF;

    @Override // X.InterfaceC1791300wiO
    public final void LIZLLL(C518150KTt c518150KTt) {
        ArrayList arrayList;
        Integer numValueOf;
        EnumC1792020wjY enumC1792020wjY;
        long jUptimeMillis = SystemClock.uptimeMillis() - this.LIZ;
        C1617170sBX c1617170sBX = this.LIZIZ;
        String str = c1617170sBX.LIZ;
        List<String> list = c1617170sBX.LIZIZ;
        Map<String, IapProductDetail> map = c518150KTt.LIZIZ;
        String str2 = null;
        if (map != null) {
            arrayList = new ArrayList(map.size());
            Iterator<Map.Entry<String, IapProductDetail>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getKey());
            }
        } else {
            arrayList = null;
        }
        C0KQW c0kqw = c518150KTt.LIZJ;
        if (c0kqw != null && (enumC1792020wjY = c0kqw.LIZ) != null) {
            numValueOf = Integer.valueOf(enumC1792020wjY.getValue());
        } else {
            numValueOf = null;
        }
        C0KQW c0kqw2 = c518150KTt.LIZJ;
        if (c0kqw2 != null) {
            str2 = c0kqw2.LIZIZ;
        }
        String str3 = this.LIZJ;
        this.LIZLLL.getClass();
        C1788890weV.LIZ(str, jUptimeMillis, list, arrayList, numValueOf, str2, str3, IapServiceClass.LJIJI(), this.LJ);
        this.LJFF.LIZLLL(c518150KTt);
    }

    @Override // X.InterfaceC1791300wiO
    public final void LJ(C0KSV c0ksv) {
        ArrayList arrayList;
        Integer numValueOf;
        EnumC1792020wjY enumC1792020wjY;
        long jUptimeMillis = SystemClock.uptimeMillis() - this.LIZ;
        C1617170sBX c1617170sBX = this.LIZIZ;
        String str = c1617170sBX.LIZ;
        List<String> list = c1617170sBX.LIZIZ;
        Map<String, C0KSW> map = c0ksv.LIZIZ;
        String str2 = null;
        if (map != null) {
            arrayList = new ArrayList(map.size());
            Iterator<Map.Entry<String, C0KSW>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getKey());
            }
        } else {
            arrayList = null;
        }
        C0KQW c0kqw = c0ksv.LIZJ;
        if (c0kqw != null && (enumC1792020wjY = c0kqw.LIZ) != null) {
            numValueOf = Integer.valueOf(enumC1792020wjY.getValue());
        } else {
            numValueOf = null;
        }
        C0KQW c0kqw2 = c0ksv.LIZJ;
        if (c0kqw2 != null) {
            str2 = c0kqw2.LIZIZ;
        }
        String str3 = this.LIZJ;
        this.LIZLLL.getClass();
        C1788890weV.LIZ(str, jUptimeMillis, list, arrayList, numValueOf, str2, str3, IapServiceClass.LJIJI(), this.LJ);
        this.LJFF.LJ(c0ksv);
    }

    public C1791590wir(long j, C1617170sBX c1617170sBX, String str, IapServiceClass iapServiceClass, boolean z, InterfaceC1791300wiO interfaceC1791300wiO) {
        this.LIZ = j;
        this.LIZIZ = c1617170sBX;
        this.LIZJ = str;
        this.LIZLLL = iapServiceClass;
        this.LJ = z;
        this.LJFF = interfaceC1791300wiO;
    }
}
