package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NLx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.performance.h5.downloader.MinisResourceDownloadManager$executeTask$1", f = "MinisResourceDownloadManager.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C592550NLx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592550NLx(String str, String str2, String str3, InterfaceC1364105Vn<? super C592550NLx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C592550NLx(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinisResourceDownloadManager@5e9b.executeTask$1");
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
            String strLIZIZ = C592560NLy.LIZIZ(this.LLILLJJLI);
            if (strLIZIZ == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MinisResourceDownloadManager@5e9b.executeTask$1");
                return unit;
            }
            C612900O2e c612900O2e = new C612900O2e(this.LLILLJJLI, this.LLILZ, strLIZIZ, this.LLILLL);
            this.LL = 1;
            if (c612900O2e.LIZ(this) == objLJFF) {
                C1C7U.LIZIZ("MinisResourceDownloadManager@5e9b.executeTask$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MinisResourceDownloadManager@5e9b.executeTask$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
