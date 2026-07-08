package X;

import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.share.QuickShareCandidate;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareButtonAssem;
import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareVM;
import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.UpdateContentionAbility;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS67S1000000_16;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0cFL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareButtonAssem$tryToDisplayComponent$1", f = "QuickShareButtonAssem.kt", l = {474}, m = "invokeSuspend")
public final class C1004490cFL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public C259800zU LLILLJJLI;
    public C259800zU LLILLL;
    public C259800zU LLILZ;
    public int LLILZIL;
    public final /* synthetic */ VideoItemParams LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ QuickShareButtonAssem LLIZLLLIL;
    public final /* synthetic */ AbstractC608770NuF LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1004490cFL(VideoItemParams videoItemParams, String str, QuickShareButtonAssem quickShareButtonAssem, AbstractC608770NuF abstractC608770NuF, InterfaceC1364105Vn<? super C1004490cFL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = videoItemParams;
        this.LLIZ = str;
        this.LLIZLLLIL = quickShareButtonAssem;
        this.LLJ = abstractC608770NuF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1004490cFL(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C259800zU c259800zU;
        C259800zU c259800zU2;
        C259800zU c259800zU3;
        C259800zU c259800zU4;
        String str;
        String str2;
        Boolean bool;
        int followStatus;
        String curUserId;
        UpdateContentionAbility updateContentionAbility;
        Object objLJI = obj;
        C1C7U.LIZ("QuickShareButtonAssem@fab9.tryToDisplayComponent$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZIL;
        if (i != 0) {
            if (i == 1) {
                c259800zU4 = this.LLILZ;
                c259800zU3 = this.LLILLL;
                c259800zU2 = this.LLILLJJLI;
                c259800zU = this.LL;
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            c259800zU = new C259800zU();
            c259800zU2 = new C259800zU();
            c259800zU3 = new C259800zU();
            c259800zU4 = new C259800zU();
            C1720006oQ.LJ("QuickShareAssem", "start async handle");
            C1DFB c1dfb = C0PEM.LIZJ;
            C1004460cFI c1004460cFI = new C1004460cFI(this.LLIZ, this.LLILZLL, this.LLIZLLLIL, c259800zU2, c259800zU4, c259800zU, c259800zU3, null);
            this.LL = c259800zU;
            this.LLILLJJLI = c259800zU2;
            this.LLILLL = c259800zU3;
            this.LLILZ = c259800zU4;
            this.LLILZIL = 1;
            objLJI = C23250099c.LJI(this, c1dfb, c1004460cFI);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("QuickShareButtonAssem@fab9.tryToDisplayComponent$1");
                return objLJFF;
            }
        }
        if (!((Boolean) objLJI).booleanValue()) {
            C1720006oQ.LJ("QuickShareAssem", "has not handle,need move to next");
            Map<String, Integer> map = C1374650lsN.LIZ;
            if (C1374650lsN.LIZ(this.LLILZLL.getAweme()) && Intrinsics.LJFF(this.LLIZ, "like") && (updateContentionAbility = (UpdateContentionAbility) this.LLIZLLLIL.LLLIIIIL.getValue()) != null) {
                updateContentionAbility.hl2();
            }
            AbstractC608770NuF abstractC608770NuF = this.LLJ;
            if (abstractC608770NuF != null) {
                abstractC608770NuF.LIZJ("quick_share_assem_has_not_handle");
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("QuickShareButtonAssem@fab9.tryToDisplayComponent$1");
            return unit;
        }
        C1720006oQ.LJ("QuickShareAssem", "start try to show quick share button");
        IMContact iMContact = (IMContact) c259800zU.element;
        if (iMContact != null) {
            VideoItemParams videoItemParams = this.LLILZLL;
            QuickShareButtonAssem quickShareButtonAssem = this.LLIZLLLIL;
            String str3 = this.LLIZ;
            C1004550cFR c1004550cFR = C1004550cFR.LIZIZ;
            String aid = videoItemParams.getAweme().getAid();
            c1004550cFR.getClass();
            ((Map) C1004550cFR.LJIILJJIL.getValue()).put(aid, iMContact);
            C0RJE.LIZ(quickShareButtonAssem, new AwS560S0100000_16(quickShareButtonAssem, 321));
            QuickShareVM quickShareVMGp = quickShareButtonAssem.Gp();
            quickShareVMGp.getClass();
            quickShareVMGp.setState(new AwS67S1000000_16(str3, 10));
            QuickShareCandidate quickShareCandidate = (QuickShareCandidate) c259800zU3.element;
            IMUser iMUser = null;
            if (quickShareCandidate != null) {
                str = quickShareCandidate.extraInfo;
            } else {
                str = null;
            }
            C178200mK.LIZ(str);
            C1004770cFn c1004770cFn = C1004770cFn.LIZ;
            String aid2 = videoItemParams.getAweme().getAid();
            String authorUid = AwemeExtKt.getAuthorUid(videoItemParams.getAweme());
            String str4 = videoItemParams.mEventType;
            C1004480cFK c1004480cFK = (C1004480cFK) c259800zU2.element;
            if (c1004480cFK != null) {
                str2 = c1004480cFK.LIZJ;
                bool = c1004480cFK.LJFF;
            } else {
                str2 = null;
                bool = null;
            }
            Map map2 = (Map) c259800zU4.element;
            c1004770cFn.getClass();
            C1004770cFn.LIZJ(true, aid2, authorUid, str3, str4, iMContact, str2, bool, map2);
            C1004470cFJ.LIZ(true, videoItemParams.getAweme(), videoItemParams.mEventType, str3, iMContact, (C1004480cFK) c259800zU2.element, "", false, (Map) c259800zU4.element);
            IInternalShareApi.LIZ.getClass();
            InterfaceC1367800lhK interfaceC1367800lhKLIZJ = C1370970lmR.LIZ().LIZJ();
            C13DA c13da = new C13DA();
            c13da.put("enter_from", videoItemParams.mEventType);
            c13da.put("enter_method", "quick_share_button");
            c13da.put("rank_num", CardStruct.IStatusCode.DEFAULT);
            c13da.put("panel_source", "quick_share_button");
            c13da.put("content_type", "video");
            c13da.put("position", "panel");
            T t = c259800zU.element;
            if (t instanceof IMUser) {
                iMUser = (IMUser) t;
            }
            int followStatus2 = 0;
            if (iMUser != null) {
                followStatus = iMUser.getFollowStatus();
            } else {
                followStatus = 0;
            }
            c13da.put("relation_tag", String.valueOf(followStatus));
            User author = videoItemParams.getAweme().getAuthor();
            if (author != null) {
                followStatus2 = author.getFollowStatus();
            }
            c13da.put("author_follow_status", String.valueOf(followStatus2));
            Map mapBuild = c13da.build();
            IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
            if (iAccountUserServiceLJFF == null || (curUserId = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUserId()) == null) {
                curUserId = "";
            }
            interfaceC1367800lhKLIZJ.LJIIJ(iMContact, 0, null, false, curUserId, C0I0B.LJFF.LIZIZ(), mapBuild);
            quickShareButtonAssem.Up(videoItemParams.getAweme().getAid());
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("QuickShareButtonAssem@fab9.tryToDisplayComponent$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
