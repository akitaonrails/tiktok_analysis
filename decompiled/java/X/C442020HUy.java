package X;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HUy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button.ChatroomInputButtonKt$subscribeToMixStickerQuickSend$2", f = "ChatroomInputButton.kt", l = {645}, m = "invokeSuspend")
public final class C442020HUy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05YD<Boolean> LLILLJJLI;
    public final /* synthetic */ C05YD<Boolean> LLILLL;
    public final /* synthetic */ C1910890zpH LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ AtomicReference<C0P0T> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C442020HUy(C05YD<Boolean> c05yd, C05YD<Boolean> c05yd2, C1910890zpH c1910890zpH, String str, AtomicReference<C0P0T> atomicReference, InterfaceC1364105Vn<? super C442020HUy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05yd;
        this.LLILLL = c05yd2;
        this.LLILZ = c1910890zpH;
        this.LLILZIL = str;
        this.LLILZLL = atomicReference;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C442020HUy(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatroomInputButtonKt@5cca.subscribeToMixStickerQuickSend$2");
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
            C414301jJ c414301jJ = new C414301jJ(this.LLILLJJLI, this.LLILLL, new C442030HUz(this.LLILZ, this.LLILZIL, this.LLILZLL, null));
            this.LL = 1;
            if (C09IC.LJI(c414301jJ, this) == objLJFF) {
                C1C7U.LIZIZ("ChatroomInputButtonKt@5cca.subscribeToMixStickerQuickSend$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatroomInputButtonKt@5cca.subscribeToMixStickerQuickSend$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
