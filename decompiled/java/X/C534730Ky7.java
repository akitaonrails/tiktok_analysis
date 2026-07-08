package X;

import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ky7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.AutoCutComponent$realStartAutoCut$1$1", f = "AutoCutComponent.kt", l = {}, m = "invokeSuspend")
public final class C534730Ky7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1418230n0f LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C534730Ky7(C1418230n0f c1418230n0f, int i, InterfaceC1364105Vn<? super C534730Ky7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1418230n0f;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C534730Ky7(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        C1C7U.LIZ("AutoCutComponent@2715.realStartAutoCut$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<AutoCutMediaModel> list = this.LL.LIZ.LJII;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (AutoCutMediaModel autoCutMediaModel : list) {
            String str = autoCutMediaModel.filePath;
            boolean z = autoCutMediaModel.isVideoType;
            if (z) {
                j = autoCutMediaModel.duration;
            } else {
                j = 0;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            String str2 = autoCutMediaModel.fileUriPath;
            if (str2 == null) {
                str2 = "";
            }
            arrayList.add(new C2262608tk(str, j, boolValueOf, null, str2, null, false, 104));
        }
        if (this.LLILLJJLI == 1) {
            C1417320mzC.LIZLLL(arrayList, Collections.singleton("clip_d128")).invoke();
        } else {
            s.LIZ.getClass();
            C1417320mzC.LIZLLL(arrayList, C15442062u.LJII(C15442062u.LJIIIZ(C2295608z4.LIZIZ(), C2295608z4.LIZ()), C118600ci.LIZ())).invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoCutComponent@2715.realStartAutoCut$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
