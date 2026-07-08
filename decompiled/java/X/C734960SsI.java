package X;

import Y.ACallableS412S0100000_4;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tako.mob.TakoAIVideoMobFiller;
import com.ss.android.ugc.tiktok.pns.feedsafety.api.filtervideo.IFilterVideoService;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SsI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C734960SsI extends AbstractC736370SuZ implements InterfaceC734980SsK {
    public final C1379170lzf LLILZ;
    public final InterfaceC1374230lrh LLILZIL;

    @Override // X.AbstractC1376810lvr
    public final void LIZIZ(View view) {
    }

    @Override // X.InterfaceC734980SsK
    public final void Y80() {
    }

    @Override // X.InterfaceC734980SsK
    public final void y20() {
        Aweme aweme;
        if (Intrinsics.LJFF("homepage_explore", this.LLILZ.LLILLJJLI) && (aweme = this.LLILZ.LL) != null && AwemeExtKt.isPhotoMode(aweme)) {
            C844470XAv.LIZ.getClass();
            C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
            c1233040iBy.LIZIZ(2131857752);
            c1233040iBy.LIZLLL();
            C1379170lzf c1379170lzf = this.LLILZ;
            C1440005kM.LIZ(new C1210880hcE(c1379170lzf.LLILLJJLI, "FUNCTION_FROM_DEFAULT", "not_interested", c1379170lzf.LL));
            return;
        }
        C1379170lzf c1379170lzf2 = this.LLILZ;
        if (c1379170lzf2.LL != null) {
            int i = C621810OaB.LIZ;
            if (C621810OaB.LIZ(this.LLILLJJLI)) {
                IFilterVideoService iFilterVideoService = (IFilterVideoService) PluggableExtentionKt.pluggableSpi$default(IFilterVideoService.class, false, false, false, 14, null);
                if (iFilterVideoService != null) {
                    C1379170lzf c1379170lzf3 = this.LLILZ;
                    iFilterVideoService.LJII(c1379170lzf3.LLILZIL, c1379170lzf3.LL, c1379170lzf3.LLILLJJLI, c1379170lzf3.LLILLL, null);
                }
            } else {
                IFilterVideoService iFilterVideoService2 = (IFilterVideoService) PluggableExtentionKt.pluggableSpi$default(IFilterVideoService.class, false, false, false, 14, null);
                if (iFilterVideoService2 != null) {
                    C1379170lzf c1379170lzf4 = this.LLILZ;
                    iFilterVideoService2.LIZLLL(c1379170lzf4.LLILZIL, c1379170lzf4.LL, c1379170lzf4.LLILLJJLI, c1379170lzf4.LLILLL);
                }
            }
        } else {
            Activity activityLIZ = C1388190mED.LIZ(c1379170lzf2.LLILZIL);
            if (activityLIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131857752);
                c1389890mGx.LJIIJJI();
            }
        }
        Object objLJ = this.LLILZ.LLJILJILJ.LJ("action_orientation");
        Integer num = objLJ instanceof Integer ? (Integer) objLJ : null;
        int iOrdinal = EnumC1369720lkQ.VERTICAL.ordinal();
        if (num == null || num.intValue() != iOrdinal) {
            return;
        }
        C1379170lzf c1379170lzf5 = this.LLILZ;
        C1440005kM.LIZ(new C1210880hcE(c1379170lzf5.LLILLJJLI, "FUNCTION_FROM_DEFAULT", "not_interested", c1379170lzf5.LL));
    }

    public C734960SsI(C1379170lzf c1379170lzf, InterfaceC1374230lrh interfaceC1374230lrh) {
        super(c1379170lzf, interfaceC1374230lrh);
        this.LLILZ = c1379170lzf;
        this.LLILZIL = interfaceC1374230lrh;
        c1379170lzf.LLILZIL.getString(2131857750);
    }

    public final void LJIIJ(View view, C734990SsL c734990SsL) {
        String aid;
        String authorUid;
        String aid2;
        String authorUid2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLILZ.LLILLJJLI);
        Aweme aweme = this.LLILZ.LL;
        String aid3 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        Aweme aweme2 = this.LLILZ.LL;
        if (aweme2 != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme2);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        c2344009Gk.LJIIIIZZ("log_pb", C584850Mwl.LIZ.LIZIZ(C735370Ssx.LJIJJ(this.LLILZ.LL)));
        c2344009Gk.LJIIIIZZ("reason_id", c734990SsL.LIZ);
        c2344009Gk.LJIIIIZZ("reason_text", c734990SsL.LIZIZ);
        c2344009Gk.LJIIIIZZ("music_id", C735370Ssx.LJIILIIL(this.LLILZ.LL));
        c2344009Gk.LJIIIIZZ("enter_method", "long_press");
        c2344009Gk.LJIIIIZZ("click_method", "button");
        C20684815ws.LJIILLIIL("block_videos", c2344009Gk.LIZ);
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        Aweme aweme3 = this.LLILZ.LL;
        if (aweme3 != null) {
            aid2 = aweme3.getAid();
        } else {
            aid2 = null;
        }
        c2344009Gk2.LJIIIIZZ("group_id", aid2);
        Aweme aweme4 = this.LLILZ.LL;
        if (aweme4 != null) {
            authorUid2 = AwemeExtKt.getAuthorUid(aweme4);
        } else {
            authorUid2 = null;
        }
        c2344009Gk2.LJIIIIZZ("author_id", authorUid2);
        c2344009Gk2.LJIIIIZZ("music_id", C735370Ssx.LJIILIIL(this.LLILZ.LL));
        c2344009Gk2.LJIIIIZZ("enter_method", "long_press");
        c2344009Gk2.LJIIIIZZ("submit_item", c734990SsL.LIZ);
        C20684815ws.LJIILLIIL("dislike_creater_and_sound_submit", c2344009Gk2.LIZ);
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C19651011uW c19651011uW = C19651011uW.LIZIZ;
        C735390Ssz c735390Ssz = new C735390Ssz();
        C1379170lzf c1379170lzf = this.LLILZ;
        c735390Ssz.LIZLLL = c1379170lzf.LLILLJJLI;
        c735390Ssz.LJIJI(c1379170lzf.LL);
        c735390Ssz.LJJLIIIJILLIZJL = C735370Ssx.LIZJ(this.LLILZ.LL);
        c735390Ssz.LJJLIIIJJI = C735370Ssx.LIZLLL(this.LLILZ.LL);
        c735390Ssz.LJJLIIIJJIZ = "long_press";
        c735390Ssz.LJJLIIIJLJLI = C735370Ssx.LJIJJ(this.LLILZ.LL);
        if (C1386360mBG.LJI(this.LLILZ.LLILLJJLI)) {
            c735390Ssz.LJJJJJL = C1386360mBG.LJ();
        }
        if (!Intrinsics.LJFF(this.LLILLL, "from_music")) {
            c735390Ssz.LJL = ((FeedCommonService) ServiceManager.get().getService(FeedCommonService.class)).LJJI(view.getContext(), this.LLILLJJLI);
        }
        Object objLJIIIZ = c19651011uW.LJIIIZ(this.LLILZ.LL, c735390Ssz);
        Aweme aweme5 = this.LLILZ.LL;
        c735840Sti.getClass();
        C735840Sti.LIZIZ(aweme5, objLJIIIZ);
        AbstractC1386130mAt abstractC1386130mAt = (AbstractC1386130mAt) objLJIIIZ;
        Context context = view.getContext();
        if (context != null) {
            for (Map.Entry<String, String> entry : TakoAIVideoMobFiller.toParams(C0SUC.LIZ(context)).entrySet()) {
                abstractC1386130mAt.LJ(entry.getKey(), entry.getValue());
            }
        }
        abstractC1386130mAt.LJIILJJIL();
        if (!TextUtils.isEmpty(this.LLILZ.LLILLJJLI)) {
            Aweme aweme6 = this.LLILZ.LL;
            if (aweme6 != null) {
                aid3 = aweme6.getAid();
            }
            if (!TextUtils.isEmpty(aid3)) {
                C328640CuU.LIZ(new C328650CuV(2, this.LLILZ.LL.getAid(), System.currentTimeMillis(), this.LLILZ.LLILLJJLI));
                C328640CuU.LIZ(new C328650CuV(3, this.LLILZ.LL.getAid(), System.currentTimeMillis(), this.LLILZ.LLILLJJLI));
            }
        }
        C1260870iur<C324700Co8, InterfaceC734980SsK> c1260870iur = new C1260870iur<C324700Co8, InterfaceC734980SsK>() { // from class: X.0SsJ
            @Override // X.C1260870iur, X.InterfaceC1526205yG
            public final void onSuccess() {
                InterfaceC734980SsK interfaceC734980SsK = (InterfaceC734980SsK) this.LLILLJJLI;
                if (interfaceC734980SsK != null) {
                    T t = this.LL;
                    if (t != 0) {
                        t.getData();
                    }
                    interfaceC734980SsK.y20();
                }
            }

            @Override // X.C1260870iur, X.InterfaceC1526205yG
            public final void onFailed(Exception exc) {
                InterfaceC734980SsK interfaceC734980SsK = (InterfaceC734980SsK) this.LLILLJJLI;
                if (interfaceC734980SsK != null) {
                    interfaceC734980SsK.Y80();
                }
            }
        };
        c1260870iur.LJIIJ(new AbstractC666100QAu<String>() { // from class: X.0Co8
            @Override // X.AbstractC666100QAu
            public final boolean checkParams(Object... objArr) {
                if (objArr.length == 2) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC666100QAu
            public final boolean sendRequest(Object... objArr) {
                if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
                    return false;
                }
                C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS412S0100000_4(objArr, 10), 0);
                return true;
            }
        });
        c1260870iur.LLILLJJLI = this;
        c1260870iur.LIZJ(this.LLILZ.LL, c734990SsL.LIZ);
        InterfaceC1374230lrh interfaceC1374230lrh = this.LLILZIL;
        if (interfaceC1374230lrh != null) {
            interfaceC1374230lrh.dismiss();
        }
    }
}
