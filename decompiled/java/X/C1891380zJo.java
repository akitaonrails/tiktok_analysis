package X;

import Y.ARunnableS0S0511000_28;
import Y.ARunnableS36S0400000_28;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS156S0400000_28;
import kotlin.jvm.internal.AwS272S0300000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zJo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1891380zJo {
    public final RecyclerView LIZ;
    public final InterfaceC1891370zJn LIZIZ;
    public final List<C0Q9R> LIZJ;
    public final C1558530qex LIZLLL;
    public final C11PQ<C20603715jn> LJ;
    public final Function0<Unit> LJFF;
    public volatile int LJI;
    public List<? extends InterfaceC1891350zJl> LJII = C13BV.INSTANCE;
    public ArrayList<Integer> LJIIIIZZ = new ArrayList<>();
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new C1891410zJr(this));
    public final C01GW LJIIJ = C452501pT.LIZIZ(new C1891390zJp(this));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new C1891400zJq());
    public final C01GW LJIIL = C452501pT.LIZIZ(new C1891420zJs(this));

    public static ArrayList LIZ(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(it2.next().hashCode()));
        }
        return arrayList;
    }

    public final void LIZJ(C21341918fZ c21341918fZ, C1891440zJu c1891440zJu) {
        C20603715jn c20603715jnLJLZ = this.LJ.LJLZ();
        if (c20603715jnLJLZ != null && c20603715jnLJLZ.LJIILLIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dispatchUpdatesTo: isMainThread=");
            sbLIZ.append(Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper()));
            sbLIZ.append(", isComputingLayout=");
            sbLIZ.append(this.LIZ.isComputingLayout());
            sbLIZ.append(" time:");
            sbLIZ.append(System.currentTimeMillis());
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("power_item_classCastException", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            C991830buv.LIZ(this.LIZ, new AwS272S0300000_28(this, c21341918fZ, c1891440zJu, 16));
        } else {
            RecyclerView recyclerView = this.LIZ;
            HandlerHook.viewPost(recyclerView, new ARunnableS36S0400000_28(recyclerView, this, c21341918fZ, c1891440zJu, 4));
        }
    }

    public final void LIZIZ(C21341918fZ c21341918fZ, C1891440zJu c1891440zJu, InterfaceC1891370zJn interfaceC1891370zJn) {
        boolean z;
        Runnable runnable;
        C20603715jn c20603715jnLJLZ = this.LJ.LJLZ();
        if (c20603715jnLJLZ != null && c20603715jnLJLZ.LJIILLIIL) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Start] dispatchAndNotifyUpdatesTo: time:");
            sbLIZ.append(System.currentTimeMillis());
            sbLIZ.append(" refresh:");
            sbLIZ.append(c1891440zJu.LIZJ);
            sbLIZ.append(" currentList.size:");
            sbLIZ.append(this.LJII.size());
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("power_item_classCastException", C2188811AlT.LIZIZ(sbLIZ));
        }
        c21341918fZ.LIZIZ(interfaceC1891370zJn);
        if (c1891440zJu.LIZJ) {
            this.LJFF.invoke();
        }
        Iterator<C0Q9R> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().LJII(c21341918fZ);
        }
        List<C1891430zJt> list = c1891440zJu.LJ;
        if (list != null) {
            for (C1891430zJt c1891430zJt : list) {
                if (c1891430zJt != null && (runnable = c1891430zJt.LIZ) != null) {
                    runnable.run();
                }
            }
        }
        C20603715jn c20603715jnLJLZ2 = this.LJ.LJLZ();
        if (c20603715jnLJLZ2 != null && c20603715jnLJLZ2.LJIILLIIL) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("power_item_classCastException", "[Finish] dispatchAndNotifyUpdatesTo: time:" + System.currentTimeMillis());
        }
    }

    public final void LIZLLL(C21341918fZ c21341918fZ, C1891440zJu c1891440zJu, final List<? extends InterfaceC1891350zJl> list, final List<? extends InterfaceC1891350zJl> list2) {
        InterfaceC1891370zJn interfaceC1891370zJn;
        C20603715jn c20603715jnLJLZ = this.LJ.LJLZ();
        if (c20603715jnLJLZ != null && c20603715jnLJLZ.LJIJJLI) {
            if ((!list.isEmpty()) && list2.size() > list.size()) {
                final int size = list2.size() - list.size();
                interfaceC1891370zJn = new InterfaceC1891370zJn() { // from class: X.0zJm
                    public final /* synthetic */ InterfaceC1891370zJn LL;

                    @Override // X.InterfaceC1891370zJn
                    public final void LLI(int i, int i2) {
                        this.LL.LLI(i, i2);
                    }

                    @Override // X.InterfaceC1891370zJn
                    public final void LLIZLLLIL(int i, int i2) {
                        this.LL.LLIZLLLIL(i, i2);
                    }

                    @Override // X.InterfaceC1891370zJn
                    public final void LLJJJJJIL(int i, int i2, Object obj) {
                        this.LL.LLJJJJJIL(i, i2, obj);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
                    
                        if (r7 == r3) goto L17;
                     */
                    @Override // X.InterfaceC1891370zJn
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LJZL(int r6, int r7) {
                        /*
                            r5 = this;
                            if (r6 != 0) goto L28
                            r2 = 0
                            r0 = 1
                            if (r0 > r7) goto L28
                            int r0 = r3
                            if (r7 > r0) goto L28
                            java.util.List<X.0zJl> r0 = r4
                            int r0 = r0.size()
                            if (r7 >= r0) goto L30
                            java.util.List<X.0zJl> r0 = r4
                            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
                            X.0zJl r1 = (X.InterfaceC1891350zJl) r1
                            java.util.List<X.0zJl> r0 = r5
                            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
                            X.0zJl r0 = (X.InterfaceC1891350zJl) r0
                            boolean r0 = r1.areItemTheSame(r0)
                            if (r0 == 0) goto L30
                        L28:
                            X.0zJo r0 = r5.LLILLJJLI
                            X.0zJn r0 = r0.LIZIZ
                            r0.LJZL(r6, r7)
                            return
                        L30:
                            java.util.List<X.0zJl> r0 = r4
                            java.util.List r1 = X.C13LP.LL(r0, r7)
                            java.util.List<X.0zJl> r4 = r5
                            boolean r0 = r1 instanceof java.util.Collection
                            if (r0 == 0) goto L50
                            boolean r0 = r1.isEmpty()
                            if (r0 == 0) goto L50
                        L42:
                            X.0zJo r0 = r5.LLILLJJLI
                            X.0zJn r1 = r0.LIZIZ
                            java.util.List<X.0zJl> r0 = r5
                            int r0 = r0.size()
                            r1.LJZL(r0, r7)
                            return
                        L50:
                            java.util.Iterator r3 = r1.iterator()
                        L54:
                            boolean r0 = r3.hasNext()
                            if (r0 == 0) goto L42
                            java.lang.Object r2 = r3.next()
                            X.0zJl r2 = (X.InterfaceC1891350zJl) r2
                            boolean r0 = r4 instanceof java.util.Collection
                            if (r0 == 0) goto L6b
                            boolean r0 = r4.isEmpty()
                            if (r0 == 0) goto L6b
                            goto L54
                        L6b:
                            java.util.Iterator r1 = r4.iterator()
                        L6f:
                            boolean r0 = r1.hasNext()
                            if (r0 == 0) goto L54
                            java.lang.Object r0 = r1.next()
                            X.0zJl r0 = (X.InterfaceC1891350zJl) r0
                            boolean r0 = r0.areItemTheSame(r2)
                            if (r0 == 0) goto L6f
                            int r0 = r3
                            if (r7 != r0) goto L28
                            goto L42
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1891360zJm.LJZL(int, int):void");
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.LL = this.LLILLJJLI.LIZIZ;
                    }
                };
            } else {
                interfaceC1891370zJn = this.LIZIZ;
            }
            if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                C991830buv.LIZ(this.LIZ, new AwS156S0400000_28(this, c21341918fZ, c1891440zJu, interfaceC1891370zJn, 16));
                return;
            } else {
                RecyclerView recyclerView = this.LIZ;
                HandlerHook.viewPost(recyclerView, new ARunnableS36S0400000_28(recyclerView, this, c21341918fZ, c1891440zJu, 3));
                return;
            }
        }
        LIZJ(c21341918fZ, c1891440zJu);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, java.util.ArrayList] */
    public final void LJ(List<Integer> list, List<? extends InterfaceC1891350zJl> list2, List<? extends InterfaceC1891350zJl> list3, C1891440zJu c1891440zJu) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C20603715jn c20603715jnLJLZ;
        final boolean z5 = false;
        if (this.LJI == 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJI++;
        int i = this.LJI;
        C20603715jn c20603715jnLJLZ2 = this.LJ.LJLZ();
        if (c20603715jnLJLZ2 != null && c20603715jnLJLZ2.LJFF) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && (c20603715jnLJLZ = this.LJ.LJLZ()) != null && c20603715jnLJLZ.LJFF) {
            z3 = true;
        } else {
            z3 = false;
        }
        C20603715jn c20603715jnLJLZ3 = this.LJ.LJLZ();
        if (c20603715jnLJLZ3 != null && c20603715jnLJLZ3.LJ && !z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        C20603715jn c20603715jnLJLZ4 = this.LJ.LJLZ();
        if (c20603715jnLJLZ4 != null && c20603715jnLJLZ4.LJIILLIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("notifyDiffer. useAsync:");
            sbLIZ.append(z4);
            sbLIZ.append(" time:");
            sbLIZ.append(System.currentTimeMillis());
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("power_item_classCastException", C2188811AlT.LIZIZ(sbLIZ));
        }
        C20603715jn c20603715jnLJLZ5 = this.LJ.LJLZ();
        if (c20603715jnLJLZ5 != null && c20603715jnLJLZ5.LJIILIIL) {
            z5 = true;
        }
        final ArrayList arrayList = new ArrayList(list3);
        final C259800zU c259800zU = new C259800zU();
        final C259800zU c259800zU2 = new C259800zU();
        if (z4) {
            synchronized (this) {
                try {
                    c259800zU.element = new ArrayList(this.LJII);
                    c259800zU2.element = new ArrayList(this.LJIIIIZZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            c259800zU.element = new ArrayList(list2);
            c259800zU2.element = new ArrayList(list);
        }
        AbstractC21342018fa abstractC21342018fa = new AbstractC21342018fa() { // from class: X.0zJk
            @Override // X.AbstractC21342018fa
            public final int LIZLLL() {
                return arrayList.size();
            }

            @Override // X.AbstractC21342018fa
            public final int LJ() {
                return c259800zU.element.size();
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZ(int i2, int i3) {
                InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) ListProtector.get(c259800zU.element, i2);
                InterfaceC1891350zJl interfaceC1891350zJl2 = (InterfaceC1891350zJl) ListProtector.get(arrayList, i3);
                if (interfaceC1891350zJl != null) {
                    if (interfaceC1891350zJl2 == null) {
                        return false;
                    }
                    if (z5) {
                        if (interfaceC1891350zJl == interfaceC1891350zJl2 && ((Number) ListProtector.get(c259800zU2.element, i2)).intValue() != interfaceC1891350zJl2.hashCode()) {
                            return false;
                        }
                    } else if (((Number) ListProtector.get(c259800zU2.element, i2)).intValue() != interfaceC1891350zJl2.hashCode()) {
                        return false;
                    }
                    return interfaceC1891350zJl.areContentsTheSame(interfaceC1891350zJl2);
                }
                if (interfaceC1891350zJl2 != null) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZIZ(int i2, int i3) {
                InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) ListProtector.get(c259800zU.element, i2);
                InterfaceC1891350zJl interfaceC1891350zJl2 = (InterfaceC1891350zJl) ListProtector.get(arrayList, i3);
                if (interfaceC1891350zJl != null) {
                    if (interfaceC1891350zJl2 != null) {
                        return interfaceC1891350zJl.areItemTheSame(interfaceC1891350zJl2);
                    }
                    return false;
                }
                if (interfaceC1891350zJl2 == null) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC21342018fa
            public final Object LIZJ(int i2, int i3) {
                InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) ListProtector.get(c259800zU.element, i2);
                InterfaceC1891350zJl interfaceC1891350zJl2 = (InterfaceC1891350zJl) ListProtector.get(arrayList, i3);
                if (interfaceC1891350zJl != null && interfaceC1891350zJl2 != null) {
                    return interfaceC1891350zJl.getChangePayload(interfaceC1891350zJl2);
                }
                return null;
            }
        };
        Executor executor = (Executor) this.LJIIJ.getValue();
        if (z4 && executor != null) {
            executor.execute(new ARunnableS0S0511000_28(abstractC21342018fa, c1891440zJu, this, i, z2, arrayList, c259800zU, 1));
            return;
        }
        C1558530qex c1558530qex = this.LIZLLL;
        C1562070qkf c1562070qkf = C1562070qkf.LIZ;
        c1558530qex.LIZ(c1562070qkf);
        LIZLLL(C21342318fd.LIZ(abstractC21342018fa, true), c1891440zJu, (List) c259800zU.element, arrayList);
        if (z2) {
            ArrayList<Integer> arrayListLIZ = LIZ(arrayList);
            synchronized (this) {
                try {
                    this.LJII = arrayList;
                    this.LJIIIIZZ = arrayListLIZ;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        this.LIZLLL.LIZIZ(c1562070qkf, AFwS217S0000000_28.get$arr$(656));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1891380zJo(RecyclerView recyclerView, InterfaceC1891370zJn interfaceC1891370zJn, List<? extends C0Q9R> list, C1558530qex c1558530qex, C11PQ<C20603715jn> c11pq, Function0<Unit> function0) {
        this.LIZ = recyclerView;
        this.LIZIZ = interfaceC1891370zJn;
        this.LIZJ = list;
        this.LIZLLL = c1558530qex;
        this.LJ = c11pq;
        this.LJFF = function0;
    }
}
