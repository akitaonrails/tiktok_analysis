package X;

import Y.ARunnableS127S0100000_27;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.ss.android.ugc.aweme.rss.link.ui.RssIntroAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ycM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864440ycM extends AbstractC1335900krs {
    public final int $t;
    public Object l0;

    public static final void Bh$0(C1864440ycM c1864440ycM, Uri uri, View view) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        switch (this.$t) {
            case 0:
                Ad$0(this, uri, view, c428600GrK, animatable);
                break;
            case 1:
                Ad$1(this, uri, view, c428600GrK, animatable);
                break;
            case 2:
                Ad$2(this, uri, view, c428600GrK, animatable);
                break;
            case 3:
                Ad$3(this, uri, view, c428600GrK, animatable);
                break;
            default:
                super.Ad(uri, view, c428600GrK, animatable);
                break;
        }
    }

    @Override // X.AbstractC1335900krs, X.InterfaceC427850Gq7
    public final void Bh(Uri uri, View view) {
        if (2 - this.$t != 0) {
            super.Bh(uri, view);
        } else {
            Bh$0(this, uri, view);
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) {
        switch (this.$t) {
            case 0:
                cm$0(this, uri, view, th);
                break;
            case 1:
                cm$1(this, uri, view, th);
                break;
            case 2:
                cm$2(this, uri, view, th);
                break;
            case 3:
                cm$3(this, uri, view, th);
                break;
            default:
                super.cm(uri, view, th);
                break;
        }
    }

    public C1864440ycM(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void cm$0(C1864440ycM c1864440ycM, Uri uri, View view, Throwable th) {
        RssIntroAssem rssIntroAssem = (RssIntroAssem) c1864440ycM.l0;
        rssIntroAssem.getClass();
        rssIntroAssem.LLJ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(rssIntroAssem), null, null, new C05O9(rssIntroAssem, null), 3);
    }

    public static final void cm$1(C1864440ycM c1864440ycM, Uri uri, View view, Throwable th) {
        C1819090xRD c1819090xRD = (C1819090xRD) c1864440ycM.l0;
        HandlerHook.viewPost(c1819090xRD.LLILLL, new ARunnableS127S0100000_27(c1819090xRD, 55));
    }

    public static final void cm$2(C1864440ycM c1864440ycM, Uri uri, View view, Throwable th) {
        if (!((C09AJ) c1864440ycM.l0).isDisposed()) {
            ((C09AJ) c1864440ycM.l0).onError(th);
        }
    }

    public static final void cm$3(C1864440ycM c1864440ycM, Uri uri, View view, Throwable th) {
        Function1<? super Boolean, Unit> function1 = ((C1845250y7P) c1864440ycM.l0).LLJJ;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
    }

    public static final void Ad$0(C1864440ycM c1864440ycM, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        AnimatedDrawable2 animatedDrawable2;
        RssIntroAssem rssIntroAssem = (RssIntroAssem) c1864440ycM.l0;
        if (animatable instanceof AnimatedDrawable2) {
            animatedDrawable2 = (AnimatedDrawable2) animatable;
        } else {
            animatedDrawable2 = null;
        }
        rssIntroAssem.LLJI = animatedDrawable2;
        if (animatedDrawable2 != null) {
            animatedDrawable2.start();
        }
        final RssIntroAssem rssIntroAssem2 = (RssIntroAssem) c1864440ycM.l0;
        AnimatedDrawable2 animatedDrawable22 = rssIntroAssem2.LLJI;
        if (animatedDrawable22 != null) {
            animatedDrawable22.LLJJIJIL = new C0I9P() { // from class: X.0y80
                @Override // X.C0I9P
                public final void LIZ(InterfaceC1330990kjx interfaceC1330990kjx, int i) {
                    if (i != 0) {
                        if (i != 32) {
                            if (i == 33) {
                                rssIntroAssem2.Go(2);
                                return;
                            }
                            return;
                        }
                        rssIntroAssem2.Go(1);
                        return;
                    }
                    rssIntroAssem2.Go(0);
                }
            };
        }
    }

    public static final void Ad$1(C1864440ycM c1864440ycM, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        C1819090xRD c1819090xRD = (C1819090xRD) c1864440ycM.l0;
        HandlerHook.viewPost(c1819090xRD.LLILLL, new ARunnableS127S0100000_27(c1819090xRD, 54));
    }

    public static final void Ad$2(C1864440ycM c1864440ycM, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        if (!((C09AJ) c1864440ycM.l0).isDisposed()) {
            ((C09AJ) c1864440ycM.l0).onNext("");
        }
    }

    public static final void Ad$3(C1864440ycM c1864440ycM, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        Function1<? super Boolean, Unit> function1 = ((C1845250y7P) c1864440ycM.l0).LLJJ;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
    }
}
