package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.live.base.model.ImageModel;
import java.io.IOException;

/* JADX INFO: renamed from: X.1Df9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261331Df9 implements InterfaceC2183511Acv<ImageModel> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static ImageModel LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        ImageModel imageModel = new ImageModel();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -1530233576:
                        if (strNextName.equals("is_animated")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                imageModel.isAnimated = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1442758754:
                        if (strNextName.equals("image_type")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                imageModel.imageType = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1221029593:
                        if (strNextName.equals("height")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                imageModel.height = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -970411666:
                        if (strNextName.equals("url_list")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                imageModel.mUrls = C2261301Df6.LIZIZ(jsonReader, C2261421DfI.LIZJ);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -424403601:
                        if (strNextName.equals("isMonitored")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                imageModel.setMonitored(jsonReader.nextBoolean());
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -423484977:
                        if (strNextName.equals("isLoaded")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                imageModel.setLoaded(jsonReader.nextBoolean());
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 116076:
                        if (strNextName.equals("uri")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                imageModel.mUri = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1976246:
                        if (strNextName.equals("avg_color")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                imageModel.avgColor = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 113126854:
                        if (strNextName.equals("width")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                imageModel.width = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 951530617:
                        if (strNextName.equals("content")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                imageModel.content = C2261271Df3.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1246088326:
                        if (strNextName.equals("sortedUrlsByDomainCache")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                imageModel.sortedUrlsByDomainCache = C2261301Df6.LIZIZ(jsonReader, C2261421DfI.LIZJ);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1396217979:
                        if (strNextName.equals("isFeedCandidate")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                imageModel.setFeedCandidate(jsonReader.nextBoolean());
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1710676239:
                        if (strNextName.equals("open_web_url")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                imageModel.schema = jsonReader.nextString();
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
        return imageModel;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ ImageModel LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
