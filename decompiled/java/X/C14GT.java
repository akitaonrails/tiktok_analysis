package X;

import Y.ARunnableS130S0100000_30;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.14GT, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14GT implements IFrameSlot {
    public final Context LL;
    public View LLILLL;
    public C20236614Ge LLILZ;
    public ImageButton LLILZIL;
    public C20236514Gd LLILZLL;
    public RelativeLayout LLIZ;
    public C421410Gfj LLIZLLLIL;
    public Room LLJIJIL;
    public String LLJILJIL;
    public boolean LLJILJILJ;
    public IFrameSlot.SlotViewModel LLJJI;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS574S0100000_30(this, 403));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 401));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS574S0100000_30(this, 402));
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(318));
    public final C01GW LLJJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(319));

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final InterfaceC752610Tff LIZJ() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final Animation LJIIZILJ() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final Animation LJIJ() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final /* synthetic */ void LJIJJ(String str) {
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final String getScheme() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final /* synthetic */ void onHide() {
    }

    public C14GT(Context context) {
        this.LL = context;
    }

    public final void LIZ(C14GV c14gv) {
        Long lValueOf;
        Long lValueOf2;
        InterfaceC2262081DgM interfaceC2262081DgMAuthor;
        Long lValueOf3;
        Long lValueOf4;
        InterfaceC2262081DgM interfaceC2262081DgMAuthor2;
        if (!C123100dR.LIZ(this.LLJILJIL)) {
            return;
        }
        int i = C14GU.LIZ[c14gv.ordinal()];
        C20236514Gd c20236514Gd = null;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C20236614Ge c20236614Ge = this.LLILZ;
                    if (c20236614Ge == null) {
                        c20236614Ge = null;
                    }
                    int visibility = c20236614Ge.getVisibility();
                    c20236614Ge.setVisibility(8);
                    C1602160rnK.LIZIZ(visibility, 8, c20236614Ge);
                    C20236514Gd c20236514Gd2 = this.LLILZLL;
                    if (c20236514Gd2 == null) {
                        c20236514Gd2 = null;
                    }
                    int visibility2 = c20236514Gd2.getVisibility();
                    c20236514Gd2.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility2, 0, c20236514Gd2);
                    RelativeLayout relativeLayout = this.LLIZ;
                    if (relativeLayout == null) {
                        relativeLayout = null;
                    }
                    if (relativeLayout.getWidth() != 0) {
                        RelativeLayout relativeLayout2 = this.LLIZ;
                        if (relativeLayout2 == null) {
                            relativeLayout2 = null;
                        }
                        int width = relativeLayout2.getWidth();
                        RelativeLayout relativeLayout3 = this.LLIZ;
                        if (relativeLayout3 == null) {
                            relativeLayout3 = null;
                        }
                        if (width == relativeLayout3.getHeight()) {
                            return;
                        }
                    }
                    C20236514Gd c20236514Gd3 = this.LLILZLL;
                    if (c20236514Gd3 != null) {
                        c20236514Gd = c20236514Gd3;
                    }
                    HandlerHook.viewPost(c20236514Gd, new ARunnableS130S0100000_30(this, 50));
                    return;
                }
                throw new C1954807lC();
            }
            C14GR c14gr = C14GR.ENTRANCE_SHOW;
            Room room = this.LLJIJIL;
            if (room != null) {
                lValueOf3 = Long.valueOf(room.getId());
            } else {
                lValueOf3 = null;
            }
            String strValueOf = String.valueOf(lValueOf3);
            Room room2 = this.LLJIJIL;
            if (room2 != null && (interfaceC2262081DgMAuthor2 = room2.author()) != null) {
                lValueOf4 = Long.valueOf(interfaceC2262081DgMAuthor2.getId());
            } else {
                lValueOf4 = null;
            }
            C1744070vUD.LIZ(c14gr, strValueOf, String.valueOf(lValueOf4));
            C20236614Ge c20236614Ge2 = this.LLILZ;
            if (c20236614Ge2 == null) {
                c20236614Ge2 = null;
            }
            int visibility3 = c20236614Ge2.getVisibility();
            c20236614Ge2.setVisibility(0);
            C1602160rnK.LIZIZ(visibility3, 0, c20236614Ge2);
            C20236514Gd c20236514Gd4 = this.LLILZLL;
            if (c20236514Gd4 != null) {
                c20236514Gd = c20236514Gd4;
            }
            int visibility4 = c20236514Gd.getVisibility();
            c20236514Gd.setVisibility(8);
            C1602160rnK.LIZIZ(visibility4, 8, c20236514Gd);
            return;
        }
        C14GR c14gr2 = C14GR.ENTRANCE_DISAPPEAR;
        Room room3 = this.LLJIJIL;
        if (room3 != null) {
            lValueOf = Long.valueOf(room3.getId());
        } else {
            lValueOf = null;
        }
        String strValueOf2 = String.valueOf(lValueOf);
        Room room4 = this.LLJIJIL;
        if (room4 != null && (interfaceC2262081DgMAuthor = room4.author()) != null) {
            lValueOf2 = Long.valueOf(interfaceC2262081DgMAuthor.getId());
        } else {
            lValueOf2 = null;
        }
        C1744070vUD.LIZ(c14gr2, strValueOf2, String.valueOf(lValueOf2));
        C20236614Ge c20236614Ge3 = this.LLILZ;
        if (c20236614Ge3 == null) {
            c20236614Ge3 = null;
        }
        int visibility5 = c20236614Ge3.getVisibility();
        c20236614Ge3.setVisibility(8);
        C1602160rnK.LIZIZ(visibility5, 8, c20236614Ge3);
        C20236514Gd c20236514Gd5 = this.LLILZLL;
        if (c20236514Gd5 != null) {
            c20236514Gd = c20236514Gd5;
        }
        int visibility6 = c20236514Gd.getVisibility();
        c20236514Gd.setVisibility(8);
        C1602160rnK.LIZIZ(visibility6, 8, c20236514Gd);
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final View LJIJI(Context context) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.bxz, null, false);
        this.LLILLL = viewTd;
        if (viewTd == null) {
            return null;
        }
        return viewTd;
    }
}
