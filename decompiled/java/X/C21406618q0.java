package X;

import X.C1396030mQr;
import X.C2195221Avo;
import X.C844470XAv;
import X.InterfaceC19472711Gj;
import Y.ARunnableS121S0100000_21;
import Y.ARunnableS65S0300000_32;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MiniGameFragment;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18q0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21406618q0 {
    public FrameLayout LIZ;
    public ARunnableS65S0300000_32 LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C21406418py LIZIZ(android.app.Activity r4) {
        /*
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r4.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewGroup
            r3 = 0
            if (r0 == 0) goto L36
            java.lang.Class<X.18py> r0 = X.C21406418py.class
            android.view.View r2 = LIZJ(r1, r0)
            boolean r0 = r2 instanceof X.C21406418py
            if (r0 == 0) goto L36
            X.18py r2 = (X.C21406418py) r2
            if (r2 != 0) goto L38
        L1a:
            android.view.Window r0 = r4.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.view.View r1 = r0.getRootView()
            if (r1 == 0) goto L38
            java.lang.Class<X.18py> r0 = X.C21406418py.class
            android.view.View r1 = LIZJ(r1, r0)
            boolean r0 = r1 instanceof X.C21406418py
            if (r0 == 0) goto L35
            r3 = r1
            X.18py r3 = (X.C21406418py) r3
        L35:
            return r3
        L36:
            r2 = r3
            goto L1a
        L38:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21406618q0.LIZIZ(android.app.Activity):X.18py");
    }

    public static void LJFF(EditText editText) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("value", C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehbZbdkjh+wulnh3d1aXyrGz0UnfM8Y1tSbv31a21ugw==", null)).toString());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            ALog.e("ImeServiceImpl", "onKeyboardConfirm error", e);
        }
        IMiniGameRuntimeAPI iMiniGameRuntimeAPILJI = C2195221Avo.LJI();
        if (iMiniGameRuntimeAPILJI != null) {
            iMiniGameRuntimeAPILJI.emitJSAPIEvent("onKeyboardConfirm", jSONObject);
        }
    }

    public static boolean LIZ(Activity activity, View view) {
        InputMethodManager inputMethodManager;
        MiniGameFragment miniGameFragmentLIZIZ = C2195221Avo.LIZIZ();
        if (miniGameFragmentLIZIZ != null && miniGameFragmentLIZIZ.x > 0) {
            Object objF2 = C786410Ut5.F2(activity, "input_method");
            if (objF2 instanceof InputMethodManager) {
                inputMethodManager = (InputMethodManager) objF2;
            } else {
                inputMethodManager = null;
            }
            if (view == null || inputMethodManager == null) {
                return false;
            }
            MiniGameFragment miniGameFragmentLIZIZ2 = C2195221Avo.LIZIZ();
            if (miniGameFragmentLIZIZ2 != null) {
                activity.runOnUiThread(new ARunnableS121S0100000_21(miniGameFragmentLIZIZ2, 6));
            }
            return inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        return true;
    }

    public static View LIZJ(View view, Class cls) {
        if (view != null) {
            if (TextUtils.equals(view.getClass().getName(), cls.getName())) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View viewLIZJ = LIZJ(viewGroup.getChildAt(i), cls);
                    if (viewLIZJ != null) {
                        return viewLIZJ;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static void LJI(Activity activity, final InterfaceC19472711Gj interfaceC19472711Gj) {
        InputMethodManager inputMethodManager;
        C21406418py c21406418pyLIZIZ = LIZIZ(activity);
        if (c21406418pyLIZIZ != null && c21406418pyLIZIZ.getKeyboardEt() != null) {
            EditText keyboardEt = c21406418pyLIZIZ.getKeyboardEt();
            if (keyboardEt != null) {
                keyboardEt.requestFocus();
            }
            Object objF2 = C786410Ut5.F2(activity, "input_method");
            if ((objF2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objF2) != null) {
                MiniGameFragment miniGameFragmentLIZIZ = C2195221Avo.LIZIZ();
                if (miniGameFragmentLIZIZ != null) {
                    miniGameFragmentLIZIZ.B = new C21407018q4(interfaceC19472711Gj);
                }
                inputMethodManager.showSoftInput(c21406418pyLIZIZ.getKeyboardEt(), 1, new ResultReceiver() { // from class: com.ss.android.ugc.aweme.minis.jsb.impl.ime.ImeServiceImpl$getShowKeyboardReceiver$1
                    {
                        super(null);
                    }

                    @Override // android.os.ResultReceiver
                    public final void onReceiveResult(int i, Bundle bundle) {
                        float f;
                        super.onReceiveResult(i, bundle);
                        if (i != 2 && i != 0) {
                            interfaceC19472711Gj.onFailed("Failed to show soft input method.");
                            return;
                        }
                        MiniGameFragment miniGameFragmentLIZIZ2 = C2195221Avo.LIZIZ();
                        InterfaceC19472711Gj interfaceC19472711Gj2 = interfaceC19472711Gj;
                        C1396030mQr c1396030mQr = C1396030mQr.LIZ;
                        C844470XAv.LIZ.getClass();
                        Context contextLIZ = C844470XAv.LIZ();
                        if (miniGameFragmentLIZIZ2 != null) {
                            f = miniGameFragmentLIZIZ2.x;
                        } else {
                            f = 0.0f;
                        }
                        c1396030mQr.getClass();
                        interfaceC19472711Gj2.LIZ(C1396030mQr.LIZLLL(f, contextLIZ));
                    }
                });
            }
        }
    }

    public final void LJ(final Activity activity, final boolean z) {
        FrameLayout confirmIconView;
        C21406418py c21406418pyLIZIZ = LIZIZ(activity);
        if (c21406418pyLIZIZ != null) {
            if (this.LIZIZ == null) {
                this.LIZIZ = new ARunnableS65S0300000_32(c21406418pyLIZIZ, this, activity, 4);
            }
            if (c21406418pyLIZIZ.getVisibility() != 0) {
                c21406418pyLIZIZ.LLILZIL = true;
                HandlerHook.viewPostDelay(c21406418pyLIZIZ, this.LIZIZ, 500L);
            }
        }
        final EditText editText = null;
        if (c21406418pyLIZIZ != null) {
            confirmIconView = c21406418pyLIZIZ.getConfirmIconView();
        } else {
            confirmIconView = null;
        }
        this.LIZ = confirmIconView;
        if (confirmIconView != null) {
            if (c21406418pyLIZIZ != null) {
                editText = c21406418pyLIZIZ.getEditText();
            }
            C786410Ut5.O7(confirmIconView, new View.OnClickListener() { // from class: X.18q2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("ImeServiceImpl", "Keyboard Confirmation Button Clicked");
                    EditText editText2 = editText;
                    if (editText2 != null) {
                        this.getClass();
                        C21406618q0.LJFF(editText2);
                        if (!z) {
                            C21406618q0 c21406618q0 = this;
                            EditText editText3 = editText;
                            Activity activity2 = activity;
                            c21406618q0.getClass();
                            C21406618q0.LIZ(activity2, editText3);
                        }
                    }
                }
            });
            confirmIconView.measure(0, 0);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(android.app.Activity r9, java.lang.String r10, int r11, boolean r12, final boolean r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21406618q0.LIZLLL(android.app.Activity, java.lang.String, int, boolean, boolean, java.lang.String, java.lang.String):void");
    }
}
