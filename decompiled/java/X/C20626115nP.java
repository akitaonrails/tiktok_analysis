package X;

import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* JADX INFO: renamed from: X.15nP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20626115nP {
    public NetworkCapabilities LIZ;
    public NetworkInfo LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public int LJIILJJIL = -2;

    public final String toString() {
        StringBuilder sb = new StringBuilder("isMainNetworkExist: ");
        sb.append(this.LIZ != null ? "true, Capabilities" : this.LIZIZ != null ? "true, Info" : "false");
        sb.append("\nisAirplaneMode ");
        sb.append(this.LIZJ);
        sb.append("\nhasWifi ");
        sb.append(this.LJ);
        sb.append("\nisWifiOpen ");
        sb.append(this.LIZLLL);
        sb.append("\nisWifiInternet ");
        sb.append(this.LJFF);
        sb.append("\nisWifiValidate ");
        sb.append(this.LJI);
        sb.append("\nisWifiNeedPortal ");
        sb.append(this.LJII);
        sb.append("\nhasMobile ");
        sb.append(this.LJIIIIZZ);
        sb.append("\nisMobileInternet ");
        sb.append(this.LJIIIZ);
        sb.append("\nisMobileValidate ");
        sb.append(this.LJIIJ);
        sb.append("\nisVPNOpen ");
        sb.append(this.LJIIJJI);
        sb.append("\nisVPNConnect ");
        sb.append(this.LJIIL);
        sb.append("\nisProxySet ");
        sb.append(this.LJIILIIL);
        sb.append('\n');
        return sb.toString();
    }
}
