package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: renamed from: X.0jm6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1293880jm6 {
    public abstract long LIZIZ();

    public static C0WDM LIZ(Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        C0WDM c0wdm = new C0WDM(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return c0wdm;
                    }
                    C0WDM c0wdm2 = new C0WDM(jsonReader.nextLong());
                    jsonReader.close();
                    return c0wdm2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            jsonReader.close();
            throw th;
        }
    }
}
