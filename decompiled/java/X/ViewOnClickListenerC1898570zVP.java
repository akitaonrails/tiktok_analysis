package X;

import Y.ACallableS431S0100000_28;
import Y.ARunnableS47S0110000_28;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.touchpoint.api.model.Button;
import com.bytedance.touchpoint.api.model.Content;
import com.bytedance.touchpoint.api.model.Control;
import com.bytedance.touchpoint.api.model.InAppPush;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0zVP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class ViewOnClickListenerC1898570zVP extends C214906198m implements InterfaceC1899870zXV, View.OnClickListener {
    public static boolean LLJI;
    public static boolean LLJIJIL;
    public final Activity LL;
    public final InAppPush LLILLJJLI;
    public final int LLILLL;
    public boolean LLILZ;
    public long LLILZIL;
    public final ARunnableS47S0110000_28 LLILZLL;
    public final View LLIZ;
    public final C1899850zXT LLIZLLLIL;
    public final View LLJ;

    @Override // X.InterfaceC1899870zXV
    public final void LIZ() {
    }

    @Override // X.InterfaceC1899870zXV
    public final void LIZIZ() {
        this.LLILZ = false;
        if (isShowing()) {
            C1619720sFe c1619720sFe = C1619720sFe.LIZ;
            InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
            if (interfaceC1897260zTILIZIZ != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("button_name", "close");
                Control control = this.LLILLJJLI.control;
                linkedHashMap.put("type", String.valueOf(control != null ? Integer.valueOf(control.type) : null));
                String str = this.LLILLJJLI.inAppPushName;
                if (str == null) {
                    str = "";
                }
                linkedHashMap.put("name", str);
                String str2 = this.LLILLJJLI.taskIds;
                linkedHashMap.put("task_id", str2 != null ? str2 : "");
                AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
                linkedHashMap.put("region", abstractC1896090zRP != null ? abstractC1896090zRP.LJIJJ() : null);
                interfaceC1897260zTILIZIZ.LIZ("inapp_push_click", linkedHashMap);
            }
            LJJIIJZLJL(true);
        }
    }

    public final Context LJJIIJ() {
        Context contextLJIIJJI;
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        return (abstractC1896090zRP == null || (contextLJIIJJI = abstractC1896090zRP.LJIIJJI()) == null) ? getContentView().getContext() : contextLJIIJJI;
    }

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void dismiss() {
        boolean zLJI = MethodIDManager.LJI(72050);
        LLJI = false;
        C15O7.LIZJ(new ACallableS431S0100000_28(this, 7));
        super.dismiss();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJJIIJZLJL(boolean z) {
        boolean zLJI = MethodIDManager.LJI(71868);
        if (isShowing() && !this.LLILZ) {
            try {
                if (!this.LL.isFinishing()) {
                    this.LLIZLLLIL.LIZ(0.0f, true);
                    dismiss();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("isManual", String.valueOf(z));
            interfaceC1897260zTILIZIZ.LJFF(false, linkedHashMap);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf;
        String str;
        Integer numValueOf2;
        String strLJIJJ;
        if (view.getId() != R.id.trr || C660220Pv2.LIZ(view)) {
            return;
        }
        C1619720sFe c1619720sFe = C1619720sFe.LIZ;
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
        String str2 = "";
        if (interfaceC1897260zTILIZIZ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("button_name", "ok");
            Control control = this.LLILLJJLI.control;
            if (control != null) {
                numValueOf2 = Integer.valueOf(control.type);
            } else {
                numValueOf2 = null;
            }
            linkedHashMap.put("type", String.valueOf(numValueOf2));
            String str3 = this.LLILLJJLI.inAppPushName;
            if (str3 == null) {
                str3 = "";
            }
            linkedHashMap.put("name", str3);
            String str4 = this.LLILLJJLI.taskIds;
            if (str4 == null) {
                str4 = "";
            }
            linkedHashMap.put("task_id", str4);
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
            if (abstractC1896090zRP != null) {
                strLJIJJ = abstractC1896090zRP.LJIJJ();
            } else {
                strLJIJJ = null;
            }
            linkedHashMap.put("region", strLJIJJ);
            interfaceC1897260zTILIZIZ.LIZ("inapp_push_click", linkedHashMap);
        }
        String str5 = this.LLILLJJLI.LIZIZ;
        if (str5 != null && str5.length() != 0) {
            C1894320zOY c1894320zOY = C1894320zOY.LIZ;
            InAppPush inAppPush = this.LLILLJJLI;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("click_position", "ok");
            Control control2 = this.LLILLJJLI.control;
            if (control2 != null) {
                numValueOf = Integer.valueOf(control2.type);
            } else {
                numValueOf = null;
            }
            linkedHashMap2.put("sub_type", String.valueOf(numValueOf));
            Control control3 = this.LLILLJJLI.control;
            if (control3 != null && (str = control3.taskName) != null) {
                str2 = str;
            }
            linkedHashMap2.put("task_key", str2);
            C1894320zOY.LJIILLIIL(c1894320zOY, inAppPush, linkedHashMap2, null, 28);
        }
        LLJIJIL = true;
        InAppPush inAppPush2 = this.LLILLJJLI;
        String str6 = inAppPush2.jumpLink;
        if (str6 != null) {
            C1893580zNM c1893580zNM = C1893580zNM.LIZ;
            Activity activity = this.LL;
            Integer numValueOf3 = Integer.valueOf(inAppPush2.LIZ);
            InAppPush inAppPush3 = this.LLILLJJLI;
            String str7 = inAppPush3.LIZIZ;
            if (str7 == null) {
                str7 = "inAppPush";
            }
            C1893580zNM.LJ(c1893580zNM, activity, numValueOf3, str6, str7, false, inAppPush3.LJ, null, null, 192);
        }
        LJJIIJZLJL(true);
    }

    public ViewOnClickListenerC1898570zVP(Activity activity, InAppPush inAppPush) {
        int i;
        Content content;
        String str;
        int i2;
        Content content2;
        Content content3;
        String str2;
        String str3;
        super(activity);
        this.LL = activity;
        this.LLILLJJLI = inAppPush;
        this.LLILLL = 5000;
        View viewSd = C786410Ut5.Sd(R.layout.fwi, (LayoutInflater) C786410Ut5.H2(LJJIIJ(), "layout_inflater"), null);
        this.LLIZ = viewSd;
        C1899850zXT c1899850zXT = (C1899850zXT) viewSd.findViewById(R.id.si1);
        this.LLIZLLLIL = c1899850zXT;
        View viewFindViewById = viewSd.findViewById(R.id.trr);
        this.LLJ = viewFindViewById;
        C1322110kVd c1322110kVd = (C1322110kVd) viewSd.findViewById(R.id.k15);
        TuxTextView tuxTextView = (TuxTextView) viewSd.findViewById(R.id.message_tv);
        TuxTextView tuxTextView2 = (TuxTextView) viewSd.findViewById(R.id.j3k);
        if (inAppPush.bgColor != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(C12ES.LIZJ(12.0f, activity));
            gradientDrawable.setColor(C0SVC.LIZ(R.attr.j8, viewFindViewById.getContext()));
            viewFindViewById.setBackground(gradientDrawable);
        }
        C786410Ut5.I7(this, viewFindViewById);
        c1899850zXT.LLILLL = viewFindViewById;
        c1899850zXT.setPullUpListener(this);
        c1899850zXT.setInternalTouchEventListener(new InterfaceC1898670zVZ() { // from class: X.0zVV
            @Override // X.InterfaceC1898670zVZ
            public final void onTouchEvent(MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            this.LIZ.LLILZ = true;
                            return;
                        }
                        return;
                    }
                    ViewOnClickListenerC1898570zVP viewOnClickListenerC1898570zVP = this.LIZ;
                    viewOnClickListenerC1898570zVP.LLILZ = false;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    ViewOnClickListenerC1898570zVP viewOnClickListenerC1898570zVP2 = this.LIZ;
                    long j = viewOnClickListenerC1898570zVP2.LLILLL;
                    viewOnClickListenerC1898570zVP.LLILZIL = jCurrentTimeMillis + j;
                    viewOnClickListenerC1898570zVP2.LLILZLL.z1 = false;
                    HandlerHook.viewPostDelay(viewOnClickListenerC1898570zVP2.LLJ, viewOnClickListenerC1898570zVP2.LLILZLL, j);
                    return;
                }
                ViewOnClickListenerC1898570zVP viewOnClickListenerC1898570zVP3 = this.LIZ;
                viewOnClickListenerC1898570zVP3.LLILZ = true;
                viewOnClickListenerC1898570zVP3.LLILZLL.z1 = true;
            }
        });
        Content content4 = inAppPush.content;
        tuxTextView.setText((content4 == null || (str3 = content4.text) == null) ? "" : str3);
        tuxTextView.setTextColor(C0SVC.LIZ(R.attr.jt, LJJIIJ()));
        Content content5 = inAppPush.content;
        if (content5 != null) {
            i = content5.size;
        } else {
            i = 41;
        }
        tuxTextView.setTuxFont(i);
        Button button = inAppPush.button;
        if (button != null && (content = button.content) != null && (str = content.text) != null && str.length() != 0) {
            C786410Ut5.LLLLZLL(tuxTextView2, 0);
            Button button2 = inAppPush.button;
            tuxTextView2.setText((button2 == null || (content3 = button2.content) == null || (str2 = content3.text) == null) ? activity.getString(2131830588) : str2);
            Button button3 = inAppPush.button;
            if (button3 != null && (content2 = button3.content) != null) {
                i2 = content2.size;
            } else {
                i2 = 72;
            }
            tuxTextView2.setTuxFont(i2);
            tuxTextView2.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)));
            tuxTextView2.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            tuxTextView2.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0);
            tuxTextView2.setTextColor(C0SVC.LIZ(R.attr.j8, tuxTextView2.getContext()));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setCornerRadius(C12ES.LIZJ(5.0f, activity));
            gradientDrawable2.setColor(C0SVC.LIZ(R.attr.jn, tuxTextView2.getContext()));
            tuxTextView2.setBackground(gradientDrawable2);
        } else {
            C786410Ut5.LLLLZLL(tuxTextView2, 8);
        }
        String str4 = inAppPush.icon;
        if (str4 != null && str4.length() != 0) {
            c1322110kVd.setImageURI(inAppPush.icon);
        }
        this.LLILZLL = new ARunnableS47S0110000_28(this, 7);
        setBackgroundDrawable(new ColorDrawable(0));
        setContentView(viewSd);
        setWidth(C12ES.LJIIJ(LJJIIJ()));
        setHeight(-2);
        update();
        setAnimationStyle(R.style.adq);
    }
}
