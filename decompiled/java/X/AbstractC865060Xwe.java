package X;

import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;

/* JADX INFO: renamed from: X.0Xwe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC865060Xwe extends AbstractC867440Y1e {
    public abstract void LJIIJJI(int i, ResponseBody responseBody);

    @Override // X.AbstractC867440Y1e
    public final boolean LJIIIIZZ(C0YIN c0yin) {
        if (c0yin.LJIIJJI() && c0yin.LLIZ != null) {
            return true;
        }
        return false;
    }

    public AbstractC865060Xwe(C0YEM c0yem, int i) {
        super(c0yem, i, null);
    }

    @Override // X.AbstractC867440Y1e
    public final void LJII(C0YIN c0yin, C0Y1G c0y1g) {
        if (LJIIIIZZ(c0yin)) {
            Response response = c0yin.LLIZ;
            if (response.body != null) {
                LJIIJJI(response.inbox_type.intValue(), response.body);
            }
        }
    }
}
