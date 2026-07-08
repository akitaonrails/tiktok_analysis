package X;

/* JADX INFO: renamed from: X.17yQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21204017yQ implements InterfaceC21205217yc<C21205417ye>, InterfaceC21181717up {
    public InterfaceC21205717yh<C21205417ye, AbstractC21204017yQ> LL;
    public C21205417ye LLILLJJLI;

    public final InterfaceC21205717yh<C21205417ye, AbstractC21204017yQ> LIZJ() {
        InterfaceC21205717yh<C21205417ye, AbstractC21204017yQ> interfaceC21205717yh = this.LL;
        if (interfaceC21205717yh != null) {
            return interfaceC21205717yh;
        }
        return null;
    }

    @Override // X.InterfaceC21205217yc
    /* JADX INFO: renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public void LIZ(Integer num, C21205417ye c21205417ye) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("state init fromState = ");
        sbLIZ.append(num);
        sbLIZ.append(" , current state = ");
        sbLIZ.append(getState());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        this.LLILLJJLI = c21205417ye;
    }
}
