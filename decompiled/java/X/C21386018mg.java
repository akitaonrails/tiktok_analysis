package X;

import Y.AObjectS406S0100000_32;
import Y.AObserverS234S0100000_32;
import Y.ARunnableS132S0100000_32;
import Y.ARunnableS34S1200000_32;
import Y.ARunnableS36S1100000_32;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.mediabox.playerui.viewmodel.LegacyPlayerVM;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18mg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21386018mg extends AbstractC21386218mi {
    public final C21385918mf LJIIL;
    public InterfaceC21385618mc LJIILIIL;
    public String LJIILJJIL;
    public ObjectAnimator LJIILLIIL;
    public boolean LJIIZILJ;
    public ARunnableS36S1100000_32 LJIJI;
    public ARunnableS132S0100000_32 LJIJJ;
    public final C01GW LJIILL = C452501pT.LIZ(EnumC452301pR.NONE, new AObjectS406S0100000_32(this, 3));
    public final BPEAHandler LJIJ = new BPEAHandler(Looper.getMainLooper());
    public final AObserverS234S0100000_32 LJIJJLI = new AObserverS234S0100000_32(this, 35);
    public final C01GW LJIL = C452501pT.LIZIZ(new AObjectS406S0100000_32(this, 4));
    public final C01GW LJJ = C452501pT.LIZIZ(new AObjectS406S0100000_32(this, 5));
    public final C01GW LJJI = C452501pT.LIZIZ(new AObjectS406S0100000_32(this, 6));

    @Override // X.C0S34, X.C0S3C
    public final void LJII() {
        C1322090kVb c1322090kVb;
        LegacyPlayerVM legacyPlayerVM;
        MutableLiveData<C714890S2l> mutableLiveData;
        C21385918mf c21385918mf = this.LJIIL;
        if (c21385918mf != null && c21385918mf.LJI) {
            boolean z = C587180N1g.LIZ;
            Object value = this.LJJI.getValue();
            if (value != null) {
                Iterator<WeakReference<InterfaceC587190N1h>> it2 = C587180N1g.LIZIZ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    WeakReference<InterfaceC587190N1h> next = it2.next();
                    if (Intrinsics.LJFF(next.get(), value)) {
                        C587180N1g.LIZIZ.remove(next);
                        break;
                    }
                }
            }
            this.LJIJI = null;
            this.LJIJJ = null;
        } else {
            View viewLJFF = LJFF();
            if ((viewLJFF instanceof SmartImageView) && (c1322090kVb = (C1322090kVb) viewLJFF) != null) {
                c1322090kVb.setImageBitmap(null);
            }
        }
        InterfaceC715010S2x interfaceC715010S2x = this.LIZ;
        if (interfaceC715010S2x != null && (legacyPlayerVM = (LegacyPlayerVM) interfaceC715010S2x.LLILLJJLI(LegacyPlayerVM.class)) != null && (mutableLiveData = legacyPlayerVM.LLILLJJLI) != null) {
            mutableLiveData.removeObserver(this.LJIJJLI);
        }
        C21385918mf c21385918mf2 = this.LJIIL;
        if (c21385918mf2 != null && c21385918mf2.LJ) {
            ObjectAnimator objectAnimator = this.LJIILLIIL;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            this.LJIJ.removeCallbacks((Runnable) this.LJJ.getValue());
        }
        LJIJJ();
    }

    @Override // X.AbstractC21386218mi
    public final void LJIIIIZZ() {
        LifecycleOwner lifecycleOwnerLLILLIZIL;
        InterfaceC715010S2x interfaceC715010S2x;
        LegacyPlayerVM legacyPlayerVM;
        MutableLiveData<C714890S2l> mutableLiveData;
        InterfaceC715010S2x interfaceC715010S2x2 = this.LIZ;
        if (interfaceC715010S2x2 != null && (lifecycleOwnerLLILLIZIL = interfaceC715010S2x2.LLILLIZIL()) != null && (interfaceC715010S2x = this.LIZ) != null && (legacyPlayerVM = (LegacyPlayerVM) interfaceC715010S2x.LLILLJJLI(LegacyPlayerVM.class)) != null && (mutableLiveData = legacyPlayerVM.LLILLJJLI) != null) {
            mutableLiveData.observe(lifecycleOwnerLLILLIZIL, this.LJIJJLI);
        }
        InterfaceC21386618mm interfaceC21386618mm = this.LJI;
        this.LJIILIIL = interfaceC21386618mm instanceof InterfaceC21385618mc ? (InterfaceC21385618mc) interfaceC21386618mm : null;
        C21385918mf c21385918mf = this.LJIIL;
        if (c21385918mf == null || !c21385918mf.LJI) {
            return;
        }
        boolean z = C587180N1g.LIZ;
        C587180N1g.LIZ((C21385518mb) this.LJJI.getValue());
        this.LJIJJ = null;
        this.LJIJI = null;
    }

    @Override // X.AbstractC21386218mi
    public final void LJIILIIL() {
        C714880S2k c714880S2kLIZIZ;
        InterfaceC1483670oiD interfaceC1483670oiD;
        InterfaceC690370R6d interfaceC690370R6d = this.LJ;
        if (interfaceC690370R6d == null || (c714880S2kLIZIZ = interfaceC690370R6d.LIZIZ()) == null || (interfaceC1483670oiD = c714880S2kLIZIZ.LIZLLL) == null) {
            return;
        }
        interfaceC1483670oiD.LJJIJIIJIL((C21385318mZ) this.LJIL.getValue());
    }

    public final void LJIIZILJ() {
        ObjectAnimator objectAnimator = this.LJIILLIIL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        long j = this.LJIIL != null ? r0.LJFF : 0L;
        if (this.LJIILLIIL == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(LJIJ(), "alpha", 1.0f, 0.0f);
            this.LJIILLIIL = objectAnimatorOfFloat;
            if (objectAnimatorOfFloat != null) {
                objectAnimatorOfFloat.setDuration(j);
            }
        }
        this.LJIJ.removeCallbacksAndMessages(this.LJJ.getValue());
        C786410Ut5.LJLIIL(j, this.LJIJ, (Runnable) this.LJJ.getValue());
        ObjectAnimator objectAnimator2 = this.LJIILLIIL;
        if (objectAnimator2 != null) {
            C786410Ut5.Pd(objectAnimator2);
        }
    }

    public final ImageView LJIJ() {
        return (ImageView) this.LJIILL.getValue();
    }

    public final void LJIJJ() {
        C714880S2k c714880S2kLIZIZ;
        InterfaceC1483670oiD interfaceC1483670oiD;
        InterfaceC690370R6d interfaceC690370R6d = this.LJ;
        if (interfaceC690370R6d == null || (c714880S2kLIZIZ = interfaceC690370R6d.LIZIZ()) == null || (interfaceC1483670oiD = c714880S2kLIZIZ.LIZLLL) == null) {
            return;
        }
        interfaceC1483670oiD.LJIIL((C21385318mZ) this.LJIL.getValue());
    }

    public C21386018mg(C21385918mf c21385918mf) {
        this.LJIIL = c21385918mf;
    }

    @Override // X.AbstractC21386218mi
    public final void LJIIJ(InterfaceC21386618mm interfaceC21386618mm) {
        C21386818mo c21386818moLIZJ;
        String sourceId;
        SmartImageView smartImageView;
        final String sourceId2;
        C1322110kVd c1322110kVd;
        C1322090kVb c1322090kVb;
        ImageView imageViewLJIJ;
        Drawable drawable;
        View viewLJIIIZ;
        InterfaceC21385618mc interfaceC21385618mc = this.LJIILIIL;
        String sourceId3 = null;
        if (interfaceC21385618mc != null) {
            interfaceC21385618mc.getSourceId();
            c21386818moLIZJ = interfaceC21385618mc.LIZJ();
        } else {
            c21386818moLIZJ = null;
        }
        InterfaceC21385618mc interfaceC21385618mc2 = this.LJIILIIL;
        if (interfaceC21385618mc2 != null) {
            sourceId = interfaceC21385618mc2.getSourceId();
        } else {
            sourceId = null;
        }
        this.LJIILJJIL = sourceId;
        if (c21386818moLIZJ != null && (drawable = c21386818moLIZJ.LIZ) != null && (viewLJIIIZ = LJIIIZ()) != null) {
            viewLJIIIZ.setBackground(drawable);
        }
        C21385918mf c21385918mf = this.LJIIL;
        final boolean z = true;
        if (c21385918mf != null && c21385918mf.LJ) {
            this.LJIIZILJ = false;
            View viewLJIIIZ2 = LJIIIZ();
            if (viewLJIIIZ2 != null) {
                C786410Ut5.LJLLLLLL(0, viewLJIIIZ2);
            }
            if ((c21386818moLIZJ == null || TextUtils.isEmpty(c21386818moLIZJ.LIZLLL) || !(c21386818moLIZJ instanceof C21386418mk)) && (imageViewLJIJ = LJIJ()) != null) {
                C786410Ut5.LJZI(8, imageViewLJIJ);
            }
        }
        if (c21386818moLIZJ instanceof C21386918mp) {
            View viewLJIIIZ3 = LJIIIZ();
            if ((viewLJIIIZ3 instanceof SmartImageView) && (c1322090kVb = (C1322090kVb) viewLJIIIZ3) != null) {
                c1322090kVb.setImageBitmap(((C21386918mp) c21386818moLIZJ).LJ);
            }
            this.LJIIIIZZ = 2;
            this.LJIIZILJ = true;
            return;
        }
        if (c21386818moLIZJ instanceof C0R6D) {
            View viewLJIIIZ4 = LJIIIZ();
            if ((viewLJIIIZ4 instanceof SmartImageView) && (c1322110kVd = (C1322110kVd) viewLJIIIZ4) != null) {
                c1322110kVd.setImageURI(((C0R6D) c21386818moLIZJ).LJ);
            }
            this.LJIIIIZZ = 2;
            this.LJIIZILJ = true;
            return;
        }
        if (!(c21386818moLIZJ instanceof C21386418mk)) {
            return;
        }
        final C21386418mk c21386418mk = (C21386418mk) c21386818moLIZJ;
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(c21386418mk.LJFF);
        Pair<Integer, Integer> pair = c21386418mk.LJIIIZ;
        if (pair != null) {
            c1331670kl3LJIIIIZZ.LJJIJ(new int[]{pair.getFirst().intValue(), pair.getSecond().intValue()});
        }
        C1331990klZ c1331990klZ = c21386418mk.LJIIJJI;
        if (c1331990klZ != null) {
            c1331670kl3LJIIIIZZ.LJJII = c1331990klZ;
        }
        c1331670kl3LJIIIIZZ.LIZLLL("MediaBoxCoverPresenter");
        c1331670kl3LJIIIIZZ.LJJIII = c21386418mk.LJI;
        View viewLJIIIZ5 = LJIIIZ();
        if (viewLJIIIZ5 instanceof SmartImageView) {
            smartImageView = (SmartImageView) viewLJIIIZ5;
        } else {
            smartImageView = null;
        }
        c1331670kl3LJIIIIZZ.LJJ(smartImageView);
        c1331670kl3LJIIIIZZ.LJJIIZ = c21386418mk.LJIIJ;
        final InterfaceC658750Psf interfaceC658750Psf = c21386418mk.LJIIIIZZ;
        InterfaceC21385618mc interfaceC21385618mc3 = this.LJIILIIL;
        if (interfaceC21385618mc3 != null) {
            interfaceC21385618mc3.getSourceId();
        }
        c1331670kl3LJIIIIZZ.LJJJIL = new InterfaceC658750Psf(interfaceC658750Psf) { // from class: X.14Qg
            public final InterfaceC658750Psf LL;

            {
                this.LL = interfaceC658750Psf;
            }

            @Override // X.InterfaceC658750Psf
            public final void Ck(JSONObject jSONObject) {
                InterfaceC658750Psf interfaceC658750Psf2 = this.LL;
                if (interfaceC658750Psf2 != null) {
                    interfaceC658750Psf2.Ck(jSONObject);
                }
            }

            @Override // X.InterfaceC658750Psf
            public final void onImageLoaded(boolean z2, String str, JSONObject jSONObject) {
                InterfaceC658750Psf interfaceC658750Psf2 = this.LL;
                if (interfaceC658750Psf2 != null) {
                    interfaceC658750Psf2.onImageLoaded(z2, str, jSONObject);
                }
            }
        };
        final InterfaceC427850Gq7 interfaceC427850Gq7 = c21386418mk.LJII;
        InterfaceC21385618mc interfaceC21385618mc4 = this.LJIILIIL;
        if (interfaceC21385618mc4 != null) {
            sourceId2 = interfaceC21385618mc4.getSourceId();
        } else {
            sourceId2 = null;
        }
        c1331670kl3LJIIIIZZ.LJIIJ(new InterfaceC427850Gq7(interfaceC427850Gq7, sourceId2) { // from class: X.18ma
            public final InterfaceC427850Gq7 LL;
            public final String LLILLJJLI;

            @Override // X.InterfaceC427850Gq7
            public final void e1(Uri uri) {
                InterfaceC427850Gq7 interfaceC427850Gq72 = this.LL;
                if (interfaceC427850Gq72 != null) {
                    interfaceC427850Gq72.e1(uri);
                }
            }

            @Override // X.InterfaceC427850Gq7
            public final void A3(Uri uri, C428600GrK c428600GrK) {
                InterfaceC427850Gq7 interfaceC427850Gq72 = this.LL;
                if (interfaceC427850Gq72 != null) {
                    interfaceC427850Gq72.A3(uri, c428600GrK);
                }
            }

            @Override // X.InterfaceC427850Gq7
            public final void Bh(Uri uri, View view) {
                InterfaceC427850Gq7 interfaceC427850Gq72 = this.LL;
                if (interfaceC427850Gq72 != null) {
                    interfaceC427850Gq72.Bh(uri, view);
                }
            }

            @Override // X.InterfaceC427850Gq7
            public final void lg(Uri uri, Throwable th) {
                InterfaceC427850Gq7 interfaceC427850Gq72 = this.LL;
                if (interfaceC427850Gq72 != null) {
                    interfaceC427850Gq72.lg(uri, th);
                }
            }

            {
                this.LL = interfaceC427850Gq7;
                this.LLILLJJLI = sourceId2;
            }

            @Override // X.InterfaceC427850Gq7
            public final void cm(Uri uri, View view, Throwable th) {
                InterfaceC427850Gq7 interfaceC427850Gq72 = this.LL;
                if (interfaceC427850Gq72 != null) {
                    interfaceC427850Gq72.cm(uri, view, th);
                }
            }

            @Override // X.InterfaceC427850Gq7
            public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                String sourceId4;
                ImageView imageViewLJIJ2;
                ImageView imageViewLJIJ3;
                InterfaceC427850Gq7 interfaceC427850Gq72 = this.LL;
                if (interfaceC427850Gq72 != null) {
                    interfaceC427850Gq72.Ad(uri, view, c428600GrK, animatable);
                }
                C21385918mf c21385918mf2 = this.LLILLL.LJIIL;
                if (c21385918mf2 != null && c21385918mf2.LJ) {
                    if (!TextUtils.isEmpty(this.LLILLJJLI)) {
                        String str = this.LLILLJJLI;
                        InterfaceC21385618mc interfaceC21385618mc5 = this.LLILLL.LJIILIIL;
                        if (interfaceC21385618mc5 != null) {
                            sourceId4 = interfaceC21385618mc5.getSourceId();
                        } else {
                            sourceId4 = null;
                        }
                        if (Intrinsics.LJFF(str, sourceId4)) {
                            C21386018mg c21386018mg = this.LLILLL;
                            c21386018mg.LJIIZILJ = true;
                            if (c21386018mg.LJIIIZ == 1 && (imageViewLJIJ3 = c21386018mg.LJIJ()) != null && imageViewLJIJ3.getVisibility() == 0) {
                                this.LLILLL.LJIIZILJ();
                                return;
                            }
                            C21386018mg c21386018mg2 = this.LLILLL;
                            if (c21386018mg2.LJIIIZ != 0 || (imageViewLJIJ2 = c21386018mg2.LJIJ()) == null) {
                                return;
                            }
                            C786410Ut5.LJZI(8, imageViewLJIJ2);
                            return;
                        }
                    }
                    ImageView imageViewLJIJ4 = this.LLILLL.LJIJ();
                    if (imageViewLJIJ4 != null) {
                        C786410Ut5.LJZI(8, imageViewLJIJ4);
                    }
                    this.LLILLL.LJIIZILJ = true;
                }
            }
        });
        C21385918mf c21385918mf2 = this.LJIIL;
        if (c21385918mf2 == null || !c21385918mf2.LJ || TextUtils.isEmpty(c21386418mk.LIZLLL)) {
            z = false;
        }
        if (!C1474810oTv.LJLL() && !z) {
            return;
        }
        C0NAP value = C0NAP.LJIIJJI.getValue();
        InterfaceC21385618mc interfaceC21385618mc5 = this.LJIILIIL;
        if (interfaceC21385618mc5 != null) {
            sourceId3 = interfaceC21385618mc5.getSourceId();
        }
        InterfaceC21385618mc interfaceC21385618mc6 = this.LJIILIIL;
        if (interfaceC21385618mc6 != null) {
            interfaceC21385618mc6.LJII();
        }
        value.getClass();
        if (sourceId3 != null && Intrinsics.LJFF(C0NAP.LJIIL.LIZJ(sourceId3), Boolean.TRUE)) {
            this.LJIIIIZZ = 2;
            return;
        }
        ExecutorService executorService = C1475000oUE.LIZLLL;
        if (executorService == null) {
            return;
        }
        executorService.execute(new Runnable() { // from class: X.18mj
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                final C21386018mg c21386018mg = this.LL;
                boolean z2 = z;
                C21386418mk c21386418mk2 = c21386418mk;
                C1C7U.LIZ("LegacyCoverUiPresenter@7c4.handleCheckCoverCache$1L");
                C0NAP value2 = C0NAP.LJIIJJI.getValue();
                InterfaceC21385618mc interfaceC21385618mc7 = c21386018mg.LJIILIIL;
                String sourceId4 = interfaceC21385618mc7 != null ? interfaceC21385618mc7.getSourceId() : null;
                InterfaceC21385618mc interfaceC21385618mc8 = c21386018mg.LJIILIIL;
                String strLJII = interfaceC21385618mc8 != null ? interfaceC21385618mc8.LJII() : null;
                value2.getClass();
                if (C0NAP.LIZJ(sourceId4, strLJII)) {
                    i = 2;
                } else if (z2) {
                    InterfaceC21385618mc interfaceC21385618mc9 = c21386018mg.LJIILIIL;
                    final String sourceId5 = interfaceC21385618mc9 != null ? interfaceC21385618mc9.getSourceId() : null;
                    new C1318140kPE(c21386418mk2.LIZLLL, null, new InterfaceC1318130kPD() { // from class: X.18ml
                        @Override // X.InterfaceC1318130kPD
                        public final void LIZ(Bitmap bitmap) {
                            C21386018mg c21386018mg2 = c21386018mg;
                            C786410Ut5.LJJZZIII(c21386018mg2.LJIJ, new ARunnableS34S1200000_32(bitmap, c21386018mg2, sourceId5, 6));
                        }
                    });
                    i = 4;
                } else {
                    i = 1;
                }
                c21386018mg.LJIIIIZZ = i;
                C1C7U.LIZIZ("LegacyCoverUiPresenter@7c4.handleCheckCoverCache$1L");
            }
        });
    }

    @Override // X.AbstractC21386218mi
    public final void LJIILJJIL(InterfaceC690390R6f interfaceC690390R6f) {
        InterfaceC21385618mc interfaceC21385618mc = this.LJIILIIL;
        if (interfaceC21385618mc != null) {
            interfaceC21385618mc.getSourceId();
            interfaceC21385618mc.LJIIIIZZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    @Override // X.AbstractC21386218mi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILL(X.InterfaceC21386618mm r6) {
        /*
            r5 = this;
            X.18mf r0 = r5.LJIIL
            r4 = 1
            r2 = 0
            if (r0 == 0) goto L53
            boolean r0 = r0.LJ
            if (r0 != r4) goto L53
            r0 = 1
        Lb:
            r3 = 8
            if (r0 == 0) goto L2e
            android.animation.ObjectAnimator r0 = r5.LJIILLIIL
            if (r0 == 0) goto L16
            r0.cancel()
        L16:
            android.widget.ImageView r1 = r5.LJIJ()
            if (r1 == 0) goto L21
            r0 = 1065353216(0x3f800000, float:1.0)
            X.C786410Ut5.V4(r1, r0)
        L21:
            boolean r0 = r5.LJIIZILJ
            if (r0 == 0) goto L2e
            android.widget.ImageView r0 = r5.LJIJ()
            if (r0 == 0) goto L2e
            X.C786410Ut5.LJZI(r3, r0)
        L2e:
            X.18mc r0 = r5.LJIILIIL
            if (r0 == 0) goto L51
            r0.getSourceId()
            boolean r0 = r0.LJFF()
            if (r0 != r4) goto L51
            r0 = 1
        L3c:
            r1 = 3
            if (r0 == 0) goto L55
            r5.LJIJI(r2)
            android.view.View r0 = r5.LJFF()
            if (r0 == 0) goto L4b
            X.C786410Ut5.LJLLLLLL(r3, r0)
        L4b:
            r5.LJIIJJI()
            r5.LJIIIIZZ = r1
            return r2
        L51:
            r0 = 0
            goto L3c
        L53:
            r0 = 0
            goto Lb
        L55:
            X.0R6d r0 = r5.LJ
            if (r0 == 0) goto L7b
            X.0S2k r0 = r0.LIZIZ()
            if (r0 == 0) goto L7b
            X.0oiD r0 = r0.LIZLLL
            if (r0 == 0) goto L7b
            boolean r0 = r5.LJIILLIIL(r0)
            if (r0 == 0) goto L7b
            android.view.View r0 = r5.LJFF()
            if (r0 == 0) goto L72
            X.C786410Ut5.LJLLLLLL(r3, r0)
        L72:
            r5.LJIIIIZZ = r1
            r5.LJIIJJI()
            r5.LJIJI(r2)
            return r2
        L7b:
            r5.LJIJI(r4)
            android.view.View r0 = r5.LJFF()
            if (r0 == 0) goto L87
            X.C786410Ut5.LJLLLLLL(r2, r0)
        L87:
            r5.LJIIL()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21386018mg.LJIILL(X.18mm):boolean");
    }

    public final boolean LJIILLIIL(InterfaceC1483670oiD interfaceC1483670oiD) {
        String sourceId;
        SimVideoUrlModel simVideoUrlModelLJJIII;
        String sourceId2;
        String sourceId3;
        SimVideoUrlModel simVideoUrlModelLJJIII2;
        String sourceId4 = null;
        if (((Boolean) C1474810oTv.n4.getValue()).booleanValue()) {
            InterfaceC1481730of5 interfaceC1481730of5LJIIIZ = interfaceC1483670oiD.LJIIIZ();
            if (interfaceC1481730of5LJIIIZ != null && (simVideoUrlModelLJJIII2 = interfaceC1481730of5LJIIIZ.LJJIII()) != null) {
                sourceId2 = simVideoUrlModelLJJIII2.getSourceId();
            } else {
                sourceId2 = null;
            }
            InterfaceC21385618mc interfaceC21385618mc = this.LJIILIIL;
            if (interfaceC21385618mc != null) {
                sourceId3 = interfaceC21385618mc.getSourceId();
            } else {
                sourceId3 = null;
            }
            if (Intrinsics.LJFF(sourceId2, sourceId3)) {
                InterfaceC1484080ois playState = interfaceC1483670oiD.getPlayState();
                InterfaceC21385618mc interfaceC21385618mc2 = this.LJIILIIL;
                if (interfaceC21385618mc2 != null) {
                    sourceId4 = interfaceC21385618mc2.getSourceId();
                }
                if (playState.LJJLIL(sourceId4)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        InterfaceC1481730of5 interfaceC1481730of5LJIIIZ2 = interfaceC1483670oiD.LJIIIZ();
        if (interfaceC1481730of5LJIIIZ2 != null && (simVideoUrlModelLJJIII = interfaceC1481730of5LJIIIZ2.LJJIII()) != null) {
            sourceId = simVideoUrlModelLJJIII.getSourceId();
        } else {
            sourceId = null;
        }
        InterfaceC21385618mc interfaceC21385618mc3 = this.LJIILIIL;
        if (interfaceC21385618mc3 != null) {
            sourceId4 = interfaceC21385618mc3.getSourceId();
        }
        if (Intrinsics.LJFF(sourceId, sourceId4) && !interfaceC1483670oiD.getPlayState().LJJIJIIJIL()) {
            return true;
        }
        return false;
    }

    public final void LJIJI(boolean z) {
        String str;
        String strLIZLLL;
        if (C1481110oe5.LIZ) {
            if (z) {
                str = "cover show";
            } else {
                str = "cover hide";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(", title:");
            InterfaceC21385618mc interfaceC21385618mc = this.LJIILIIL;
            String sourceId = null;
            if (interfaceC21385618mc != null) {
                strLIZLLL = interfaceC21385618mc.LIZLLL();
            } else {
                strLIZLLL = null;
            }
            sbLIZ.append(strLIZLLL);
            sbLIZ.append(", sourceId:");
            InterfaceC21385618mc interfaceC21385618mc2 = this.LJIILIIL;
            if (interfaceC21385618mc2 != null) {
                sourceId = interfaceC21385618mc2.getSourceId();
            }
            sbLIZ.append(sourceId);
            sbLIZ.append(", view:");
            sbLIZ.append(LJFF());
            C1481110oe5.LIZIZ("MediaBoxCoverPresenter", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
