package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.toolkit.CommentFiltersViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05gD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.toolkit.CommentFiltersViewModel$fetchUserSettings$1", f = "CommentFiltersViewModel.kt", l = {35}, m = "invokeSuspend")
public final class C1414305gD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CommentFiltersViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1414305gD(CommentFiltersViewModel commentFiltersViewModel, InterfaceC1364105Vn<? super C1414305gD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = commentFiltersViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1414305gD(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJIIIZ;
        boolean z;
        boolean z2;
        Integer numLJ;
        Integer numLJ2;
        C1C7U.LIZ("CommentFiltersViewModel@7ae0.fetchUserSettings$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLJIIIZ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1888220zEi c1888220zEi = C1888220zEi.LIZIZ;
            this.LL = 1;
            objLJIIIZ = c1888220zEi.LJIIIZ(this);
            if (objLJIIIZ == objLJFF) {
                C1C7U.LIZIZ("CommentFiltersViewModel@7ae0.fetchUserSettings$1");
                return objLJFF;
            }
        }
        CommentFiltersViewModel commentFiltersViewModel = this.LLILLJJLI;
        if (C189200o6.m8isSuccessimpl(objLJIIIZ)) {
            C1414405gE c1414405gE = (C1414405gE) objLJIIIZ;
            int i2 = c1414405gE.LIZ;
            Integer value = commentFiltersViewModel.LL.LIZIZ.getValue();
            if (value == null || i2 != value.intValue()) {
                commentFiltersViewModel.LL.LIZIZ.setValue(C2286608xc.LJ(c1414405gE.LIZ));
            }
            boolean z3 = c1414405gE.LIZIZ;
            Integer value2 = commentFiltersViewModel.LLILLJJLI.LIZIZ.getValue();
            if (value2 != null && value2.intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z3 != z) {
                MutableLiveData<Integer> mutableLiveData = commentFiltersViewModel.LLILLJJLI.LIZIZ;
                if (c1414405gE.LIZIZ) {
                    numLJ2 = C2286608xc.LJ(1);
                } else {
                    numLJ2 = C2286608xc.LJ(0);
                }
                mutableLiveData.setValue(numLJ2);
            }
            boolean z4 = c1414405gE.LIZJ;
            Integer value3 = commentFiltersViewModel.LLILLL.LIZIZ.getValue();
            if (value3 != null && value3.intValue() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z4 != z2) {
                MutableLiveData<Integer> mutableLiveData2 = commentFiltersViewModel.LLILLL.LIZIZ;
                if (c1414405gE.LIZJ) {
                    numLJ = C2286608xc.LJ(1);
                } else {
                    numLJ = C2286608xc.LJ(0);
                }
                mutableLiveData2.setValue(numLJ);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentFiltersViewModel@7ae0.fetchUserSettings$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
