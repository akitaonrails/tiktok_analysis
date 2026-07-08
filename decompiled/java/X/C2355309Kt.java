package X;

import android.view.View;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Kt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentSortListVM$delayLoadSplitItems$1$2", f = "CommentListAssemVM.kt", l = {1387}, m = "invokeSuspend")
public final class C2355309Kt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC2355409Ku LLILZ;
    public final /* synthetic */ C1344210l5H LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ AnonymousClass0957<CommentItemList> LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2355309Kt(C013C c013c, View view, ViewTreeObserverOnGlobalLayoutListenerC2355409Ku viewTreeObserverOnGlobalLayoutListenerC2355409Ku, C1344210l5H c1344210l5H, long j, AnonymousClass0957<? extends CommentItemList> anonymousClass0957, String str, InterfaceC1364105Vn<? super C2355309Kt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c013c;
        this.LLILLL = view;
        this.LLILZ = viewTreeObserverOnGlobalLayoutListenerC2355409Ku;
        this.LLILZIL = c1344210l5H;
        this.LLILZLL = j;
        this.LLIZ = anonymousClass0957;
        this.LLIZLLLIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2355309Kt(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentSortListVM@b6be.delayLoadSplitItems$1$2");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(200L, this) == objLJFF) {
                C1C7U.LIZIZ("CommentSortListVM@b6be.delayLoadSplitItems$1$2");
                return objLJFF;
            }
        }
        C013C c013c = this.LLILLJJLI;
        if (!c013c.element) {
            c013c.element = true;
            C786410Ut5.C3(this.LLILLL.getViewTreeObserver(), this.LLILZ);
            this.LLILZIL.LIZJ(this.LLILZLL, this.LLIZ, this.LLIZLLLIL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentSortListVM@b6be.delayLoadSplitItems$1$2");
        return unit;
    }
}
