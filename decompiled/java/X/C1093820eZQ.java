package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eZQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1093820eZQ {
    public static final Object LIZ(Object obj, String str) {
        String lowerCase;
        Object obj2;
        double d;
        long j;
        if (obj == null) {
            return null;
        }
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
        } else {
            lowerCase = null;
        }
        C1093860eZU c1093860eZU = new AbstractC1093830eZR() { // from class: X.0eZU
        };
        if (Intrinsics.LJFF(lowerCase, "string")) {
            obj2 = c1093860eZU;
        } else {
            obj2 = new AbstractC1093830eZR() { // from class: X.0eZT
            };
            if (!Intrinsics.LJFF(lowerCase, "int")) {
                obj2 = new AbstractC1093830eZR() { // from class: X.0eZS
                };
                if (!Intrinsics.LJFF(lowerCase, "float")) {
                    obj2 = new AbstractC1093830eZR() { // from class: X.0eZV
                    };
                }
            }
        }
        if (Intrinsics.LJFF(obj2, c1093860eZU)) {
            if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    return "1";
                }
                return CardStruct.IStatusCode.DEFAULT;
            }
            if (obj instanceof JSONObject) {
                return C786410Ut5.J3((JSONObject) obj);
            }
            if (obj instanceof JSONArray) {
                return null;
            }
            return obj.toString();
        }
        if (Intrinsics.LJFF(obj2, new AbstractC1093830eZR() { // from class: X.0eZT
        })) {
            if (obj instanceof Number) {
                return Long.valueOf(((Number) obj).longValue());
            }
            if (obj instanceof String) {
                return C2095008Iq.LJIILIIL((String) obj);
            }
            if (!(obj instanceof Boolean)) {
                return null;
            }
            if (((Boolean) obj).booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            return Long.valueOf(j);
        }
        if (Intrinsics.LJFF(obj2, new AbstractC1093830eZR() { // from class: X.0eZS
        })) {
            if (obj instanceof Number) {
                return Double.valueOf(((Number) obj).doubleValue());
            }
            if (obj instanceof String) {
                return C2327809Ae.LJII((String) obj);
            }
            if (!(obj instanceof Boolean)) {
                return null;
            }
            if (((Boolean) obj).booleanValue()) {
                d = 1.0d;
            } else {
                d = 0.0d;
            }
            return Double.valueOf(d);
        }
        if (Intrinsics.LJFF(obj2, new AbstractC1093830eZR() { // from class: X.0eZV
        })) {
            return null;
        }
        throw new C1954807lC();
    }
}
