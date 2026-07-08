package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoViewLargeImageDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01rM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoViewLargeImageDialogFragment$onCreate$2$2$1$1", f = "TakoViewLargeImageDialogFragment.kt", l = {127, 140}, m = "invokeSuspend")
public final class C464201rM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C013C LL;
    public int LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ Bitmap LLILZ;
    public final /* synthetic */ TakoViewLargeImageDialogFragment LLILZIL;
    public final /* synthetic */ View LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C464201rM(Context context, Bitmap bitmap, TakoViewLargeImageDialogFragment takoViewLargeImageDialogFragment, View view, InterfaceC1364105Vn<? super C464201rM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = context;
        this.LLILZ = bitmap;
        this.LLILZIL = takoViewLargeImageDialogFragment;
        this.LLILZLL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C464201rM(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C013C c013c;
        C1C7U.LIZ("TakoViewLargeImageDialogFragment@3345.onCreate$2$2$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoViewLargeImageDialogFragment@3345.onCreate$2$2$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c013c = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            c013c = new C013C();
            Context context = this.LLILLL;
            Bitmap bitmap = this.LLILZ;
            TakoViewLargeImageDialogFragment takoViewLargeImageDialogFragment = this.LLILZIL;
            boolean z = takoViewLargeImageDialogFragment.LLILLL;
            C020Z c020z = new C020Z(c013c, takoViewLargeImageDialogFragment, 7);
            this.LL = c013c;
            this.LLILLJJLI = 1;
            if (C09NP.LIZJ(context, bitmap, z, c020z, this) == objLJFF) {
                C1C7U.LIZIZ("TakoViewLargeImageDialogFragment@3345.onCreate$2$2$1$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C464101rL c464101rL = new C464101rL(c013c, this.LLILLL, this.LLILZLL, null);
        this.LL = null;
        this.LLILLJJLI = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c464101rL) == objLJFF) {
            C1C7U.LIZIZ("TakoViewLargeImageDialogFragment@3345.onCreate$2$2$1$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoViewLargeImageDialogFragment@3345.onCreate$2$2$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
