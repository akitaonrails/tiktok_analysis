package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapPinInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gkA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1177360gkA extends FrameLayout {
    public final TuxIconDrawable LL;
    public final ViewGroup LLILLJJLI;

    public C1177360gkA(Context context) {
        super(context, null);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_star_fill;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c419910GdJ.LJ = Integer.valueOf(R.attr.ny);
        this.LL = c419910GdJ.LIZ(context);
        C786410Ut5.Sd(R.layout.e4_, C786410Ut5.ne(context), this);
        this.LLILLJJLI = (ViewGroup) findViewById(R.id.cxs);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public static EnumC1177490gkN LIZ(PoiGeneralCard poiGeneralCard) {
        PoiMapPinInfo poiMapPinInfo = poiGeneralCard.getPoiMapPinInfo();
        if (poiMapPinInfo != null && poiMapPinInfo.getPinType() != null && poiGeneralCard.getPoiMapPinInfo().getPinType() != EnumC1177370gkB.NONE) {
            return EnumC1177490gkN.FALLBACK_MARKER_28_PX;
        }
        return EnumC1177490gkN.FALLBACK_MARKER_20_PX;
    }

    public static boolean LIZIZ(PoiGeneralCard poiGeneralCard) {
        if (!Intrinsics.LJFF(poiGeneralCard.getNoRating(), Boolean.TRUE) && C123100dR.LIZ(poiGeneralCard.getReviewScore()) && !Intrinsics.LJFF(poiGeneralCard.getReviewScore(), CardStruct.IStatusCode.DEFAULT) && !Intrinsics.LJFF(poiGeneralCard.getReviewScore(), "0.0")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[PHI: r4
      0x004f: PHI (r4v5 java.lang.String) = (r4v2 java.lang.String), (r4v1 java.lang.String) binds: [B:17:0x004d, B:15:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard r14, X.InterfaceC1364105Vn r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof X.C1177350gk9
            if (r0 == 0) goto L8b
            r12 = r15
            X.0gk9 r12 = (X.C1177350gk9) r12
            int r2 = r12.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8b
            int r2 = r2 - r1
            r12.LLILZ = r2
        L12:
            java.lang.Object r4 = r12.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r12.LLILZ
            r3 = 1
            if (r0 == 0) goto L2c
            if (r0 != r3) goto L91
            com.bytedance.lighten.loader.SmartImageView r1 = r12.LL
            X.C155000ia.LIZIZ(r4)
        L24:
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4
            r1.setImageDrawable(r4)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            X.C155000ia.LIZIZ(r4)
            r0 = 2131381126(0x7f0a4b86, float:1.838256E38)
            android.view.View r1 = r13.findViewById(r0)
            com.bytedance.lighten.loader.SmartImageView r1 = (com.bytedance.lighten.loader.SmartImageView) r1
            java.lang.String r4 = r14.getPoiCropHeadImg()
            boolean r0 = X.C123100dR.LIZ(r4)
            r6 = 0
            if (r0 == 0) goto L45
            if (r4 != 0) goto L4f
        L45:
            java.lang.String r4 = r14.getCoverImg()
            boolean r0 = X.C123100dR.LIZ(r4)
            if (r0 == 0) goto L50
        L4f:
            r6 = r4
        L50:
            android.content.Context r5 = r13.getContext()
            if (r6 != 0) goto L58
            java.lang.String r6 = ""
        L58:
            int r7 = r1.getMeasuredWidth()
            int r8 = r1.getMeasuredHeight()
            X.0gkN r4 = LIZ(r14)
            X.0gkN r0 = X.EnumC1177490gkN.FALLBACK_MARKER_20_PX
            if (r4 != r0) goto L80
            r0 = 10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r9 = X.C418440Gaw.LIZIZ(r0)
        L72:
            java.lang.String r10 = "poi_detail"
            r12.LL = r1
            r12.LLILZ = r3
            r11 = 0
            java.lang.Object r4 = X.C1180680gpW.LIZIZ(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r4 != r2) goto L24
            return r2
        L80:
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r9 = X.C418440Gaw.LIZIZ(r0)
            goto L72
        L8b:
            X.0gk9 r12 = new X.0gk9
            r12.<init>(r13, r15)
            goto L12
        L91:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1177360gkA.LIZLLL(com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1177360gkA.LIZJ(com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard, boolean, boolean):void");
    }
}
