package X;

import Y.AgS287S0100000_6;
import com.ss.android.ugc.aweme.comment.audio.ui.recorder.CommentAudioRecordAssem;
import com.ss.android.ugc.aweme.im.business.capability.api.conflicts.BusinessCapabilityService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HyV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.audio.ui.recorder.CommentAudioRecordAssem$startObserveCapabilityConflict$1", f = "CommentAudioRecordAssem.kt", l = {261}, m = "invokeSuspend")
public final class C458530HyV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CommentAudioRecordAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C458530HyV(CommentAudioRecordAssem commentAudioRecordAssem, InterfaceC1364105Vn<? super C458530HyV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = commentAudioRecordAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C458530HyV(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0951 anonymousClass0951LJI;
        C1C7U.LIZ("CommentAudioRecordAssem@2570.startObserveCapabilityConflict$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            BusinessCapabilityService.LIZ.getClass();
            BusinessCapabilityService businessCapabilityServiceLIZ = C1355280lN8.LIZ();
            if (businessCapabilityServiceLIZ != null && (anonymousClass0951LJI = businessCapabilityServiceLIZ.LJI()) != null) {
                AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILLJJLI, 117);
                this.LL = 1;
                if (anonymousClass0951LJI.collect(agS287S0100000_6, this) == objLJFF) {
                    C1C7U.LIZIZ("CommentAudioRecordAssem@2570.startObserveCapabilityConflict$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("CommentAudioRecordAssem@2570.startObserveCapabilityConflict$1");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
