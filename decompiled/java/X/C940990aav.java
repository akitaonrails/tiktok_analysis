package X;

import Y.AkS477S0100000_15;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAvatarEncodeOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestGaussOptSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aav, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C940990aav extends AbstractC939840aZ4 {
    public final DataChannel LLIZLLLIL;
    public final WeakReference<C938220aWS> LLJ;
    public ViewStub LLJI;
    public ConstraintLayout LLJIJIL;
    public C1324720kZq LLJILJIL;
    public C1324720kZq LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;

    @Override // X.AbstractC939840aZ4
    public Integer getLayoutId() {
        return null;
    }

    private final C987140bnM getBlurImageLoadListener() {
        return (C987140bnM) this.LLJJIII.getValue();
    }

    private final C987140bnM getPrepareAvatarImageLoadListener() {
        return (C987140bnM) this.LLJJI.getValue();
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        String str;
        C938220aWS c938220aWS;
        C938230aWT c938230aWTLIZJ;
        C11NZ c11nzLIZ;
        super.onAttachedToWindow();
        if (getWindow().LLJIJIL) {
            setVisibilityOpt(false);
            return;
        }
        PosIdentity posIdentity = getWindow().getPosIdentity();
        if (posIdentity == null || posIdentity.type != 1 || (str = posIdentity.value) == null || (c938220aWS = this.LLJ.get()) == null || (c938230aWTLIZJ = c938220aWS.LIZJ(str, false, false)) == null || (c11nzLIZ = C948810anX.LIZ(c938230aWTLIZJ.LJIIL.LJJIFFI(), c938230aWTLIZJ.LJ.LJJIFFI())) == null) {
            return;
        }
        getCompositeDisposable().LIZ(new C11IW(c11nzLIZ.LJJJJZI(new AkS477S0100000_15(this, 14))).LJIILL().LJIIZILJ());
    }

    private final C1324720kZq getPrepareAvatar() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC939840aZ4
    public DataChannel getDataChannel() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC939840aZ4
    public EnumC939900aZA getElementType() {
        return EnumC939900aZA.LOADING;
    }

    public final C1324720kZq getPrepareAvatarBackground() {
        return this.LLJILJIL;
    }

    public final ViewGroup getPrepareContainer() {
        return this.LLJIJIL;
    }

    public final void LJIIJJI(ImageModel imageModel) {
        int width;
        int width2;
        C1324720kZq prepareAvatar = getPrepareAvatar();
        int height = 0;
        if ((prepareAvatar != null && !C500260Jjc.LJJJJIZL(prepareAvatar)) || this.LLJILLL) {
            return;
        }
        this.LLJILLL = true;
        if (LiveImageLoaderModuleSetting.useImageModule()) {
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
            c1324610kZfLJIIIZ.LJIIIZ = R.drawable.el_;
            c1324610kZfLJIIIZ.LJJ = Boolean.valueOf(MultiGuestAvatarEncodeOptSetting.INSTANCE.enable());
            C1324720kZq prepareAvatar2 = getPrepareAvatar();
            if (prepareAvatar2 != null) {
                width2 = prepareAvatar2.getWidth();
            } else {
                width2 = 0;
            }
            C1324720kZq prepareAvatar3 = getPrepareAvatar();
            if (prepareAvatar3 != null) {
                height = prepareAvatar3.getHeight();
            }
            c1324610kZfLJIIIZ.LJ = width2;
            c1324610kZfLJIIIZ.LJFF = height;
            c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
            c1324610kZfLJIIIZ.LJIIL = getPrepareAvatarImageLoadListener();
            c1324610kZfLJIIIZ.LJJI(getPrepareAvatar());
            return;
        }
        if (getPrepareAvatar() == null) {
            return;
        }
        C1324720kZq prepareAvatar4 = getPrepareAvatar();
        C1324720kZq prepareAvatar5 = getPrepareAvatar();
        if (prepareAvatar5 != null) {
            width = prepareAvatar5.getWidth();
        } else {
            width = 0;
        }
        C1324720kZq prepareAvatar6 = getPrepareAvatar();
        if (prepareAvatar6 != null) {
            height = prepareAvatar6.getHeight();
        }
        C0JSS.LJIIIIZZ(prepareAvatar4, imageModel, width, height, R.drawable.el_, getPrepareAvatarImageLoadListener());
    }

    public final void LJIIL(long j) {
        C957020b0m next;
        Iterator<C957020b0m> it2 = C940770aaZ.LIZ().getDataSource().LJIIIZ().iterator();
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
            C930480aJy.LJJIJLIJ(C930480aJy.LIZ, Long.valueOf(j), getDataChannel(), c957020b0m3.getShapeDescriptor().LIZ.width(), c957020b0m3.getShapeDescriptor().LIZ.height(), getPrepareAvatar(), false, null, 224);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053 A[Catch: all -> 0x006a, TryCatch #0 {all -> 0x006a, blocks: (B:6:0x0021, B:11:0x0030, B:14:0x003f, B:18:0x0046, B:19:0x004f, B:21:0x0053, B:22:0x005c, B:24:0x0060, B:13:0x0036), top: B:33:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060 A[Catch: all -> 0x006a, TRY_LEAVE, TryCatch #0 {all -> 0x006a, blocks: (B:6:0x0021, B:11:0x0030, B:14:0x003f, B:18:0x0046, B:19:0x004f, B:21:0x0053, B:22:0x005c, B:24:0x0060, B:13:0x0036), top: B:33:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setVisibilityOpt(boolean r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L94
            boolean r0 = r5.getInflated()
            r4 = 0
            if (r0 != 0) goto L90
            r2 = 1
            r5.setInflated(r2)
            android.content.Context r0 = r5.getContext()
            r5.setInflated(r2)
            android.view.LayoutInflater r1 = X.C786410Ut5.ne(r0)
            r0 = 2131569863(0x7f0d2cc7, float:1.8765364E38)
            X.C786410Ut5.Td(r1, r0, r5, r2)
            r0 = 2131386168(0x7f0a5f38, float:1.8392787E38)
            android.view.View r1 = r5.findViewById(r0)     // Catch: java.lang.Throwable -> L6a
            android.view.ViewStub r1 = (android.view.ViewStub) r1     // Catch: java.lang.Throwable -> L6a
            r5.LLJI = r1     // Catch: java.lang.Throwable -> L6a
            r0 = 0
            if (r1 == 0) goto L2d
            goto L30
        L2d:
            r2 = r0
        L2e:
            r1 = r0
            goto L3f
        L30:
            android.view.View r2 = X.C786410Ut5.LJLLLL(r1)     // Catch: java.lang.Throwable -> L6a
            if (r2 == 0) goto L2e
            r1 = 2131386167(0x7f0a5f37, float:1.8392785E38)
            android.view.View r1 = r2.findViewById(r1)     // Catch: java.lang.Throwable -> L6a
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1     // Catch: java.lang.Throwable -> L6a
        L3f:
            r5.LLJIJIL = r1     // Catch: java.lang.Throwable -> L6a
            if (r2 == 0) goto L44
            goto L46
        L44:
            r1 = r0
            goto L4f
        L46:
            r1 = 2131386166(0x7f0a5f36, float:1.8392783E38)
            android.view.View r1 = r2.findViewById(r1)     // Catch: java.lang.Throwable -> L6a
            X.0kZq r1 = (X.C1324720kZq) r1     // Catch: java.lang.Throwable -> L6a
        L4f:
            r5.LLJILJIL = r1     // Catch: java.lang.Throwable -> L6a
            if (r2 == 0) goto L5c
            r0 = 2131386165(0x7f0a5f35, float:1.839278E38)
            android.view.View r0 = r2.findViewById(r0)     // Catch: java.lang.Throwable -> L6a
            X.0kZq r0 = (X.C1324720kZq) r0     // Catch: java.lang.Throwable -> L6a
        L5c:
            r5.LLJILJILJ = r0     // Catch: java.lang.Throwable -> L6a
            if (r2 == 0) goto L90
            r0 = 2131380664(0x7f0a49b8, float:1.8381623E38)
            android.view.View r0 = r2.findViewById(r0)     // Catch: java.lang.Throwable -> L6a
            X.16FZ r0 = (X.C16FZ) r0     // Catch: java.lang.Throwable -> L6a
            goto L90
        L6a:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            java.lang.String r2 = r5.getRealTag()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "initPrepareLayout failed t="
            r1.append(r0)
            java.lang.String r0 = r3.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C937310aUz.LJFF(r2, r0)
            android.view.ViewStub r0 = r5.LLJI
            if (r0 == 0) goto L90
            X.C12ES.LJIILL(r4, r0)
        L90:
            X.C12ES.LJIILL(r4, r5)
            return
        L94:
            X.C439101nJ.LJI(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C940990aav.setVisibilityOpt(boolean):void");
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [REQUEST, X.0kbR] */
    /* JADX WARN: Type inference failed for: r0v3, types: [REQUEST, X.0kbR] */
    public final void LJIIJ(final ImageModel imageModel, final C1324720kZq c1324720kZq) {
        if (c1324720kZq != null && c1324720kZq.getId() == R.id.rog) {
            if (!this.LLJJ) {
                C1324720kZq prepareAvatarBackground = getPrepareAvatarBackground();
                if (prepareAvatarBackground != null && !C500260Jjc.LJJJJIZL(prepareAvatarBackground)) {
                    return;
                } else {
                    this.LLJJ = true;
                }
            } else {
                return;
            }
        }
        String str = null;
        if (c1324720kZq != null) {
            c1324720kZq.setBackground(null);
            c1324720kZq.setForeground(new ColorDrawable(C497740JfY.LIZLLL(R.attr.eos, c1324720kZq.getContext())));
            c1324720kZq.setTag(null);
        }
        C1291820jim c1291820jim = new C1291820jim(5);
        if (C1819620xS4.LIZLLL(imageModel)) {
            List urls = imageModel.getUrls();
            if (urls != null) {
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
                c1320810kTXLIZJ.LJIIIIZZ = new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.0ab0
                    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                    public final void LIZLLL(String str2, Throwable th) {
                        C1324720kZq c1324720kZq2 = c1324720kZq;
                        if (c1324720kZq2 != null && c1324720kZq2.getId() == R.id.pn4) {
                            this.getClass();
                        } else {
                            C1324720kZq c1324720kZq3 = c1324720kZq;
                            if (c1324720kZq3 != null && c1324720kZq3.getId() == R.id.rog) {
                                this.LLJJ = false;
                            }
                        }
                        C1304680k3W.LIZ.LIZ(40008, String.valueOf(th), null);
                    }

                    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                    public final void LJ(String str2, Object obj, Animatable animatable) {
                        C1324720kZq c1324720kZq2 = c1324720kZq;
                        boolean z = true;
                        if (c1324720kZq2 != null && c1324720kZq2.getId() == R.id.pn4) {
                            this.getClass();
                            return;
                        }
                        C1324720kZq c1324720kZq3 = c1324720kZq;
                        if (c1324720kZq3 == null || c1324720kZq3.getId() != R.id.rog) {
                            return;
                        }
                        C940990aav c940990aav = this;
                        if (obj == null || imageModel == null) {
                            z = false;
                        }
                        c940990aav.LLJJ = z;
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
        c1320810kTXLIZJ2.LJIIIIZZ = new C987320bne(c1324720kZq, this, 2);
        c1324720kZq.setController(c1320810kTXLIZJ2.LIZ());
    }

    public final void LJIIIZ(ImageModel imageModel, ImageModel imageModel2, C1324720kZq c1324720kZq) {
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
        MultiGuestGaussOptSetting multiGuestGaussOptSetting = MultiGuestGaussOptSetting.INSTANCE;
        if (!multiGuestGaussOptSetting.enable()) {
            LJIIJ(imageModel2, c1324720kZq);
            return;
        }
        if (!C1819620xS4.LIZLLL(imageModel)) {
            LJIIJ(imageModel2, c1324720kZq);
            return;
        }
        if (!multiGuestGaussOptSetting.enable() || this.LLJJ) {
            return;
        }
        C1324720kZq prepareAvatarBackground = getPrepareAvatarBackground();
        if (prepareAvatarBackground != null && !C500260Jjc.LJJJJIZL(prepareAvatarBackground)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showGaussianBlurBg, imageModel=");
        sbLIZ.append(imageModel);
        C20441214yg.LIZIZ("VideoOffBizViewElement", C2188811AlT.LIZIZ(sbLIZ));
        C492300JSi.LIZIZ(imageModel, getPrepareAvatarBackground(), getBlurImageLoadListener());
    }

    public C940990aav(Context context, DataChannel dataChannel, WeakReference<C938220aWS> weakReference, C957020b0m c957020b0m, InterfaceC940060aZQ interfaceC940060aZQ) {
        super(context, dataChannel, c957020b0m, interfaceC940060aZQ);
        this.LLIZLLLIL = dataChannel;
        this.LLJ = weakReference;
        this.LLJJI = C292401Bi.LIZ(new AwS559S0100000_15(this, 1138));
        this.LLJJIII = C292401Bi.LIZ(new AwS559S0100000_15(this, 1137));
    }
}
