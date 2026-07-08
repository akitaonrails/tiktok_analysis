package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collection;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rqV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1604130rqV {
    public static final boolean LIZLLL = ((Boolean) C260410AIl.LIZ.getValue()).booleanValue();
    public final String LIZ;
    public final String LIZIZ;
    public final byte LIZJ;

    public final void LIZIZ(Function0<String> function0) {
        if (!LIZLLL) {
            return;
        }
        LIZ(function0.invoke(), null);
    }

    public final void LJ(String str) {
        if (!LIZLLL) {
            return;
        }
        LJFF(this.LIZIZ, str);
    }

    public final void LJII(Function0<String> function0) {
        if (!LIZLLL) {
            return;
        }
        LJ(function0.invoke());
    }

    public final void LJIIIZ(String str) {
        LJIIIIZZ(null, this.LIZIZ, str);
    }

    public final void LJIIJJI(Function0<String> function0) {
        if (!LIZLLL) {
            return;
        }
        LJIIJ(function0.invoke(), null);
    }

    public final void LJIILL(String str) {
        if (!LIZLLL) {
            return;
        }
        LJIILLIIL(this.LIZIZ, str);
    }

    public final void LJIJ(Function0<String> function0) {
        if (!LIZLLL) {
            return;
        }
        LJIILL(function0.invoke());
    }

    public AbstractC1604130rqV(String str, String str2) {
        byte b;
        this.LIZ = str;
        this.LIZIZ = str2;
        if (C2213981Bky.LIZIZ.LIZLLL()) {
            b = 15;
        } else {
            b = 7;
        }
        this.LIZJ = b;
    }

    public final void LIZ(String str, Object obj) {
        if (!LIZLLL) {
            return;
        }
        String str2 = this.LIZIZ;
        if (((byte) (this.LIZJ & 8)) != 0) {
            LJIILIIL(str2, str, true, 3, obj);
        }
    }

    public final void LJFF(String str, String str2) {
        if (LIZLLL && ((byte) (this.LIZJ & 1)) != 0) {
            LJIILIIL(str, str2, true, 6, null);
        }
    }

    public final void LJI(String str, Throwable th) {
        String string;
        if (!LIZLLL) {
            return;
        }
        String str2 = this.LIZIZ;
        if (th != null) {
            string = th.toString();
        } else {
            string = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(string);
        LJFF(str2, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIIJ(String str, Object obj) {
        if (!LIZLLL) {
            return;
        }
        LJIIIIZZ(obj, this.LIZIZ, str);
    }

    public final void LJIILLIIL(String str, String str2) {
        if (!LIZLLL || ((byte) (this.LIZJ & 2)) == 0) {
            return;
        }
        LJIILIIL(str, str2, true, 5, null);
    }

    public final void LJIIZILJ(String str, Throwable th) {
        String string;
        if (!LIZLLL) {
            return;
        }
        String str2 = this.LIZIZ;
        if (th != null) {
            string = th.toString();
        } else {
            string = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(string);
        LJIILLIIL(str2, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZLLL(AbstractC1604130rqV abstractC1604130rqV, String str, String str2) {
        if (!LIZLLL) {
            abstractC1604130rqV.getClass();
        } else {
            if (((byte) (abstractC1604130rqV.LIZJ & 8)) == 0) {
                return;
            }
            abstractC1604130rqV.LJIILIIL(str, str2, true, 3, null);
        }
    }

    public static void LJIIL(AbstractC1604130rqV abstractC1604130rqV, String str, String str2) {
        if (!LIZLLL) {
            abstractC1604130rqV.getClass();
        } else {
            if (((byte) (abstractC1604130rqV.LIZJ & 4)) == 0) {
                return;
            }
            abstractC1604130rqV.LJIILIIL(str, str2, false, 4, null);
        }
    }

    public final void LJIIIIZZ(Object obj, String str, String str2) {
        if (!LIZLLL || ((byte) (this.LIZJ & 4)) == 0) {
            return;
        }
        LJIILIIL(str, str2, true, 4, obj);
    }

    public final void LJIILIIL(String str, String str2, boolean z, int i, Object obj) {
        boolean z2;
        String strLIZIZ;
        String strLIZIZ2;
        if (obj != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(", ");
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                strLIZIZ2 = "action:" + intent.getAction() + ",ds:" + intent.getDataString();
            } else if (obj instanceof Collection) {
                strLIZIZ2 = String.valueOf(((Collection) obj).size());
            } else if (obj instanceof Aweme) {
                Aweme aweme = (Aweme) obj;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(aweme.getAid());
                sbLIZ2.append(',');
                sbLIZ2.append(aweme.getLogPbString());
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(obj.getClass().getSimpleName());
                sbLIZ3.append(", ");
                sbLIZ3.append(obj);
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
            }
            sbLIZ.append(strLIZIZ2);
            str2 = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (this.LIZIZ.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(this.LIZ);
            sbLIZ4.append('_');
            sbLIZ4.append(this.LIZIZ);
            sbLIZ4.append('_');
            sbLIZ4.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        } else {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(this.LIZ);
            sbLIZ5.append('_');
            sbLIZ5.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
        }
        if (z && str2.length() > 1024) {
            str2 = str2.substring(0, 1024);
        }
        C827530WdD c827530WdD = C827530WdD.LIZ;
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append(this.LIZ);
        sbLIZ6.append('.');
        sbLIZ6.append(this.LIZIZ);
        c827530WdD.LIZJ(C2188811AlT.LIZIZ(sbLIZ6), i, strLIZIZ, str2);
    }
}
