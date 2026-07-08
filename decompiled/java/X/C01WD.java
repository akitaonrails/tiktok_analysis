package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.UploadImageParam;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01WD, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.aiplayground.panel.helper.DownloadUtils$downloadImages$1$1$1", f = "DownloadUtils.kt", l = {51}, m = "invokeSuspend")
public final class C01WD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super UploadImageParam>, Object> {
    public int LL;
    public final /* synthetic */ CreativeInfo LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ List<Pair<String, Boolean>> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01WD(CreativeInfo creativeInfo, String str, int i, List<Pair<String, Boolean>> list, InterfaceC1364105Vn<? super C01WD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = creativeInfo;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01WD(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("DownloadUtils@c1b0.downloadImages$1$1$1");
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
            CreativeInfo creativeInfo = this.LLILLJJLI;
            String str = this.LLILLL;
            int i2 = this.LLILZ;
            boolean zBooleanValue = ((Boolean) ((Pair) ListProtector.get(this.LLILZIL, i2)).getSecond()).booleanValue();
            this.LL = 1;
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C2299308zf(i2, creativeInfo, str, null, zBooleanValue));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DownloadUtils@c1b0.downloadImages$1$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DownloadUtils@c1b0.downloadImages$1$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super UploadImageParam> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
