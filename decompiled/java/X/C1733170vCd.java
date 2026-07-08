package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.billboard.model.SeaLiveBillboard;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vCd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1733170vCd extends FrameLayout {
    public List<SeaLiveBillboard> LL;
    public Map<String, ? extends Object> LLILLJJLI;
    public long LLILLL;
    public boolean LLILZ;
    public final ViewGroup LLILZIL;
    public final View LLILZLL;
    public C1760360vuU LLIZ;
    public C054G LLIZLLLIL;
    public boolean LLJ;
    public ISeaLiveContextAbility LLJI;

    public final void LIZIZ() {
        try {
            ViewGroup viewGroup = this.LLILZIL;
            if (viewGroup != null) {
                C1760360vuU c1760360vuU = this.LLIZ;
                C786410Ut5.LJJJLZIJ(c1760360vuU != null ? c1760360vuU.getView() : null, viewGroup);
            }
            C1760360vuU c1760360vuU2 = this.LLIZ;
            if (c1760360vuU2 != null) {
                c1760360vuU2.LLD(true);
            }
            this.LLIZ = null;
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C2296808zG.LIZJ(this.LLIZLLLIL, null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (C2296808zG.LJI(this.LLIZLLLIL)) {
            return;
        }
        this.LLIZLLLIL = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C2126308Ur.LJFF));
    }

    public final List<SeaLiveBillboard> getCurrentBillboards() {
        return this.LL;
    }

    public final Map<String, Object> getCurrentDaInfo() {
        return this.LLILLJJLI;
    }

    public final long getShowTime() {
        return this.LLILLL;
    }

    public C1733170vCd(Context context) {
        super(context);
        this.LLIZLLLIL = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C2126308Ur.LJFF));
        C786410Ut5.Sd(R.layout.bw_, C786410Ut5.ne(context).cloneInContext(new ContextThemeWrapper(context, R.style.acp)), this);
        this.LLILZIL = (ViewGroup) findViewById(R.id.c0v);
        this.LLILZLL = findViewById(R.id.c18);
        setId(R.id.c0w);
    }

    public static void LJ(C1733200vCg c1733200vCg) {
        if (c1733200vCg != null) {
            C1729260v6K.LIZ("billboard_on_screen", null, c1733200vCg.LIZIZ, c1733200vCg.LIZ, c1733200vCg.LIZJ, c1733200vCg.LIZLLL, c1733200vCg.LJI, c1733200vCg.LJFF, c1733200vCg.LJ, 258);
        }
    }

    public final void LIZ(View view) {
        if (view != null && !Intrinsics.LJFF(view.getParent(), this.LLILZIL)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            ViewGroup viewGroup = this.LLILZIL;
            if (viewGroup != null) {
                viewGroup.addView(view, layoutParams);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0027  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.ViewGroup r0 = r5.LLILZIL
            if (r0 == 0) goto L14
            int r1 = r6.getActionMasked()
            r4 = 0
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 == r3) goto L27
            r0 = 2
            if (r1 == r0) goto L19
            r0 = 3
            if (r1 == r0) goto L27
        L14:
            boolean r0 = super.dispatchTouchEvent(r6)
            return r0
        L19:
            boolean r0 = r5.LLJ
            if (r0 == 0) goto L14
            android.view.ViewParent r0 = r5.getParent()
            if (r0 == 0) goto L14
            r0.requestDisallowInterceptTouchEvent(r3)
            goto L14
        L27:
            boolean r0 = r5.LLJ
            if (r0 == 0) goto L14
            android.view.ViewParent r0 = r5.getParent()
            if (r0 == 0) goto L34
            r0.requestDisallowInterceptTouchEvent(r4)
        L34:
            r5.LLJ = r4
            goto L14
        L37:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            boolean r0 = r0.getGlobalVisibleRect(r2)
            if (r0 == 0) goto L53
            float r0 = r6.getRawX()
            int r1 = (int) r0
            float r0 = r6.getRawY()
            int r0 = (int) r0
            boolean r0 = r2.contains(r1, r0)
            if (r0 == 0) goto L53
            r4 = 1
        L53:
            r5.LLJ = r4
            if (r4 == 0) goto L14
            android.view.ViewParent r0 = r5.getParent()
            if (r0 == 0) goto L14
            r0.requestDisallowInterceptTouchEvent(r3)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1733170vCd.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setContextAbility(ISeaLiveContextAbility iSeaLiveContextAbility) {
        InterfaceC599740Nfg interfaceC599740NfgSU1;
        this.LLJI = iSeaLiveContextAbility;
        if (iSeaLiveContextAbility != null && (interfaceC599740NfgSU1 = iSeaLiveContextAbility.SU1()) != null && Intrinsics.LJFF(interfaceC599740NfgSU1.LIZIZ(Scene.SCENE_SERVICE, EnumC599400Nf8.NATIVE, C2097608Jq.LJ()), 0)) {
            View view = this.LLILZLL;
            if (view != null) {
                C03DZ.LIZJ(view);
                return;
            }
            return;
        }
        View view2 = this.LLILZLL;
        if (view2 == null) {
            return;
        }
        C0H1U.LIZIZ(view2);
    }

    public final void setCurrentBillboards(List<SeaLiveBillboard> list) {
        this.LL = list;
    }

    public final void setCurrentDaInfo(Map<String, ? extends Object> map) {
        this.LLILLJJLI = map;
    }

    public final void setShowTime(long j) {
        this.LLILLL = j;
    }

    public static String LIZJ(Integer num, Object obj) {
        C1733250vCl c1733250vCl = new Object() { // from class: X.0vCl
        };
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("type", num));
        c1733250vCl.getClass();
        if (obj != null) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (obj instanceof String) {
                    linkedHashMap.put("data", obj);
                } else {
                    linkedHashMap.put("data", C1741890vQh.LJIIIIZZ(obj));
                }
                if (mapLIZJ != null) {
                    for (Map.Entry entry : mapLIZJ.entrySet()) {
                        String str = (String) entry.getKey();
                        Object value = entry.getValue();
                        if (value != null) {
                            linkedHashMap.put(str, value);
                        }
                    }
                }
                return C1741890vQh.LJIIIIZZ(linkedHashMap);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Object c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                Object obj2 = (Void) c098200Yq;
                if (obj2 != null) {
                    return (String) obj2;
                }
                return "{}";
            }
        }
        return "{}";
    }

    public static void LJFF(C1733200vCg c1733200vCg, String str) {
        if (c1733200vCg != null) {
            C1729260v6K.LIZ("billboard_show_fail", str, c1733200vCg.LIZIZ, c1733200vCg.LIZ, c1733200vCg.LIZJ, c1733200vCg.LIZLLL, c1733200vCg.LJI, c1733200vCg.LJFF, c1733200vCg.LJ, 256);
        }
    }

    public final void LIZLLL(int i, EnumC1732850vC7 enumC1732850vC7, Object obj, C1733200vCg c1733200vCg, Integer num, InterfaceC1732650vBn interfaceC1732650vBn) {
        boolean z;
        if (!C2296808zG.LJI(this.LLIZLLLIL)) {
            LJFF(c1733200vCg, "scope is not active");
            if (interfaceC1732650vBn != null) {
                interfaceC1732650vBn.LIZ("scope is not active");
                return;
            }
            return;
        }
        if (obj != null && (num != null ? num.intValue() != 3 : i > 0)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C23250099c.LIZLLL(this.LLIZLLLIL, null, null, new C1733190vCf(this, LIZJ(Integer.valueOf(enumC1732850vC7.getValue()), obj), c1733200vCg, interfaceC1732650vBn, null), 3);
        } else if (this.LLIZ != null) {
            C23250099c.LIZLLL(this.LLIZLLLIL, null, null, new C1732880vCA(num, this, enumC1732850vC7, obj, interfaceC1732650vBn, null), 3);
        } else {
            if (interfaceC1732650vBn == null) {
                return;
            }
            interfaceC1732650vBn.onSuccess();
        }
    }
}
