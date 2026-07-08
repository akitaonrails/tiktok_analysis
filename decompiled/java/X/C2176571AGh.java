package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AGh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final /* synthetic */ class C2176571AGh extends C2217421BqW implements Function1<Boolean, Unit> {
    public C2176571AGh(Object obj) {
        super(1, obj, C2176551AGf.class, "onLiveCenterVisibleChanged", "onLiveCenterVisibleChanged(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        List<C2176651AGp> listLLLFZ;
        boolean zBooleanValue = bool.booleanValue();
        C2176551AGf c2176551AGf = (C2176551AGf) this.receiver;
        if (zBooleanValue) {
            c2176551AGf.LLILZLL = true;
        } else if (!c2176551AGf.LLILZLL) {
            C1AGW c1agw = c2176551AGf.LLIZ;
            if (c1agw != null) {
                listLLLFZ = c1agw.LLLFZ();
            } else {
                listLLLFZ = C13BV.INSTANCE;
            }
            ArrayList arrayList = (ArrayList) C2176561AGg.LJ;
            if (listLLLFZ.size() > arrayList.size()) {
                C786410Ut5.LJZL(0, c2176551AGf.LLILLL);
                c2176551AGf.R5(listLLLFZ, arrayList);
            }
        }
        return Unit.LIZ;
    }
}
