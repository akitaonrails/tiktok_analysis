package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.IInboxRepostFeedService;
import com.ss.android.ugc.aweme.InboxRepostFeedServiceImpl;
import java.util.List;

/* JADX INFO: renamed from: X.0mCm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387300mCm implements IInboxRepostFeedService {
    public static final C1387300mCm LIZIZ = new C1387300mCm();
    public final /* synthetic */ IInboxRepostFeedService LIZ;

    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final void LIZ(String str) {
        this.LIZ.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final List<String> LIZIZ(int i) {
        return this.LIZ.LIZIZ(i);
    }

    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final void LIZJ() {
        this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final void LIZLLL() {
        this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final void LJ() {
        this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final void LJFF(Fragment fragment) {
        this.LIZ.LJFF(fragment);
    }

    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final void LJI() {
        this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final boolean LJII(int i) {
        return this.LIZ.LJII(i);
    }

    public C1387300mCm() {
        IInboxRepostFeedService iInboxRepostFeedService;
        Object objLIZ = C04TD.LIZ(IInboxRepostFeedService.class, false);
        if (objLIZ != null) {
            iInboxRepostFeedService = (IInboxRepostFeedService) objLIZ;
        } else {
            if (C04TD.LJJLIIJ == null) {
                synchronized (IInboxRepostFeedService.class) {
                    if (C04TD.LJJLIIJ == null) {
                        C04TD.LJJLIIJ = new InboxRepostFeedServiceImpl();
                    }
                }
            }
            iInboxRepostFeedService = C04TD.LJJLIIJ;
        }
        this.LIZ = iInboxRepostFeedService;
    }
}
