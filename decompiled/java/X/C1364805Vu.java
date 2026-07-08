package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Vu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.jsb.LsReviewUploadManager$awaitImage$2", f = "LsReviewUploadManager.kt", l = {176}, m = "invokeSuspend")
public final class C1364805Vu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C09WU>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1364805Vu(String str, String str2, InterfaceC1364105Vn<? super C1364805Vu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1364805Vu(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LsReviewUploadManager@7edb.awaitImage$2");
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
            C09WT c09wt = C09WT.LIZ;
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            c09wt.getClass();
            C05XL c05xlLIZJ = C09WT.LIZJ(str, str2);
            this.LL = 1;
            obj = c05xlLIZJ.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LsReviewUploadManager@7edb.awaitImage$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("LsReviewUploadManager@7edb.awaitImage$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C09WU> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
