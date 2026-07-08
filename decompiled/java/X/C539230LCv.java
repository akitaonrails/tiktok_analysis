package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LCv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.AutoCutComponent$deliverRecommendMusicList$1", f = "AutoCutComponent.kt", l = {1850}, m = "invokeSuspend")
public final class C539230LCv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<AutoCutThemeData> LLILLJJLI;
    public final /* synthetic */ InterfaceC1418260n0i LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Scene LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C539230LCv(List<AutoCutThemeData> list, InterfaceC1418260n0i interfaceC1418260n0i, String str, Scene scene, boolean z, InterfaceC1364105Vn<? super C539230LCv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = interfaceC1418260n0i;
        this.LLILZ = str;
        this.LLILZIL = scene;
        this.LLILZLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C539230LCv(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoCutComponent@2715.deliverRecommendMusicList$1");
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
            C539210LCt c539210LCt = C539210LCt.LIZ;
            List<AutoCutThemeData> list = this.LLILLJJLI;
            this.LL = 1;
            obj = c539210LCt.LIZ(list, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AutoCutComponent@2715.deliverRecommendMusicList$1");
                return objLJFF;
            }
        }
        List<AutoCutThemeData> list2 = (List) obj;
        InterfaceC1418260n0i interfaceC1418260n0i = this.LLILLL;
        if (interfaceC1418260n0i != null) {
            interfaceC1418260n0i.LJII(list2, this.LLILZ, this.LLILZIL, this.LLILZLL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoCutComponent@2715.deliverRecommendMusicList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
