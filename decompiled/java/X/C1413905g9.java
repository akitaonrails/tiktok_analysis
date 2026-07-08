package X;

import android.app.Activity;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.toolkit.keywords.CommentKeywordsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05g9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.toolkit.keywords.CommentKeywordsVM$upload$1$1", f = "CommentKeywordsVM.kt", l = {151}, m = "invokeSuspend")
public final class C1413905g9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Activity LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1413905g9(Activity activity, InterfaceC1364105Vn<? super C1413905g9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1413905g9(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJ;
        String errorMsg;
        C1C7U.LIZ("CommentKeywordsVM@44f8.upload$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLJ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1888220zEi c1888220zEi = C1888220zEi.LIZIZ;
            this.LL = 1;
            objLJ = c1888220zEi.LJ(2, this);
            if (objLJ == objLJFF) {
                C1C7U.LIZIZ("CommentKeywordsVM@44f8.upload$1$1");
                return objLJFF;
            }
        }
        Activity activity = this.LLILLJJLI;
        if (C189200o6.m8isSuccessimpl(objLJ) && activity != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIIZ(2131829164);
            c1389890mGx.LJIIJJI();
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objLJ);
        if (thM5exceptionOrNullimpl != null) {
            if (thM5exceptionOrNullimpl instanceof C632200Oqw) {
                errorMsg = ((C632200Oqw) thM5exceptionOrNullimpl).getErrorMsg();
            } else {
                errorMsg = "";
            }
            CommentKeywordsVM.vQ2(errorMsg);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentKeywordsVM@44f8.upload$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
