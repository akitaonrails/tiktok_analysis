package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1EBc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2277141EBc {
    public static final ArrayList<C20152313tB> LIZ;

    static {
        ArrayList<C20152313tB> arrayList = new ArrayList<>();
        LIZ = arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("com.ss.android.ugc.aweme.series.serieslist.preload.SeriesListPreload");
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add("aweme://paidcontent/promote");
        arrayList.add(new C20152313tB(arrayList2, arrayList3, "", "com.ss.android.ugc.aweme.paidcontent.activity.SeriesPromoteFragment"));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add("com.ss.android.ugc.aweme.poi.mapdetail.PoiMapDetailPreload");
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add("aweme://poi/map_detail");
        arrayList.add(new C20152313tB(arrayList4, arrayList5, "", "com.ss.android.ugc.aweme.poi.mapdetail.PoiMapDetailFragment"));
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add("com.ss.android.ugc.aweme.poi.mapmode.PoiMapModePreload");
        ArrayList arrayList7 = new ArrayList();
        arrayList7.add("aweme://poi/map_mode");
        arrayList.add(new C20152313tB(arrayList6, arrayList7, "", "com.ss.android.ugc.aweme.poi.mapmode.PoiMapModeFragment"));
        ArrayList arrayList8 = new ArrayList();
        arrayList8.add("com.ss.android.ugc.aweme.poi.reviews.preload.PoiReviewListPreload");
        ArrayList arrayList9 = new ArrayList();
        arrayList9.add("//poi/review_list");
        arrayList.add(new C20152313tB(arrayList8, arrayList9, "", "com.ss.android.ugc.aweme.poi.reviews.PoiReviewListFragment"));
        ArrayList arrayList10 = new ArrayList();
        arrayList10.add("com.ss.android.ugc.aweme.poi.search.PoiPostPreload");
        ArrayList arrayList11 = new ArrayList();
        arrayList11.add("//poi/search");
        arrayList.add(new C20152313tB(arrayList10, arrayList11, "", "com.ss.android.ugc.aweme.poi.search.PoiSearchFragment"));
        ArrayList arrayList12 = new ArrayList();
        arrayList12.add("com.ss.android.ugc.aweme.series.seriesdetail.preload.SeriesCollectionDetailPreload");
        ArrayList arrayList13 = new ArrayList();
        arrayList13.add("aweme://paidcontent/collections/detail");
        arrayList.add(new C20152313tB(arrayList12, arrayList13, "", "com.ss.android.ugc.aweme.series.seriesdetail.fragment.SeriesDetailFragment"));
        ArrayList arrayList14 = new ArrayList();
        arrayList14.add("com.ss.android.ugc.aweme.series.serieslist.preload.SeriesListPreload");
        ArrayList arrayList15 = new ArrayList();
        arrayList15.add("aweme://paidcontent/anchor_collections_selection");
        arrayList15.add("aweme://paidcontent/collections");
        arrayList.add(new C20152313tB(arrayList14, arrayList15, "", "com.ss.android.ugc.aweme.series.serieslist.fragment.SeriesListFragment"));
        ArrayList arrayList16 = new ArrayList();
        arrayList16.add("com.ss.android.ugc.tiktok.addyours.hub.AddYoursHubPreload");
        ArrayList arrayList17 = new ArrayList();
        arrayList17.add("//add_yours/hub");
        arrayList.add(new C20152313tB(arrayList16, arrayList17, "", "com.ss.android.ugc.tiktok.addyours.hub.AddYoursHubFragment"));
        ArrayList arrayList18 = new ArrayList();
        arrayList18.add("com.ss.android.ugc.aweme.challenge.api.ChallengeNetPreload");
        ArrayList arrayList19 = new ArrayList();
        arrayList19.add("//aweme/challenge/detail");
        arrayList19.add("//challenge/detail");
        arrayList.add(new C20152313tB(arrayList18, arrayList19, "com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", null));
        ArrayList arrayList20 = new ArrayList();
        arrayList20.add("com.ss.android.ugc.aweme.mix.api.MixDetailNetPreload");
        arrayList20.add("com.ss.android.ugc.aweme.mix.api.MixListNetPreload");
        ArrayList arrayList21 = new ArrayList();
        arrayList21.add("//mix/detail");
        arrayList21.add("aweme://mix/detail");
        arrayList.add(new C20152313tB(arrayList20, arrayList21, "com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity", null));
        ArrayList arrayList22 = new ArrayList();
        arrayList22.add("com.ss.android.ugc.aweme.music.fanspotlight.repo.FanSpotlightNetPreload");
        ArrayList arrayList23 = new ArrayList();
        arrayList23.add("//music/artist/fan_spotlight");
        arrayList23.add("aweme://music/artist/fan_spotlight");
        arrayList.add(new C20152313tB(arrayList22, arrayList23, "com.ss.android.ugc.aweme.music.fanspotlight.FanSpotlightActivity", null));
        ArrayList arrayList24 = new ArrayList();
        arrayList24.add("com.ss.android.ugc.aweme.music.ui.api.MusicDetailNetPreload");
        ArrayList arrayList25 = new ArrayList();
        arrayList25.add("//music/detail");
        arrayList25.add("aweme://music/detail/");
        arrayList.add(new C20152313tB(arrayList24, arrayList25, "com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", null));
    }

    public static C20152313tB LIZ(String str) {
        Uri uri = UriProtector.parse(str);
        String strLJIIJJI = Intrinsics.LJIIJJI(uri.getPath(), uri.getAuthority());
        for (C20152313tB c20152313tB : LIZ) {
            Iterator<String> it2 = c20152313tB.LJ.iterator();
            while (it2.hasNext()) {
                Uri uri2 = UriProtector.parse(it2.next());
                if (Intrinsics.LJFF(strLJIIJJI, Intrinsics.LJIIJJI(uri2.getPath(), uri2.getAuthority()))) {
                    return new C20152313tB(c20152313tB.LIZLLL, c20152313tB.LJ, c20152313tB.LJFF, c20152313tB.LJI);
                }
            }
        }
        return null;
    }
}
