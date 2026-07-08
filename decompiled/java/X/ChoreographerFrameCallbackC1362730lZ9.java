package X;

import android.view.Choreographer;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.SharePanelImRootAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0lZ9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class ChoreographerFrameCallbackC1362730lZ9 implements Choreographer.FrameCallback {
    public final /* synthetic */ SharePanelImRootAssem LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    public ChoreographerFrameCallbackC1362730lZ9(SharePanelImRootAssem sharePanelImRootAssem, int i, Function0<Unit> function0) {
        this.LL = sharePanelImRootAssem;
        this.LLILLJJLI = i;
        this.LLILLL = function0;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        SharePanelImRootAssem sharePanelImRootAssem = this.LL;
        int i = this.LLILLJJLI - 1;
        Function0<Unit> function0 = this.LLILLL;
        sharePanelImRootAssem.getClass();
        if (i <= 0) {
            function0.invoke();
        } else {
            C786410Ut5.v2().postFrameCallback(new ChoreographerFrameCallbackC1362730lZ9(sharePanelImRootAssem, i, function0));
        }
    }
}
