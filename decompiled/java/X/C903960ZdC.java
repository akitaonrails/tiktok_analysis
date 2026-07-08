package X;

import Y.AAListenerS325S0100000_14;
import Y.ATListenerS447S0100000_14;
import Y.AUListenerS263S0100000_14;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import android.widget.Space;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.IMPendingReactionViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist.IMReactionListSheet;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZdC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C903960ZdC {
    public final Context LIZ;
    public final View LIZIZ;
    public final SmartImageView LIZJ;
    public final Space LIZLLL;
    public final boolean LJ;
    public final IMPendingReactionViewModel LJFF;
    public final MessagePowerListAbility LJI;
    public final ChatroomEventAbility LJII;
    public final InterfaceC879300YeW LJIIIIZZ;
    public final Context LJIIIZ;
    public final C904030ZdJ LJIIJ;
    public final View LJIIJJI;
    public IMReactionListSheet LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public final RecyclerView LJIILL;
    public final C01GW LJIILLIIL;
    public MessageReactionsState LJIIZILJ;
    public ValueAnimator LJIJ;
    public int LJIJI;

    public final void LIZJ() {
        if (this.LIZJ == null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addListener(new AAListenerS325S0100000_14(this, 11));
        valueAnimatorOfFloat.addListener(new AAListenerS325S0100000_14(this, 10));
        valueAnimatorOfFloat.addListener(new AAListenerS325S0100000_14(this, 9));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS263S0100000_14(this, 3));
        OvershootInterpolator overshootInterpolator = C426210GnT.LIZ;
        valueAnimatorOfFloat.setInterpolator(C426210GnT.LIZIZ);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
        this.LJIJ = valueAnimatorOfFloat;
        new C423520Gj8();
    }

    public final C869590Y9l LIZIZ(C869590Y9l c869590Y9l) {
        C869590Y9l next;
        Iterator<C869590Y9l> it2 = this.LJI.vi2().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getUuid(), c869590Y9l.getUuid())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public final void LIZ(C869590Y9l c869590Y9l, MessageReactionsState messageReactionsState) {
        if (messageReactionsState instanceof MessageReactionsState.Hidden) {
            C786410Ut5.LJLLLLLL(8, this.LIZIZ);
            Space space = this.LIZLLL;
            if (space != null) {
                ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = 0;
                    C786410Ut5.W5(space, layoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            return;
        }
        this.LJIJI = c869590Y9l.getMsgType();
        IMReactionListSheet iMReactionListSheet = this.LJIIL;
        if (iMReactionListSheet != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(iMReactionListSheet), null, null, new C875180YUy(iMReactionListSheet, c869590Y9l, null), 3);
        }
        final AwS415S0200000_14 awS415S0200000_14 = new AwS415S0200000_14(this, c869590Y9l, 105);
        this.LIZIZ.setOnTouchListener(new ATListenerS447S0100000_14(new C19290410dS(this.LJIIIZ, new C21648719nx() { // from class: X.0ZdF
            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                awS415S0200000_14.invoke();
                return true;
            }

            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                awS415S0200000_14.invoke();
                super.onLongPress(motionEvent);
            }

            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                awS415S0200000_14.invoke();
                return true;
            }
        }, null), 1));
        if (Intrinsics.LJFF(this.LJIIZILJ, messageReactionsState)) {
            return;
        }
        IMPendingReactionViewModel iMPendingReactionViewModel = this.LJFF;
        InterfaceC879330YeZ interfaceC879330YeZ = iMPendingReactionViewModel.LL.get(c869590Y9l.getUuid());
        if (interfaceC879330YeZ == null) {
            interfaceC879330YeZ = C879290YeV.LIZ;
        }
        if (messageReactionsState instanceof MessageReactionsState.ReactionList) {
            List<MessageReactionsState.ReactionList.ReactionListData> reactions = ((MessageReactionsState.ReactionList) messageReactionsState).getReactions();
            if (!(reactions instanceof Collection) || !reactions.isEmpty()) {
                Iterator<MessageReactionsState.ReactionList.ReactionListData> it2 = reactions.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().getReaction(), interfaceC879330YeZ)) {
                        LJ(messageReactionsState, interfaceC879330YeZ);
                        IMPendingReactionViewModel iMPendingReactionViewModel2 = this.LJFF;
                        iMPendingReactionViewModel2.LL.remove(c869590Y9l.getUuid());
                        return;
                    }
                }
            }
        }
        LJ(messageReactionsState, C879290YeV.LIZ);
    }

    public final void LIZLLL(C455420HtU c455420HtU, boolean z) {
        C1331670kl3 c1331670kl3LJIIIIZZ;
        SmartImageView smartImageView = this.LIZJ;
        if (smartImageView == null) {
            C0W8I.LIZ.getClass();
            if (!C0W8I.LIZIZ() && !C0W8I.LIZJ()) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("if this message (msgType=");
            sbLIZ.append(this.LJIJI);
            sbLIZ.append(") does not support big aimoji reaction, update MessageReactionsState#messageSupportsBigAimoji to exclude this message type.");
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        C786410Ut5.LJLLLLLL(0, smartImageView);
        C786410Ut5.u5(this.LIZJ, 1.0f);
        this.LJIIIIZZ.LIZIZ(c455420HtU);
        C06TB c06tb = C06TB.STABLE_STICKER;
        if (c455420HtU.LIZJ.LIZIZ.size() == 1) {
            c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIZ((String) C13LP.LJJJJZI(c455420HtU.LIZJ.LIZIZ));
        } else {
            c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(C904290Zdj.LIZ(C904090ZdP.LIZ(c455420HtU.LIZJ))));
        }
        c1331670kl3LJIIIIZZ.LIZLLL = true;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        c1331670kl3LJIIIIZZ.LJIIIIZZ = iLIZIZ;
        c1331670kl3LJIIIIZZ.LJIIIZ = iLIZIZ2;
        c1331670kl3LJIIIIZZ.LIZLLL("IMReactionPanel");
        C1332130kln.LIZJ(c1331670kl3LJIIIIZZ, c06tb);
        c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
        c1331670kl3LJIIIIZZ.LJJ(this.LIZJ);
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        if (z) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addListener(new AAListenerS325S0100000_14(this, 14));
            valueAnimatorOfFloat.addListener(new AAListenerS325S0100000_14(this, 13));
            valueAnimatorOfFloat.addListener(new AAListenerS325S0100000_14(this, 12));
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS263S0100000_14(this, 4));
            valueAnimatorOfFloat.setInterpolator(C426210GnT.LIZIZ);
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.start();
            this.LJIJ = valueAnimatorOfFloat;
            return;
        }
        C786410Ut5.u5(this.LIZJ, 1.0f);
        C786410Ut5.LJLLLLLL(0, this.LIZJ);
        ViewGroup.LayoutParams layoutParams = this.LIZJ.getLayoutParams();
        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        C786410Ut5.G6(this.LIZJ, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x0320  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState r22, X.InterfaceC879330YeZ r23) {
        /*
            Method dump skipped, instruction units count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C903960ZdC.LJ(com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState, X.0YeZ):void");
    }

    public C903960ZdC(Context context, View view, SmartImageView smartImageView, Space space, boolean z, IMPendingReactionViewModel iMPendingReactionViewModel, MessagePowerListAbility messagePowerListAbility, ChatroomEventAbility chatroomEventAbility, C459150HzV c459150HzV) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        this.LIZ = context;
        this.LIZIZ = view;
        this.LIZJ = smartImageView;
        this.LIZLLL = space;
        this.LJ = z;
        this.LJFF = iMPendingReactionViewModel;
        this.LJI = messagePowerListAbility;
        this.LJII = chatroomEventAbility;
        this.LJIIIIZZ = c459150HzV;
        Context context2 = view.getContext();
        this.LJIIIZ = context2;
        C904030ZdJ c904030ZdJ = new C904030ZdJ(context2);
        this.LJIIJ = c904030ZdJ;
        View viewFindViewById = view.findViewById(R.id.ncm);
        this.LJIIJJI = viewFindViewById;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.sty);
        recyclerView.setAdapter(c904030ZdJ);
        C423520Gj8 c423520Gj8 = new C423520Gj8();
        c423520Gj8.LLILLL = 50L;
        c423520Gj8.LLILZ = 50L;
        c423520Gj8.LLILZIL = 150L;
        c423520Gj8.LLILZLL = 150L;
        recyclerView.setItemAnimator(c423520Gj8);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        this.LJIILL = recyclerView;
        this.LJIILLIIL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(391));
        recyclerView.setBackground(null);
        C786410Ut5.LJLLLLLL(8, view.findViewById(R.id.stl));
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
        }
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        recyclerView.setClipChildren(false);
        recyclerView.setClipToPadding(false);
        viewFindViewById.setBackground(null);
        View view2 = this.LJIIJJI;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            C786410Ut5.W5(view2, layoutParams);
            recyclerView.addItemDecoration(new C0DXR() { // from class: X.06Wh
                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view3, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                    int itemCount;
                    int childAdapterPosition = recyclerView2.getChildAdapterPosition(view3);
                    AbstractC21673619ry adapter = recyclerView2.getAdapter();
                    boolean z2 = false;
                    if (adapter != null) {
                        itemCount = adapter.getItemCount();
                    } else {
                        itemCount = 0;
                    }
                    if (childAdapterPosition < itemCount - 1) {
                        if (recyclerView2.getLayoutDirection() == 1) {
                            z2 = true;
                        }
                        if (z2) {
                            rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                        } else {
                            rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                        }
                    }
                }
            });
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
