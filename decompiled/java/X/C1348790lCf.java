package X;

import Y.ACListenerS155S0100000_21;
import Y.AObserverS183S0200000_21;
import Y.AObserverS224S0100000_21;
import Y.AObserverS80S0400000_21;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lCf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1348790lCf {
    public final Fragment LIZ;
    public final ViewGroup LIZIZ;
    public final C19EG LIZJ;
    public final GiftViewModel LIZLLL;
    public final InterfaceC1349160lDG LJ;
    public C1349530lDr LJFF;
    public View LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public final C1355450lNP LJIIIZ;
    public final C1402230mar LJIIJ;

    public final CommentContextSource LJFF() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this.LIZ, null), "source_default_key", CommentContextSource.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            return (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource();
        }
        return null;
    }

    public final void LJIIIIZZ() {
        this.LJ.LIZ();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", "gift_dialog");
        c2344009Gk.LJIIIIZZ("enter_from", LIZLLL());
        c2344009Gk.LJIIIIZZ("group_id", LJ());
        c2344009Gk.LJIIIIZZ("author_id", LIZJ());
        c2344009Gk.LJ(this.LIZLLL.vQ2().getValue(), "current_balance");
        C20684815ws.LJIILLIIL("video_gift_send_click", c2344009Gk.LIZ);
    }

    public final String LIZJ() {
        CommentCommonModel commonModel;
        Aweme aweme;
        String authorUid;
        CommentContextSource commentContextSourceLJFF = LJFF();
        return (commentContextSourceLJFF == null || (commonModel = commentContextSourceLJFF.getCommonModel()) == null || (aweme = commonModel.aweme) == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) ? "" : authorUid;
    }

    public final String LIZLLL() {
        CommentCommonModel commonModel;
        String str;
        CommentContextSource commentContextSourceLJFF = LJFF();
        return (commentContextSourceLJFF == null || (commonModel = commentContextSourceLJFF.getCommonModel()) == null || (str = commonModel.enterFrom) == null) ? "" : str;
    }

    public final String LJ() {
        CommentCommonModel commonModel;
        Aweme aweme;
        String aid;
        CommentContextSource commentContextSourceLJFF = LJFF();
        return (commentContextSourceLJFF == null || (commonModel = commentContextSourceLJFF.getCommonModel()) == null || (aweme = commonModel.aweme) == null || (aid = aweme.getAid()) == null) ? "" : aid;
    }

    public final boolean LIZ(GiftStruct giftStruct) {
        long jLongValue;
        Long value = this.LIZLLL.vQ2().getValue();
        if (value != null) {
            jLongValue = value.longValue();
        } else {
            jLongValue = Long.MIN_VALUE;
        }
        if (!giftStruct.isFromGiftBag() && giftStruct.diamondCount > jLongValue) {
            return false;
        }
        return true;
    }

    public final void LIZIZ(C197039127h c197039127h) {
        c197039127h.setEnabled(false);
        c197039127h.setBackgroundResource(R.drawable.afn);
        c197039127h.setTextColor(a.LIZIZ(R.attr.a1p, this.LIZJ));
        this.LJIIIZ.LJIIIIZZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        if (r2.containsKey(r0) == true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.C197039127h r7) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.setting.services.IVideoGiftService r0 = com.ss.android.ugc.aweme.setting.services.VideoGiftService.LJI()
            boolean r5 = r0.LIZLLL()
            com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel r0 = r6.LIZLLL
            androidx.lifecycle.MutableLiveData r0 = r0.wQ2()
            java.lang.Object r4 = r0.getValue()
            com.ss.android.ugc.aweme.comment.gift.model.GiftStruct r4 = (com.ss.android.ugc.aweme.comment.gift.model.GiftStruct) r4
            boolean r0 = X.C306510Bzt.LIZ()
            r3 = 1
            if (r0 == 0) goto L37
            com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel r0 = r6.LIZLLL
            androidx.lifecycle.MutableLiveData r0 = r0.xQ2()
            java.lang.Object r2 = r0.getValue()
            java.util.HashMap r2 = (java.util.HashMap) r2
            if (r2 == 0) goto L95
            if (r4 == 0) goto L8f
            long r0 = r4.id
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L31:
            boolean r0 = r2.containsKey(r0)
            if (r0 != r3) goto L95
        L37:
            if (r4 != 0) goto L3d
            r6.LIZIZ(r7)
        L3c:
            return
        L3d:
            boolean r0 = r6.LIZ(r4)
            r2 = 2131099768(0x7f060078, float:1.7811899E38)
            r1 = 2130969683(0x7f040453, float:1.7548055E38)
            if (r0 == 0) goto L5e
            r7.setEnabled(r3)
            r7.setBackgroundResource(r1)
            X.19EG r0 = r6.LIZJ
            int r0 = android.view.a.LIZIZ(r2, r0)
            r7.setTextColor(r0)
            X.0lNP r0 = r6.LJIIIZ
            r0.LJIIIIZZ()
            return
        L5e:
            if (r5 == 0) goto L91
            boolean r0 = r6.LIZ(r4)
            if (r0 != 0) goto L91
            r7.setEnabled(r3)
            r7.setBackgroundResource(r1)
            X.19EG r0 = r6.LIZJ
            int r0 = android.view.a.LIZIZ(r2, r0)
            r7.setTextColor(r0)
            X.0lNP r0 = r6.LJIIIZ
            r0.getClass()
            X.127h r2 = r0.LJ
            if (r2 == 0) goto L3c
            X.19EG r0 = r0.LIZIZ
            android.content.Context r1 = X.C786410Ut5.P3(r0)
            r0 = 2131858221(0x7f11932d, float:1.9350224E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setText(r0)
            return
        L8f:
            r0 = 0
            goto L31
        L91:
            r6.LIZIZ(r7)
            return
        L95:
            r6.LIZIZ(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1348790lCf.LJI(X.127h):void");
    }

    public final void LJII(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", str);
        c2344009Gk.LJIIIIZZ("enter_from", LIZLLL());
        c2344009Gk.LJIIIIZZ("group_id", LJ());
        c2344009Gk.LJIIIIZZ("author_id", LIZJ());
        c2344009Gk.LJ(this.LIZLLL.vQ2().getValue(), "current_balance");
        C20684815ws.LJIILLIIL("enter_coin_recharge", c2344009Gk.LIZ);
    }

    public C1348790lCf(Fragment fragment, ViewGroup viewGroup, C19EG c19eg, GiftViewModel giftViewModel, InterfaceC1349160lDG interfaceC1349160lDG) {
        C19U1 c19u1;
        C1349220lDM c1349220lDM;
        C1235900iGa c1235900iGa;
        C1235900iGa c1235900iGa2;
        TextView textView;
        C197039127h c197039127h;
        TextView textView2;
        this.LIZ = fragment;
        this.LIZIZ = viewGroup;
        this.LIZJ = c19eg;
        this.LIZLLL = giftViewModel;
        this.LJ = interfaceC1349160lDG;
        C1355450lNP c1355450lNP = new C1355450lNP(fragment, c19eg, giftViewModel);
        this.LJIIIZ = c1355450lNP;
        this.LJIIJ = new C1402230mar(this, 1);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a2l, viewGroup, false);
        this.LJI = viewTd;
        if (viewTd != null) {
            c19u1 = (C19U1) viewTd.findViewById(R.id.j0q);
        } else {
            c19u1 = null;
        }
        View view = this.LJI;
        if (view != null) {
            c1349220lDM = (C1349220lDM) view.findViewById(R.id.j10);
        } else {
            c1349220lDM = null;
        }
        View view2 = this.LJI;
        if (view2 != null) {
            c1235900iGa = (C1235900iGa) view2.findViewById(R.id.iz6);
        } else {
            c1235900iGa = null;
        }
        View view3 = this.LJI;
        if (view3 != null) {
            c1235900iGa2 = (C1235900iGa) view3.findViewById(R.id.e3t);
        } else {
            c1235900iGa2 = null;
        }
        View view4 = this.LJI;
        if (view4 != null) {
            textView = (TextView) view4.findViewById(R.id.e3r);
        } else {
            textView = null;
        }
        if (C290520Ba6.LIZ()) {
            ViewGroup.LayoutParams layoutParams = c1349220lDM.getLayoutParams();
            layoutParams.height = (int) C12ES.LIZJ(302.0f, c19eg);
            layoutParams.width = -1;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1349220lDM);
            c1349220lDM.setLayoutParams(layoutParams);
        }
        c1349220lDM.setScrollable(true);
        C1349530lDr c1349530lDr = new C1349530lDr(fragment, c19eg, giftViewModel, c1235900iGa, c1355450lNP);
        this.LJFF = c1349530lDr;
        c1349220lDM.setAdapter(c1349530lDr);
        giftViewModel.yQ2().observe(this.LIZJ, new AObserverS80S0400000_21(c1235900iGa, c19u1, this, c1349220lDM, 0));
        giftViewModel.LLJILLL.observe(this.LIZJ, new AObserverS224S0100000_21(c1349220lDM, 57));
        giftViewModel.yQ2().observe(this.LIZJ, new AObserverS80S0400000_21(c1235900iGa, c19u1, this, c1349220lDM, 1));
        View view5 = this.LJI;
        if (view5 != null) {
            c197039127h = (C197039127h) view5.findViewById(R.id.upg);
        } else {
            c197039127h = null;
        }
        c1355450lNP.LJ = c197039127h;
        giftViewModel.wQ2().observe(this.LIZJ, new AObserverS183S0200000_21(this, c197039127h, 5));
        if (C306510Bzt.LIZ()) {
            giftViewModel.xQ2().observe(this.LIZJ, new AObserverS183S0200000_21(this, c197039127h, 6));
        }
        giftViewModel.vQ2().observe(this.LIZJ, new AObserverS80S0400000_21(this, c197039127h, c1235900iGa2, textView, 2));
        C786410Ut5.U8(c197039127h, new ACListenerS155S0100000_21(this, 120));
        View view6 = this.LJI;
        if (view6 != null) {
            textView2 = (TextView) view6.findViewById(R.id.sw4);
        } else {
            textView2 = null;
        }
        C786410Ut5.T7(textView2, new ACListenerS155S0100000_21(this, 121));
        giftViewModel.BQ2(0, 0L, c19eg, "");
        giftViewModel.wQ2().observe(this.LIZJ, new AObserverS224S0100000_21(this, 54));
        ((LiveData) giftViewModel.LLILZIL.getValue()).observe(this.LIZJ, new AObserverS224S0100000_21(this, 55));
    }
}
