package X;

import Y.ARunnableS117S0100000_17;
import Y.AfS153S0200000_17;
import Y.AfS186S0100000_17;
import Y.AfS43S1200000_17;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleOptimizeGiftIcon;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftRandomEffectInfo;
import com.bytedance.android.livesdk.model.RandomGiftBubble;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fHB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120950fHB extends FrameLayout implements InterfaceC1121210fHb, InterfaceC1121370fHr, InterfaceC1121280fHi {
    public DataChannel LL;
    public InterfaceC1121180fHY LLILLJJLI;
    public View LLILLL;
    public ImageView LLILZ;
    public C1324720kZq LLILZIL;
    public View LLILZLL;
    public C1121220fHc LLIZ;
    public final C1120960fHC LLIZLLLIL;
    public final C1121250fHf LLJ;
    public final C11NJ LLJI;
    public long LLJIJIL;
    public EnumC1120990fHF LLJILJIL;
    public String LLJILJILJ;
    public boolean LLJILLL;
    public final long LLJJ;
    public C11JF LLJJI;
    public final ConcurrentLinkedQueue<C1121070fHN> LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public int LLJJIJIL;
    public EnumC1102980eoC LLJJJ;
    public final int LLJJJIL;
    public int LLJJJJ;
    public final ARunnableS117S0100000_17 LLJJJJJIL;
    public final C1151840g50 LLJJJJLIIL;
    public final C1151840g50 LLJJL;

    public static String LJII(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 7 ? i != 8 ? i != 9 ? "unknown" : "vault_gloves" : "no3_booster" : "no2_booster" : "hammer" : "time_extending" : "magic_smokes" : "boosting_gloves";
    }

    public final void LJI() {
        EnumC1120980fHE enumC1120980fHE;
        List<Long> list;
        if (this.LLJJIII.isEmpty() || this.LLJJIJIIJIL || this.LLJJIJI) {
            return;
        }
        this.LLJJIJI = true;
        C1121070fHN c1121070fHNPoll = this.LLJJIII.poll();
        if (c1121070fHNPoll != null && (enumC1120980fHE = c1121070fHNPoll.LIZ) != null) {
            switch (C1121000fHG.LIZ[enumC1120980fHE.ordinal()]) {
                case 1:
                    C1121190fHZ c1121190fHZ = new C1121190fHZ(EnumC1120810fGx.COLOR_GIFT, EnumC1118040fCU.ANIMATION, c1121070fHNPoll.LIZJ, (Integer) null, 24);
                    InterfaceC1121180fHY interfaceC1121180fHY = this.LLILLJJLI;
                    if (interfaceC1121180fHY != null) {
                        interfaceC1121180fHY.LIZJ(c1121190fHZ);
                    }
                    C1324720kZq c1324720kZq = this.LLILZIL;
                    if (c1324720kZq != null) {
                        C500260Jjc.LJLJLJ(c1324720kZq, true);
                    }
                    C1324720kZq c1324720kZq2 = this.LLILZIL;
                    if (c1324720kZq2 != null) {
                        C0JSS.LIZJ(-1, -1, R.drawable.et_, c1324720kZq2, c1121070fHNPoll.LIZIZ, new C1151970g5D(this, 6), true);
                    }
                    break;
                case 2:
                    this.LLJI.LIZ(C11NZ.LJLJJLL(5L, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS43S1200000_17(this.LLJILJIL, this.LLJILJILJ, this, 2)));
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case BdTuring.TYPE_ECAF /* 9 */:
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    List<Integer> list2 = c1121070fHNPoll.LIZLLL;
                    if (list2 != null && !list2.isEmpty() && (list = c1121070fHNPoll.LJ) != null && !list.isEmpty()) {
                        C784440Upu.LIZ().LIZIZ(new C1121340fHo(c1121070fHNPoll.LIZLLL));
                        DataChannel dataChannel = this.LL;
                        List<Integer> list3 = c1121070fHNPoll.LIZLLL;
                        Integer num = list3 != null ? (Integer) ListProtector.get(list3, 0) : null;
                        List<Long> list4 = c1121070fHNPoll.LJ;
                        dataChannel.SX0(C1121360fHq.class, new C1121240fHe(num, list4 != null ? (Long) ListProtector.get(list4, 0) : null, System.currentTimeMillis(), EnumC1121130fHT.BUBBLE));
                        C11NJ c11nj = this.LLJI;
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        c11nj.LIZ(C11NZ.LJLJJLL(2250L, timeUnit).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS153S0200000_17(c1121070fHNPoll, this, 34), new C09JN() { // from class: X.00Mq
                            @Override // X.C09JN
                            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                C1C7U.LIZ("LiveGiftIconView@6ee6.addIconAnimation$2");
                                C1C7U.LIZIZ("LiveGiftIconView@6ee6.addIconAnimation$2");
                            }
                        }));
                        this.LLJJI = (C11JF) C11NZ.LJLJJLL(3500L, timeUnit).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS186S0100000_17(this, 193));
                    }
                    break;
            }
        }
        this.LLJJI = (C11JF) C11NZ.LJLJJLL(this.LLJJ, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS186S0100000_17(this, 192));
    }

    public final void LJIIIZ() {
        ImageView imageView;
        if (LiveToolbarIconStyleOptimizeGiftIcon.INSTANCE.enable() && (imageView = this.LLILZ) != null && Intrinsics.LJFF(imageView.getTag(this.LLJJJIL), Boolean.TRUE) && this.LLJJJJ == 2) {
            return;
        }
        ImageView imageView2 = this.LLILZ;
        if (imageView2 != null) {
            imageView2.setTag(this.LLJJJIL, Boolean.TRUE);
        }
        this.LLJJJJ = 2;
        C1143680frq.LIZLLL(this.LLILZ, "tiktok_live_interaction_demand_11", "ttlive_icon_gift_full_color.png");
    }

    public final void LJIIJ() {
        ImageView imageView;
        if (LiveToolbarIconStyleOptimizeGiftIcon.INSTANCE.enable() && (imageView = this.LLILZ) != null && Intrinsics.LJFF(imageView.getTag(this.LLJJJIL), Boolean.TRUE) && this.LLJJJJ == 1) {
            return;
        }
        ImageView imageView2 = this.LLILZ;
        if (imageView2 != null) {
            imageView2.setTag(this.LLJJJIL, Boolean.TRUE);
        }
        this.LLJJJJ = 1;
        C1143680frq.LIZLLL(this.LLILZ, "tiktok_live_interaction_demand_11", "ttlive_icon_gift_gray.png");
    }

    public final void LJIIJJI() {
        ImageView imageView;
        View view;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setNormalIcon, bottomIconStyle = ");
        sbLIZ.append(this.LLJJJ);
        C20441214yg.LIZIZ("LiveGiftIconView", C2188811AlT.LIZIZ(sbLIZ));
        EnumC1102980eoC enumC1102980eoC = this.LLJJJ;
        if (enumC1102980eoC == EnumC1102980eoC.GRAY) {
            LJIIJ();
            return;
        }
        if (enumC1102980eoC == EnumC1102980eoC.COLORFUL) {
            LJIIIZ();
            return;
        }
        if (enumC1102980eoC == EnumC1102980eoC.HIGHLIGHT) {
            List list = (List) this.LL.gg0(C1102520enS.class);
            if (list == null || !list.contains(EnumC1102740eno.GIFT)) {
                LJIIJ();
                return;
            } else {
                LJIIIZ();
                return;
            }
        }
        ImageView imageView2 = this.LLILZ;
        if (imageView2 != null) {
            imageView2.setTag(this.LLJJJIL, Boolean.TRUE);
        }
        this.LLJJJJ = 0;
        boolean zLJFF = Intrinsics.LJFF(this.LL.gg0(C0TZM.class), Boolean.TRUE);
        if (!this.LLJILLL && !zLJFF && (view = this.LLILLL) != null) {
            view.setBackgroundResource(0);
        }
        ImageView imageView3 = this.LLILZ;
        if (imageView3 == null || imageView3.getDrawable() != null || (imageView = this.LLILZ) == null) {
            return;
        }
        imageView.setImageResource(R.drawable.ev0);
    }

    public final DataChannel getDataChannel() {
        return this.LL;
    }

    public final InterfaceC1121180fHY getIView() {
        return this.LLILLJJLI;
    }

    public static List LJIIIIZZ(List list) {
        ArrayList arrayList = new ArrayList(C13BV.INSTANCE);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(LJII(((Number) it2.next()).intValue()));
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC1121280fHi
    public final void LIZ(long j) {
        InterfaceC1094160eZy.d1.LJFF(Long.valueOf(j));
        View view = this.LLILZLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        View view2 = this.LLILZLL;
        if (view2 != null) {
            C786410Ut5.T4(view2, 0.0f);
        }
        View view3 = this.LLILZLL;
        if (view3 != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(200L);
            C786410Ut5.Pd(objectAnimatorOfFloat);
        }
        C1121190fHZ c1121190fHZ = new C1121190fHZ(EnumC1120810fGx.COLOR_GIFT, EnumC1118040fCU.DOT, j, (Integer) null, 24);
        InterfaceC1121180fHY interfaceC1121180fHY = this.LLILLJJLI;
        if (interfaceC1121180fHY != null) {
            interfaceC1121180fHY.LJ(c1121190fHZ);
        }
        InterfaceC1094160eZy.c1.LJFF(Boolean.TRUE);
        C1121170fHX.LIZ(Long.valueOf(j));
    }

    @Override // X.InterfaceC1121370fHr
    public final void LIZIZ(long j) {
        String str;
        RandomGiftBubble randomGiftBubble;
        Gift giftLJI = C1138640fji.LJI(j);
        final C1121190fHZ c1121190fHZ = new C1121190fHZ(EnumC1120810fGx.RANDOM_GIFT, EnumC1118040fCU.BUBBLE, j, (Integer) null, 24);
        if (giftLJI != null) {
            ImageModel imageModel = giftLJI.icon;
            GiftRandomEffectInfo giftRandomEffectInfo = giftLJI.randomEffectInfo;
            if (giftRandomEffectInfo != null && (randomGiftBubble = giftRandomEffectInfo.randomGiftBubble) != null) {
                str = randomGiftBubble.bubbleDisplayText;
            } else {
                str = null;
            }
            C1117940fCK c1117940fCK = new C1117940fCK(this);
            c1117940fCK.LJIILLIIL = this.LLJJL;
            c1117940fCK.LJIILL = new InterfaceC254600ye() { // from class: X.0fH6
                @Override // X.InterfaceC254600ye
                public final void onShow() {
                    InterfaceC1121180fHY iView = this.LIZ.getIView();
                    if (iView != null) {
                        iView.LIZ(c1121190fHZ);
                    }
                    int i = Calendar.getInstance().get(6);
                    C20337914i1<Integer> c20337914i1 = InterfaceC1094160eZy.f1;
                    if (i != c20337914i1.LIZIZ().intValue()) {
                        C20337914i1<Map<Integer, Boolean>> c20337914i12 = InterfaceC1094160eZy.g1;
                        if (c20337914i12.LIZIZ().get(Integer.valueOf(i)) == null) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            if (!c20337914i12.LIZIZ().isEmpty()) {
                                linkedHashMap.putAll(c20337914i12.LIZIZ());
                            }
                            linkedHashMap.put(Integer.valueOf(i), Boolean.TRUE);
                            c20337914i12.LJFF(linkedHashMap);
                            C20337914i1<Integer> c20337914i13 = InterfaceC1094160eZy.e1;
                            c20337914i13.LJFF(Integer.valueOf(c20337914i13.LIZIZ().intValue() + 1));
                        }
                        c20337914i1.LJFF(Integer.valueOf(i));
                    }
                    C146900hH.LIZ("gift_guide_bubble_show", new Pair("show_reason", "random_effect_gift"));
                }
            };
            c1117940fCK.LJIIIIZZ = Mp4ScreenVideoLoadTimeout.CONTROL;
            c1117940fCK.LJIIIZ = true;
            c1117940fCK.LJJIIJZLJL = imageModel;
            if (str == null) {
                str = "";
            }
            c1117940fCK.LJIJJ = str;
            C1113800f5e.LIZ.LJ(new C1117930fCJ(c1117940fCK), EnumC1120860fH2.RANDOM_EFFECT_GIFT, this.LL);
        }
    }

    @Override // X.InterfaceC1121280fHi
    public final void LJ(final long j) {
        String str;
        InterfaceC1094160eZy.d1.LJFF(Long.valueOf(j));
        Gift giftLJI = C1138640fji.LJI(j);
        final C1121190fHZ c1121190fHZ = new C1121190fHZ(EnumC1120810fGx.COLOR_GIFT, EnumC1118040fCU.BUBBLE, j, (Integer) null, 24);
        this.LLJIJIL = j;
        C785230UrB c785230UrB = new C785230UrB(this);
        c785230UrB.LJIILLIIL = this.LLJJJJLIIL;
        c785230UrB.LJIILL = new InterfaceC254600ye() { // from class: X.0fHH
            @Override // X.InterfaceC254600ye
            public final void onShow() {
                InterfaceC1121180fHY iView = this.LIZ.getIView();
                if (iView != null) {
                    iView.LIZ(c1121190fHZ);
                }
                C1123450fLD.LIZLLL(Long.valueOf(j), EnumC1120830fGz.GIFT_COLOR, null, 12);
                InterfaceC1094160eZy.c1.LJFF(Boolean.TRUE);
            }
        };
        c785230UrB.LJIIIIZZ = Mp4ScreenVideoLoadTimeout.CONTROL;
        c785230UrB.LJIIIZ = true;
        Context context = getContext();
        Object[] objArr = new Object[1];
        if (giftLJI == null || (str = giftLJI.name) == null) {
            str = "";
        }
        objArr[0] = str;
        c785230UrB.LJIJJ = context.getString(2131842731, objArr);
        C1113800f5e.LIZ.LJ(new C785270UrF(c785230UrB), EnumC1120860fH2.CHANGE_COLOR_GIFT, this.LL);
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    public final void setIView(InterfaceC1121180fHY interfaceC1121180fHY) {
        this.LLILLJJLI = interfaceC1121180fHY;
    }

    public final void setShowingBubbleGuide(boolean z) {
        this.LLJJIJIIJIL = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a9  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.bytedance.android.livesdk.gift.model.GiftIconInfo] */
    /* JADX WARN: Type inference failed for: r0v95 */
    @Override // X.InterfaceC1121210fHb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.bytedance.android.livesdk.gift.model.GiftsInfo r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1120950fHB.LIZJ(com.bytedance.android.livesdk.gift.model.GiftsInfo, boolean):void");
    }

    @Override // X.InterfaceC1121280fHi
    public final void LJFF(long j, ImageModel imageModel) {
        this.LLJJIII.add(new C1121070fHN(EnumC1120980fHE.COLOR_GIFT, imageModel, j));
        LJI();
    }

    public C1120950fHB(Context context, DataChannel dataChannel, InterfaceC1121180fHY interfaceC1121180fHY) {
        super(context);
        this.LL = dataChannel;
        this.LLILLJJLI = interfaceC1121180fHY;
        this.LLIZLLLIL = new C1120960fHC();
        this.LLJ = new C1121250fHf();
        this.LLJI = new C11NJ();
        this.LLJILJIL = EnumC1120990fHF.DAILY;
        this.LLJJ = 30L;
        this.LLJJIII = new ConcurrentLinkedQueue<>();
        this.LLJJJ = EnumC1102980eoC.DEFAULT;
        this.LLJJJIL = R.id.x1p;
        this.LLJJJJ = -1;
        this.LLJJJJJIL = new ARunnableS117S0100000_17(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        this.LLJJJJLIIL = new C1151840g50(this, 7);
        this.LLJJL = new C1151840g50(this, 8);
    }

    @Override // X.InterfaceC1121210fHb
    public final void LIZLLL(Integer num, List<Integer> list, List<Long> list2, int i) {
        EnumC1120980fHE enumC1120980fHE;
        if (num == null) {
            return;
        }
        ConcurrentLinkedQueue<C1121070fHN> concurrentLinkedQueue = this.LLJJIII;
        if (num.intValue() == 1) {
            enumC1120980fHE = EnumC1120980fHE.MATCH_ITEM_CRITICAL;
        } else if (num.intValue() == 2) {
            enumC1120980fHE = EnumC1120980fHE.MATCH_ITEM_SMOKE;
        } else if (num.intValue() == 3) {
            enumC1120980fHE = EnumC1120980fHE.MATCH_ITEM_EXTRA_TIME;
        } else if (num.intValue() == 4) {
            enumC1120980fHE = EnumC1120980fHE.MATCH_ITEM_EFFECTING;
        } else if (num.intValue() == 7) {
            enumC1120980fHE = EnumC1120980fHE.MATCH_ITEM_TOP2;
        } else if (num.intValue() == 8) {
            enumC1120980fHE = EnumC1120980fHE.MATCH_ITEM_TOP3;
        } else if (num.intValue() == 9) {
            enumC1120980fHE = EnumC1120980fHE.MATCH_ITEM_VAULT_GLOVES;
        } else if (num.intValue() == -100) {
            enumC1120980fHE = EnumC1120980fHE.MATCH_ITEM_TWO_CARDS_TOGETHER;
        } else {
            enumC1120980fHE = EnumC1120980fHE.MATCH_ITEM_CRITICAL;
        }
        concurrentLinkedQueue.offer(new C1121070fHN(enumC1120980fHE, null, 0L, list, list2));
        this.LLJJIJIL = i;
        LJI();
    }
}
