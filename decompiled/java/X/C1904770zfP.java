package X;

import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;

/* JADX INFO: renamed from: X.0zfP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1904770zfP implements C0WHU {
    public static final C1904770zfP LIZ = new C1904770zfP();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(639));
    public static InterfaceC1587510rPh LIZJ;
    public static WeakReference<C19EG> LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;

    public static C1604710rrR LIZIZ() {
        return (C1604710rrR) LIZIZ.getValue();
    }

    @Override // X.C0WHU
    public final void LIZ(C0WHR c0whr) {
        C19EG c19eg;
        LIZJ = c0whr;
        WeakReference<C19EG> weakReference = LIZLLL;
        if (weakReference != null && (c19eg = weakReference.get()) != null) {
            ((FeedCommonService) ServiceManager.get().getService(FeedCommonService.class)).LJIILJJIL(c19eg, "search", AFwS217S0000000_28.get$arr$(640), AFwS271S0000000_28.get$arr$(388), null, null);
        }
    }
}
