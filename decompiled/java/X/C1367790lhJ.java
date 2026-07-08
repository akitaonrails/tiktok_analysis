package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0lhJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1367790lhJ extends C1696260uF6 implements Function2<List<IMContact>, InterfaceC1364105Vn<? super List<IMContact>>, Object>, InterfaceC842703Qz {
    public C1367790lhJ(Object obj) {
        super(2, obj, C1381840m3y.class, "interceptFinish", "interceptFinish(Ljava/util/List;)Ljava/util/List;", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<IMContact> list, InterfaceC1364105Vn<? super List<IMContact>> interfaceC1364105Vn) {
        List<IMContact> listLIZ = list;
        C1381840m3y c1381840m3y = (C1381840m3y) this.receiver;
        c1381840m3y.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("interceptFinish, before list size: ");
        sbLIZ.append(listLIZ.size());
        C2188811AlT.LIZIZ(sbLIZ);
        if (c1381840m3y.LJIIIZ()) {
            listLIZ = C1345505Oj.LIZ(null, listLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("interceptFinish, after list size: ");
        sbLIZ2.append(listLIZ.size());
        C2188811AlT.LIZIZ(sbLIZ2);
        return listLIZ;
    }
}
