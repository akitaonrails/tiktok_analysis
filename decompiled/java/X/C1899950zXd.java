package X;

import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.touchpoint.api.model.DynamicDialog;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zXd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1899950zXd {
    public static final /* synthetic */ int LJIILL = 0;
    public final EnumC1899970zXf LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Map<String, Object> LJ;
    public final boolean LJFF;
    public EnumC1899960zXe LJI;
    public SparkPopup LJII;
    public InterfaceC1141530foN LJIIIIZZ;
    public Function1<? super C991900bv2, Unit> LJIIIZ;
    public final C1900010zXj LJIIJ;
    public boolean LJIIJJI;
    public final DynamicDialog LJIIL;
    public InterfaceC1899900zXY LJIILIIL;
    public AnonymousClass0956 LJIILJJIL;

    public C1899950zXd() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1899950zXd)) {
            return false;
        }
        C1899950zXd c1899950zXd = (C1899950zXd) obj;
        return this.LIZ == c1899950zXd.LIZ && Intrinsics.LJFF(this.LIZIZ, c1899950zXd.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1899950zXd.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1899950zXd.LIZLLL) && Intrinsics.LJFF(this.LJ, c1899950zXd.LJ) && this.LJFF == c1899950zXd.LJFF && this.LJI == c1899950zXd.LJI && Intrinsics.LJFF(this.LJII, c1899950zXd.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1899950zXd.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1899950zXd.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1899950zXd.LJIIJ) && this.LJIIJJI == c1899950zXd.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c1899950zXd.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c1899950zXd.LJIILIIL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31;
        Map<String, Object> map = this.LJ;
        int iHashCode3 = (((iHashCode2 + (map == null ? 0 : map.hashCode())) * 31) + C786410Ut5.Z2(this.LJFF)) * 31;
        EnumC1899960zXe enumC1899960zXe = this.LJI;
        int iHashCode4 = (iHashCode3 + (enumC1899960zXe == null ? 0 : enumC1899960zXe.hashCode())) * 31;
        SparkPopup sparkPopup = this.LJII;
        int iHashCode5 = (iHashCode4 + (sparkPopup == null ? 0 : sparkPopup.hashCode())) * 31;
        InterfaceC1141530foN interfaceC1141530foN = this.LJIIIIZZ;
        int iHashCode6 = (iHashCode5 + (interfaceC1141530foN == null ? 0 : interfaceC1141530foN.hashCode())) * 31;
        Function1<? super C991900bv2, Unit> function1 = this.LJIIIZ;
        int iHashCode7 = (((((iHashCode6 + (function1 == null ? 0 : function1.hashCode())) * 31) + this.LJIIJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIJJI)) * 31;
        DynamicDialog dynamicDialog = this.LJIIL;
        int iHashCode8 = (iHashCode7 + (dynamicDialog == null ? 0 : dynamicDialog.hashCode())) * 31;
        InterfaceC1899900zXY interfaceC1899900zXY = this.LJIILIIL;
        return iHashCode8 + (interfaceC1899900zXY != null ? interfaceC1899900zXY.hashCode() : 0);
    }

    public final String toString() {
        return "IncentivePopupSession(scene=" + this.LIZ + ", popupIdentifier=" + this.LIZIZ + ", pageIdentifier=" + this.LIZJ + ", schema=" + this.LIZLLL + ", logExtra=" + this.LJ + ", showImmediately=" + this.LJFF + ", endReason=" + this.LJI + ", sparkPopup=" + this.LJII + ", eventSubscriber=" + this.LJIIIIZZ + ", callback=" + this.LJIIIZ + ", tracker=" + this.LJIIJ + ", hasReceivedShowPopupEvent=" + this.LJIIJJI + ", popupData=" + this.LJIIL + ", managedPopupCallback=" + this.LJIILIIL + ')';
    }

    public C1899950zXd(EnumC1899970zXf enumC1899970zXf, String str, String str2, String str3, Map map, boolean z, Function1 function1, DynamicDialog dynamicDialog, InterfaceC1899900zXY interfaceC1899900zXY, int i) {
        C1900010zXj c1900010zXj;
        function1 = (i & 512) != 0 ? null : function1;
        if ((i & 1024) != 0) {
            c1900010zXj = new C1900010zXj();
        } else {
            c1900010zXj = null;
        }
        dynamicDialog = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : dynamicDialog;
        interfaceC1899900zXY = (i & 8192) != 0 ? null : interfaceC1899900zXY;
        this.LIZ = enumC1899970zXf;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = map;
        this.LJFF = z;
        this.LJI = null;
        this.LJII = null;
        this.LJIIIIZZ = null;
        this.LJIIIZ = function1;
        this.LJIIJ = c1900010zXj;
        this.LJIIJJI = false;
        this.LJIIL = dynamicDialog;
        this.LJIILIIL = interfaceC1899900zXY;
    }
}
