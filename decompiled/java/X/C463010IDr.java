package X;

import android.app.Activity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS155S1100000_6;

/* JADX INFO: renamed from: X.0IDr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C463010IDr implements InterfaceC863600XuI {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC863600XuI
    public final void LIZIZ(C0YMW c0ymw) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, c0ymw);
                break;
            case 1:
                LIZIZ$1(this, c0ymw);
                break;
        }
    }

    @Override // X.InterfaceC863600XuI
    public final void onSuccess(Object obj) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, obj);
                break;
            case 1:
                onSuccess$1(this, obj);
                break;
        }
    }

    public static final void LIZIZ$0(C463010IDr c463010IDr, C0YMW c0ymw) {
        Function0 function0 = (Function0) c463010IDr.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void LIZIZ$1(C463010IDr c463010IDr, C0YMW c0ymw) {
        Function0 function0 = (Function0) c463010IDr.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onSuccess$0(C463010IDr c463010IDr, Object obj) {
        Function0 function0 = (Function0) c463010IDr.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C0CNO.LIZLLL(0L, new AwS155S1100000_6((Activity) c463010IDr.l2, C20642515q3.LJ(2131755636, ((List) c463010IDr.l1).size(), Integer.valueOf(((List) c463010IDr.l1).size())), 3));
    }

    public static final void onSuccess$1(C463010IDr c463010IDr, Object obj) {
        Function0 function0 = (Function0) c463010IDr.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C0CNO.LIZLLL(0L, new AwS155S1100000_6((Activity) c463010IDr.l2, C20642515q3.LJ(2131755636, ((List) c463010IDr.l1).size(), Integer.valueOf(((List) c463010IDr.l1).size())), 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C463010IDr(Function0 function0, Function0<Unit> function02, List<C0Y8T> list, Activity activity) {
        this.$t = activity;
        this.l0 = function0;
        this.l1 = function02;
        this.l2 = list;
    }
}
