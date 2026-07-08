package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tracker.TrackerImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0h3W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1189360h3W {
    public final C1331670kl3 LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final InterfaceC658750Psf LIZLLL;
    public boolean LJ;
    public C1193750hAb LJFF;
    public boolean LJI;

    public final void LIZIZ() {
        C786410Ut5.h3(this.LIZ);
    }

    public final void LIZ(View view) {
        if (C1183030gtJ.LIZ().enableLcpTrack == 0 || this.LJI) {
            return;
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bindLcpNode, identifier = ");
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append('~');
            sbLIZ.append(this.LIZJ);
            C2188811AlT.LIZIZ(sbLIZ);
            if (view != null) {
                InterfaceC665370Q7z interfaceC665370Q7zLIZJ = C1558360qeg.LIZJ(view, "ttls_tracker", 2);
                if (interfaceC665370Q7zLIZJ != null) {
                    TrackerImpl trackerImpl = (TrackerImpl) C1558520qew.LIZ(interfaceC665370Q7zLIZJ, TrackerImpl.class, null);
                    if (trackerImpl != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("bindLcpNode at host, tracker = ");
                        sbLIZ2.append(trackerImpl);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        trackerImpl.LJJ(new AwS597S0100000_18(this, 732));
                        return;
                    }
                    if (view == null) {
                        return;
                    }
                }
                C1189380h3Y c1189380h3Y = new C1189380h3Y();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(this.LIZIZ);
                sbLIZ3.append('~');
                sbLIZ3.append(this.LIZJ);
                c1189380h3Y.LIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                c1189380h3Y.LIZ = EnumC1184240gvG.IMAGE;
                c1189380h3Y.LIZJ = new AwS562S0100000_18(this, 2480);
                c1189380h3Y.LIZLLL = new AwS562S0100000_18(this, 2481);
                c1189380h3Y.LJ = Long.valueOf(System.currentTimeMillis());
                view.setTag(R.id.ywn, c1189380h3Y);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1186030gy9.LIZ(new AwS562S0100000_18(e, 2482));
        }
    }

    public final void LIZJ(AbstractC1335900krs abstractC1335900krs) {
        this.LIZ.LJIIJ(abstractC1335900krs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(InterfaceC1334290kpH interfaceC1334290kpH) {
        View view;
        this.LIZ.LJJ(interfaceC1334290kpH);
        if (interfaceC1334290kpH instanceof View) {
            view = (View) interfaceC1334290kpH;
        } else {
            view = null;
        }
        LIZ(view);
    }

    public final void LJ(InterfaceC1331910klR interfaceC1331910klR) {
        this.LIZ.LJJII(interfaceC1331910klR);
    }

    public final void LJFF(Drawable drawable) {
        this.LIZ.LJJIIZI(drawable);
    }

    public final void LJI(int i, int i2) {
        C1331670kl3 c1331670kl3 = this.LIZ;
        c1331670kl3.LJIIIIZZ = i;
        c1331670kl3.LJIIIZ = i2;
    }

    public C1189360h3W(C1331670kl3 c1331670kl3, String str, String str2, C1202680hP0 c1202680hP0, InterfaceC658750Psf interfaceC658750Psf, C1180560gpK c1180560gpK) {
        this.LIZ = c1331670kl3;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = interfaceC658750Psf;
        if (C296700Bk4.LIZ() && c1180560gpK != null) {
            c1331670kl3.LJIILJJIL = 0;
            c1331670kl3.LJJIIZI(new C1189390h3Z(C1180570gpL.LIZIZ(c1180560gpK, null)));
            c1331670kl3.LJIL(new C1189390h3Z(C1180570gpL.LIZ(c1180560gpK, null)));
        }
        C1189400h3a.LIZJ(c1331670kl3, str, str2, null, c1202680hP0, new InterfaceC658750Psf() { // from class: X.0h3X
            @Override // X.InterfaceC658750Psf
            public final void Ck(JSONObject jSONObject) {
                C1189360h3W c1189360h3W = this.LL;
                c1189360h3W.LJ = true;
                String strOptString = jSONObject.optString("uri");
                String strOptString2 = jSONObject.optString("message");
                c1189360h3W.LJFF = new C1193750hAb(System.currentTimeMillis(), Boolean.valueOf(jSONObject.optBoolean("isSuccess")), strOptString2, strOptString);
                InterfaceC658750Psf interfaceC658750Psf2 = this.LL.LIZLLL;
                if (interfaceC658750Psf2 != null) {
                    interfaceC658750Psf2.Ck(jSONObject);
                }
            }

            @Override // X.InterfaceC658750Psf
            public final void onImageLoaded(boolean z, String str3, JSONObject jSONObject) {
                InterfaceC658750Psf interfaceC658750Psf2 = this.LL.LIZLLL;
                if (interfaceC658750Psf2 != null) {
                    interfaceC658750Psf2.onImageLoaded(z, str3, jSONObject);
                }
            }
        });
    }
}
