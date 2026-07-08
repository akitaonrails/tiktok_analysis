package X;

import Y.ARunnableS1S0100001_6;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.livesetting.gift.GiftPanelOptimiseMetrics;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftInteractiveEnlargedPreviewSettings;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fQv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1126990fQv extends AbstractC21673619ry<AbstractC1126560fQE> implements InterfaceC1126580fQG {
    public final LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> LL;
    public final DataChannel LLILLJJLI;
    public final LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> LLILLL = new LinkedList<>();
    public InterfaceC1127000fQw LLILZ;
    public final Room LLILZIL;
    public long LLILZLL;
    public EnumC1142140fpM LLIZ;
    public boolean LLIZLLLIL;

    @Override // X.InterfaceC1126580fQG
    public final boolean LJIIIZ() {
        InterfaceC1127000fQw interfaceC1127000fQw = this.LLILZ;
        if (interfaceC1127000fQw != null) {
            return interfaceC1127000fQw.LJIIIZ();
        }
        return false;
    }

    @Override // X.InterfaceC1126580fQG
    public final String LJIILL() {
        InterfaceC1127000fQw interfaceC1127000fQw = this.LLILZ;
        if (interfaceC1127000fQw != null) {
            return interfaceC1127000fQw.LJIILL();
        }
        return null;
    }

    @Override // X.InterfaceC1126580fQG
    public final List<Long> LJIL() {
        List<Long> listLJJIL;
        InterfaceC1127000fQw interfaceC1127000fQw = this.LLILZ;
        return (interfaceC1127000fQw == null || (listLJJIL = interfaceC1127000fQw.LJJIL()) == null) ? new ArrayList() : listLJJIL;
    }

    @Override // X.InterfaceC1126580fQG
    public final void LJJIJ() {
        InterfaceC1127000fQw interfaceC1127000fQw = this.LLILZ;
        if (interfaceC1127000fQw != null) {
            interfaceC1127000fQw.LJJIJ();
        }
    }

    @Override // X.InterfaceC1126580fQG
    public final List<Long> LJJJJLI() {
        List<Long> listLJJIJLIJ;
        InterfaceC1127000fQw interfaceC1127000fQw = this.LLILZ;
        return (interfaceC1127000fQw == null || (listLJJIJLIJ = interfaceC1127000fQw.LJJIJLIJ()) == null) ? new ArrayList() : listLJJIJLIJ;
    }

    public final int LLLILZ() {
        int i = 0;
        for (AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI : this.LL) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = abstractC1126600fQI;
            if (abstractC1126600fQI2 != null && abstractC1126600fQI2.LIZJ) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.InterfaceC1126580fQG
    public final long getOwnerUserId() {
        Room room = this.LLILZIL;
        if (room != null) {
            return room.getOwnerUserId();
        }
        return 0L;
    }

    @Override // X.InterfaceC1126580fQG
    public final void LJIIJ(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        InterfaceC1127000fQw interfaceC1127000fQw = this.LLILZ;
        if (interfaceC1127000fQw != null) {
            interfaceC1127000fQw.LJIIJ(abstractC1126600fQI);
        }
    }

    @Override // X.InterfaceC1126580fQG
    public final void LJIIJJI(boolean z) {
        InterfaceC1127000fQw interfaceC1127000fQw = this.LLILZ;
        if (interfaceC1127000fQw != null) {
            interfaceC1127000fQw.LJJIJIIJIL(false, false);
        }
    }

    @Override // X.InterfaceC1126580fQG
    public final boolean LJIILIIL(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        InterfaceC1127000fQw interfaceC1127000fQw = this.LLILZ;
        if (interfaceC1127000fQw != null) {
            return interfaceC1127000fQw.LJIILIIL(abstractC1126600fQI);
        }
        return false;
    }

    @Override // X.InterfaceC1126580fQG
    public final int LJIILLIIL(long j) {
        InterfaceC1127000fQw interfaceC1127000fQw = this.LLILZ;
        if (interfaceC1127000fQw != null) {
            return interfaceC1127000fQw.LJIILLIIL(j);
        }
        return 0;
    }

    @Override // X.InterfaceC1126580fQG
    public final void LJIJ(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        InterfaceC1127000fQw interfaceC1127000fQw = this.LLILZ;
        if (interfaceC1127000fQw != null) {
            interfaceC1127000fQw.LJIJ(abstractC1126600fQI);
        }
    }

    @Override // X.InterfaceC1126580fQG
    public final long LJIJJLI(C01AG c01ag) {
        InterfaceC1127000fQw interfaceC1127000fQw = this.LLILZ;
        if (interfaceC1127000fQw != null) {
            return interfaceC1127000fQw.LJIJJLI(c01ag);
        }
        return 0L;
    }

    @Override // X.InterfaceC1126580fQG
    public final void LJJ(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        InterfaceC1127000fQw interfaceC1127000fQw = this.LLILZ;
        if (interfaceC1127000fQw != null) {
            interfaceC1127000fQw.LJJ(abstractC1126600fQI);
        }
    }

    @Override // X.InterfaceC1126580fQG
    public final void LJJI(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        InterfaceC1127000fQw interfaceC1127000fQw = this.LLILZ;
        if (interfaceC1127000fQw != null) {
            interfaceC1127000fQw.LJJI(abstractC1126600fQI);
        }
    }

    @Override // X.InterfaceC1126580fQG
    public final void LJJIFFI(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        InterfaceC1127000fQw interfaceC1127000fQw = this.LLILZ;
        if (interfaceC1127000fQw != null) {
            interfaceC1127000fQw.LJJIFFI(abstractC1126600fQI);
        }
    }

    @Override // X.InterfaceC1126580fQG
    public final void LJJII(AwS561S0100000_17 awS561S0100000_17) {
        InterfaceC1127000fQw interfaceC1127000fQw = this.LLILZ;
        if (interfaceC1127000fQw != null) {
            interfaceC1127000fQw.LJJII(awS561S0100000_17);
        }
    }

    @Override // X.InterfaceC1126580fQG
    public final void LJJIII(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        InterfaceC1127000fQw interfaceC1127000fQw = this.LLILZ;
        if (interfaceC1127000fQw != null) {
            interfaceC1127000fQw.LJJIII(abstractC1126600fQI);
        }
    }

    @Override // X.InterfaceC1126580fQG
    public final void LJJIIJ(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        InterfaceC1127000fQw interfaceC1127000fQw = this.LLILZ;
        if (interfaceC1127000fQw != null) {
            interfaceC1127000fQw.LJJIIJ(abstractC1126600fQI);
        }
    }

    @Override // X.InterfaceC1126580fQG
    public final void LJJIIJZLJL(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        InterfaceC1127000fQw interfaceC1127000fQw = this.LLILZ;
        if (interfaceC1127000fQw != null) {
            interfaceC1127000fQw.LJJIIJZLJL(abstractC1126600fQI);
        }
    }

    public final AbstractC1126600fQI<? extends AnonymousClass0054> LLLIILIL(int i) {
        if (this.LL.size() > i) {
            return this.LL.get(i);
        }
        return null;
    }

    public final int LLLIL(Long l) {
        int i = 0;
        for (AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI : this.LL) {
            int i2 = i + 1;
            Long lValueOf = null;
            if (i >= 0) {
                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = abstractC1126600fQI;
                if (abstractC1126600fQI2 != null) {
                    lValueOf = Long.valueOf(abstractC1126600fQI2.LJI());
                }
                if (Intrinsics.LJFF(lValueOf, l)) {
                    return i;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return -1;
    }

    public final void LLLILZLLLI(long j) {
        int iLLLIL;
        if (j > 0 && (iLLLIL = LLLIL(Long.valueOf(j))) >= 0) {
            notifyItemChanged(iLLLIL, "GIFT_ADAPTER_PAYLOAD_MUSIC_PREVIEW_STATE");
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = this.LL.get(i);
        if (abstractC1126600fQI != null) {
            return abstractC1126600fQI.LIZ;
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        Long lValueOf;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI;
        AbstractC1126560fQE abstractC1126560fQE = (AbstractC1126560fQE) viewHolder;
        super.onViewAttachedToWindow(abstractC1126560fQE);
        if (abstractC1126560fQE instanceof C1126410fPz) {
            abstractC1126560fQE.getClass();
            GiftsInfo.LevelUpGiftInfo levelUpGiftInfo = C1123390fL7.LIZ;
            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = abstractC1126560fQE.LLJJLIIIJLLLLLLLZ;
            if (abstractC1126600fQI2 != null) {
                lValueOf = Long.valueOf(abstractC1126600fQI2.LJFF());
            } else {
                lValueOf = null;
            }
            if (C1123390fL7.LIZIZ(lValueOf) && (abstractC1126600fQI = abstractC1126560fQE.LLJJLIIIJLLLLLLLZ) != null && abstractC1126600fQI.LIZJ && abstractC1126600fQI.LJIJJ()) {
                C1128760fTm.LJIIJ.getClass();
                C1128760fTm.LJJIL("gift_panel");
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        AbstractC1126560fQE abstractC1126560fQE = (AbstractC1126560fQE) viewHolder;
        super.onViewRecycled(abstractC1126560fQE);
        abstractC1126560fQE.LLIILZL();
    }

    public C1126990fQv(LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList, DataChannel dataChannel) {
        Room room;
        this.LL = linkedList;
        this.LLILLJJLI = dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LLILZIL = room;
        this.LLIZ = EnumC1142140fpM.IDLE;
    }

    @Override // X.InterfaceC1126580fQG
    public final boolean LJIIL(AbstractC1126600fQI abstractC1126600fQI, C01AG c01ag) {
        InterfaceC1127000fQw interfaceC1127000fQw = this.LLILZ;
        if (interfaceC1127000fQw != null) {
            return interfaceC1127000fQw.LJIIL(abstractC1126600fQI, c01ag);
        }
        return false;
    }

    public final AbstractC1126560fQE LLLI(int i, ViewGroup viewGroup) {
        if (i != 1) {
            if (i != 12) {
                if (i != 9) {
                    if (i != 10) {
                        if (i != 223) {
                            if (i != 224) {
                                switch (i) {
                                    case 15:
                                        return new ViewOnAttachStateChangeListenerC1129870fVZ(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gt4, viewGroup, false));
                                    case 16:
                                        return new C1129860fVY(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gt2, viewGroup, false));
                                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                        final View viewLJI = C0J3Y.LIZ.LJI(R.layout.gt3);
                                        if (viewLJI == null) {
                                            viewLJI = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gt3, viewGroup, false);
                                        }
                                        return new AbstractC1126560fQE(viewLJI) { // from class: X.0fQK
                                            public final String LLLILZ = "LiveUgPointsGiftViewHolder";

                                            @Override // X.AbstractC1126560fQE
                                            public final void u6() {
                                                Gift gift;
                                                C1124730fNH.LIZIZ();
                                                if (C500260Jjc.LJJJI(null) || !InterfaceC1094160eZy.S1.LIZIZ().booleanValue()) {
                                                    AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = this.LLJJLIIIJLLLLLLLZ;
                                                    Object obj = abstractC1126600fQI != null ? abstractC1126600fQI.LIZIZ : null;
                                                    if ((obj instanceof Gift) && (gift = (Gift) obj) != null && gift.ugGiftInfo != null) {
                                                        C1124730fNH.LIZIZ();
                                                    }
                                                    super.u6();
                                                }
                                            }

                                            @Override // X.AbstractC1126560fQE
                                            public final String R5() {
                                                return this.LLLILZ;
                                            }

                                            {
                                                C1124730fNH.LIZIZ();
                                            }

                                            @Override // X.AbstractC1126560fQE
                                            public final void N5(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI, DataChannel dataChannel, int i2) {
                                                this.LLJLIL = true;
                                                C1124730fNH.LIZIZ();
                                                this.LLJLILLLLZIIL = C500260Jjc.LJJIFFI(null);
                                                super.N5(abstractC1126600fQI, dataChannel, i2);
                                                C1125760fOw.LIZ(this.LLJJIII, this.LLJILJIL, this.LLJIJIL);
                                            }
                                        };
                                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                        final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gt6, viewGroup, false);
                                        return new AbstractC1126560fQE(viewTd) { // from class: X.0fQz
                                            public final View LLLILZ;
                                            public final String LLLILZJ;

                                            @Override // X.AbstractC1126560fQE
                                            public final String R5() {
                                                return this.LLLILZJ;
                                            }

                                            {
                                                super(viewTd);
                                                this.LLLILZ = viewTd;
                                                this.LLLILZJ = "LiveUgPointsGiftHeaderViewHolder";
                                                C1124730fNH.LIZIZ();
                                            }
                                        };
                                    case 19:
                                        View viewLJI2 = C0J3Y.LIZ.LJI(R.layout.gt0);
                                        if (viewLJI2 == null) {
                                            viewLJI2 = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gt0, viewGroup, false);
                                        }
                                        return new C1126940fQq(viewLJI2);
                                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                        return new ViewOnAttachStateChangeListenerC1129870fVZ(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gt8, viewGroup, false));
                                    case 21:
                                        View viewLJI3 = C0J3Y.LIZ.LJI(R.layout.gtb);
                                        if (viewLJI3 == null) {
                                            viewLJI3 = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gtb, viewGroup, false);
                                        }
                                        return new C1126900fQm(viewLJI3);
                                    case 22:
                                        View viewLJI4 = C0J3Y.LIZ.LJI(R.layout.gtc);
                                        if (viewLJI4 == null) {
                                            viewLJI4 = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gtc, viewGroup, false);
                                        }
                                        return new C1125940fPE(viewLJI4);
                                    default:
                                        final View viewTd2 = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gta, viewGroup, false);
                                        return new AbstractC1126560fQE(viewTd2) { // from class: X.01AC
                                            public final View LLLILZ;
                                            public final String LLLILZJ;

                                            @Override // X.AbstractC1126560fQE
                                            public final String R5() {
                                                return this.LLLILZJ;
                                            }

                                            {
                                                super(viewTd2);
                                                this.LLLILZ = viewTd2;
                                                this.LLLILZJ = "LiveGiftDummyViewHolderV2";
                                            }

                                            @Override // X.AbstractC1126560fQE
                                            public final void N5(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI, DataChannel dataChannel, int i2) {
                                                C786410Ut5.LJLLLLLL(8, this.LLLILZ);
                                            }
                                        };
                                }
                            }
                            return new C01A9(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gsy, viewGroup, false), C01AG.MINUTE_GAME);
                        }
                        return new C01A9(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gsy, viewGroup, false), C01AG.GIFT_SERIES);
                    }
                    View viewLJI5 = C0J3Y.LIZ.LJI(R.layout.gta);
                    if (viewLJI5 == null) {
                        viewLJI5 = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gta, viewGroup, false);
                    }
                    return new C1125990fPJ(viewLJI5);
                }
                View viewLJI6 = C0J3Y.LIZ.LJI(R.layout.gsz);
                if (viewLJI6 == null) {
                    viewLJI6 = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gsz, viewGroup, false);
                }
                return new C1126930fQp(viewLJI6);
            }
            C20441214yg.LIZIZ("BAGS", "createViewHolder called with: TYPE_MATCH_ITEM");
            return new C1126970fQt(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gt9, viewGroup, false), this.LL);
        }
        View viewLJI7 = C0J3Y.LIZ.LJI(R.layout.gt3);
        if (viewLJI7 == null) {
            viewLJI7 = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gt3, viewGroup, false);
        }
        return new C1126410fPz(viewLJI7);
    }

    public final void LLLII(long j, RunnableC781530UlD runnableC781530UlD) {
        AbstractC21673719rz itemAnimator;
        if (runnableC781530UlD != null && (itemAnimator = runnableC781530UlD.getItemAnimator()) != null) {
            itemAnimator.LJIIL();
        }
        int i = 0;
        for (AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI : this.LL) {
            int i2 = i + 1;
            if (i >= 0) {
                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = abstractC1126600fQI;
                if (abstractC1126600fQI2 != null && abstractC1126600fQI2.LJI() == j) {
                    C1124730fNH.LIZIZ();
                    notifyItemChanged(i);
                    return;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final void LLLIIIIL(int i, AbstractC1126560fQE abstractC1126560fQE) {
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI;
        C1324720kZq c1324720kZq;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = this.LL.get(i);
        if (abstractC1126600fQI2 == null) {
            return;
        }
        if (abstractC1126600fQI2.LIZ == 0) {
            C786410Ut5.LJLLLLLL(4, abstractC1126560fQE.itemView);
            return;
        }
        abstractC1126560fQE.LLJL = this;
        abstractC1126560fQE.N5(abstractC1126600fQI2, this.LLILLJJLI, i);
        if (this.LLIZLLLIL && (abstractC1126600fQI = abstractC1126560fQE.LLJJLIIIJLLLLLLLZ) != null && abstractC1126600fQI.LIZJ && C1130100fVw.LIZ.LJFF == 17 && (c1324720kZq = abstractC1126560fQE.LLJJI) != null) {
            HandlerHook.viewPost(c1324720kZq, new ARunnableS1S0100001_6(c1324720kZq, C497740JfY.LJIIIZ(R.dimen.apn) / C497740JfY.LJIIIZ(R.dimen.apx), 2));
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        InterfaceC1127040fR0 interfaceC1127040fR0;
        AbstractC1126560fQE abstractC1126560fQE = (AbstractC1126560fQE) viewHolder;
        if (GiftPanelOptimiseMetrics.INSTANCE.isOptimised()) {
            LLLIIIIL(i, abstractC1126560fQE);
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        LLLIIIIL(i, abstractC1126560fQE);
        long jLongValue = ((Number) new Pair(Unit.LIZ, Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis)).getSecond()).longValue();
        String strR5 = abstractC1126560fQE.R5();
        if (!TextUtils.isEmpty("gift_view_holder_create_time") && (interfaceC1127040fR0 = C1127020fQy.LIZ) != null && !interfaceC1127040fR0.LIZIZ(0.05f)) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_view_holder_bind_time");
        c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "time");
        c474500IjALIZ.LJJII(strR5, "type");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC1126580fQG
    public final void LJIIZILJ(int i, AbstractC1126600fQI abstractC1126600fQI, AwS561S0100000_17 awS561S0100000_17) {
        InterfaceC1127000fQw interfaceC1127000fQw = this.LLILZ;
        if (interfaceC1127000fQw != null) {
            interfaceC1127000fQw.LJIIZILJ(i, abstractC1126600fQI, awS561S0100000_17);
        }
    }

    @Override // X.InterfaceC1126580fQG
    public final void LJJIJLIJ(int i, long j, AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Select new item, position: ");
        sbLIZ.append(i);
        sbLIZ.append(", giftId: ");
        sbLIZ.append(j);
        sbLIZ.append(", panel: ");
        sbLIZ.append(abstractC1126600fQI.LJI());
        C20441214yg.LIZIZ("GiftPanelSwipe", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1127000fQw interfaceC1127000fQw = this.LLILZ;
        if (interfaceC1127000fQw != null) {
            interfaceC1127000fQw.LJJIJIL(i, j, abstractC1126600fQI, AFwS205S0000000_17.get$arr$(124));
        }
    }

    @Override // X.InterfaceC1126580fQG
    public final void LJLIIL(int i, long j, boolean z) {
        InterfaceC1127000fQw interfaceC1127000fQw = this.LLILZ;
        if (interfaceC1127000fQw != null) {
            interfaceC1127000fQw.LJJIJIIJI(j, z);
        }
    }

    public final void LLLFZ(int i, RecyclerView recyclerView, boolean z) {
        AbstractC1126560fQE abstractC1126560fQE;
        C1324720kZq c1324720kZq;
        C1324720kZq c1324720kZq2;
        if (i == 17 && LiveGiftInteractiveEnlargedPreviewSettings.INSTANCE.getEnabled()) {
            this.LLIZLLLIL = z;
            int childCount = recyclerView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i2));
                if ((childViewHolder instanceof AbstractC1126560fQE) && (abstractC1126560fQE = (AbstractC1126560fQE) childViewHolder) != null) {
                    if (z) {
                        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = abstractC1126560fQE.LLJJLIIIJLLLLLLLZ;
                        if (abstractC1126600fQI != null && abstractC1126600fQI.LIZJ && (c1324720kZq2 = abstractC1126560fQE.LLJJI) != null) {
                            float fLJIIIZ = C497740JfY.LJIIIZ(R.dimen.apn) / C497740JfY.LJIIIZ(R.dimen.apx);
                            c1324720kZq2.setPivotY(c1324720kZq2.getHeight());
                            c1324720kZq2.animate().scaleX(fLJIIIZ).scaleY(fLJIIIZ).setDuration(200L).setInterpolator(new DecelerateInterpolator()).start();
                        }
                    } else {
                        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = abstractC1126560fQE.LLJJLIIIJLLLLLLLZ;
                        if (abstractC1126600fQI2 != null && abstractC1126600fQI2.LIZJ && (c1324720kZq = abstractC1126560fQE.LLJJI) != null) {
                            c1324720kZq.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(new OvershootInterpolator(1.1f)).start();
                        }
                    }
                }
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        C1126410fPz c1126410fPz;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI;
        AbstractC1126560fQE abstractC1126560fQE = (AbstractC1126560fQE) viewHolder;
        if (!list.isEmpty()) {
            if (!list.isEmpty()) {
                for (Object obj : list) {
                    if (Intrinsics.LJFF(obj, "GIFT_ADAPTER_PAYLOAD_LEFT_ICON") || Intrinsics.LJFF(obj, "GIFT_ADAPTER_PAYLOAD_MUSIC_PREVIEW_STATE")) {
                    }
                }
            }
            if (list.contains("GIFT_ADAPTER_PAYLOAD_LEFT_ICON")) {
                abstractC1126560fQE.V5();
            }
            if (list.contains("GIFT_ADAPTER_PAYLOAD_MUSIC_PREVIEW_STATE") && (abstractC1126560fQE instanceof C1126410fPz) && (abstractC1126600fQI = (c1126410fPz = (C1126410fPz) abstractC1126560fQE).LLJJLIIIJLLLLLLLZ) != null) {
                c1126410fPz.z6(abstractC1126600fQI);
                return;
            }
            return;
        }
        super.onBindViewHolder(abstractC1126560fQE, i, list);
    }

    @Override // X.InterfaceC1126580fQG
    public final void LJIJI(C01AG c01ag, int i, long j, AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        InterfaceC1127000fQw interfaceC1127000fQw = this.LLILZ;
        if (interfaceC1127000fQw != null) {
            interfaceC1127000fQw.LJIJI(c01ag, i, j, abstractC1126600fQI);
        }
    }

    @Override // X.InterfaceC1126580fQG
    public final void LJIJJ(int i, long j, View view, AwS561S0100000_17 awS561S0100000_17) {
        InterfaceC1127000fQw interfaceC1127000fQw = this.LLILZ;
        if (interfaceC1127000fQw != null) {
            interfaceC1127000fQw.LJIJJ(i, j, view, awS561S0100000_17);
        }
    }
}
