package X;

import android.graphics.Rect;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostABInfo;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0b4K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C959220b4K implements InterfaceC955970az5 {
    public static long LIZIZ;
    public static C943870afZ LIZJ;
    public static Rect LIZLLL;
    public static Rect LJFF;
    public static final C959220b4K LIZ = new C959220b4K();
    public static final Set<Long> LJ = new LinkedHashSet();
    public static final C098J<Long, CohostABInfo> LJI = new C098J<>(10);

    @Override // X.InterfaceC955970az5
    public final void LJ() {
        LIZIZ = 0L;
    }

    @Override // X.InterfaceC955970az5
    public final Set<Long> LIZ() {
        return LJ;
    }

    @Override // X.InterfaceC955970az5
    public final Rect LIZLLL() {
        return LIZLLL;
    }

    @Override // X.InterfaceC955970az5
    public final Rect LJIIIIZZ() {
        return LJFF;
    }

    @Override // X.InterfaceC955970az5
    public final long LJIIIZ() {
        return LIZIZ;
    }

    @Override // X.InterfaceC955970az5
    public final void LIZIZ(Rect rect) {
        LIZLLL = rect;
    }

    @Override // X.InterfaceC955970az5
    public final void LJFF(Rect rect) {
        if (LJFF == null) {
            int i = C956370azj.LIZ;
            int iWidth = rect.width();
            int i2 = C956370azj.LIZ;
            if (iWidth <= C956370azj.LIZIZ && i2 <= iWidth) {
                LJFF = rect;
            }
        }
    }

    @Override // X.InterfaceC955970az5
    public final void LJI(long j) {
        LJ.add(Long.valueOf(j));
    }

    @Override // X.InterfaceC955970az5
    public final CohostABInfo LJII(long j) {
        return LJI.get(Long.valueOf(j));
    }

    @Override // X.InterfaceC955970az5
    public final void LIZJ(long j, CohostABInfo cohostABInfo) {
        LJI.put(Long.valueOf(j), cohostABInfo);
    }
}
