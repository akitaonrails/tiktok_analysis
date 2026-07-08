package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.analytics.IIMNewChatDetailAnalytics;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseActionViewModel;
import com.ss.android.ugc.aweme.im.service.IAuthorSupporterHelper;
import com.ss.android.ugc.aweme.profile.util.IUserProfilePreload;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.06oh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1721706oh extends C09AY implements Function2<BaseActionViewModel<?>, Activity, Unit> {
    public final /* synthetic */ AtomicReference<IMUser> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ IMUser LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1721706oh(IMUser iMUser, String str, AtomicReference atomicReference, boolean z) {
        super(2);
        this.LL = atomicReference;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = iMUser;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(BaseActionViewModel<?> baseActionViewModel, Activity activity) {
        IAuthorSupporterHelper iAuthorSupporterHelper;
        Map mapLIZIZ;
        IIMNewChatDetailAnalytics iIMNewChatDetailAnalytics = (IIMNewChatDetailAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMNewChatDetailAnalytics.class);
        if (iIMNewChatDetailAnalytics != null) {
            String str = this.LLILLL;
            String uid = this.LLILZ.getUid();
            if (str != null && str.length() != 0 && uid != null && uid.length() != 0 && (mapLIZIZ = iIMNewChatDetailAnalytics.LIZIZ("private", str, uid)) != null) {
                iIMNewChatDetailAnalytics.LIZ("ttsocial_chat_view_profile_btn_click", mapLIZIZ, C0I0B.LJFF.LIZIZ());
            }
        }
        AtomicReference<IMUser> atomicReference = this.LL;
        boolean z = this.LLILLJJLI;
        IMUser iMUser = atomicReference.get();
        if (iMUser != null && (!z || ((iAuthorSupporterHelper = (IAuthorSupporterHelper) PluggableExtentionKt.pluggableSpiForReal(IAuthorSupporterHelper.class)) != null && iAuthorSupporterHelper.LIZJ()))) {
            IMContactApi.LIZ.getClass();
            C069P.LIZ().LIZLLL().LIZIZ(iMUser.getUid());
            IUserProfilePreload iUserProfilePreload = (IUserProfilePreload) PluggableExtentionKt.pluggableSpiForReal(IUserProfilePreload.class);
            if (iUserProfilePreload != null) {
                IMUser.Companion.getClass();
                iUserProfilePreload.LIZ(C2201941BFw.LJII(iMUser));
            }
            C879350Yeb c879350Yeb = C879350Yeb.LIZ;
            String uid2 = iMUser.getUid();
            c879350Yeb.getClass();
            C879350Yeb.LIZ(uid2, "click_view_profile_btn", "chat_settings");
            IIMChatAnalytics.LIZ.getClass();
            IIMChatAnalytics iIMChatAnalyticsLIZ = C1705506m5.LIZ();
            if (iIMChatAnalyticsLIZ != null) {
                iIMChatAnalyticsLIZ.LJIIIIZZ(C0I0B.LJFF.LIZIZ(), Integer.valueOf(iMUser.getFollowStatus()), iMUser.getUid(), "click_view_profile_btn", String.valueOf(System.currentTimeMillis()));
            }
        }
        return Unit.LIZ;
    }
}
