package X;

import android.graphics.drawable.Animatable;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMImageLoadingApi;
import kotlin.jvm.internal.AFwS236S0000000_6;

/* JADX INFO: renamed from: X.0I9E, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I9E extends C1320700kTM<InterfaceC1330440kj4> {
    public int LIZIZ;
    public final /* synthetic */ C0I9A LIZJ;

    public C0I9E(C0I9A c0i9a) {
        this.LIZJ = c0i9a;
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LIZLLL(String str, Throwable th) {
        C0I9I c0i9i = this.LIZJ.LIZLLL;
        if (c0i9i != null) {
            c0i9i.LIZIZ(str, th);
        }
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LJFF(Object obj, String str) {
        C0I9I c0i9i = this.LIZJ.LIZLLL;
        if (c0i9i != null) {
            c0i9i.LIZJ(str);
        }
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final /* bridge */ /* synthetic */ void LIZJ(Object obj, String str) {
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LJ(String str, Object obj, Animatable animatable) {
        AnimatedDrawable2 animatedDrawable2;
        InterfaceC1330440kj4 interfaceC1330440kj4 = (InterfaceC1330440kj4) obj;
        if (animatable != null) {
            final C0I9A c0i9a = this.LIZJ;
            if (c0i9a.LJIIJ && (animatable instanceof AnimatedDrawable2) && (animatedDrawable2 = (AnimatedDrawable2) animatable) != null) {
                IMImageLoadingApi.LIZ.getClass();
                IMImageLoadingApi value = C0I9O.LIZIZ.getValue();
                if (value != null) {
                    value.LIZ((AnimatedDrawable2) animatable, AFwS236S0000000_6.get$arr$(449));
                }
                if (C300630BqP.LIZ()) {
                    animatedDrawable2.LLJJIJIL = new C0I9P() { // from class: X.0I9K
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
                                C1322110kVd c1322110kVd = c0i9a.LIZ;
                                if ((c1322110kVd instanceof C444350Hbd) && c1322110kVd != null) {
                                    c1322110kVd.setTag(-8357, Integer.valueOf(i2));
                                }
                                this.LIZ = false;
                            }
                        }
                    };
                }
            }
            if (animatable instanceof AnimatedDrawable2) {
                final C0I9A c0i9a2 = this.LIZJ;
                if (c0i9a2.LJ != 0) {
                    ((AnimatedDrawable2) animatable).LJII(new C0I9J() { // from class: X.0I9H
                        @Override // X.C0I9J, X.InterfaceC1331000kjy
                        public final void LIZ(AnimatedDrawable2 animatedDrawable22) {
                            if (this.LIZ.LIZIZ >= c0i9a2.LJ && animatedDrawable22 != null) {
                                animatedDrawable22.stop();
                            }
                        }

                        @Override // X.C0I9J, X.InterfaceC1331000kjy
                        public final void LIZLLL(AnimatedDrawable2 animatedDrawable22, int i) {
                            if (i == animatedDrawable22.LIZJ() - 1) {
                                C0I9E c0i9e = this.LIZ;
                                int i2 = c0i9e.LIZIZ + 1;
                                c0i9e.LIZIZ = i2;
                                if (i2 >= c0i9a2.LJ) {
                                    animatedDrawable22.stop();
                                }
                            }
                        }
                    });
                }
            }
        }
        C0I9I c0i9i = this.LIZJ.LIZLLL;
        if (c0i9i != null) {
            c0i9i.LIZ(str, interfaceC1330440kj4, animatable);
        }
    }
}
