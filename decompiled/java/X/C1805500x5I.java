package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import webcast.api.profit.IapListResult;

/* JADX INFO: renamed from: X.0x5I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1805500x5I {
    public static C1805950x61 LIZ(C262100zr c262100zr) {
        List list;
        String string;
        boolean z;
        boolean z2;
        String string2;
        String string3;
        String string4 = null;
        try {
            Gson gson = C19748512Ol.LIZJ;
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null) {
                string3 = interfaceC1107590evd.getString("voucher_list");
            } else {
                string3 = null;
            }
            list = (List) gson.LJIIIIZZ(string3, new TypeToken<List<IapListResult.VoucherItem>>() { // from class: X.0x5o
            }.getType());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            list = null;
        }
        InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
        if (interfaceC1107590evd2 == null || (string = interfaceC1107590evd2.getString("mode")) == null) {
            string = "";
        }
        InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
        if (interfaceC1107590evd3 != null) {
            z = interfaceC1107590evd3.getBoolean("success");
        } else {
            z = false;
        }
        InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
        if (interfaceC1107590evd4 != null) {
            z2 = interfaceC1107590evd4.getBoolean("delay_voucher");
        } else {
            z2 = false;
        }
        InterfaceC1107590evd interfaceC1107590evd5 = c262100zr.LIZIZ;
        if (interfaceC1107590evd5 != null) {
            interfaceC1107590evd5.getInt("cashback_percent");
        }
        InterfaceC1107590evd interfaceC1107590evd6 = c262100zr.LIZIZ;
        if (interfaceC1107590evd6 != null) {
            string2 = interfaceC1107590evd6.getString("bind_type");
        } else {
            string2 = null;
        }
        InterfaceC1107590evd interfaceC1107590evd7 = c262100zr.LIZIZ;
        if (interfaceC1107590evd7 != null) {
            string4 = interfaceC1107590evd7.getString("trigger_position");
        }
        return new C1805950x61(string, z, z2, list, string2, string4);
    }
}
