package X;

import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Mbc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.recordcontrol.RecordControlCoreComponent$removeConcatIntermediateFile$1", f = "RecordControlCoreComponent.kt", l = {}, m = "invokeSuspend")
public final class C571740Mbc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1656050tCF<T> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C571740Mbc(C1656050tCF<T> c1656050tCF, InterfaceC1364105Vn<? super C571740Mbc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1656050tCF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C571740Mbc(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordControlCoreComponent@4e10.removeConcatIntermediateFile$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Workspace workspace = this.LL.LLILZIL.mWorkspace;
        File fileLIZIZ = workspace.LIZIZ();
        if (fileLIZIZ.exists()) {
            Boolean.valueOf(fileLIZIZ.delete());
        }
        File fileLIZ = workspace.LIZ();
        if (fileLIZ.exists()) {
            fileLIZ.delete();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordControlCoreComponent@4e10.removeConcatIntermediateFile$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
