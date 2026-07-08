package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.10jc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19328610jc {
    public static final <T extends InterfaceC19211910Eb> List<T> LIZ(List<? extends T> list) {
        List<String> listLJI = ComplianceServiceProvider.LJJI().LJI();
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            if (!listLJI.contains(t2.getTag()) && C2174441A8c.LIZIZ.LJ(t2.getTag())) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T extends InterfaceC19211910Eb> List<T> LIZIZ(List<? extends T> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (C2174441A8c.LIZIZ.LJ(((InterfaceC19211910Eb) obj).getTag())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
