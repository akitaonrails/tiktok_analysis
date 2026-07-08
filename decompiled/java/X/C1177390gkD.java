package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.poi.mapdetail.model.HotelShelfInfo;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: renamed from: X.0gkD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1177390gkD {
    public final Context LIZ;
    public final C1177460gkK LIZIZ;
    public final InterfaceC383701eN LIZJ;
    public final Function1<C1177000gja, Boolean> LIZLLL;
    public final InterfaceC1176890gjP LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;

    public final View LIZLLL() {
        return (View) this.LJIIIIZZ.getValue();
    }

    public final View LJ() {
        return (View) this.LJI.getValue();
    }

    public final View LJFF() {
        return (View) this.LJII.getValue();
    }

    public final View LJI() {
        return (View) this.LJIIIZ.getValue();
    }

    public final Object LIZJ(String str, C1177450gkJ c1177450gkJ) {
        boolean z = true;
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c1177450gkJ));
        c2252611DEt.LJIJJ();
        if (str != null && str.length() != 0) {
            z = false;
        }
        if (z) {
            if (c2252611DEt.isActive()) {
                C189200o6.m2constructorimpl(null);
                c2252611DEt.resumeWith(null);
            }
        } else {
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = C418440Gaw.LIZIZ(C2286608xc.LJ(8));
            c1331750klB.LJII = EnumC1203020hPY.BITMAP_ONLY;
            C1189360h3W c1189360h3WLIZIZ = new C1180600gpO("poi_map_detail", "poi_marker", null).LIZIZ(str);
            c1189360h3WLIZIZ.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(20))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(20))));
            C1331730kl9 c1331730kl9 = new C1331730kl9(c1331750klB);
            C1331670kl3 c1331670kl3 = c1189360h3WLIZIZ.LIZ;
            c1331670kl3.LJJI = c1331730kl9;
            c1331670kl3.LJJIII = EnumC1334360kpO.HIGH;
            c1189360h3WLIZIZ.LJ(new C1208990hZB(c2252611DEt, this, 0));
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c1177450gkJ);
        }
        return objLJIJ;
    }

    public final C1177360gkA LJII(PoiGeneralCard poiGeneralCard, boolean z) {
        C1177360gkA c1177360gkA = new C1177360gkA(this.LIZ);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1177360gkA);
        c1177360gkA.setLayoutParams(layoutParams);
        c1177360gkA.setLayoutDirection(3);
        c1177360gkA.LIZJ(poiGeneralCard, z, true);
        return c1177360gkA;
    }

    public final View LJIIIIZZ(PoiGeneralCard poiGeneralCard, boolean z) {
        String str;
        LJ().setLayoutDirection(3);
        TextView textView = (TextView) LJ().findViewById(R.id.o0c);
        textView.setText(poiGeneralCard.getPoiName());
        Integer numLIZLLL = C1180680gpW.LIZLLL(this.LIZ, R.attr.a1h, z);
        if (numLIZLLL != null) {
            textView.setTextColor(numLIZLLL.intValue());
        }
        TextView textView2 = (TextView) LJ().findViewById(R.id.o0_);
        C339190DRl.LIZLLL(textView2);
        Integer numLIZLLL2 = C1180680gpW.LIZLLL(textView2.getContext(), R.attr.a1h, z);
        if (numLIZLLL2 != null) {
            textView2.setTextColor(numLIZLLL2.intValue());
        }
        TextView textView3 = (TextView) LJ().findViewById(R.id.o09);
        C339190DRl.LIZLLL(textView3);
        HotelShelfInfo hotelShelfInfo = poiGeneralCard.getHotelShelfInfo();
        if (hotelShelfInfo != null) {
            str = hotelShelfInfo.readableShelfMinPrice;
        } else {
            str = null;
        }
        textView3.setText(str);
        Integer numLIZLLL3 = C1180680gpW.LIZLLL(textView3.getContext(), R.attr.a1h, z);
        if (numLIZLLL3 != null) {
            textView3.setTextColor(numLIZLLL3.intValue());
        }
        if ((C960203pA.LIZIZ(this.LIZ) && !z) || (!C960203pA.LIZIZ(this.LIZ) && z)) {
            View viewFindViewById = LJ().findViewById(R.id.cxs);
            if (viewFindViewById != null) {
                viewFindViewById.setBackground(C14MI.LIZ(this.LIZ, R.drawable.cus));
            }
        } else {
            View viewFindViewById2 = LJ().findViewById(R.id.cxs);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setBackground(C14MI.LIZ(this.LIZ, R.drawable.cut));
            }
        }
        C1180060goW.LJIILIIL(LJ());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("renderHotelBigMarkerUi,width:");
        sbLIZ.append(LJ().getMeasuredWidth());
        sbLIZ.append(", height:");
        sbLIZ.append(LJ().getMeasuredHeight());
        C2188811AlT.LIZIZ(sbLIZ);
        return LJ();
    }

    public final View LJIIIZ(PoiGeneralCard poiGeneralCard, boolean z) {
        LJFF().setLayoutDirection(3);
        TextView textView = (TextView) LJFF().findViewById(R.id.o0c);
        textView.setText(poiGeneralCard.getPoiName());
        Integer numLIZLLL = C1180680gpW.LIZLLL(this.LIZ, R.attr.a1h, z);
        if (numLIZLLL != null) {
            textView.setTextColor(numLIZLLL.intValue());
        }
        if ((C960203pA.LIZIZ(this.LIZ) && !z) || (!C960203pA.LIZIZ(this.LIZ) && z)) {
            View viewFindViewById = LJFF().findViewById(R.id.cxs);
            if (viewFindViewById != null) {
                viewFindViewById.setBackground(C14MI.LIZ(this.LIZ, R.drawable.cuu));
            }
        } else {
            View viewFindViewById2 = LJFF().findViewById(R.id.cxs);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setBackground(C14MI.LIZ(this.LIZ, R.drawable.cuv));
            }
        }
        C1180060goW.LJIILIIL(LJFF());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("renderHotelMiddleMarkerUi,width:");
        sbLIZ.append(LJFF().getMeasuredWidth());
        sbLIZ.append(", height:");
        sbLIZ.append(LJFF().getMeasuredHeight());
        C2188811AlT.LIZIZ(sbLIZ);
        return LJFF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0gkD] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C1176630giz r8, boolean r9, X.InterfaceC1364105Vn<? super X.C1177000gja> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C1177470gkL
            if (r0 == 0) goto L28
            r6 = r10
            X.0gkL r6 = (X.C1177470gkL) r6
            int r2 = r6.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r6.LLILZLL = r2
        L12:
            java.lang.Object r5 = r6.LLILZ
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r6.LLILZLL
            r3 = 0
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L42
            if (r1 == r0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r1 = r6.LL
            X.01eN r1 = (X.InterfaceC383701eN) r1
            goto L63
        L28:
            X.0gkL r6 = new X.0gkL
            r6.<init>(r7, r10)
            goto L12
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            boolean r9 = r6.LLILLL
            X.01eN r1 = r6.LLILLJJLI
            java.lang.Object r8 = r6.LL
            X.0giz r8 = (X.C1176630giz) r8
            X.C155000ia.LIZIZ(r5)
            goto L56
        L42:
            X.C155000ia.LIZIZ(r5)
            X.01eN r1 = r7.LIZJ
            r6.LL = r8
            r6.LLILLJJLI = r1
            r6.LLILLL = r9
            r6.LLILZLL = r0
            java.lang.Object r0 = r1.LIZLLL(r3, r6)
            if (r0 != r4) goto L56
            return r4
        L56:
            r6.LL = r1     // Catch: java.lang.Throwable -> L73
            r6.LLILLJJLI = r3     // Catch: java.lang.Throwable -> L73
            r6.LLILZLL = r2     // Catch: java.lang.Throwable -> L73
            java.lang.Object r5 = r7.LJIIJ(r8, r9, r6)     // Catch: java.lang.Throwable -> L73
            if (r5 != r4) goto L66
            return r4
        L63:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Throwable -> L73
        L66:
            X.0gja r5 = (X.C1177000gja) r5     // Catch: java.lang.Throwable -> L73
            kotlin.coroutines.CoroutineContext r0 = r6.getContext()     // Catch: java.lang.Throwable -> L73
            X.C23118094a.LJI(r0)     // Catch: java.lang.Throwable -> L73
            r1.LIZIZ(r3)
            return r5
        L73:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L73
            r1.LIZIZ(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1177390gkD.LIZIZ(X.0giz, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0603 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0253  */
    /* JADX WARN: Type inference failed for: r10v16, types: [T, X.0gja] */
    /* JADX WARN: Type inference failed for: r11v23, types: [T, X.0gja] */
    /* JADX WARN: Type inference failed for: r13v12, types: [T, X.0gja] */
    /* JADX WARN: Type inference failed for: r14v0, types: [T, X.0gja] */
    /* JADX WARN: Type inference failed for: r15v0, types: [T, X.0gja] */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, X.0gja] */
    /* JADX WARN: Type inference failed for: r8v3, types: [T, X.0gja] */
    /* JADX WARN: Type inference failed for: r9v50, types: [T, X.0gja] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.C1176630giz r29, boolean r30, X.InterfaceC1364105Vn<? super X.C1177000gja> r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1177390gkD.LJIIJ(X.0giz, boolean, X.05Vn):java.lang.Object");
    }

    public C1177390gkD(Context context, C1177460gkK c1177460gkK, C1DEV c1dev, AwS597S0100000_18 awS597S0100000_18) {
        this.LIZ = context;
        this.LIZIZ = c1177460gkK;
        this.LIZJ = c1dev;
        this.LIZLLL = awS597S0100000_18;
        C1180740gpc.LIZ.getClass();
        this.LJ = C1180740gpc.LIZ().LIZLLL();
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LJFF = C452501pT.LIZ(enumC452301pR, new AwS560S0100000_16(this, 673));
        this.LJI = C452501pT.LIZ(enumC452301pR, new AwS560S0100000_16(this, 671));
        this.LJII = C452501pT.LIZ(enumC452301pR, new AwS560S0100000_16(this, 672));
        this.LJIIIIZZ = C452501pT.LIZ(enumC452301pR, new AwS560S0100000_16(this, 670));
        this.LJIIIZ = C452501pT.LIZ(enumC452301pR, new AwS560S0100000_16(this, 674));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x039b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015f  */
    /* JADX WARN: Type inference failed for: r0v109, types: [T, android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v16, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C1176630giz r26, X.C1177000gja r27, boolean r28, boolean r29, X.InterfaceC1364105Vn<? super kotlin.Pair<android.graphics.Bitmap, java.lang.Boolean>> r30) {
        /*
            Method dump skipped, instruction units count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1177390gkD.LIZ(X.0giz, X.0gja, boolean, boolean, X.05Vn):java.lang.Object");
    }
}
