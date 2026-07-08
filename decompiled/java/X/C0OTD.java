package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinHybridCardConfigStruct;

/* JADX INFO: renamed from: X.0OTD, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OTD {
    public static int LIZ(BulletinHybridCardConfigStruct bulletinHybridCardConfigStruct) {
        float fLIZIZ;
        Integer num = bulletinHybridCardConfigStruct.dynamicHeight;
        if (num != null) {
            fLIZIZ = C418440Gaw.LIZIZ(num);
        } else {
            int i = bulletinHybridCardConfigStruct.defaultHeight;
            if (i == null) {
                i = 173;
            }
            fLIZIZ = C418440Gaw.LIZIZ(i);
        }
        return C814420VxA.LIZIZ(fLIZIZ);
    }

    public static int LIZIZ(BulletinHybridCardConfigStruct bulletinHybridCardConfigStruct) {
        float fLIZIZ;
        Integer num = bulletinHybridCardConfigStruct.dynamicWidth;
        if (num != null) {
            fLIZIZ = C418440Gaw.LIZIZ(num);
        } else {
            int i = bulletinHybridCardConfigStruct.defaultWidth;
            if (i == null) {
                i = 220;
            }
            fLIZIZ = C418440Gaw.LIZIZ(i);
        }
        return C814420VxA.LIZIZ(fLIZIZ);
    }
}
