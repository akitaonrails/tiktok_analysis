package X;

import android.app.Activity;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09NM, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.cards.answer.image.download.TakoImageDownloader$downloadImage$1", f = "TakoImageDownloader.kt", l = {47, 48}, m = "invokeSuspend")
public final class C09NM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C09NK LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ C09NO LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09NM(C09NK c09nk, Activity activity, String str, boolean z, C09NO c09no, InterfaceC1364105Vn<? super C09NM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c09nk;
        this.LLILLL = activity;
        this.LLILZ = str;
        this.LLILZIL = z;
        this.LLILZLL = c09no;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09NM(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoImageDownloader@2329.downloadImage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoImageDownloader@2329.downloadImage$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C09NK c09nk = this.LLILLJJLI;
            Activity activity = this.LLILLL;
            String str = this.LLILZ;
            boolean z = this.LLILZIL;
            this.LL = 1;
            obj = c09nk.LIZ(activity, str, this, z);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoImageDownloader@2329.downloadImage$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C09NN c09nn = new C09NN((Uri) obj, this.LLILZLL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c09nn) == objLJFF) {
            C1C7U.LIZIZ("TakoImageDownloader@2329.downloadImage$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoImageDownloader@2329.downloadImage$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
