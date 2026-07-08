package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.FilterCategoryExtra;
import com.ss.android.ugc.aweme.tools.ToolsUrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0slo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1639660slo {
    public static final C1639400slO LIZ = new C1639400slO("", "");

    public static final String LIZJ(Effect effect) {
        if (C278090Av9.LIZ()) {
            return effect.getName();
        }
        List<String> tags = effect.getTags();
        if (tags != null && !tags.isEmpty()) {
            for (String str : tags) {
                if (u.LJJIIJZLJL(str, "pinyin:", false)) {
                    return str.substring(7);
                }
            }
            return null;
        }
        return null;
    }

    public static final C1639670slp LIZ(Effect effect, String str) {
        String strLIZJ;
        Object c098200Yq;
        String str2;
        String effectId = effect.getEffectId();
        String resourceId = effect.getResourceId();
        String extra = effect.getExtra();
        String name = effect.getName();
        if (C278090Av9.LIZ()) {
            strLIZJ = effect.getName();
        } else {
            strLIZJ = LIZJ(effect);
        }
        UrlModel urlModelLIZ = C1441230nbl.LIZ(effect.getFileUrl());
        ToolsUrlModel toolsUrlModel = new ToolsUrlModel();
        toolsUrlModel.uri = urlModelLIZ.getUri();
        toolsUrlModel.urlList = urlModelLIZ.getUrlList();
        List<String> tags = effect.getTags();
        if (tags == null) {
            tags = new ArrayList<>();
        }
        String tagsUpdatedAt = effect.getTagsUpdatedAt();
        Object obj = null;
        try {
            List<String> urlList = effect.getIconUrl().getUrlList();
            if (urlList != null) {
                str2 = urlList.get(0);
            } else {
                str2 = null;
            }
            c098200Yq = UriProtector.parse(str2);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return new C1639670slp(effectId, resourceId, name, str, strLIZJ, toolsUrlModel, tags, tagsUpdatedAt, (Uri) obj, extra);
    }

    public static final Map<EffectCategoryResponse, List<FilterBean>> LIZIZ(C1638440sjq c1638440sjq, Map<String, C1639650sln> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair<EffectCategoryResponse, List<C1639670slp>> pair : c1638440sjq.LIZIZ) {
            ArrayList arrayList = new ArrayList();
            for (C1639670slp c1639670slp : pair.getSecond()) {
                FilterBean filterBean = new FilterBean();
                LJ(filterBean, c1639670slp);
                C1639650sln c1639650sln = map.get(c1639670slp.LIZ);
                if (c1639650sln != null) {
                    filterBean.setFilterFilePath(c1639650sln.LIZJ);
                    filterBean.setFilterFolder(c1639650sln.LIZLLL);
                }
                LIZLLL(pair.getFirst(), filterBean);
                arrayList.add(filterBean);
            }
            linkedHashMap.put(pair.getFirst(), arrayList);
        }
        return linkedHashMap;
    }

    public static final void LIZLLL(EffectCategoryResponse effectCategoryResponse, FilterBean filterBean) {
        FilterCategoryExtra filterCategoryExtra;
        try {
            filterCategoryExtra = (FilterCategoryExtra) new Gson().LJII(effectCategoryResponse.getExtra(), FilterCategoryExtra.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            filterCategoryExtra = new FilterCategoryExtra(CardStruct.IStatusCode.DEFAULT, "");
        }
        filterBean.setCategoryExtra(filterCategoryExtra);
    }

    public static final void LJ(FilterBean filterBean, C1639670slp c1639670slp) {
        filterBean.setId(c1639670slp.LIZ);
        filterBean.setResId(c1639670slp.LIZIZ);
        filterBean.setExtra(c1639670slp.LJIIIZ);
        filterBean.setName(c1639670slp.LIZJ);
        filterBean.setCategoryKey(c1639670slp.LIZLLL);
        filterBean.setEnName(c1639670slp.LJ);
        filterBean.setResource(c1639670slp.LJFF);
        filterBean.setTags(c1639670slp.LJI);
        filterBean.setTagUpdateAt(c1639670slp.LJII);
        filterBean.setThumbnailFileUri(c1639670slp.LJIIIIZZ);
    }
}
