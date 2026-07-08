package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.tiktok.tuc.model.TUCActionData;
import java.util.List;

/* JADX INFO: renamed from: X.101C, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C101C {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, C101D c101d, List list, int i) {
        if (i >= list.size()) {
            return;
        }
        InterfaceC1239610iMZ interfaceC1239610iMZLIZ = c101d.LIZ(((TUCActionData) ListProtector.get(list, i)).actionName);
        if (interfaceC1239610iMZLIZ != null) {
            interfaceC1239610iMZLIZ.LIZ(context, (TUCActionData) ListProtector.get(list, i), new C101B(context, c101d, list, i));
        } else {
            LIZ(context, c101d, list, i + 1);
        }
    }
}
