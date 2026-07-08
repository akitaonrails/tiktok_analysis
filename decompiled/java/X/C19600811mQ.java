package X;

import Y.ARunnableS95S0200000_26;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.social.sticker.editcomponent.interactiveemoji.InteractiveEmojiStickerFactoryService;
import com.ss.android.ugc.aweme.sticker.InteractiveEmojiStickerViewApi;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.List;
import kotlin.jvm.internal.AwS157S0400000_29;

/* JADX INFO: renamed from: X.11mQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19600811mQ extends AbstractC19586911kB {
    public final InteractStickerStruct LJIIIZ;
    public final Aweme LJIIJ;
    public final InterfaceC19601711mZ LJIIJJI;
    public View LJIIL;
    public InterfaceC1701620uNk LJIILIIL;
    public final C01GW LJIILJJIL;
    public final C1713430ugn LJIILL;

    @Override // X.AbstractC19586911kB
    public final void LJIJ() {
    }

    @Override // X.InterfaceC19594611lQ
    public final int getStickerType() {
        return 100;
    }

    @Override // X.InterfaceC19594811lS
    public final void LIZIZ() {
        if (this.LJIIJJI.LIZJ()) {
            this.LJIIJJI.LIZLLL(this.LJIILL);
        }
    }

    @Override // X.AbstractC19586911kB
    public final View LJIILL() {
        return new View(this.LIZ);
    }

    @Override // X.AbstractC19586911kB
    public final void LJIJI() {
        ((InterfaceC19599811mG) ((C19600511mN) this.LJIILJJIL.getValue()).LJII.getValue()).LJLJJL(C13BV.INSTANCE);
    }

    @Override // X.InterfaceC19594811lS
    public final void LJJIII() {
        if (this.LJIIJJI.LIZJ()) {
            this.LJIIJJI.LIZIZ(this.LJIILL);
        }
    }

    @Override // X.InterfaceC19594811lS
    public final View getView() {
        InteractiveEmojiStickerViewApi interactiveEmojiStickerViewApi;
        if (this.LJIIL == null) {
            FrameLayout frameLayout = new FrameLayout(this.LIZ);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            C786410Ut5.a6(frameLayout, layoutParams);
            Object objLIZ = C04TD.LIZ(InteractiveEmojiStickerViewApi.class, false);
            if (objLIZ != null) {
                interactiveEmojiStickerViewApi = (InteractiveEmojiStickerViewApi) objLIZ;
            } else {
                if (C04TD.s5 == null) {
                    synchronized (InteractiveEmojiStickerViewApi.class) {
                        if (C04TD.s5 == null) {
                            C04TD.s5 = new InteractiveEmojiStickerFactoryService();
                        }
                    }
                }
                interactiveEmojiStickerViewApi = C04TD.s5;
            }
            C19601811ma c19601811maLIZ = interactiveEmojiStickerViewApi.LIZ(this.LIZ, this.LJIIIZ.getInteractiveEmojiStickerStruct().getEmojiContent());
            C786410Ut5.LJLLLLLL(4, c19601811maLIZ.LIZ);
            frameLayout.addView(c19601811maLIZ.LIZ);
            HandlerHook.viewPost(c19601811maLIZ.LIZ, new ARunnableS95S0200000_26(this, c19601811maLIZ, 65));
            this.LJIILIIL = c19601811maLIZ;
            this.LJIIL = frameLayout;
        }
        return this.LJIIL;
    }

    @Override // X.AbstractC19586911kB, X.InterfaceC19594811lS
    public final void onResume() {
        if (this.LJIIJJI.LIZJ()) {
            return;
        }
        this.LJIIJJI.LIZLLL(this.LJIILL);
    }

    @Override // X.InterfaceC19594911lT
    public final boolean LJI(float f, float f2, int i, long j) {
        return ((AbstractC19580211j6) this.LJIILJJIL.getValue()).LJI(f, f2, i, j);
    }

    @Override // X.InterfaceC19594911lT
    public final boolean LJIIIZ(long j, int i, float f, float f2, InterfaceC19579211iw interfaceC19579211iw) {
        return ((AbstractC19580211j6) this.LJIILJJIL.getValue()).LJIIIZ(j, i, f, f2, interfaceC19579211iw);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.01em, X.0ugn] */
    public C19600811mQ(int i, Context context, C194349111v c194349111v, InteractStickerStruct interactStickerStruct, C705930RmZ c705930RmZ, Aweme aweme, InterfaceC19601711mZ interfaceC19601711mZ) {
        super(context, c194349111v, interactStickerStruct, c705930RmZ);
        this.LJIIIZ = interactStickerStruct;
        this.LJIIJ = aweme;
        this.LJIIJJI = interfaceC19601711mZ;
        this.LJIILJJIL = C452501pT.LIZIZ(new AwS157S0400000_29(context, this, c705930RmZ, c194349111v, 17));
        ?? r1 = new InterfaceC386201em() { // from class: X.0ugn
            @Override // X.InterfaceC386201em
            public final void LIZ(Long l) {
                View view;
                C19600811mQ c19600811mQ = this.LIZ;
                c19600811mQ.getClass();
                if (l != null) {
                    l.longValue();
                    InteractStickerStruct interactStickerStruct2 = c19600811mQ.LJII;
                    if (interactStickerStruct2 != null) {
                        List<NormalTrackTimeStamp> listLIZJ = C19580611jA.LIZJ(l.longValue(), interactStickerStruct2);
                        if (listLIZJ != null && !listLIZJ.isEmpty()) {
                            View view2 = c19600811mQ.LJIIL;
                            if ((view2 == null || view2.getVisibility() != 0) && (view = c19600811mQ.LJIIL) != null) {
                                C786410Ut5.LJLLLLLL(0, view);
                            }
                        } else {
                            View view3 = c19600811mQ.LJIIL;
                            if (view3 != null) {
                                C786410Ut5.LJLLLLLL(8, view3);
                            }
                        }
                        InterfaceC1701620uNk interfaceC1701620uNk = c19600811mQ.LJIILIIL;
                        if (interfaceC1701620uNk != null && interfaceC1701620uNk.getView() != null) {
                            C19600511mN c19600511mN = (C19600511mN) c19600811mQ.LJIILJJIL.getValue();
                            InterfaceC1701620uNk interfaceC1701620uNk2 = c19600811mQ.LJIILIIL;
                            if (interfaceC1701620uNk2 != null) {
                                C19602311mf view4 = interfaceC1701620uNk2.getView();
                                c19600511mN.getClass();
                                if (view4.getWidth() != 0 && view4.getHeight() != 0) {
                                    c19600511mN.LJIILL(view4);
                                    return;
                                } else {
                                    HandlerHook.viewPost(view4, new ARunnableS95S0200000_26(view4, c19600511mN, 64));
                                    return;
                                }
                            }
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                }
            }
        };
        this.LJIILL = r1;
        if (!interfaceC19601711mZ.LIZJ()) {
            interfaceC19601711mZ.LIZLLL(r1);
        }
        C2271391DvN.LIZ(this.LJIIL, (C1A5L) C2271381DvM.Q.getValue());
    }
}
