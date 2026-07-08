package X;

import com.bytedance.android.livesdk.model.message.PollMessage;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Ugz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C778910Ugz extends AbstractC777950UfR {
    public final String LJ;
    public final PollMessage LJFF;
    public final EnumC777930UfP LJI = EnumC777930UfP.PRIORITY_TYPE_P3;
    public final EnumC777480Ueg LJII = EnumC777480Ueg.POLL;
    public final CharSequence LJIIIIZZ;

    @Override // X.AbstractC777950UfR
    public final EnumC777930UfP LIZJ() {
        return this.LJI;
    }

    @Override // X.AbstractC777950UfR
    public final CharSequence LIZLLL() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC777950UfR
    public final EnumC777480Ueg LJ() {
        return this.LJII;
    }

    public C778910Ugz(String str, CharSequence charSequence, PollMessage pollMessage) {
        this.LJ = str;
        this.LJFF = pollMessage;
        this.LJIIIIZZ = charSequence;
        this.LIZIZ = new AbstractC777790UfB() { // from class: X.0Uh1
            public final EnumC777770Uf9 LIZ = EnumC777770Uf9.BACK;

            @Override // X.AbstractC777790UfB
            public final EnumC777770Uf9 LIZ() {
                return this.LIZ;
            }
        };
        this.LIZ = new InterfaceC778710Ugf() { // from class: X.0Uh0
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.InterfaceC778710Ugf
            public final C778580UgS getIcon() {
                String str2 = this.LIZ.LJ;
                switch (str2.hashCode()) {
                    case 100571:
                        if (str2.equals("end")) {
                            return new C778580UgS(C497740JfY.LJIIJ(R.drawable.evn), null);
                        }
                        return null;
                    case 112785:
                        if (str2.equals("red")) {
                            return new C778580UgS(C497740JfY.LJIIJ(R.drawable.evo), null);
                        }
                        return null;
                    case 3027034:
                        if (str2.equals("blue")) {
                            return new C778580UgS(C497740JfY.LJIIJ(R.drawable.evj), null);
                        }
                        return null;
                    case 1544803905:
                        if (str2.equals("default")) {
                            return new C778580UgS(C497740JfY.LJIIJ(R.drawable.evp), null);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        };
    }
}
