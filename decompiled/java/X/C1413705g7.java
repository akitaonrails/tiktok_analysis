package X;

import android.view.View;
import androidx.lifecycle.MutableLiveData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05g7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.toolkit.CommentAIFilterVM$updateCommentAIFilterSetting$1", f = "CommentFiltersViewModel.kt", l = {76}, m = "invokeSuspend")
public final class C1413705g7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C1413805g8 LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ Integer LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1413705g7(int i, C1413805g8 c1413805g8, View view, Integer num, InterfaceC1364105Vn<? super C1413705g7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = c1413805g8;
        this.LLILZ = view;
        this.LLILZIL = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1413705g7(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJIIIIZZ;
        String string;
        C1C7U.LIZ("CommentAIFilterVM@7585.updateCommentAIFilterSetting$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLJIIIIZZ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1888220zEi c1888220zEi = C1888220zEi.LIZIZ;
            int i2 = this.LLILLJJLI;
            this.LL = 1;
            objLJIIIIZZ = c1888220zEi.LJIIIIZZ(i2, this);
            if (objLJIIIIZZ == objLJFF) {
                C1C7U.LIZIZ("CommentAIFilterVM@7585.updateCommentAIFilterSetting$1");
                return objLJFF;
            }
        }
        C1413805g8 c1413805g8 = this.LLILLL;
        View view = this.LLILZ;
        if (C189200o6.m8isSuccessimpl(objLJIIIIZZ)) {
            c1413805g8.LIZJ.setValue(false);
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJIIIZ(2131829164);
            c1389890mGx.LJIIJJI();
        }
        C1413805g8 c1413805g82 = this.LLILLL;
        Integer numLJ = this.LLILZIL;
        View view2 = this.LLILZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objLJIIIIZZ);
        if (thM5exceptionOrNullimpl != null) {
            c1413805g82.LIZJ.setValue(false);
            MutableLiveData<Integer> mutableLiveData = c1413805g82.LIZIZ;
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
        C1C7U.LIZIZ("CommentAIFilterVM@7585.updateCommentAIFilterSetting$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
