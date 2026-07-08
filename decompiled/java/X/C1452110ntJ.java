package X;

import androidx.lifecycle.MutableLiveData;
import dmt.av.video.VEPreviewMusicParams;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ntJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.preview.BaseTTEditPreviewComponent$changeMusic$1$1", f = "TiktokEditPreviewComponent.kt", l = {}, m = "invokeSuspend")
public final class C1452110ntJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1452090ntH<T> LL;
    public final /* synthetic */ VEPreviewMusicParams LLILLJJLI;
    public final /* synthetic */ List<VEPreviewMusicParams> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1452110ntJ(C1452090ntH<T> c1452090ntH, VEPreviewMusicParams vEPreviewMusicParams, List<? extends VEPreviewMusicParams> list, InterfaceC1364105Vn<? super C1452110ntJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1452090ntH;
        this.LLILLJJLI = vEPreviewMusicParams;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1452110ntJ(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseTTEditPreviewComponent@89f0.changeMusic$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        super/*X.0nzN*/.JA2(this.LLILLJJLI, this.LLILLL);
        InterfaceC1418580n1E interfaceC1418580n1EGb = this.LL.gb();
        if (interfaceC1418580n1EGb != null) {
            interfaceC1418580n1EGb.LLLLZI(C123100dR.LIZ(this.LLILLJJLI.mPath));
        }
        MutableLiveData<Unit> mutableLiveData = this.LL.S;
        Unit unit = Unit.LIZ;
        mutableLiveData.setValue(unit);
        C1C7U.LIZIZ("BaseTTEditPreviewComponent@89f0.changeMusic$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
