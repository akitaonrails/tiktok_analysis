package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01tQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder$setBitmapSafely$1", f = "DraftItemBaseBgViewHolder.kt", l = {218, 220}, m = "invokeSuspend")
public final class C477001tQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ImageView LLILLJJLI;
    public final /* synthetic */ Bitmap LLILLL;
    public final /* synthetic */ C0M0P LLILZ;
    public final /* synthetic */ DraftItemBaseBgViewHolder LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C477001tQ(ImageView imageView, Bitmap bitmap, C0M0P c0m0p, DraftItemBaseBgViewHolder draftItemBaseBgViewHolder, InterfaceC1364105Vn<? super C477001tQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = imageView;
        this.LLILLL = bitmap;
        this.LLILZ = c0m0p;
        this.LLILZIL = draftItemBaseBgViewHolder;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C477001tQ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ;
        C1C7U.LIZ("DraftItemBaseBgViewHolder@3570.setBitmapSafely$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("DraftItemBaseBgViewHolder@3570.setBitmapSafely$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
            objLIZ = ((C189200o6) obj).m10unboximpl();
        } else {
            C155000ia.LIZIZ(obj);
            C474601t2 c474601t2 = C474601t2.LIZ;
            Context context = this.LLILLJJLI.getContext();
            Bitmap bitmap = this.LLILLL;
            String str = this.LLILZ.LJ;
            this.LL = 1;
            objLIZ = c474601t2.LIZ(context, bitmap, str, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("DraftItemBaseBgViewHolder@3570.setBitmapSafely$1");
                return objLJFF;
            }
        }
        if (C189200o6.m8isSuccessimpl(objLIZ)) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C477101tR c477101tR = new C477101tR(this.LLILZ, objLIZ, this.LLILLJJLI, this.LLILZIL, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c477101tR) == objLJFF) {
                C1C7U.LIZIZ("DraftItemBaseBgViewHolder@3570.setBitmapSafely$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DraftItemBaseBgViewHolder@3570.setBitmapSafely$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
