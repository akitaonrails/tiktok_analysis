package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.livesdk.chatroom.api.TimerDetail;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Dg0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261861Dg0 implements InterfaceC2183511Acv<TimerDetail.AuditInfo> {
    public static TimerDetail.AuditInfo LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        TimerDetail.AuditInfo auditInfo = new TimerDetail.AuditInfo();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (Intrinsics.LJFF(strNextName, "task_type")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    auditInfo.taskType = jsonReader.nextInt();
                } else {
                    jsonReader.nextNull();
                }
            } else if (Intrinsics.LJFF(strNextName, "violation_id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    auditInfo.violationId = jsonReader.nextLong();
                } else {
                    jsonReader.nextNull();
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return auditInfo;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ TimerDetail.AuditInfo LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
