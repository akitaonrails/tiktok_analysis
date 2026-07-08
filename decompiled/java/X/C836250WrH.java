package X;

import com.google.android.gms.auth.api.identity.BeginSignInRequest;

/* JADX INFO: renamed from: X.0WrH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C836250WrH {
    public BeginSignInRequest.PasswordRequestOptions LIZ;
    public BeginSignInRequest.GoogleIdTokenRequestOptions LIZIZ;
    public BeginSignInRequest.PasskeysRequestOptions LIZJ;
    public BeginSignInRequest.PasskeyJsonRequestOptions LIZLLL;
    public String LJ;
    public boolean LJFF;
    public int LJI;

    public C836250WrH() {
        C836340WrQ c836340WrQ = new C836340WrQ();
        c836340WrQ.LIZ = false;
        this.LIZ = new BeginSignInRequest.PasswordRequestOptions(c836340WrQ.LIZ);
        C836300WrM c836300WrM = new C836300WrM();
        c836300WrM.LIZ = false;
        boolean z = c836300WrM.LIZ;
        this.LIZIZ = new BeginSignInRequest.GoogleIdTokenRequestOptions(c836300WrM.LIZIZ, c836300WrM.LIZJ, c836300WrM.LJ, c836300WrM.LJFF, z, c836300WrM.LIZLLL, c836300WrM.LJI);
        C836310WrN c836310WrN = new C836310WrN();
        c836310WrN.LIZ = false;
        boolean z2 = c836310WrN.LIZ;
        this.LIZJ = new BeginSignInRequest.PasskeysRequestOptions(c836310WrN.LIZJ, c836310WrN.LIZIZ, z2);
        C836330WrP c836330WrP = new C836330WrP();
        c836330WrP.LIZ = false;
        this.LIZLLL = new BeginSignInRequest.PasskeyJsonRequestOptions(c836330WrP.LIZ, c836330WrP.LIZIZ);
    }
}
