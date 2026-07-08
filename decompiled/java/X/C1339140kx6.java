package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;

/* JADX INFO: renamed from: X.0kx6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1339140kx6 extends AbstractC1335900krs {
    public final int $t;
    public Object l0;

    public static final void cm$0(C1339140kx6 c1339140kx6, Uri uri, View view, Throwable th) {
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
            default:
                super.Ad(uri, view, c428600GrK, animatable);
                break;
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
            default:
                super.cm(uri, view, th);
                break;
        }
    }

    public C1339140kx6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void cm$1(C1339140kx6 c1339140kx6, Uri uri, View view, Throwable th) {
        InterfaceC427850Gq7 interfaceC427850Gq7 = (InterfaceC427850Gq7) c1339140kx6.l0;
        if (interfaceC427850Gq7 != null) {
            interfaceC427850Gq7.cm(uri, view, th);
        }
    }

    public static final void Ad$0(C1339140kx6 c1339140kx6, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        AnimatedDrawable2 animatedDrawable2;
        if ((animatable instanceof AnimatedDrawable2) && (animatedDrawable2 = (AnimatedDrawable2) animatable) != null) {
            animatedDrawable2.LJI(new C1331010kjz(((AnimatedDrawable2) animatable).LLILLL));
            final FeedAvatarDefaultAssem feedAvatarDefaultAssem = (FeedAvatarDefaultAssem) c1339140kx6.l0;
            feedAvatarDefaultAssem.getClass();
            animatedDrawable2.LJII(new C0I9J() { // from class: X.0kug
                @Override // X.C0I9J, X.InterfaceC1331000kjy
                public final void LIZ(AnimatedDrawable2 animatedDrawable22) {
                    C430230Gtx c430230Gtx = feedAvatarDefaultAssem.LLJLIL;
                    C430210Gtv c430210Gtv = null;
                    if (c430230Gtx == null) {
                        c430230Gtx = null;
                    }
                    int visibility = c430230Gtx.getVisibility();
                    c430230Gtx.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, c430230Gtx);
                    C430210Gtv c430210Gtv2 = feedAvatarDefaultAssem.LLJJL;
                    if (c430210Gtv2 != null) {
                        c430210Gtv = c430210Gtv2;
                    }
                    C786410Ut5.n(c430210Gtv, 8);
                }

                @Override // X.C0I9J, X.InterfaceC1331000kjy
                public final void LIZJ(AnimatedDrawable2 animatedDrawable22) {
                    C430210Gtv c430210Gtv = feedAvatarDefaultAssem.LLJJL;
                    C430230Gtx c430230Gtx = null;
                    if (c430210Gtv == null) {
                        c430210Gtv = null;
                    }
                    C786410Ut5.n(c430210Gtv, 0);
                    C430230Gtx c430230Gtx2 = feedAvatarDefaultAssem.LLJLIL;
                    if (c430230Gtx2 == null) {
                        c430230Gtx2 = null;
                    }
                    int visibility = c430230Gtx2.getVisibility();
                    c430230Gtx2.setVisibility(8);
                    C1602160rnK.LIZIZ(visibility, 8, c430230Gtx2);
                    FeedAvatarDefaultAssem feedAvatarDefaultAssem2 = feedAvatarDefaultAssem;
                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(null);
                    C430230Gtx c430230Gtx3 = feedAvatarDefaultAssem.LLJLIL;
                    if (c430230Gtx3 != null) {
                        c430230Gtx = c430230Gtx3;
                    }
                    if (feedAvatarDefaultAssem2.LLLIILIL.getValue() != null) {
                        c1331670kl3LJIIIIZZ.LJJIJ((int[]) feedAvatarDefaultAssem2.LLLIILIL.getValue());
                    }
                    int iHp = feedAvatarDefaultAssem2.hp();
                    int iHp2 = feedAvatarDefaultAssem2.hp();
                    c1331670kl3LJIIIIZZ.LJIIIIZZ = iHp;
                    c1331670kl3LJIIIIZZ.LJIIIZ = iHp2;
                    c1331670kl3LJIIIIZZ.LIZLLL((String) feedAvatarDefaultAssem2.LLLIIL.getValue());
                    c1331670kl3LJIIIIZZ.LJJ(c430230Gtx);
                    C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                }
            });
        }
    }

    public static final void Ad$1(C1339140kx6 c1339140kx6, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        InterfaceC427850Gq7 interfaceC427850Gq7 = (InterfaceC427850Gq7) c1339140kx6.l0;
        if (interfaceC427850Gq7 != null) {
            interfaceC427850Gq7.Ad(uri, view, c428600GrK, animatable);
        }
    }
}
