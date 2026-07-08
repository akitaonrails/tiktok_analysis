package X;

import android.view.View;
import com.bytedance.android.livesdk.model.RichTextContent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xNm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816960xNm extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C1816940xNk LL;
    public final /* synthetic */ RichTextContent LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1816960xNm(long j, long j2, long j3, C1816940xNk c1816940xNk, RichTextContent richTextContent, List list) {
        super(1);
        this.LL = c1816940xNk;
        this.LLILLJJLI = richTextContent;
        this.LLILLL = list;
        this.LLILZ = j;
        this.LLILZIL = j2;
        this.LLILZLL = j3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        bool.booleanValue();
        View contentView = this.LL.getContentView();
        if (contentView != null) {
            final C1816940xNk c1816940xNk = this.LL;
            final RichTextContent richTextContent = this.LLILLJJLI;
            final List<String> list = this.LLILLL;
            final long j = this.LLILZ;
            final long j2 = this.LLILZIL;
            final long j3 = this.LLILZLL;
            HandlerHook.viewPost(contentView, new Runnable() { // from class: X.0xNl
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("DslBoard@b0d0.updateUi$1$3$1");
                    try {
                        c1816940xNk.LJIILL(richTextContent);
                        if (list.isEmpty()) {
                            long j4 = j;
                            long j5 = j2;
                            long j6 = j3;
                            try {
                                C1145500fum c1145500fumLJI = C1145410fud.LJI(j4, j5);
                                if (c1145500fumLJI != null) {
                                    c1145500fumLJI.LJII(j6);
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("DslBoard@b0d0.updateUi$1$3$1");
                }
            });
        }
        return Unit.LIZ;
    }
}
