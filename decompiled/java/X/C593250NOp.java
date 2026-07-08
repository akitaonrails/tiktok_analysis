package X;

import com.ss.android.ugc.aweme.im.messagelist.api.database.IAwemeEffectRepository;
import com.ss.android.ugc.aweme.im.messagelist.database.AwemeManageServiceImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NOp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.database.AwemeManageServiceImpl$onLoadOlder$1", f = "AwemeManageServiceImpl.kt", l = {261}, m = "invokeSuspend")
public final class C593250NOp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AwemeManageServiceImpl LLILLJJLI;
    public final /* synthetic */ List<C0NPC> LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593250NOp(AwemeManageServiceImpl awemeManageServiceImpl, List<C0NPC> list, String str, InterfaceC1364105Vn<? super C593250NOp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = awemeManageServiceImpl;
        this.LLILLL = list;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C593250NOp(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IAwemeEffectRepository iAwemeEffectRepository;
        C1C7U.LIZ("AwemeManageServiceImpl@876f.onLoadOlder$1");
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
            AwemeManageServiceImpl awemeManageServiceImpl = this.LLILLJJLI;
            List<C0NPC> list = this.LLILLL;
            this.LL = 1;
            if (awemeManageServiceImpl.LIZ(list, this) == objLJFF) {
                C1C7U.LIZIZ("AwemeManageServiceImpl@876f.onLoadOlder$1");
                return objLJFF;
            }
        }
        String str = this.LLILZ;
        if (str != null && (iAwemeEffectRepository = (IAwemeEffectRepository) this.LLILLJJLI.LIZIZ.getValue()) != null) {
            iAwemeEffectRepository.LJI(str);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AwemeManageServiceImpl@876f.onLoadOlder$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
