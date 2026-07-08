package X;

import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0QR9, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QR9 {
    public static final C0QR9 LIZ = new C0QR9();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(712));
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);

    public static String LIZ() {
        String strLJIJ = ((ICommonFeedApiService) ServiceManager.get().getService(ICommonFeedApiService.class)).LJIJ();
        return (strLJIJ == null || strLJIJ.length() == 0) ? "" : strLJIJ;
    }
}
