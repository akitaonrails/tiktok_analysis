package X;

import Y.AfS186S0100000_17;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.model.BigCardInfo;
import com.bytedance.android.livesdk.chatroom.model.ClickItem;
import com.bytedance.android.livesdk.chatroom.model.GeckoConfig;
import com.bytedance.android.livesdk.chatroom.model.LogData;
import com.bytedance.android.livesdk.chatroom.model.ShortTouchBusiness;
import com.bytedance.android.livesdk.chatroom.model.ShortTouchConfig;
import com.bytedance.android.livesdk.chatroom.model.SmallCardInfo;
import com.bytedance.android.livesdk.livesetting.shorttouch.LiveShortTouchAnimateSetting;
import com.bytedance.android.livesdk.model.ShortTouchTemplateData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS51S0100100_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ejf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1100170ejf extends AbstractC1101760emE {
    public final ShortTouchBusiness LLIZ;
    public final ShortTouchConfig LLIZLLLIL;
    public final Context LLJ;
    public final Lifecycle LLJI;
    public final Room LLJIJIL;
    public final int LLJILJIL;
    public final String LLJILJILJ;
    public C1100210ejj LLJILLL;
    public AbstractC1098830ehV LLJJ;

    @Override // X.AbstractC1101760emE
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.AbstractC1101760emE
    public final void LJIIJJI() {
    }

    @Override // X.AbstractC1101760emE
    public final String LIZIZ() {
        return this.LLIZ.businessType;
    }

    @Override // X.AbstractC1101760emE
    public final String LIZJ() {
        String strDT1;
        InterfaceC1085330eLj interfaceC1085330eLj = this.LLILZIL;
        return (interfaceC1085330eLj == null || (strDT1 = interfaceC1085330eLj.dT1()) == null) ? "" : strDT1;
    }

    @Override // X.AbstractC1101760emE
    public final long LJ() {
        ShortTouchTemplateData shortTouchTemplateData = this.LLIZ.templateData;
        if (shortTouchTemplateData != null) {
            return shortTouchTemplateData.endTime;
        }
        return 0L;
    }

    @Override // X.AbstractC1101760emE
    public final View LJFF() {
        AbstractC1098830ehV abstractC1098830ehV = this.LLJJ;
        if (abstractC1098830ehV != null) {
            return abstractC1098830ehV;
        }
        C1100210ejj c1100210ejj = this.LLJILLL;
        if (c1100210ejj != null) {
            return c1100210ejj.LIZLLL;
        }
        return null;
    }

    @Override // X.AbstractC1101760emE
    public final int LJIIIIZZ() {
        SmallCardInfo smallCardInfo = this.LLIZLLLIL.smallCardInfo;
        if (smallCardInfo != null) {
            return smallCardInfo.containerType;
        }
        return 0;
    }

    @Override // X.AbstractC1101760emE
    public final void LJIILJJIL() {
        AbstractC1098830ehV abstractC1098830ehV = this.LLJJ;
        if (abstractC1098830ehV != null) {
            abstractC1098830ehV.LJIIIZ();
        }
        C1100210ejj c1100210ejj = this.LLJILLL;
        if (c1100210ejj != null) {
            c1100210ejj.LJ.dispose();
            c1100210ejj.LJ.LJ();
        }
    }

    @Override // X.AbstractC1101760emE
    public final String LJIILL() {
        return this.LLIZ.subBusinessType;
    }

    @Override // X.AbstractC1101760emE
    public final String LJIILLIIL() {
        String str;
        SmallCardInfo smallCardInfo = this.LLIZLLLIL.smallCardInfo;
        return (smallCardInfo == null || (str = smallCardInfo.containerSchema) == null) ? "" : str;
    }

    public final String LJIJ() throws JSONException {
        String strLJIILL;
        String strLJIILL2;
        String strLJIILL3;
        Map<String, String> map;
        List<ClickItem> list;
        LogData logData;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("short_touch_name", this.LLIZ.subBusinessType);
        ShortTouchTemplateData shortTouchTemplateData = this.LLIZ.templateData;
        jSONObject.put("business_id", shortTouchTemplateData != null ? shortTouchTemplateData.businessId : null);
        JSONObject jSONObject2 = new JSONObject();
        SmallCardInfo smallCardInfo = this.LLIZLLLIL.smallCardInfo;
        jSONObject2.put("img_url", smallCardInfo != null ? smallCardInfo.imgUrl : null);
        jSONObject2.put("background_color", "");
        SmallCardInfo smallCardInfo2 = this.LLIZLLLIL.smallCardInfo;
        jSONObject2.put("enter_animate_lottie_url", smallCardInfo2 != null ? smallCardInfo2.enterAnimateLottieUrl : null);
        SmallCardInfo smallCardInfo3 = this.LLIZLLLIL.smallCardInfo;
        jSONObject2.put("enter_img_url", smallCardInfo3 != null ? smallCardInfo3.enterImgUrl : null);
        SmallCardInfo smallCardInfo4 = this.LLIZLLLIL.smallCardInfo;
        jSONObject2.put("end_animate_lottie_url", smallCardInfo4 != null ? smallCardInfo4.endAnimateLottieUrl : null);
        SmallCardInfo smallCardInfo5 = this.LLIZLLLIL.smallCardInfo;
        jSONObject2.put("end_img_url", smallCardInfo5 != null ? smallCardInfo5.endImgUrl : null);
        jSONObject2.put("short_touch_type", this.LLIZLLLIL.shortTouchType);
        jSONObject2.put("dynamic_url", this.LLIZLLLIL.dynamicUrl);
        jSONObject2.put("resource_url", this.LLIZLLLIL.resourceUrl);
        SmallCardInfo smallCardInfo6 = this.LLIZLLLIL.smallCardInfo;
        if (smallCardInfo6 == null || (logData = smallCardInfo6.logData) == null) {
            strLJIILL = null;
        } else {
            try {
                strLJIILL = C19748512Ol.LIZIZ.LJIILL(logData);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                strLJIILL = "";
            }
        }
        jSONObject2.put("log_data", strLJIILL);
        jSONObject2.put("resource_load_strategy", this.LLIZLLLIL.resourceLoadStrategy);
        SmallCardInfo smallCardInfo7 = this.LLIZLLLIL.smallCardInfo;
        if (smallCardInfo7 == null || (list = smallCardInfo7.clickConfig) == null) {
            strLJIILL2 = null;
        } else {
            try {
                strLJIILL2 = C19748512Ol.LIZIZ.LJIILL(list);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                strLJIILL2 = "";
            }
        }
        jSONObject2.put("click_config", strLJIILL2);
        SmallCardInfo smallCardInfo8 = this.LLIZLLLIL.smallCardInfo;
        jSONObject2.put("render_config", smallCardInfo8 != null ? smallCardInfo8.renderConfig : null);
        SmallCardInfo smallCardInfo9 = this.LLIZLLLIL.smallCardInfo;
        if (smallCardInfo9 == null || (map = smallCardInfo9.extra) == null) {
            strLJIILL3 = null;
        } else {
            try {
                strLJIILL3 = C19748512Ol.LIZIZ.LJIILL(map);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                strLJIILL3 = "";
            }
        }
        jSONObject2.put("extra", strLJIILL3);
        jSONObject2.put("time_diff", C963140bAe.LIZLLL);
        jSONObject.put("static_data", C786410Ut5.J3(jSONObject2));
        JSONObject jSONObject3 = new JSONObject();
        ShortTouchTemplateData shortTouchTemplateData2 = this.LLIZ.templateData;
        jSONObject3.put("count", shortTouchTemplateData2 != null ? Integer.valueOf(shortTouchTemplateData2.businessCount) : null);
        ShortTouchTemplateData shortTouchTemplateData3 = this.LLIZ.templateData;
        jSONObject3.put("has_interacted", shortTouchTemplateData3 != null ? Integer.valueOf(shortTouchTemplateData3.hasInteracted) : null);
        ShortTouchTemplateData shortTouchTemplateData4 = this.LLIZ.templateData;
        jSONObject3.put("send_user_id", shortTouchTemplateData4 != null ? shortTouchTemplateData4.sendUserId : null);
        ShortTouchTemplateData shortTouchTemplateData5 = this.LLIZ.templateData;
        jSONObject3.put("end_time", shortTouchTemplateData5 != null ? Long.valueOf(shortTouchTemplateData5.endTime) : null);
        jSONObject3.put("extra_from_client", "");
        jSONObject3.put("business_data", this.LLIZ.customPayload);
        ShortTouchTemplateData shortTouchTemplateData6 = this.LLIZ.templateData;
        jSONObject3.put("log_params", shortTouchTemplateData6 != null ? shortTouchTemplateData6.logParams : null);
        jSONObject.put("dynamic_data", C786410Ut5.J3(jSONObject3));
        jSONObject.put("live_short_touch_animax", LiveShortTouchAnimateSetting.INSTANCE.value());
        return C786410Ut5.J3(jSONObject);
    }

    @Override // X.AbstractC1101760emE
    public final void LJIIIZ() {
        AbstractC1098830ehV abstractC1098830ehV;
        long jCurrentTimeMillis = System.currentTimeMillis();
        final C1100210ejj c1100210ejj = this.LLJILLL;
        if (c1100210ejj != null) {
            final AwS51S0100100_17 awS51S0100100_17 = new AwS51S0100100_17(this, jCurrentTimeMillis, 6);
            final AwS596S0100000_17 awS596S0100000_17 = new AwS596S0100000_17(this, 592);
            BigCardInfo bigCardInfo = c1100210ejj.LIZ;
            Integer numValueOf = bigCardInfo != null ? Integer.valueOf(bigCardInfo.contentType) : null;
            if (numValueOf != null) {
                if (numValueOf.intValue() == 0) {
                    c1100210ejj.LIZLLL = new C1324720kZq(c1100210ejj.LIZJ);
                } else if (numValueOf.intValue() == 1) {
                    C1295960jpS c1295960jpS = new C1295960jpS(c1100210ejj.LIZJ);
                    C786410Ut5.s6(c1295960jpS, new LinearLayout.LayoutParams(C439101nJ.LIZ(72), C439101nJ.LIZ(72)));
                    c1100210ejj.LIZLLL = c1295960jpS;
                }
            }
            String str = c1100210ejj.LIZIZ;
            if (str != null) {
                ImageModel imageModel = new ImageModel();
                imageModel.setUrls(Collections.singletonList(str));
                c1100210ejj.LJ.LIZ(C1121670fIL.LJ(imageModel).LJJLL(new AfS186S0100000_17(c1100210ejj, 153), new C09JN() { // from class: X.00N9
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("PreviewCardView@c242.createViewAndDownloadRes$2$3");
                        C1C7U.LIZIZ("PreviewCardView@c242.createViewAndDownloadRes$2$3");
                    }
                }));
            }
            BigCardInfo bigCardInfo2 = c1100210ejj.LIZ;
            if (bigCardInfo2 != null) {
                int i = bigCardInfo2.resourceType;
                if (i == 0) {
                    String str2 = bigCardInfo2.url;
                    if (str2 != null && c1100210ejj.LIZJ != null) {
                        C1324610kZf url = C1819620xS4.LIZ().setUrl(str2);
                        url.LJIL = false;
                        url.LJJ = Boolean.FALSE;
                        url.LJIIL = new InterfaceC1142670fqD() { // from class: X.0ejg
                            @Override // X.InterfaceC1142670fqD
                            public final void LIZ() {
                            }

                            @Override // X.InterfaceC1142670fqD
                            public final void LIZIZ(Animatable animatable) {
                            }

                            @Override // X.InterfaceC1142670fqD
                            public final void LIZLLL(String str3, Exception exc) {
                                awS596S0100000_17.invoke(String.valueOf(exc));
                            }

                            @Override // X.InterfaceC1142670fqD
                            public final void LIZJ(int i2, int i3, String str3) {
                                awS51S0100100_17.invoke(c1100210ejj.LIZLLL);
                            }
                        };
                        url.LJIJJ = ImageView.ScaleType.CENTER_CROP;
                        url.LJJI(c1100210ejj.LIZLLL);
                    }
                } else if (i == 1) {
                    GeckoConfig geckoConfig = bigCardInfo2.gecko;
                    int i2 = bigCardInfo2.contentType;
                    if (geckoConfig != null && geckoConfig.channel != null && geckoConfig.file != null && c1100210ejj.LIZJ != null) {
                        if (i2 == 0) {
                            C1143680frq.LJFF(c1100210ejj.LIZLLL, geckoConfig.channel, geckoConfig.file, ImageView.ScaleType.CENTER_CROP, new InterfaceC1142670fqD() { // from class: X.0ejh
                                @Override // X.InterfaceC1142670fqD
                                public final void LIZ() {
                                }

                                @Override // X.InterfaceC1142670fqD
                                public final void LIZIZ(Animatable animatable) {
                                }

                                @Override // X.InterfaceC1142670fqD
                                public final void LIZLLL(String str3, Exception exc) {
                                    awS596S0100000_17.invoke(String.valueOf(exc));
                                }

                                @Override // X.InterfaceC1142670fqD
                                public final void LIZJ(int i3, int i4, String str3) {
                                    awS51S0100100_17.invoke(c1100210ejj.LIZLLL);
                                }
                            });
                        } else if (i2 == 1) {
                            if (!(c1100210ejj.LIZLLL instanceof C1295960jpS)) {
                                C1295960jpS c1295960jpS2 = new C1295960jpS(c1100210ejj.LIZJ);
                                C786410Ut5.s6(c1295960jpS2, new LinearLayout.LayoutParams(C439101nJ.LIZ(72), C439101nJ.LIZ(72)));
                                c1100210ejj.LIZLLL = c1295960jpS2;
                            }
                            C1143680frq.LJIILL((C1295960jpS) c1100210ejj.LIZLLL, geckoConfig.channel, geckoConfig.file, false, new InterfaceC1143790fs1() { // from class: X.0eji
                                @Override // X.InterfaceC1143790fs1
                                public final void onFinish(boolean z) {
                                    if (z) {
                                        awS51S0100100_17.invoke(c1100210ejj.LIZLLL);
                                    } else {
                                        awS596S0100000_17.invoke("");
                                    }
                                }
                            });
                        }
                    }
                }
            }
        }
        if (this.LLIZLLLIL.resourceLoadStrategy == 1 && (abstractC1098830ehV = this.LLJJ) != null) {
            abstractC1098830ehV.LJI(null);
        }
        InterfaceC1085330eLj interfaceC1085330eLj = this.LLILZIL;
        if (interfaceC1085330eLj != null) {
            interfaceC1085330eLj.LLLZI();
        }
    }

    @Override // X.AbstractC1101760emE
    public final void LJIILIIL() {
        super.LJIILIIL();
        AbstractC1098830ehV abstractC1098830ehV = this.LLJJ;
        if (abstractC1098830ehV != null) {
            abstractC1098830ehV.LJIIIZ();
        }
        C1100210ejj c1100210ejj = this.LLJILLL;
        if (c1100210ejj != null) {
            c1100210ejj.LJ.dispose();
            c1100210ejj.LJ.LJ();
        }
        this.LLJJ = null;
        this.LLJILLL = null;
    }

    @Override // X.AbstractC1101760emE
    public final InterfaceC1101940emW LIZ(ViewGroup viewGroup, boolean z) {
        return new C1100160eje(this, viewGroup, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1100170ejf(com.bytedance.android.livesdk.chatroom.model.ShortTouchBusiness r7, com.bytedance.android.livesdk.chatroom.model.ShortTouchConfig r8, android.content.Context r9, androidx.lifecycle.Lifecycle r10, X.AbstractC1086990eOP r11, com.bytedance.android.livesdkapi.depend.model.live.Room r12, kotlin.jvm.internal.AwS666S0100000_17 r13) {
        /*
            r6 = this;
            java.util.Map r0 = X.C2097608Jq.LJ()
            r6.<init>(r0, r13)
            r6.LLIZ = r7
            r6.LLIZLLLIL = r8
            r6.LLJ = r9
            r6.LLJI = r10
            r6.LLJIJIL = r12
            r0 = 3
            r6.LLJILJIL = r0
            java.lang.String r0 = "ShortTouchModel"
            r6.LLJILJILJ = r0
            com.bytedance.android.livesdk.chatroom.model.SmallCardInfo r0 = r8.smallCardInfo
            if (r0 == 0) goto L27
            java.lang.String r1 = r0.containerSchema
            if (r1 == 0) goto L27
            com.bytedance.android.livesdk.shorttouch.model.ShortTouchModel$initSmallCardView$1 r0 = new com.bytedance.android.livesdk.shorttouch.model.ShortTouchModel$initSmallCardView$1
            r0.<init>(r6, r1)
            r6.LLILZIL = r0
        L27:
            com.bytedance.android.livesdk.chatroom.model.BigCardInfo r5 = r8.bigCardInfo
            r4 = 0
            if (r5 == 0) goto L7d
            java.lang.String r3 = r5.url
            r1 = 2
            r2 = 1
            if (r5 == 0) goto L7d
            int r0 = r5.resourceType
            if (r0 != r1) goto L78
            if (r3 == 0) goto L76
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r3)
            java.lang.String r0 = r6.LJII()
            X.0emK r0 = X.C1101750emD.LIZIZ(r0)
            if (r0 == 0) goto L48
            r0.LJI = r2
        L48:
            java.lang.Class<com.bytedance.android.live.browser.IBrowserService> r0 = com.bytedance.android.live.browser.IBrowserService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.browser.IBrowserService r0 = (com.bytedance.android.live.browser.IBrowserService) r0
            X.0ehV r4 = r0.vc1(r1, r4, r9)
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r2 = 1116471296(0x428c0000, float:70.0)
            float r0 = X.C497740JfY.LIZIZ(r2)
            int r1 = (int) r0
            float r0 = X.C497740JfY.LIZIZ(r2)
            int r0 = (int) r0
            r3.<init>(r1, r0)
            X.ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r4)
            r4.setLayoutParams(r3)
            X.0ehk r0 = new X.0ehk
            r0.<init>()
            r4.setLoadCallback(r0)
            r6.LLJJ = r4
            return
        L76:
            if (r5 == 0) goto L7d
        L78:
            int r0 = r5.resourceType
            if (r0 != r1) goto L7d
            return
        L7d:
            X.0ejj r1 = new X.0ejj
            com.bytedance.android.livesdk.model.ShortTouchTemplateData r0 = r7.templateData
            if (r0 == 0) goto L85
            java.lang.String r4 = r0.bigCardLottieImgUrl
        L85:
            r1.<init>(r5, r4, r9)
            r6.LLJILLL = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1100170ejf.<init>(com.bytedance.android.livesdk.chatroom.model.ShortTouchBusiness, com.bytedance.android.livesdk.chatroom.model.ShortTouchConfig, android.content.Context, androidx.lifecycle.Lifecycle, X.0eOP, com.bytedance.android.livesdkapi.depend.model.live.Room, kotlin.jvm.internal.AwS666S0100000_17):void");
    }
}
