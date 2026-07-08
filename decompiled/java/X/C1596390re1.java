package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUsersResponse;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0re1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1596390re1 implements InterfaceC1596220rdk, InterfaceC1596200rdi, InterfaceC1596210rdj, InterfaceC1595130rbz {
    public final InterfaceC1596220rdk LIZ;
    public final InterfaceC1596200rdi LIZIZ;
    public final InterfaceC1596210rdj LIZJ;
    public volatile C1595260rcC<? extends List<? extends InterfaceC1891350zJl>> LIZLLL;

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
        return "MixRankSkylightRepo";
    }

    @Override // X.InterfaceC1595130rbz
    public final boolean LJIIL() {
        return this.LIZLLL != null;
    }

    @Override // X.InterfaceC1595130rbz
    public final C1595260rcC<? extends List<InterfaceC1891350zJl>> LJJI() {
        C1595260rcC c1595260rcC = this.LIZLLL;
        this.LIZLLL = null;
        return c1595260rcC;
    }

    public static C1595260rcC LJJIII(String str, Function0 function0) {
        List listSingletonList = (List) function0.invoke();
        if (listSingletonList == null || listSingletonList.isEmpty()) {
            listSingletonList = Collections.singletonList(new C1596360rdy(true, C1618440sDa.LIZIZ.LJJLIIIJLJLI().LJIIIIZZ()));
        }
        return new C1595260rcC(EnumC1595320rcI.SUCCESS, listSingletonList, str, null, null, 0, true, true, 0, 304);
    }

    public C1596390re1(InterfaceC1596220rdk interfaceC1596220rdk, InterfaceC1596200rdi interfaceC1596200rdi, InterfaceC1596210rdj interfaceC1596210rdj) {
        this.LIZ = interfaceC1596220rdk;
        this.LIZIZ = interfaceC1596200rdi;
        this.LIZJ = interfaceC1596210rdj;
    }

    @Override // X.InterfaceC1595130rbz
    public final List LJI(C1564500qoa c1564500qoa, String str, int i, AwS568S0100000_24 awS568S0100000_24) {
        InterfaceC1596240rdm interfaceC1596240rdm;
        List list = (List) awS568S0100000_24.invoke();
        if (list == null || (interfaceC1596240rdm = c1564500qoa.LJII) == null) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        return interfaceC1596240rdm.LIZ(str, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1595260rcC<? extends java.util.List<X.InterfaceC1891350zJl>> LJJIIJ(long r26, boolean r28, com.ss.android.ugc.aweme.bean.MixRankSkylightResponse r29, kotlin.jvm.functions.Function0<? extends java.util.List<? extends X.InterfaceC1891350zJl>> r30, java.lang.String r31, java.util.List<java.lang.Integer> r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1596390re1.LJJIIJ(long, boolean, com.ss.android.ugc.aweme.bean.MixRankSkylightResponse, kotlin.jvm.functions.Function0, java.lang.String, java.util.List, boolean):X.0rcC");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0260 A[Catch: all -> 0x034d, TRY_ENTER, TryCatch #7 {all -> 0x034d, blocks: (B:47:0x0123, B:53:0x0134, B:74:0x01aa, B:98:0x022a, B:113:0x026c, B:112:0x0260), top: B:182:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4 A[Catch: all -> 0x0359, TRY_ENTER, TRY_LEAVE, TryCatch #11 {all -> 0x0359, blocks: (B:24:0x00b2, B:29:0x00c4, B:32:0x00d1, B:36:0x00e4), top: B:190:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1 A[Catch: all -> 0x0359, TRY_ENTER, TryCatch #11 {all -> 0x0359, blocks: (B:24:0x00b2, B:29:0x00c4, B:32:0x00d1, B:36:0x00e4), top: B:190:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJII(java.lang.String r40, boolean r41, int r42, int r43, int r44, int r45, com.ss.android.ugc.aweme.story.inbox.InsertStory r46, kotlin.jvm.internal.AwS568S0100000_24 r47, boolean r48, X.C1595180rc4 r49, X.InterfaceC1364105Vn r50) {
        /*
            Method dump skipped, instruction units count: 952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1596390re1.LJJII(java.lang.String, boolean, int, int, int, int, com.ss.android.ugc.aweme.story.inbox.InsertStory, kotlin.jvm.internal.AwS568S0100000_24, boolean, X.0rc4, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    @Override // X.InterfaceC1595130rbz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C054G r19, java.lang.String r20, boolean r21, X.C1564500qoa r22, int r23, int r24, int r25, int r26, X.C1595180rc4 r27, com.ss.android.ugc.aweme.story.inbox.InsertStory r28, boolean r29, kotlin.jvm.internal.AwS568S0100000_24 r30, boolean r31, kotlin.jvm.functions.Function0 r32, X.InterfaceC1364105Vn r33) {
        /*
            r18 = this;
            r3 = r33
            r5 = r32
            boolean r0 = r3 instanceof X.C1596410re3
            r6 = r18
            if (r0 == 0) goto L59
            r4 = r3
            X.0re3 r4 = (X.C1596410re3) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r4.LLILZ = r2
        L18:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r0 = 1
            if (r1 == 0) goto L35
            if (r1 != r0) goto L5f
            kotlin.jvm.functions.Function0 r5 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L2a:
            r0 = r3
            X.0rcC r0 = (X.C1595260rcC) r0
            if (r5 == 0) goto L34
            r6.LIZLLL = r0
            r5.invoke()
        L34:
            return r3
        L35:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r5
            r4.LLILZ = r0
            r14 = r30
            r13 = r28
            r16 = r27
            r12 = r26
            r11 = r25
            r10 = r24
            r15 = r31
            r7 = r20
            r9 = r23
            r8 = r21
            r17 = r4
            java.lang.Object r3 = r6.LJJII(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r3 != r2) goto L2a
            return r2
        L59:
            X.0re3 r4 = new X.0re3
            r4.<init>(r6, r3)
            goto L18
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1596390re1.LIZLLL(X.054G, java.lang.String, boolean, X.0qoa, int, int, int, int, X.0rc4, com.ss.android.ugc.aweme.story.inbox.InsertStory, boolean, kotlin.jvm.internal.AwS568S0100000_24, boolean, kotlin.jvm.functions.Function0, X.05Vn):java.lang.Object");
    }
}
