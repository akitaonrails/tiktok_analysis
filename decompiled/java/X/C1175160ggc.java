package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ggc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class C1175160ggc extends C2217421BqW implements Function1<C1174900ggC, Unit> {
    public C1175160ggc(Object obj) {
        super(1, obj, C1195630hDd.class, "reportBizShowIfReady", "reportBizShowIfReady(Lcom/ss/android/ugc/aweme/ui/standard/tracker/LsStandardUiShowTrackParams;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1174900ggC c1174900ggC) {
        C1174900ggC c1174900ggC2 = c1174900ggC;
        C1195630hDd c1195630hDd = (C1195630hDd) this.receiver;
        if (c1195630hDd.LLILZ && !c1195630hDd.LLILLL && c1195630hDd.isShown() && C1174890ggB.LIZ("ttls_viewall_show", c1195630hDd, c1174900ggC2)) {
            c1195630hDd.LLILLL = true;
        }
        return Unit.LIZ;
    }
}
