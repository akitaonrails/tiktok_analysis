package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoReferenceInfo;
import java.util.Map;

/* JADX INFO: renamed from: X.0yQd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1857170yQd implements InterfaceC1861810yY7, InterfaceC1859540yUS, C0HAD {
    public final C326880Cre LL;
    public final String LLILLJJLI;
    public final TakoMixFeed LLILLL;
    public final String LLILZ;
    public final int LLILZIL;
    public final boolean LLILZLL;
    public final String LLIZ;

    @Override // X.InterfaceC1859540yUS
    public final String LIZIZ() {
        return null;
    }

    @Override // X.InterfaceC1859540yUS
    public final Map<String, TakoPlaceholderSource> LJIIZILJ() {
        return null;
    }

    @Override // X.InterfaceC1859540yUS
    public final String LJIJJLI() {
        return null;
    }

    @Override // X.C0HAD
    public final String LIZ() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1861810yY7
    public final C326880Cre LJJJJZI() {
        return this.LL;
    }

    @Override // X.InterfaceC1859540yUS
    public final boolean LLIIJI() {
        return this.LLILZLL;
    }

    public String getText() {
        return this.LLILZ;
    }

    public C1857170yQd(C326880Cre c326880Cre) {
        String str;
        String str2;
        this.LL = c326880Cre;
        Message message = c326880Cre.LLILLL;
        this.LLILLJJLI = message.uuid;
        TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
        this.LLILLL = takoMixFeedLJIIIZ;
        if (takoMixFeedLJIIIZ != null) {
            str = takoMixFeedLJIIIZ.text;
        } else {
            str = null;
        }
        this.LLILZ = str;
        this.LLILZIL = c326880Cre.LLILLL.LIZIZ;
        this.LLILZLL = ((Number) C076K.LIZ.getValue()).intValue() == 1;
        TakoReferenceInfo takoReferenceInfo = c326880Cre.LLILLL.referenceInfo;
        this.LLIZ = (takoReferenceInfo == null || (str2 = takoReferenceInfo.content) == null) ? "" : str2;
    }
}
