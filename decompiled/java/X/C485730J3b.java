package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostAction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0J3b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C485730J3b {
    public static final /* synthetic */ int LJIIL = 0;
    public final String LIZ;
    public final EnumC485770J3f LIZIZ;
    public EnumC485740J3c LIZJ = EnumC485740J3c.SYSTEM_LAYOUT_INFLATER;
    public long LIZLLL = -1;
    public long LJ = -1;
    public long LJFF = -1;
    public long LJI = -999;
    public long LJII = -1;
    public int LJIIIIZZ;
    public final boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;

    public C485730J3b(String str, EnumC485770J3f enumC485770J3f) {
        String simpleName;
        boolean zLJFF;
        this.LIZ = str;
        this.LIZIZ = enumC485770J3f;
        C0J3Y.LIZ.getClass();
        if (C464660IKa.LIZ()) {
            zLJFF = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isLivePlayActivity(C0J3Y.LJIIIIZZ);
        } else {
            Context context = C0J3Y.LJIIIIZZ;
            if (context != null) {
                simpleName = context.getClass().getSimpleName();
            } else {
                simpleName = null;
            }
            zLJFF = Intrinsics.LJFF(simpleName, "LivePlayActivity");
        }
        this.LJIIIZ = zLJFF;
    }
}
