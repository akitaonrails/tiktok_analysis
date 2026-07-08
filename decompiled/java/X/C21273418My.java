package X;

import android.content.ComponentCallbacks2;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.AnchorCommonViewModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.ecommerce.debug.IEComOfflineService;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18My, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.view.ECommerceCustomSingleAnchorBusiness$bindData$1", f = "ECommerceCustomSingleAnchorBusiness.kt", l = {}, m = "invokeSuspend")
public final class C21273418My extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C21273118Mv LL;
    public final /* synthetic */ AnchorCommonStruct LLILLJJLI;
    public final /* synthetic */ InterfaceC1392640mLO LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21273418My(C21273118Mv c21273118Mv, AnchorCommonStruct anchorCommonStruct, InterfaceC1392640mLO interfaceC1392640mLO, boolean z, int i, InterfaceC1364105Vn<? super C21273418My> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c21273118Mv;
        this.LLILLJJLI = anchorCommonStruct;
        this.LLILLL = interfaceC1392640mLO;
        this.LLILZ = z;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21273418My(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnchorCommonViewModel anchorCommonViewModel;
        InterfaceC21275218Nq c18nu;
        ViewModelStoreOwner viewModelStoreOwner;
        C1C7U.LIZ("ECommerceCustomSingleAnchorBusiness@c96.bindData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Aweme awemeLJJLIIIJJIZ = null;
        this.LL.LLILLJJLI.IQ2(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, null);
        C21273118Mv c21273118Mv = this.LL;
        ComponentCallbacks2 componentCallbacks2LIZ = C1388190mED.LIZ(c21273118Mv.LL.getContext());
        Aweme awemeLJJLIIIJJIZ2 = null;
        if ((componentCallbacks2LIZ instanceof ViewModelStoreOwner) && (viewModelStoreOwner = (ViewModelStoreOwner) componentCallbacks2LIZ) != null) {
            String aid = this.LLILLL.LJJLIIIJJIZ().getAid();
            if (aid == null) {
                aid = "";
            }
            anchorCommonViewModel = (AnchorCommonViewModel) new ViewModelProvider(viewModelStoreOwner, new C20154413tW(aid)).get(AnchorCommonViewModel.class);
        } else {
            anchorCommonViewModel = null;
        }
        c21273118Mv.LLILLL = anchorCommonViewModel;
        C21273118Mv c21273118Mv2 = this.LL;
        C21272618Mq c21272618Mq = C21272618Mq.LIZ;
        InterfaceC1392640mLO interfaceC1392640mLO = c21273118Mv2.LLILLJJLI.LL;
        if (interfaceC1392640mLO != null) {
            awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
        }
        c21272618Mq.getClass();
        if (C21272618Mq.LIZIZ(awemeLJJLIIIJJIZ)) {
            InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL.LLILLJJLI.LL;
            if (interfaceC1392640mLO2 != null) {
                awemeLJJLIIIJJIZ2 = interfaceC1392640mLO2.LJJLIIIJJIZ();
            }
            boolean zLJ = C21272618Mq.LJ(awemeLJJLIIIJJIZ2);
            AnchorBizUtils.LIZ.getClass();
            boolean zLIZ = C770702zh.LIZ(AnchorBizUtils.LJJIJL(awemeLJJLIIIJJIZ2));
            if (!zLJ && !zLIZ) {
                C21273118Mv c21273118Mv3 = this.LL;
                c18nu = new C18NU(c21273118Mv3.LL, c21273118Mv3.LLILLJJLI, c21273118Mv3.LLILLL);
            } else {
                C21273118Mv c21273118Mv4 = this.LL;
                c18nu = new C18NQ(c21273118Mv4.LL, c21273118Mv4.LLILLJJLI, c21273118Mv4.LLILLL);
            }
        } else {
            C21273118Mv c21273118Mv5 = this.LL;
            c18nu = new C18NU(c21273118Mv5.LL, c21273118Mv5.LLILLJJLI, c21273118Mv5.LLILLL);
        }
        c21273118Mv2.LLIZ = c18nu;
        InterfaceC21275218Nq interfaceC21275218Nq = this.LL.LLIZ;
        if (interfaceC21275218Nq != null) {
            interfaceC21275218Nq.LIZIZ();
        }
        InterfaceC21275218Nq interfaceC21275218Nq2 = this.LL.LLIZ;
        if (interfaceC21275218Nq2 != null) {
            interfaceC21275218Nq2.onInit();
        }
        C21273118Mv c21273118Mv6 = this.LL;
        AnchorCommonStruct anchorCommonStruct = this.LLILLJJLI;
        InterfaceC1392640mLO interfaceC1392640mLO3 = this.LLILLL;
        c21273118Mv6.getClass();
        IEComOfflineService iEComOfflineService = (IEComOfflineService) ServiceManager.get().getService(IEComOfflineService.class);
        HashMap map = new HashMap();
        InterfaceC21275218Nq interfaceC21275218Nq3 = c21273118Mv6.LLIZ;
        if (interfaceC21275218Nq3 != null) {
            map.put("strategy", String.valueOf(C13LE.LIZ(interfaceC21275218Nq3.getClass()).LJI()));
        }
        map.put("anchor", C1741890vQh.LJIIIIZZ(anchorCommonStruct));
        map.put("event_type", interfaceC1392640mLO3.Cf());
        map.put("author_id", AwemeExtKt.getAuthorUid(interfaceC1392640mLO3.LJJLIIIJJIZ()));
        map.put("video_id", interfaceC1392640mLO3.LJJLIIIJJIZ().getAid());
        iEComOfflineService.LIZLLL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECommerceCustomSingleAnchorBusiness@c96.bindData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
