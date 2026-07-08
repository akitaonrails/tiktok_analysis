package X;

import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zYh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1900610zYh {
    public final EnumC1900710zYr LIZ;
    public final int LIZIZ;
    public final List<NoticeTabModel> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1900610zYh)) {
            return false;
        }
        C1900610zYh c1900610zYh = (C1900610zYh) obj;
        return this.LIZ == c1900610zYh.LIZ && this.LIZIZ == c1900610zYh.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1900610zYh.LIZJ);
    }

    public C1900610zYh(int i, EnumC1900710zYr enumC1900710zYr, List list) {
        this.LIZ = enumC1900710zYr;
        this.LIZIZ = i;
        this.LIZJ = list;
    }
}
