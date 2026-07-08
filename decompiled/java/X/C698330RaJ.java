package X;

import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.feed.platform.componentmanager.data.FCPConfigState;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;

/* JADX INFO: renamed from: X.0RaJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698330RaJ implements C0RKW {
    public final C0RZZ LIZ;

    public final C701880Rg2 LIZIZ() {
        C701830Rfx c701830Rfx;
        InterfaceC2753014t fcpStoreSource = AwemeBizExtKt.getFcpStoreSource(this.LIZ.LIZIZ);
        if (!(fcpStoreSource instanceof C701830Rfx) || (c701830Rfx = (C701830Rfx) fcpStoreSource) == null) {
            return null;
        }
        return c701830Rfx.LL;
    }

    @Override // X.C0RKW
    public final FeedComponentPriorityData LIZ() {
        FCPConfigState fCPConfigStateLIZIZ;
        C701880Rg2 c701880Rg2LIZIZ = LIZIZ();
        if (c701880Rg2LIZIZ == null || (fCPConfigStateLIZIZ = c701880Rg2LIZIZ.LIZIZ()) == null) {
            return null;
        }
        return fCPConfigStateLIZIZ.activeConfig;
    }

    public C698330RaJ(C0RZZ c0rzz) {
        this.LIZ = c0rzz;
    }
}
