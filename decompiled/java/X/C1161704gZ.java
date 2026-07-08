package X;

import android.view.ViewGroup;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS17S1201000_2;

/* JADX INFO: renamed from: X.04gZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1161704gZ extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ RavenFragment<Object> LL;
    public final /* synthetic */ C13IQ<? extends UIAssem> LLILLJJLI;
    public final /* synthetic */ ViewGroup LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1161704gZ(RavenFragment<Object> ravenFragment, C13IQ<? extends UIAssem> c13iq, ViewGroup viewGroup, int i, String str) {
        super(1);
        this.LL = ravenFragment;
        this.LLILLJJLI = c13iq;
        this.LLILLL = viewGroup;
        this.LLILZ = i;
        this.LLILZIL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        RavenFragment<Object> ravenFragment = this.LL;
        C13IQ<? extends UIAssem> c13iq = this.LLILLJJLI;
        assembler.QQ2(ravenFragment, new AwS17S1201000_2(this.LLILZ, this.LLILLL, this.LLILZIL, c13iq, 2));
        return Unit.LIZ;
    }
}
