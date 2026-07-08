package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.analytics.IImImproveBlockExperienceAnalytics;
import com.ss.android.ugc.aweme.im.service.service.IBlockUserController;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YtH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C888450YtH extends AbstractC880120Yfq {
    public final int LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;

    @Override // X.AbstractC880120Yfq
    public final void LIZ() {
        IMUser iMUser = this.LLILZIL;
        if (iMUser == null) {
            return;
        }
        IImImproveBlockExperienceAnalytics iImImproveBlockExperienceAnalytics = (IImImproveBlockExperienceAnalytics) ServiceManager.get().getService(IImImproveBlockExperienceAnalytics.class);
        boolean zIsBlock = iMUser.isBlock();
        String uid = iMUser.getUid();
        if (uid == null) {
            uid = "";
        }
        iImImproveBlockExperienceAnalytics.LJI(uid, zIsBlock);
        AbstractC880120Yfq.LJFF(this, iMUser.isBlock() ? "unblock" : "block", null, null, 6);
        IBlockUserController.Factory factory = (IBlockUserController.Factory) ServiceManager.get().getService(IBlockUserController.Factory.class);
        Activity activity = this.LL;
        C0Y8T c0y8t = this.LLILZ;
        factory.LIZ(activity, iMUser, "chat_list_page", "button", AFwS201S0000000_14.get$arr$(260), AFwS248S0000000_14.get$arr$(287), AFwS248S0000000_14.get$arr$(288), null, c0y8t != null ? c0y8t.getConversationId() : null).LIZ(new AwS415S0200000_14(this, iMUser, 107), new AwS415S0200000_14(this, iMUser, 108));
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZIZ() {
        return ((Number) this.LLJIJIL.getValue()).intValue();
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZLLL() {
        return ((Number) this.LLJI.getValue()).intValue();
    }

    @Override // X.AbstractC880120Yfq
    public final boolean LJI() {
        IMUser iMUser;
        C0Y8T c0y8t = this.LLILZ;
        return c0y8t == null || !c0y8t.isSingleChat() || (iMUser = this.LLILZIL) == null || Intrinsics.LJFF(iMUser.getUid(), C461720I8s.LIZIZ());
    }

    @Override // X.AbstractC880120Yfq
    public final int LJ() {
        return this.LLJ;
    }

    public C888450YtH(Activity activity, C879540Yeu<?> c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
        int i;
        super(activity, c879540Yeu, interfaceC879010Ye3);
        if (AbstractC880120Yfq.LIZJ() == C05RV.PERSONAL_INBOX) {
            i = 0;
        } else {
            i = 1;
        }
        this.LLJ = i;
        this.LLJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1474));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1473));
    }
}
