package X;

import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateApplyService;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetPanelModelKt;
import com.ss.android.ugc.effectmanager.effect.model.AssetType;
import com.ss.android.ugc.effectmanager.effect.model.TemplateMusicInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0mxG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1416120mxG {
    public static final boolean LIZ(Asset asset) {
        EnumC1412640mre enumC1412640mreLIZLLL;
        String music_url;
        AssetType assetType = AssetPanelModelKt.toAssetType(asset.getAsset_type());
        boolean music_post_unavailable = false;
        if (assetType == null || (enumC1412640mreLIZLLL = C1412660mrg.LIZLLL(assetType)) == null) {
            return false;
        }
        if (C296620Bjw.LIZ()) {
            Boolean music_unavailable_in_post = asset.getBusiness_extra().getMusic_unavailable_in_post();
            if (music_unavailable_in_post != null) {
                music_post_unavailable = music_unavailable_in_post.booleanValue();
            }
        } else {
            music_post_unavailable = asset.getBusiness_extra().getMusic_post_unavailable();
        }
        if (C296620Bjw.LIZ()) {
            TemplateMusicInfo template_music_info = asset.getBusiness_extra().getTemplate_music_info();
            if (template_music_info == null || (music_url = template_music_info.getBackup_music_url()) == null) {
                music_url = asset.getBusiness_extra().getTemplate_backup_music_url();
            }
        } else {
            music_url = asset.getBusiness_extra().getMusic_url();
        }
        return C0LCZ.LIZ(enumC1412640mreLIZLLL, Boolean.valueOf(music_post_unavailable), asset.getBusiness_extra().getMusic_id(), music_url);
    }

    public static final boolean LIZJ(Asset asset) {
        if (asset.getAsset_type() == AssetType.AI_ALIVE_TEMPLATE.getValue()) {
            return true;
        }
        return false;
    }

    public static final C095D LIZLLL(InterfaceC346201Wa interfaceC346201Wa, InterfaceC346201Wa interfaceC346201Wa2) {
        return new C095D(new C1430805is(interfaceC346201Wa, interfaceC346201Wa2, null));
    }

    public static final void LIZIZ(C1415940mwy c1415940mwy, NLETemplateModel nLETemplateModel, boolean z, EnumC1412640mre enumC1412640mre) {
        String str;
        NLEResType nLEResType;
        Map linkedHashMap;
        EnumC1412640mre enumC1412640mre2 = enumC1412640mre;
        s.LIZ.getClass();
        s.LJIIJJI(nLETemplateModel);
        C1419810n3D.LIZJ(null);
        List<AutoCutMediaModel> listInvoke = c1415940mwy.LIZLLL.invoke();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listInvoke, 10));
        for (AutoCutMediaModel autoCutMediaModel : listInvoke) {
            if (C2286708xd.LIZJ(autoCutMediaModel.filePath)) {
                str = autoCutMediaModel.filePath;
            } else {
                str = autoCutMediaModel.fileUriPath;
                if (str == null) {
                    str = "";
                }
            }
            if (autoCutMediaModel.isVideoType) {
                nLEResType = NLEResType.VIDEO;
            } else {
                nLEResType = NLEResType.IMAGE;
            }
            long j = autoCutMediaModel.duration;
            Long l = autoCutMediaModel.date;
            if (l != null && l.longValue() > 0) {
                linkedHashMap = C2097608Jq.LJIIJ(new Pair("create_time", Long.valueOf(l.longValue())));
            } else {
                linkedHashMap = new LinkedHashMap();
            }
            arrayList.add(new C0E4S(str, nLEResType, j, 1.0f, 0L, j, null, linkedHashMap, 64));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        EnumC1412640mre enumC1412640mre3 = EnumC1412640mre.AUTOCUT_TEMPLATE;
        if (!((Boolean) C0AY6.LIZ.getValue()).booleanValue()) {
            enumC1412640mre2 = enumC1412640mre3;
        }
        StringBuilder sb = new StringBuilder("CCTemplateAssetDownloader -> segmentList.size = ");
        sb.append(arrayList.size());
        sb.append(";segmentList = ");
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C0E4S) it2.next()).LIZ);
        }
        sb.append(arrayList2);
        C201955140j.LIZ(sb.toString());
        ((ITemplateApplyService) ServiceManager.get().getService(ITemplateApplyService.class)).LIZ(nLETemplateModel, arrayList, C1412390mrF.LJIIJ, enumC1412640mre2, c1415940mwy.LIZ, C0E4V.CIRCLE_V2, C298910Bnd.LIZ(), z, false);
    }
}
