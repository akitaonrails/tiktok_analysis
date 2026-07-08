package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.PreviewBulletinEditWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Po, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.PreviewBulletinEditWidget$enterDecorationEditFromScheme$1", f = "PreviewBulletinEditWidget.kt", l = {}, m = "invokeSuspend")
public final class C329401Po extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PreviewBulletinEditWidget LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329401Po(long j, PreviewBulletinEditWidget previewBulletinEditWidget, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = previewBulletinEditWidget;
        this.LLILLJJLI = j;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C329401Po(this.LLILLJJLI, this.LL, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PreviewBulletinEditWidget@2c55.enterDecorationEditFromScheme$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PreviewBulletinEditWidget previewBulletinEditWidget = this.LL;
        C23250099c.LIZLLL(previewBulletinEditWidget.LLJILLL, C0PEM.LIZJ, null, new C329301Pn(this.LLILLJJLI, previewBulletinEditWidget, this.LLILLL, null), 2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreviewBulletinEditWidget@2c55.enterDecorationEditFromScheme$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
