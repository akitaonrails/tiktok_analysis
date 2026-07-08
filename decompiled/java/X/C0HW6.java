package X;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0HW6, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HW6 {
    public static final C0HW6 LIZ = new C0HW6();
    public static final C0HU6 LIZIZ = new C0HU6(new C1342130l1v(631.65f), new C1342130l1v(45.24f));

    public static C21647019ng LIZ(Context context, View view) {
        C0HU6 c0hu6 = LIZIZ;
        List listSingletonList = Collections.singletonList(new C19746412Nq("show_photo_detail_other_view", new C0HUY(0.0f, 1.0f)));
        if (view == null) {
            view = new View(context);
        }
        C21647019ng c21647019ng = new C21647019ng(context, view, new C19746312Np(EnumC19746112Nn.SPRING, c0hu6, listSingletonList), false);
        c21647019ng.LIZLLL(200L);
        return c21647019ng;
    }
}
