package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0DzG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357080DzG {
    public static final boolean LIZ(ResourceItem resourceItem) {
        String str = resourceItem.extra;
        boolean zLJFF = false;
        if (str == null) {
            return false;
        }
        try {
            zLJFF = Intrinsics.LJFF(new JSONObject(str).optString("GamePlayResourceSubType"), "I2V");
            return zLJFF;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return zLJFF;
        }
    }
}
