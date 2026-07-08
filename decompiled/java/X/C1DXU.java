package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.hostinject.IMusicAddToDspCoreHostApi;

/* JADX INFO: renamed from: X.1DXU, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DXU implements IMusicAddToDspCoreHostApi {
    public static final C1DXU LIZIZ = new C1DXU();
    public final /* synthetic */ IMusicAddToDspCoreHostApi LIZ;

    @Override // com.ss.android.ugc.aweme.music.hostinject.IMusicAddToDspCoreHostApi
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.music.hostinject.IMusicAddToDspCoreHostApi
    public final String LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.music.hostinject.IMusicAddToDspCoreHostApi
    public final C06W4 LIZJ() {
        return this.LIZ.LIZJ();
    }

    public C1DXU() {
        Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(IMusicAddToDspCoreHostApi.class, false, false, false, 14, null);
        if (objPluggableSpi$default != null) {
            this.LIZ = (IMusicAddToDspCoreHostApi) objPluggableSpi$default;
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
