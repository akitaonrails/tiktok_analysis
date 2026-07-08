package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.UploadSingleSelectData;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0KnA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C527940KnA {
    public static final C527940KnA LIZ = new C527940KnA();
    public static final C01GW LIZIZ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS194S0000000_8.get$arr$(157));

    public static final UploadSingleSelectData LIZ() {
        LIZ.getClass();
        return (UploadSingleSelectData) LIZIZ.getValue();
    }

    public static final boolean LIZIZ() {
        return (((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LJI() || C0CHQ.LIZ().getAccountService().LIZ()) ? false : true;
    }

    public static final boolean LIZJ() {
        return ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LJI() && !C0CHQ.LIZ().getAccountService().LIZ();
    }
}
