package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.149H, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C149H extends AbstractC202165148l {
    public String LLIZ;
    public String LLIZLLLIL;

    public C149H() {
        this(null, null);
    }

    @Override // X.AbstractC202165148l
    public int getEventLimits() {
        return 6000;
    }

    @Override // X.AbstractC202165148l
    public String getServiceType() {
        return "twice_verify";
    }

    @Override // X.AbstractC202165148l
    public int getType() {
        return 7;
    }

    public final String getMobile() {
        return this.LLIZLLLIL;
    }

    public final String getVerifyTicket() {
        return this.LLIZ;
    }

    @Override // X.AbstractC202165148l
    public void buildUrl(StringBuilder sb) {
        C148N.LIZIZ(sb, "decision_config", "block-sms");
        C148N.LIZ(sb, "is_turing", 1);
        if (!TextUtils.isEmpty(this.LLIZ)) {
            C148N.LIZIZ(sb, "verify_ticket", this.LLIZ);
        }
        if (!TextUtils.isEmpty(this.LLIZLLLIL)) {
            C148N.LIZIZ(sb, "show_mobile", this.LLIZLLLIL);
        }
        C148N.LIZ(sb, "use_turing_bridge", 1);
    }

    public final void setMobile(String str) {
        this.LLIZLLLIL = str;
    }

    public final void setVerifyTicket(String str) {
        this.LLIZ = str;
    }

    public C149H(String str, String str2) {
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
    }
}
