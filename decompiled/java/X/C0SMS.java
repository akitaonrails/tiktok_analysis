package X;

import Y.ARunnableS111S0100000_11;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.experiment.BlurHashMetaDataSettings;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0SMS, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public abstract class C0SMS {
    public static final /* synthetic */ int LJJIIZ = 0;
    public final C0SM7 LIZ;
    public final InterfaceC719500SKe LIZIZ;
    public final View LIZJ;
    public final boolean LIZLLL;
    public final Context LJ;
    public final C0STF LJFF;
    public boolean LJI;
    public PhotoModeImageUrlModel LJII;
    public VideoItemParams LJIIIZ;
    public long LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public C719940SLw LJIILL;
    public int LJIILLIIL;
    public UrlModel LJIIZILJ;
    public boolean LJIJ;
    public double LJIJI;
    public String LJIL;
    public String LJJ;
    public int LJJI;
    public SlidesImageLoadParams LJJIFFI;
    public final C719890SLr LJJII;
    public final C0SMV LJJIII;
    public Bitmap.Config LJJIIJ;
    public Map<String, ? extends Object> LJJIIJZLJL;
    public String LJIIIIZZ = "";
    public int LJIIJ = -1;
    public String LJIJJ = "";
    public int LJIJJLI = EnumC720070SMj.FROM_UNKNOWN.getValue();

    public abstract void LIZJ();

    public abstract void LJII(C1331670kl3 c1331670kl3);

    public void LJIIIIZZ() {
        this.LJII = null;
        this.LJIIIIZZ = "";
        this.LJIIIZ = null;
        this.LJIIJ = -1;
        this.LJIIJJI = SystemClock.elapsedRealtime();
        this.LJIIL = false;
        this.LJIIZILJ = null;
        this.LJI = false;
        this.LJJII.LJ();
    }

    static {
        C1318140kPE.LJII = BlurHashMetaDataSettings.getMetadata();
    }

    public static EnumC720130SMp LIZIZ(double d) {
        if (d == 1.1d) {
            return EnumC720130SMp.TYPE_1_1;
        }
        if (d == 1.2d) {
            return EnumC720130SMp.TYPE_1_2;
        }
        if (d == 1.3d) {
            return EnumC720130SMp.TYPE_1_3;
        }
        if (d == 1.4d) {
            return EnumC720130SMp.TYPE_1_4;
        }
        if (d == 1.5d) {
            return EnumC720130SMp.TYPE_1_5;
        }
        if (d == 2.0d) {
            return EnumC720130SMp.TYPE_2;
        }
        return EnumC720130SMp.TYPE_2;
    }

    public final void LJIIIZ(C0SM0 c0sm0) {
        if (this.LJI) {
            return;
        }
        C719890SLr c719890SLr = this.LJJII;
        C0SM7 c0sm7 = this.LIZ;
        if (!c719890SLr.LJIIL && c719890SLr.LJIIIZ.getVisibility() != 0) {
            if ((c0sm0 != C0SM0.NONE && (c0sm0 != C0SM0.BLUR_PLACEHOLDER || !c719890SLr.LJIILL)) || c719890SLr.LJIIIZ.getVisibility() == 0) {
                return;
            }
            if (c719890SLr.LJIILL) {
                c719890SLr.LIZLLL(c719890SLr.LJIIJJI);
                if (!C717490SCl.LIZ(c719890SLr.LIZIZ)) {
                    return;
                }
                c719890SLr.LJFF(c719890SLr.LJIIJJI);
                return;
            }
            if (c0sm7.H5() && !c0sm7.ew()) {
                return;
            }
            ImageView imageView = c719890SLr.LJIIJ;
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_tiktok_logo;
            c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.ei, c719890SLr.LJIILIIL);
            imageView.setImageDrawable(c419910GdJ.LIZ(c719890SLr.LJIILIIL));
            C339190DRl.LIZLLL(c719890SLr.LJIIJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.model.SlidesImageLoadParams LIZ(int r60, long r61) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SMS.LIZ(int, long):com.ss.android.ugc.aweme.model.SlidesImageLoadParams");
    }

    public final void LIZLLL(int i, C0N3Y c0n3y) {
        String str;
        C0N3Z.LIZ.getClass();
        if (u.LJIJI(C0N3Z.LJIIJJI, "homepage_hot", true) && C0N3Z.LJIIL == 0 && !C0N3Z.LJII) {
            C0N3Z.LJII = true;
            C20684815ws.LJFF().execute(new Runnable() { // from class: X.0N3X
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PostModeFeedImageCacheHelper@9f61.reportPerfEvent$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PostModeFeedImageCacheHelper@9f61.reportPerfEvent$1");
                }

                public static void LIZ() {
                    C20684815ws.LJIILLIIL("cold_boot_photo_report", C2097608Jq.LJIIIIZZ(new Pair("ui_duration", String.valueOf(System.currentTimeMillis() - C0N3Z.LJIIIIZZ)), new Pair("assem_view_create_duration", String.valueOf(C0N3Z.LJIIIZ)), new Pair("assem_bind_duration", String.valueOf(C0N3Z.LJIIJ)), new Pair("image_load_from_app_start_duration", String.valueOf(System.currentTimeMillis() - C1150504el.LIZ().LJJII)), new Pair("image_load_from_app_start_end_duration", String.valueOf(SystemClock.elapsedRealtime() - C1150504el.LIZ().LJJIII)), new Pair("image_load_from_app_attach_duration", String.valueOf(SystemClock.uptimeMillis() - C202094145s.LJIILL))));
                }
            });
        }
        VideoItemParams videoItemParamsD6 = this.LIZ.d6();
        if (videoItemParamsD6 == null || C0N3Z.LIZLLL) {
            return;
        }
        C01GW c01gw = C18046074y.LIZ;
        if (((Number) c01gw.getValue()).intValue() != 0) {
            if (((Number) c01gw.getValue()).intValue() == 1) {
                VideoItemParams videoItemParams = this.LJIIIZ;
                if (videoItemParams != null) {
                    str = videoItemParams.mEventType;
                } else {
                    str = null;
                }
                if (u.LJIJI(str, "homepage_hot", true) && videoItemParamsD6.currentPosition == 0 && i == 0) {
                    C1602200rnO.LIZ().LIZLLL(EnumC585000Mx0.FIRST_FEED_COMPLETED);
                }
            } else {
                C1602200rnO.LIZ().LIZLLL(EnumC585000Mx0.FIRST_FEED_COMPLETED);
            }
        }
        Context context = this.LJ;
        if (context != null && C08Q0.LJ(context, "photomode_cold_boot_event_track_opt_v4110", false) && u.LJIJI(videoItemParamsD6.mEventType, "homepage_hot", true) && videoItemParamsD6.currentPosition == 0 && i == 0) {
            C0X35.LJIIJJI("feed_ui_to_photo", true);
            C1150504el.LIZ().LJI("feed_photo_total", true);
            C08TN.LIZ().LJIIIZ("feed_photo_total");
            C0N3Z.LIZLLL = true;
            C0N3Z.LJFF = c0n3y;
            if (C1150504el.LIZ().LJII) {
                C1150504el.LIZ().LJIIJJI = 3;
                C1150504el.LIZ().LJIIL();
            }
        }
    }

    public final void LJI(C0SM0 c0sm0, Boolean bool) {
        C719890SLr c719890SLr = this.LJJII;
        if (!this.LJI && !Intrinsics.LJFF(bool, Boolean.TRUE)) {
            if (!c719890SLr.LJIIL && c719890SLr.LJIIIZ.getVisibility() != 0) {
                if ((c0sm0 != C0SM0.NONE && (c0sm0 != C0SM0.BLUR_PLACEHOLDER || !c719890SLr.LJIILL)) || !c719890SLr.LJIILL) {
                    return;
                }
                if (c719890SLr.LJIIJJI.getVisibility() != 0 && !c719890SLr.LIZJ) {
                    c719890SLr.LIZLLL(c719890SLr.LJIIJJI);
                }
                c719890SLr.LJFF(c719890SLr.LJIIJJI);
                return;
            }
            return;
        }
        c719890SLr.getClass();
    }

    public final void LJ(int i, String str, String str2) {
        TuxIconDrawable tuxIconDrawableLIZ;
        int i2;
        int i3;
        boolean z = true;
        if (this.LIZLLL && (i3 = this.LJIILLIIL) < 3) {
            HandlerHook.viewPostDelay(this.LIZJ, new ARunnableS111S0100000_11(this, 1), (long) (((float) Math.pow(2.0f, i3 + 1)) * LSPassThroughRecordSizeConfig.DEFAULT));
            this.LJIILLIIL++;
        } else if (!this.LJI) {
            C719890SLr c719890SLr = this.LJJII;
            boolean zD21 = this.LIZ.D21(this.LJIIJ);
            if (!c719890SLr.LJIILL || C298560Bn4.LIZ()) {
                c719890SLr.LIZJ();
                if (c719890SLr.LJIIIZ.getDrawable() == null) {
                    if (C298560Bn4.LIZ()) {
                        ImageView imageView = c719890SLr.LJIIIZ;
                        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
                        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
                        C786410Ut5.c6(imageView, layoutParams);
                        C786410Ut5.V4(c719890SLr.LJIIIZ, 1.0f);
                        C0SMC c0smc = c719890SLr.LJFF;
                        if (c0smc == null || !c0smc.LIZIZ() || !c719890SLr.LJFF.LIZ()) {
                            z = false;
                        }
                        if (c719890SLr.LIZJ && !C960203pA.LIZIZ(c719890SLr.LJIILIIL) && !z) {
                            i2 = R.attr.a1j;
                        } else {
                            i2 = R.attr.zi;
                        }
                        TuxTextView tuxTextView = c719890SLr.LJI;
                        if (tuxTextView != null) {
                            tuxTextView.setTextColorRes(i2);
                        }
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = R.raw.icon_large_refresh;
                        c419910GdJ.LJ = Integer.valueOf(i2);
                        tuxIconDrawableLIZ = c419910GdJ.LIZ(c719890SLr.LJIILIIL);
                    } else {
                        C419910GdJ c419910GdJ2 = new C419910GdJ();
                        c419910GdJ2.LIZ = R.raw.icon_color_tiktok_logo_light;
                        tuxIconDrawableLIZ = c419910GdJ2.LIZ(c719890SLr.LJIILIIL);
                    }
                    c719890SLr.LJIIIZ.setImageDrawable(tuxIconDrawableLIZ);
                }
                C339190DRl.LIZLLL(c719890SLr.LJIIIZ);
                if (C298560Bn4.LIZ()) {
                    c719890SLr.LJI();
                    TuxTextView tuxTextView2 = c719890SLr.LJI;
                    if (tuxTextView2 != null) {
                        C339190DRl.LIZLLL(tuxTextView2);
                    }
                }
                if (C298560Bn4.LIZ() && zD21) {
                    C1389890mGx c1389890mGx = new C1389890mGx(c719890SLr.LIZIZ);
                    c1389890mGx.LJIIIZ(2131829440);
                    c1389890mGx.LJIIJJI();
                }
            }
        }
        SlidesImageLoadParams slidesImageLoadParamsLIZ = SlidesImageLoadParams.LIZ(LIZ(C0SAO.FAIL.getCode(), this.LJIIJJI), 0L, null, null, null, null, Integer.valueOf(i), str2, str, this.LJIJJLI, null, null, C0SAY.FAIL.getValue(), -234881025, 109);
        slidesImageLoadParamsLIZ.strategyExtra = this.LJJIIJZLJL;
        this.LJJIFFI = slidesImageLoadParamsLIZ;
        InterfaceC719500SKe interfaceC719500SKe = this.LIZIZ;
        if (interfaceC719500SKe != null) {
            interfaceC719500SKe.u6(slidesImageLoadParamsLIZ);
        }
        SystemClock.elapsedRealtime();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0SMV] */
    public C0SMS(C0SM7 c0sm7, InterfaceC719500SKe interfaceC719500SKe, View view, boolean z, C0SMC c0smc) {
        this.LIZ = c0sm7;
        this.LIZIZ = interfaceC719500SKe;
        this.LIZJ = view;
        this.LIZLLL = z;
        this.LJ = view.getContext();
        this.LJFF = (C0STF) view.findViewById(R.id.vmb);
        boolean zSC = c0sm7.SC();
        VideoItemParams videoItemParamsD6 = c0sm7.d6();
        c0sm7.M20();
        this.LJJII = new C719890SLr(view, zSC, videoItemParamsD6, c0sm7.ie(), c0smc);
        this.LJJIII = new InterfaceC658750Psf() { // from class: X.0SMV
            @Override // X.InterfaceC658750Psf
            public final void Ck(JSONObject jSONObject) {
                boolean z2;
                boolean z3;
                boolean z4;
                Integer num;
                C0SMS c0sms = this.LL;
                c0sms.getClass();
                try {
                    C0SN6 c0sn6 = EnumC720070SMj.Companion;
                    Integer numValueOf = Integer.valueOf(jSONObject.optInt("from"));
                    c0sn6.getClass();
                    c0sms.LJIJJLI = C0SN6.LIZ(numValueOf).getValue();
                    if (jSONObject.optInt("from") == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c0sms.LJIIL = z2;
                    String strOptString = jSONObject.optString("image_type");
                    c0sms.LJJ = strOptString;
                    EnumC720120SMo.LL.getClass();
                    if (!u.LJIJI("heic_format", strOptString, true) && !u.LJIJI("heif_format_animated", strOptString, true)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    c0sms.LJIILJJIL = z3;
                    Integer numValueOf2 = Integer.valueOf(jSONObject.optInt("heic_sys_first"));
                    if (numValueOf2 != null && numValueOf2.intValue() == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    c0sms.LJIILIIL = z4;
                    c0sms.LJIL = jSONObject.optString("hit_cdn_cache");
                    C0SMT c0smt = C0SMT.LIZ;
                    String str = c0sms.LJIIIIZZ;
                    c0smt.getClass();
                    if (str != null && str.length() != 0 && (num = C0SMT.LIZJ.get(str)) != null && num.intValue() > 0) {
                        c0sms.LJJI = num.intValue();
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                }
                C0N3Z c0n3z = C0N3Z.LIZ;
                C0SN6 c0sn62 = EnumC720070SMj.Companion;
                Integer numValueOf3 = Integer.valueOf(jSONObject.optInt("from"));
                c0sn62.getClass();
                int value = C0SN6.LIZ(numValueOf3).getValue();
                c0n3z.getClass();
                C0N3Z.LIZIZ(value);
            }

            @Override // X.InterfaceC658750Psf
            public final void onImageLoaded(boolean z2, String str, JSONObject jSONObject) {
                int iOptInt;
                InterfaceC719500SKe interfaceC719500SKe2;
                String aid;
                Aweme aweme;
                if (!z2 && ((Boolean) C276980AtM.LIZ.getValue()).booleanValue()) {
                    VideoItemParams videoItemParams = this.LL.LJIIIZ;
                    if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
                        aid = aweme.getAid();
                    } else {
                        aid = null;
                    }
                    AbstractC19486711Lt.LJIIJJI(new C2325361G0o(aid, jSONObject, 0)).LJIJJLI(C11S5.LIZ()).LJIIIIZZ(new C516901zr(9)).LJIIZILJ();
                }
                C0SMS c0sms = this.LL;
                int i = c0sms.LJIIJ;
                if (i != -1 && (interfaceC719500SKe2 = c0sms.LIZIZ) != null) {
                    interfaceC719500SKe2.n5(i, jSONObject);
                }
                C0SMS c0sms2 = this.LL;
                if (jSONObject != null) {
                    iOptInt = jSONObject.optInt("file_size");
                } else {
                    iOptInt = 0;
                }
                c0sms2.LJJI = iOptInt;
            }
        };
        this.LJJIIJ = Bitmap.Config.RGB_565;
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x0360, code lost:
    
        if (com.ss.android.ugc.aweme.feed.model.AwemeBizOptExtKt.getAwemeCacheType(r0) == 1) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
    
        if (r7 != null) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04a6 A[PHI: r17
      0x04a6: PHI (r17v2 double) = (r17v1 double), (r17v3 double) binds: [B:278:0x0492, B:282:0x04a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC469401sC LJFF(final int r24, com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel r25, final com.ss.android.ugc.aweme.feed.model.VideoItemParams r26, final X.C0SM0 r27, int r28, java.lang.Boolean r29) {
        /*
            Method dump skipped, instruction units count: 1424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SMS.LJFF(int, com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel, com.ss.android.ugc.aweme.feed.model.VideoItemParams, X.0SM0, int, java.lang.Boolean):X.01sC");
    }
}
