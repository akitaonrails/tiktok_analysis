package X;

import android.app.Activity;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.11Wg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19514011Wg {
    public static final void LIZIZ(int i) {
        C19371010qS.LIZIZ(i, "power_permission_trace");
    }

    public static final List<C0HWO> LIZ(Context context, List<String> list) {
        EnumC442280HVy enumC442280HVy;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            C19741112Lp.LIZ.getClass();
            if (C19741112Lp.LIZLLL(context, str)) {
                enumC442280HVy = EnumC442280HVy.GRANTED;
            } else if (C19741112Lp.LJI((Activity) context, str, false)) {
                enumC442280HVy = EnumC442280HVy.DENIED_PERMANENT;
            } else {
                enumC442280HVy = EnumC442280HVy.THIS_OPERATION_NOT_PERMITTED;
            }
            arrayList.add(new C0HWO(str, enumC442280HVy));
        }
        return arrayList;
    }
}
