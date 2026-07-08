package X;

import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.gift.GiftGalleryExtra;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fPg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1126220fPg extends FrameLayout implements InterfaceC1126270fPl {
    public EnumC1123370fL5 LL;
    public int LLILLJJLI;
    public final InterfaceC1162920gMs LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public long LLILZLL;
    public boolean LLIZ;
    public String LLIZLLLIL;
    public EnumC1126200fPe LLJ;
    public boolean LLJI;
    public long LLJIJIL;
    public EnumC1126060fPQ LLJILJIL;
    public final C1126230fPh LLJILJILJ;
    public final C1126480fQ6 LLJILLL;

    public final void LIZLLL() throws JSONException {
        int i;
        if (this.LLJI) {
            this.LLJI = false;
            if (this.LLILZ <= 1) {
                return;
            }
            if (!C1126030fPN.LIZLLL(this.LLILZLL)) {
                this.LLJ = EnumC1126200fPe.COIN_INSUFFICIENT;
            }
            C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
            long j = this.LLILZLL;
            String str = this.LLIZLLLIL;
            int i2 = this.LLILZ;
            int i3 = this.LLILZIL;
            long j2 = this.LLJIJIL;
            String value = this.LLJ.getValue();
            C1126480fQ6 c1126480fQ6 = this.LLJILLL;
            c1126480fQ6.getClass();
            boolean z = c1126480fQ6.LJFF;
            boolean z2 = c1126480fQ6.LJII;
            boolean z3 = c1126480fQ6.LJIIIIZZ;
            c1128760fTm.getClass();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            C1135800ff8.LJIILJJIL(jSONObject, jSONObject3, C158B.LIZ(), System.currentTimeMillis());
            C1123380fL6.LIZ(jSONObject3);
            Gift giftFindGiftById = GiftManager.inst().findGiftById(j);
            if (giftFindGiftById != null) {
                C1135800ff8.LJ(giftFindGiftById, 0L, jSONObject, jSONObject3);
            }
            C1135800ff8.LJJIIZI(jSONObject, jSONObject2, giftFindGiftById);
            jSONObject.put("combo_scene", str);
            jSONObject.put("has_long_press", i3 > 0 ? "1" : CardStruct.IStatusCode.DEFAULT);
            jSONObject.put("combo_count", i2);
            jSONObject.put("end_reason", value);
            jSONObject.put("send_gift_scene", C1128450fTH.LJIIIZ().getDesc());
            jSONObject.put("to_user_type", C1128450fTH.LJJII(j2) ? "guest" : "anchor");
            jSONObject2.put("long_press_combo_cnt", i3);
            jSONObject2.put("click_combo_cnt", i2 - i3);
            jSONObject2.put("combo_cnt", i2);
            if (!z && !z2 && !z3) {
                i = 0;
            } else if (z2) {
                jSONObject2.put("strategy", "pk_score_surpass");
                i = 1;
                jSONObject2.put("is_score_surpass", 1);
            } else {
                i = 1;
                if (z) {
                    jSONObject2.put("strategy", "pk_score_surpass");
                    jSONObject2.put("is_score_surpass", 0);
                } else {
                    jSONObject2.put("strategy", "normal_gift_num_target");
                }
            }
            jSONObject2.put("is_text_encourage_trigger", i);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_combo_click");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJIIJZLJL(jSONObject);
            c474500IjALIZ.LJJIIJZLJL(jSONObject3);
            c474500IjALIZ.LJJIIJZLJL(jSONObject2);
            c474500IjALIZ.LIZ();
            C1CC2.LJ("ttlive_gift_combo_click", jSONObject, jSONObject2, jSONObject3);
            if (i != 0) {
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_combo_encourage_trigger");
                c474500IjALIZ2.LJIL();
                c474500IjALIZ2.LJJIIJZLJL(jSONObject);
                c474500IjALIZ2.LJJIIJZLJL(jSONObject3);
                c474500IjALIZ2.LJJIIJZLJL(jSONObject2);
                c474500IjALIZ2.LIZ();
            }
        }
    }

    public final void LJFF() {
        C20441214yg.LJIIIZ("LiveNewSendGiftAnimationView", "release");
        LIZLLL();
        this.LLILZ = 0;
        this.LLILZIL = 0;
        this.LLJ = EnumC1126200fPe.OTHERS;
        C1126230fPh c1126230fPh = this.LLJILJILJ;
        if (c1126230fPh != null) {
            c1126230fPh.LIZIZ = 0;
            c1126230fPh.LIZ();
            c1126230fPh.LIZJ();
            c1126230fPh.LIZLLL();
            c1126230fPh.LIZIZ();
            C1126370fPv c1126370fPv = C1126280fPm.LIZ;
            if (c1126370fPv != null) {
                if (c1126370fPv.LIZIZ()) {
                    c1126370fPv.LIZ();
                }
                C1126280fPm.LIZ = null;
            }
            C1126250fPj c1126250fPj = c1126230fPh.LJIIIIZZ;
            if (c1126250fPj != null) {
                c1126250fPj.LL.clear();
                HandlerHook.viewPost(c1126250fPj, new ARunnableS106S0100000_6((Object) c1126250fPj, 164));
            }
            C1126260fPk c1126260fPk = c1126230fPh.LJIIJJI;
            if (c1126260fPk != null) {
                C1126370fPv c1126370fPv2 = c1126260fPk.LLILLL;
                if (c1126370fPv2 != null && c1126370fPv2.LIZIZ()) {
                    C1126370fPv c1126370fPv3 = c1126260fPk.LLILLL;
                    if (c1126370fPv3 != null) {
                        c1126370fPv3.LIZ();
                    }
                    c1126260fPk.LLILLL = null;
                }
                C1126370fPv c1126370fPv4 = c1126260fPk.LLILZ;
                if (c1126370fPv4 != null && c1126370fPv4.LIZIZ()) {
                    C1126370fPv c1126370fPv5 = c1126260fPk.LLILZ;
                    if (c1126370fPv5 != null) {
                        c1126370fPv5.LIZ();
                    }
                    c1126260fPk.LLILZ = null;
                }
                C1126540fQC c1126540fQC = c1126260fPk.LL;
                if (c1126540fQC != null) {
                    c1126540fQC.LIZLLL();
                }
                C1126540fQC c1126540fQC2 = c1126260fPk.LL;
                if (c1126540fQC2 != null) {
                    C786410Ut5.g5(c1126540fQC2, 0.0f);
                }
            }
            C0GSA c0gsa = c1126230fPh.LJIIJ;
            if (c0gsa != null) {
                c0gsa.LIZ();
            }
            C1126240fPi c1126240fPi = c1126230fPh.LJIIL;
            if (c1126240fPi != null) {
                C1126370fPv c1126370fPv6 = c1126240fPi.LLILLL;
                if (c1126370fPv6 != null && c1126370fPv6.LIZIZ()) {
                    C1126370fPv c1126370fPv7 = c1126240fPi.LLILLL;
                    if (c1126370fPv7 != null) {
                        c1126370fPv7.LIZ();
                    }
                    c1126240fPi.LLILLL = null;
                }
                C1126370fPv c1126370fPv8 = c1126240fPi.LLILZ;
                if (c1126370fPv8 != null && c1126370fPv8.LIZIZ()) {
                    C1126370fPv c1126370fPv9 = c1126240fPi.LLILZ;
                    if (c1126370fPv9 != null) {
                        c1126370fPv9.LIZ();
                    }
                    c1126240fPi.LLILZ = null;
                }
                C1126370fPv c1126370fPv10 = c1126240fPi.LLILZIL;
                if (c1126370fPv10 != null && c1126370fPv10.LIZIZ()) {
                    C1126370fPv c1126370fPv11 = c1126240fPi.LLILZIL;
                    if (c1126370fPv11 != null) {
                        c1126370fPv11.LIZ();
                    }
                    c1126240fPi.LLILZIL = null;
                }
                View view = c1126240fPi.LL;
                if (view != null) {
                    C786410Ut5.T4(view, 0.0f);
                }
                c1126240fPi.LLJ = null;
            }
            c1126230fPh.LJII(1.0f, true);
        }
        if (this.LL == EnumC1123370fL5.FAST) {
            return;
        }
        C1126480fQ6 c1126480fQ6 = this.LLJILLL;
        c1126480fQ6.LJIIIZ = null;
        c1126480fQ6.LJFF = false;
        c1126480fQ6.LJI = false;
        c1126480fQ6.LJII = false;
        c1126480fQ6.LJIIIIZZ = false;
    }

    @Override // X.InterfaceC1126270fPl
    public final View LIZ() {
        return FrameLayout.inflate(getContext(), R.layout.fzk, this);
    }

    @Override // X.InterfaceC1126270fPl
    public Context getViewContext() {
        return getContext();
    }

    @Override // X.InterfaceC1126270fPl
    public final int LIZIZ() {
        return this.LLILZ;
    }

    public final int getComboCount() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1126270fPl
    public C1126480fQ6 getComboNumberOptManager() {
        return this.LLJILLL;
    }

    public final EnumC1126060fPQ getComboProgressBarType() {
        return this.LLJILJIL;
    }

    public final int getLongPressComboCount() {
        return this.LLILZIL;
    }

    public final void LJI(boolean z) {
        int i;
        C1126230fPh c1126230fPh = this.LLJILJILJ;
        if (c1126230fPh != null && c1126230fPh.LJIILJJIL != z) {
            c1126230fPh.LJIILJJIL = z;
            C1126240fPi c1126240fPi = c1126230fPh.LJIIL;
            if (c1126240fPi != null) {
                if (z) {
                    i = 0;
                } else {
                    i = 4;
                }
                int visibility = c1126240fPi.getVisibility();
                c1126240fPi.setVisibility(i);
                C1602160rnK.LIZIZ(visibility, i, c1126240fPi);
            }
        }
    }

    public final void setAnimationType(EnumC1123370fL5 enumC1123370fL5) {
        this.LL = enumC1123370fL5;
    }

    public final void setComboProgressBarType(EnumC1126060fPQ enumC1126060fPQ) {
        this.LLJILJIL = enumC1126060fPQ;
    }

    public C1126220fPg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = EnumC1123370fL5.NORMAL;
        InterfaceC1162920gMs interfaceC1162920gMsNt0 = ((IHostPerformanceMonitor) C1161920gLG.LIZJ(IHostPerformanceMonitor.class)).nt0("gift_combo");
        interfaceC1162920gMsNt0.LIZIZ(new C0VVO() { // from class: X.0fL1
            @Override // X.C0VVO
            public final void LIZIZ(double d) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_combo_fluency");
                c474500IjALIZ.LJIIIIZZ();
                c474500IjALIZ.LJJII(Integer.valueOf(this.LIZ.LLILLJJLI), "combo_num");
                c474500IjALIZ.LJJIII("fps", Double.valueOf(d));
                c474500IjALIZ.LJJII(Integer.valueOf(this.LIZ.LL.ordinal()), "combo_type");
                c474500IjALIZ.LJJII(1, "combo_version");
                c474500IjALIZ.LIZ();
            }
        });
        this.LLILLL = interfaceC1162920gMsNt0;
        this.LLIZLLLIL = "others";
        this.LLJ = EnumC1126200fPe.OTHERS;
        this.LLJILJIL = EnumC1126060fPQ.NONE;
        this.LLJILLL = new C1126480fQ6(context, new AwS561S0100000_17(this, 340), new AwS561S0100000_17(this, 170));
        this.LLJILJILJ = new C1126230fPh(this);
    }

    public final boolean LIZJ(GiftGalleryExtra giftGalleryExtra, String str) {
        if (giftGalleryExtra != null && giftGalleryExtra.isOneClickTitle && Intrinsics.LJFF(str, "lynx") && ((int) giftGalleryExtra.leftCountToSponsor) != 0 && this.LL != EnumC1123370fL5.FAST) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) throws JSONException {
        super.onVisibilityChanged(view, i);
        if (i != 4 && i != 8) {
            return;
        }
        if (this.LLJILJILJ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dismissLongPressBubble: isLongPressBubbleShowing ");
            sbLIZ.append(false);
            C20441214yg.LJIIIZ("ComboViewHelperV2", C2188811AlT.LIZIZ(sbLIZ));
            C1113800f5e c1113800f5e = C1113800f5e.LIZ;
            if (C1113800f5e.LJIILIIL()) {
                C1113800f5e.LIZJ(EnumC1120860fH2.GIFT_COMBO_LONG_PRESS);
            }
        }
        if (this.LLIZ) {
            return;
        }
        LIZLLL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0080, code lost:
    
        if (r9 != null) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(X.C1126220fPg r26, java.lang.Runnable r27, java.lang.Runnable r28, long r29, java.lang.Boolean r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, long r35, java.lang.Long r37, com.bytedance.android.live.gift.GiftGalleryExtra r38, X.C1123400fL8 r39, X.C1125860fP6 r40, boolean r41, X.C1126100fPU r42, boolean r43, int r44) {
        /*
            Method dump skipped, instruction units count: 1080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1126220fPg.LJ(X.0fPg, java.lang.Runnable, java.lang.Runnable, long, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, long, java.lang.Long, com.bytedance.android.live.gift.GiftGalleryExtra, X.0fL8, X.0fP6, boolean, X.0fPU, boolean, int):void");
    }
}
