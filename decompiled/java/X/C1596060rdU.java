package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUsersResponse;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rdU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1596060rdU implements InterfaceC1596220rdk, InterfaceC1596200rdi, InterfaceC1596210rdj, InterfaceC1595130rbz {
    public final InterfaceC1596220rdk LIZ;
    public final InterfaceC1596200rdi LIZIZ;
    public final InterfaceC1596210rdj LIZJ;
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public volatile C1595260rcC<? extends List<? extends InterfaceC1891350zJl>> LJ;
    public String LJFF;

    @Override // X.InterfaceC1596220rdk
    public final String LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // X.InterfaceC1596200rdi
    public final C1595260rcC<? extends List<InterfaceC1891350zJl>> LJFF(boolean z, boolean z2) {
        return this.LIZIZ.LJFF(z, z2);
    }

    @Override // X.InterfaceC1596200rdi
    public final boolean LJIILIIL() {
        return this.LIZIZ.LJIILIIL();
    }

    @Override // X.InterfaceC1596210rdj
    public final boolean LJIILLIIL() {
        return this.LIZJ.LJIILLIIL();
    }

    @Override // X.InterfaceC1596200rdi
    public final boolean LJIIZILJ() {
        return this.LIZIZ.LJIIZILJ();
    }

    @Override // X.InterfaceC1596220rdk
    public final FollowingInterestUsersResponse LJIJ(int i) {
        return this.LIZ.LJIJ(i);
    }

    @Override // X.InterfaceC1596210rdj
    public final boolean LJIJJLI() {
        return this.LIZJ.LJIJJLI();
    }

    @Override // X.InterfaceC1596210rdj
    public final void LJIL(Context context, List<FollowingInterestUser> list) {
        this.LIZJ.LJIL(context, list);
    }

    @Override // X.InterfaceC1596220rdk
    public final boolean LJJIFFI(boolean z) {
        return this.LIZ.LJJIFFI(z);
    }

    @Override // X.InterfaceC1595130rbz
    public final String getName() {
        return "FeedSkyLightRepoV2";
    }

    @Override // X.InterfaceC1595130rbz
    public final boolean LJIIL() {
        return this.LJ != null;
    }

    @Override // X.InterfaceC1595130rbz
    public final C1595260rcC<? extends List<InterfaceC1891350zJl>> LJJI() {
        C1595260rcC c1595260rcC = this.LJ;
        this.LJ = null;
        return c1595260rcC;
    }

    @Override // X.InterfaceC1595130rbz
    public final AbstractC316870CbV LIZIZ(int i, String str) {
        C1595260rcC<? extends List<InterfaceC1891350zJl>> c1595260rcCLJFF;
        if (!this.LIZLLL.compareAndSet(false, true)) {
            return null;
        }
        if (((!Intrinsics.LJFF(str, "homepage_hot") || !LJIIZILJ()) && (i != 0 || !C319860CgK.LIZ())) || (c1595260rcCLJFF = LJFF(LJIJJLI(), LJIILLIIL())) == null) {
            return null;
        }
        return c1595260rcCLJFF.LIZ();
    }

    public C1596060rdU(InterfaceC1596220rdk interfaceC1596220rdk, InterfaceC1596200rdi interfaceC1596200rdi, InterfaceC1596210rdj interfaceC1596210rdj) {
        this.LIZ = interfaceC1596220rdk;
        this.LIZIZ = interfaceC1596200rdi;
        this.LIZJ = interfaceC1596210rdj;
    }

    /* JADX WARN: Removed duplicated region for block: B:210:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fe  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC1595130rbz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List LJI(X.C1564500qoa r31, java.lang.String r32, int r33, kotlin.jvm.internal.AwS568S0100000_24 r34) {
        /*
            Method dump skipped, instruction units count: 1304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1596060rdU.LJI(X.0qoa, java.lang.String, int, kotlin.jvm.internal.AwS568S0100000_24):java.util.List");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final <T> C1595260rcC<? extends List<InterfaceC1891350zJl>> LJJII(C1596020rdQ<? extends T> c1596020rdQ, int i, boolean z, String str, long j) {
        List arrayList;
        EnumC1595320rcI enumC1595320rcI = c1596020rdQ.LIZIZ;
        T t = c1596020rdQ.LIZ;
        if (t instanceof StoryGetFeedByPageResponse) {
            C1596100rdY.LIZ.getClass();
            return C1596100rdY.LIZJ((StoryGetFeedByPageResponse) t, i, z, enumC1595320rcI, j);
        }
        if (t instanceof FollowingInterestUsersResponse) {
            FollowingInterestUsersResponse followingInterestUsersResponse = (FollowingInterestUsersResponse) t;
            if (!C596340NaC.LIZIZ().isEnabled || !C596340NaC.LIZIZ().liveCacheEnable || enumC1595320rcI != EnumC1595320rcI.FAIL) {
                C1596130rdb.LIZ.getClass();
                C1596130rdb.LJIILIIL(i, followingInterestUsersResponse);
            }
            Exception exc = c1596020rdQ.LIZJ;
            if (!LJJIFFI(z) && LJIILIIL()) {
                C1595340rcK.LIZ.getClass();
                return C1595340rcK.LIZLLL(i, false);
            }
            if (enumC1595320rcI == EnumC1595320rcI.FAIL) {
                if (z) {
                    C1595340rcK.LIZ.getClass();
                    return C1595340rcK.LIZLLL(i, true);
                }
                return new C1595260rcC<>(EnumC1595320rcI.SUCCESS, new ArrayList(), CardStruct.IStatusCode.DEFAULT, exc, null, 0, false, false, 0, 496);
            }
            boolean zLJIILLIIL = LJIILLIIL();
            boolean zLJIJJLI = LJIJJLI();
            List<FollowingInterestUser> followingInterestUsers = followingInterestUsersResponse.getFollowingInterestUsers();
            if (followingInterestUsers != null && !followingInterestUsers.isEmpty()) {
                List<FollowingInterestUser> followingInterestUsers2 = followingInterestUsersResponse.getFollowingInterestUsers();
                if (followingInterestUsers2 != null) {
                    Iterator<FollowingInterestUser> it2 = followingInterestUsers2.iterator();
                    while (it2.hasNext()) {
                        it2.next().setLogPbBean(followingInterestUsersResponse.getLogPbBean());
                    }
                }
                C1596010rdP.LIZ.getClass();
                C1596010rdP.LIZLLL();
            } else {
                C0JAU.LIZLLL().LIZIZ();
            }
            List<FollowingInterestUser> followingInterestUsers3 = followingInterestUsersResponse.getFollowingInterestUsers();
            if (followingInterestUsers3 != null) {
                arrayList = C1596310rdt.LIZ(C1596310rdt.LIZLLL(followingInterestUsers3, zLJIJJLI, zLJIILLIIL), zLJIILLIIL, zLJIJJLI);
            } else {
                arrayList = new ArrayList();
            }
            Integer numValueOf = Integer.valueOf(i);
            C1595340rcK.LIZ.getClass();
            C1595340rcK.LIZIZ.put(numValueOf, (List<InterfaceC1891350zJl>) arrayList);
            return new C1595260rcC<>(enumC1595320rcI, arrayList, CardStruct.IStatusCode.DEFAULT, null, null, 0, false, false, 0, 496);
        }
        return new C1595260rcC<>(EnumC1595320rcI.COMPLETE, new ArrayList(), CardStruct.IStatusCode.DEFAULT, null, null, 0, false, false, 0, 496);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:528:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0286  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIII(X.C054G r30, long r31, boolean r33, X.C1564500qoa r34, int r35, int r36, int r37, int r38, X.C1595180rc4 r39, com.ss.android.ugc.aweme.story.inbox.InsertStory r40, boolean r41, X.InterfaceC1364105Vn r42) {
        /*
            Method dump skipped, instruction units count: 2155
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1596060rdU.LJJIII(X.054G, long, boolean, X.0qoa, int, int, int, int, X.0rc4, com.ss.android.ugc.aweme.story.inbox.InsertStory, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    @Override // X.InterfaceC1595130rbz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C054G r21, java.lang.String r22, boolean r23, X.C1564500qoa r24, int r25, int r26, int r27, int r28, X.C1595180rc4 r29, com.ss.android.ugc.aweme.story.inbox.InsertStory r30, boolean r31, kotlin.jvm.internal.AwS568S0100000_24 r32, boolean r33, kotlin.jvm.functions.Function0 r34, X.InterfaceC1364105Vn r35) {
        /*
            r20 = this;
            r3 = r35
            r4 = r34
            boolean r0 = r3 instanceof X.C1596160rde
            r6 = r20
            if (r0 == 0) goto L7a
            r5 = r3
            X.0rde r5 = (X.C1596160rde) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7a
            int r2 = r2 - r1
            r5.LLILZ = r2
        L18:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 1
            if (r0 == 0) goto L35
            if (r0 != r2) goto L80
            kotlin.jvm.functions.Function0 r4 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L2a:
            r0 = r1
            X.0rcC r0 = (X.C1595260rcC) r0
            if (r4 == 0) goto L34
            r6.LJ = r0
            r4.invoke()
        L34:
            return r1
        L35:
            X.C155000ia.LIZIZ(r1)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "fetchSkylightData: with onFinish: "
            r1.append(r0)
            if (r4 == 0) goto L78
            r0 = 1
        L44:
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r22)
            if (r0 == 0) goto L75
            long r8 = r0.longValue()
        L54:
            r5.LL = r4
            r5.LLILZ = r2
            r17 = r30
            r16 = r29
            r15 = r28
            r14 = r27
            r13 = r26
            r11 = r24
            r7 = r21
            r18 = r31
            r12 = r25
            r10 = r23
            r19 = r5
            java.lang.Object r1 = r6.LJJIII(r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            if (r1 != r3) goto L2a
            return r3
        L75:
            r8 = 0
            goto L54
        L78:
            r0 = 0
            goto L44
        L7a:
            X.0rde r5 = new X.0rde
            r5.<init>(r6, r3)
            goto L18
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1596060rdU.LIZLLL(X.054G, java.lang.String, boolean, X.0qoa, int, int, int, int, X.0rc4, com.ss.android.ugc.aweme.story.inbox.InsertStory, boolean, kotlin.jvm.internal.AwS568S0100000_24, boolean, kotlin.jvm.functions.Function0, X.05Vn):java.lang.Object");
    }
}
