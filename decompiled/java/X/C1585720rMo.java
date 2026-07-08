package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rMo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1585720rMo extends C09AY implements Function0<C1582660rHs> {
    public C1585720rMo() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0rHs] */
    @Override // kotlin.jvm.functions.Function0
    public final C1582660rHs invoke() {
        return new InterfaceC1570900qyu() { // from class: X.0rHs
            public final String LL = EnumC1584350rKb.STORY.getTag();
            public final int LLILLJJLI = 8388627;
            public final boolean LLILLL = true;

            @Override // X.InterfaceC1570900qyu
            public final void LIZ() {
            }

            @Override // X.InterfaceC1570900qyu
            public final void S1(boolean z) {
            }

            @Override // X.InterfaceC1570900qyu
            public final void T1() {
            }

            @Override // X.InterfaceC1570900qyu
            public final void U1(View view) {
            }

            @Override // X.InterfaceC1570900qyu
            public final void V1(InterfaceC1617760sCU interfaceC1617760sCU) {
            }

            @Override // X.InterfaceC1570900qyu
            public final void W1(MainFragment mainFragment, InterfaceC1617760sCU interfaceC1617760sCU) {
            }

            @Override // X.InterfaceC1570900qyu
            public final void X1(int i) {
            }

            @Override // X.InterfaceC1570900qyu
            public final void Y1(InterfaceC1571160qzK interfaceC1571160qzK, int i) {
            }

            @Override // X.InterfaceC1570900qyu
            public final void Z1() {
            }

            @Override // X.InterfaceC1570900qyu
            public final void a2() {
            }

            @Override // X.InterfaceC1570900qyu
            public final boolean b2() {
                return false;
            }

            @Override // X.InterfaceC1570900qyu
            public final void d2(Integer num) {
            }

            @Override // X.InterfaceC1570900qyu
            public final void e2() {
            }

            @Override // X.InterfaceC1570900qyu
            public final void g2() {
            }

            @Override // X.InterfaceC1570900qyu
            public final void onCreate() {
            }

            @Override // X.InterfaceC1570900qyu
            public final void onDestroyView() {
            }

            @Override // X.InterfaceC1570900qyu
            public final void onPause() {
            }

            @Override // X.InterfaceC1570900qyu
            public final void onResume() {
            }

            @Override // X.InterfaceC1570900qyu
            public final boolean enabled() {
                return ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && C1601110rld.LIZ() && C1585060rLk.LIZIZ();
            }

            @Override // X.InterfaceC1570900qyu
            public final boolean c2() {
                return this.LLILLL;
            }

            @Override // X.InterfaceC1570900qyu
            public final String getTag() {
                return this.LL;
            }

            @Override // X.InterfaceC1570900qyu
            public final View f2(Context context) {
                if (C1595910rdF.LIZ().mainEnable) {
                    C1600650rkt c1600650rkt = new C1600650rkt(context, null, 0);
                    c1600650rkt.setId(R.id.w_e);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, this.LLILLJJLI);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1600650rkt);
                    c1600650rkt.setLayoutParams(layoutParams);
                    return c1600650rkt;
                }
                ImageView imageView = new ImageView(context);
                imageView.setId(R.id.w_e);
                C786410Ut5.c6(imageView, new FrameLayout.LayoutParams(-2, -2, this.LLILLJJLI));
                return imageView;
            }
        };
    }
}
