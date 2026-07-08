package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinAutoPlayViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0OM0, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OM0 extends C09AY implements Function1<C618040OLy, Unit> {
    public final /* synthetic */ BulletinAutoPlayViewModel LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Throwable LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OM0(BulletinAutoPlayViewModel bulletinAutoPlayViewModel, boolean z, int i, Throwable th) {
        super(1);
        this.LL = bulletinAutoPlayViewModel;
        this.LLILLJJLI = z;
        this.LLILLL = i;
        this.LLILZ = th;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C618040OLy c618040OLy) {
        this.LL.setState(new C618050OLz(this.LLILLL, this.LLILZ, this.LLILLJJLI));
        return Unit.LIZ;
    }
}
