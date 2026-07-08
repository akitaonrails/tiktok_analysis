package X;

/* JADX INFO: renamed from: X.06CX, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06CX {
    public static final C06CX LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static final C054G LIZLLL;
    public volatile C1598406Nq LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C06CX.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        C06CX c06cx = new C06CX();
        LIZIZ = c06cx;
        C1598406Nq c1598406Nq = c06cx.LIZ;
        if (c1598406Nq == null) {
            synchronized (c06cx) {
                c1598406Nq = c06cx.LIZ;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    c06cx.LIZ = c1598406Nq;
                }
            }
        }
        LIZLLL = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
    }

    public static void LIZJ(C06CJ c06cj, Integer num, String str) {
        boolean z = C1590806Ks.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakPetInviteManager ");
        sbLIZ.append(num);
        sbLIZ.append(' ');
        sbLIZ.append(str);
        C1590806Ks.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (str == null) {
            str = "";
        }
        c06cj.LIZ(num, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r12, X.C06CJ r13, X.InterfaceC1364105Vn<? super kotlin.Pair<java.lang.String, ? extends com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate>> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C06CZ
            r5 = r11
            if (r0 == 0) goto La2
            r10 = r14
            X.06CZ r10 = (X.C06CZ) r10
            int r2 = r10.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La2
            int r2 = r2 - r1
            r10.LLILZ = r2
        L13:
            java.lang.Object r3 = r10.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r10.LLILZ
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 != r1) goto La9
            java.lang.Object r6 = r10.LL
            X.C155000ia.LIZIZ(r3)
        L25:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r6, r3)
            return r0
        L2b:
            X.C155000ia.LIZIZ(r3)
            X.06Ey r0 = X.C1575806Ey.LIZJ
            r0.getClass()
            com.ss.android.ugc.aweme.im.streak.api.StreakData r4 = X.C1575806Ey.LJIIIIZZ(r12)
            X.06C6 r0 = X.C06C6.LIZIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData r3 = X.C06C6.LIZIZ(r12)
            X.0YSQ r0 = X.InterfaceC876950Yaj.LIZ
            X.0Yaj r0 = X.C0YSQ.LIZIZ(r0)
            X.0Y8T r0 = r0.LIZ(r12)
            if (r0 == 0) goto L8a
            boolean r0 = r0.isSingleChat()
            if (r0 != r1) goto L8a
            boolean r0 = X.C1567806Bw.LIZLLL(r4)
            if (r0 == 0) goto L78
            java.lang.String r6 = "streak_pet_invitation_v2"
        L5a:
            boolean r0 = X.C1567806Bw.LIZLLL(r4)
            if (r0 == 0) goto L75
            java.lang.String r7 = "adopt"
        L62:
            kotlin.jvm.internal.AwS87S1000000_2 r9 = new kotlin.jvm.internal.AwS87S1000000_2
            r0 = 18
            r9.<init>(r12, r0)
            r10.LL = r6
            r10.LLILZ = r1
            r8 = r13
            java.lang.Object r3 = r5.LIZ(r6, r7, r8, r9, r10)
            if (r3 != r2) goto L25
            return r2
        L75:
            java.lang.String r7 = "hatch"
            goto L62
        L78:
            if (r4 == 0) goto L87
            boolean r0 = X.C1567806Bw.LJ(r4)
            if (r0 != r1) goto L87
            kotlin.Pair r1 = new kotlin.Pair
            r0 = 0
            r1.<init>(r0, r0)
            return r1
        L87:
            java.lang.String r6 = "streak_pet_egg_invitation"
            goto L5a
        L8a:
            boolean r0 = X.C296670Bk1.LIZ()
            if (r0 == 0) goto L9f
            boolean r0 = X.C1571306Df.LJ(r3)
            if (r0 != 0) goto L9f
            boolean r0 = X.C1567806Bw.LIZLLL(r4)
            if (r0 != 0) goto L9f
            java.lang.String r6 = "streak_group_pet_egg_invitation"
            goto L5a
        L9f:
            java.lang.String r6 = "streak_group_pet_invitation"
            goto L5a
        La2:
            X.06CZ r10 = new X.06CZ
            r10.<init>(r5, r14)
            goto L13
        La9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06CX.LIZIZ(java.lang.String, X.06CJ, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r12, java.lang.String r13, X.C06CJ r14, kotlin.jvm.functions.Function0<kotlin.Unit> r15, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate> r16) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06CX.LIZ(java.lang.String, java.lang.String, X.06CJ, kotlin.jvm.functions.Function0, X.05Vn):java.lang.Object");
    }
}
