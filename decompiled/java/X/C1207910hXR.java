package X;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.Map;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: renamed from: X.0hXR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1207910hXR extends C12Q8 {
    public C21566519ah LIZ;
    public final /* synthetic */ Activity LIZIZ;
    public final /* synthetic */ C1207920hXS LIZJ;

    @Override // X.C12Q8
    public final void LIZ() {
        C21566519ah c21566519ah = this.LIZ;
        if (c21566519ah != null) {
            c21566519ah.LIZIZ(null);
        }
        this.LIZ = null;
    }

    public C1207910hXR(Activity activity, C1207920hXS c1207920hXS) {
        this.LIZIZ = activity;
        this.LIZJ = c1207920hXS;
    }

    @Override // X.C12Q8
    public final void LIZLLL(C12QB c12qb, final C12QB c12qb2, String str, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (str == null || str.length() == 0) {
            str = this.LIZIZ.getResources().getString(2131826364);
        }
        Activity activity = this.LIZIZ;
        C21566919al c21566919al = new C21566919al(activity);
        c21566919al.LIZIZ = str;
        if (str2.length() == 0) {
            str2 = activity.getResources().getString(2131837942);
        }
        c21566919al.LIZJ = str2;
        c21566919al.LJIIJJI(new DialogInterfaceOnClickListenerC1208800hYs(c12qb, 3), this.LIZIZ.getResources().getString(2131826361), true);
        String string = this.LIZIZ.getResources().getString(2131826362);
        final C1207920hXS c1207920hXS = this.LIZJ;
        final Activity activity2 = this.LIZIZ;
        c21566919al.LJIIJ = new C21566819ak(new DialogInterface.OnClickListener() { // from class: X.0hXQ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                String str7;
                String str8;
                C1207400hWc c1207400hWc = C1207400hWc.LIZ;
                C1207520hWo c1207520hWo = c1207920hXS.LIZ;
                String str9 = null;
                if (c1207520hWo != null) {
                    str7 = c1207520hWo.LIZ;
                    str8 = c1207520hWo.LIZIZ;
                    str9 = c1207520hWo.LIZLLL;
                } else {
                    str7 = null;
                    str8 = null;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                AwS384S0200000_18 awS384S0200000_18 = new AwS384S0200000_18(activity2, c1207920hXS, 201);
                c1207400hWc.getClass();
                C1207400hWc.LJIILJJIL(0, jCurrentTimeMillis2, str7, str8, str9, awS384S0200000_18);
                C12QB c12qb3 = c12qb2;
                if (c12qb3 != null) {
                    c12qb3.LIZ();
                }
            }
        }, string, false);
        c21566919al.LJII = false;
        c21566919al.LIZLLL(new AwS597S0100000_18(this, 761));
        C21566519ah c21566519ah = new C21566519ah(c21566919al);
        C1207920hXS c1207920hXS2 = this.LIZJ;
        this.LIZ = c21566519ah;
        C1207400hWc c1207400hWc = C1207400hWc.LIZ;
        C1207520hWo c1207520hWo = c1207920hXS2.LIZ;
        Map<String, ? extends Object> map = null;
        if (c1207520hWo != null) {
            str4 = c1207520hWo.LIZ;
            str5 = c1207520hWo.LIZIZ;
            str6 = c1207520hWo.LIZLLL;
            map = c1207520hWo.LIZJ;
        } else {
            str4 = null;
            str5 = null;
            str6 = null;
        }
        c1207400hWc.getClass();
        C1207400hWc.LJIILL(str4, str5, str6, map);
        c21566519ah.LIZLLL();
    }
}
