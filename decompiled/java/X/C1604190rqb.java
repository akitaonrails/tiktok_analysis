package X;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rqb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1604190rqb implements C1BLD {
    public final Context LIZ;

    @Override // X.C1BLD
    public final void LIZ() {
    }

    @Override // X.C1BLD
    public final void LIZLLL() {
    }

    public List LJIIIIZZ() {
        List<C00BY> listLJJIIZ;
        IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        if (iPluginService != null && (listLJJIIZ = iPluginService.LJJIIZ()) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJIIZ, 10));
            Iterator<C00BY> it2 = listLJJIIZ.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LIZ);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                C1604240rqg.LIZ.getClass();
                if (C1604240rqg.LIZIZ.contains(obj)) {
                    arrayList2.add(obj);
                }
            }
            List listLLIIII = C13LP.LLIIII(arrayList2);
            if (listLLIIII != null) {
                return listLLIIII;
            }
        }
        return C13BV.INSTANCE;
    }

    public C1604190rqb(Context context) {
        this.LIZ = context;
    }

    public final String LJII(String str) {
        String string;
        if (Intrinsics.LJFF(str, "com.ss.android.ugc.aweme.df_camera")) {
            string = this.LIZ.getString(2131838615);
        } else {
            string = "";
        }
        return this.LIZ.getString(2131838616, string);
    }

    public final boolean LJIIIZ(String str) {
        List listLJIIIIZZ = LJIIIIZZ();
        if (!(listLJIIIIZZ instanceof Collection) || !listLJIIIIZZ.isEmpty()) {
            for (Object obj : listLJIIIIZZ) {
                C1604240rqg.LIZ.getClass();
                if (C1604240rqg.LIZIZ.contains(obj) && !Intrinsics.LJFF(obj, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.C1BLD
    public final void LIZIZ(String str, boolean z) {
        C1604240rqg.LIZ.getClass();
        if (C1604240rqg.LIZIZ.contains(str) && !z) {
            C1604240rqg.LIZJ = new C1604220rqe(str, LJII(str));
            C707370Rot.LIZ.LIZIZ("PLUGIN_DOWNLOAD_STATUS").postValue(C1604240rqg.LIZJ);
        }
    }

    @Override // X.C1BLD
    public final void LJ(String str, boolean z) {
        C1604240rqg.LIZ.getClass();
        if (C1604240rqg.LIZIZ.contains(str) && !z) {
            if (!LJIIIZ(str)) {
                C1604240rqg.LIZJ = new C1604230rqf(str, this.LIZ.getString(2131838609, this.LIZ.getString(2131838610)));
                C707370Rot.LIZ.LIZIZ("PLUGIN_DOWNLOAD_STATUS").postValue(C1604240rqg.LIZJ);
            } else {
                for (String str2 : LJIIIIZZ()) {
                    if (!Intrinsics.LJFF(str2, str)) {
                        LIZIZ(str2, false);
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
    }

    @Override // X.C1BLD
    public final void LJI(String str, boolean z) {
        C1604240rqg.LIZ.getClass();
        if (C1604240rqg.LIZIZ.contains(str) && !z) {
            C1604240rqg.LIZJ = new C1604210rqd(str, 99, LJII(str));
            C707370Rot.LIZ.LIZIZ("PLUGIN_DOWNLOAD_STATUS").postValue(C1604240rqg.LIZJ);
        }
    }

    @Override // X.C1BLD
    public final void LIZJ(String str, boolean z, int i, Function0<Unit> function0) {
        C1604240rqg.LIZ.getClass();
        if (C1604240rqg.LIZIZ.contains(str) && !z) {
            if (!LJIIIZ(str)) {
                C1604240rqg.LIZJ = new C1604180rqa(str, function0, this.LIZ.getString(2131838603, ""), this.LIZ.getString(2131838604));
                C707370Rot.LIZ.LIZIZ("PLUGIN_DOWNLOAD_STATUS").postValue(C1604240rqg.LIZJ);
                return;
            }
            for (String str2 : LJIIIIZZ()) {
                if (!Intrinsics.LJFF(str2, str)) {
                    LIZIZ(str2, false);
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    @Override // X.C1BLD
    public final void LJFF(long j, long j2, String str, boolean z) {
        C1604240rqg.LIZ.getClass();
        if (C1604240rqg.LIZIZ.contains(str) && !z) {
            C1604240rqg.LIZJ = new C1604210rqd(str, C13LZ.LJ((int) ((j / j2) * 100), 1, 98), LJII(str));
            C707370Rot.LIZ.LIZIZ("PLUGIN_DOWNLOAD_STATUS").postValue(C1604240rqg.LIZJ);
        }
    }
}
