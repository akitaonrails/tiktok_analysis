package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ogc.declaration.page.DateLocationInfo;
import com.ss.android.ugc.aweme.ogc.declaration.page.LocationInfo;
import com.ss.android.ugc.aweme.ogc.declaration.page.PageEnterParams;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.190a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214686190a extends C193N<InterfaceC214688190c, C190T, C10J1> implements InterfaceC214688190c {
    public static final C1420770n4l LLJILLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public static final int LLJJI;
    public final C1618500sDg LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1738600vLO LLJI;
    public final C10J3 LLJIJIL;
    public final Function0<C190T> LLJILJIL;
    public final C10J1 LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C214686190a.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C214686190a.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0)};
        LLJILLL = new C1420770n4l();
        LLJJI = 8;
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
    }

    public final CharSequence O4() {
        C1360520lVa c1360520lVa = new C1360520lVa();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(Z4().getString(2131838657));
        sbLIZ.append(' ');
        c1360520lVa.LIZ.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ));
        c1360520lVa.LJFF(Z4().getString(2131838658), C1697810uHb.LJIIJJI(new ClickableSpan() { // from class: X.190b
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LL.Z4(), this.LL.LLIZ.LIZ);
                smartRouteBuildRoute.withParam("use_spark", true);
                smartRouteBuildRoute.open();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, this.LL.Z4());
                if (numLIZJ != null) {
                    textPaint.setColor(numLIZJ.intValue());
                }
                textPaint.setUnderlineText(false);
            }
        }, new C444920HcY(62, false)));
        return c1360520lVa.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC861810XrP P4() {
        /*
            r7 = this;
            X.0n4l r1 = X.C214686190a.LLJILLL
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r7.d5()
            r1.getClass()
            com.ss.android.ugc.aweme.ogc.declaration.page.DateLocationInfo r0 = X.C1420770n4l.LIZ(r0)
            if (r0 == 0) goto L71
            java.lang.String r6 = r0.getDisplayDate()
            java.lang.String r5 = r0.getDisplayLocation()
            r4 = 1
            r3 = 0
            if (r6 == 0) goto L59
            int r0 = r6.length()
            if (r0 <= 0) goto L43
            if (r5 == 0) goto L41
            int r0 = r5.length()
            if (r0 <= 0) goto L41
            X.19EG r2 = r7.Z4()
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r3] = r6
            r1[r4] = r5
            r0 = 2131838637(0x7f1146ad, float:1.9310503E38)
            java.lang.String r1 = r2.getString(r0, r1)
        L3b:
            X.0XrO r0 = new X.0XrO
            r0.<init>(r1)
            return r0
        L41:
            if (r6 == 0) goto L59
        L43:
            int r0 = r6.length()
            if (r0 <= 0) goto L59
            X.19EG r2 = r7.Z4()
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r6
            r0 = 2131838638(0x7f1146ae, float:1.9310505E38)
            java.lang.String r1 = r2.getString(r0, r1)
            goto L3b
        L59:
            if (r5 == 0) goto L71
            int r0 = r5.length()
            if (r0 <= 0) goto L71
            X.19EG r2 = r7.Z4()
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r5
            r0 = 2131838639(0x7f1146af, float:1.9310507E38)
            java.lang.String r1 = r2.getString(r0, r1)
            goto L3b
        L71:
            java.lang.CharSequence r1 = r7.O4()
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214686190a.P4():X.0XrP");
    }

    public final C19EG Z4() {
        return (C19EG) this.LLJ.getValue(this, LLJJ[1]);
    }

    public final VideoPublishEditModel d5() {
        return (VideoPublishEditModel) this.LLIZLLLIL.getValue(this, LLJJ[0]);
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJILJILJ;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJI;
    }

    @Override // X.C193N
    public C10J3 H4() {
        return this.LLJIJIL;
    }

    public C10J1 T4() {
        return this.LLJILJILJ;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C190T> o2() {
        return this.LLJILJIL;
    }

    public final PageEnterParams K4(VideoPublishEditModel videoPublishEditModel) {
        Long l;
        LLJILLL.getClass();
        DateLocationInfo dateLocationInfoLIZ = C1420770n4l.LIZ(videoPublishEditModel);
        LocationInfo locationInfo = null;
        if (dateLocationInfoLIZ != null) {
            l = dateLocationInfoLIZ.createTime;
            locationInfo = dateLocationInfoLIZ.location;
        } else {
            l = null;
        }
        String creationId = videoPublishEditModel.getCreationId();
        String str = videoPublishEditModel.mShootWay;
        if (str == null) {
            str = "";
        }
        return new PageEnterParams(l, locationInfo, "video_post_page", creationId, str, C1428470nHB.LJJIIZI(videoPublishEditModel), C1428470nHB.LJIILL(videoPublishEditModel), C1428470nHB.LJIILIIL(videoPublishEditModel));
    }

    public C214686190a(C1DRG c1drg, C1618500sDg c1618500sDg) {
        super(c1drg);
        this.LLIZ = c1618500sDg;
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJI = EnumC214771193h.DATE_AND_LOCATION;
        this.LLJIJIL = new C10J3() { // from class: X.193B
            @Override // X.C10J3
            public final void LIZJ() {
            }

            @Override // X.C10J3
            public final InterfaceC214777193n LIZ() {
                return C193G.LIZ;
            }

            @Override // X.C10J3
            public final InterfaceC19223310Il LIZIZ() {
                return C19223210Ik.LIZ;
            }
        };
        this.LLJILJIL = new AwS576S0100000_32(this, 229);
        this.LLJILJILJ = new C10J1(new AwS611S0100000_32(this, 79), null);
    }
}
