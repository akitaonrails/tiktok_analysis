package X;

import android.accounts.Account;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0Wmn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C833470Wmn {
    public final Set<Scope> LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public String LJ;
    public final Account LJFF;
    public final String LJI;
    public final Map<Integer, GoogleSignInOptionsExtensionParcelable> LJII;
    public String LJIIIIZZ;

    public final GoogleSignInOptions LIZ() {
        if (((HashSet) this.LIZ).contains(GoogleSignInOptions.zae)) {
            Set<Scope> set = this.LIZ;
            Scope scope = GoogleSignInOptions.zad;
            if (((HashSet) set).contains(scope)) {
                ((HashSet) this.LIZ).remove(scope);
            }
        }
        if (this.LIZLLL && (this.LJFF == null || !((HashSet) this.LIZ).isEmpty())) {
            ((HashSet) this.LIZ).add(GoogleSignInOptions.zac);
        }
        return new GoogleSignInOptions(3, new ArrayList(this.LIZ), this.LJFF, this.LIZLLL, this.LIZIZ, this.LIZJ, this.LJ, this.LJI, this.LJII, this.LJIIIIZZ);
    }

    public C833470Wmn() {
        this.LIZ = new HashSet();
        this.LJII = new HashMap();
    }

    public C833470Wmn(GoogleSignInOptions googleSignInOptions) {
        this.LIZ = new HashSet();
        this.LJII = new HashMap();
        C0W3J.LJIIIIZZ(googleSignInOptions);
        this.LIZ = new HashSet(googleSignInOptions.zah);
        this.LIZIZ = googleSignInOptions.zak;
        this.LIZJ = googleSignInOptions.zal;
        this.LIZLLL = googleSignInOptions.zaj;
        this.LJ = googleSignInOptions.zam;
        this.LJFF = googleSignInOptions.zai;
        this.LJI = googleSignInOptions.zan;
        this.LJII = GoogleSignInOptions.LLIIIL(googleSignInOptions.zao);
        this.LJIIIIZZ = googleSignInOptions.zap;
    }
}
