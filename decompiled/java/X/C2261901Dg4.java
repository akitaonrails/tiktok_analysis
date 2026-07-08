package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.livesdk.model.Author;
import java.io.IOException;

/* JADX INFO: renamed from: X.1Dg4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261901Dg4 implements InterfaceC2183511Acv<Author> {
    public static Author LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        Author author = new Author();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                int iHashCode = strNextName.hashCode();
                if (iHashCode != -1174262709) {
                    if (iHashCode != -869006493) {
                        if (iHashCode == 381984400 && strNextName.equals("video_total_count")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                author.videoTotalCount = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                    } else if (strNextName.equals("video_total_play_count")) {
                        if (jsonReader.peek() != JsonToken.NULL) {
                            author.videoTotalPlayCount = jsonReader.nextLong();
                        } else {
                            jsonReader.nextNull();
                        }
                    }
                } else if (strNextName.equals("video_total_favorite_count")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        author.videoTotalFavoriteCount = jsonReader.nextLong();
                    } else {
                        jsonReader.nextNull();
                    }
                }
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return author;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ Author LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
