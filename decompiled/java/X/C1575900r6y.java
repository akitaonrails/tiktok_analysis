package X;

import Y.ACListenerS126S0200000_24;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.vibefeed.experiment.SocialVibeFeedConfigSetting;
import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedEntranceViewModel;
import com.ss.android.ugc.aweme.vibefeed.model.VibeFeedInviteParam;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: renamed from: X.0r6y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1575900r6y extends C0N7Z implements LifecycleOwner {
    public final VibeFeedInviteParam LLILLL;
    public final Lifecycle LLILZ;
    public EnumC1575330r63 LLILZIL;
    public final C736950SvV LLILZLL;
    public final C01GW LLIZ;
    public LinearLayout LLIZLLLIL;
    public ImageView LLJ;
    public TuxTextView LLJI;
    public LinearLayout LLJIJIL;
    public C21578619ce LLJILJIL;
    public C197039127h LLJILJILJ;
    public C427660Gpo LLJILLL;
    public C427660Gpo LLJJ;

    @Override // X.C0N7Z, X.C0SZ8
    public final void LLFF() {
        C1575290r5z c1575290r5z = C1575290r5z.LIZ;
        VibeFeedInviteParam vibeFeedInviteParam = this.LLILLL;
        EnumC1575330r63 enumC1575330r63 = this.LLILZIL;
        c1575290r5z.getClass();
        C1575290r5z.LIZIZ(vibeFeedInviteParam, enumC1575330r63);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZ;
    }

    public final void LIZ(Context context) {
        boolean z;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        TuxTextView tuxTextView = this.LLJI;
        if (tuxTextView != null) {
            tuxTextView.setText(C1575350r65.LIZJ(context, this.LLILZIL, this.LLILLL));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
            if (numLIZJ != null) {
                tuxTextView.setTextColor(numLIZJ.intValue());
            }
        }
        List<C1575910r6z> listLIZ = C1575350r65.LIZ(context, this.LLILZIL, this.LLILLL);
        ArrayList<View> arrayList = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
        int i = 0;
        for (C1575910r6z c1575910r6z : listLIZ) {
            int i2 = i + 1;
            if (i >= 0) {
                C1575910r6z c1575910r6z2 = c1575910r6z;
                boolean z2 = true;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.ga, null);
                TuxIconView tuxIconView = (TuxIconView) viewLJLLJ.findViewById(R.id.bvl);
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, context);
                if (numLIZJ2 != null) {
                    iIntValue = numLIZJ2.intValue();
                } else {
                    iIntValue = 0;
                }
                tuxIconView.setTintColor(iIntValue);
                tuxIconView.setIconRes(c1575910r6z2.LIZ);
                CharSequence charSequence = c1575910r6z2.LIZIZ;
                if (charSequence == null || charSequence.length() <= 0) {
                    z2 = false;
                }
                int i3 = 24;
                if (z2) {
                    TuxTextView tuxTextView2 = (TuxTextView) viewLJLLJ.findViewById(R.id.bvn);
                    tuxTextView2.setTuxFont(32);
                    Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1k, context);
                    if (numLIZJ3 != null) {
                        iIntValue3 = numLIZJ3.intValue();
                    } else {
                        iIntValue3 = 0;
                    }
                    tuxTextView2.setTextColor(iIntValue3);
                    tuxTextView2.setText(c1575910r6z2.LIZIZ);
                    C786410Ut5.LLLLZLL(tuxTextView2, 0);
                    tuxTextView2.setMovementMethod(C431260Gvc.LIZ);
                    C426750GoL.LJIIIZ(viewLJLLJ.findViewById(R.id.bvm), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, null, false, 29);
                } else {
                    C786410Ut5.LLLLZLL((TuxTextView) viewLJLLJ.findViewById(R.id.bvn), 8);
                    ((TextView) viewLJLLJ.findViewById(R.id.bvm)).setMinHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                }
                TuxTextView tuxTextView3 = (TuxTextView) viewLJLLJ.findViewById(R.id.bvm);
                tuxTextView3.setTuxFont(41);
                Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.uf, context);
                if (numLIZJ4 != null) {
                    iIntValue2 = numLIZJ4.intValue();
                } else {
                    iIntValue2 = 0;
                }
                tuxTextView3.setTextColor(iIntValue2);
                tuxTextView3.setText(c1575910r6z2.LIZJ);
                tuxTextView3.setTextDirection(5);
                tuxTextView3.setMovementMethod(C431260Gvc.LIZ);
                if (!z) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    if (!z2) {
                        i3 = 16;
                    }
                    layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3)));
                    C786410Ut5.W5(viewLJLLJ, layoutParams);
                }
                arrayList.add(viewLJLLJ);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        LinearLayout linearLayout = this.LLJIJIL;
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        for (View view : arrayList) {
            LinearLayout linearLayout2 = this.LLJIJIL;
            if (linearLayout2 != null) {
                linearLayout2.addView(view);
            }
        }
        C197039127h c197039127h = this.LLJILJILJ;
        if (c197039127h != null) {
            C339190DRl.LIZLLL(c197039127h);
            c197039127h.setText(C1575350r65.LIZIZ(c197039127h.getContext(), this.LLILZIL, this.LLILLL));
            if (this.LLILZIL == EnumC1575330r63.INVITE_GAP) {
                c197039127h.setEnabled(false);
                c197039127h.setClickable(false);
            }
            Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.a1h, context);
            if (numLIZJ5 != null) {
                c197039127h.setTextColorRes(numLIZJ5.intValue());
                C786410Ut5.U8(c197039127h, new ACListenerS126S0200000_24(c197039127h, this, 13));
            }
        }
    }

    @Override // X.C0SZ8
    public final void LJI(Aweme aweme) {
        this.LLILLJJLI = aweme;
    }

    @Override // X.C0SZ8
    public final void LJJIJIIJIL(int i) {
        IFeedFragmentAbility iFeedFragmentAbilityLIZ;
        ILoadMoreAbility iLoadMoreAbilityEw0;
        IFeedFragmentAbility iFeedFragmentAbilityLIZ2;
        IRefreshAbility iRefreshAbilityE80;
        DetailPageComponent detailPageComponentDn1;
        ViewGroup viewGroup;
        InterfaceC494301wD interfaceC494301wD = null;
        InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJFF(this.LL.LIZJ, null), IFeedFragmentAbility.class, null);
        if (interfaceC494301wDLIZ instanceof IDetailPageAbility) {
            interfaceC494301wD = interfaceC494301wDLIZ;
        }
        IDetailPageAbility iDetailPageAbility = (IDetailPageAbility) interfaceC494301wD;
        if (iDetailPageAbility != null && (detailPageComponentDn1 = iDetailPageAbility.Dn1()) != null && (viewGroup = detailPageComponentDn1.LLLII) != null) {
            C786410Ut5.LJLLLLLL(8, viewGroup);
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJ = C1578630rBN.LJ(this.LL.LIZJ);
        if (interfaceC665370Q7zLJ != null && (iFeedFragmentAbilityLIZ2 = C443040HYw.LIZ(interfaceC665370Q7zLJ)) != null && (iRefreshAbilityE80 = iFeedFragmentAbilityLIZ2.E80()) != null) {
            iRefreshAbilityE80.setEnabled(false);
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJ2 = C1578630rBN.LJ(this.LL.LIZJ);
        if (interfaceC665370Q7zLJ2 != null && (iFeedFragmentAbilityLIZ = C443040HYw.LIZ(interfaceC665370Q7zLJ2)) != null && (iLoadMoreAbilityEw0 = iFeedFragmentAbilityLIZ.Ew0()) != null) {
            iLoadMoreAbilityEw0.g82(true);
        }
        C1575290r5z c1575290r5z = C1575290r5z.LIZ;
        VibeFeedInviteParam vibeFeedInviteParam = this.LLILLL;
        EnumC1575330r63 enumC1575330r63 = this.LLILZIL;
        c1575290r5z.getClass();
        C1575290r5z.LIZIZ(vibeFeedInviteParam, enumC1575330r63);
        C2450909j1.LIZ(new AwS568S0100000_24(this, 1697));
    }

    @Override // X.C0N7Z, X.C0SZ8
    public final void LLZZJLIL(View view) {
        View viewLJLLLL;
        Boolean boolValueOf;
        LinearLayout linearLayout;
        ImageView imageView;
        TuxTextView tuxTextView;
        LinearLayout linearLayout2;
        C197039127h c197039127h;
        C21578619ce c21578619ce;
        C427660Gpo c427660Gpo;
        C427660Gpo c427660Gpo2;
        UrlModel avatarThumb;
        UrlModel avatarThumb2;
        UrlModel avatarThumb3;
        UrlModel avatarThumb4;
        UrlModel avatarThumb5;
        UrlModel avatarThumb6;
        UrlModel avatarThumb7;
        UrlModel avatarThumb8;
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.ex5);
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.i81);
            viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
        } else {
            viewLJLLLL = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initView isDarkMode: ");
        Context context = getContext();
        if (context != null) {
            boolValueOf = Boolean.valueOf(C960203pA.LIZIZ(context));
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(' ');
        C2188811AlT.LIZIZ(sbLIZ);
        if (viewLJLLLL != null) {
            linearLayout = (LinearLayout) viewLJLLLL.findViewById(R.id.vibe_feed_invite_container);
        } else {
            linearLayout = null;
        }
        this.LLIZLLLIL = linearLayout;
        if (viewLJLLLL != null) {
            imageView = (ImageView) viewLJLLLL.findViewById(R.id.vibe_feed_invite_image_view);
        } else {
            imageView = null;
        }
        this.LLJ = imageView;
        if (viewLJLLLL != null) {
            tuxTextView = (TuxTextView) viewLJLLLL.findViewById(R.id.vibe_feed_invite_title_text);
        } else {
            tuxTextView = null;
        }
        this.LLJI = tuxTextView;
        if (viewLJLLLL != null) {
            linearLayout2 = (LinearLayout) viewLJLLLL.findViewById(R.id.vibe_feed_invite_message_container);
        } else {
            linearLayout2 = null;
        }
        this.LLJIJIL = linearLayout2;
        if (viewLJLLLL != null) {
            c197039127h = (C197039127h) viewLJLLLL.findViewById(R.id.vibe_feed_invite_button);
        } else {
            c197039127h = null;
        }
        this.LLJILJILJ = c197039127h;
        if (viewLJLLLL != null) {
            c21578619ce = (C21578619ce) viewLJLLLL.findViewById(R.id.ky6);
        } else {
            c21578619ce = null;
        }
        this.LLJILJIL = c21578619ce;
        if (viewLJLLLL != null) {
            c427660Gpo = (C427660Gpo) viewLJLLLL.findViewById(R.id.vibe_feed_avatar_left_top);
        } else {
            c427660Gpo = null;
        }
        this.LLJILLL = c427660Gpo;
        if (viewLJLLLL != null) {
            c427660Gpo2 = (C427660Gpo) viewLJLLLL.findViewById(R.id.vibe_feed_avatar_right_bottom);
        } else {
            c427660Gpo2 = null;
        }
        this.LLJJ = c427660Gpo2;
        Context context2 = getContext();
        if (context2 != null) {
            C1361400lX0 c1361400lX0LIZ = C1385040m98.LIZ(context2, true);
            C1575530r6N.LIZ.getClass();
            C1331670kl3 c1331670kl3LJFF = C1575440r6E.LJFF(C1575530r6N.LIZ(true), SocialVibeFeedConfigSetting.LIZ().invitePanelTopDarkPicUrl);
            c1331670kl3LJFF.LJJ = EnumC1338240kve.FIT_CENTER;
            c1331670kl3LJFF.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LJFF.LJJII(new C1620630sH7(this, c1361400lX0LIZ, 1));
            C1331670kl3 c1331670kl3LJFF2 = C1575440r6E.LJFF(C1575530r6N.LIZJ(), SocialVibeFeedConfigSetting.LIZ().invitePanelPageBackgroundUrl);
            c1331670kl3LJFF2.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LJFF2.LJJII(new C1620630sH7(this, c1361400lX0LIZ, 2));
            if ((C1576040r7C.LIZ() && C1576040r7C.LJFF().inviteHideAvatar) || this.LLILLL.getMutualFeedScene().isGroup()) {
                C427660Gpo c427660Gpo3 = this.LLJILLL;
                if (c427660Gpo3 != null) {
                    C786410Ut5.LLLLLJIL(c427660Gpo3, 8);
                }
                C427660Gpo c427660Gpo4 = this.LLJJ;
                if (c427660Gpo4 != null) {
                    C786410Ut5.LLLLLJIL(c427660Gpo4, 8);
                }
            } else {
                int iLIZIZ = C14KQ.LIZIZ(C1388190mED.LIZ(c1361400lX0LIZ));
                float f = iLIZIZ;
                float f2 = 0.5948718f * f;
                User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
                IMContactApi.LIZ.getClass();
                IMUser iMUserLJ = C069P.LIZ().LJ().LJ(this.LL.LJ.param.getChatFromUserId(), null);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("initPanelAvatarLocation: screenWidth:");
                sbLIZ2.append(iLIZIZ);
                sbLIZ2.append(" imageViewHeight:");
                sbLIZ2.append(f2);
                sbLIZ2.append(' ');
                C299700Bou.LIZIZ("VibeSpecialCardCell", C2188811AlT.LIZIZ(sbLIZ2));
                if (iLIZIZ < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(375))) {
                    C427660Gpo c427660Gpo5 = this.LLJILLL;
                    if (c427660Gpo5 != null) {
                        c427660Gpo5.setSize(48);
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
                        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zi);
                        Drawable drawableLIZ = c384050F3z.LIZ(c1361400lX0LIZ);
                        C19659111vp c19659111vp = new C19659111vp();
                        c19659111vp.LJ = Integer.valueOf(R.attr.ou);
                        c19659111vp.LIZ = C418440Gaw.LIZIZ(24);
                        c427660Gpo5.setBackground(C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(c1361400lX0LIZ)));
                        C426750GoL.LJIIIZ(c427660Gpo5, Integer.valueOf((int) (0.25f * f)), Integer.valueOf((int) (((double) f2) * 0.17d)), 0, 0, false, 16);
                        if (iMUserLJ != null) {
                            avatarThumb8 = iMUserLJ.getAvatarThumb();
                        } else {
                            avatarThumb8 = null;
                        }
                        C427660Gpo.LJIIJJI(c427660Gpo5, C438710HIf.LIZ(avatarThumb8), false, null, null, false, false, null, null, false, null, 990);
                    }
                    C427660Gpo c427660Gpo6 = this.LLJJ;
                    if (c427660Gpo6 != null) {
                        c427660Gpo6.setSize(48);
                        C384050F3z c384050F3z2 = new C384050F3z();
                        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
                        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.zi);
                        Drawable drawableLIZ2 = c384050F3z2.LIZ(c1361400lX0LIZ);
                        C19659111vp c19659111vp2 = new C19659111vp();
                        c19659111vp2.LJ = Integer.valueOf(R.attr.ou);
                        c19659111vp2.LIZ = C418440Gaw.LIZIZ(24);
                        c427660Gpo6.setBackground(C426750GoL.LJIILIIL(drawableLIZ2, c19659111vp2.LIZ(c1361400lX0LIZ)));
                        C426750GoL.LJIIIZ(c427660Gpo6, 0, 0, Integer.valueOf((int) (f * 0.27f)), Integer.valueOf((int) (((double) f2) * 0.17d)), false, 16);
                        if (curUser != null) {
                            avatarThumb7 = curUser.getAvatarThumb();
                        } else {
                            avatarThumb7 = null;
                        }
                        C427660Gpo.LJIIJJI(c427660Gpo6, C438710HIf.LIZ(avatarThumb7), false, null, null, false, false, null, null, false, null, 990);
                    }
                } else if (iLIZIZ < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(428))) {
                    C427660Gpo c427660Gpo7 = this.LLJILLL;
                    if (c427660Gpo7 != null) {
                        c427660Gpo7.setSize(56);
                        C384050F3z c384050F3z3 = new C384050F3z();
                        c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(28));
                        c384050F3z3.LIZIZ = Integer.valueOf(R.attr.zi);
                        Drawable drawableLIZ3 = c384050F3z3.LIZ(c1361400lX0LIZ);
                        C19659111vp c19659111vp3 = new C19659111vp();
                        c19659111vp3.LJ = Integer.valueOf(R.attr.ou);
                        c19659111vp3.LIZ = C418440Gaw.LIZIZ(28);
                        c427660Gpo7.setBackground(C426750GoL.LJIILIIL(drawableLIZ3, c19659111vp3.LIZ(c1361400lX0LIZ)));
                        C426750GoL.LJIIIZ(c427660Gpo7, Integer.valueOf((int) (0.25f * f)), Integer.valueOf((int) (((double) f2) * 0.17d)), 0, 0, false, 16);
                        if (iMUserLJ != null) {
                            avatarThumb6 = iMUserLJ.getAvatarThumb();
                        } else {
                            avatarThumb6 = null;
                        }
                        C427660Gpo.LJIIJJI(c427660Gpo7, C438710HIf.LIZ(avatarThumb6), false, null, null, false, false, null, null, false, null, 990);
                    }
                    C427660Gpo c427660Gpo8 = this.LLJJ;
                    if (c427660Gpo8 != null) {
                        c427660Gpo8.setSize(56);
                        C384050F3z c384050F3z4 = new C384050F3z();
                        c384050F3z4.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(28));
                        c384050F3z4.LIZIZ = Integer.valueOf(R.attr.zi);
                        Drawable drawableLIZ4 = c384050F3z4.LIZ(c1361400lX0LIZ);
                        C19659111vp c19659111vp4 = new C19659111vp();
                        c19659111vp4.LJ = Integer.valueOf(R.attr.ou);
                        c19659111vp4.LIZ = C418440Gaw.LIZIZ(28);
                        c427660Gpo8.setBackground(C426750GoL.LJIILIIL(drawableLIZ4, c19659111vp4.LIZ(c1361400lX0LIZ)));
                        C426750GoL.LJIIIZ(c427660Gpo8, 0, 0, Integer.valueOf((int) (f * 0.27f)), Integer.valueOf((int) (((double) f2) * 0.2d)), false, 16);
                        if (curUser != null) {
                            avatarThumb5 = curUser.getAvatarThumb();
                        } else {
                            avatarThumb5 = null;
                        }
                        C427660Gpo.LJIIJJI(c427660Gpo8, C438710HIf.LIZ(avatarThumb5), false, null, null, false, false, null, null, false, null, 990);
                    }
                } else if (iLIZIZ < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(720))) {
                    C427660Gpo c427660Gpo9 = this.LLJILLL;
                    if (c427660Gpo9 != null) {
                        c427660Gpo9.setSize(64);
                        C384050F3z c384050F3z5 = new C384050F3z();
                        c384050F3z5.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(32));
                        c384050F3z5.LIZIZ = Integer.valueOf(R.attr.zi);
                        Drawable drawableLIZ5 = c384050F3z5.LIZ(c1361400lX0LIZ);
                        C19659111vp c19659111vp5 = new C19659111vp();
                        c19659111vp5.LJ = Integer.valueOf(R.attr.ou);
                        c19659111vp5.LIZ = C418440Gaw.LIZIZ(32);
                        c427660Gpo9.setBackground(C426750GoL.LJIILIIL(drawableLIZ5, c19659111vp5.LIZ(c1361400lX0LIZ)));
                        C426750GoL.LJIIIZ(c427660Gpo9, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(0.25f * f)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(((double) f2) * 0.17d)))), 0, 0, false, 16);
                        if (iMUserLJ != null) {
                            avatarThumb4 = iMUserLJ.getAvatarThumb();
                        } else {
                            avatarThumb4 = null;
                        }
                        C427660Gpo.LJIIJJI(c427660Gpo9, C438710HIf.LIZ(avatarThumb4), false, null, null, false, false, null, null, false, null, 990);
                    }
                    C427660Gpo c427660Gpo10 = this.LLJJ;
                    if (c427660Gpo10 != null) {
                        c427660Gpo10.setSize(64);
                        C384050F3z c384050F3z6 = new C384050F3z();
                        c384050F3z6.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(32));
                        c384050F3z6.LIZIZ = Integer.valueOf(R.attr.zi);
                        Drawable drawableLIZ6 = c384050F3z6.LIZ(c1361400lX0LIZ);
                        C19659111vp c19659111vp6 = new C19659111vp();
                        c19659111vp6.LJ = Integer.valueOf(R.attr.ou);
                        c19659111vp6.LIZ = C418440Gaw.LIZIZ(32);
                        c427660Gpo10.setBackground(C426750GoL.LJIILIIL(drawableLIZ6, c19659111vp6.LIZ(c1361400lX0LIZ)));
                        C426750GoL.LJIIIZ(c427660Gpo10, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f * 0.27f)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(((double) f2) * 0.2d)))), false, 16);
                        if (curUser != null) {
                            avatarThumb3 = curUser.getAvatarThumb();
                        } else {
                            avatarThumb3 = null;
                        }
                        C427660Gpo.LJIIJJI(c427660Gpo10, C438710HIf.LIZ(avatarThumb3), false, null, null, false, false, null, null, false, null, 990);
                    }
                } else {
                    C427660Gpo c427660Gpo11 = this.LLJILLL;
                    if (c427660Gpo11 != null) {
                        c427660Gpo11.setSize(96);
                        C384050F3z c384050F3z7 = new C384050F3z();
                        c384050F3z7.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(48));
                        c384050F3z7.LIZIZ = Integer.valueOf(R.attr.zi);
                        Drawable drawableLIZ7 = c384050F3z7.LIZ(c1361400lX0LIZ);
                        C19659111vp c19659111vp7 = new C19659111vp();
                        c19659111vp7.LJ = Integer.valueOf(R.attr.ou);
                        c19659111vp7.LIZ = C418440Gaw.LIZIZ(48);
                        c427660Gpo11.setBackground(C426750GoL.LJIILIIL(drawableLIZ7, c19659111vp7.LIZ(c1361400lX0LIZ)));
                        C426750GoL.LJIIIZ(c427660Gpo11, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(0.25f * f)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(((double) f2) * 0.17d)))), 0, 0, false, 16);
                        if (iMUserLJ != null) {
                            avatarThumb2 = iMUserLJ.getAvatarThumb();
                        } else {
                            avatarThumb2 = null;
                        }
                        C427660Gpo.LJIIJJI(c427660Gpo11, C438710HIf.LIZ(avatarThumb2), false, null, null, false, false, null, null, false, null, 990);
                    }
                    C427660Gpo c427660Gpo12 = this.LLJJ;
                    if (c427660Gpo12 != null) {
                        c427660Gpo12.setSize(96);
                        C384050F3z c384050F3z8 = new C384050F3z();
                        c384050F3z8.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(48));
                        c384050F3z8.LIZIZ = Integer.valueOf(R.attr.zi);
                        Drawable drawableLIZ8 = c384050F3z8.LIZ(c1361400lX0LIZ);
                        C19659111vp c19659111vp8 = new C19659111vp();
                        c19659111vp8.LJ = Integer.valueOf(R.attr.ou);
                        c19659111vp8.LIZ = C418440Gaw.LIZIZ(48);
                        c427660Gpo12.setBackground(C426750GoL.LJIILIIL(drawableLIZ8, c19659111vp8.LIZ(c1361400lX0LIZ)));
                        C426750GoL.LJIIIZ(c427660Gpo12, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f * 0.27f)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(((double) f2) * 0.2d)))), false, 16);
                        if (curUser != null) {
                            avatarThumb = curUser.getAvatarThumb();
                        } else {
                            avatarThumb = null;
                        }
                        C427660Gpo.LJIIJJI(c427660Gpo12, C438710HIf.LIZ(avatarThumb), false, null, null, false, false, null, null, false, null, 990);
                    }
                }
            }
            LIZ(c1361400lX0LIZ);
            C197039127h c197039127h2 = this.LLJILJILJ;
            if (c197039127h2 != null) {
                c197039127h2.setLoading(true);
            }
            ((VibeFeedEntranceViewModel) this.LLILZLL.getValue()).xQ2(this.LLILLL.getToUserId(), this.LLILLL.getConversationId(), (EnumC912680ZrG) this.LLIZ.getValue(), false, new AwS603S0100000_24(this, 481));
        }
    }

    @Override // X.C0SZ8
    public final void h(boolean z) {
        IFeedFragmentAbility iFeedFragmentAbilityLIZ;
        ILoadMoreAbility iLoadMoreAbilityEw0;
        IFeedFragmentAbility iFeedFragmentAbilityLIZ2;
        IRefreshAbility iRefreshAbilityE80;
        DetailPageComponent detailPageComponentDn1;
        ViewGroup viewGroup;
        InterfaceC494301wD interfaceC494301wD = null;
        InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJFF(this.LL.LIZJ, null), IFeedFragmentAbility.class, null);
        if (interfaceC494301wDLIZ instanceof IDetailPageAbility) {
            interfaceC494301wD = interfaceC494301wDLIZ;
        }
        IDetailPageAbility iDetailPageAbility = (IDetailPageAbility) interfaceC494301wD;
        if (iDetailPageAbility != null && (detailPageComponentDn1 = iDetailPageAbility.Dn1()) != null && (viewGroup = detailPageComponentDn1.LLLII) != null) {
            C786410Ut5.LJLLLLLL(0, viewGroup);
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJ = C1578630rBN.LJ(this.LL.LIZJ);
        if (interfaceC665370Q7zLJ != null && (iFeedFragmentAbilityLIZ2 = C443040HYw.LIZ(interfaceC665370Q7zLJ)) != null && (iRefreshAbilityE80 = iFeedFragmentAbilityLIZ2.E80()) != null) {
            iRefreshAbilityE80.setEnabled(true);
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJ2 = C1578630rBN.LJ(this.LL.LIZJ);
        if (interfaceC665370Q7zLJ2 != null && (iFeedFragmentAbilityLIZ = C443040HYw.LIZ(interfaceC665370Q7zLJ2)) != null && (iLoadMoreAbilityEw0 = iFeedFragmentAbilityLIZ.Ew0()) != null) {
            iLoadMoreAbilityEw0.g82(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1575900r6y(C0RF0 c0rf0, VibeFeedInviteParam vibeFeedInviteParam) {
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        super(c0rf0);
        this.LLILLL = vibeFeedInviteParam;
        this.LLILZ = c0rf0.LIZJ.getLifecycle();
        this.LLILZIL = vibeFeedInviteParam.getPanelType();
        AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(480);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VibeFeedEntranceViewModel.class);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(597);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        C1622206Wu c1622206WuLJII = C724750Sbp.LJII(this);
        if (this instanceof HasDefaultViewModelProviderFactory) {
            hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) this;
        } else {
            hasDefaultViewModelProviderFactory = null;
        }
        this.LLILZLL = new C736950SvV(c19719912DlLIZ, aFwS213S0000000_24, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(hasDefaultViewModelProviderFactory), aFwS264S0000000_24, null, null, null);
        this.LLIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1696));
    }
}
