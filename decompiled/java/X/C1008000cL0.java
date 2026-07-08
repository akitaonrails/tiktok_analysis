package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cL0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1008000cL0 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1007900cKq LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1008000cL0(C1007900cKq c1007900cKq, String str, long j) {
        super(0);
        this.LL = c1007900cKq;
        this.LLILLJJLI = str;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AnoleComponentModel anoleComponentModelAk;
        String str;
        InterfaceC1007930cKt interfaceC1007930cKt = this.LL.LJII.get(this.LLILLJJLI);
        if (interfaceC1007930cKt != null && (anoleComponentModelAk = interfaceC1007930cKt.Ak()) != null && (str = anoleComponentModelAk.slotID) != null) {
            C1007900cKq c1007900cKq = this.LL;
            String str2 = this.LLILLJJLI;
            final long j = this.LLILLL;
            c1007900cKq.LJIIJJI.offer(new C1008420cLg(str2, str, new AbstractC1008090cL9(j) { // from class: X.0cLF
                public final long LIZ;

                @Override // X.AbstractC1008090cL9
                public final String LIZ() {
                    return EnumC1008360cLa.PLAY_DELAY.getType();
                }

                {
                    this.LIZ = j;
                }

                @Override // X.AbstractC1008090cL9
                public final boolean LIZJ(AnoleComponentAppearModel anoleComponentAppearModel) {
                    Long playDelayTimeMillis;
                    if (!super.LIZJ(anoleComponentAppearModel) || (playDelayTimeMillis = anoleComponentAppearModel.getPlayDelayTimeMillis()) == null || playDelayTimeMillis.longValue() != this.LIZ) {
                        return false;
                    }
                    return true;
                }
            }));
        }
        return Unit.LIZ;
    }
}
