package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.149F, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C149F extends AbstractC202165148l {
    public String LLIZ;
    public String LLIZLLLIL;
    public String LLJ;

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
        return 6;
    }

    public C149F() {
        this("", "", "");
    }

    public final String getChannelMobile() {
        return this.LLIZLLLIL;
    }

    public final String getSmsContent() {
        return this.LLJ;
    }

    public final String getVerifyTicket() {
        return this.LLIZ;
    }

    @Override // X.AbstractC202165148l
    public void buildUrl(StringBuilder sb) {
        C148N.LIZIZ(sb, "decision_config", "block-upsms");
        C148N.LIZ(sb, "is_turing", 1);
        if (!TextUtils.isEmpty(this.LLIZ)) {
            C148N.LIZIZ(sb, "verify_ticket", this.LLIZ);
        }
        C148N.LIZIZ(sb, "channel_mobile", this.LLIZLLLIL);
        C148N.LIZIZ(sb, "sms_content", this.LLJ);
        C148N.LIZ(sb, "use_turing_bridge", 1);
    }

    public final void setChannelMobile(String str) {
        this.LLIZLLLIL = str;
    }

    public final void setSmsContent(String str) {
        this.LLJ = str;
    }

    public final void setVerifyTicket(String str) {
        this.LLIZ = str;
    }

    public C149F(String str, String str2, String str3) {
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
        this.LLJ = str3;
    }
}
