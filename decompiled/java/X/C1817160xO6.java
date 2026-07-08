package X;

import com.bytedance.android.livesdk.model.ImageContent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xO6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1817160xO6 extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C1817010xNr LL;
    public final /* synthetic */ ImageContent LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1817160xO6(C1817010xNr c1817010xNr, ImageContent imageContent, C1817230xOD c1817230xOD) {
        super(1);
        this.LL = c1817010xNr;
        this.LLILLJJLI = imageContent;
        this.LLILLL = c1817230xOD;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        final boolean zBooleanValue = bool.booleanValue();
        final C1817010xNr c1817010xNr = this.LL;
        C0GZW c0gzw = c1817010xNr.LLJJJJ;
        if (c0gzw != null) {
            final ImageContent imageContent = this.LLILLJJLI;
            final Function0<Unit> function0 = this.LLILLL;
            HandlerHook.viewPost(c0gzw, new Runnable() { // from class: X.0xO5
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SceneryBoard@5203.updateBackgroundImage$2$1");
                    try {
                        c1817010xNr.LJIILL(imageContent, zBooleanValue, function0);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SceneryBoard@5203.updateBackgroundImage$2$1");
                }
            });
        }
        return Unit.LIZ;
    }
}
