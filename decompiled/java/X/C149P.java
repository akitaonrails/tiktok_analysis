package X;

import Y.AUListenerS215S0200000_4;
import Y.AUListenerS268S0100000_19;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.149P, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C149P extends C202164148k {
    public final /* synthetic */ C14AD LIZ;

    public C149P(C14AD c14ad) {
        this.LIZ = c14ad;
    }

    @Override // X.C202164148k
    public final void LIZJ(C148Q c148q) {
        String simpleName;
        String str = c148q.LIZJ;
        if (this.LIZ.LLJJJJLIIL.getActivity() != null) {
            simpleName = this.LIZ.LLJJJJLIIL.getActivity().getClass().getSimpleName();
        } else {
            simpleName = "";
        }
        int i = c148q.LIZIZ;
        String str2 = AnonymousClass1490.LJJIIJ;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", i);
            jSONObject.put("key", "native_request");
            jSONObject.put("custom", str);
            jSONObject.put("product_path_mobile", simpleName);
            jSONObject.put("native_response_message", str);
            String str3 = C202179148z.LIZIZ;
            if (str3 != null && !str3.isEmpty()) {
                if (str2 != null && !str2.isEmpty()) {
                    C202179148z.LIZIZ = str2;
                }
            } else {
                C202179148z.LIZIZ = str2;
            }
            C202179148z.LIZJ("turing_verify_sdk", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20221514Aj.LIZIZ();
        }
    }

    @Override // X.C202164148k
    public final void LIZLLL(int i, int i2) {
        final View view;
        int i3;
        int i4;
        C14B7 c14b7;
        final int iRound = i2;
        final int iRound2 = i;
        final C14AD c14ad = this.LIZ;
        c14ad.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeDialog width = ");
        sbLIZ.append(iRound2);
        sbLIZ.append(", height = ");
        sbLIZ.append(iRound);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!c14ad.LLJJI && c14ad.isShowing()) {
            if (c14ad.LLJJJJLIIL.getFullscreen()) {
                iRound2 = -1;
                iRound = -1;
            } else if (iRound2 > 0 && iRound > 0) {
                float fLJFF = C148N.LJFF(c14ad.LLJIJIL);
                iRound2 = Math.round(iRound2 * fLJFF);
                iRound = Math.round(fLJFF * iRound);
            }
            if ((c14ad.LLIZ && (view = c14ad.LLILZ) != null) || (view = c14ad.LLILLL) != null) {
                final ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (c14ad.LLJJIII && (i3 = layoutParams.width) > 0 && (i4 = layoutParams.height) > 0) {
                    if (!c14ad.LLIZ && (c14b7 = c14ad.LLILLL) != null) {
                        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new TypeEvaluator<int[]>() { // from class: X.07mA
                            @Override // android.animation.TypeEvaluator
                            public final int[] evaluate(float f, int[] iArr, int[] iArr2) {
                                int[] iArr3 = iArr;
                                int[] iArr4 = iArr2;
                                int length = iArr3.length;
                                int[] iArr5 = new int[length];
                                for (int i5 = 0; i5 < length; i5++) {
                                    iArr5[i5] = (int) (iArr3[i5] + ((iArr4[i5] - r2) * f));
                                }
                                return iArr5;
                            }
                        }, new int[]{i3, i4}, new int[]{iRound2, iRound});
                        valueAnimatorOfObject.addUpdateListener(new AUListenerS268S0100000_19(c14b7, 17));
                        valueAnimatorOfObject.setDuration(300L).start();
                    }
                    c14ad.LLJJIII = false;
                    return;
                }
                HandlerHook.viewPost(view, new Runnable() { // from class: X.14AE
                    public final void LIZ() {
                        C14AD c14ad2 = c14ad;
                        if (c14ad2.LLJJI) {
                            return;
                        }
                        if (c14ad2.LLJJJJLIIL.getLoading()) {
                            c14ad2.LLILLJJLI.clearAnimation();
                            C786410Ut5.LJZI(8, c14ad2.LLILLJJLI);
                        }
                        if (c14ad2.LLJJJJLIIL.getMask()) {
                            c14ad2.LLJILJIL.setBackgroundColor(-2013265920);
                        }
                        C786410Ut5.LJLLLLLL(0, view);
                        CardView cardView = c14ad.LLJILJILJ;
                        if (cardView != null) {
                            C786410Ut5.LLILLL(cardView, 0);
                        }
                        if (view instanceof C14B7) {
                            ViewGroup.LayoutParams layoutParams2 = layoutParams;
                            layoutParams2.width = iRound2;
                            layoutParams2.height = iRound;
                            C786410Ut5.W5(view, layoutParams);
                        } else {
                            C14AD c14ad3 = c14ad;
                            View view2 = view;
                            ViewGroup.LayoutParams layoutParams3 = layoutParams;
                            int i5 = iRound2;
                            int i6 = iRound;
                            c14ad3.getClass();
                            if (view2 != null && layoutParams3 != null) {
                                int i7 = layoutParams3.width;
                                int i8 = layoutParams3.height;
                                if (i7 == i5 && i8 == i6) {
                                    C786410Ut5.W5(view2, layoutParams3);
                                } else {
                                    ValueAnimator valueAnimatorOfObject2 = ValueAnimator.ofObject(new TypeEvaluator<int[]>() { // from class: X.07m9
                                        @Override // android.animation.TypeEvaluator
                                        public final int[] evaluate(float f, int[] iArr, int[] iArr2) {
                                            int[] iArr3 = iArr;
                                            int[] iArr4 = iArr2;
                                            int length = iArr3.length;
                                            int[] iArr5 = new int[length];
                                            for (int i9 = 0; i9 < length; i9++) {
                                                iArr5[i9] = (int) (iArr3[i9] + ((iArr4[i9] - r2) * f));
                                            }
                                            return iArr5;
                                        }
                                    }, new int[]{i7, i8}, new int[]{i5, i6});
                                    valueAnimatorOfObject2.addUpdateListener(new AUListenerS215S0200000_4(layoutParams3, view2, 2));
                                    valueAnimatorOfObject2.setDuration(300L).start();
                                }
                            }
                        }
                        C14AD c14ad4 = c14ad;
                        if (!c14ad4.LLIZ) {
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c14ad4.LLILZ;
                            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                                C786410Ut5.LLLLIIIILLL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, 8);
                                return;
                            }
                            return;
                        }
                        C14B7 c14b72 = c14ad4.LLILLL;
                        if (c14b72 != null) {
                            int visibility = c14b72.getVisibility();
                            c14b72.setVisibility(8);
                            C1602160rnK.LIZIZ(visibility, 8, c14b72);
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("VerifyDialog@5704.changeDialog$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("VerifyDialog@5704.changeDialog$1");
                    }
                });
            }
        }
    }

    @Override // X.C202164148k
    public final void LJ(int i, String str, String str2) {
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", System.currentTimeMillis() - C202179148z.LIZ);
            jSONObject.put("result", i);
            jSONObject.put("key", "result");
            C202179148z.LIZJ("turing_verify_sdk", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20221514Aj.LIZIZ();
        }
        InterfaceC202160148g interfaceC202160148g = this.LIZ.LLJJIJIIJIL;
        if (interfaceC202160148g != null) {
            if (z) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("token", str);
                    jSONObject2.put("mobile", str2);
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C20221514Aj.LIZIZ();
                }
                this.LIZ.LLJJIJIIJIL.onSuccess(i, jSONObject2);
            } else {
                interfaceC202160148g.onFail(i);
            }
            this.LIZ.LLJJIJIIJIL = null;
        }
        C14AD c14ad = this.LIZ;
        c14ad.LLJJ = true;
        c14ad.dismiss();
        C785410UrT.LIZ(c14ad);
    }
}
