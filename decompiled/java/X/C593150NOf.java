package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.im.messagelist.database.AwemeEffectRepositoryImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NOf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.database.AwemeEffectRepositoryImpl$queryUnconsumedIdsForExplosion$2", f = "AwemeEffectRepositoryImpl.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "invokeSuspend")
public final class C593150NOf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C593320NOw>>, Object> {
    public int LL;
    public final /* synthetic */ AwemeEffectRepositoryImpl LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593150NOf(AwemeEffectRepositoryImpl awemeEffectRepositoryImpl, String str, long j, long j2, InterfaceC1364105Vn<? super C593150NOf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = awemeEffectRepositoryImpl;
        this.LLILLL = str;
        this.LLILZ = j;
        this.LLILZIL = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C593150NOf(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        C1C7U.LIZ("AwemeEffectRepositoryImpl@f694.queryUnconsumedIdsForExplosion$2");
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
                obj = interfaceC593180NOiLJIIJJI.LJIIJJI(str, j, j2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AwemeEffectRepositoryImpl@f694.queryUnconsumedIdsForExplosion$2");
                    return objLJFF;
                }
            }
            arrayList = null;
            C1C7U.LIZIZ("AwemeEffectRepositoryImpl@f694.queryUnconsumedIdsForExplosion$2");
            return arrayList;
        }
        List<C593200NOk> list = (List) obj;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (C593200NOk c593200NOk : list) {
                arrayList.add(new C593320NOw(c593200NOk.LIZLLL, c593200NOk.LIZ, c593200NOk.LIZJ, c593200NOk.LIZIZ));
            }
        } else {
            arrayList = null;
        }
        C1C7U.LIZIZ("AwemeEffectRepositoryImpl@f694.queryUnconsumedIdsForExplosion$2");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C593320NOw>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
