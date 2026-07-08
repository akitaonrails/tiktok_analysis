package X;

import Y.ARunnableS12S0201000_4;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.router.model.AnswerInnerAnchor;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HeV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C446130HeV {
    public final IMessageAbility LIZ;
    public final MessageViewModel LIZIZ;
    public final ViewOnAttachStateChangeListenerC20604515jv LIZJ;
    public C446140HeW LIZLLL;
    public boolean LJ;

    public final void LIZJ(C1875407We c1875407We) {
        int iIntValue;
        InterfaceC427070Gor interfaceC427070Gor;
        C446140HeW c446140HeW = this.LIZLLL;
        if (c446140HeW == null) {
            return;
        }
        Integer numValueOf = Integer.valueOf(c446140HeW.LIZ.selectedAnswerIndex);
        numValueOf.intValue();
        if (!c446140HeW.LIZ.isMultiAnswer) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 0;
        }
        if (Intrinsics.LJFF(c446140HeW.LIZ.uuid, c1875407We.LIZ) && iIntValue == c1875407We.LIZIZ) {
            this.LIZLLL = null;
            Integer.valueOf(c446140HeW.LIZ.selectedAnswerIndex).intValue();
            Message message = c446140HeW.LIZ;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LIZJ;
            String str = message.uuid;
            AnswerInnerAnchor answerInnerAnchor = c446140HeW.LIZIZ;
            if (viewOnAttachStateChangeListenerC20604515jv != null && str != null && str.length() > 0 && answerInnerAnchor != null) {
                Map<String, InterfaceC427070Gor> map = C00EO.LIZ;
                String str2 = answerInnerAnchor.type;
                if (str2 != null && (interfaceC427070Gor = (InterfaceC427070Gor) ((LinkedHashMap) C00EO.LIZ).get(str2)) != null && viewOnAttachStateChangeListenerC20604515jv.isAttachedToWindow()) {
                    LIZ(viewOnAttachStateChangeListenerC20604515jv, str, answerInnerAnchor, interfaceC427070Gor, 0);
                }
            }
        }
    }

    public C446130HeV(IMessageAbility iMessageAbility, MessageViewModel messageViewModel, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        this.LIZ = iMessageAbility;
        this.LIZIZ = messageViewModel;
        this.LIZJ = viewOnAttachStateChangeListenerC20604515jv;
    }

    public final void LIZ(final RecyclerView recyclerView, final String str, final AnswerInnerAnchor answerInnerAnchor, final InterfaceC427070Gor interfaceC427070Gor, final int i) {
        PowerCell powerCell;
        C1858660yT2 c1858660yT2;
        if (!recyclerView.isAttachedToWindow() || i >= 10) {
            return;
        }
        for (int childCount = recyclerView.getChildCount() - 1; -1 < childCount; childCount--) {
            final View childAt = recyclerView.getChildAt(childCount);
            if (childAt != null) {
                RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(childAt);
                if ((childViewHolder instanceof PowerCell) && (powerCell = (PowerCell) childViewHolder) != null) {
                    Object item = powerCell.getItem();
                    if ((item instanceof C1858660yT2) && (c1858660yT2 = (C1858660yT2) item) != null && Intrinsics.LJFF(c1858660yT2.LLILLJJLI, str)) {
                        final int height = childAt.getHeight();
                        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(childAt, new Runnable() { // from class: X.0Gos
                            public final void LIZ() {
                                if (childAt.isAttachedToWindow()) {
                                    if (childAt.getHeight() != height) {
                                        this.LIZIZ(recyclerView, str, answerInnerAnchor, interfaceC427070Gor, i + 1);
                                        return;
                                    }
                                    C1170804i2 c1170804i2LIZ = interfaceC427070Gor.LIZ(childAt, answerInnerAnchor);
                                    if (c1170804i2LIZ == null) {
                                        this.LIZIZ(recyclerView, str, answerInnerAnchor, interfaceC427070Gor, i + 1);
                                        return;
                                    }
                                    int top = (c1170804i2LIZ.LIZ.getTop() + c1170804i2LIZ.LIZIZ) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(60.0d)));
                                    C446130HeV c446130HeV = this;
                                    RecyclerView recyclerView2 = recyclerView;
                                    c446130HeV.getClass();
                                    if (top != 0) {
                                        int i2 = (int) (recyclerView2.getResources().getDisplayMetrics().heightPixels * 0.5f);
                                        if (Math.abs(top) <= i2) {
                                            recyclerView2.smoothScrollBy(0, top);
                                            return;
                                        }
                                        int i3 = (top <= 0 ? -1 : 1) * i2;
                                        recyclerView2.scrollBy(0, top - i3);
                                        if (i3 != 0) {
                                            ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(recyclerView2, new ARunnableS12S0201000_4(i3, recyclerView2, recyclerView2, 2));
                                        }
                                    }
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("TakoMixCardAnchorScroller@92d7.awaitAnchorAndScroll$$inlined$doOnPreDraw$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("TakoMixCardAnchorScroller@92d7.awaitAnchorAndScroll$$inlined$doOnPreDraw$1");
                            }
                        });
                        return;
                    }
                }
            }
        }
        LIZIZ(recyclerView, str, answerInnerAnchor, interfaceC427070Gor, i + 1);
    }

    public final void LIZIZ(final RecyclerView recyclerView, final String str, final AnswerInnerAnchor answerInnerAnchor, final InterfaceC427070Gor interfaceC427070Gor, final int i) {
        HandlerHook.viewPostDelay(recyclerView, new Runnable() { // from class: X.0Got
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TakoMixCardAnchorScroller@92d7.retryLater$1");
                try {
                    this.LL.LIZ(recyclerView, str, answerInnerAnchor, interfaceC427070Gor, i);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TakoMixCardAnchorScroller@92d7.retryLater$1");
            }
        }, 200L);
    }
}
