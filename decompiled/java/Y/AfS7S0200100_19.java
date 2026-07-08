package Y;

import X.AbstractC316870CbV;
import X.C09JN;
import X.C1243240iSQ;
import X.C1247020iYW;
import X.C1247060iYa;
import X.C1247190iYn;
import X.C1247270iYv;
import X.C13LP;
import X.C15438062q;
import X.C1623606Xi;
import X.C1697810uHb;
import X.C189200o6;
import X.C1C7U;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C316640Cb8;
import X.C316650Cb9;
import X.C491001vg;
import X.C626160OhC;
import X.EnumC1247010iYV;
import X.EnumC1247030iYX;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.following.model.AliasPermissionUserData;
import com.ss.android.ugc.aweme.following.model.RelationSearchResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.following.vm.RelationSearchVM;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public class AfS7S0200100_19 implements C09JN {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public static final void accept$0(AfS7S0200100_19 afS7S0200100_19, Object obj) {
        ?? LJ;
        ?? arrayList;
        int iIntValue;
        boolean z;
        int iIntValue2;
        C1C7U.LIZ("RelationSearchVM@d9b7.createPowerPageConfig$1$onRefresh$2");
        RelationSearchResponse relationSearchResponse = (RelationSearchResponse) obj;
        List<AliasPermissionUserData> list = relationSearchResponse.aliasPermissions;
        if (list != null) {
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LJ = new LinkedHashMap(iLIZIZ);
            for (AliasPermissionUserData aliasPermissionUserData : list) {
                String str = aliasPermissionUserData.userId;
                if (str == null) {
                    str = "";
                }
                Integer num = aliasPermissionUserData.aliasPermissionType;
                if (num != null) {
                    iIntValue2 = num.intValue();
                } else {
                    iIntValue2 = 0;
                }
                Pair pair = new Pair(str, Integer.valueOf(iIntValue2));
                LJ.put(pair.getFirst(), pair.getSecond());
            }
        } else {
            LJ = C2097608Jq.LJ();
        }
        relationSearchResponse.checkValid();
        List<User> list2 = relationSearchResponse.searchUser;
        if (list2 != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            int i = 0;
            for (User user : list2) {
                int i2 = i + 1;
                Integer num2 = null;
                if (i >= 0) {
                    User user2 = user;
                    C1247060iYa c1247060iYa = EnumC1247030iYX.Companion;
                    List<Integer> list3 = relationSearchResponse.matchBy;
                    if (list3 != null) {
                        num2 = (Integer) C13LP.LJJJLZIJ(i, list3);
                    }
                    c1247060iYa.getClass();
                    EnumC1247030iYX enumC1247030iYXLIZ = C1247060iYa.LIZ(num2);
                    Integer num3 = (Integer) LJ.get(user2.getUid());
                    if (num3 != null) {
                        iIntValue = num3.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    C1243240iSQ c1243240iSQ = C1243240iSQ.LIZ;
                    if (enumC1247030iYXLIZ != EnumC1247030iYX.NICKNAME) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c1243240iSQ.getClass();
                    String strLIZ = C1243240iSQ.LIZ(user2, z);
                    C1247020iYW c1247020iYW = EnumC1247010iYV.Companion;
                    Integer numValueOf = Integer.valueOf(iIntValue);
                    c1247020iYW.getClass();
                    arrayList.add(new C1247270iYv(user2, i, enumC1247030iYXLIZ, strLIZ, C1247020iYW.LIZ(numValueOf), 0, 0, 0.0d, 992));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        } else {
            arrayList = (List) ((RelationSearchVM) afS7S0200100_19.l0).LLILZLL.getValue();
        }
        C1623606Xi c1623606Xi = new C1623606Xi(Boolean.valueOf(arrayList.isEmpty()));
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS7S0200100_19.l1;
        AbstractC316870CbV.LIZ.getClass();
        C316640Cb8 c316640Cb8 = new C316640Cb8(arrayList);
        C189200o6.m2constructorimpl(c316640Cb8);
        interfaceC1364105Vn.resumeWith(c316640Cb8);
        ((RelationSearchVM) afS7S0200100_19.l0).setState(new AwS598S0100000_19(c1623606Xi, (C1623606Xi<C626160OhC>) 660));
        C1247190iYn c1247190iYn = C1247190iYn.LIZ;
        String enterFrom = ((RelationSearchVM) afS7S0200100_19.l0).getEnterFrom();
        long j = afS7S0200100_19.j2;
        int i3 = ((RelationSearchVM) afS7S0200100_19.l0).LLJ;
        c1247190iYn.getClass();
        C1247190iYn.LIZIZ(enterFrom, j, c1623606Xi, i3);
        ((RelationSearchVM) afS7S0200100_19.l0).LLJ--;
        C1C7U.LIZIZ("RelationSearchVM@d9b7.createPowerPageConfig$1$onRefresh$2");
    }

    public static final void accept$1(AfS7S0200100_19 afS7S0200100_19, Object obj) {
        Exception exc;
        C1C7U.LIZ("RelationSearchVM@d9b7.createPowerPageConfig$1$onRefresh$3");
        Throwable th = (Throwable) obj;
        if ((th instanceof Exception) && (exc = (Exception) th) != null) {
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS7S0200100_19.l1;
            AbstractC316870CbV.LIZ.getClass();
            C316650Cb9 c316650Cb9 = new C316650Cb9(exc);
            C189200o6.m2constructorimpl(c316650Cb9);
            interfaceC1364105Vn.resumeWith(c316650Cb9);
        }
        C491001vg c491001vg = new C491001vg(th);
        ((RelationSearchVM) afS7S0200100_19.l0).setState(new AwS598S0100000_19(c491001vg, 661));
        C1247190iYn c1247190iYn = C1247190iYn.LIZ;
        String enterFrom = ((RelationSearchVM) afS7S0200100_19.l0).getEnterFrom();
        long j = afS7S0200100_19.j2;
        int i = ((RelationSearchVM) afS7S0200100_19.l0).LLJ;
        c1247190iYn.getClass();
        C1247190iYn.LIZIZ(enterFrom, j, c491001vg, i);
        RelationSearchVM relationSearchVM = (RelationSearchVM) afS7S0200100_19.l0;
        relationSearchVM.LLJ--;
        C1C7U.LIZIZ("RelationSearchVM@d9b7.createPowerPageConfig$1$onRefresh$3");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS7S0200100_19(long r2, com.ss.android.ugc.profile.business.ur.following.vm.RelationSearchVM r4, X.InterfaceC1364105Vn r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            if (r6 == 0) goto Lf
            r0 = r1
            r0.l0 = r4
            r0.j2 = r2
            r0.l1 = r5
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r5
            r0.j2 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS7S0200100_19.<init>(long, com.ss.android.ugc.profile.business.ur.following.vm.RelationSearchVM, X.05Vn, int):void");
    }
}
