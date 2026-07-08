package X;

import Y.AfS184S0100000_15;
import Y.AfS48S1100000_15;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.model.AnchorOpenCameraEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.PlayMaskEffectUpdateChannel;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.LinkMicVideoOffWaveDowngradeChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAvatarEncodeOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestGaussOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestRenderOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestVoiceWavePrivilegeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestVoiceWaveScaleFactorSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;
import webcast.im.SoundWareEffectExtra;

/* JADX INFO: renamed from: X.0aau, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C940980aau extends AbstractC939840aZ4 {
    public final DataChannel LLIZLLLIL;
    public final WeakReference<C938220aWS> LLJ;
    public final InterfaceC920220a3Q LLJI;
    public final C01GW LLJIJIL;
    public C941390abZ LLJILJIL;
    public C1324720kZq LLJILJILJ;
    public boolean LLJILLL;
    public C941290abP LLJJ;
    public boolean LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public C1324720kZq LLJJJ;
    public C16F5 LLJJJIL;
    public C19487111Lx LLJJJJ;
    public C1324720kZq LLJJJJJIL;
    public ViewGroup LLJJJJLIIL;
    public long LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public ImageModel LLJLILLLLZIIL;
    public C421310GfZ LLJLL;

    private final C987140bnM getAvatarImageLoadListener() {
        return (C987140bnM) this.LLJJIJIIJIL.getValue();
    }

    private final InterfaceC927740aFY getBizSpotInfoCenter() {
        return (InterfaceC927740aFY) this.LLJIJIL.getValue();
    }

    private final C987140bnM getBlurImageLoadListener() {
        return (C987140bnM) this.LLJJIJIL.getValue();
    }

    private final View.OnLayoutChangeListener getLayoutChangeListener() {
        return (View.OnLayoutChangeListener) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    private final Function1<C01IZ, Unit> getMaskEffectObserver() {
        return (Function1) this.LLJJIJI.getValue();
    }

    private final Function1<C927820aFg, Unit> getOpenCameraObserver() {
        return (Function1) this.LLJJIII.getValue();
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (C917890Zzf.LIZ(this.LLJI.getPageType() != null)) {
            getWindow().removeOnLayoutChangeListener(getLayoutChangeListener());
        }
        C941290abP c941290abP = this.LLJJ;
        if (c941290abP != null) {
            c941290abP.LIZLLL = true;
            c941290abP.LJI();
        }
        this.LLJJ = null;
        super.onDetachedFromWindow();
        getDataChannel().HQ2(this, AnchorOpenCameraEvent.class, getOpenCameraObserver());
        getDataChannel().HQ2(this, PlayMaskEffectUpdateChannel.class, getMaskEffectObserver());
    }

    public final void LJIILL() {
        C01IZ c01iz;
        String str;
        C938220aWS c938220aWS;
        C938230aWT c938230aWTLIZJ;
        C11PQ<List<C2262071DgL>> c11pq;
        List<C2262071DgL> listLJLZ;
        C2262071DgL c2262071DgL;
        if (getWindow().LLJIJIL || (c01iz = (C01IZ) getDataChannel().gg0(PlayMaskEffectUpdateChannel.class)) == null) {
            return;
        }
        if (c01iz.LIZ != 1) {
            C421310GfZ c421310GfZ = this.LLJLL;
            if (c421310GfZ != null) {
                C930540aK4.LJJIJL(c421310GfZ);
                return;
            }
            return;
        }
        InterfaceC927690aFT interfaceC927690aFTLIZ = C924220a9s.LIZ();
        Long lValueOf = null;
        if (interfaceC927690aFTLIZ == null) {
            LJIILLIIL(this, false, null);
            return;
        }
        PosIdentity posIdentity = getWindow().getPosIdentity();
        if (posIdentity != null && posIdentity.type == 1 && (str = posIdentity.value) != null && (c938220aWS = this.LLJ.get()) != null && (c938230aWTLIZJ = c938220aWS.LIZJ(str, false, false)) != null && (c11pq = c938230aWTLIZJ.LJ) != null && (listLJLZ = c11pq.LJLZ()) != null && (c2262071DgL = (C2262071DgL) C13LP.LJJJLL(listLJLZ)) != null) {
            lValueOf = Long.valueOf(c2262071DgL.getId());
        }
        interfaceC927690aFTLIZ.LIZIZ(lValueOf, new AwS629S0100000_15(this, 98));
    }

    @Override // X.AbstractC939840aZ4
    public Integer getLayoutId() {
        return Integer.valueOf(R.layout.htv);
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        String str;
        InterfaceC927740aFY bizSpotInfoCenter;
        C080500Rv c080500RvLIZ;
        C11PQ<SoundWareEffectExtra> c11pq;
        String str2;
        C938230aWT c938230aWTLIZJ;
        C938230aWT c938230aWTLIZJ2;
        super.onAttachedToWindow();
        if (C917890Zzf.LIZ(this.LLJI.getPageType() != null)) {
            getWindow().addOnLayoutChangeListener(getLayoutChangeListener());
        }
        this.LLJJJJLIIL = (ViewGroup) findViewById(R.id.pmw);
        this.LLJJJ = (C1324720kZq) findViewById(R.id.pn1);
        this.LLJILJILJ = (C1324720kZq) findViewById(R.id.pn4);
        this.LLJILJIL = (C941390abZ) findViewById(R.id.voice_wave_with_dress);
        this.LLJJJIL = (C16F5) findViewById(R.id.zfm);
        this.LLJJJJJIL = (C1324720kZq) findViewById(R.id.pnc);
        C1324720kZq c1324720kZq = this.LLJJJJJIL;
        C941390abZ c941390abZ = this.LLJILJIL;
        PosIdentity posIdentity = getWindow().getPosIdentity();
        String str3 = null;
        if (posIdentity != null && posIdentity.type == 1) {
            str3 = posIdentity.value;
        }
        this.LLJJ = new C941290abP(c1324720kZq, false, c941390abZ, str3);
        PosIdentity posIdentity2 = getWindow().getPosIdentity();
        if (posIdentity2 != null && posIdentity2.type == 1 && (str2 = posIdentity2.value) != null) {
            C938220aWS c938220aWS = this.LLJ.get();
            if (c938220aWS != null && (c938230aWTLIZJ2 = c938220aWS.LIZJ(str2, false, false)) != null) {
                getCompositeDisposable().LIZ(new C11IW(C11NZ.LJIIJJI(C937310aUz.LIZ(c938230aWTLIZJ2.LJIILIIL), C937310aUz.LIZ(c938230aWTLIZJ2.LIZ), c938230aWTLIZJ2.LJ.LJJIFFI(), new InterfaceC953020auK() { // from class: X.0ab4
                    @Override // X.InterfaceC953020auK
                    public final Object LIZ(Object obj, Object obj2, Object obj3) {
                        return new C11H7(obj, obj2, obj3);
                    }
                }).LJJIJIIJIL(new AfS48S1100000_15(this, str2, 9))).LJIIZILJ());
            }
            C938220aWS c938220aWS2 = this.LLJ.get();
            if (c938220aWS2 != null && (c938230aWTLIZJ = c938220aWS2.LIZJ(str2, false, false)) != null) {
                getCompositeDisposable().LIZ(new C11IW(C11NZ.LJIIJ(C11NZ.LJIIL(c938230aWTLIZJ.LJ.LJJIFFI(), C937310aUz.LIZ(c938230aWTLIZJ.LIZIZ), c938230aWTLIZJ.LJIIL.LJJIFFI(), c938230aWTLIZJ.LIZJ.LJJIFFI(), new InterfaceC941150abB() { // from class: X.0ab8
                    @Override // X.InterfaceC941150abB
                    public final Object LIZ(Object obj, Object obj2, Object obj3, Object obj4) {
                        return new C11H6(obj, obj2, obj3, obj4);
                    }
                }), c938230aWTLIZJ.LJIILJJIL.LJJIFFI(), new InterfaceC500500Jk0() { // from class: X.0ab5
                    @Override // X.InterfaceC500500Jk0
                    public final Object apply(Object obj, Object obj2) {
                        return new Pair(obj, obj2);
                    }
                }).LJJIJIIJIL(new AfS184S0100000_15(this, 236))).LJIILL().LJIIZILJ());
                getCompositeDisposable().LIZ(new C11IW(c938230aWTLIZJ.LJ.LJJII(new InterfaceC1627390sS1() { // from class: X.0ab2
                    @Override // X.InterfaceC1627390sS1
                    public final boolean test(Object obj, Object obj2) {
                        return Intrinsics.LJFF(C13LP.LJJJLL((List) obj), C13LP.LJJJLL((List) obj2));
                    }
                }).LJJIJIIJIL(new AfS184S0100000_15(this, 237))).LJIILL().LJIIZILJ());
            }
        }
        getDataChannel().BQ2(this, AnchorOpenCameraEvent.class, getOpenCameraObserver());
        getDataChannel().BQ2(this, PlayMaskEffectUpdateChannel.class, getMaskEffectObserver());
        PosIdentity posIdentity3 = getWindow().getPosIdentity();
        if (posIdentity3 != null && posIdentity3.type == 1 && (str = posIdentity3.value) != null && (bizSpotInfoCenter = getBizSpotInfoCenter()) != null && (c080500RvLIZ = bizSpotInfoCenter.LIZ(str)) != null && (c11pq = c080500RvLIZ.LIZ) != null) {
            getCompositeDisposable().LIZ(C937310aUz.LJI(new C11IW(c11pq.LJJIFFI().LJJIJIIJIL(new AfS184S0100000_15(this, 238))), "VideoOffBizViewElement", "addVoiceWaveEffectChangedListener").LJIILL().LJIIZILJ());
        }
        LJIILL();
        if (C500260Jjc.LJIIZILJ(getDataChannel())) {
            return;
        }
        getDataChannel().BQ2(this, LinkMicVideoOffWaveDowngradeChannel.class, new AwS594S0100000_15(this, 1131));
    }

    @Override // X.AbstractC939840aZ4
    public DataChannel getDataChannel() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC939840aZ4
    public EnumC939900aZA getElementType() {
        return EnumC939900aZA.VIDEO_OFF;
    }

    public final void LJIIIZ(ImageModel imageModel) {
        String realTag = getRealTag();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadAvatarForMute, imageModel=");
        sbLIZ.append(imageModel);
        sbLIZ.append(" , hasRenderAvatar=");
        sbLIZ.append(this.LLJJI);
        sbLIZ.append(", instance:");
        sbLIZ.append(this);
        C20441214yg.LIZIZ(realTag, C2188811AlT.LIZIZ(sbLIZ));
        C1324720kZq c1324720kZq = this.LLJJJ;
        if (c1324720kZq != null && !this.LLJJI && C500260Jjc.LJJJJIZL(c1324720kZq)) {
            this.LLJJI = true;
            if (imageModel == null) {
                this.LLJJI = false;
            }
            if (LiveImageLoaderModuleSetting.useImageModule()) {
                C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
                c1324610kZfLJIIIZ.LJIIIZ = R.drawable.el_;
                int width = c1324720kZq.getWidth();
                int height = c1324720kZq.getHeight();
                c1324610kZfLJIIIZ.LJ = width;
                c1324610kZfLJIIIZ.LJFF = height;
                c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
                c1324610kZfLJIIIZ.LJIIL = getAvatarImageLoadListener();
                c1324610kZfLJIIIZ.LJJI(this.LLJJJ);
                return;
            }
            C0JSS.LJIIIIZZ(this.LLJJJ, imageModel, c1324720kZq.getWidth(), c1324720kZq.getHeight(), R.drawable.el_, getAvatarImageLoadListener());
        }
    }

    public final void LJIIJ(ImageModel imageModel) {
        if (!MultiGuestGaussOptSetting.INSTANCE.enable()) {
            LJIIIZ(imageModel);
            return;
        }
        C1324720kZq c1324720kZq = this.LLJJJ;
        if (c1324720kZq != null && !this.LLJJI && C500260Jjc.LJJJJIZL(c1324720kZq)) {
            if (!C1819620xS4.LIZLLL(imageModel)) {
                LJIIIZ(imageModel);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadAvatarForMuteV2, imageModel=");
            sbLIZ.append(imageModel);
            C20441214yg.LIZIZ("VideoOffBizViewElement", C2188811AlT.LIZIZ(sbLIZ));
            if (MultiGuestRenderOptSetting.INSTANCE.enable()) {
                this.LLJJI = true;
            }
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
            int width = c1324720kZq.getWidth();
            int height = c1324720kZq.getHeight();
            c1324610kZfLJIIIZ.LJ = width;
            c1324610kZfLJIIIZ.LJFF = height;
            c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
            c1324610kZfLJIIIZ.LJJ = Boolean.valueOf(MultiGuestAvatarEncodeOptSetting.INSTANCE.enable());
            c1324610kZfLJIIIZ.LJIIL = getAvatarImageLoadListener();
            c1324610kZfLJIIIZ.LJJI(this.LLJJJ);
        }
    }

    public final void LJIILJJIL(long j) {
        boolean z;
        C957020b0m next;
        boolean z2;
        int iLIZ;
        int iLIZ2;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        boolean z3;
        this.LLJJL = j;
        if (this.LLJI.getPageType() != null) {
            z = true;
        } else {
            z = false;
        }
        if (C917890Zzf.LIZ(z)) {
            C930480aJy c930480aJy = C930480aJy.LIZ;
            Long lValueOf = Long.valueOf(j);
            DataChannel dataChannel = getDataChannel();
            int width = getWindow().getWidth();
            int height = getWindow().getHeight();
            C1324720kZq c1324720kZq = this.LLJJJ;
            if (this.LLJI.getPageType() != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            C930480aJy.LJJIJLIJ(c930480aJy, lValueOf, dataChannel, width, height, c1324720kZq, z3, getExternalLayout(), 32);
        } else {
            Iterator<C957020b0m> it2 = this.LLJI.LJIIIZ().iterator();
            if (!it2.hasNext()) {
                next = null;
            } else {
                next = it2.next();
                if (it2.hasNext()) {
                    C957020b0m c957020b0m = next;
                    int iWidth = c957020b0m.getShapeDescriptor().LIZ.width() * c957020b0m.getShapeDescriptor().LIZ.height();
                    do {
                        C957020b0m next2 = it2.next();
                        C957020b0m c957020b0m2 = next2;
                        int iWidth2 = c957020b0m2.getShapeDescriptor().LIZ.width() * c957020b0m2.getShapeDescriptor().LIZ.height();
                        if (iWidth > iWidth2) {
                            next = next2;
                            iWidth = iWidth2;
                        }
                    } while (it2.hasNext());
                }
            }
            C957020b0m c957020b0m3 = next;
            if (c957020b0m3 != null) {
                C930480aJy c930480aJy2 = C930480aJy.LIZ;
                Long lValueOf2 = Long.valueOf(j);
                DataChannel dataChannel2 = getDataChannel();
                int iWidth3 = c957020b0m3.getShapeDescriptor().LIZ.width();
                int iHeight = c957020b0m3.getShapeDescriptor().LIZ.height();
                C1324720kZq c1324720kZq2 = this.LLJJJ;
                if (this.LLJI.getPageType() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C930480aJy.LJJIJLIJ(c930480aJy2, lValueOf2, dataChannel2, iWidth3, iHeight, c1324720kZq2, z2, getExternalLayout(), 32);
            }
        }
        C1324720kZq c1324720kZq3 = this.LLJJJ;
        if (c1324720kZq3 != null && (layoutParams2 = c1324720kZq3.getLayoutParams()) != null) {
            iLIZ = layoutParams2.width;
        } else {
            iLIZ = C439101nJ.LIZ(60);
        }
        DisplayMetrics displayMetrics = C497740JfY.LIZIZ;
        LJIILIIL(this.LLJJJJJIL, (iLIZ * 1.6f) / displayMetrics.density);
        if (MultiGuestVoiceWavePrivilegeSetting.INSTANCE.enable()) {
            C1324720kZq c1324720kZq4 = this.LLJJJ;
            if (c1324720kZq4 != null && (layoutParams = c1324720kZq4.getLayoutParams()) != null) {
                iLIZ2 = layoutParams.width;
            } else {
                iLIZ2 = C439101nJ.LIZ(60);
            }
            LJIILIIL(this.LLJILJIL, (iLIZ2 * MultiGuestVoiceWaveScaleFactorSetting.INSTANCE.getValue()) / displayMetrics.density);
        }
        LJIILL();
    }

    public static final void LJIILIIL(View view, float f) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            int iLIZIZ = (int) C497740JfY.LIZIZ(f);
            if (layoutParams.height == iLIZIZ && layoutParams.width == iLIZIZ) {
                return;
            }
            layoutParams.height = iLIZIZ;
            layoutParams.width = iLIZIZ;
            C786410Ut5.W5(view, layoutParams);
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [REQUEST, X.0kbR] */
    /* JADX WARN: Type inference failed for: r0v8, types: [REQUEST, X.0kbR] */
    public final void LJIIL(final ImageModel imageModel, final C1324720kZq c1324720kZq) {
        boolean z;
        List urls;
        if (c1324720kZq != null && c1324720kZq.getId() == R.id.pn4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!this.LLJL) {
                C1324720kZq c1324720kZq2 = this.LLJILJILJ;
                if (c1324720kZq2 != null && !C500260Jjc.LJJJJIZL(c1324720kZq2)) {
                    return;
                } else {
                    this.LLJL = true;
                }
            } else {
                return;
            }
        } else if (c1324720kZq != null && c1324720kZq.getId() == R.id.rog) {
            if (C930540aK4.LIZJ() && !this.LLJLIL) {
                this.LLJLIL = true;
            } else {
                return;
            }
        }
        if (imageModel == null && c1324720kZq != null) {
            if (c1324720kZq.getId() == R.id.pn4) {
                this.LLJL = false;
            } else if (c1324720kZq.getId() == R.id.rog) {
                this.LLJLIL = false;
            }
        }
        String str = null;
        if (c1324720kZq != null) {
            c1324720kZq.setBackground(null);
            c1324720kZq.setForeground(new ColorDrawable(C497740JfY.LIZLLL(R.attr.eos, c1324720kZq.getContext())));
            c1324720kZq.setTag(null);
        }
        final C1291820jim c1291820jim = new C1291820jim(5);
        if (C1819620xS4.LIZLLL(imageModel)) {
            if (imageModel != null && (urls = imageModel.getUrls()) != null) {
                str = (String) C13LP.LJJJLL(urls);
            }
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
            c1325700kbQLIZLLL.LJIILIIL = c1291820jim;
            ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
            imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.ARGB_8888);
            imageDecodeOptionsBuilder.getClass();
            c1325700kbQLIZLLL.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
            ?? LIZ = c1325700kbQLIZLLL.LIZ();
            if (c1324720kZq != null) {
                C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                c1320810kTXLIZJ.LIZLLL = LIZ;
                c1320810kTXLIZJ.LJIILJJIL = c1324720kZq.getController();
                c1320810kTXLIZJ.LJIIIIZZ = new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.0aax
                    /* JADX WARN: Type inference failed for: r0v9, types: [REQUEST, X.0kbR] */
                    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                    public final void LIZLLL(String str2, Throwable th) {
                        InterfaceC1320850kTb controller;
                        C1324720kZq c1324720kZq3 = c1324720kZq;
                        if (c1324720kZq3 != null && c1324720kZq3.getId() == R.id.pn4) {
                            this.LLJL = false;
                        } else {
                            C1324720kZq c1324720kZq4 = c1324720kZq;
                            if (c1324720kZq4 != null && c1324720kZq4.getId() == R.id.rog) {
                                this.LLJLIL = false;
                            }
                        }
                        C1304680k3W.LIZ.LIZ(40008, String.valueOf(th), null);
                        if (MultiGuestGaussOptSetting.INSTANCE.enable()) {
                            C1325700kbQ c1325700kbQLIZJ = C1325700kbQ.LIZJ(R.drawable.el_);
                            c1325700kbQLIZJ.LJIILIIL = c1291820jim;
                            ?? LIZ2 = c1325700kbQLIZJ.LIZ();
                            C1324720kZq c1324720kZq5 = c1324720kZq;
                            if (c1324720kZq5 != null) {
                                C1320810kTX c1320810kTXLIZJ2 = C1322200kVm.LIZJ();
                                c1320810kTXLIZJ2.LIZLLL = LIZ2;
                                C1324720kZq c1324720kZq6 = c1324720kZq;
                                if (c1324720kZq6 != null) {
                                    controller = c1324720kZq6.getController();
                                } else {
                                    controller = null;
                                }
                                c1320810kTXLIZJ2.LJIILJJIL = controller;
                                c1320810kTXLIZJ2.LJIIIIZZ = null;
                                c1324720kZq5.setController(c1320810kTXLIZJ2.LIZ());
                            }
                        }
                    }

                    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                    public final void LJ(String str2, Object obj, Animatable animatable) {
                        C1324720kZq c1324720kZq3 = c1324720kZq;
                        boolean z2 = true;
                        if (c1324720kZq3 != null && c1324720kZq3.getId() == R.id.pn4) {
                            C940980aau c940980aau = this;
                            if (obj == null || imageModel == null) {
                                z2 = false;
                            }
                            c940980aau.LLJL = z2;
                            return;
                        }
                        C1324720kZq c1324720kZq4 = c1324720kZq;
                        if (c1324720kZq4 == null || c1324720kZq4.getId() != R.id.rog) {
                            return;
                        }
                        C940980aau c940980aau2 = this;
                        if (obj == null || imageModel == null) {
                            z2 = false;
                        }
                        c940980aau2.LLJLIL = z2;
                    }
                };
                c1324720kZq.setController(c1320810kTXLIZJ.LIZ());
                return;
            }
            return;
        }
        C1325700kbQ c1325700kbQLIZJ = C1325700kbQ.LIZJ(R.drawable.el_);
        c1325700kbQLIZJ.LJIILIIL = c1291820jim;
        ?? LIZ2 = c1325700kbQLIZJ.LIZ();
        if (c1324720kZq == null) {
            return;
        }
        C1320810kTX c1320810kTXLIZJ2 = C1322200kVm.LIZJ();
        c1320810kTXLIZJ2.LIZLLL = LIZ2;
        c1320810kTXLIZJ2.LJIILJJIL = c1324720kZq.getController();
        c1320810kTXLIZJ2.LJIIIIZZ = new C987320bne(c1324720kZq, this, 1);
        c1324720kZq.setController(c1320810kTXLIZJ2.LIZ());
    }

    public static final void LJIILLIIL(C940980aau c940980aau, boolean z, List<String> list) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (z) {
            ViewGroup viewGroup = c940980aau.LLJJJJLIIL;
            if (viewGroup != null) {
                int i2 = 0;
                if (list != null && (!list.isEmpty())) {
                    C421310GfZ c421310GfZ = c940980aau.LLJLL;
                    if (c421310GfZ == null) {
                        c421310GfZ = new C421310GfZ(c940980aau.getContext());
                        C19ME c19me = new C19ME((int) C497740JfY.LIZIZ(20.0f), (int) C497740JfY.LIZIZ(20.0f));
                        c19me.bottomToBottom = R.id.pn1;
                        c19me.topToTop = -1;
                        c19me.startToEnd = -1;
                        c19me.startToStart = -1;
                        c19me.endToEnd = R.id.pn1;
                        c19me.endToStart = -1;
                        c19me.setMarginEnd(-10);
                        ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = -10;
                        c421310GfZ.setBackgroundResource(R.drawable.f_v);
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c421310GfZ);
                        c421310GfZ.setLayoutParams(c19me);
                        c421310GfZ.setStrokeWidth(12.0f);
                        c421310GfZ.setElevation(6.0f);
                        c940980aau.LLJLL = c421310GfZ;
                    }
                    C1324720kZq c1324720kZq = c940980aau.LLJJJ;
                    if (c1324720kZq != null && (layoutParams2 = c1324720kZq.getLayoutParams()) != null) {
                        i = layoutParams2.width;
                    } else {
                        i = 0;
                    }
                    C1324720kZq c1324720kZq2 = c940980aau.LLJJJ;
                    if (c1324720kZq2 != null && (layoutParams = c1324720kZq2.getLayoutParams()) != null) {
                        i2 = layoutParams.height;
                    }
                    int iMin = (int) Math.min(Math.min(i, i2) * 0.5f, C497740JfY.LIZIZ(40.0f));
                    if (iMin <= 0) {
                        iMin = (int) C497740JfY.LIZIZ(20.0f);
                    }
                    c421310GfZ.getLayoutParams().width = iMin;
                    c421310GfZ.getLayoutParams().height = iMin;
                    C786410Ut5.u6(c421310GfZ, c421310GfZ.getLayoutParams());
                    C930540aK4.LJJIL(-1, c421310GfZ, viewGroup);
                    c421310GfZ.setCuttingRadius(iMin * 0.5f);
                    C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(list);
                    int width = c421310GfZ.getWidth();
                    int height = c421310GfZ.getHeight();
                    c1324610kZfLIZJ.LJ = width;
                    c1324610kZfLIZJ.LJFF = height;
                    c1324610kZfLIZJ.LJIILIIL = Boolean.TRUE;
                    c1324610kZfLIZJ.LJIJI(Float.valueOf((float) Math.ceil(((double) c421310GfZ.getWidth()) * 0.5d)));
                    c1324610kZfLIZJ.LJJIIJ = -12303292;
                    c1324610kZfLIZJ.LJJIII = 4.0f;
                    c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
                    c1324610kZfLIZJ.LJJI(c421310GfZ);
                    return;
                }
                return;
            }
            return;
        }
        C421310GfZ c421310GfZ2 = c940980aau.LLJLL;
        if (c421310GfZ2 == null) {
            return;
        }
        C930540aK4.LJJIJL(c421310GfZ2);
    }

    public final void LJIIJJI(ImageModel imageModel, ImageModel imageModel2, C1324720kZq c1324720kZq) {
        int i;
        if (C937750aVh.LIZ()) {
            InterfaceC940060aZQ layoutManager = getLayoutManager();
            if (layoutManager != null && !layoutManager.LLIIZ()) {
                i = R.drawable.f5t;
            } else {
                i = R.drawable.f5v;
            }
            if (c1324720kZq != null && !Intrinsics.LJFF(c1324720kZq.getTag(), Integer.valueOf(i)) && c1324720kZq != null) {
                c1324720kZq.setImageRequest(null);
                c1324720kZq.setBackground(C497740JfY.LJIIJ(i));
                c1324720kZq.setForeground(null);
                c1324720kZq.setTag(Integer.valueOf(i));
                return;
            }
            return;
        }
        if (!MultiGuestGaussOptSetting.INSTANCE.enable()) {
            LJIIL(imageModel2, c1324720kZq);
            return;
        }
        if (!C1819620xS4.LIZLLL(imageModel)) {
            LJIIL(imageModel2, c1324720kZq);
            return;
        }
        if (this.LLJL) {
            return;
        }
        C1324720kZq c1324720kZq2 = this.LLJILJILJ;
        if (c1324720kZq2 != null && !C500260Jjc.LJJJJIZL(c1324720kZq2)) {
            return;
        }
        if (MultiGuestRenderOptSetting.INSTANCE.enable()) {
            this.LLJL = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showGaussianBlurBg, imageModel=");
        sbLIZ.append(imageModel);
        C20441214yg.LIZIZ("VideoOffBizViewElement", C2188811AlT.LIZIZ(sbLIZ));
        C492300JSi.LIZIZ(imageModel, this.LLJILJILJ, getBlurImageLoadListener());
    }

    public C940980aau(Context context, InterfaceC920220a3Q interfaceC920220a3Q, InterfaceC940060aZQ interfaceC940060aZQ, C957020b0m c957020b0m, DataChannel dataChannel, WeakReference weakReference) {
        super(context, dataChannel, c957020b0m, interfaceC940060aZQ);
        this.LLIZLLLIL = dataChannel;
        this.LLJ = weakReference;
        this.LLJI = interfaceC920220a3Q;
        this.LLJIJIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(467));
        this.LLJJIII = C930540aK4.LJJIJIL(new AwS556S0100000_12(this, 991));
        this.LLJJIJI = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1158));
        this.LLJJIJIIJIL = C292401Bi.LIZ(new AwS559S0100000_15(this, 1140));
        this.LLJJIJIL = C292401Bi.LIZ(new AwS559S0100000_15(this, 1154));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1157));
    }
}
