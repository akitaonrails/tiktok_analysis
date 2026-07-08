package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dsx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audio.copyrightdetect.EditAudioCopyrightDetectComponent$refreshCheckPermission$3$1", f = "EditAudioCopyrightDetectComponent.kt", l = {}, m = "invokeSuspend")
public final class C353170Dsx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C907110ZiH LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C353170Dsx(boolean z, C907110ZiH c907110ZiH, Function0<Unit> function0, InterfaceC1364105Vn<? super C353170Dsx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = c907110ZiH;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C353170Dsx(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditAudioCopyrightDetectComponent@e8b5.refreshCheckPermission$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = C856830XjN.LIZ;
        boolean z2 = this.LL;
        C856830XjN.LIZIZ = z2;
        this.LLILLJJLI.LLJJ = z2;
        Function0<Unit> function0 = this.LLILLL;
        if (function0 != null) {
            function0.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditAudioCopyrightDetectComponent@e8b5.refreshCheckPermission$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
