package X;

import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.keva.Keva;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.android.ugc.aweme.shortvideo.d4;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import iyl.i3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0t4j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1651390t4j extends AbstractC1651430t4n {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C1664750tQH LLILZLL;
    public final C1664750tQH LLIZ;
    public final EnumC1651770t5L LLIZLLLIL;
    public final AwS569S0100000_25 LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1651390t4j.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1651390t4j.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public final C19EG LJIJJLI() {
        return (C19EG) this.LLILZLL.getValue(this, LLJI[0]);
    }

    @Override // X.AbstractC1651430t4n
    public final String LJIJJ() {
        return (!C1651120t4I.LIZ() || LJIIL().LJJLL() || LJIIL().LJJLL() || LJIIL().LJJJJLL()) ? "microphone" : "microphone_with_bgm";
    }

    @Override // X.AbstractC1651450t4p
    public final Function0<i3> LJI() {
        return this.LLJ;
    }

    @Override // X.AbstractC1651450t4p
    public final EnumC1651770t5L LJIIIZ() {
        return this.LLIZLLLIL;
    }

    public C1651390t4j(C1DRG c1drg) {
        super(c1drg);
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, C19EG.class, null);
        this.LLIZ = C1664770tQJ.LIZ(c1drg, InterfaceC1650230t2r.class, null);
        this.LLIZLLLIL = EnumC1651770t5L.MICROPHONE;
        this.LLJ = new AwS569S0100000_25(this, StrategyCenter.ENABLE_SMART_SERVICE);
    }

    @Override // X.AbstractC1651430t4n, X.InterfaceC1659130tHD
    public final /* bridge */ /* synthetic */ void LIZ(C1654400t9a c1654400t9a, Object obj) {
        LIZ(c1654400t9a, (i3) obj);
    }

    @Override // X.AbstractC1651430t4n
    /* JADX INFO: renamed from: LJIJ */
    public final void LIZ(C1654400t9a c1654400t9a, i3 i3Var) {
        int i;
        boolean z;
        super.LIZ(c1654400t9a, i3Var);
        if (!C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO")) {
            if (C1651120t4I.LIZ()) {
                C19741112Lp c19741112Lp = C19741112Lp.LIZ;
                C19EG c19egLJIJJLI = LJIJJLI();
                c19741112Lp.getClass();
                final boolean zLJI = C19741112Lp.LJI(c19egLJIJJLI, "android.permission.RECORD_AUDIO", false);
                final String[] strArr = {"android.permission.RECORD_AUDIO"};
                C533800Kwc.LJFF(strArr, LJIJJLI(), "shoot_page", null);
                C19514711Wn.LIZIZ.LIZIZ(LJIJJLI(), TokenCert.Companion.with("bpea-request_audio_by_click_mic")).LIZIZ("android.permission.RECORD_AUDIO").LIZJ(new InterfaceC19515111Wr() { // from class: X.0t4i
                    @Override // X.InterfaceC19515111Wr
                    public final void onCanceled() {
                    }

                    @Override // X.InterfaceC19515111Wr
                    public final void LIZ(C0HWO... c0hwoArr) {
                        int i2;
                        StitchParams stitchParams;
                        int i3;
                        C0HWO c0hwo = c0hwoArr[0];
                        int[] iArr = new int[1];
                        if (c0hwo.LIZ()) {
                            i2 = 0;
                        } else {
                            i2 = -1;
                        }
                        iArr[0] = i2;
                        C533800Kwc.LIZLLL(strArr, iArr, this.LJIJJLI(), "shoot_page", null);
                        if (c0hwo.LIZIZ == EnumC442280HVy.DENIED_PERMANENT && zLJI) {
                            C540290LGx c540290LGx = C540290LGx.LIZ;
                            C19EG c19egLJIJJLI2 = this.LJIJJLI();
                            c540290LGx.getClass();
                            C540290LGx.LJIILIIL(c19egLJIJJLI2);
                            return;
                        }
                        if (c0hwo.LIZ()) {
                            this.LJIIJJI(AFwS266S0000000_25.get$arr$(430));
                            if (d4.LJJIJ(this.LJIIL())) {
                                if (this.LJIIL().cameraComponentModel.isMuted) {
                                    i3 = 2;
                                } else {
                                    i3 = 1;
                                }
                                C1651390t4j c1651390t4j = this;
                                ((InterfaceC1650190t2n) c1651390t4j.LLIZ.getValue(c1651390t4j, C1651390t4j.LLJI[1])).w61(new C1648160szW(i3));
                            } else {
                                this.LJIIJJI(AFwS266S0000000_25.get$arr$(431));
                                C1651390t4j c1651390t4j2 = this;
                                ((InterfaceC1650190t2n) c1651390t4j2.LLIZ.getValue(c1651390t4j2, C1651390t4j.LLJI[1])).w61(new C1648160szW(5));
                            }
                            if (d4.LJJIJIIJI(this.LJIIL()) && !C1443960ngA.LJIIL(this.LJIIL())) {
                                C1651030t49.LIZIZ(this.LJIIIIZZ(), EnumC1651770t5L.VOICE_CHANGE, true);
                            }
                            if (this.LJIIL().LJJJJLL() && (stitchParams = this.LJIIL().stitchContext.stitchParams) != null) {
                                stitchParams.setEnableMic(true);
                            }
                        }
                    }
                });
                return;
            }
            return;
        }
        if (LJIIL().cameraComponentModel.isMuted) {
            i = 1;
        } else {
            i = 2;
        }
        if (LJIIL().LJJLL()) {
            Keva keva = C1651420t4m.LIZ;
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_duet_audio_status_record_page", true) != 0) {
                C1651420t4m.LIZ.storeBoolean("duet_audio_status", z);
            }
        }
        ((InterfaceC1650190t2n) this.LLIZ.getValue(this, LLJI[1])).w61(new C1648160szW(i));
    }
}
