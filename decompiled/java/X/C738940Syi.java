package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.adapter.FullFeedVideoViewHolder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Syi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C738940Syi implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    /* JADX WARN: Type inference failed for: r0v3, types: [TContinuationResult, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [TContinuationResult, java.lang.Object] */
    @Override // X.InterfaceC2385309Wh
    public final TContinuationResult then(C15O7<Pair<? extends C0SJF, ? extends C718800SHm>> c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            default:
                return null;
        }
    }

    public static final Object then$0(C738940Syi c738940Syi, C15O7 c15o7) {
        String aid;
        Aweme aweme;
        C1C7U.LIZ("NewVideoDescDelegate@fb8f.showTranslated$$inlined$onSuccessResultUI$1");
        if (((C15O7) c738940Syi.l0).LJIIL() != null) {
            Pair pair = (Pair) ((C15O7) c738940Syi.l0).LJIIL();
            String aid2 = ((Aweme) c738940Syi.l1).getAid();
            VideoItemParams item = ((C718770SHj) c738940Syi.l2).LLILLJJLI.getItem();
            if (item != null && (aweme = item.getAweme()) != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(aid2, aid)) {
                ((C718770SHj) c738940Syi.l2).LLL = (C718800SHm) pair.getSecond();
                ((C718770SHj) c738940Syi.l2).LLLF.LJII = (C0SJF) pair.getFirst();
                C718770SHj c718770SHj = (C718770SHj) c738940Syi.l2;
                c718770SHj.LJJLJLI(c718770SHj.LLL, (Aweme) c738940Syi.l1, true);
                C718770SHj c718770SHj2 = (C718770SHj) c738940Syi.l2;
                C710300Rtc c710300Rtc = c718770SHj2.LLLILZJ;
                if (c710300Rtc != null) {
                    c718770SHj2.LLLF.LJIIIZ = true;
                    c718770SHj2.LLJI.getLayoutParams().height = -2;
                    C718770SHj c718770SHj3 = (C718770SHj) c738940Syi.l2;
                    c718770SHj3.LJLJLJ(c710300Rtc, c718770SHj3.LLLILZLLLI, true);
                    C718770SHj c718770SHj4 = (C718770SHj) c738940Syi.l2;
                    c718770SHj4.LJJLIIIJLJLI(c718770SHj4.LLLIZZ, true);
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("NewVideoDescDelegate@fb8f.showTranslated$$inlined$onSuccessResultUI$1");
            return unit;
        }
        throw new NullPointerException("result is null");
    }

    public static final Object then$1(C738940Syi c738940Syi, C15O7 c15o7) {
        Aweme aweme;
        FullFeedVideoViewHolder fullFeedVideoViewHolder = (FullFeedVideoViewHolder) c738940Syi.l0;
        ISpecialPlusService iSpecialPlusService = (ISpecialPlusService) c738940Syi.l1;
        Aweme aweme2 = (Aweme) c738940Syi.l2;
        int i = FullFeedVideoViewHolder.U0;
        fullFeedVideoViewHolder.getClass();
        String str = "normal";
        C1C7U.LIZ("FullFeedVideoViewHolder@4b3c.tryShowSpecialPlus$1L");
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (!iSpecialPlusService.shouldShowSpecialPlus()) {
            C1C7U.LIZIZ("FullFeedVideoViewHolder@4b3c.tryShowSpecialPlus$1L");
            return "hide";
        }
        if (iSpecialPlusService.isQuickPromoPlusDisappearOptimization()) {
            int i2 = fullFeedVideoViewHolder.LLJJI;
            if (i2 == 0) {
                str = "hide";
            } else if (i2 > 0 && FullFeedVideoViewHolder.v1() && iSpecialPlusService.shouldShowQuickPromoPlusAuthor() && iSpecialPlusService.getQuickPromoCount() > 0) {
                String aid = aweme2.getAid();
                List<String> listOfPreviousAid = iSpecialPlusService.getListOfPreviousAid();
                if (listOfPreviousAid.isEmpty() || !listOfPreviousAid.contains(aid)) {
                    iSpecialPlusService.saveLastAid(aid);
                    iSpecialPlusService.setQuickPromoCount(iSpecialPlusService.getQuickPromoCount() - 1);
                }
                str = "show";
            }
            C1C7U.LIZIZ("FullFeedVideoViewHolder@4b3c.tryShowSpecialPlus$1L");
            return str;
        }
        if (iSpecialPlusService.isQuickPromoPlusEnabled()) {
            if (FullFeedVideoViewHolder.v1() && !iSpecialPlusService.isQuickPromoPlusDisappearOptimization()) {
                C1C7U.LIZIZ("FullFeedVideoViewHolder@4b3c.tryShowSpecialPlus$1L");
                return "show";
            }
            C1C7U.LIZIZ("FullFeedVideoViewHolder@4b3c.tryShowSpecialPlus$1L");
            return "normal";
        }
        if (!TextUtils.equals(fullFeedVideoViewHolder.getEventType(), "homepage_hot")) {
            C1C7U.LIZIZ("FullFeedVideoViewHolder@4b3c.tryShowSpecialPlus$1L");
            return "normal";
        }
        if (C0XQ7.LJFF() != null && (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || ((aweme = fullFeedVideoViewHolder.LLJJ) != null && !TextUtils.equals(AwemeExtKt.getAuthorUid(aweme), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())))) {
            List<String> specialPlusEffectList = iSpecialPlusService.getSpecialPlusEffectList();
            String stickerIDs = aweme2.getStickerIDs();
            if (!C086I.LIZIZ(specialPlusEffectList) && !TextUtils.isEmpty(stickerIDs)) {
                for (String str2 : stickerIDs.split(",")) {
                    if (specialPlusEffectList.contains(str2)) {
                        C1C7U.LIZIZ("FullFeedVideoViewHolder@4b3c.tryShowSpecialPlus$1L");
                        return "show";
                    }
                }
            }
            C1C7U.LIZIZ("FullFeedVideoViewHolder@4b3c.tryShowSpecialPlus$1L");
            return "normal";
        }
        C1C7U.LIZIZ("FullFeedVideoViewHolder@4b3c.tryShowSpecialPlus$1L");
        return "normal";
    }

    public C738940Syi(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
