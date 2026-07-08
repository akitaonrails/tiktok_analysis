package X;

import com.ss.android.ugc.aweme.im.common.model.IMGiphyInfo;
import com.ss.android.ugc.aweme.im.common.model.IMTypingRecommendationStickerInfo;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.common.model.VideoSticker;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HlU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C450460HlU extends C2217421BqW implements Function2<C451030HmP, EnumC450450HlT, Unit> {
    public C450460HlU(Object obj) {
        super(2, obj, C450470HlV.class, "onPopupActionClicked", "onPopupActionClicked(Lcom/ss/android/ugc/aweme/emoji/common/base/BaseEmoji;Lcom/ss/android/ugc/aweme/im/common/sticker/FavStickerActionType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C451030HmP c451030HmP, EnumC450450HlT enumC450450HlT) {
        SetSticker setSticker;
        Long stickerId;
        IMTypingRecommendationStickerInfo typingRecommendationStickerInfo;
        SetSticker setSticker2;
        Integer numValueOf;
        String id;
        Long authorUid;
        Integer numValueOf2;
        AbstractC450910HmD<C451030HmP> abstractC450910HmD;
        List<C451030HmP> data;
        String id2;
        String typingRecommendationId;
        String str;
        C450730Hlv c450730Hlv;
        StickerItem stickerItem;
        StickerBase stickerBase;
        AbstractC450910HmD<C451030HmP> abstractC450910HmD2;
        List<C451030HmP> data2;
        Long l;
        Long stickerId2;
        Long videoStickerId;
        C450730Hlv c450730Hlv2;
        StickerItem stickerItem2;
        StickerBase stickerBase2;
        C451030HmP c451030HmP2 = c451030HmP;
        C450470HlV c450470HlV = (C450470HlV) this.receiver;
        c450470HlV.getClass();
        if (c451030HmP2 instanceof C450730Hlv) {
            StickerItem stickerItem3 = ((C450730Hlv) c451030HmP2).LJIIIZ;
            if (enumC450450HlT == EnumC450450HlT.ADD) {
                InterfaceC497601wk interfaceC497601wk = c450470HlV.LJIJJ;
                if (interfaceC497601wk != null) {
                    C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ, null, new C0HY5(c450470HlV, stickerItem3, null), 2);
                }
            } else {
                InterfaceC497601wk interfaceC497601wk2 = c450470HlV.LJIJJ;
                if (interfaceC497601wk2 != null) {
                    C23250099c.LIZLLL(interfaceC497601wk2, C0PEM.LIZJ, null, new C0HY4(c450470HlV, stickerItem3, null), 2);
                }
            }
        } else {
            VideoSticker videoSticker = c451030HmP2.LJFF;
            if ((videoSticker == null || (stickerId = videoSticker.getVideoStickerId()) == null) && ((setSticker = c451030HmP2.LJ) == null || (stickerId = setSticker.getStickerId()) == null)) {
                IMGiphyInfo iMGiphyInfo = c451030HmP2.LJI;
                if (iMGiphyInfo != null && (typingRecommendationStickerInfo = iMGiphyInfo.getTypingRecommendationStickerInfo()) != null) {
                    stickerId = typingRecommendationStickerInfo.stickerIdLong;
                } else {
                    stickerId = null;
                }
            }
            VideoSticker videoSticker2 = c451030HmP2.LJFF;
            if ((videoSticker2 == null || (numValueOf = videoSticker2.getStickerType()) == null) && ((setSticker2 = c451030HmP2.LJ) == null || (numValueOf = setSticker2.getStickerType()) == null)) {
                if (c451030HmP2.LJI != null) {
                    numValueOf = Integer.valueOf(EnumC451180Hme.GIPHY.getType());
                } else {
                    numValueOf = null;
                }
            }
            SetSticker setSticker3 = c451030HmP2.LJ;
            if (setSticker3 == null || (id = setSticker3.getTypingRecommendationId()) == null) {
                IMGiphyInfo iMGiphyInfo2 = c451030HmP2.LJI;
                if (iMGiphyInfo2 != null) {
                    id = iMGiphyInfo2.getId();
                } else {
                    id = null;
                }
            }
            VideoSticker videoSticker3 = c451030HmP2.LJFF;
            if (videoSticker3 == null || (authorUid = videoSticker3.getCreatorUid()) == null) {
                SetSticker setSticker4 = c451030HmP2.LJ;
                if (setSticker4 != null) {
                    authorUid = setSticker4.getAuthorUid();
                } else {
                    authorUid = null;
                }
            }
            IMGiphyInfo iMGiphyInfo3 = c451030HmP2.LJI;
            if (iMGiphyInfo3 != null) {
                numValueOf2 = Integer.valueOf(iMGiphyInfo3.getSource());
            } else {
                numValueOf2 = null;
            }
            if (stickerId != null && c450470HlV.LJIILLIIL.LIZJ() == 7 && (abstractC450910HmD2 = c450470HlV.LJIIL) != null && (data2 = abstractC450910HmD2.getData()) != null) {
                Iterator<C451030HmP> it2 = data2.iterator();
                int i = 0;
                while (true) {
                    if (it2.hasNext()) {
                        C451030HmP next = it2.next();
                        if ((next instanceof C450730Hlv) && (c450730Hlv2 = (C450730Hlv) next) != null && (stickerItem2 = c450730Hlv2.LJIIIZ) != null && (stickerBase2 = stickerItem2.stickerBase) != null) {
                            l = stickerBase2.id;
                        } else {
                            l = null;
                        }
                        if (!Intrinsics.LJFF(l, stickerId)) {
                            SetSticker setSticker5 = next.LJ;
                            if (setSticker5 != null) {
                                stickerId2 = setSticker5.getStickerId();
                            } else {
                                stickerId2 = null;
                            }
                            if (!Intrinsics.LJFF(stickerId2, stickerId)) {
                                VideoSticker videoSticker4 = next.LJFF;
                                if (videoSticker4 != null) {
                                    videoStickerId = videoSticker4.getVideoStickerId();
                                } else {
                                    videoStickerId = null;
                                }
                                if (Intrinsics.LJFF(videoStickerId, stickerId)) {
                                    break;
                                }
                                i++;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                Integer numValueOf3 = Integer.valueOf(i);
                if (numValueOf3.intValue() >= c450470HlV.LJIIIIZZ()) {
                    c450470HlV.LJIILIIL(numValueOf3.intValue());
                    c450470HlV.LJI();
                }
            }
            if (id != null && c450470HlV.LJIILLIIL.LIZJ() == 7 && (abstractC450910HmD = c450470HlV.LJIIL) != null && (data = abstractC450910HmD.getData()) != null) {
                Iterator<C451030HmP> it3 = data.iterator();
                int i2 = 0;
                while (true) {
                    if (it3.hasNext()) {
                        C451030HmP next2 = it3.next();
                        IMGiphyInfo iMGiphyInfo4 = next2.LJI;
                        if (iMGiphyInfo4 != null) {
                            id2 = iMGiphyInfo4.getId();
                        } else {
                            id2 = null;
                        }
                        if (!Intrinsics.LJFF(id2, id)) {
                            SetSticker setSticker6 = next2.LJ;
                            if (setSticker6 != null) {
                                typingRecommendationId = setSticker6.getTypingRecommendationId();
                            } else {
                                typingRecommendationId = null;
                            }
                            if (!Intrinsics.LJFF(typingRecommendationId, id)) {
                                if ((next2 instanceof C450730Hlv) && (c450730Hlv = (C450730Hlv) next2) != null && (stickerItem = c450730Hlv.LJIIIZ) != null && (stickerBase = stickerItem.stickerBase) != null) {
                                    str = stickerBase.thirdPartyStickerId;
                                } else {
                                    str = null;
                                }
                                if (Intrinsics.LJFF(str, id)) {
                                    break;
                                }
                                i2++;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                Integer numValueOf4 = Integer.valueOf(i2);
                if (numValueOf4.intValue() >= c450470HlV.LJIIIIZZ()) {
                    c450470HlV.LJIILIIL(numValueOf4.intValue());
                    c450470HlV.LJI();
                }
            }
            if (enumC450450HlT == EnumC450450HlT.ADD) {
                InterfaceC497601wk interfaceC497601wk3 = c450470HlV.LJIJJ;
                if (interfaceC497601wk3 != null) {
                    C23250099c.LIZLLL(interfaceC497601wk3, C0PEM.LIZJ, null, new C0HY3(c450470HlV, stickerId, id, numValueOf, authorUid, numValueOf2, null), 2);
                }
            } else {
                InterfaceC497601wk interfaceC497601wk4 = c450470HlV.LJIJJ;
                if (interfaceC497601wk4 != null) {
                    C23250099c.LIZLLL(interfaceC497601wk4, C0PEM.LIZJ, null, new C0HY6(c450470HlV, stickerId, id, numValueOf, c451030HmP2, numValueOf2, null), 2);
                }
            }
        }
        return Unit.LIZ;
    }
}
