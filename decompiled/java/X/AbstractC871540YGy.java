package X;

import com.bytedance.im.core.proto.RequestBody;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0YGy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC871540YGy<T> extends AbstractC867440Y1e<T> {
    public final C0YH7 LJ;

    @Override // X.AbstractC867440Y1e
    public final C871360YGg LJFF() {
        return this.LJ.LLJLL().LIZIZ();
    }

    public AbstractC871540YGy(C0YH7 c0yh7, int i, InterfaceC863600XuI<T> interfaceC863600XuI) {
        super(c0yh7.LJFF(), null, i, interfaceC863600XuI);
        this.LJ = c0yh7;
    }

    @Override // X.AbstractC867440Y1e
    public final long LJIIIZ(int i, RequestBody requestBody, InterfaceC864880XwM interfaceC864880XwM, Object... objArr) {
        C870860YEi c870860YEiLIZIZ = this.LJ.LIZ().LIZIZ();
        if (c870860YEiLIZIZ != null) {
            return LIZLLL(C870740YDw.LIZ(this.LIZJ, i, this.LIZ, requestBody, null), null, c870860YEiLIZIZ, Arrays.copyOf(objArr, objArr.length));
        }
        C868780Y6i c868780Y6iLIZLLL = this.LJ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No request queue (no session), cmd=");
        sbLIZ.append(this.LIZ);
        c868780Y6iLIZLLL.LJIIIIZZ("SugarBaseHandler", C2188811AlT.LIZIZ(sbLIZ), null);
        LIZ(C0YIN.LIZJ(this.LJ.getConfig().LIZ.LJFF().LJIILL(), this.LJ.LIZLLL(), -9999));
        return -1L;
    }
}
