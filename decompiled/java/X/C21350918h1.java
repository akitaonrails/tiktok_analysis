package X;

import android.content.Context;
import com.ss.android.ugc.aweme.aigc.invite.IMServiceImpl;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18h1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.invite.IMServiceImpl$showDialog$2$1$2", f = "IMServiceImpl.kt", l = {140, 145}, m = "invokeSuspend")
public final class C21350918h1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IMServiceImpl LLILLJJLI;
    public final /* synthetic */ C21350518gx LLILLL;
    public final /* synthetic */ MentionDataItem LLILZ;
    public final /* synthetic */ C1397620mTQ LLILZIL;
    public final /* synthetic */ Context LLILZLL;
    public final /* synthetic */ AIGCSocialModel LLIZ;
    public final /* synthetic */ C1397660mTU LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21350918h1(IMServiceImpl iMServiceImpl, C21350518gx c21350518gx, MentionDataItem mentionDataItem, C1397620mTQ c1397620mTQ, Context context, AIGCSocialModel aIGCSocialModel, C1397660mTU c1397660mTU, InterfaceC1364105Vn<? super C21350918h1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMServiceImpl;
        this.LLILLL = c21350518gx;
        this.LLILZ = mentionDataItem;
        this.LLILZIL = c1397620mTQ;
        this.LLILZLL = context;
        this.LLIZ = aIGCSocialModel;
        this.LLIZLLLIL = c1397660mTU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21350918h1(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object objLJI = obj;
        C1C7U.LIZ("IMServiceImpl@7354.showDialog$2$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJI);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("IMServiceImpl@7354.showDialog$2$1$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLJI);
        } else {
            C155000ia.LIZIZ(objLJI);
            IMServiceImpl iMServiceImpl = this.LLILLJJLI;
            C21350518gx c21350518gx = this.LLILLL;
            String str2 = c21350518gx.LIZ;
            MentionDataItem mentionDataItem = this.LLILZ;
            if (mentionDataItem != null) {
                str = mentionDataItem.uid;
            } else {
                str = null;
            }
            Map<String, ? extends Object> map = c21350518gx.LJIIJJI;
            this.LL = 1;
            objLJI = iMServiceImpl.LJI(str2, str, map, this);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("IMServiceImpl@7354.showDialog$2$1$2");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C21350818h0 c21350818h0 = new C21350818h0(this.LLILZIL, (BaseTemplate) objLJI, this.LLILLJJLI, this.LLILZLL, this.LLIZ, this.LLILLL, this.LLIZLLLIL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c21350818h0) == objLJFF) {
            C1C7U.LIZIZ("IMServiceImpl@7354.showDialog$2$1$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMServiceImpl@7354.showDialog$2$1$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
