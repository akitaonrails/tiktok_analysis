package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.live.base.model.user.IconConfig;
import com.bytedance.android.live.base.model.user.ProfileContent;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Dfe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261641Dfe implements InterfaceC2183511Acv<ProfileContent> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static ProfileContent LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        ProfileContent profileContent = new ProfileContent();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -1390669660:
                        if (strNextName.equals("icon_list")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                profileContent.iconList = C2261301Df6.LIZIZ(jsonReader, new InterfaceC2183511Acv<IconConfig>() { // from class: X.1DfV
                                    @Override // X.InterfaceC2183511Acv
                                    public final IconConfig LIZ(JsonReader jsonReader2) throws IOException {
                                        if (jsonReader2.peek() == JsonToken.NULL) {
                                            return null;
                                        }
                                        IconConfig iconConfig = new IconConfig();
                                        jsonReader2.beginObject();
                                        while (jsonReader2.hasNext()) {
                                            String strNextName2 = jsonReader2.nextName();
                                            if (Intrinsics.LJFF(strNextName2, "icon")) {
                                                if (jsonReader2.peek() != JsonToken.NULL) {
                                                    iconConfig.icon = C2261331Df9.LIZIZ(jsonReader2);
                                                } else {
                                                    jsonReader2.nextNull();
                                                }
                                            } else if (Intrinsics.LJFF(strNextName2, "background")) {
                                                if (jsonReader2.peek() != JsonToken.NULL) {
                                                    iconConfig.background = C2261491DfP.LIZIZ(jsonReader2);
                                                } else {
                                                    jsonReader2.nextNull();
                                                }
                                            } else {
                                                jsonReader2.skipValue();
                                            }
                                        }
                                        jsonReader2.endObject();
                                        return iconConfig;
                                    }
                                });
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -798685459:
                        if (strNextName.equals("label_config")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                profileContent.labelConfig = C2261621Dfc.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -68153096:
                        if (strNextName.equals("number_config")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                profileContent.numberConfig = C2261631Dfd.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 231352769:
                        if (strNextName.equals("use_content")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                profileContent.useContent = jsonReader.nextBoolean();
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
        return profileContent;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ ProfileContent LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
