package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.Avatars;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.MAFIMUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.1BFn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2201851BFn implements InterfaceC1726606pU {
    public final InterfaceC2201871BFp LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C848470XQf());

    public C2201851BFn(InterfaceC2201871BFp interfaceC2201871BFp) {
        this.LIZ = interfaceC2201871BFp;
    }

    @Override // X.InterfaceC1726606pU
    public final MAFIMUser LIZJ(long j) {
        Object objLIZ;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        boolean z;
        boolean z2;
        int iIntValue5;
        int iIntValue6;
        C2201831BFl c2201831BFlLIZJ = this.LIZ.LIZJ(j);
        Object objLIZ2 = null;
        if (c2201831BFlLIZJ == null) {
            return null;
        }
        try {
            objLIZ = C051M.LIZ(UrlModel.class, c2201831BFlLIZJ.LIZIZ);
            try {
                objLIZ2 = C051M.LIZ(UrlModel.class, c2201831BFlLIZJ.LIZJ);
            } catch (Exception e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (Exception e2) {
            e = e2;
            objLIZ = null;
        }
        MAFIMUser mAFIMUser = new MAFIMUser();
        mAFIMUser.setUid(String.valueOf(c2201831BFlLIZJ.LIZ));
        mAFIMUser.setAvatarThumb((UrlModel) objLIZ);
        mAFIMUser.setAvatarMedium((UrlModel) objLIZ2);
        mAFIMUser.setNickName(c2201831BFlLIZJ.LIZLLL);
        mAFIMUser.setUniqueId(c2201831BFlLIZJ.LJ);
        Integer num = c2201831BFlLIZJ.LJFF;
        boolean z3 = false;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        mAFIMUser.setFollowStatus(iIntValue);
        Integer num2 = c2201831BFlLIZJ.LJI;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = 0;
        }
        mAFIMUser.setFollowerCount(iIntValue2);
        Integer num3 = c2201831BFlLIZJ.LJII;
        if (num3 != null) {
            iIntValue3 = num3.intValue();
        } else {
            iIntValue3 = 0;
        }
        mAFIMUser.setFollowingCount(iIntValue3);
        mAFIMUser.setRecType(c2201831BFlLIZJ.LJIIIZ);
        mAFIMUser.setSortWeight(c2201831BFlLIZJ.LJIIJJI);
        mAFIMUser.setInitialLetter(c2201831BFlLIZJ.LJIIL);
        Integer num4 = c2201831BFlLIZJ.LJIILJJIL;
        if (num4 != null) {
            iIntValue4 = num4.intValue();
        } else {
            iIntValue4 = 0;
        }
        mAFIMUser.setFollowerStatus(iIntValue4);
        Integer num5 = c2201831BFlLIZJ.LJIILL;
        if (num5 != null && num5.intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        mAFIMUser.setBlock(z);
        Integer num6 = c2201831BFlLIZJ.LJIILLIIL;
        if (num6 != null && num6.intValue() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        mAFIMUser.setBlocked(z2);
        Integer num7 = c2201831BFlLIZJ.LJIILL;
        if (num7 != null) {
            iIntValue5 = num7.intValue();
        } else {
            iIntValue5 = 0;
        }
        mAFIMUser.setBlockStatus(iIntValue5);
        mAFIMUser.setRecommendReason(c2201831BFlLIZJ.LJIIZILJ);
        mAFIMUser.setEnterpriseVerifyReason(c2201831BFlLIZJ.LJIJ);
        mAFIMUser.setCustomVerify(c2201831BFlLIZJ.LJIJI);
        Integer num8 = c2201831BFlLIZJ.LJIJJ;
        if (num8 != null) {
            iIntValue6 = num8.intValue();
        } else {
            iIntValue6 = 0;
        }
        mAFIMUser.setVerificationType(iIntValue6);
        Integer num9 = c2201831BFlLIZJ.LJIJJLI;
        if (num9 != null && num9.intValue() > 0) {
            z3 = true;
        }
        mAFIMUser.setDeleted(z3);
        return mAFIMUser;
    }

    @Override // X.InterfaceC1726606pU
    public final Object LIZLLL(InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return C2286608xc.LJ(this.LIZ.LJFF());
    }

    @Override // X.InterfaceC1726606pU
    public final List<IMUser> LJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\n            SELECT * FROM IM_USER_BASE_INFO\n            INNER JOIN SHARE_PERMISSION ON IM_USER_BASE_INFO.UID = SHARE_PERMISSION.UID\n            WHERE ");
        sbLIZ.append(str);
        sbLIZ.append("\n            AND DELETED = 0\n            AND SORT_WEIGHT IS NOT NULL\n            AND INITIAL_LETTER IS NOT NULL\n            ORDER BY SORT_WEIGHT");
        List listLJIIJJI = this.LIZ.LJIIJJI(new C0VN1(C2188811AlT.LIZIZ(sbLIZ), null));
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIJJI, 10));
        Iterator it2 = listLJIIJJI.iterator();
        while (it2.hasNext()) {
            arrayList.add(C2201861BFo.LIZ(C2201811BFj.LIZ((C2201831BFl) it2.next())));
        }
        return arrayList;
    }

    @Override // X.InterfaceC1726606pU
    public final Object LJI(InterfaceC1364105Vn<? super List<Long>> interfaceC1364105Vn) {
        return this.LIZ.LJIILL();
    }

    @Override // X.InterfaceC1726606pU
    public final Object LJIIIZ(InterfaceC1364105Vn<? super List<IMUserBaseInfo>> interfaceC1364105Vn) {
        List<C2201831BFl> listLJI = this.LIZ.LJI();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJI, 10));
        Iterator<C2201831BFl> it2 = listLJI.iterator();
        while (it2.hasNext()) {
            arrayList.add(C2201811BFj.LIZ(it2.next()));
        }
        return arrayList;
    }

    @Override // X.InterfaceC1726606pU
    public final Object LJIILL(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        this.LIZ.LJIILJJIL();
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1726606pU
    public final Object LJIILLIIL(InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return C2286608xc.LJ(this.LIZ.LJ());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004d -> B:11:0x002e). Please report as a decompilation issue!!! */
    @Override // X.InterfaceC1726606pU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo> r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C2201881BFq
            if (r0 == 0) goto La1
            r9 = r13
            X.1BFq r9 = (X.C2201881BFq) r9
            int r2 = r9.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La1
            int r2 = r2 - r1
            r9.LLILZLL = r2
        L12:
            java.lang.Object r0 = r9.LLILZ
            java.lang.Object r10 = X.C099R.LJFF()
            int r1 = r9.LLILZLL
            r8 = 1
            if (r1 == 0) goto L4f
            if (r1 != r8) goto La8
            java.lang.Object r3 = r9.LLILLL
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r2 = r9.LLILLJJLI
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r1 = r9.LL
            java.util.Collection r1 = (java.util.Collection) r1
            X.C155000ia.LIZIZ(r0)
        L2e:
            r3.add(r0)
            r3 = r1
        L32:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb0
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo r0 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo) r0
            r9.LL = r3
            r9.LLILLJJLI = r2
            r9.LLILLL = r3
            r9.LLILZLL = r8
            java.lang.Object r0 = r11.LJIJ(r0, r9)
            if (r0 != r10) goto L4d
            return r10
        L4d:
            r1 = r3
            goto L2e
        L4f:
            X.C155000ia.LIZIZ(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "insertOrReplaceList list size "
            r1.append(r0)
            int r0 = r12.size()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            boolean r0 = r12.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto Lb9
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r12.iterator()
        L76:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L91
            java.lang.Object r5 = r6.next()
            r0 = r5
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo r0 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo) r0
            long r3 = r0.getUserId()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L76
            r7.add(r5)
            goto L76
        L91:
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r7, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r7.iterator()
            goto L32
        La1:
            X.1BFq r9 = new X.1BFq
            r9.<init>(r11, r13)
            goto L12
        La8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb0:
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto Lb9
            X.1BFp r0 = r11.LIZ
            r0.LIZ(r3)
        Lb9:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2201851BFn.LIZ(java.util.List, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1726606pU
    public final Object LIZIZ(Long l, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("delete ");
        sbLIZ.append(l);
        C2188811AlT.LIZIZ(sbLIZ);
        if (l != null) {
            this.LIZ.LJIIJ(l.longValue());
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1726606pU
    public final List<IMUser> LJFF(String str, boolean z) {
        Object objLIZ;
        Object objLIZ2;
        IMUser iMUser;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        boolean z2;
        boolean z3;
        int iIntValue5;
        int iIntValue6;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\n            SELECT * FROM IM_USER_BASE_INFO\n            WHERE ");
        sbLIZ.append(str);
        sbLIZ.append("\n            AND DELETED = 0\n            AND SORT_WEIGHT IS NOT NULL\n            AND INITIAL_LETTER IS NOT NULL\n            ORDER BY SORT_WEIGHT");
        List<C2201831BFl> listLJIIJJI = this.LIZ.LJIIJJI(new C0VN1(C2188811AlT.LIZIZ(sbLIZ), null));
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIJJI, 10));
        for (C2201831BFl c2201831BFl : listLJIIJJI) {
            if (z) {
                try {
                    objLIZ = C051M.LIZ(UrlModel.class, c2201831BFl.LIZIZ);
                    try {
                        objLIZ2 = C051M.LIZ(UrlModel.class, c2201831BFl.LIZJ);
                    } catch (Throwable th) {
                        th = th;
                        objLIZ2 = null;
                    }
                    try {
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th2) {
                        th = th2;
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                } catch (Throwable th3) {
                    th = th3;
                    objLIZ = null;
                    objLIZ2 = null;
                }
                iMUser = new IMUser();
                iMUser.setUid(String.valueOf(c2201831BFl.LIZ));
                iMUser.setNickName(c2201831BFl.LIZLLL);
                iMUser.setUniqueId(c2201831BFl.LJ);
                iMUser.setAvatarThumb((UrlModel) objLIZ);
                iMUser.setAvatarMedium((UrlModel) objLIZ2);
                Integer num = c2201831BFl.LJFF;
                boolean z4 = false;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                iMUser.setFollowStatus(iIntValue);
                Integer num2 = c2201831BFl.LJI;
                if (num2 != null) {
                    iIntValue2 = num2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                iMUser.setFollowerCount(iIntValue2);
                Integer num3 = c2201831BFl.LJII;
                if (num3 != null) {
                    iIntValue3 = num3.intValue();
                } else {
                    iIntValue3 = 0;
                }
                iMUser.setFollowingCount(iIntValue3);
                iMUser.setRecType(c2201831BFl.LJIIIZ);
                iMUser.setSortWeight(c2201831BFl.LJIIJJI);
                iMUser.setInitialLetter(c2201831BFl.LJIIL);
                Integer num4 = c2201831BFl.LJIILJJIL;
                if (num4 != null) {
                    iIntValue4 = num4.intValue();
                } else {
                    iIntValue4 = 0;
                }
                iMUser.setFollowerStatus(iIntValue4);
                Integer num5 = c2201831BFl.LJIILL;
                if (num5 != null && num5.intValue() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                iMUser.setBlock(z2);
                Integer num6 = c2201831BFl.LJIILLIIL;
                if (num6 != null && num6.intValue() == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                iMUser.setBlocked(z3);
                iMUser.setBlockStatus(iMUser.isBlock() ? 1 : 0);
                iMUser.setRecommendReason(c2201831BFl.LJIIZILJ);
                iMUser.setEnterpriseVerifyReason(c2201831BFl.LJIJ);
                iMUser.setCustomVerify(c2201831BFl.LJIJI);
                Integer num7 = c2201831BFl.LJIJJ;
                if (num7 != null) {
                    iIntValue5 = num7.intValue();
                } else {
                    iIntValue5 = 0;
                }
                iMUser.setVerificationType(iIntValue5);
                Integer num8 = c2201831BFl.LJIJJLI;
                if (num8 != null) {
                    iIntValue6 = num8.intValue();
                } else {
                    iIntValue6 = 0;
                }
                if (iIntValue6 > 0) {
                    z4 = true;
                }
                iMUser.setDeleted(z4);
                iMUser.setUpdateTime(Long.valueOf(c2201831BFl.LJIIJ));
            } else {
                iMUser = C2201861BFo.LIZ(C2201811BFj.LIZ(c2201831BFl));
            }
            arrayList.add(iMUser);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    @Override // X.InterfaceC1726606pU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C2201901BFs
            if (r0 == 0) goto L42
            r7 = r10
            X.1BFs r7 = (X.C2201901BFs) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L42
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r5 = 1
            if (r0 == 0) goto L2c
            if (r0 != r5) goto L48
            X.C155000ia.LIZIZ(r1)
        L22:
            X.1BFl r1 = (X.C2201831BFl) r1
            X.1BFp r0 = r8.LIZ
            r0.LJII(r1)
        L29:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            X.C155000ia.LIZIZ(r1)
            long r3 = r9.getUserId()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L29
            r7.LLILLL = r5
            java.lang.Object r1 = r8.LJIJ(r9, r7)
            if (r1 != r6) goto L22
            return r6
        L42:
            X.1BFs r7 = new X.1BFs
            r7.<init>(r8, r10)
            goto L12
        L48:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2201851BFn.LJII(com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1726606pU
    public final Object LJIIIIZZ(long j, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        this.LIZ.LIZIZ(j);
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1726606pU
    public final Object LJIIJ(long j, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        this.LIZ.LIZLLL(j);
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1726606pU
    public final Object LJIIJJI(Long l, InterfaceC1364105Vn<? super IMUserBaseInfo> interfaceC1364105Vn) {
        IMUserBaseInfo iMUserBaseInfoLIZ;
        if (l != null) {
            C2201831BFl c2201831BFlLJIIL = this.LIZ.LJIIL(l.longValue());
            if (c2201831BFlLJIIL != null && (iMUserBaseInfoLIZ = C2201811BFj.LIZ(c2201831BFlLJIIL)) != null) {
                return iMUserBaseInfoLIZ;
            }
        }
        return null;
    }

    @Override // X.InterfaceC1726606pU
    public final Object LJIIL(IMUserBaseInfo iMUserBaseInfo, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        String strLJ;
        InterfaceC2201871BFp interfaceC2201871BFp = this.LIZ;
        String strLJ2 = "";
        try {
            Avatars avatars = iMUserBaseInfo.getAvatars();
            if (avatars == null) {
                strLJ = "";
            } else {
                UrlModel urlModel = avatars.avatarThumb;
                if (urlModel == null) {
                    strLJ = "";
                } else {
                    strLJ = C051M.LJ(urlModel, false);
                }
                try {
                    UrlModel urlModel2 = avatars.avatarMedium;
                    if (urlModel2 != null) {
                        strLJ2 = C051M.LJ(urlModel2, false);
                    }
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        } catch (Exception e2) {
            e = e2;
            strLJ = "";
        }
        interfaceC2201871BFp.LJIILLIIL(new C796840VNq(iMUserBaseInfo.getUserId(), strLJ, strLJ2, iMUserBaseInfo.getContactNickName(), iMUserBaseInfo.getUniqueId(), iMUserBaseInfo.getFollowStatus(), iMUserBaseInfo.getMafStatus(), iMUserBaseInfo.getRecType(), iMUserBaseInfo.getUpdateTime()));
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1726606pU
    public final Object LJIILIIL(long j, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        this.LIZ.LJIIIIZZ(j);
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1726606pU
    public final Object LJIIZILJ(long j, InterfaceC1364105Vn<? super List<Long>> interfaceC1364105Vn) {
        return this.LIZ.LJIILIIL(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r3 != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJ(com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo r30, X.InterfaceC1364105Vn<? super X.C2201831BFl> r31) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2201851BFn.LJIJ(com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1726606pU
    public final Object LJIILJJIL(int i, int i2, String str, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        String strLJJLIIIJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\n            SELECT * FROM IM_USER_BASE_INFO\n            INNER JOIN SHARE_PERMISSION ON IM_USER_BASE_INFO.UID = SHARE_PERMISSION.UID\n            WHERE ");
        sbLIZ.append(str);
        sbLIZ.append("\n            AND DELETED = 0\n            AND IM_USER_BASE_INFO.UID NOT IN (");
        if (list == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62)) == null) {
            strLJJLIIIJ = "";
        }
        sbLIZ.append(strLJJLIIIJ);
        sbLIZ.append(")\n            LIMIT ");
        sbLIZ.append(i);
        sbLIZ.append("\n            OFFSET ");
        sbLIZ.append(i2);
        sbLIZ.append("\n        ");
        List listLJIIIZ = this.LIZ.LJIIIZ(new C0VN1(C2188811AlT.LIZIZ(sbLIZ), null));
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIIZ, 10));
        Iterator it2 = listLJIIIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(C2201861BFo.LIZ(C2201811BFj.LIZ((C2201831BFl) it2.next())));
        }
        return arrayList;
    }
}
