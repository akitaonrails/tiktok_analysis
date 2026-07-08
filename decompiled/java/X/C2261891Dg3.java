package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.livesdk.model.AuthenticationInfo;
import java.io.IOException;

/* JADX INFO: renamed from: X.1Dg3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261891Dg3 implements InterfaceC2183511Acv<AuthenticationInfo> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static AuthenticationInfo LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        AuthenticationInfo authenticationInfo = new AuthenticationInfo();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -1554168724:
                        if (strNextName.equals("enterprise_verify_reason")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                authenticationInfo.enterpriseVerifyReason = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1269749988:
                        if (strNextName.equals("authentication_badge")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                authenticationInfo.authenticationBadge = C2261331Df9.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 140329129:
                        if (strNextName.equals("has_cert")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                authenticationInfo.hasCert = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1241278727:
                        if (strNextName.equals("custom_verify")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                authenticationInfo.customVerify = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                }
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return authenticationInfo;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ AuthenticationInfo LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
