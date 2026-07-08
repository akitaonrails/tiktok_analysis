package X;

import android.graphics.drawable.Animatable;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMImageLoadingApi;
import kotlin.jvm.internal.AFwS236S0000000_6;

/* JADX INFO: renamed from: X.0I9M, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I9M implements InterfaceC1320650kTH<InterfaceC1330440kj4> {
    public final /* synthetic */ InterfaceC1320650kTH<InterfaceC1330440kj4> LIZ;
    public final /* synthetic */ InterfaceC1320650kTH<InterfaceC1330440kj4> LIZIZ;
    public final /* synthetic */ C1322110kVd LIZJ;

    @Override // X.InterfaceC1320650kTH
    public final void LIZ(String str, Throwable th) {
        this.LIZ.LIZ(str, th);
    }

    @Override // X.InterfaceC1320650kTH
    public final void LIZIZ(String str) {
        this.LIZ.LIZIZ(str);
    }

    @Override // X.InterfaceC1320650kTH
    public final void LIZLLL(String str, Throwable th) {
        this.LIZ.LIZLLL(str, th);
    }

    @Override // X.InterfaceC1320650kTH
    public final void LJFF(Object obj, String str) {
        this.LIZ.LJFF(obj, str);
    }

    public C0I9M(InterfaceC1320650kTH<InterfaceC1330440kj4> interfaceC1320650kTH, C1322110kVd c1322110kVd) {
        this.LIZIZ = interfaceC1320650kTH;
        this.LIZJ = c1322110kVd;
        this.LIZ = interfaceC1320650kTH;
    }

    @Override // X.InterfaceC1320650kTH
    public final void LIZJ(Object obj, String str) {
        this.LIZ.LIZJ(obj, str);
    }

    @Override // X.InterfaceC1320650kTH
    public final void LJ(String str, InterfaceC1330440kj4 interfaceC1330440kj4, Animatable animatable) {
        AnimatedDrawable2 animatedDrawable2;
        InterfaceC1320650kTH<InterfaceC1330440kj4> interfaceC1320650kTH = this.LIZIZ;
        if (interfaceC1320650kTH != null) {
            interfaceC1320650kTH.LJ(str, interfaceC1330440kj4, animatable);
        }
        if (C300630BqP.LIZ() && (animatable instanceof AnimatedDrawable2) && (animatedDrawable2 = (AnimatedDrawable2) animatable) != null) {
            final C1322110kVd c1322110kVd = this.LIZJ;
            IMImageLoadingApi.LIZ.getClass();
            IMImageLoadingApi value = C0I9O.LIZIZ.getValue();
            if (value != null) {
                value.LIZ((AnimatedDrawable2) animatable, AFwS236S0000000_6.get$arr$(448));
            }
            animatedDrawable2.LLJJIJIL = new C0I9P() { // from class: X.0I9L
                public boolean LIZ = true;

                @Override // X.C0I9P
                public final void LIZ(InterfaceC1330990kjx interfaceC1330990kjx, int i) {
                    int i2;
                    if (this.LIZ) {
                        if (interfaceC1330990kjx instanceof C1330480kj8) {
                            i2 = 1;
                        } else if (interfaceC1330990kjx instanceof C1330040kiQ) {
                            i2 = 2;
                        } else if (interfaceC1330990kjx instanceof C1330980kjw) {
                            i2 = 3;
                        } else {
                            i2 = 0;
                        }
                        C1322110kVd c1322110kVd2 = c1322110kVd;
                        if ((c1322110kVd2 instanceof C444350Hbd) && c1322110kVd2 != null) {
                            c1322110kVd2.setTag(-8357, Integer.valueOf(i2));
                        }
                        this.LIZ = false;
                    }
                }
            };
        }
    }
}
