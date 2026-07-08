package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;

/* JADX INFO: renamed from: X.13RZ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13RZ extends C13RY {
    public C13RZ(final ICheckChannelListener iCheckChannelListener) {
        new ICheckChannelListener(iCheckChannelListener) { // from class: X.13RY
            public final ICheckChannelListener LIZ;

            {
                this.LIZ = iCheckChannelListener;
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
            public final void checkChannelFailed(ExceptionResult exceptionResult) {
                this.LIZ.checkChannelFailed(exceptionResult);
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
            public final void checkChannelSuccess(boolean z) {
                this.LIZ.checkChannelSuccess(z);
            }
        };
    }
}
