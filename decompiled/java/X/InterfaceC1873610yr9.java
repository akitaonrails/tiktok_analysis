package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0yr9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC1873610yr9 extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "league_recommend_list", nestedClassType = InterfaceC1873850yrX.class, required = false)
    List<InterfaceC1873850yrX> getLeagueRecommendList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "rival_extra_infos", required = false)
    Map<String, Object> getRivalExtraInfos();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "league_recommend_list", nestedClassType = InterfaceC1873850yrX.class, required = false)
    void setLeagueRecommendList(List<? extends InterfaceC1873850yrX> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "rival_extra_infos", required = false)
    void setRivalExtraInfos(Map<String, ? extends Object> map);
}
