package X;

import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS219S0300000_10;

/* JADX INFO: renamed from: X.0PTQ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PTQ<T> extends AbstractC1343480l46 {
    public final RecyclerView LIZ;
    public final C0PTY<T> LIZIZ;
    public final C0PTC LIZJ;
    public final int LIZLLL;
    public final String LJ = "AsyncCacheExtension";
    public final long LJFF = C640690PBb.LIZIZ.timeOut;
    public final ConcurrentHashMap<Integer, C0PTW<T>> LJI = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Integer, C0PTW<T>> LJII = new ConcurrentHashMap<>();
    public Field LJIIIIZZ;

    public final void LIZIZ() {
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = (T) C641520PEg.LIZ(this.LIZ);
        C259800zU c259800zU2 = new C259800zU();
        T t = (T) C641520PEg.LIZIZ(this.LIZ);
        c259800zU2.element = t;
        T t2 = c259800zU.element;
        if (t2 == null || t == null) {
            return;
        }
        c259800zU.element = (T) Integer.valueOf(((Number) t2).intValue() - this.LIZLLL);
        c259800zU2.element = (T) Integer.valueOf(((Number) c259800zU2.element).intValue() + this.LIZLLL);
        AwS219S0300000_10 awS219S0300000_10 = new AwS219S0300000_10(c259800zU, (C259800zU<Integer>) c259800zU2, (C259800zU<Integer>) this, 24);
        awS219S0300000_10.invoke(this.LJI);
        awS219S0300000_10.invoke(this.LJII);
    }

    @Override // X.AbstractC1343480l46
    public final View LIZ(int i, int i2) {
        boolean z;
        C0PTC c0ptc;
        if (this.LJII.containsKey(Integer.valueOf(i))) {
            return null;
        }
        C0PTY<T> c0pty = this.LIZIZ;
        if (c0pty != null && c0pty.LJJLIIIIJ(i)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        this.LJII.put(Integer.valueOf(i), new C0PTW<>(i, this.LIZIZ.LJJLIIIJJI(i)));
        C0PTW<T> c0ptwRemove = this.LJI.remove(Integer.valueOf(i));
        String strValueOf = String.valueOf(i2);
        if (c0ptwRemove == null) {
            C0PTC c0ptc2 = this.LIZJ;
            if (c0ptc2 != null) {
                c0ptc2.LIZJ(i, strValueOf);
            }
            return null;
        }
        C0PTY<T> c0pty2 = this.LIZIZ;
        if (!c0pty2.LLJJI(c0ptwRemove.LIZIZ, c0pty2.LJJLIIIJJI(i))) {
            C0PTC c0ptc3 = this.LIZJ;
            if (c0ptc3 != null) {
                c0ptc3.LIZJ(i, strValueOf);
            }
            return null;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        Future<C645340PSy<RecyclerView.ViewHolder>> future = c0ptwRemove.LIZLLL;
        if (future == null) {
            return null;
        }
        try {
            C645340PSy<RecyclerView.ViewHolder> c645340PSy = future.get(this.LJFF, TimeUnit.MILLISECONDS);
            int i3 = c645340PSy.LIZIZ;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2 && (c0ptc = this.LIZJ) != null) {
                        c0ptc.LIZJ(i, strValueOf);
                    }
                } else {
                    C0PTC c0ptc4 = this.LIZJ;
                    if (c0ptc4 != null) {
                        c0ptc4.LIZ(i, SystemClock.uptimeMillis() - jUptimeMillis, c645340PSy.LIZJ, strValueOf);
                        return null;
                    }
                }
                return null;
            }
            try {
                RecyclerView.ViewHolder viewHolder = c0ptwRemove.LIZJ;
                if (viewHolder == null) {
                    return null;
                }
                View view = viewHolder.itemView;
                if (!(view.getLayoutParams() instanceof RecyclerView.LayoutParams)) {
                    C786410Ut5.W5(view, new RecyclerView.LayoutParams(-1, -2));
                }
                if (this.LJIIIIZZ == null) {
                    this.LJIIIIZZ = C1970407ni.LIZ(view.getLayoutParams(), "mViewHolder");
                }
                Field field = this.LJIIIIZZ;
                if (field == null) {
                    C0PTC c0ptc5 = this.LIZJ;
                    if (c0ptc5 != null) {
                        c0ptc5.LIZ(i, SystemClock.uptimeMillis() - jUptimeMillis, new Exception("reflect error viewHolderField ==  null"), strValueOf);
                    }
                    return null;
                }
                field.set(view.getLayoutParams(), viewHolder);
                view.getLayoutParams();
                C0PT7.LIZIZ.add(Integer.valueOf(viewHolder.itemView.hashCode()));
                C0PTC c0ptc6 = this.LIZJ;
                if (c0ptc6 != null) {
                    c0ptc6.LIZIZ(i, c645340PSy.LIZLLL, SystemClock.uptimeMillis() - jUptimeMillis, strValueOf);
                }
                return view;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C0PTC c0ptc7 = this.LIZJ;
                if (c0ptc7 != null) {
                    c0ptc7.LIZ(i, SystemClock.uptimeMillis() - jUptimeMillis, e, strValueOf);
                }
                return null;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            try {
                future.cancel(true);
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            Iterator<T> it2 = this.LJI.values().iterator();
            while (it2.hasNext()) {
                Future<C645340PSy<RecyclerView.ViewHolder>> future2 = ((C0PTW) it2.next()).LIZLLL;
                if (future2 != null) {
                    future2.isDone();
                }
            }
            C0PTC c0ptc8 = this.LIZJ;
            if (c0ptc8 != null) {
                c0ptc8.LIZ(i, this.LJFF, new C0PTF("timeout"), strValueOf);
            }
            return null;
        }
    }

    public C0PTQ(RecyclerView recyclerView, C0PTY<T> c0pty, C0PTC c0ptc, int i) {
        this.LIZ = recyclerView;
        this.LIZIZ = c0pty;
        this.LIZJ = c0ptc;
        this.LIZLLL = i;
    }
}
