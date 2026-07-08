package X;

/* JADX INFO: renamed from: X.12q0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19877812q0<E> implements InterfaceC19878012q2<E> {
    public final int hashCode() {
        E element = getElement();
        return (element == null ? 0 : element.hashCode()) ^ getCount();
    }

    public final String toString() {
        String strValueOf = String.valueOf(getElement());
        int count = getCount();
        if (count == 1) {
            return strValueOf;
        }
        StringBuilder sb = new StringBuilder(strValueOf.length() + 14);
        sb.append(strValueOf);
        sb.append(" x ");
        sb.append(count);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC19878012q2)) {
            return false;
        }
        InterfaceC19878012q2 interfaceC19878012q2 = (InterfaceC19878012q2) obj;
        if (getCount() != interfaceC19878012q2.getCount() || !C19837412jU.LIZ(getElement(), interfaceC19878012q2.getElement())) {
            return false;
        }
        return true;
    }
}
