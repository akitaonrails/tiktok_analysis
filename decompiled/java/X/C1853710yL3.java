package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0yL3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1853710yL3 implements Serializable {
    public static final int $stable = 8;
    public final List<BaseImage> images;
    public final Integer inspirationTabType;
    public final Map<String, String> mobParamsMap;
    public final String sendText;
    public final C1853460yKe templateItem;

    public C1853710yL3() {
        this(null, null, null, null, null);
    }

    public C1853710yL3(String str, List<BaseImage> list, C1853460yKe c1853460yKe, Map<String, String> map, Integer num) {
        this.sendText = str;
        this.images = list;
        this.templateItem = c1853460yKe;
        this.mobParamsMap = map;
        this.inspirationTabType = num;
    }
}
