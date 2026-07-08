package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01jt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.avatarloader.impl.core.DMAvatarResManager$notifyChange$1", f = "DMAvatarResManager.kt", l = {}, m = "invokeSuspend")
public final class C417901jt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<WeakReference<InterfaceC418001ju>> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ UrlModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C417901jt(List<? extends WeakReference<InterfaceC418001ju>> list, String str, UrlModel urlModel, InterfaceC1364105Vn<? super C417901jt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = str;
        this.LLILLL = urlModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C417901jt(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMAvatarResManager@fa0.notifyChange$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<WeakReference<InterfaceC418001ju>> list = this.LL;
        String str = this.LLILLJJLI;
        UrlModel urlModel = this.LLILLL;
        Iterator<WeakReference<InterfaceC418001ju>> it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC418001ju interfaceC418001ju = it2.next().get();
            if (interfaceC418001ju != null) {
                interfaceC418001ju.LIZJ(urlModel, str);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMAvatarResManager@fa0.notifyChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
