package X;

import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.09T3, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.audiodownload.manager.TTSStreamManager$createSDKHandler$1", f = "TTSStreamManager.kt", l = {}, m = "invokeSuspend")
public final class C09T3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C09T3(InterfaceC1364105Vn<? super C09T3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09T3(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSStreamManager@c055.createSDKHandler$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C09T7 c09t7 = C09T7.LIZ;
        C09T7.LJ();
        LinkedList<C09TH> linkedList = C09T7.LJII;
        linkedList.add(new C09TH(6537));
        C11YP c11yp = C11YP.LIZIZ;
        String str = C09T7.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("task queue add task: INIT_SDK_HANDLE queue size: ");
        sbLIZ.append(linkedList.size());
        C201955140j.LIZLLL(c11yp, str, C2188811AlT.LIZIZ(sbLIZ));
        c09t7.LIZLLL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSStreamManager@c055.createSDKHandler$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C09T3(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
