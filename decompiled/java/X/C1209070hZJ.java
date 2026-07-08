package X;

import Y.ACListenerS0S2400000_18;
import Y.ARunnableS87S0200000_18;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.multi.maker.PoiAnchorMaker;
import com.ss.android.ugc.aweme.music.artist.viewmodel.ArtistMusicFeaturedVideoViewModel;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem;
import com.ss.android.ugc.aweme.poi.quiz.assem.PoiQuizAnswerCardAssem;
import com.ss.android.ugc.aweme.poi.quiz.assem.PoiQuizHorizontalCardAssem;
import com.ss.android.ugc.aweme.poi.quiz.data.PoiQuizResponse;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2ArchiveViewModel;
import com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2Assem;
import com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2Cache;
import com.ss.android.ugc.aweme.story.archive2.calendar.StoryArchiveV2CalendarAssem;
import com.ss.android.ugc.aweme.story.archive2.calendar.StoryArchiveV2CalendarViewModel;
import com.ss.android.ugc.aweme.story.archive2.feed.StoryArchiveV2FeedSharedViewModel;
import com.ss.android.ugc.aweme.story.archive2.model.GetStoryOnThisDayInfoResponse;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS227S0300000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS69S1000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hZJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1209070hZJ extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4);
            case 5:
                return invoke$5(this, obj, obj2, obj3, obj4);
            case 6:
                return invoke$6(this, obj, obj2, obj3, obj4);
            case 7:
                return invoke$7(this, obj, obj2, obj3, obj4);
            case 8:
                return invoke$8(this, obj, obj2, obj3, obj4);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2, obj3, obj4);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2, obj3, obj4);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2, obj3, obj4);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2, obj3, obj4);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1209070hZJ(C094D c094d, C094D<? super C443120HZe<Object, Object, Object>> c094d2) {
        super(4);
        this.$t = c094d2;
        this.l0 = c094d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1209070hZJ(C1178140glQ c1178140glQ, int i) {
        super(4);
        this.$t = i;
        this.l0 = c1178140glQ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1209070hZJ(InterfaceC1393560mMs interfaceC1393560mMs, int i) {
        super(4);
        this.$t = i;
        this.l0 = interfaceC1393560mMs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1209070hZJ(C2205251BSp c2205251BSp, int i) {
        super(4);
        this.$t = i;
        this.l0 = c2205251BSp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1209070hZJ(PoiAnchorMaker poiAnchorMaker, int i) {
        super(4);
        this.$t = i;
        this.l0 = poiAnchorMaker;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1209070hZJ(ArtistMusicFeaturedVideoViewModel artistMusicFeaturedVideoViewModel, int i) {
        super(4);
        this.$t = i;
        this.l0 = artistMusicFeaturedVideoViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1209070hZJ(PoiDetailHeaderAssem poiDetailHeaderAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = poiDetailHeaderAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1209070hZJ(PoiQuizAnswerCardAssem poiQuizAnswerCardAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = poiQuizAnswerCardAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1209070hZJ(PoiQuizHorizontalCardAssem poiQuizHorizontalCardAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = poiQuizHorizontalCardAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1209070hZJ(StoryArchiveV2Assem storyArchiveV2Assem, int i) {
        super(4);
        this.$t = i;
        this.l0 = storyArchiveV2Assem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1209070hZJ(StoryArchiveV2CalendarAssem storyArchiveV2CalendarAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = storyArchiveV2CalendarAssem;
    }

    public static final Object invoke$0(C1209070hZJ c1209070hZJ, Object obj, Object obj2, Object obj3, Object obj4) {
        ((C094D) c1209070hZJ.l0).LJIIIIZZ(new C443120HZe(obj2, obj3, obj4));
        return Unit.LIZ;
    }

    public static final Object invoke$1(C1209070hZJ c1209070hZJ, Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        if (zBooleanValue) {
            ((ArtistMusicFeaturedVideoViewModel) c1209070hZJ.l0).setState(AFwS256S0000000_18.get$arr$(226));
        } else {
            if (zBooleanValue2) {
                ArtistMusicFeaturedVideoViewModel artistMusicFeaturedVideoViewModel = (ArtistMusicFeaturedVideoViewModel) c1209070hZJ.l0;
                artistMusicFeaturedVideoViewModel.getClass();
                artistMusicFeaturedVideoViewModel.setState(new AwS69S1000000_18("", 13));
                artistMusicFeaturedVideoViewModel.LLILLL = "";
            } else {
                ArtistMusicFeaturedVideoViewModel artistMusicFeaturedVideoViewModel2 = (ArtistMusicFeaturedVideoViewModel) c1209070hZJ.l0;
                artistMusicFeaturedVideoViewModel2.getClass();
                artistMusicFeaturedVideoViewModel2.setState(new AwS69S1000000_18(str, 13));
                artistMusicFeaturedVideoViewModel2.LLILLL = str;
            }
            for (InterfaceC1891350zJl interfaceC1891350zJl : ((ArtistMusicFeaturedVideoViewModel) c1209070hZJ.l0).LLILZ) {
                if (interfaceC1891350zJl instanceof C1165860gRc) {
                    C1165860gRc c1165860gRc = (C1165860gRc) interfaceC1891350zJl;
                    if (!Intrinsics.LJFF(c1165860gRc.LL, ((ArtistMusicFeaturedVideoViewModel) c1209070hZJ.l0).LLILLL) && c1165860gRc.LLILZIL) {
                        C1165860gRc c1165860gRcLIZ = C1165860gRc.LIZ(c1165860gRc, false);
                        ((ArtistMusicFeaturedVideoViewModel) c1209070hZJ.l0).listSetItem(c1165860gRcLIZ);
                        ListProtector.set(((ArtistMusicFeaturedVideoViewModel) c1209070hZJ.l0).LLILZ, ((ArtistMusicFeaturedVideoViewModel) c1209070hZJ.l0).LLILZ.indexOf(interfaceC1891350zJl), c1165860gRcLIZ);
                    }
                    if (Intrinsics.LJFF(c1165860gRc.LL, ((ArtistMusicFeaturedVideoViewModel) c1209070hZJ.l0).LLILLL) && !c1165860gRc.LLILZIL) {
                        C1165860gRc c1165860gRcLIZ2 = C1165860gRc.LIZ(c1165860gRc, true);
                        ((ArtistMusicFeaturedVideoViewModel) c1209070hZJ.l0).listSetItem(c1165860gRcLIZ2);
                        ListProtector.set(((ArtistMusicFeaturedVideoViewModel) c1209070hZJ.l0).LLILZ, ((ArtistMusicFeaturedVideoViewModel) c1209070hZJ.l0).LLILZ.indexOf(interfaceC1891350zJl), c1165860gRcLIZ2);
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(C1209070hZJ c1209070hZJ, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Pair pair = (Pair) obj3;
        C2205251BSp c2205251BSpLIZIZ = ((InterfaceC1177040gje) c1209070hZJ.l0).LIZIZ(((C1178200glW) obj2).LIZ().floatValue());
        c2205251BSpLIZIZ.LIZLLL((Bitmap) obj4);
        c2205251BSpLIZIZ.LJ(((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue());
        c2205251BSpLIZIZ.LIZJ(Boolean.valueOf(zBooleanValue));
        return Unit.LIZ;
    }

    public static final Object invoke$11(C1209070hZJ c1209070hZJ, Object obj, Object obj2, Object obj3, Object obj4) {
        ((PoiAnchorMaker) c1209070hZJ.l0).LJJIJIIJIL(((Number) obj).intValue(), ((Number) obj2).intValue(), 0, ((Number) obj3).intValue(), ((Number) obj4).intValue(), 0);
        return Unit.LIZ;
    }

    public static final Object invoke$12(C1209070hZJ c1209070hZJ, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Pair pair = (Pair) obj3;
        C1178140glQ c1178140glQ = (C1178140glQ) c1209070hZJ.l0;
        c1178140glQ.LJFF = ((C1177210gjv) obj2).LIZ().floatValue();
        c1178140glQ.LIZ = (Bitmap) obj4;
        float fFloatValue = ((Number) pair.getFirst()).floatValue();
        float fFloatValue2 = ((Number) pair.getSecond()).floatValue();
        c1178140glQ.LJ = fFloatValue;
        c1178140glQ.LIZLLL = fFloatValue2;
        c1178140glQ.LIZIZ = String.valueOf(zBooleanValue);
        return Unit.LIZ;
    }

    public static final Object invoke$13(C1209070hZJ c1209070hZJ, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Pair pair = (Pair) obj3;
        C2205251BSp c2205251BSpLIZIZ = ((InterfaceC1177040gje) c1209070hZJ.l0).LIZIZ(((C1177210gjv) obj2).LIZ().floatValue());
        c2205251BSpLIZIZ.LIZLLL((Bitmap) obj4);
        c2205251BSpLIZIZ.LJ(((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue());
        c2205251BSpLIZIZ.LIZJ(Boolean.valueOf(zBooleanValue));
        return Unit.LIZ;
    }

    public static final Object invoke$2(C1209070hZJ c1209070hZJ, Object obj, Object obj2, Object obj3, Object obj4) {
        final View view = (View) obj;
        final String str = (String) obj2;
        final String str2 = (String) obj3;
        final Boolean bool = (Boolean) obj4;
        final PoiDetailHeaderAssem poiDetailHeaderAssem = (PoiDetailHeaderAssem) c1209070hZJ.l0;
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0gvy
            /* JADX WARN: Type inference failed for: r0v5, types: [T, X.0P0T] */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                C259800zU c259800zU = new C259800zU();
                C450720Hlu c450720Hlu = new C450720Hlu(view2.getContext());
                C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                c1391600mJi.LIZIZ = view2;
                c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
                c450720Hlu.LJIIJ(2131844785);
                c450720Hlu.LJII(R.attr.uj);
                c450720Hlu.LLILLJJLI.LJIJJ = true;
                c450720Hlu.LJIIIZ(true, new ACListenerS0S2400000_18(str, view, poiDetailHeaderAssem, bool, str2, c259800zU, 0));
                ?? LIZIZ = c450720Hlu.LIZIZ();
                c259800zU.element = LIZIZ;
                LIZIZ.show();
                return true;
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$3(C1209070hZJ c1209070hZJ, Object obj, Object obj2, Object obj3, Object obj4) {
        GetStoryOnThisDayInfoResponse getStoryOnThisDayInfoResponse = (GetStoryOnThisDayInfoResponse) obj2;
        C1173680geE c1173680geE = (C1173680geE) obj3;
        C1173680geE c1173680geE2 = (C1173680geE) obj4;
        if (getStoryOnThisDayInfoResponse != null) {
            Object value = c1173680geE.LJFF.getValue();
            EnumC1173450gdr enumC1173450gdr = EnumC1173450gdr.LOADED_NOT_EMPTY;
            if (value == enumC1173450gdr && c1173680geE2.LJFF.getValue() == enumC1173450gdr) {
                StoryArchiveV2ArchiveViewModel storyArchiveV2ArchiveViewModelGo = ((StoryArchiveV2Assem) c1209070hZJ.l0).Go();
                StoryArchiveV2Cache.Companion.getClass();
                String str = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis()));
                boolean z = !getStoryOnThisDayInfoResponse.getAwemes().isEmpty();
                int size = c1173680geE.LIZJ.size();
                int i = 12;
                if (size > 12) {
                    size = 12;
                }
                int size2 = c1173680geE2.LIZJ.size();
                if (size2 <= 12) {
                    i = size2;
                }
                StoryArchiveV2Cache storyArchiveV2Cache = new StoryArchiveV2Cache(str, z, size, i);
                storyArchiveV2ArchiveViewModelGo.getClass();
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(storyArchiveV2ArchiveViewModelGo), C0PEM.LIZJ, null, new C05NA(storyArchiveV2Cache, null), 2);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(C1209070hZJ c1209070hZJ, Object obj, Object obj2, Object obj3, Object obj4) {
        C1173680geE c1173680geE = (C1173680geE) obj2;
        Map map = (Map) obj4;
        if (((Boolean) obj3).booleanValue()) {
            StoryArchiveV2CalendarViewModel storyArchiveV2CalendarViewModel = (StoryArchiveV2CalendarViewModel) ((StoryArchiveV2CalendarAssem) c1209070hZJ.l0).LLJ.getValue();
            storyArchiveV2CalendarViewModel.withState(new AwS384S0200000_18(storyArchiveV2CalendarViewModel, (StoryArchiveV2FeedSharedViewModel<InterfaceC1173760geM<Object, Object>, InterfaceC1891350zJl>) new AwS227S0300000_18(storyArchiveV2CalendarViewModel, (StoryArchiveV2CalendarViewModel) c1173680geE, (C1173680geE) map, (Map<String, ? extends Aweme>) 44), (Function1<? super C20600815jK<InterfaceC1891350zJl>, Unit>) 193));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(C1209070hZJ c1209070hZJ, Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        InterfaceC1393560mMs interfaceC1393560mMs = (InterfaceC1393560mMs) c1209070hZJ.l0;
        if (interfaceC1393560mMs instanceof PoiAnchorMaker) {
            ((PoiAnchorMaker) interfaceC1393560mMs).LJJIJIIJIL(iIntValue, iIntValue2, 0, iIntValue3, iIntValue4, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(C1209070hZJ c1209070hZJ, Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        InterfaceC1393560mMs interfaceC1393560mMs = (InterfaceC1393560mMs) c1209070hZJ.l0;
        if (interfaceC1393560mMs instanceof PoiAnchorMaker) {
            ((PoiAnchorMaker) interfaceC1393560mMs).LJJIJIIJIL(iIntValue, iIntValue2, 0, iIntValue3, iIntValue4, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(C1209070hZJ c1209070hZJ, Object obj, Object obj2, Object obj3, Object obj4) {
        EnumC1182690gsl enumC1182690gsl = (EnumC1182690gsl) obj3;
        C1175020ggO c1175020ggO = (C1175020ggO) obj4;
        if (enumC1182690gsl != null) {
            try {
                int i = C1178860gma.LIZ[enumC1182690gsl.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = ((PoiQuizHorizontalCardAssem) c1209070hZJ.l0).LLJJIII;
                        if (viewOnAttachStateChangeListenerC20631115oD != null) {
                            viewOnAttachStateChangeListenerC20631115oD.setClipChildren(false);
                        }
                        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = ((PoiQuizHorizontalCardAssem) c1209070hZJ.l0).LLJJIII;
                        if (viewOnAttachStateChangeListenerC20631115oD2 != null) {
                            C339190DRl.LIZLLL(viewOnAttachStateChangeListenerC20631115oD2);
                        }
                        if (obj2 == EnumC1182750gsr.LIST_LOADING) {
                            ((PoiQuizHorizontalCardAssem) c1209070hZJ.l0).ip(EnumC1179510gnd.LOADING);
                            ((PoiQuizHorizontalCardAssem) c1209070hZJ.l0).getClass();
                        } else {
                            PoiQuizResponse poiQuizResponse = ((PoiQuizHorizontalCardAssem) c1209070hZJ.l0).hp().LLIZLLLIL;
                            if (poiQuizResponse != null && poiQuizResponse.isPoiListSuccess()) {
                                PoiQuizHorizontalCardAssem poiQuizHorizontalCardAssem = (PoiQuizHorizontalCardAssem) c1209070hZJ.l0;
                                poiQuizHorizontalCardAssem.kp(poiQuizHorizontalCardAssem.hp().vQ2());
                                PoiQuizHorizontalCardAssem poiQuizHorizontalCardAssem2 = (PoiQuizHorizontalCardAssem) c1209070hZJ.l0;
                                ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD3 = poiQuizHorizontalCardAssem2.LLJJIII;
                                if (viewOnAttachStateChangeListenerC20631115oD3 != null) {
                                    HandlerHook.viewPost(viewOnAttachStateChangeListenerC20631115oD3, new ARunnableS87S0200000_18(poiQuizHorizontalCardAssem2, c1175020ggO, 24));
                                }
                                ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD4 = ((PoiQuizHorizontalCardAssem) c1209070hZJ.l0).LLJJIII;
                                if (viewOnAttachStateChangeListenerC20631115oD4 != null) {
                                    viewOnAttachStateChangeListenerC20631115oD4.invalidate();
                                }
                            } else {
                                ((PoiQuizHorizontalCardAssem) c1209070hZJ.l0).ip(EnumC1179510gnd.ERROR);
                            }
                        }
                    }
                } else {
                    ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD5 = ((PoiQuizHorizontalCardAssem) c1209070hZJ.l0).LLJJIII;
                    if (viewOnAttachStateChangeListenerC20631115oD5 != null) {
                        C339190DRl.LIZLLL(viewOnAttachStateChangeListenerC20631115oD5);
                    }
                    ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD6 = ((PoiQuizHorizontalCardAssem) c1209070hZJ.l0).LLJJIII;
                    if (viewOnAttachStateChangeListenerC20631115oD6 != null) {
                        viewOnAttachStateChangeListenerC20631115oD6.setClipChildren(true);
                    }
                    ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD7 = ((PoiQuizHorizontalCardAssem) c1209070hZJ.l0).LLJJIII;
                    if (viewOnAttachStateChangeListenerC20631115oD7 != null) {
                        viewOnAttachStateChangeListenerC20631115oD7.invalidate();
                    }
                }
                ((PoiQuizHorizontalCardAssem) c1209070hZJ.l0).getClass();
                ((PoiQuizHorizontalCardAssem) c1209070hZJ.l0).getClass();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1205490hTX.LIZ.LJ(EnumC1205570hTf.POI_QUIZ_CARD_ERROR, e);
            }
        } else {
            ((PoiQuizHorizontalCardAssem) c1209070hZJ.l0).getClass();
            ((PoiQuizHorizontalCardAssem) c1209070hZJ.l0).getClass();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(C1209070hZJ c1209070hZJ, Object obj, Object obj2, Object obj3, Object obj4) {
        EnumC1182690gsl enumC1182690gsl = (EnumC1182690gsl) obj3;
        C1175020ggO c1175020ggO = (C1175020ggO) obj4;
        if (obj2 == EnumC1182750gsr.LIST_LOADING) {
            ViewGroup viewGroup = ((PoiQuizAnswerCardAssem) c1209070hZJ.l0).LLJ;
            if (viewGroup != null) {
                C786410Ut5.LJLLLLLL(4, viewGroup);
            }
        } else if (enumC1182690gsl != null) {
            int i = C1178870gmb.LIZ[enumC1182690gsl.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (c1175020ggO != null && c1175020ggO.LIZ != null) {
                        ((PoiQuizAnswerCardAssem) c1209070hZJ.l0).LLJILLL = c1175020ggO;
                    }
                    PoiQuizAnswerCardAssem poiQuizAnswerCardAssem = (PoiQuizAnswerCardAssem) c1209070hZJ.l0;
                    C1175020ggO c1175020ggO2 = poiQuizAnswerCardAssem.LLJILLL;
                    if (c1175020ggO2 != null && c1175020ggO2.LIZ != null) {
                        ViewGroup viewGroup2 = poiQuizAnswerCardAssem.LLJ;
                        if (viewGroup2 != null) {
                            C337180DJs.LIZJ(viewGroup2);
                            C384050F3z c384050F3z = new C384050F3z();
                            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(14));
                            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zq);
                            Drawable drawableLIZ = c384050F3z.LIZ(viewGroup2.getContext());
                            C19659111vp c19659111vp = new C19659111vp();
                            c19659111vp.LIZJ = C418440Gaw.LIZIZ(2);
                            c19659111vp.LIZLLL = C418440Gaw.LIZIZ(12);
                            c19659111vp.LJ = Integer.valueOf(R.attr.p0);
                            c19659111vp.LIZ = C418440Gaw.LIZIZ(14);
                            viewGroup2.setBackground(C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(viewGroup2.getContext())));
                        }
                        PoiQuizAnswerCardAssem.Go(poiQuizAnswerCardAssem.LLJ, poiQuizAnswerCardAssem.LLJJIJI, new AwS562S0100000_18(poiQuizAnswerCardAssem, 2511));
                    } else {
                        C1205490hTX c1205490hTX = C1205490hTX.LIZ;
                        EnumC1205570hTf enumC1205570hTf = EnumC1205570hTf.POI_QUIZ_CARD_ERROR;
                        c1205490hTX.getClass();
                        C1205490hTX.LIZLLL(enumC1205570hTf, "answer card poiId is null", null, null);
                    }
                }
            } else {
                ViewGroup viewGroup3 = ((PoiQuizAnswerCardAssem) c1209070hZJ.l0).LLJ;
                if (viewGroup3 != null) {
                    C786410Ut5.LJLLLLLL(4, viewGroup3);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(C1209070hZJ c1209070hZJ, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Pair pair = (Pair) obj3;
        C1178140glQ c1178140glQ = (C1178140glQ) c1209070hZJ.l0;
        c1178140glQ.LJFF = ((C1178200glW) obj2).LIZ().floatValue();
        c1178140glQ.LIZ = (Bitmap) obj4;
        float fFloatValue = ((Number) pair.getFirst()).floatValue();
        float fFloatValue2 = ((Number) pair.getSecond()).floatValue();
        c1178140glQ.LJ = fFloatValue;
        c1178140glQ.LIZLLL = fFloatValue2;
        c1178140glQ.LIZIZ = String.valueOf(zBooleanValue);
        return Unit.LIZ;
    }
}
