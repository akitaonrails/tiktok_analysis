package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1CsQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2244081CsQ {
    public static final List<String> LIZ(ImageComponent imageComponent) {
        String str = imageComponent.decryptKey;
        if (str != null && str.length() != 0) {
            List<String> list = imageComponent.urls;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (String str2 : list) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append("%%secretKey=");
                sbLIZ.append(imageComponent.decryptKey);
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
            }
            return arrayList;
        }
        return imageComponent.urls;
    }

    public static final IconTypeComponent LIZIZ(EnumC2244051CsN enumC2244051CsN) {
        if (enumC2244051CsN == null) {
            return IconTypeComponent.DEFAULT;
        }
        for (IconTypeComponent iconTypeComponent : IconTypeComponent.values()) {
            if (iconTypeComponent.getValue() == enumC2244051CsN.getValue()) {
                return iconTypeComponent;
            }
        }
        return IconTypeComponent.DEFAULT;
    }

    public static final ImageComponent LIZJ(C2244091CsR c2244091CsR) {
        ResolutionComponent resolutionComponent;
        List<String> list = c2244091CsR.url_list;
        String str = c2244091CsR.image_id;
        String str2 = c2244091CsR.display_name;
        C2244161CsY c2244161CsY = c2244091CsR.resolution;
        if (c2244161CsY != null) {
            Integer num = c2244161CsY.width;
            if (num == null) {
                num = C2244161CsY.DEFAULT_WIDTH;
            }
            int iIntValue = num.intValue();
            Integer num2 = c2244161CsY.height;
            if (num2 == null) {
                num2 = C2244161CsY.DEFAULT_HEIGHT;
            }
            resolutionComponent = new ResolutionComponent(iIntValue, num2.intValue());
        } else {
            resolutionComponent = null;
        }
        return new ImageComponent(list, str, str2, resolutionComponent, c2244091CsR.decrypt_key, LIZIZ(c2244091CsR.fallback_icon_type));
    }

    public static final UrlModel LIZLLL(ImageComponent imageComponent) {
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(imageComponent.urls);
        ResolutionComponent resolutionComponent = imageComponent.resolution;
        if (resolutionComponent != null) {
            urlModel.setWidth(resolutionComponent.width);
            urlModel.setHeight(resolutionComponent.height);
        }
        return urlModel;
    }
}
