package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.music.StickPointMusicAlg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NM0, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.download.StickPointMusicAlgFileDownloadV1$startDownloadFile$1", f = "StickPointMusicAlgFileDownloadV1.kt", l = {66, 68}, m = "invokeSuspend")
public final class C0NM0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<C609100Num> LLILLL;
    public final /* synthetic */ C1421070n5F LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ StickPointMusicAlg LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NM0(List<C609100Num> list, C1421070n5F c1421070n5F, Context context, StickPointMusicAlg stickPointMusicAlg, InterfaceC1364105Vn<? super C0NM0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = c1421070n5F;
        this.LLILZIL = context;
        this.LLILZLL = stickPointMusicAlg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0NM0 c0nm0 = new C0NM0(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c0nm0.LLILLJJLI = obj;
        return c0nm0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AtomicBoolean atomicBoolean;
        C1C7U.LIZ("StickPointMusicAlgFileDownloadV1@3c2c.startDownloadFile$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StickPointMusicAlgFileDownloadV1@3c2c.startDownloadFile$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atomicBoolean = (AtomicBoolean) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            atomicBoolean = new AtomicBoolean(false);
            List<C609100Num> list = this.LLILLL;
            C1421070n5F c1421070n5F = this.LLILZ;
            Context context = this.LLILZIL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C609100Num> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, C0PEM.LIZJ, null, new C609090Nul(it2.next(), atomicBoolean, c1421070n5F, context, null), 2));
            }
            this.LLILLJJLI = atomicBoolean;
            this.LL = 1;
            if (C1D9F.LIZ(arrayList, this) == objLJFF) {
                C1C7U.LIZIZ("StickPointMusicAlgFileDownloadV1@3c2c.startDownloadFile$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C0NM1 c0nm1 = new C0NM1(this.LLILZ, this.LLILZLL, atomicBoolean, null);
        this.LLILLJJLI = null;
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c0nm1) == objLJFF) {
            C1C7U.LIZIZ("StickPointMusicAlgFileDownloadV1@3c2c.startDownloadFile$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StickPointMusicAlgFileDownloadV1@3c2c.startDownloadFile$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
