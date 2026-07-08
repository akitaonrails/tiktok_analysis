package X;

import com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0k1V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1303430k1V extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ RecommendEffectItem LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ InterfaceC1631620sYq<Integer, Boolean, String, Unit> LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1303430k1V(RecommendEffectItem recommendEffectItem, float f, int i, InterfaceC1631620sYq<? super Integer, ? super Boolean, ? super String, Unit> interfaceC1631620sYq, int i2) {
        super(2);
        this.LL = recommendEffectItem;
        this.LLILLJJLI = f;
        this.LLILLL = i;
        this.LLILZ = interfaceC1631620sYq;
        this.LLILZIL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1667120tU6.LIZJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZIL | 1));
        return Unit.LIZ;
    }
}
