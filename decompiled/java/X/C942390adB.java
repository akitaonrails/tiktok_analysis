package X;

import android.graphics.Rect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0adB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C942390adB extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C238400w2 LL;
    public final /* synthetic */ C942410adD LLILLJJLI;
    public final /* synthetic */ C118300cf LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ Rect LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ long LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C942390adB(int i, long j, long j2, Rect rect, C942410adD c942410adD, List list, C118300cf c118300cf, C238400w2 c238400w2) {
        super(0);
        this.LL = c238400w2;
        this.LLILLJJLI = c942410adD;
        this.LLILLL = c118300cf;
        this.LLILZ = i;
        this.LLILZIL = list;
        this.LLILZLL = rect;
        this.LLIZ = j;
        this.LLIZLLLIL = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C238400w2 c238400w2 = this.LL;
        long j = c238400w2.element;
        C942410adD c942410adD = this.LLILLJJLI;
        c238400w2.element = j + (jCurrentTimeMillis - c942410adD.LJIIJJI);
        C118300cf c118300cf = this.LLILLL;
        c118300cf.element++;
        C942380adA.LIZ(this.LLILZ, this.LLIZ, this.LLIZLLLIL, this.LLILZLL, c942410adD, this.LLILZIL, c118300cf, c238400w2);
        return Unit.LIZ;
    }
}
