package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tJE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1660380tJE {
    public final VideoPublishEditModel LIZ;
    public final List<C1660120tIo<AbstractC1678220tm0>> LIZIZ = new ArrayList();
    public int LIZJ = Integer.MAX_VALUE;

    public C1660380tJE(VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = videoPublishEditModel;
    }

    public final void LIZ(Function1<? super C1660210tIx, Unit> function1) {
        function1.invoke(new C1660210tIx(this.LIZIZ));
    }
}
