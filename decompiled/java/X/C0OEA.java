package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.music.ghost.GhostMusicTabViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OEA, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.ghost.GhostMusicTabViewModel$reportGhostEntranceNotInterested$1", f = "GhostMusicViewModel.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT, LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C0OEA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GhostMusicTabViewModel LLILLJJLI;
    public final /* synthetic */ C0OEC LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OEA(GhostMusicTabViewModel ghostMusicTabViewModel, C0OEC c0oec, InterfaceC1364105Vn<? super C0OEA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = ghostMusicTabViewModel;
        this.LLILLL = c0oec;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OEA(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GhostMusicTabViewModel@a604.reportGhostEntranceNotInterested$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("GhostMusicTabViewModel@a604.reportGhostEntranceNotInterested$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC615760ODe interfaceC615760ODe = (InterfaceC615760ODe) this.LLILLJJLI.LL.getOperator();
            int value = this.LLILLL.getValue();
            this.LL = 1;
            obj = interfaceC615760ODe.k0(value);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GhostMusicTabViewModel@a604.reportGhostEntranceNotInterested$1");
                return objLJFF;
            }
        }
        Object obj2 = new InterfaceC346701Wf() { // from class: X.0OEB
            @Override // X.InterfaceC346701Wf
            public final Object emit(Object obj3, InterfaceC1364105Vn interfaceC1364105Vn) {
                if (!(obj3 instanceof C0O79)) {
                    if (obj3 instanceof C0O7B) {
                        C1AF0.LIZJ("reportCloseGhostMusicTab error");
                    } else {
                        throw new C1954807lC();
                    }
                }
                return Unit.LIZ;
            }
        };
        this.LL = 2;
        if (((InterfaceC346201Wa) obj).collect(obj2, this) == objLJFF) {
            C1C7U.LIZIZ("GhostMusicTabViewModel@a604.reportGhostEntranceNotInterested$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GhostMusicTabViewModel@a604.reportGhostEntranceNotInterested$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
