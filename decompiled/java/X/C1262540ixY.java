package X;

import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.api.IMafUserApi;
import com.ss.android.ugc.aweme.relation.api.MafUserApiService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ixY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1262540ixY implements InterfaceC1262160iww {
    public final Function0<Unit> LIZ;
    public final C1262300ixA LIZIZ;
    public final AbstractC1262510ixV LIZJ;
    public final IMafUserApi LIZLLL;
    public final C01GW LJ;

    public C1262540ixY() {
        throw null;
    }

    @Override // X.InterfaceC1262160iww
    public final List<InterfaceC1262230ix3> LIZ(C1262150iwv c1262150iwv) {
        boolean z;
        int size;
        MatchedFriendStruct matchedFriendStruct;
        ArrayList arrayList = new ArrayList(c1262150iwv.LIZ);
        if (!this.LIZJ.LJ.invoke().booleanValue()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        List<C1261770iwJ> listLIZ = this.LIZJ.LIZ();
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList3 = new ArrayList();
        Iterator<C1261770iwJ> it2 = listLIZ.iterator();
        while (true) {
            z = false;
            if (!it2.hasNext()) {
                break;
            }
            C1261770iwJ next = it2.next();
            C1261770iwJ c1261770iwJ = next;
            if (C1261740iwG.LIZJ(c1261770iwJ) && !c1261770iwJ.LL.isGrant()) {
                arrayList3.add(next);
            }
        }
        if ((this.LIZJ instanceof C1262430ixN) && !arrayList3.isEmpty()) {
            Iterator it3 = arrayList3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                EnumC1070410dxf enumC1070410dxf = ((C1261770iwJ) it3.next()).LL;
                if (enumC1070410dxf == EnumC1070410dxf.CONTACT && !enumC1070410dxf.isGrant()) {
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj : arrayList3) {
                        if (((C1261770iwJ) obj).LL != EnumC1070410dxf.FACEBOOK) {
                            arrayList4.add(obj);
                        }
                    }
                    arrayList3 = arrayList4;
                }
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (!((C1261770iwJ) obj2).LLILLL || !zIsEmpty) {
                arrayList5.add(obj2);
            }
        }
        for (C1261770iwJ c1261770iwJ2 : listLIZ) {
            if (!arrayList5.contains(c1261770iwJ2)) {
                Collection collection = (Collection) ((ConcurrentHashMap) this.LJ.getValue()).get(c1261770iwJ2.LL);
                if (collection != null) {
                    arrayList2.addAll(collection);
                }
            } else {
                arrayList2.add(c1261770iwJ2);
            }
        }
        if (arrayList2.isEmpty()) {
            return arrayList;
        }
        AbstractC1262510ixV abstractC1262510ixV = this.LIZJ;
        if (!arrayList.isEmpty()) {
            Iterator it4 = arrayList.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object obj3 = (InterfaceC1262230ix3) it4.next();
                if ((obj3 instanceof C1261860iwS) && (matchedFriendStruct = ((User) obj3).getMatchedFriendStruct()) != null && Intrinsics.LJFF(matchedFriendStruct.isAcquaintance(), Boolean.TRUE)) {
                    z = true;
                    break;
                }
            }
        }
        int iLIZIZ = abstractC1262510ixV.LIZIZ(z);
        if (iLIZIZ < 0) {
            if (c1262150iwv.LIZIZ) {
                return arrayList;
            }
            size = arrayList.size();
        } else {
            size = ((ArrayList) C1263100iyS.LIZIZ(arrayList)).size() + iLIZIZ;
        }
        arrayList.addAll(size, arrayList2);
        return arrayList;
    }

    public C1262540ixY(AwS563S0100000_19 awS563S0100000_19, C1262300ixA c1262300ixA) {
        AbstractC1262510ixV abstractC1262510ixV = c1262300ixA.listConfig.LJ;
        MafUserApiService mafUserApiService = MafUserApiService.LIZIZ;
        this.LIZ = awS563S0100000_19;
        this.LIZIZ = c1262300ixA;
        this.LIZJ = abstractC1262510ixV;
        this.LIZLLL = mafUserApiService;
        this.LJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3407));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.EnumC1070410dxf r28, X.C5183020f r29, X.InterfaceC1364105Vn r30) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1262540ixY.LIZIZ(X.0dxf, X.020f, X.05Vn):java.lang.Object");
    }
}
