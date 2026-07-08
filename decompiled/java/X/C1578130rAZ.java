package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.minidrama.common.component.model.ShortDramaOverview;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlockInfo;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlocks;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightCommonItem;
import com.ss.android.ugc.aweme.model.BadgeType;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterCenterScene;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterSceneEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0rAZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578130rAZ {
    public static final C1578280rAo LIZ(SeriesCenterCenterScene seriesCenterCenterScene) {
        Integer numValueOf;
        C1578300rAq c1578300rAq = new C1578300rAq();
        SeriesCenterSceneEnum seriesCenterSceneEnum = seriesCenterCenterScene.scene;
        if (seriesCenterSceneEnum != null) {
            numValueOf = Integer.valueOf(seriesCenterSceneEnum.getValue());
        } else {
            numValueOf = null;
        }
        c1578300rAq.LIZLLL = numValueOf;
        c1578300rAq.LJ = seriesCenterCenterScene.name;
        return c1578300rAq.build();
    }

    public static final SeriesCenterCenterScene LIZIZ(C1578280rAo c1578280rAo) {
        int iIntValue;
        C1578340rAu c1578340rAu = SeriesCenterSceneEnum.Companion;
        Integer num = c1578280rAo.scene_id;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c1578340rAu.getClass();
        return new SeriesCenterCenterScene(C1578340rAu.LIZ(iIntValue), null, c1578280rAo.title, null);
    }

    public static final ShortDramaOverview LIZJ(C1578210rAh c1578210rAh) {
        UrlModel urlModel;
        Long lValueOf;
        SeriesCategory seriesCategory;
        int iIntValue;
        Long l = c1578210rAh.collection_id;
        String str = c1578210rAh.title;
        C673002jw c673002jw = c1578210rAh.cover;
        Long lValueOf2 = null;
        if (c673002jw != null) {
            urlModel = new UrlModel();
            urlModel.setUri(c673002jw.uri);
            urlModel.setUrlList(c673002jw.url_list);
            Integer num = c673002jw.width;
            int iIntValue2 = 0;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            urlModel.setWidth(iIntValue);
            Integer num2 = c673002jw.height;
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            }
            urlModel.setHeight(iIntValue2);
            urlModel.setUrlKey(c673002jw.url_key);
        } else {
            urlModel = null;
        }
        if (c1578210rAh.num_videos != null) {
            lValueOf = Long.valueOf(r0.intValue());
        } else {
            lValueOf = null;
        }
        if (c1578210rAh.num_watched != null) {
            lValueOf2 = Long.valueOf(r0.intValue());
        }
        Integer num3 = c1578210rAh.last_watched;
        String str2 = c1578210rAh.categories;
        Boolean bool = c1578210rAh.label_hot;
        Boolean bool2 = c1578210rAh.label_new;
        Integer num4 = c1578210rAh.category;
        if (num4 == null || (seriesCategory = (SeriesCategory) C13LQ.LJJIIZ(num4.intValue(), SeriesCategory.values())) == null) {
            seriesCategory = SeriesCategory.DEFAULT;
        }
        return new ShortDramaOverview(l, null, str, urlModel, bool, bool2, str2, lValueOf, lValueOf2, num3, c1578210rAh.is_limited_free, seriesCategory, c1578210rAh.show_rank_badge, 0L, BadgeType.NUM_WATCHED, null, c1578210rAh.is_safety_selected, null, null);
    }

    public static final C1578210rAh LIZLLL(ShortDramaOverview shortDramaOverview) {
        C673002jw c673002jwBuild;
        Integer numValueOf;
        Integer numValueOf2;
        C1578190rAf c1578190rAf = new C1578190rAf();
        c1578190rAf.LIZLLL = shortDramaOverview.collectionId;
        c1578190rAf.LJ = shortDramaOverview.title;
        UrlModel urlModel = shortDramaOverview.cover;
        Integer numValueOf3 = null;
        if (urlModel != null) {
            C673202jy c673202jy = new C673202jy();
            c673202jy.LIZLLL = urlModel.getUri();
            List<String> urlList = urlModel.getUrlList();
            if (urlList == null) {
                urlList = C13BV.INSTANCE;
            }
            C1516540pZE.LIZ(urlList);
            c673202jy.LJ = urlList;
            c673202jy.LJFF = Integer.valueOf(urlModel.getWidth());
            c673202jy.LJI = Integer.valueOf(urlModel.getHeight());
            c673202jy.LJII = urlModel.getUrlKey();
            c673002jwBuild = c673202jy.build();
        } else {
            c673002jwBuild = null;
        }
        c1578190rAf.LJFF = c673002jwBuild;
        Long l = shortDramaOverview.numVideos;
        if (l != null) {
            numValueOf = Integer.valueOf((int) l.longValue());
        } else {
            numValueOf = null;
        }
        c1578190rAf.LJI = numValueOf;
        Long l2 = shortDramaOverview.numWatched;
        if (l2 != null) {
            numValueOf2 = Integer.valueOf((int) l2.longValue());
        } else {
            numValueOf2 = null;
        }
        c1578190rAf.LJII = numValueOf2;
        c1578190rAf.LJIIIIZZ = shortDramaOverview.lastWatched;
        c1578190rAf.LJIIIZ = shortDramaOverview.categories;
        c1578190rAf.LJIIJ = shortDramaOverview.labelHot;
        c1578190rAf.LJIIJJI = shortDramaOverview.labelNew;
        SeriesCategory seriesCategory = shortDramaOverview.category;
        if (seriesCategory != null) {
            numValueOf3 = Integer.valueOf(seriesCategory.ordinal());
        }
        c1578190rAf.LJIILIIL = numValueOf3;
        c1578190rAf.LJIILJJIL = shortDramaOverview.isLimitedFree();
        c1578190rAf.LJIJI = shortDramaOverview.showRankBadge;
        c1578190rAf.LJIL = shortDramaOverview.isSafe();
        return c1578190rAf.build();
    }

    public static final C1578210rAh LJ(SkylightCommonItem skylightCommonItem) {
        Integer numValueOf;
        C1578190rAf c1578190rAf = new C1578190rAf();
        c1578190rAf.LIZLLL = skylightCommonItem.collectionId;
        Long l = skylightCommonItem.category;
        C673002jw c673002jwBuild = null;
        if (l != null) {
            numValueOf = Integer.valueOf((int) l.longValue());
        } else {
            numValueOf = null;
        }
        c1578190rAf.LJIILIIL = numValueOf;
        c1578190rAf.LJIILJJIL = skylightCommonItem.isLimitedFree;
        c1578190rAf.LJ = skylightCommonItem.title;
        com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.UrlModel urlModel = skylightCommonItem.urlModel;
        if (urlModel != null) {
            C673202jy c673202jy = new C673202jy();
            c673202jy.LIZLLL = urlModel.uri;
            List<String> list = urlModel.urlList;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            C1516540pZE.LIZ(list);
            c673202jy.LJ = list;
            c673202jy.LJFF = urlModel.width;
            c673202jy.LJI = urlModel.height;
            c673202jy.LJII = urlModel.urlKey;
            c673002jwBuild = c673202jy.build();
        }
        c1578190rAf.LJFF = c673002jwBuild;
        c1578190rAf.LJIIIIZZ = skylightCommonItem.watchedEpisodes;
        c1578190rAf.LJI = skylightCommonItem.totalEpisodes;
        return c1578190rAf.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public static final SkylightBlocks LJFF(C1578240rAk c1578240rAk) {
        ?? arrayList;
        int iIntValue;
        List<C1578180rAe> list = c1578240rAk.skylight_card_list;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (C1578180rAe c1578180rAe : list) {
                Integer num = c1578180rAe.card_style;
                List<C1578210rAh> list2 = c1578180rAe.history_list;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<C1578210rAh> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(LJI(it2.next()));
                }
                List<C1578210rAh> list3 = c1578180rAe.trending_list;
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                Iterator<C1578210rAh> it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(LJI(it3.next()));
                }
                List<C1578260rAm> list4 = c1578180rAe.scene_list;
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list4, 10));
                for (C1578260rAm c1578260rAm : list4) {
                    C1578340rAu c1578340rAu = SeriesCenterSceneEnum.Companion;
                    Integer num2 = c1578260rAm.scene;
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    c1578340rAu.getClass();
                    arrayList4.add(new SeriesCenterCenterScene(C1578340rAu.LIZ(iIntValue), c1578260rAm.category_id, c1578260rAm.name, c1578260rAm.metric_name));
                }
                arrayList.add(new SkylightBlockInfo(num, arrayList2, arrayList3, arrayList4, null));
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        return new SkylightBlocks(arrayList);
    }

    public static final SkylightCommonItem LJI(C1578210rAh c1578210rAh) {
        long jIntValue;
        com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.UrlModel urlModel;
        Long l = c1578210rAh.collection_id;
        Integer num = c1578210rAh.category;
        if (num != null) {
            jIntValue = num.intValue();
        } else {
            jIntValue = 0;
        }
        Long lValueOf = Long.valueOf(jIntValue);
        Boolean bool = c1578210rAh.is_limited_free;
        String str = c1578210rAh.title;
        C673002jw c673002jw = c1578210rAh.cover;
        if (c673002jw != null) {
            urlModel = new com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.UrlModel(c673002jw.uri, c673002jw.url_list, c673002jw.width, c673002jw.height, c673002jw.url_key);
        } else {
            urlModel = null;
        }
        return new SkylightCommonItem(l, lValueOf, bool, str, urlModel, c1578210rAh.last_watched, c1578210rAh.num_videos);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.util.List<X.0rAh>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List, java.util.List<X.0rAh>] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.util.List<X.0rAm>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List, java.util.List<X.0rAe>] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    public static final C1578240rAk LJII(SkylightBlocks skylightBlocks) {
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        Integer numValueOf;
        C1578250rAl c1578250rAl = new C1578250rAl();
        List<SkylightBlockInfo> list = skylightBlocks.blocks;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (SkylightBlockInfo skylightBlockInfo : list) {
                C1578230rAj c1578230rAj = new C1578230rAj();
                c1578230rAj.LIZLLL = skylightBlockInfo.cardStyle;
                List<SkylightCommonItem> list2 = skylightBlockInfo.historyList;
                if (list2 != null) {
                    arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    Iterator<SkylightCommonItem> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(LJ(it2.next()));
                    }
                } else {
                    arrayList2 = C13BV.INSTANCE;
                }
                C1516540pZE.LIZ(arrayList2);
                c1578230rAj.LJ = arrayList2;
                List<SkylightCommonItem> list3 = skylightBlockInfo.trendingList;
                if (list3 != null) {
                    arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                    Iterator<SkylightCommonItem> it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(LJ(it3.next()));
                    }
                } else {
                    arrayList3 = C13BV.INSTANCE;
                }
                C1516540pZE.LIZ(arrayList3);
                c1578230rAj.LJFF = arrayList3;
                List<SeriesCenterCenterScene> list4 = skylightBlockInfo.sceneList;
                if (list4 != null) {
                    arrayList4 = new ArrayList(C15438062q.LJIJJ(list4, 10));
                    for (SeriesCenterCenterScene seriesCenterCenterScene : list4) {
                        C1578270rAn c1578270rAn = new C1578270rAn();
                        SeriesCenterSceneEnum seriesCenterSceneEnum = seriesCenterCenterScene.scene;
                        if (seriesCenterSceneEnum != null) {
                            numValueOf = Integer.valueOf(seriesCenterSceneEnum.getValue());
                        } else {
                            numValueOf = null;
                        }
                        c1578270rAn.LIZLLL = numValueOf;
                        c1578270rAn.LJ = seriesCenterCenterScene.categoryId;
                        c1578270rAn.LJFF = seriesCenterCenterScene.name;
                        c1578270rAn.LJI = seriesCenterCenterScene.metricName;
                        arrayList4.add(c1578270rAn.build());
                    }
                } else {
                    arrayList4 = C13BV.INSTANCE;
                }
                C1516540pZE.LIZ(arrayList4);
                c1578230rAj.LJI = arrayList4;
                arrayList.add(c1578230rAj.build());
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        C1516540pZE.LIZ(arrayList);
        c1578250rAl.LIZLLL = arrayList;
        return c1578250rAl.build();
    }
}
