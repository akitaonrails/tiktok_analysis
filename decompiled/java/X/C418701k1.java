package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.MultiPreviewInviteGuestWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveInviteGuestViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01k1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.MultiPreviewInviteGuestWidget$initObserver$3", f = "MultiPreviewInviteGuestWidget.kt", l = {118}, m = "invokeSuspend")
public final class C418701k1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MultiPreviewInviteGuestWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C418701k1(MultiPreviewInviteGuestWidget multiPreviewInviteGuestWidget, InterfaceC1364105Vn<? super C418701k1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = multiPreviewInviteGuestWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C418701k1(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiPreviewInviteGuestWidget@47f5.initObserver$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0951 anonymousClass0951 = ((LiveInviteGuestViewModel) this.LLILLJJLI.LLIZLLLIL.getValue()).LLILLJJLI;
            C517001zs c517001zs = new C517001zs(this.LLILLJJLI, 17);
            this.LL = 1;
            if (anonymousClass0951.collect(c517001zs, this) == objLJFF) {
                C1C7U.LIZIZ("MultiPreviewInviteGuestWidget@47f5.initObserver$3");
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
