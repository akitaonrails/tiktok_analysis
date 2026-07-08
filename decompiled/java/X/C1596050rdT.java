package X;

import android.content.Context;
import com.ss.android.ugc.aweme.experiment.FollowingSkylightAbilityExperienceExp;
import com.ss.android.ugc.aweme.experiment.FollowingSkylightAbilityOptConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUsersResponse;
import com.ss.android.ugc.aweme.feed.module.SkylightFollowingUserEntry;
import com.ss.android.ugc.aweme.feed.module.SkylightFollowingUserRedDot;
import com.ss.android.ugc.aweme.feed.module.SkylightFollowingUserResponse;
import com.ss.android.ugc.aweme.model.SkylightFollowingUserItem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0rdT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1596050rdT implements InterfaceC1596220rdk, InterfaceC1596200rdi, InterfaceC1596210rdj, InterfaceC1595030rbp {
    public final InterfaceC1596220rdk LIZ;
    public final InterfaceC1596200rdi LIZIZ;
    public final InterfaceC1596210rdj LIZJ;
    public volatile C1595260rcC<? extends List<? extends InterfaceC1891350zJl>> LIZLLL;
    public C1595260rcC<? extends List<? extends InterfaceC1891350zJl>> LJ;
    public int LJFF = ((Number) FollowingSkylightAbilityExperienceExp.LJ.getValue()).intValue();

    @Override // X.InterfaceC1596220rdk
    public final String LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // X.InterfaceC1595130rbz
    public final AbstractC316870CbV LIZIZ(int i, String str) {
        return null;
    }

    @Override // X.InterfaceC1596200rdi
    public final C1595260rcC<? extends List<InterfaceC1891350zJl>> LJFF(boolean z, boolean z2) {
        return this.LIZIZ.LJFF(z, z2);
    }

    @Override // X.InterfaceC1595130rbz
    public final List LJI(C1564500qoa c1564500qoa, String str, int i, AwS568S0100000_24 awS568S0100000_24) {
        return null;
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
        return "FollowingSkylightRepo";
    }

    @Override // X.InterfaceC1595130rbz
    public final boolean LJIIL() {
        return this.LIZLLL != null;
    }

    @Override // X.InterfaceC1595030rbp
    public final void LJIILJJIL() {
        this.LJFF--;
    }

    @Override // X.InterfaceC1595130rbz
    public final C1595260rcC<? extends List<InterfaceC1891350zJl>> LJJI() {
        C1595260rcC c1595260rcC = this.LIZLLL;
        this.LIZLLL = null;
        return c1595260rcC;
    }

    @Override // X.InterfaceC1595030rbp
    public final int LIZJ() {
        return C1595050rbr.LJFF(this);
    }

    @Override // X.InterfaceC1595030rbp
    public final int LJ() {
        return C1595050rbr.LIZLLL(this);
    }

    @Override // X.InterfaceC1595030rbp
    public final int LJII() {
        return C1595050rbr.LJ(this);
    }

    @Override // X.InterfaceC1595030rbp
    public final int LJIIIIZZ() {
        return C1595050rbr.LJI(this);
    }

    @Override // X.InterfaceC1595030rbp
    public final int LJIIIZ() {
        return C1595050rbr.LIZJ(this);
    }

    @Override // X.InterfaceC1595030rbp
    public final boolean LJIILL() {
        return FollowingSkylightAbilityOptConfig.LIZ() && FollowingSkylightAbilityExperienceExp.LIZIZ() && this.LJFF > 0;
    }

    @Override // X.InterfaceC1595030rbp
    public final List<InterfaceC1891350zJl> LJJ() {
        List list;
        C1595260rcC<? extends List<InterfaceC1891350zJl>> c1595260rcCLJIJI = LJIJI();
        return (c1595260rcCLJIJI == null || (list = c1595260rcCLJIJI.LIZIZ) == null) ? C13BV.INSTANCE : list;
    }

    @Override // X.InterfaceC1595030rbp
    public final C1595260rcC<? extends List<InterfaceC1891350zJl>> LJIJI() {
        return this.LJ;
    }

    @Override // X.InterfaceC1595030rbp
    public final int LJIIJJI(String str) {
        return C1595050rbr.LIZ(this, str);
    }

    @Override // X.InterfaceC1595030rbp
    public final String LJIJJ(Context context, boolean z) {
        return C1595050rbr.LIZIZ(this, context, z);
    }

    public C1596050rdT(InterfaceC1596220rdk interfaceC1596220rdk, InterfaceC1596200rdi interfaceC1596200rdi, InterfaceC1596210rdj interfaceC1596210rdj) {
        this.LIZ = interfaceC1596220rdk;
        this.LIZIZ = interfaceC1596200rdi;
        this.LIZJ = interfaceC1596210rdj;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final <T> C1595260rcC<? extends List<InterfaceC1891350zJl>> LJJII(C1596020rdQ<? extends T> c1596020rdQ, int i, boolean z, String str, long j) {
        List<SkylightFollowingUserEntry> list;
        List arrayList;
        EnumC1595320rcI enumC1595320rcI = c1596020rdQ.LIZIZ;
        EnumC1595320rcI enumC1595320rcI2 = EnumC1595320rcI.FAIL;
        if (enumC1595320rcI == enumC1595320rcI2) {
            return new C1595260rcC<>(enumC1595320rcI2, C13BV.INSTANCE, CardStruct.IStatusCode.DEFAULT, new Exception(c1596020rdQ.LIZJ), null, 0, false, false, 0, 496);
        }
        T t = c1596020rdQ.LIZ;
        if (t instanceof FollowingInterestUsersResponse) {
            FollowingInterestUsersResponse followingInterestUsersResponse = (FollowingInterestUsersResponse) t;
            C1596130rdb.LIZ.getClass();
            C1596130rdb.LJIILIIL(i, followingInterestUsersResponse);
            C1596010rdP c1596010rdP = C1596010rdP.LIZ;
            InterfaceC1596220rdk interfaceC1596220rdk = this.LIZ;
            InterfaceC1596200rdi interfaceC1596200rdi = this.LIZIZ;
            InterfaceC1596210rdj interfaceC1596210rdj = this.LIZJ;
            c1596010rdP.getClass();
            if (!interfaceC1596220rdk.LJJIFFI(z) && interfaceC1596200rdi.LJIILIIL()) {
                C1595340rcK.LIZ.getClass();
                return C1595340rcK.LIZLLL(i, false);
            }
            boolean zLJIILLIIL = interfaceC1596210rdj.LJIILLIIL();
            boolean zLJIJJLI = interfaceC1596210rdj.LJIJJLI();
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
        if (t instanceof StoryGetFeedByPageResponse) {
            C1596100rdY.LIZ.getClass();
            return C1596100rdY.LIZJ((StoryGetFeedByPageResponse) t, i, z, enumC1595320rcI, j);
        }
        if (t instanceof SkylightFollowingUserResponse) {
            SkylightFollowingUserResponse skylightFollowingUserResponse = (SkylightFollowingUserResponse) t;
            ArrayList arrayList2 = new ArrayList();
            List<SkylightFollowingUserEntry> list2 = skylightFollowingUserResponse.getList();
            if (list2 != null && !list2.isEmpty() && (list = skylightFollowingUserResponse.getList()) != null) {
                for (SkylightFollowingUserEntry skylightFollowingUserEntry : list) {
                    Aweme aweme = skylightFollowingUserEntry.aweme;
                    if (aweme != null) {
                        aweme.setAuthor(skylightFollowingUserEntry.user);
                        arrayList2.add(new SkylightFollowingUserItem(skylightFollowingUserEntry.user, skylightFollowingUserEntry.redDot, aweme));
                    } else {
                        User user = skylightFollowingUserEntry.user;
                        SkylightFollowingUserRedDot skylightFollowingUserRedDot = skylightFollowingUserEntry.redDot;
                        Aweme aweme2 = new Aweme();
                        aweme2.setAid(UUID.randomUUID().toString());
                        aweme2.setAwemeType(5000);
                        arrayList2.add(new SkylightFollowingUserItem(user, skylightFollowingUserRedDot, aweme2));
                    }
                }
            }
            return new C1595260rcC<>(enumC1595320rcI, arrayList2, CardStruct.IStatusCode.DEFAULT, null, null, 0, false, false, 0, 496);
        }
        return new C1595260rcC<>(EnumC1595320rcI.COMPLETE, new ArrayList(), CardStruct.IStatusCode.DEFAULT, null, null, 0, false, false, 0, 496);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIII(X.C054G r24, long r25, boolean r27, int r28, int r29, X.C1595180rc4 r30, X.InterfaceC1364105Vn r31) {
        /*
            Method dump skipped, instruction units count: 926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1596050rdT.LJJIII(X.054G, long, boolean, int, int, X.0rc4, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    @Override // X.InterfaceC1595130rbz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C054G r17, java.lang.String r18, boolean r19, X.C1564500qoa r20, int r21, int r22, int r23, int r24, X.C1595180rc4 r25, com.ss.android.ugc.aweme.story.inbox.InsertStory r26, boolean r27, kotlin.jvm.internal.AwS568S0100000_24 r28, boolean r29, kotlin.jvm.functions.Function0 r30, X.InterfaceC1364105Vn r31) {
        /*
            r16 = this;
            r3 = r31
            r6 = r30
            boolean r0 = r3 instanceof X.C1596170rdf
            r7 = r16
            if (r0 == 0) goto L8c
            r15 = r3
            X.0rdf r15 = (X.C1596170rdf) r15
            int r2 = r15.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8c
            int r2 = r2 - r1
            r15.LLILZ = r2
        L18:
            java.lang.Object r5 = r15.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r15.LLILZ
            r4 = 0
            r2 = 1
            if (r0 == 0) goto L53
            if (r0 != r2) goto L92
            kotlin.jvm.functions.Function0 r6 = r15.LL
            X.C155000ia.LIZIZ(r5)
        L2b:
            r0 = r5
            X.0rcC r0 = (X.C1595260rcC) r0
            r7.LJ = r0
            if (r6 == 0) goto L4f
            r7.LIZLLL = r0
            r6.invoke()
            X.0rcI r1 = r0.LIZ
            X.0rcI r0 = X.EnumC1595320rcI.FAIL
            if (r1 != r0) goto L50
            java.lang.String r3 = "false"
        L3f:
            kotlin.Pair[] r2 = new kotlin.Pair[r2]
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "success"
            r1.<init>(r3, r0)
            r2[r4] = r1
            java.lang.String r0 = "skylight_refresh_finished"
            X.C20684815ws.LJIJI(r0, r2)
        L4f:
            return r5
        L50:
            java.lang.String r3 = "true"
            goto L3f
        L53:
            X.C155000ia.LIZIZ(r5)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "fetchSkylightData: with onFinish: "
            r1.append(r0)
            if (r6 == 0) goto L8a
            r0 = 1
        L62:
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r18)
            if (r0 == 0) goto L87
            long r9 = r0.longValue()
        L72:
            r15.LL = r6
            r15.LLILZ = r2
            r14 = r25
            r13 = r24
            r11 = r19
            r8 = r17
            r12 = r21
            java.lang.Object r5 = r7.LJJIII(r8, r9, r11, r12, r13, r14, r15)
            if (r5 != r3) goto L2b
            return r3
        L87:
            r9 = 0
            goto L72
        L8a:
            r0 = 0
            goto L62
        L8c:
            X.0rdf r15 = new X.0rdf
            r15.<init>(r7, r3)
            goto L18
        L92:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1596050rdT.LIZLLL(X.054G, java.lang.String, boolean, X.0qoa, int, int, int, int, X.0rc4, com.ss.android.ugc.aweme.story.inbox.InsertStory, boolean, kotlin.jvm.internal.AwS568S0100000_24, boolean, kotlin.jvm.functions.Function0, X.05Vn):java.lang.Object");
    }
}
