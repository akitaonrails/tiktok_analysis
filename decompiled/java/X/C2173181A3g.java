package X;

import Y.ACListenerS167S0100000_33;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: X.1A3g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2173181A3g extends AbstractC855590XhN {
    public final int LLILLL;
    public LinearLayout LLILZ;
    public RadioGroup LLILZIL;
    public C21458918yR LLILZLL;
    public C21458918yR LLIZ;
    public C21458918yR LLIZLLLIL;
    public TextView LLJ;
    public TuxTextView LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public final IAVPublishService LLJJ;
    public InterfaceC856360Xic LLJJI;

    @Override // X.AbstractC855590XhN
    public final void LIZLLL() {
    }

    @Override // X.AbstractC855590XhN
    public final void LJFF() {
    }

    @Override // X.AbstractC855590XhN
    public final void LJIIIIZZ() {
    }

    public void LJIILLIIL(View view) {
    }

    public final boolean LJIJ() {
        InterfaceC1369790lkX interfaceC1369790lkXLIZ = C1374810lsd.LIZ("line", null, null, 6);
        if (interfaceC1369790lkXLIZ != null && interfaceC1369790lkXLIZ.LJIIZILJ(getContext())) {
            return true;
        }
        C786410Ut5.r(this.LLIZ, 8);
        return false;
    }

    private InterfaceC1378050lxr getActivityProvider() {
        return new InterfaceC1378050lxr() { // from class: X.1A3o
            @Override // X.InterfaceC1378050lxr
            public final Activity get() {
                C2173181A3g c2173181A3g = this.LIZ;
                return (c2173181A3g.getContext() == null || !(c2173181A3g.getContext() instanceof Activity)) ? C2214201BlK.LJFF() : (Activity) c2173181A3g.getContext();
            }
        };
    }

    @Override // X.AbstractC855590XhN
    public final boolean LJI() {
        C21458918yR c21458918yR = this.LLILZLL;
        return c21458918yR != null && c21458918yR.getVisibility() == 0;
    }

    @Override // X.AbstractC855590XhN
    public final boolean LJII() {
        if (this.LLILZIL == null) {
            return true;
        }
        for (int i = 0; i < this.LLILZIL.getChildCount(); i++) {
            View childAt = this.LLILZIL.getChildAt(i);
            if ((childAt instanceof C21458918yR) && childAt.getVisibility() == 0) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC855590XhN
    public final String LJIIJ() {
        ArrayList arrayList = new ArrayList();
        int saveUploadType = getSaveUploadType();
        if (saveUploadType != 0) {
            arrayList.add(Integer.valueOf(saveUploadType));
        }
        return C120300cz.LIZ(arrayList);
    }

    public final boolean LJIJI() {
        C1377070lwH c1377070lwH = new C1377070lwH(getActivityProvider(), null);
        C1374800lsc.LIZ.getClass();
        InterfaceC1369790lkX interfaceC1369790lkXLIZIZ = C1374800lsc.LIZIZ("messenger", c1377070lwH);
        if (interfaceC1369790lkXLIZIZ != null && interfaceC1369790lkXLIZIZ.LJIIZILJ(getContext())) {
            return true;
        }
        C786410Ut5.r(this.LLIZLLLIL, 8);
        return false;
    }

    public int getLayoutResId() {
        return this.LLILLL == 0 ? R.layout.f8p : R.layout.f7o;
    }

    @Override // X.AbstractC855590XhN
    public int getSaveUploadType() {
        RadioGroup radioGroup = this.LLILZIL;
        if (radioGroup == null) {
            return 0;
        }
        int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
        if (checkedRadioButtonId == R.id.cuk) {
            return 1;
        }
        if (checkedRadioButtonId == R.id.crn) {
            return 11;
        }
        return checkedRadioButtonId == R.id.cry ? 7 : 0;
    }

    public final boolean LJIILIIL() {
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("disable_save_at_post", false)) {
            return true;
        }
        C21458918yR c21458918yR = this.LLILZLL;
        if (c21458918yR != null) {
            C786410Ut5.r(c21458918yR, 8);
        }
        C746350TPl.LIZ.LIZIZ().LJ(0);
        return false;
    }

    public final boolean LJIILJJIL() {
        if (((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().avsettingsConfig().enableSaveUploadVideo()) {
            return true;
        }
        C21458918yR c21458918yR = this.LLILZLL;
        if (c21458918yR != null) {
            C786410Ut5.r(c21458918yR, 8);
        }
        C746350TPl.LIZ.LIZIZ().LJ(0);
        return false;
    }

    public C2173181A3g(Context context) {
        super(context);
        this.LLJILJILJ = 44;
        this.LLJILLL = 30;
        this.LLJJ = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService();
        this.LLILLL = 0;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), getLayoutResId(), this, true);
        this.LLILZ = (LinearLayout) viewTd.findViewById(R.id.m8g);
        this.LLILZIL = (RadioGroup) viewTd.findViewById(R.id.spl);
        C21458918yR c21458918yR = (C21458918yR) viewTd.findViewById(R.id.cuk);
        this.LLILZLL = c21458918yR;
        if (c21458918yR != null) {
            c21458918yR.setContentDescription(context.getString(2131848257));
        }
        this.LLIZ = (C21458918yR) viewTd.findViewById(R.id.crn);
        this.LLIZLLLIL = (C21458918yR) viewTd.findViewById(R.id.cry);
        this.LLJI = (TuxTextView) viewTd.findViewById(R.id.yym);
        View viewFindViewById = viewTd.findViewById(R.id.uzg);
        View viewFindViewById2 = viewTd.findViewById(R.id.v1t);
        if (viewFindViewById instanceof TuxIconView) {
            ((TuxIconView) viewFindViewById).setTintColorRes(R.attr.a1h);
        }
        if (viewFindViewById2 instanceof TuxTextView) {
            TuxTextView tuxTextView = (TuxTextView) viewFindViewById2;
            tuxTextView.setTuxFont(42);
            tuxTextView.setTextColorRes(R.attr.a1h);
        }
        LJIIZILJ(viewTd);
        LJIILLIIL(viewTd);
        setSilentShareChannelDrawable(context);
        C1375000lsw.LIZ = false;
        if (LJIILJJIL() && LJIILIIL()) {
            boolean zLJIJ = LJIJ();
            boolean zLJIJI = LJIJI();
            C19259110Wf c19259110Wf = C746350TPl.LIZ;
            int iIntValue = c19259110Wf.LIZIZ().LIZ().intValue();
            if (iIntValue != 1) {
                if (iIntValue != 7) {
                    if (iIntValue != 11) {
                        RadioGroup radioGroup = this.LLILZIL;
                        if (radioGroup != null) {
                            radioGroup.clearCheck();
                        }
                    } else if (!zLJIJ) {
                        c19259110Wf.LIZIZ().LJ(0);
                    } else {
                        C21458918yR c21458918yR2 = this.LLIZ;
                        if (c21458918yR2 != null) {
                            c21458918yR2.setChecked(true);
                        }
                    }
                } else if (!zLJIJI) {
                    c19259110Wf.LIZIZ().LJ(0);
                } else {
                    C21458918yR c21458918yR3 = this.LLIZLLLIL;
                    if (c21458918yR3 != null) {
                        c21458918yR3.setChecked(true);
                    }
                }
            } else if (this.LLILZLL != null) {
                boolean zTurnOffSaveLocalOptionByDefault = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().turnOffSaveLocalOptionByDefault();
                C01GW c01gw = C604730Nnj.LIZ;
                Keva keva = (Keva) c01gw.getValue();
                C01GW c01gw2 = C604730Nnj.LIZJ;
                boolean z = keva.getBoolean((String) c01gw2.getValue(), false);
                if (zTurnOffSaveLocalOptionByDefault && !z) {
                    ((Keva) c01gw.getValue()).storeBoolean((String) c01gw2.getValue(), true);
                    c19259110Wf.LIZIZ().LJ(0);
                } else {
                    this.LLILZLL.setChecked(true);
                    LJIILL(true);
                }
            }
            if (SharePrefCache.inst().getIsAwemePrivate().LIZ().booleanValue()) {
                LJIIL(true);
            }
            LJIJJLI(this.LLILZIL.getCheckedRadioButtonId());
        }
        C21458918yR c21458918yR4 = this.LLIZ;
        if (c21458918yR4 != null) {
            C786410Ut5.J9(c21458918yR4, new ACListenerS167S0100000_33((C2173161A3e) this, 109));
        }
        C21458918yR c21458918yR5 = this.LLIZLLLIL;
        if (c21458918yR5 != null) {
            C786410Ut5.J9(c21458918yR5, new ACListenerS167S0100000_33((C2173161A3e) this, 110));
        }
        C21458918yR c21458918yR6 = this.LLILZLL;
        if (c21458918yR6 != null) {
            C786410Ut5.J9(c21458918yR6, new ACListenerS167S0100000_33((C2173161A3e) this, 111));
        }
        RadioGroup radioGroup2 = this.LLILZIL;
        if (radioGroup2 != null) {
            final C2173161A3e c2173161A3e = (C2173161A3e) this;
            C786410Ut5.x7(radioGroup2, new RadioGroup.OnCheckedChangeListener() { // from class: X.1A3l
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup3, int i) {
                    C2173181A3g c2173181A3g = c2173161A3e;
                    TuxTextView tuxTextView2 = c2173181A3g.LLJI;
                    if (tuxTextView2 != null) {
                        C786410Ut5.LLLLZLL(tuxTextView2, 8);
                    }
                    if (i == R.id.cuk) {
                        C746350TPl.LIZ.LIZIZ().LJ(1);
                        c2173181A3g.LJIIJJI("sync_share_save_local");
                        SharePrefCache.inst().getAutoSaveVideo().LJ(Boolean.TRUE);
                    } else if (i == R.id.crn) {
                        C746350TPl.LIZ.LIZIZ().LJ(11);
                        c2173181A3g.LJIIJJI("sync_share_save_line");
                        SharePrefCache.inst().getAutoSaveVideo().LJ(Boolean.TRUE);
                    } else if (i == R.id.cry) {
                        C746350TPl.LIZ.LIZIZ().LJ(7);
                        c2173181A3g.LJIIJJI("sync_share_save_messenger");
                        SharePrefCache.inst().getAutoSaveVideo().LJ(Boolean.TRUE);
                    } else if (!SharePrefCache.inst().getIsAwemePrivate().LIZ().booleanValue()) {
                        C746350TPl.LIZ.LIZIZ().LJ(0);
                        SharePrefCache.inst().getAutoSaveVideo().LJ(Boolean.FALSE);
                    }
                    c2173181A3g.LJIJJLI(i);
                }
            });
        }
    }

    public static void LJIL(View view) {
        boolean zEnableToastCenter;
        if (view == null) {
            return;
        }
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi(IAVPublishPageUIRefactorService.class);
        if (iAVPublishPageUIRefactorService == null) {
            zEnableToastCenter = false;
        } else {
            zEnableToastCenter = iAVPublishPageUIRefactorService.enableToastCenter();
        }
        if (zEnableToastCenter) {
            C1389880mGw c1389880mGw = new C1389880mGw(view);
            c1389880mGw.LJIIIIZZ(2131845242);
            c1389880mGw.LJIIJ();
        } else {
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJIIIZ(2131845242);
            c1389890mGx.LJIIJJI();
        }
    }

    public static final String LJJ(Object obj) {
        if (obj == null) {
            return "";
        }
        return obj.toString();
    }

    @Override // X.AbstractC855590XhN
    public final void LIZIZ(C855500XhE c855500XhE) {
        this.LLJJI = c855500XhE;
    }

    @Override // X.AbstractC855590XhN
    public void LIZJ(int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        SharePrefCache.inst().getIsAwemePrivate().LJ(Boolean.valueOf(z));
        ShareDependService.LIZ.getClass();
        ShareDependServiceImpl.LJJJJI().LJJIJIL(getContext(), z);
        LJIIL(z);
    }

    @Override // X.AbstractC855590XhN
    public void LJIIIZ(boolean z) {
        C21458918yR c21458918yR = this.LLILZLL;
        if (c21458918yR != null) {
            c21458918yR.setChecked(z);
        }
        RadioGroup radioGroup = this.LLILZIL;
        if (radioGroup != null) {
            if (z) {
                radioGroup.check(R.id.cuk);
            } else {
                if (radioGroup.getCheckedRadioButtonId() != R.id.cuk) {
                    return;
                }
                this.LLILZIL.clearCheck();
            }
        }
    }

    public final void LJIIJJI(String str) {
        if (!this.LLJIJIL) {
            this.LLJIJIL = true;
            this.LLJJ.cancelSynthesis(getContext(), str);
        }
    }

    public final void LJIIL(boolean z) {
        C21458918yR c21458918yR;
        if (z) {
            RadioGroup radioGroup = this.LLILZIL;
            if (radioGroup != null) {
                int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                C21458918yR c21458918yR2 = this.LLIZ;
                if (c21458918yR2 != null) {
                    c21458918yR2.setCanChecked(false);
                }
                C21458918yR c21458918yR3 = this.LLIZLLLIL;
                if (c21458918yR3 != null) {
                    c21458918yR3.setCanChecked(false);
                }
                C21458918yR c21458918yR4 = this.LLIZ;
                if (c21458918yR4 != null && this.LLIZLLLIL != null && (checkedRadioButtonId == c21458918yR4.getId() || checkedRadioButtonId == this.LLIZLLLIL.getId())) {
                    this.LLILZIL.check(-1);
                }
            }
        } else if (this.LLILZIL != null) {
            int iIntValue = C746350TPl.LIZ.LIZIZ().LIZ().intValue();
            C21458918yR c21458918yR5 = this.LLIZ;
            if (c21458918yR5 != null) {
                c21458918yR5.setCanChecked(true);
            }
            C21458918yR c21458918yR6 = this.LLIZLLLIL;
            if (c21458918yR6 != null) {
                c21458918yR6.setCanChecked(true);
            }
            C21458918yR c21458918yR7 = this.LLIZ;
            if (c21458918yR7 != null && (c21458918yR = this.LLIZLLLIL) != null) {
                if (iIntValue == 11) {
                    c21458918yR7.setChecked(true);
                } else if (iIntValue == 7) {
                    c21458918yR.setChecked(true);
                }
            }
        }
        LJIJJLI(this.LLILZIL.getCheckedRadioButtonId());
    }

    public final void LJIILL(boolean z) {
        TuxTextView tuxTextView;
        if (this.LLJILJIL) {
            return;
        }
        int i = ((Keva) C604730Nnj.LIZ.getValue()).getInt((String) C604730Nnj.LIZIZ.getValue(), 0);
        boolean zTurnOffSaveLocalAfterModeration = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().turnOffSaveLocalAfterModeration();
        if (i < 3 && z && zTurnOffSaveLocalAfterModeration && (tuxTextView = this.LLJI) != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            this.LLJILJIL = true;
            C1375000lsw.LIZ = true;
        }
    }

    public void LJIIZILJ(View view) {
        this.LLJ = (TextView) view.findViewById(R.id.wvo);
    }

    public void LJIJJLI(int i) {
        if (i == R.id.crn) {
            this.LLJ.setText(getContext().getString(2131848255, "Line"));
        } else if (i == R.id.cry) {
            this.LLJ.setText(getContext().getString(2131848255, "Messenger"));
        } else {
            this.LLJ.setText(getContext().getString(2131847855));
        }
    }

    @Override // X.AbstractC855590XhN
    public void setSaveLocalEnabled(boolean z) {
        int i;
        C21458918yR c21458918yR = this.LLILZLL;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.r(c21458918yR, i);
    }

    public void setSilentShareChannelDrawable(Context context) {
        C21458918yR c21458918yR = this.LLILZLL;
        int i = this.LLJILJILJ;
        int i2 = this.LLJILLL;
        StateListDrawable stateListDrawable = new StateListDrawable();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_arrow_to_down;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.br);
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(50));
        LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_arrow_to_down;
        c419910GdJ2.LJ = Integer.valueOf(R.attr.ee);
        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
        TuxIconDrawable tuxIconDrawableLIZ2 = c419910GdJ2.LIZ(context);
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a04);
        c384050F3z2.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        c384050F3z2.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(50));
        LayerDrawable layerDrawableLJIILIIL2 = C426750GoL.LJIILIIL(tuxIconDrawableLIZ2, c384050F3z2.LIZ(context));
        stateListDrawable.addState(new int[]{-16842912}, layerDrawableLJIILIIL);
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, layerDrawableLJIILIIL2);
        stateListDrawable.addState(new int[0], layerDrawableLJIILIIL);
        c21458918yR.setBackground(stateListDrawable);
        this.LLIZ.setBackground(C1375340ltU.LIZ(context, R.raw.icon_line, R.raw.icon_color_line_circle, this.LLJILJILJ, this.LLJILLL));
        this.LLIZLLLIL.setBackground(C1375340ltU.LIZ(context, R.raw.icon_messenger, R.raw.icon_color_messenger_circle, this.LLJILJILJ, this.LLJILLL));
    }

    @Override // X.AbstractC855590XhN
    public void setSyncIconSize(int i) {
        C21458918yR c21458918yR = this.LLIZ;
        if (c21458918yR != null) {
            ViewGroup.LayoutParams layoutParams = c21458918yR.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i;
        }
        C21458918yR c21458918yR2 = this.LLIZLLLIL;
        if (c21458918yR2 != null) {
            ViewGroup.LayoutParams layoutParams2 = c21458918yR2.getLayoutParams();
            layoutParams2.width = i;
            layoutParams2.height = i;
        }
        C21458918yR c21458918yR3 = this.LLILZLL;
        if (c21458918yR3 != null) {
            ViewGroup.LayoutParams layoutParams3 = c21458918yR3.getLayoutParams();
            layoutParams3.width = i;
            layoutParams3.height = i;
        }
    }

    @Override // X.AbstractC855590XhN
    public void setSyncShareViewTextColor(int i) {
        TextView textView = this.LLJ;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    @Override // X.AbstractC855590XhN
    public void setSyncShareViewTextSize(float f) {
        TextView textView = this.LLJ;
        if (textView != null) {
            textView.setTextSize(f);
        }
    }

    @Override // X.AbstractC855590XhN
    public void setSyncShareViewTitle(String str) {
        TextView textView = this.LLJ;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // X.AbstractC855590XhN
    public void LIZ(int i, C855810Xhj c855810Xhj) {
        C21458918yR c21458918yR;
        if (i != -2) {
            if (i == 1 && (c21458918yR = this.LLILZLL) != null) {
                ((ArrayList) c21458918yR.LLILZLL).add(c855810Xhj);
                return;
            }
            return;
        }
        for (int i2 = 0; i2 < this.LLILZIL.getChildCount(); i2++) {
            View childAt = this.LLILZIL.getChildAt(i2);
            if (childAt instanceof C21458918yR) {
                ((ArrayList) ((C21458918yR) childAt).LLILZLL).add(c855810Xhj);
            }
        }
    }

    public final void LJIJJ(String str, boolean z) {
        String str2;
        String str3;
        Object tag = getTag();
        if (!(tag instanceof Map)) {
            return;
        }
        Map map = (Map) tag;
        if (z) {
            str2 = "publish_share_confirm";
        } else {
            str2 = "publish_share_cancel";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", LJJ(map.get("creation_id")));
        c2344009Gk.LJIIIIZZ("enter_from", LJJ(map.get("enter_from")));
        c2344009Gk.LJIIIIZZ("content_type", LJJ(map.get("content_type")));
        c2344009Gk.LJIIIIZZ("shoot_way", LJJ(map.get("shoot_way")));
        c2344009Gk.LJIIIIZZ("share_to", str);
        C20684815ws.LJIILLIIL(str2, c2344009Gk.LIZ);
        if ("download".equals(str)) {
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("creation_id", LJJ(map.get("creation_id")));
            c2344009Gk2.LJIIIIZZ("enter_from", LJJ(map.get("enter_from")));
            c2344009Gk2.LJIIIIZZ("shoot_way", LJJ(map.get("shoot_way")));
            if (z) {
                str3 = "on";
            } else {
                str3 = "off";
            }
            c2344009Gk2.LJIIIIZZ("to_status", str3);
            c2344009Gk2.LIZJ(-1, "save_with_captions");
            C20684815ws.LJIILLIIL("click_react_download_control", c2344009Gk2.LIZ);
        }
        if (z) {
            LJ();
        }
    }
}
