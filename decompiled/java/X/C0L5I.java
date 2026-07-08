package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.gamora.recorder.layout.model.LayoutItemMedia;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0L5I, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L5I {
    public final InterfaceC576780Mjk LIZ;
    public final C19EG LIZIZ;
    public final ShortVideoContext LIZJ;
    public final a LIZLLL;
    public final Function0<Unit> LJ;
    public final C11PQ<List<LayoutItemMedia>> LJFF;
    public final C19475711Hn LJI;
    public NLEModel LJII;

    public C0L5I(InterfaceC576780Mjk interfaceC576780Mjk, C19EG c19eg, ShortVideoContext shortVideoContext, a aVar, AwS552S0100000_8 awS552S0100000_8) {
        this.LIZ = interfaceC576780Mjk;
        this.LIZIZ = c19eg;
        this.LIZJ = shortVideoContext;
        this.LIZLLL = aVar;
        this.LJ = awS552S0100000_8;
        C11PQ<List<LayoutItemMedia>> c11pq = new C11PQ<>();
        this.LJFF = c11pq;
        this.LJI = new C19475711Hn(c11pq);
    }
}
