package X;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.SubSplitStatus;

/* JADX INFO: renamed from: X.1Dfv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261811Dfv implements InterfaceC2183511Acv<SubSplitStatus> {
    public static SubSplitStatus LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        SubSplitStatus subSplitStatus = new SubSplitStatus();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (Intrinsics.LJFF(strNextName, "cur_period")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    subSplitStatus.curPeriod = jsonReader.nextInt();
                } else {
                    jsonReader.nextNull();
                }
            } else if (Intrinsics.LJFF(strNextName, "is_old_sub_creator")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    subSplitStatus.isOldSubCreator = jsonReader.nextBoolean();
                } else {
                    jsonReader.nextNull();
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return subSplitStatus;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ SubSplitStatus LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
