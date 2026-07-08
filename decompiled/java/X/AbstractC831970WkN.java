package X;

import X.InterfaceC831160Wj4;
import android.content.Context;
import android.os.Looper;

/* JADX INFO: renamed from: X.0WkN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC831970WkN<T extends InterfaceC831160Wj4, O> extends AbstractC832100Wka<T, O> {
    public T buildClient(Context context, Looper looper, C831470WjZ c831470WjZ, O o, InterfaceC832280Wks interfaceC832280Wks, InterfaceC832890Wlr interfaceC832890Wlr) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public T buildClient(Context context, Looper looper, C831470WjZ c831470WjZ, O o, InterfaceC832260Wkq interfaceC832260Wkq, InterfaceC832270Wkr interfaceC832270Wkr) {
        return (T) buildClient(context, looper, c831470WjZ, (Object) o, (InterfaceC832280Wks) interfaceC832260Wkq, (InterfaceC832890Wlr) interfaceC832270Wkr);
    }
}
