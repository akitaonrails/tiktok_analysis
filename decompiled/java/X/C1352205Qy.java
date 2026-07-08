package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Qy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.link.feed.SharedInviteDialogController$shareMessageViewNew$1$4$1", f = "SharedInviteDialogController.kt", l = {687}, m = "invokeSuspend")
public final class C1352205Qy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C1242590iRN LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1352205Qy(long j, C1242590iRN c1242590iRN, InterfaceC1364105Vn<? super C1352205Qy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c1242590iRN;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1352205Qy(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SharedInviteDialogController@a3f5.shareMessageViewNew$1$4$1");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("SharedInviteDialogController@a3f5.shareMessageViewNew$1$4$1");
                return objLJFF;
            }
        }
        C1397510mTF c1397510mTF = this.LLILLL.LIZJ;
        if (c1397510mTF == null) {
            c1397510mTF = null;
        }
        c1397510mTF.LIZIZ("video_play_after_follow");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SharedInviteDialogController@a3f5.shareMessageViewNew$1$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
