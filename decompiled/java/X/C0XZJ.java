package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XZJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XZJ extends Throwable {
    public final int LL;
    public final String LLILLJJLI;
    public final EnumC852660Xce LLILLL;
    public final EnumC852910Xd3 LLILZ;
    public JSONObject LLILZIL;
    public final String LLILZLL;
    public static final C0XYG Companion = new C0XYG();
    public static final int $stable = 8;

    public final String getDetailErrorMsg() {
        return this.LLILZLL;
    }

    public final int getErrorCode() {
        return this.LL;
    }

    public final String getErrorMsg() {
        return this.LLILLJJLI;
    }

    public final JSONObject getExtra() {
        return this.LLILZIL;
    }

    public final EnumC852660Xce getScene() {
        return this.LLILLL;
    }

    public final EnumC852910Xd3 getStep() {
        return this.LLILZ;
    }

    public final void setExtra(JSONObject jSONObject) {
        this.LLILZIL = jSONObject;
    }

    public C0XZJ(int i, String str, EnumC852660Xce enumC852660Xce, EnumC852910Xd3 enumC852910Xd3, JSONObject jSONObject, String str2) {
        super(str);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = enumC852660Xce;
        this.LLILZ = enumC852910Xd3;
        this.LLILZIL = jSONObject;
        this.LLILZLL = str2;
    }
}
