package X;

import android.text.format.DateFormat;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.0NgB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C600050NgB implements InterfaceC1631620sYq<C1307670k8L, List<? extends Object>, InterfaceC1364105Vn<? super Object>, Object>, InterfaceC842703Qz {
    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C1307670k8L c1307670k8L, List<? extends Object> list, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        try {
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            calendar.setTimeInMillis(System.currentTimeMillis());
            return C2286608xc.LJ(CastIntegerProtector.parseInt(DateFormat.format("HHmm", calendar).toString()));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalStateException("current_datetime_utc0>>> error", e);
        }
    }
}
