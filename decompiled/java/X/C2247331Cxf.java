package X;

import android.content.Context;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Cxf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2247331Cxf {
    public final Context LIZ;
    public C2247351Cxh LIZIZ;
    public final InterfaceC2247471Cxt LIZJ;
    public final Map<String, C2246591CwT> LIZLLL;
    public final HashSet<String> LJ;
    public float LJFF;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public DataSource.ScaleType LJIIJJI;
    public final boolean LJIIL;

    public final void LIZ(String str) {
        float f;
        float f2;
        float[] fArrLIZLLL;
        float[] fArrLIZLLL2;
        if (this.LJ.contains(str)) {
            return;
        }
        C2246591CwT c2246591CwT = (C2246591CwT) ((LinkedHashMap) this.LIZLLL).get(str);
        if (c2246591CwT != null) {
            if (c2246591CwT.LIZLLL != null && c2246591CwT.LIZJ != null) {
                if (c2246591CwT.LIZIZ == 2) {
                    DataSource.ScaleType scaleType = this.LJIIJJI;
                    C2247361Cxi c2247361Cxi = new C2247361Cxi(0.0f, 0.0f, this.LJII, this.LJIIIIZZ);
                    C2247361Cxi c2247361Cxi2 = new C2247361Cxi(0.0f, 0.0f, this.LJIIIZ, this.LJIIJ);
                    switch (C2247531Cxz.LIZ[scaleType.ordinal()]) {
                        case 1:
                            break;
                        case 2:
                            c2247361Cxi2 = c2247361Cxi.LIZJ(c2247361Cxi2, EnumC2247411Cxn.Longer).LIZ(c2247361Cxi2, EnumC2247411Cxn.Shorter, EnumC2247421Cxo.Center);
                            break;
                        case 3:
                            c2247361Cxi2 = c2247361Cxi.LIZJ(c2247361Cxi2, EnumC2247411Cxn.Shorter).LIZ(c2247361Cxi2, EnumC2247411Cxn.Longer, EnumC2247421Cxo.Center);
                            break;
                        case 4:
                            c2247361Cxi2 = c2247361Cxi.LIZJ(c2247361Cxi2, EnumC2247411Cxn.Shorter).LIZ(c2247361Cxi2, EnumC2247411Cxn.Longer, EnumC2247421Cxo.Center).LIZ(c2247361Cxi2, EnumC2247411Cxn.Y, EnumC2247421Cxo.Start);
                            break;
                        case 5:
                            c2247361Cxi2 = c2247361Cxi.LIZJ(c2247361Cxi2, EnumC2247411Cxn.Shorter).LIZ(c2247361Cxi2, EnumC2247411Cxn.Longer, EnumC2247421Cxo.Center).LIZ(c2247361Cxi2, EnumC2247411Cxn.Y, EnumC2247421Cxo.End);
                            break;
                        case 6:
                            c2247361Cxi2 = c2247361Cxi.LIZJ(c2247361Cxi2, EnumC2247411Cxn.Shorter).LIZ(c2247361Cxi2, EnumC2247411Cxn.Longer, EnumC2247421Cxo.Center).LIZ(c2247361Cxi2, EnumC2247411Cxn.X, EnumC2247421Cxo.Start);
                            break;
                        case 7:
                            c2247361Cxi2 = c2247361Cxi.LIZJ(c2247361Cxi2, EnumC2247411Cxn.Shorter).LIZ(c2247361Cxi2, EnumC2247411Cxn.Longer, EnumC2247421Cxo.Center).LIZ(c2247361Cxi2, EnumC2247411Cxn.X, EnumC2247421Cxo.End);
                            break;
                        case 8:
                            c2247361Cxi2 = c2247361Cxi.LIZJ(c2247361Cxi2, EnumC2247411Cxn.X).LIZ(c2247361Cxi2, EnumC2247411Cxn.Y, EnumC2247421Cxo.Start);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2247361Cxi2 = c2247361Cxi.LIZJ(c2247361Cxi2, EnumC2247411Cxn.X).LIZ(c2247361Cxi2, EnumC2247411Cxn.Y, EnumC2247421Cxo.End);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2247361Cxi2 = c2247361Cxi.LIZJ(c2247361Cxi2, EnumC2247411Cxn.Y).LIZ(c2247361Cxi2, EnumC2247411Cxn.X, EnumC2247421Cxo.Start);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c2247361Cxi2 = c2247361Cxi.LIZJ(c2247361Cxi2, EnumC2247411Cxn.Y).LIZ(c2247361Cxi2, EnumC2247411Cxn.X, EnumC2247421Cxo.End);
                            break;
                        default:
                            throw new C1954807lC();
                    }
                    C2247361Cxi c2247361CxiLJ = c2247361Cxi2.LJ(this.LJIIIZ, this.LJIIJ);
                    float f3 = 2;
                    float f4 = (c2247361CxiLJ.LIZ - 0.5f) * f3;
                    float f5 = c2247361CxiLJ.LIZIZ;
                    float f6 = c2247361CxiLJ.LIZLLL;
                    C2247361Cxi c2247361Cxi3 = new C2247361Cxi(f4, (-((f5 + f6) - 0.5f)) * f3, c2247361CxiLJ.LIZJ * f3, f6 * f3);
                    String str2 = c2246591CwT.LJ;
                    if (str2 != null && (fArrLIZLLL2 = this.LIZJ.LIZLLL(str2)) != null) {
                        f = fArrLIZLLL2[0];
                    } else {
                        f = 0.0f;
                    }
                    String str3 = c2246591CwT.LJFF;
                    if (str3 != null && (fArrLIZLLL = this.LIZJ.LIZLLL(str3)) != null) {
                        f2 = fArrLIZLLL[1];
                    } else {
                        f2 = 0.0f;
                    }
                    C2247361Cxi c2247361CxiLIZLLL = c2247361Cxi3.LIZLLL(f, f2);
                    if (this.LJIIL) {
                        if (c2246591CwT.LJII) {
                            float f7 = c2247361CxiLIZLLL.LIZ;
                            c2247361CxiLIZLLL = c2247361CxiLIZLLL.LJI(((f7 + f7) + c2247361CxiLIZLLL.LIZJ) / f3);
                        }
                        if (c2246591CwT.LJI) {
                            C2247361Cxi c2247361CxiLJI = c2247361CxiLIZLLL.LJI(0.0f);
                            float f8 = c2247361CxiLJI.LIZ;
                            c2247361CxiLIZLLL = c2247361CxiLJI.LJI(((f8 + f8) + c2247361CxiLJI.LIZJ) / f3);
                        }
                    }
                    this.LIZIZ.LIZ(c2247361CxiLIZLLL, C2247441Cxq.LIZ(c2246591CwT.LIZJ, false).LJ(this.LJFF, this.LJI), C2247441Cxq.LIZ(c2246591CwT.LIZLLL, false).LJ(this.LJFF, this.LJI));
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("layer ");
                sbLIZ.append((Object) c2246591CwT.LIZ);
                sbLIZ.append(" is not a video layer");
                throw new C21590319eX(C2188811AlT.LIZIZ(sbLIZ), null);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("rgb area or alpha area is null: rgbArea=");
            sbLIZ2.append(c2246591CwT.LIZJ);
            sbLIZ2.append(", alphaArea=");
            sbLIZ2.append(c2246591CwT.LIZLLL);
            throw new C21590319eX(C2188811AlT.LIZIZ(sbLIZ2), null);
        }
        throw new C21590319eX(Intrinsics.LJIIJJI(str, "no such layer: layerName="), null);
    }

    public C2247331Cxf(Context context, List<C2246591CwT> list, C2247351Cxh c2247351Cxh, InterfaceC2247471Cxt interfaceC2247471Cxt) {
        String str;
        this.LIZ = context;
        this.LIZIZ = c2247351Cxh;
        this.LIZJ = interfaceC2247471Cxt;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C2246591CwT c2246591CwT : list) {
            linkedHashMap.put(c2246591CwT.LIZ, c2246591CwT);
        }
        this.LIZLLL = linkedHashMap;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            C2246581CwS c2246581CwS = ((C2246591CwT) ((Map.Entry) it2.next()).getValue()).LJIIIIZZ;
            if (c2246581CwS == null) {
                str = null;
            } else {
                str = c2246581CwS.LJIIJJI;
            }
            arrayList.add(str);
        }
        this.LJ = C13LP.LLIFFJFJJ(C13LP.LJJJJLI(arrayList));
        this.LJIIJJI = DataSource.ScaleType.ScaleToFill;
        this.LJIIL = C726770Sf5.LIZ(this.LIZ);
    }
}
