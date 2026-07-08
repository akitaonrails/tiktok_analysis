package X;

import android.graphics.Bitmap;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.image.list.TakoAnswerImageListAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yPt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1856710yPt extends AbstractC468201s0 {
    public final /* synthetic */ BaseImage LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;
    public final /* synthetic */ TakoAnswerImageListAssem LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C118300cf LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ Function1<List<C1856720yPu>, Unit> LLIZLLLIL;
    public final /* synthetic */ List<C1856720yPu> LLJ;

    public final void LIZIZ() {
        if (Intrinsics.LJFF(this.LLILZ.LLJLL, this.LLILZIL)) {
            C118300cf c118300cf = this.LLILZLL;
            int i = c118300cf.element + 1;
            c118300cf.element = i;
            if (i == this.LLIZ) {
                this.LLIZLLLIL.invoke(this.LLJ);
            }
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void LIZ(Bitmap bitmap) {
        LIZIZ();
    }

    @Override // X.InterfaceC1331910klR
    public final void onFailed(Throwable th) {
        if (Intrinsics.LJFF(this.LLILLJJLI, this.LL.thumbnailUrlList)) {
            String str = (String) C13LP.LJJJLL(this.LL.urlList);
            if (str == null) {
                str = "";
            }
            if (str.length() > 0) {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                c1331670kl3LJIIIZ.LJJJIL = new C1338340kvo("tako_generate_multi_image", this.LLILLL, (TuxIconView) null, 12);
                c1331670kl3LJIIIZ.LJJIIJ(new AbstractC468201s0() { // from class: X.0yPv
                    @Override // X.InterfaceC1331910klR
                    public final void LIZ(Bitmap bitmap) {
                        this.LL.LIZIZ();
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void onFailed(Throwable th2) {
                        this.LL.LIZIZ();
                    }
                });
                return;
            }
        }
        LIZIZ();
    }

    public C1856710yPt(BaseImage baseImage, List list, Map map, TakoAnswerImageListAssem takoAnswerImageListAssem, String str, C118300cf c118300cf, int i, AwS606S0100000_27 awS606S0100000_27, List list2) {
        this.LL = baseImage;
        this.LLILLJJLI = list;
        this.LLILLL = map;
        this.LLILZ = takoAnswerImageListAssem;
        this.LLILZIL = str;
        this.LLILZLL = c118300cf;
        this.LLIZ = i;
        this.LLIZLLLIL = awS606S0100000_27;
        this.LLJ = list2;
    }
}
