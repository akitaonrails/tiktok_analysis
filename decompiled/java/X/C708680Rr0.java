package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.translation.service.IAutoDubbingService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Rr0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.translation.statemachine.aweme.TranslationStateMachine$subscribeToIndividualSettingsChanges$3", f = "TranslationStateMachine.kt", l = {212}, m = "invokeSuspend")
public final class C708680Rr0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C207118162y LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C708680Rr0(C207118162y c207118162y, InterfaceC1364105Vn<? super C708680Rr0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c207118162y;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C708680Rr0(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TranslationStateMachine@b563.subscribeToIndividualSettingsChanges$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            final C259800zU c259800zU = new C259800zU();
            final C207118162y c207118162y = this.LLILLJJLI;
            C2252321DDq c2252321DDq = c207118162y.LJIJJ.LJI;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0Rqz
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Aweme aweme;
                    C0S5O c0s5o = (C0S5O) obj2;
                    if (c0s5o != null) {
                        boolean z = c0s5o.LIZIZ;
                        if (!Intrinsics.LJFF(Boolean.valueOf(z), c259800zU.element)) {
                            c259800zU.element = (T) Boolean.valueOf(z);
                            IAutoDubbingService iAutoDubbingServiceLIZ = C0RT5.LIZ();
                            if (iAutoDubbingServiceLIZ != null) {
                                VideoItemParams videoItemParams = c207118162y.LJI;
                                if (videoItemParams != null) {
                                    aweme = videoItemParams.getAweme();
                                } else {
                                    aweme = null;
                                }
                                iAutoDubbingServiceLIZ.LJ(aweme);
                            }
                        }
                        return Unit.LIZ;
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (c2252321DDq.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("TranslationStateMachine@b563.subscribeToIndividualSettingsChanges$3");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
