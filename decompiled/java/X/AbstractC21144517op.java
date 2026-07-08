package X;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.utils.NxResourceUtils;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17op, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21144517op implements InterfaceC21144717or {
    public AbstractC21144517op LIZ;
    public volatile View LIZJ;
    public volatile boolean LJ;
    public InterfaceC209819178v LJFF;
    public AttributeSet LJI;
    public volatile Context LJII;
    public int LJIIIIZZ;
    public InterfaceC21144617oq LJIIIZ;
    public InterfaceC204538151s LJIIJ;
    public InterfaceC21045917Xl LJIIJJI;
    public final LinkedList<InterfaceC21144717or> LIZIZ = new LinkedList<>();
    public final AtomicReference<EnumC19382110sF> LIZLLL = new AtomicReference<>(EnumC19382110sF.UN_CREATED);

    public boolean LJIIJJI(Context context) {
        return true;
    }

    public abstract View LJIILIIL(Context context, AttributeSet attributeSet);

    @Override // X.InterfaceC21144717or
    public final List<InterfaceC21144717or> LIZ() {
        if (this.LIZIZ.isEmpty()) {
            return null;
        }
        return this.LIZIZ;
    }

    public final void LJIIL() {
        InterfaceC21144617oq interfaceC21144617oq = this.LJIIIZ;
        if (interfaceC21144617oq != null) {
            interfaceC21144617oq.LJI();
        }
        AttributeSet attributeSet = this.LJI;
        if (attributeSet != null) {
            try {
                ((XmlResourceParser) attributeSet).close();
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            this.LJI = null;
        }
    }

    public final AttributeSet LJIILJJIL() {
        AttributeSet attributeSetLIZIZ;
        AttributeSet attributeSet = this.LJI;
        if (attributeSet != null) {
            return attributeSet;
        }
        byte[] data = this.LJFF.getData();
        if (data == null) {
            attributeSetLIZIZ = null;
        } else if (Build.VERSION.SDK_INT >= 31) {
            try {
                attributeSetLIZIZ = C1972107nz.LIZIZ(data);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    attributeSetLIZIZ = C1972107nz.LIZ(data);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    attributeSetLIZIZ = null;
                }
            }
        } else {
            attributeSetLIZIZ = C1972107nz.LIZ(data);
        }
        if (attributeSetLIZIZ == null) {
            throw new IllegalStateException("Cannot create AttributeSet.");
        }
        try {
            XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSetLIZIZ;
            for (int next = xmlResourceParser.next(); next != 2 && next != 1; next = xmlResourceParser.next()) {
            }
            this.LJI = attributeSetLIZIZ;
            return attributeSetLIZIZ;
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            this.LJI = null;
            throw new IllegalStateException("Invalid AttributeSet", th3);
        }
    }

    @Override // X.InterfaceC21144717or
    public Context getContext() {
        Context context = this.LJII;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Please call ViewCreator#tryCreateView() first.");
    }

    public static boolean LJIILLIIL() {
        return Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread());
    }

    @Override // X.InterfaceC21144717or
    public final View LJIIIZ() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Please call ViewSizeCounter#waitAllViewCreated() first.");
    }

    @Override // X.InterfaceC21144717or
    public int LJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC21144717or
    public InterfaceC21144717or getParent() {
        return this.LIZ;
    }

    @Override // X.InterfaceC21144717or
    public View getView() {
        return this.LIZJ;
    }

    private final Context LJIIIIZZ(Context context) {
        Context contextLJIIIIZZ;
        Context context2 = this.LJII;
        if (context2 != null) {
            return context2;
        }
        InterfaceC21144617oq interfaceC21144617oq = this.LJIIIZ;
        if (this.LJIIIIZZ == 0 && (interfaceC21144617oq == null || !interfaceC21144617oq.LIZLLL())) {
            this.LJII = context;
            return context;
        }
        synchronized (this) {
            try {
                Context context3 = this.LJII;
                if (context3 != null) {
                    return context3;
                }
                if (interfaceC21144617oq != null) {
                    contextLJIIIIZZ = interfaceC21144617oq.LJIIIIZZ(context);
                } else {
                    contextLJIIIIZZ = null;
                }
                if (contextLJIIIIZZ == null) {
                    if (this.LJIIIIZZ != 0) {
                        context = new ContextThemeWrapper(context, this.LJIIIIZZ);
                    }
                    contextLJIIIIZZ = context;
                }
                this.LJII = contextLJIIIIZZ;
                return contextLJIIIIZZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static boolean LJIILL(Context context) {
        if (C21145417oy.LIZ(context) != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC21144717or
    public final void LIZIZ(Context context) {
        View view;
        if (this.LIZJ != null) {
            return;
        }
        Context contextLJIIIIZZ = LJIIIIZZ(context);
        if (LJIIJJI(contextLJIIIIZZ)) {
            AtomicReference<EnumC19382110sF> atomicReference = this.LIZLLL;
            EnumC19382110sF enumC19382110sF = EnumC19382110sF.UN_CREATED;
            EnumC19382110sF enumC19382110sF2 = EnumC19382110sF.CREATING;
            while (!atomicReference.compareAndSet(enumC19382110sF, enumC19382110sF2)) {
                if (atomicReference.get() != enumC19382110sF) {
                    return;
                }
            }
            AttributeSet attributeSetLJIILJJIL = LJIILJJIL();
            View viewLJIILIIL = LJIILIIL(contextLJIIIIZZ, attributeSetLJIILJJIL);
            if (viewLJIILIIL instanceof TextView) {
                NxResourceUtils.setTextViewText(contextLJIIIIZZ, attributeSetLJIILJJIL, "", (TextView) viewLJIILIIL);
            }
            InterfaceC21045917Xl interfaceC21045917Xl = this.LJIIJJI;
            if (interfaceC21045917Xl != null) {
                C20922816uA c20922816uA = (C20922816uA) interfaceC21045917Xl;
                if (viewLJIILIIL instanceof C19MX) {
                    ((C19MX) viewLJIILIIL).setReferencedIds(c20922816uA.LIZ);
                } else {
                    throw new IllegalStateException("view is not ConstraintHelper!!!");
                }
            }
            this.LIZJ = viewLJIILIIL;
            this.LIZLLL.set(EnumC19382110sF.CREATED);
            InterfaceC21144617oq interfaceC21144617oq = this.LJIIIZ;
            if (interfaceC21144617oq != null) {
                interfaceC21144617oq.onViewCreated(viewLJIILIIL);
            }
            AbstractC21144517op abstractC21144517op = this.LIZ;
            if (!(abstractC21144517op instanceof InterfaceC21046117Xn) && abstractC21144517op != null && (view = abstractC21144517op.getView()) != null) {
                LJFF((ViewGroup) view);
            }
            this.LJIIJ.LIZ();
        }
    }

    @Override // X.InterfaceC21144717or
    public final void LJFF(ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParamsLIZJ;
        View view = getView();
        if (view != null && !this.LJ) {
            synchronized (this) {
                try {
                    if (!this.LJ) {
                        InterfaceC21144617oq interfaceC21144617oq = this.LJIIIZ;
                        if (interfaceC21144617oq != null && (layoutParamsLIZJ = interfaceC21144617oq.LIZJ(viewGroup)) != null) {
                            C786410Ut5.W5(view, layoutParamsLIZJ);
                        } else {
                            C786410Ut5.W5(view, viewGroup.generateLayoutParams(LJIILJJIL()));
                        }
                        this.LJ = true;
                        LJIIL();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.InterfaceC21144717or
    public void LJII(C204537151r c204537151r) {
        this.LJIIJ = c204537151r;
    }

    @Override // X.InterfaceC21144717or
    public final void LJIIJ(Context context) {
        this.LJII = null;
        LJIIIIZZ(context);
        View view = getView();
        if (view != null && !C1336460ksm.LIZIZ(getContext(), view)) {
            throw new IllegalStateException("failed to update context");
        }
    }

    public void LJIIZILJ(AbstractC21144517op abstractC21144517op) {
        this.LIZ = abstractC21144517op;
        abstractC21144517op.LIZIZ.add(this);
    }
}
