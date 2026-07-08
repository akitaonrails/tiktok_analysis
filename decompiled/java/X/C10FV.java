package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService;

/* JADX INFO: renamed from: X.10FV, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10FV {
    public static final void LIZ(C127K c127k, int i) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null);
        if (iAVPublishPageUIRefactorService != null && iAVPublishPageUIRefactorService.enableRefactorPublishUI() && !C10BZ.LIZ()) {
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        }
        c127k.setIcon(c419910GdJ);
    }

    public static final void LIZIZ(C127K c127k, CharSequence charSequence) {
        if (C10BZ.LIZ()) {
            c127k.setTitle(charSequence.toString());
            return;
        }
        String string = charSequence.toString();
        if (c127k == null) {
            return;
        }
        C444910HcX c444910HcX = new C444910HcX(string);
        c444910HcX.LIZ(42);
        c127k.setTitle(c444910HcX);
    }
}
