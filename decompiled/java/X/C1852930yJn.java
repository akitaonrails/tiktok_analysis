package X;

import android.content.Context;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TakoPhotoChooseViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yJn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TakoPhotoChooseViewModel$loadPhotos$1", f = "TakoPhotoChooseViewModel.kt", l = {189, 197}, m = "invokeSuspend")
public final class C1852930yJn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoPhotoChooseViewModel LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1852930yJn(TakoPhotoChooseViewModel takoPhotoChooseViewModel, Context context, InterfaceC1364105Vn<? super C1852930yJn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoPhotoChooseViewModel;
        this.LLILLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1852930yJn(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        Object c098200Yq;
        C2400709av c2400709av;
        C1C7U.LIZ("TakoPhotoChooseViewModel@7991.loadPhotos$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoPhotoChooseViewModel@7991.loadPhotos$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("TakoPhotoChooseViewModel@7991.loadPhotos$1");
            return unit2;
        }
        C155000ia.LIZIZ(obj);
        boolean zLIZLLL = C540120LGg.LIZLLL();
        boolean zLJ = C540120LGg.LJ();
        C1852950yJp.LIZ.getClass();
        C1852940yJo c1852940yJo = C1852950yJp.LIZIZ;
        if (zLIZLLL) {
            i = 0;
        } else if (zLJ) {
            i = 1;
        } else {
            i = 2;
        }
        c1852940yJo.LIZLLL = i;
        if (!zLIZLLL && !zLJ) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1852870yJh c1852870yJh = new C1852870yJh(this.LLILLJJLI, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c1852870yJh) == objLJFF) {
                C1C7U.LIZIZ("TakoPhotoChooseViewModel@7991.loadPhotos$1");
                return objLJFF;
            }
            Unit unit22 = Unit.LIZ;
            C1C7U.LIZIZ("TakoPhotoChooseViewModel@7991.loadPhotos$1");
            return unit22;
        }
        C14TF.LIZIZ.LJJJ();
        TakoPhotoChooseViewModel takoPhotoChooseViewModel = this.LLILLJJLI;
        Context context = this.LLILLL;
        takoPhotoChooseViewModel.getClass();
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                c2400709av = new C2400709av(null, null, 0L, 0L, null, "is_trashed = ?", new String[]{CardStruct.IStatusCode.DEFAULT}, false, false, false, 927);
            } else {
                c2400709av = null;
            }
            c098200Yq = C1853000yJu.LIZ(C2400609au.LIZIZ(context, false, -1, -1, c2400709av, true, true, false, -1));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        List list = (List) c098200Yq;
        if (list == null) {
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("TakoPhotoChooseViewModel@7991.loadPhotos$1");
            return unit3;
        }
        C1DFH c1dfh2 = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
        C1852990yJt c1852990yJt = new C1852990yJt(this.LLILLJJLI, this.LLILLL, list, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq2, c1852990yJt) == objLJFF) {
            C1C7U.LIZIZ("TakoPhotoChooseViewModel@7991.loadPhotos$1");
            return objLJFF;
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("TakoPhotoChooseViewModel@7991.loadPhotos$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
