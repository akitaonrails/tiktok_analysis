package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0YyH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C891550YyH extends AbstractC2250601D7a<C0Y8T, IMContact> {
    public static final /* synthetic */ int LJII = 0;
    public final C01GW LJI = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(10));

    @Override // X.AbstractC2250601D7a
    public final Function1<C0Y8T, IMContact> LIZJ() {
        return new C891540YyG(this);
    }

    @Override // X.AbstractC2250601D7a
    public final Object LJ(InterfaceC1364105Vn<? super List<C0Y8T>> interfaceC1364105Vn) {
        List list;
        C0YSQ c0ysq = InterfaceC876950Yaj.LIZ;
        ArrayList arrayList = new ArrayList(C0YSQ.LIZIZ(c0ysq).LIZIZ());
        if (arrayList.isEmpty()) {
            C0Y6Q<C867240Y0k> c0y6qLJIIJJI = C0YSQ.LIZIZ(c0ysq).LJIIJJI(C869770YAd.LIZ(new C869690Y9v(null, null, null, C0YBC.LIZ(), new C0YAN(C0Y98.NOT_DELETED), null, 831), 0, 0L, false, 62));
            if (c0y6qLJIIJJI.LIZIZ == null) {
                list = c0y6qLJIIJJI.LIZ.LIZIZ;
            } else {
                list = C13BV.INSTANCE;
            }
            arrayList.addAll(list);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadInternal: ");
        sbLIZ.append(arrayList.size());
        C2188811AlT.LIZIZ(sbLIZ);
        return arrayList;
    }

    @Override // X.AbstractC2250601D7a
    public final Object LJI(InterfaceC1364105Vn<? super List<C0Y8T>> interfaceC1364105Vn) {
        throw new UnsupportedOperationException("Recent not support load more");
    }
}
