package X;

import Y.AObserverS226S0100000_24;
import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveAvatarEntranceUnifySetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.widget.NextLiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.ListLiveCircleItemVM;
import com.ss.android.ugc.aweme.profile.model.LiveCircleParam;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s1K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1610840s1K extends FrameLayout implements InterfaceC1087200eOk {
    public final C1610770s1D LL;
    public final TuxTextView LLILLJJLI;
    public final C1324720kZq LLILLL;
    public View LLILZ;
    public InterfaceC1608890ryB LLILZIL;
    public InterfaceC662550Pyn LLILZLL;
    public User LLIZ;
    public final int LLIZLLLIL;
    public ListLiveCircleItemVM LLJ;
    public final C19EG LLJI;
    public boolean LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public int LLJJI;
    public InterfaceC1264960j1S LLJJIII;
    public int LLJJIJI;
    public String LLJJIJIIJIL;
    public final AObserverS226S0100000_24 LLJJIJIL;
    public final AObserverS226S0100000_24 LLJJJ;
    public final AObserverS226S0100000_24 LLJJJIL;

    public C1610840s1K getView() {
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        boolean zLJI = MethodIDManager.LJI(202397);
        super.onAttachedToWindow();
        User user = this.LLIZ;
        if (user != null && user.isLive()) {
            LIZIZ(user);
        }
        this.LLJJ = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(' ');
        User user2 = this.LLIZ;
        sbLIZ.append(user2 != null ? user2.getUid() : null);
        sbLIZ.append(" onAttachedToWindow");
        C20441214yg.LIZIZ("LYP_LOG", C2188811AlT.LIZIZ(sbLIZ));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJJ = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(' ');
        User user = this.LLIZ;
        sbLIZ.append(user != null ? user.getUid() : null);
        sbLIZ.append(" onDetachedFromWindow");
        C20441214yg.LIZIZ("LYP_LOG", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final Observer<Boolean> getNodeVisibleObserver() {
        return this.LLJJJ;
    }

    public final Observer<Boolean> getPageVisibleObserver() {
        return this.LLJJIJIL;
    }

    public final Observer<Boolean> getRefreshStateObserver() {
        return this.LLJJJIL;
    }

    /* JADX INFO: renamed from: getView, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ ViewGroup m58getView() {
        getView();
        return this;
    }

    public final boolean LIZ(LiveCircleParam liveCircleParam) {
        boolean zIsLive;
        NextLiveData nextLiveData;
        NextLiveData nextLiveData2;
        NextLiveData nextLiveData3;
        String uid;
        InterfaceC1608890ryB c1610740s1A;
        NextLiveData nextLiveData4;
        NextLiveData nextLiveData5;
        NextLiveData nextLiveData6;
        boolean z = true;
        if (liveCircleParam.sceneType == 0) {
            return false;
        }
        User user = liveCircleParam.user;
        this.LLIZ = user;
        this.LLJIJIL = liveCircleParam.needLiveBreathAnim;
        this.LLJJI = liveCircleParam.liveCircleViewType;
        this.LLJILJIL = liveCircleParam.enterMethod;
        this.LLJILJILJ = liveCircleParam.enterFromMerge;
        this.LLJJIJIIJIL = liveCircleParam.sortStatus;
        this.LLJJIJI = liveCircleParam.followListOrder;
        if (user != null) {
            zIsLive = user.isLive();
        } else {
            zIsLive = false;
        }
        if (liveCircleParam.forceSkipLive) {
            zIsLive = false;
        }
        if (zIsLive) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ListItemLiveCircleView");
            sbLIZ.append(" bind user ");
            User user2 = this.LLIZ;
            if (user2 != null) {
                uid = user2.getUid();
            } else {
                uid = null;
            }
            sbLIZ.append(uid);
            C20441214yg.LIZIZ("LYP_LOG", C2188811AlT.LIZIZ(sbLIZ));
            this.LLILZ = liveCircleParam.avatarView;
            C19EG c19eg = this.LLJI;
            if (c19eg != null) {
                if (this.LLJ == null) {
                    this.LLJ = C1087190eOj.LIZ(this.LLJJI, c19eg);
                }
                ListLiveCircleItemVM listLiveCircleItemVM = this.LLJ;
                if (listLiveCircleItemVM != null) {
                    listLiveCircleItemVM.zQ2();
                }
                ListLiveCircleItemVM listLiveCircleItemVM2 = this.LLJ;
                if (listLiveCircleItemVM2 != null && (nextLiveData6 = listLiveCircleItemVM2.LLILLL) != null) {
                    nextLiveData6.observe(c19eg, this.LLJJJ);
                }
                ListLiveCircleItemVM listLiveCircleItemVM3 = this.LLJ;
                if (listLiveCircleItemVM3 != null && (nextLiveData5 = listLiveCircleItemVM3.LLILLJJLI) != null) {
                    nextLiveData5.observe(c19eg, this.LLJJIJIL);
                }
                ListLiveCircleItemVM listLiveCircleItemVM4 = this.LLJ;
                if (listLiveCircleItemVM4 != null && (nextLiveData4 = listLiveCircleItemVM4.LL) != null) {
                    nextLiveData4.observe(c19eg, this.LLJJJIL);
                }
            }
            if (!this.LLJIJIL || this.LLIZLLLIL < ((int) C12ES.LIZJ(5.0f, getContext()))) {
                z = false;
            }
            this.LLJIJIL = z;
            if (z) {
                if (this.LLILZIL == null) {
                    C1610760s1C c1610760s1C = liveCircleParam.animationController;
                    if (c1610760s1C != null) {
                        View view = this.LLILZ;
                        c1610740s1A = new C1610750s1B(c1610760s1C, view, view, this.LL);
                    } else {
                        EnumC1610470s0j enumC1610470s0j = EnumC1610470s0j.SKYLIGHT;
                        View view2 = this.LLILZ;
                        c1610740s1A = new C1610740s1A(enumC1610470s0j, view2, view2, this.LL);
                    }
                    this.LLILZIL = c1610740s1A;
                    c1610740s1A.LJFF(null, C1610840s1K.class, null, null, null);
                }
                InterfaceC1608890ryB interfaceC1608890ryB = this.LLILZIL;
                if (interfaceC1608890ryB != null) {
                    interfaceC1608890ryB.LJIIIZ();
                }
                InterfaceC662550Pyn interfaceC662550Pyn = this.LLILZLL;
                if (interfaceC662550Pyn != null) {
                    interfaceC662550Pyn.LIZ();
                }
            }
            C786410Ut5.s0(this, 0);
            if (LiveAvatarEntranceUnifySetting.getValue()) {
                InterfaceC1608890ryB interfaceC1608890ryB2 = this.LLILZIL;
                if (interfaceC1608890ryB2 != null) {
                    interfaceC1608890ryB2.LJI();
                }
                InterfaceC1608890ryB interfaceC1608890ryB3 = this.LLILZIL;
                if (interfaceC1608890ryB3 != null) {
                    interfaceC1608890ryB3.LJII();
                }
                C786410Ut5.LLJJIII(this.LLILLL, 0);
                HandlerHook.viewPost(this.LLILLL, new ARunnableS106S0100000_6((Object) this, 299));
                this.LLILZLL = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3().LJIJJLI(this.LLILLL);
                C786410Ut5.LLLLZLL(this.LLILLJJLI, 8);
                this.LL.setInnerStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(2.5d))));
            } else {
                C786410Ut5.LLJJIII(this.LLILLL, 8);
                C786410Ut5.LLLLZLL(this.LLILLJJLI, 0);
            }
            if (C295310Bhp.LIZ()) {
                TuxTextView tuxTextView = this.LLILLJJLI;
                ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(33));
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(19));
                    C786410Ut5.W5(tuxTextView, layoutParams);
                    this.LLILLJJLI.setTuxFont(93);
                    this.LLILLJJLI.setBackgroundResource(R.drawable.f6n);
                    this.LL.setInnerStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
                    this.LL.setStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            return zIsLive;
        }
        InterfaceC1608890ryB interfaceC1608890ryB4 = this.LLILZIL;
        if (interfaceC1608890ryB4 != null) {
            interfaceC1608890ryB4.LJIIIIZZ();
        }
        InterfaceC1608890ryB interfaceC1608890ryB5 = this.LLILZIL;
        if (interfaceC1608890ryB5 != null) {
            interfaceC1608890ryB5.LJII();
        }
        InterfaceC662550Pyn interfaceC662550Pyn2 = this.LLILZLL;
        if (interfaceC662550Pyn2 != null) {
            interfaceC662550Pyn2.LJIIZILJ();
        }
        ListLiveCircleItemVM listLiveCircleItemVM5 = this.LLJ;
        if (listLiveCircleItemVM5 != null && (nextLiveData3 = listLiveCircleItemVM5.LL) != null) {
            nextLiveData3.removeObserver(this.LLJJJIL);
        }
        ListLiveCircleItemVM listLiveCircleItemVM6 = this.LLJ;
        if (listLiveCircleItemVM6 != null && (nextLiveData2 = listLiveCircleItemVM6.LLILLJJLI) != null) {
            nextLiveData2.removeObserver(this.LLJJIJIL);
        }
        ListLiveCircleItemVM listLiveCircleItemVM7 = this.LLJ;
        if (listLiveCircleItemVM7 != null && (nextLiveData = listLiveCircleItemVM7.LLILLJJLI) != null) {
            nextLiveData.removeObserver(this.LLJJJ);
        }
        C786410Ut5.s0(this, 8);
        return zIsLive;
    }

    public final void LIZIZ(User user) {
        SlimRoom slimRoom;
        boolean z;
        Object uid;
        String strLIZ;
        int size;
        String str;
        String str2;
        SlimRoom.LinkMic linkMic;
        List<Long> list;
        SlimRoom.LinkMic linkMic2;
        List<Long> list2;
        LiveMode streamType;
        int followStatus = user.getFollowStatus();
        int followStatus2 = 3;
        if (followStatus >= 0 && followStatus < 3) {
            followStatus2 = user.getFollowStatus();
        } else if (user.getFollowerStatus() == 0) {
            followStatus2 = 0;
        }
        String uid2 = null;
        try {
            slimRoom = (SlimRoom) C09C2.LIZ().LJII(user.roomData, SlimRoom.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            slimRoom = null;
        }
        if (slimRoom == null || (uid2 = Long.valueOf(slimRoom.getOwnerUserId()).toString()) == null || !Intrinsics.LJFF(uid2, user.getUid())) {
            z = false;
        } else {
            z = true;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", "click");
        c2344009Gk.LJIIIIZZ("enter_from_merge", this.LLJILJILJ);
        c2344009Gk.LJIIIIZZ("enter_method", this.LLJILJIL);
        c2344009Gk.LIZLLL(user.roomId, "room_id");
        if (slimRoom != null) {
            uid = Long.valueOf(slimRoom.getOwnerUserId());
        } else {
            uid = user.getUid();
        }
        c2344009Gk.LJ(uid, "anchor_id");
        c2344009Gk.LIZJ(followStatus2, "follow_status");
        c2344009Gk.LJIIIIZZ("request_id", "");
        if (slimRoom == null || (streamType = slimRoom.getStreamType()) == null) {
            strLIZ = "";
        } else {
            strLIZ = C354201Zc.LIZ(streamType);
        }
        c2344009Gk.LJIIIIZZ("live_type", strLIZ);
        if (slimRoom != null && (linkMic2 = slimRoom.getLinkMic()) != null && (list2 = linkMic2.audienceIdList) != null) {
            size = list2.size();
        } else {
            size = 0;
        }
        c2344009Gk.LJIIIIZZ("guest_cnt", String.valueOf(size));
        if (slimRoom != null && (linkMic = slimRoom.getLinkMic()) != null && (list = linkMic.audienceIdList) != null && list.size() > 0) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_guest_connection", str);
        if (z) {
            str2 = "anchor";
        } else {
            str2 = "guest";
        }
        c2344009Gk.LJIIIIZZ("mg_distribution_type", str2);
        if (!z ? (uid2 = user.getUid()) == null : uid2 == null) {
            uid2 = "";
        }
        c2344009Gk.LJIIIIZZ("distribution_user_list", uid2);
        if (this.LLJJIJIIJIL.length() > 0) {
            c2344009Gk.LJFF("sort_status", this.LLJJIJIIJIL);
            c2344009Gk.LIZJ(this.LLJJIJI, "followlist_order");
        }
        C486660J6q.LJIIJ(c2344009Gk.LIZ);
    }

    public final void setLiveCircleStrokeWidth(int i) {
        this.LL.setStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))));
    }

    public final void setOnListItemLiveCircleStatusChange(InterfaceC1264960j1S interfaceC1264960j1S) {
        this.LLJJIII = interfaceC1264960j1S;
    }

    public final void setTagTextSize(float f) {
        this.LLILLJJLI.LJJJJI(f);
    }

    public C1610840s1K(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLIZLLLIL = (int) C12ES.LIZJ(5.0f, context);
        this.LLJILJIL = "";
        this.LLJILJILJ = "";
        this.LLJJIJI = -1;
        this.LLJJIJIIJIL = "";
        this.LLJJIJIL = new AObserverS226S0100000_24(this, 34);
        this.LLJJJ = new AObserverS226S0100000_24(this, 33);
        this.LLJJJIL = new AObserverS226S0100000_24(this, 5);
        View viewSd = C786410Ut5.Sd(R.layout.deq, C786410Ut5.ne(context), this);
        C1610770s1D c1610770s1D = (C1610770s1D) viewSd.findViewById(R.id.ln2);
        this.LL = c1610770s1D;
        TuxTextView tuxTextView = (TuxTextView) viewSd.findViewById(R.id.zq7);
        this.LLILLJJLI = tuxTextView;
        this.LLILLL = (C1324720kZq) viewSd.findViewById(R.id.mts);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ListItemLiveCircleView);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.ListItemLiveCircleView_live_strokeWidth, C12ES.LIZJ(1.5f, context));
        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.ListItemLiveCircleView_tux_font, 92);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R$styleable.ListItemLiveCircleView_live_tag_extend_height, 0.0f);
        int dimension3 = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.ListItemLiveCircleView_live_circle_padding, C12ES.LIZJ(0.0f, context));
        int dimension4 = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.ListItemLiveCircleView_live_tag_height, C12ES.LIZJ(20.0f, context));
        typedArrayObtainStyledAttributes.recycle();
        tuxTextView.setTuxFont(i);
        tuxTextView.setHeight(dimension4);
        c1610770s1D.setStrokeWidth((int) dimension);
        if (dimension2 != 0.0f) {
            ViewGroup.LayoutParams layoutParams = c1610770s1D.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).bottomMargin = (int) dimension2;
            }
            C1610770s1D c1610770s1D2 = this.LL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1610770s1D2);
            c1610770s1D2.setLayoutParams(layoutParams);
        }
        if (dimension3 != 0) {
            this.LLIZLLLIL = dimension3;
            c1610770s1D.setPadding(dimension3, dimension3, dimension3, dimension3);
        }
        if (C1388190mED.LIZIZ(context) != null) {
            this.LLJI = C1388190mED.LIZIZ(context);
        }
        setClipChildren(false);
        C786410Ut5.s0(this, 8);
    }
}
