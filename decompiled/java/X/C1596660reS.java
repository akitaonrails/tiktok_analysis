package X;

import android.content.Context;
import com.ss.android.ugc.aweme.experiment.FollowingSkylightAbilityExperienceExp;
import com.ss.android.ugc.aweme.experiment.FollowingSkylightAbilityOptConfig;
import java.util.List;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0reS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1596660reS implements InterfaceC1595030rbp {
    public final int LIZ;
    public C1595260rcC<? extends List<? extends InterfaceC1891350zJl>> LIZIZ;
    public int LIZJ = ((Number) FollowingSkylightAbilityExperienceExp.LJ.getValue()).intValue();
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1796));
    public volatile String LJ;
    public volatile boolean LJFF;

    @Override // X.InterfaceC1595130rbz
    public final List LJI(C1564500qoa c1564500qoa, String str, int i, AwS568S0100000_24 awS568S0100000_24) {
        return null;
    }

    @Override // X.InterfaceC1595130rbz
    public final boolean LJIIL() {
        return false;
    }

    @Override // X.InterfaceC1595130rbz
    public final C1595260rcC<? extends List<InterfaceC1891350zJl>> LJJI() {
        return null;
    }

    @Override // X.InterfaceC1595130rbz
    public final String getName() {
        return "FeedSkylightCoordinatorRepo";
    }

    @Override // X.InterfaceC1595030rbp
    public final void LJIILJJIL() {
        this.LIZJ--;
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
        return FollowingSkylightAbilityOptConfig.LIZ() && FollowingSkylightAbilityExperienceExp.LIZIZ() && this.LIZJ > 0;
    }

    @Override // X.InterfaceC1595030rbp
    public final List<InterfaceC1891350zJl> LJJ() {
        List list;
        C1595260rcC<? extends List<InterfaceC1891350zJl>> c1595260rcCLJIJI = LJIJI();
        return (c1595260rcCLJIJI == null || (list = c1595260rcCLJIJI.LIZIZ) == null) ? C13BV.INSTANCE : list;
    }

    @Override // X.InterfaceC1595030rbp
    public final C1595260rcC<? extends List<InterfaceC1891350zJl>> LJIJI() {
        return this.LIZIZ;
    }

    public C1596660reS(int i) {
        this.LIZ = i;
    }

    @Override // X.InterfaceC1595030rbp
    public final int LJIIJJI(String str) {
        return C1595050rbr.LIZ(this, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(int r23, X.InterfaceC1364105Vn<? super X.C1595260rcC<? extends java.util.List<? extends X.InterfaceC1891350zJl>>> r24) {
        /*
            r22 = this;
            r4 = r24
            boolean r1 = r4 instanceof X.C1596810reh
            r0 = r22
            if (r1 == 0) goto La1
            r5 = r4
            X.0reh r5 = (X.C1596810reh) r5
            int r3 = r5.LLILLL
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto La1
            int r3 = r3 - r2
            r5.LLILLL = r3
        L16:
            java.lang.Object r6 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r5.LLILLL
            r3 = 1
            if (r1 == 0) goto L62
            if (r1 != r3) goto La8
            X.C155000ia.LIZIZ(r6)
        L26:
            java.util.List r6 = (java.util.List) r6
            int r1 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r1 = "fetchLiveOnly done, size="
            r2.append(r1)
            int r1 = r6.size()
            r2.append(r1)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r2)
            java.lang.String r1 = "FeedSkylightCoordinatorRepo"
            X.C1720106oR.LJI(r1, r2)
            X.0rcC r4 = new X.0rcC
            boolean r1 = r0.LJFF
            if (r1 == 0) goto L5f
            X.0rcI r5 = X.EnumC1595320rcI.SUCCESS
        L4b:
            java.lang.String r7 = r0.LJ
            if (r7 != 0) goto L51
            java.lang.String r7 = ""
        L51:
            r8 = 0
            r10 = 0
            r14 = 496(0x1f0, float:6.95E-43)
            r9 = r8
            r11 = r10
            r12 = r10
            r13 = r10
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0.LIZIZ = r4
            return r4
        L5f:
            X.0rcI r5 = X.EnumC1595320rcI.COMPLETE
            goto L4b
        L62:
            X.C155000ia.LIZIZ(r6)
            X.0reZ r6 = new X.0reZ
            int r1 = r0.LIZ
            X.0rf5 r18 = X.EnumC1597050rf5.REFRESH
            r8 = 0
            X.0rea r7 = new X.0rea
            r10 = 0
            java.lang.Integer r11 = X.C2286608xc.LJ(r23)
            r17 = 503(0x1f7, float:7.05E-43)
            r9 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r15 = r10
            r16 = r10
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.util.List r20 = java.util.Collections.singletonList(r7)
            r21 = 12
            r19 = r8
            r17 = r1
            r16 = r6
            r16.<init>(r17, r18, r19, r20, r21)
            X.01GW r1 = r0.LIZLLL
            java.lang.Object r2 = r1.getValue()
            X.0rfi r2 = (X.C1597440rfi) r2
            X.0rf6 r1 = X.EnumC1597060rf6.LIVE
            r5.LLILLL = r3
            java.lang.Object r6 = r2.LIZIZ(r1, r6, r5)
            if (r6 != r4) goto L26
            return r4
        La1:
            X.0reh r5 = new X.0reh
            r5.<init>(r0, r4)
            goto L16
        La8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1596660reS.LIZ(int, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1595130rbz
    public final AbstractC316870CbV LIZIZ(int i, String str) {
        C1595260rcC<? extends List<InterfaceC1891350zJl>> c1595260rcCLJFF;
        if (i == 0 && C319860CgK.LIZ() && (c1595260rcCLJFF = new C1595280rcE().LJFF(C1601110rld.LIZ(), false)) != null) {
            return c1595260rcCLJFF.LIZ();
        }
        return null;
    }

    @Override // X.InterfaceC1595030rbp
    public final String LJIJJ(Context context, boolean z) {
        return C1595050rbr.LIZIZ(this, context, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0152  */
    @Override // X.InterfaceC1595130rbz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C054G r28, java.lang.String r29, boolean r30, X.C1564500qoa r31, int r32, int r33, int r34, int r35, X.C1595180rc4 r36, com.ss.android.ugc.aweme.story.inbox.InsertStory r37, boolean r38, kotlin.jvm.internal.AwS568S0100000_24 r39, boolean r40, kotlin.jvm.functions.Function0 r41, X.InterfaceC1364105Vn r42) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1596660reS.LIZLLL(X.054G, java.lang.String, boolean, X.0qoa, int, int, int, int, X.0rc4, com.ss.android.ugc.aweme.story.inbox.InsertStory, boolean, kotlin.jvm.internal.AwS568S0100000_24, boolean, kotlin.jvm.functions.Function0, X.05Vn):java.lang.Object");
    }
}
