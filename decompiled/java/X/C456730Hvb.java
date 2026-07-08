package X;

import Y.AgS287S0100000_6;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hvb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.camerabtn.DefaultCameraAndAlbumButtonAbility$getIsTextEmptyStateFlow$1", f = "CameraInputVM.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C456730Hvb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C456720Hva LLILLJJLI;
    public final /* synthetic */ InterfaceC332260D0u<Boolean> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C456730Hvb(C456720Hva c456720Hva, InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC332260D0u interfaceC332260D0u) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c456720Hva;
        this.LLILLL = interfaceC332260D0u;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C456730Hvb(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultCameraAndAlbumButtonAbility@4f12.getIsTextEmptyStateFlow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0951 anonymousClass0951Kv = this.LLILLJJLI.LIZJ.Kv();
            AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILLL, 129);
            this.LL = 1;
            if (anonymousClass0951Kv.collect(agS287S0100000_6, this) == objLJFF) {
                C1C7U.LIZIZ("DefaultCameraAndAlbumButtonAbility@4f12.getIsTextEmptyStateFlow$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
