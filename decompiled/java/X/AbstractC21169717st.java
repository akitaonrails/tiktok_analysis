package X;

import X.AbstractC21169117sn;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol;

/* JADX INFO: renamed from: X.17st, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21169717st<CONTEXT extends AbstractC21169117sn> implements InterfaceC21170217sy<CONTEXT> {
    public final CONTEXT LIZ;
    public C21169817su<CONTEXT> LIZIZ;
    public C19358110oN LIZJ = new C19358110oN(false, false);
    public String LIZLLL;
    public DownloadMobProtocol<CONTEXT> LJ;
    public C21170817t4 LJFF;
    public InterfaceC21168617si LJI;

    public boolean LJFF() {
        return false;
    }

    public abstract void LJI();

    public void LJII() {
    }

    public void LJIIIIZZ(int i, String str, String str2, String str3) {
    }

    public void LJIIIZ(String str, String str2) {
    }

    public void LJIIJJI() {
    }

    public final void LJIIJ() {
        if (LJFF()) {
            LJIIJJI();
            C1371690lnb.LIZJ(LIZIZ(), "prepare");
        }
    }

    public AbstractC21169717st(CONTEXT context) {
        this.LIZ = context;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(context.LIZIZ());
        sbLIZ.append(context.LJ);
        sbLIZ.append(context.LIZIZ);
        this.LIZLLL = C2188811AlT.LIZIZ(sbLIZ);
        this.LJFF = new C21170817t4();
        this.LJI = new InterfaceC21168617si() { // from class: X.17t5
            @Override // X.InterfaceC21168617si
            public final void LIZ(Context context2) {
            }

            @Override // X.InterfaceC21168617si
            public final void onCancel() {
            }

            @Override // X.InterfaceC21168617si
            public final void onFailed(int i) {
            }

            @Override // X.InterfaceC21168617si
            public final void onProgress(int i) {
            }

            @Override // X.InterfaceC21168617si
            public final void onSuccess() {
            }
        };
    }

    public final void LIZJ(String str) {
        String strLIZIZ = LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancel!!! [outPutPath: ");
        sbLIZ.append(str);
        sbLIZ.append(']');
        C1371690lnb.LIZIZ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ));
        this.LJFF.LIZIZ = true;
        LJII();
        if (!TextUtils.equals(this.LIZLLL, str)) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C21163517rt(this, null), 3);
        }
        C21169817su<CONTEXT> c21169817su = this.LIZIZ;
        if (c21169817su != null) {
            c21169817su.LIZLLL(str, this.LJFF, this.LJI, this.LJ, c21169817su);
        }
    }

    public final void LJ(String str, String str2) {
        String strLIZIZ = LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("success!!! [outPutPath: ");
        sbLIZ.append(str);
        sbLIZ.append(']');
        C1371690lnb.LIZJ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ));
        LJIIIZ(str, str2);
        if (!TextUtils.equals(this.LIZLLL, str)) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C21163617ru(this, null), 3);
        }
        C21169817su<CONTEXT> c21169817su = this.LIZIZ;
        if (c21169817su != null) {
            c21169817su.LIZIZ(str, this.LJFF, this.LJI, this.LJ, c21169817su);
        }
    }

    public final void LIZLLL(int i, String str, String str2, String str3) {
        String strLIZIZ = LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("failure!!! [");
        sbLIZ.append(i);
        sbLIZ.append(" : ");
        sbLIZ.append(str2);
        sbLIZ.append("] [outPutPath: ");
        sbLIZ.append(str);
        sbLIZ.append(']');
        C1371690lnb.LIZIZ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ));
        this.LJFF.LIZ = false;
        LJIIIIZZ(i, str2, str, str3);
        if (!TextUtils.equals(this.LIZLLL, str)) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C21163417rs(this, null), 3);
        }
        C21169817su<CONTEXT> c21169817su = this.LIZIZ;
        if (c21169817su != null) {
            c21169817su.LIZLLL(str, this.LJFF, this.LJI, this.LJ, c21169817su);
        }
    }

    @Override // X.InterfaceC21170217sy
    public final void LIZ(String str, C21170817t4 c21170817t4, InterfaceC21168617si interfaceC21168617si, C19358110oN c19358110oN, DownloadMobProtocol<CONTEXT> downloadMobProtocol, C21169817su<CONTEXT> c21169817su) {
        String strLIZIZ = LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle!!! [inputPath: ");
        sbLIZ.append(str);
        sbLIZ.append(']');
        C1371690lnb.LIZJ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ));
        this.LIZLLL = str;
        this.LJFF = c21170817t4;
        this.LJI = interfaceC21168617si;
        this.LIZJ = c19358110oN;
        this.LJ = downloadMobProtocol;
        this.LIZIZ = c21169817su;
        LJI();
    }
}
