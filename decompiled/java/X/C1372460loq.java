package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.message.template.card.ImageCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.imagecard.ImageCardTitleBar;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkType;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverType;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.share.improve.pkg.PoiSharePackage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0loq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1372460loq {
    public static PoiSharePackage LIZ(Context context, C1372470lor c1372470lor, EnumC1372650lp9 enumC1372650lp9) {
        String shareUrl;
        boolean z;
        String strJ4;
        String str;
        String shareDesc;
        C1370940lmO c1370940lmO = new C1370940lmO();
        c1370940lmO.LIZ = "point_of_interest";
        c1370940lmO.LIZIZ = c1372470lor.LIZJ;
        c1370940lmO.LIZLLL = c1372470lor.LIZLLL;
        ShareInfo shareInfo = c1372470lor.LJJIFFI;
        if (shareInfo != null) {
            shareUrl = shareInfo.getShareUrl();
        } else {
            shareUrl = null;
        }
        String strLJFF = C1375500ltk.LJFF(C1375500ltk.LJ(shareUrl));
        String str2 = "";
        if (strLJFF == null) {
            strLJFF = "";
        }
        c1370940lmO.LJFF = strLJFF;
        String str3 = c1372470lor.LIZJ;
        String str4 = c1372470lor.LIZLLL;
        long j = c1372470lor.LJ;
        List<Aweme> list = c1372470lor.LJFF;
        String str5 = c1372470lor.LIZ;
        String str6 = c1372470lor.LJIJI;
        ArrayList<Video> arrayList = new ArrayList();
        Iterator<Aweme> it2 = list.iterator();
        while (it2.hasNext()) {
            Video video = it2.next().getVideo();
            if (video != null) {
                arrayList.add(video);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (Video video2 : arrayList) {
            List<String> urlList = video2.getCover().getUrlList();
            String videoId = video2.getVideoId();
            if (videoId == null) {
                videoId = "";
            }
            arrayList2.add(new VideoCoverComponent(new ImageComponent(urlList, video2.getCover().getUri(), (ResolutionComponent) null, (String) null, (IconTypeComponent) null, 60), videoId, (String) null, VideoCoverType.VIDEO, (ActionLinkComponent) null, (ResolutionComponent) null, (List) null, 244));
        }
        List listLL = C13LP.LL(arrayList2, 3);
        String str7 = "aweme://poi/detail?poi_id=" + str3 + "&enter_method=internal_share&enter_from=chat&poi_client_info=" + str6;
        IPoiService iPoiService = (IPoiService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null);
        if (iPoiService != null && iPoiService.LJLIIL()) {
            z = true;
        } else {
            z = false;
        }
        String strLIZIZ = C1843500y4a.LIZIZ(j);
        C1373350lqH c1373350lqHLIZ = C1373340lqG.LIZ(new C1373330lqF(z, j, str4));
        if (z) {
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            strJ4 = C20642515q3.LJ(2131755620, (int) j, strLIZIZ);
        } else {
            strJ4 = C786410Ut5.j4(u.LJJIFFI(C20642515q3.LJI(2131844692), "%d", "%s", false), Arrays.copyOf(new Object[]{strLIZIZ}, 1));
        }
        ImageCardTemplate imageCardTemplate = new ImageCardTemplate(new ImageCardTitleBar(new ImageComponent(C13BV.INSTANCE, (String) null, (ResolutionComponent) null, (String) null, (IconTypeComponent) null, 62), new TextComponent(str4, null, null), new TextComponent(strJ4, null, null), 8), new ActionLinkComponent(Collections.singletonList(str7), ActionLinkType.DEEP_LINK), listLL, new PreviewHintComponent(new TextComponent(context.getResources().getString(2131844808, str4), null, null), new TextComponent(context.getResources().getString(2131844807, str4), null, null), new TextComponent(context.getResources().getString(2131844806, str4), null, null), null, null, null, 56), new BaseRequestComponent(new QueryDataComponent(str3, c1373350lqHLIZ.LIZLLL())), 464);
        boolean z2 = false;
        IPoiService iPoiService2 = (IPoiService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null);
        if (iPoiService2 != null && iPoiService2.LJJIZ() && enumC1372650lp9 == EnumC1372650lp9.NORMAL_SHARE) {
            z2 = true;
        }
        c1370940lmO.LJIIIIZZ = new SendMessageTemplateTask("point_of_interest", imageCardTemplate, new SendMessageEventParcel(str5, null, null, null, null, null, 62), null, z2, 8);
        boolean z3 = false;
        IPoiService iPoiService3 = (IPoiService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null);
        if (iPoiService3 != null && iPoiService3.LJJIZ()) {
            z3 = true;
        }
        if (!z3) {
            ShareInfo shareInfo2 = c1372470lor.LJJIFFI;
            if (shareInfo2 != null && (shareDesc = shareInfo2.getShareDesc()) != null) {
                str2 = shareDesc;
            }
            c1370940lmO.LJ = str2;
        }
        Bundle bundle = c1370940lmO.LJII;
        C786410Ut5.LJJJI("enter_from", c1372470lor.LIZ, bundle);
        C786410Ut5.LJJJI("enter_method", c1372470lor.LIZIZ, bundle);
        C786410Ut5.LJJJI("panel_source", "share_panel", bundle);
        C786410Ut5.LJJJI("poi_id", c1372470lor.LIZJ, bundle);
        C786410Ut5.LJJJI("poi_city", c1372470lor.LJI, bundle);
        C786410Ut5.LJJJI("poi_region_code", c1372470lor.LJII, bundle);
        C786410Ut5.LJJJI("poi_info_source", c1372470lor.LJIIIIZZ, bundle);
        C786410Ut5.LJJJI("enable_location", String.valueOf(c1372470lor.LJIIIZ), bundle);
        C786410Ut5.LJJJI("previous_page", c1372470lor.LJIIJ, bundle);
        C786410Ut5.LJJIJL(bundle, "poi_extras", c1372470lor.LJIJJ);
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJJI("poisharing", u.LJJIFFI(c1372470lor.LIZLLL, " ", "-", false), bundle2);
        C786410Ut5.LJJIIZI(bundle, bundle2, "short_link_params");
        C786410Ut5.LJJJI("collect_info", c1372470lor.LJJII, bundle);
        C786410Ut5.LJJJI("poi_detail_enter_from", c1372470lor.LJIIL, bundle);
        C786410Ut5.LJJJI("poi_detail_enter_method", c1372470lor.LJIILIIL, bundle);
        C786410Ut5.LJJJI("initial_poi_enter_from", c1372470lor.LJIILJJIL, bundle);
        C786410Ut5.LJJJI("initial_poi_enter_method", c1372470lor.LJIILL, bundle);
        C786410Ut5.LJJJI("initial_poi_from_group_id", c1372470lor.LJIILLIIL, bundle);
        C786410Ut5.LJJJI("btm_pag_id", c1372470lor.LJIIZILJ, bundle);
        int i = C1372640lp8.LIZ[enumC1372650lp9.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str = "poi_screenshot";
            } else {
                throw new C1954807lC();
            }
        } else {
            str = "poi_share_btn";
        }
        C786410Ut5.LJJJI("ttls_panel_source", str, bundle);
        Map<String, String> map = c1372470lor.LJIJ;
        if (map != null && (true ^ map.isEmpty())) {
            Bundle bundle3 = new Bundle();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (C123100dR.LIZ(entry.getKey()) && C123100dR.LIZ(entry.getValue())) {
                    C786410Ut5.LJJJI(entry.getKey(), entry.getValue(), bundle3);
                }
            }
            C786410Ut5.LJJIIZI(bundle, bundle3, "poi_common_params");
        }
        return new PoiSharePackage(c1370940lmO);
    }
}
