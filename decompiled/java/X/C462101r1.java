package X;

import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01r1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer$initAgeRestrictedView$1", f = "BasePreviewSettingMainFragmentSheetInitializer.kt", l = {704}, m = "invokeSuspend")
public final class C462101r1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BasePreviewSettingMainFragmentSheetInitializer LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ C16F5 LLILZ;
    public final /* synthetic */ C16F5 LLILZIL;
    public final /* synthetic */ View LLILZLL;
    public final /* synthetic */ C20743716Ff LLIZ;
    public final /* synthetic */ LiveIconView LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C462101r1(BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer, View view, C16F5 c16f5, C16F5 c16f52, View view2, C20743716Ff c20743716Ff, LiveIconView liveIconView, InterfaceC1364105Vn<? super C462101r1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = basePreviewSettingMainFragmentSheetInitializer;
        this.LLILLL = view;
        this.LLILZ = c16f5;
        this.LLILZIL = c16f52;
        this.LLILZLL = view2;
        this.LLIZ = c20743716Ff;
        this.LLIZLLLIL = liveIconView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C462101r1(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01da  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C462101r1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
