package X;

import b7k.b;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ssg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1643920ssg extends C09AY implements Function1<List<? extends Effect>, Unit> {
    public final /* synthetic */ C1643900sse LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Function1<String, Unit> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1643920ssg(C1643900sse c1643900sse, String str, String str2, String str3, AwS604S0100000_25 awS604S0100000_25, AwS569S0100000_25 awS569S0100000_25) {
        super(1);
        this.LL = c1643900sse;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = awS604S0100000_25;
        this.LLILZLL = awS569S0100000_25;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends Effect> list) {
        C1643900sse c1643900sse = this.LL;
        String str = this.LLILLL;
        String str2 = this.LLILZ;
        Function1<String, Unit> function1 = this.LLILZIL;
        for (Effect effect : list) {
            FilterBean filterBean = new FilterBean();
            filterBean.setId(effect.getEffectId());
            filterBean.setFilterFolder(effect.getUnzipPath());
            filterBean.setFilterFilePath(effect.getUnzipPath());
            filterBean.setResId(effect.getResourceId());
            filterBean.setExtra(effect.getExtra());
            float fLIZIZ = c1643900sse.LIZ.LIZIZ(filterBean);
            float fLIZIZ2 = c1643900sse.LIZIZ.LIZIZ(filterBean);
            if (fLIZIZ2 == c1643900sse.LIZIZ.LIZLLL(filterBean) && fLIZIZ2 != fLIZIZ) {
                c1643900sse.LIZIZ.LIZJ(filterBean, fLIZIZ);
            }
            if (Intrinsics.LJFF(str, effect.getId())) {
                if ((c1643900sse.LIZJ instanceof b) && !(!Intrinsics.LJFF(((b) r1).LIZ.LIZ(1), ""))) {
                    ((b) c1643900sse.LIZJ).LJI(1, effect.getResourceId());
                    new AwS426S0200000_25(effect, function1, 51).invoke();
                }
            }
            if (Intrinsics.LJFF(str2, effect.getEffectId())) {
                InterfaceC1645100sua interfaceC1645100sua = c1643900sse.LIZJ;
                if ((interfaceC1645100sua instanceof b) && !(true ^ Intrinsics.LJFF(((b) interfaceC1645100sua).LIZ.LIZ(0), ""))) {
                    ((b) c1643900sse.LIZJ).LJI(0, effect.getResourceId());
                    new AwS426S0200000_25(effect, function1, 52).invoke();
                }
            }
        }
        Keva keva = this.LL.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Filter_Data_2_Has_Migrated_");
        sbLIZ.append(this.LLILLJJLI);
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
        new AwS569S0100000_25(this.LLILZLL, (Function0<Unit>) 278).invoke();
        return Unit.LIZ;
    }
}
