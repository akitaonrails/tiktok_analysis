package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS71S1000000_21;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mJM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1391380mJM extends C1504590pFx {
    public final WeakReference<Activity> LIZJ;
    public final boolean LIZLLL;

    public static C0I7D LJII(View view) {
        if (view == null) {
            return null;
        }
        if (view instanceof C0I7D) {
            return (C0I7D) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C0I7D c0i7dLJII = LJII(viewGroup.getChildAt(i));
                if (c0i7dLJII != null) {
                    return c0i7dLJII;
                }
            }
        }
        return null;
    }

    @Override // X.C1504590pFx
    public final JSONObject LIZLLL(final Number number, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        super.LIZLLL(number, jSONObject2);
        if (this.LIZLLL) {
            return C1385490m9r.LIZ(this, number);
        }
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        final String strOptString = jSONObject2.optString("title", "");
        final String strOptString2 = jSONObject2.optString("content", "");
        final boolean zOptBoolean = jSONObject2.optBoolean("showCancel", true);
        final String strOptString3 = jSONObject2.optString("cancelText", "Cancel");
        final String strOptString4 = jSONObject2.optString("confirmText", "OK");
        final boolean zOptBoolean2 = jSONObject2.optBoolean("editable", false);
        final String strOptString5 = jSONObject2.optString("placeholderText", "");
        if (strOptString3.length() > 10) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("error_code", 1);
            jSONObject3.put("error_msg", "cancelText exceeds max length(10)");
            LJ(number, jSONObject3);
            return C1504590pFx.LIZ(1, null, "cancelText exceeds max length(10)", new JSONObject());
        }
        if (strOptString4.length() > 10) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("error_code", 1);
            jSONObject4.put("error_msg", "confirmText exceeds max length(10)");
            LJ(number, jSONObject4);
            return C1504590pFx.LIZ(1, null, "confirmText exceeds max length(10)", new JSONObject());
        }
        final Activity activity = this.LIZJ.get();
        if (activity == null) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("error_code", 2);
            jSONObject5.put("error_msg", "activity is null");
            LJ(number, jSONObject5);
            return C1504590pFx.LIZ(2, null, "activity is null", new JSONObject());
        }
        final String andSet = C1056730dbb.LIZ.getAndSet("modal");
        activity.runOnUiThread(new Runnable() { // from class: X.0mJK
            /* JADX WARN: Type inference failed for: r0v18, types: [T, X.0I7D] */
            public final void LIZ() throws JSONException {
                try {
                    if (Intrinsics.LJFF(andSet, "toast") || Intrinsics.LJFF(andSet, "loading")) {
                        try {
                            C1378370lyN.LIZ.getClass();
                            C1378370lyN.LIZ();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        C1056730dbb.LIZ();
                    }
                    Activity activity2 = activity;
                    C1397580mTM c1397580mTM = new C1397580mTM(activity2);
                    if (strOptString.length() > 0) {
                        c1397580mTM.LJI(strOptString);
                    }
                    if (strOptString2.length() > 0 && !zOptBoolean2) {
                        c1397580mTM.LIZIZ(strOptString2);
                    }
                    final C259800zU c259800zU = new C259800zU();
                    if (zOptBoolean2) {
                        String str = strOptString5;
                        if (str.length() == 0) {
                            str = null;
                        }
                        AwS71S1000000_21 awS71S1000000_21 = new AwS71S1000000_21(strOptString2, 5);
                        C1391410mJP c1391410mJP = new C1391410mJP(activity2);
                        if (str == null) {
                            str = "";
                        }
                        c1391410mJP.LIZLLL = str;
                        awS71S1000000_21.invoke(c1391410mJP);
                        c1397580mTM.LJIIJJI = c1391410mJP;
                    }
                    final C013C c013c = new C013C();
                    C985403tE.LIZ(c1397580mTM, new C1391400mJO(zOptBoolean, strOptString3, strOptString4, c013c, this, number, zOptBoolean2, c259800zU));
                    Dialog dialogLJ = new C1397510mTF(c1397580mTM).LJ();
                    final C1391380mJM c1391380mJM = this;
                    final Number number2 = number;
                    final boolean z = zOptBoolean2;
                    dialogLJ.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: X.0mJN
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) throws JSONException {
                            C0I7D c0i7d;
                            Editable editableLLLLJI;
                            String string;
                            C013C c013c2 = c013c;
                            if (!c013c2.element) {
                                c013c2.element = true;
                                JSONObject jSONObject6 = new JSONObject();
                                boolean z2 = z;
                                C259800zU<C0I7D> c259800zU2 = c259800zU;
                                jSONObject6.put("confirm", false);
                                jSONObject6.put("cancel", true);
                                String str2 = "";
                                if (z2 && (c0i7d = c259800zU2.element) != null && (editableLLLLJI = C2204961BRm.LLLLJI(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehbZbdkjh+wulnh3d1aWCvUEA1n+EiZbMuxg7SZJnVLF5MIwWWcg==", null))) != null && (string = editableLLLLJI.toString()) != null) {
                                    str2 = string;
                                }
                                jSONObject6.put("content", str2);
                                c1391380mJM.LJFF(number2, jSONObject6);
                            }
                        }
                    });
                    dialogLJ.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: X.0mJL
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            C1056730dbb.LIZIZ("modal");
                        }
                    });
                    if (zOptBoolean2) {
                        C1391380mJM c1391380mJM2 = this;
                        Window window = dialogLJ.getWindow();
                        View decorView = window != null ? window.getDecorView() : null;
                        c1391380mJM2.getClass();
                        c259800zU.element = C1391380mJM.LJII(decorView);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("error_code", 2);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("show modal failed: ");
                    sbLIZ.append(e2.getMessage());
                    jSONObject6.put("error_msg", C2188811AlT.LIZIZ(sbLIZ));
                    this.LJ(number, jSONObject6);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ShowModalMethodNative@ceff.handle$4");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ShowModalMethodNative@ceff.handle$4");
            }
        });
        return C1504590pFx.LIZJ(new JSONObject());
    }

    public C1391380mJM(WeakReference<Activity> weakReference, InterfaceC1177504j7 interfaceC1177504j7, boolean z) {
        super(interfaceC1177504j7);
        this.LIZJ = weakReference;
        this.LIZLLL = z;
    }
}
