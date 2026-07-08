package X;

import Y.AObjectS81S0000000_34;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.1BGS, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BGS extends AbstractC2202061BGi<C1BGR> implements InterfaceC1710106mp {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
    public volatile C2202081BGk LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1BGS.class, "data", "getData()Lknit/Loadable;", 0);
        C13LE.LIZ.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC2202061BGi
    public final C2202081BGk<C1BGR> getData() {
        C2202081BGk<C1BGR> c2202081BGk = this.LIZ;
        if (c2202081BGk == null) {
            synchronized (this) {
                c2202081BGk = this.LIZ;
                if (c2202081BGk == null) {
                    C2202081BGk<C1BGR> c2202081BGk2 = new C2202081BGk<>(new AObjectS81S0000000_34(this, 6));
                    this.LIZ = c2202081BGk2;
                    return c2202081BGk2;
                }
            }
        }
        return c2202081BGk;
    }

    @Override // X.InterfaceC1710106mp
    public final void LJII() {
        C1BGR c1bgrLJIIZILJ = LJIIZILJ();
        if (c1bgrLJIIZILJ != null) {
            c1bgrLJIIZILJ.LJII();
        }
    }

    public final List<IMUser> LJIILL() {
        List<IMUser> listLJIIZILJ;
        return (LJIIZILJ() == null || (listLJIIZILJ = C1BGR.LJIIZILJ()) == null) ? C13BV.INSTANCE : listLJIIZILJ;
    }

    public final List<IMUser> LJIILLIIL() {
        List<IMUser> listLJIJ;
        return (LJIIZILJ() == null || (listLJIJ = C1BGR.LJIJ()) == null) ? C13BV.INSTANCE : listLJIJ;
    }

    public final C1BGR LJIIZILJ() {
        return getUserScopeObject();
    }

    public final List<IMUser> LJIJJ() {
        return LJIIZILJ() != null ? C1BGR.LJIL() : C13BV.INSTANCE;
    }

    @Override // X.InterfaceC1710106mp
    public final List<IMUser> getAllFriends() {
        List<IMUser> allFriends;
        C1BGR c1bgrLJIIZILJ = LJIIZILJ();
        return (c1bgrLJIIZILJ == null || (allFriends = c1bgrLJIIZILJ.getAllFriends()) == null) ? C13BV.INSTANCE : allFriends;
    }

    @Override // X.InterfaceC1710106mp
    public final void LIZ(Map<String, MatchedFriendStruct> map) {
        C1BGR c1bgrLJIIZILJ = LJIIZILJ();
        if (c1bgrLJIIZILJ != null) {
            c1bgrLJIIZILJ.LIZ(map);
        }
    }

    @Override // X.InterfaceC1710106mp
    public final MatchedFriendStruct LIZIZ(String str) {
        C1BGR c1bgrLJIIZILJ = LJIIZILJ();
        if (c1bgrLJIIZILJ != null) {
            return c1bgrLJIIZILJ.LIZIZ(str);
        }
        return null;
    }

    @Override // X.InterfaceC1710106mp
    public final void LJFF(IMUser iMUser) {
        C1BGR c1bgrLJIIZILJ = LJIIZILJ();
        if (c1bgrLJIIZILJ != null) {
            c1bgrLJIIZILJ.LJJIII(iMUser);
        }
    }

    public final IMUser LJIJI(String str) {
        if (LJIIZILJ() != null) {
            return C1BGR.LJIJJ(str);
        }
        return null;
    }

    public final boolean LJIJJLI(String str) {
        C1BGR c1bgrLJIIZILJ = LJIIZILJ();
        if (c1bgrLJIIZILJ != null && c1bgrLJIIZILJ.LJJI(str)) {
            return true;
        }
        return false;
    }

    public final boolean LJJII(String str) {
        C1BGR c1bgrLJIIZILJ = LJIIZILJ();
        if (c1bgrLJIIZILJ != null && c1bgrLJIIZILJ.LJJIIZI(str)) {
            return true;
        }
        return false;
    }

    public final boolean LJJIII(List<String> list) {
        C1BGR c1bgrLJIIZILJ = LJIIZILJ();
        if (c1bgrLJIIZILJ != null && c1bgrLJIIZILJ.LJJIJ(list)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1710106mp
    public final IMUser LJ(String str, String str2) {
        C1BGR c1bgrLJIIZILJ = LJIIZILJ();
        if (c1bgrLJIIZILJ != null) {
            return c1bgrLJIIZILJ.LJ(str, str2);
        }
        return null;
    }

    @Override // X.InterfaceC1710106mp
    public final Object LJIIIIZZ(List list, AbstractC23140094w abstractC23140094w) {
        C1BGR c1bgrLJIIZILJ = LJIIZILJ();
        if (c1bgrLJIIZILJ != null) {
            return c1bgrLJIIZILJ.LJIIIIZZ(list, abstractC23140094w);
        }
        return null;
    }

    @Override // X.InterfaceC1710106mp
    public final Object LJIIJJI(List list, C1BG6 c1bg6) {
        C1BGR c1bgrLJIIZILJ = LJIIZILJ();
        if (c1bgrLJIIZILJ != null) {
            Object objLJIIJJI = c1bgrLJIIZILJ.LJIIJJI(list, c1bg6);
            if (objLJIIJJI == C099R.LJFF()) {
                return objLJIIJJI;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    public final Object LJIILJJIL(IMUser iMUser, InterfaceC1364105Vn<? super IMUser> interfaceC1364105Vn) {
        C1BGR c1bgrLJIIZILJ = LJIIZILJ();
        if (c1bgrLJIIZILJ != null) {
            return c1bgrLJIIZILJ.LJIILJJIL(iMUser, interfaceC1364105Vn);
        }
        return null;
    }

    public final void LJJI(String str, C0ZVN c0zvn) {
        C1BGR c1bgrLJIIZILJ = LJIIZILJ();
        if (c1bgrLJIIZILJ != null) {
            c1bgrLJIIZILJ.LJJIIJZLJL(str, c0zvn);
        }
    }

    @Override // X.InterfaceC1710106mp
    public final IMUser LIZLLL(String str, String str2, String str3) {
        C1BGR c1bgrLJIIZILJ = LJIIZILJ();
        if (c1bgrLJIIZILJ != null) {
            return c1bgrLJIIZILJ.LIZLLL(str, str2, str3);
        }
        return null;
    }

    @Override // X.InterfaceC1710106mp
    public final IMUser LJIIL(String str, String str2, String str3) {
        C1BGR c1bgrLJIIZILJ = LJIIZILJ();
        if (c1bgrLJIIZILJ != null) {
            return c1bgrLJIIZILJ.LJIIL(str, str2, str3);
        }
        return null;
    }

    public final Object LJIJ(String str, String str2, InterfaceC1364105Vn<? super IMUser> interfaceC1364105Vn) {
        C1BGR c1bgrLJIIZILJ = LJIIZILJ();
        if (c1bgrLJIIZILJ != null) {
            return c1bgrLJIIZILJ.LJIJI(str, str2, interfaceC1364105Vn);
        }
        return null;
    }

    public final List LJIL(String str, boolean z, List list) {
        C1BGR c1bgrLJIIZILJ = LJIIZILJ();
        if (c1bgrLJIIZILJ != null) {
            return c1bgrLJIIZILJ.LJJIFFI(str, z, list);
        }
        return C13BV.INSTANCE;
    }

    public final void LJJ(String str, Map<String, ? extends List<Integer>> map, IMUser iMUser) {
        C1BGR c1bgrLJIIZILJ = LJIIZILJ();
        if (c1bgrLJIIZILJ != null) {
            c1bgrLJIIZILJ.LJJIIJ(str, map, iMUser);
        }
    }

    public final Object LJJIFFI(List<? extends IMUser> list, C1483005rI c1483005rI, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C1BGR c1bgrLJIIZILJ = LJIIZILJ();
        if (c1bgrLJIIZILJ != null) {
            Object objLJJIIZ = c1bgrLJIIZILJ.LJJIIZ(list, c1483005rI, interfaceC1364105Vn);
            if (objLJJIIZ == C099R.LJFF()) {
                return objLJJIIZ;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1710106mp
    public final Object LJIIIZ(IMUser iMUser, IMUser iMUser2, C1483005rI c1483005rI, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C1BGR c1bgrLJIIZILJ = LJIIZILJ();
        if (c1bgrLJIIZILJ != null) {
            Object objLJIIIZ = c1bgrLJIIZILJ.LJIIIZ(iMUser, iMUser2, c1483005rI, interfaceC1364105Vn);
            if (objLJIIIZ == C099R.LJFF()) {
                return objLJIIIZ;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1710106mp
    public final Object LJIIJ(String str, String str2, boolean z, InterfaceC1364105Vn<? super IMUser> interfaceC1364105Vn) {
        boolean zLJI = MethodIDManager.LJI(137330);
        C1BGR c1bgrLJIIZILJ = LJIIZILJ();
        if (c1bgrLJIIZILJ != null) {
            Object objLJIIJ = c1bgrLJIIZILJ.LJIIJ(str, str2, z, interfaceC1364105Vn);
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return objLJIIJ;
        }
        if (zLJI) {
            MethodIDManager.LJ();
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC1710106mp
    public final void LIZJ(InterfaceC1480505qt interfaceC1480505qt, String str, String str2, String str3, boolean z) {
        C1BGR c1bgrLJIIZILJ = LJIIZILJ();
        if (c1bgrLJIIZILJ != null) {
            c1bgrLJIIZILJ.LIZJ(interfaceC1480505qt, str, str2, str3, z);
        }
    }

    @Override // X.InterfaceC1710106mp
    public final void LJI(InterfaceC1480505qt interfaceC1480505qt, String str, String str2, String str3, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getLocalUserWithDBAsync uid=");
        sbLIZ.append(str);
        sbLIZ.append(" and secId=");
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        C1BGR c1bgrLJIIZILJ = LJIIZILJ();
        if (c1bgrLJIIZILJ != null) {
            c1bgrLJIIZILJ.LJI(interfaceC1480505qt, str, str2, str3, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    @Override // X.InterfaceC1710106mp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(java.lang.String r11, java.util.List r12, X.InterfaceC1364105Vn r13, boolean r14, boolean r15, boolean r16) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof X.C1219700hqS
            if (r0 == 0) goto L3f
            r6 = r13
            X.0hqS r6 = (X.C1219700hqS) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r3 = r6.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r6.LLILLL
            r0 = 1
            if (r1 == 0) goto L27
            if (r1 != r0) goto L45
            X.C155000ia.LIZIZ(r3)
        L22:
            if (r3 != 0) goto L26
        L24:
            X.13BV r3 = X.C13BV.INSTANCE
        L26:
            return r3
        L27:
            X.C155000ia.LIZIZ(r3)
            X.1BGR r3 = r10.LJIIZILJ()
            if (r3 == 0) goto L24
            r6.LLILLL = r0
            r8 = r15
            r7 = r14
            r5 = r12
            r9 = r16
            r4 = r11
            java.lang.Object r3 = r3.LJIILIIL(r4, r5, r6, r7, r8, r9)
            if (r3 != r2) goto L22
            return r2
        L3f:
            X.0hqS r6 = new X.0hqS
            r6.<init>(r10, r13)
            goto L12
        L45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BGS.LJIILIIL(java.lang.String, java.util.List, X.05Vn, boolean, boolean, boolean):java.lang.Object");
    }
}
