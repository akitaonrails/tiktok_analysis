package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.IDLXDynamic;
import com.tts.oecverify.BdTuring;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07oP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1974707oP {
    public static final Object LIZ(IDLXDynamic iDLXDynamic) {
        switch (C2204641BQg.LIZ[iDLXDynamic.getType().ordinal()]) {
            case 1:
                return iDLXDynamic.asString();
            case 2:
                return Double.valueOf(iDLXDynamic.asDouble());
            case 3:
                return Boolean.valueOf(iDLXDynamic.asBoolean());
            case 4:
                return Long.valueOf(iDLXDynamic.asLong());
            case 5:
                return Integer.valueOf(iDLXDynamic.asInt());
            case 6:
                return iDLXDynamic.asMap();
            case 7:
                return iDLXDynamic.asArray();
            case 8:
                return iDLXDynamic.asByteArray();
            case BdTuring.TYPE_ECAF /* 9 */:
                return null;
            default:
                throw new C1954807lC();
        }
    }

    public static final Object LIZIZ(IDLXDynamic iDLXDynamic) {
        switch (C2204641BQg.LIZ[iDLXDynamic.getType().ordinal()]) {
            case 1:
                return iDLXDynamic.asString();
            case 2:
                return Double.valueOf(iDLXDynamic.asDouble());
            case 3:
                return Boolean.valueOf(iDLXDynamic.asBoolean());
            case 4:
                return Long.valueOf(iDLXDynamic.asLong());
            case 5:
                return Integer.valueOf(iDLXDynamic.asInt());
            case 6:
                return C1906407dO.LIZIZ(iDLXDynamic.asMap());
            case 7:
                return C1906407dO.LIZ(iDLXDynamic.asArray());
            case 8:
                return iDLXDynamic.asByteArray();
            case BdTuring.TYPE_ECAF /* 9 */:
                return JSONObject.NULL;
            default:
                throw new C1954807lC();
        }
    }
}
