package X;

import Y.ARunnableS127S0100000_27;
import Y.AsS53S0100000_27;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.gift.LiveViewerWishesBarCarouselVelocitySetting;
import com.bytedance.android.livesdk.livesetting.gift.ViewerWishesConfig;
import com.bytedance.android.livesdk.model.message.GameTricksGiftInfo;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPick;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPickWithScore;
import com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksHeaderImage;
import com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksInfo;
import com.bytedance.android.livesdk.viewerwishes.common.ui.TopSnappedLinearLayoutManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS165S0101000_27;
import wh6.AbS207S1100000_27;
import wh6.AbS706S0100000_27;

/* JADX INFO: renamed from: X.0yGP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1850830yGP extends FrameLayout implements InterfaceC2176981AHw {
    public final ViewGroup LL;
    public final C19563611gQ LLILLJJLI;
    public final View LLILLL;
    public final View LLILZ;
    public final C1324720kZq LLILZIL;
    public final C16F5 LLILZLL;
    public final C16F5 LLIZ;
    public final View LLIZLLLIL;
    public final C16F5 LLJ;
    public final C1324720kZq LLJI;
    public final C1324720kZq LLJIJIL;
    public EnumC1779890wPz LLJILJIL;
    public C0TLO LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public final ARunnableS127S0100000_27 LLJJIJIIJIL;
    public ARunnableS127S0100000_27 LLJJIJIL;
    public final ARunnableS127S0100000_27 LLJJJ;
    public boolean LLJJJIL;
    public DataChannel LLJJJJ;
    public List<GiftPickWithScore> LLJJJJJIL;

    @Override // X.InterfaceC2176981AHw
    public final void b(GameTricksGiftInfo gameTricksGiftInfo) {
    }

    @Override // X.InterfaceC2176981AHw
    public final void LLFII() {
        ARunnableS127S0100000_27 aRunnableS127S0100000_27 = this.LLJJIJIL;
        if (aRunnableS127S0100000_27 != null) {
            HandlerHook.viewRemoveCallbacks(this, aRunnableS127S0100000_27);
        }
        this.LLJJIJIL = null;
        LJLI(0L);
        if (this.LLJJIII) {
            C500260Jjc.LJIILLIIL(this.LLJ);
            C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
            c1320810kTXLIZJ.LJII(C1143780fs0.LJIIJ("tiktok_live_match_resource", "ttlive_match_calculating_clock.webp"));
            C500260Jjc.LLFFF(this.LLJI);
            C1324720kZq c1324720kZq = this.LLJI;
            if (c1324720kZq != null) {
                c1320810kTXLIZJ.LJIIJJI = true;
                c1324720kZq.setController(c1320810kTXLIZJ.LIZ());
            }
            ARunnableS127S0100000_27 aRunnableS127S0100000_272 = new ARunnableS127S0100000_27(this, 11);
            this.LLJJIJIL = aRunnableS127S0100000_272;
            HandlerHook.viewPostDelay(this, aRunnableS127S0100000_272, ((long) ViewerWishesConfig.INSTANCE.getGetValue().settlementDuration) * 1000);
        }
    }

    public static void LIZ() {
        C784440Upu.LIZ().LIZIZ(new C1103910eph("click", null));
    }

    public C1850830yGP(Context context) {
        C1324720kZq c1324720kZq;
        C16F5 c16f5;
        super(context, null, 0);
        this.LLJILJIL = EnumC1779890wPz.UNKNOWN;
        this.LLJJI = true;
        this.LLJJIJIIJIL = new ARunnableS127S0100000_27(this, 39);
        this.LLJJJ = new ARunnableS127S0100000_27(this, 12);
        this.LLJJJJJIL = C13BV.INSTANCE;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.hwu, this, true);
        this.LL = (ViewGroup) findViewById(R.id.vertical_gift_bar_panel);
        C19563611gQ c19563611gQ = (C19563611gQ) findViewById(R.id.vertical_gift_picked_list);
        this.LLILLJJLI = c19563611gQ;
        this.LLILLL = findViewById(R.id.ydi);
        View viewFindViewById = findViewById(R.id.qhr);
        this.LLILZ = viewFindViewById;
        this.LLIZLLLIL = findViewById(R.id.fz3);
        if (viewFindViewById != null) {
            c1324720kZq = (C1324720kZq) viewFindViewById.findViewById(R.id.l6f);
        } else {
            c1324720kZq = null;
        }
        this.LLILZIL = c1324720kZq;
        if (viewFindViewById != null) {
            c16f5 = (C16F5) viewFindViewById.findViewById(R.id.z45);
        } else {
            c16f5 = null;
        }
        this.LLILZLL = c16f5;
        this.LLIZ = viewFindViewById != null ? (C16F5) viewFindViewById.findViewById(R.id.z44) : null;
        this.LLJ = (C16F5) findViewById(R.id.f10);
        this.LLJI = (C1324720kZq) findViewById(R.id.e1a);
        this.LLJIJIL = (C1324720kZq) findViewById(R.id.viewer_wishes_banner);
        if (c19563611gQ != null) {
            c19563611gQ.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0f60
                @Override // X.AbstractC1585810rMx
                public final void LJJIIJ(RecyclerView recyclerView, int i) {
                    if (i == 1) {
                        C784440Upu.LIZ().LIZIZ(new C1103910eph("vertical_slide", null));
                    }
                }
            });
        }
    }

    private final void setCountdownView(Long l) {
        if (this.LLJJI) {
            C500260Jjc.LLFFF(this.LLJ);
            long j = 0;
            if (l != null) {
                long jLongValue = l.longValue();
                if (jLongValue >= 0) {
                    j = jLongValue;
                }
            }
            LJLI(j);
        } else {
            C500260Jjc.LJIILIIL(this.LLJ);
        }
        C500260Jjc.LJIILIIL(this.LLJI);
    }

    private final void setFoldStatus(EnumC1779890wPz enumC1779890wPz) {
        boolean z;
        this.LLJILJIL = enumC1779890wPz;
        C0TLO c0tlo = this.LLJILJILJ;
        if (c0tlo != null) {
            if (enumC1779890wPz == EnumC1779890wPz.FOLDED) {
                z = true;
            } else {
                z = false;
            }
            c0tlo.LLILZ = z;
        }
    }

    private final void setGiftList(List<GiftPickWithScore> list) {
        Pair pair;
        boolean z;
        String str;
        GiftPick giftPick;
        GiftPickWithScore giftPickWithScore = (GiftPickWithScore) C13LP.LJJJLL(list);
        if (giftPickWithScore != null && (giftPick = giftPickWithScore.giftPick) != null && giftPick.isPriorityRequest) {
            pair = new Pair(C13LP.LJJJLL(list), 0);
        } else {
            pair = new Pair(null, -1);
        }
        GiftPickWithScore giftPickWithScore2 = (GiftPickWithScore) pair.getFirst();
        int iIntValue = ((Number) pair.getSecond()).intValue();
        ArrayList arrayList = new ArrayList(list);
        C19719512Dh.LIZ(arrayList).remove(giftPickWithScore2);
        boolean z2 = this.LLJJIII;
        View view = this.LLILZ;
        C1324720kZq c1324720kZq = this.LLILZIL;
        C16F5 c16f5 = this.LLILZLL;
        C16F5 c16f52 = this.LLIZ;
        View view2 = this.LLIZLLLIL;
        if (giftPickWithScore2 != null && view != null && c1324720kZq != null && c16f5 != null && c16f52 != null && view2 != null) {
            this.LLJILLL = true;
            C500260Jjc.LLFFF(view);
            if (this.LLJJJJJIL.size() > 1) {
                C500260Jjc.LLFFF(view2);
            }
            C289401Ae.LIZ(view, c1324720kZq, c16f5, c16f52, giftPickWithScore2, this.LLJJJJ, this.LLJJJIL, z2, new AwS165S0101000_27(this, iIntValue, 0));
        } else {
            this.LLJILLL = false;
            C500260Jjc.LJIILIIL(view);
            C500260Jjc.LJIILIIL(view2);
        }
        if (this.LLJILJILJ == null) {
            boolean z3 = this.LLJJJIL;
            if (this.LLJILJIL == EnumC1779890wPz.FOLDED) {
                z = true;
            } else {
                z = false;
            }
            boolean z4 = this.LLJJIII;
            DataChannel dataChannel = this.LLJJJJ;
            if (z3) {
                str = "live_take_detail";
            } else {
                str = "live_detail";
            }
            C0TLO c0tlo = new C0TLO(arrayList, giftPickWithScore2, z3, z, z4, dataChannel, str, true);
            this.LLJILJILJ = c0tlo;
            C19563611gQ c19563611gQ = this.LLILLJJLI;
            if (c19563611gQ != null) {
                c19563611gQ.setAdapter(c0tlo);
            }
            C19563611gQ c19563611gQ2 = this.LLILLJJLI;
            if (c19563611gQ2 != null) {
                c19563611gQ2.setLayoutManager(new TopSnappedLinearLayoutManager(getContext()));
            }
            C19563611gQ c19563611gQ3 = this.LLILLJJLI;
            if (c19563611gQ3 != null) {
                c19563611gQ3.addOnScrollListener(new AsS53S0100000_27(this, 3));
            }
        }
        C0TLO c0tlo2 = this.LLJILJILJ;
        if (c0tlo2 != null) {
            boolean z5 = this.LLJJIII;
            boolean z6 = this.LLJJ;
            c0tlo2.LL = arrayList;
            c0tlo2.LLILLJJLI = giftPickWithScore2;
            c0tlo2.LLILZIL = z5;
            c0tlo2.LLJ = z6;
            c0tlo2.notifyDataSetChanged();
        }
    }

    public final void LIZIZ(boolean z) {
        EnumC1779890wPz enumC1779890wPz;
        TopSnappedLinearLayoutManager topSnappedLinearLayoutManager;
        int i;
        C0TLO c0tlo;
        String str;
        if (z) {
            enumC1779890wPz = EnumC1779890wPz.FOLDED;
        } else {
            enumC1779890wPz = EnumC1779890wPz.UNFOLDED;
        }
        EnumC1779890wPz enumC1779890wPz2 = this.LLJILJIL;
        if (enumC1779890wPz2 == enumC1779890wPz) {
            return;
        }
        if (enumC1779890wPz2 != EnumC1779890wPz.UNKNOWN) {
            setFoldStatus(enumC1779890wPz);
            if (z) {
                str = "fold";
            } else {
                str = "expand";
            }
            LIZJ(-1, str);
        } else {
            setFoldStatus(enumC1779890wPz);
        }
        if (z) {
            int iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.ap3) + C497740JfY.LJIIIZ(R.dimen.apb);
            int height = 0;
            if (this.LLJILLL && (c0tlo = this.LLJILJILJ) != null && c0tlo.getItemCount() > 0) {
                i = R.dimen.ap0;
            } else {
                i = R.dimen.aoy;
            }
            int iLJIIIZ2 = iLJIIIZ + C497740JfY.LJIIIZ(i);
            if (this.LLJJI) {
                C16F5 c16f5 = this.LLJ;
                if (c16f5 != null) {
                    height = c16f5.getHeight();
                }
                iLJIIIZ2 += height;
            }
            if (this.LLJJ) {
                iLJIIIZ2 += C497740JfY.LJIIIZ(R.dimen.aox);
            }
            getLayoutParams().height = iLJIIIZ2;
        } else {
            getLayoutParams().height = -1;
        }
        C19563611gQ c19563611gQ = this.LLILLJJLI;
        RecyclerView.LayoutManager layoutManager = null;
        if (c19563611gQ != null) {
            layoutManager = c19563611gQ.getLayoutManager();
        }
        if ((layoutManager instanceof TopSnappedLinearLayoutManager) && (topSnappedLinearLayoutManager = (TopSnappedLinearLayoutManager) layoutManager) != null) {
            topSnappedLinearLayoutManager.LL = !z;
        }
        C19563611gQ c19563611gQ2 = this.LLILLJJLI;
        if (c19563611gQ2 != null) {
            HandlerHook.viewPostDelay(c19563611gQ2, this.LLJJJ, 100L);
        }
    }

    @Override // X.InterfaceC2176981AHw
    public final void LJLI(long j) {
        C16F5 c16f5 = this.LLJ;
        if (c16f5 != null) {
            if (j < 0) {
                j = 0;
            }
            c16f5.setText(C963140bAe.LJIIJ(j));
        }
    }

    @Override // X.InterfaceC2176981AHw
    public final void onFinish(boolean z) {
        ARunnableS127S0100000_27 aRunnableS127S0100000_27 = this.LLJJIJIL;
        if (aRunnableS127S0100000_27 != null) {
            HandlerHook.viewRemoveCallbacks(this, aRunnableS127S0100000_27);
        }
        this.LLJJIJIL = null;
        C19563611gQ c19563611gQ = this.LLILLJJLI;
        if (c19563611gQ != null) {
            HandlerHook.viewRemoveCallbacks(c19563611gQ, this.LLJJIJIIJIL);
        }
        C19563611gQ c19563611gQ2 = this.LLILLJJLI;
        if (c19563611gQ2 != null) {
            HandlerHook.viewRemoveCallbacks(c19563611gQ2, this.LLJJJ);
        }
        setFoldStatus(EnumC1779890wPz.UNKNOWN);
        this.LLJILJILJ = null;
    }

    public final void LIZJ(int i, String str) {
        String str2;
        boolean z;
        List<GiftPickWithScore> list = this.LLJJJJJIL;
        DataChannel dataChannel = this.LLJJJJ;
        boolean z2 = this.LLJJJIL;
        boolean z3 = this.LLJJ;
        if (z2) {
            str2 = "live_take_detail";
        } else {
            str2 = "live_detail";
        }
        if (this.LLJILJIL == EnumC1779890wPz.FOLDED) {
            z = true;
        } else {
            z = false;
        }
        C1AI0.LJIIJ(list, dataChannel, i, z2, z3, str2, "new", str, z);
    }

    @Override // X.InterfaceC2176981AHw
    public final void LLIZLLLIL(ViewerPicksInfo viewerPicksInfo, boolean z) {
        this.LLJJJJJIL = new ArrayList(viewerPicksInfo.giftPickList);
        setGiftList(viewerPicksInfo.giftPickList);
    }

    @Override // X.InterfaceC2176981AHw
    public final void LLFF(ViewerPicksInfo viewerPicksInfo, boolean z, DataChannel dataChannel, Long l) {
        boolean z2;
        long jLongValue;
        Long l2;
        ImageModel imageModel;
        this.LLJJJJ = dataChannel;
        this.LLJJJIL = z;
        this.LLJJIII = viewerPicksInfo.hasScore;
        if (viewerPicksInfo.headerImage != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLJJ = z2;
        this.LLJJJJJIL = new ArrayList(viewerPicksInfo.giftPickList);
        this.LLJJI = viewerPicksInfo.hasDuration;
        ViewGroup viewGroup = this.LL;
        if (viewGroup != null) {
            C786410Ut5.I7(new AbS706S0100000_27(this, 5, 42), viewGroup);
        }
        setCountdownView(l);
        setGiftList(viewerPicksInfo.giftPickList);
        ViewerPicksHeaderImage viewerPicksHeaderImage = viewerPicksInfo.headerImage;
        if (viewerPicksHeaderImage != null && (imageModel = viewerPicksHeaderImage.image) != null) {
            C500260Jjc.LLFFF(this.LLJIJIL);
            String str = viewerPicksHeaderImage.schemaUrl;
            C500260Jjc.LLFFF(this.LLJIJIL);
            C1819620xS4.LIZ().LJIIIZ(imageModel).LJJI(this.LLJIJIL);
            C1324720kZq c1324720kZq = this.LLJIJIL;
            if (c1324720kZq != null) {
                C786410Ut5.I7(new AbS207S1100000_27(str, this, 0), c1324720kZq);
            }
        } else {
            C500260Jjc.LJIILIIL(this.LLJIJIL);
        }
        if (!this.LLJJJIL && !LiveViewerWishesBarCarouselVelocitySetting.INSTANCE.enabled()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        DataChannel dataChannel2 = this.LLJJJJ;
        if (dataChannel2 != null && (l2 = (Long) dataChannel2.gg0(C1082850eHj.class)) != null) {
            jLongValue = l2.longValue();
        } else {
            jLongValue = 0;
        }
        long j = jCurrentTimeMillis - jLongValue;
        if (!this.LLJJJIL && j < 20000) {
            C19563611gQ c19563611gQ = this.LLILLJJLI;
            if (c19563611gQ == null) {
                return;
            }
            HandlerHook.viewPostDelay(c19563611gQ, this.LLJJIJIIJIL, 20000 - j);
            return;
        }
        C19563611gQ c19563611gQ2 = this.LLILLJJLI;
        if (c19563611gQ2 == null) {
            return;
        }
        HandlerHook.viewPost(c19563611gQ2, this.LLJJIJIIJIL);
    }
}
