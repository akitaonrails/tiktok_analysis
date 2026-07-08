package X;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0xtq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836840xtq extends ConstraintLayout {
    public LiveIconView LL;
    public LiveIconView LLILLJJLI;
    public LiveIconView LLILLL;

    private final LiveIconView getCenterImageView() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ll9);
            this.LLILLJJLI = (LiveIconView) callbackFindViewById;
        }
        return (LiveIconView) callbackFindViewById;
    }

    private final LiveIconView getLeftImageView() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.llc);
            this.LL = (LiveIconView) callbackFindViewById;
        }
        return (LiveIconView) callbackFindViewById;
    }

    private final LiveIconView getRightImageView() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.lld);
            this.LLILLL = (LiveIconView) callbackFindViewById;
        }
        return (LiveIconView) callbackFindViewById;
    }

    public final void setupImageView(LiveIconView liveIconView) {
        if (liveIconView != null) {
            liveIconView.setLayerType(2, null);
        }
        final float fLIZIZ = C497740JfY.LIZIZ(16.0f);
        if (liveIconView != null) {
            liveIconView.setOutlineProvider(new ViewOutlineProvider() { // from class: X.0Glf
                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), fLIZIZ);
                }
            });
            liveIconView.setClipToOutline(true);
        }
    }

    public C1836840xtq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void e0(LiveIconView liveIconView, C1836860xts c1836860xts) {
        if (liveIconView != null) {
            C786410Ut5.Db(liveIconView, c1836860xts.LIZ);
            ViewGroup.LayoutParams layoutParams = liveIconView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = (int) C497740JfY.LIZIZ(c1836860xts.LIZLLL);
                layoutParams.height = (int) C497740JfY.LIZIZ(c1836860xts.LJ);
            }
            if (liveIconView != null) {
                C786410Ut5.w6(liveIconView, layoutParams);
                float fLIZIZ = C497740JfY.LIZIZ(c1836860xts.LIZIZ);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(liveIconView);
                liveIconView.setTranslationX(fLIZIZ);
                C786410Ut5.nd(liveIconView, C497740JfY.LIZIZ(c1836860xts.LIZJ));
                liveIconView.setTranslationZ(c1836860xts.LJFF);
            }
        }
    }

    public final void h0(final LiveIconView liveIconView, String str) {
        C1324610kZf url = C1819620xS4.LIZ().setUrl(str);
        url.LJIIL = new InterfaceC1142670fqD() { // from class: X.0GnK
            @Override // X.InterfaceC1142670fqD
            public final void LIZ() {
            }

            @Override // X.InterfaceC1142670fqD
            public final void LIZIZ(Animatable animatable) {
            }

            @Override // X.InterfaceC1142670fqD
            public final void LIZLLL(String str2, Exception exc) {
            }

            @Override // X.InterfaceC1142670fqD
            public final void LIZJ(int i, int i2, String str2) {
                final LiveIconView liveIconView2 = liveIconView;
                if (liveIconView2 != null) {
                    final C1836840xtq c1836840xtq = this;
                    ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(liveIconView2, new Runnable() { // from class: X.0Gle
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("ServiceBioImageStackView@525a.loadInto$1$onLoadSuccess$$inlined$doOnPreDraw$1");
                            try {
                                liveIconView2.setOutlineProvider(null);
                                LiveIconView liveIconView3 = liveIconView2;
                                C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
                                Double dValueOf = Double.valueOf(0.5d);
                                c1546210qL5.getClass();
                                liveIconView3.setElevation(C1546210qL5.LIZ(dValueOf));
                                c1836840xtq.setupImageView(liveIconView2);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("ServiceBioImageStackView@525a.loadInto$1$onLoadSuccess$$inlined$doOnPreDraw$1");
                        }
                    });
                }
            }
        };
        url.LJIJI(Float.valueOf(C497740JfY.LIZIZ(16.0f)));
        url.LJJI(liveIconView);
    }

    public C1836840xtq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.huo, this, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i0(X.C1836840xtq r10, java.util.List r11, boolean r12, boolean r13, int r14) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1836840xtq.i0(X.0xtq, java.util.List, boolean, boolean, int):void");
    }
}
