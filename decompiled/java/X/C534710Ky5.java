package X;

import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ky5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.EditRootScene$initAutoCut$1", f = "EditRootScene.kt", l = {}, m = "invokeSuspend")
public final class C534710Ky5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1455260nyO LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C534710Ky5(C1455260nyO c1455260nyO, InterfaceC1364105Vn<? super C534710Ky5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1455260nyO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C534710Ky5(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditRootScene@37d3.initAutoCut$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        VideoPublishEditModel videoPublishEditModel = this.LL.LLLFZ;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        List<C2262608tk> listLIZ = C0MH3.LIZ(videoPublishEditModel, false);
        if (listLIZ != null) {
            if (C311120CHm.LIZ() == 1) {
                C1417320mzC.LIZLLL(listLIZ, Collections.singleton("clip_d128")).invoke();
            } else {
                s.LIZ.getClass();
                C1417320mzC.LIZLLL(listLIZ, C15442062u.LJII(C15442062u.LJIIIZ(C2295608z4.LIZIZ(), C2295608z4.LIZ()), C118600ci.LIZ())).invoke();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditRootScene@37d3.initAutoCut$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
