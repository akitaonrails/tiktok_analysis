package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import com.ss.android.ugc.aweme.AnchorRecentlyAddFragment;
import com.ss.android.ugc.aweme.api.AnchorSearchResponse;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.ICommentFavoriteService;
import com.ss.android.ugc.aweme.feed.model.VideoReplyStruct;
import com.ss.android.ugc.aweme.mediaplayer.MediaPlayerModule;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.MvChooseCoverBitmapCreator;
import com.ss.android.ugc.aweme.shortvideo.sticker.comment.CommentFavoriteServiceImpl;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS430S0200000_29;

/* JADX INFO: renamed from: X.12Yk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19774412Yk implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final Object then$0(C19774412Yk c19774412Yk, C15O7 c15o7) {
        return ((MvChooseCoverBitmapCreator) c19774412Yk.l0).lambda$onCoverSeekDone$6((C0MBV) c19774412Yk.l1, c15o7);
    }

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            case 2:
                return then$2(this, c15o7);
            case 3:
                return then$3(this, c15o7);
            case 4:
                return then$4(this, c15o7);
            case 5:
                return then$5(this, c15o7);
            case 6:
                return then$6(this, c15o7);
            case 7:
                return then$7(this, c15o7);
            case 8:
                return then$8(this, c15o7);
            case BdTuring.TYPE_ECAF /* 9 */:
                return then$9(this, c15o7);
            default:
                return null;
        }
    }

    public C19774412Yk(InterfaceC2385309Wh interfaceC2385309Wh, int i) {
        this.$t = i;
        this.l0 = null;
        this.l1 = interfaceC2385309Wh;
    }

    public static final Object then$1(C19774412Yk c19774412Yk, C15O7 c15o7) {
        int iIntValue;
        C1C7U.LIZ("FeedInteractStickerCommonPack@d98.produceCommentStickerClickListener$1$onClick$1$actions$2$1$2$1");
        if (!c15o7.LJIILL() && !c15o7.LJIILIIL()) {
            ((VideoReplyStruct) c19774412Yk.l0).setCollectStat(0);
            ICommentFavoriteService iCommentFavoriteServiceLIZJ = CommentFavoriteServiceImpl.LIZJ();
            String strValueOf = String.valueOf(((VideoReplyStruct) c19774412Yk.l0).getCommentId());
            Integer collectStat = ((VideoReplyStruct) c19774412Yk.l0).getCollectStat();
            if (collectStat != null) {
                iIntValue = collectStat.intValue();
            } else {
                iIntValue = -1;
            }
            iCommentFavoriteServiceLIZJ.LIZIZ(iIntValue, strValueOf);
            C19582611jU c19582611jU = C19582611jU.LIZ;
            C19EG c19eg = (C19EG) c19774412Yk.l1;
            c19582611jU.getClass();
            C19582611jU.LJII(2131834429, 0, 0, c19eg);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedInteractStickerCommonPack@d98.produceCommentStickerClickListener$1$onClick$1$actions$2$1$2$1");
        return unit;
    }

    public static final Object then$2(C19774412Yk c19774412Yk, C15O7 c15o7) {
        int iIntValue;
        C1C7U.LIZ("FeedInteractStickerCommonPack@d98.produceCommentStickerClickListener$1$onClick$1$actions$2$2$2$1");
        if (!c15o7.LJIILL() && !c15o7.LJIILIIL()) {
            ((VideoReplyStruct) c19774412Yk.l0).setCollectStat(1);
            ICommentFavoriteService iCommentFavoriteServiceLIZJ = CommentFavoriteServiceImpl.LIZJ();
            String strValueOf = String.valueOf(((VideoReplyStruct) c19774412Yk.l0).getCommentId());
            Integer collectStat = ((VideoReplyStruct) c19774412Yk.l0).getCollectStat();
            if (collectStat != null) {
                iIntValue = collectStat.intValue();
            } else {
                iIntValue = -1;
            }
            iCommentFavoriteServiceLIZJ.LIZIZ(iIntValue, strValueOf);
            C19582611jU c19582611jU = C19582611jU.LIZ;
            C19EG c19eg = (C19EG) c19774412Yk.l1;
            c19582611jU.getClass();
            C19582611jU.LJII(2131834427, R.raw.icon_tick_fill, R.attr.a0i, c19eg);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedInteractStickerCommonPack@d98.produceCommentStickerClickListener$1$onClick$1$actions$2$2$2$1");
        return unit;
    }

    public static final Object then$3(C19774412Yk c19774412Yk, C15O7 c15o7) {
        List<?> list;
        C1C7U.LIZ("AnchorRecentlyAddFragment@1aef.initView$4$1$1$1$1");
        if (((BaseResponse) c15o7.LJIIL()).status_code == 0) {
            C1117360fBO c1117360fBO = ((AnchorRecentlyAddFragment) c19774412Yk.l0).LLJILJIL;
            if (c1117360fBO != null && (list = c1117360fBO.LL) != null) {
                list.clear();
            }
            C1117360fBO c1117360fBO2 = ((AnchorRecentlyAddFragment) c19774412Yk.l0).LLJILJIL;
            if (c1117360fBO2 != null) {
                c1117360fBO2.notifyDataSetChanged();
            }
            AnonymousClass1192 anonymousClass1192 = (AnonymousClass1192) c19774412Yk.l1;
            if (anonymousClass1192 != null) {
                anonymousClass1192.LLLLILI();
            }
            ((AnchorRecentlyAddFragment) c19774412Yk.l0).MR(false);
            C19EG activity = ((AnchorRecentlyAddFragment) c19774412Yk.l0).getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AnchorRecentlyAddFragment@1aef.initView$4$1$1$1$1");
        return unit;
    }

    public static final Object then$4(C19774412Yk c19774412Yk, C15O7 c15o7) {
        List<AnchorPublishStruct> list;
        ExtensionMisc extensionMisc;
        AnchorPublishStruct anchorPublishStruct;
        C1C7U.LIZ("AnchorPanel@6777.onCreate$8$afterTextChanged$1$1");
        AnchorSearchResponse anchorSearchResponse = (AnchorSearchResponse) ((C15O7) c19774412Yk.l0).LJIIL();
        if (anchorSearchResponse != null && anchorSearchResponse.statusCode == 0 && (list = anchorSearchResponse.rankedAnchorList) != null && (!list.isEmpty())) {
            List<AnchorPublishStruct> list2 = anchorSearchResponse.rankedAnchorList;
            C11G7 c11g7 = (C11G7) c19774412Yk.l1;
            for (AnchorPublishStruct anchorPublishStruct2 : list2) {
                anchorPublishStruct2.enable = true;
                HashMap<String, AnchorPublishStruct> map = c11g7.LLJLIL;
                if (map != null && (anchorPublishStruct = map.get(C11G7.LJLIIL(anchorPublishStruct2))) != null) {
                    extensionMisc = anchorPublishStruct.extensionMisc;
                } else {
                    extensionMisc = null;
                }
                anchorPublishStruct2.setExtensionMisc(extensionMisc);
                anchorPublishStruct2.setOnClickAction(new AwS430S0200000_29(c11g7, anchorPublishStruct2, 69));
            }
            C19403510vh c19403510vh = ((C11G7) c19774412Yk.l1).LLJJIII;
            if (c19403510vh != null) {
                c19403510vh.LL = anchorSearchResponse.rankedAnchorList;
                c19403510vh.notifyDataSetChanged();
            }
            View view = ((C11G7) c19774412Yk.l1).LLJJJJ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
        } else {
            C19403510vh c19403510vh2 = ((C11G7) c19774412Yk.l1).LLJJIII;
            if (c19403510vh2 != null) {
                c19403510vh2.LL = C13BV.INSTANCE;
                c19403510vh2.notifyDataSetChanged();
            }
            View view2 = ((C11G7) c19774412Yk.l1).LLJJJJ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AnchorPanel@6777.onCreate$8$afterTextChanged$1$1");
        return unit;
    }

    public static final Object then$5(C19774412Yk c19774412Yk, C15O7 c15o7) {
        MediaPlayerModule mediaPlayerModule = (MediaPlayerModule) c19774412Yk.l0;
        SurfaceTexture surfaceTexture = (SurfaceTexture) c19774412Yk.l1;
        mediaPlayerModule.getClass();
        C1C7U.LIZ("MediaPlayerModule@3962.startDirectly$3L");
        if (!c15o7.LJIILL() && !c15o7.LJIILIIL() && ((Integer) c15o7.LJIIL()).intValue() >= 0) {
            Surface surface = new Surface(surfaceTexture);
            mediaPlayerModule.LLILLJJLI.start();
            surface.release();
            Boolean bool = Boolean.TRUE;
            C1C7U.LIZIZ("MediaPlayerModule@3962.startDirectly$3L");
            return bool;
        }
        C1C7U.LIZIZ("MediaPlayerModule@3962.startDirectly$3L");
        return null;
    }

    public static final Object then$6(C19774412Yk c19774412Yk, C15O7 c15o7) {
        C19574711iD c19574711iD = (C19574711iD) c19774412Yk.l0;
        Effect effect = (Effect) c19774412Yk.l1;
        c19574711iD.getClass();
        C1C7U.LIZ("ReuseStickerHelper@c1.<field>$1$onSkip$2L");
        if (!c19574711iD.LIZJ(c15o7)) {
            C19574811iE c19574811iE = c19574711iD.LIZ;
            c19574811iE.LJ(effect, c19574811iE.LJIIJJI);
        }
        C1C7U.LIZIZ("ReuseStickerHelper@c1.<field>$1$onSkip$2L");
        return null;
    }

    public static final Object then$7(C19774412Yk c19774412Yk, C15O7 c15o7) {
        C19574711iD c19574711iD = (C19574711iD) c19774412Yk.l0;
        Effect effect = (Effect) c19774412Yk.l1;
        c19574711iD.getClass();
        C1C7U.LIZ("ReuseStickerHelper@c1.<field>$1$onSuccess$2L");
        if (!c19574711iD.LIZJ(c15o7)) {
            C19574811iE c19574811iE = c19574711iD.LIZ;
            c19574811iE.LJ(effect, c19574811iE.LJIIJJI);
        }
        C1C7U.LIZIZ("ReuseStickerHelper@c1.<field>$1$onSuccess$2L");
        return null;
    }

    public static final Object then$8(C19774412Yk c19774412Yk, C15O7 c15o7) {
        C2472709mX c2472709mX = (C2472709mX) c19774412Yk.l0;
        if (c2472709mX != null && c2472709mX.LIZ()) {
            return C15O7.LJIIL;
        }
        if (c15o7.LJIILL()) {
            return C15O7.LJIIIZ(c15o7.LJIIJJI());
        }
        if (c15o7.LJIILIIL()) {
            return C15O7.LJIIL;
        }
        return c15o7.LIZLLL((InterfaceC2385309Wh) c19774412Yk.l1);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0160  */
    /* JADX WARN: Type inference failed for: r2v11, types: [T, android.animation.Animator, android.animation.ObjectAnimator, android.animation.ValueAnimator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object then$9(X.C19774412Yk r17, X.C15O7 r18) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19774412Yk.then$9(X.12Yk, X.15O7):java.lang.Object");
    }

    public C19774412Yk(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
