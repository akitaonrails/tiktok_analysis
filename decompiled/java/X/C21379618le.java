package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18le, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21379618le {
    public static InterfaceC1631630sYr<? super CharSequence, ? super Boolean, ? super Map<String, ? extends Object>, ? super Boolean, ? extends InterfaceC418280Gag> LJ;
    public static final C444870HcT LJI;
    public static final Rect LJII;
    public static final C14S5<Context> LIZ = new C14S5<>("context");
    public static final C14S5<Integer> LIZIZ = new C14S5<>("max_content_width");
    public static final C14S5<InterfaceC1860060yVI> LIZJ = new C14S5<>("md-text-view");
    public static final C14S5<Map<?, ?>> LIZLLL = new C14S5<>("md-payload");
    public static final C425110Glh LJFF = new Object() { // from class: X.0Glh
        public final List<C448890Hix> LIZ = new ArrayList();
        public Boolean LIZIZ;

        public final C448890Hix LIZ(Context context, Function1<? super C448890Hix, Boolean> function1) {
            boolean z;
            int i = 0;
            if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
                z = true;
            } else {
                z = false;
            }
            if (!Intrinsics.LJFF(Boolean.valueOf(z), this.LIZIZ)) {
                ((ArrayList) this.LIZ).clear();
                this.LIZIZ = Boolean.valueOf(z);
            }
            Iterator it2 = ((ArrayList) this.LIZ).iterator();
            while (it2.hasNext()) {
                if (function1.invoke(it2.next()).booleanValue()) {
                    if (i >= 0) {
                        return (C448890Hix) ListProtector.get(this.LIZ, i);
                    }
                    return null;
                }
                i++;
            }
            return null;
        }
    };

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0Glh] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.0HcT] */
    static {
        final int iLIZIZ = C21419718s7.LIZ.LIZIZ();
        LJI = new Object(iLIZIZ) { // from class: X.0HcT
            public final C444860HcS LIZ;
            public Boolean LIZIZ;

            /* JADX WARN: Type inference failed for: r0v0, types: [X.0HcS] */
            {
                this.LIZ = new LruCache<C0109001b, C448890Hix>(iLIZIZ) { // from class: X.0HcS
                };
            }
        };
        LJII = new Rect();
    }
}
