package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12CI, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12CI {
    public final Context LIZ;
    public final View LIZIZ;
    public final List<SingleImageData> LIZJ;
    public final C054G LIZLLL;
    public long LJ;
    public final ConcurrentHashMap<String, Boolean> LJFF;
    public final ConcurrentHashMap<String, Boolean> LJI;
    public final C01GW LJII;
    public int LJIIIIZZ;
    public float LJIIIZ;

    public final String LIZJ(int i) {
        Uri uriLIZLLL = LIZLLL(i);
        if (uriLIZLLL == null) {
            return null;
        }
        return uriLIZLLL.toString();
    }

    public final Uri LIZLLL(int i) {
        SingleImageData singleImageData = (SingleImageData) C13LP.LJJJLZIJ(i, this.LIZJ);
        if (singleImageData == null) {
            return null;
        }
        String synthesisPathAsPossible = singleImageData.getSynthesisPathAsPossible();
        if (C2471909mP.LJJIIZI(synthesisPathAsPossible)) {
            return UriProtector.parse(synthesisPathAsPossible);
        }
        return Uri.fromFile(new C0VSJ(synthesisPathAsPossible));
    }

    public final boolean LJ(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return Intrinsics.LJFF(this.LJI.get(str), Boolean.TRUE);
    }

    public final Object LIZIZ(int i, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        Uri uriLIZLLL = LIZLLL(i);
        if (uriLIZLLL == null) {
            return null;
        }
        C1325710kbR c1325710kbRLIZ = C1325710kbR.LIZ(uriLIZLLL);
        C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        final InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSYLJI = c1325540kbALIZ.LJI(c1325710kbRLIZ, this.LIZ);
        c2252611DEt.LJJII(new AwS585S0100000_6(interfaceC1320200kSYLJI, (InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>>) 393));
        ((AbstractC1321260kUG) interfaceC1320200kSYLJI).LIZJ(new AbstractC447090Hg3() { // from class: X.0Hg9
            @Override // X.C0HWE
            public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                if (!c2252611DEt.isActive()) {
                    interfaceC1320200kSY.close();
                    return;
                }
                interfaceC1320200kSY.close();
                InterfaceC20236714Gf<Bitmap> interfaceC20236714Gf = c2252611DEt;
                C189200o6.m2constructorimpl(null);
                interfaceC20236714Gf.resumeWith(null);
            }

            @Override // X.AbstractC447090Hg3
            public final void LJI(Bitmap bitmap) {
                if (!c2252611DEt.isActive()) {
                    interfaceC1320200kSYLJI.close();
                    return;
                }
                Bitmap bitmapCopy = null;
                if (bitmap != null) {
                    try {
                        Bitmap.Config config = bitmap.getConfig();
                        if (config == null) {
                            config = Bitmap.Config.RGB_565;
                        }
                        bitmapCopy = bitmap.copy(config, false);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                interfaceC1320200kSYLJI.close();
                InterfaceC20236714Gf<Bitmap> interfaceC20236714Gf = c2252611DEt;
                C189200o6.m2constructorimpl(bitmapCopy);
                interfaceC20236714Gf.resumeWith(bitmapCopy);
            }
        }, C822700WPc.LL);
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public final void LJFF(float f, int i) {
        C12CL c12cl;
        C19715112Bp c19715112Bp = C19714812Bm.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateExtractColor ");
        sbLIZ.append(i);
        sbLIZ.append(' ');
        sbLIZ.append(f);
        C19714812Bm.LIZ("BGColor", C2188811AlT.LIZIZ(sbLIZ));
        if (i >= 0 && i < this.LIZJ.size()) {
            this.LJIIIIZZ = i;
            this.LJIIIZ = f;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.LJ;
            if (f != 0.0f && f != 1.0f && j < 16) {
                return;
            }
            this.LJ = jCurrentTimeMillis;
            if (C0SKM.LJFF() || C0SKP.LIZIZ()) {
                c12cl = C12CN.LIZ;
            } else {
                c12cl = C12CK.LIZ;
            }
            String strLIZJ = LIZJ(i);
            int i2 = i + 1;
            String strLIZJ2 = LIZJ(i2);
            LIZ(i, strLIZJ, c12cl);
            LIZ(i2, strLIZJ2, c12cl);
            Object value = this.LJII.getValue();
            boolean zLJ = LJ(strLIZJ);
            boolean zLJ2 = LJ(strLIZJ2);
            value.getClass();
            C0SKU c0skuLJ = C12CT.LJ(strLIZJ, strLIZJ2, zLJ, f, zLJ2);
            if (c0skuLJ != null) {
                this.LIZIZ.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{c0skuLJ.LIZ, c0skuLJ.LIZIZ}));
            }
        }
    }

    public C12CI(Context context, View view, List list) {
        this.LIZ = context;
        this.LIZIZ = view;
        this.LIZJ = list;
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LIZLLL = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII()));
        this.LJFF = new ConcurrentHashMap<>();
        this.LJI = new ConcurrentHashMap<>();
        this.LJII = C452501pT.LIZ(EnumC452301pR.NONE, AFwS198S0000000_11.get$arr$(494));
    }

    public final void LIZ(int i, String str, C12CL c12cl) {
        C19715112Bp c19715112Bp = C19714812Bm.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ensureExtracted index:");
        sbLIZ.append(i);
        C19714812Bm.LIZ("BGColor", C2188811AlT.LIZIZ(sbLIZ));
        if (i < 0 || i >= this.LIZJ.size() || str == null || str.length() == 0 || LJ(str) || this.LJFF.containsKey(str)) {
            return;
        }
        this.LJFF.put(str, Boolean.TRUE);
        C23250099c.LIZLLL(this.LIZLLL, null, null, new C12CJ(this, i, str, c12cl, null), 3);
    }
}
