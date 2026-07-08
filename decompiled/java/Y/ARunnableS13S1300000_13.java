package Y;

import X.C0VU7;
import X.C0VWW;
import X.C0WIN;
import X.C0WIS;
import X.C0WIX;
import X.C0WIY;
import X.C13LP;
import X.C1C7U;
import X.C20441214yg;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C820880WIc;
import X.InterfaceC820920WIg;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS129S1200000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS13S1300000_13 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C0WIX c0wix = ((C820880WIc) this.l3).LIZ.LLILZ.get(((C0WIN) ((InterfaceC820920WIg) this.l1)).LIZ());
        if (c0wix == null) {
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = ((C820880WIc) this.l3).LIZ;
        String str = this.s0;
        IBinder iBinder = (IBinder) this.l2;
        mediaBrowserServiceCompat.getClass();
        try {
            if (iBinder == null) {
                c0wix.LLILZIL.remove(str);
                return;
            }
            List<C0WIY<IBinder, Bundle>> list = c0wix.LLILZIL.get(str);
            if (list != null) {
                Iterator<C0WIY<IBinder, Bundle>> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (iBinder == it2.next().LIZ) {
                        it2.remove();
                    }
                }
                if (list.size() == 0) {
                    c0wix.LLILZIL.remove(str);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    public final void LIZ$1() {
        if (((C820880WIc) this.l3).LIZ.LLILZ.get(((C0WIN) ((InterfaceC820920WIg) this.l1)).LIZ()) == null) {
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = ((C820880WIc) this.l3).LIZ;
        final String str = this.s0;
        final ResultReceiver resultReceiver = (ResultReceiver) this.l2;
        mediaBrowserServiceCompat.getClass();
        C0WIS<MediaBrowserCompat.MediaItem> c0wis = new C0WIS<MediaBrowserCompat.MediaItem>(str) { // from class: X.0WIa
            @Override // X.C0WIS
            public final void LIZJ(MediaBrowserCompat.MediaItem mediaItem) {
                MediaBrowserCompat.MediaItem mediaItem2 = mediaItem;
                if ((this.LJ & 2) != 0) {
                    resultReceiver.LIZIZ(-1, null);
                    return;
                }
                Bundle bundle = new Bundle();
                C786410Ut5.LJJIJL(bundle, "media_item", mediaItem2);
                resultReceiver.LIZIZ(0, bundle);
            }
        };
        c0wis.LJ = 2;
        c0wis.LIZLLL(null);
        if (c0wis.LIZIZ()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadItem must call detach() or sendResult() before returning for id=");
        sbLIZ.append(str);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.0WIS, X.0WIZ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZ$2() {
        if (((C820880WIc) this.l3).LIZ.LLILZ.get(((C0WIN) ((InterfaceC820920WIg) this.l1)).LIZ()) == null) {
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = ((C820880WIc) this.l3).LIZ;
        final String str = this.s0;
        final ResultReceiver resultReceiver = (ResultReceiver) this.l2;
        mediaBrowserServiceCompat.getClass();
        ?? r0 = new C0WIS<List<MediaBrowserCompat.MediaItem>>(str) { // from class: X.0WIZ
            @Override // X.C0WIS
            public final void LIZJ(List<MediaBrowserCompat.MediaItem> list) {
                List<MediaBrowserCompat.MediaItem> list2 = list;
                if ((this.LJ & 4) == 0 && list2 != null) {
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJIJLIJ(bundle, "search_results", (Parcelable[]) list2.toArray(new MediaBrowserCompat.MediaItem[0]));
                    resultReceiver.LIZIZ(0, bundle);
                    return;
                }
                resultReceiver.LIZIZ(-1, null);
            }
        };
        mediaBrowserServiceCompat.LIZLLL(r0, str);
        if (r0.LIZIZ()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSearch must call detach() or sendResult() before returning for query=");
        sbLIZ.append(str);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZ$3() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startMetricScene ");
        sbLIZ.append(this.s0);
        C20441214yg.LIZIZ("LiveThreadCpuMonitor", C2188811AlT.LIZIZ(sbLIZ));
        if (((ArrayList) ((C0VU7) this.l1).LIZIZ).isEmpty() || !Intrinsics.LJFF(C13LP.LJJLIIIJL(((C0VU7) this.l1).LIZIZ), this.s0)) {
            String str = this.s0;
            C0VWW.LJFF(str, new AwS129S1200000_13(str, (String) this.l2, (Function0<? extends Map<String, ? extends Object>>) this.l3, (Function0<? extends Map<String, ? extends Object>>) 4));
            ((ArrayList) ((C0VU7) this.l1).LIZIZ).add(this.s0);
        }
    }

    public static final void run$0(ARunnableS13S1300000_13 aRunnableS13S1300000_13) {
        try {
            aRunnableS13S1300000_13.LIZ$0();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static final void run$1(ARunnableS13S1300000_13 aRunnableS13S1300000_13) {
        try {
            aRunnableS13S1300000_13.LIZ$1();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static final void run$2(ARunnableS13S1300000_13 aRunnableS13S1300000_13) {
        try {
            aRunnableS13S1300000_13.LIZ$2();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static final void run$3(ARunnableS13S1300000_13 aRunnableS13S1300000_13) {
        boolean zLIZ;
        C1C7U.LIZ("LiveThreadCpuMonitor@16e8.startMetricScene$task$1");
        try {
            aRunnableS13S1300000_13.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveThreadCpuMonitor@16e8.startMetricScene$task$1");
    }

    public ARunnableS13S1300000_13(Object obj, Object obj2, String str, Object obj3, int i) {
        this.$t = i;
        this.l3 = obj;
        this.l1 = obj2;
        this.s0 = str;
        this.l2 = obj3;
    }

    public ARunnableS13S1300000_13(C820880WIc c820880WIc, C0WIN c0win, String str, Bundle bundle, ResultReceiver resultReceiver, int i) {
        this.$t = i;
        this.l3 = c820880WIc;
        this.l1 = c0win;
        this.s0 = str;
        this.l2 = resultReceiver;
    }
}
