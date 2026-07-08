package X;

import com.ss.android.ugc.aweme.im.messagelist.database.AwemeEffectRepositoryImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NOa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.database.AwemeEffectRepositoryImpl$queryUnconsumedCheckItemsForVideoRain$2", f = "AwemeEffectRepositoryImpl.kt", l = {99}, m = "invokeSuspend")
public final class C593100NOa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C0NP7>>, Object> {
    public int LL;
    public final /* synthetic */ AwemeEffectRepositoryImpl LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593100NOa(AwemeEffectRepositoryImpl awemeEffectRepositoryImpl, String str, long j, long j2, InterfaceC1364105Vn<? super C593100NOa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = awemeEffectRepositoryImpl;
        this.LLILLL = str;
        this.LLILZ = j;
        this.LLILZIL = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C593100NOa(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        C1C7U.LIZ("AwemeEffectRepositoryImpl@f694.queryUnconsumedCheckItemsForVideoRain$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC593180NOi interfaceC593180NOiLJIIJJI = this.LLILLJJLI.LJIIJJI();
            if (interfaceC593180NOiLJIIJJI != null) {
                String str = this.LLILLL;
                long j = this.LLILZ;
                long j2 = this.LLILZIL;
                this.LL = 1;
                obj = interfaceC593180NOiLJIIJJI.LJ(str, j, j2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AwemeEffectRepositoryImpl@f694.queryUnconsumedCheckItemsForVideoRain$2");
                    return objLJFF;
                }
            }
            arrayList = null;
            C1C7U.LIZIZ("AwemeEffectRepositoryImpl@f694.queryUnconsumedCheckItemsForVideoRain$2");
            return arrayList;
        }
        List<C593110NOb> list = (List) obj;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (C593110NOb c593110NOb : list) {
                String str2 = c593110NOb.LIZ;
                arrayList.add(new C0NP7(c593110NOb.LIZIZ, c593110NOb.LIZLLL, str2, c593110NOb.LIZJ));
            }
        } else {
            arrayList = null;
        }
        C1C7U.LIZIZ("AwemeEffectRepositoryImpl@f694.queryUnconsumedCheckItemsForVideoRain$2");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C0NP7>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
