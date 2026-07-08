package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.IToolsBusinessService;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim.EmojiAnimPlayground;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.MusicStickerStruct;
import com.ss.android.ugc.aweme.ogc.news.INewsService;
import com.ss.android.ugc.aweme.ogc.news.sticker.IArticleStickerService;
import com.ss.android.ugc.aweme.property.AddMusicStickerConfig;
import com.ss.android.ugc.aweme.socialavatar.model.SocialAvatarStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.texttoimage.ITextToImageService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AwS109S0400000_11;

/* JADX INFO: renamed from: X.11ml, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19602911ml {
    public static final C19602911ml LIZ = new C19602911ml();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(530));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(529));

    public static IToolsBusinessService LIZJ() {
        return (IToolsBusinessService) LIZIZ.getValue();
    }

    public static List LIZLLL(List list) {
        MusicStickerStruct musicStickerStruct;
        ArrayList arrayList = new ArrayList();
        for (InteractStickerStruct interactStickerStruct : (ArrayList) list) {
            int type = interactStickerStruct.getType();
            if (type != 42) {
                if (type != 112) {
                    if (type != 100) {
                        if (type != 101 || interactStickerStruct.getEmojiSliderStickerStruct() != null) {
                            arrayList.add(interactStickerStruct);
                        }
                    } else if (interactStickerStruct.getInteractiveEmojiStickerStruct() != null) {
                        arrayList.add(interactStickerStruct);
                    }
                } else {
                    SocialAvatarStickerStruct socialAvatarStickerStruct = interactStickerStruct.getSocialAvatarStickerStruct();
                    if (socialAvatarStickerStruct != null && C459610I0p.LIZ(socialAvatarStickerStruct)) {
                        arrayList.add(interactStickerStruct);
                    }
                }
            } else if (((AddMusicStickerConfig) C1403940mdc.LIZIZ.getValue()).consumptionMusicStickerEnabled && ((musicStickerStruct = interactStickerStruct.getMusicStickerStruct()) == null || musicStickerStruct.stickerStyle != 0)) {
                arrayList.add(interactStickerStruct);
            }
        }
        return new ArrayList(arrayList);
    }

    public static void LIZ(Aweme aweme, C705930RmZ c705930RmZ, C2189821An6 c2189821An6) {
        String logExtra;
        long jLongValue;
        Long creativeId;
        if (aweme == null || c705930RmZ == null) {
            return;
        }
        c705930RmZ.LJIJ = aweme.getVideoReplyStruct();
        c705930RmZ.LIZJ = C693020RGi.LIZ(aweme);
        c705930RmZ.LIZLLL = C19580611jA.LJ(aweme);
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        String pageFrom = null;
        if (awemeRawAd != null) {
            logExtra = awemeRawAd.getLogExtra();
        } else {
            logExtra = null;
        }
        c705930RmZ.LJI = logExtra;
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null) {
            pageFrom = awemeRawAd2.getPageFrom();
        }
        c705930RmZ.LJII = pageFrom;
        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
        if (awemeRawAd3 != null && (creativeId = awemeRawAd3.getCreativeId()) != null) {
            jLongValue = creativeId.longValue();
        } else {
            jLongValue = 0;
        }
        c705930RmZ.LJIIIIZZ = jLongValue;
        c705930RmZ.LJIIIZ = C716820S9w.LIZ(aweme);
        c705930RmZ.LJIIJ = aweme.getRequestId();
        if (c2189821An6 != null) {
            int interactiveStickerType = c2189821An6.getInteractiveStickerType();
            List<String> stickerInteractionUIDs = c2189821An6.getStickerInteractionUIDs();
            String eventType = c2189821An6.getEventType();
            if (eventType == null) {
                eventType = "";
            }
            int pageType = c2189821An6.getPageType();
            String from = c2189821An6.getFrom();
            if (from == null) {
                from = "";
            }
            c705930RmZ.LJIJJ = new C19600111mJ(interactiveStickerType, eventType, from, pageType, stickerInteractionUIDs);
        }
    }

    public static InterfaceC19578611iq LIZIZ(Context context, C19EG c19eg, Aweme aweme, C705930RmZ c705930RmZ, boolean z) {
        return LIZJ().produceSocialStickerClickListener(context, c705930RmZ, aweme, c19eg, AFwS292S0000000_9.get$arr$(73), new InterfaceC19597711lv() { // from class: X.0SDT
            @Override // X.InterfaceC19597711lv
            public final String LIZ() {
                return C1D0F.LIZ.LIZ();
            }

            @Override // X.InterfaceC19597711lv
            public final String LIZIZ() {
                return C1D0F.LIZ.LIZIZ();
            }

            @Override // X.InterfaceC19597711lv
            public final String LIZJ() {
                return C1D0F.LIZ.LIZJ();
            }

            @Override // X.InterfaceC19597711lv
            public final boolean isConnected() {
                return C1D0F.LIZ.isConnected();
            }
        }, z);
    }

    public static Map LJ(Aweme aweme, C19EG c19eg, boolean z, C11NJ c11nj, Context context, C705930RmZ c705930RmZ, ViewGroup viewGroup, Fragment fragment, Function1 function1, Function0 function0, boolean z2) {
        Object value;
        C19640311sn c19640311snLIZJ;
        InterfaceC19603111mn consumer;
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        if (interactStickerStructs != null && !interactStickerStructs.isEmpty()) {
            Iterator<InteractStickerStruct> it2 = interactStickerStructs.iterator();
            while (it2.hasNext() && it2.next().getType() != 19) {
            }
        }
        Pair[] pairArr = new Pair[15];
        C0OD3.LIZ.getClass();
        pairArr[0] = new Pair(88, new C0OD7(context, c19eg, aweme, c705930RmZ, z));
        pairArr[1] = new Pair(42, LIZJ().produceMusicStickerClickListener(context, c705930RmZ, aweme, c19eg));
        pairArr[2] = new Pair(6, LIZJ().produceDonationStickerClickListener(context, c705930RmZ));
        pairArr[3] = new Pair(4, LIZJ().produceCommentStickerClickListener(context, c705930RmZ, c19eg));
        pairArr[4] = new Pair(8, LIZIZ(context, c19eg, aweme, c705930RmZ, z2));
        pairArr[5] = new Pair(9, LIZIZ(context, c19eg, aweme, c705930RmZ, z2));
        pairArr[6] = new Pair(106, LIZIZ(context, c19eg, aweme, c705930RmZ, z2));
        IArticleStickerService.Companion.getClass();
        INewsService.LIZ.getClass();
        INewsService value2 = C0N2J.LIZIZ.getValue();
        FragmentManager childFragmentManager = null;
        if (value2 == null || (c19640311snLIZJ = value2.LIZJ()) == null || (consumer = c19640311snLIZJ.getConsumer()) == null || (value = consumer.LIZIZ(c19eg, c705930RmZ)) == null) {
            value = C19603211mo.LIZIZ.getValue();
        }
        pairArr[7] = new Pair(114, value);
        Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(ITextToImageService.class, false, false, false, 14, null);
        if (objPluggableSpi$default != null) {
            pairArr[8] = new Pair(116, ((ITextToImageService) objPluggableSpi$default).LJIIL(c19eg, aweme, c705930RmZ));
            pairArr[9] = new Pair(22, LIZJ().produceLocationStickerClickListener(context, c705930RmZ));
            pairArr[10] = new Pair(10, LIZJ().produceLiveCountDownStickerClickListener(context, c705930RmZ, aweme, c19eg));
            IToolsBusinessService iToolsBusinessServiceLIZJ = LIZJ();
            boolean zLIZ = C281310B0v.LIZ();
            C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
            pairArr[11] = new Pair(101, iToolsBusinessServiceLIZJ.produceEmojiSliderGestureListener(context, c705930RmZ, c19eg, aweme, zLIZ, viewGroup, function1, c1618440sDa.LJJIIJ().LJJIIJZLJL(fragment)));
            pairArr[12] = new Pair(103, LIZJ().produceAttributionLinkStickerClickListener(context, c705930RmZ, aweme, c19eg));
            pairArr[13] = new Pair(111, LIZJ().produceSharedCommentStickerListener(c19eg, aweme));
            pairArr[14] = new Pair(19, LIZJ().produceShare2StoryPhotoStickerClickListener(context, c705930RmZ, aweme, c19eg));
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            if (context != null && viewGroup != null) {
                EmojiAnimPlayground emojiAnimPlayground = new EmojiAnimPlayground(context);
                C19606111nH c19606111nH = new C19606111nH(emojiAnimPlayground);
                C013C c013c = new C013C();
                LIZ.getClass();
                mapLJIIJ.put(100, LIZJ().produceInteractiveEmojiClickListener(context, c705930RmZ, c19eg, aweme, C281310B0v.LIZ(), new AwS109S0400000_11(c013c, viewGroup, emojiAnimPlayground, c19606111nH, 11)));
            }
            if (c11nj != null) {
                LIZ.getClass();
                mapLJIIJ.put(3, LIZJ().producePollStickerClickListener(z, context, c705930RmZ, c19eg, (InterfaceC19632811ra) LIZJ.getValue(), c11nj));
            }
            LIZ.getClass();
            InterfaceC19625011qK interfaceC19625011qKProduceLiveEventCountDownStickerListener = LIZJ().produceLiveEventCountDownStickerListener(context, c705930RmZ, aweme, c19eg, z, null);
            if (interfaceC19625011qKProduceLiveEventCountDownStickerListener != null) {
                mapLJIIJ.put(25, interfaceC19625011qKProduceLiveEventCountDownStickerListener);
            }
            InterfaceC19625011qK interfaceC19625011qKProduceLiveEventCountDownStickerListener2 = LIZJ().produceLiveEventCountDownStickerListener(context, c705930RmZ, aweme, c19eg, z, function0);
            if (interfaceC19625011qKProduceLiveEventCountDownStickerListener2 != null) {
                mapLJIIJ.put(113, interfaceC19625011qKProduceLiveEventCountDownStickerListener2);
            }
            IToolsBusinessService iToolsBusinessServiceLIZJ2 = LIZJ();
            boolean zLJJIIJZLJL = c1618440sDa.LJJIIJ().LJJIIJZLJL(fragment);
            IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
            if (iDetailFeedSafService != null && iDetailFeedSafService.LIZLLL(fragment) != null && fragment != null) {
                childFragmentManager = fragment.getChildFragmentManager();
            }
            InterfaceC19578611iq interfaceC19578611iqProduceSocialAvatarClickListener = iToolsBusinessServiceLIZJ2.produceSocialAvatarClickListener(c705930RmZ, c19eg, aweme, viewGroup, zLJJIIJZLJL, childFragmentManager);
            if (interfaceC19578611iqProduceSocialAvatarClickListener != null) {
                mapLJIIJ.put(112, interfaceC19578611iqProduceSocialAvatarClickListener);
            }
            return mapLJIIJ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
