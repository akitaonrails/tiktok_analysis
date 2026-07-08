package X;

import com.ss.ttlivestreamer.core.utils.TimeUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jHq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1275120jHq {
    public C1272000jCo LIZJ;
    public final InterfaceC1275860jJ2 LIZLLL;
    public EnumC1275230jI1 LIZ = EnumC1275230jI1.UNKNOWN;
    public final List<Object> LIZIZ = new ArrayList();
    public long LJ = 0;
    public long LJFF = 0;
    public boolean LJI = false;
    public boolean LJII = false;

    public C1275120jHq(C1275790jIv c1275790jIv) {
        this.LIZLLL = c1275790jIv;
    }

    public final void LIZ(EnumC1275230jI1 enumC1275230jI1, Object... objArr) {
        if (this.LJI) {
            return;
        }
        this.LJ = TimeUtils.nativeTimeUTCMicros();
        this.LIZ = enumC1275230jI1;
        ((ArrayList) this.LIZIZ).clear();
        for (Object obj : objArr) {
            ((ArrayList) this.LIZIZ).add(obj);
        }
    }
}
