package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.06Rr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM$interceptShareChannelClick$1", f = "FriendsEmptyPageMainSectionVM.kt", l = {125}, m = "invokeSuspend")
public final class C1608906Rr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC1369790lkX LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ FriendsEmptyPageMainSectionVM LLIZ;
    public final /* synthetic */ InterfaceC1369790lkX LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ Context LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1608906Rr(FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM, InterfaceC1369790lkX interfaceC1369790lkX, String str, String str2, Context context, InterfaceC1364105Vn<? super C1608906Rr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = friendsEmptyPageMainSectionVM;
        this.LLIZLLLIL = interfaceC1369790lkX;
        this.LLJ = str;
        this.LLJI = str2;
        this.LLJIJIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1608906Rr(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String string;
        String uid;
        InterfaceC1369790lkX interfaceC1369790lkX;
        String str;
        String str2;
        Context context;
        User curUser;
        String uid2;
        Object objLJI = obj;
        C1C7U.LIZ("FriendsEmptyPageMainSectionVM@1270.interceptShareChannelClick$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZLL;
        String str3 = "";
        if (i != 0) {
            if (i == 1) {
                string = (String) this.LLILZIL;
                context = (Context) this.LLILZ;
                str2 = (String) this.LLILLL;
                str = (String) this.LLILLJJLI;
                interfaceC1369790lkX = this.LL;
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM = this.LLIZ;
            String strKey = this.LLIZLLLIL.key();
            friendsEmptyPageMainSectionVM.getClass();
            User curUser2 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            string = "https://m.tiktok.com/invitef/download";
            if (C2093608Ic.LJ("https://m.tiktok.com/invitef/download")) {
                string = " ";
            } else {
                if (C2093608Ic.LJ(strKey)) {
                    strKey = CardStruct.IStatusCode.DEFAULT;
                }
                try {
                    Uri.Builder builderBuildUpon = UriProtector.parse("https://m.tiktok.com/invitef/download").buildUpon();
                    if (curUser2 == null) {
                        uid = "";
                    } else {
                        uid = curUser2.getUid();
                    }
                    string = builderBuildUpon.appendQueryParameter("user_id", uid).appendQueryParameter("enter_from", "homepage_friends").appendQueryParameter("invitemode", "invitevia").appendQueryParameter("invitesystem", CardStruct.IStatusCode.DEFAULT).appendQueryParameter("platform", strKey).appendQueryParameter("copytype", CardStruct.IStatusCode.DEFAULT).build().toString();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            C621180OYa.LIZIZ.LJJLI(2, this.LLIZLLLIL.key(), "others_video_share_list");
            if (string != null) {
                FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM2 = this.LLIZ;
                interfaceC1369790lkX = this.LLIZLLLIL;
                str = this.LLJ;
                str2 = this.LLJI;
                context = this.LLJIJIL;
                this.LL = interfaceC1369790lkX;
                this.LLILLJJLI = str;
                this.LLILLL = str2;
                this.LLILZ = context;
                this.LLILZIL = string;
                this.LLILZLL = 1;
                friendsEmptyPageMainSectionVM2.getClass();
                objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C1342605Ng(string, null));
                if (objLJI == objLJFF) {
                    C1C7U.LIZIZ("FriendsEmptyPageMainSectionVM@1270.interceptShareChannelClick$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("FriendsEmptyPageMainSectionVM@1270.interceptShareChannelClick$1");
            return unit;
        }
        String str4 = (String) objLJI;
        if (Intrinsics.LJFF(interfaceC1369790lkX.key(), "email")) {
            interfaceC1369790lkX.LJJIIJ(new C1371430lnB(str4, str, str2), context, null);
        } else {
            interfaceC1369790lkX.LJJIIJ(new C1371430lnB(str4, str2, 4), context, null);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF != null && (curUser = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser()) != null && (uid2 = curUser.getUid()) != null) {
            str3 = uid2;
        }
        c2344009Gk.LJIIIIZZ("from_user_id", str3);
        c2344009Gk.LJIIIIZZ("platform", interfaceC1369790lkX.key());
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_friends");
        c2344009Gk.LJIIIIZZ("enter_method", "empty_page");
        c2344009Gk.LJIIIIZZ("url", string);
        C20684815ws.LJIILLIIL("invite_via", c2344009Gk.LIZ);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FriendsEmptyPageMainSectionVM@1270.interceptShareChannelClick$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
