package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.ss.android.ugc.aweme.shortvideo.template.TemplatePostInfo;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0nIh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429410nIh {
    public static final C1429410nIh LIZ = new C1429410nIh();

    /* JADX WARN: Removed duplicated region for block: B:200:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r34) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1429410nIh.LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):java.util.List");
    }

    public static final List<CreateAnchorInfo> LIZJ(VideoPublishEditModel videoPublishEditModel) {
        try {
            LIZ.getClass();
            return LIZIZ(videoPublishEditModel);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0CHQ.LIZ().getPublishService().LJJIIZI();
            C1436930nUp.LIZIZ("fatal error detected while initializing anchor list in post page", new RuntimeException("fatal error detected while initializing anchor list in post page", e), null);
            return C13BV.INSTANCE;
        }
    }

    public static void LIZ(List list, AVUploadMiscInfoStruct aVUploadMiscInfoStruct, VideoPublishEditModel videoPublishEditModel) throws JSONException {
        String name;
        String templateType;
        Integer sourceId;
        UrlModel iconUrl;
        List<String> urlList;
        String str;
        UrlModel iconUrl2;
        List<String> urlList2;
        MvModel mvModel = aVUploadMiscInfoStruct.mvInfo;
        String dispatchType = null;
        if (mvModel != null) {
            name = mvModel.getName();
            if (name != null && name.length() != 0) {
                JSONObject jSONObject = new JSONObject();
                C1412410mrH.LIZ.getClass();
                TemplatePostInfo templatePostInfoLIZ = C1412410mrH.LIZ(videoPublishEditModel);
                if (templatePostInfoLIZ != null && (templatePostInfoLIZ.getTemplateType() == null || templatePostInfoLIZ.getDispatchType() == null)) {
                    return;
                }
                try {
                    jSONObject.put("add_from", 1);
                    jSONObject.put("third_id", aVUploadMiscInfoStruct.mvThemeId);
                    MvModel mvModel2 = aVUploadMiscInfoStruct.mvInfo;
                    if (mvModel2 != null && (iconUrl = mvModel2.getIconUrl()) != null && (urlList = iconUrl.getUrlList()) != null && !urlList.isEmpty()) {
                        MvModel mvModel3 = aVUploadMiscInfoStruct.mvInfo;
                        if (mvModel3 != null && (iconUrl2 = mvModel3.getIconUrl()) != null && (urlList2 = iconUrl2.getUrlList()) != null) {
                            str = urlList2.get(0);
                        } else {
                            str = null;
                        }
                        jSONObject.put("icon_url", str);
                    }
                    jSONObject.put("mv_template_type", aVUploadMiscInfoStruct.mvType);
                    if (templatePostInfoLIZ != null) {
                        sourceId = templatePostInfoLIZ.getSourceId();
                    } else {
                        sourceId = null;
                    }
                    jSONObject.put("source_id", sourceId);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (name.length() > 0 && a0.LJJJIL(name)) {
                    name = C20642515q3.LJI(2131857993);
                }
                if (templatePostInfoLIZ != null) {
                    templateType = templatePostInfoLIZ.getTemplateType();
                } else {
                    templateType = null;
                }
                EnumC1430380nKG enumC1430380nKG = (EnumC1430380nKG) C298980Bnk.LIZJ(C1394440mOI.LJFF(C1394440mOI.LJII(templateType)));
                if (enumC1430380nKG == null) {
                    enumC1430380nKG = EnumC1430380nKG.MV_TEMPLATE;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("sub_type", templateType);
                if (templatePostInfoLIZ != null) {
                    dispatchType = templatePostInfoLIZ.getDispatchType();
                }
                jSONObject2.put("dispatch_type", dispatchType);
                String strJ3 = C786410Ut5.J3(jSONObject2);
                int type = enumC1430380nKG.getTYPE();
                String strJ32 = C786410Ut5.J3(jSONObject);
                ArrayList<EnumC1430380nKG> arrayList = C1429550nIv.LIZ;
                C1429450nIl.LIZ.getClass();
                ((ArrayList) list).add(new CreateAnchorInfo(type, name, "", "", strJ32, C1429550nIv.LIZ(enumC1430380nKG, C1429450nIl.LJJIJ()), -1L, strJ3, "", "", templateType, Boolean.TRUE, true, null, null, false, null));
                return;
            }
        } else {
            name = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[addMiscInfoAnchors] : keyword = ");
        sbLIZ.append(name);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }
}
