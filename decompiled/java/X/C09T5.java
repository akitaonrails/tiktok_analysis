package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09T5, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.audiodownload.manager.TTSStreamManager$next$1", f = "TTSStreamManager.kt", l = {}, m = "invokeSuspend")
public final class C09T5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C09T5(InterfaceC1364105Vn<? super C09T5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09T5(interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSStreamManager@c055.next$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C11YP c11yp = C11YP.LIZIZ;
        String str = C09T7.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("next isProcessing = ");
        sbLIZ.append(C09T7.LJ);
        sbLIZ.append(", isNotEmpty = ");
        LinkedList<C09TH> linkedList = C09T7.LJII;
        sbLIZ.append(!linkedList.isEmpty());
        C201955140j.LIZLLL(c11yp, str, C2188811AlT.LIZIZ(sbLIZ));
        if (!C09T7.LJ && (!linkedList.isEmpty())) {
            try {
                C09TH c09thRemove = linkedList.remove();
                if (c09thRemove != null) {
                    C09T7 c09t7 = C09T7.LIZ;
                    C23250099c.LIZLLL(C09T7.LIZIZ(), null, null, new C09T9(c09thRemove, null), 3);
                }
            } catch (NoSuchElementException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(C09T7.LIZIZ);
                sbLIZ2.append(Unit.LIZ);
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSStreamManager@c055.next$1");
        return unit;
    }
}
