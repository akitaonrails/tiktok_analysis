package X;

import Y.AObjectS244S0100000_18;
import Y.AObjectS246S0100000_25;
import Y.AObjectS306S0200000_25;
import Y.ARunnableS43S0400000_35;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.bytedance.ies.effecteditor.swig.UIAnnotationUIType;
import com.bytedance.ies.effecteditor.swig.UIAnnotationUpdateType;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.creative.model.stickers.MusicAndTimeModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tQj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1665030tQj extends AbstractC1622390sJx implements InterfaceC1159800gHq {
    public final InterfaceC332260D0u<InterfaceC1157420gE0> LLILLJJLI;
    public final InterfaceC332260D0u<InterfaceC1665180tQy> LLILLL;
    public final ShortVideoContext LLILZ;
    public final InterfaceC1628590sTx LLILZIL;
    public final Function0<Unit> LLILZLL;
    public final InterfaceC1652470t6T LLIZ;
    public final InterfaceC332260D0u<Long> LLIZLLLIL;
    public final Function0<Unit> LLJ;
    public final C2252321DDq LLJI = C1BNE.LIZ(Boolean.FALSE);
    public final C1665050tQl LLJIJIL;
    public final LiveEvent<C531060KsC> LLJILJIL;
    public final C385670FAf<Boolean> LLJILJILJ;
    public final C2252321DDq LLJILLL;
    public Effect LLJJ;
    public final C2252321DDq LLJJI;
    public String LLJJIII;

    @Override // X.InterfaceC1159800gHq
    public final void LJI() {
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        this.LLILLJJLI.setValue(C1157430gE1.LIZ);
        this.LLILLL.setValue(C1665160tQw.LIZ);
        this.LLJJ = null;
        this.LLJILLL.setValue(C1154060g8a.LIZ);
        this.LLIZLLLIL.setValue(null);
        if (LJJIJIIJIL()) {
            this.LLILZ.creativeModel.musicAndTimeModel = null;
        }
        C1665050tQl c1665050tQl = this.LLJIJIL;
        c1665050tQl.LIZIZ = null;
        c1665050tQl.LIZJ = null;
    }

    public final void LJJIIJ() {
        C0V0B c0v0a;
        String str;
        InterfaceC1157420gE0 value = this.LLILLJJLI.getValue();
        boolean z = value instanceof C1157410gDz;
        if ((z && ((C1157410gDz) value).LIZIZ == EnumC1154770g9j.RECORD_PANEL) || ((value instanceof C1157400gDy) && ((C1157400gDy) value).LIZIZ == EnumC1154770g9j.RECORD_PANEL)) {
            this.LLJ.invoke();
        }
        if (z) {
            this.LLJIJIL.LIZ("click_remix_met_template_effect", true);
        } else if (value instanceof C1157400gDy) {
            this.LLJIJIL.LIZ("click_try_met_template", false);
        }
        InterfaceC1652470t6T interfaceC1652470t6T = this.LLIZ;
        if (interfaceC1652470t6T != null) {
            interfaceC1652470t6T.rZ0(null, false);
        }
        this.LLILLJJLI.setValue(C1157430gE1.LIZ);
        InterfaceC332260D0u<InterfaceC1665180tQy> interfaceC332260D0u = this.LLILLL;
        this.LLJIJIL.LIZ("show_add_sound_met_template", false);
        this.LLJJIII = null;
        MusicAndTimeModel musicAndTimeModel = (MusicAndTimeModel) this.LLJJI.getValue();
        boolean zLJJJJZI = this.LLILZ.LJJJJZI();
        if (zLJJJJZI) {
            MusicObject musicObject = this.LLILZ.creativeModel.musicBuzModel.music;
            if (musicObject == null || (str = musicObject.musicName) == null) {
                str = "";
            }
            c0v0a = new C0V0A(str);
        } else {
            c0v0a = C0V0C.LIZ;
        }
        interfaceC332260D0u.setValue(new C1665070tQn(new C1665110tQr(2131821857, c0v0a, LJJIIZ(zLJJJJZI, musicAndTimeModel)), new C1665040tQk(this), new AwS569S0100000_25(this, 850), new AwS569S0100000_25(this, 851), new AwS569S0100000_25(this, 848)));
    }

    public final String LJJIJ() {
        MusicObject musicObject = this.LLILZ.creativeModel.musicBuzModel.music;
        if (musicObject != null) {
            return MusicBeanUtilKt.getMusicId(musicObject);
        }
        return null;
    }

    public final String LJJIJIIJI() {
        return String.valueOf((this.LLILZ.LJIILIIL() / 2) / LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public final boolean LJJIJIIJIL() {
        return !this.LLJILJILJ.LIZJ().booleanValue();
    }

    public final boolean LJJIL() {
        float f;
        String str = ((MusicAndTimeModel) this.LLJJI.getValue()).timeStamp;
        try {
            f = CastFloatProtector.parseFloat(str);
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            f = 0.0f;
        }
        Pair pair = f > ((float) this.LLILZ.LJIILIIL()) / ((float) LSPassThroughRecordSizeConfig.DEFAULT) ? new Pair(LJJIJIIJI(), Boolean.TRUE) : new Pair(str, Boolean.FALSE);
        String str2 = (String) pair.getFirst();
        boolean zBooleanValue = ((Boolean) pair.getSecond()).booleanValue();
        this.LLJJI.setValue(new MusicAndTimeModel(LJJIJ(), str2, false));
        return zBooleanValue;
    }

    public final void LJJIJLIJ() {
        C1665070tQn c1665070tQn;
        C0V0B c0v0a;
        String str;
        if (LJJIJIIJIL()) {
            if (this.LLJJ == null) {
                this.LLILZ.creativeModel.musicAndTimeModel = null;
                return;
            }
            LJJIJIL(LJJIL());
            InterfaceC1665180tQy value = this.LLILLL.getValue();
            if (!(value instanceof C1665070tQn) || (c1665070tQn = (C1665070tQn) value) == null) {
                return;
            }
            MusicAndTimeModel musicAndTimeModel = (MusicAndTimeModel) this.LLJJI.getValue();
            boolean zLJJJJZI = this.LLILZ.LJJJJZI();
            if (zLJJJJZI) {
                MusicObject musicObject = this.LLILZ.creativeModel.musicBuzModel.music;
                if (musicObject == null || (str = musicObject.musicName) == null) {
                    str = "";
                }
                c0v0a = new C0V0A(str);
            } else {
                c0v0a = C0V0C.LIZ;
            }
            InterfaceC332260D0u<InterfaceC1665180tQy> interfaceC332260D0u = this.LLILLL;
            C1665110tQr c1665110tQr = c1665070tQn.LIZ;
            C1665120tQs c1665120tQsLJJIIZ = LJJIIZ(zLJJJJZI, musicAndTimeModel);
            int i = c1665110tQr.LIZ;
            c1665110tQr.getClass();
            interfaceC332260D0u.setValue(C1665070tQn.LIZ(c1665070tQn, new C1665110tQr(i, c0v0a, c1665120tQsLJJIIZ)));
        }
    }

    public static String LJJIIZI(double d) {
        double d2 = 10 * 1.0f;
        double dRint = Math.rint((d / 1000.0d) * d2) / d2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(dRint);
        sbLIZ.append('s');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1159800gHq
    public final void LIZLLL(EnumC1155090gAF enumC1155090gAF) {
        EnumC1154770g9j enumC1154770g9j;
        this.LLJI.setValue(Boolean.TRUE);
        InterfaceC332260D0u<InterfaceC1157420gE0> interfaceC332260D0u = this.LLILLJJLI;
        if (((Boolean) this.LLJI.getValue()).booleanValue()) {
            enumC1154770g9j = EnumC1154770g9j.EFFECT_PANEL;
        } else {
            enumC1154770g9j = EnumC1154770g9j.RECORD_PANEL;
        }
        interfaceC332260D0u.setValue(LJJIJL(enumC1154770g9j));
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIIZ(View view) {
        ComposeView composeView = (ComposeView) view.findViewById(R.id.gx3);
        if (composeView != null) {
            C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(1165842361, new AwS639S0100000_25(this, 106), true));
        }
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIZILJ(EnumC1155090gAF enumC1155090gAF) {
        EnumC1154770g9j enumC1154770g9j;
        this.LLILLL.setValue(C1665160tQw.LIZ);
        this.LLJI.setValue(Boolean.FALSE);
        InterfaceC332260D0u<InterfaceC1157420gE0> interfaceC332260D0u = this.LLILLJJLI;
        if (((Boolean) this.LLJI.getValue()).booleanValue()) {
            enumC1154770g9j = EnumC1154770g9j.EFFECT_PANEL;
        } else {
            enumC1154770g9j = EnumC1154770g9j.RECORD_PANEL;
        }
        interfaceC332260D0u.setValue(LJJIJL(enumC1154770g9j));
    }

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        return C1449600npG.LJI(c1627370sRz.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C19457311Al LJJIIJZLJL(float r15) {
        /*
            r14 = this;
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r14.LLILZ
            com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean r0 = r0.musicWaveBean
            com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean r10 = X.C15R5.LIZIZ(r0)
            java.lang.String r0 = r14.LLJJIII     // Catch: java.lang.NumberFormatException -> L1c
            if (r0 == 0) goto L20
            float r1 = com.bytedance.mt.protector.impl.string2number.CastFloatProtector.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L1c
            r0 = 1000(0x3e8, float:1.401E-42)
            float r0 = (float) r0     // Catch: java.lang.NumberFormatException -> L1c
            float r1 = r1 * r0
            long r0 = (long) r1     // Catch: java.lang.NumberFormatException -> L1c
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L1c
            if (r0 == 0) goto L20
            goto L31
        L1c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L20:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r14.LLILZ
            long r2 = r0.LJIILJJIL()
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r14.LLILZ
            long r0 = r0.LJIILIIL()
            long r2 = r2 + r0
            float r0 = (float) r2
            float r0 = r0 * r15
            long r12 = (long) r0
            goto L35
        L31:
            long r12 = r0.longValue()
        L35:
            X.11Al r1 = new X.11Al
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r14.LLILZ
            long r2 = r0.LJII()
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r14.LLILZ
            long r4 = r0.LJIILJJIL()
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r14.LLILZ
            int r0 = r0.LJIIJ()
            long r6 = (long) r0
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r14.LLILZ
            long r8 = r0.LJIILIIL()
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r14.LLILZ
            com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r0 = r0.cameraComponentModel
            java.lang.String r11 = r0.mMusicPath
            r1.<init>(r2, r4, r6, r8, r10, r11, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1665030tQj.LJJIIJZLJL(float):X.11Al");
    }

    public final void LJJIJIL(boolean z) {
        float f;
        Effect effect;
        AbstractC1665240tR4<?, ?>[] abstractC1665240tR4ArrLIZ;
        C1DPC c1dpc;
        MusicAndTimeModel musicAndTimeModel = (MusicAndTimeModel) this.LLJJI.getValue();
        if (LJJIJIIJIL()) {
            String json = GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), musicAndTimeModel);
            if (z && (effect = this.LLJJ) != null) {
                C1665200tR0.LIZ.getClass();
                C1DPK c1dpkLIZIZ = C1665200tR0.LIZIZ(effect);
                if (c1dpkLIZIZ != null && (abstractC1665240tR4ArrLIZ = c1dpkLIZIZ.LIZ(UIAnnotationUIType.UIAnnotationUIType_TextInput)) != null) {
                    AbstractC1665240tR4<?, ?> abstractC1665240tR4 = abstractC1665240tR4ArrLIZ[0];
                    if ((abstractC1665240tR4 instanceof C1DPC) && (c1dpc = (C1DPC) abstractC1665240tR4) != null) {
                        UIAnnotationUpdateType uIAnnotationUpdateType = UIAnnotationUpdateType.UIAnnotationUpdateType_Done;
                        C1DO8 c1do8 = new C1DO8() { // from class: X.0tQv
                            @Override // X.C1DO7
                            public final void LIZ(UIAnnotationErrorCode uIAnnotationErrorCode) {
                            }

                            @Override // X.C1DO9
                            public final void onSuccess() {
                            }
                        };
                        C1DOD.LIZ();
                        C823050WQl.LIZJ().execute(new ARunnableS43S0400000_35(c1dpc, json, uIAnnotationUpdateType, c1do8, 7));
                    }
                }
            }
            this.LLILZ.creativeModel.musicAndTimeModel = musicAndTimeModel;
            InterfaceC1154050g8Z interfaceC1154050g8Z = (InterfaceC1154050g8Z) this.LLJILLL.getValue();
            if ((interfaceC1154050g8Z instanceof C1154040g8Y) && z) {
                this.LLJILLL.setValue(new C1154040g8Y(true, ((C1154040g8Y) interfaceC1154050g8Z).LIZIZ));
            }
            InterfaceC332260D0u<Long> interfaceC332260D0u = this.LLIZLLLIL;
            try {
                f = CastFloatProtector.parseFloat(musicAndTimeModel.timeStamp);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                f = 0.0f;
            }
            interfaceC332260D0u.setValue(Long.valueOf((long) (f * LSPassThroughRecordSizeConfig.DEFAULT)));
        }
    }

    public final InterfaceC1157420gE0 LJJIJL(EnumC1154770g9j enumC1154770g9j) {
        InterfaceC1154050g8Z interfaceC1154050g8Z = (InterfaceC1154050g8Z) this.LLJILLL.getValue();
        if (C1444560nh8.LIZ() && (interfaceC1154050g8Z instanceof C1154040g8Y) && ((C1154040g8Y) interfaceC1154050g8Z).LIZIZ) {
            return C1157430gE1.LIZ;
        }
        if (LJJIJIIJIL() && !(this.LLILLL.getValue() instanceof C1665070tQn)) {
            if (Intrinsics.LJFF(interfaceC1154050g8Z, C1154060g8a.LIZ)) {
                return C1157430gE1.LIZ;
            }
            if (interfaceC1154050g8Z instanceof C1154040g8Y) {
                C1154040g8Y c1154040g8Y = (C1154040g8Y) interfaceC1154050g8Z;
                int i = 2131821852;
                if (c1154040g8Y.LIZIZ) {
                    if (!c1154040g8Y.LIZ) {
                        i = 2131821851;
                    }
                    return new C1157410gDz(i, enumC1154770g9j);
                }
                if (c1154040g8Y.LIZ) {
                    return new C1157410gDz(2131821852, enumC1154770g9j);
                }
                return new C1157400gDy(2131821850, enumC1154770g9j);
            }
            return C1157430gE1.LIZ;
        }
        return C1157430gE1.LIZ;
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        EnumC1154770g9j enumC1154770g9j;
        InterfaceC1157420gE0 c1157400gDy;
        if (!LJJIJIIJIL()) {
            return;
        }
        Effect effect = c1627370sRz.LIZ;
        String strLJFF = DiyPropParser.LJFF(effect);
        if (strLJFF.length() == 0) {
            strLJFF = effect.getResourceId();
        }
        C1665130tQt c1665130tQt = new C1665130tQt(strLJFF, effect.getName());
        C1665050tQl c1665050tQl = this.LLJIJIL;
        c1665050tQl.LIZIZ = c1665130tQt;
        c1665050tQl.LIZJ = effect;
        if (((Boolean) this.LLJI.getValue()).booleanValue()) {
            enumC1154770g9j = EnumC1154770g9j.EFFECT_PANEL;
        } else {
            enumC1154770g9j = EnumC1154770g9j.RECORD_PANEL;
        }
        InterfaceC332260D0u<InterfaceC1157420gE0> interfaceC332260D0u = this.LLILLJJLI;
        if (DiyPropParser.LJIIJJI(effect)) {
            if (C1444560nh8.LIZ()) {
                c1157400gDy = C1157430gE1.LIZ;
            } else {
                c1157400gDy = new C1157410gDz(2131821851, enumC1154770g9j);
            }
        } else {
            c1157400gDy = new C1157400gDy(2131821850, enumC1154770g9j);
        }
        interfaceC332260D0u.setValue(c1157400gDy);
        this.LLJJ = effect;
        C1665200tR0.LIZ.getClass();
        MusicAndTimeModel musicAndTimeModelLIZ = C1665200tR0.LIZ(effect);
        if (musicAndTimeModelLIZ != null) {
            this.LLJJIII = musicAndTimeModelLIZ.timeStamp;
            this.LLJJI.setValue(musicAndTimeModelLIZ);
        } else {
            this.LLJJIII = LJJIJIIJI();
        }
        C1665200tR0.LIZ(effect);
        LJJIJIL(LJJIL());
        this.LLJILLL.setValue(new C1154040g8Y(false, DiyPropParser.LJIIJJI(effect)));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1665120tQs LJJIIZ(boolean r12, com.ss.android.ugc.aweme.creative.model.stickers.MusicAndTimeModel r13) {
        /*
            r11 = this;
            com.bytedance.als.LiveEvent<X.0KsC> r0 = r11.LLJILJIL
            java.lang.Object r0 = r0.LJI()
            X.0KsC r0 = (X.C531060KsC) r0
            if (r0 == 0) goto L19
            long r2 = r0.LIZ
        Lc:
            if (r12 == 0) goto L46
            X.0tQl r4 = r11.LLJIJIL
            r1 = 0
            java.lang.String r0 = "show_choose_start_point_met_template"
            r4.LIZ(r0, r1)
            r10 = 1000(0x3e8, float:1.401E-42)
            goto L20
        L19:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r11.LLILZ
            long r2 = r0.LJIILIIL()
            goto Lc
        L20:
            java.lang.String r0 = r11.LLJJIII     // Catch: java.lang.NumberFormatException -> L32
            if (r0 == 0) goto L36
            float r1 = com.bytedance.mt.protector.impl.string2number.CastFloatProtector.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L32
            float r0 = (float) r10     // Catch: java.lang.NumberFormatException -> L32
            float r1 = r1 * r0
            long r0 = (long) r1     // Catch: java.lang.NumberFormatException -> L32
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L32
            if (r0 == 0) goto L36
            goto L49
        L32:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L36:
            java.lang.String r0 = r13.timeStamp     // Catch: java.lang.NumberFormatException -> L3d
            float r1 = com.bytedance.mt.protector.impl.string2number.CastFloatProtector.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L3d
            goto L42
        L3d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r1 = 0
        L42:
            float r0 = (float) r10
            float r1 = r1 * r0
            long r4 = (long) r1
            goto L4d
        L46:
            X.0tQx r6 = X.C1665170tQx.LIZ
            goto L62
        L49:
            long r4 = r0.longValue()
        L4d:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L78
            float r7 = (float) r4
            float r0 = (float) r2
            float r7 = r7 / r0
            X.0tQm r6 = new X.0tQm
            double r0 = (double) r4
            java.lang.String r1 = LJJIIZI(r0)
            X.11Al r0 = r11.LJJIIJZLJL(r7)
            r6.<init>(r1, r7, r0)
        L62:
            X.0tQs r7 = new X.0tQs
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r11.LLILZ
            long r4 = r0.LJII()
            double r0 = (double) r4
            java.lang.String r4 = LJJIIZI(r0)
            double r0 = (double) r2
            java.lang.String r0 = LJJIIZI(r0)
            r7.<init>(r4, r0, r6)
            return r7
        L78:
            double r4 = (double) r2
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = r4 / r0
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r11.LLILZ
            long r6 = r0.LJII()
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r11.LLILZ
            long r8 = r0.LJIILIIL()
            long r8 = r8 - r6
            float r1 = (float) r8
            r8 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r8
            float r0 = (float) r6
            float r1 = r1 + r0
            float r0 = (float) r10
            float r1 = r1 / r0
            java.lang.String r7 = java.lang.String.valueOf(r1)
            java.lang.String r6 = r11.LJJIJ()
            if (r6 == 0) goto La6
            com.ss.android.ugc.aweme.creative.model.stickers.MusicAndTimeModel r1 = new com.ss.android.ugc.aweme.creative.model.stickers.MusicAndTimeModel
            r0 = 0
            r1.<init>(r6, r7, r0)
            X.1DDq r0 = r11.LLJJI
            r0.setValue(r1)
        La6:
            X.0tQm r6 = new X.0tQm
            java.lang.String r1 = LJJIIZI(r4)
            X.11Al r0 = r11.LJJIIJZLJL(r8)
            r6.<init>(r1, r8, r0)
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1665030tQj.LJJIIZ(boolean, com.ss.android.ugc.aweme.creative.model.stickers.MusicAndTimeModel):X.0tQs");
    }

    public C1665030tQj(InterfaceC332260D0u interfaceC332260D0u, InterfaceC332260D0u interfaceC332260D0u2, C560530Lyd c560530Lyd, ShortVideoContext shortVideoContext, LifecycleOwner lifecycleOwner, InterfaceC1628590sTx interfaceC1628590sTx, C1623380sLY c1623380sLY, InterfaceC1652470t6T interfaceC1652470t6T, InterfaceC1648570t0B interfaceC1648570t0B, InterfaceC332260D0u interfaceC332260D0u3, AwS569S0100000_25 awS569S0100000_25) {
        this.LLILLJJLI = interfaceC332260D0u;
        this.LLILLL = interfaceC332260D0u2;
        this.LLILZ = shortVideoContext;
        this.LLILZIL = interfaceC1628590sTx;
        this.LLILZLL = c1623380sLY;
        this.LLIZ = interfaceC1652470t6T;
        this.LLIZLLLIL = interfaceC332260D0u3;
        this.LLJ = awS569S0100000_25;
        this.LLJIJIL = new C1665050tQl(shortVideoContext);
        LiveEvent<C531060KsC> liveEventBp2 = interfaceC1648570t0B.Bp2();
        this.LLJILJIL = liveEventBp2;
        C385670FAf<Boolean> c385670FAfEc = interfaceC1648570t0B.ec();
        this.LLJILJILJ = c385670FAfEc;
        this.LLJILLL = C1BNE.LIZ(C1154060g8a.LIZ);
        this.LLJJI = C1BNE.LIZ(new MusicAndTimeModel(LJJIJ(), LJJIJIIJI(), false));
        interfaceC1648570t0B.isRecording().LIZ(lifecycleOwner, new AObjectS244S0100000_18(this, 27));
        interfaceC1648570t0B.lC2().LIZ(lifecycleOwner, new AObjectS244S0100000_18(this, 28));
        c385670FAfEc.LIZ(lifecycleOwner, new AObjectS306S0200000_25((Object) interfaceC1648570t0B, (Object) this, (InterfaceC1648570t0B) 28));
        liveEventBp2.LIZ(lifecycleOwner, new AObjectS246S0100000_25(this, 705));
        c560530Lyd.LIZ(lifecycleOwner, new AObjectS246S0100000_25(this, 706));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C324580Cnw(this, null), 3);
    }
}
