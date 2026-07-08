package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hEv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1196430hEv extends AbstractC1196450hEx {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        String containerID;
        ArrayList<String> arrayList;
        JSONObject json;
        JSONObject json2;
        InterfaceC1196440hEw interfaceC1196440hEw = (InterfaceC1196440hEw) xBaseParamModel;
        List<String> descriptionList = interfaceC1196440hEw.getDescriptionList();
        List<Object> images = interfaceC1196440hEw.getImages();
        Number index = interfaceC1196440hEw.getIndex();
        interfaceC1196440hEw.getLoop();
        interfaceC1196440hEw.getNeedDownload();
        interfaceC1196440hEw.getOpenType();
        interfaceC1196440hEw.getStyle();
        Boolean needReport = interfaceC1196440hEw.getNeedReport();
        List<String> imageIds = interfaceC1196440hEw.getImageIds();
        String uid = interfaceC1196440hEw.getUid();
        Map<String, Object> trackParams = interfaceC1196440hEw.getTrackParams();
        Map<String, Object> poiBizInfo = interfaceC1196440hEw.getPoiBizInfo();
        InterfaceC1196420hEu bottomButton = interfaceC1196440hEw.getBottomButton();
        Iterator<String> it2 = descriptionList.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        Iterator<Object> it3 = images.iterator();
        while (it3.hasNext()) {
            it3.next();
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        ArrayList<String> arrayList2 = null;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID = interfaceC634840OvC2.getContainerID();
        } else {
            containerID = null;
        }
        InterfaceC1196460hEy interfaceC1196460hEy = (InterfaceC1196460hEy) C1909107dp.LIZJ(InterfaceC1196460hEy.class, containerID);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://poi/gallery");
        smartRouteBuildRoute.withParamStringList("poi_gallery_images", (ArrayList) images);
        smartRouteBuildRoute.withParam("poi_gallery_index", index);
        smartRouteBuildRoute.withParam("poi_gallery_need_report", needReport);
        if (imageIds instanceof ArrayList) {
            arrayList = (ArrayList) imageIds;
        } else {
            arrayList = null;
        }
        smartRouteBuildRoute.withParamStringList("poi_gallery_image_ids", arrayList);
        smartRouteBuildRoute.withParam("poi_gallery_uid", uid);
        smartRouteBuildRoute.withParam("poi_track_params", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), trackParams));
        smartRouteBuildRoute.withParam("poi_biz_info", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), poiBizInfo));
        if (bottomButton != null) {
            json = bottomButton.toJSON();
        } else {
            json = null;
        }
        smartRouteBuildRoute.withParam("bottom_button", String.valueOf(json));
        InterfaceC1196470hEz customLynxData = interfaceC1196440hEw.getCustomLynxData();
        if (customLynxData != null) {
            json2 = customLynxData.toJSON();
        } else {
            json2 = null;
        }
        smartRouteBuildRoute.withParam("lynx_view_data", String.valueOf(json2));
        smartRouteBuildRoute.withParam("disable_audience_focus", interfaceC1196440hEw.getDisableAudienceFocus());
        List<String> thumbnailUrls = interfaceC1196440hEw.getThumbnailUrls();
        if (thumbnailUrls instanceof ArrayList) {
            arrayList2 = (ArrayList) thumbnailUrls;
        }
        smartRouteBuildRoute.withParamStringList("thumbnail_urls", arrayList2);
        smartRouteBuildRoute.open();
        interfaceC1196460hEy.setCode(1);
        completionBlock.onSuccess(interfaceC1196460hEy, "");
    }
}
