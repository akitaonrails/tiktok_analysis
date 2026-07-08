package X;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model.GiftPanelItemMetaData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import webcast.data.TPText;

/* JADX INFO: renamed from: X.0fQS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1126700fQS extends AbstractC21673619ry<AbstractC1126590fQH> implements InterfaceC1126640fQM {
    public final Context LL;
    public InterfaceC1126780fQa LLILLJJLI;
    public AbstractC1126600fQI<?> LLILLL;
    public AbstractC1126590fQH LLILZ;
    public long LLILZLL;
    public long LLIZLLLIL;
    public DataChannel LLJ;
    public C1128780fTo LLJI;
    public final LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> LLIZ = new LinkedList<>();
    public final C1126530fQB LLJIJIL = new Object() { // from class: X.0fQB
    };
    public long LLILZIL = C1131370fXz.LIZ;

    @Override // X.InterfaceC1126640fQM
    public final boolean LJIIIZ() {
        InterfaceC1126780fQa interfaceC1126780fQa = this.LLILLJJLI;
        return interfaceC1126780fQa != null && interfaceC1126780fQa.LJIIIZ();
    }

    @Override // X.InterfaceC1126640fQM
    public final boolean LJJJI() {
        InterfaceC1126780fQa interfaceC1126780fQa = this.LLILLJJLI;
        if (interfaceC1126780fQa != null) {
            return interfaceC1126780fQa.LJJJI();
        }
        return false;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLIZ.size();
    }

    @Override // X.InterfaceC1126640fQM
    public final AbstractC1126600fQI<?> LJIIIIZZ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1126640fQM
    public final void LJIIJJI(boolean z) {
        InterfaceC1126780fQa interfaceC1126780fQa = this.LLILLJJLI;
        if (interfaceC1126780fQa != null) {
            interfaceC1126780fQa.LJIIJJI(z);
        }
    }

    @Override // X.InterfaceC1126640fQM
    public final void LLJLLIL(AbstractC1126590fQH abstractC1126590fQH) {
        this.LLILZ = abstractC1126590fQH;
    }

    @Override // X.InterfaceC1126640fQM
    public final boolean LLLFFI(long j) {
        if (this.LLILZLL == j) {
            this.LLILZLL = 0L;
            return true;
        }
        return false;
    }

    public final int LLLFZ(long j) {
        Iterator<AbstractC1126600fQI<? extends AnonymousClass0054>> it2 = this.LLIZ.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next().LJI() == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int LLLI(long j) {
        int i = 0;
        for (AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI : this.LLIZ) {
            if (abstractC1126600fQI.LJI() == j && abstractC1126600fQI.LIZ != 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void LLLIIIIL(List<? extends AbstractC1126600fQI<? extends AnonymousClass0054>> list) {
        final List listLJJJJLI;
        int i;
        if (list == null) {
            listLJJJJLI = C13BV.INSTANCE;
        } else {
            int size = (((list.size() - 1) / 8) + 1) * 8;
            AbstractC1126600fQI[] abstractC1126600fQIArr = new AbstractC1126600fQI[size];
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                abstractC1126600fQIArr[i3] = new C01AR();
            }
            for (AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI : list) {
                int i4 = i2 / 8;
                int i5 = i2 % 8;
                if (i5 < 4) {
                    i = i5 * 2;
                } else {
                    i = ((i5 - 4) * 2) + 1;
                }
                int i6 = i + (i4 * 8);
                i2++;
                if (i6 < size) {
                    abstractC1126600fQIArr[i6] = abstractC1126600fQI;
                }
            }
            listLJJJJLI = C13LP.LJJJJLI(C13LQ.LJJLL(abstractC1126600fQIArr));
        }
        final LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList = this.LLIZ;
        C21342318fd.LIZ(new AbstractC21342018fa(linkedList, listLJJJJLI) { // from class: X.0fPP
            public final List<AbstractC1126600fQI<? extends AnonymousClass0054>> LIZ;
            public final List<AbstractC1126600fQI<? extends AnonymousClass0054>> LIZIZ;

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
                this.LIZ = linkedList;
                this.LIZIZ = listLJJJJLI;
            }

            public static boolean LJFF(AbstractC1126600fQI abstractC1126600fQI2, AbstractC1126600fQI abstractC1126600fQI3) {
                if (!TextUtils.equals(abstractC1126600fQI2.LJIIIZ(), abstractC1126600fQI3.LJIIIZ()) || !TextUtils.equals(abstractC1126600fQI2.LIZJ(), abstractC1126600fQI3.LIZJ())) {
                    return false;
                }
                ImageModel imageModelLJII = abstractC1126600fQI2.LJII();
                ImageModel imageModelLJII2 = abstractC1126600fQI3.LJII();
                if (imageModelLJII != imageModelLJII2 && (imageModelLJII == null || imageModelLJII2 == null || !Intrinsics.LJFF(imageModelLJII.getUri(), imageModelLJII2.getUri()))) {
                    return false;
                }
                ImageModel imageModelLJIIIIZZ = abstractC1126600fQI2.LJIIIIZZ();
                ImageModel imageModelLJIIIIZZ2 = abstractC1126600fQI3.LJIIIIZZ();
                if (imageModelLJIIIIZZ != imageModelLJIIIIZZ2 && (imageModelLJIIIIZZ == null || imageModelLJIIIIZZ2 == null || !Intrinsics.LJFF(imageModelLJIIIIZZ.getUri(), imageModelLJIIIIZZ2.getUri()))) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZ(int i7, int i8) {
                AbstractC1126600fQI abstractC1126600fQI2 = (AbstractC1126600fQI) ListProtector.get(this.LIZ, i7);
                AbstractC1126600fQI abstractC1126600fQI3 = (AbstractC1126600fQI) ListProtector.get(this.LIZIZ, i8);
                if ((abstractC1126600fQI2 instanceof AbstractC293401Bs) && (abstractC1126600fQI3 instanceof AbstractC293401Bs) && ((AbstractC293401Bs) abstractC1126600fQI2).LJJIIJZLJL() != ((AbstractC293401Bs) abstractC1126600fQI3).LJJIIJZLJL()) {
                    return false;
                }
                return LJFF(abstractC1126600fQI2, abstractC1126600fQI3);
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZIZ(int i7, int i8) {
                if (((AbstractC1126600fQI) ListProtector.get(this.LIZ, i7)).LJI() == ((AbstractC1126600fQI) ListProtector.get(this.LIZIZ, i8)).LJI()) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC21342018fa
            public final Object LIZJ(int i7, int i8) {
                LJFF((AbstractC1126600fQI) ListProtector.get(this.LIZ, i7), (AbstractC1126600fQI) ListProtector.get(this.LIZIZ, i8));
                return null;
            }
        }, true).LIZJ(this);
        this.LLIZ.clear();
        this.LLIZ.addAll(listLJJJJLI);
    }

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        return this.LLIZ.get(i).LJI();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return this.LLIZ.get(i).LIZ;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        AbstractC1126590fQH abstractC1126590fQH = (AbstractC1126590fQH) viewHolder;
        super.onViewDetachedFromWindow(abstractC1126590fQH);
        abstractC1126590fQH.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0fQB] */
    public AbstractC1126700fQS(Context context, InterfaceC1126780fQa interfaceC1126780fQa) {
        this.LL = context;
        this.LLILLJJLI = interfaceC1126780fQa;
    }

    public AbstractC1126590fQH LLLII(int i, ViewGroup viewGroup) {
        AbstractC1126590fQH c1126460fQ4;
        if (i != 1) {
            if (i != 17) {
                if (i != 19) {
                    if (i != 21) {
                        if (i != 9) {
                            if (i != 10) {
                                final View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.gt_, viewGroup, false);
                                c1126460fQ4 = new AbstractC1126590fQH(viewTd) { // from class: X.0fQb
                                    @Override // X.AbstractC1126590fQH
                                    public final void L5(AbstractC1126600fQI<?> abstractC1126600fQI, DataChannel dataChannel, int i2, int i3) {
                                        C786410Ut5.LJLLLLLL(8, this.LL);
                                    }
                                };
                            } else {
                                final View viewTd2 = C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.gta, viewGroup, false);
                                final C1126530fQB c1126530fQB = this.LLJIJIL;
                                c1126460fQ4 = new AbstractC1126590fQH(viewTd2, c1126530fQB) { // from class: X.0fQA
                                    public final View LLJJJ;

                                    @Override // X.AbstractC1126590fQH
                                    public final void N5() {
                                    }

                                    @Override // X.AbstractC1126590fQH
                                    public final void S5(int i2) {
                                    }

                                    @Override // X.AbstractC1126590fQH
                                    public final void V5() {
                                    }

                                    @Override // X.AbstractC1126590fQH
                                    public final void W5() {
                                    }

                                    @Override // X.AbstractC1126590fQH
                                    public final void a6(long j) {
                                    }

                                    @Override // X.AbstractC1126590fQH
                                    public final void c6(long j) {
                                    }

                                    @Override // X.AbstractC1126590fQH
                                    public final void onDestroy() {
                                    }

                                    @Override // X.AbstractC1126590fQH
                                    public final void U5() {
                                        C16F5 c16f5 = (C16F5) this.LL.findViewById(R.id.p6q);
                                        if (c16f5 != null) {
                                            c16f5.setTypeface(C1119920fFW.LIZJ(c16f5.getTextSize(), 500, c16f5.getContext()));
                                        } else {
                                            c16f5 = null;
                                        }
                                        this.LLILZ = c16f5;
                                        C1324720kZq c1324720kZq = (C1324720kZq) this.LL.findViewById(R.id.p6p);
                                        this.LLILZIL = c1324720kZq;
                                        if (c1324720kZq != null) {
                                            C786410Ut5.LLJJIII(c1324720kZq, 0);
                                        }
                                        this.LLILLL = (ImageView) this.LL.findViewById(R.id.mk_);
                                        this.LLIZ = (ImageView) this.LL.findViewById(R.id.noy);
                                    }

                                    @Override // X.AbstractC1126590fQH
                                    public final void b6(InterfaceC1126640fQM interfaceC1126640fQM) {
                                        this.LLJ = interfaceC1126640fQM;
                                    }

                                    {
                                        super(viewTd2);
                                        this.LLJJJ = viewTd2;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:70:0x0103  */
                                    @Override // X.AbstractC1126590fQH
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final void L5(X.AbstractC1126600fQI<?> r8, com.bytedance.ies.sdk.datachannel.DataChannel r9, int r10, int r11) {
                                        /*
                                            Method dump skipped, instruction units count: 262
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: X.C1126520fQA.L5(X.0fQI, com.bytedance.ies.sdk.datachannel.DataChannel, int, int):void");
                                    }
                                };
                            }
                        } else {
                            c1126460fQ4 = new C1126870fQj(C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.gsz, viewGroup, false));
                        }
                    } else {
                        final View viewTd3 = C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.gtb, viewGroup, false);
                        c1126460fQ4 = new AbstractC1126590fQH(viewTd3) { // from class: X.0fQl
                            public final C1324720kZq LLJJJ = (C1324720kZq) this.LL.findViewById(R.id.iwx);
                            public final C16F5 LLJJJIL;
                            public Spannable LLJJJJ;
                            public Spannable LLJJJJJIL;
                            public Spannable LLJJJJLIIL;

                            @Override // X.AbstractC1126590fQH
                            public final void S5(int i2) {
                            }

                            public final void e6() {
                                ImageModel imageModel;
                                GiftPanelItemMetaData giftPanelItemMetaData;
                                AbstractC1126600fQI<?> abstractC1126600fQI = this.LLIZLLLIL;
                                boolean z = abstractC1126600fQI != null ? abstractC1126600fQI.LIZJ : false;
                                if (!(abstractC1126600fQI instanceof C1127220fRI) || (giftPanelItemMetaData = ((C1127220fRI) abstractC1126600fQI).LJJIFFI.item) == null || (imageModel = giftPanelItemMetaData.icon) == null) {
                                    imageModel = null;
                                }
                                if (z) {
                                    C500260Jjc.LJIILIIL(this.LLILZIL);
                                    C500260Jjc.LLFFF(this.LLJJJ);
                                    if (imageModel != null) {
                                        C0JSS.LIZLLL(this.LLJJJ, imageModel);
                                    }
                                    C16F5 c16f5 = this.LLILZ;
                                    if (c16f5 != null) {
                                        C500260Jjc.LJIILIIL(c16f5);
                                    }
                                    C16F5 c16f52 = this.LLJJJIL;
                                    if (c16f52 != null) {
                                        c16f52.setText(this.LLJJJJ);
                                    }
                                } else {
                                    C500260Jjc.LLFFF(this.LLILZIL);
                                    C500260Jjc.LJIILIIL(this.LLJJJ);
                                    if (imageModel != null) {
                                        C0JSS.LIZLLL(this.LLILZIL, imageModel);
                                    }
                                    C16F5 c16f53 = this.LLILZ;
                                    if (c16f53 != null) {
                                        C500260Jjc.LLFFF(c16f53);
                                    }
                                    C16F5 c16f54 = this.LLJJJIL;
                                    if (c16f54 != null) {
                                        c16f54.setText(this.LLJJJJJIL);
                                    }
                                }
                                C16F5 c16f55 = this.LLILZ;
                                if (c16f55 != null) {
                                    c16f55.setText(this.LLJJJJ);
                                }
                                C16F5 c16f56 = this.LLJILJIL;
                                if (c16f56 != null) {
                                    c16f56.setText(this.LLJJJJLIIL);
                                }
                            }

                            @Override // X.AbstractC1126590fQH
                            public final void V5() {
                                super.V5();
                                C20441214yg.LIZIZ("LiveRevenueTouchPointLandscapeViewHolder", "onSelected landscape");
                                e6();
                            }

                            @Override // X.AbstractC1126590fQH
                            public final void W5() {
                                super.W5();
                                C20441214yg.LIZIZ("LiveRevenueTouchPointLandscapeViewHolder", "onUnSelected landscape");
                                e6();
                            }

                            {
                                C16F5 c16f5 = (C16F5) this.LL.findViewById(R.id.p6n);
                                this.LLJJJIL = c16f5;
                                if (c16f5 != null) {
                                    c16f5.setTypeface(C1119920fFW.LIZJ(c16f5.getTextSize(), 500, this.LL.getContext()));
                                    C500260Jjc.LLFFF(c16f5);
                                }
                            }

                            @Override // X.AbstractC1126590fQH
                            public final void L5(AbstractC1126600fQI<?> abstractC1126600fQI, DataChannel dataChannel, int i2, int i3) {
                                SpannableStringBuilder spannableStringBuilderLIZLLL;
                                SpannableStringBuilder spannableStringBuilderLIZLLL2;
                                SpannableStringBuilder spannableStringBuilderLIZLLL3;
                                super.L5(abstractC1126600fQI, dataChannel, i2, i3);
                                if (abstractC1126600fQI instanceof C1127220fRI) {
                                    C1127220fRI c1127220fRI = (C1127220fRI) abstractC1126600fQI;
                                    GiftPanelItemMetaData giftPanelItemMetaData = c1127220fRI.LJJIFFI.item;
                                    if (giftPanelItemMetaData != null) {
                                        TPText tPText = giftPanelItemMetaData.title;
                                        if (tPText != null && (spannableStringBuilderLIZLLL3 = C1143850fs7.LIZLLL(C1143850fs7.LIZ, tPText)) != null) {
                                            this.LLJJJJ = spannableStringBuilderLIZLLL3;
                                        }
                                        TPText tPText2 = giftPanelItemMetaData.subTitle;
                                        if (tPText2 != null && (spannableStringBuilderLIZLLL2 = C1143850fs7.LIZLLL(C1143850fs7.LIZ, tPText2)) != null) {
                                            this.LLJJJJJIL = spannableStringBuilderLIZLLL2;
                                        }
                                        TPText tPText3 = giftPanelItemMetaData.btContent;
                                        if (tPText3 != null && (spannableStringBuilderLIZLLL = C1143850fs7.LIZLLL(C1143850fs7.LIZ, tPText3)) != null) {
                                            this.LLJJJJLIIL = spannableStringBuilderLIZLLL;
                                        }
                                    }
                                    InterfaceC1126960fQs interfaceC1126960fQs = c1127220fRI.LJJII;
                                    if (interfaceC1126960fQs != null) {
                                        interfaceC1126960fQs.LIZ();
                                    }
                                }
                                C20441214yg.LIZIZ("LiveRevenueTouchPointLandscapeViewHolder", "bindView landscape");
                                e6();
                            }
                        };
                    }
                } else {
                    c1126460fQ4 = new AbstractC1126590fQH(C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.gt0, viewGroup, false)) { // from class: X.0fQk
                        public final C1324720kZq LLJJJ;
                        public final C16F5 LLJJJIL;
                        public final String LLJJJJ;
                        public final String LLJJJJJIL;

                        @Override // X.AbstractC1126590fQH
                        public final void S5(int i2) {
                        }

                        public final void e6() {
                            AbstractC1126600fQI<?> abstractC1126600fQI = this.LLIZLLLIL;
                            boolean z = abstractC1126600fQI != null ? abstractC1126600fQI.LIZJ : false;
                            InterfaceC1133710fbl.LIZ.getClass();
                            C1120710fGn.LIZ();
                            ImageModel imageModelLJ = C1133940fc8.LJ();
                            if (z) {
                                C500260Jjc.LJIILIIL(this.LLILZIL);
                                C500260Jjc.LLFFF(this.LLJJJ);
                                C0JSS.LIZLLL(this.LLJJJ, imageModelLJ);
                                C16F5 c16f5 = this.LLILZ;
                                if (c16f5 != null) {
                                    C500260Jjc.LJIILIIL(c16f5);
                                }
                                C16F5 c16f52 = this.LLJJJIL;
                                if (c16f52 != null) {
                                    c16f52.setTextColor(C497740JfY.LIZLLL(R.attr.eg, this.itemView.getContext()));
                                }
                                C16F5 c16f53 = this.LLJJJIL;
                                if (c16f53 != null) {
                                    c16f53.setText(C497740JfY.LJIJI(2131850981));
                                }
                            } else {
                                C500260Jjc.LLFFF(this.LLILZIL);
                                C500260Jjc.LJIILIIL(this.LLJJJ);
                                C0JSS.LIZLLL(this.LLILZIL, imageModelLJ);
                                C16F5 c16f54 = this.LLILZ;
                                if (c16f54 != null) {
                                    C500260Jjc.LLFFF(c16f54);
                                }
                                C16F5 c16f55 = this.LLJJJIL;
                                if (c16f55 != null) {
                                    c16f55.setText(this.LLJJJJJIL);
                                }
                            }
                            C16F5 c16f56 = this.LLILZ;
                            if (c16f56 != null) {
                                c16f56.setText(this.LLJJJJ);
                            }
                            C16F5 c16f57 = this.LLJILJIL;
                            if (c16f57 != null) {
                                c16f57.setText(C497740JfY.LJIJI(2131850982));
                            }
                        }

                        @Override // X.AbstractC1126590fQH
                        public final void V5() {
                            super.V5();
                            C20441214yg.LIZIZ("LiveFirstRechargeLandscapeViewHolderV3", "onSelected landscape");
                            e6();
                        }

                        @Override // X.AbstractC1126590fQH
                        public final void W5() {
                            super.W5();
                            C20441214yg.LIZIZ("LiveFirstRechargeLandscapeViewHolderV3", "onUnSelected landscape");
                            e6();
                        }

                        {
                            List listLJJLIIIJILLIZJL;
                            super(view);
                            ViewOnAttachStateChangeListenerC1151620g4e viewOnAttachStateChangeListenerC1151620g4e = new ViewOnAttachStateChangeListenerC1151620g4e(this, 6);
                            this.LLJJJ = (C1324720kZq) this.LL.findViewById(R.id.iwx);
                            C16F5 c16f5 = (C16F5) this.LL.findViewById(R.id.p6n);
                            this.LLJJJIL = c16f5;
                            if (c16f5 != null) {
                                c16f5.setTypeface(C1119920fFW.LIZJ(c16f5.getTextSize(), 500, this.LL.getContext()));
                                C500260Jjc.LLFFF(c16f5);
                            }
                            String strLJIJI = C497740JfY.LJIJI(2131850980);
                            if (strLJIJI != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLJIJI, new String[]{"\n"}, 0, 6)) != null && listLJJLIIIJILLIZJL.size() == 2) {
                                this.LLJJJJ = (String) ListProtector.get(listLJJLIIIJILLIZJL, 0);
                                this.LLJJJJJIL = (String) ListProtector.get(listLJJLIIIJILLIZJL, 1);
                            }
                            view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1151620g4e);
                        }

                        @Override // X.AbstractC1126590fQH
                        public final void L5(AbstractC1126600fQI<?> abstractC1126600fQI, DataChannel dataChannel, int i2, int i3) {
                            super.L5(abstractC1126600fQI, dataChannel, i2, i3);
                            C20441214yg.LIZIZ("LiveFirstRechargeLandscapeViewHolderV3", "bindView landscape");
                            e6();
                        }
                    };
                }
            } else {
                final View viewTd4 = C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.gt5, viewGroup, false);
                c1126460fQ4 = new C1126460fQ4(viewTd4) { // from class: X.0fQ5
                    {
                        C1124730fNH.LIZIZ();
                    }

                    @Override // X.C1126460fQ4, X.AbstractC1126590fQH
                    public final void L5(AbstractC1126600fQI<?> abstractC1126600fQI, DataChannel dataChannel, int i2, int i3) {
                        this.LLJILJILJ = true;
                        C1124730fNH.LIZIZ();
                        this.LLJILLL = C500260Jjc.LJJIFFI(null);
                        super.L5(abstractC1126600fQI, dataChannel, i2, i3);
                    }
                };
            }
        } else {
            c1126460fQ4 = new C1126460fQ4(C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.gt5, viewGroup, false));
        }
        c1126460fQ4.b6(this);
        c1126460fQ4.LLILZLL = this.LLJ;
        return c1126460fQ4;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1128780fTo c1128780fTo;
        int iLIZLLL;
        AbstractC1126590fQH abstractC1126590fQH = (AbstractC1126590fQH) viewHolder;
        AbstractC1126600fQI<?> abstractC1126600fQI = (AbstractC1126600fQI) C13LP.LJJJLZIJ(i, this.LLIZ);
        if (abstractC1126600fQI != null) {
            if (abstractC1126600fQI.LIZ == 0) {
                C786410Ut5.LJLLLLLL(4, abstractC1126590fQH.itemView);
                return;
            }
            if (this.LLIZLLLIL == abstractC1126600fQI.LJI()) {
                this.LLILZ = abstractC1126590fQH;
                abstractC1126600fQI.LIZJ = true;
                this.LLILLL = abstractC1126600fQI;
                if (abstractC1126590fQH != null) {
                    abstractC1126590fQH.V5();
                }
                AbstractC1126590fQH abstractC1126590fQH2 = this.LLILZ;
                if (abstractC1126590fQH2 != null) {
                    abstractC1126590fQH2.a6(this.LLILZIL);
                }
                boolean z = abstractC1126600fQI instanceof C1126040fPO;
                if ((z || abstractC1126600fQI.LIZ == 17) && (c1128780fTo = this.LLJI) != null) {
                    Boolean bool = Boolean.TRUE;
                    Long lValueOf = Long.valueOf(abstractC1126600fQI.LJI());
                    if (z) {
                        iLIZLLL = ((AbstractC293401Bs) abstractC1126600fQI).LJJIIJZLJL();
                    } else {
                        iLIZLLL = abstractC1126600fQI.LIZLLL();
                    }
                    c1128780fTo.LIZ(bool, lValueOf, iLIZLLL);
                }
            } else {
                abstractC1126600fQI.LIZJ = false;
            }
            abstractC1126590fQH.L5(abstractC1126600fQI, this.LLJ, i / 8, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x011e  */
    @Override // X.InterfaceC1126640fQM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJLJ(X.AbstractC1126600fQI<?> r8, X.AbstractC1126590fQH r9, boolean r10) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1126700fQS.LJLJLJ(X.0fQI, X.0fQH, boolean):void");
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        AbstractC1126590fQH abstractC1126590fQH = (AbstractC1126590fQH) viewHolder;
        if (list.contains("GIFT_ADAPTER_PAYLOAD_LEFT_ICON")) {
            abstractC1126590fQH.T5();
        } else {
            super.onBindViewHolder(abstractC1126590fQH, i, list);
        }
    }

    @Override // X.InterfaceC1126640fQM
    public final void LJJIIZ(long j, float f, float f2, int i, AwS561S0100000_17 awS561S0100000_17) {
        InterfaceC1126780fQa interfaceC1126780fQa = this.LLILLJJLI;
        if (interfaceC1126780fQa != null) {
            interfaceC1126780fQa.LJJIIZ(j, f, f2, i, awS561S0100000_17);
        }
    }
}
