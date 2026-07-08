package X;

import Y.ALAdapterS27S0200000_33;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.util.Property;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multihost.biz.quickcohost.event.QuickCoHostCountDownEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.1AcH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183111AcH {
    public static final C2183101AcG LJIIIZ = new C2183101AcG();
    public static final C2183141AcK<Boolean> LJIIJ;
    public static final C2183141AcK<List<Bitmap>> LJIIJJI;
    public static final C2183141AcK<Integer> LJIIL;
    public static final C2183141AcK<List<ImageModel>> LJIILIIL;
    public static final C2183141AcK<Integer> LJIILJJIL;
    public static final C2183141AcK<Boolean> LJIILL;
    public static final C2183141AcK<Long> LJIILLIIL;
    public static boolean LJIIZILJ;
    public final C1099610eil LIZ;
    public final C1099610eil LIZIZ;
    public final boolean LIZJ;
    public final Float LIZLLL;
    public final Function0<Unit> LJ;
    public final DataChannel LJFF;
    public final String LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;

    static {
        Boolean bool = Boolean.FALSE;
        LJIIJ = new C2183141AcK<>(bool, bool);
        LJIIJJI = new C2183141AcK<>(new ArrayList(), new ArrayList());
        LJIIL = new C2183141AcK<>(0, 0);
        LJIILIIL = new C2183141AcK<>(null, null);
        LJIILJJIL = new C2183141AcK<>(0, 0);
        LJIILL = new C2183141AcK<>(bool, bool);
        LJIILLIIL = new C2183141AcK<>(null, null);
    }

    public final void LIZIZ() {
        if (this.LJII) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LJI);
            sbLIZ.append(": stop, object = ");
            sbLIZ.append(this);
            C20441214yg.LIZIZ("RandomLinkMicAvatarManager", C2188811AlT.LIZIZ(sbLIZ));
            DataChannel dataChannel = this.LJFF;
            if (dataChannel != null) {
                dataChannel.zQ2(this);
            }
            this.LJII = false;
            C2183141AcK<Integer> c2183141AcK = LJIILJJIL;
            c2183141AcK.LIZIZ(Integer.valueOf(c2183141AcK.LIZ(r1).intValue() - 1), this.LIZJ);
            C2183101AcG c2183101AcG = LJIIIZ;
            boolean z = this.LIZJ;
            if (c2183141AcK.LIZ(z).intValue() == 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("checkListenerCount, thisUser = ");
                sbLIZ2.append(z);
                sbLIZ2.append(", object = ");
                sbLIZ2.append(c2183101AcG);
                C20441214yg.LIZIZ("RandomLinkMicAvatarManager", C2188811AlT.LIZIZ(sbLIZ2));
                C2183141AcK<Boolean> c2183141AcK2 = LJIIJ;
                Boolean bool = Boolean.FALSE;
                c2183141AcK2.LIZIZ(bool, z);
                LJIIJJI.LIZIZ(new ArrayList(), z);
                LJIIL.LIZIZ(0, z);
                LJIILL.LIZIZ(bool, z);
                LJIILLIIL.LIZIZ(null, z);
                LJIILIIL.LIZIZ(null, z);
                if (c2183141AcK.LIZ(!z).intValue() == 0) {
                    C20441214yg.LIZIZ("RandomLinkMicAvatarManager", "checkListenerCount, no otherUser listeners");
                    LJIIZILJ = false;
                }
            }
            this.LJIIIIZZ = false;
            C1099610eil c1099610eil = this.LIZ;
            if (c1099610eil != null) {
                C786410Ut5.q5(c1099610eil, 1.0f);
            }
            C1099610eil c1099610eil2 = this.LIZ;
            if (c1099610eil2 != null) {
                C786410Ut5.LLLJ(c1099610eil2, 8);
            }
            C1099610eil c1099610eil3 = this.LIZIZ;
            if (c1099610eil3 != null) {
                C786410Ut5.q5(c1099610eil3, 1.0f);
            }
            C1099610eil c1099610eil4 = this.LIZIZ;
            if (c1099610eil4 != null) {
                C786410Ut5.LLLJ(c1099610eil4, 8);
            }
        }
    }

    public final void LIZJ() {
        C1099610eil c1099610eil;
        C1099610eil c1099610eil2;
        C2183141AcK<List<ImageModel>> c2183141AcK = LJIILIIL;
        List<ImageModel> listLIZ = c2183141AcK.LIZ(this.LIZJ);
        ObjectAnimator objectAnimatorOfFloat = null;
        if (!((listLIZ != null ? listLIZ.size() : 0) >= 5)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateRandomLinkMicPreviewAvatar, return by avatar list invalid, avatar list size = ");
            List<ImageModel> listLIZ2 = c2183141AcK.LIZ(this.LIZJ);
            sbLIZ.append(listLIZ2 != null ? Integer.valueOf(listLIZ2.size()) : null);
            C20441214yg.LJIIIZ("RandomLinkMicAvatarManager", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (!this.LJIIIIZZ) {
            this.LJIIIIZZ = true;
            C1099610eil c1099610eil3 = this.LIZ;
            if (c1099610eil3 != null) {
                C786410Ut5.q5(c1099610eil3, 1.0f);
            }
            C1099610eil c1099610eil4 = this.LIZ;
            if (c1099610eil4 != null) {
                C786410Ut5.LLLJ(c1099610eil4, 0);
            }
            C1099610eil c1099610eil5 = this.LIZIZ;
            if (c1099610eil5 != null) {
                C786410Ut5.q5(c1099610eil5, 0.0f);
            }
            C1099610eil c1099610eil6 = this.LIZIZ;
            if (c1099610eil6 != null) {
                C786410Ut5.LLLJ(c1099610eil6, 0);
            }
            C1099610eil c1099610eil7 = this.LIZ;
            C2183141AcK<Integer> c2183141AcK2 = LJIIL;
            C2183101AcG.LIZIZ(c1099610eil7, c2183141AcK2.LIZ(this.LIZJ).intValue(), this.LIZJ, this.LIZLLL);
            C2183101AcG.LIZIZ(this.LIZIZ, c2183141AcK2.LIZ(this.LIZJ).intValue() + 1, this.LIZJ, this.LIZLLL);
            return;
        }
        if (LJIIL.LIZ(this.LIZJ).intValue() % 2 == 0) {
            c1099610eil = this.LIZIZ;
            c1099610eil2 = this.LIZ;
        } else {
            c1099610eil = this.LIZ;
            c1099610eil2 = this.LIZIZ;
        }
        ObjectAnimator objectAnimatorOfFloat2 = c1099610eil != null ? ObjectAnimator.ofFloat(c1099610eil, (Property<C1099610eil, Float>) View.ALPHA, 1.0f, 0.0f) : null;
        if (objectAnimatorOfFloat2 != null) {
            objectAnimatorOfFloat2.setDuration(300L);
        }
        if (c1099610eil2 != null && (objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1099610eil2, (Property<C1099610eil, Float>) View.ALPHA, 0.0f, 1.0f)) != null) {
            objectAnimatorOfFloat.setDuration(300L);
        }
        if (objectAnimatorOfFloat2 != null) {
            objectAnimatorOfFloat2.addListener(new ALAdapterS27S0200000_33(this, c1099610eil, 9));
        }
        if (objectAnimatorOfFloat != null) {
            C786410Ut5.Pd(objectAnimatorOfFloat);
        }
        if (objectAnimatorOfFloat2 != null) {
            C786410Ut5.Pd(objectAnimatorOfFloat2);
        }
    }

    public final boolean LIZ(List<? extends ImageModel> list) {
        int iIntValue = 0;
        if (this.LJII || ((this.LIZ == null || this.LIZIZ == null) && this.LJ == null)) {
            return false;
        }
        if (!this.LIZJ && list == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJI);
        sbLIZ.append(": start, object = ");
        sbLIZ.append(this);
        C20441214yg.LIZIZ("RandomLinkMicAvatarManager", C2188811AlT.LIZIZ(sbLIZ));
        this.LJII = true;
        C2183141AcK<List<ImageModel>> c2183141AcK = LJIILIIL;
        if (c2183141AcK.LIZ(this.LIZJ) == null) {
            c2183141AcK.LIZIZ(list, this.LIZJ);
        }
        C2183141AcK<Integer> c2183141AcK2 = LJIILJJIL;
        Integer numLIZ = c2183141AcK2.LIZ(this.LIZJ);
        boolean z = this.LIZJ;
        if (numLIZ != null) {
            iIntValue = numLIZ.intValue();
        }
        c2183141AcK2.LIZIZ(Integer.valueOf(iIntValue + 1), z);
        if (!LJIIZILJ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("startStatic, object = ");
            sbLIZ2.append(this);
            C20441214yg.LIZIZ("RandomLinkMicAvatarManager", C2188811AlT.LIZIZ(sbLIZ2));
            LJIIZILJ = true;
        }
        DataChannel dataChannel = this.LJFF;
        if (dataChannel != null) {
            dataChannel.CQ2(QuickCoHostCountDownEvent.class, this, new AwS612S0100000_33(this, 280));
        }
        return true;
    }

    public C2183111AcH(C1099610eil c1099610eil, C1099610eil c1099610eil2, boolean z, Float f, Function0<Unit> function0, DataChannel dataChannel, String str) {
        this.LIZ = c1099610eil;
        this.LIZIZ = c1099610eil2;
        this.LIZJ = z;
        this.LIZLLL = f;
        this.LJ = function0;
        this.LJFF = dataChannel;
        this.LJI = str;
    }
}
