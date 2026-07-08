package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;

/* JADX INFO: renamed from: X.0VMD, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VMD {
    public static VideoCoverComponent LIZ(String str) {
        if (str != null) {
            return (VideoCoverComponent) GsonProtectorUtils.fromJson(C051M.LIZ, str, VideoCoverComponent.class);
        }
        return null;
    }
}
