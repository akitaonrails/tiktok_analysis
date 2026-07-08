package X;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.android.editor.track.TrackShowType;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EeN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C369610EeN extends C369590EeL {
    public final C19EG LJIILJJIL;
    public final float LJIILL = 0.3f;
    public Integer LJIILLIIL;
    public final int LJIIZILJ;
    public final ContextThemeWrapper LJIJ;
    public final int LJIJI;
    public final int LJIJJ;
    public int LJIJJLI;
    public final ArrayList<PointF> LJIL;
    public final ArrayList<PointF> LJJ;
    public final Paint LJJI;
    public final C01GW LJJIFFI;
    public final Path LJJII;
    public final C01GW LJJIII;
    public final ArrayList<PointF> LJJIIJ;
    public final ArrayList<PointF> LJJIIJZLJL;
    public final C01GW LJJIIZ;
    public final C13E8<C369620EeO> LJJIIZI;
    public float LJJIJ;
    public int LJJIJIIJI;
    public float LJJIJIIJIL;
    public final C01GW LJJIJIL;
    public final int LJJIJL;
    public final double LJJIJLIJ;
    public C0E5S LJJIL;

    @Override // X.C369590EeL, X.InterfaceC367710EbJ
    public final void LIZ() {
        this.LJJIIZI.clear();
    }

    public int LJIIJ() {
        LiveState<TrackShowType> liveStateQ82;
        C0E5S c0e5s = this.LJJIL;
        return ((c0e5s == null || (liveStateQ82 = c0e5s.Q82()) == null) ? null : liveStateQ82.LIZJ()) == TrackShowType.NORMAL ? C0FU0.LIZ(10.0f) : C0FU0.LIZ(14.0f);
    }

    public final boolean LJIIJJI() {
        return ((Boolean) this.LJJIJIL.getValue()).booleanValue();
    }

    public C369610EeN(C19EG c19eg) {
        int iLIZ;
        this.LJIILJJIL = c19eg;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e6, c19eg);
        if (numLIZJ != null) {
            iLIZ = numLIZJ.intValue();
        } else {
            iLIZ = C960203pA.LIZ(R.attr.e4, c19eg);
        }
        this.LJIILLIIL = Integer.valueOf(iLIZ);
        this.LJIIZILJ = C960203pA.LIZ(R.attr.ny, c19eg);
        this.LJIJ = new ContextThemeWrapper(c19eg, R.style.y0);
        this.LJIJI = C0FU0.LIZ(7.0f);
        this.LJIJJ = C0FU0.LIZ(2.0f);
        this.LJIJJLI = C0FU0.LIZ(11.0f);
        this.LJIL = new ArrayList<>();
        this.LJJ = new ArrayList<>();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.LJJI = paint;
        this.LJJIFFI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 400));
        this.LJJII = new Path();
        this.LJJIII = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(125));
        this.LJJIIJ = new ArrayList<>();
        this.LJJIIJZLJL = new ArrayList<>();
        this.LJJIIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(126));
        this.LJJIIZI = new C13E8<>();
        this.LJJIJ = C360610EBv.LIZJ();
        this.LJJIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 401));
        this.LJJIJL = C0FU0.LIZ(2.0f);
        this.LJJIJLIJ = 0.5d;
    }

    public final void LJI(ArrayList arrayList, List list) {
        arrayList.clear();
        if (list.size() <= 1) {
            return;
        }
        Iterator it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            int i2 = i + 1;
            PointF pointF = (PointF) it2.next();
            if (i == 0) {
                PointF pointF2 = (PointF) ListProtector.get(list, i2);
                float f = pointF.x;
                arrayList.add(new PointF(f + ((pointF2.x - f) * this.LJIILL), pointF.y));
            } else if (i == list.size() - 1) {
                PointF pointF3 = (PointF) ListProtector.get(list, i - 1);
                float f2 = pointF.x;
                arrayList.add(new PointF(f2 - ((f2 - pointF3.x) * this.LJIILL), pointF.y));
            } else {
                PointF pointF4 = (PointF) ListProtector.get(list, i - 1);
                PointF pointF5 = (PointF) ListProtector.get(list, i2);
                float f3 = pointF5.y - pointF4.y;
                float f4 = pointF5.x;
                float f5 = pointF4.x;
                float f6 = f3 / (f4 - f5);
                float f7 = pointF.y;
                float f8 = pointF.x;
                float f9 = f7 - (f6 * f8);
                float f10 = f8 - ((f8 - f5) * this.LJIILL);
                arrayList.add(new PointF(f10, (f6 * f10) + f9));
                float f11 = pointF.x;
                float f12 = f11 + ((pointF5.x - f11) * this.LJIILL);
                arrayList.add(new PointF(f12, (f6 * f12) + f9));
            }
            i = i2;
        }
    }

    @Override // X.C369590EeL, X.InterfaceC367710EbJ
    public final void LIZJ(Canvas canvas, RectF rectF, RectF rectF2, float f) {
        float fLIZIZ = rectF.left - C418440Gaw.LIZIZ(2);
        float f2 = rectF2.left;
        if (fLIZIZ < f2) {
            fLIZIZ = f2;
        }
        rectF.left = fLIZIZ;
        float fLIZIZ2 = rectF.right + C418440Gaw.LIZIZ(2);
        float f3 = rectF2.right;
        if (fLIZIZ2 > f3) {
            fLIZIZ2 = f3;
        }
        rectF.right = fLIZIZ2;
        ((Paint) this.LJJIFFI.getValue()).setPathEffect(new DashPathEffect(new float[]{C418440Gaw.LIZIZ(2), C418440Gaw.LIZIZ(2)}, 0.0f));
        canvas.drawRoundRect(rectF, f, f, (Paint) this.LJJIFFI.getValue());
    }

    public float LJII(float f, long j, float f2, EnumC367660EbE enumC367660EbE) {
        float f3;
        if (LJIIJJI()) {
            return f - (((j * f2) - this.LJFF) / this.LJII);
        }
        float f4 = j * f2;
        if (enumC367660EbE == EnumC367660EbE.TEXT_TO_SPEECH) {
            f3 = this.LJFF;
        } else {
            f3 = this.LJ;
        }
        return (f4 - f3) / this.LJII;
    }

    public static void LJIIIIZZ(Path path, float f, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        path.reset();
        if (z) {
            f--;
        }
        PointF pointF = (PointF) C13LP.LJJJJZI(arrayList);
        path.moveTo(pointF.x, f);
        path.lineTo(pointF.x, pointF.y);
        C1846520y9S c1846520y9SLJIILIIL = C13LZ.LJIILIIL(C13LZ.LJIILJJIL(0, (arrayList.size() * 2) - 2), 2);
        int i = c1846520y9SLJIILIIL.LL;
        int i2 = c1846520y9SLJIILIIL.LLILLJJLI;
        int i3 = c1846520y9SLJIILIIL.LLILLL;
        if (i3 <= 0 ? !(i3 >= 0 || i2 > i) : i <= i2) {
            while (true) {
                PointF pointF2 = (PointF) ListProtector.get(arrayList2, i);
                PointF pointF3 = (PointF) ListProtector.get(arrayList2, i + 1);
                PointF pointF4 = (PointF) ListProtector.get(arrayList, (i / 2) + 1);
                path.cubicTo(pointF2.x, pointF2.y, pointF3.x, pointF3.y, pointF4.x, pointF4.y);
                if (i == i2) {
                    break;
                } else {
                    i += i3;
                }
            }
        }
        PointF pointF5 = (PointF) C13LP.LJJLIIIJJI(arrayList);
        path.lineTo(pointF5.x, f);
        path.lineTo(pointF.x, f);
        path.setLastPoint(pointF5.x, f);
    }

    @Override // X.C369590EeL, X.InterfaceC367710EbJ
    public void LJ(Canvas canvas, RectF rectF, List<Integer> list, float f, float f2) {
        float f3;
        this.LJJI.setStyle(Paint.Style.FILL);
        this.LJJI.setColor(this.LJIIZILJ);
        Iterator<Integer> it2 = list.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            if (this.LJII != 0.0f) {
                if (LJIIJJI()) {
                    f3 = f2 - (((iIntValue * f) - this.LJFF) / this.LJII);
                } else {
                    f3 = ((((iIntValue + this.LJIIIIZZ) - this.LJIIIZ) * f) - this.LJI) / this.LJII;
                }
                canvas.drawCircle(f3, rectF.bottom - this.LJIJI, this.LJIJJ, this.LJJI);
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0102 -> B:38:0x00de). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0186 -> B:64:0x0162). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:39:0x00e0
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // X.C369590EeL, X.InterfaceC367710EbJ
    public final void LIZLLL(android.graphics.Canvas r32, android.graphics.RectF r33, java.util.List r34, float r35, X.EnumC367660EbE r36, float r37) {
        /*
            Method dump skipped, instruction units count: 1020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C369610EeN.LIZLLL(android.graphics.Canvas, android.graphics.RectF, java.util.List, float, X.0EbE, float):void");
    }

    public static final C369620EeO LJIIIZ(float f, float f2, float f3, C369610EeN c369610EeN, int i, float f4, float f5) {
        float f6 = f4 / f3;
        return new C369620EeO(i, new PointF(f5, f + (Math.min(f6, 1.0f) * c369610EeN.LJIJJLI)), new PointF(f5, (f - f2) - (Math.min(f6, 1.0f) * c369610EeN.LJIJJLI)));
    }
}
