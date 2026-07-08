package X;

import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;

/* JADX INFO: renamed from: X.0RHa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC693200RHa implements Runnable {
    public final /* synthetic */ VideoAuthorInfoRelationAssem LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C1AV2 LLILLL;

    public RunnableC693200RHa(VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem, int i, C1AV2 c1av2) {
        this.LL = videoAuthorInfoRelationAssem;
        this.LLILLJJLI = i;
        this.LLILLL = c1av2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("VideoAuthorInfoRelationAssem@40b3.setContainerVisibility$1");
        try {
            C2180521AVm.LIZLLL(this.LL.LJJIJL(), this.LLILLJJLI, this.LLILLL);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoAuthorInfoRelationAssem@40b3.setContainerVisibility$1");
    }
}
