package X;

import Y.ACListenerS164S0100000_30;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.zhihu.matisse.internal.entity.Item;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import jv6.a;

/* JADX INFO: renamed from: X.1475, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AnonymousClass1475 extends C19GS implements View.OnClickListener, InterfaceC469360Ias, C12ML {
    public C201963140r LLILLJJLI;
    public ViewPager LLILLL;
    public C12MK LLILZ;
    public C418950Gbl LLILZIL;
    public TextView LLILZLL;
    public TextView LLIZ;
    public TextView LLIZLLLIL;
    public LinearLayout LLJI;
    public C418960Gbm LLJIJIL;
    public boolean LLJILJIL;
    public FrameLayout LLJILJILJ;
    public FrameLayout LLJILLL;
    public final C201965140t LL = new C201965140t(this);
    public int LLJ = -1;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() throws Throwable {
        LLLLLZL(false);
        super.onBackPressed();
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.C12ML
    public final void LIZIZ() {
        this.LLILLJJLI.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLZI() {
        /*
            r6 = this;
            X.140t r0 = r6.LL
            java.util.Set<com.zhihu.matisse.internal.entity.Item> r0 = r0.LIZIZ
            int r5 = r0.size()
            r4 = 0
            r2 = 2131837073(0x7f114091, float:1.930733E38)
            if (r5 != 0) goto L25
            android.widget.TextView r0 = r6.LLIZ
            r0.setText(r2)
            android.widget.TextView r0 = r6.LLIZ
            r0.setEnabled(r4)
        L18:
            X.140r r0 = r6.LLILLJJLI
            r0.getClass()
            android.widget.LinearLayout r1 = r6.LLJI
            r0 = 8
            X.C786410Ut5.LJZL(r0, r1)
            return
        L25:
            r3 = 1
            if (r5 != r3) goto L3d
            X.140r r1 = r6.LLILLJJLI
            boolean r0 = r1.LJFF
            if (r0 != 0) goto L3d
            int r0 = r1.LJI
            if (r0 != r3) goto L3d
            android.widget.TextView r0 = r6.LLIZ
            r0.setText(r2)
            android.widget.TextView r0 = r6.LLIZ
            r0.setEnabled(r3)
            goto L18
        L3d:
            android.widget.TextView r0 = r6.LLIZ
            r0.setEnabled(r3)
            android.widget.TextView r2 = r6.LLIZ
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1[r4] = r0
            r0 = 2131837072(0x7f114090, float:1.9307329E38)
            java.lang.String r0 = r6.getString(r0, r1)
            r2.setText(r0)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1475.LLLLZI():void");
    }

    public final void LLLLLZL(boolean z) throws Throwable {
        Activity activity;
        Intent intent = new Intent();
        intent.putExtra("extra_result_bundle", this.LL.LIZJ());
        intent.putExtra("extra_result_apply", z);
        intent.putExtra("extra_result_original_enable", this.LLJILJIL);
        C0WZX c0wzx = new C0WZX("dzBzEhgyVsLJG1ogURuXdeTD7xn4Xw2VUneGADEF26n/hiTLsFYrdW529ztW36p8Mg==", null);
        C0WST c0wst = new C0WST();
        int iIntValue = -1;
        Object[] objArr = {-1, intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/zhihu/matisse/internal/ui/BasePreviewActivity", "setResult", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/zhihu/matisse/internal/ui/BasePreviewActivity", "setResult", null, objArr, this, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            } else {
                activity = this;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent = (Intent) obj3;
            }
        } else {
            activity = this;
        }
        activity.setResult(iIntValue, intent);
        c0wst.LIZ(11071, "com/zhihu/matisse/internal/ui/BasePreviewActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public final void LLLLZIL(Item item) {
        if (item.LIZ()) {
            C786410Ut5.LLIL(this.LLIZLLLIL, 0);
            TextView textView = this.LLIZLLLIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C1513670pUb.LIZ(item.size));
            sbLIZ.append("M");
            textView.setText(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            C786410Ut5.LLIL(this.LLIZLLLIL, 8);
        }
        if (item.LIZJ()) {
            C786410Ut5.LJZL(8, this.LLJI);
        } else {
            this.LLILLJJLI.getClass();
        }
    }

    @Override // X.C19GS, X.C19FO, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi(I18nServiceApi.class);
        if (i18nServiceApi != null && i18nServiceApi.LIZ() != null) {
            context = i18nServiceApi.LIZ().LIZJ(context);
        }
        a.install(context);
        super.attachBaseContext(context);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws Throwable {
        if (view.getId() == R.id.d72) {
            onBackPressed();
        } else {
            if (view.getId() != R.id.d6y) {
                return;
            }
            LLLLLZL(true);
            finish();
        }
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        Activity activity;
        C201963140r c201963140r = C20149313sh.LIZ;
        setTheme(c201963140r.LIZLLL);
        super.onCreate(bundle);
        int iIntValue = 0;
        if (!c201963140r.LJIIJ) {
            C0WZX c0wzx = new C0WZX("dzBzEhgyVsLJG1ogURuXdeTD7xn4Xw2VUneGADEF26n/hiTLsFYrdW529ztW36p8Mg==", null);
            C0WST c0wst = new C0WST();
            Object[] objArr = {0};
            C0WZW c0wzw = new C0WZW(false, "(I)V", c0wzx);
            C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/zhihu/matisse/internal/ui/BasePreviewActivity", "setResult", this, objArr, "void", c0wzw);
            if (c0wsuLIZIZ.LIZ) {
                c0wst.LIZ(11071, "com/zhihu/matisse/internal/ui/BasePreviewActivity", "setResult", null, objArr, this, c0wzw, false);
            } else {
                Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                if (objArr2 != null) {
                    Object obj = objArr2[0];
                    if (obj != null) {
                        activity = (Activity) obj;
                    } else {
                        activity = this;
                    }
                    Object obj2 = objArr2[1];
                    if (obj2 != null) {
                        iIntValue = ((Integer) obj2).intValue();
                    }
                } else {
                    activity = this;
                }
                activity.setResult(iIntValue);
                c0wst.LIZ(11071, "com/zhihu/matisse/internal/ui/BasePreviewActivity", "setResult", null, objArr, activity, c0wzw, true);
            }
            finish();
            return;
        }
        setContentView(R.layout.j_);
        getWindow().addFlags(67108864);
        this.LLILLJJLI = c201963140r;
        int i = c201963140r.LJ;
        if (i != -1) {
            setRequestedOrientation(i);
        }
        if (bundle == null) {
            this.LL.LJFF(C786410Ut5.g3(getIntent(), "extra_default_bundle"));
            this.LLJILJIL = getIntent().getBooleanExtra("extra_result_original_enable", false);
        } else {
            this.LL.LJFF(bundle);
            this.LLJILJIL = bundle.getBoolean("checkState");
        }
        this.LLILZLL = (TextView) findViewById(R.id.d72);
        this.LLIZ = (TextView) findViewById(R.id.d6y);
        this.LLIZLLLIL = (TextView) findViewById(R.id.vd9);
        C786410Ut5.T7(this.LLILZLL, this);
        C786410Ut5.T7(this.LLIZ, this);
        ViewPager viewPager = (ViewPager) findViewById(R.id.pyp);
        this.LLILLL = viewPager;
        viewPager.addOnPageChangeListener(this);
        C12MK c12mk = new C12MK(getSupportFragmentManager());
        this.LLILZ = c12mk;
        this.LLILLL.setAdapter(c12mk);
        C418950Gbl c418950Gbl = (C418950Gbl) findViewById(R.id.dqj);
        this.LLILZIL = c418950Gbl;
        c418950Gbl.setCountable(this.LLILLJJLI.LJFF);
        this.LLJILJILJ = (FrameLayout) findViewById(R.id.chp);
        this.LLJILLL = (FrameLayout) findViewById(R.id.ye4);
        C786410Ut5.Va(this.LLILZIL, new ACListenerS164S0100000_30(this, 34));
        this.LLJI = (LinearLayout) findViewById(R.id.ptl);
        this.LLJIJIL = (C418960Gbm) findViewById(R.id.ptk);
        C786410Ut5.R7(this.LLJI, new ACListenerS164S0100000_30(this, 35));
        LLLLZI();
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        C12MK c12mk = (C12MK) this.LLILLL.getAdapter();
        int i2 = this.LLJ;
        if (i2 != -1 && i2 != i) {
            Fragment fragment = (Fragment) c12mk.LJJI(i2, this.LLILLL);
            if (fragment.getView() != null) {
                C12MM c12mm = (C12MM) fragment.getView().findViewById(R.id.kfa);
                c12mm.getClass();
                c12mm.LLILLL = new Matrix();
                float fLJ = c12mm.LJ(c12mm.LLJJIII);
                c12mm.setImageMatrix(c12mm.getImageViewMatrix());
                if (fLJ != c12mm.getScale()) {
                    c12mm.LJIIL(fLJ);
                }
                c12mm.postInvalidate();
            }
            Item item = (Item) ListProtector.get(c12mk.LLIZ, i);
            if (this.LLILLJJLI.LJFF) {
                int iLIZIZ = this.LL.LIZIZ(item);
                this.LLILZIL.setCheckedNum(iLIZIZ);
                if (iLIZIZ > 0) {
                    this.LLILZIL.setEnabled(true);
                } else {
                    this.LLILZIL.setEnabled(true ^ this.LL.LJ());
                }
            } else {
                boolean zContains = this.LL.LIZIZ.contains(item);
                this.LLILZIL.setChecked(zContains);
                if (zContains) {
                    this.LLILZIL.setEnabled(true);
                } else {
                    this.LLILZIL.setEnabled(true ^ this.LL.LJ());
                }
            }
            LLLLZIL(item);
        }
        this.LLJ = i;
    }

    @Override // androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C201965140t c201965140t = this.LL;
        c201965140t.getClass();
        C786410Ut5.LJJIL(bundle, "state_selection", new ArrayList(c201965140t.LIZIZ));
        bundle.putInt("state_collection_type", c201965140t.LIZJ);
        bundle.putBoolean("checkState", this.LLJILJIL);
        super.onSaveInstanceState(bundle);
    }
}
