package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0eSY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1089560eSY<T> {
    public final InterfaceC1936307iD<T> LIZ;
    public final InterfaceC1089790eSv LIZIZ;
    public final InterfaceC1089810eSx LIZJ;
    public T LIZLLL;

    public abstract void LIZ(DataChannel dataChannel, Object obj);

    public abstract String LIZIZ();

    public boolean LIZJ(T t) {
        return false;
    }

    public AbstractC1089560eSY(InterfaceC1936307iD<T> interfaceC1936307iD, InterfaceC1089790eSv interfaceC1089790eSv, InterfaceC1089810eSx interfaceC1089810eSx) {
        this.LIZ = interfaceC1936307iD;
        this.LIZIZ = interfaceC1089790eSv;
        this.LIZJ = interfaceC1089810eSx;
    }
}
