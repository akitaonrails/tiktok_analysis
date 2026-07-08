package X;

import Y.ALAdapterS0S0100000_2;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc;
import com.ss.android.ugc.aweme.social.sticker.api.service.IStorySocialEventStickerService;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS22S0111000_22;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: renamed from: X.06ph, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1727906ph implements InterfaceC1629006Zk {
    public final LifecycleOwner LIZ;
    public final C1294120jmU LIZIZ;
    public final FrameLayout LIZJ;
    public final SessionInfo LIZLLL;
    public final int LJ;
    public final Function0<Unit> LJFF;
    public final C1231704rr LJI;
    public InterfaceC1728206pk LJII;
    public InterfaceC1728106pj LJIIIIZZ;
    public boolean LJIIIZ;
    public final AtomicInteger LJIIJ;

    public final void LIZIZ() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LIZJ, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.addListener(new ALAdapterS0S0100000_2(this, 0));
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    @Override // X.InterfaceC1629006Zk
    public final void LJLJJLL() {
        this.LJI.LIZIZ();
        this.LJIIIZ = false;
        InterfaceC1728206pk interfaceC1728206pk = this.LJII;
        if (interfaceC1728206pk != null) {
            interfaceC1728206pk.LJLJJLL();
        }
    }

    public C1727906ph(LifecycleOwner lifecycleOwner, C1294120jmU c1294120jmU, FrameLayout frameLayout, SessionInfo sessionInfo, int i, AwS546S0100000_2 awS546S0100000_2) {
        C1231704rr c1231704rr = new C1231704rr("PostToStory", null, 6);
        this.LIZ = lifecycleOwner;
        this.LIZIZ = c1294120jmU;
        this.LIZJ = frameLayout;
        this.LIZLLL = sessionInfo;
        this.LJ = i;
        this.LJFF = awS546S0100000_2;
        this.LJI = c1231704rr;
        this.LJIIJ = new AtomicInteger(0);
    }

    @Override // X.InterfaceC1629006Zk
    public final void LIZ(final boolean z, DataSource dataSource, final int i, final int i2, boolean z2, final boolean z3, Bitmap bitmap) {
        String nickName;
        boolean z4;
        PlayerController playerController;
        boolean z5;
        InterfaceC1728106pj interfaceC1728106pj;
        InterfaceC1728106pj interfaceC1728106pjLIZLLL;
        IStorySocialEventStickerService iStorySocialEventStickerService;
        AwS22S0111000_22 awS22S0111000_22;
        if (this.LJIIIZ) {
            C1231704rr c1231704rr = this.LJI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("skip playAnim showPostToStory=");
            sbLIZ.append(z);
            sbLIZ.append(" streakLevel=");
            sbLIZ.append(i);
            sbLIZ.append(" streakCount=");
            sbLIZ.append(i2);
            sbLIZ.append(" isMilestoneRes=");
            sbLIZ.append(z3);
            C2188811AlT.LIZIZ(sbLIZ);
            c1231704rr.LIZIZ();
            return;
        }
        this.LJIIIZ = true;
        C1231704rr c1231704rr2 = this.LJI;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("playAnim showPostToStory=");
        sbLIZ2.append(z);
        sbLIZ2.append(" streakLevel=");
        sbLIZ2.append(i);
        sbLIZ2.append(" streakCount=");
        sbLIZ2.append(i2);
        sbLIZ2.append(" isMilestoneRes=");
        sbLIZ2.append(z3);
        C2188811AlT.LIZIZ(sbLIZ2);
        c1231704rr2.LIZIZ();
        if (z) {
            InterfaceC1728106pj interfaceC1728106pj2 = this.LJIIIIZZ;
            if (interfaceC1728106pj2 != null) {
                interfaceC1728106pj2.cancel(false);
            }
            int i3 = this.LJ;
            int i4 = AbstractC1711506n3.LIZ;
            if (i3 == i4) {
                interfaceC1728106pjLIZLLL = new C06QD(this.LIZLLL, i, z2);
            } else if (i3 == AbstractC1711506n3.LIZIZ && (iStorySocialEventStickerService = (IStorySocialEventStickerService) PluggableExtentionKt.pluggableSpi$default(IStorySocialEventStickerService.class, false, false, false, 14, null)) != null) {
                interfaceC1728106pjLIZLLL = iStorySocialEventStickerService.LIZLLL(7, this.LIZIZ.getContext());
            } else {
                interfaceC1728106pjLIZLLL = null;
            }
            this.LJIIIIZZ = interfaceC1728106pjLIZLLL;
            if (interfaceC1728106pjLIZLLL != null) {
                if (this.LJ == i4) {
                    awS22S0111000_22 = null;
                } else {
                    awS22S0111000_22 = new AwS22S0111000_22(this, i, z2, 0);
                }
                interfaceC1728106pjLIZLLL.LIZJ(awS22S0111000_22);
            }
        } else {
            this.LJIIIIZZ = null;
        }
        IMUser singleChatFromUser = this.LIZLLL.getSingleChatFromUser();
        if (singleChatFromUser == null || (nickName = singleChatFromUser.getNickName()) == null) {
            nickName = "";
        }
        InterfaceC1728206pk interfaceC1728206pk = this.LJII;
        if (interfaceC1728206pk != null) {
            if (this.LJ == AbstractC1711506n3.LIZIZ) {
                z5 = true;
            } else {
                z5 = false;
            }
            interfaceC1728206pk.LLLII(i, nickName, z5);
            if (z && (interfaceC1728106pj = this.LJIIIIZZ) != null) {
                interfaceC1728106pj.LIZIZ(null, null);
            }
        } else if (z) {
            IStreakService.LJJIIZ.getClass();
            IStreakService iStreakServiceLIZ = C06LY.LIZ();
            if (this.LJ == AbstractC1711506n3.LIZIZ) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.LJII = iStreakServiceLIZ.p(z4, this.LIZJ, i, nickName, new AwS546S0100000_2(this, 35), new AwS581S0100000_2(this, 47));
            InterfaceC1728106pj interfaceC1728106pj3 = this.LJIIIIZZ;
            if (interfaceC1728106pj3 != null) {
                interfaceC1728106pj3.LIZIZ(null, null);
            }
        }
        this.LIZIZ.LIZLLL();
        C1294120jmU c1294120jmU = this.LIZIZ;
        C1584506Ih.LIZIZ(c1294120jmU);
        c1294120jmU.LIZ(c1294120jmU.getContext(), this.LIZ, new AlphaPlayerAction() { // from class: X.06pi
            @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
            public final void onVideoSizeChange(int i5, int i6, DataSource.ScaleType scaleType) {
            }

            @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
            public final void endAction() {
                this.LIZ.LJI.LIZIZ();
                if (!z3) {
                    this.LIZ.LJFF.invoke();
                    return;
                }
                if (!z) {
                    this.LIZ.LIZIZ();
                    return;
                }
                InterfaceC1728206pk interfaceC1728206pk2 = this.LIZ.LJII;
                if (interfaceC1728206pk2 != null) {
                    interfaceC1728206pk2.LLLLILI();
                }
            }

            @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
            public final void startAction() {
                InterfaceC1728206pk interfaceC1728206pk2;
                this.LIZ.LJI.LIZIZ();
                if (this.LIZ.LJIIJ.incrementAndGet() % 2 == 0) {
                    String conversationId = this.LIZ.LIZLLL.getConversationId();
                    String singleChatFromUserId = this.LIZ.LIZLLL.getSingleChatFromUserId();
                    if (singleChatFromUserId == null) {
                        singleChatFromUserId = "";
                    }
                    int i5 = i;
                    boolean z6 = z;
                    boolean z7 = z3;
                    int i6 = i2;
                    C0I0B.LJFF.LIZIZ();
                    Pair[] pairArr = new Pair[6];
                    pairArr[0] = new Pair("conversation_id", conversationId);
                    pairArr[1] = new Pair("from_user_id", singleChatFromUserId);
                    pairArr[2] = new Pair("streak_level", String.valueOf(i5));
                    pairArr[3] = new Pair("is_story", z6 ? "1" : CardStruct.IStatusCode.DEFAULT);
                    pairArr[4] = new Pair("streak_cnt", String.valueOf(i6));
                    pairArr[5] = new Pair("is_milestone_res", z7 ? "1" : CardStruct.IStatusCode.DEFAULT);
                    C20684815ws.LJIILLIIL("on_streak_anim_played", C2097608Jq.LJIIIIZZ(pairArr));
                }
                if (!z || (interfaceC1728206pk2 = this.LIZ.LJII) == null) {
                    return;
                }
                interfaceC1728206pk2.LJLJJI();
            }
        }, false);
        PlayerController playerController2 = c1294120jmU.LL;
        if (playerController2 != null) {
            playerController2.attachAlphaView(c1294120jmU);
        }
        if (bitmap != null && (playerController = c1294120jmU.LL) != null) {
            MaskSrc maskSrc = new MaskSrc();
            maskSrc.setName("numdata");
            maskSrc.setType(1);
            maskSrc.setBitmap(bitmap);
            playerController.setMask(maskSrc);
        }
        if (z3) {
            c1294120jmU.LIZJ(dataSource, true);
        } else {
            PlayerController playerController3 = c1294120jmU.LL;
            if (playerController3 != null) {
                playerController3.start(dataSource);
            }
        }
        C1584506Ih.LIZIZ(this.LIZJ);
    }
}
