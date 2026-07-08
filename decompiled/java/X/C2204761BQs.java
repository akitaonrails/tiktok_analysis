package X;

import android.text.TextUtils;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.1BQs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2204761BQs {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final Boolean LJIIIIZZ;
    public final String LJIIIZ;
    public int LJIIJ;
    public final C1543850qHH LJIIJJI = new C1543850qHH();
    public final List<TimeLineEvent> LJIIL;
    public final String LJIILIIL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("methodName: ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", params: ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", callbackId: ");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", type: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", iFrameUrl: ");
        sbLIZ.append(TextUtils.isEmpty(this.LJII) ? "null" : this.LJII);
        sbLIZ.append(", version: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", ");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2204761BQs(C1BR2 c1br2) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.LJIIL = copyOnWriteArrayList;
        this.LJIILIIL = "";
        String str = c1br2.LIZ;
        this.LIZIZ = str;
        String str2 = c1br2.LIZIZ;
        this.LIZJ = str2;
        String str3 = c1br2.LIZJ;
        this.LIZLLL = str3;
        String str4 = c1br2.LIZLLL;
        this.LJ = str4;
        String str5 = c1br2.LJ;
        this.LJFF = str5;
        String str6 = c1br2.LJFF;
        this.LJI = str6;
        this.LIZ = 1;
        String str7 = c1br2.LJI;
        this.LJII = str7;
        this.LJIIIIZZ = c1br2.LJIIIIZZ;
        String str8 = c1br2.LJII;
        this.LJIIIZ = str8;
        C2204811BQx c2204811BQx = new C2204811BQx();
        c2204811BQx.LIZJ(str, "version");
        c2204811BQx.LIZJ(str2, "type");
        c2204811BQx.LIZJ(str3, "methodName");
        c2204811BQx.LIZJ(str4, "params");
        c2204811BQx.LIZJ(str6, "namespace");
        c2204811BQx.LIZJ(str5, "callbackId");
        c2204811BQx.LIZJ(str6, "namespace");
        c2204811BQx.LIZJ(str7, "iFrameUrl");
        c2204811BQx.LIZJ(str8, "token");
        c2204811BQx.LIZ("label_create_java_call", copyOnWriteArrayList);
    }

    public C2204761BQs(String str) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.LJIIL = copyOnWriteArrayList;
        this.LJIILIIL = "";
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = str;
        this.LJI = null;
        this.LIZ = -5;
        this.LJII = null;
        this.LJIIIIZZ = Boolean.FALSE;
        this.LJIIIZ = null;
        C2204811BQx c2204811BQx = new C2204811BQx();
        c2204811BQx.LIZJ(str, "callbackId");
        c2204811BQx.LIZJ(-5, "code");
        c2204811BQx.LIZ("label_create_java_call", copyOnWriteArrayList);
    }
}
