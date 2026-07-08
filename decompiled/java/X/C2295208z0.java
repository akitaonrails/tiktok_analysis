package X;

import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.PictureInfoOpt;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.UploadInfoOpt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08z0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.sdk.smartmovie.interop.AlgorithmSystemManagerExt$compressAndSave$2", f = "AlgorithmSystemManagerExt.kt", l = {79}, m = "invokeSuspend")
public final class C2295208z0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends PictureInfoOpt>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<UploadInfoOpt> LLILLL;
    public final /* synthetic */ C2294808yw LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2295208z0(List<UploadInfoOpt> list, C2294808yw c2294808yw, String str, InterfaceC1364105Vn<? super C2295208z0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = c2294808yw;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2295208z0 c2295208z0 = new C2295208z0(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c2295208z0.LLILLJJLI = obj;
        return c2295208z0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AlgorithmSystemManagerExt@93da.compressAndSave$2");
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
            List<UploadInfoOpt> list = this.LLILLL;
            C2294808yw c2294808yw = this.LLILZ;
            String str = this.LLILZIL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<UploadInfoOpt> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, C0PEM.LIZJ, null, new C2295108yz(it2.next(), c2294808yw, str, null), 2));
            }
            this.LL = 1;
            obj = C1D9F.LIZ(arrayList, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AlgorithmSystemManagerExt@93da.compressAndSave$2");
                return objLJFF;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : (List) obj) {
            PictureInfoOpt pictureInfoOpt = (PictureInfoOpt) obj2;
            if (pictureInfoOpt.path.length() > 0 && pictureInfoOpt.width > 0 && pictureInfoOpt.height > 0) {
                arrayList2.add(obj2);
            }
        }
        C1C7U.LIZIZ("AlgorithmSystemManagerExt@93da.compressAndSave$2");
        return arrayList2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends PictureInfoOpt>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
