package X;

import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.aweme.commercialize.search.ISearchAdEventLogger;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS630S0100000_16;

/* JADX INFO: renamed from: X.0cQ2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1011120cQ2 extends AbstractC1010710cPN<RelationButton> {
    public final C01GW LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public InterfaceC1010450cOx LLJ;
    public IVideoPlayTaskManager LLJI;
    public boolean LLJIJIL;
    public long LLJILJIL;
    public boolean LLJILJILJ;

    @Override // X.AbstractC1010710cPN, X.C0PPF
    public final void onViewAttachedToWindow() {
    }

    @Override // X.AbstractC1010710cPN, X.C0PPF
    public final void onViewDetachedFromWindow() {
        LJIIJ(false);
        this.LLJIJIL = false;
    }

    public final void LJII() {
        int i = C2510609se.LIZ;
        Context context = this.LLILZ;
        if (context != null) {
            C423340Giq.LIZIZ(LIZIZ(), C1308910kAL.LIZJ(R.attr.a1p, context), C1308910kAL.LIZJ(R.attr.a04, context));
            this.LL.LJFF.LIZ = 3;
        }
    }

    @Override // X.AbstractC1010710cPN
    /* JADX INFO: renamed from: LJIIIZ, reason: merged with bridge method [inline-methods] */
    public final RelationButton LIZIZ() {
        return (RelationButton) this.LLILZLL.getValue();
    }

    public final void LJIIL() {
        IVideoPlayTaskManager iVideoPlayTaskManager = this.LLJI;
        if (iVideoPlayTaskManager != null) {
            C988300bpE c988300bpE = new C988300bpE("transformBtnChangeColor");
            c988300bpE.LIZIZ(this.LLJILJIL);
            c988300bpE.LIZJ = this.LLIZLLLIL;
            c988300bpE.LIZLLL = new ARunnableS116S0100000_16(this, 169);
            c988300bpE.LJ = false;
            iVideoPlayTaskManager.LLIFFJFJJ(c988300bpE.LIZ());
        }
    }

    public final void LJIJI() {
        IVideoPlayTaskManager iVideoPlayTaskManager = this.LLJI;
        if (iVideoPlayTaskManager != null) {
            C988300bpE c988300bpE = new C988300bpE("transformBtnShow");
            c988300bpE.LIZIZ(this.LLJILJIL);
            c988300bpE.LIZJ = this.LLIZ;
            c988300bpE.LIZLLL = new ARunnableS116S0100000_16(this, 170);
            c988300bpE.LJ = false;
            iVideoPlayTaskManager.LLIFFJFJJ(c988300bpE.LIZ());
        }
    }

    public final void LJIJJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showFollowButton , hasFollowed = ");
        Aweme aweme = this.LLILLJJLI;
        sbLIZ.append(aweme != null ? Boolean.valueOf(C1017070cZd.LLFF(aweme)) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2510609se.LIZ;
        Aweme aweme2 = this.LLILLJJLI;
        if (aweme2 == null || !C1017070cZd.LLFF(aweme2)) {
            C423340Giq.LIZJ(LIZIZ(), 22, true);
            C1010580cPA c1010580cPA = this.LL;
            c1010580cPA.LJFF.LIZ = 2;
            if (this.LLJIJIL) {
                return;
            }
            ISearchAdEventLogger iSearchAdEventLogger = c1010580cPA.LJ;
            C1009980cOC.LIZ.getClass();
            iSearchAdEventLogger.logAd(C1009980cOC.LJI);
            this.LLJIJIL = true;
        }
    }

    @Override // X.AbstractC1010710cPN, X.C0PPF
    public final void bind() {
        User author;
        ViewGroup viewGroup;
        Context context;
        if (C1011530cQh.LIZ().enableNewBottomLayout) {
            ViewGroup viewGroup2 = this.LL.LIZ;
            View viewLIZIZ = null;
            if (viewGroup2 != null && (viewGroup = (ViewGroup) viewGroup2.findViewById(R.id.u65)) != null) {
                View viewFindViewById = viewGroup.findViewById(R.id.u5x);
                if (viewFindViewById != null) {
                    C786410Ut5.LJJJLZIJ(viewFindViewById, viewGroup);
                    this.LLJILJILJ = false;
                    int i = C2510609se.LIZ;
                }
                if (!this.LLJILJILJ) {
                    ViewGroup viewGroup3 = this.LL.LIZ;
                    if (viewGroup3 != null && (context = viewGroup3.getContext()) != null) {
                        viewLIZIZ = C21146717pB.LIZIZ(context, R.layout.et4, viewGroup, false);
                    }
                    viewGroup.addView(viewLIZIZ);
                    this.LLJILJILJ = true;
                    int i2 = C2510609se.LIZ;
                }
            }
        }
        RelationButton relationButtonLIZIZ = LIZIZ();
        if (relationButtonLIZIZ != null) {
            C786410Ut5.t0(relationButtonLIZIZ, 0);
            C631450Opj.LIZ(relationButtonLIZIZ, Float.valueOf(C418440Gaw.LIZIZ(2)), null, null, null, null, 30);
            relationButtonLIZIZ.setFollowClickListener(new AwS630S0100000_16(this, 70));
            Aweme aweme = this.LLILLJJLI;
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                C1387050mCN c1387050mCN = new C1387050mCN(author);
                c1387050mCN.LJFF = EnumC2274741E1w.TUX_SEMI_TRANSPARENT;
                relationButtonLIZIZ.LLLLZIL(c1387050mCN.LIZ());
            }
            relationButtonLIZIZ.setButtonVariant(2);
            C427690Gpr.LJ(relationButtonLIZIZ, 0.0f);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bind SearchAdFollowBtnComponent componentView = ");
        sbLIZ.append(LIZIZ());
        C2188811AlT.LIZIZ(sbLIZ);
        int i3 = C2510609se.LIZ;
        InterfaceC1011430cQX interfaceC1011430cQX = this.LL.LIZLLL;
        if (interfaceC1011430cQX != null) {
            interfaceC1011430cQX.LIZLLL(EnumC1011130cQ3.MASK_FOLLOW_CLICK, new AwS560S0100000_16(this, 769));
        }
        InterfaceC1011430cQX interfaceC1011430cQX2 = this.LL.LIZLLL;
        if (interfaceC1011430cQX2 != null) {
            interfaceC1011430cQX2.LIZLLL(EnumC1011130cQ3.ENTER_DETAIL, new AwS560S0100000_16(this, 770));
        }
        InterfaceC1011430cQX interfaceC1011430cQX3 = this.LL.LIZLLL;
        if (interfaceC1011430cQX3 != null) {
            interfaceC1011430cQX3.LIZLLL(EnumC1011130cQ3.RETURN_FROM_DETAIL, new AwS560S0100000_16(this, 771));
        }
    }

    public C1011120cQ2(C1010580cPA c1010580cPA) {
        float f;
        super(c1010580cPA);
        this.LLILZLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 772));
        AwemeSearchAdModel awemeSearchAdModel = this.LLILLL;
        if (awemeSearchAdModel != null) {
            f = awemeSearchAdModel.showButtonSeconds;
        } else {
            f = 0.0f;
        }
        this.LLIZ = (int) (f * 1000.0f);
        this.LLIZLLLIL = (int) ((awemeSearchAdModel != null ? awemeSearchAdModel.buttonColorShowSeconds : 0.0f) * 1000.0f);
        this.LLJILJIL = -1L;
    }

    @Override // X.AbstractC1010710cPN
    public final void LIZJ(InterfaceC1010450cOx interfaceC1010450cOx) {
        this.LLJ = interfaceC1010450cOx;
        C1009940cO8.LIZIZ(interfaceC1010450cOx, this.LLILZIL, C2097908Jt.LIZJ(new Pair(C1010930cPj.LIZ, new AwS417S0200000_16(this, interfaceC1010450cOx, 76))));
    }

    @Override // X.AbstractC1010710cPN
    public final boolean LJFF(C1010580cPA c1010580cPA) {
        return C1010120cOQ.LIZJ(this.LLILLJJLI);
    }

    public final void LJIIJ(boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i = C2510609se.LIZ;
        if (z) {
            C786410Ut5.LJLIIL(300L, C423340Giq.LIZ, new ARunnableS116S0100000_16(this, 168));
            return;
        }
        RelationButton relationButtonLIZIZ = LIZIZ();
        if (relationButtonLIZIZ != null) {
            ViewGroup.LayoutParams layoutParams = relationButtonLIZIZ.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin = -200;
                }
            } else {
                marginLayoutParams = null;
            }
            C786410Ut5.W5(relationButtonLIZIZ, marginLayoutParams);
        }
        RelationButton relationButtonLIZIZ2 = LIZIZ();
        if (relationButtonLIZIZ2 == null) {
            return;
        }
        relationButtonLIZIZ2.setButtonVariant(2);
    }
}
