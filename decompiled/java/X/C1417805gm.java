package X;

import android.content.Context;
import android.util.Size;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05gm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.data.MediaProvider$warmUpFirstScreenAssetsSuspend$3", f = "MediaProvider.kt", l = {}, m = "invokeSuspend")
public final class C1417805gm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ List<SocMediaResource> LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ Size LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1417805gm(List<SocMediaResource> list, Context context, Size size, boolean z, InterfaceC1364105Vn<? super C1417805gm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = context;
        this.LLILZ = size;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1417805gm c1417805gm = new C1417805gm(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1417805gm.LL = obj;
        return c1417805gm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediaProvider@7017.warmUpFirstScreenAssetsSuspend$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        List<SocMediaResource> list = this.LLILLJJLI;
        Context context = this.LLILLL;
        Size size = this.LLILZ;
        boolean z = this.LLILZIL;
        Iterator<SocMediaResource> it2 = list.iterator();
        while (it2.hasNext()) {
            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1417905gn(context, it2.next(), size, z, null), 3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediaProvider@7017.warmUpFirstScreenAssetsSuspend$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
