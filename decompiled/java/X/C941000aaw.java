package X;

import Y.AkS477S0100000_15;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.widget.LinearLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.mask.PauseBizElementVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aaw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C941000aaw extends AbstractC939840aZ4 {
    public final DataChannel LLIZLLLIL;
    public final WeakReference<C938220aWS> LLJ;
    public C1126540fQC LLJI;
    public LinearLayout LLJIJIL;
    public C16F5 LLJILJIL;
    public C16F5 LLJILJILJ;
    public C1324720kZq LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public boolean LLJJIII;

    @Override // X.AbstractC939840aZ4
    public Integer getLayoutId() {
        return null;
    }

    private final Animator getPauseAlphaInAnimation() {
        return (Animator) this.LLJJ.getValue();
    }

    private final Animator getPauseAlphaOutAnimation() {
        return (Animator) this.LLJJI.getValue();
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        String str;
        C938220aWS c938220aWS;
        C938230aWT c938230aWTLIZJ;
        super.onAttachedToWindow();
        setVisibilityOpt(false);
        PosIdentity posIdentity = getWindow().getPosIdentity();
        if (posIdentity == null || posIdentity.type != 1 || (str = posIdentity.value) == null || (c938220aWS = this.LLJ.get()) == null || (c938230aWTLIZJ = c938220aWS.LIZJ(str, false, false)) == null) {
            return;
        }
        getCompositeDisposable().LIZ(new C11IW(C11NZ.LJIIJJI(c938230aWTLIZJ.LIZJ.LJJIFFI(), c938230aWTLIZJ.LJ.LJJII(new InterfaceC1627390sS1() { // from class: X.0ab1
            @Override // X.InterfaceC1627390sS1
            public final boolean test(Object obj, Object obj2) {
                Long lValueOf;
                List list = (List) obj2;
                C2262071DgL c2262071DgL = (C2262071DgL) C13LP.LJJJLL((List) obj);
                Long lValueOf2 = null;
                if (c2262071DgL != null) {
                    lValueOf = Long.valueOf(c2262071DgL.getId());
                } else {
                    lValueOf = null;
                }
                C2262071DgL c2262071DgL2 = (C2262071DgL) C13LP.LJJJLL(list);
                if (c2262071DgL2 != null) {
                    lValueOf2 = Long.valueOf(c2262071DgL2.getId());
                }
                return Intrinsics.LJFF(lValueOf, lValueOf2);
            }
        }), c938230aWTLIZJ.LJIIL.LJJIFFI(), new InterfaceC953020auK() { // from class: X.0ab3
            @Override // X.InterfaceC953020auK
            public final Object LIZ(Object obj, Object obj2, Object obj3) {
                return new C11H7(obj, obj2, obj3);
            }
        }).LJJJJZI(new AkS477S0100000_15(this, 13))).LJIILL().LJIIZILJ());
    }

    private final C1126540fQC getPauseImageView() {
        return this.LLJI;
    }

    private final C16F5 getPauseMainText() {
        return this.LLJILJIL;
    }

    private final C16F5 getPauseSecondText() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC939840aZ4
    public DataChannel getDataChannel() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC939840aZ4
    public EnumC939900aZA getElementType() {
        return EnumC939900aZA.PAUSE;
    }

    public final LinearLayout getPauseContainer() {
        return this.LLJIJIL;
    }

    public final void setVisibilityOpt(boolean z) {
        if (z) {
            if (!getInflated()) {
                setInflated(true);
                Context context = getContext();
                setInflated(true);
                C786410Ut5.Td(C786410Ut5.ne(context), R.layout.hts, this, true);
                this.LLJILLL = (C1324720kZq) findViewById(R.id.pn4);
                this.LLJI = (C1126540fQC) findViewById(R.id.q3u);
                this.LLJIJIL = (LinearLayout) findViewById(R.id.q3t);
                this.LLJILJIL = (C16F5) findViewById(R.id.q42);
                this.LLJILJILJ = (C16F5) findViewById(R.id.q4a);
                if (getWindow().LLJIJIL) {
                    C16F5 c16f5 = this.LLJILJILJ;
                    if (c16f5 != null) {
                        c16f5.setText(C497740JfY.LJIJI(2131840982));
                    }
                } else {
                    C16F5 c16f52 = this.LLJILJILJ;
                    if (c16f52 != null) {
                        c16f52.setText(C497740JfY.LJIJI(2131842084));
                    }
                }
            }
            C12ES.LJIILL(0, this);
        } else {
            C439101nJ.LJI(this);
        }
        DataChannel dataChannel = getDataChannel();
        Boolean boolValueOf = Boolean.valueOf(z);
        PosIdentity posIdentity = getWindow().getPosIdentity();
        String str = null;
        if (posIdentity != null && posIdentity.type == 1) {
            str = posIdentity.value;
        }
        dataChannel.zW(PauseBizElementVisibilityChannel.class, new Pair(boolValueOf, str));
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [REQUEST, X.0kbR] */
    /* JADX WARN: Type inference failed for: r0v3, types: [REQUEST, X.0kbR] */
    public final void LJIIIZ(final ImageModel imageModel, final C1324720kZq c1324720kZq) {
        List urls;
        if (c1324720kZq != null && c1324720kZq.getId() == R.id.pn4) {
            if (!this.LLJJIII) {
                C1324720kZq c1324720kZq2 = this.LLJILLL;
                if (c1324720kZq2 != null && !C500260Jjc.LJJJJIZL(c1324720kZq2)) {
                    return;
                } else {
                    this.LLJJIII = true;
                }
            } else {
                return;
            }
        }
        if (imageModel == null && c1324720kZq != null && c1324720kZq.getId() == R.id.pn4) {
            this.LLJJIII = false;
        }
        String str = null;
        if (c1324720kZq != null) {
            c1324720kZq.setBackground(null);
            c1324720kZq.setForeground(new ColorDrawable(C497740JfY.LIZLLL(R.attr.eos, c1324720kZq.getContext())));
            c1324720kZq.setTag(null);
        }
        C1291820jim c1291820jim = new C1291820jim(5);
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
                c1320810kTXLIZJ.LJIIIIZZ = new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.0aaz
                    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                    public final void LIZLLL(String str2, Throwable th) {
                        C1324720kZq c1324720kZq3 = c1324720kZq;
                        if (c1324720kZq3 != null && c1324720kZq3.getId() == R.id.pn4) {
                            this.LLJJIII = false;
                        }
                        C1304680k3W.LIZ.LIZ(40008, String.valueOf(th), null);
                    }

                    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                    public final void LJ(String str2, Object obj, Animatable animatable) {
                        C1324720kZq c1324720kZq3 = c1324720kZq;
                        boolean z = true;
                        if (c1324720kZq3 != null && c1324720kZq3.getId() == R.id.pn4) {
                            C941000aaw c941000aaw = this;
                            if (obj == null || imageModel == null) {
                                z = false;
                            }
                            c941000aaw.LLJJIII = z;
                        }
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
        c1320810kTXLIZJ2.LJIIIIZZ = new C987320bne(c1324720kZq, this, 0);
        c1324720kZq.setController(c1320810kTXLIZJ2.LIZ());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(X.C2262071DgL r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C941000aaw.LJIIJ(X.1DgL, boolean):void");
    }

    public C941000aaw(Context context, DataChannel dataChannel, WeakReference<C938220aWS> weakReference, C957020b0m c957020b0m, InterfaceC940060aZQ interfaceC940060aZQ) {
        super(context, dataChannel, c957020b0m, interfaceC940060aZQ);
        this.LLIZLLLIL = dataChannel;
        this.LLJ = weakReference;
        this.LLJJ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1112));
        this.LLJJI = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1113));
    }
}
