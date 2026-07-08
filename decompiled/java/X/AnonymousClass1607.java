package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: renamed from: X.1607, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1607 implements C160K {
    public final InterfaceC20703115zp LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AnonymousClass1606(this));

    @Override // X.C160K
    public final void EK() {
    }

    @Override // X.C160K
    public final void PU1(Context context) {
    }

    @Override // X.C160K
    public final void cL2(boolean z) {
    }

    @Override // X.C160K
    public final void vD2(C0Q69 c0q69) {
    }

    public AnonymousClass1607(InterfaceC20703115zp interfaceC20703115zp) {
        this.LL = interfaceC20703115zp;
    }

    @Override // X.C160K
    public final void En1(VideoItemParams videoItemParams) {
        String aid;
        AnonymousClass1608 anonymousClass1608 = (AnonymousClass1608) this.LLILLJJLI.getValue();
        Aweme aweme = videoItemParams.getAweme();
        String str = videoItemParams.mEventType;
        anonymousClass1608.LIZ = aweme;
        String authorUid = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        anonymousClass1608.LIZIZ = aid;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        }
        anonymousClass1608.LIZJ = authorUid;
        anonymousClass1608.LIZLLL = str;
    }
}
