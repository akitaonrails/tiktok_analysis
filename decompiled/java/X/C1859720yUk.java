package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yUk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1859720yUk extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ TakoMixFeed LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C259800zU<String> LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1859720yUk(String str, long j, TakoMixFeed takoMixFeed, String str2, C259800zU<String> c259800zU, boolean z, int i, int i2) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = takoMixFeed;
        this.LLILZ = str2;
        this.LLILZIL = c259800zU;
        this.LLILZLL = z;
        this.LLIZ = i;
        this.LLIZLLLIL = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preload inlineData done, uuid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", cost=");
        sbLIZ.append(System.currentTimeMillis() - this.LLILLJJLI);
        sbLIZ.append("ms, textLen=");
        sbLIZ.append(this.LLILLL.text.length());
        sbLIZ.append(", fullLen=");
        sbLIZ.append(this.LLILZ.length());
        sbLIZ.append(", firstFrameLen=");
        String str = this.LLILZIL.element;
        sbLIZ.append(str != null ? Integer.valueOf(str.length()) : null);
        sbLIZ.append(", deferVideo=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", charLimit=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", lineLimit=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", stripped=");
        int length = this.LLILZ.length();
        String str2 = this.LLILZIL.element;
        if (str2 == null) {
            str2 = this.LLILZ;
        }
        sbLIZ.append(length - str2.length());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
