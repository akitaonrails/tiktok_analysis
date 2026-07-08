package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerCompatModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FHG, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FHG extends C0FHK {
    public final FrameLayout LIZIZ;
    public final FrameLayout LIZJ;
    public final C0FGA LIZLLL;
    public final C388200FJy LJ;
    public C387070FFp LJFF;
    public C384250F4t LJI;
    public boolean LJII;
    public C0FHH LJIIIIZZ;
    public final Set<Function1<Integer, Unit>> LJIIIZ;
    public boolean LJIIJ;
    public ViewGroup.LayoutParams LJIIJJI;

    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LIZIZ() {
        ViewGroup viewGroup;
        LJIIIZ(false);
        C387070FFp c387070FFp = this.LJFF;
        if (c387070FFp != null && this.LJIIIIZZ != C0FHH.DETACHED) {
            try {
                ViewParent parent = c387070FFp.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(c387070FFp, viewGroup);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            this.LJIIIIZZ = C0FHH.DETACHED;
        }
        C387070FFp c387070FFp2 = this.LJFF;
        if (c387070FFp2 != null) {
            C384250F4t c384250F4t = c387070FFp2.LLILLL;
            if (c384250F4t != null) {
                c384250F4t.LIZIZ.remove(c387070FFp2.LLJ);
            }
            c387070FFp2.LLILLL = null;
            c387070FFp2.LLIZLLLIL = false;
        }
        C384250F4t c384250F4t2 = this.LJI;
        if (c384250F4t2 != null && c384250F4t2.LIZLLL != C0FHI.DESTROYED) {
            c384250F4t2.LIZLLL = C0FHI.DETACHED;
            C0F8J.LIZ("TextTemplateSelectionManager", "Manager detached");
        }
        C384250F4t c384250F4t3 = this.LJI;
        if (c384250F4t3 != null) {
            C0FHI c0fhi = c384250F4t3.LIZLLL;
            C0FHI c0fhi2 = C0FHI.DESTROYED;
            if (c0fhi != c0fhi2) {
                c384250F4t3.LIZJ = null;
                c384250F4t3.LIZLLL = c0fhi2;
                C0F8J.LIZ("inspiration-boundingbox", "TextTemplateSelectionManager destroyed");
            }
        }
        this.LJIIJ = false;
        this.LJFF = null;
        this.LJI = null;
        this.LJIIIIZZ = C0FHH.DETACHED;
        C388200FJy c388200FJy = this.LJ;
        c388200FJy.LJIL = false;
        c388200FJy.LJIJJLI = false;
    }

    public final void LJIIIIZZ() {
        if (this.LJIIJ) {
            return;
        }
        this.LJIIJ = true;
        if (this.LJI == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initialize, stickerPlayer: ");
            sbLIZ.append(this.LIZLLL);
            C0F8J.LIZ("inspiration", C2188811AlT.LIZIZ(sbLIZ));
            this.LJI = new C384250F4t(this.LIZLLL);
        }
        if (this.LJFF == null) {
            C387070FFp c387070FFp = new C387070FFp(this.LIZIZ.getContext(), this.LJ);
            C384250F4t c384250F4t = this.LJI;
            if (c384250F4t != null) {
                c387070FFp.setSelectionManager(c384250F4t);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c387070FFp);
            c387070FFp.setLayoutParams(layoutParams);
            this.LJFF = c387070FFp;
        }
        C0FGA c0fga = this.LIZLLL;
        if (c0fga != null) {
            c0fga.LJIIL(new AwS584S0100000_5(this, 1138));
        }
        C384250F4t c384250F4t2 = this.LJI;
        if (c384250F4t2 != null) {
            c384250F4t2.LIZIZ.add(new AwS584S0100000_5(this, 1139));
        }
        C388200FJy c388200FJy = this.LJ;
        c388200FJy.LJ.LJI.LJIIIZ(c388200FJy.LIZLLL, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1141));
        this.LJ.LJ.LIZ(new C2217371BqR() { // from class: X.0FHJ
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((TextStickerModel) obj).getFontModel();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((TextStickerModel) obj).setFontModel((TextFontModel) obj2);
            }
        }).LJIIIZ(this.LJ.LIZLLL, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1144));
    }

    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LJI() {
        LJIIIIZZ();
    }

    public final void LJIIIZ(boolean z) {
        this.LJII = z;
        if (z) {
            View view = this.LJFF;
            if (view != null) {
                C0FHH c0fhh = this.LJIIIIZZ;
                C0FHH c0fhh2 = C0FHH.DETACHED;
                if (c0fhh == c0fhh2) {
                    try {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams.gravity = 8388659;
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
                        view.setLayoutParams(layoutParams);
                        this.LIZJ.addView(view);
                        view.bringToFront();
                        ViewGroup.LayoutParams layoutParams2 = this.LJIIJJI;
                        if (layoutParams2 != null) {
                            LJIIJ(layoutParams2);
                        }
                        this.LJIIIIZZ = C0FHH.ATTACHED;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return;
                    }
                } else if (c0fhh == c0fhh2) {
                    return;
                }
                C387070FFp c387070FFp = this.LJFF;
                if (c387070FFp != null) {
                    int visibility = c387070FFp.getVisibility();
                    c387070FFp.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, c387070FFp);
                }
                this.LJIIIIZZ = C0FHH.VISIBLE;
                return;
            }
            return;
        }
        C387070FFp c387070FFp2 = this.LJFF;
        if (c387070FFp2 != null) {
            int visibility2 = c387070FFp2.getVisibility();
            c387070FFp2.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, c387070FFp2);
        }
        C0FHH c0fhh3 = this.LJIIIIZZ;
        C0FHH c0fhh4 = C0FHH.DETACHED;
        if (c0fhh3 != c0fhh4) {
            c0fhh4 = C0FHH.HIDDEN;
        }
        this.LJIIIIZZ = c0fhh4;
    }

    public final void LJIIJ(ViewGroup.LayoutParams layoutParams) {
        FrameLayout.LayoutParams layoutParams2;
        C387070FFp c387070FFp = this.LJFF;
        if (c387070FFp == null) {
            return;
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        } else {
            layoutParams2 = null;
        }
        if (layoutParams2 != null) {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
            layoutParams3.topMargin = layoutParams2.topMargin;
            layoutParams3.bottomMargin = layoutParams2.bottomMargin;
            layoutParams3.leftMargin = layoutParams2.leftMargin;
            layoutParams3.rightMargin = layoutParams2.rightMargin;
            layoutParams3.gravity = layoutParams2.gravity;
            layoutParams3.setMarginStart(layoutParams2.getMarginStart());
            layoutParams3.setMarginEnd(layoutParams2.getMarginEnd());
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c387070FFp);
            c387070FFp.setLayoutParams(layoutParams3);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("syncLayoutWithTextureView: width=");
            sbLIZ.append(layoutParams3.width);
            sbLIZ.append(", height=");
            sbLIZ.append(layoutParams3.height);
            sbLIZ.append(", topMargin=");
            sbLIZ.append(layoutParams3.topMargin);
            sbLIZ.append(", bottomMargin=");
            sbLIZ.append(layoutParams3.bottomMargin);
            sbLIZ.append(", leftMargin=");
            sbLIZ.append(layoutParams3.leftMargin);
            sbLIZ.append(", rightMargin=");
            sbLIZ.append(layoutParams3.rightMargin);
            C0F8J.LIZ("TextTemplateBorderAbility-inspiration", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C0F8J.LIZ("TextTemplateBorderAbility-inspiration", "syncLayoutWithTextureView: Unable to get TextureView layout params, using default MATCH_PARENT");
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c387070FFp);
        c387070FFp.setLayoutParams(layoutParams4);
    }

    public final void LJIIJJI(TextStickerModel textStickerModel) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTemplateData, currentSelectId: ");
        TextStickerCompatModel compatModel = textStickerModel.getCompatModel();
        if (compatModel != null) {
            numValueOf = Integer.valueOf(compatModel.getSelectSlotIndex());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" textStickerModel: ");
        sbLIZ.append(textStickerModel);
        C0F8J.LIZ("inspiration-border", C2188811AlT.LIZIZ(sbLIZ));
        if (textStickerModel.getTextTemplateModel().enableTextTemplate && C0F8Y.LJIIIZ(textStickerModel)) {
            LJIIIIZZ();
            C384250F4t c384250F4t = this.LJI;
            if (c384250F4t != null) {
                c384250F4t.LIZJ = textStickerModel;
                textStickerModel.getCompatModel().getSelectSlotIndex();
            }
            LJIIIZ(true);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("update editState: ");
            sbLIZ2.append(!textStickerModel.getTextTemplateModel().isHint);
            C0F8J.LIZ("inspiration", C2188811AlT.LIZIZ(sbLIZ2));
            if (textStickerModel.getTextTemplateModel().isHint) {
                C387070FFp c387070FFp = this.LJFF;
                if (c387070FFp != null) {
                    c387070FFp.LLIZLLLIL = false;
                }
            } else {
                C387070FFp c387070FFp2 = this.LJFF;
                if (c387070FFp2 != null) {
                    c387070FFp2.LLIZLLLIL = true;
                }
            }
            C387070FFp c387070FFp3 = this.LJFF;
            if (c387070FFp3 != null) {
                c387070FFp3.invalidate();
                return;
            }
            return;
        }
        LJIIIZ(false);
    }

    public C0FHG(FrameLayout frameLayout, FrameLayout frameLayout2, C0FGA c0fga, final C388200FJy c388200FJy) {
        new C388270FKf(c388200FJy) { // from class: X.0FHK
        };
        this.LIZIZ = frameLayout;
        this.LIZJ = frameLayout2;
        this.LIZLLL = c0fga;
        this.LJ = c388200FJy;
        this.LJIIIIZZ = C0FHH.DETACHED;
        this.LJIIIZ = new LinkedHashSet();
    }
}
