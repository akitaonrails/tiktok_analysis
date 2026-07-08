package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.im.core.proto.UrlStruct;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZdJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C904030ZdJ extends AbstractC21673619ry<AbstractC904080ZdO> {
    public final Context LL;
    public ValueAnimator LLILLL;
    public final List<InterfaceC904130ZdT> LLILLJJLI = new ArrayList();
    public final BPEAHandler LLILZ = new BPEAHandler(Looper.getMainLooper());
    public final int LLILZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    public C904030ZdJ(Context context) {
        this.LL = context;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        InterfaceC904130ZdT interfaceC904130ZdT = (InterfaceC904130ZdT) ListProtector.get(this.LLILLJJLI, i);
        if (interfaceC904130ZdT instanceof C904070ZdN) {
            MessageReactionsState.ReactionList.ReactionListData reactionListData = ((C904070ZdN) interfaceC904130ZdT).LIZ;
            if (reactionListData instanceof MessageReactionsState.ReactionList.ReactionListData.Emoji) {
                return 0;
            }
            if (reactionListData instanceof MessageReactionsState.ReactionList.ReactionListData.Aimoji) {
                return 1;
            }
            throw new C1954807lC();
        }
        if (interfaceC904130ZdT instanceof C904150ZdV) {
            return 2;
        }
        throw new C1954807lC();
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        ((AbstractC904080ZdO) viewHolder).onViewDetachedFromWindow();
    }

    public static int LLLFZ(List list, boolean z) {
        int iLIZIZ;
        int width;
        int width2;
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)) * 2;
        Iterator it2 = list.iterator();
        int iLIZIZ3 = 0;
        int i = 0;
        while (it2.hasNext()) {
            MessageReactionsState.ReactionList.ReactionListData reactionListData = (MessageReactionsState.ReactionList.ReactionListData) it2.next();
            if (reactionListData instanceof MessageReactionsState.ReactionList.ReactionListData.Aimoji) {
                int i2 = C904250Zdf.LLILLJJLI;
                int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
                int dimension = (int) C1383370m6R.LIZ.getResources().getDimension(R.dimen.a21);
                if (reactionListData.getCount() instanceof MessageReactionsState.ReactionList.Count.Show) {
                    C444830HcP c444830HcP = new C444830HcP();
                    c444830HcP.LJIILIIL(((MessageReactionsState.ReactionList.Count.Show) reactionListData.getCount()).getFormatCount());
                    c444830HcP.LJII(61);
                    width2 = c444830HcP.LIZIZ().getWidth() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                } else {
                    width2 = 0;
                }
                width = iLIZIZ4 + dimension + width2;
            } else if (reactionListData instanceof MessageReactionsState.ReactionList.ReactionListData.Emoji) {
                int i3 = C904240Zde.LLILLJJLI;
                MessageReactionsState.ReactionList.ReactionListData.Emoji emoji = (MessageReactionsState.ReactionList.ReactionListData.Emoji) reactionListData;
                if (!(emoji.getCount() instanceof MessageReactionsState.ReactionList.Count.Show)) {
                    width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                } else {
                    int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) * 2;
                    C444830HcP c444830HcP2 = new C444830HcP();
                    c444830HcP2.LJIILIIL(emoji.getEmoji().LIZ);
                    c444830HcP2.LJII(61);
                    int width3 = c444830HcP2.LIZIZ().getWidth();
                    C444830HcP c444830HcP3 = new C444830HcP();
                    c444830HcP3.LJIILIIL(((MessageReactionsState.ReactionList.Count.Show) emoji.getCount()).getFormatCount());
                    c444830HcP3.LJII(61);
                    width = iLIZIZ5 + width3 + c444830HcP3.LIZIZ().getWidth() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                }
            } else {
                throw new C1954807lC();
            }
            i += width;
        }
        if (z) {
            int i4 = C904100ZdQ.LLILLJJLI;
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)) + (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7)) * 2);
        } else {
            iLIZIZ = 0;
        }
        int size = list.size() + (z ? 1 : 0);
        if (size > 1) {
            iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)) * (size - 1);
        }
        return iLIZIZ2 + i + iLIZIZ + iLIZIZ3;
    }

    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLI, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(AbstractC904080ZdO abstractC904080ZdO, int i) {
        C1331670kl3 c1331670kl3LJIIIIZZ;
        InterfaceC904130ZdT interfaceC904130ZdT = (InterfaceC904130ZdT) C13LP.LJJJLZIJ(i, this.LLILLJJLI);
        if (interfaceC904130ZdT instanceof C904070ZdN) {
            C904070ZdN c904070ZdN = (C904070ZdN) interfaceC904130ZdT;
            MessageReactionsState.ReactionList.ReactionListData reactionListData = c904070ZdN.LIZ;
            if ((reactionListData instanceof MessageReactionsState.ReactionList.ReactionListData.Emoji) && (abstractC904080ZdO instanceof C904240Zde)) {
                MessageReactionsState.ReactionList.ReactionListData.Emoji emoji = (MessageReactionsState.ReactionList.ReactionListData.Emoji) reactionListData;
                boolean z = c904070ZdN.LIZIZ;
                C904040ZdK c904040ZdK = ((C904240Zde) abstractC904080ZdO).LL;
                Animator animator = c904040ZdK.LLILZLL;
                if (animator != null) {
                    animator.cancel();
                }
                C904110ZdR.LIZ(c904040ZdK.LLILLL, 1.0f);
                C786410Ut5.LLLLZLL(c904040ZdK.LLILLL, 0);
                C904110ZdR.LIZ(c904040ZdK.LLILZ, 1.0f);
                c904040ZdK.LLILLL.setText(emoji.getEmoji().LIZ);
                c904040ZdK.LIZ(emoji.getCount());
                if (z) {
                    Animator animator2 = c904040ZdK.LL;
                    if (animator2 != null) {
                        animator2.cancel();
                    }
                    Animator animatorLIZ = C419550Gcj.LIZ(c904040ZdK.LLILLL);
                    animatorLIZ.start();
                    c904040ZdK.LL = animatorLIZ;
                    return;
                }
                return;
            }
            C904070ZdN c904070ZdN2 = (C904070ZdN) interfaceC904130ZdT;
            MessageReactionsState.ReactionList.ReactionListData reactionListData2 = c904070ZdN2.LIZ;
            if (!(reactionListData2 instanceof MessageReactionsState.ReactionList.ReactionListData.Aimoji) || !(abstractC904080ZdO instanceof C904250Zdf)) {
                return;
            }
            MessageReactionsState.ReactionList.ReactionListData.Aimoji aimoji = (MessageReactionsState.ReactionList.ReactionListData.Aimoji) reactionListData2;
            boolean z2 = c904070ZdN2.LIZIZ;
            C904050ZdL c904050ZdL = ((C904250Zdf) abstractC904080ZdO).LL;
            C904120ZdS.LIZ(c904050ZdL.LLILLJJLI, 1.0f);
            C786410Ut5.LLFF(0, c904050ZdL.LLILLJJLI);
            C904120ZdS.LIZ(c904050ZdL.LLILLL, 1.0f);
            Animator animator3 = c904050ZdL.LLILZLL;
            if (animator3 != null) {
                animator3.cancel();
            }
            UrlStruct urlStructLIZ = C904090ZdP.LIZ(aimoji.getAimoji().LIZJ);
            SmartImageView smartImageView = c904050ZdL.LLILLJJLI;
            C06TB c06tb = C06TB.STABLE_STICKER;
            if (urlStructLIZ.url_list.size() == 1) {
                c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIZ((String) C13LP.LJJJJZI(urlStructLIZ.url_list));
            } else {
                c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(C904290Zdj.LIZ(urlStructLIZ)));
            }
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
            c1331670kl3LJIIIIZZ.LJIIIIZZ = iLIZIZ;
            c1331670kl3LJIIIIZZ.LJIIIZ = iLIZIZ2;
            c1331670kl3LJIIIIZZ.LIZLLL("AimojiReactionItemView");
            C1332130kln.LIZJ(c1331670kl3LJIIIIZZ, c06tb);
            c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LJIIIIZZ.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            MessageReactionsState.ReactionList.Count count = aimoji.getCount();
            if (count instanceof MessageReactionsState.ReactionList.Count.Show) {
                C786410Ut5.LLLLZLL(c904050ZdL.LLILLL, 0);
                c904050ZdL.LLILZIL = true;
                c904050ZdL.LLILLL.setText(((MessageReactionsState.ReactionList.Count.Show) count).getFormatCount());
            } else if (Intrinsics.LJFF(count, MessageReactionsState.ReactionList.Count.Hidden.INSTANCE)) {
                C786410Ut5.LLLLZLL(c904050ZdL.LLILLL, 8);
                c904050ZdL.LLILZIL = false;
            } else {
                throw new C1954807lC();
            }
            if (!z2) {
                return;
            }
            Animator animatorLIZ2 = C419550Gcj.LIZ(c904050ZdL.LLILLJJLI);
            animatorLIZ2.start();
            c904050ZdL.LL = animatorLIZ2;
        }
    }

    public final void LLLII(MessageReactionsState.ReactionList reactionList, final InterfaceC904000ZdG interfaceC904000ZdG) {
        int iLIZIZ;
        C531650Kt9 it2 = C1697810uHb.LJIIIZ(this.LLILLJJLI).iterator();
        while (it2.LLILLL) {
            notifyItemChanged(it2.nextInt(), C904210Zdb.LIZ);
        }
        final int iLLLFZ = LLLFZ(reactionList.getReactions(), reactionList.getWithEllipsize());
        if (interfaceC904000ZdG instanceof C903980ZdE) {
            final List listLLIIII = C13LP.LLIIII(this.LLILLJJLI);
            ((ArrayList) this.LLILLJJLI).clear();
            for (MessageReactionsState.ReactionList.ReactionListData reactionListData : reactionList.getReactions()) {
                ((ArrayList) this.LLILLJJLI).add(new C904070ZdN(reactionListData, Intrinsics.LJFF(reactionListData.getReaction(), ((C903980ZdE) interfaceC904000ZdG).LIZ)));
            }
            if (reactionList.getWithEllipsize()) {
                ((ArrayList) this.LLILLJJLI).add(C904150ZdV.LIZ);
            }
            final List listLLIIII2 = C13LP.LLIIII(this.LLILLJJLI);
            C21342318fd.LIZ(new AbstractC21342018fa(listLLIIII, listLLIIII2) { // from class: X.0ZdM
                public final List<InterfaceC904130ZdT> LIZ;
                public final List<InterfaceC904130ZdT> LIZIZ;

                @Override // X.AbstractC21342018fa
                public final int LIZLLL() {
                    return this.LIZIZ.size();
                }

                @Override // X.AbstractC21342018fa
                public final int LJ() {
                    return this.LIZ.size();
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LIZ = listLLIIII;
                    this.LIZIZ = listLLIIII2;
                }

                @Override // X.AbstractC21342018fa
                public final boolean LIZ(int i, int i2) {
                    InterfaceC904130ZdT interfaceC904130ZdT;
                    InterfaceC904130ZdT interfaceC904130ZdT2 = (InterfaceC904130ZdT) C13LP.LJJJLZIJ(i, this.LIZ);
                    if (interfaceC904130ZdT2 == null || (interfaceC904130ZdT = (InterfaceC904130ZdT) C13LP.LJJJLZIJ(i2, this.LIZIZ)) == null) {
                        return true;
                    }
                    if (interfaceC904130ZdT2 instanceof C904070ZdN) {
                        if (interfaceC904130ZdT instanceof C904070ZdN) {
                            C904070ZdN c904070ZdN = (C904070ZdN) interfaceC904130ZdT2;
                            C904070ZdN c904070ZdN2 = (C904070ZdN) interfaceC904130ZdT;
                            if (!Intrinsics.LJFF(c904070ZdN.LIZ.getCount(), c904070ZdN2.LIZ.getCount()) || !Intrinsics.LJFF(c904070ZdN.LIZ, c904070ZdN2.LIZ) || c904070ZdN.LIZIZ != c904070ZdN2.LIZIZ) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    } else if (!(interfaceC904130ZdT2 instanceof C904150ZdV)) {
                        throw new C1954807lC();
                    }
                    return true;
                }

                @Override // X.AbstractC21342018fa
                public final boolean LIZIZ(int i, int i2) {
                    InterfaceC904130ZdT interfaceC904130ZdT;
                    InterfaceC904130ZdT interfaceC904130ZdT2 = (InterfaceC904130ZdT) C13LP.LJJJLZIJ(i, this.LIZ);
                    if (interfaceC904130ZdT2 == null || (interfaceC904130ZdT = (InterfaceC904130ZdT) C13LP.LJJJLZIJ(i2, this.LIZIZ)) == null) {
                        return true;
                    }
                    if (interfaceC904130ZdT2 instanceof C904070ZdN) {
                        if ((interfaceC904130ZdT instanceof C904070ZdN) && Intrinsics.LJFF(((C904070ZdN) interfaceC904130ZdT2).LIZ.getReaction(), ((C904070ZdN) interfaceC904130ZdT).LIZ.getReaction())) {
                            return true;
                        }
                        return false;
                    }
                    if (interfaceC904130ZdT2 instanceof C904150ZdV) {
                        return interfaceC904130ZdT instanceof C904150ZdV;
                    }
                    throw new C1954807lC();
                }

                @Override // X.AbstractC21342018fa
                public final Object LIZJ(int i, int i2) {
                    C904070ZdN c904070ZdN;
                    C904070ZdN c904070ZdN2;
                    MessageReactionsState.ReactionList.Count count;
                    Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, this.LIZ);
                    Boolean bool = null;
                    if ((objLJJJLZIJ instanceof C904070ZdN) && (c904070ZdN = (C904070ZdN) objLJJJLZIJ) != null) {
                        Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(i2, this.LIZIZ);
                        if ((objLJJJLZIJ2 instanceof C904070ZdN) && (c904070ZdN2 = (C904070ZdN) objLJJJLZIJ2) != null) {
                            if (!Intrinsics.LJFF(c904070ZdN.LIZ.getCount(), c904070ZdN2.LIZ.getCount())) {
                                count = c904070ZdN2.LIZ.getCount();
                            } else {
                                count = null;
                            }
                            if (c904070ZdN2.LIZIZ) {
                                bool = Boolean.TRUE;
                            }
                            return new C904140ZdU(count, bool);
                        }
                        return Unit.LIZ;
                    }
                    return Unit.LIZ;
                }
            }, true).LIZJ(this);
            MessageReactionsState messageReactionsState = ((C903980ZdE) interfaceC904000ZdG).LIZJ;
            if (messageReactionsState instanceof MessageReactionsState.ReactionList) {
                MessageReactionsState.ReactionList reactionList2 = (MessageReactionsState.ReactionList) messageReactionsState;
                iLIZIZ = LLLFZ(reactionList2.getReactions(), reactionList2.getWithEllipsize());
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)) * 2;
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iLIZIZ, iLLLFZ);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0ZdD
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Integer num;
                    View view = ((C903980ZdE) interfaceC904000ZdG).LIZIZ;
                    int iIntValue = iLLLFZ;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
                            iIntValue = num.intValue();
                        }
                        layoutParams.width = iIntValue;
                        C786410Ut5.W5(view, layoutParams);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            });
            valueAnimatorOfInt.setDuration(150L);
            valueAnimatorOfInt.start();
            return;
        }
        if (interfaceC904000ZdG instanceof C07UA) {
            ((ArrayList) this.LLILLJJLI).clear();
            Iterator<MessageReactionsState.ReactionList.ReactionListData> it3 = reactionList.getReactions().iterator();
            while (it3.hasNext()) {
                ((ArrayList) this.LLILLJJLI).add(new C904070ZdN(it3.next(), false));
            }
            if (reactionList.getWithEllipsize()) {
                ((ArrayList) this.LLILLJJLI).add(C904150ZdV.LIZ);
            }
            View view = ((C07UA) interfaceC904000ZdG).LIZ;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = iLLLFZ;
                C786410Ut5.W5(view, layoutParams);
                notifyDataSetChanged();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        throw new C1954807lC();
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c904240Zde;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = C904100ZdQ.LLILLJJLI;
                    Context context = this.LL;
                    View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ckl, viewGroup, false);
                    viewTd.setBackground(C426210GnT.LIZ(context));
                    viewTd.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                    c904240Zde = new C904100ZdQ(viewTd);
                } else {
                    "unknown view type".toString();
                    throw new IllegalStateException("unknown view type");
                }
            } else {
                int i3 = C904250Zdf.LLILLJJLI;
                c904240Zde = new C904250Zdf(new C904050ZdL(this.LL));
            }
        } else {
            int i4 = C904240Zde.LLILLJJLI;
            c904240Zde = new C904240Zde(new C904040ZdK(this.LL));
        }
        try {
            View view = c904240Zde.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c904240Zde.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c904240Zde.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c904240Zde.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c904240Zde.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c904240Zde.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c904240Zde.getClass().getName();
        return c904240Zde;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        AbstractC904080ZdO abstractC904080ZdO = (AbstractC904080ZdO) viewHolder;
        if (list.isEmpty()) {
            onBindViewHolder(abstractC904080ZdO, i);
            return;
        }
        for (Object obj : list) {
            if (obj instanceof C904140ZdU) {
                C904140ZdU c904140ZdU = (C904140ZdU) obj;
                if (Intrinsics.LJFF(c904140ZdU.LIZIZ, Boolean.TRUE)) {
                    abstractC904080ZdO.I5();
                }
                MessageReactionsState.ReactionList.Count count = c904140ZdU.LIZ;
                if (count != null) {
                    abstractC904080ZdO.S5(count);
                }
            } else if (Intrinsics.LJFF(obj, C904200Zda.LIZ)) {
                abstractC904080ZdO.N5();
            } else if (Intrinsics.LJFF(obj, C904190ZdZ.LIZ)) {
                abstractC904080ZdO.L5();
            } else if (Intrinsics.LJFF(obj, C904220Zdc.LIZ)) {
                abstractC904080ZdO.R5();
            } else if (Intrinsics.LJFF(obj, C904210Zdb.LIZ)) {
                abstractC904080ZdO.P5();
            }
        }
    }
}
