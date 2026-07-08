package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.feed.platform.metric.model.DeviceInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.1DDC, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DDC implements InterfaceC487330J9f {
    public static final C1DDC LL = new C1DDC();
    public static final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1DDJ());
    public static final C01GW LLILLL = C452501pT.LIZIZ(new C1DDK());
    public static final C01GW LLILZ = C452501pT.LIZIZ(new C1DDL());
    public static final C01GW LLILZIL = C452501pT.LIZIZ(new C1DDD());
    public static final C1DD7 LLILZLL = new C1DD7();
    public static final C01GW LLIZ = C452501pT.LIZIZ(new C0XEG());

    public static DeviceInfo LIZIZ() {
        C1DD7 c1dd7 = LLILZLL;
        return new DeviceInfo(c1dd7.LIZ, c1dd7.LIZIZ, c1dd7.LIZJ, c1dd7.LIZLLL, c1dd7.LJ, c1dd7.LJFF);
    }

    public static void LIZ(Activity activity) {
        View viewFindViewById;
        if (activity != null) {
            viewFindViewById = activity.findViewById(R.id.widget_container);
        } else {
            viewFindViewById = null;
        }
        new C20673615v4((List) LLILZIL.getValue(), 0, new C1DDI(activity, viewFindViewById, LLILZLL)).LIZ();
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C19EG c19eg;
        MainActivityScope mainActivityScopeLIZJ;
        C1584400rKg.LIZ.getClass();
        if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg)) != null && C0DMM.LIZ(mainActivityScopeLIZJ) != null) {
            C0T6L.LIZLLL();
            LIZ(activity);
        }
    }
}
