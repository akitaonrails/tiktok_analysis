package X;

import Y.ACListenerS5S0220000_6;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.tag.TuxTag;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS65S2100000_27;

/* JADX INFO: renamed from: X.0HeQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C446080HeQ extends LinearLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public InterfaceC1631620sYq<? super C446060HeO, ? super Boolean, ? super Boolean, Unit> LLILZ;

    private final C446050HeN getAvatarTag() {
        return (C446050HeN) this.LL.getValue();
    }

    private final Context getDarkContext() {
        return (Context) this.LLILLL.getValue();
    }

    private final TuxTag getRepostGuide() {
        return (TuxTag) this.LLILLJJLI.getValue();
    }

    public final void LIZ() {
        C446050HeN avatarTag = getAvatarTag();
        if (avatarTag != null) {
            avatarTag.LLILZ = false;
        }
    }

    public final void LIZIZ() {
        C446050HeN avatarTag;
        C446060HeO c446060HeO;
        AwS65S2100000_27 awS65S2100000_27;
        C446050HeN avatarTag2 = getAvatarTag();
        if (avatarTag2 == null || avatarTag2.getVisibility() != 0 || (avatarTag = getAvatarTag()) == null) {
            return;
        }
        if (!avatarTag.LLILZ && avatarTag.isShown() && (c446060HeO = avatarTag.LLILLL) != null && (awS65S2100000_27 = c446060HeO.LJII) != null) {
            awS65S2100000_27.invoke();
        }
        avatarTag.LLILZ = true;
    }

    public final void setOnGuideClickListener$live_release(InterfaceC1631620sYq<? super C446060HeO, ? super Boolean, ? super Boolean, Unit> interfaceC1631620sYq) {
        this.LLILZ = interfaceC1631620sYq;
    }

    public C446080HeQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LL = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(this, 1067));
        this.LLILLJJLI = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(this, 1069));
        this.LLILLL = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1068));
        setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dbr, this, true);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.im, context);
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            TuxTag repostGuide = getRepostGuide();
            if (repostGuide != null) {
                repostGuide.setTagBackgroundColor(iIntValue);
            }
        }
    }

    public static void LIZJ(C446080HeQ c446080HeQ, C446060HeO c446060HeO, boolean z, boolean z2, int i) {
        Integer numLIZJ;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C446050HeN avatarTag;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3 = null;
        if ((i & 1) != 0) {
            c446060HeO = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if (z) {
            C446050HeN avatarTag2 = c446080HeQ.getAvatarTag();
            if (avatarTag2 != null) {
                C339190DRl.LIZLLL(avatarTag2);
            }
            TuxTag repostGuide = c446080HeQ.getRepostGuide();
            if (repostGuide != null) {
                C339190DRl.LIZLLL(repostGuide);
            }
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            if (c446060HeO != null) {
                c446060HeO.LIZIZ -= iLIZIZ;
                c446060HeO.LIZJ -= iLIZIZ;
            }
            TuxTag repostGuide2 = c446080HeQ.getRepostGuide();
            if (repostGuide2 != null) {
                repostGuide2.setText("");
            }
            TuxTag repostGuide3 = c446080HeQ.getRepostGuide();
            if (repostGuide3 != null) {
                TuxTag repostGuide4 = c446080HeQ.getRepostGuide();
                if (repostGuide4 != null) {
                    layoutParams2 = repostGuide4.getLayoutParams();
                } else {
                    layoutParams2 = null;
                }
                if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    marginLayoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
                    marginLayoutParams3 = marginLayoutParams2;
                }
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(repostGuide3);
                repostGuide3.setLayoutParams(marginLayoutParams3);
            }
            TuxTag repostGuide5 = c446080HeQ.getRepostGuide();
            if (repostGuide5 != null) {
                C786410Ut5.n9(repostGuide5, new ACListenerS5S0220000_6(c446080HeQ, c446060HeO, z, z2, 0));
            }
        } else if (z2) {
            TuxTag repostGuide6 = c446080HeQ.getRepostGuide();
            if (repostGuide6 != null) {
                C339190DRl.LIZLLL(repostGuide6);
            }
            C446050HeN avatarTag3 = c446080HeQ.getAvatarTag();
            if (avatarTag3 != null) {
                C339190DRl.LIZIZ(avatarTag3);
            }
            TuxTag repostGuide7 = c446080HeQ.getRepostGuide();
            if (repostGuide7 != null) {
                repostGuide7.setText(C497740JfY.LJIJI(2131846339));
            }
            TuxTag repostGuide8 = c446080HeQ.getRepostGuide();
            if (repostGuide8 != null) {
                TuxTag repostGuide9 = c446080HeQ.getRepostGuide();
                if (repostGuide9 != null) {
                    layoutParams = repostGuide9.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if ((layoutParams instanceof LinearLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                    marginLayoutParams3 = marginLayoutParams;
                }
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(repostGuide8);
                repostGuide8.setLayoutParams(marginLayoutParams3);
            }
            Context darkContext = c446080HeQ.getDarkContext();
            if (darkContext != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ee, darkContext)) != null) {
                int iIntValue = numLIZJ.intValue();
                TuxTag repostGuide10 = c446080HeQ.getRepostGuide();
                if (repostGuide10 != null) {
                    repostGuide10.setTagTextColor(iIntValue);
                }
            }
            TuxTag repostGuide11 = c446080HeQ.getRepostGuide();
            if (repostGuide11 != null) {
                C786410Ut5.n9(repostGuide11, new ACListenerS5S0220000_6(c446080HeQ, c446060HeO, z, z2, 1));
            }
        } else {
            C446050HeN avatarTag4 = c446080HeQ.getAvatarTag();
            if (avatarTag4 != null) {
                C339190DRl.LIZLLL(avatarTag4);
            }
            TuxTag repostGuide12 = c446080HeQ.getRepostGuide();
            if (repostGuide12 != null) {
                C339190DRl.LIZIZ(repostGuide12);
            }
        }
        if (c446060HeO != null && (avatarTag = c446080HeQ.getAvatarTag()) != null) {
            avatarTag.LIZIZ(c446060HeO);
        }
        C2271391DvN.LIZ(c446080HeQ.getRepostGuide(), (C1A5L) C2271381DvM.LJLJLLL.getValue());
    }
}
