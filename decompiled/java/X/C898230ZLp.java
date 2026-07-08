package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.LightInteractionManager;
import com.ss.android.ugc.aweme.im.saas.host.api.friends.IMFriendsService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ZLp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C898230ZLp extends C09AY implements Function1<C0SY7, Unit> {
    public final /* synthetic */ LifecycleOwner LL;
    public final /* synthetic */ RelationButton LLILLJJLI;
    public final /* synthetic */ User LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ InterfaceC898240ZLq LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C898230ZLp(LifecycleOwner lifecycleOwner, RelationButton relationButton, User user, String str, String str2, String str3, InterfaceC898240ZLq interfaceC898240ZLq) {
        super(1);
        this.LL = lifecycleOwner;
        this.LLILLJJLI = relationButton;
        this.LLILLL = user;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = interfaceC898240ZLq;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0SY7 c0sy7) {
        String enterFrom;
        if (c0sy7 == C0SY7.FOLLOW_MUTUAL) {
            LightInteractionManager lightInteractionManager = LightInteractionManager.LLJILLL;
            LifecycleOwner lifecycleOwnerLJI = this.LL;
            String enterMethod = null;
            if (lifecycleOwnerLJI == null) {
                IMFriendsService.LIZ.getClass();
                IMFriendsService iMFriendsServiceLIZ = C898270ZLt.LIZ();
                if (iMFriendsServiceLIZ != null) {
                    lifecycleOwnerLJI = iMFriendsServiceLIZ.LJI(this.LLILLJJLI.getContext());
                } else {
                    lifecycleOwnerLJI = null;
                }
            }
            InterfaceC892560Yzu interfaceC892560YzuLJJIJIIJIL = lightInteractionManager.LJJIJIIJIL(lifecycleOwnerLJI);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILLL.getUid());
            sbLIZ.append(this.LLILZ);
            sbLIZ.append(this.LLILZIL);
            sbLIZ.append(this.LLILZLL);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            InterfaceC898240ZLq interfaceC898240ZLq = this.LLIZ;
            if (interfaceC898240ZLq != null) {
                enterFrom = interfaceC898240ZLq.getEnterFrom();
            } else {
                enterFrom = null;
            }
            InterfaceC898240ZLq interfaceC898240ZLq2 = this.LLIZ;
            if (interfaceC898240ZLq2 != null) {
                enterMethod = interfaceC898240ZLq2.getEnterMethod();
            }
            interfaceC892560YzuLJJIJIIJIL.LIZIZ(strLIZIZ, enterFrom, enterMethod, null, null, null, lightInteractionManager.LJII(this.LLILZLL));
        }
        return Unit.LIZ;
    }
}
