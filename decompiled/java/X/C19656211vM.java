package X;

import Y.ARunnableS129S0100000_29;
import Y.ARunnableS88S0200000_19;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.tools.sticker.core.link.LinkStickerModel;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11vM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19656211vM extends FrameLayout {
    public final LinkStickerModel LL;
    public C0FSC LLILLJJLI;
    public LifecycleOwner LLILLL;
    public final C01GW LLILZ;
    public TuxSheet LLILZIL;
    public C1748440vbG LLILZLL;
    public C1748440vbG LLIZ;
    public TuxNavBar LLIZLLLIL;
    public C1748330vb5 LLJ;
    public C1748330vb5 LLJI;
    public C1664680tQA<LinkStickerModel> LLJIJIL;
    public final BPEAHandler LLJILJIL;
    public ARunnableS129S0100000_29 LLJILJILJ;
    public final C01GW LLJILLL;

    private final C19613111oP getLinkStickerView() {
        return (C19613111oP) this.LLILZ.getValue();
    }

    public final void LIZ() {
        String string;
        C1748440vbG c1748440vbG = this.LLILZLL;
        if (c1748440vbG == null) {
            c1748440vbG = null;
        }
        String strValueOf = String.valueOf(c1748440vbG.getText());
        InterfaceC19656311vN linkStickerCoreService = getLinkStickerCoreService();
        String string2 = "";
        if (linkStickerCoreService != null) {
            if (linkStickerCoreService.t(strValueOf)) {
                string = "";
            } else {
                string = getContext().getString(2131824896);
                linkStickerCoreService.r("enter a valid url");
            }
            if (!linkStickerCoreService.u(strValueOf)) {
                string = getContext().getString(2131824897);
                linkStickerCoreService.r("the URL input is too long");
            }
            if (strValueOf.length() == 0) {
                setLinkInputBoxFooter("");
            } else {
                setLinkInputBoxFooter(string);
            }
        } else {
            string = "";
        }
        C1748440vbG c1748440vbG2 = this.LLIZ;
        if (c1748440vbG2 == null) {
            c1748440vbG2 = null;
        }
        String strValueOf2 = String.valueOf(c1748440vbG2.getText());
        InterfaceC19656311vN linkStickerCoreService2 = getLinkStickerCoreService();
        if (linkStickerCoreService2 != null) {
            if (!linkStickerCoreService2.s(strValueOf2)) {
                string2 = getContext().getString(2131824897);
                linkStickerCoreService2.r("the preview text input is too long");
            }
            setDisplayNameInputBoxFooter(string2);
        }
        boolean z = string.length() == 0 && string2.length() == 0;
        TuxNavBar tuxNavBar = this.LLIZLLLIL;
        (tuxNavBar != null ? tuxNavBar : null).LJJ(new AwS41S0010000_29(z, 30), "done");
        new Pair(Boolean.valueOf(string.length() == 0), Boolean.valueOf(string2.length() == 0));
    }

    public final void LIZIZ() {
        C1748440vbG c1748440vbG = this.LLILZLL;
        if (c1748440vbG == null) {
            c1748440vbG = null;
        }
        c1748440vbG.LIZJ();
        C1748440vbG c1748440vbG2 = this.LLIZ;
        if (c1748440vbG2 == null) {
            c1748440vbG2 = null;
        }
        c1748440vbG2.LIZJ();
        C1664680tQA<LinkStickerModel> c1664680tQA = this.LLJIJIL;
        (c1664680tQA != null ? c1664680tQA : null).LIZLLL(AFwS273S0000000_29.get$arr$(149), true);
    }

    public final InterfaceC19656311vN getLinkStickerCoreService() {
        return (InterfaceC19656311vN) this.LLJILLL.getValue();
    }

    public final LifecycleOwner getLifecycleOwner() {
        return this.LLILLL;
    }

    public final C0FSC getStickerEditListener() {
        return this.LLILLJJLI;
    }

    private final void setDisplayNameInputBoxFooter(String str) {
        C1748440vbG c1748440vbG = null;
        if (C123100dR.LIZ(str)) {
            C1748330vb5 c1748330vb5 = this.LLJI;
            if (c1748330vb5 == null) {
                c1748330vb5 = null;
            }
            c1748330vb5.setMessage(str);
            C1748330vb5 c1748330vb52 = this.LLJI;
            if (c1748330vb52 == null) {
                c1748330vb52 = null;
            }
            C786410Ut5.LLLLLLLZIL(c1748330vb52, 0);
            C1748440vbG c1748440vbG2 = this.LLILZLL;
            if (c1748440vbG2 != null) {
                c1748440vbG = c1748440vbG2;
            }
            c1748440vbG.setValidationStatus(3);
            return;
        }
        C1748330vb5 c1748330vb53 = this.LLJI;
        if (c1748330vb53 == null) {
            c1748330vb53 = null;
        }
        C786410Ut5.LLLLLLLZIL(c1748330vb53, 8);
        C1748440vbG c1748440vbG3 = this.LLILZLL;
        if (c1748440vbG3 != null) {
            c1748440vbG = c1748440vbG3;
        }
        c1748440vbG.setValidationStatus(0);
    }

    private final void setLinkInputBoxFooter(String str) {
        C1748440vbG c1748440vbG = null;
        if (C123100dR.LIZ(str)) {
            C1748330vb5 c1748330vb5 = this.LLJ;
            if (c1748330vb5 == null) {
                c1748330vb5 = null;
            }
            c1748330vb5.setMessage(str);
            C1748330vb5 c1748330vb52 = this.LLJ;
            if (c1748330vb52 == null) {
                c1748330vb52 = null;
            }
            C786410Ut5.LLLLLLLZIL(c1748330vb52, 0);
            C1748440vbG c1748440vbG2 = this.LLILZLL;
            if (c1748440vbG2 != null) {
                c1748440vbG = c1748440vbG2;
            }
            c1748440vbG.setValidationStatus(3);
            return;
        }
        C1748330vb5 c1748330vb53 = this.LLJ;
        if (c1748330vb53 == null) {
            c1748330vb53 = null;
        }
        C786410Ut5.LLLLLLLZIL(c1748330vb53, 8);
        C1748440vbG c1748440vbG3 = this.LLILZLL;
        if (c1748440vbG3 != null) {
            c1748440vbG = c1748440vbG3;
        }
        c1748440vbG.setValidationStatus(0);
    }

    public final void LIZJ(boolean z) {
        int i;
        FragmentManager supportFragmentManager;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        int visibility = getVisibility();
        setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, this);
        C1748440vbG c1748440vbG = null;
        if (z) {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(getContext());
            if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                TuxSheet tuxSheet = this.LLILZIL;
                if (tuxSheet == null) {
                    tuxSheet = null;
                }
                tuxSheet.show(supportFragmentManager, "");
            }
            Context context = getContext();
            C1748440vbG c1748440vbG2 = this.LLILZLL;
            if (c1748440vbG2 != null) {
                c1748440vbG = c1748440vbG2;
            }
            HandlerHook.viewPostDelay(c1748440vbG, new ARunnableS88S0200000_19(this, context, 23), 100L);
            return;
        }
        TuxSheet tuxSheet2 = this.LLILZIL;
        if (tuxSheet2 == null) {
            tuxSheet2 = null;
        }
        tuxSheet2.dismiss();
        C1748440vbG c1748440vbG3 = this.LLIZ;
        if (c1748440vbG3 != null) {
            c1748440vbG = c1748440vbG3;
        }
        KeyboardUtils.LIZ(getContext(), c1748440vbG);
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        this.LLILLL = lifecycleOwner;
    }

    public final void setStickerEditListener(C0FSC c0fsc) {
        this.LLILLJJLI = c0fsc;
    }

    public C19656211vM(Context context, C390420FSm c390420FSm, LinkStickerModel linkStickerModel, C390370FSh c390370FSh, LifecycleOwner lifecycleOwner) {
        super(context, null, 0);
        this.LL = linkStickerModel;
        this.LLILLJJLI = c390370FSh;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 308));
        this.LLJILJIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJILLL = C452501pT.LIZIZ(new AwS549S0100000_5(c390420FSm, 121));
        FrameLayout.inflate(context, R.layout.daq, this);
        this.LLJIJIL = new C1664680tQA<>(LinkStickerModel.copy$default(linkStickerModel, null, 0, null, false, null, null, null, 0, 0, 511, null));
        C19613111oP linkStickerView = getLinkStickerView();
        C1664680tQA<LinkStickerModel> c1664680tQA = this.LLJIJIL;
        linkStickerView.LIZIZ(this.LLILLL, c1664680tQA == null ? null : c1664680tQA);
        View viewInflate = FrameLayout.inflate(getContext(), R.layout.dar, null);
        this.LLILZLL = (C1748440vbG) viewInflate.findViewById(R.id.mr6);
        this.LLIZ = (C1748440vbG) viewInflate.findViewById(R.id.fy_);
        this.LLIZLLLIL = (TuxNavBar) viewInflate.findViewById(R.id.y08);
        this.LLJ = (C1748330vb5) viewInflate.findViewById(R.id.mr5);
        this.LLJI = (C1748330vb5) viewInflate.findViewById(R.id.fy9);
        C1748330vb5 c1748330vb5 = this.LLJ;
        (c1748330vb5 == null ? null : c1748330vb5).setMessageIcon(new C338170DNn());
        C1748330vb5 c1748330vb52 = this.LLJI;
        (c1748330vb52 == null ? null : c1748330vb52).setMessageIcon(new C338170DNn());
        C1748440vbG c1748440vbG = this.LLILZLL;
        (c1748440vbG == null ? null : c1748440vbG).setPlaceholderText(getContext().getString(2131824901));
        C1748440vbG c1748440vbG2 = this.LLILZLL;
        (c1748440vbG2 == null ? null : c1748440vbG2).LJIILLIIL(true);
        C1748440vbG c1748440vbG3 = this.LLILZLL;
        (c1748440vbG3 == null ? null : c1748440vbG3).setSingleLine(true);
        C1748440vbG c1748440vbG4 = this.LLILZLL;
        (c1748440vbG4 == null ? null : c1748440vbG4).setMaxLines(1);
        C1748440vbG c1748440vbG5 = this.LLILZLL;
        (c1748440vbG5 == null ? null : c1748440vbG5).LIZ(new C19773412Ya(this, 8));
        C1748440vbG c1748440vbG6 = this.LLIZ;
        (c1748440vbG6 == null ? null : c1748440vbG6).setPlaceholderText(getContext().getString(2131824902));
        C1748440vbG c1748440vbG7 = this.LLIZ;
        (c1748440vbG7 == null ? null : c1748440vbG7).LJIILLIIL(true);
        C1748440vbG c1748440vbG8 = this.LLIZ;
        (c1748440vbG8 == null ? null : c1748440vbG8).setSingleLine(true);
        C1748440vbG c1748440vbG9 = this.LLIZ;
        (c1748440vbG9 == null ? null : c1748440vbG9).setMaxLines(1);
        C1748440vbG c1748440vbG10 = this.LLIZ;
        (c1748440vbG10 == null ? null : c1748440vbG10).LIZ(new C19773412Ya(this, 9));
        TuxNavBar tuxNavBar = this.LLIZLLLIL;
        TuxNavBar tuxNavBar2 = tuxNavBar != null ? tuxNavBar : null;
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS573S0100000_29(this, 306));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getContext().getString(2131824898);
        c0om1.LIZJ = c1250250idj;
        C1250300ido c1250300ido = new C1250300ido();
        c1250300ido.LIZIZ = "done";
        c1250300ido.LIZJ = getContext().getString(2131824895);
        c1250300ido.LJ = false;
        c1250300ido.LIZLLL = EnumC638250P1r.PRIMARY;
        c1250300ido.LIZ(new AwS573S0100000_29(this, 307));
        c0om1.LIZIZ(c1250300ido);
        c0om1.LIZLLL = true;
        tuxNavBar2.setNavActions(c0om1);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIII = viewInflate;
        c1390920mIc.LJI(16);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLILLL = false;
        tuxSheet.LLJLILLLLZIIL = false;
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJLLIL = false;
        tuxSheet2.LLJLLL = false;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, getContext());
        TuxSheet tuxSheet3 = c1390920mIc.LIZ;
        tuxSheet3.LLJI = numLIZJ;
        tuxSheet3.LLJJIJIIJIL = false;
        this.LLILZIL = tuxSheet3;
        C786410Ut5.x3(getRootView().getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC738830SyX(this, 2));
        LIZJ(true);
    }
}
