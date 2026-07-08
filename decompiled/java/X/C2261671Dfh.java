package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.live.base.model.user.ProjectionConfig;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Dfh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261671Dfh implements InterfaceC2183511Acv<ProjectionConfig> {
    public static ProjectionConfig LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        ProjectionConfig projectionConfig = new ProjectionConfig();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (Intrinsics.LJFF(strNextName, "use_projection")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    projectionConfig.useProjection = jsonReader.nextBoolean();
                } else {
                    jsonReader.nextNull();
                }
            } else if (Intrinsics.LJFF(strNextName, "icon")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    projectionConfig.icon = C2261331Df9.LIZIZ(jsonReader);
                } else {
                    jsonReader.nextNull();
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return projectionConfig;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ ProjectionConfig LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
