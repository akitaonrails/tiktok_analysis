package X;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0J4D, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J4D {
    public static final C0J4D INSTANCE;
    public static final /* synthetic */ C0J4D[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public C18L3 asyncLayoutInflater;
    public final ConcurrentHashMap<Integer, LinkedList<View>> storage = new ConcurrentHashMap<>();

    public static InterfaceC2044707zh<C0J4D> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0J4D c0j4d = new C0J4D();
        INSTANCE = c0j4d;
        C0J4D[] c0j4dArr = {c0j4d};
        LL = c0j4dArr;
        LLILLJJLI = new C2254308sP(c0j4dArr);
    }

    public C0J4D() {
        C844470XAv.LIZ.getClass();
        this.asyncLayoutInflater = new C18L3(C844470XAv.LIZ());
    }

    public static C0J4D[] values() {
        return (C0J4D[]) LL.clone();
    }

    public static C0J4D valueOf(String str) {
        return (C0J4D) C08FF.LIZ(C0J4D.class, str);
    }

    public final void setContext(Context context) {
        if (context != null) {
            this.asyncLayoutInflater = new C18L3(context);
        }
    }

    public final C11NZ<View> preInflate(final int i, final ViewGroup viewGroup) {
        LinkedList<View> linkedList = this.storage.get(Integer.valueOf(i));
        if (linkedList != null && !linkedList.isEmpty()) {
            return C11IR.LL;
        }
        return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0J4E
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<View> c09aj) {
                C1C7U.LIZ("SearchLayoutFactory@558c.preInflate$1");
                final C0J4D c0j4d = this.LIZ;
                final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                c0j4d.asyncLayoutInflater.LIZ(i, viewGroup, new InterfaceC487670JAn() { // from class: X.0J4F
                    @Override // X.InterfaceC487670JAn
                    public final void onInflateFinished(View view, int i2, ViewGroup viewGroup2) {
                        c19482611Ke.onNext(view);
                        LinkedList<View> linkedList2 = c0j4d.storage.get(Integer.valueOf(i2));
                        if (linkedList2 == null) {
                            linkedList2 = new LinkedList<>();
                            c0j4d.storage.put(Integer.valueOf(i2), linkedList2);
                        }
                        linkedList2.add(view);
                    }
                });
                C1C7U.LIZIZ("SearchLayoutFactory@558c.preInflate$1");
            }
        });
    }

    public final void recycle(int i, View view) {
        LinkedList<View> linkedList = this.storage.get(Integer.valueOf(i));
        if (linkedList != null) {
            linkedList.add(view);
        }
    }

    public final View inflate(Context context, int i, ViewGroup viewGroup) {
        return inflate(C786410Ut5.ne(context), context, i, viewGroup);
    }

    public final View inflate(LayoutInflater layoutInflater, Context context, int i, ViewGroup viewGroup) {
        LinkedList<View> linkedList = this.storage.get(Integer.valueOf(i));
        if (linkedList != null && !linkedList.isEmpty()) {
            View viewPoll = linkedList.poll();
            Context context2 = viewPoll.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context);
            }
            return viewPoll;
        }
        return C786410Ut5.Td(layoutInflater, i, viewGroup, false);
    }
}
