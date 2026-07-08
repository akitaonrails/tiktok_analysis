package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;

/* JADX INFO: renamed from: X.0XIR, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XIR extends C23112093u {
    public static Gson LLIZLLLIL;
    public Object LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public int LLILZLL;
    public String LLIZ;

    public String convertResponseToString() {
        Object obj = this.LLILLJJLI;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (LLIZLLLIL == null) {
            LLIZLLLIL = new Gson();
        }
        String json = GsonProtectorUtils.toJson(LLIZLLLIL, this.LLILLJJLI);
        this.LLILLJJLI = json;
        return json;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (getPath() == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ApiServerException,error code is ");
            sbLIZ.append(getErrorCode());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ApiServerException,error code is ");
        sbLIZ2.append(getErrorCode());
        sbLIZ2.append(";request path :");
        sbLIZ2.append(getPath());
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public String getResponse() {
        return convertResponseToString();
    }

    public int getBlockCode() {
        return this.LLILZLL;
    }

    public String getErrorMsg() {
        return this.LLILLL;
    }

    public String getPath() {
        return this.LLIZ;
    }

    public String getPrompt() {
        return this.LLILZ;
    }

    public Object getRawResponse() {
        return this.LLILLJJLI;
    }

    public String getUrl() {
        return this.LLILZIL;
    }

    public C0XIR(int i) {
        super(i);
    }

    public void setBlockCode(int i) {
        this.LLILZLL = i;
    }

    public C0XIR setErrorMsg(String str) {
        this.LLILLL = str;
        return this;
    }

    public void setPath(String str) {
        this.LLIZ = str;
    }

    public C0XIR setPrompt(String str) {
        this.LLILZ = str;
        return this;
    }

    public C0XIR setResponse(Object obj) {
        this.LLILLJJLI = obj;
        return this;
    }

    public C0XIR setUrl(String str) {
        this.LLILZIL = str;
        return this;
    }

    public C0XIR setResponse(String str) {
        this.LLILLJJLI = str;
        return this;
    }
}
