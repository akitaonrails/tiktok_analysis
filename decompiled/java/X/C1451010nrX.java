package X;

import Y.ACallableS250S0200000_22;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.INLEPurePlayer;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEPlayerState;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAdjustInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SingleAdjustInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nrX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1451010nrX extends AbstractC2255721DQs<InterfaceC1450920nrO> implements InterfaceC1450920nrO {
    public static final int LLILZ = 8;
    public final InterfaceC1450920nrO LL = this;
    public final MutableLiveData<Unit> LLILLJJLI = new MutableLiveData<>();
    public C1450990nrV LLILLL;

    @Override // X.InterfaceC1450920nrO
    public void v8() {
    }

    private final void X1() {
        this.LLILLJJLI.setValue(Unit.LIZ);
    }

    @Override // X.InterfaceC1450920nrO
    public void BN1() {
        C1450220nqG c1450220nqG;
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV == null || (c1450220nqG = c1450990nrV.LLJJLIIIJLLLLLLLZ) == null) {
            return;
        }
        c1450220nqG.MP2();
    }

    @Override // X.InterfaceC1450920nrO
    public void Bi() {
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV != null) {
            c1450990nrV.LLLLL().sH1().setValue(Boolean.TRUE);
        }
    }

    @Override // X.InterfaceC1450920nrO
    public void EX() {
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV != null) {
            C1450940nrQ c1450940nrQ = c1450990nrV.LLJLIL;
            if (c1450940nrQ == null) {
                c1450940nrQ = null;
            }
            c1450940nrQ.LIZLLL();
        }
    }

    @Override // X.InterfaceC1450920nrO
    public void G60() {
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV != null) {
            c1450990nrV.LLLIIL.LJ = true;
        }
    }

    @Override // X.InterfaceC1450920nrO
    public void GN0() {
        C1450220nqG c1450220nqG;
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV == null || (c1450220nqG = c1450990nrV.LLJJLIIIJLLLLLLLZ) == null) {
            return;
        }
        c1450220nqG.Hd0(new C1451180nro(c1450990nrV), false);
    }

    @Override // X.InterfaceC1450920nrO
    public String Gq() {
        C1450220nqG c1450220nqG;
        String strGq;
        C1450990nrV c1450990nrV = this.LLILLL;
        return (c1450990nrV == null || (c1450220nqG = c1450990nrV.LLJJLIIIJLLLLLLLZ) == null || (strGq = c1450220nqG.Gq()) == null) ? "" : strGq;
    }

    @Override // X.InterfaceC1450920nrO
    public void Iq1() {
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV != null) {
            c1450990nrV.LLLZIL();
        }
    }

    @Override // X.InterfaceC1450920nrO
    public void Mj() {
        C1450220nqG c1450220nqG;
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV == null || (c1450220nqG = c1450990nrV.LLJJLIIIJLLLLLLLZ) == null) {
            return;
        }
        c1450220nqG.Mj();
    }

    @Override // X.InterfaceC1450920nrO
    public C1462070o9N N51() {
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV != null) {
            return c1450990nrV.LLLLLLIL();
        }
        return null;
    }

    @Override // X.InterfaceC1450920nrO
    public SingleImageData OR1() {
        SingleImageData singleImageData;
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV == null || (singleImageData = c1450990nrV.LLJJIJIIJIL) == null) {
            throw new IllegalArgumentException("image scene not exist");
        }
        return singleImageData;
    }

    @Override // X.InterfaceC1450920nrO
    public LivePhotoPreviewMode cm() {
        C1450220nqG c1450220nqG;
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV == null || (c1450220nqG = c1450990nrV.LLJJLIIIJLLLLLLLZ) == null) {
            return null;
        }
        return c1450220nqG.cm();
    }

    @Override // X.InterfaceC1450920nrO
    public void di() {
        C1450220nqG c1450220nqG;
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV == null || (c1450220nqG = c1450990nrV.LLJJLIIIJLLLLLLLZ) == null) {
            return;
        }
        c1450220nqG.di();
    }

    @Override // X.InterfaceC1450920nrO
    /* JADX INFO: renamed from: do */
    public LivePhotoPreviewMode mo50do() {
        C1450220nqG c1450220nqG;
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV == null || (c1450220nqG = c1450990nrV.LLJJLIIIJLLLLLLLZ) == null) {
            return null;
        }
        return c1450220nqG.mo49do();
    }

    @Override // X.InterfaceC1450920nrO
    public void fz2() {
        INLEMediaSession iNLEMediaSession;
        INLEPlayer playerApi;
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV != null) {
            C1451330ns3 c1451330ns3 = c1450990nrV.LLLIIIL;
            C348100Dkm c348100DkmLLLLLJLJLL = c1450990nrV.LLLLLJLJLL();
            c1451330ns3.getClass();
            if (c348100DkmLLLLLJLJLL == null || (iNLEMediaSession = c348100DkmLLLLLJLJLL.LIZIZ) == null || (playerApi = iNLEMediaSession.getPlayerApi()) == null) {
                return;
            }
            playerApi.pause();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    @Override // X.InterfaceC1450920nrO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void gx() {
        /*
            r5 = this;
            X.0nrV r4 = r5.LLILLL
            if (r4 == 0) goto L27
            X.0Dkm r2 = r4.LLLLLJLJLL()
            if (r2 == 0) goto L27
            X.0nqt r0 = r4.LLLIIL
            if (r0 == 0) goto L30
            boolean r1 = r0.LIZJ
            r0 = 1
            if (r1 != r0) goto L30
        L13:
            r3 = 0
            if (r0 == 0) goto L28
            X.0DlT r2 = r2.LJ()
            r1 = 1
            r0 = 0
            r2.LJIJ(r3, r1, r0)
        L1f:
            X.0nqt r1 = r4.LLLIIL
            if (r1 == 0) goto L27
            r0 = 0
            r1.LIZ(r0, r3)
        L27:
            return
        L28:
            X.0Dm5 r0 = r2.LJII()
            r0.LJJJ(r3)
            goto L1f
        L30:
            r0 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1451010nrX.gx():void");
    }

    @Override // X.InterfaceC1450920nrO
    public void jr2() {
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV != null) {
            c1450990nrV.LLLLLLLZIL();
        }
    }

    @Override // X.InterfaceC1450920nrO
    public void lG1() {
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV != null) {
            C1450220nqG c1450220nqG = c1450990nrV.LLJJLIIIJLLLLLLLZ;
            if (c1450220nqG != null) {
                c1450220nqG.release();
            }
            InterfaceC1452170ntP value = c1450990nrV.LLLLL().g().getValue();
            if (value != null) {
                value.destroy();
            }
        }
    }

    @Override // X.InterfaceC1450920nrO
    public void pH1() {
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV != null) {
            c1450990nrV.LLLLJI(new AwS566S0100000_22(c1450990nrV, 177));
        }
    }

    @Override // X.InterfaceC1450920nrO
    public void qB0() {
        ImageAdjustInfo adjustInfo;
        Map<String, SingleAdjustInfo> adjustMap;
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV == null || ((Boolean) C0AEP.LIZ.getValue()).booleanValue() || (adjustInfo = c1450990nrV.LLJJIJIIJIL.getAdjustInfo()) == null || (adjustMap = adjustInfo.getAdjustMap()) == null || adjustMap.get("adjust_item_enhance") == null) {
            return;
        }
        C0CNO.LIZLLL(200L, new AwS566S0100000_22(c1450990nrV, 181));
    }

    @Override // X.InterfaceC1450920nrO
    public View wd1() {
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV != null) {
            return c1450990nrV.mView;
        }
        return null;
    }

    @Override // X.InterfaceC1450920nrO
    public C1836880xtu wf2() {
        C1836880xtu c1836880xtuLLLLLJIL;
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV == null || (c1836880xtuLLLLLJIL = c1450990nrV.LLLLLJIL()) == null) {
            throw new IllegalArgumentException("image scene not exist");
        }
        return c1836880xtuLLLLLJIL;
    }

    @Override // X.InterfaceC1450920nrO
    public View x72() {
        BitmapDrawable bitmapDrawable;
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV != null) {
            ImageView imageView = c1450990nrV.LLJL;
            if (imageView == null) {
                imageView = null;
            }
            Drawable drawable = imageView.getDrawable();
            if ((drawable instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) drawable) != null && bitmapDrawable.getBitmap() != null) {
                ImageView imageView2 = c1450990nrV.LLJL;
                if (imageView2 == null) {
                    imageView2 = null;
                }
                C337180DJs.LIZJ(imageView2);
            }
            ImageView imageView3 = c1450990nrV.LLJL;
            if (imageView3 != null) {
                return imageView3;
            }
        }
        return null;
    }

    @Override // X.InterfaceC1450920nrO
    public void yU() {
        C1450220nqG c1450220nqG;
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV == null || (c1450220nqG = c1450990nrV.LLJJLIIIJLLLLLLLZ) == null) {
            return;
        }
        c1450220nqG.SN2(c1450990nrV.LLLLLJLJLL());
    }

    @Override // X.InterfaceC1450920nrO
    public void zO0() {
        long currentPosition;
        INLEMediaSession iNLEMediaSession;
        INLEPlayer playerApi;
        INLEPlayer playerApi2;
        INLEPlayer playerApi3;
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV != null) {
            List listLJIIJJI = C1697810uHb.LJIIJJI(LivePhotoPreviewMode.LIVE_PHOTO, LivePhotoPreviewMode.LOOP);
            SrcLiveVideoInfo srcLiveInfo = c1450990nrV.LLJJIJIIJIL.getSrcLiveInfo();
            if (C13LP.LJJJJ(srcLiveInfo != null ? srcLiveInfo.getLivePhotoPreviewMode() : null, listLJIIJJI)) {
                C1451330ns3 c1451330ns3 = c1450990nrV.LLLIIIL;
                C348100Dkm c348100DkmLLLLLJLJLL = c1450990nrV.LLLLLJLJLL();
                c1451330ns3.getClass();
                long duration = 0;
                if (c348100DkmLLLLLJLJLL != null) {
                    INLEMediaSession iNLEMediaSession2 = c348100DkmLLLLLJLJLL.LIZIZ;
                    if (iNLEMediaSession2 == null || (playerApi3 = iNLEMediaSession2.getPlayerApi()) == null) {
                        currentPosition = 0;
                        if (c348100DkmLLLLLJLJLL != null) {
                        }
                        if (currentPosition <= duration || c348100DkmLLLLLJLJLL == null || (iNLEMediaSession = c348100DkmLLLLLJLJLL.LIZIZ) == null || (playerApi = iNLEMediaSession.getPlayerApi()) == null) {
                            return;
                        }
                        playerApi.play();
                        return;
                    }
                    currentPosition = playerApi3.getCurrentPosition();
                    INLEMediaSession iNLEMediaSession3 = c348100DkmLLLLLJLJLL.LIZIZ;
                    if (iNLEMediaSession3 != null && (playerApi2 = iNLEMediaSession3.getPlayerApi()) != null) {
                        duration = playerApi2.getDuration();
                    }
                    if (currentPosition <= duration) {
                    }
                }
            }
        }
    }

    public InterfaceC1450920nrO W1() {
        return this.LL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LL;
    }

    @Override // X.InterfaceC1450920nrO
    public LiveData<Unit> yX() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1450920nrO
    public void G41(boolean z) {
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV != null) {
            if (z) {
                c1450990nrV.LLLLLLLZIL();
                c1450990nrV.LLLZIL();
                InterfaceC1451100nrg interfaceC1451100nrgLLLLLLJ = c1450990nrV.LLLLLLJ();
                if (interfaceC1451100nrgLLLLLLJ != null) {
                    interfaceC1451100nrgLLLLLLJ.xH2(c1450990nrV.LLLLLJIL());
                    return;
                }
                return;
            }
            C1450220nqG c1450220nqG = c1450990nrV.LLJJLIIIJLLLLLLLZ;
            if (c1450220nqG == null) {
                return;
            }
            c1450220nqG.Hd0(new C1451180nro(c1450990nrV), false);
        }
    }

    @Override // X.InterfaceC1450920nrO
    public void Gk2(Function0<Unit> function0) {
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV != null) {
            if (c1450990nrV.LLLLLJIL) {
                function0.invoke();
            } else {
                c1450990nrV.LLLLLJLJLL = function0;
            }
        }
    }

    @Override // X.InterfaceC1450920nrO
    public void NH0(boolean z) {
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV != null) {
            if (z) {
                c1450990nrV.LLLLZLLIL();
                View viewFindViewById = c1450990nrV.LLLLLLIL().findViewById(R.id.xqt);
                if (viewFindViewById != null) {
                    C786410Ut5.LJLLLLLL(8, viewFindViewById);
                }
            } else {
                View viewFindViewById2 = c1450990nrV.LLLLLLIL().findViewById(R.id.xqt);
                if (viewFindViewById2 != null) {
                    C786410Ut5.LJLLLLLL(0, viewFindViewById2);
                }
                c1450990nrV.LLLLZLLLI();
                C1452060ntE c1452060ntE = c1450990nrV.LLJJL;
                if (c1452060ntE != null) {
                    c1452060ntE.Nb0();
                }
            }
            InterfaceC1464960oE2 interfaceC1464960oE2LLLLLIL = c1450990nrV.LLLLLIL();
            if (interfaceC1464960oE2LLLLLIL != null) {
                interfaceC1464960oE2LLLLLIL.LLLLZLL(!z);
            }
            C0FVY c0fvy = c1450990nrV.LLLF;
            if (c0fvy != null) {
                c0fvy.LLLLZLL(!z);
            }
        }
    }

    @Override // X.InterfaceC1450920nrO
    public void Pk0(final Function0<Unit> function0) {
        InterfaceC1452170ntP value;
        NLEPlayerState nLEPlayerStateState;
        LivePhotoPreviewMode livePhotoPreviewModeMo49do;
        InterfaceC1452170ntP value2;
        long duration;
        INLEMediaSession iNLEMediaSession;
        INLEPlayer playerApi;
        INLEMediaSession iNLEMediaSession2;
        INLEPlayer playerApi2;
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV != null && (value = c1450990nrV.LLLLL().g().getValue()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("user state = ");
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(value);
            NLEPlayerState nLEPlayerStateState2 = null;
            if (c348100DkmLIZIZ != null && (iNLEMediaSession2 = c348100DkmLIZIZ.LIZIZ) != null && (playerApi2 = iNLEMediaSession2.getPlayerApi()) != null) {
                nLEPlayerStateState = playerApi2.state();
            } else {
                nLEPlayerStateState = null;
            }
            sbLIZ.append(nLEPlayerStateState);
            C1450070nq1.LIZJ("debug", C2188811AlT.LIZIZ(sbLIZ));
            C1450220nqG c1450220nqG = c1450990nrV.LLJJLIIIJLLLLLLLZ;
            if (c1450220nqG != null) {
                livePhotoPreviewModeMo49do = c1450220nqG.mo49do();
            } else {
                livePhotoPreviewModeMo49do = null;
            }
            if (livePhotoPreviewModeMo49do != LivePhotoPreviewMode.STATIC) {
                C348100Dkm c348100DkmLIZIZ2 = C352130DrH.LIZIZ(value);
                if (c348100DkmLIZIZ2 != null && (iNLEMediaSession = c348100DkmLIZIZ2.LIZIZ) != null && (playerApi = iNLEMediaSession.getPlayerApi()) != null) {
                    nLEPlayerStateState2 = playerApi.state();
                }
                if (nLEPlayerStateState2 != NLEPlayerState.STARTED) {
                    C1450070nq1.LIZJ("debug", " seek then add sticker");
                    long duration2 = 0;
                    if ((livePhotoPreviewModeMo49do == LivePhotoPreviewMode.LOOP || livePhotoPreviewModeMo49do == LivePhotoPreviewMode.LIVE_PHOTO) && (value2 = c1450990nrV.LLLLL().g().getValue()) != null) {
                        duration = value2.getDuration();
                    } else {
                        duration = 0;
                    }
                    InterfaceC1452170ntP value3 = c1450990nrV.LLLLL().g().getValue();
                    if (value3 != null) {
                        duration2 = value3.getDuration();
                    }
                    if (!C0C64.LJIILLIIL().LJIIIZ(31744, "photo_mode_sticker_bug_fix", true, true)) {
                        duration = duration2;
                    }
                    value.bg((int) duration, new InterfaceC1464140oCi() { // from class: X.0nrw
                        @Override // X.InterfaceC1464140oCi
                        public final int onGetImageData(byte[] bArr, int i, int i2, int i3, float f) {
                            C01TT.LIZLLL(new AwS566S0100000_22(function0, (Function0<Boolean>) 178));
                            return 0;
                        }
                    });
                    return;
                }
            }
            C1450070nq1.LIZJ("debug", " directly add sticker");
            function0.invoke();
        }
    }

    @Override // X.InterfaceC1450920nrO
    public void Rw0(boolean z) {
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV != null) {
            if (z) {
                View viewFindViewById = c1450990nrV.LLLLLLIL().findViewById(R.id.xqt);
                if (viewFindViewById != null) {
                    C786410Ut5.LJLLLLLL(0, viewFindViewById);
                }
                c1450990nrV.LLJJIJIIJIL.getEditImageInfo().isFullScreen();
                c1450990nrV.LLLLZLLLI();
            } else {
                c1450990nrV.LLLLLJIL().setCropRect(C1450880nrK.LIZ(c1450990nrV.LLJJIJIIJIL.getEditImageInfo().getRatio(), c1450990nrV.LLLFF, c1450990nrV.LLJJIJIIJIL.getSrcImageInfo().getWidth() / c1450990nrV.LLJJIJIIJIL.getSrcImageInfo().getHeight(), c1450990nrV.LLLFFI + C1450870nrJ.LJ + C1450870nrJ.LIZLLL));
                c1450990nrV.LLLLZLLIL();
                View viewFindViewById2 = c1450990nrV.LLLLLLIL().findViewById(R.id.xqt);
                if (viewFindViewById2 != null) {
                    C786410Ut5.LJLLLLLL(8, viewFindViewById2);
                }
            }
            InterfaceC1464960oE2 interfaceC1464960oE2LLLLLIL = c1450990nrV.LLLLLIL();
            if (interfaceC1464960oE2LLLLLIL != null) {
                interfaceC1464960oE2LLLLLIL.LLLLZLL(z);
            }
            C0FVY c0fvy = c1450990nrV.LLLF;
            if (c0fvy != null) {
                c0fvy.LLLLZLL(z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    @Override // X.InterfaceC1450920nrO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void SD1(boolean r9) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1451010nrX.SD1(boolean):void");
    }

    @Override // X.InterfaceC1450920nrO
    public void SX1(C1450990nrV c1450990nrV) {
        this.LLILLL = c1450990nrV;
        X1();
    }

    @Override // X.InterfaceC1450920nrO
    public <T> T V51(Class<T> cls) {
        C1DRG c1drgLJIIIZ;
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV == null || (c1drgLJIIIZ = C1664600tQ2.LJIIIZ(c1450990nrV)) == null) {
            return null;
        }
        return (T) c1drgLJIIIZ.LJIIL(null, cls);
    }

    @Override // X.InterfaceC1450920nrO
    public void aL1(boolean z) {
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV != null && !z) {
            View viewFindViewById = c1450990nrV.LLLLLLIL().findViewById(R.id.xqt);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
            }
            c1450990nrV.LLJJIJIIJIL.getEditImageInfo().isFullScreen();
            c1450990nrV.LLLLZLLLI();
            InterfaceC1464960oE2 interfaceC1464960oE2LLLLLIL = c1450990nrV.LLLLLIL();
            if (interfaceC1464960oE2LLLLLIL != null) {
                interfaceC1464960oE2LLLLLIL.LLLLZLL(true);
            }
            C0FVY c0fvy = c1450990nrV.LLLF;
            if (c0fvy != null) {
                c0fvy.LLLLZLL(true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0nrj, com.bytedance.ies.nle.editor_jni.INLEPurePlayer$INLEPurePlayerInfoListener] */
    @Override // X.InterfaceC1450920nrO
    public AbstractC19484711Kz<Unit> fb(int i) {
        INLEMediaSession iNLEMediaSession;
        INLEPlayer playerApi;
        INLEMediaSession iNLEMediaSession2;
        INLEPlayer playerApi2;
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV == null) {
            return null;
        }
        final C1451330ns3 c1451330ns3 = c1450990nrV.LLLIIIL;
        final C348100Dkm c348100DkmLLLLLJLJLL = c1450990nrV.LLLLLJLJLL();
        c1451330ns3.getClass();
        c1451330ns3.LIZIZ = new C11RK<>();
        C1451130nrj c1451130nrj = c1451330ns3.LIZ;
        if (c1451130nrj != null) {
            if (c348100DkmLLLLLJLJLL != null && (iNLEMediaSession2 = c348100DkmLLLLLJLJLL.LIZIZ) != null && (playerApi2 = iNLEMediaSession2.getPlayerApi()) != null) {
                playerApi2.removePlayerInfoListener(c1451130nrj);
            }
            if (Intrinsics.LJFF(c1451130nrj, c1451330ns3.LIZ)) {
                c1451330ns3.LIZ = null;
            }
        }
        ?? r1 = new INLEPurePlayer.INLEPurePlayerInfoListener() { // from class: X.0nrj
            @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
            public final void onPlayEnd() {
                INLEPlayer playerApi3;
                C11RK<Unit> c11rk = c1451330ns3.LIZIZ;
                if (c11rk != null) {
                    c11rk.onNext(Unit.LIZ);
                }
                C11RK<Unit> c11rk2 = c1451330ns3.LIZIZ;
                if (c11rk2 != null) {
                    c11rk2.onComplete();
                }
                C1451330ns3 c1451330ns32 = c1451330ns3;
                C348100Dkm c348100Dkm = c348100DkmLLLLLJLJLL;
                if (c348100Dkm != null) {
                    c1451330ns32.getClass();
                    INLEMediaSession iNLEMediaSession3 = c348100Dkm.LIZIZ;
                    if (iNLEMediaSession3 != null && (playerApi3 = iNLEMediaSession3.getPlayerApi()) != null) {
                        playerApi3.removePlayerInfoListener(this);
                    }
                }
                if (Intrinsics.LJFF(this, c1451330ns32.LIZ)) {
                    c1451330ns32.LIZ = null;
                }
            }

            @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
            public final void onFirstFrameRender() {
                INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onFirstFrameRender(this);
            }

            @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
            public final void onPlayerPause() {
                INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onPlayerPause(this);
            }

            @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
            public final void onPrepared() {
                INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onPrepared(this);
            }

            @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
            public final void onPlayTime(int i2, long j) {
                INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onPlayTime(this, i2, j);
            }
        };
        if (c348100DkmLLLLLJLJLL != null && (iNLEMediaSession = c348100DkmLLLLLJLJLL.LIZIZ) != null && (playerApi = iNLEMediaSession.getPlayerApi()) != 0) {
            playerApi.addPlayerInfoListener(r1);
        }
        c1451330ns3.LIZ = r1;
        C11RK<Unit> c11rk = c1451330ns3.LIZIZ;
        if (c11rk == null) {
            return null;
        }
        return new C19475111Hh(c11rk);
    }

    @Override // X.InterfaceC1450920nrO
    public <T extends Scene> T hz2(String str) {
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV != null) {
            return (T) c1450990nrV.findSceneByTag(str);
        }
        return null;
    }

    @Override // X.InterfaceC1450920nrO
    public void ya1(boolean z) {
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV != null) {
            if (z) {
                c1450990nrV.LLLLLJIL().setCropRect(C1450880nrK.LIZ(c1450990nrV.LLJJIJIIJIL.getEditImageInfo().getRatio(), c1450990nrV.LLLFF, c1450990nrV.LLJJIJIIJIL.getSrcImageInfo().getWidth() / c1450990nrV.LLJJIJIIJIL.getSrcImageInfo().getHeight(), c1450990nrV.LLLFFI + C1450870nrJ.LJ + C1450870nrJ.LIZLLL));
                c1450990nrV.LLLLZLLIL();
                View viewFindViewById = c1450990nrV.LLLLLLIL().findViewById(R.id.xqt);
                if (viewFindViewById != null) {
                    C786410Ut5.LJLLLLLL(8, viewFindViewById);
                }
            } else {
                View viewFindViewById2 = c1450990nrV.LLLLLLIL().findViewById(R.id.xqt);
                if (viewFindViewById2 != null) {
                    C786410Ut5.LJLLLLLL(0, viewFindViewById2);
                }
                c1450990nrV.LLJJIJIIJIL.getEditImageInfo().isFullScreen();
                c1450990nrV.LLLLZLLLI();
            }
            InterfaceC1464960oE2 interfaceC1464960oE2LLLLLIL = c1450990nrV.LLLLLIL();
            if (interfaceC1464960oE2LLLLLIL != null) {
                interfaceC1464960oE2LLLLLIL.LLLLZLL(!z);
            }
            C0FVY c0fvy = c1450990nrV.LLLF;
            if (c0fvy != null) {
                c0fvy.LLLLZLL(!z);
            }
        }
    }

    @Override // X.InterfaceC1450920nrO
    public void S51(Rect rect, Function0<Unit> function0) {
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV != null) {
            C1450090nq3 c1450090nq3 = c1450990nrV.LLJJJ;
            if (c1450090nq3 != null) {
                c1450090nq3.LIZJ = true;
            }
            C15O7.LIZJ(new ACallableS250S0200000_22(c1450990nrV, rect, 1)).LJIIZILJ(new C1466860oH6(function0, c1450990nrV, 1), C15O7.LJIIIIZZ);
        }
    }

    @Override // X.InterfaceC1450920nrO
    public void T22(boolean z, Function0<Unit> function0) {
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV != null) {
            c1450990nrV.LLLLZIL();
        }
    }

    @Override // X.InterfaceC1450920nrO
    public void Tp1(float f, float f2) {
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV != null) {
            C1450990nrV.LLLZ(c1450990nrV, f, f2);
        }
    }

    @Override // X.InterfaceC1450920nrO
    public void d72(boolean z, Bitmap bitmap) {
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV != null) {
            c1450990nrV.LLLZIIL(z, bitmap);
        }
    }

    @Override // X.InterfaceC1450920nrO
    public void f92(FilterBean filterBean, boolean z) {
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV != null) {
            c1450990nrV.LLLLIL(filterBean, z);
        }
    }

    @Override // X.InterfaceC1450920nrO
    public Rect iK0(boolean z, float f) {
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV != null) {
            return c1450990nrV.LLLLLILLIL(f);
        }
        return new Rect();
    }

    @Override // X.InterfaceC1450920nrO
    public void qz(String str, NLEModel nLEModel) {
        C1450090nq3 c1450090nq3;
        C1450990nrV c1450990nrV = this.LLILLL;
        if (c1450990nrV != null && (c1450090nq3 = c1450990nrV.LLJJJ) != null) {
            c1450090nq3.LJ(nLEModel, str);
        }
    }
}
