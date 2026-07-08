package X;

import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.api.model.CommonVideo;
import com.bytedance.touchpoint.api.model.CommonVideoContent;
import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.model.TaskEventContent;
import com.bytedance.touchpoint.api.model.UserActionContent;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0zW9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1899030zW9 extends AbstractC1899090zWF {
    public int LLIZ;
    public final HashMap<String, CommonVideo> LLIZLLLIL;

    @Override // X.InterfaceC1899310zWb
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1899310zWb
    public final void LJ() {
        this.LLIZ = 0;
        this.LLIZLLLIL.clear();
        Keva keva = C1898830zVp.LIZ;
        C1898830zVp.LIZIZ(this.LL);
    }

    @Override // X.InterfaceC1899310zWb
    public final void LJFF(TaskEventContent taskEventContent, C1898920zVy c1898920zVy) {
    }

    @Override // X.AbstractC1899090zWF
    public final void LJI() {
        this.LLIZ = 0;
        this.LLIZLLLIL.clear();
    }

    @Override // X.InterfaceC1899310zWb
    public final void LIZIZ() {
        Keva keva = C1898830zVp.LIZ;
        C1898830zVp.LIZJ(this.LL);
    }

    public final TaskEventContent LJIILL() {
        if (!(!this.LLIZLLLIL.isEmpty())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LLIZLLLIL.values());
        return C1898850zVr.LIZ(this.LL, "share", new UserActionContent(null, null, null, null, null, null, new CommonVideoContent(arrayList), null, null), null);
    }

    @Override // X.InterfaceC1899310zWb
    public final void LIZ() {
        TaskEventContent taskEventContentLJIILL = LJIILL();
        if (taskEventContentLJIILL != null) {
            Keva keva = C1898830zVp.LIZ;
            C1898830zVp.LIZLLL(this.LL, taskEventContentLJIILL);
        }
    }

    public C1899030zW9(TaskEvent taskEvent) {
        super(taskEvent);
        this.LLIZLLLIL = new HashMap<>();
    }
}
