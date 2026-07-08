package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import java.util.HashMap;
import kotlin.jvm.internal.AwS560S0100000_16;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cU6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1013640cU6 {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final Aweme LIZ;
    public final InterfaceC1008930cMV LIZIZ;
    public volatile boolean LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 1046));
    public C0RAO LJ;
    public C0RAB LJFF;
    public int LJI;
    public float LJII;

    public final void LIZJ(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("index", i);
            InterfaceC1008930cMV interfaceC1008930cMV = this.LIZIZ;
            if (interfaceC1008930cMV != null) {
                interfaceC1008930cMV.LJIILL(new C0SCL(jSONObject));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("send index =");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZLLL(long j) {
        int i;
        C1002470cC5 c1002470cC5 = (C1002470cC5) this.LIZLLL.getValue();
        if (c1002470cC5 != null) {
            C0RAB c0rab = this.LJFF;
            if (c0rab != null) {
                i = c0rab.videoLengthSum;
            } else {
                i = 0;
            }
            long j2 = i;
            try {
                AwemeRawAd awemeRawAd = c1002470cC5.LIZ.getAwemeRawAd();
                HashMap map = new HashMap();
                map.put("video_length", Long.valueOf(j2));
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "play", awemeRawAd);
                c1022820ciuLIZLLL.LIZJ(Long.valueOf(j2), "video_length");
                c1022820ciuLIZLLL.LIZIZ(Long.valueOf(j), "play_order");
                c1022820ciuLIZLLL.LIZIZ(Float.valueOf(C1024180cl6.LIZ()), "playervol");
                c1022820ciuLIZLLL.LIZIZ(C1002470cC5.LJJIIZ(c1002470cC5.LIZ), "bsh_video_id");
                c1022820ciuLIZLLL.LIZ(map);
                if (AwemeExtKt.isPseudoAd(c1002470cC5.LIZ)) {
                    C2264031DjV.LIZ.getClass();
                    c1022820ciuLIZLLL.LIZIZ("1", C2264031DjV.LIZIZ.LIZ);
                }
                c1022820ciuLIZLLL.LJIIIIZZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public C1013640cU6(Aweme aweme, InterfaceC1008930cMV interfaceC1008930cMV) {
        this.LIZ = aweme;
        this.LIZIZ = interfaceC1008930cMV;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(final android.view.ViewGroup r11, final X.C1322110kVd r12, boolean r13) {
        /*
            r10 = this;
            r7 = r11
            if (r7 != 0) goto L4
            return
        L4:
            r5 = r12
            if (r5 != 0) goto L8
            return
        L8:
            r6 = r10
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LIZ
            if (r0 == 0) goto L57
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L57
            com.ss.android.ugc.aweme.commercialize.model.AnoleModel r0 = r0.getAnoleModel()
            if (r0 == 0) goto L57
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel> r1 = r0.components
            if (r1 == 0) goto L57
            X.0cMU r0 = X.EnumC1008920cMU.MULTI_CONTENT
            java.lang.String r0 = r0.getType()
            java.lang.Object r3 = r1.get(r0)
            com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel r3 = (com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel) r3
            if (r3 == 0) goto L57
            X.04rF r0 = X.C1227904rF.LIZ
            r0.getClass()
            com.google.gson.Gson r2 = X.C1227904rF.LIZLLL()
            java.lang.Class<com.ss.android.ugc.aweme.model.AnoleMultiContentModel> r1 = com.ss.android.ugc.aweme.model.AnoleMultiContentModel.class
            r0 = 0
            java.lang.Object r0 = r3.parseDataToStructure(r2, r1, r0)
            com.ss.android.ugc.aweme.model.AnoleMultiContentModel r0 = (com.ss.android.ugc.aweme.model.AnoleMultiContentModel) r0
            if (r0 == 0) goto L57
            java.util.List r4 = r0.getContentList()
        L43:
            r1 = 0
            if (r4 == 0) goto L55
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L55
            r0 = 0
        L4d:
            r2 = 8
            if (r0 == 0) goto L59
            X.C786410Ut5.LLZZLLIL(r5, r2)
            return
        L55:
            r0 = 1
            goto L4d
        L57:
            r4 = 0
            goto L43
        L59:
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r1)
            com.ss.android.ugc.aweme.model.AnoleMultiContentItemModel r0 = (com.ss.android.ugc.aweme.model.AnoleMultiContentItemModel) r0
            java.lang.String r3 = r0.getCover()
            if (r3 == 0) goto Lc3
            int r0 = r3.length()
            if (r0 == 0) goto Lc3
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = new com.ss.android.ugc.aweme.base.model.UrlModel
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r3)
            r2.setUrlList(r0)
            X.00cf r8 = new X.00cf
            r8.<init>()
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r1)
            com.ss.android.ugc.aweme.model.AnoleMultiContentItemModel r0 = (com.ss.android.ugc.aweme.model.AnoleMultiContentItemModel) r0
            java.lang.Integer r0 = r0.getVideoWith()
            if (r0 == 0) goto Lbd
            int r0 = r0.intValue()
        L90:
            r8.element = r0
            X.00cf r9 = new X.00cf
            r9.<init>()
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r1)
            com.ss.android.ugc.aweme.model.AnoleMultiContentItemModel r0 = (com.ss.android.ugc.aweme.model.AnoleMultiContentItemModel) r0
            java.lang.Integer r0 = r0.getVideoHeight()
            if (r0 == 0) goto Lbb
            int r0 = r0.intValue()
        La7:
            r9.element = r0
            X.C786410Ut5.LLZZLLIL(r5, r1)
            X.0cU7 r4 = new X.0cU7
            r4.<init>()
            int r1 = r8.element
            int r0 = r9.element
            r6.LIZ(r7, r5, r1, r0)
            if (r13 == 0) goto Lbf
            return
        Lbb:
            r0 = 0
            goto La7
        Lbd:
            r0 = 0
            goto L90
        Lbf:
            X.C1322410kW7.LIZ(r5, r2, r4)
            return
        Lc3:
            X.C786410Ut5.LLZZLLIL(r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1013640cU6.LJ(android.view.ViewGroup, X.0kVd, boolean):void");
    }

    public final void LIZ(ViewGroup viewGroup, View view, int i, int i2) {
        float fLIZIZ;
        try {
            int measuredWidth = viewGroup.getMeasuredWidth();
            int measuredHeight = viewGroup.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                C0RG7 c0rg7LJIIJ = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJIIJ();
                if (c0rg7LJIIJ != null) {
                    C533990Kwv c533990Kwv = new C533990Kwv(i, i2, measuredWidth, measuredHeight);
                    if (c0rg7LJIIJ.LIZLLL()) {
                        C533990Kwv c533990KwvLIZIZ = c0rg7LJIIJ.LIZIZ(c533990Kwv);
                        C1428310nGv.LJII(view, Integer.valueOf(c533990KwvLIZIZ.LIZJ), Integer.valueOf(c533990KwvLIZIZ.LIZLLL));
                        return;
                    }
                }
                if (C1017070cZd.LLIZLLLIL(this.LIZ)) {
                    fLIZIZ = Float.MAX_VALUE;
                } else {
                    fLIZIZ = C0RG1.LIZIZ();
                }
                VideoAdaptionResult videoAdaptionResultLIZIZ = C20563515dJ.LIZIZ(measuredWidth, measuredHeight, i, i2, C20563515dJ.LIZ(fLIZIZ, Float.MAX_VALUE, measuredWidth, measuredHeight, i, i2));
                C1428310nGv.LJII(view, Integer.valueOf(videoAdaptionResultLIZIZ.getWidth()), Integer.valueOf(videoAdaptionResultLIZIZ.getHeight()));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZIZ(InterfaceC1330440kj4 interfaceC1330440kj4, C1322110kVd c1322110kVd, ViewGroup viewGroup, int i, int i2) {
        if (interfaceC1330440kj4 == null) {
            return;
        }
        if (i2 > 0 && i > 0) {
            return;
        }
        try {
            int width = interfaceC1330440kj4.getWidth();
            int height = interfaceC1330440kj4.getHeight();
            if (width > 0 && height > 0) {
                LIZ(viewGroup, c1322110kVd, i, i2);
            } else {
                C786410Ut5.LJLLLLLL(8, c1322110kVd);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
