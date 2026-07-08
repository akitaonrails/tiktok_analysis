package X;

import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.aigc.invite.IMServiceImpl;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18h2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.invite.IMServiceImpl$showSheet$1$3$1$1", f = "IMServiceImpl.kt", l = {245, 250}, m = "invokeSuspend")
public final class C21351018h2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IMServiceImpl LLILLJJLI;
    public final /* synthetic */ C21350518gx LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C197039127h LLILZIL;
    public final /* synthetic */ AIGCSocialModel LLILZLL;
    public final /* synthetic */ TuxSheet LLIZ;
    public final /* synthetic */ View LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21351018h2(IMServiceImpl iMServiceImpl, C21350518gx c21350518gx, String str, C197039127h c197039127h, AIGCSocialModel aIGCSocialModel, TuxSheet tuxSheet, View view, InterfaceC1364105Vn<? super C21351018h2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMServiceImpl;
        this.LLILLL = c21350518gx;
        this.LLILZ = str;
        this.LLILZIL = c197039127h;
        this.LLILZLL = aIGCSocialModel;
        this.LLIZ = tuxSheet;
        this.LLIZLLLIL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21351018h2(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJI = obj;
        C1C7U.LIZ("IMServiceImpl@7354.showSheet$1$3$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJI);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("IMServiceImpl@7354.showSheet$1$3$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLJI);
        } else {
            C155000ia.LIZIZ(objLJI);
            IMServiceImpl iMServiceImpl = this.LLILLJJLI;
            C21350518gx c21350518gx = this.LLILLL;
            String str = c21350518gx.LIZ;
            String str2 = this.LLILZ;
            Map<String, ? extends Object> map = c21350518gx.LJIIJJI;
            this.LL = 1;
            objLJI = iMServiceImpl.LJI(str, str2, map, this);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("IMServiceImpl@7354.showSheet$1$3$1$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C21351118h3 c21351118h3 = new C21351118h3(this.LLILZIL, (BaseTemplate) objLJI, this.LLILLJJLI, this.LLILZLL, this.LLILLL, this.LLIZ, this.LLIZLLLIL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c21351118h3) == objLJFF) {
            C1C7U.LIZIZ("IMServiceImpl@7354.showSheet$1$3$1$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMServiceImpl@7354.showSheet$1$3$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
