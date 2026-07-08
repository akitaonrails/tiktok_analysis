package X;

import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.experiment.CelebrationParallelDownloadConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ccd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.repo.CelebrationMaterialRepo$downloadAwemeParallel$2", f = "CelebrationMaterialRepo.kt", l = {154}, m = "invokeSuspend")
public final class C317570Ccd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<ForwardMedia> LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317570Ccd(int i, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C317570Ccd c317570Ccd = new C317570Ccd(this.LLILZ, this.LLILLL, interfaceC1364105Vn);
        c317570Ccd.LLILLJJLI = obj;
        return c317570Ccd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CelebrationMaterialRepo@27f7.downloadAwemeParallel$2");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C1DEU c1deuLIZ = C2252461DEe.LIZ(((CelebrationParallelDownloadConfig.CelebrationDownloadConfig) CelebrationParallelDownloadConfig.LIZIZ.getValue()).maxConcurrentDownloads);
            List<ForwardMedia> list = this.LLILLL;
            int i2 = this.LLILZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<ForwardMedia> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C317580Cce(c1deuLIZ, it2.next(), i2, null), 3));
            }
            this.LL = 1;
            obj = C1D9F.LIZ(arrayList, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CelebrationMaterialRepo@27f7.downloadAwemeParallel$2");
                return objLJFF;
            }
        }
        List list2 = (List) obj;
        int i3 = 0;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                if (((Boolean) it3.next()).booleanValue() && (i3 = i3 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        Integer numLJ = C2286608xc.LJ(i3);
        C1C7U.LIZIZ("CelebrationMaterialRepo@27f7.downloadAwemeParallel$2");
        return numLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
