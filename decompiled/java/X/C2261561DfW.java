package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import java.io.IOException;

/* JADX INFO: renamed from: X.1DfW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261561DfW implements InterfaceC2183511Acv<PrivilegeLogExtra> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static PrivilegeLogExtra LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        PrivilegeLogExtra privilegeLogExtra = new PrivilegeLogExtra();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -1573145462:
                        if (strNextName.equals("start_time")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                privilegeLogExtra.startTime = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1078447750:
                        if (strNextName.equals("privilege_order_id")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                privilegeLogExtra.privilege_order_id = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -739561111:
                        if (strNextName.equals("privilege_id")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                privilegeLogExtra.privilege_id = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -322541245:
                        if (strNextName.equals("data_version")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                privilegeLogExtra.data_version = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -277186230:
                        if (strNextName.equals("privilege_version")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                privilegeLogExtra.privilege_version = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 102865796:
                        if (strNextName.equals("level")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                privilegeLogExtra.level = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1725551537:
                        if (strNextName.equals("end_time")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                privilegeLogExtra.endTime = jsonReader.nextLong();
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
        return privilegeLogExtra;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ PrivilegeLogExtra LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
