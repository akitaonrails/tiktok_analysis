package X;

import Y.ALAdapterS2S0200000_5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EIZ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EIZ implements C0EIO {
    public final C19EG LL;
    public final C0EGY LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public final InterfaceC359950E9h LLILZ;
    public final C0E48 LLILZIL;
    public final VideoPublishEditModel LLILZLL;
    public final InterfaceC359850E8x LLIZ;
    public final InterfaceC359940E9g LLIZLLLIL;
    public final BPEAHandler LLJ = new BPEAHandler(Looper.getMainLooper());
    public final String LLJI = "bottom_item_root_caption";

    @Override // X.C0EIO
    public final boolean LLJJ() {
        return false;
    }

    @Override // X.C0EIO
    public final boolean LLJLILLLLZIIL(C0E5A c0e5a, List<String> list) {
        return false;
    }

    @Override // X.C0EIO
    public final boolean LLLIILIL() {
        return false;
    }

    @Override // X.C0EIO
    public final boolean LLLLLLL() {
        return C363750ENx.LIZIZ("CAPTION_GUIDE_SHOW_NEW_V2");
    }

    @Override // X.C0EIO
    public final C0EIE getType() {
        return C0EIE.CAPTION_ITEM;
    }

    public final boolean LIZ(List<String> list) {
        List<C361980EHc> listLJIILJJIL;
        C361980EHc c361980EHcLJ;
        VecNLETrackSPtr tracks;
        if (list.contains(this.LLJI)) {
            C0E48 c0e48 = this.LLILZIL;
            if (c0e48 != null && (tracks = C350870DpF.LJI(c0e48).getTracks()) != null && !tracks.isEmpty()) {
                for (NLETrack nLETrack : tracks) {
                    if (C351220Dpo.LLLJL(nLETrack)) {
                        VecNLETrackSlotSPtr slots = nLETrack.getSlots();
                        if (!(slots instanceof Collection) || !slots.isEmpty()) {
                            Iterator<NLETrackSlot> it2 = slots.iterator();
                            while (it2.hasNext()) {
                                if (C349550Dn7.LJFF(it2.next())) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            C0E48 c0e482 = this.LLILZIL;
            if (c0e482 == null || !C363740ENw.LJII(this.LLILZLL, C350870DpF.LJI(c0e482))) {
                InterfaceC359940E9g interfaceC359940E9g = this.LLIZLLLIL;
                RecyclerView recyclerViewLLII = null;
                if (interfaceC359940E9g != null) {
                    recyclerViewLLII = interfaceC359940E9g.LLII();
                }
                InterfaceC359940E9g interfaceC359940E9g2 = this.LLIZLLLIL;
                if (interfaceC359940E9g2 != null && (listLJIILJJIL = interfaceC359940E9g2.LJIILJJIL()) != null) {
                    Iterator<C361980EHc> it3 = listLJIILJJIL.iterator();
                    int i = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (Intrinsics.LJFF(it3.next().LJI, this.LLJI)) {
                            if (i >= 0 && i < listLJIILJJIL.size()) {
                                if (recyclerViewLLII != null) {
                                    recyclerViewLLII.scrollToPosition(i);
                                }
                                InterfaceC359850E8x interfaceC359850E8x = this.LLIZ;
                                if (interfaceC359850E8x != null && (c361980EHcLJ = interfaceC359850E8x.LJ(this.LLJI)) != null) {
                                    C361970EHb c361970EHbLIZ = C361990EHd.LIZ(c361980EHcLJ);
                                    AwS406S0200000_5 awS406S0200000_5 = new AwS406S0200000_5(this, c361980EHcLJ, 158);
                                    C1295960jpS c1295960jpS = new C1295960jpS(this.LL);
                                    int iLIZ = C390810FTz.LIZ(28.0f);
                                    C786410Ut5.s6(c1295960jpS, new C19ME(iLIZ, iLIZ));
                                    c1295960jpS.setAnimation(R.raw.tux_lottie_common_creation_captionicon);
                                    c1295960jpS.addAnimatorListener(new ALAdapterS2S0200000_5(c1295960jpS, awS406S0200000_5, 14));
                                    c361970EHbLIZ.LIZIZ(c1295960jpS, "key_lottie_anim");
                                    ValueAnimator valueAnimatorOfFloat = ObjectAnimator.ofFloat(1.0f, 0.7f);
                                    valueAnimatorOfFloat.setDuration(250L);
                                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.7f, 1.1f);
                                    valueAnimatorOfFloat2.setDuration(300L);
                                    ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.1f, 0.98f);
                                    valueAnimatorOfFloat3.setDuration(200L);
                                    ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.98f, 1.0f);
                                    valueAnimatorOfFloat4.setDuration(150L);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.setInterpolator(C1619980sG4.LIZLLL());
                                    animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfFloat3, valueAnimatorOfFloat4);
                                    c361970EHbLIZ.LIZIZ(animatorSet, "key_view_anim");
                                    c361970EHbLIZ.LIZIZ(new AwS549S0100000_5(this, 1624), "key_show_type");
                                    this.LLIZ.LIZJ(this.LLJI, c361970EHbLIZ.LIZ(), true);
                                    return true;
                                }
                            }
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // X.C0EIO
    public final boolean LLLZZIL(List<String> list) {
        return LIZ(list);
    }

    @Override // X.C0EIO
    public final boolean LLILLIZIL(List<String> list, C0ELJ c0elj) {
        return LIZ(list);
    }

    public C0EIZ(C19EG c19eg, C0EGY c0egy, LifecycleOwner lifecycleOwner, InterfaceC359950E9h interfaceC359950E9h, C0E48 c0e48, VideoPublishEditModel videoPublishEditModel) {
        this.LL = c19eg;
        this.LLILLJJLI = c0egy;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = interfaceC359950E9h;
        this.LLILZIL = c0e48;
        this.LLILZLL = videoPublishEditModel;
        this.LLIZ = c0egy.B20();
        this.LLIZLLLIL = c0egy.AZ0();
    }
}
