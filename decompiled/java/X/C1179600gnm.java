package X;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mapapi.IPoiMapService;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiEnableExperiment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gnm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1179600gnm {
    public static final boolean LIZ(C1179580gnk c1179580gnk) {
        boolean z;
        if (c1179580gnk.poiLat == 0.0d && c1179580gnk.poiLng == 0.0d) {
            z = false;
        } else {
            z = true;
        }
        if (!((IPoiMapService) ServiceManager.get().getService(IPoiMapService.class)).LJFF()) {
            z = false;
        }
        if (!PoiEnableExperiment.LIZLLL()) {
            z = false;
        }
        Integer numValueOf = Integer.valueOf((int) c1179580gnk.defaultZoomLevel);
        Double dValueOf = Double.valueOf(c1179580gnk.maxLat);
        Double dValueOf2 = Double.valueOf(c1179580gnk.minLat);
        Double dValueOf3 = Double.valueOf(c1179580gnk.maxLng);
        Double dValueOf4 = Double.valueOf(c1179580gnk.minLng);
        if (numValueOf == null && dValueOf != null && dValueOf2 != null && dValueOf3 != null && dValueOf4 != null) {
            return false;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZIZ(java.lang.String r6, X.InterfaceC1364105Vn<? super android.graphics.Bitmap> r7) {
        /*
            boolean r0 = r7 instanceof X.C472601si
            if (r0 == 0) goto L37
            r5 = r7
            X.01si r5 = (X.C472601si) r5
            int r2 = r5.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L37
            int r2 = r2 - r1
            r5.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L3d
            X.C155000ia.LIZIZ(r1)
        L22:
            return r1
        L23:
            X.C155000ia.LIZIZ(r1)
            X.1DFB r2 = X.C0PEM.LIZJ
            X.08cg r1 = new X.08cg
            r0 = 0
            r1.<init>(r6, r0)
            r5.LLILLJJLI = r3
            java.lang.Object r1 = X.C23250099c.LJI(r5, r2, r1)
            if (r1 != r4) goto L22
            return r4
        L37:
            X.01si r5 = new X.01si
            r5.<init>(r7)
            goto L12
        L3d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1179600gnm.LIZIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZJ(android.content.Context r28, java.lang.String r29, int r30, int r31) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1179600gnm.LIZJ(android.content.Context, java.lang.String, int, int):java.lang.String");
    }

    public static final synchronized void LIZLLL(final ViewGroup viewGroup, String str, final Function0 function0, final Function0 function02, final Function0 function03, C054G c054g) {
        if (str == null) {
            if (function02 != null) {
                function02.invoke();
            }
            return;
        }
        if (viewGroup == null) {
            if (function02 != null) {
                function02.invoke();
            }
            return;
        }
        C786410Ut5.LJJJJI(viewGroup);
        final TuxIconView tuxIconView = new TuxIconView(viewGroup.getContext(), null, 0, 6, null);
        tuxIconView.setClickable(false);
        C1367960lha.LIZ.getClass();
        if (C1367960lha.LIZ().LLD() != null) {
            float fLJLIIIL = C1367960lha.LIZ().LJLIIIL();
            if (fLJLIIIL <= 0.0f || fLJLIIIL > 1.0f) {
                fLJLIIIL = 1.0f;
            }
            float width = viewGroup.getWidth() * fLJLIIIL;
            float height = viewGroup.getHeight() * fLJLIIIL;
            if (width == 0.0f || height == 0.0f) {
                width = C14KQ.LJIIIZ(viewGroup.getContext());
                height = C14KQ.LJFF(viewGroup.getContext());
            }
            if (width > 1024.0f || height > 1024.0f) {
                float f = 1024;
                float f2 = width / f;
                float f3 = height / f;
                if (f2 < f3) {
                    f2 = f3;
                }
                width /= f2;
                height /= f2;
            }
            String strLIZJ = LIZJ(viewGroup.getContext(), str, (int) width, (int) height);
            if (C960203pA.LIZIZ(viewGroup.getContext())) {
                C099F c099fLIZIZ = C090F.LIZIZ();
                if (c054g != null) {
                    C23250099c.LIZLLL(c054g, null, null, new C472501sh(c099fLIZIZ, strLIZJ, function03, function02, tuxIconView, viewGroup, function0, null), 3);
                }
            } else {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(strLIZJ);
                c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
                c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.CENTER_CROP;
                c1331670kl3LJIIIZ.LJJII(new InterfaceC1331910klR() { // from class: X.01sj
                    @Override // X.InterfaceC1331910klR
                    public final void onProgress(float f4) {
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void onCanceled() {
                        Function0<Unit> function04 = function03;
                        if (function04 != null) {
                            function04.invoke();
                        }
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void LIZ(Bitmap bitmap) {
                        if (bitmap != null) {
                            TuxIconView tuxIconView2 = tuxIconView;
                            ViewGroup viewGroup2 = viewGroup;
                            Function0<Unit> function04 = function0;
                            tuxIconView2.setImageBitmap(bitmap);
                            viewGroup2.addView(tuxIconView2);
                            if (function04 != null) {
                                function04.invoke();
                            }
                        }
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void onFailed(Throwable th) {
                        Function0<Unit> function04 = function02;
                        if (function04 != null) {
                            function04.invoke();
                        }
                    }
                });
            }
        }
    }
}
