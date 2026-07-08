package X;

import com.ss.ugc.android.editor.base.resource.ResourceItem;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ElG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C373880ElG {
    public static final boolean LIZ(ResourceItem resourceItem) {
        String strOptString;
        String str = resourceItem.extra;
        if (str != null) {
            if (!a0.LJJJIL(str)) {
                strOptString = new JSONObject(str).optString("model_type");
            } else {
                strOptString = "";
            }
        } else {
            strOptString = null;
        }
        return Intrinsics.LJFF(strOptString, "blend");
    }

    public static final boolean LIZIZ(ResourceItem resourceItem) {
        String strOptString;
        String str = resourceItem.extra;
        if (str != null) {
            if (!a0.LJJJIL(str)) {
                strOptString = new JSONObject(str).optString("brush_type");
            } else {
                strOptString = "";
            }
        } else {
            strOptString = null;
        }
        return Intrinsics.LJFF(strOptString, "circle");
    }

    public static final boolean LIZJ(ResourceItem resourceItem) {
        String str = resourceItem.extra;
        if (str != null && (!a0.LJJJIL(str))) {
            return Intrinsics.LJFF(new JSONObject(str).optString("is_chroma"), "true");
        }
        return false;
    }

    public static final boolean LIZLLL(ResourceItem resourceItem) {
        String strOptString;
        String str = resourceItem.extra;
        if (str != null) {
            if (!a0.LJJJIL(str)) {
                strOptString = new JSONObject(str).optString("model_type");
            } else {
                strOptString = "";
            }
        } else {
            strOptString = null;
        }
        return Intrinsics.LJFF(strOptString, "interactive");
    }

    public static final boolean LJ(ResourceItem resourceItem) {
        String strOptString;
        String str = resourceItem.extra;
        if (str != null) {
            if (!a0.LJJJIL(str)) {
                strOptString = new JSONObject(str).optString("brush_type");
            } else {
                strOptString = "";
            }
        } else {
            strOptString = null;
        }
        return Intrinsics.LJFF(strOptString, "normal");
    }

    public static final boolean LJFF(ResourceItem resourceItem) {
        String strOptString;
        String str = resourceItem.extra;
        if (str != null) {
            if (!a0.LJJJIL(str)) {
                strOptString = new JSONObject(str).optString("model_type");
            } else {
                strOptString = "";
            }
        } else {
            strOptString = null;
        }
        return Intrinsics.LJFF(strOptString, "tracking");
    }
}
