package Y;

import X.AbstractC19486711Lt;
import X.AnonymousClass1214;
import X.C098200Yq;
import X.C0NJD;
import X.C117I;
import X.C11CP;
import X.C11IV;
import X.C11RH;
import X.C13IQ;
import X.C13LE;
import X.C15O7;
import X.C189200o6;
import X.C19486911Lv;
import X.C19547511dp;
import X.C19547611dq;
import X.C19547811ds;
import X.C19641611t0;
import X.C196878121c;
import X.C197011126f;
import X.C19719912Dl;
import X.C19774512Yl;
import X.C1C7U;
import X.C2188811AlT;
import X.C2203408kC;
import X.C786410Ut5;
import X.InterfaceC1452170ntP;
import X.InterfaceC1464180oCm;
import X.InterfaceC197013126h;
import Y.ARunnableS31S1200000_29;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.base.AnchorListResp;
import com.ss.android.ugc.aweme.discover.adapter.DiscoverBannerViewHolder;
import com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder;
import com.ss.android.ugc.aweme.discover.ui.TrendsTabFragment;
import com.ss.android.ugc.aweme.mediaplayer.MediaPlayerModule;
import com.ss.android.ugc.aweme.ogc.news.sticker.common.ArticleStickerConfigResponse;
import com.ss.android.ugc.aweme.ogc.news.sticker.common.ArticleStickerStorage;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.vesdk.VEEditor;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public class ACallableS432S0100000_29 implements Callable {
    public final int $t;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return call$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return call$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return call$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return call$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return call$13(this);
            case 14:
                return call$14(this);
            case 15:
                return call$15(this);
            case 16:
                return call$16(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS432S0100000_29 aCallableS432S0100000_29) {
        C11RH c11rh = (C11RH) aCallableS432S0100000_29.l0;
        C1C7U.LIZ("AutoDispose@c2db.autoDisposable$2L");
        try {
            C11IV c11ivLIZ = c11rh.LIZ();
            C1C7U.LIZIZ("AutoDispose@c2db.autoDisposable$2L");
            return c11ivLIZ;
        } catch (C2203408kC e) {
            TryCatchGuardChecker.doCheck(e);
            C19486911Lv c19486911LvLJIIJ = AbstractC19486711Lt.LJIIJ(e);
            C1C7U.LIZIZ("AutoDispose@c2db.autoDisposable$2L");
            return c19486911LvLJIIJ;
        }
    }

    public static final Object call$1(ACallableS432S0100000_29 aCallableS432S0100000_29) {
        C11RH c11rh = (C11RH) aCallableS432S0100000_29.l0;
        C1C7U.LIZ("AutoDispose@c2db.autoDisposable$1L");
        try {
            C11IV c11ivLIZ = c11rh.LIZ();
            C1C7U.LIZIZ("AutoDispose@c2db.autoDisposable$1L");
            return c11ivLIZ;
        } catch (C2203408kC e) {
            TryCatchGuardChecker.doCheck(e);
            C19486911Lv c19486911LvLJIIJ = AbstractC19486711Lt.LJIIJ(e);
            C1C7U.LIZIZ("AutoDispose@c2db.autoDisposable$1L");
            return c19486911LvLJIIJ;
        }
    }

    public static final Object call$10(ACallableS432S0100000_29 aCallableS432S0100000_29) {
        C1C7U.LIZ("PinHelper@7698.callback$1$1");
        AnonymousClass1214 anonymousClass1214 = (AnonymousClass1214) aCallableS432S0100000_29.l0;
        anonymousClass1214.LJIIIIZZ = false;
        anonymousClass1214.LIZJ.oP().setValue(Boolean.FALSE);
        final AnonymousClass1214 anonymousClass12142 = (AnonymousClass1214) aCallableS432S0100000_29.l0;
        anonymousClass12142.LIZIZ.Yf(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, new InterfaceC1464180oCm() { // from class: X.1215
            @Override // X.InterfaceC1464180oCm
            public final void onSeekDone(int i) throws IOException {
                AnonymousClass1214 anonymousClass12143 = anonymousClass12142;
                VEEditorAutoStartStopArbiter value = anonymousClass12143.LIZJ.b10().getValue();
                if (value != null && value.LLJIJIL) {
                    anonymousClass12143.LIZIZ.play();
                }
                ByteBuffer[] byteBufferArr = new ByteBuffer[1];
                C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(anonymousClass12142.LIZIZ);
                if (c348100DkmLIZIZ != null) {
                    c348100DkmLIZIZ.LJIIIZ().LIZ().LIZIZ(anonymousClass12142.LIZLLL, byteBufferArr);
                    C2239408q0.LIZJ(anonymousClass12142.LJ, byteBufferArr[0]);
                    ByteBuffer[] byteBufferArr2 = new ByteBuffer[1];
                    c348100DkmLIZIZ.LJIIIZ().LIZ().LIZ(anonymousClass12142.LIZLLL, byteBufferArr2);
                    C2239408q0.LIZJ(anonymousClass12142.LJFF, byteBufferArr2[0]);
                    C348440DlK c348440DlKLJJIIJZLJL = c348100DkmLIZIZ.LJIIIZ().LJJIIJZLJL(anonymousClass12142.LIZLLL);
                    if (c348440DlKLJJIIJZLJL instanceof C348460DlM) {
                        C348460DlM c348460DlM = (C348460DlM) c348440DlKLJJIIJZLJL;
                        AnonymousClass1214 anonymousClass12144 = anonymousClass12142;
                        c348460DlM.LJIJ = anonymousClass12144.LJ;
                        c348460DlM.LJIJI = anonymousClass12144.LJFF;
                        c348100DkmLIZIZ.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
                    } else if (c348440DlKLJJIIJZLJL instanceof C348450DlL) {
                        C348450DlL c348450DlL = (C348450DlL) c348440DlKLJJIIJZLJL;
                        AnonymousClass1214 anonymousClass12145 = anonymousClass12142;
                        c348450DlL.LJIILLIIL = anonymousClass12145.LJ;
                        c348450DlL.LJIIZILJ = anonymousClass12145.LJFF;
                        c348100DkmLIZIZ.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
                    }
                    AnonymousClass1214 anonymousClass12146 = anonymousClass12142;
                    C121R c121r = anonymousClass12146.LJII;
                    if (c121r != null) {
                        String str = anonymousClass12146.LJ;
                        C196874120y c196874120y = anonymousClass12146.LJI;
                        C196868120s c196868120s = c121r.LIZ;
                        if (c196868120s.LLILLL != null) {
                            HandlerHook.viewPost(c196868120s.LLILLL, new ARunnableS31S1200000_29(c121r, c196874120y, str, 4));
                        }
                    }
                    AnonymousClass1214 anonymousClass12147 = anonymousClass12142;
                    anonymousClass12147.LIZIZ.Gf(anonymousClass12147.LJIIJJI);
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PinHelper@7698.callback$1$1");
        return unit;
    }

    public static final Object call$11(ACallableS432S0100000_29 aCallableS432S0100000_29) {
        C1C7U.LIZ("PinHelper@7698.startPin$1$onSuccess$1");
        AnonymousClass1214 anonymousClass1214 = (AnonymousClass1214) aCallableS432S0100000_29.l0;
        anonymousClass1214.LJIIIIZZ = true;
        anonymousClass1214.LIZJ.oP().setValue(Boolean.TRUE);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PinHelper@7698.startPin$1$onSuccess$1");
        return unit;
    }

    public static final Object call$12(ACallableS432S0100000_29 aCallableS432S0100000_29) {
        boolean zLJFF;
        C1C7U.LIZ("ArticleStickerNewTagController@6f2f.<init>$1");
        ((C19641611t0) aCallableS432S0100000_29.l0).LIZIZ.getClass();
        ArticleStickerConfigResponse articleStickerConfigResponseLIZJ = ArticleStickerStorage.LIZJ();
        boolean z = false;
        if (articleStickerConfigResponseLIZJ != null) {
            zLJFF = Intrinsics.LJFF(articleStickerConfigResponseLIZJ.isEnable, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (zLJFF) {
            ((C19641611t0) aCallableS432S0100000_29.l0).LIZIZ.getClass();
            C0NJD<Boolean> c0njd = ArticleStickerStorage.LJFF;
            Object objLIZ = c0njd.LIZ();
            if (objLIZ == null) {
                try {
                    Keva kevaLIZLLL = ArticleStickerStorage.LIZLLL();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("STORAGE_KEY_ARTICLE_STICKER_ENTRANCE_CLICKED_");
                    sbLIZ.append(ArticleStickerStorage.LIZ());
                    boolean z2 = kevaLIZLLL.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
                    c0njd.LIZIZ(Boolean.valueOf(z2));
                    objLIZ = Boolean.valueOf(z2);
                    C189200o6.m2constructorimpl(objLIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    objLIZ = new C098200Yq(th);
                    C189200o6.m2constructorimpl(objLIZ);
                }
                if (C189200o6.m7isFailureimpl(objLIZ)) {
                    objLIZ = null;
                }
            }
            if (!Intrinsics.LJFF(objLIZ, Boolean.TRUE)) {
                z = true;
            }
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("ArticleStickerNewTagController@6f2f.<init>$1");
        return boolValueOf;
    }

    public static final Object call$13(ACallableS432S0100000_29 aCallableS432S0100000_29) {
        C1C7U.LIZ("StreamVCManager@d49.loopForTask$1");
        while (true) {
            C19547511dp c19547511dp = (C19547511dp) aCallableS432S0100000_29.l0;
            if (c19547511dp.LJI) {
                try {
                    C19547611dq c19547611dqTake = c19547511dp.LIZ.take();
                    C19547811ds c19547811ds = ((C19547511dp) aCallableS432S0100000_29.l0).LIZJ;
                    if (c19547811ds != null) {
                        c19547811ds.LIZLLL(c19547611dqTake);
                    }
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("StreamVCManager@d49.loopForTask$1");
                return unit;
            }
        }
    }

    public static final Object call$14(ACallableS432S0100000_29 aCallableS432S0100000_29) {
        C1C7U.LIZ("FTCEditAudioRecordScene@eb2b.closeWithDelFile$1");
        ((Runnable) aCallableS432S0100000_29.l0).run();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FTCEditAudioRecordScene@eb2b.closeWithDelFile$1");
        return unit;
    }

    public static final Object call$15(ACallableS432S0100000_29 aCallableS432S0100000_29) {
        C197011126f c197011126f = (C197011126f) aCallableS432S0100000_29.l0;
        c197011126f.getClass();
        C1C7U.LIZ("FestivalResDownloader@91b4.onSuccessed$1L");
        InterfaceC197013126h interfaceC197013126h = c197011126f.LLILLL;
        if (interfaceC197013126h != null) {
            interfaceC197013126h.LIZ();
        }
        C1C7U.LIZIZ("FestivalResDownloader@91b4.onSuccessed$1L");
        return null;
    }

    public static final Object call$16(ACallableS432S0100000_29 aCallableS432S0100000_29) {
        C1C7U.LIZ("TrendsTabFragment@d507.doPreload$1");
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(((TrendsTabFragment) aCallableS432S0100000_29.l0).getContext()), R.layout.bn6, ((TrendsTabFragment) aCallableS432S0100000_29.l0).RR(), false);
        DiscoverBannerViewHolder discoverBannerViewHolder = new DiscoverBannerViewHolder((TrendsTabFragment) aCallableS432S0100000_29.l0, viewTd);
        Map<C13IQ<? extends RecyclerView.ViewHolder>, Queue<? extends RecyclerView.ViewHolder>> map = ((TrendsTabFragment) aCallableS432S0100000_29.l0).LLJJI;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DiscoverBannerViewHolder.class);
        LinkedList linkedList = new LinkedList();
        linkedList.offer(discoverBannerViewHolder);
        map.put(c19719912DlLIZ, linkedList);
        TrendsTabFragment trendsTabFragment = (TrendsTabFragment) aCallableS432S0100000_29.l0;
        if (trendsTabFragment.isViewValid()) {
            trendsTabFragment.PR().setHeader(viewTd);
        }
        TrendsTabFragment trendsTabFragment2 = (TrendsTabFragment) aCallableS432S0100000_29.l0;
        trendsTabFragment2.LLJJJ = discoverBannerViewHolder;
        if (trendsTabFragment2.LLJJJIL == null) {
            trendsTabFragment2.LLJJJIL = new C117I(trendsTabFragment2.getActivity(), ((TrendsTabFragment) aCallableS432S0100000_29.l0).LLJJJ);
        }
        int i = 0;
        do {
            TrendingTopicViewHolder trendingTopicViewHolder = new TrendingTopicViewHolder(C786410Ut5.Td(C786410Ut5.ne(((TrendsTabFragment) aCallableS432S0100000_29.l0).getContext()), R.layout.bn7, ((TrendsTabFragment) aCallableS432S0100000_29.l0).RR(), false), (RecyclerView.RecycledViewPool) ((TrendsTabFragment) aCallableS432S0100000_29.l0).LLJJIJIIJIL.getValue(), (TrendsTabFragment) aCallableS432S0100000_29.l0);
            final TrendsTabFragment trendsTabFragment3 = (TrendsTabFragment) aCallableS432S0100000_29.l0;
            trendingTopicViewHolder.LLJL = new C11CP() { // from class: X.11CN
                @Override // X.C11CP
                public final void LIZ(int i2, String str, String str2) {
                    if (str.length() > 0 && !trendsTabFragment3.LLJIJIL.contains(str)) {
                        trendsTabFragment3.LLJIJIL.add(str);
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("enter_from", "discovery");
                        c2344009Gk.LJIIIIZZ("tag_id", str);
                        c2344009Gk.LJIIIIZZ("tag_line", str2);
                        c2344009Gk.LIZJ(i2 + 1, "order");
                        C20684815ws.LJIILLIIL("show_hashtag", c2344009Gk.LIZ);
                    }
                }
            };
            if (((LinkedHashMap) trendsTabFragment3.LLJJI).get(C13LE.LIZ(TrendingTopicViewHolder.class)) == null) {
                Map<C13IQ<? extends RecyclerView.ViewHolder>, Queue<? extends RecyclerView.ViewHolder>> map2 = trendsTabFragment3.LLJJI;
                C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TrendingTopicViewHolder.class);
                LinkedList linkedList2 = new LinkedList();
                linkedList2.offer(trendingTopicViewHolder);
                map2.put(c19719912DlLIZ2, linkedList2);
            } else {
                Queue queue = (Queue) ((LinkedHashMap) trendsTabFragment3.LLJJI).get(C13LE.LIZ(TrendingTopicViewHolder.class));
                if (queue != null) {
                    ((LinkedList) queue).offer(trendingTopicViewHolder);
                }
            }
            i++;
        } while (i < 8);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TrendsTabFragment@d507.doPreload$1");
        return unit;
    }

    public static final Object call$2(ACallableS432S0100000_29 aCallableS432S0100000_29) {
        C1C7U.LIZ("AnchorListManager@3b8e.fetchList$1");
        C15O7<AnchorListResp> c15o7LIZ = AnchorListManager.LIZIZ.LIZ();
        AnchorListManager.LJIIIIZZ.set(true);
        Object objLJ = c15o7LIZ.LJ(new C19774512Yl((Function0) aCallableS432S0100000_29.l0, 5), C15O7.LJIIIIZZ, null);
        C1C7U.LIZIZ("AnchorListManager@3b8e.fetchList$1");
        return objLJ;
    }

    public static final Object call$3(ACallableS432S0100000_29 aCallableS432S0100000_29) {
        VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl = (VEVideoCoverGeneratorImpl) aCallableS432S0100000_29.l0;
        vEVideoCoverGeneratorImpl.getClass();
        C1C7U.LIZ("VEVideoCoverGeneratorImpl@1c4d.onDestroy$1L");
        InterfaceC1452170ntP interfaceC1452170ntP = vEVideoCoverGeneratorImpl.LLILZ;
        if (interfaceC1452170ntP == null) {
            C1C7U.LIZIZ("VEVideoCoverGeneratorImpl@1c4d.onDestroy$1L");
            return null;
        }
        interfaceC1452170ntP.cancelGetVideoFrames();
        C1C7U.LIZIZ("VEVideoCoverGeneratorImpl@1c4d.onDestroy$1L");
        return null;
    }

    public static final Object call$4(ACallableS432S0100000_29 aCallableS432S0100000_29) {
        C1C7U.LIZ("EditAudioRecordScene@9075.closeWithDelFile$1");
        ((Runnable) aCallableS432S0100000_29.l0).run();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditAudioRecordScene@9075.closeWithDelFile$1");
        return unit;
    }

    public static final Object call$5(ACallableS432S0100000_29 aCallableS432S0100000_29) {
        MediaPlayerModule mediaPlayerModule = (MediaPlayerModule) aCallableS432S0100000_29.l0;
        mediaPlayerModule.getClass();
        C1C7U.LIZ("MediaPlayerModule@3962.startDirectly$1L");
        String str = mediaPlayerModule.LL;
        int i = 0;
        if (!mediaPlayerModule.LLILZIL) {
            if (!TextUtils.isEmpty(str)) {
                mediaPlayerModule.LLILLJJLI.LIZJ(str);
                mediaPlayerModule.LLILZLL.getClass();
                long j = mediaPlayerModule.LLILZLL.LIZLLL;
                if (j - 0 > 0) {
                    mediaPlayerModule.LLILLJJLI.LIZLLL(0L, j);
                }
                mediaPlayerModule.LLILLJJLI.setLoop(mediaPlayerModule.LLILZLL.LIZJ);
                mediaPlayerModule.LLILLJJLI.LJ(mediaPlayerModule.LLILZLL.LIZ);
                mediaPlayerModule.LLILLJJLI.LIZ(mediaPlayerModule.LLILZLL.LIZIZ);
            } else {
                i = -1;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        C1C7U.LIZIZ("MediaPlayerModule@3962.startDirectly$1L");
        return numValueOf;
    }

    public static final Object call$6(ACallableS432S0100000_29 aCallableS432S0100000_29) {
        C1C7U.LIZ("FTCPinHelper@6e9d.callback$1$1");
        C196878121c c196878121c = (C196878121c) aCallableS432S0100000_29.l0;
        c196878121c.LJII = false;
        c196878121c.LIZJ.oP().setValue(Boolean.FALSE);
        final C196878121c c196878121c2 = (C196878121c) aCallableS432S0100000_29.l0;
        c196878121c2.LIZIZ.Yf(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, new InterfaceC1464180oCm() { // from class: X.121b
            @Override // X.InterfaceC1464180oCm
            public final void onSeekDone(int i) throws IOException {
                c196878121c2.LIZIZ.play();
                ByteBuffer[] byteBufferArr = new ByteBuffer[1];
                C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(c196878121c2.LIZIZ);
                if (c348100DkmLIZIZ != null) {
                    c348100DkmLIZIZ.LJIIIZ().LIZ().LIZIZ(c196878121c2.LIZLLL, byteBufferArr);
                    C2239408q0.LIZJ(c196878121c2.LJ, byteBufferArr[0]);
                    ByteBuffer[] byteBufferArr2 = new ByteBuffer[1];
                    c348100DkmLIZIZ.LJIIIZ().LIZ().LIZ(c196878121c2.LIZLLL, byteBufferArr2);
                    C2239408q0.LIZJ(c196878121c2.LJFF, byteBufferArr2[0]);
                    C348440DlK c348440DlKLJJIIJZLJL = c348100DkmLIZIZ.LJIIIZ().LJJIIJZLJL(c196878121c2.LIZLLL);
                    if (c348440DlKLJJIIJZLJL instanceof C348460DlM) {
                        C348460DlM c348460DlM = (C348460DlM) c348440DlKLJJIIJZLJL;
                        C196878121c c196878121c3 = c196878121c2;
                        c348460DlM.LJIJ = c196878121c3.LJ;
                        c348460DlM.LJIJI = c196878121c3.LJFF;
                        c348100DkmLIZIZ.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
                    } else if (c348440DlKLJJIIJZLJL instanceof C348450DlL) {
                        C348450DlL c348450DlL = (C348450DlL) c348440DlKLJJIIJZLJL;
                        C196878121c c196878121c4 = c196878121c2;
                        c348450DlL.LJIILLIIL = c196878121c4.LJ;
                        c348450DlL.LJIIZILJ = c196878121c4.LJFF;
                        c348100DkmLIZIZ.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
                    }
                    C196878121c c196878121c5 = c196878121c2;
                    C196899121x c196899121x = c196878121c5.LJI;
                    if (c196899121x != null) {
                        HandlerHook.viewPost(c196899121x.LIZ.LLILLL, new ARunnableS31S1200000_29(c196899121x, c196878121c5.LJ, 3));
                    }
                    C196878121c c196878121c6 = c196878121c2;
                    c196878121c6.LIZIZ.Gf(c196878121c6.LJIIJ);
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FTCPinHelper@6e9d.callback$1$1");
        return unit;
    }

    public static final Object call$7(ACallableS432S0100000_29 aCallableS432S0100000_29) {
        C1C7U.LIZ("FTCPinHelper@6e9d.startPin$1$onSuccess$1");
        C196878121c c196878121c = (C196878121c) aCallableS432S0100000_29.l0;
        c196878121c.LJII = true;
        c196878121c.LIZJ.oP().setValue(Boolean.TRUE);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FTCPinHelper@6e9d.startPin$1$onSuccess$1");
        return unit;
    }

    public static final Object call$8(ACallableS432S0100000_29 aCallableS432S0100000_29) {
        C1C7U.LIZ("TrendingTopicViewHolder@4600.onBind$1");
        TrendingTopicViewHolder trendingTopicViewHolder = (TrendingTopicViewHolder) aCallableS432S0100000_29.l0;
        trendingTopicViewHolder.withState((JediViewModel) trendingTopicViewHolder.LLJLIL.getValue(), new AwS608S0100000_29((TrendingTopicViewHolder) aCallableS432S0100000_29.l0, 597));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TrendingTopicViewHolder@4600.onBind$1");
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$9(Y.ACallableS432S0100000_29 r6) {
        /*
            java.lang.String r5 = "RecommendHashtagUtils@10e4.tryFetchRecommendHashtags$1"
            X.C1C7U.LIZ(r5)
            boolean r0 = X.C112C.LIZIZ
            if (r0 != 0) goto L5b
            X.112C r0 = X.C112C.LIZ
            r0.getClass()
            com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtagResponse r0 = X.C112C.LJIIIZ
            if (r0 == 0) goto L5b
            java.util.List<com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag> r0 = r0.items
            if (r0 == 0) goto L5b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L5b
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.gamora.editor.recommendhashtag.EditInfo r1 = (com.ss.android.ugc.gamora.editor.recommendhashtag.EditInfo) r1
            com.ss.android.ugc.gamora.editor.recommendhashtag.EditInfo r0 = X.C112C.LIZLLL
            boolean r0 = r1.isEqualWith(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L4a
            X.0nlB r0 = X.C1403010mc7.LIZ
            com.ss.android.ugc.aweme.port.in.IAnotherMusicService r0 = r0.getMusicService()
            r0.al()
            java.lang.String r2 = X.C2275708vr.LIZIZ()
            int r0 = X.C112C.LJ
            int r1 = r0 + 1
            X.C112C.LJ = r1
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.gamora.editor.recommendhashtag.EditInfo r0 = (com.ss.android.ugc.gamora.editor.recommendhashtag.EditInfo) r0
            X.C112C.LJ(r2, r1, r0)
        L44:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L4a:
            X.11PQ<com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtagResponse> r4 = X.C112C.LJIIJJI
            if (r4 == 0) goto L44
            X.1129 r3 = new X.1129
            r1 = 1007(0x3ef, double:4.975E-321)
            java.lang.String r0 = "The request condition is not met"
            r3.<init>(r1, r0)
            r4.onError(r3)
            goto L44
        L5b:
            X.112C r0 = X.C112C.LIZ
            r0.getClass()
            r3 = 0
            X.C112C.LJIIIZ = r3
            X.0nlB r0 = X.C1403010mc7.LIZ
            com.ss.android.ugc.aweme.port.in.IAnotherMusicService r0 = r0.getMusicService()
            r0.al()
            java.lang.String r2 = X.C2275708vr.LIZIZ()
            boolean r0 = X.C123100dR.LIZ(r2)
            if (r0 == 0) goto L84
            int r0 = X.C112C.LJ
            int r1 = r0 + 1
            X.C112C.LJ = r1
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.gamora.editor.recommendhashtag.EditInfo r0 = (com.ss.android.ugc.gamora.editor.recommendhashtag.EditInfo) r0
            X.C112C.LJ(r2, r1, r0)
            goto L44
        L84:
            X.0nlB r0 = X.C1403010mc7.LIZ
            com.ss.android.ugc.aweme.port.in.IAnotherMusicService r0 = r0.getMusicService()
            r0.al()
            X.11NZ r4 = X.C2275708vr.LJ()
            if (r4 == 0) goto Lb8
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            X.111H<T> r2 = new X.C098D() { // from class: X.111H
                static {
                    /*
                        X.111H r0 = new X.111H
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.111H<T>) X.111H.LL X.111H
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C111H.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C111H.<init>():void");
                }

                @Override // X.C098D
                public final void LIZIZ(X.InterfaceC626120Oh8<? super java.lang.String> r3) {
                    /*
                        r2 = this;
                        java.lang.RuntimeException r1 = new java.lang.RuntimeException
                        java.lang.String r0 = "time out"
                        r1.<init>(r0)
                        r3.onError(r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C111H.LIZIZ(X.0Oh8):void");
                }
            }
            r0 = 2
            X.11Qa r4 = r4.LJLJJI(r0, r3, r2)
            Y.AfS198S0100000_29 r3 = new Y.AfS198S0100000_29
            java.lang.Object r2 = r6.l0
            com.ss.android.ugc.gamora.editor.recommendhashtag.EditInfo r2 = (com.ss.android.ugc.gamora.editor.recommendhashtag.EditInfo) r2
            r0 = 30
            r3.<init>(r2, r0)
            Y.AfS198S0100000_29 r1 = new Y.AfS198S0100000_29
            r0 = 31
            r1.<init>(r2, r0)
            X.01kM r0 = r4.LJJLL(r3, r1)
            X.11JF r0 = (X.C11JF) r0
            X.C112C.LIZJ = r0
            goto L44
        Lb8:
            int r0 = X.C112C.LJ
            int r1 = r0 + 1
            X.C112C.LJ = r1
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.gamora.editor.recommendhashtag.EditInfo r0 = (com.ss.android.ugc.gamora.editor.recommendhashtag.EditInfo) r0
            X.C112C.LJ(r3, r1, r0)
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS432S0100000_29.call$9(Y.ACallableS432S0100000_29):java.lang.Object");
    }

    public ACallableS432S0100000_29(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
