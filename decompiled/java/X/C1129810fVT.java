package X;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: X.0fVT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1129810fVT {
    public InterfaceC1138850fk3 LIZ;
    public InterfaceC1142740fqK LIZIZ;
    public int LIZJ = 2;
    public int LIZLLL = 3;
    public int LJ;
    public final Context LJFF;

    public final C1129890fVb LIZ() {
        if (this.LIZ == null) {
            final Context context = this.LJFF;
            this.LIZ = new InterfaceC1138850fk3(context) { // from class: X.0fjw
                public final String LIZ;

                @Override // X.InterfaceC1138850fk3
                public final String LIZ() {
                    return this.LIZ;
                }

                {
                    this.LIZ = context.getDir("gift_resource", 0).getAbsolutePath();
                }

                @Override // X.InterfaceC1138850fk3
                public final String LIZIZ(C1139230fkf c1139230fkf) {
                    StringBuilder sb = new StringBuilder(this.LIZ);
                    String str = File.separator;
                    sb.append(str);
                    sb.append(c1139230fkf.LIZIZ);
                    sb.append(str);
                    sb.append(c1139230fkf.LJ);
                    sb.append(str);
                    return sb.toString();
                }
            };
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = new InterfaceC1142740fqK<String>() { // from class: X.0fqP
                public static C1142760fqM LIZIZ;
                public static C1142770fqN LIZJ;
                public final C1142940fqe LIZ = new C1142940fqe();

                @Override // X.InterfaceC1142740fqK
                public final InterfaceC1142710fqH<String> LIZ(C1139230fkf c1139230fkf, C1129890fVb c1129890fVb) {
                    if (!c1139230fkf.LJFF) {
                        C1142770fqN c1142770fqN = LIZJ;
                        if (c1142770fqN != null) {
                            return c1142770fqN;
                        }
                        C1142770fqN c1142770fqN2 = new C1142770fqN(new C1142870fqX(this.LIZ, c1129890fVb.LIZ));
                        LIZJ = c1142770fqN2;
                        return c1142770fqN2;
                    }
                    C1142760fqM c1142760fqM = LIZIZ;
                    if (c1142760fqM != null) {
                        return c1142760fqM;
                    }
                    C1142760fqM c1142760fqM2 = new C1142760fqM(new C1142770fqN(new C1142870fqX(this.LIZ, c1129890fVb.LIZ)));
                    LIZIZ = c1142760fqM2;
                    return c1142760fqM2;
                }
            };
        }
        return new C1129890fVb(this);
    }

    public C1129810fVT(Context context) {
        this.LJFF = context;
    }
}
