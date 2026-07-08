package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.broadcast.pcs.LivePcsOnboardingPerfOptSetting;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.geckox.model.UpdatePackage;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0TGC, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TGC {
    public static final Map<String, String> LIZ = C2097608Jq.LJIIIIZZ(new Pair("tiktok_live_pcs_onboarding_1", "tiktok_live_pcs_onboarding_1_webp"), new Pair("tiktok_live_pcs_onboarding_2", "tiktok_live_pcs_onboarding_main_webp"));
    public static final AtomicInteger LIZIZ = new AtomicInteger(0);
    public static final AtomicInteger LIZJ = new AtomicInteger(0);
    public static final AtomicInteger LIZLLL = new AtomicInteger(0);
    public static final AtomicInteger LJ = new AtomicInteger(0);

    public static final Map<String, String> LIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LivePcsOnboardingPerfOptSetting livePcsOnboardingPerfOptSetting = LivePcsOnboardingPerfOptSetting.INSTANCE;
        if (livePcsOnboardingPerfOptSetting.enabledWebp()) {
            linkedHashMap.put("gecko_webp_image_err", String.valueOf(LIZIZ.get()));
            linkedHashMap.put("gecko_webp_bg_err", String.valueOf(LIZJ.get()));
        }
        AtomicInteger atomicInteger = LIZLLL;
        linkedHashMap.put("gecko_9patch_err", String.valueOf(atomicInteger.get()));
        if (livePcsOnboardingPerfOptSetting.enabledDotLottieWebp()) {
            linkedHashMap.put("gecko_webp_lottie_err", String.valueOf(LJ.get()));
        }
        LIZIZ.set(0);
        LIZJ.set(0);
        atomicInteger.set(0);
        LJ.set(0);
        return linkedHashMap;
    }

    public static String LJ(String str) {
        String str2 = LIZ.get(str);
        if (str2 != null) {
            return str2;
        }
        return str;
    }

    public static final void LIZIZ(C1324720kZq c1324720kZq, String str) {
        LIZJ(c1324720kZq, str, ImageView.ScaleType.CENTER_CROP, null);
    }

    public static final void LIZLLL(final View view, final String str, final Function1 function1) {
        String strLJIIL;
        if (view == null) {
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        if ("tiktok_live_pcs_onboarding_main_webp".length() != 0 && str.length() != 0) {
            String strLIZIZ = C1143780fs0.LIZIZ("tiktok_live_pcs_onboarding_main_webp", str);
            if ((strLIZIZ != null && strLIZIZ.length() != 0) || ((strLJIIL = C1143780fs0.LJIIL("tiktok_live_pcs_onboarding_main_webp", str)) != null && strLJIIL.length() != 0 && new C0VSJ(strLJIIL).exists())) {
                C1143680frq.LJJ(view, "tiktok_live_pcs_onboarding_main_webp", str, false, 0, new Runnable() { // from class: X.0T8n
                    public final /* synthetic */ String LLILLJJLI = "tiktok_live_pcs_onboarding_main_webp";

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("PcsOnboardingGeckoImageLoader@b1b.loadGeckoNinePatchImage$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("PcsOnboardingGeckoImageLoader@b1b.loadGeckoNinePatchImage$1");
                    }

                    public final void LIZ() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("loadGeckoNinePatchImage success (local hit) file=");
                        sbLIZ.append(str);
                        sbLIZ.append(" channel=");
                        sbLIZ.append(this.LLILLJJLI);
                        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                        Function1<Boolean, Unit> function12 = function1;
                        if (function12 != null) {
                            function12.invoke(Boolean.TRUE);
                        }
                    }
                });
                return;
            }
            IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
            if (iHostResource == null) {
                if (function1 != null) {
                    function1.invoke(Boolean.FALSE);
                    return;
                }
                return;
            }
            iHostResource.nd1(new AbstractC1552040qUU() { // from class: X.0TGB
                public final /* synthetic */ String LIZ = "tiktok_live_pcs_onboarding_main_webp";

                @Override // X.AbstractC1552040qUU
                public final void LJIJ(UpdatePackage updatePackage, Throwable th) {
                    C0TGC.LIZLLL.incrementAndGet();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("gecko 9-patch channel update failed: ");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append('/');
                    sbLIZ.append(str);
                    sbLIZ.append(", err=");
                    sbLIZ.append(th);
                    C20441214yg.LIZIZ("PcsOnboardingGeckoImageLoader", C2188811AlT.LIZIZ(sbLIZ));
                    View view2 = view;
                    final Function1<Boolean, Unit> function12 = function1;
                    HandlerHook.viewPost(view2, new Runnable() { // from class: X.0N3Q
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("PcsOnboardingGeckoImageLoader@b1b.loadGeckoNinePatchImage$2$onUpdateFailed$1");
                            try {
                                Function1<Boolean, Unit> function13 = function12;
                                if (function13 != null) {
                                    function13.invoke(Boolean.FALSE);
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("PcsOnboardingGeckoImageLoader@b1b.loadGeckoNinePatchImage$2$onUpdateFailed$1");
                        }
                    });
                }

                @Override // X.AbstractC1552040qUU
                public final void LJIL(long j, UpdatePackage updatePackage) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("loadGeckoNinePatchImage channel update success channel=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(" version=");
                    sbLIZ.append(j);
                    C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    final View view2 = view;
                    final String str2 = this.LIZ;
                    final String str3 = str;
                    final Function1<Boolean, Unit> function12 = function1;
                    HandlerHook.viewPost(view2, new Runnable() { // from class: X.0T8m
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("PcsOnboardingGeckoImageLoader@b1b.loadGeckoNinePatchImage$2$onUpdateSuccess$1");
                            try {
                                View view3 = view2;
                                final String str4 = str2;
                                final String str5 = str3;
                                final Function1<Boolean, Unit> function13 = function12;
                                C1143680frq.LJJ(view3, str4, str5, false, 0, new Runnable() { // from class: X.0T8l
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ2;
                                        C1C7U.LIZ("PcsOnboardingGeckoImageLoader@b1b.loadGeckoNinePatchImage$2$onUpdateSuccess$1$1");
                                        try {
                                            LIZ();
                                        } finally {
                                            if (!zLIZ2) {
                                            }
                                        }
                                        C1C7U.LIZIZ("PcsOnboardingGeckoImageLoader@b1b.loadGeckoNinePatchImage$2$onUpdateSuccess$1$1");
                                    }

                                    public final void LIZ() {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("loadGeckoNinePatchImage success (after channel update) file=");
                                        sbLIZ2.append(str5);
                                        sbLIZ2.append(" channel=");
                                        sbLIZ2.append(str4);
                                        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                                        Function1<Boolean, Unit> function14 = function13;
                                        if (function14 != null) {
                                            function14.invoke(Boolean.TRUE);
                                        }
                                    }
                                });
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("PcsOnboardingGeckoImageLoader@b1b.loadGeckoNinePatchImage$2$onUpdateSuccess$1");
                        }
                    });
                }
            }, "tiktok_live_pcs_onboarding_main_webp");
            return;
        }
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
    }

    public static final void LIZJ(final C1324720kZq c1324720kZq, final String str, final ImageView.ScaleType scaleType, String str2) {
        final String strLJ = str2;
        if (LivePcsOnboardingPerfOptSetting.INSTANCE.enabledWebp() && str != null && str.length() != 0 && u.LJIIZILJ(str, ".png", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(a0.LJJJLL(".png", str));
            sbLIZ.append(".webp");
            final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (strLJ == null) {
                strLJ = LJ("tiktok_live_pcs_onboarding_2");
            }
            C1143680frq.LJFF(c1324720kZq, strLJ, strLIZIZ, scaleType, new InterfaceC1142670fqD() { // from class: X.0TGA
                public final /* synthetic */ String LJ = "tiktok_live_pcs_onboarding_2";

                @Override // X.InterfaceC1142670fqD
                public final void LIZ() {
                }

                @Override // X.InterfaceC1142670fqD
                public final void LIZIZ(Animatable animatable) {
                }

                @Override // X.InterfaceC1142670fqD
                public final void LIZLLL(String str3, Exception exc) {
                    C0TGC.LIZIZ.incrementAndGet();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("webp load failed, fallback to png: ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", err=");
                    sbLIZ2.append(exc);
                    C20441214yg.LIZIZ("PcsOnboardingGeckoImageLoader", C2188811AlT.LIZIZ(sbLIZ2));
                    C1143680frq.LJ(c1324720kZq, this.LJ, str, scaleType);
                }

                @Override // X.InterfaceC1142670fqD
                public final void LIZJ(int i, int i2, String str3) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("loadGeckoImage webp success file=");
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append(" channel=");
                    sbLIZ2.append(strLJ);
                    sbLIZ2.append(' ');
                    sbLIZ2.append(i);
                    sbLIZ2.append('x');
                    sbLIZ2.append(i2);
                    C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                }
            });
            return;
        }
        C1143680frq.LJ(c1324720kZq, "tiktok_live_pcs_onboarding_2", str, scaleType);
    }
}
