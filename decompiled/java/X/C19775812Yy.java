package X;

import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.IEcPreviewViewAbility;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.extend.ExtendAlbumAssem;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.SysRecommendFeedItem;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.model.PageType;
import kotlin.Unit;

/* JADX INFO: renamed from: X.12Yy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19775812Yy extends C09AY implements InterfaceC1631630sYr {
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19775812Yy(ChallengeDetailFragment challengeDetailFragment, int i) {
        super(4);
        this.$t = i;
        this.l0 = challengeDetailFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19775812Yy(EcTakePhotoActivity ecTakePhotoActivity, int i) {
        super(4);
        this.$t = i;
        this.l0 = ecTakePhotoActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19775812Yy(ExtendAlbumAssem extendAlbumAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = extendAlbumAssem;
    }

    public static final Object invoke$0(C19775812Yy c19775812Yy, Object obj, Object obj2, Object obj3, Object obj4) {
        ViewGroup.LayoutParams layoutParams;
        ((Number) obj).intValue();
        int iIntValue = ((Number) obj2).intValue();
        ((Number) obj3).intValue();
        ((Number) obj4).intValue();
        ChallengeDetailFragment challengeDetailFragment = (ChallengeDetailFragment) c19775812Yy.l0;
        challengeDetailFragment.LLLFF = iIntValue;
        SmartImageView smartImageViewUR = challengeDetailFragment.UR();
        if (smartImageViewUR != null && (layoutParams = smartImageViewUR.getLayoutParams()) != null) {
            ChallengeDetailFragment challengeDetailFragment2 = (ChallengeDetailFragment) c19775812Yy.l0;
            layoutParams.height = challengeDetailFragment2.LLLFF + challengeDetailFragment2.hS().getHeight() + ((ChallengeDetailFragment) c19775812Yy.l0).iS().getHeight();
        }
        SmartImageView smartImageViewUR2 = ((ChallengeDetailFragment) c19775812Yy.l0).UR();
        if (smartImageViewUR2 != null) {
            smartImageViewUR2.requestLayout();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(C19775812Yy c19775812Yy, Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).intValue();
        ((EcTakePhotoActivity) c19775812Yy.l0).yn1((SysRecommendFeedItem) obj2, PageType.RECOMMEND, (String) obj4);
        return Unit.LIZ;
    }

    public static final Object invoke$2(C19775812Yy c19775812Yy, Object obj, Object obj2, Object obj3, Object obj4) {
        SysRecommendFeedItem sysRecommendFeedItem = (SysRecommendFeedItem) obj2;
        ((Number) obj3).intValue();
        String str = (String) obj4;
        IEcPreviewViewAbility iEcPreviewViewAbility = (IEcPreviewViewAbility) C1558520qew.LIZ(C1558520qew.LJIIL((ExtendAlbumAssem) c19775812Yy.l0), IEcPreviewViewAbility.class, null);
        if (iEcPreviewViewAbility != null) {
            iEcPreviewViewAbility.yn1(sysRecommendFeedItem, PageType.RECOMMEND, str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(C19775812Yy c19775812Yy, Object obj, Object obj2, Object obj3, Object obj4) {
        MediaModel mediaModel = (MediaModel) obj;
        int iIntValue = ((Number) obj2).intValue();
        ((Number) obj3).longValue();
        IEcPreviewViewAbility iEcPreviewViewAbility = (IEcPreviewViewAbility) C1558520qew.LIZ(C1558520qew.LJIIL((ExtendAlbumAssem) c19775812Yy.l0), IEcPreviewViewAbility.class, null);
        if (iEcPreviewViewAbility != null) {
            iEcPreviewViewAbility.Jh1(iIntValue, mediaModel);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(C19775812Yy c19775812Yy, Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).intValue();
        ((EcTakePhotoActivity) c19775812Yy.l0).yn1((SysRecommendFeedItem) obj2, PageType.RECOMMEND, (String) obj4);
        return Unit.LIZ;
    }

    public static final Object invoke$5(C19775812Yy c19775812Yy, Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).intValue();
        ((EcTakePhotoActivity) c19775812Yy.l0).yn1((SysRecommendFeedItem) obj2, PageType.USER_GUIDANCE, (String) obj4);
        return Unit.LIZ;
    }
}
