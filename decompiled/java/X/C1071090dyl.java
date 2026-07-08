package X;

import Y.ACListenerS119S0200000_16;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import avg.f;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: renamed from: X.0dyl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1071090dyl extends ConstraintLayout implements InterfaceC1903540zdQ, C0Z9D {
    public TuxIconView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxIconView LLILZ;
    public C197039127h LLILZIL;
    public InterfaceC1071060dyi LLILZLL;
    public String LLIZ;
    public Map<String, String> LLIZLLLIL;
    public EnumC992790bwT LLJ;
    public final String LLJI;
    public C1906880zio LLJIJIL;
    public boolean LLJILJIL;
    public final C1071090dyl LLJILJILJ;
    public boolean LLJILLL;

    public View getContainer() {
        return this;
    }

    @Override // X.InterfaceC1903540zdQ
    public List<View> getMultiCenterViewList() {
        return C1697810uHb.LJIIJJI(getPermissionAvatarIvFromXml(), getPermissionTitleTvFromXml(), getPermissionDescTvFromXml());
    }

    @Override // X.InterfaceC1903540zdQ
    public List<View> getMultiHideViewList() {
        return C1697810uHb.LJIIJJI(getPermissionCloseBtnFromXml(), getPermissionFindBtnFromXml());
    }

    @Override // X.InterfaceC1903540zdQ
    public void setUFRSubscription(C11NJ c11nj) {
    }

    public final boolean e0() {
        C1906880zio c1906880zio = this.LLJIJIL;
        if (c1906880zio == null || c1906880zio.LIZ == -1) {
            return false;
        }
        TuxIconView permissionAvatarIvFromXml = getPermissionAvatarIvFromXml();
        ViewGroup.LayoutParams layoutParams = getPermissionAvatarIvFromXml().getLayoutParams();
        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1906880zio.LIZ)));
        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1906880zio.LIZ)));
        C786410Ut5.M6(permissionAvatarIvFromXml, layoutParams);
        return true;
    }

    public final TuxIconView getPermissionAvatarIvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q94);
            this.LL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getPermissionCloseBtnFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q97);
            this.LLILZ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getPermissionDescTvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q9e);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C197039127h getPermissionFindBtnFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q9g);
            this.LLILZIL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final TuxTextView getPermissionTitleTvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q_9);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    @Override // X.C0Z9D
    public final boolean LLLIIL() {
        return this.LLJILLL;
    }

    @Override // X.C0Z9D
    public ViewGroup getWrapper() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1903540zdQ
    public final void LLLLLLL(boolean z) {
        if (!z) {
            C786410Ut5.LLLLLLZZ(getPermissionCloseBtnFromXml(), 8);
        } else {
            C786410Ut5.LLLLLLZZ(getPermissionCloseBtnFromXml(), 0);
        }
    }

    @Override // X.InterfaceC1903540zdQ
    public final void r(C1906880zio c1906880zio) {
        boolean z;
        Context context;
        Integer numLIZJ;
        if (Intrinsics.LJFF(this.LLJIJIL, c1906880zio)) {
            return;
        }
        this.LLJIJIL = c1906880zio;
        e0();
        if (c1906880zio.LIZLLL != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            getPermissionTitleTvFromXml().setTuxFont(c1906880zio.LIZLLL);
        }
        if (c1906880zio.LJ != -1) {
            getPermissionTitleTvFromXml().LJJJJI(c1906880zio.LJ);
        }
        if (c1906880zio.LJFF != -1) {
            getPermissionDescTvFromXml().setTuxFont(c1906880zio.LJFF);
        }
        if (c1906880zio.LJI != -1) {
            getPermissionDescTvFromXml().LJJJJI(c1906880zio.LJI);
        }
        if (c1906880zio.LJIIIIZZ != -1 && (context = getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(c1906880zio.LJIIIIZZ, context)) != null) {
            getPermissionDescTvFromXml().setTextColor(numLIZJ.intValue());
        }
        if (c1906880zio.LJIIIZ != -1 && (getPermissionDescTvFromXml().getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            TuxTextView permissionDescTvFromXml = getPermissionDescTvFromXml();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getPermissionDescTvFromXml().getLayoutParams();
            marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1906880zio.LJIIIZ)));
            C786410Ut5.R6(permissionDescTvFromXml, marginLayoutParams);
        }
    }

    @Override // X.InterfaceC1903540zdQ
    public void setActionListener(InterfaceC1071060dyi interfaceC1071060dyi) {
        this.LLILZLL = interfaceC1071060dyi;
    }

    @Override // X.InterfaceC1903540zdQ
    public void setEnterFrom(String str) {
        this.LLIZ = str;
    }

    @Override // X.C0Z9D
    public void setMultiSelectMode(boolean z) {
        this.LLJILLL = z;
    }

    public final void setPermissionAvatarIvFromXml(TuxIconView tuxIconView) {
        this.LL = tuxIconView;
    }

    public final void setPermissionCloseBtnFromXml(TuxIconView tuxIconView) {
        this.LLILZ = tuxIconView;
    }

    public final void setPermissionDescTvFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setPermissionFindBtnFromXml(C197039127h c197039127h) {
        this.LLILZIL = c197039127h;
    }

    public final void setPermissionTitleTvFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setStyle(EnumC992790bwT enumC992790bwT) {
        if (this.LLJ == enumC992790bwT) {
            return;
        }
        this.LLJ = enumC992790bwT;
        if (e0()) {
            return;
        }
        if (C1071080dyk.LIZ[enumC992790bwT.ordinal()] == 1) {
            C426750GoL.LJIIL(this, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 16);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            TuxIconView permissionAvatarIvFromXml = getPermissionAvatarIvFromXml();
            ViewGroup.LayoutParams layoutParams = getPermissionAvatarIvFromXml().getLayoutParams();
            layoutParams.width = iLIZIZ;
            layoutParams.height = iLIZIZ;
            C786410Ut5.M6(permissionAvatarIvFromXml, layoutParams);
            getPermissionAvatarIvFromXml().setIconWidth(iLIZIZ);
            getPermissionAvatarIvFromXml().setIconHeight(iLIZIZ);
            return;
        }
        C426750GoL.LJIIL(this, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), 16);
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        TuxIconView permissionAvatarIvFromXml2 = getPermissionAvatarIvFromXml();
        ViewGroup.LayoutParams layoutParams2 = getPermissionAvatarIvFromXml().getLayoutParams();
        layoutParams2.width = iLIZIZ2;
        layoutParams2.height = iLIZIZ2;
        C786410Ut5.M6(permissionAvatarIvFromXml2, layoutParams2);
        getPermissionAvatarIvFromXml().setIconWidth(iLIZIZ2);
        getPermissionAvatarIvFromXml().setIconHeight(iLIZIZ2);
    }

    @Override // X.InterfaceC1903540zdQ
    public void setUFRExternalParams(Map<String, String> map) {
        this.LLIZLLLIL = map;
        if (!this.LLJILJIL && Intrinsics.LJFF("bottom", map.get("position"))) {
            this.LLJILJIL = true;
            C197039127h permissionFindBtnFromXml = getPermissionFindBtnFromXml();
            ViewGroup.LayoutParams layoutParams = getPermissionFindBtnFromXml().getLayoutParams();
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
            C786410Ut5.J6(permissionFindBtnFromXml, layoutParams);
        }
    }

    @Override // X.InterfaceC1903540zdQ
    public final void d0(EnumC1071070dyj enumC1071070dyj, EnumC992790bwT enumC992790bwT) {
        int i;
        if (enumC992790bwT != null) {
            setStyle(enumC992790bwT);
        }
        if (enumC1071070dyj == EnumC1071070dyj.CONTACT) {
            getPermissionAvatarIvFromXml().setIconRes(R.raw.icon_color_contact_circle);
            C786410Ut5.LLLLZLL(getPermissionDescTvFromXml(), 0);
            C1903610zdX.LIZ.getClass();
            int i2 = 2131829481;
            if (C1903610zdX.LIZIZ().useNewUi) {
                C197039127h permissionFindBtnFromXml = getPermissionFindBtnFromXml();
                if (permissionFindBtnFromXml != null) {
                    permissionFindBtnFromXml.setText(2131826785);
                }
                C786410Ut5.LLLLZLL(getPermissionDescTvFromXml(), 8);
                i = 2131826786;
            } else if (C300720BqY.LIZ()) {
                i = 2131836013;
                i2 = 2131836012;
            } else {
                i = 2131829482;
            }
            getPermissionTitleTvFromXml().setText(i);
            getPermissionDescTvFromXml().setText(i2);
        } else if (enumC1071070dyj == EnumC1071070dyj.FACEBOOK) {
            getPermissionAvatarIvFromXml().setIconRes(R.raw.icon_color_facebook_circle);
            getPermissionTitleTvFromXml().setText(2131834450);
            getPermissionDescTvFromXml().setText(2131834449);
        }
        View.OnClickListener aCListenerS119S0200000_16 = new ACListenerS119S0200000_16(this, enumC1071070dyj, 26);
        if (C1848410yCV.LIZ) {
            aCListenerS119S0200000_16 = new f(aCListenerS119S0200000_16);
        }
        a aVar = new a(aCListenerS119S0200000_16);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
        C786410Ut5.a9(getPermissionCloseBtnFromXml(), new ACListenerS119S0200000_16(this, enumC1071070dyj, 27));
    }

    public C1071090dyl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLIZ = "";
        this.LLJ = EnumC992790bwT.INBOX_SMALL;
        this.LLJI = "click";
        this.LLJILJILJ = this;
        C786410Ut5.Sd(R.layout.cy0, C786410Ut5.ne(context), this);
        C19ME c19me = new C19ME(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(c19me);
        C426750GoL.LJIIL(this, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 16);
    }
}
