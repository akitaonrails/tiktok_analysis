package X;

import Y.ACListenerS152S0100000_17;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.GameBackgroundColorLevelChannel;
import com.bytedance.android.live.publicscreen.api.MsgViewShowingTabChannel;
import com.bytedance.android.live.publicscreen.api.NonGiftMessageChannel;
import com.bytedance.android.livesdk.chatroom.behavior.SuctionBottomBehavior;
import com.bytedance.android.livesdk.chatroom.ui.SmoothLinearLayoutManager;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0f4Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1113120f4Y extends LinearLayout {
    public C781550UlF LL;
    public C16F5 LLILLJJLI;
    public C16F5 LLILLL;
    public FrameLayout LLILZ;
    public View LLILZIL;
    public ConstraintLayout LLILZLL;
    public C16FK LLIZ;
    public C16F5 LLIZLLLIL;
    public C16F5 LLJ;
    public final C1111720f2I LLJI;
    public C1113130f4Z LLJIJIL;
    public boolean LLJILJIL;
    public final C11NJ LLJILJILJ;
    public int LLJILLL;
    public DataChannel LLJJ;
    public InterfaceC776970Udr LLJJI;
    public boolean LLJJIII;
    public long LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C1113110f4X LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C1111730f2J LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public InterfaceC784660UqG LLJL;
    public final C1113190f4f LLJLIL;

    private final User getAnchor() {
        return (User) this.LLJJJIL.getValue();
    }

    private final FrameLayout getFoldLayout() {
        return (FrameLayout) this.LLJJL.getValue();
    }

    private final FrameLayout getTitleLayout() {
        return (FrameLayout) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final void LIZJ() {
        Integer num;
        if (InterfaceC772390URp.H.LIZIZ().booleanValue()) {
            if (!this.LLJJIII) {
                C1113130f4Z c1113130f4Z = (C1113130f4Z) findViewById(R.id.mye);
                this.LLJIJIL = c1113130f4Z;
                InterfaceC776970Udr interfaceC776970Udr = this.LLJJI;
                if (interfaceC776970Udr != null) {
                    if (c1113130f4Z != null) {
                        c1113130f4Z.setCollapsed(false);
                    }
                    C1113130f4Z c1113130f4Z2 = this.LLJIJIL;
                    if (c1113130f4Z2 != null) {
                        DataChannel dataChannel = this.LLJJ;
                        c1113130f4Z2.LLILZIL = interfaceC776970Udr;
                        c1113130f4Z2.LLIZ.clear();
                        List<GiftMessage> listLIZ = interfaceC776970Udr.LIZ();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("listMessage = ");
                        sbLIZ.append(listLIZ.size());
                        C20441214yg.LJIIIZ("LiveGameGiftHistoryView", C2188811AlT.LIZIZ(sbLIZ));
                        Iterator<GiftMessage> it2 = listLIZ.iterator();
                        while (it2.hasNext()) {
                            c1113130f4Z2.LLIZ.add(new C1111770f2N(it2.next()));
                        }
                        if (!c1113130f4Z2.LLIZ.isEmpty()) {
                            c1113130f4Z2.LLIZLLLIL = (C1111770f2N) C13LP.LJJLIIIJJI(c1113130f4Z2.LLIZ);
                        }
                        c1113130f4Z2.getContext();
                        c1113130f4Z2.LLILLJJLI = new C1111720f2I(c1113130f4Z2.LLIZ);
                        c1113130f4Z2.LIZ();
                        SmoothLinearLayoutManager smoothLinearLayoutManager = new SmoothLinearLayoutManager(c1113130f4Z2.getContext());
                        smoothLinearLayoutManager.setStackFromEnd(true);
                        c1113130f4Z2.LLILLL.setMaxHeight(0);
                        c1113130f4Z2.LLILLL.setLayoutManager(smoothLinearLayoutManager);
                        C1114120f6A c1114120f6A = new C1114120f6A(new Runnable() { // from class: X.0Uv9
                            @Override // java.lang.Runnable
                            public final void run() {
                                C1C7U.LIZ("LiveGameGiftHistoryView@1122.setGameGiftHistoryManager$translateAddAnimator$1");
                                C1C7U.LIZIZ("LiveGameGiftHistoryView@1122.setGameGiftHistoryManager$translateAddAnimator$1");
                            }
                        }, new Runnable() { // from class: X.0UvA
                            @Override // java.lang.Runnable
                            public final void run() {
                                C1C7U.LIZ("LiveGameGiftHistoryView@1122.setGameGiftHistoryManager$translateAddAnimator$2");
                                C1C7U.LIZIZ("LiveGameGiftHistoryView@1122.setGameGiftHistoryManager$translateAddAnimator$2");
                            }
                        });
                        c1114120f6A.LLIZ = false;
                        c1114120f6A.LLJJJIL = new AwS561S0100000_17(c1113130f4Z2, 573);
                        c1113130f4Z2.LLILLL.setItemAnimator(c1114120f6A);
                        c1113130f4Z2.LLJIJIL = new C1113190f4f(c1113130f4Z2.LLILLL, c1113130f4Z2.getMessagesHintViewFromXml(), dataChannel, false, null);
                        c1113130f4Z2.LLILLL.setAdapter(c1113130f4Z2.LLILLJJLI);
                        InterfaceC776970Udr interfaceC776970Udr2 = c1113130f4Z2.LLILZIL;
                        if (interfaceC776970Udr2 != null) {
                            interfaceC776970Udr2.LIZJ(c1113130f4Z2.LLJILJIL);
                        }
                    }
                }
                this.LLJJIII = true;
            }
            DataChannel dataChannel2 = this.LLJJ;
            if (dataChannel2 == null || (num = (Integer) dataChannel2.gg0(MsgViewShowingTabChannel.class)) == null || num.intValue() != 1) {
                LIZ();
            } else {
                LIZIZ();
            }
            if (!getTtliveTabCommentFromXml().hasOnClickListeners()) {
                C786410Ut5.l8(getTtliveTabCommentFromXml(), new ACListenerS152S0100000_17(this, 166));
            }
            if (!getTtliveTabGiftFromXml().hasOnClickListeners()) {
                C786410Ut5.l8(getTtliveTabGiftFromXml(), new ACListenerS152S0100000_17(this, 167));
            }
            DataChannel dataChannel3 = this.LLJJ;
            if (dataChannel3 != null) {
                dataChannel3.CQ2(NonGiftMessageChannel.class, this, new AwS596S0100000_17(this, 632));
            }
            DataChannel dataChannel4 = this.LLJJ;
            if (dataChannel4 != null) {
                dataChannel4.DQ2(GameBackgroundColorLevelChannel.class, this, new AwS596S0100000_17(this, 633));
            }
        } else {
            C1113130f4Z c1113130f4Z3 = this.LLJIJIL;
            if (c1113130f4Z3 != null) {
                C12ES.LJIILL(4, c1113130f4Z3);
            }
            C12ES.LJIILL(0, getLayoutCommentAllFromXml());
            C12ES.LJIILL(4, getRedDotFromXml());
            C439101nJ.LJI(getLayoutMsgTabFromXml());
            setMsgViewTabState(-1);
        }
        LJII();
    }

    public final void LIZLLL() {
        View view;
        C1111730f2J c1111730f2J = this.LLJJJJLIIL;
        if (c1111730f2J == null || (view = c1111730f2J.itemView) == null) {
            return;
        }
        view.animate().withLayer().translationY(-view.getHeight()).setDuration(50L).start();
    }

    public final void LJII() {
        if (InterfaceC772390URp.H.LIZIZ().booleanValue()) {
            C12ES.LJIILL(0, getLayoutMsgTabFromXml());
        }
        if (this.LLJJJJ.LIZLLL.size() == 0 && this.LLJJJJ.LJI == null) {
            C12ES.LJIILL(0, getDefaultGiftMessageFromXml());
            C12ES.LJIILL(4, getContainerViewFromXml());
        } else {
            C439101nJ.LJI(getDefaultGiftMessageFromXml());
            C12ES.LJIILL(0, getContainerViewFromXml());
        }
    }

    public final String getAnchorId() {
        return (String) this.LLJJJ.getValue();
    }

    public final C16FK getContainerViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ets);
            this.LLIZ = (C16FK) callbackFindViewById;
        }
        return (C16FK) callbackFindViewById;
    }

    public final C16F5 getDefaultGiftMessageFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fit);
            this.LLILLL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final C779420Uho getGameFloatWindowLogHelper() {
        return (C779420Uho) this.LLJJIJIIJIL.getValue();
    }

    public final FrameLayout getLayoutCommentAllFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.m_h);
            this.LLILZ = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final ConstraintLayout getLayoutMsgTabFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.mcs);
            this.LLILZLL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C1112280f3C getMessageBehaviorProvider() {
        return (C1112280f3C) this.LLJJJJJIL.getValue();
    }

    public final C16F5 getMessagesHintViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.o_f);
            this.LLILLJJLI = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final C781550UlF getRecyclerViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.t0q);
            this.LL = (C781550UlF) callbackFindViewById;
        }
        return (C781550UlF) callbackFindViewById;
    }

    public final View getRedDotFromXml() {
        View view = this.LLILZIL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.t16);
        this.LLILZIL = viewFindViewById;
        return viewFindViewById;
    }

    public final long getRoomId() {
        return ((Number) this.LLJJIJIL.getValue()).longValue();
    }

    public final C16F5 getTtliveTabCommentFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.yux);
            this.LLIZLLLIL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final C16F5 getTtliveTabGiftFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.yuy);
            this.LLJ = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final void LIZ() {
        C1113190f4f c1113190f4f;
        getTtliveTabCommentFromXml().setSelected(true);
        getTtliveTabGiftFromXml().setSelected(false);
        C1113130f4Z c1113130f4Z = this.LLJIJIL;
        if (c1113130f4Z != null) {
            C12ES.LJIILL(4, c1113130f4Z);
        }
        C12ES.LJIILL(0, getLayoutCommentAllFromXml());
        setMsgViewTabState(0);
        View redDotFromXml = getRedDotFromXml();
        if (redDotFromXml != null) {
            C12ES.LJIILL(4, redDotFromXml);
        }
        if (!C500260Jjc.LJJJJIZL(getLayoutCommentAllFromXml()) || (c1113190f4f = this.LLJLIL) == null) {
            return;
        }
        C1113190f4f.LIZLLL(c1113190f4f, EnumC1091490eVf.NORMAL, 6);
    }

    public final void LIZIZ() {
        getTtliveTabGiftFromXml().setSelected(true);
        getTtliveTabCommentFromXml().setSelected(false);
        C12ES.LJIILL(4, getLayoutCommentAllFromXml());
        C1113130f4Z c1113130f4Z = this.LLJIJIL;
        if (c1113130f4Z != null) {
            C12ES.LJIILL(0, c1113130f4Z);
        }
        setMsgViewTabState(1);
    }

    public final InterfaceC784660UqG getFloatMsgViewCallback2() {
        return this.LLJL;
    }

    private final void setMsgViewTabState(int i) {
        if (i == this.LLJILLL) {
            return;
        }
        this.LLJILLL = i;
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(Integer.valueOf(i), "g_broadcast_float_tab");
        DataChannel dataChannel = this.LLJJ;
        if (dataChannel != null) {
            dataChannel.zW(MsgViewShowingTabChannel.class, Integer.valueOf(i));
        }
        C1113130f4Z c1113130f4Z = this.LLJIJIL;
        if (c1113130f4Z != null) {
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            c1113130f4Z.setIsActivitiesTab(z);
        }
    }

    public final void LJ(AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o) {
        C1111730f2J c1111730f2J = this.LLJJJJLIIL;
        if (c1111730f2J == null) {
            return;
        }
        C1113110f4X c1113110f4X = this.LLJJJJ;
        if (c1113110f4X.LJI == null) {
            c1113110f4X.LJI = abstractC1110800f0o;
            View view = c1111730f2J.itemView;
            if (view != null) {
                C12ES.LJIILL(0, view);
            }
            C12ES.LJIILL(0, getFoldLayout());
            LIZLLL();
        } else {
            c1113110f4X.LJI = abstractC1110800f0o;
        }
        C1111730f2J c1111730f2J2 = this.LLJJJJLIIL;
        if (c1111730f2J2 != null) {
            c1111730f2J2.I5(abstractC1110800f0o);
        }
        LJII();
    }

    public final void LJFF(float f) {
        FrameLayout titleLayout = getTitleLayout();
        C786410Ut5.U4(titleLayout, f);
        if (f <= 0.0f) {
            C439101nJ.LJI(titleLayout);
        } else {
            C12ES.LJIILL(0, titleLayout);
        }
    }

    public final void setContainerViewFromXml(C16FK c16fk) {
        this.LLIZ = c16fk;
    }

    public final void setDefaultGiftMessageFromXml(C16F5 c16f5) {
        this.LLILLL = c16f5;
    }

    public final void setFloatMsgViewCallback2(InterfaceC784660UqG interfaceC784660UqG) {
        this.LLJL = interfaceC784660UqG;
    }

    public final void setLayoutCommentAllFromXml(FrameLayout frameLayout) {
        this.LLILZ = frameLayout;
    }

    public final void setLayoutMsgTabFromXml(ConstraintLayout constraintLayout) {
        this.LLILZLL = constraintLayout;
    }

    public final void setMessagesHintViewFromXml(C16F5 c16f5) {
        this.LLILLJJLI = c16f5;
    }

    public final void setRecyclerViewFromXml(C781550UlF c781550UlF) {
        this.LL = c781550UlF;
    }

    public final void setRedDotFromXml(View view) {
        this.LLILZIL = view;
    }

    public final void setTtliveTabCommentFromXml(C16F5 c16f5) {
        this.LLIZLLLIL = c16f5;
    }

    public final void setTtliveTabGiftFromXml(C16F5 c16f5) {
        this.LLJ = c16f5;
    }

    public C1113120f4Y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJILJILJ = new C11NJ();
        this.LLJILLL = -1;
        this.LLJJIJI = System.currentTimeMillis();
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 955));
        this.LLJJIJIL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(469));
        this.LLJJJ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(471));
        this.LLJJJIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(344));
        C1113110f4X c1113110f4X = new C1113110f4X(new C1113220f4i(this), new C1113180f4e(this));
        this.LLJJJJ = c1113110f4X;
        this.LLJJJJJIL = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(296));
        this.LLJJL = C292401Bi.LIZ(new AwS561S0100000_17(this, 575));
        this.LLJJLIIIJLLLLLLLZ = C292401Bi.LIZ(new AwS561S0100000_17(this, 572));
        LinearLayout.inflate(getContext(), R.layout.hrl, this);
        setBackgroundResource(R.drawable.ds7);
        getContext();
        C1111720f2I c1111720f2I = new C1111720f2I(c1113110f4X.LIZLLL);
        this.LLJI = c1111720f2I;
        this.LLJJJJLIIL = new C1111730f2J(C786410Ut5.Sd(R.layout.gqx, C786410Ut5.ne(getContext()), getFoldLayout()));
        SuctionBottomBehavior suctionBottomBehavior = (SuctionBottomBehavior) ((C16G1) getFoldLayout().getLayoutParams()).LIZ;
        if (suctionBottomBehavior != null) {
            suctionBottomBehavior.LJ = true;
        }
        SmoothLinearLayoutManager smoothLinearLayoutManager = new SmoothLinearLayoutManager(getContext());
        smoothLinearLayoutManager.LL = 1.0f;
        smoothLinearLayoutManager.mRecycleChildrenOnDetach = true;
        smoothLinearLayoutManager.LLILLJJLI = true;
        smoothLinearLayoutManager.setStackFromEnd(true);
        C1114120f6A c1114120f6A = new C1114120f6A(new Runnable() { // from class: X.0Uv7
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("LiveGameFloatWindowMsgView@437b.translateAddAnimator$1");
                C1C7U.LIZIZ("LiveGameFloatWindowMsgView@437b.translateAddAnimator$1");
            }
        }, new Runnable() { // from class: X.0Uv8
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("LiveGameFloatWindowMsgView@437b.translateAddAnimator$2");
                C1C7U.LIZIZ("LiveGameFloatWindowMsgView@437b.translateAddAnimator$2");
            }
        });
        c1114120f6A.LLIZ = false;
        c1114120f6A.LLJJJIL = new AwS561S0100000_17(this, 574);
        getRecyclerViewFromXml().setItemAnimator(c1114120f6A);
        getRecyclerViewFromXml().setLayoutManager(smoothLinearLayoutManager);
        getRecyclerViewFromXml().setAdapter(c1111720f2I);
        this.LLJLIL = new C1113190f4f(getRecyclerViewFromXml(), getMessagesHintViewFromXml(), this.LLJJ, true, new C1113250f4l(this));
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        C1113190f4f c1113190f4f;
        super.onVisibilityChanged(view, i);
        if (i == 0 && getVisibility() == 0 && C500260Jjc.LJJJJIZL(getLayoutCommentAllFromXml()) && (c1113190f4f = this.LLJLIL) != null) {
            C1113190f4f.LIZLLL(c1113190f4f, EnumC1091490eVf.NORMAL, 6);
        }
    }

    public static int LJI(ArrayList arrayList, ChatMessage chatMessage, ChatMessage chatMessage2) {
        MESSAGE message;
        C1110170ezn c1110170ezn = new C1110170ezn(chatMessage2);
        C1109770ez9 c1109770ez9LLIIIILZ = null;
        int i = -1;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            AbstractC1110800f0o abstractC1110800f0o = (AbstractC1110800f0o) C13LP.LJJJLZIJ(size, arrayList);
            if (abstractC1110800f0o != null && (message = abstractC1110800f0o.LJIL) != 0 && message.getMessageId() == chatMessage.getMessageId()) {
                c1109770ez9LLIIIILZ = abstractC1110800f0o.LLIIIILZ();
                i = size;
            }
        }
        if (i != -1) {
            if (c1109770ez9LLIIIILZ != null) {
                c1110170ezn.LJII(c1109770ez9LLIIIILZ);
            }
            ListProtector.remove(arrayList, i);
            ListProtector.add(arrayList, i, c1110170ezn);
        }
        return i;
    }
}
