package X;

import com.ss.android.ugc.aweme.ad.recording.engageinfo.IAdLandPageEngageInfoProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1022720cik extends C09AY implements Function0<IAdLandPageEngageInfoProvider> {
    public C1022720cik() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ad.recording.engageinfo.IAdLandPageEngageInfoProvider, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IAdLandPageEngageInfoProvider invoke() {
        return ServiceManager.get().getService(IAdLandPageEngageInfoProvider.class);
    }
}
