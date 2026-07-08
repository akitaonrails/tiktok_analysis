package X;

import android.os.BadParcelableException;
import android.os.BaseBundle;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0Wsq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class BinderC837220Wsq extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public BinderC837220Wsq() {
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Object obj;
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        AbstractBinderC837390Wt7 abstractBinderC837390Wt7 = (AbstractBinderC837390Wt7) this;
        if (i == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            if (parcel.readInt() == 0) {
                obj = null;
            } else {
                obj = (Parcelable) creator.createFromParcel(parcel);
            }
            BaseBundle baseBundle = (BaseBundle) obj;
            int iDataAvail = parcel.dataAvail();
            if (iDataAvail <= 0) {
                BinderC837350Wt3 binderC837350Wt3 = (BinderC837350Wt3) abstractBinderC837390Wt7;
                final C837260Wsu c837260Wsu = binderC837350Wt3.LLILLL.LIZJ;
                C835520Wq6 c835520Wq6 = binderC837350Wt3.LLILLJJLI;
                synchronized (c837260Wsu.LJFF) {
                    try {
                        ((HashSet) c837260Wsu.LJ).remove(c835520Wq6);
                    } finally {
                    }
                }
                synchronized (c837260Wsu.LJFF) {
                    try {
                        if (c837260Wsu.LJIIJ.get() > 0 && c837260Wsu.LJIIJ.decrementAndGet() > 0) {
                            c837260Wsu.LIZIZ.LIZ("Leaving the connection open for other ongoing calls.", new Object[0]);
                        } else {
                            C786410Ut5.LJJZZIII(c837260Wsu.LIZ(), new AbstractRunnableC837330Wt1() { // from class: X.0Wsz
                                @Override // X.AbstractRunnableC837330Wt1
                                public final void LIZIZ() {
                                    C837260Wsu c837260Wsu2 = c837260Wsu;
                                    if (c837260Wsu2.LJIIL != null) {
                                        c837260Wsu2.LIZIZ.LIZ("Unbind from service.", new Object[0]);
                                        C837260Wsu c837260Wsu3 = c837260Wsu;
                                        c837260Wsu3.LIZ.unbindService(c837260Wsu3.LJIIJJI);
                                        C837260Wsu c837260Wsu4 = c837260Wsu;
                                        c837260Wsu4.LJI = false;
                                        c837260Wsu4.LJIIL = null;
                                        c837260Wsu4.LJIIJJI = null;
                                    }
                                    c837260Wsu.LIZIZ();
                                }
                            });
                        }
                    } finally {
                    }
                }
                binderC837350Wt3.LL.LIZ("onRequestIntegrityToken", new Object[0]);
                int i3 = baseBundle.getInt("error");
                if (i3 != 0) {
                    binderC837350Wt3.LLILLJJLI.LIZJ(new C812900Vui(i3, null));
                    return true;
                }
                final String string = baseBundle.getString("token");
                if (string == null) {
                    binderC837350Wt3.LLILLJJLI.LIZJ(new C812900Vui(-100, null));
                    return true;
                }
                binderC837350Wt3.LLILLJJLI.LIZLLL(new AbstractC812730VuR(string) { // from class: X.0VuS
                    public final String LIZ;

                    {
                        this.LIZ = string;
                    }

                    @Override // X.AbstractC812730VuR
                    public final String LIZ() {
                        return this.LIZ;
                    }

                    public final int hashCode() {
                        return this.LIZ.hashCode() ^ 1000003;
                    }

                    public final String toString() {
                        String str = this.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("IntegrityTokenResponse{token=");
                        sbLIZ.append(str);
                        sbLIZ.append("}");
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    public final boolean equals(Object obj2) {
                        if (obj2 == this) {
                            return true;
                        }
                        if (obj2 instanceof AbstractC812730VuR) {
                            return this.LIZ.equals(((AbstractC812730VuR) obj2).LIZ());
                        }
                        return false;
                    }
                });
                return true;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Parcel data not fully consumed, unread size: ");
            sbLIZ.append(iDataAvail);
            throw new BadParcelableException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return false;
    }
}
