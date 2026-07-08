package X;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: X.10Vn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19257310Vn implements Serializable {
    public boolean LLILLL;
    public boolean LLILZIL;
    public int LLILZLL;
    public String LL = "age_scroll_result";
    public Map<String, String> LLILLJJLI = new LinkedHashMap();
    public Locale LLILZ = Locale.ROOT;
    public boolean LLIZ = true;
    public int LLIZLLLIL = EnumC19256910Vj.NONE.getValue();
    public EnumC19257610Vq LLJ = EnumC19257610Vq.REGISTRATION;
    public boolean LLJI = true;

    public final int getBirthdayConfidence() {
        return this.LLILZLL;
    }

    public final int getConfirmationType() {
        return this.LLIZLLLIL;
    }

    public final String getEventNameScrollResults() {
        return this.LL;
    }

    public final boolean getHasTransitionAnimation() {
        return this.LLIZ;
    }

    public final Locale getLocale() {
        return this.LLILZ;
    }

    public final Map<String, String> getLogParams() {
        return this.LLILLJJLI;
    }

    public final EnumC19257610Vq getScene() {
        return this.LLJ;
    }

    public final boolean getYearOnly() {
        return this.LLJI;
    }

    public final boolean isFtc() {
        return this.LLILLL;
    }

    public final boolean isGuestMode() {
        return this.LLILZIL;
    }

    public final void setBirthdayConfidence(int i) {
        this.LLILZLL = i;
    }

    public final void setConfirmationType(int i) {
        this.LLIZLLLIL = i;
    }

    public final void setEventNameScrollResults(String str) {
        this.LL = str;
    }

    public final void setFtc(boolean z) {
        this.LLILLL = z;
    }

    public final void setGuestMode(boolean z) {
        this.LLILZIL = z;
    }

    public final void setHasTransitionAnimation(boolean z) {
        this.LLIZ = z;
    }

    public final void setLocale(Locale locale) {
        this.LLILZ = locale;
    }

    public final void setLogParams(Map<String, String> map) {
        this.LLILLJJLI = map;
    }

    public final void setScene(EnumC19257610Vq enumC19257610Vq) {
        this.LLJ = enumC19257610Vq;
    }

    public final void setYearOnly(boolean z) {
        this.LLJI = z;
    }
}
