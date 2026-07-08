package X;

import Y.AComparatorS46S0000000_27;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ImageExtraInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixBrandPic;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixInsitePic;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixKeyFramePic;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixLemon8Pic;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixOpPushPic;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixOutsitePic;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixPicItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1418, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1418 {
    public static final List<BaseImage> LIZ(List<BaseImage> list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<BaseImage> it2 = list.iterator();
            while (it2.hasNext()) {
                int i = it2.next().imageSceneType;
                if (i == 10002 || i == 10001 || i == 10003) {
                    ArrayList arrayList = new ArrayList();
                    for (BaseImage baseImage : list) {
                        int i2 = baseImage.imageSceneType;
                        if (i2 == 10002 || i2 == 0) {
                            arrayList.add(baseImage);
                        }
                    }
                    return C13LP.LJLLLL(new AComparatorS46S0000000_27(7), arrayList);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (BaseImage baseImage2 : list) {
            BaseImage baseImage3 = baseImage2;
            switch (baseImage3.imageSceneType) {
                case 10001:
                case 10003:
                    break;
                case 10002:
                    arrayList2.add(baseImage2);
                    break;
                default:
                    ImageExtraInfo imageExtraInfo = baseImage3.extraInfo;
                    if (imageExtraInfo == null || imageExtraInfo.isVisible()) {
                        arrayList2.add(baseImage2);
                    }
                    break;
            }
        }
        return arrayList2;
    }

    public static final Aweme LIZIZ(TakoMixPicItem takoMixPicItem) {
        TakoMixKeyFramePic takoMixKeyFramePic;
        int i = takoMixPicItem.type;
        if (i != 0) {
            if (i != 1) {
                if (i == 2 && (takoMixKeyFramePic = takoMixPicItem.keyFramePic) != null) {
                    return takoMixKeyFramePic.LIZ;
                }
                return null;
            }
            TakoMixLemon8Pic takoMixLemon8Pic = takoMixPicItem.lemon8Pic;
            if (takoMixLemon8Pic != null) {
                return takoMixLemon8Pic.LIZ;
            }
            return null;
        }
        TakoMixInsitePic takoMixInsitePic = takoMixPicItem.insitePic;
        if (takoMixInsitePic != null) {
            return takoMixInsitePic.LIZ;
        }
        return null;
    }

    public static final String LIZJ(TakoMixPicItem takoMixPicItem) {
        TakoMixKeyFramePic takoMixKeyFramePic;
        int i = takoMixPicItem.type;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 || (takoMixKeyFramePic = takoMixPicItem.keyFramePic) == null) {
                    return null;
                }
                return takoMixKeyFramePic.awemeId;
            }
            TakoMixLemon8Pic takoMixLemon8Pic = takoMixPicItem.lemon8Pic;
            if (takoMixLemon8Pic == null) {
                return null;
            }
            return takoMixLemon8Pic.awemeId;
        }
        TakoMixInsitePic takoMixInsitePic = takoMixPicItem.insitePic;
        if (takoMixInsitePic == null) {
            return null;
        }
        return takoMixInsitePic.awemeId;
    }

    public static final BaseImage LIZLLL(TakoMixPicItem takoMixPicItem) {
        TakoMixOpPushPic takoMixOpPushPic;
        int i = takoMixPicItem.type;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5 || (takoMixOpPushPic = takoMixPicItem.opPushPic) == null) {
                                return null;
                            }
                            return takoMixOpPushPic.image;
                        }
                        TakoMixBrandPic takoMixBrandPic = takoMixPicItem.brandPic;
                        if (takoMixBrandPic == null) {
                            return null;
                        }
                        return takoMixBrandPic.image;
                    }
                    TakoMixOutsitePic takoMixOutsitePic = takoMixPicItem.outsitePic;
                    if (takoMixOutsitePic == null) {
                        return null;
                    }
                    return takoMixOutsitePic.image;
                }
                TakoMixKeyFramePic takoMixKeyFramePic = takoMixPicItem.keyFramePic;
                if (takoMixKeyFramePic == null) {
                    return null;
                }
                return takoMixKeyFramePic.image;
            }
            TakoMixLemon8Pic takoMixLemon8Pic = takoMixPicItem.lemon8Pic;
            if (takoMixLemon8Pic == null) {
                return null;
            }
            return takoMixLemon8Pic.image;
        }
        TakoMixInsitePic takoMixInsitePic = takoMixPicItem.insitePic;
        if (takoMixInsitePic == null) {
            return null;
        }
        return takoMixInsitePic.image;
    }

    public static final String LJ(List<BaseImage> list) {
        h hVar = new h();
        try {
            for (BaseImage baseImage : list) {
                n nVar = new n();
                nVar.LJJIIJ("image_uri", baseImage.uri);
                nVar.LJJIIJ("image_source", baseImage.imageSource);
                String str = (String) C13LP.LJJJLL(baseImage.urlList);
                if (str == null) {
                    str = "";
                }
                nVar.LJJIIJ("image_url", str);
                nVar.LJJIII(Integer.valueOf(baseImage.width), "image_width");
                nVar.LJJIII(Integer.valueOf(baseImage.height), "image_height");
                hVar.LJJIFFI(nVar);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return hVar.toString();
    }

    public static final boolean LJFF(TakoMixFeed takoMixFeed) {
        String str;
        if (LJIIIZ(takoMixFeed).length() == 0) {
            String str2 = null;
            if (takoMixFeed != null) {
                str2 = takoMixFeed.hintInText;
            }
            if (C123100dR.LIZ(str2)) {
                if (takoMixFeed == null || (str = takoMixFeed.thinkContent) == null || str.length() == 0) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJI(TakoMixFeed takoMixFeed) {
        Map<String, TakoPlaceholderSource> map;
        Collection<TakoPlaceholderSource> collectionValues;
        if (takoMixFeed != null && takoMixFeed.cardType == 51 && (map = takoMixFeed.placeholderSources) != null && (collectionValues = map.values()) != null && !collectionValues.isEmpty()) {
            Iterator<T> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                Integer num = ((TakoPlaceholderSource) it2.next()).sourceType;
                if (num != null && num.intValue() == 7) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static final boolean LJII(BaseImage baseImage) {
        int i = baseImage.imageSceneType;
        if (i != 10002 && i != 0 && i != 10001) {
            return false;
        }
        return true;
    }

    public static final String LJIIIZ(TakoMixFeed takoMixFeed) {
        String str;
        String strLJJIFFI;
        if (takoMixFeed == null || (str = takoMixFeed.text) == null || (strLJJIFFI = u.LJJIFFI(str, takoMixFeed.hintInText, "", false)) == null) {
            return "";
        }
        return strLJJIFFI;
    }

    public static final void LJIIIIZZ(TakoMixPicItem takoMixPicItem, Aweme aweme) {
        TakoMixKeyFramePic takoMixKeyFramePic;
        int i = takoMixPicItem.type;
        if (i != 0) {
            if (i != 1) {
                if (i == 2 && (takoMixKeyFramePic = takoMixPicItem.keyFramePic) != null) {
                    takoMixKeyFramePic.LIZ = aweme;
                    return;
                }
                return;
            }
            TakoMixLemon8Pic takoMixLemon8Pic = takoMixPicItem.lemon8Pic;
            if (takoMixLemon8Pic == null) {
                return;
            }
            takoMixLemon8Pic.LIZ = aweme;
            return;
        }
        TakoMixInsitePic takoMixInsitePic = takoMixPicItem.insitePic;
        if (takoMixInsitePic == null) {
            return;
        }
        takoMixInsitePic.LIZ = aweme;
    }
}
