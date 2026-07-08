package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tex, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.broadcast.bgbroadcast.LiveGameSmallCommentView$handleAutoDismiss$1", f = "LiveGameSmallCommentView.kt", l = {173}, m = "invokeSuspend")
public final class C752170Tex extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C752190Tez LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C752170Tex(C752190Tez c752190Tez, InterfaceC1364105Vn<? super C752170Tex> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c752190Tez;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C752170Tex(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Boolean boolValueOf;
        InterfaceC752180Tey smallMoreView;
        C1C7U.LIZ("LiveGameSmallCommentView@5031.handleAutoDismiss$1");
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
            long j = this.LLILLJJLI.LLJILJIL;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("LiveGameSmallCommentView@5031.handleAutoDismiss$1");
                return objLJFF;
            }
        }
        InterfaceC752180Tey smallMoreView2 = this.LLILLJJLI.getSmallMoreView();
        if (smallMoreView2 != null) {
            boolValueOf = Boolean.valueOf(smallMoreView2.LIZJ());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf) && (smallMoreView = this.LLILLJJLI.getSmallMoreView()) != null) {
            smallMoreView.LIZIZ(false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveGameSmallCommentView@5031.handleAutoDismiss$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
