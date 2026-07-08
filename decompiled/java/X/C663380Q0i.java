package X;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Q0i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C663380Q0i extends AbstractC663390Q0j {
    public int LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;

    @Override // X.AbstractC663390Q0j
    public HashMap<String, String> buildParams() {
        String strValueOf = String.valueOf(this.LLILLJJLI);
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        appendParam("order", strValueOf, c2082308Dt);
        appendParam("search_keyword", this.LLILLL, c2082308Dt);
        appendParam("enter_from", this.LLILZIL, c2082308Dt);
        appendParam("enter_method", this.LLILZLL, c2082308Dt);
        if (!TextUtils.isEmpty(this.LLIZ)) {
            appendParam("search_result_id", this.LLIZ, c2082308Dt);
        }
        if (!TextUtils.isEmpty(this.LLIZLLLIL)) {
            appendParam("list_item_id", this.LLIZLLLIL, c2082308Dt);
        }
        if (!TextUtils.isEmpty(this.LLILZ)) {
            appendParam("request_id", this.LLILZ, c2082308Dt);
            appendParam("log_pb", C584850Mwl.LIZ.LIZIZ(this.LLILZ), c2082308Dt);
        }
        return this.LL;
    }

    public C663380Q0i setEnterFrom(String str) {
        this.LLILZIL = str;
        return this;
    }

    public C663380Q0i setEnterMethod(String str) {
        this.LLILZLL = str;
        return this;
    }

    public C663380Q0i setListItemId(String str) {
        this.LLIZLLLIL = str;
        return this;
    }

    public C663380Q0i setOrder(int i) {
        this.LLILLJJLI = i;
        return this;
    }

    public C663380Q0i setRid(String str) {
        this.LLILZ = str;
        return this;
    }

    public C663380Q0i setSearchKeyword(String str) {
        this.LLILLL = str;
        return this;
    }

    public C663380Q0i setSearchResultId(String str) {
        this.LLIZ = str;
        return this;
    }
}
