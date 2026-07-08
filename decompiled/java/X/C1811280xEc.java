package X;

import Y.AAListenerS275S0200000_27;
import Y.ACListenerS161S0100000_27;
import Y.ARunnableS127S0100000_27;
import Y.AUListenerS254S0100000_4;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveRankingAndPrivilegeDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.rank.LiveRankingGeckoDrawableLoadingSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveAvatarEntranceUnifySetting;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0xEc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1811280xEc extends LinearLayout {
    public ImageView LL;
    public View LLILLJJLI;
    public C16F5 LLILLL;
    public C16F5 LLILZ;
    public C1324720kZq LLILZIL;
    public C1324720kZq LLILZLL;
    public C16F5 LLIZ;
    public C1811290xEd LLIZLLLIL;
    public BPEAHandler LLJ;
    public ARunnableS127S0100000_27 LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public AnonymousClass0956 LLJILLL;

    public final void LIZIZ() {
        setBackground(null);
        C786410Ut5.v8(this, null);
        LIZJ();
        AnonymousClass0956 anonymousClass0956 = this.LLJILLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    public final void LIZJ() {
        BPEAHandler bPEAHandler;
        ARunnableS127S0100000_27 aRunnableS127S0100000_27 = this.LLJI;
        if (aRunnableS127S0100000_27 != null && (bPEAHandler = this.LLJ) != null) {
            bPEAHandler.removeCallbacks(aRunnableS127S0100000_27);
        }
        C786410Ut5.k5(getUserTicketFromXml(), 1.0f);
        C786410Ut5.k5(getTvUserDescriptionFromXml(), 0.0f);
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = false;
        this.LLJILJIL = false;
        this.LLJILJILJ = false;
    }

    public final void LJFF() {
        BPEAHandler bPEAHandler;
        if (this.LLJILJILJ) {
            return;
        }
        if (this.LLJI == null) {
            this.LLJI = new ARunnableS127S0100000_27(this, 3);
            this.LLJ = new BPEAHandler(Looper.getMainLooper());
        }
        this.LLJILJILJ = true;
        ARunnableS127S0100000_27 aRunnableS127S0100000_27 = this.LLJI;
        if (aRunnableS127S0100000_27 == null || (bPEAHandler = this.LLJ) == null) {
            return;
        }
        C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, bPEAHandler, aRunnableS127S0100000_27);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public final C1324720kZq getIvAvatarBorderFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.l9o);
            this.LLILZIL = (C1324720kZq) callbackFindViewById;
        }
        return (C1324720kZq) callbackFindViewById;
    }

    public final C1324720kZq getIvOnGoingFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.lq9);
            this.LLILZLL = (C1324720kZq) callbackFindViewById;
        }
        return (C1324720kZq) callbackFindViewById;
    }

    public final View getMaskFromXml() {
        View view = this.LLILLJJLI;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.o0x);
        this.LLILLJJLI = viewFindViewById;
        return viewFindViewById;
    }

    public final C1811290xEd getRankingLabelContainer() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.m4c);
            this.LLIZLLLIL = (C1811290xEd) callbackFindViewById;
        }
        return (C1811290xEd) callbackFindViewById;
    }

    public final C16F5 getTvUserDescriptionFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_user_description);
            this.LLIZ = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final ImageView getUserAvatarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.user_avatar);
            this.LL = (ImageView) callbackFindViewById;
        }
        return (ImageView) callbackFindViewById;
    }

    public final C16F5 getUserNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.user_name);
            this.LLILZ = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final C16F5 getUserTicketFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.user_ticket);
            this.LLILLL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final void LIZ(C1811320xEg c1811320xEg) {
        float f;
        String str;
        C416760GVu c416760GVu;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        List<RankListV2Response.RankLabel> list;
        if (c1811320xEg.LIZJ == null) {
            return;
        }
        if (c1811320xEg.LIZLLL) {
            f = 56.0f;
        } else {
            f = 48.0f;
        }
        int iLIZIZ = (int) C497740JfY.LIZIZ(f);
        ImageView userAvatarFromXml = getUserAvatarFromXml();
        ViewGroup.LayoutParams layoutParams = getUserAvatarFromXml().getLayoutParams();
        layoutParams.width = iLIZIZ;
        layoutParams.height = iLIZIZ;
        C786410Ut5.c6(userAvatarFromXml, layoutParams);
        View maskFromXml = getMaskFromXml();
        ViewGroup.LayoutParams layoutParams2 = getMaskFromXml().getLayoutParams();
        layoutParams2.width = iLIZIZ;
        layoutParams2.height = iLIZIZ;
        C786410Ut5.W5(maskFromXml, layoutParams2);
        getUserTicketFromXml();
        EnumC995330c0Z.SPECIAL_TOP3_LIST_ITEM.getType();
        Map<String, Object> map = C1338270kvh.LIZ;
        getUserTicketFromXml().setText(c1811320xEg.LIZJ.scoreDescription);
        RankListV2Response.TeamRankExtra teamRankExtra = c1811320xEg.LIZJ.teamRankExtra;
        if (teamRankExtra == null || (str = teamRankExtra.clubName) == null) {
            str = "";
        }
        List urls = null;
        float f7 = 1.0f;
        if (Intrinsics.LJFF(str, "")) {
            this.LLJILJIL = true;
            if (getUserTicketFromXml().getAlpha() == 1.0f) {
                LIZJ();
            }
        } else {
            this.LLJILJIL = false;
            if (LiveRankingGeckoDrawableLoadingSetting.INSTANCE.getValue().asyncLoadingOpt) {
                AnonymousClass0956 anonymousClass0956 = this.LLJILLL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                C1DFH c1dfh = C0PEM.LIZ;
                this.LLJILLL = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C474220Iii(str, this, null), 3);
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) C497740JfY.LJIJI(2131856737));
                Drawable drawableLIZ = C1143680frq.LIZ("tiktok_live_revenue_demand_1", "ttlive_icon_ranking_list_popularity_ranking_heart.png");
                if (drawableLIZ != null) {
                    drawableLIZ.setBounds(0, 0, (int) C497740JfY.LIZIZ(11.0f), (int) C497740JfY.LIZIZ(11.0f));
                    c416760GVu = new C416760GVu(drawableLIZ);
                } else {
                    c416760GVu = null;
                }
                int iLJJJ = a0.LJJJ(spannableStringBuilder, "{0:image}", 0, false, 6);
                C786410Ut5.q2(spannableStringBuilder, c416760GVu, iLJJJ, iLJJJ + 9, 33);
                int iLJJJ2 = a0.LJJJ(spannableStringBuilder, "{1:string}", 0, false, 6);
                spannableStringBuilder.replace(iLJJJ2, iLJJJ2 + 10, (CharSequence) str);
                getTvUserDescriptionFromXml().setText(spannableStringBuilder);
            }
        }
        C1811290xEd rankingLabelContainer = getRankingLabelContainer();
        if (rankingLabelContainer != null) {
            rankingLabelContainer.setScene(EnumC1154100g8e.RANKING_PAGE_TOP3_PODIUM);
        }
        C1811290xEd rankingLabelContainer2 = getRankingLabelContainer();
        if (rankingLabelContainer2 != null) {
            RankListV2Response.RankInfo rankInfo = c1811320xEg.LIZJ;
            if (rankInfo != null) {
                list = rankInfo.labels;
            } else {
                list = null;
            }
            RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
            rankingLabelContainer2.LIZ(list, C235000vU.LIZIZ(c1811320xEg.LIZ));
        }
        getUserNameFromXml().setText(C0KVU.LIZ(c1811320xEg.LIZJ.user));
        C439101nJ.LJFF(getUserNameFromXml(), R.color.a45);
        C439101nJ.LJFF(getUserTicketFromXml(), R.color.di);
        if (c1811320xEg.LJFF) {
            C0JBN c0jbnLIZ = C1819620xS4.LIZ();
            ImageModel avatarThumb = c1811320xEg.LIZJ.user.getAvatarThumb();
            if (avatarThumb != null) {
                urls = avatarThumb.getUrls();
            }
            C1324610kZf c1324610kZfLIZJ = c0jbnLIZ.LIZJ(urls);
            c1324610kZfLIZJ.LJIILIIL = Boolean.TRUE;
            c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
            int width = getUserAvatarFromXml().getWidth();
            int height = getUserAvatarFromXml().getHeight();
            c1324610kZfLIZJ.LJ = width;
            c1324610kZfLIZJ.LJFF = height;
            c1324610kZfLIZJ.LJIIIZ = R.drawable.eze;
            c1324610kZfLIZJ.LJJI(getUserAvatarFromXml());
            BorderInfo borderInfoLIZ = C496970JeJ.LIZ(c1811320xEg.LIZJ.user);
            boolean zOI0 = ((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).oI0();
            float f8 = 60.0f;
            if (borderInfoLIZ != null) {
                if (c1811320xEg.LIZLLL) {
                    f8 = 70.0f;
                    f6 = 4.0f;
                } else {
                    f6 = 3.0f;
                }
                LIZLLL(f8, f6);
                C1324570kZb.LIZIZ(borderInfoLIZ.icon, getIvAvatarBorderFromXml());
                C786410Ut5.LLJJIII(getIvAvatarBorderFromXml(), 0);
                C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                String str2 = c1811320xEg.LIZ;
                User user = c1811320xEg.LIZJ.user;
                DataChannel dataChannel = c1811320xEg.LIZIZ;
                boolean z = c1811320xEg.LJI;
                c1810690xDf.getClass();
                C1810690xDf.LJJJJ(str2, user, borderInfoLIZ, dataChannel, z);
            } else if (c1811320xEg.LIZJ.roomId > 0) {
                if (LiveAvatarEntranceUnifySetting.getValue()) {
                    if (c1811320xEg.LIZLLL) {
                        f3 = 66.0f;
                    } else {
                        f3 = 58.0f;
                    }
                    LIZLLL(f3, 0.0f);
                    C1143680frq.LIZLLL(getIvAvatarBorderFromXml(), "tiktok_live_revenue_demand_1", "ttlive_ranking_list_on_live_border_new.png");
                } else if (zOI0) {
                    if (c1811320xEg.LIZLLL) {
                        f8 = 68.0f;
                    }
                    LIZLLL(f8, 0.0f);
                    C1324570kZb.LIZ(getIvAvatarBorderFromXml(), R.drawable.f9z);
                } else {
                    if (c1811320xEg.LIZLLL) {
                        f2 = 62.0f;
                    } else {
                        f2 = 54.0f;
                    }
                    LIZLLL(f2, 0.0f);
                    C1324570kZb.LIZ(getIvAvatarBorderFromXml(), R.drawable.f9y);
                }
                C786410Ut5.LLJJIII(getIvAvatarBorderFromXml(), 0);
            } else {
                C786410Ut5.LLJJIII(getIvAvatarBorderFromXml(), 8);
            }
            if (c1811320xEg.LIZJ.roomId > 0) {
                boolean zIsRankingListItemLiveWebpDisabled = LiveRankingAndPrivilegeDowngradeSetting.isRankingListItemLiveWebpDisabled(C500260Jjc.LJIIZILJ(c1811320xEg.LIZIZ));
                boolean value = LiveAvatarEntranceUnifySetting.getValue();
                if (zIsRankingListItemLiveWebpDisabled) {
                    C1810740xDk.LIZIZ(getIvOnGoingFromXml(), zIsRankingListItemLiveWebpDisabled, value);
                } else if (value) {
                    int iLIZIZ2 = (int) C497740JfY.LIZIZ(2.5f);
                    getIvOnGoingFromXml().setPadding(iLIZIZ2, iLIZIZ2, iLIZIZ2, iLIZIZ2);
                    ViewGroup.LayoutParams layoutParams3 = getIvOnGoingFromXml().getLayoutParams();
                    float f9 = 21.0f;
                    if (c1811320xEg.LIZLLL) {
                        f5 = 21.0f;
                    } else {
                        f5 = 19.0f;
                    }
                    layoutParams3.width = (int) C497740JfY.LIZIZ(f5);
                    ViewGroup.LayoutParams layoutParams4 = getIvOnGoingFromXml().getLayoutParams();
                    if (!c1811320xEg.LIZLLL) {
                        f9 = 19.0f;
                    }
                    layoutParams4.height = (int) C497740JfY.LIZIZ(f9);
                    C500260Jjc.LJJLJLI((int) C497740JfY.LIZIZ(2.5f), getIvOnGoingFromXml());
                    C500260Jjc.LJJLJ((int) C497740JfY.LIZIZ(2.5f), getIvOnGoingFromXml());
                    C1810740xDk.LIZIZ(getIvOnGoingFromXml(), zIsRankingListItemLiveWebpDisabled, value);
                } else {
                    if (zOI0) {
                        int iLIZIZ3 = (int) C497740JfY.LIZIZ(3.0f);
                        getIvOnGoingFromXml().setPadding(iLIZIZ3, iLIZIZ3, iLIZIZ3, iLIZIZ3);
                        getIvOnGoingFromXml().getLayoutParams().width = (int) C497740JfY.LIZIZ(24.0f);
                        getIvOnGoingFromXml().getLayoutParams().height = (int) C497740JfY.LIZIZ(24.0f);
                        C1324720kZq ivOnGoingFromXml = getIvOnGoingFromXml();
                        if (c1811320xEg.LIZLLL) {
                            f4 = 3.0f;
                        } else {
                            f4 = 1.0f;
                        }
                        C500260Jjc.LJJLJLI((int) C497740JfY.LIZIZ(f4), ivOnGoingFromXml);
                        C1324720kZq ivOnGoingFromXml2 = getIvOnGoingFromXml();
                        if (c1811320xEg.LIZLLL) {
                            f7 = 3.0f;
                        }
                        C500260Jjc.LJJLJ((int) C497740JfY.LIZIZ(f7), ivOnGoingFromXml2);
                    }
                    C1143680frq.LJI(getIvOnGoingFromXml(), C1811310xEf.LIZ(), null, true);
                }
                C12ES.LJIILL(0, getIvOnGoingFromXml());
            } else {
                C12ES.LJIILL(8, getIvOnGoingFromXml());
            }
        }
        C786410Ut5.v8(this, new ACListenerS161S0100000_27(c1811320xEg, 20));
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
    }

    public final void setIvAvatarBorderFromXml(C1324720kZq c1324720kZq) {
        this.LLILZIL = c1324720kZq;
    }

    public final void setIvOnGoingFromXml(C1324720kZq c1324720kZq) {
        this.LLILZLL = c1324720kZq;
    }

    public final void setMaskFromXml(View view) {
        this.LLILLJJLI = view;
    }

    public final void setRankingLabelContainer(C1811290xEd c1811290xEd) {
        this.LLIZLLLIL = c1811290xEd;
    }

    public final void setTvUserDescriptionFromXml(C16F5 c16f5) {
        this.LLIZ = c16f5;
    }

    public final void setUserAvatarFromXml(ImageView imageView) {
        this.LL = imageView;
    }

    public final void setUserNameFromXml(C16F5 c16f5) {
        this.LLILZ = c16f5;
    }

    public final void setUserTicketFromXml(C16F5 c16f5) {
        this.LLILLL = c16f5;
    }

    public C1811280xEc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.hkh, this, true);
        setGravity(81);
    }

    public final void LIZLLL(float f, float f2) {
        C1324720kZq ivAvatarBorderFromXml = getIvAvatarBorderFromXml();
        ViewGroup.LayoutParams layoutParams = getIvAvatarBorderFromXml().getLayoutParams();
        layoutParams.width = (int) C497740JfY.LIZIZ(f);
        layoutParams.height = (int) C497740JfY.LIZIZ(f);
        C786410Ut5.u6(ivAvatarBorderFromXml, layoutParams);
        C500260Jjc.LJLJI((int) C497740JfY.LIZIZ(f2), getIvOnGoingFromXml());
        C500260Jjc.LJJLJ((int) C497740JfY.LIZIZ(f2), getIvOnGoingFromXml());
    }

    public final void LJ(C16F5 c16f5, C16F5 c16f52) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.01f, -0.0f, 0.18f, 1.0f));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS254S0100000_4(c16f5, 6));
        valueAnimatorOfFloat.start();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setDuration(500L);
        valueAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.7f, 0.01f, 1.0f, 1.01f));
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS254S0100000_4(c16f52, 7));
        valueAnimatorOfFloat2.addListener(new AAListenerS275S0200000_27(c16f5, this, 1));
        valueAnimatorOfFloat2.setStartDelay(300L);
        valueAnimatorOfFloat2.start();
    }
}
