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
/* JADX INFO: renamed from: X.0J4C, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J4C {
    public static final C0J4C INSTANCE;
    public static final /* synthetic */ C0J4C[] LLILLJJLI;
    public final ConcurrentHashMap<Integer, LinkedList<View>> LL = new ConcurrentHashMap<>();

    static {
        C0J4C c0j4c = new C0J4C();
        INSTANCE = c0j4c;
        LLILLJJLI = new C0J4C[]{c0j4c};
    }

    public C0J4C() {
        C844470XAv.LIZ.getClass();
        new C18L3(C844470XAv.LIZ());
    }

    public static C0J4C[] values() {
        return (C0J4C[]) LLILLJJLI.clone();
    }

    public static C0J4C valueOf(String str) {
        return (C0J4C) C08FF.LIZ(C0J4C.class, str);
    }

    public void setContext(Context context) {
        new C18L3(context);
    }

    public View inflate(Context context, int i, ViewGroup viewGroup) {
        return inflate(C786410Ut5.ne(context), context, i, viewGroup);
    }

    public View inflate(LayoutInflater layoutInflater, Context context, int i, ViewGroup viewGroup) {
        LinkedList<View> linkedList = this.LL.get(Integer.valueOf(i));
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
