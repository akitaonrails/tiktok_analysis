package X;

import com.bytedance.im.core.proto.UrlStruct;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

/* JADX INFO: renamed from: X.0Zdk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C904300Zdk {
    public static final UrlModel LIZ(UrlStruct urlStruct) {
        int iLIZIZ;
        int iLIZIZ2;
        long jIntValue;
        UrlModel urlModel = new UrlModel();
        String str = urlStruct.uri;
        if (str == null) {
            str = "";
        }
        urlModel.setUri(str);
        List<String> list = urlStruct.url_list;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        urlModel.setUrlList(list);
        Integer num = urlStruct.width;
        if (num != null) {
            iLIZIZ = num.intValue();
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
        }
        urlModel.setWidth(iLIZIZ);
        Integer num2 = urlStruct.height;
        if (num2 != null) {
            iLIZIZ2 = num2.intValue();
        } else {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
        }
        urlModel.setHeight(iLIZIZ2);
        Integer num3 = urlStruct.data_size;
        if (num3 != null) {
            jIntValue = num3.intValue();
        } else {
            jIntValue = 0;
        }
        urlModel.setSize(jIntValue);
        return urlModel;
    }
}
