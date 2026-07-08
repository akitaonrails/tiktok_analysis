package X;

import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09T6, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.audiodownload.manager.TTSStreamManager$startReading$1", f = "TTSStreamManager.kt", l = {}, m = "invokeSuspend")
public final class C09T6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09T6(String str, String str2, float f, int i, boolean z, InterfaceC1364105Vn<? super C09T6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = f;
        this.LLILZ = i;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09T6(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSStreamManager@c055.startReading$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LinkedList<C09TH> linkedList = C09T7.LJII;
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        linkedList.add(new C09TH(str, this.LLILZIL, 6533, this.LLILLL, str2, this.LLILZ));
        C11YP c11yp = C11YP.LIZIZ;
        String str3 = C09T7.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("task queue add task: START_READING queue size: ");
        sbLIZ.append(linkedList.size());
        C201955140j.LIZLLL(c11yp, str3, C2188811AlT.LIZIZ(sbLIZ));
        C09T7.LIZ.LIZLLL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSStreamManager@c055.startReading$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
