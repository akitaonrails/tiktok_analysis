package X;

import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.api.model.FollowContent;
import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.model.TaskEventContent;
import com.bytedance.touchpoint.api.model.UserActionContent;
import com.bytedance.touchpoint.api.model.UserInfo;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0zWA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1899040zWA extends AbstractC1899090zWF {
    public UserInfo LLIZ;
    public int LLIZLLLIL;

    @Override // X.InterfaceC1899310zWb
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1899310zWb
    public final void LJ() {
        this.LLIZLLLIL = 0;
        Keva keva = C1898830zVp.LIZ;
        C1898830zVp.LIZIZ(this.LL);
    }

    @Override // X.AbstractC1899090zWF
    public final void LJI() {
        this.LLIZLLLIL = 0;
        this.LLIZ = null;
    }

    @Override // X.InterfaceC1899310zWb
    public final void LIZIZ() {
        Keva keva = C1898830zVp.LIZ;
        C1898830zVp.LIZJ(this.LL);
    }

    public final TaskEventContent LJIILL() {
        UserInfo userInfo = this.LLIZ;
        if (userInfo == null) {
            return null;
        }
        return C1898850zVr.LIZ(this.LL, "follow", new UserActionContent(null, null, null, null, null, null, null, null, new FollowContent(userInfo)), null);
    }

    @Override // X.InterfaceC1899310zWb
    public final void LIZ() {
        TaskEventContent taskEventContentLJIILL = LJIILL();
        if (taskEventContentLJIILL != null) {
            Keva keva = C1898830zVp.LIZ;
            C1898830zVp.LIZLLL(this.LL, taskEventContentLJIILL);
        }
    }

    public C1899040zWA(TaskEvent taskEvent) {
        super(taskEvent);
    }

    @Override // X.InterfaceC1899310zWb
    public final void LJFF(TaskEventContent taskEventContent, C1898920zVy c1898920zVy) {
        C1894320zOY c1894320zOY = C1894320zOY.LIZ;
        TaskEvent taskEvent = this.LL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c1894320zOY.getClass();
        C1894320zOY.LJIIIZ(taskEvent, linkedHashMap);
    }
}
