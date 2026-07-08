package X;

import android.view.View;
import android.widget.CompoundButton;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ijr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.locationservice.ShowLocationUtil$initLocationSwitchInterval$2$clickListener$1$onClick$1", f = "ShowLocationUtil.kt", l = {272}, m = "invokeSuspend")
public final class C474930Ijr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ CompoundButton LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C259800zU<C474990Ijx> LLILZIL;
    public final /* synthetic */ DataChannel LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C474930Ijr(View view, CompoundButton compoundButton, boolean z, C259800zU<C474990Ijx> c259800zU, DataChannel dataChannel, InterfaceC1364105Vn<? super C474930Ijr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = view;
        this.LLILLL = compoundButton;
        this.LLILZ = z;
        this.LLILZIL = c259800zU;
        this.LLILZLL = dataChannel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C474930Ijr(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f9  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C474930Ijr.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
