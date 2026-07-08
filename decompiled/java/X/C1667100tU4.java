package X;

import android.util.Size;
import com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectItem;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tU4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1667100tU4 extends C09AY implements Function1<C0MAE, Unit> {
    public final /* synthetic */ C1303440k1W LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ C05P0<Size> LLILLL;
    public final /* synthetic */ EnumC994870bzp LLILZ;
    public final /* synthetic */ Function2<String, Integer, Unit> LLILZIL;
    public final /* synthetic */ InterfaceC1631620sYq<Integer, Boolean, String, Unit> LLILZLL;
    public final /* synthetic */ C05P0<Boolean> LLIZ;
    public final /* synthetic */ C05P0<Set<Integer>> LLIZLLLIL;
    public final /* synthetic */ C05P0<Set<Integer>> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1667100tU4(C1303440k1W c1303440k1W, float f, C05P0<Size> c05p0, EnumC994870bzp enumC994870bzp, Function2<? super String, ? super Integer, Unit> function2, InterfaceC1631620sYq<? super Integer, ? super Boolean, ? super String, Unit> interfaceC1631620sYq, C05P0<Boolean> c05p02, C05P0<Set<Integer>> c05p03, C05P0<Set<Integer>> c05p04) {
        super(1);
        this.LL = c1303440k1W;
        this.LLILLJJLI = f;
        this.LLILLL = c05p0;
        this.LLILZ = enumC994870bzp;
        this.LLILZIL = function2;
        this.LLILZLL = interfaceC1631620sYq;
        this.LLIZ = c05p02;
        this.LLIZLLLIL = c05p03;
        this.LLJ = c05p04;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0MAE c0mae) {
        C1303440k1W c1303440k1W = this.LL;
        List<RecommendEffectItem> list = c1303440k1W.LIZ;
        c0mae.LIZJ(list.size(), null, new C5183020f((List) list, (List<Function1<Function1<? super Boolean, Unit>, Unit>>) 162), new C19719212De(-1091073711, new C1667090tU3(list, this.LLILLJJLI, c1303440k1W, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ), true));
        return Unit.LIZ;
    }
}
