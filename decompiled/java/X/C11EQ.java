package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.11EQ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11EQ extends AbstractC663390Q0j {
    public String LLILLJJLI = "discovery";
    public int LLILLL;
    public String LLILZ;
    public String LLILZIL;

    @Override // X.AbstractC663390Q0j
    public HashMap<String, String> buildParams() {
        appendParam("banner_id", this.LLILZ, InterfaceC1210900hcG.LIZIZ);
        String str = this.LLILLJJLI;
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        appendParam("enter_from", str, c2082308Dt);
        appendParam("tag_id", this.LLILZIL, c2082308Dt);
        appendParam("client_order", String.valueOf(this.LLILLL), c2082308Dt);
        return this.LL;
    }

    public C11EQ setBannerId(String str) {
        this.LLILZ = str;
        return this;
    }

    public C11EQ setClientOrder(int i) {
        this.LLILLL = i;
        return this;
    }

    public C11EQ setEnterFrom(String str) {
        this.LLILLJJLI = str;
        return this;
    }

    public C11EQ setTagId(String str) {
        this.LLILZIL = str;
        return this;
    }
}
