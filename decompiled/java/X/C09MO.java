package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09MO, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09MO implements Serializable {
    public static final long serialVersionUID = -6027923654002990158L;
    public final transient boolean LL;
    public String LLILLJJLI;
    public volatile boolean mDownloaded;
    public int mHeight;
    public boolean mIsGif;
    public boolean mIsVideo;
    public String mKey;
    public boolean mNeedAlpha;
    public String mOpenUrl;
    public String mUri;
    public String mUrlList;
    public int mWidth;

    public boolean isValid() {
        return this.mWidth > 0 && this.mHeight > 0 && !TextUtils.isEmpty(this.mUri) && !TextUtils.isEmpty(this.mUrlList);
    }

    public JSONObject toJsonObj() {
        if (TextUtils.isEmpty(this.mUri)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uri", this.mUri);
            jSONObject.put("width", this.mWidth);
            jSONObject.put("height", this.mHeight);
            String str = this.mOpenUrl;
            if (str != null) {
                jSONObject.put("open_url", str);
            }
            if (!TextUtils.isEmpty(this.mUrlList)) {
                try {
                    jSONObject.put("url_list", new JSONArray(this.mUrlList));
                    return jSONObject;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            return jSONObject;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public String getExtraKey() {
        return this.LLILLJJLI;
    }

    public boolean isFixedDisplaySize() {
        return this.LL;
    }

    public static C09MO fromJsonStr(String str) {
        return fromJsonStr(str, true);
    }

    public static boolean isHttpUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!str.startsWith("http://") && !str.startsWith("https://")) {
            return false;
        }
        return true;
    }

    public static JSONArray toJsonArray(List<C09MO> list) {
        if (list != null && list.size() != 0) {
            JSONArray jSONArray = new JSONArray();
            Iterator<C09MO> it2 = list.iterator();
            while (it2.hasNext()) {
                JSONObject jsonObj = it2.next().toJsonObj();
                if (jsonObj != null) {
                    jSONArray.put(jsonObj);
                }
            }
            return jSONArray;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C09MO.class != obj.getClass()) {
            return false;
        }
        C09MO c09mo = (C09MO) obj;
        if (this.mWidth != c09mo.mWidth || this.mHeight != c09mo.mHeight || this.mIsGif != c09mo.mIsGif || this.mDownloaded != c09mo.mDownloaded || this.mIsVideo != c09mo.mIsVideo || this.LL != c09mo.LL) {
            return false;
        }
        String str = this.mUri;
        if (str != null) {
            if (!str.equals(c09mo.mUri)) {
                return false;
            }
        } else if (c09mo.mUri != null) {
            return false;
        }
        String str2 = this.mOpenUrl;
        if (str2 != null) {
            if (!str2.equals(c09mo.mOpenUrl)) {
                return false;
            }
        } else if (c09mo.mOpenUrl != null) {
            return false;
        }
        String str3 = this.mUrlList;
        if (str3 != null) {
            if (!str3.equals(c09mo.mUrlList)) {
                return false;
            }
        } else if (c09mo.mUrlList != null) {
            return false;
        }
        String str4 = this.LLILLJJLI;
        if (str4 != null) {
            if (!str4.equals(c09mo.LLILLJJLI)) {
                return false;
            }
        } else if (c09mo.LLILLJJLI != null) {
            return false;
        }
        String str5 = this.mKey;
        String str6 = c09mo.mKey;
        if (str5 != null) {
            if (str5.equals(str6)) {
                return true;
            }
        } else if (str6 == null) {
            return true;
        }
        return false;
    }

    public void setExtraKey(String str) {
        this.LLILLJJLI = str;
    }

    public C09MO(String str, String str2) {
        this(str, str2, 0, 0, false);
    }

    public static List<C09MP> extractImageUrlList(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str2)) {
            try {
                JSONArray jSONArray = new JSONArray(str2);
                int length = jSONArray.length();
                if (length > 3) {
                    length = 3;
                }
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                    String string = JSONObjectProtectorUtils.getString(jSONObject, "url");
                    if (!TextUtils.isEmpty(string)) {
                        C09MP c09mp = new C09MP(string);
                        arrayList.add(c09mp);
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
                        if (jSONObjectOptJSONObject != null) {
                            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                String string2 = JSONObjectProtectorUtils.getString(jSONObjectOptJSONObject, next);
                                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string2)) {
                                    ((ArrayList) c09mp.LIZIZ).add(new C2259691DcV(next, string2));
                                }
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (arrayList.isEmpty() && !TextUtils.isEmpty(str) && isHttpUrl(str.toLowerCase(Locale.ENGLISH))) {
            arrayList.add(new C09MP(str));
        }
        return arrayList;
    }

    public static C09MO fromJson(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("uri");
        String strOptString2 = jSONObject.optString("url_list");
        int iOptInt = jSONObject.optInt("width");
        int iOptInt2 = jSONObject.optInt("height");
        int iOptInt3 = jSONObject.optInt("r_width", -1);
        int iOptInt4 = jSONObject.optInt("r_height", -1);
        if (iOptInt3 != -1) {
            iOptInt = iOptInt3;
        }
        if (iOptInt4 != -1) {
            iOptInt2 = iOptInt4;
        }
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        if (z && (iOptInt <= 0 || iOptInt2 <= 0)) {
            return null;
        }
        C09MO c09mo = new C09MO(strOptString, strOptString2, iOptInt, iOptInt2);
        c09mo.mOpenUrl = jSONObject.optString("open_url", null);
        c09mo.mIsGif = jSONObject.optBoolean("is_gif");
        return c09mo;
    }

    public static C09MO fromJsonStr(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return fromJson(new JSONObject(str), z);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static String getUrlFromImageInfo(C09MO c09mo, boolean z) {
        String str;
        if (c09mo == null) {
            return null;
        }
        if (z) {
            str = c09mo.mUri;
        } else {
            str = null;
        }
        List<C09MP> listExtractImageUrlList = extractImageUrlList(str, c09mo.mUrlList);
        if (listExtractImageUrlList == null || listExtractImageUrlList.size() <= 0) {
            return null;
        }
        return ((C09MP) ListProtector.get(listExtractImageUrlList, 0)).LIZ;
    }

    public static ArrayList<C09MO> optImageList(JSONArray jSONArray, boolean z) {
        C09MO c09moFromJson;
        ArrayList<C09MO> arrayList = null;
        if (jSONArray != null && jSONArray.length() != 0) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && (c09moFromJson = fromJson(jSONObjectOptJSONObject, z)) != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(c09moFromJson);
                }
            }
        }
        return arrayList;
    }

    public static List<C09MO> parseImageList(JSONArray jSONArray, boolean z) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            C09MO c09moFromJson = fromJson(jSONArray.optJSONObject(i), z);
            if (c09moFromJson != null) {
                arrayList.add(c09moFromJson);
            }
        }
        return arrayList;
    }

    public static ArrayList<C09MO> optImageList(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject != null && str != null && str.length() != 0 && jSONObject.has(str)) {
            return optImageList(jSONObject.optJSONArray(str), z);
        }
        return null;
    }

    public C09MO(String str, String str2, int i, int i2) {
        this(str, str2, i, i2, false);
    }

    public C09MO(String str, String str2, int i, int i2, boolean z) {
        this.mUri = str;
        this.mUrlList = str2;
        this.mKey = C08HM.LIZJ(str);
        this.mWidth = i;
        this.mHeight = i2;
        if (i > 0 && i2 > 0) {
            this.LL = z;
        }
    }
}
