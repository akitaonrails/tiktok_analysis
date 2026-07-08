package X;

import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ugc.aweme.tako.camera.record.TakoRecordCoreViewModel;
import com.ss.android.ugc.aweme.tako.camera.record.pageui.TakoRecordUIAssem;
import com.ss.android.vesdk.VERecorder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AOH, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AOH extends C09AY implements Function0<Unit> {
    public final /* synthetic */ TakoRecordUIAssem LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AOH(TakoRecordUIAssem takoRecordUIAssem, boolean z, boolean z2) {
        super(0);
        this.LL = takoRecordUIAssem;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        TakoRecordCoreViewModel takoRecordCoreViewModelLp = this.LL.lp();
        final C0OHS c0ohs = new C0OHS(this.LL, this.LLILLJJLI, this.LLILLL);
        C578870Mn7 c578870Mn7 = new C578870Mn7();
        C1AO8 c1ao8 = C1AO8.NORMAL_GET_FRAME_MODE;
        C2254411DLr c2254411DLr = c578870Mn7.LIZ;
        c2254411DLr.LIZ = c1ao8;
        c2254411DLr.LJ = EnumC578750Mmv.NO_EFFECT;
        c2254411DLr.LJI = EnumC1780180wQS.CENTER_INSIDE;
        c2254411DLr.LIZIZ = takoRecordCoreViewModelLp.LLIZLLLIL;
        c2254411DLr.LJII = new C1AO7() { // from class: X.1AOI
            @Override // X.C1AO7
            public final /* synthetic */ void LIZ(int i, int i2, int[] iArr) {
            }

            @Override // X.C1AO7
            public final /* synthetic */ void onResult(int i) {
            }

            @Override // X.C1AO7
            public final void LIZIZ(VEFrame vEFrame, int i) {
                c0ohs.invoke(vEFrame, Integer.valueOf(i));
            }
        };
        VERecorder vERecorder = takoRecordCoreViewModelLp.LL;
        if (vERecorder != null) {
            vERecorder.LJIIJJI(c2254411DLr);
        }
        return Unit.LIZ;
    }
}
