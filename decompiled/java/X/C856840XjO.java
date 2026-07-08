package X;

import android.view.View;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0XjO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856840XjO extends C09AY implements Function2<View, C1391990mKL, Unit> {
    public final /* synthetic */ C259800zU<TuxPanel> LL;
    public final /* synthetic */ Function1<Integer, Unit> LLILLJJLI;
    public final /* synthetic */ VideoPublishEditModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C856840XjO(C259800zU<TuxPanel> c259800zU, Function1<? super Integer, Unit> function1, VideoPublishEditModel videoPublishEditModel, String str, int i) {
        super(2);
        this.LL = c259800zU;
        this.LLILLJJLI = function1;
        this.LLILLL = videoPublishEditModel;
        this.LLILZ = str;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, C1391990mKL c1391990mKL) {
        TuxPanel tuxPanel = this.LL.element;
        if (tuxPanel != null) {
            tuxPanel.dismissAllowingStateLoss();
        }
        Function1<Integer, Unit> function1 = this.LLILLJJLI;
        if (function1 != null) {
            function1.invoke(1);
        }
        C856790XjJ c856790XjJ = C856790XjJ.LIZ;
        String creationId = this.LLILLL.getCreationId();
        VideoPublishEditModel videoPublishEditModel = this.LLILLL;
        String str = videoPublishEditModel.mShootWay;
        if (str == null) {
            str = "";
        }
        String strValueOf = String.valueOf(videoPublishEditModel.getDraftId());
        String str2 = this.LLILZ;
        String strLJIILL = C1428470nHB.LJIILL(this.LLILLL);
        String strLJIILIIL = C1428470nHB.LJIILIIL(this.LLILLL);
        int i = this.LLILZIL;
        String musicId = this.LLILLL.getMusicId();
        int videoLength = this.LLILLL.getVideoLength();
        boolean zLIZIZ = C857680Xkk.LIZIZ(this.LLILLL);
        c856790XjJ.getClass();
        C856790XjJ.LJII(i, videoLength, zLIZIZ ? 1 : 0, creationId, str, strValueOf, str2, strLJIILL, strLJIILIIL, musicId);
        return Unit.LIZ;
    }
}
