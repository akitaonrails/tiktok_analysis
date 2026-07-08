package X;

import Y.AObjectS360S0100000_17;
import Y.ARunnableS117S0100000_17;
import android.content.Context;
import android.text.Spannable;
import android.view.View;
import android.view.animation.AnimationSet;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.slot.barragecontainer.effect.VideoBarragePlayer$initHandler$1;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.bytedance.android.livesdk.revenue.level.api.effect.ILiveEffectRenderService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eUf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090870eUf {
    public final Context LIZ;
    public final View LIZIZ;
    public final InterfaceC1090750eUT LIZJ;
    public final DataChannel LIZLLL;
    public final Function1<BarrageMessage, InterfaceC1102120emo> LJ;
    public C1090940eUm LJFF;
    public final C1090950eUn LJI;
    public final C1091080eV0 LJII;
    public C1090860eUe LJIIIIZZ;
    public InterfaceC1091030eUv LJIIIZ;
    public final List<? extends View> LJIIJ;
    public C1090850eUd LJIIJJI;
    public ARunnableS117S0100000_17 LJIIL;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r4 = this;
            X.0eUT r1 = r4.LIZJ
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L62
            r0 = r1
            com.bytedance.android.live.slot.SlotBarrageWidget r0 = (com.bytedance.android.live.slot.SlotBarrageWidget) r0
            boolean r0 = r0.LLILZIL
            if (r0 != r2) goto L6d
            android.view.View r1 = r4.LIZIZ
            r0 = 4
            X.C786410Ut5.LJLLLLLL(r0, r1)
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.LIZLLL
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.PublicScreenHeightInsufficient> r0 = com.bytedance.android.livesdk.dataChannel.PublicScreenHeightInsufficient.class
            java.lang.Object r0 = r1.gg0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 != 0) goto L33
            float r0 = X.C1082470eH7.LIZ
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.LIZLLL
            boolean r0 = X.C1082470eH7.LIZ(r1)
            if (r0 != 0) goto L33
            boolean r0 = X.C1082470eH7.LIZJ(r1)
            if (r0 == 0) goto L62
        L33:
            X.0eUT r0 = r4.LIZJ
            com.bytedance.android.live.slot.SlotBarrageWidget r0 = (com.bytedance.android.live.slot.SlotBarrageWidget) r0
            X.0eUP r1 = r0.LLILZLL
            if (r1 == 0) goto L51
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.android.livesdk.model.message.BarrageMessage> r0 = r1.LIZJ
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L50
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.android.livesdk.model.message.BarrageMessage> r0 = r1.LIZIZ
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L50
            r2 = 0
        L50:
            r3 = r2
        L51:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            boolean r0 = X.C500260Jjc.LJJIJIIJIL(r0)
            if (r0 == 0) goto L62
            X.0eUT r0 = r4.LIZJ
            com.bytedance.android.live.slot.SlotBarrageWidget r0 = (com.bytedance.android.live.slot.SlotBarrageWidget) r0
            r0.J1()
        L62:
            X.0eUT r1 = r4.LIZJ
            if (r1 == 0) goto L6c
            r0 = 0
            com.bytedance.android.live.slot.SlotBarrageWidget r1 = (com.bytedance.android.live.slot.SlotBarrageWidget) r1
            r1.I1(r0)
        L6c:
            return
        L6d:
            com.bytedance.android.live.slot.SlotBarrageWidget r1 = (com.bytedance.android.live.slot.SlotBarrageWidget) r1
            r1.J1()
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1090870eUf.LIZ():void");
    }

    public final void LIZIZ() {
        C1090950eUn c1090950eUn = this.LJI;
        if (c1090950eUn != null) {
            View view = this.LIZIZ;
            if (c1090950eUn.LJIIL == null) {
                c1090950eUn.LJIIL = (FrameLayout) view.findViewById(R.id.i5j);
            }
            c1090950eUn.LIZLLL(view);
            ConstraintLayout constraintLayout = (ConstraintLayout) c1090950eUn.LJ.getValue();
            if (constraintLayout != null) {
                C786410Ut5.LL(8, constraintLayout);
            }
            FrameLayout frameLayout = c1090950eUn.LJIIL;
            if (frameLayout != null) {
                C786410Ut5.LJZ(0, frameLayout);
            }
            C786410Ut5.T4(view, 1.0f);
            FrameLayout frameLayout2 = c1090950eUn.LJIIL;
            if (frameLayout2 != null) {
                C786410Ut5.T4(frameLayout2, 1.0f);
            }
            view.setAnimation(null);
            view.clearAnimation();
            FrameLayout frameLayout3 = c1090950eUn.LJIIL;
            if (frameLayout3 != null) {
                frameLayout3.setAnimation(null);
                frameLayout3.clearAnimation();
            }
        }
    }

    public final void LIZLLL() {
        FrameLayout frameLayout;
        if (this.LJIIIZ == null) {
            ILiveEffectRenderService iLiveEffectRenderService = (ILiveEffectRenderService) C1161920gLG.LIZJ(ILiveEffectRenderService.class);
            DataChannel dataChannel = this.LIZLLL;
            InterfaceC1091200eVC interfaceC1091200eVC = new InterfaceC1091200eVC() { // from class: X.0eUa
                @Override // X.InterfaceC1091200eVC
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1091200eVC
                public final void LIZ() {
                    this.LIZ.LIZ();
                }

                @Override // X.InterfaceC1091200eVC
                public final void LIZJ(Object obj, Long l) {
                    BarrageMessage barrageMessage;
                    if ((obj instanceof BarrageMessage) && (barrageMessage = (BarrageMessage) obj) != null) {
                        this.LIZ.LIZJ(barrageMessage);
                    }
                }

                @Override // X.InterfaceC1091200eVC
                public final JSONObject LIZLLL(long j, Object obj) {
                    BarrageMessage barrageMessage;
                    String string = null;
                    if ((obj instanceof BarrageMessage) && (barrageMessage = (BarrageMessage) obj) != null) {
                        DataChannel dataChannel2 = this.LIZ.LIZLLL;
                        Spannable spannableLIZ = C154800iY.LIZ(barrageMessage.content);
                        if (spannableLIZ != null) {
                            string = spannableLIZ.toString();
                        }
                        return C1090800eUY.LIZ(dataChannel2, barrageMessage, j, string);
                    }
                    return new JSONObject();
                }
            };
            C1090950eUn c1090950eUn = this.LJI;
            if (c1090950eUn != null) {
                if (c1090950eUn.LJIIL == null) {
                    View view = c1090950eUn.LIZ;
                    c1090950eUn.LJIIL = view != null ? (FrameLayout) view.findViewById(R.id.i5j) : null;
                }
                frameLayout = c1090950eUn.LJIIL;
            } else {
                frameLayout = null;
            }
            Object obj = this.LIZJ;
            this.LJIIIZ = iLiveEffectRenderService.TG(dataChannel, interfaceC1091200eVC, frameLayout, obj != null ? ((LiveWidget) obj).getContext() : null);
        }
    }

    public final void LJFF() {
        InterfaceC1091000eUs interfaceC1091000eUs;
        HandlerHook.viewRemoveCallbacks(this.LIZIZ, this.LJIIL);
        this.LJIIL = null;
        C1090850eUd c1090850eUd = this.LJIIJJI;
        if (c1090850eUd != null) {
            C786410Ut5.LJZ(8, c1090850eUd.LIZJ);
            C1090830eUb c1090830eUb = c1090850eUd.LIZLLL;
            if (c1090830eUb != null) {
                c1090830eUb.LIZ();
            }
            C1090830eUb c1090830eUb2 = c1090850eUd.LIZLLL;
            if (c1090830eUb2 != null) {
                c1090830eUb2.LIZJ();
            }
            c1090850eUd.LIZLLL = null;
            VideoBarragePlayer$initHandler$1 videoBarragePlayer$initHandler$1 = c1090850eUd.LJ;
            if (videoBarragePlayer$initHandler$1 != null) {
                videoBarragePlayer$initHandler$1.removeCallbacksAndMessages(null);
            }
        }
        this.LJIIJJI = null;
        InterfaceC1091030eUv interfaceC1091030eUv = this.LJIIIZ;
        if (interfaceC1091030eUv != null) {
            interfaceC1091030eUv.release();
        }
        this.LJIIIZ = null;
        C1090940eUm c1090940eUm = this.LJFF;
        if (c1090940eUm == null || (interfaceC1091000eUs = c1090940eUm.LIZJ) == null) {
            return;
        }
        interfaceC1091000eUs.reset();
    }

    public final void LIZJ(BarrageMessage barrageMessage) {
        C1090860eUe c1090860eUe;
        boolean zBooleanValue;
        InterfaceC1091060eUy interfaceC1091060eUy;
        C1090910eUj c1090910eUj;
        View view;
        Boolean bool;
        C1090910eUj c1090910eUj2 = new C1090910eUj();
        c1090910eUj2.LIZJ = barrageMessage;
        c1090910eUj2.LJ = this.LIZIZ;
        c1090910eUj2.LIZIZ = this.LIZ;
        Integer numValueOf = Integer.valueOf(barrageMessage.renderType);
        if (numValueOf != null && numValueOf.intValue() == 0) {
            if (this.LJIIIIZZ == null) {
                this.LJIIIIZZ = new C1090860eUe(this.LIZJ);
            }
            c1090860eUe = this.LJIIIIZZ;
        } else {
            c1090860eUe = null;
        }
        c1090910eUj2.LJFF = c1090860eUe;
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        c1090910eUj2.LJI = zBooleanValue;
        c1090910eUj2.LIZ = new InterfaceC1091060eUy() { // from class: X.0eUr
            @Override // X.InterfaceC1091060eUy
            public final void LIZ() {
            }

            @Override // X.InterfaceC1091060eUy
            public final void LIZIZ() {
                this.LIZ.LIZ();
            }
        };
        c1090910eUj2.LIZLLL.add(this.LJI);
        c1090910eUj2.LIZLLL.add(this.LJII);
        C1090940eUm c1090940eUm = new C1090940eUm();
        c1090940eUm.LIZ = c1090910eUj2;
        Iterator<InterfaceC1091020eUu> it2 = c1090910eUj2.LIZLLL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(c1090910eUj2, c1090940eUm);
        }
        this.LJFF = c1090940eUm;
        AnimationSet animationSet = c1090940eUm.LIZIZ;
        if (animationSet != null && (c1090910eUj = c1090940eUm.LIZ) != null && (view = c1090910eUj.LJ) != null) {
            view.startAnimation(animationSet);
        }
        InterfaceC1091000eUs interfaceC1091000eUs = c1090940eUm.LIZJ;
        if (interfaceC1091000eUs != null) {
            interfaceC1091000eUs.startPlay();
        }
        C1090910eUj c1090910eUj3 = c1090940eUm.LIZ;
        if (c1090910eUj3 != null && (interfaceC1091060eUy = c1090910eUj3.LIZ) != null) {
            interfaceC1091060eUy.LIZ();
        }
    }

    public final void LJ(BarrageMessage barrageMessage, long j, String str) {
        InterfaceC1091030eUv interfaceC1091030eUv = this.LJIIIZ;
        if (interfaceC1091030eUv != null) {
            interfaceC1091030eUv.LIZ(new C1091150eV7(j, EnumC1091130eV5.LYNX, barrageMessage, new C1091090eV1(str, barrageMessage.isLocalInsertMsg)));
        }
    }

    public C1090870eUf(Context context, View view, InterfaceC1090750eUT interfaceC1090750eUT, DataChannel dataChannel, C1091250eVH c1091250eVH, AObjectS360S0100000_17 aObjectS360S0100000_17) {
        this.LIZ = context;
        this.LIZIZ = view;
        this.LIZJ = interfaceC1090750eUT;
        this.LIZLLL = dataChannel;
        this.LJ = aObjectS360S0100000_17;
        this.LJI = new C1090950eUn(view, c1091250eVH, interfaceC1090750eUT, aObjectS360S0100000_17);
        this.LJII = new C1091080eV0(view);
        this.LJIIJ = C1697810uHb.LJIIJJI(view.findViewById(R.id.eqx), view.findViewById(R.id.dwa), view.findViewById(R.id.i5j));
    }
}
