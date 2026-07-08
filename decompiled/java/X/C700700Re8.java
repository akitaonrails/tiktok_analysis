package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Re8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public /* synthetic */ class C700700Re8 extends C2217421BqW implements InterfaceC1631630sYr<C700720ReA, C700760ReE, List<? extends String>, List<? extends String>, List<String>> {
    public static final C700700Re8 LL = new C700700Re8();

    public C700700Re8() {
        super(4, C700690Re7.class, "calculateStandardizedForN1", "calculateStandardizedForN1(Lcom/ss/android/ugc/feed/platform/cell/interact/next/standardized/store/StandardizeStoreContext;Lcom/ss/android/ugc/feed/platform/componentmanager/FcpPolicyRule;Ljava/util/List;Ljava/util/List;)Ljava/util/List;", 1);
    }

    @Override // X.InterfaceC1631630sYr
    public final List<String> invoke(C700720ReA c700720ReA, C700760ReE c700760ReE, List<? extends String> list, List<? extends String> list2) {
        String str;
        C700720ReA c700720ReA2 = c700720ReA;
        C700760ReE c700760ReE2 = c700760ReE;
        List<? extends String> list3 = list;
        List<? extends String> list4 = list2;
        Map<String, InterfaceC1631630sYr<C700720ReA, C700760ReE, List<String>, List<String>, List<String>>> map = C700690Re7.LIZ;
        if (c700760ReE2 != null) {
            str = c700760ReE2.LIZ;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "n_1")) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        int i = c700760ReE2.LIZJ;
        for (String str2 : list4) {
            if (i > 0 && list3.contains(str2)) {
                arrayList.add(str2);
                i--;
                String strLJLI = c700720ReA2.LJII.LJLI();
                EnumC699110RbZ enumC699110RbZ = EnumC699110RbZ.STANDARDAVOID;
                C0RZ2 c0rz2 = C0RZ2.SUCCEED;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Decision success! Container is ");
                sbLIZ.append(c700720ReA2.LIZJ);
                sbLIZ.append('!');
                C2188811AlT.LIZIZ(sbLIZ);
                C697890RZb.LIZIZ(strLJLI, str2, enumC699110RbZ, c0rz2);
            }
        }
        for (String str3 : list3) {
            if (!arrayList.contains(str3) && i > 0) {
                arrayList.add(str3);
                i--;
                String strLJLI2 = c700720ReA2.LJII.LJLI();
                EnumC699110RbZ enumC699110RbZ2 = EnumC699110RbZ.STANDARDAVOID;
                C0RZ2 c0rz22 = C0RZ2.SUCCEED;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Decision success! Container is ");
                sbLIZ2.append(c700720ReA2.LIZJ);
                sbLIZ2.append('!');
                C2188811AlT.LIZIZ(sbLIZ2);
                C697890RZb.LIZIZ(strLJLI2, str3, enumC699110RbZ2, c0rz22);
            }
        }
        for (String str4 : C13LP.LJLI(list3, arrayList)) {
            String strLJLI3 = c700720ReA2.LJII.LJLI();
            EnumC699110RbZ enumC699110RbZ3 = EnumC699110RbZ.STANDARDAVOID;
            C0RZ2 c0rz23 = C0RZ2.FAILED;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Decision failed! Container is ");
            sbLIZ3.append(c700720ReA2.LIZJ);
            sbLIZ3.append('!');
            C2188811AlT.LIZIZ(sbLIZ3);
            C697890RZb.LIZIZ(strLJLI3, str4, enumC699110RbZ3, c0rz23);
        }
        return arrayList;
    }
}
