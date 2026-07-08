package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.livesdk.model.FansClubData;
import com.bytedance.android.livesdk.model.FansClubMember;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DfL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261451DfL implements InterfaceC2183511Acv<FansClubMember> {
    public static FansClubMember LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        FansClubMember fansClubMember = new FansClubMember();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (Intrinsics.LJFF(strNextName, "data")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    fansClubMember.data = C2261441DfK.LIZIZ(jsonReader);
                } else {
                    jsonReader.nextNull();
                }
            } else if (Intrinsics.LJFF(strNextName, "prefer_data")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    fansClubMember.preferData = C2261341DfA.LIZIZ(jsonReader, C2261421DfI.LIZ, new InterfaceC2183511Acv<FansClubData>() { // from class: X.1DfK
                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        public static FansClubData LIZIZ(JsonReader jsonReader2) throws IOException {
                            if (jsonReader2.peek() == JsonToken.NULL) {
                                return null;
                            }
                            FansClubData fansClubData = new FansClubData();
                            jsonReader2.beginObject();
                            while (jsonReader2.hasNext()) {
                                String strNextName2 = jsonReader2.nextName();
                                if (strNextName2 != null) {
                                    switch (strNextName2.hashCode()) {
                                        case -61912176:
                                            if (strNextName2.equals("user_fans_club_status")) {
                                                if (jsonReader2.peek() != JsonToken.NULL) {
                                                    fansClubData.userFansClubStatus = jsonReader2.nextInt();
                                                } else {
                                                    jsonReader2.nextNull();
                                                }
                                            }
                                            break;
                                        case -41830683:
                                            if (strNextName2.equals("anchor_id")) {
                                                if (jsonReader2.peek() != JsonToken.NULL) {
                                                    fansClubData.anchorId = jsonReader2.nextLong();
                                                } else {
                                                    jsonReader2.nextNull();
                                                }
                                            }
                                            break;
                                        case 26071007:
                                            if (strNextName2.equals("available_gift_ids")) {
                                                if (jsonReader2.peek() != JsonToken.NULL) {
                                                    fansClubData.availableGiftIds = C2261301Df6.LIZIZ(jsonReader2, C2261421DfI.LIZIZ);
                                                } else {
                                                    jsonReader2.nextNull();
                                                }
                                            }
                                            break;
                                        case 56103028:
                                            if (strNextName2.equals("club_name")) {
                                                if (jsonReader2.peek() != JsonToken.NULL) {
                                                    fansClubData.clubName = jsonReader2.nextString();
                                                } else {
                                                    jsonReader2.nextNull();
                                                }
                                            }
                                            break;
                                        case 93494179:
                                            if (strNextName2.equals("badge")) {
                                                if (jsonReader2.peek() != JsonToken.NULL) {
                                                    fansClubData.badge = C2261431DfJ.LIZIZ(jsonReader2);
                                                } else {
                                                    jsonReader2.nextNull();
                                                }
                                            }
                                            break;
                                        case 102865796:
                                            if (strNextName2.equals("level")) {
                                                if (jsonReader2.peek() != JsonToken.NULL) {
                                                    fansClubData.level = jsonReader2.nextInt();
                                                } else {
                                                    jsonReader2.nextNull();
                                                }
                                            }
                                            break;
                                    }
                                }
                                jsonReader2.skipValue();
                            }
                            jsonReader2.endObject();
                            return fansClubData;
                        }

                        @Override // X.InterfaceC2183511Acv
                        public final /* bridge */ /* synthetic */ FansClubData LIZ(JsonReader jsonReader2) {
                            return LIZIZ(jsonReader2);
                        }
                    });
                } else {
                    jsonReader.nextNull();
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return fansClubMember;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ FansClubMember LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
