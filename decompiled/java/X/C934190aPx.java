package X;

import Y.ACListenerS150S0100000_15;
import Y.ARunnableS115S0100000_15;
import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.audience.guide.IApplyGuideAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestAndAudienceRoleChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.settings.MultiGuestNoGuestBgOptSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.guestinvite.IGuestInviteAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.setting.MultiGuestLayoutLayerAddPaneSizeTechSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.IThemeAbility;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFixCapsuleGuideRepeatSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestGuidanceViewStubBugFixSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestGuidenceBugFixEnabledSettings;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS451S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aPx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C934190aPx extends AbstractC939840aZ4 implements InterfaceC937640aVW {
    public static final /* synthetic */ int LLLIILIL = 0;
    public final DataChannel LLIZLLLIL;
    public final InterfaceC920220a3Q LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public ViewGroup LLJJ;
    public ViewGroup LLJJI;
    public ViewGroup LLJJIII;
    public C16F5 LLJJIJI;
    public LiveIconView LLJJIJIIJIL;
    public ViewStub LLJJIJIL;
    public View LLJJJ;
    public ViewStub LLJJJIL;
    public View LLJJJJ;
    public IThemeAbility LLJJJJJIL;
    public C933460aOm LLJJJJLIIL;
    public ViewGroup LLJJL;
    public C1324720kZq LLJJLIIIJLLLLLLLZ;
    public ViewGroup LLJL;
    public C1324720kZq LLJLIL;
    public C1324720kZq LLJLILLLLZIIL;
    public C1324720kZq LLJLL;
    public C16F5 LLJLLIL;
    public boolean LLJLLL;
    public View LLJZ;
    public View LLJZIJLIL;
    public boolean LLL;
    public final C01GW LLLF;
    public IApplyGuideAbility LLLFF;
    public Animator LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public IGuestInviteAbility LLLII;
    public final List<Function0<Unit>> LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;

    private final C987140bnM getAvatarImageLoadListener() {
        return (C987140bnM) this.LLLF.getValue();
    }

    private final Function1<Integer, Unit> getBackgroundColorSubscriber() {
        return (Function1) this.LLJILJIL.getValue();
    }

    private final GradientDrawable getBgWithSharedBgDrawable() {
        return (GradientDrawable) this.LLLIIIL.getValue();
    }

    private final GradientDrawable getBgWithoutSharedBgDrawable() {
        return (GradientDrawable) this.LLLIIL.getValue();
    }

    private final View.OnClickListener getClickListener() {
        return (View.OnClickListener) this.LLJIJIL.getValue();
    }

    private final Function1<Integer, Unit> getIconSubscriber() {
        return (Function1) this.LLJILJILJ.getValue();
    }

    private final GradientDrawable getNormalBgDrawable() {
        return (GradientDrawable) this.LLLIIIIL.getValue();
    }

    private final Function1<C01FV, Unit> getRoleChangeObserver() {
        return (Function1) this.LLJILLL.getValue();
    }

    private final C934200aPy getViewModel() {
        return (C934200aPy) this.LLJI.getValue();
    }

    public final void LJIIIZ() {
        ViewGroup viewGroup = this.LLJJIII;
        if (viewGroup != null) {
            ViewGroup viewGroup2 = this.LLJJI;
            if (viewGroup2 != null && viewGroup2.getVisibility() != 0) {
                C786410Ut5.LJLZ(0, viewGroup2);
            }
            C1324720kZq c1324720kZq = (C1324720kZq) viewGroup.findViewById(R.id.mai);
            if (c1324720kZq != null) {
                C786410Ut5.LLJJIII(c1324720kZq, 8);
            }
            int iLIZIZ = C20736316Cj.LIZIZ(R.attr.c9g, getContext());
            LiveIconView liveIconView = this.LLJJIJIIJIL;
            if (liveIconView != null) {
                liveIconView.setColorFilter(iLIZIZ);
            }
            C16F5 c16f5 = this.LLJJIJI;
            if (c16f5 != null) {
                c16f5.setTextColor(iLIZIZ);
            }
        }
    }

    private final View getOriginEmptyLayoutView() {
        return LinkCoreModelKt.currentUserIsAnchor() ? this.LLJJ : this.LLJJI;
    }

    public final void LJIJJ() {
        C937310aUz.LIZLLL(getRealTag(), "emptyMask#updateEmptyRequestText");
        if (C925790aCP.LIZ()) {
            if (getDataChannel().gg0(MultiGuestAndAudienceRoleChannel.class) == C01FV.GUEST) {
                C16F5 c16f5 = this.LLJJIJI;
                if (c16f5 != null) {
                    c16f5.setText(C497740JfY.LJIJI(2131842208));
                    return;
                }
                return;
            }
            C16F5 c16f52 = this.LLJJIJI;
            if (c16f52 != null) {
                c16f52.setText(C497740JfY.LJIJI(2131843977));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL() {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C934190aPx.LJIL():void");
    }

    public final float getCurrentCornerRadiusOfAudience() {
        return getWindow().getShapeDescriptor().LIZIZ;
    }

    @Override // X.AbstractC939840aZ4
    public Integer getLayoutId() {
        return Integer.valueOf(getViewModel().LIZJ());
    }

    public final int getPos() {
        String str;
        PosIdentity posIdentity = getWindow().getPosIdentity();
        if (posIdentity == null || (str = posIdentity.value) == null) {
            return 0;
        }
        return CastIntegerProtector.parseInt(str);
    }

    @Override // X.InterfaceC937620aVU
    public Integer getUiPos() {
        return Integer.valueOf(getPos());
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x025c  */
    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C934190aPx.onAttachedToWindow():void");
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getViewModel().onDetach();
        getDataChannel().zQ2(this);
        Iterator<Function0<Unit>> it2 = this.LLLIIII.iterator();
        while (it2.hasNext()) {
            it2.next().invoke();
        }
        ((ArrayList) this.LLLIIII).clear();
        super.onDetachedFromWindow();
    }

    @Override // X.AbstractC939840aZ4
    public DataChannel getDataChannel() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC939840aZ4
    public EnumC939900aZA getElementType() {
        return EnumC939900aZA.NO_GUEST;
    }

    private final void setGuidenceInfo(C933460aOm c933460aOm) {
        this.LLJJJJLIIL = c933460aOm;
        getViewModel().LIZIZ(c933460aOm);
        this.LLL = false;
    }

    @Override // X.InterfaceC937640aVW
    public final void LIZ(AwS559S0100000_15 awS559S0100000_15) {
        ((ArrayList) this.LLLIIII).add(awS559S0100000_15);
    }

    @Override // X.InterfaceC937640aVW
    public final InterfaceC943500aey LJ(C943450aet c943450aet) {
        String idStr;
        View viewLJLLLL;
        Object objInvoke = null;
        if (this.LLJJJJ == null) {
            ViewStub viewStub = this.LLJJJIL;
            if (viewStub != null) {
                viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            } else {
                viewLJLLLL = null;
            }
            this.LLJJJJ = viewLJLLLL;
        }
        c943450aet.LJII = new Pair<>(Integer.valueOf(getWindow().getWidth()), Integer.valueOf(getWindow().getHeight()));
        if (this.LLJJJJLIIL != null) {
            User user = c943450aet.LIZ;
            if (user == null || (idStr = user.getIdStr()) == null) {
                idStr = CardStruct.IStatusCode.DEFAULT;
            }
            C931740aM0.LJIIL(idStr, "guest_apply_anchor", "anchor_invite_guest");
            if (LinkMicFixCapsuleGuideRepeatSetting.INSTANCE.enable()) {
                LJIILJJIL(null);
            }
        }
        View originEmptyLayoutView = getOriginEmptyLayoutView();
        View view = this.LLJJJJ;
        AwS451S0200000_15 awS451S0200000_15 = new AwS451S0200000_15(this, c943450aet, 22);
        if (originEmptyLayoutView != null && view != null) {
            objInvoke = awS451S0200000_15.invoke(originEmptyLayoutView, view);
        }
        return (InterfaceC943500aey) objInvoke;
    }

    public final void LJIIJ(boolean z) {
        if (C922570a7D.LIZ(getDataChannel())) {
            C937310aUz.LIZLLL(getRealTag(), "[enableEmptyView] isInViewerLimit");
            return;
        }
        ViewGroup viewGroup = this.LLJJIII;
        if (viewGroup != null) {
            ViewGroup viewGroup2 = this.LLJJI;
            if (viewGroup2 != null && viewGroup2.getVisibility() != 0) {
                C786410Ut5.LJLZ(0, viewGroup2);
                if (z) {
                    C783270Uo1.LIZLLL(new ARunnableS115S0100000_15(this, 199));
                }
            }
            C1324720kZq c1324720kZq = (C1324720kZq) viewGroup.findViewById(R.id.mai);
            if (c1324720kZq != null) {
                C786410Ut5.LLJJIII(c1324720kZq, 8);
            }
            int iLIZIZ = C20736316Cj.LIZIZ(R.attr.c9i, getContext());
            LiveIconView liveIconView = this.LLJJIJIIJIL;
            if (liveIconView != null) {
                liveIconView.setColorFilter(iLIZIZ);
            }
            C16F5 c16f5 = this.LLJJIJI;
            if (c16f5 != null) {
                c16f5.setTextColor(iLIZIZ);
            }
        }
    }

    public final void LJIIJJI(View view) {
        ViewGroup viewGroup;
        C1324720kZq c1324720kZq;
        View viewFindViewById;
        View viewFindViewById2;
        ViewGroup viewGroup2;
        C1324720kZq c1324720kZq2;
        C1324720kZq c1324720kZq3;
        C1324720kZq c1324720kZq4;
        C16F5 c16f5;
        User user;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iLIZ;
        int paddingTop;
        int paddingBottom;
        int iLIZ2;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int width;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        int iLIZ3;
        if ((!MultiGuestGuidanceViewStubBugFixSettings.INSTANCE.isEnable() || view != null) && LinkCoreModelKt.currentUserIsAnchor()) {
            Long lValueOf = null;
            if (view != null) {
                viewGroup = (ViewGroup) view.findViewById(R.id.jfi);
            } else {
                viewGroup = null;
            }
            this.LLJJL = viewGroup;
            if (view != null) {
                c1324720kZq = (C1324720kZq) view.findViewById(R.id.pn1);
            } else {
                c1324720kZq = null;
            }
            this.LLJJLIIIJLLLLLLLZ = c1324720kZq;
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.jfk);
            } else {
                viewFindViewById = null;
            }
            this.LLJZ = viewFindViewById;
            if (view != null) {
                viewFindViewById2 = view.findViewById(R.id.jaq);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJZIJLIL = viewFindViewById2;
            C923190a8D.LIZJ("show");
            if (view != null) {
                viewGroup2 = (ViewGroup) view.findViewById(R.id.wof);
            } else {
                viewGroup2 = null;
            }
            this.LLJL = viewGroup2;
            if (view != null) {
                c1324720kZq2 = (C1324720kZq) view.findViewById(R.id.woc);
            } else {
                c1324720kZq2 = null;
            }
            this.LLJLIL = c1324720kZq2;
            if (view != null) {
                c1324720kZq3 = (C1324720kZq) view.findViewById(R.id.wod);
            } else {
                c1324720kZq3 = null;
            }
            this.LLJLILLLLZIIL = c1324720kZq3;
            if (view != null) {
                c1324720kZq4 = (C1324720kZq) view.findViewById(R.id.woe);
            } else {
                c1324720kZq4 = null;
            }
            this.LLJLL = c1324720kZq4;
            if (view != null) {
                c16f5 = (C16F5) view.findViewById(R.id.wog);
            } else {
                c16f5 = null;
            }
            this.LLJLLIL = c16f5;
            if (C917910Zzh.LIZ(LinkCoreModelKt.currentUserIsAnchor())) {
                C1324720kZq c1324720kZq5 = this.LLJLIL;
                if (c1324720kZq5 != null) {
                    layoutParams2 = c1324720kZq5.getLayoutParams();
                } else {
                    layoutParams2 = null;
                }
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                } else {
                    marginLayoutParams2 = null;
                }
                C1324720kZq c1324720kZq6 = this.LLJLIL;
                if (c1324720kZq6 == null || (width = c1324720kZq6.getMeasuredWidth()) == 0) {
                    width = (int) (getWindow().getWidth() * 0.2857f);
                }
                int width2 = ((getWindow().getWidth() - (width * 3)) + (C439101nJ.LIZ(3) * 2)) / 2;
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.setMarginStart(width2);
                }
                C1324720kZq c1324720kZq7 = this.LLJLIL;
                if (c1324720kZq7 != null) {
                    C786410Ut5.u6(c1324720kZq7, marginLayoutParams2);
                }
                LJIIL(width, width, this.LLJLIL);
                LJIIL(width, width, this.LLJLILLLLZIIL);
                LJIIL(width, width, this.LLJLL);
                C16F5 c16f52 = this.LLJLLIL;
                if (c16f52 != null) {
                    layoutParams3 = c16f52.getLayoutParams();
                } else {
                    layoutParams3 = null;
                }
                if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                } else {
                    marginLayoutParams3 = null;
                }
                int width3 = getWindow().getWidth();
                if (marginLayoutParams3 != null) {
                    if (width3 >= C439101nJ.LIZ(85)) {
                        iLIZ3 = C439101nJ.LIZ(8);
                    } else {
                        iLIZ3 = C439101nJ.LIZ(6);
                    }
                    marginLayoutParams3.topMargin = iLIZ3;
                }
            }
            C16F5 c16f53 = this.LLJLLIL;
            if (c16f53 != null) {
                c16f53.setText(C497740JfY.LJIJI(2131856558));
            }
            ViewGroup viewGroup3 = this.LLJL;
            if (viewGroup3 != null) {
                C786410Ut5.K7(viewGroup3, new ACListenerS150S0100000_15(this, 295));
            }
            if (!MultiGuestGuidenceBugFixEnabledSettings.INSTANCE.isEnable()) {
                if (this.LLJLLL) {
                    ViewGroup viewGroup4 = this.LLJL;
                    if (viewGroup4 != null) {
                        C786410Ut5.LJLZ(0, viewGroup4);
                    }
                    C1324720kZq c1324720kZq8 = this.LLJJLIIIJLLLLLLLZ;
                    if (c1324720kZq8 != null) {
                        C786410Ut5.LLJJIII(c1324720kZq8, 8);
                    }
                    View view2 = this.LLJZ;
                    if (view2 != null) {
                        C786410Ut5.LJLLLLLL(8, view2);
                    }
                } else {
                    ViewGroup viewGroup5 = this.LLJL;
                    if (viewGroup5 != null) {
                        C786410Ut5.LJLZ(8, viewGroup5);
                    }
                    C1324720kZq c1324720kZq9 = this.LLJJLIIIJLLLLLLLZ;
                    if (c1324720kZq9 != null) {
                        C786410Ut5.LLJJIII(c1324720kZq9, 0);
                    }
                    View view3 = this.LLJZ;
                    if (view3 != null) {
                        C786410Ut5.LJLLLLLL(0, view3);
                    }
                }
            }
            boolean zCurrentUserIsAnchor = LinkCoreModelKt.currentUserIsAnchor();
            if (MultiGuestLayoutLayerAddPaneSizeTechSetting.INSTANCE.isEnable() && C917910Zzh.LIZ(zCurrentUserIsAnchor)) {
                View view4 = this.LLJZ;
                if (view4 != null) {
                    layoutParams = view4.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = null;
                }
                int iWidth = getWindow().getShapeDescriptor().LIZ.width();
                if (marginLayoutParams != null) {
                    if (iWidth >= C439101nJ.LIZ(85)) {
                        iLIZ2 = C439101nJ.LIZ(8);
                    } else if (iWidth >= C439101nJ.LIZ(56)) {
                        iLIZ2 = C439101nJ.LIZ(6);
                    } else {
                        iLIZ2 = C439101nJ.LIZ(4);
                    }
                    marginLayoutParams.topMargin = iLIZ2;
                }
                if (iWidth >= C439101nJ.LIZ(93)) {
                    iLIZ = C439101nJ.LIZ(12);
                } else if (iWidth >= C439101nJ.LIZ(85)) {
                    iLIZ = C439101nJ.LIZ(10);
                } else {
                    iLIZ = C439101nJ.LIZ(8);
                }
                View view5 = this.LLJZ;
                if (view5 != null) {
                    Integer numValueOf = Integer.valueOf(iLIZ);
                    if (view4 != null) {
                        paddingTop = view4.getPaddingTop();
                    } else {
                        paddingTop = 0;
                    }
                    Integer numValueOf2 = Integer.valueOf(paddingTop);
                    Integer numValueOf3 = Integer.valueOf(iLIZ);
                    if (view4 != null) {
                        paddingBottom = view4.getPaddingBottom();
                    } else {
                        paddingBottom = 0;
                    }
                    C426750GoL.LJIIL(view5, numValueOf, numValueOf2, numValueOf3, Integer.valueOf(paddingBottom), 16);
                }
                if (view4 != null) {
                    C786410Ut5.W5(view4, marginLayoutParams);
                }
                if (iWidth < C439101nJ.LIZ(66)) {
                    C500260Jjc.LJLJLJ(this.LLJZIJLIL, false);
                }
            }
            C930480aJy c930480aJy = C930480aJy.LIZ;
            C933460aOm c933460aOm = this.LLJJJJLIIL;
            if (c933460aOm != null && (user = c933460aOm.LIZ) != null) {
                lValueOf = Long.valueOf(user.getId());
            }
            C930480aJy.LJJIJLIJ(c930480aJy, lValueOf, getDataChannel(), getWindow().getShapeDescriptor().LIZ.width(), getWindow().getShapeDescriptor().LIZ.height(), this.LLJJLIIIJLLLLLLLZ, false, getExternalLayout(), 64);
            C1324720kZq c1324720kZq10 = this.LLJJLIIIJLLLLLLLZ;
            if (c1324720kZq10 != null) {
                C786410Ut5.e8(c1324720kZq10, new ACListenerS150S0100000_15(this, 288));
            }
            View view6 = this.LLJZ;
            if (view6 != null) {
                C786410Ut5.I7(new ACListenerS150S0100000_15(this, 289), view6);
            }
        }
    }

    public final void LJIILJJIL(C933460aOm c933460aOm) {
        String idStr;
        if (this.LLJJJJLIIL != null && c933460aOm != null) {
            if (c933460aOm.LJ != null) {
                idStr = CardStruct.IStatusCode.DEFAULT;
            } else {
                User user = c933460aOm.LIZ;
                if (user != null) {
                    idStr = user.getIdStr();
                } else {
                    idStr = null;
                }
            }
            C931740aM0.LJIIL(idStr, "anchor_invite_guest", "anchor_invite_guest");
        }
        setGuidenceInfo(null);
        LJIL();
    }

    public final void LJIIZILJ(C933460aOm c933460aOm) {
        String idStr;
        String realTag = getRealTag();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C934190aPx.class.getSimpleName());
        sbLIZ.append("_showGuidenceStyle user:");
        User user = c933460aOm.LIZ;
        if (user != null) {
            idStr = user.getIdStr();
        } else {
            idStr = null;
        }
        sbLIZ.append(idStr);
        C937310aUz.LIZLLL(realTag, C2188811AlT.LIZIZ(sbLIZ));
        setGuidenceInfo(c933460aOm);
        LJIL();
    }

    public final void LJIJ(boolean z) {
        long followStatus;
        User owner;
        FollowInfo followInfo;
        ViewGroup viewGroup = this.LLJJIII;
        if (viewGroup != null) {
            View viewFindViewById = viewGroup.findViewById(R.id.mah);
            if (viewFindViewById != null) {
                C439101nJ.LJI(viewFindViewById);
            }
            View viewFindViewById2 = viewGroup.findViewById(R.id.mai);
            if (viewFindViewById2 != null) {
                C12ES.LJIILL(0, viewFindViewById2);
            }
        }
        if (z) {
            Room room = (Room) getDataChannel().gg0(RoomChannel.class);
            if (room != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
                followStatus = followInfo.getFollowStatus();
            } else {
                followStatus = 0;
            }
            C924640aAY.LIZIZ(followStatus, getDataChannel(), "plus_button", true);
        }
    }

    public final void LJIJI(Drawable drawable) {
        if (MultiGuestNoGuestBgOptSetting.INSTANCE.getValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateContainerBackgroundOpt bgDrawable=");
            sbLIZ.append(drawable);
            C937310aUz.LIZLLL("NoGuestBizViewElement", C2188811AlT.LIZIZ(sbLIZ));
            if (drawable != null) {
                setBackground(getBgWithSharedBgDrawable());
                ViewGroup viewGroup = this.LLJJIII;
                if (viewGroup != null) {
                    viewGroup.setBackground(null);
                    return;
                }
                return;
            }
            setBackground(getBgWithoutSharedBgDrawable());
            ViewGroup viewGroup2 = this.LLJJIII;
            if (viewGroup2 == null) {
                return;
            }
            viewGroup2.setBackground(null);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateContainerBackground bgDrawable=");
        sbLIZ2.append(drawable);
        C937310aUz.LIZLLL("NoGuestBizViewElement", C2188811AlT.LIZIZ(sbLIZ2));
        InterfaceC940060aZQ layoutManager = getLayoutManager();
        if (C937310aUz.LIZJ(this.LLJ)) {
            setBackground(getNormalBgDrawable());
            ViewGroup viewGroup3 = this.LLJJIII;
            if (viewGroup3 != null) {
                viewGroup3.setBackground(getNormalBgDrawable());
                return;
            }
            return;
        }
        if (drawable != null) {
            setBackground(drawable);
            if (layoutManager != null && !layoutManager.LLIIZ()) {
                ViewGroup viewGroup4 = this.LLJJIII;
                if (viewGroup4 == null) {
                    return;
                }
                viewGroup4.setBackground(C497740JfY.LJIIJ(R.drawable.f5u));
                return;
            }
            ViewGroup viewGroup5 = this.LLJJIII;
            if (viewGroup5 == null) {
                return;
            }
            viewGroup5.setBackground(null);
            return;
        }
        setBackground(null);
        if (LJII()) {
            ViewGroup viewGroup6 = this.LLJJIII;
            if (viewGroup6 != null) {
                viewGroup6.setBackground(C800330VaR.LIZIZ(getContext(), R.drawable.f5s));
                return;
            }
            return;
        }
        if (layoutManager != null && !layoutManager.LLIIZ()) {
            ViewGroup viewGroup7 = this.LLJJIII;
            if (viewGroup7 == null) {
                return;
            }
            viewGroup7.setBackground(C497740JfY.LJIIJ(R.drawable.f5t));
            return;
        }
        ViewGroup viewGroup8 = this.LLJJIII;
        if (viewGroup8 == null) {
            return;
        }
        viewGroup8.setBackground(C497740JfY.LJIIJ(R.drawable.f5v));
    }

    public final void LJIILIIL(ImageModel imageModel, List<ImageModel> list) {
        if (list != null) {
            if (!this.LLL && C500260Jjc.LJJJJIZL(this.LLJL)) {
                this.LLL = true;
                if (list.size() >= 3) {
                    C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ((ImageModel) ListProtector.get(list, 0));
                    c1324610kZfLJIIIZ.LJIIIZ = R.drawable.el_;
                    Boolean bool = Boolean.TRUE;
                    c1324610kZfLJIIIZ.LJIILIIL = bool;
                    c1324610kZfLJIIIZ.LJIIL = getAvatarImageLoadListener();
                    c1324610kZfLJIIIZ.LJJI(this.LLJLIL);
                    C1324610kZf c1324610kZfLJIIIZ2 = C1819620xS4.LIZ().LJIIIZ((ImageModel) ListProtector.get(list, 1));
                    c1324610kZfLJIIIZ2.LJIIIZ = R.drawable.el_;
                    c1324610kZfLJIIIZ2.LJIILIIL = bool;
                    c1324610kZfLJIIIZ2.LJIIL = getAvatarImageLoadListener();
                    c1324610kZfLJIIIZ2.LJJI(this.LLJLILLLLZIIL);
                    C1324610kZf c1324610kZfLJIIIZ3 = C1819620xS4.LIZ().LJIIIZ((ImageModel) ListProtector.get(list, 2));
                    c1324610kZfLJIIIZ3.LJIIIZ = R.drawable.el_;
                    c1324610kZfLJIIIZ3.LJIILIIL = bool;
                    c1324610kZfLJIIIZ3.LJIIL = getAvatarImageLoadListener();
                    c1324610kZfLJIIIZ3.LJJI(this.LLJLL);
                    return;
                }
                return;
            }
            return;
        }
        C1324720kZq c1324720kZq = this.LLJJLIIIJLLLLLLLZ;
        if (c1324720kZq != null && !this.LLL && C500260Jjc.LJJJJIZL(c1324720kZq)) {
            this.LLL = true;
            if (imageModel == null) {
                this.LLL = false;
            }
            if (LiveImageLoaderModuleSetting.useImageModule()) {
                C1324610kZf c1324610kZfLJIIIZ4 = C1819620xS4.LIZ().LJIIIZ(imageModel);
                c1324610kZfLJIIIZ4.LJIIIZ = R.drawable.el_;
                int width = c1324720kZq.getWidth();
                int height = c1324720kZq.getHeight();
                c1324610kZfLJIIIZ4.LJ = width;
                c1324610kZfLJIIIZ4.LJFF = height;
                c1324610kZfLJIIIZ4.LJIILIIL = Boolean.TRUE;
                c1324610kZfLJIIIZ4.LJIIL = getAvatarImageLoadListener();
                c1324610kZfLJIIIZ4.LJJI(c1324720kZq);
                return;
            }
            C0JSS.LJIIIIZZ(c1324720kZq, imageModel, c1324720kZq.getWidth(), c1324720kZq.getHeight(), R.drawable.el_, getAvatarImageLoadListener());
        }
    }

    public final void LJIILLIIL(C00YI c00yi, boolean z) {
        this.LLLI = false;
        Animator animator = this.LLLFFI;
        if (animator != null) {
            animator.cancel();
        }
        this.LLLFFI = null;
        getViewModel().LIZLLL(c00yi, z, new AwS594S0100000_15(this, 1111), null);
    }

    public final void LJIJJLI(String str, Pair pair) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        String realTag = getRealTag();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("emptyMask#updateEmptyUiByWindowSize size:");
        sbLIZ.append(pair);
        sbLIZ.append(" source:");
        sbLIZ.append(str);
        C937310aUz.LIZLLL(realTag, C2188811AlT.LIZIZ(sbLIZ));
        if (((Number) pair.getSecond()).intValue() < C439101nJ.LIZ(60)) {
            if (((Number) pair.getSecond()).intValue() > 0 && this.LLJ.getPageType() == EnumC940090aZT.SEARCH) {
                float fIntValue = ((Number) pair.getSecond()).intValue() / C439101nJ.LIZ(84);
                int iLIZ = (int) (C439101nJ.LIZ(24) * fIntValue);
                LiveIconView liveIconView = this.LLJJIJIIJIL;
                if (liveIconView != null) {
                    C500260Jjc.LJLL(iLIZ, iLIZ, liveIconView);
                }
                C16F5 c16f5 = this.LLJJIJI;
                if (c16f5 != null) {
                    c16f5.setTextSize(13 * fIntValue);
                    return;
                }
                return;
            }
            return;
        }
        if (((Number) pair.getFirst()).intValue() <= 0 || ((Number) pair.getFirst()).intValue() > C439101nJ.LIZ(45)) {
            return;
        }
        LiveIconView liveIconView2 = this.LLJJIJIIJIL;
        if (liveIconView2 != null && (layoutParams2 = liveIconView2.getLayoutParams()) != null) {
            layoutParams2.width = C439101nJ.LIZ(16);
        }
        LiveIconView liveIconView3 = this.LLJJIJIIJIL;
        if (liveIconView3 != null && (layoutParams = liveIconView3.getLayoutParams()) != null) {
            layoutParams.height = C439101nJ.LIZ(16);
        }
        C16F5 c16f52 = this.LLJJIJI;
        if (c16f52 == null) {
            return;
        }
        c16f52.setTextSize(8.0f);
    }

    public static final void LJIIL(int i, int i2, C1324720kZq c1324720kZq) {
        if (c1324720kZq != null) {
            ViewGroup.LayoutParams layoutParams = c1324720kZq.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = i;
                layoutParams.height = i2;
            } else {
                layoutParams = null;
            }
            C786410Ut5.W5(c1324720kZq, layoutParams);
        }
    }

    public final void LJIILL(boolean z, boolean z2, User user, boolean z3) {
        String realTag = getRealTag();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setApplyGuideUI show:");
        sbLIZ.append(z);
        sbLIZ.append(" isApply:");
        sbLIZ.append(z2);
        sbLIZ.append(" resume:");
        sbLIZ.append(z3);
        C937310aUz.LIZLLL(realTag, C2188811AlT.LIZIZ(sbLIZ));
        this.LLLFZ = z2;
        Animator animator = this.LLLFFI;
        if (animator != null) {
            animator.cancel();
        }
        this.LLLFFI = null;
        getViewModel().LJ(z, z2, user, z3, new AwS594S0100000_15(this, 1110), null);
    }

    public C934190aPx(Context context, InterfaceC920220a3Q interfaceC920220a3Q, InterfaceC940060aZQ interfaceC940060aZQ, C957020b0m c957020b0m, DataChannel dataChannel) {
        super(context, dataChannel, c957020b0m, interfaceC940060aZQ);
        this.LLIZLLLIL = dataChannel;
        this.LLJ = interfaceC920220a3Q;
        this.LLJI = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1142));
        this.LLJIJIL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1127));
        this.LLJILJIL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1115));
        this.LLJILJILJ = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1134));
        this.LLJILLL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1139));
        this.LLLF = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1114));
        this.LLLIIII = new ArrayList();
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1136));
        this.LLLIIIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1117));
        this.LLLIIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1119));
    }
}
