package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import java.util.List;
import java.util.Set;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Eyc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C382160Eyc extends C382190Eyf {
    public String LIZIZ;
    public final Set<EnumC379630EuX> LIZJ = C13LQ.LJLIIL(new EnumC379630EuX[]{EnumC379630EuX.EDITOR_PRO_AI_CREATE, EnumC379630EuX.EDITOR_PRO_AI_EXTEND, EnumC379630EuX.EDITOR_PRO_AI_TRANSITION, EnumC379630EuX.AI_VIDEO_TOOL, EnumC379630EuX.MAGIC, EnumC379630EuX.TEMPLATE});

    public static Source LJIILIIL(EnumC381960EyI enumC381960EyI) {
        int i = C381970EyJ.LIZLLL[enumC381960EyI.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return Source.TEMPLATE;
                        }
                        throw new C1954807lC();
                    }
                    return Source.EDIT_AI_PLAYGROUND;
                }
                return Source.EDITOR_PRO_AIGC_T2V;
            }
            return Source.EDITOR_PRO_AIGC_T2I;
        }
        return Source.EDITOR_PRO;
    }

    @Override // X.C382190Eyf, X.InterfaceC381760Exy
    public final InterfaceC346201Wa<List<C381540Exc>> LIZ(String str) {
        if (a0.LJJJIL(str)) {
            return C1518305wz.LL;
        }
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
        if (iCreationAsyncTaskManagerLIZ == null) {
            return C1518305wz.LL;
        }
        return new C0FXA(iCreationAsyncTaskManagerLIZ.LJJJJLI(str), 8);
    }

    @Override // X.C382190Eyf, X.InterfaceC381740Exw
    public final void LIZLLL(EnumC378030Erx enumC378030Erx) {
        String str;
        if (enumC378030Erx == EnumC378030Erx.NONE || (str = this.LIZIZ) == null) {
            return;
        }
        LJII(EnumC382030EyP.CANCEL, EnumC2331909Bt.TASK_ID, str, "GenAITaskService");
        this.LIZIZ = null;
    }

    @Override // X.C382190Eyf, X.InterfaceC381780Ey0
    public final C381540Exc LJFF(String str) {
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ;
        C0LSZ c0lszLJJII;
        if (a0.LJJJIL(str) || (iCreationAsyncTaskManagerLIZ = C09BV.LIZ()) == null || (c0lszLJJII = iCreationAsyncTaskManagerLIZ.LJJII(str)) == null) {
            return null;
        }
        return C0LSP.LIZIZ(c0lszLJJII);
    }

    @Override // X.C382190Eyf, X.InterfaceC381760Exy
    public final InterfaceC346201Wa<C381540Exc> LJI(String str) {
        if (a0.LJJJIL(str)) {
            return C1518305wz.LL;
        }
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
        if (iCreationAsyncTaskManagerLIZ == null) {
            return C1518305wz.LL;
        }
        return new C0FXA(iCreationAsyncTaskManagerLIZ.LJJJJL(str), 9);
    }

    @Override // X.C382190Eyf, X.InterfaceC382130EyZ
    public final void LJIIIZ(String str) {
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ;
        if (!a0.LJJJIL(str) && (iCreationAsyncTaskManagerLIZ = C09BV.LIZ()) != null && iCreationAsyncTaskManagerLIZ.LJIILIIL() != null) {
            C0LCT.LIZLLL(str, false);
        }
    }

    @Override // X.C382190Eyf, X.InterfaceC382130EyZ
    public final InterfaceC382380Eyy LJIIJJI(final C381950EyH c381950EyH) {
        return new InterfaceC382380Eyy() { // from class: X.0Eyv
            @Override // X.InterfaceC382380Eyy
            public final void onStart() {
                c381950EyH.onStart();
            }

            @Override // X.InterfaceC382380Eyy
            public final void LIZ(String str) {
                this.LIZIZ = str;
                c381950EyH.LIZ(str);
            }

            @Override // X.InterfaceC382380Eyy
            public final void LIZIZ(C377760ErW c377760ErW) {
                this.LIZIZ = null;
                c381950EyH.LIZIZ(c377760ErW);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    @Override // X.C382190Eyf, X.InterfaceC381760Exy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r7, X.InterfaceC1364105Vn<? super X.C381540Exc> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C382260Eym
            if (r0 == 0) goto L45
            r5 = r8
            X.0Eym r5 = (X.C382260Eym) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 != r1) goto L4b
            X.C155000ia.LIZIZ(r4)
        L23:
            X.0LSZ r4 = (X.C0LSZ) r4
            if (r4 == 0) goto L2b
            X.0Exc r2 = X.C0LSP.LIZIZ(r4)
        L2b:
            return r2
        L2c:
            X.C155000ia.LIZIZ(r4)
            boolean r0 = kotlin.text.a0.LJJJIL(r7)
            if (r0 == 0) goto L36
            return r2
        L36:
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r0 = X.C09BV.LIZ()
            if (r0 == 0) goto L2b
            r5.LLILLL = r1
            java.lang.Object r4 = r0.LJFF(r7, r5)
            if (r4 != r3) goto L23
            return r3
        L45:
            X.0Eym r5 = new X.0Eym
            r5.<init>(r6, r8)
            goto L12
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C382160Eyc.LIZIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0159  */
    @Override // X.C382190Eyf, X.InterfaceC382290Eyp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.C382150Eyb r17, X.InterfaceC1364105Vn<? super X.C382010EyN> r18) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C382160Eyc.LJIIJ(X.0Eyb, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    @Override // X.C382190Eyf, X.InterfaceC382290Eyp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(X.C382210Eyh r13, X.InterfaceC1364105Vn<? super X.C07U7> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C382230Eyj
            if (r0 == 0) goto L4e
            r11 = r14
            X.0Eyj r11 = (X.C382230Eyj) r11
            int r2 = r11.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4e
            int r2 = r2 - r1
            r11.LLILLL = r2
        L12:
            java.lang.Object r3 = r11.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r11.LLILLL
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L54
            X.C155000ia.LIZIZ(r3)
        L22:
            com.ss.android.ugc.aweme.base.api.BaseResponse r3 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r3
            if (r3 == 0) goto L5c
            X.07U7 r1 = new X.07U7
            int r0 = r3.error_code
            r1.<init>(r0)
            return r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r3 = X.C09BV.LIZ()
            if (r3 == 0) goto L5c
            java.lang.Integer r4 = r13.LIZ
            java.lang.String r5 = r13.LIZIZ
            java.lang.String r6 = r13.LIZJ
            java.lang.String r7 = r13.LIZLLL
            java.lang.String r8 = r13.LJ
            java.lang.String r9 = r13.LJFF
            java.util.List<java.lang.String> r10 = r13.LJI
            r11.LLILLL = r0
            java.lang.Object r3 = r3.LJJIIJ(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r3 != r2) goto L22
            return r2
        L4e:
            X.0Eyj r11 = new X.0Eyj
            r11.<init>(r12, r14)
            goto L12
        L54:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L5c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C382160Eyc.LJIIL(X.0Eyh, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    @Override // X.C382190Eyf, X.InterfaceC381760Exy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r6, java.lang.String r7, X.InterfaceC1364105Vn<? super java.util.List<X.C381540Exc>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C382250Eyl
            if (r0 == 0) goto L67
            r4 = r8
            X.0Eyl r4 = (X.C382250Eyl) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L67
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L49
            if (r0 != r1) goto L6d
            X.C155000ia.LIZIZ(r3)
        L22:
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L75
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r3, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r3.iterator()
        L35:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r0 = r1.next()
            X.0LSZ r0 = (X.C0LSZ) r0
            X.0Exc r0 = X.C0LSP.LIZIZ(r0)
            r2.add(r0)
            goto L35
        L49:
            X.C155000ia.LIZIZ(r3)
            boolean r0 = kotlin.text.a0.LJJJIL(r6)
            if (r0 != 0) goto L78
            boolean r0 = kotlin.text.a0.LJJJIL(r7)
            if (r0 != 0) goto L78
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r0 = X.C09BV.LIZ()
            if (r0 == 0) goto L75
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LJJJJJ(r6, r7, r4)
            if (r3 != r2) goto L22
            return r2
        L67:
            X.0Eyl r4 = new X.0Eyl
            r4.<init>(r5, r8)
            goto L12
        L6d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L75:
            X.13BV r2 = X.C13BV.INSTANCE
        L77:
            return r2
        L78:
            X.13BV r0 = X.C13BV.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C382160Eyc.LIZJ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    @Override // X.C382190Eyf, X.InterfaceC382290Eyp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(int r14, java.util.List<java.lang.String> r15, X.InterfaceC1364105Vn<? super X.C382080EyU> r16) {
        /*
            r13 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C382270Eyn
            if (r0 == 0) goto L67
            r4 = r3
            X.0Eyn r4 = (X.C382270Eyn) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L67
            int r2 = r2 - r1
            r4.LLILLL = r2
        L14:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r7 = 0
            r1 = 1
            if (r0 == 0) goto L55
            if (r0 != r1) goto L8a
            X.C155000ia.LIZIZ(r3)
        L25:
            X.0EyV r3 = (X.C382090EyV) r3
            if (r3 == 0) goto L92
            java.util.List<X.0Et3> r1 = r3.LIZ
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r6.<init>(r0)
            java.util.Iterator r5 = r1.iterator()
        L3a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r5.next()
            X.0Et3 r0 = (X.C378710Et3) r0
            X.0Et2 r4 = new X.0Et2
            java.lang.Integer r2 = r0.LIZ
            java.lang.String r1 = r0.LIZIZ
            java.lang.String r0 = r0.LIZJ
            r4.<init>(r2, r1, r0)
            r6.add(r4)
            goto L3a
        L55:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r0 = X.C09BV.LIZ()
            if (r0 == 0) goto L92
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LJ(r14, r15, r4)
            if (r3 != r2) goto L25
            return r2
        L67:
            X.0Eyn r4 = new X.0Eyn
            r4.<init>(r13, r3)
            goto L14
        L6d:
            X.0Et3 r0 = r3.LIZIZ
            if (r0 == 0) goto L7c
            X.0Et2 r7 = new X.0Et2
            java.lang.Integer r2 = r0.LIZ
            java.lang.String r1 = r0.LIZIZ
            java.lang.String r0 = r0.LIZJ
            r7.<init>(r2, r1, r0)
        L7c:
            boolean r8 = r3.LIZJ
            java.lang.Integer r9 = r3.LIZLLL
            java.lang.String r10 = r3.LJ
            long r11 = r3.LJFF
            X.0EyU r5 = new X.0EyU
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        L8a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L92:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C382160Eyc.LJ(int, java.util.List, X.05Vn):java.lang.Object");
    }

    @Override // X.C382190Eyf, X.InterfaceC381740Exw
    public final void LJII(EnumC382030EyP enumC382030EyP, EnumC2331909Bt enumC2331909Bt, String str, String str2) {
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ;
        if (a0.LJJJIL(str) || (iCreationAsyncTaskManagerLIZ = C09BV.LIZ()) == null) {
            return;
        }
        switch (C381970EyJ.LIZIZ[enumC382030EyP.ordinal()]) {
            case 1:
                int i = C381970EyJ.LIZ[enumC2331909Bt.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        iCreationAsyncTaskManagerLIZ.LJJIL(str);
                        return;
                    }
                    throw new C1954807lC();
                }
                iCreationAsyncTaskManagerLIZ.LJJIII(str);
                return;
            case 2:
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2331509Bp(enumC2331909Bt, str, null), 3);
                return;
            case 3:
                int i2 = C381970EyJ.LIZ[enumC2331909Bt.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        iCreationAsyncTaskManagerLIZ.LJIIIIZZ(str);
                        return;
                    }
                    throw new C1954807lC();
                }
                iCreationAsyncTaskManagerLIZ.LJII(str);
                return;
            case 4:
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2331709Br(enumC2331909Bt, str, null), 3);
                return;
            case 5:
                int i3 = C381970EyJ.LIZ[enumC2331909Bt.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        iCreationAsyncTaskManagerLIZ.LJJJIL(str);
                        return;
                    }
                    throw new C1954807lC();
                }
                iCreationAsyncTaskManagerLIZ.LJJIJIL(str);
                return;
            case 6:
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2331409Bo(enumC2331909Bt, str, str2, null), 3);
                return;
            case 7:
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2331609Bq(enumC2331909Bt, str, null), 3);
                return;
            default:
                throw new C1954807lC();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x021c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x023a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x031a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e5  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // X.C382190Eyf, X.InterfaceC382130EyZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.C382000EyM r52, kotlin.jvm.functions.Function1<? super X.C381540Exc, java.lang.Boolean> r53, X.InterfaceC1631620sYq<? super java.lang.String, ? super X.C381540Exc, ? super X.InterfaceC1364105Vn<? super java.lang.Boolean>, ? extends java.lang.Object> r54, X.InterfaceC1364105Vn<? super X.C382300Eyq> r55) {
        /*
            Method dump skipped, instruction units count: 1236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C382160Eyc.LJIIIIZZ(X.0EyM, kotlin.jvm.functions.Function1, X.0sYq, X.05Vn):java.lang.Object");
    }
}
