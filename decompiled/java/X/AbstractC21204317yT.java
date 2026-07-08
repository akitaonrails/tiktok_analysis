package X;

/* JADX INFO: renamed from: X.17yT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21204317yT implements InterfaceC21205317yd<C21205517yf>, InterfaceC21181817uq {
    public InterfaceC21205817yi<C21205517yf, AbstractC21204317yT> LL;
    public C21205517yf LLILLJJLI;

    public final InterfaceC21205817yi<C21205517yf, AbstractC21204317yT> LIZJ() {
        InterfaceC21205817yi<C21205517yf, AbstractC21204317yT> interfaceC21205817yi = this.LL;
        if (interfaceC21205817yi != null) {
            return interfaceC21205817yi;
        }
        return null;
    }

    @Override // X.InterfaceC21205317yd
    /* JADX INFO: renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public void LIZ(Integer num, C21205517yf c21205517yf) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("state init fromState = ");
        sbLIZ.append(num);
        sbLIZ.append(" , current state = ");
        sbLIZ.append(getState());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        this.LLILLJJLI = c21205517yf;
    }
}
