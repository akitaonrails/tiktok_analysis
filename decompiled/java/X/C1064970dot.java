package X;

import com.ss.android.ugc.aweme.commercialize.model.AdDislikeInfo;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0dot, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1064970dot implements Serializable {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final AdDislikeInfo LLILZLL;
    public final InterfaceC1064920doo LLIZ;

    public final String getAdId() {
        return this.LLILLJJLI;
    }

    public final String getAid() {
        return this.LL;
    }

    public final InterfaceC1064920doo getCallback() {
        return this.LLIZ;
    }

    public final String getCreativeId() {
        return this.LLILZ;
    }

    public final AdDislikeInfo getDislikeInfo() {
        return this.LLILZLL;
    }

    public final String getLogExtra() {
        return this.LLILZIL;
    }

    public final String getRoomId() {
        return this.LLILLL;
    }

    public C1064970dot(String str, String str2, String str3, String str4, String str5, AdDislikeInfo adDislikeInfo, InterfaceC1064920doo interfaceC1064920doo) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = adDislikeInfo;
        this.LLIZ = interfaceC1064920doo;
    }
}
