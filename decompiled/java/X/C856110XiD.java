package X;

import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0XiD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856110XiD extends C09AY implements Function2<View, C1391990mKL, Unit> {
    public final /* synthetic */ Function1<Integer, Unit> LL;
    public final /* synthetic */ VideoPublishEditModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C856110XiD(int i, VideoPublishEditModel videoPublishEditModel, String str, Function1 function1) {
        super(2);
        this.LL = function1;
        this.LLILLJJLI = videoPublishEditModel;
        this.LLILLL = str;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, C1391990mKL c1391990mKL) {
        Function1<Integer, Unit> function1 = this.LL;
        if (function1 != null) {
            function1.invoke(3);
        }
        C856790XjJ c856790XjJ = C856790XjJ.LIZ;
        String creationId = this.LLILLJJLI.getCreationId();
        VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI;
        String str = videoPublishEditModel.mShootWay;
        if (str == null) {
            str = "";
        }
        String str2 = this.LLILLL;
        String strLJIILL = C1428470nHB.LJIILL(videoPublishEditModel);
        String strLJIILIIL = C1428470nHB.LJIILIIL(this.LLILLJJLI);
        int i = this.LLILZ;
        int videoLength = this.LLILLJJLI.getVideoLength();
        boolean zLIZIZ = C857680Xkk.LIZIZ(this.LLILLJJLI);
        c856790XjJ.getClass();
        C856790XjJ.LJ(creationId, str, str2, strLJIILL, i, videoLength, zLIZIZ ? 1 : 0, strLJIILIIL);
        return Unit.LIZ;
    }
}
