package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import java.util.List;

/* JADX INFO: renamed from: X.0Dnt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350030Dnt {
    public final int LIZ;
    public final int LIZIZ;
    public final NLETrackType LIZJ;
    public final List<NLETrackSlot> LIZLLL;
    public final String LJ;

    public static C350030Dnt LIZ(C350030Dnt c350030Dnt, int i) {
        int i2 = c350030Dnt.LIZIZ;
        NLETrackType nLETrackType = c350030Dnt.LIZJ;
        List<NLETrackSlot> list = c350030Dnt.LIZLLL;
        String str = c350030Dnt.LJ;
        c350030Dnt.getClass();
        return new C350030Dnt(i, i2, nLETrackType, list, str);
    }

    public /* synthetic */ C350030Dnt(int i, int i2, NLETrackType nLETrackType, List list) {
        this(i, i2, nLETrackType, list, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C350030Dnt(int i, int i2, NLETrackType nLETrackType, List<? extends NLETrackSlot> list, String str) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = nLETrackType;
        this.LIZLLL = list;
        this.LJ = str;
    }
}
