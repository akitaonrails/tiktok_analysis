package X;

import Y.AfS186S0100000_17;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0f4G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1112940f4G<T> extends ArrayList<T> {
    public final int LL;
    public final long LLILLJJLI;
    public final Looper LLILLL;
    public C11JF LLILZ;
    public Function1<? super ArrayList<T>, Unit> LLILZIL;
    public Function1<? super ArrayList<T>, Unit> timeoutArrive;

    public final void LIZJ() {
        Function1<? super ArrayList<T>, Unit> function1;
        C11JF c11jf = this.LLILZ;
        if (c11jf != null && !c11jf.isDisposed()) {
            C500260Jjc.LJJLIIIJLJLI(c11jf);
            if ((!isEmpty()) && (function1 = this.LLILZIL) != null) {
                function1.invoke(this);
            }
        }
        C11IB c11ibLJLJJLL = C11NZ.LJLJJLL(this.LLILLJJLI, TimeUnit.MILLISECONDS);
        Looper looper = this.LLILLL;
        this.LLILZ = (C11JF) c11ibLJLJJLL.LJJJLZIJ(looper != null ? C1701940uOG.LIZ(looper) : C1701940uOG.LIZIZ()).LJJLL(new AfS186S0100000_17(this, 162), new AfS186S0100000_17(this, 163));
    }

    public final void dispose() {
        C11JF c11jf = this.LLILZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        Function1<? super ArrayList<T>, Unit> function1 = this.LLILZIL;
        if (function1 != null) {
            function1.invoke(this);
        }
        clear();
    }

    public final ArrayList<T> replaceAndClear() {
        ArrayList<T> arrayList = new ArrayList<>();
        arrayList.addAll(this);
        clear();
        return arrayList;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(T t) {
        if (size() == 0) {
            LIZJ();
        }
        boolean zAdd = super.add(t);
        if (size() >= this.LL) {
            C11JF c11jf = this.LLILZ;
            if (c11jf != null) {
                c11jf.dispose();
            }
            Function1<? super ArrayList<T>, Unit> function1 = this.timeoutArrive;
            if (function1 != null) {
                function1.invoke(replaceAndClear());
            }
        }
        return zAdd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends T> collection) {
        if (size() == 0) {
            LIZJ();
        }
        boolean zAddAll = super.addAll(collection);
        if (size() >= this.LL) {
            C11JF c11jf = this.LLILZ;
            if (c11jf != null) {
                c11jf.dispose();
            }
            Function1<? super ArrayList<T>, Unit> function1 = this.timeoutArrive;
            if (function1 != null) {
                function1.invoke(replaceAndClear());
            }
        }
        return zAddAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i) {
        return (T) removeAt(i);
    }

    public /* bridge */ Object removeAt(int i) {
        return super.remove(i);
    }

    public final void setCountDownDispose(Function1<? super ArrayList<T>, Unit> function1) {
        this.timeoutArrive = function1;
    }

    public final void setDisposeCallback(Function1<? super ArrayList<T>, Unit> function1) {
        this.LLILZIL = function1;
    }

    public C1112940f4G(int i, long j, Looper looper) {
        this.LL = i;
        this.LLILLJJLI = j;
        this.LLILLL = looper;
    }
}
