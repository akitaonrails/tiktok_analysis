package X;

import android.app.Application;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.filter.FilterBean;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import lth.o;

/* JADX INFO: renamed from: X.0nhG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1444640nhG implements InterfaceC1645170suh {
    public String LJ() {
        return C0CHQ.LIZ().LJJIIZI().LJJIJL();
    }

    public String LJI() {
        return C0CHQ.LIZ().LJJIIZI().LJJJJZ();
    }

    @Override // X.InterfaceC1645170suh
    public void LIZ(String str) {
        C0CHQ.LIZ().LJJIIZI().LIZ(str);
    }

    @Override // X.InterfaceC1645170suh
    public void LIZIZ(String str) {
        C0CHQ.LIZ().LJJIIZI().LIZIZ(str);
    }

    @Override // X.InterfaceC1645170suh
    public final String LIZLLL(int i) {
        String strLJI;
        if (i == 0) {
            strLJI = LJ();
        } else {
            strLJI = LJI();
        }
        if (!Objects.equals(strLJI, "-1")) {
            return strLJI;
        }
        return LJFF(i, C0CHQ.LIZ().LJJIL().LIZIZ());
    }

    @Override // X.InterfaceC1645170suh
    public final void LIZJ(int i, String str) {
        if (i == 0) {
            LIZ(str);
        } else {
            LIZIZ(str);
        }
    }

    public String LJFF(int i, InterfaceC1639870sm9 interfaceC1639870sm9) {
        InterfaceC1640320sms interfaceC1640320smsLJJI;
        Application application = o.LIZ;
        synchronized (o.class) {
            interfaceC1640320smsLJJI = C0CHQ.LIZ().LJJIL().LIZIZ().LJJI();
        }
        FilterBean filterBean = null;
        FilterBean filterBean2 = null;
        int i2 = 0;
        for (Map.Entry entry : C1638720skI.LIZ((List) interfaceC1640320smsLJJI.LIZ().getValue()).entrySet()) {
            if (i2 == 0) {
                if (entry != null && entry.getValue() != null && !((List) entry.getValue()).isEmpty()) {
                    filterBean2 = (FilterBean) ListProtector.get((List) entry.getValue(), 0);
                }
            } else {
                if (i2 != 1) {
                    break;
                }
                if (entry != null && entry.getValue() != null && !((List) entry.getValue()).isEmpty()) {
                    filterBean = (FilterBean) ListProtector.get((List) entry.getValue(), 0);
                }
            }
            i2++;
        }
        if (filterBean != null && i == 0 && C1453230nv7.LIZIZ(interfaceC1639870sm9.LJJI(), filterBean.getId()) != null) {
            return filterBean.getId();
        }
        if (filterBean2 != null && i == 1 && C1453230nv7.LIZIZ(interfaceC1639870sm9.LJJI(), filterBean2.getId()) != null) {
            return filterBean2.getId();
        }
        return C1453230nv7.LIZLLL(interfaceC1639870sm9.LJJI(), 0).getId();
    }
}
