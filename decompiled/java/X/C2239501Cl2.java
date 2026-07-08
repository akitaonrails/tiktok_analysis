package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.1Cl2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2239501Cl2 {
    public static final /* synthetic */ C2239501Cl2 LIZ = new C2239501Cl2();
    public static final List<InterfaceC2239511Cl3> LIZIZ = C1697810uHb.LJIIJJI(new InterfaceC2239511Cl3() { // from class: X.1Cl1
        @Override // X.InterfaceC2239511Cl3
        public final View LIZ(View view) {
            Activity activityLIZ;
            Context context = view.getContext();
            if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                return activityLIZ.findViewById(R.id.tpm);
            }
            return null;
        }
    }, new InterfaceC2239511Cl3() { // from class: X.1Cl0
        @Override // X.InterfaceC2239511Cl3
        public final View LIZ(View view) {
            Activity activityLIZ;
            Context context = view.getContext();
            if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                return activityLIZ.findViewById(R.id.ija);
            }
            return null;
        }
    });
}
