package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;

/* JADX INFO: renamed from: X.0R61, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R61 implements InterfaceC690460R6m {
    public final /* synthetic */ BaseFeedPageParams LIZ;
    public final /* synthetic */ Context LIZIZ;

    public C0R61(Context context, BaseFeedPageParams baseFeedPageParams) {
        this.LIZ = baseFeedPageParams;
        this.LIZIZ = context;
    }

    @Override // X.InterfaceC690460R6m
    public final void LIZ(float f, float f2) {
        int iHashCode;
        if (this.LIZ.isPlayListCleanMode()) {
            return;
        }
        String str = this.LIZ.eventType;
        if (str == null) {
            str = "";
        }
        if (C305580ByO.LIZ(str)) {
            int i = this.LIZ.awemeFromPage;
            Context context = this.LIZIZ;
            if (context != null) {
                iHashCode = context.hashCode();
            } else {
                iHashCode = 0;
            }
            C1440005kM.LIZ(new C1372310lob(f, i, f2, iHashCode));
        }
    }
}
