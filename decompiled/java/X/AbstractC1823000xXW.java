package X;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.api.SMBKYBInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBKYCInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBVerificationInfo;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsAutoExpandBioSetting;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsServicePlusSingleSkuEnableSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.text.Bidi;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0xXW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1823000xXW extends RecyclerView.ViewHolder {
    public final boolean LL;
    public final String LLILLJJLI;
    public final InterfaceC1823190xXp LLILLL;
    public final boolean LLILZ;
    public final int LLILZIL;
    public final C1822330xWR LLILZLL;
    public final C16F5 LLIZ;
    public final View LLIZLLLIL;
    public final C16F5 LLJ;
    public final C16F5 LLJI;
    public final View LLJIJIL;
    public final C19M4 LLJILJIL;
    public ViewTreeObserverOnPreDrawListenerC1823010xXX LLJILJILJ;

    public final void N5() {
        View view = this.LLJIJIL;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        try {
            marginLayoutParams.topMargin = (int) (this.LLILZ ? this.LLJIJIL.getContext().getResources().getDimension(R.dimen.ato) : this.LLJIJIL.getContext().getResources().getDimension(R.dimen.atn));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C786410Ut5.W5(view, marginLayoutParams);
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [X.0xXX] */
    public void I5(final C1822350xWT c1822350xWT) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        SMBKYBInfo sMBKYBInfo;
        SMBKYCInfo sMBKYCInfo;
        int i4;
        boolean z3;
        String str;
        if (c1822350xWT == null) {
            return;
        }
        String str2 = c1822350xWT.LIZ;
        C16F5 c16f5 = this.LLIZ;
        int i5 = 4;
        if (C454590Hs9.LIZ(this.itemView.getContext())) {
            i = 4;
        } else {
            i = 3;
        }
        c16f5.setTextDirection(i);
        this.LLIZ.setText(C497740JfY.LJIJJ(this.LLILZIL, str2));
        if (c1822350xWT.LIZIZ.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C500260Jjc.LJIILIIL(this.LLJ);
            C500260Jjc.LJIILIIL(this.LLIZLLLIL);
        } else {
            String str3 = C340940DYe.LIZ;
            if (new Bidi(c1822350xWT.LIZIZ, -2).getBaseLevel() == 1) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            boolean zLIZ = C454590Hs9.LIZ(this.LLJ.getContext());
            if (i2 == 0 ? zLIZ : !zLIZ) {
                z2 = false;
            } else {
                z2 = true;
            }
            C500260Jjc.LLFFF(this.LLJ);
            this.LLJ.setText(c1822350xWT.LIZIZ);
            this.LLIZLLLIL.setLayoutDirection(i2);
            C16F5 c16f52 = this.LLJ;
            if (z2) {
                i3 = 2;
            } else {
                i3 = 3;
            }
            c16f52.setTextAlignment(i3);
            C16F5 c16f53 = this.LLJ;
            if (!zLIZ) {
                i5 = 3;
            }
            c16f53.setTextDirection(i5);
            this.LLJ.setMaxLines(2);
            C500260Jjc.LJIILIIL(this.LLJI);
            C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0xXb
                @Override // X.AbstractViewOnClickListenerC1637610siV
                public final void LIZ(View view) {
                    if (view != null) {
                        AbstractC1823000xXW abstractC1823000xXW = this.LLILZ;
                        C1822350xWT c1822350xWT2 = c1822350xWT;
                        C500260Jjc.LJIILIIL(abstractC1823000xXW.LLJI);
                        abstractC1823000xXW.LLJ.setMaxLines(Integer.MAX_VALUE);
                        abstractC1823000xXW.LLJ.setText(c1822350xWT2.LIZIZ);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(300L);
                }
            }, this.LLJI);
            if (!LivePcsAutoExpandBioSetting.INSTANCE.getEnabled()) {
                C340940DYe.LIZ(this.LLJ, c1822350xWT.LIZIZ, this.LLJI);
            } else {
                ViewTreeObserverOnPreDrawListenerC1823010xXX viewTreeObserverOnPreDrawListenerC1823010xXX = this.LLJILJILJ;
                if (viewTreeObserverOnPreDrawListenerC1823010xXX != null) {
                    if (this.itemView.getViewTreeObserver().isAlive()) {
                        C786410Ut5.D3(this.itemView.getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC1823010xXX);
                    }
                    this.LLJILJILJ = null;
                }
                this.LLJILJILJ = new ViewTreeObserver.OnPreDrawListener() { // from class: X.0xXX
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public final boolean onPreDraw() {
                        C0KUO c0kuo;
                        View rootView;
                        View viewFindViewById;
                        if (!this.LL.itemView.getViewTreeObserver().isAlive()) {
                            return true;
                        }
                        C786410Ut5.D3(this.LL.itemView.getViewTreeObserver(), this);
                        AbstractC1823000xXW abstractC1823000xXW = this.LL;
                        abstractC1823000xXW.LLJILJILJ = null;
                        C1822330xWR c1822330xWR = abstractC1823000xXW.LLILZLL;
                        if (c1822330xWR != null && (c0kuo = c1822330xWR.LLJJIJIL) != null && (rootView = c0kuo.getRootView()) != null && (viewFindViewById = rootView.findViewById(R.id.ut_)) != null) {
                            Activity activityLIZ = C06MM.LIZ(this.LL.itemView.getContext());
                            C2204961BRm.LLILZIL(activityLIZ.getWindowManager(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl/j5U8mU9xUG0I/xwf+EP1TY=", null)).getRealMetrics(new DisplayMetrics());
                            if (viewFindViewById.getHeight() >= r3.heightPixels * LivePcsAutoExpandBioSetting.INSTANCE.getHeightThreshold()) {
                                String str4 = C340940DYe.LIZ;
                                AbstractC1823000xXW abstractC1823000xXW2 = this.LL;
                                C340940DYe.LIZ(abstractC1823000xXW2.LLJ, c1822350xWT.LIZIZ, abstractC1823000xXW2.LLJI);
                                return true;
                            }
                            AbstractC1823000xXW abstractC1823000xXW3 = this.LL;
                            C1822350xWT c1822350xWT2 = c1822350xWT;
                            C500260Jjc.LJIILIIL(abstractC1823000xXW3.LLJI);
                            abstractC1823000xXW3.LLJ.setMaxLines(Integer.MAX_VALUE);
                            abstractC1823000xXW3.LLJ.setText(c1822350xWT2.LIZIZ);
                        }
                        return true;
                    }
                };
                if (this.itemView.getViewTreeObserver().isAlive()) {
                    C786410Ut5.y3(this.itemView.getViewTreeObserver(), this.LLJILJILJ);
                }
            }
        }
        if (this.LL) {
            C500260Jjc.LJIILIIL(this.LLJIJIL);
        } else {
            C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0xXk
                {
                    super(300L);
                }

                @Override // X.AbstractViewOnClickListenerC1637610siV
                public final void LIZ(View view) {
                    if (view != null) {
                        AbstractC1823000xXW abstractC1823000xXW = this.LLILZ;
                        abstractC1823000xXW.LLILLL.LIZ(abstractC1823000xXW.LLJIJIL.getContext());
                    }
                }
            }, this.LLJIJIL);
        }
        SMBVerificationInfo sMBVerificationInfo = c1822350xWT.LJ;
        if (sMBVerificationInfo != null && (((sMBKYBInfo = sMBVerificationInfo.kybInfo) != null && sMBKYBInfo.status == 2) || ((sMBKYCInfo = sMBVerificationInfo.kycInfo) != null && sMBKYCInfo.status == 2))) {
            C19M4 c19m4 = this.LLJILJIL;
            if (c19m4 != null) {
                C500260Jjc.LLFFF(c19m4);
            }
            if (LivePcsServicePlusSingleSkuEnableSetting.INSTANCE.getValue()) {
                i4 = R.attr.ezs;
            } else {
                i4 = R.attr.a1p;
            }
            SMBVerificationInfo sMBVerificationInfo2 = c1822350xWT.LJ;
            SMBKYBInfo sMBKYBInfo2 = sMBVerificationInfo2.kybInfo;
            if (sMBKYBInfo2 != null && sMBKYBInfo2.status == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                C1546210qL5.LIZ.getClass();
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C1546210qL5.LIZ(16));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C1546210qL5.LIZ(16));
                c419910GdJ.LJ = Integer.valueOf(i4);
                c419910GdJ.LIZ = R.raw.icon_briefcase_fill;
                C19M4 c19m42 = this.LLJILJIL;
                if (c19m42 != null) {
                    c19m42.setStartIcon(c419910GdJ);
                }
                C19M4 c19m43 = this.LLJILJIL;
                if (c19m43 != null) {
                    SMBKYBInfo sMBKYBInfo3 = c1822350xWT.LJ.kybInfo;
                    if (sMBKYBInfo3 == null || (str = sMBKYBInfo3.identification) == null) {
                        str = "";
                    }
                    c19m43.setText(str);
                }
            } else {
                SMBKYCInfo sMBKYCInfo2 = sMBVerificationInfo2.kycInfo;
                if (sMBKYCInfo2 != null && sMBKYCInfo2.status == 2) {
                    C419910GdJ c419910GdJ2 = new C419910GdJ();
                    C1546210qL5.LIZ.getClass();
                    c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C1546210qL5.LIZ(16));
                    c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C1546210qL5.LIZ(16));
                    c419910GdJ2.LJ = Integer.valueOf(i4);
                    c419910GdJ2.LIZ = R.raw.icon_staff_fill;
                    C19M4 c19m44 = this.LLJILJIL;
                    if (c19m44 != null) {
                        c19m44.setStartIcon(c419910GdJ2);
                    }
                    C19M4 c19m45 = this.LLJILJIL;
                    if (c19m45 != null) {
                        c19m45.setText(C497740JfY.LJIJI(2131850972));
                    }
                }
            }
        } else {
            C19M4 c19m46 = this.LLJILJIL;
            if (c19m46 != null) {
                C500260Jjc.LJIILIIL(c19m46);
            }
        }
        C19M4 c19m47 = this.LLJILJIL;
        if (c19m47 != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0xXq
                {
                    super(300L);
                }

                @Override // X.AbstractViewOnClickListenerC1637610siV
                public final void LIZ(View view) {
                    if (view != null) {
                        AbstractC1823000xXW abstractC1823000xXW = this.LLILZ;
                        if (!abstractC1823000xXW.LL) {
                            abstractC1823000xXW.LLILLL.LIZJ();
                        }
                    }
                }
            }, c19m47);
        }
    }

    public final void L5(View view, String str) throws JSONException {
        C1749450vct c1749450vct = C1749450vct.LIZ;
        Context context = view.getContext();
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("text", str), new Pair("toast", C497740JfY.LJIJI(2131856028)));
        EnumC1749470vcv enumC1749470vcv = EnumC1749470vcv.DEFAULT;
        Map mapLJ = C2097608Jq.LJ();
        c1749450vct.getClass();
        C1749450vct.LIZIZ(context, mapLJIIJ, enumC1749470vcv, mapLJ);
        this.LLILLL.LJ("email");
    }

    public AbstractC1823000xXW(View view, boolean z, String str, String str2, InterfaceC1823190xXp interfaceC1823190xXp, boolean z2, int i, C1822330xWR c1822330xWR) {
        super(view);
        this.LL = z;
        this.LLILLJJLI = str2;
        this.LLILLL = interfaceC1823190xXp;
        this.LLILZ = z2;
        this.LLILZIL = i;
        this.LLILZLL = c1822330xWR;
        this.LLIZ = (C16F5) view.findViewById(R.id.title);
        this.LLIZLLLIL = view.findViewById(R.id.fou);
        this.LLJ = (C16F5) view.findViewById(R.id.desc);
        this.LLJI = (C16F5) view.findViewById(R.id.hfm);
        this.LLJIJIL = view.findViewById(R.id.fvk);
        this.LLJILJIL = (C19M4) view.findViewById(R.id.verified);
    }
}
