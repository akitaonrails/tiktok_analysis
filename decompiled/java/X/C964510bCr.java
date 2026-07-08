package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import vj0.d;

/* JADX INFO: renamed from: X.0bCr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C964510bCr extends C2217421BqW implements Function1<List<? extends Integer>, Unit> {
    public C964510bCr(Object obj) {
        super(1, obj, d.class, "onPreferencesChanged", "onPreferencesChanged(Ljava/util/List;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends Integer> list) {
        List<? extends Integer> list2 = list;
        this.receiver.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPreferencesChanged ids=");
        sbLIZ.append(list2);
        C20441214yg.LIZIZ("PreferencePanelServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
        C915980Zwa.LJI().LIZ().LLJJIJI(list2);
        return Unit.LIZ;
    }
}
