package X;

import Y.AgS196S0200000_5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ErG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.EditorProAIGCComponent$restoreTaskSlotAssociations$1", f = "EditorProAIGCComponent.kt", l = {1449}, m = "invokeSuspend")
public final class C377600ErG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C377590ErF LLILLJJLI;
    public final /* synthetic */ VideoPublishEditModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C377600ErG(C377590ErF c377590ErF, VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super C377600ErG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c377590ErF;
        this.LLILLL = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C377600ErG(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProAIGCComponent@c6d2.restoreTaskSlotAssociations$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC346201Wa<List<C381540Exc>> interfaceC346201WaLIZ = this.LLILLJJLI.v5().LIZ(this.LLILLJJLI.getCreationId());
                AgS196S0200000_5 agS196S0200000_5 = new AgS196S0200000_5(this.LLILLJJLI, this.LLILLL, 0);
                this.LL = 1;
                if (interfaceC346201WaLIZ.collect(agS196S0200000_5, this) == objLJFF) {
                    C1C7U.LIZIZ("EditorProAIGCComponent@c6d2.restoreTaskSlotAssociations$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C385300F8u c385300F8u = C385300F8u.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Error restoring task-slot associations: ");
            sbLIZ.append(e.getMessage());
            C201955140j.LJIIIIZZ(c385300F8u, "EditorProAIGCComponent", C2188811AlT.LIZIZ(sbLIZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditorProAIGCComponent@c6d2.restoreTaskSlotAssociations$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
