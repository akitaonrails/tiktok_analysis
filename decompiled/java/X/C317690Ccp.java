package X;

import com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Ccp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.choose.Text2ImageListScene$config$2$1$onLoadMore$1$1", f = "Text2ImageListScene.kt", l = {440}, m = "invokeSuspend")
public final class C317690Ccp extends C09AX implements InterfaceC1631630sYr<List<? extends TextImageTaskInfo>, Boolean, Integer, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public /* synthetic */ boolean LLILLL;
    public /* synthetic */ int LLILZ;
    public final /* synthetic */ InterfaceC497601wk LLILZIL;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<Boolean>> LLILZLL;
    public final /* synthetic */ C558180Luq LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C317690Ccp(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC316870CbV<Boolean>> interfaceC1364105Vn, C558180Luq c558180Luq, InterfaceC1364105Vn<? super C317690Ccp> interfaceC1364105Vn2) {
        super(4, interfaceC1364105Vn2);
        this.LLILZIL = interfaceC497601wk;
        this.LLILZLL = interfaceC1364105Vn;
        this.LLIZ = c558180Luq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Text2ImageListScene@1b50.config$2$1$onLoadMore$1$1");
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
            List list = (List) this.LLILLJJLI;
            boolean z = this.LLILLL;
            int i2 = this.LLILZ;
            if (!C2296808zG.LJI(this.LLILZIL)) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("Text2ImageListScene@1b50.config$2$1$onLoadMore$1$1");
                return unit;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C558150Lun c558150Lun = new C558150Lun(i2, z, this.LLILZLL, list, this.LLIZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c558150Lun) == objLJFF) {
                C1C7U.LIZIZ("Text2ImageListScene@1b50.config$2$1$onLoadMore$1$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("Text2ImageListScene@1b50.config$2$1$onLoadMore$1$1");
        return unit2;
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(List<? extends TextImageTaskInfo> list, Boolean bool, Integer num, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        int iIntValue = num.intValue();
        C317690Ccp c317690Ccp = new C317690Ccp(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c317690Ccp.LLILLJJLI = list;
        c317690Ccp.LLILLL = zBooleanValue;
        c317690Ccp.LLILZ = iIntValue;
        return c317690Ccp.invokeSuspend(Unit.LIZ);
    }
}
