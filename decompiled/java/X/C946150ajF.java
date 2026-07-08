package X;

import Y.ACListenerS118S0200000_15;
import Y.ACListenerS150S0100000_15;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.fragment.BaseMultiGuestLinkMicMatchFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.viewmodel.MultiGuestLinkMicMatchViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.LiveGuideCard;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestRecommendRoomInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ajF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C946150ajF extends ConstraintLayout {
    public final boolean LL;
    public final Function1<Boolean, Unit> LLILLJJLI;
    public boolean LLILLL;
    public ConstraintLayout LLILZ;
    public ConstraintLayout LLILZIL;
    public ConstraintLayout LLILZLL;
    public C16F5 LLIZ;
    public C16F5 LLIZLLLIL;
    public LiveIconView LLJ;
    public C1324720kZq LLJI;
    public C16F5 LLJIJIL;
    public C16F5 LLJILJIL;
    public C16F5 LLJILJILJ;
    public C16FS LLJILLL;
    public LiveIconView LLJJ;
    public C1324720kZq LLJJI;
    public C16F5 LLJJIII;
    public C16F5 LLJJIJI;
    public C16F5 LLJJIJIIJIL;
    public C16FS LLJJIJIL;
    public LiveDialog LLJJJ;
    public BaseMultiGuestLinkMicMatchFragment LLJJJIL;
    public String LLJJJJ;
    public long LLJJJJJIL;
    public Integer LLJJJJLIIL;

    public final void e0() {
        ImageModel avatarThumb;
        ImageModel avatarThumb2;
        if (this.LLJJJIL.roomList.isEmpty()) {
            return;
        }
        int size = this.LLJJJIL.roomList.size();
        BaseMultiGuestLinkMicMatchFragment baseMultiGuestLinkMicMatchFragment = this.LLJJJIL;
        int i = baseMultiGuestLinkMicMatchFragment.currentIndex;
        if (size > i) {
            MultiGuestRecommendRoomInfo multiGuestRecommendRoomInfo = (MultiGuestRecommendRoomInfo) ListProtector.get(baseMultiGuestLinkMicMatchFragment.roomList, i);
            final C16F5 c16f5 = this.LLIZ;
            if (c16f5 != null && !this.LLILLL) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                int i2 = this.LLJJJIL.applyCount;
                sbLIZ.append(i2 <= 1 ? C497740JfY.LJIIL(2131755543, 1, Integer.valueOf(i2)) : C497740JfY.LJIIL(2131755543, 2, Integer.valueOf(i2)));
                sbLIZ.append(". ");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                String string = this.LLJJJIL.getString(2131840602);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(string);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                SpannableString spannableString = new SpannableString(strLIZIZ2);
                C786410Ut5.p2(spannableString, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ezs, c16f5.getContext())), 0, strLIZIZ.length(), 17);
                C786410Ut5.p2(spannableString, new ClickableSpan() { // from class: X.0ajJ
                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View view) {
                        this.LL.getBaseFragment().o();
                        this.LL.getBaseFragment().dismissAllowingStateLoss();
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        super.updateDrawState(textPaint);
                        textPaint.setUnderlineText(false);
                        textPaint.setColor(C20736316Cj.LIZIZ(R.attr.ezq, c16f5.getContext()));
                        textPaint.clearShadowLayer();
                        textPaint.bgColor = 0;
                    }
                }, strLIZIZ.length(), strLIZIZ2.length(), 17);
                c16f5.setText(spannableString);
                c16f5.setHighlightColor(0);
                c16f5.setBackgroundColor(0);
                c16f5.setMovementMethod(LinkMovementMethod.getInstance());
            }
            if (this.LL) {
                LiveIconView liveIconView = this.LLJ;
                if (liveIconView != null) {
                    C500260Jjc.LLFFF(liveIconView);
                }
                C16F5 c16f52 = this.LLIZLLLIL;
                if (c16f52 != null) {
                    C500260Jjc.LLFFF(c16f52);
                }
                C16FS c16fs = this.LLJILLL;
                if (c16fs != null) {
                    c16fs.LJIIL();
                }
                User user = multiGuestRecommendRoomInfo.hostInfo;
                if (user != null && (avatarThumb2 = user.getAvatarThumb()) != null) {
                    C1143680frq.LJJI(this.LLJI, avatarThumb2, false);
                }
                C16F5 c16f53 = this.LLJIJIL;
                if (c16f53 != null) {
                    User user2 = multiGuestRecommendRoomInfo.hostInfo;
                    c16f53.setText(user2 != null ? user2.getNickName() : null);
                }
                if (!multiGuestRecommendRoomInfo.hostRecoTags.isEmpty()) {
                    C16F5 c16f54 = this.LLJILJIL;
                    if (c16f54 != null) {
                        BaseMultiGuestLinkMicMatchFragment baseMultiGuestLinkMicMatchFragment2 = this.LLJJJIL;
                        String str = (String) ListProtector.get(multiGuestRecommendRoomInfo.hostRecoTags, 0);
                        baseMultiGuestLinkMicMatchFragment2.getClass();
                        c16f54.setText(BaseMultiGuestLinkMicMatchFragment.SR(str));
                    }
                    C16F5 c16f55 = this.LLJILJIL;
                    if (c16f55 != null) {
                        C500260Jjc.LLFFF(c16f55);
                    }
                } else {
                    C16F5 c16f56 = this.LLJILJIL;
                    if (c16f56 != null) {
                        C500260Jjc.LJIILIIL(c16f56);
                    }
                }
                C16F5 c16f57 = this.LLJILJILJ;
                if (c16f57 != null) {
                    this.LLJJJIL.getClass();
                    String strRR = BaseMultiGuestLinkMicMatchFragment.RR(multiGuestRecommendRoomInfo);
                    if (a0.LJJJIL(strRR)) {
                        this.LLJJJIL.getClass();
                        strRR = BaseMultiGuestLinkMicMatchFragment.UR(multiGuestRecommendRoomInfo);
                    }
                    c16f57.setText(strRR);
                }
            } else {
                LiveIconView liveIconView2 = this.LLJ;
                if (liveIconView2 != null) {
                    C500260Jjc.LJIILIIL(liveIconView2);
                }
                C16F5 c16f58 = this.LLIZLLLIL;
                if (c16f58 != null) {
                    C500260Jjc.LJIILIIL(c16f58);
                }
                C16FS c16fs2 = this.LLJJIJIL;
                if (c16fs2 != null) {
                    c16fs2.LJIIL();
                }
                User user3 = multiGuestRecommendRoomInfo.hostInfo;
                if (user3 != null && (avatarThumb = user3.getAvatarThumb()) != null) {
                    C1143680frq.LJJI(this.LLJJI, avatarThumb, false);
                }
                C16F5 c16f59 = this.LLJJIII;
                if (c16f59 != null) {
                    User user4 = multiGuestRecommendRoomInfo.hostInfo;
                    c16f59.setText(user4 != null ? user4.getNickName() : null);
                }
                if (!multiGuestRecommendRoomInfo.hostRecoTags.isEmpty()) {
                    C16F5 c16f510 = this.LLJJIJI;
                    if (c16f510 != null) {
                        BaseMultiGuestLinkMicMatchFragment baseMultiGuestLinkMicMatchFragment3 = this.LLJJJIL;
                        String str2 = (String) ListProtector.get(multiGuestRecommendRoomInfo.hostRecoTags, 0);
                        baseMultiGuestLinkMicMatchFragment3.getClass();
                        c16f510.setText(BaseMultiGuestLinkMicMatchFragment.SR(str2));
                    }
                    C16F5 c16f511 = this.LLJJIJI;
                    if (c16f511 != null) {
                        C500260Jjc.LLFFF(c16f511);
                    }
                } else {
                    C16F5 c16f512 = this.LLJJIJI;
                    if (c16f512 != null) {
                        C500260Jjc.LJIILIIL(c16f512);
                    }
                }
                C16F5 c16f513 = this.LLJJIJIIJIL;
                if (c16f513 != null) {
                    this.LLJJJIL.getClass();
                    String strRR2 = BaseMultiGuestLinkMicMatchFragment.RR(multiGuestRecommendRoomInfo);
                    if (a0.LJJJIL(strRR2)) {
                        this.LLJJJIL.getClass();
                        strRR2 = BaseMultiGuestLinkMicMatchFragment.UR(multiGuestRecommendRoomInfo);
                    }
                    c16f513.setText(strRR2);
                }
            }
            String str3 = this.LLJJJJ;
            Integer num = this.LLJJJIL.waitingSize;
            int iIntValue = num != null ? num.intValue() : 0;
            MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel = this.LLJJJIL.viewModel;
            C942580adU.LJI(str3, multiGuestRecommendRoomInfo, iIntValue, multiGuestLinkMicMatchViewModel != null ? multiGuestLinkMicMatchViewModel.LLILZIL : null, this.LL, this.LLJJJJLIIL);
            MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel2 = this.LLJJJIL.viewModel;
            C942580adU.LIZLLL(multiGuestRecommendRoomInfo, "recommend_link_room_head", multiGuestLinkMicMatchViewModel2 != null ? multiGuestLinkMicMatchViewModel2.LLILZIL : null);
            MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel3 = this.LLJJJIL.viewModel;
            C942580adU.LIZLLL(multiGuestRecommendRoomInfo, "recommend_link_room_request", multiGuestLinkMicMatchViewModel3 != null ? multiGuestLinkMicMatchViewModel3.LLILZIL : null);
        }
    }

    public final BaseMultiGuestLinkMicMatchFragment getBaseFragment() {
        return this.LLJJJIL;
    }

    public final C16F5 getCancelTextView() {
        return this.LLIZ;
    }

    public final ConstraintLayout getGoLiveContainer() {
        return this.LLILZ;
    }

    public final LiveDialog getGoLiveDialog() {
        return this.LLJJJ;
    }

    public final Integer getGoLiveType() {
        return this.LLJJJJLIIL;
    }

    public final C16F5 getJoinOtherTitle() {
        return this.LLIZLLLIL;
    }

    public final ConstraintLayout getMatchJoinContainer1() {
        return this.LLILZIL;
    }

    public final ConstraintLayout getMatchJoinContainer2() {
        return this.LLILZLL;
    }

    public final String getPanelType() {
        return this.LLJJJJ;
    }

    public final LiveIconView getRefreshIcon() {
        return this.LLJ;
    }

    public final LiveIconView getRefreshIcon2() {
        return this.LLJJ;
    }

    public final C16FS getRequestLinkMicMatch() {
        return this.LLJILLL;
    }

    public final C16FS getRequestLinkMicMatch2() {
        return this.LLJJIJIL;
    }

    public final long getShowTimestamp() {
        return this.LLJJJJJIL;
    }

    public final C1324720kZq getTargetAnchorAvatar() {
        return this.LLJI;
    }

    public final C1324720kZq getTargetAnchorAvatar2() {
        return this.LLJJI;
    }

    public final C16F5 getTargetAnchorName() {
        return this.LLJIJIL;
    }

    public final C16F5 getTargetAnchorName2() {
        return this.LLJJIII;
    }

    public final C16F5 getTargetAnchorTag() {
        return this.LLJILJIL;
    }

    public final C16F5 getTargetAnchorTag2() {
        return this.LLJJIJI;
    }

    public final C16F5 getTargetRecoText() {
        return this.LLJILJILJ;
    }

    public final C16F5 getTargetRecoText2() {
        return this.LLJJIJIIJIL;
    }

    public final void setAutoDialog(boolean z) {
        this.LLILLL = z;
    }

    public final void setBaseFragment(BaseMultiGuestLinkMicMatchFragment baseMultiGuestLinkMicMatchFragment) {
        this.LLJJJIL = baseMultiGuestLinkMicMatchFragment;
    }

    public final void setCancelTextView(C16F5 c16f5) {
        this.LLIZ = c16f5;
    }

    public final void setGoLiveContainer(ConstraintLayout constraintLayout) {
        this.LLILZ = constraintLayout;
    }

    public final void setGoLiveDialog(LiveDialog liveDialog) {
        this.LLJJJ = liveDialog;
    }

    public final void setGoLiveType(Integer num) {
        this.LLJJJJLIIL = num;
    }

    public final void setJoinOtherTitle(C16F5 c16f5) {
        this.LLIZLLLIL = c16f5;
    }

    public final void setMatchJoinContainer1(ConstraintLayout constraintLayout) {
        this.LLILZIL = constraintLayout;
    }

    public final void setMatchJoinContainer2(ConstraintLayout constraintLayout) {
        this.LLILZLL = constraintLayout;
    }

    public final void setPanelType(String str) {
        this.LLJJJJ = str;
    }

    public final void setRefreshIcon(LiveIconView liveIconView) {
        this.LLJ = liveIconView;
    }

    public final void setRefreshIcon2(LiveIconView liveIconView) {
        this.LLJJ = liveIconView;
    }

    public final void setRequestLinkMicMatch(C16FS c16fs) {
        this.LLJILLL = c16fs;
    }

    public final void setRequestLinkMicMatch2(C16FS c16fs) {
        this.LLJJIJIL = c16fs;
    }

    public final void setShowTimestamp(long j) {
        this.LLJJJJJIL = j;
    }

    public final void setTargetAnchorAvatar(C1324720kZq c1324720kZq) {
        this.LLJI = c1324720kZq;
    }

    public final void setTargetAnchorAvatar2(C1324720kZq c1324720kZq) {
        this.LLJJI = c1324720kZq;
    }

    public final void setTargetAnchorName(C16F5 c16f5) {
        this.LLJIJIL = c16f5;
    }

    public final void setTargetAnchorName2(C16F5 c16f5) {
        this.LLJJIII = c16f5;
    }

    public final void setTargetAnchorTag(C16F5 c16f5) {
        this.LLJILJIL = c16f5;
    }

    public final void setTargetAnchorTag2(C16F5 c16f5) {
        this.LLJJIJI = c16f5;
    }

    public final void setTargetRecoText(C16F5 c16f5) {
        this.LLJILJILJ = c16f5;
    }

    public final void setTargetRecoText2(C16F5 c16f5) {
        this.LLJJIJIIJIL = c16f5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C946150ajF(Context context, BaseMultiGuestLinkMicMatchFragment baseMultiGuestLinkMicMatchFragment, boolean z, boolean z2, AwS594S0100000_15 awS594S0100000_15) {
        Integer numValueOf;
        LiveGuideCard liveGuideCard;
        LiveGuideCard liveGuideCard2;
        super(context, null);
        C16FS c16fs = null;
        this.LL = z2;
        this.LLILLJJLI = awS594S0100000_15;
        this.LLILLL = z;
        this.LLJJJIL = baseMultiGuestLinkMicMatchFragment;
        this.LLJJJJ = "";
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h_1, this, true);
        MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel = this.LLJJJIL.viewModel;
        if (multiGuestLinkMicMatchViewModel != null && (liveGuideCard2 = multiGuestLinkMicMatchViewModel.LLILZLL) != null) {
            numValueOf = Integer.valueOf(liveGuideCard2.scene);
        } else {
            numValueOf = null;
        }
        this.LLJJJJLIIL = numValueOf;
        this.LLILZ = (ConstraintLayout) findViewById(R.id.zu8);
        this.LLILZIL = (ConstraintLayout) findViewById(R.id.zu_);
        this.LLILZLL = (ConstraintLayout) findViewById(R.id.zua);
        View viewFindViewById = findViewById(R.id.zuj);
        C417600GZa c417600GZa = (C417600GZa) findViewById(R.id.pob);
        if (c417600GZa != null) {
            C786410Ut5.z8(c417600GZa, new ACListenerS150S0100000_15(this, 199));
        } else {
            c417600GZa = null;
        }
        C16F5 c16f5 = (C16F5) findViewById(R.id.zu4);
        this.LLIZ = c16f5;
        if (this.LLILLL) {
            if (c16f5 != null) {
                C500260Jjc.LJIILIIL(c16f5);
            }
            C500260Jjc.LJIILIIL(c417600GZa);
            C426750GoL.LJIIIZ(viewFindViewById, Integer.valueOf((int) C497740JfY.LIZIZ(16.0f)), Integer.valueOf((int) C497740JfY.LIZIZ(24.0f)), Integer.valueOf((int) C497740JfY.LIZIZ(16.0f)), 0, false, 16);
            this.LLJJJJ = "individual_panel";
        } else {
            C500260Jjc.LLFFF(c16f5);
            C500260Jjc.LLFFF(c417600GZa);
            C426750GoL.LJIIIZ(viewFindViewById, Integer.valueOf((int) C497740JfY.LIZIZ(50.0f)), Integer.valueOf((int) C497740JfY.LIZIZ(24.0f)), Integer.valueOf((int) C497740JfY.LIZIZ(8.0f)), 0, false, 16);
            this.LLJJJJ = "in_request_panel";
        }
        if (z2) {
            MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel2 = this.LLJJJIL.viewModel;
            if (multiGuestLinkMicMatchViewModel2 != null && (liveGuideCard = multiGuestLinkMicMatchViewModel2.LLILZLL) != null) {
                TextView textView = (TextView) findViewById(R.id.zu1);
                if (textView != null && liveGuideCard.title.length() > 0) {
                    textView.setText(liveGuideCard.title);
                }
                TextView textView2 = (TextView) findViewById(R.id.zu2);
                if (textView2 != null && liveGuideCard.desc.length() > 0) {
                    textView2.setText(liveGuideCard.desc);
                }
                C16FS c16fs2 = (C16FS) findViewById(R.id.zu7);
                if (c16fs2 != null) {
                    C786410Ut5.h8(c16fs2, new ACListenerS118S0200000_15(this, c16fs2, 36));
                }
            } else {
                ConstraintLayout constraintLayout = this.LLILZ;
                if (constraintLayout != null) {
                    C500260Jjc.LJIILIIL(constraintLayout);
                }
            }
            ConstraintLayout constraintLayout2 = this.LLILZIL;
            if (constraintLayout2 != null) {
                C500260Jjc.LLFFF(constraintLayout2);
            }
            LiveIconView liveIconView = (LiveIconView) findViewById(R.id.lmp);
            if (liveIconView != null) {
                C786410Ut5.g8(liveIconView, new ACListenerS150S0100000_15(this, 193));
                liveIconView.setIconTintAttr(R.attr.ezt);
            } else {
                liveIconView = null;
            }
            this.LLJ = liveIconView;
            this.LLIZLLLIL = (C16F5) findViewById(R.id.zub);
            C1324720kZq c1324720kZq = (C1324720kZq) findViewById(R.id.lx2);
            if (c1324720kZq != null) {
                C786410Ut5.e8(c1324720kZq, new ACListenerS150S0100000_15(this, 194));
            } else {
                c1324720kZq = null;
            }
            this.LLJI = c1324720kZq;
            C0GSX c0gsx = (C0GSX) findViewById(R.id.mi9);
            if (c0gsx != null) {
                this.LLJJJIL.getClass();
                BaseMultiGuestLinkMicMatchFragment.hS(c0gsx);
            }
            C1324720kZq c1324720kZq2 = (C1324720kZq) findViewById(R.id.lmz);
            if (c1324720kZq2 != null) {
                this.LLJJJIL.dS(c1324720kZq2);
            }
            this.LLJIJIL = (C16F5) findViewById(R.id.zul);
            this.LLJILJIL = (C16F5) findViewById(R.id.zun);
            this.LLJILJILJ = (C16F5) findViewById(R.id.zup);
            C16FS c16fs3 = (C16FS) findViewById(R.id.zuc);
            if (c16fs3 != null) {
                C786410Ut5.h8(c16fs3, new ACListenerS150S0100000_15(this, 195));
                c16fs = c16fs3;
            }
            this.LLJILLL = c16fs;
            ConstraintLayout constraintLayout3 = this.LLILZLL;
            if (constraintLayout3 != null) {
                C500260Jjc.LJIILIIL(constraintLayout3);
                return;
            }
            return;
        }
        ConstraintLayout constraintLayout4 = this.LLILZ;
        if (constraintLayout4 != null) {
            C500260Jjc.LJIILIIL(constraintLayout4);
        }
        ConstraintLayout constraintLayout5 = this.LLILZIL;
        if (constraintLayout5 != null) {
            C500260Jjc.LJIILIIL(constraintLayout5);
        }
        LiveIconView liveIconView2 = (LiveIconView) findViewById(R.id.lmp);
        if (liveIconView2 != null) {
            C500260Jjc.LJIILIIL(liveIconView2);
        } else {
            liveIconView2 = null;
        }
        this.LLJ = liveIconView2;
        C16F5 c16f52 = (C16F5) findViewById(R.id.zub);
        if (c16f52 != null) {
            C500260Jjc.LJIILIIL(c16f52);
        } else {
            c16f52 = null;
        }
        this.LLIZLLLIL = c16f52;
        LiveIconView liveIconView3 = (LiveIconView) findViewById(R.id.lmq);
        if (liveIconView3 != null) {
            C786410Ut5.g8(liveIconView3, new ACListenerS150S0100000_15(this, 196));
            liveIconView3.setIconTintAttr(R.attr.ezt);
        } else {
            liveIconView3 = null;
        }
        this.LLJJ = liveIconView3;
        C1324720kZq c1324720kZq3 = (C1324720kZq) findViewById(R.id.lx3);
        if (c1324720kZq3 != null) {
            C786410Ut5.e8(c1324720kZq3, new ACListenerS150S0100000_15(this, 197));
        } else {
            c1324720kZq3 = null;
        }
        this.LLJJI = c1324720kZq3;
        C0GSX c0gsx2 = (C0GSX) findViewById(R.id.mi_);
        if (c0gsx2 != null) {
            this.LLJJJIL.getClass();
            BaseMultiGuestLinkMicMatchFragment.hS(c0gsx2);
        }
        C1324720kZq c1324720kZq4 = (C1324720kZq) findViewById(R.id.ln0);
        if (c1324720kZq4 != null) {
            this.LLJJJIL.dS(c1324720kZq4);
        }
        this.LLJJIII = (C16F5) findViewById(R.id.zum);
        this.LLJJIJI = (C16F5) findViewById(R.id.zuo);
        this.LLJJIJIIJIL = (C16F5) findViewById(R.id.zuk);
        C16FS c16fs4 = (C16FS) findViewById(R.id.zud);
        if (c16fs4 != null) {
            C786410Ut5.h8(c16fs4, new ACListenerS150S0100000_15(this, 198));
            c16fs = c16fs4;
        }
        this.LLJJIJIL = c16fs;
        ConstraintLayout constraintLayout6 = this.LLILZLL;
        if (constraintLayout6 == null) {
            return;
        }
        C500260Jjc.LLFFF(constraintLayout6);
    }
}
