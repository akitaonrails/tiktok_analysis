package X;

import com.bytedance.provider.impl.GScope;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS401S0200000_35;
import kotlin.jvm.internal.AwS436S0200000_35;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1D7W, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D7W implements InterfaceC1337505Lh {
    public List<User> LL;
    public final Set<String> LLILLJJLI;

    public C1D7W() {
        this(null);
    }

    public C1D7W(Object obj) {
        this.LL = new CopyOnWriteArrayList();
        this.LLILLJJLI = new LinkedHashSet();
    }

    public final List<User> LIZ(List<? extends User> list) {
        ArrayList arrayList = new ArrayList();
        for (User user : list) {
            User user2 = user;
            Set<String> set = this.LLILLJJLI;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<String> it2 = set.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next(), user2.getUid())) {
                        break;
                    }
                }
            }
            arrayList.add(user);
        }
        return new ArrayList(arrayList);
    }

    public final void LIZIZ(Function0<Unit> function0) {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "source_default_key", InterfaceC1337505Lh.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            interfaceC1555100qZQLIZIZ.LIZIZ(new AwS401S0200000_35((Function0) function0, (Function0<Unit>) this, (C1D7W) 74));
        }
    }

    @Override // X.InterfaceC1337505Lh
    public final void LJIIIIZZ(List<? extends User> list) {
        synchronized (this) {
            try {
                Set<String> set = this.LLILLJJLI;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<? extends User> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().getUid());
                }
                set.addAll(arrayList);
                LIZIZ(new AwS579S0100000_35(this, 430));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    @Override // X.InterfaceC1337505Lh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Mt(X.InterfaceC1364105Vn<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C1D7V
            if (r0 == 0) goto L4c
            r4 = r6
            X.1D7V r4 = (X.C1D7V) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L3a
            if (r0 != r1) goto L52
            X.1D7W r0 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L24:
            java.util.List r3 = (java.util.List) r3
            java.util.List r2 = r0.LIZ(r3)
            kotlin.jvm.internal.AwS436S0200000_35 r1 = new kotlin.jvm.internal.AwS436S0200000_35
            r0 = 92
            r1.<init>(r5, r2, r0)
            r5.LIZIZ(r1)
            android.os.SystemClock.elapsedRealtime()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3a:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r5
            r4.LLILZ = r1
            r0 = 50
            java.lang.Object r3 = r5.LIZJ(r1, r0, r4)
            if (r3 != r2) goto L4a
            return r2
        L4a:
            r0 = r5
            goto L24
        L4c:
            X.1D7V r4 = new X.1D7V
            r4.<init>(r5, r6)
            goto L12
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1D7W.Mt(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1337505Lh
    public final void setData(List<? extends User> list) {
        synchronized (this) {
            try {
                LIZIZ(new AwS436S0200000_35(this, (C1D7W) list, (List<User>) 93));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(int r6, int r7, X.InterfaceC1364105Vn<? super java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C1D7U
            if (r0 == 0) goto L42
            r4 = r8
            X.1D7U r4 = (X.C1D7U) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L42
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L48
            X.C155000ia.LIZIZ(r3)
        L22:
            com.ss.android.ugc.aweme.relation.model.MaFListResponse r3 = (com.ss.android.ugc.aweme.relation.model.MaFListResponse) r3
            r3.checkValid()
            java.util.List r0 = r3.getUserListWithRid()
            if (r0 != 0) goto L2f
            X.13BV r0 = X.C13BV.INSTANCE
        L2f:
            return r0
        L30:
            X.C155000ia.LIZIZ(r3)
            X.1DTJ r0 = X.C1DTJ.LIZIZ
            X.11NZ r0 = r0.LIZJ(r6, r7)
            r4.LLILLL = r1
            java.lang.Object r3 = X.C11UD.LIZJ(r0, r4)
            if (r3 != r2) goto L22
            return r2
        L42:
            X.1D7U r4 = new X.1D7U
            r4.<init>(r5, r8)
            goto L12
        L48:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1D7W.LIZJ(int, int, X.05Vn):java.lang.Object");
    }
}
