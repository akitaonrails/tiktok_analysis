package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.util.Log;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lR2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1357700lR2 extends ContextWrapper {
    public static final C01GW<Map<String, Integer>> LJFF = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(505));
    public static final C01GW<Set<Integer>> LJI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(504));
    public static final AtomicBoolean LJII = new AtomicBoolean(false);
    public static final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);
    public static final WeakHashMap<Context, WeakReference<C1357700lR2>> LJIIIZ;
    public final Context LIZ;
    public final Context LIZIZ;
    public final Resources LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;

    static {
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ().getResources().getDisplayMetrics();
        C844470XAv.LIZ().getResources().getDisplayMetrics();
        LJIIIZ = new WeakHashMap<>();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return this.LIZJ.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        return (Resources.Theme) this.LIZLLL.getValue();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return this.LIZJ;
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (Intrinsics.LJFF(str, "layout_inflater")) {
            return this.LJ.getValue();
        }
        return super.getSystemService(str);
    }

    public C1357700lR2(Context context, Context context2, Context context3, Resources resources) {
        super(context);
        this.LIZ = context2;
        this.LIZIZ = context3;
        this.LIZJ = resources;
        this.LIZLLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1357));
        this.LJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1356));
    }
}
