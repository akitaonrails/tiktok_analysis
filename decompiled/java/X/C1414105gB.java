package X;

import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05gB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.toolkit.CreatorCareModelVM$updateCareModeSetting$1", f = "CommentFiltersViewModel.kt", l = {157}, m = "invokeSuspend")
public final class C1414105gB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C1414205gC LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ Integer LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1414105gB(int i, C1414205gC c1414205gC, View view, Integer num, InterfaceC1364105Vn<? super C1414105gB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = c1414205gC;
        this.LLILZ = view;
        this.LLILZIL = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1414105gB(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJIIJ;
        String string;
        C1C7U.LIZ("CreatorCareModelVM@9468.updateCareModeSetting$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLJIIJ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1888220zEi c1888220zEi = C1888220zEi.LIZIZ;
            int i2 = this.LLILLJJLI;
            this.LL = 1;
            objLJIIJ = c1888220zEi.LJIIJ(i2, this);
            if (objLJIIJ == objLJFF) {
                C1C7U.LIZIZ("CreatorCareModelVM@9468.updateCareModeSetting$1");
                return objLJFF;
            }
        }
        C1414205gC c1414205gC = this.LLILLL;
        View view = this.LLILZ;
        if (C189200o6.m8isSuccessimpl(objLJIIJ)) {
            c1414205gC.LIZJ.setValue(false);
            String statusMsg = ((BaseResponse) objLJIIJ).getStatusMsg();
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            if (statusMsg.length() == 0) {
                statusMsg = view.getContext().getString(2131829164);
            }
            c1389890mGx.LJIIJ(statusMsg);
            c1389890mGx.LJIIJJI();
        }
        C1414205gC c1414205gC2 = this.LLILLL;
        Integer numLJ = this.LLILZIL;
        View view2 = this.LLILZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objLJIIJ);
        if (thM5exceptionOrNullimpl != null) {
            c1414205gC2.LIZJ.setValue(false);
            MutableLiveData<Integer> mutableLiveData = c1414205gC2.LIZIZ;
            if (numLJ == null) {
                numLJ = C2286608xc.LJ(0);
            }
            mutableLiveData.setValue(numLJ);
            if (thM5exceptionOrNullimpl instanceof C632200Oqw) {
                string = ((C632200Oqw) thM5exceptionOrNullimpl).getErrorMsg();
            } else {
                string = "";
            }
            if (string.length() == 0) {
                string = view2.getContext().getString(2131829163);
            }
            C1389890mGx c1389890mGx2 = new C1389890mGx(view2);
            c1389890mGx2.LJIIJ(string);
            c1389890mGx2.LJIIJJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreatorCareModelVM@9468.updateCareModeSetting$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
