package X;

import X.C1315710kLJ;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import com.bytedance.sdui.render.tasm.behavior.ui.utils.BackgroundDrawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import j27.s;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0kKu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1315460kKu<T extends C1315710kLJ> extends AbstractC1315830kLV<T> {
    public C1320810kTX LLLLLLLZIL;
    public int LLLLLLZ;
    public int LLLLLLZZ;
    public boolean LLLLLZ;
    public String LLLLLZIL;
    public String LLLLLZL;
    public boolean LLLLZ;
    public boolean LLLLZI;
    public boolean LLLLZIL;
    public int LLLLZLL;
    public boolean LLLLZLLIL;
    public C1315560kL4 LLLLZLLLI;
    public boolean LLLZ;

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJJLIIIJILLIZJL(int i) {
    }

    @Override // X.AbstractC1313520kHm, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final int LJII() {
        int iIntValue;
        boolean z;
        int iIntValue2 = 0;
        if (!TextUtils.isEmpty(((C1315710kLJ) this.LLLLLILLIL).getSrc())) {
            try {
                Field declaredField = ((C1315710kLJ) this.LLLLLILLIL).getClass().getDeclaredField("mSourceImageHeight");
                Field declaredField2 = ((C1315710kLJ) this.LLLLLILLIL).getClass().getDeclaredField("mSourceImageWidth");
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                iIntValue = ((Integer) declaredField.get(this.LLLLLILLIL)).intValue();
                try {
                    iIntValue2 = ((Integer) declaredField2.get(this.LLLLLILLIL)).intValue();
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Exception e2) {
                e = e2;
                iIntValue = 0;
            }
            return (iIntValue <= 0 || iIntValue2 <= 0) ? SDUIBaseUI.LLLLLIL : SDUIBaseUI.LLLLL;
        }
        BackgroundDrawable backgroundDrawable = this.LLJ.LIZIZ;
        if (backgroundDrawable != null) {
            C1315480kKw c1315480kKw = new C1315480kKw();
            C1314460kJI c1314460kJI = new C1314460kJI(backgroundDrawable);
            synchronized (c1315480kKw) {
                try {
                    c1314460kJI.LIZ(c1315480kKw);
                    z = c1315480kKw.LIZ;
                    c1315480kKw.LIZ = false;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (!(!z)) {
                return SDUIBaseUI.LLLLL;
            }
        }
        return 0;
    }

    public final void LJLL() {
        if (!this.LLLZ || this.LLLLZLL == 0) {
            ((C1315710kLJ) this.LLLLLILLIL).maybeUpdateView();
        } else {
            this.LLLLZLLIL = true;
        }
    }

    @Override // X.AbstractC1313520kHm, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJIIJ() {
        super.LJIIJ();
        ((C1315710kLJ) this.LLLLLILLIL).destroy();
    }

    @Override // X.AbstractC1313520kHm, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJJLIIIJJI() {
        super.LJJLIIIJJI();
        ((C1315710kLJ) this.LLLLLILLIL).destroy();
    }

    @Override // X.AbstractC1313520kHm, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJJLIIIJJIZ() {
        T t;
        HashMap<String, C1313530kHn> map;
        super.LJJLIIIJJIZ();
        int i = this.LLJJJJJIL + this.LLJLLL;
        int i2 = this.LLJJJJLIIL + this.LLJZ;
        int i3 = this.LLJJL + this.LLJLLIL;
        int i4 = this.LLJJLIIIJLLLLLLLZ + this.LLJZIJLIL;
        if (this.LLLLLLZZ < this.LLJJJIL || this.LLLLLLZ < this.LLJJJJ) {
            C1313700kI4 c1313700kI4 = this.LLLLLL;
            if (c1313700kI4 == null || (map = c1313700kI4.LIZJ) == null) {
                if ((this.LLLLLLJ != null || !(!r0.LJII.isEmpty())) && ((t = this.LLLLLILLIL) == 0 || t.getAnimation() == null)) {
                    ((C1315710kLJ) this.LLLLLILLIL).markDirty();
                }
            } else {
                Iterator<C1313530kHn> it2 = map.values().iterator();
                while (it2.hasNext()) {
                    if (it2.next().LJII == EnumC1313870kIL.RUNNING) {
                        break;
                    }
                }
                if (this.LLLLLLJ != null) {
                    ((C1315710kLJ) this.LLLLLILLIL).markDirty();
                } else {
                    ((C1315710kLJ) this.LLLLLILLIL).markDirty();
                }
            }
        }
        this.LLLLLILLIL.setPadding(i, i3, i2, i4);
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJJLIIIJL() {
        super.LJJLIIIJL();
        if (!this.LLLLZIL && this.LLLLZI && this.LLLLZ) {
            ((C1315710kLJ) this.LLLLLILLIL).setRedirectImageSource(this.LLLLLZIL, this.LLLLLZL);
            this.LLLLLILLIL.invalidate();
            this.LLLLZ = false;
            this.LLLLZI = false;
        }
        if (this.LLLLZ) {
            if (this.LLLLZIL) {
                ((C1315710kLJ) this.LLLLLILLIL).setSrcSkippingRedirection(this.LLLLLZIL);
            } else {
                ((C1315710kLJ) this.LLLLLILLIL).setSrc(this.LLLLLZIL);
                this.LLLLLILLIL.invalidate();
            }
            this.LLLLZ = false;
        }
        if (this.LLLLZI) {
            this.LLLLZI = false;
            ((C1315710kLJ) this.LLLLLILLIL).setPlaceholder(this.LLLLLZL, !this.LLLLZIL);
        }
        LJLL();
    }

    public C1315460kKu(AbstractC1317090kNX abstractC1317090kNX) {
        super(abstractC1317090kNX);
    }

    @Override // X.AbstractC1313520kHm
    public final View LJLJJL(Context context) {
        this.LLLLLLLZIL = C1322200kVm.LIZJ();
        final DisplayMetrics displayMetrics = new DisplayMetrics();
        final AbstractC1317090kNX abstractC1317090kNX = (AbstractC1317090kNX) context;
        s sVar = new s(abstractC1317090kNX, displayMetrics) { // from class: X.0k0o
            @Override // j27.s
            public final boolean LJIJ() {
                return false;
            }

            @Override // j27.s, X.InterfaceC1298330jtH
            public final void handleException(Exception exc) {
            }

            @Override // android.content.ContextWrapper
            public final void attachBaseContext(Context context2) {
                if (NxRewordManager.LJIILIIL) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("attachBaseContextWrapper: ");
                    sbLIZ.append(Log.getStackTraceString(new Throwable(context2.toString())));
                    C2188811AlT.LIZIZ(sbLIZ);
                    context2 = new C817700W5w(context2, false);
                }
                super.attachBaseContext(context2);
            }
        };
        sVar.LJJIIJ(null);
        C1320810kTX c1320810kTX = this.LLLLLLLZIL;
        this.LLILZ.getClass();
        C1315710kLJ c1315710kLJ = new C1315710kLJ(sVar, c1320810kTX, null, null);
        c1315710kLJ.setNoSubSampleMode(this.LLLLLZ);
        c1315710kLJ.setImageLoaderCallback(new C1315960kLi() { // from class: X.0jwJ
            @Override // X.C1315960kLi
            public final boolean LIZ() {
                return this.LIZ.LLLLZLLIL;
            }

            @Override // X.C1315960kLi
            public final void LIZIZ(int i, int i2) {
                C1315460kKu c1315460kKu = this.LIZ;
                c1315460kKu.LLLLLLZZ = i;
                c1315460kKu.LLLLLLZ = i2;
            }

            @Override // X.C1315960kLi
            public final void LJ(int i, int i2) {
                Map<String, C1297940jse> map = this.LIZ.LLJIJIL;
                if (map != null && map.containsKey("load")) {
                    C1294240jmg c1294240jmg = new C1294240jmg(this.LIZ.LLJJ, "load");
                    c1294240jmg.LIZJ(Integer.valueOf(i2), "height");
                    c1294240jmg.LIZJ(Integer.valueOf(i), "width");
                    this.LIZ.LLILZ.LLILLL.LIZJ(c1294240jmg);
                }
            }

            @Override // X.C1315960kLi
            public final void LIZJ(int i, int i2, String str) {
                C1294240jmg c1294240jmg = new C1294240jmg(this.LIZ.LLJJ, "error");
                c1294240jmg.LIZJ(str, "errMsg");
                c1294240jmg.LIZJ(Integer.valueOf(i), "sdui_categorized_code");
                c1294240jmg.LIZJ(Integer.valueOf(i2), "error_code");
                this.LIZ.LLILZ.LLILLL.LIZJ(c1294240jmg);
                C1315460kKu c1315460kKu = this.LIZ;
                C1298420jtQ c1298420jtQ = c1315460kKu.LLILZ.LLILLL;
                int i3 = c1315460kKu.LLJJ;
                C1312690kGR c1312690kGR = c1298420jtQ.LIZ;
                if (c1312690kGR != null && c1312690kGR.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("SendInternalEvent: id ");
                    sbLIZ.append(0);
                    sbLIZ.append(" tag: ");
                    sbLIZ.append(i3);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                this.LIZ.LLILZ.LLIZLLLIL.LJII(new C1291190jhl(201, str));
            }
        });
        c1315710kLJ.setImageRedirectListener(new InterfaceC1316380kMO() { // from class: X.0kL9
            @Override // X.InterfaceC1316380kMO
            public final void LIZ() {
                this.LIZ.LJLL();
            }
        });
        return c1315710kLJ;
    }

    @InterfaceC1291270jht(name = "fix-fresco-bug")
    public void fixFrescoWebPBug(boolean z) {
        T t = this.LLLLLILLIL;
        if (t != 0) {
            ((C1315710kLJ) t).fixFrescoWebPBug(z);
        }
    }

    @Override // X.AbstractC1315830kLV
    public final void setAutoSize(boolean z) {
        T t = this.LLLLLILLIL;
        if (t != 0) {
            ((C1315710kLJ) t).setAutoSize(z);
        }
    }

    @Override // X.AbstractC1315830kLV
    public final void setBlurRadius(String str) {
        AbstractC1317090kNX abstractC1317090kNX = this.LLILZ;
        ((C1315710kLJ) this.LLLLLILLIL).setBlurRadius(Math.round(C1312930kGp.LIZIZ(str, abstractC1317090kNX.LLILZIL.LLL, this.LLL, r2.LLJJJIL, r2.LLJJJJ, 0.0f, abstractC1317090kNX.LLJ)));
    }

    @Override // X.AbstractC1315830kLV
    public final void setCapInsets(String str) {
        if (str != null && !str.equalsIgnoreCase("")) {
            ((C1315710kLJ) this.LLLLLILLIL).setCapInsets(str);
        } else {
            ((C1315710kLJ) this.LLLLLILLIL).setCapInsets(null);
        }
    }

    @Override // X.AbstractC1315830kLV
    @InterfaceC1291270jht(name = "cap-insets")
    public void setCapInsetsBackUp(String str) {
        setCapInsets(str);
    }

    @Override // X.AbstractC1315830kLV
    @InterfaceC1291270jht(name = "cap-insets-scale")
    public void setCapInsetsScale(String str) {
        if (str != null && !str.equalsIgnoreCase("")) {
            ((C1315710kLJ) this.LLLLLILLIL).setCapInsetsScale(str);
        } else {
            ((C1315710kLJ) this.LLLLLILLIL).setCapInsetsScale(null);
        }
    }

    @Override // X.AbstractC1315830kLV
    public final void setCoverStart(boolean z) {
        ((C1315710kLJ) this.LLLLLILLIL).setCoverStart(z);
    }

    @InterfaceC1291270jht(defaultBoolean = false, name = "defer-src-invalidation")
    public void setDeferInvalidation(boolean z) {
        ((C1315710kLJ) this.LLLLLILLIL).setDeferInvalidation(z);
    }

    @Override // X.AbstractC1315830kLV
    public final void setDisableDefaultPlaceholder(boolean z) {
        T t = this.LLLLLILLIL;
        if (t != 0) {
            ((C1315710kLJ) t).setDisableDefaultPlaceHolder(z);
        }
    }

    @Override // X.AbstractC1315830kLV
    public final void setDisableDefaultResize(boolean z) {
        T t = this.LLLLLILLIL;
        if (t == 0) {
            return;
        }
        if (z) {
            ((C1315710kLJ) t).setResizeMethod(EnumC1316020kLo.SCALE);
        } else {
            ((C1315710kLJ) t).setResizeMethod(EnumC1316020kLo.RESIZE);
        }
    }

    @InterfaceC1291270jht(name = "fresco-attach")
    public void setFrescoAttach(String str) {
        if (str != null) {
            if (str.equalsIgnoreCase("true") || str.equalsIgnoreCase("yes")) {
                T t = this.LLLLLILLIL;
                ((C1315710kLJ) t).mIsFrescoAttach = true;
                ((C1315710kLJ) t).setFrescoAttach();
            }
        }
    }

    @InterfaceC1291270jht(defaultBoolean = false, name = "fresco-nine-patch")
    public void setFrescoNinePatch(boolean z) {
        T t = this.LLLLLILLIL;
        if (t != 0) {
            ((C1315710kLJ) t).setFrescoNinePatch(z);
        }
    }

    @InterfaceC1291270jht(name = "fresco-visible")
    public void setFrescoVisible(String str) {
        if (str != null) {
            if (str.equalsIgnoreCase("true") || str.equalsIgnoreCase("yes")) {
                T t = this.LLLLLILLIL;
                ((C1315710kLJ) t).mIsFrescoVisible = true;
                ((C1315710kLJ) t).setFrescoVisible();
            }
        }
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    @InterfaceC1291270jht(name = "image-config")
    public void setImageConfig(String str) {
        super.setImageConfig(str);
        ((C1315710kLJ) this.LLLLLILLIL).setBitmapConfig(this.LLLJIL);
        LJJJJZ();
    }

    @Override // X.AbstractC1315830kLV
    public final void setLoopCount(int i) {
        if (i <= 0) {
            i = 0;
        }
        ((C1315710kLJ) this.LLLLLILLIL).setLoopCount(i);
    }

    @Override // X.AbstractC1315830kLV
    public final void setObjectFit(String str) {
        ((C1315710kLJ) this.LLLLLILLIL).setScaleType(C1316130kLz.LIZIZ(str));
    }

    @Override // X.AbstractC1315830kLV
    public final void setPlaceholder(String str) {
        this.LLLLZI = true;
        this.LLLLLZL = str;
    }

    @Override // X.AbstractC1315830kLV
    public final void setPreFetchHeight(String str) {
        ((C1315710kLJ) this.LLLLLILLIL).setPreFetchHeight(C1312930kGp.LIZIZ(str, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, this.LLILZ.LLJ));
    }

    @Override // X.AbstractC1315830kLV
    public final void setPreFetchWidth(String str) {
        ((C1315710kLJ) this.LLLLLILLIL).setPreFetchWidth(C1312930kGp.LIZIZ(str, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, this.LLILZ.LLJ));
    }

    @Override // X.AbstractC1315830kLV
    public final void setRepeat(boolean z) {
        ((C1315710kLJ) this.LLLLLILLIL).setRepeat(z);
    }

    @InterfaceC1291270jht(defaultBoolean = false, name = "skip-redirection")
    public void setSkipRedirection(boolean z) {
        this.LLLLZIL = z;
    }

    @Override // X.AbstractC1315830kLV
    public final void setSource(String str) {
        this.LLLLLZIL = str;
        this.LLLLZ = true;
    }

    @InterfaceC1291270jht(name = "subsample")
    public void setSubSample(String str) {
        if (str != null && (str.equalsIgnoreCase("false") || str.equalsIgnoreCase("no"))) {
            this.LLLLLZ = true;
        } else {
            this.LLLLLZ = false;
        }
        T t = this.LLLLLILLIL;
        if (t != 0) {
            ((C1315710kLJ) t).setNoSubSampleMode(this.LLLLLZ);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0kL4] */
    @InterfaceC1291270jht(name = "suspendable")
    public void setSuspendable(InterfaceC1314540kJQ interfaceC1314540kJQ) {
        this.LLLZ = false;
        if (interfaceC1314540kJQ != null) {
            int i = C1297900jsa.LIZ[interfaceC1314540kJQ.getType().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.LLLZ = TextUtils.equals("true", interfaceC1314540kJQ.asString());
                }
            } else {
                this.LLLZ = interfaceC1314540kJQ.asBoolean();
            }
        }
        if (!this.LLLZ) {
            LJLI(this.LLLLZLLLI);
            return;
        }
        if (this.LLLLZLLLI == null) {
            this.LLLLZLLLI = new InterfaceC1314820kJs() { // from class: X.0kL4
                @Override // X.InterfaceC1314820kJs
                public final void LIZ(int i2) {
                    C1315460kKu c1315460kKu = this.LIZ;
                    c1315460kKu.LLLLZLL = i2;
                    if (c1315460kKu.LLLLZLLIL && i2 == 0) {
                        c1315460kKu.LLLLZLLIL = false;
                        c1315460kKu.LJLL();
                    }
                }
            };
        }
        LJJLIIIJLLLLLLLZ(this.LLLLZLLLI);
    }

    @Override // X.AbstractC1313520kHm
    @InterfaceC1291270jht(name = "visibility")
    public void setVisibility(int i) {
        super.setVisibility(i);
        T t = this.LLLLLILLIL;
        if (((C1315710kLJ) t).mIsFrescoVisible) {
            ((C1315710kLJ) t).setFrescoVisible();
        }
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJJLIIIJ(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 > this.LLLLLLZZ || i4 > this.LLLLLLZ) {
            ((C1315710kLJ) this.LLLLLILLIL).tryFetchImage(i3, i4, i5, i6, i7, i8);
        }
    }
}
