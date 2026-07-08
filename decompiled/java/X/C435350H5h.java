package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H5h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.shortcut.ShortcutAddGuideDialogTask$showPopup$7", f = "ShortcutAddGuideDialogTask.kt", l = {138, 139}, m = "invokeSuspend")
public final class C435350H5h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C20661615t8 LLILLL;
    public final /* synthetic */ C688120Qyw LLILZ;
    public final /* synthetic */ View LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C435350H5h(C20661615t8 c20661615t8, C688120Qyw c688120Qyw, View view, InterfaceC1364105Vn<? super C435350H5h> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c20661615t8;
        this.LLILZ = c688120Qyw;
        this.LLILZIL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C435350H5h c435350H5h = new C435350H5h(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c435350H5h.LLILLJJLI = obj;
        return c435350H5h;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1 A[Catch: all -> 0x00cc, TryCatch #0 {all -> 0x00cc, blocks: (B:21:0x0068, B:22:0x006b, B:25:0x0071, B:27:0x00a1, B:28:0x00a4, B:15:0x0052, B:16:0x0055, B:11:0x002a), top: B:33:0x000d }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C435350H5h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
