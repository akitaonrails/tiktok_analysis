package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JMj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C490750JMj {
    public static final String LIZ(Aweme aweme) {
        String sourceId;
        Video video = aweme.getVideo();
        if (video == null || (sourceId = video.getPlayAddr().getSourceId()) == null) {
            return "";
        }
        return sourceId;
    }

    public static final void LIZIZ(Fragment fragment) {
        FragmentManager supportFragmentManager;
        C19EG activity = fragment.getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            if (supportFragmentManager.LJJLIIIJL().size() > 1) {
                supportFragmentManager.LJLLILLLL();
                return;
            }
            C19EG activity2 = fragment.getActivity();
            if (activity2 == null) {
                return;
            }
            activity2.finish();
        }
    }

    public static final Aweme LIZLLL(String str) {
        Gson gson;
        Video video;
        try {
            GsonProvider gsonProvider = (GsonProvider) PluggableExtentionKt.pluggableSpi$default(GsonProvider.class, false, false, false, 14, null);
            if (gsonProvider == null || (gson = gsonProvider.getGson()) == null) {
                return null;
            }
            Aweme aweme = (Aweme) gson.LJII(str, Aweme.class);
            if (aweme != null && (video = aweme.getVideo()) != null) {
                video.setSourceId(aweme.getAid());
                return aweme;
            }
            return aweme;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final Object LIZJ(InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) throws Throwable {
        C1DFH c1dfh = C0PEM.LIZ;
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C01KB(function1, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    public static final void LJ(C0N0Y c0n0y, C054G c054g, Function2 function2) {
        C23250099c.LIZLLL(c054g, null, null, new C01ME(function2, c0n0y, null), 3);
    }
}
