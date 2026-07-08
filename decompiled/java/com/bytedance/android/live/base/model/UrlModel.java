package com.bytedance.android.live.base.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class UrlModel {

    @C09CT("uri")
    public String uri;

    @C09CT("url_list")
    public List<String> urlList;

    public final ImageModel LIZ() {
        return new ImageModel(this.uri, this.urlList);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UrlStruct{uri='");
        sbLIZ.append(this.uri);
        sbLIZ.append('\'');
        sbLIZ.append(", urlList=");
        sbLIZ.append(this.urlList);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
