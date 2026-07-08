package X;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.utils.NxResourceUtils;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: X.0J4J, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J4J extends LayoutInflater {
    public static final String[] LIZLLL = {"android.widget.", "android.view.", "android.webkit.", "android.app."};
    public final LayoutInflater LIZ;
    public final C0J4G LIZIZ;
    public volatile AtomicBoolean LIZJ;

    @Override // android.view.LayoutInflater
    public final LayoutInflater cloneInContext(Context context) {
        LayoutInflater layoutInflaterCloneInContext = this.LIZ.cloneInContext(context);
        LayoutInflater.Factory2 factory2 = layoutInflaterCloneInContext.getFactory2();
        LayoutInflater.Factory factory = layoutInflaterCloneInContext.getFactory();
        C0J4J c0j4j = new C0J4J(context, layoutInflaterCloneInContext);
        if (factory2 != null) {
            c0j4j.LIZIZ.LIZIZ(layoutInflaterCloneInContext.getFactory2());
        }
        if (factory != null && !Intrinsics.LJFF(factory, factory2)) {
            c0j4j.LIZIZ.LIZ(layoutInflaterCloneInContext.getFactory());
        }
        return c0j4j;
    }

    @Override // android.view.LayoutInflater
    public final void setFactory(LayoutInflater.Factory factory) {
        if (factory == null) {
            return;
        }
        try {
            this.LIZIZ.LIZ(factory);
            if (!this.LIZJ.getAndSet(true)) {
                Intrinsics.LJIIJJI(factory, "NxLayoutInflate setFactory : ");
                super.setFactory(this.LIZIZ);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("NxLayoutInflate factory is not null: ");
                sbLIZ.append(factory);
                sbLIZ.append(" , setFactory2 : ");
                sbLIZ.append(factory);
                C2188811AlT.LIZIZ(sbLIZ);
                LayoutInflater.Factory2 factory2 = getFactory2();
                if (factory2 != null) {
                    ((C0J4G) factory2).LIZ(factory);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.nxreword.proxy.NxFactory2");
                }
            }
            this.LIZ.setFactory(factory);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Intrinsics.LJIIJJI(th, "NxLayoutInflate setFactory error: ");
        }
    }

    @Override // android.view.LayoutInflater
    public final void setFactory2(LayoutInflater.Factory2 factory2) {
        if (factory2 == null) {
            return;
        }
        try {
            this.LIZIZ.LIZIZ(factory2);
            if (!this.LIZJ.getAndSet(true)) {
                super.setFactory2(this.LIZIZ);
                Intrinsics.LJIIJJI(factory2, "NxLayoutInflate setFactory2 : ");
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("NxLayoutInflate factory2 is not null: ");
                sbLIZ.append(getFactory2());
                sbLIZ.append(" , setFactory2 : ");
                sbLIZ.append(factory2);
                C2188811AlT.LIZIZ(sbLIZ);
                LayoutInflater.Factory2 factory22 = getFactory2();
                if (factory22 != null) {
                    ((C0J4G) factory22).LIZ(factory2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.nxreword.proxy.NxFactory2");
                }
            }
            this.LIZ.setFactory2(factory2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Intrinsics.LJIIJJI(th, "NxLayoutInflate setFactory2 error: ");
            try {
                Intrinsics.LJIIJJI(factory2, "nxLayoutFactory factory is not null, set : ");
                Field field = C0J43.LIZ;
                if (field != null) {
                    field.set(this, this.LIZIZ);
                    field.set(this.LIZ, this.LIZIZ);
                }
                this.LIZJ.getAndSet(true);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }

    @Override // android.view.LayoutInflater
    public final void setFilter(LayoutInflater.Filter filter) {
        super.setFilter(filter);
        LayoutInflater layoutInflater = this.LIZ;
        if (layoutInflater != null) {
            layoutInflater.setFilter(filter);
        }
    }

    public C0J4J(Context context, LayoutInflater layoutInflater) {
        super(context);
        this.LIZ = layoutInflater;
        this.LIZIZ = new C0J4G(null, null);
        this.LIZJ = new AtomicBoolean(false);
    }

    @Override // android.view.LayoutInflater
    public final View onCreateView(String str, AttributeSet attributeSet) {
        String[] strArr = LIZLLL;
        int length = strArr.length;
        View viewCreateView = null;
        String strLIZIZ = "";
        int i = 0;
        while (i < length) {
            String str2 = strArr[i];
            i++;
            try {
                viewCreateView = createView(str, str2, attributeSet);
            } catch (InflateException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("NxLayoutInflate layout InflateException message: ");
                sbLIZ.append((Object) e.getMessage());
                sbLIZ.append(", cause: ");
                sbLIZ.append(e.getCause());
                sbLIZ.append(", base : ");
                sbLIZ.append(this.LIZ);
                sbLIZ.append("   stack: ");
                sbLIZ.append(Log.getStackTraceString(e));
                C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append("m: ");
                sbLIZ2.append((Object) e.getMessage());
                sbLIZ2.append(", cause: ");
                sbLIZ2.append(e.getCause());
                sbLIZ2.append("---");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("NxLayoutInflate layout throwable message: ");
                sbLIZ3.append((Object) th.getMessage());
                sbLIZ3.append(", cause: ");
                sbLIZ3.append(th.getCause());
                C2188811AlT.LIZIZ(sbLIZ3);
            }
            if (viewCreateView != null) {
                break;
            }
        }
        if (viewCreateView == null) {
            PrintStream printStream = System.err;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("NxReword/LayoutInflateNxLayoutInflate layout error , context : ");
            sbLIZ4.append(getContext());
            sbLIZ4.append("  name : ");
            sbLIZ4.append(str);
            sbLIZ4.append(" --error:");
            sbLIZ4.append(strLIZIZ);
            printStream.println(C2188811AlT.LIZIZ(sbLIZ4));
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("NxLayoutInflate layout error , context : ");
            sbLIZ5.append(getContext());
            sbLIZ5.append("  name : ");
            sbLIZ5.append(str);
            sbLIZ5.append(" --error:");
            sbLIZ5.append(strLIZIZ);
            Npth.reportBizException("NxResource", new Throwable(C2188811AlT.LIZIZ(sbLIZ5)), "NxLayoutInflate", C2097608Jq.LJ());
        }
        if (viewCreateView != null && (viewCreateView instanceof TextView)) {
            NxResourceUtils.setTextViewText(getContext(), attributeSet, str, (TextView) viewCreateView);
        }
        return viewCreateView;
    }

    @Override // android.view.LayoutInflater
    public final View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z) {
        try {
            if (!this.LIZJ.getAndSet(true)) {
                super.setFactory2(this.LIZIZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            System.err.printf("NxReword/LayoutInflate", Intrinsics.LJIIJJI(th, "NxLayoutInflate inflate setFactory error: "));
        }
        return super.inflate(xmlPullParser, viewGroup, z);
    }
}
