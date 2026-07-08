package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0nvO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1453400nvO {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public EnumC1453440nvS LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;

    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("iType", this.LIZ.getValue());
        jSONObject.put("author_username", this.LIZIZ);
        jSONObject.put("caption_text", this.LIZJ);
        jSONObject.put("use_rtl", this.LIZLLL);
        jSONObject.put("author_avatar_image_path", this.LJ);
        jSONObject.put("font_color_inner", this.LJFF);
        jSONObject.put("font_color_outer", this.LJI);
        jSONObject.put("bg_color", this.LJII);
        return jSONObject;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CanvasParam(iType=");
        sbLIZ.append(this.LIZ.getValue());
        sbLIZ.append(", authorUserName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", captionText='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("', useRTL=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", authorAvatarPath='");
        sbLIZ.append(this.LJ);
        sbLIZ.append("', fontColorInner='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append("', fontColorOuter='");
        sbLIZ.append(this.LJI);
        sbLIZ.append("', bgColor='");
        sbLIZ.append(this.LJII);
        sbLIZ.append("')");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1453400nvO(EnumC1453440nvS enumC1453440nvS, String str, String str2, boolean z, String str3, String str4, String str5, String str6) {
        this.LIZ = enumC1453440nvS;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = z;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = str5;
        this.LJII = str6;
    }
}
