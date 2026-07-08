package X;

import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.compliance.business.banner.ParentInboxBannerAssem;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zfB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C1904630zfB extends C2217421BqW implements Function0<Unit> {
    public C1904630zfB(Object obj) {
        super(0, obj, ParentInboxBannerAssem.class, "clearWidget", "clearWidget()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InboxBannerAssem inboxBannerAssem = (InboxBannerAssem) this.receiver;
        inboxBannerAssem.getClass();
        inboxBannerAssem.LL.setValue(new Pair(EnumC637310OzB.DISMISS, null));
        KevaImpl.getRepo("vpc_parent_inbox_banner_go_rule", 0).storeBoolean("close_once", true);
        return Unit.LIZ;
    }
}
