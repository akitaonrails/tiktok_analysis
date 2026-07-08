package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09JQ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sharedar.message.handler.EffectReadyMessageHandler$loadCurrentUserAvatarAndSendToEffect$1$bitmap$1", f = "EffectReadyMessageHandler.kt", l = {107}, m = "invokeSuspend")
public final class C09JQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public int LL;
    public final /* synthetic */ C1638680skE LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09JQ(C1638680skE c1638680skE, InterfaceC1364105Vn<? super C09JQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1638680skE;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09JQ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectReadyMessageHandler@492e.loadCurrentUserAvatarAndSendToEffect$1$bitmap$1");
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
            C1638680skE c1638680skE = this.LLILLJJLI;
            this.LL = 1;
            c1638680skE.getClass();
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
            if (currentUser == null) {
                C189200o6.m2constructorimpl(null);
                c2252611DEt.resumeWith(null);
            } else {
                C1324750kZt.LJIJ(currentUser.getAvatarThumb(), 0, 0, new C515101zZ(c2252611DEt, 4));
            }
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EffectReadyMessageHandler@492e.loadCurrentUserAvatarAndSendToEffect$1$bitmap$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("EffectReadyMessageHandler@492e.loadCurrentUserAvatarAndSendToEffect$1$bitmap$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
