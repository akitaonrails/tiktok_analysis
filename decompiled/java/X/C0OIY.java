package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceFunction;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0OIY, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OIY extends C09AY implements Function0<Unit> {
    public final /* synthetic */ BulletinProfileViewModel LL;
    public final /* synthetic */ InboxEntranceFunction LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C617220OIu LLILZ;
    public final /* synthetic */ C118300cf LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OIY(int i, BulletinProfileViewModel bulletinProfileViewModel, C617220OIu c617220OIu, InboxEntranceFunction inboxEntranceFunction, String str, C118300cf c118300cf) {
        super(0);
        this.LL = bulletinProfileViewModel;
        this.LLILLJJLI = inboxEntranceFunction;
        this.LLILLL = i;
        this.LLILZ = c617220OIu;
        this.LLILZIL = c118300cf;
        this.LLILZLL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        BulletinProfileViewModel bulletinProfileViewModel = this.LL;
        InboxEntranceFunction inboxEntranceFunction = this.LLILLJJLI;
        bulletinProfileViewModel.withState(new C617250OIx(this.LLILLL, bulletinProfileViewModel, this.LLILZ, inboxEntranceFunction, this.LLILZLL, this.LLILZIL));
        return Unit.LIZ;
    }
}
