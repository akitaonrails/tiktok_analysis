package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01pF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.link.LinkPrivacyNoticeController$updatePopupStatus$2", f = "LinkPrivacyNoticeController.kt", l = {295}, m = "invokeSuspend")
public final class C451101pF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C451201pG LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C451101pF(C451201pG c451201pG, InterfaceC1364105Vn<? super C451101pF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c451201pG;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C451101pF(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object obj2;
        C1C7U.LIZ("LinkPrivacyNoticeController@c451.updatePopupStatus$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                AbstractC19484711Kz<BaseResponse> abstractC19484711KzLJ = this.LLILLJJLI.LJ.LJ(true);
                this.LL = 1;
                if (C11UD.LIZIZ(abstractC19484711KzLJ, this) == objLJFF) {
                    C1C7U.LIZIZ("LinkPrivacyNoticeController@c451.updatePopupStatus$2");
                    return objLJFF;
                }
            }
            C451201pG.LJII.getValue().storeBoolean(this.LLILLJJLI.LIZLLL, true);
            C451501pJ c451501pJ = C451501pJ.LIZ;
            String str = this.LLILLJJLI.LIZLLL;
            c451501pJ.getClass();
            ((Keva) C451501pJ.LIZIZ.getValue()).storeBoolean(str, true);
            z = true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("@LinkRelation", "update status fail", th);
            z = false;
        }
        Pair[] pairArr = new Pair[2];
        String str2 = "1";
        if (z) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[0] = new Pair("result", obj2);
        if (!this.LLILLJJLI.LIZIZ) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("is_sharer", str2);
        C20684815ws.LJIILLIIL("update_link_popup_status", C2097608Jq.LJIIIIZZ(pairArr));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LinkPrivacyNoticeController@c451.updatePopupStatus$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
