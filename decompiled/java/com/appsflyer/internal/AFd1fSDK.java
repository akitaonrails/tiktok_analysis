package com.appsflyer.internal;

import android.util.Base64;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class AFd1fSDK {
    public static final AFa1vSDK AFa1vSDK = new AFa1vSDK(null);
    public final String AFInAppEventType;
    public final String AFKeystoreWrapper;
    public int valueOf;
    public final String values;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFd1fSDK)) {
            return false;
        }
        AFd1fSDK aFd1fSDK = (AFd1fSDK) obj;
        return Intrinsics.LJFF(this.AFKeystoreWrapper, aFd1fSDK.AFKeystoreWrapper) && Intrinsics.LJFF(this.values, aFd1fSDK.values) && Intrinsics.LJFF(this.AFInAppEventType, aFd1fSDK.AFInAppEventType) && this.valueOf == aFd1fSDK.valueOf;
    }

    public final int hashCode() {
        return (((((this.AFKeystoreWrapper.hashCode() * 31) + this.values.hashCode()) * 31) + this.AFInAppEventType.hashCode()) * 31) + this.valueOf;
    }

    public final String toString() {
        return "AFd1fSDK(values=" + this.AFKeystoreWrapper + ", AFKeystoreWrapper=" + this.values + ", AFInAppEventType=" + this.AFInAppEventType + ", AFInAppEventParameterName=" + this.valueOf + ')';
    }

    public final JSONObject AFKeystoreWrapper() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", this.AFKeystoreWrapper);
        jSONObject.put("hash_name", this.values);
        jSONObject.put("st", this.AFInAppEventType);
        jSONObject.put("c", String.valueOf(this.valueOf));
        return jSONObject;
    }

    public static final class AFa1vSDK {
        public AFa1vSDK() {
        }

        public /* synthetic */ AFa1vSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static AFd1fSDK valueOf(String str) {
            List<String> listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"\n"}, 0, 6);
            if (listLJJLIIIJILLIZJL.size() != 4) {
                return null;
            }
            String strAFInAppEventType = null;
            String strAFInAppEventType2 = null;
            String strAFInAppEventType3 = null;
            Integer numValueOf = null;
            for (String str2 : listLJJLIIIJILLIZJL) {
                if (u.LJJIIJZLJL(str2, "label=", false)) {
                    strAFInAppEventType = AFInAppEventType(str2, "label=");
                } else if (u.LJJIIJZLJL(str2, "hashName=", false)) {
                    strAFInAppEventType2 = AFInAppEventType(str2, "hashName=");
                } else if (u.LJJIIJZLJL(str2, "stackTrace=", false)) {
                    strAFInAppEventType3 = AFInAppEventType(str2, "stackTrace=");
                } else {
                    if (!u.LJJIIJZLJL(str2, "c=", false)) {
                        break;
                    }
                    numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(a0.LJLIIIL(str2.substring(2)).toString()));
                }
            }
            if (AFInAppEventType(numValueOf, strAFInAppEventType, strAFInAppEventType2, strAFInAppEventType3)) {
                return null;
            }
            return new AFd1fSDK(strAFInAppEventType, strAFInAppEventType2, strAFInAppEventType3, numValueOf.intValue());
        }

        public static String AFInAppEventType(String str, String str2) {
            String string = a0.LJLIIIL(str.substring(str2.length())).toString();
            Charset charset = Charsets.UTF_8;
            return new String(Base64.decode(string.getBytes(charset), 2), charset);
        }

        public static boolean AFInAppEventType(Integer num, String... strArr) {
            boolean z;
            if (num == null) {
                z = true;
            } else {
                z = false;
            }
            int i = 0;
            do {
                String str = strArr[i];
                if (!z && str != null && str.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                i++;
            } while (i < 3);
            return z;
        }
    }

    public AFd1fSDK(String str, String str2, String str3, int i) {
        this.AFKeystoreWrapper = str;
        this.values = str2;
        this.AFInAppEventType = str3;
        this.valueOf = i;
    }

    public /* synthetic */ AFd1fSDK(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? 1 : i);
    }
}
