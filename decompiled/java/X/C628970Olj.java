package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0Olj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C628970Olj extends C0N7Z {
    public final C01GW LLILLL;

    public C628970Olj(C0RF0 c0rf0) {
        super(c0rf0);
        this.LLILLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(404));
    }

    @Override // X.C0SZ8
    public final void LJI(Aweme aweme) {
        this.LLILLJJLI = aweme;
        ViewStub viewStub = (ViewStub) this.LL.LIZ.findViewById(R.id.ex5);
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.i8f);
            C786410Ut5.LJLLLL(viewStub);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL.LIZJ), null, null, new C1202550hOn(this, null), 3);
    }

    @Override // X.C0SZ8
    public final void LJJIJIIJIL(int i) {
        String strLIZJ;
        IFeedFragmentAbility iFeedFragmentAbilityLIZ;
        ILoadMoreAbility iLoadMoreAbilityEw0;
        DetailPageComponent detailPageComponentDn1;
        ViewGroup viewGroup = null;
        InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJFF(this.LL.LIZJ, null), IFeedFragmentAbility.class, null);
        if (!(interfaceC494301wDLIZ instanceof IDetailPageAbility)) {
            interfaceC494301wDLIZ = null;
        }
        IDetailPageAbility iDetailPageAbility = (IDetailPageAbility) interfaceC494301wDLIZ;
        if (iDetailPageAbility != null && (detailPageComponentDn1 = iDetailPageAbility.Dn1()) != null) {
            viewGroup = detailPageComponentDn1.LLLII;
        }
        if ((viewGroup instanceof FrameLayout) && viewGroup != null) {
            int measuredHeight = viewGroup.getMeasuredHeight();
            View view = new View(viewGroup.getContext());
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zd);
            view.setBackground(c384050F3z.LIZ(view.getContext()));
            C786410Ut5.W5(view, new FrameLayout.LayoutParams(-1, measuredHeight));
            view.setClickable(true);
            view.setTag("VibeFeedGuideGray");
            if (viewGroup.findViewWithTag("VibeFeedGuideGray") == null) {
                viewGroup.addView(view);
            }
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJ = C1578630rBN.LJ(this.LL.LIZJ);
        if (interfaceC665370Q7zLJ != null && (iFeedFragmentAbilityLIZ = C443040HYw.LIZ(interfaceC665370Q7zLJ)) != null && (iLoadMoreAbilityEw0 = iFeedFragmentAbilityLIZ.Ew0()) != null) {
            iLoadMoreAbilityEw0.oE1();
        }
        String conversationId = this.LL.LJ.param.getConversationId();
        if (conversationId == null) {
            conversationId = "";
        }
        C1575290r5z c1575290r5z = C1575290r5z.LIZ;
        String str = this.LL.LJIIIZ;
        EnumC912680ZrG enumC912680ZrGLJI = C1575440r6E.LJI(conversationId);
        c1575290r5z.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        if (enumC912680ZrGLJI.isPrivate() && (strLIZJ = C1575210r5r.LLILLJJLI.LIZJ(conversationId)) != null) {
            strLIZJ.toString();
            c2344009Gk.LJFF("invitee_uid", strLIZJ);
        }
        c2344009Gk.LJIIIIZZ("conversation_id", conversationId);
        c2344009Gk.LJIIIIZZ("enter_type", "end_of_shared_content");
        c2344009Gk.LJIIIIZZ("chat_type", enumC912680ZrGLJI.stringValue());
        C20684815ws.LJIILLIIL("ttsocial_shared_feed_start_page_show", c2344009Gk.LIZ);
    }

    @Override // X.C0SZ8
    public final void h(boolean z) {
        FrameLayout frameLayout;
        View viewFindViewWithTag;
        DetailPageComponent detailPageComponentDn1;
        ViewGroup viewGroup = null;
        InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJFF(this.LL.LIZJ, null), IFeedFragmentAbility.class, null);
        if (!(interfaceC494301wDLIZ instanceof IDetailPageAbility)) {
            interfaceC494301wDLIZ = null;
        }
        IDetailPageAbility iDetailPageAbility = (IDetailPageAbility) interfaceC494301wDLIZ;
        if (iDetailPageAbility != null && (detailPageComponentDn1 = iDetailPageAbility.Dn1()) != null) {
            viewGroup = detailPageComponentDn1.LLLII;
        }
        if ((viewGroup instanceof FrameLayout) && (frameLayout = (FrameLayout) viewGroup) != null && (viewFindViewWithTag = frameLayout.findViewWithTag("VibeFeedGuideGray")) != null) {
            C786410Ut5.LJJJZ(viewFindViewWithTag, frameLayout);
        }
    }
}
