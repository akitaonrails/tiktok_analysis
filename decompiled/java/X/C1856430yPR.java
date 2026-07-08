package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import java.util.List;

/* JADX INFO: renamed from: X.0yPR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1856430yPR extends C1856450yPT {
    public final BaseImage LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;

    @Override // X.C1856450yPT
    public final String LIZ() {
        return this.LLJ;
    }

    public C1856430yPR(TakoSug takoSug, BaseImage baseImage) {
        super(new C326960Crm(null, takoSug, null, 5), takoSug.sugList.size());
        this.LLIZLLLIL = baseImage;
        this.LLJ = takoSug.sugFloatingContent;
        List<String> list = takoSug.emojiList;
        this.LLJI = list != null ? (String) C13LP.LJJLIIIJL(list) : null;
    }
}
