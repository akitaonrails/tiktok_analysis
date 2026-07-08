package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01pE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.link.DisplayProfileSettingFloatingNoticeController$updatePopupStatus$2", f = "DisplayProfileSettingFloatingNoticeController.kt", l = {77}, m = "invokeSuspend")
public final class C451001pE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C451001pE(InterfaceC1364105Vn<? super C451001pE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C451001pE(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String str;
        C1C7U.LIZ("DisplayProfileSettingFloatingNoticeController@17ec.updatePopupStatus$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C451701pL.LIZ.getClass();
                AbstractC19484711Kz<BaseResponse> abstractC19484711KzLJ = ((C1234230iDt) C451701pL.LIZLLL.getValue()).LJ(true);
                this.LL = 1;
                if (C11UD.LIZIZ(abstractC19484711KzLJ, this) == objLJFF) {
                    C1C7U.LIZIZ("DisplayProfileSettingFloatingNoticeController@17ec.updatePopupStatus$2");
                    return objLJFF;
                }
            }
            z = true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("DisplayProfileSettingFloatingNoticeController", "update status fail", th);
            z = false;
        }
        Pair[] pairArr = new Pair[2];
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[0] = new Pair("result", str);
        pairArr[1] = new Pair("is_sharer", "1");
        C20684815ws.LJIILLIIL("update_link_popup_status", C2097608Jq.LJIIIIZZ(pairArr));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DisplayProfileSettingFloatingNoticeController@17ec.updatePopupStatus$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C451001pE(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
