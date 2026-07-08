package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.059E, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.creationflow.publish.save.controll.EditorProPublishTask$runTaskAfterExtract$1$1", f = "EditorProPublishTask.kt", l = {}, m = "invokeSuspend")
public final class C059E extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ InterfaceC1456360o0A LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C059E(InterfaceC1456360o0A interfaceC1456360o0A, InterfaceC1364105Vn<? super C059E> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1456360o0A;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C059E(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProPublishTask@f311.runTaskAfterExtract$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(this.LL.LIZ(Mp4ScreenVideoLoadTimeout.CONTROL));
        C1C7U.LIZIZ("EditorProPublishTask@f311.runTaskAfterExtract$1$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
