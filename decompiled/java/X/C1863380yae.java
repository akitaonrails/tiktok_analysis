package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tako.base.internal.db.MessageDatabase;
import com.ss.android.ugc.aweme.tako.ccl.model.ActionDoc;
import com.ss.android.ugc.aweme.tako.ccl.model.EntryDoc;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.SubConversationEntranceInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import defpackage.r2;
import defpackage.u2;
import defpackage.w2;
import defpackage.x2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AFwS229S0000000_2;

/* JADX INFO: renamed from: X.0yae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1863380yae implements InterfaceC320160Cgo {
    public static Message LJJIJIL;
    public static Message LJJIJL;
    public static String LJJIL;
    public final Function0<EntryDoc> LIZ;
    public Function0<ActionDoc> LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public String LJ;
    public String LJFF;
    public final long LJI;
    public final long LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final boolean LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final SubConversationEntranceInfo LJIILJJIL;
    public final C1863280yaU LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public C2252331DDr LJIJ;
    public final C05YC<u2> LJIJI;
    public final C2252331DDr LJIJJ;
    public final InterfaceC497601wk LJIJJLI;
    public boolean LJIL;
    public Integer LJJ;
    public int LJJI;
    public int LJJIFFI;
    public static final C1863420yai LJJII = new C1863420yai();
    public static volatile ConcurrentHashMap<String, C05YC<w2>> LJJIII = new ConcurrentHashMap<>();
    public static volatile ConcurrentHashMap<String, C05YC<x2>> LJJIIJ = new ConcurrentHashMap<>();
    public static volatile ConcurrentHashMap<String, InterfaceC332260D0u<Boolean>> LJJIIJZLJL = new ConcurrentHashMap<>();
    public static volatile ConcurrentHashMap<String, InterfaceC332260D0u<Boolean>> LJJIIZ = new ConcurrentHashMap<>();
    public static volatile ConcurrentHashMap<String, Boolean> LJJIIZI = new ConcurrentHashMap<>();
    public static volatile ConcurrentHashMap<String, w2> LJJIJ = new ConcurrentHashMap<>();
    public static volatile ConcurrentHashMap<String, u2> LJJIJIIJI = new ConcurrentHashMap<>();
    public static volatile ConcurrentHashMap<String, Set<String>> LJJIJIIJIL = new ConcurrentHashMap<>();
    public static final List<String> LJJIJLIJ = new ArrayList();

    public C1863380yae() {
        throw null;
    }

    public final u2 LJIILIIL() {
        C1863840ybO next;
        C1863280yaU c1863280yaU = this.LJIILL;
        Iterator<C1863840ybO> it2 = c1863280yaU.LJI.LIZ().LJIILLIIL().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            C1863840ybO c1863840ybO = next;
            if (c1863840ybO.LJIIIIZZ == c1863280yaU.LIZLLL && c1863840ybO.LJIIIZ == c1863280yaU.LJ) {
                break;
            }
        }
        C1863840ybO c1863840ybO2 = next;
        if (c1863840ybO2 != null) {
            return C1863670yb7.LIZIZ(c1863840ybO2, -1L);
        }
        Keva keva = MessageDatabase.LL;
        String strLIZ = C1863690yb9.LIZ(c1863280yaU.LIZLLL, c1863280yaU.LIZIZ);
        if (TextUtils.isEmpty(strLIZ)) {
            return null;
        }
        return new u2(true, strLIZ, 0L, 0L, null, false, false, 0, false, false, false, false, null, c1863280yaU.LIZLLL, c1863280yaU.LJ, 8188);
    }

    public final Object LJI(InterfaceC1364105Vn<? super u2> interfaceC1364105Vn) {
        return this.LJIILL.LJJLIIIJ(interfaceC1364105Vn);
    }

    public final Message LJIILL(String str) {
        List<C1862400yZ4> listLJIIJJI = this.LJIILL.LJI.LIZ().LJIIJJI(str);
        if (listLJIIJJI.isEmpty()) {
            return null;
        }
        return C1862370yZ1.LIZIZ((C1862400yZ4) ListProtector.get(listLJIIJJI, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.tako.ccl.net.GetUserSettingSwitchStatusResponse> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C1863640yb4
            if (r0 == 0) goto L7c
            r7 = r11
            X.0yb4 r7 = (X.C1863640yb4) r7
            int r2 = r7.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r7.LLILZIL = r2
        L12:
            java.lang.Object r0 = r7.LLILLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r1 = r7.LLILZIL
            r8 = 0
            r9 = 0
            r5 = 3
            r4 = 2
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 == r2) goto L41
            if (r1 == r4) goto L5b
            if (r1 != r5) goto L82
            java.lang.Object r4 = r7.LLILLJJLI
            X.C155000ia.LIZIZ(r0)
        L2c:
            return r4
        L2d:
            X.C155000ia.LIZIZ(r0)
            X.0ybc r1 = X.C1863980ybc.LIZ
            r7.LLILLJJLI = r1
            r7.LL = r8
            r7.LLILZIL = r2
            java.lang.Object r0 = r10.LJI(r7)
            if (r0 != r6) goto L3f
            return r6
        L3f:
            r3 = 0
            goto L4a
        L41:
            int r3 = r7.LL
            java.lang.Object r1 = r7.LLILLJJLI
            X.0ybc r1 = (X.C1863980ybc) r1
            X.C155000ia.LIZIZ(r0)
        L4a:
            u2 r0 = (defpackage.u2) r0
            java.lang.String r0 = r0.LIZIZ
            r7.LLILLJJLI = r9
            r7.LL = r3
            r7.LLILZIL = r4
            java.lang.Object r0 = r1.LJIL(r8, r0, r7)
            if (r0 != r6) goto L60
            return r6
        L5b:
            int r3 = r7.LL
            X.C155000ia.LIZIZ(r0)
        L60:
            r4 = r0
            com.ss.android.ugc.aweme.tako.ccl.net.GetUserSettingSwitchStatusResponse r4 = (com.ss.android.ugc.aweme.tako.ccl.net.GetUserSettingSwitchStatusResponse) r4
            java.lang.String r2 = r4.switchStatus
            if (r2 == 0) goto L2c
            boolean r0 = X.C123100dR.LIZ(r2)
            if (r0 == 0) goto L2c
            X.0yaU r1 = r10.LJIILL
            r7.LLILLJJLI = r4
            r7.LLILZIL = r5
            java.lang.String r0 = X.C1863280yaU.LJIILLIIL
            java.lang.Object r0 = r1.LJJIIZ(r3, r8, r2, r7)
            if (r0 != r6) goto L2c
            return r6
        L7c:
            X.0yb4 r7 = new X.0yb4
            r7.<init>(r10, r11)
            goto L12
        L82:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863380yae.LJIILLIIL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(int r8, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.tako.ccl.net.AudioAuthResponse> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C1863620yb2
            if (r0 == 0) goto L51
            r6 = r9
            X.0yb2 r6 = (X.C1863620yb2) r6
            int r2 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r6.LLILZIL = r2
        L12:
            java.lang.Object r2 = r6.LLILLL
            java.lang.Object r5 = X.C099R.LJFF()
            int r1 = r6.LLILZIL
            r4 = 2
            r0 = 1
            if (r1 == 0) goto L26
            if (r1 == r0) goto L38
            if (r1 != r4) goto L57
            X.C155000ia.LIZIZ(r2)
        L25:
            return r2
        L26:
            X.C155000ia.LIZIZ(r2)
            X.0ybc r3 = X.C1863980ybc.LIZ
            r6.LLILLJJLI = r3
            r6.LL = r8
            r6.LLILZIL = r0
            java.lang.Object r2 = r7.LJI(r6)
            if (r2 != r5) goto L3f
            return r5
        L38:
            int r8 = r6.LL
            X.0ybc r3 = r6.LLILLJJLI
            X.C155000ia.LIZIZ(r2)
        L3f:
            u2 r2 = (defpackage.u2) r2
            java.lang.String r2 = r2.LIZIZ
            java.lang.String r1 = r7.LJIILIIL
            r0 = 0
            r6.LLILLJJLI = r0
            r6.LLILZIL = r4
            java.lang.Object r2 = r3.LIZJ(r8, r2, r1, r6)
            if (r2 != r5) goto L25
            return r5
        L51:
            X.0yb2 r6 = new X.0yb2
            r6.<init>(r7, r9)
            goto L12
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863380yae.LJIIIIZZ(int, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.C1863340yaa r7, X.InterfaceC1856420yPQ r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C1863560yaw
            if (r0 == 0) goto L4b
            r5 = r9
            X.0yaw r5 = (X.C1863560yaw) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4b
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r2 = r5.LLILZ
            r3 = 2
            r0 = 1
            if (r2 == 0) goto L28
            if (r2 == r0) goto L38
            if (r2 != r3) goto L51
            X.C155000ia.LIZIZ(r1)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r1)
            X.0yaU r2 = r6.LJIILL
            r5.LL = r2
            r5.LLILZ = r0
            java.lang.Object r1 = X.C1863390yaf.LIZLLL(r7, r6, r8, r5)
            if (r1 != r4) goto L3d
            return r4
        L38:
            X.0yaU r2 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L3d:
            r2 r1 = (defpackage.r2) r1
            r0 = 0
            r5.LL = r0
            r5.LLILZ = r3
            java.lang.Object r0 = r2.LJIILL(r1, r5)
            if (r0 != r4) goto L25
            return r4
        L4b:
            X.0yaw r5 = new X.0yaw
            r5.<init>(r6, r9)
            goto L12
        L51:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863380yae.LJ(X.0yaa, X.0yPQ, X.05Vn):java.lang.Object");
    }

    public final Object LJII(Message message, List<Message> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLJIILL = this.LJIILL.LJIILL(C1863390yaf.LJI(message, this, list), interfaceC1364105Vn);
        if (objLJIILL == C099R.LJFF()) {
            return objLJIILL;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0211  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(int r38, long r39, X.InterfaceC1364105Vn r41) {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863380yae.LJIILJJIL(int, long, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC320160Cgo
    public final r2 LIZLLL(C1863380yae c1863380yae, boolean z, int i, Map<String, String> map) {
        return C1863390yaf.LJIIJ(c1863380yae, z, i, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(com.ss.android.ugc.aweme.tako.ccl.model.NovelStatus r54, com.ss.android.ugc.aweme.tako.ccl.model.BotDoc r55, X.InterfaceC1859790yUr r56, X.InterfaceC1364105Vn<? super kotlin.Unit> r57) {
        /*
            r53 = this;
            r3 = r57
            boolean r0 = r3 instanceof X.C1863520yas
            r5 = r53
            if (r0 == 0) goto La7
            r4 = r3
            X.0yas r4 = (X.C1863520yas) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La7
            int r2 = r2 - r1
            r4.LLILZ = r2
        L16:
            java.lang.Object r6 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r4.LLILZ
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L2c
            if (r2 == r0) goto L93
            if (r2 != r1) goto Lae
            X.C155000ia.LIZIZ(r6)
        L29:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            X.C155000ia.LIZIZ(r6)
            X.0yaU r1 = r5.LJIILL
            r4.LL = r1
            r4.LLILZ = r0
            r2 r6 = new r2
            r7 = 15
            r8 = 0
            r0 = r6
            r17 = 0
            r51 = -3309570(0xffffffffffcd7ffe, float:NaN)
            r52 = 8191(0x1fff, float:1.1478E-41)
            r28 = r56
            r24 = r55
            r27 = r54
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r18 = r17
            r19 = r8
            r20 = r8
            r21 = r17
            r22 = r5
            r23 = r8
            r25 = r8
            r26 = r8
            r29 = r8
            r30 = r8
            r31 = r8
            r32 = r17
            r33 = r8
            r34 = r17
            r35 = r17
            r36 = r17
            r37 = r8
            r38 = r8
            r39 = r17
            r40 = r8
            r41 = r8
            r42 = r8
            r43 = r17
            r44 = r8
            r45 = r8
            r46 = r17
            r47 = r17
            r48 = r17
            r49 = r17
            r50 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            if (r0 != r3) goto L98
            return r3
        L93:
            X.0yaU r1 = r4.LL
            X.C155000ia.LIZIZ(r6)
        L98:
            r2 r6 = (defpackage.r2) r6
            r0 = 0
            r4.LL = r0
            r0 = 2
            r4.LLILZ = r0
            java.lang.Object r0 = r1.LJIILL(r6, r4)
            if (r0 != r3) goto L29
            return r3
        La7:
            X.0yas r4 = new X.0yas
            r4.<init>(r5, r3)
            goto L16
        Lae:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863380yae.LJIIL(com.ss.android.ugc.aweme.tako.ccl.model.NovelStatus, com.ss.android.ugc.aweme.tako.ccl.model.BotDoc, X.0yUr, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC320160Cgo
    public final r2 LIZIZ(int i, C1863380yae c1863380yae, Message message, Function1<? super w2, Unit> function1, C1E8R c1e8r) {
        return C1863390yaf.LJIIIIZZ(i, c1863380yae, message, function1, c1e8r);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJJLI(int r13, int r14, java.lang.String r15, java.lang.String r16, X.InterfaceC1364105Vn<? super kotlin.Unit> r17) {
        /*
            r12 = this;
            r3 = r17
            r10 = r16
            r7 = r13
            r8 = r14
            boolean r0 = r3 instanceof X.C1863540yau
            if (r0 == 0) goto L82
            r11 = r3
            X.0yau r11 = (X.C1863540yau) r11
            int r2 = r11.LLIZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L82
            int r2 = r2 - r1
            r11.LLIZ = r2
        L18:
            java.lang.Object r5 = r11.LLILZIL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r11.LLIZ
            r3 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 == r1) goto L45
            if (r0 == r2) goto L63
            if (r0 != r3) goto L88
            X.C155000ia.LIZIZ(r5)
        L2e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L31:
            X.C155000ia.LIZIZ(r5)
            X.0yaU r0 = r12.LJIILL
            r11.LLILLL = r10
            r11.LL = r7
            r11.LLILLJJLI = r8
            r11.LLIZ = r1
            java.lang.Object r0 = r0.LJJIIZ(r7, r8, r15, r11)
            if (r0 != r4) goto L50
            return r4
        L45:
            int r8 = r11.LLILLJJLI
            int r7 = r11.LL
            java.lang.Object r10 = r11.LLILLL
            java.lang.String r10 = (java.lang.String) r10
            X.C155000ia.LIZIZ(r5)
        L50:
            X.0ybc r6 = X.C1863980ybc.LIZ
            r11.LLILLL = r10
            r11.LLILZ = r6
            r11.LL = r8
            r11.LLILLJJLI = r7
            r11.LLIZ = r2
            java.lang.Object r5 = r12.LJI(r11)
            if (r5 != r4) goto L70
            return r4
        L63:
            int r7 = r11.LLILLJJLI
            int r8 = r11.LL
            X.0ybc r6 = r11.LLILZ
            java.lang.Object r10 = r11.LLILLL
            java.lang.String r10 = (java.lang.String) r10
            X.C155000ia.LIZIZ(r5)
        L70:
            u2 r5 = (defpackage.u2) r5
            java.lang.String r9 = r5.LIZIZ
            r0 = 0
            r11.LLILLL = r0
            r11.LLILZ = r0
            r11.LLIZ = r3
            java.lang.Object r0 = r6.LJJIIJZLJL(r7, r8, r9, r10, r11)
            if (r0 != r4) goto L2e
            return r4
        L82:
            X.0yau r11 = new X.0yau
            r11.<init>(r12, r3)
            goto L18
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863380yae.LJIJJLI(int, int, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    public static Object LJIJ(C1863380yae c1863380yae, int i, Function1 function1, C1E8R c1e8r, InterfaceC1364105Vn interfaceC1364105Vn, int i2) {
        if ((i2 & 1) != 0) {
            i = C1EK8.LIZJ;
        }
        if ((i2 & 4) != 0) {
            c1e8r = null;
        }
        Object objLJIILL = c1863380yae.LJIILL.LJIILL(C1863390yaf.LJIIIIZZ(i, c1863380yae, null, function1, c1e8r), interfaceC1364105Vn);
        if (objLJIILL != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objLJIILL;
    }

    @Override // X.InterfaceC320160Cgo
    public final r2 LIZJ(Message message, C1863380yae c1863380yae, boolean z, Map<String, String> map, String str, ActionDoc actionDoc) {
        return C1863390yaf.LJIILIIL(message, c1863380yae, z, map, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C1863340yaa r13, java.lang.String r14, java.lang.String r15, boolean r16, com.ss.android.ugc.aweme.tako.ccl.model.ActionDoc r17, X.InterfaceC1364105Vn<? super kotlin.Unit> r18) {
        /*
            r12 = this;
            r3 = r18
            boolean r0 = r3 instanceof X.C1863570yax
            r5 = r12
            if (r0 == 0) goto L57
            r11 = r3
            X.0yax r11 = (X.C1863570yax) r11
            int r2 = r11.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L57
            int r2 = r2 - r1
            r11.LLILZ = r2
        L15:
            java.lang.Object r4 = r11.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r11.LLILZ
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L2b
            if (r1 == r0) goto L44
            if (r1 != r2) goto L5d
            X.C155000ia.LIZIZ(r4)
        L28:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2b:
            X.C155000ia.LIZIZ(r4)
            r5.LJIIZILJ = r0
            X.0yaU r1 = r5.LJIILL
            r11.LL = r1
            r11.LLILZ = r0
            r10 = r17
            r9 = r16
            r8 = r15
            r7 = r14
            r6 = r13
            java.lang.Object r4 = X.C1863390yaf.LJ(r5, r6, r7, r8, r9, r10, r11)
            if (r4 != r3) goto L49
            return r3
        L44:
            X.0yaU r1 = r11.LL
            X.C155000ia.LIZIZ(r4)
        L49:
            r2 r4 = (defpackage.r2) r4
            r0 = 0
            r11.LL = r0
            r11.LLILZ = r2
            java.lang.Object r0 = r1.LJIILL(r4, r11)
            if (r0 != r3) goto L28
            return r3
        L57:
            X.0yax r11 = new X.0yax
            r11.<init>(r5, r3)
            goto L15
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863380yae.LJFF(X.0yaa, java.lang.String, java.lang.String, boolean, com.ss.android.ugc.aweme.tako.ccl.model.ActionDoc, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(java.lang.String r55, boolean r56, boolean r57, java.util.Map<java.lang.String, java.lang.String> r58, boolean r59, kotlin.jvm.functions.Function1<? super com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug, kotlin.Unit> r60, X.InterfaceC1364105Vn<? super kotlin.Unit> r61) {
        /*
            r54 = this;
            r3 = r61
            boolean r0 = r3 instanceof X.C1863600yb0
            r6 = r54
            if (r0 == 0) goto Lb8
            r4 = r3
            X.0yb0 r4 = (X.C1863600yb0) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb8
            int r2 = r2 - r1
            r4.LLILZ = r2
        L16:
            java.lang.Object r7 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r4.LLILZ
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L2c
            if (r2 == r0) goto La4
            if (r2 != r1) goto Lbf
            X.C155000ia.LIZIZ(r7)
        L29:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            X.C155000ia.LIZIZ(r7)
            X.0yaU r2 = r6.LJIILL
            r4.LL = r2
            r4.LLILZ = r0
            kotlin.Pair[] r5 = new kotlin.Pair[r0]
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "expected_card_type"
            r7 = r55
            r1.<init>(r0, r7)
            r0 = 0
            r5[r0] = r1
            java.util.Map r32 = X.C2097608Jq.LJIIJ(r5)
            r2 r7 = new r2
            r8 = 5
            r9 = 0
            r0 = r7
            r18 = 0
            r52 = -1627422754(0xffffffff9eff7fde, float:-2.705206E-20)
            r53 = 7423(0x1cff, float:1.0402E-41)
            r13 = r60
            r49 = r59
            r38 = r58
            r37 = r57
            r48 = r56
            r10 = r9
            r11 = r9
            r12 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            r19 = r18
            r20 = r9
            r21 = r9
            r22 = r18
            r23 = r6
            r24 = r9
            r25 = r9
            r26 = r9
            r27 = r9
            r28 = r9
            r29 = r9
            r30 = r9
            r31 = r9
            r33 = r18
            r34 = r9
            r35 = r18
            r36 = r18
            r39 = r9
            r40 = r18
            r41 = r9
            r42 = r9
            r43 = r9
            r44 = r18
            r45 = r9
            r46 = r9
            r47 = r18
            r50 = r18
            r51 = r9
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            if (r0 != r3) goto La9
            return r3
        La4:
            X.0yaU r2 = r4.LL
            X.C155000ia.LIZIZ(r7)
        La9:
            r2 r7 = (defpackage.r2) r7
            r0 = 0
            r4.LL = r0
            r0 = 2
            r4.LLILZ = r0
            java.lang.Object r0 = r2.LJIILL(r7, r4)
            if (r0 != r3) goto L29
            return r3
        Lb8:
            X.0yb0 r4 = new X.0yb0
            r4.<init>(r6, r3)
            goto L16
        Lbf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863380yae.LJIIIZ(java.lang.String, boolean, boolean, java.util.Map, boolean, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(long r54, java.lang.String r56, java.lang.String r57, kotlin.jvm.functions.Function1<? super com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug, kotlin.Unit> r58, kotlin.jvm.functions.Function1<? super com.ss.android.ugc.aweme.tako.ccl.model.api.EntityIntro, kotlin.Unit> r59, java.lang.Integer r60, X.InterfaceC1364105Vn<? super kotlin.Unit> r61) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863380yae.LJIIJJI(long, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, java.lang.Integer, X.05Vn):java.lang.Object");
    }

    public final Object LJIIZILJ(String str, String str2, String str3, String str4, String str5, String str6, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        this.LJIIZILJ = true;
        if (str3 != null && str3.length() != 0) {
            Object objLJIILL = this.LJIILL.LJIILL(C1863390yaf.LJIIL(str2, str, this, str3, str4, str5, str6, new ActionDoc(0L, ""), 220), interfaceC1364105Vn);
            if (objLJIILL == C099R.LJFF()) {
                return objLJIILL;
            }
            return Unit.LIZ;
        }
        String str7 = C1863280yaU.LJIILLIIL;
        C1870240yli.LIZ(AFwS219S0000000_30.get$arr$(204), false);
        return Unit.LIZ;
    }

    public final Object LJIL(Aweme aweme, List<TakoVideoItem> list, String str, String str2, boolean z, Map<String, String> map, String str3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        this.LJIIZILJ = true;
        if (aweme == null && (list == null || list.isEmpty())) {
            return Unit.LIZ;
        }
        Object objLJIILL = this.LJIILL.LJIILL(LIZ(str, aweme, list, str2, this, z, map, str3, new ActionDoc(0L, "")), interfaceC1364105Vn);
        if (objLJIILL == C099R.LJFF()) {
            return objLJIILL;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC320160Cgo
    public final r2 LIZ(String str, Aweme aweme, List<TakoVideoItem> list, String str2, C1863380yae c1863380yae, boolean z, Map<String, String> map, String str3, ActionDoc actionDoc) {
        return C1863390yaf.LIZ(str, aweme, list, str2, c1863380yae, z, map, str3, actionDoc);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJI(int r18, boolean r19, boolean r20, boolean r21, int r22, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> r23, boolean r24, X.C1E8R r25, X.InterfaceC1364105Vn<? super java.lang.Boolean> r26) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863380yae.LJIJI(int, boolean, boolean, boolean, int, kotlin.jvm.functions.Function1, boolean, X.1E8R, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object LJIJJ(C1863380yae c1863380yae, boolean z, boolean z2, boolean z3, int i, Function1 function1, boolean z4, C1E8R c1e8r, InterfaceC1364105Vn interfaceC1364105Vn, int i2) {
        int i3;
        C1E8R c1e8r2 = c1e8r;
        boolean z5 = z4;
        int i4 = i;
        boolean z6 = z;
        Function1 function12 = function1;
        boolean z7 = z3;
        boolean z8 = z2;
        if ((i2 & 1) != 0) {
            i3 = C1EK8.LIZJ;
        } else {
            i3 = 0;
        }
        if ((i2 & 2) != 0) {
            z6 = true;
        }
        if ((i2 & 4) != 0) {
            z8 = false;
        }
        if ((i2 & 8) != 0) {
            z7 = false;
        }
        if ((i2 & 16) != 0) {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            function12 = AFwS229S0000000_2.get$arr$(564);
        }
        if ((i2 & 64) != 0) {
            z5 = false;
        }
        if ((i2 & 128) != 0) {
            c1e8r2 = null;
        }
        return c1863380yae.LJIJI(i3, z6, z8, z7, i4, function12, z5, c1e8r2, interfaceC1364105Vn);
    }

    public C1863380yae(Context context, Function0 function0, Function0 function02, String str, String str2, String str3, String str4, long j, int i, int i2, int i3, boolean z, String str5, String str6, SubConversationEntranceInfo subConversationEntranceInfo, Lifecycle lifecycle) {
        InterfaceC497601wk interfaceC497601wkAndroidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZ = function0;
        this.LIZIZ = function02;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = jCurrentTimeMillis;
        this.LJII = j;
        this.LJIIIIZZ = i;
        this.LJIIIZ = i2;
        this.LJIIJ = i3;
        this.LJIIJJI = z;
        this.LJIIL = str5;
        this.LJIILIIL = str6;
        this.LJIILJJIL = subConversationEntranceInfo;
        C1863280yaU c1863280yaU = new C1863280yaU(context, ((EntryDoc) function0.invoke()).LIZ, function0, j, i, str6);
        this.LJIILL = c1863280yaU;
        this.LJIILLIIL = true;
        C1870240yli.LIZ(AFwS216S0000000_27.get$arr$(232), false);
        this.LJIJ = C09IR.LIZIZ(20, 20, null, 4);
        this.LJIJI = c1863280yaU.LJIIJ;
        this.LJIJJ = c1863280yaU.LJIIJJI;
        this.LJIJJLI = (lifecycle == null || (interfaceC497601wkAndroidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope = LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(lifecycle)) == null) ? C817503Hh.LL : interfaceC497601wkAndroidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope;
        this.LJJ = 0;
    }
}
