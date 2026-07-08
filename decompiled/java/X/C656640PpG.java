package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.detail.relatedsearch.settings.BackgroundVideoCover;
import com.ss.android.ugc.aweme.search.detail.relatedsearch.settings.BgmJson;
import com.ss.android.ugc.aweme.search.detail.relatedsearch.settings.NewRs;
import com.ss.android.ugc.aweme.search.detail.relatedsearch.settings.SearchInflowRsSettingsConfig;
import com.ss.android.ugc.aweme.search.detail.relatedsearch.settings.SearchInnerFeedRsConfig;
import com.ss.android.ugc.aweme.search.detail.relatedsearch.ui.SearchDetailRelatedSearchCellComponent;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PpG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C656640PpG implements C0PI6 {
    public static final C656640PpG LIZ = new C656640PpG();

    @Override // X.C0PI6
    public final C19719912Dl LJ() {
        return C13LE.LIZ(SearchDetailRelatedSearchCellComponent.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006e A[PHI: r8
      0x006e: PHI (r8v7 com.ss.android.ugc.aweme.feed.model.Aweme) = (r8v6 com.ss.android.ugc.aweme.feed.model.Aweme), (r8v10 com.ss.android.ugc.aweme.feed.model.Aweme) binds: [B:13:0x0045, B:20:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018d A[EDGE_INSN: B:87:0x018d->B:83:0x018d BREAK  A[LOOP:1: B:32:0x0092->B:80:0x0181], SYNTHETIC] */
    @Override // X.C0PI6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZ(X.C0PHT r12) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C656640PpG.LIZ(X.0PHT):java.lang.String");
    }

    @Override // X.C0PI6
    public final Aweme LIZIZ(String str) {
        Aweme aweme = new Aweme();
        aweme.setAid(str);
        AwemeBizExtKt.setSearchFeedType(aweme, "virtual_inner_search_feed_type_rs");
        aweme.setVideo(new Video());
        User user = new User();
        user.setUid("");
        user.setNickname("");
        aweme.setAuthor(user);
        return aweme;
    }

    @Override // X.C0PI6
    public final Aweme LIZJ(String str) {
        SearchInnerFeedRsConfig searchInnerFeedRsConfig;
        BackgroundVideoCover backgroundVideoCover;
        int iIntValue;
        SearchInnerFeedRsConfig searchInnerFeedRsConfig2;
        NewRs newRs;
        BgmJson bgmJson;
        List<BitRate> list;
        Aweme aweme = new Aweme();
        aweme.setAid(str);
        AwemeBizExtKt.setSearchFeedType(aweme, "inner_search_feed_type_rs");
        Video video = new Video();
        if (Intrinsics.LJFF(C308620C7w.LIZ(), 1)) {
            C0PYL.LIZ.getClass();
            SearchInflowRsSettingsConfig searchInflowRsSettingsConfig = (SearchInflowRsSettingsConfig) C0PYL.LIZIZ.getValue();
            if (searchInflowRsSettingsConfig != null && (searchInnerFeedRsConfig2 = searchInflowRsSettingsConfig.innerFeedConfig) != null && (newRs = searchInnerFeedRsConfig2.newRs) != null && (bgmJson = newRs.bgmJson) != null && (list = bgmJson.bitRate) != null) {
                video.setBitRate(list);
            }
        }
        C0PYL.LIZ.getClass();
        SearchInflowRsSettingsConfig searchInflowRsSettingsConfig2 = (SearchInflowRsSettingsConfig) C0PYL.LIZIZ.getValue();
        if (searchInflowRsSettingsConfig2 != null && (searchInnerFeedRsConfig = searchInflowRsSettingsConfig2.innerFeedConfig) != null && (backgroundVideoCover = searchInnerFeedRsConfig.videoCover) != null) {
            video.setRatio("720p");
            video.setHeight(1280);
            video.setWidth(720);
            List<String> list2 = backgroundVideoCover.urlList;
            if (list2 != null) {
                UrlModel urlModel = new UrlModel();
                urlModel.setUrlList(AbstractC19875512pd.copyOf((Collection) list2));
                urlModel.setUri(backgroundVideoCover.uri);
                urlModel.setHeight(1280);
                Integer num = backgroundVideoCover.width;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 720;
                }
                urlModel.setWidth(iIntValue);
                video.setCover(urlModel);
                video.setOriginCover(urlModel);
                VideoUrlModel videoUrlModel = new VideoUrlModel();
                videoUrlModel.setUrlList(AbstractC19875512pd.copyOf((Collection) list2));
                videoUrlModel.setHeight(1280);
                videoUrlModel.setWidth(720);
                video.setPlayAddr(videoUrlModel);
                video.setDownloadAddr(videoUrlModel);
            }
        }
        aweme.setVideo(video);
        User user = new User();
        user.setUid("");
        user.setNickname("");
        aweme.setAuthor(user);
        return aweme;
    }

    @Override // X.C0PI6
    public final boolean LJFF(Aweme aweme) {
        String searchFeedType;
        String searchFeedType2 = null;
        if (aweme != null) {
            searchFeedType = AwemeBizExtKt.getSearchFeedType(aweme);
        } else {
            searchFeedType = null;
        }
        if (!Intrinsics.LJFF(searchFeedType, "inner_search_feed_type_rs")) {
            if (aweme != null) {
                searchFeedType2 = AwemeBizExtKt.getSearchFeedType(aweme);
            }
            if (!Intrinsics.LJFF(searchFeedType2, "virtual_inner_search_feed_type_rs")) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // X.C0PI6
    public final boolean LIZLLL(Fragment fragment, String str) {
        IDetailPageAbility iDetailPageAbilityLIZ;
        DetailPageComponent detailPageComponentDn1;
        InterfaceC1603360rpG interfaceC1603360rpG;
        if (str == null || !str.equals("general_search") || !Intrinsics.LJFF(C1836407He.LIZ.getValue(), 1) || !C0PM4.LIZ()) {
            return false;
        }
        if (((C639840P7u) C0Q3E.LJI().jy().LIZJ()).LL.LIZJ == null) {
            Object viewModel = null;
            if (fragment != null && (iDetailPageAbilityLIZ = C1600700rky.LIZ(fragment)) != null && (detailPageComponentDn1 = iDetailPageAbilityLIZ.Dn1()) != null && (interfaceC1603360rpG = detailPageComponentDn1.LLLFZ) != null) {
                viewModel = interfaceC1603360rpG.getViewModel();
            }
            if (!(viewModel instanceof C0PI3) || viewModel == null) {
                return false;
            }
        }
        return true;
    }
}
