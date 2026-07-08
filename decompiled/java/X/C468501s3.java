package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01s3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishFragment$refreshVideoCover$1", f = "FTCVideoPublishFragment.kt", l = {351}, m = "invokeSuspend")
public final class C468501s3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ FTCVideoPublishFragment LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C468501s3(FTCVideoPublishFragment fTCVideoPublishFragment, String str, InterfaceC1364105Vn<? super C468501s3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = fTCVideoPublishFragment;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C468501s3 c468501s3 = new C468501s3(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c468501s3.LLILLJJLI = obj;
        return c468501s3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Resources resources;
        C1C7U.LIZ("FTCVideoPublishFragment@5dbf.refreshVideoCover$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                resources = (Resources) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C099G c099gLIZIZ = C23250099c.LIZIZ((InterfaceC497601wk) this.LLILLJJLI, C0PEM.LIZJ, null, new C468401s2(this.LLILZ, null), 2);
            resources = this.LLILLL.getResources();
            this.LLILLJJLI = resources;
            this.LL = 1;
            obj = c099gLIZIZ.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FTCVideoPublishFragment@5dbf.refreshVideoCover$1");
                return objLJFF;
            }
        }
        C443530HaJ c443530HaJ = new C443530HaJ(resources, (Bitmap) obj);
        c443530HaJ.LIZJ(C12ES.LIZJ(4.0f, this.LLILLL.getContext()));
        this.LLILLL.NR().setImageDrawable(c443530HaJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FTCVideoPublishFragment@5dbf.refreshVideoCover$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
