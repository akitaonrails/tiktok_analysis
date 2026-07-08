package X;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0HUz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button.ChatroomInputButtonKt$subscribeToMixStickerQuickSend$2$1", f = "ChatroomInputButton.kt", l = {}, m = "invokeSuspend")
public final class C442030HUz extends C09AX implements InterfaceC1631620sYq<Boolean, Boolean, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ boolean LL;
    public /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C1910890zpH LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ AtomicReference<C0P0T> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C442030HUz(C1910890zpH c1910890zpH, String str, AtomicReference<C0P0T> atomicReference, InterfaceC1364105Vn<? super C442030HUz> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = c1910890zpH;
        this.LLILZ = str;
        this.LLILZIL = atomicReference;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatroomInputButtonKt@5cca.subscribeToMixStickerQuickSend$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = this.LL;
        boolean z2 = this.LLILLJJLI;
        if (z || !z2) {
            C1910890zpH c1910890zpH = this.LLILLL;
            String str = this.LLILZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[quick send] try hiding quick send sticker, banner status: ");
            sbLIZ.append(z);
            sbLIZ.append(", emoji status: ");
            sbLIZ.append(z2);
            c1910890zpH.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
            C0P0T c0p0t = this.LLILZIL.get();
            if (c0p0t != null) {
                c0p0t.dismiss();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatroomInputButtonKt@5cca.subscribeToMixStickerQuickSend$2$1");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Boolean bool, Boolean bool2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        C442030HUz c442030HUz = new C442030HUz(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c442030HUz.LL = zBooleanValue;
        c442030HUz.LLILLJJLI = zBooleanValue2;
        return c442030HUz.invokeSuspend(Unit.LIZ);
    }
}
