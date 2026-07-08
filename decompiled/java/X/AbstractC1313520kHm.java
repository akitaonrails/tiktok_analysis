package X;

import Y.ARunnableS120S0100000_20;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.sdui.render.bridge.ReadableArray;
import com.bytedance.sdui.render.bridge.ReadableMap;
import com.bytedance.sdui.render.bridge.ReadableType;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0kHm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1313520kHm<T extends View> extends SDUIBaseUI {
    public T LLLLLILLIL;
    public C1313540kHo LLLLLJIL;
    public boolean LLLLLJLJLL;
    public C1313700kI4 LLLLLL;
    public C1313610kHv LLLLLLIL;
    public C1313510kHl LLLLLLJ;
    public boolean LLLLLLL;
    public SDUIBaseUI LLLLLLLLL;
    public boolean LLLLLLLLLL;

    public AbstractC1313520kHm() {
        throw null;
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final int LJJJJIZL() {
        return 0;
    }

    public T LJLJJL(Context context) {
        return null;
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public int LJII() {
        Drawable background;
        boolean z;
        if (this.LLLLLILLIL.getBackground() != null && (background = this.LLLLLILLIL.getBackground()) != null) {
            C1315480kKw c1315480kKw = new C1315480kKw();
            C1314460kJI c1314460kJI = new C1314460kJI(background);
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

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public boolean LJIIJJI() {
        C1314670kJd c1314670kJd;
        C1313990kIX c1313990kIX;
        C1313610kHv c1313610kHv = this.LLLLLLIL;
        if (c1313610kHv == null) {
            return false;
        }
        C1314660kJc c1314660kJc = c1313610kHv.LJIJ;
        return (c1314660kJc != null && c1314660kJc.LIZJ()) || ((c1314670kJd = c1313610kHv.LJIJJ) != null && c1314670kJd.LIZJ()) || ((c1313990kIX = c1313610kHv.LJIJI) != null && c1313990kIX.LIZJ());
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final float LJJIJIIJI() {
        T t = this.LLLLLILLIL;
        if (t == null) {
            return 1.0f;
        }
        return t.getScaleX();
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final float LJJIJIIJIL() {
        T t = this.LLLLLILLIL;
        if (t == null) {
            return 1.0f;
        }
        return t.getScaleY();
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final Matrix LJJIL() {
        T t = this.LLLLLILLIL;
        return (t == null || t.getMatrix() == null) ? new Matrix() : this.LLLLLILLIL.getMatrix();
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final float LJJJ() {
        return this.LLLLLILLIL.getTranslationX();
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final float LJJJI() {
        return this.LLLLLILLIL.getTranslationY();
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public void LJJJJLI() {
        AbstractC1317090kNX abstractC1317090kNX = this.LLILZ;
        this.LLLLLILLIL = null;
        T t = (T) LJLJJL(abstractC1317090kNX);
        this.LLLLLILLIL = t;
        if (t == null) {
            return;
        }
        C1313540kHo c1313540kHo = new C1313540kHo(this, this.LLILZ);
        this.LLLLLJIL = c1313540kHo;
        this.LLJ = c1313540kHo;
        c1313540kHo.LIZJ = this.LLLJ;
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJJJJZ() {
        this.LLLLLILLIL.invalidate();
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final boolean LJJJLL() {
        T t;
        return this.LLLIILIL && (t = this.LLLLLILLIL) != null && t.getVisibility() == 0;
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public void LJJJLZIJ() {
        InterfaceC1298200jt4 interfaceC1298200jt4 = this.LLILZLL;
        if (interfaceC1298200jt4 != null) {
            boolean z = interfaceC1298200jt4 instanceof AbstractC1313500kHk;
        }
        this.LLLLLILLIL.measure(View.MeasureSpec.makeMeasureSpec(LJJJJI(), 1073741824), View.MeasureSpec.makeMeasureSpec(LJIIZILJ(), 1073741824));
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0186  */
    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLI() {
        /*
            Method dump skipped, instruction units count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1313520kHm.LJJLI():void");
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public void LJJLIIIJJI() {
        WeakReference<AbstractC1313520kHm> weakReference;
        HashMap<String, C1313530kHn> map;
        super.LJJLIIIJJI();
        C1313700kI4 c1313700kI4 = this.LLLLLL;
        if (c1313700kI4 != null && (map = c1313700kI4.LIZJ) != null) {
            Iterator<C1313530kHn> it2 = map.values().iterator();
            while (it2.hasNext()) {
                ObjectAnimator[] objectAnimatorArr = it2.next().LJI;
                if (objectAnimatorArr != null) {
                    for (ObjectAnimator objectAnimator : objectAnimatorArr) {
                        objectAnimator.removeAllListeners();
                    }
                }
            }
        }
        C1313610kHv c1313610kHv = this.LLLLLLIL;
        if (c1313610kHv == null || (weakReference = c1313610kHv.LIZ) == null || weakReference.get() == null) {
            return;
        }
        c1313610kHv.LIZ.get().LJLIIL(c1313610kHv.LIZIZ, c1313610kHv.LIZJ, c1313610kHv.LIZLLL, c1313610kHv.LJ, c1313610kHv.LJFF, c1313610kHv.LJI, c1313610kHv.LJII, c1313610kHv.LJIIIIZZ, c1313610kHv.LJIILIIL, c1313610kHv.LJIILJJIL, c1313610kHv.LJIILL, c1313610kHv.LJIILLIIL, c1313610kHv.LJIIIZ, c1313610kHv.LJIIJ, c1313610kHv.LJIIJJI, c1313610kHv.LJIIL, c1313610kHv.LJIIZILJ);
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJJLIL() {
        boolean z = C1317810kOh.LIZ;
        if (!C1317810kOh.LJIILL) {
            this.LLLLLILLIL.requestLayout();
            return;
        }
        T t = this.LLLLLILLIL;
        if (!t.isInLayout()) {
            for (ViewParent parent = t.getParent(); parent != null; parent = parent.getParent()) {
                if (!parent.isLayoutRequested()) {
                }
            }
            this.LLLLLILLIL.requestLayout();
            return;
        }
        HandlerHook.viewPost(this.LLLLLILLIL, new ARunnableS120S0100000_20(this, 36));
    }

    public final void LJLJJLL() {
        this.LLLLLILLIL.layout(LJJI(), LJJIJLIJ(), LJJI() + LJJJJI(), LJJIJLIJ() + LJIIZILJ());
    }

    public final void LJLJLLL() {
        if (this.LLLLLLIL == null) {
            this.LLLLLLIL = new C1313610kHv();
        }
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public void LJIIJ() {
        super.LJIIJ();
        C1313510kHl c1313510kHl = this.LLLLLLJ;
        if (c1313510kHl != null) {
            c1313510kHl.LJ();
        }
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public void LJJLIIIIJ() {
        HashMap<String, C1313530kHn> map;
        int length;
        super.LJJLIIIIJ();
        C1313700kI4 c1313700kI4 = this.LLLLLL;
        if (c1313700kI4 == null || (map = c1313700kI4.LIZJ) == null) {
            return;
        }
        for (C1313530kHn c1313530kHn : map.values()) {
            ObjectAnimator[] objectAnimatorArr = c1313530kHn.LJI;
            if (objectAnimatorArr != null && (length = objectAnimatorArr.length) > 0) {
                objectAnimatorArr[length - 1].addListener(new C1313570kHr(c1313530kHn));
            }
        }
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public void LJJLIIIJJIZ() {
        super.LJJLIIIJJIZ();
        if (LJIIL() != null && (LJIIL().width() <= 0 || LJIIL().height() <= 0)) {
            C786410Ut5.LJLLLLLL(8, this.LLLLLILLIL);
        } else if (this.LLLLLJLJLL) {
            C786410Ut5.LJLLLLLL(0, this.LLLLLILLIL);
        }
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI, X.InterfaceC1317060kNU
    public final boolean LJFF() {
        return this.LLLLLLLLLL;
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final C1313700kI4 LJIL() {
        return this.LLLLLL;
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public C1313610kHv LJJ() {
        return this.LLLLLLIL;
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public C1313510kHl LJJIZ() {
        return this.LLLLLLJ;
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final boolean LJJJJ() {
        return this.LLLLLJLJLL;
    }

    public void LJLJLJ() {
        LJLJJLL();
    }

    public AbstractC1313520kHm(AbstractC1317090kNX abstractC1317090kNX) {
        super(abstractC1317090kNX);
        this.LLLLLJLJLL = true;
        this.LLLLLLL = true;
        this.LLLLLLLLLL = true;
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJJJJL(ReadableMap readableMap) {
        if (this.LLLLLLJ == null) {
            this.LLLLLLJ = new C1313510kHl();
        }
        C1313510kHl c1313510kHl = this.LLLLLLJ;
        c1313510kHl.getClass();
        if (readableMap != null) {
            ReadableArray array = readableMap.getArray("transition");
            if (array == null) {
                c1313510kHl.LJ();
            } else {
                SparseArray<C1313710kI5> sparseArray = c1313510kHl.LJIIIZ;
                c1313510kHl.LJIIIZ = new SparseArray<>();
                int i = 0;
                while (true) {
                    if (i >= array.size()) {
                        break;
                    }
                    ReadableArray array2 = array.getArray(i);
                    int i2 = array2.getInt(0);
                    C1313710kI5 c1313710kI5 = new C1313710kI5();
                    c1313710kI5.LLILZ = i2;
                    c1313710kI5.LLILLJJLI = (long) array2.getDouble(1);
                    c1313710kI5.LLILLL = (long) array2.getDouble(c1313710kI5.LIZJ(2, array2));
                    c1313710kI5.LLJJI = i;
                    int i3 = c1313710kI5.LLILZ;
                    if (i3 == 16369) {
                        c1313510kHl.LJIIIZ.clear();
                        int[] iArr = C1314780kJo.LIZ;
                        int i4 = 0;
                        int i5 = 0;
                        do {
                            int i6 = iArr[i4];
                            C1313710kI5 c1313710kI52 = new C1313710kI5(c1313710kI5);
                            c1313710kI52.LLJJI = i5;
                            c1313710kI52.LLILZ = i6;
                            c1313510kHl.LJIIIZ.put(i6, c1313710kI52);
                            i4++;
                            i5++;
                        } while (i4 < 10);
                    } else {
                        c1313510kHl.LJIIIZ.put(i3, c1313710kI5);
                        i++;
                    }
                }
                C1313710kI5.LIZIZ(c1313510kHl.LJIIIZ, 256, 1024);
                C1313710kI5.LIZIZ(c1313510kHl.LJIIIZ, 512, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
                if (sparseArray != null) {
                    for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                        int iKeyAt = sparseArray.keyAt(i7);
                        if (c1313510kHl.LJIIIZ.indexOfKey(iKeyAt) < 0) {
                            c1313510kHl.LJFF(Integer.valueOf(iKeyAt));
                        }
                    }
                }
                if (c1313510kHl.LJIIIZ.size() != 0) {
                    return;
                }
            }
        }
        this.LLLLLLJ = null;
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJJLJ(ReadableArray readableArray) {
        C1313710kI5 c1313710kI5;
        if (this.LLLLLL == null) {
            this.LLLLLL = new C1313700kI4(this);
        }
        if (readableArray == null) {
            C1313700kI4 c1313700kI4 = this.LLLLLL;
            HashMap<String, C1313530kHn> map = c1313700kI4.LIZJ;
            if (map != null) {
                for (C1313530kHn c1313530kHn : map.values()) {
                    c1313530kHn.LIZLLL();
                    c1313530kHn.LJIIIIZZ();
                    c1313530kHn.LJII = EnumC1313870kIL.DESTROYED;
                }
                c1313700kI4.LIZJ = null;
                c1313700kI4.LIZIZ = null;
                return;
            }
            return;
        }
        int size = readableArray.size();
        C1313710kI5[] c1313710kI5Arr = new C1313710kI5[size];
        for (int i = 0; i < size; i++) {
            ReadableArray array = readableArray.getArray(i);
            if (array == null) {
                c1313710kI5 = null;
            } else if (array.size() == 13) {
                c1313710kI5 = new C1313710kI5();
                c1313710kI5.LL = array.getString(0);
                c1313710kI5.LLILLJJLI = array.getLong(1);
                int iLIZJ = c1313710kI5.LIZJ(2, array);
                int i2 = iLIZJ + 1;
                c1313710kI5.LLILLL = array.getLong(iLIZJ);
                int i3 = i2 + 1;
                c1313710kI5.LLJIJIL = array.getInt(i2) - 1;
                int i4 = i3 + 1;
                c1313710kI5.LLJILJILJ = array.getInt(i3);
                c1313710kI5.LLJILJIL = array.getInt(i4);
                c1313710kI5.LLJILLL = array.getInt(i4 + 1);
            } else {
                C1314420kJE.LIZIZ(null);
                throw null;
            }
            c1313710kI5Arr[i] = c1313710kI5;
        }
        this.LLLLLL.LIZIZ = c1313710kI5Arr;
    }

    @InterfaceC1291270jht(name = "accessibility-label")
    public void setAccessibilityLabel(InterfaceC1314540kJQ interfaceC1314540kJQ) {
        T t = this.LLLLLILLIL;
        if (t != null) {
            t.setFocusable(true);
            this.LLLLLILLIL.setContentDescription(this.LLLIZZ);
        }
    }

    @InterfaceC1291270jht(defaultFloat = 1.0f, name = "opacity")
    public void setAlpha(float f) {
        C1313700kI4 c1313700kI4 = this.LLLLLL;
        if (c1313700kI4 != null) {
            c1313700kI4.LIZ(Float.valueOf(f), "Alpha");
        }
        C1313510kHl c1313510kHl = this.LLLLLLJ;
        if (c1313510kHl != null && c1313510kHl.LIZIZ(1)) {
            this.LLLLLLJ.LIZ(this, 1, Float.valueOf(f));
            return;
        }
        if (f != this.LLLLLILLIL.getAlpha()) {
            if (f > 0.0f && f < 1.0f && "HUAWEI".equals(Build.MANUFACTURER)) {
                if (C1314810kJr.LIZ == -1) {
                    if (C1314810kJr.LIZIZ == null) {
                        try {
                            StringBuilder sb = new StringBuilder();
                            if (Build.SUPPORTED_ABIS.length > 0) {
                                int i = 0;
                                while (true) {
                                    String[] strArr = Build.SUPPORTED_ABIS;
                                    if (i >= strArr.length) {
                                        break;
                                    }
                                    sb.append(strArr[i]);
                                    if (i != strArr.length - 1) {
                                        sb.append(", ");
                                    }
                                    i++;
                                }
                            } else {
                                sb = new StringBuilder(Build.CPU_ABI);
                            }
                            if (TextUtils.isEmpty(sb.toString())) {
                                C1314810kJr.LIZIZ = "unknown";
                            }
                            C1314810kJr.LIZIZ = sb.toString();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C1314810kJr.LIZIZ = "unknown";
                        }
                    }
                    C1314810kJr.LIZ = C1314810kJr.LIZIZ.contains("64") ? 1 : 0;
                }
                if (C1314810kJr.LIZ != 1) {
                    this.LLLLLLL = false;
                }
            }
            C786410Ut5.T4(this.LLLLLILLIL, f);
        }
        C1313610kHv c1313610kHv = this.LLLLLLIL;
        if (c1313610kHv != null) {
            c1313610kHv.LJIL = f;
        }
    }

    @InterfaceC1291270jht(name = "filter")
    public void setFilter(float f) {
        if (this.LLLLLILLIL == null) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(1.0f - f);
        Paint paint = new Paint(1);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.LLLLLILLIL.setLayerType(2, paint);
    }

    @InterfaceC1291270jht(name = "layout-animation-create-delay")
    public void setLayoutAnimationCreateDelay(double d) {
        LJLJLLL();
        this.LLLLLLIL.LIZ().LIZ.LLILLL = (long) d;
    }

    @InterfaceC1291270jht(name = "layout-animation-create-duration")
    public void setLayoutAnimationCreateDuration(double d) {
        LJLJLLL();
        this.LLLLLLIL.LIZ().LIZ.LLILLJJLI = (long) d;
    }

    @InterfaceC1291270jht(name = "layout-animation-create-property")
    public void setLayoutAnimationCreateProperty(int i) {
        LJLJLLL();
        this.LLLLLLIL.LIZ().LIZ.LLILZ = i;
    }

    @InterfaceC1291270jht(name = "layout-animation-create-timing-function")
    public void setLayoutAnimationCreateTimingFunc(ReadableArray readableArray) {
        LJLJLLL();
        this.LLLLLLIL.LIZ().LIZ.LIZJ(0, readableArray);
    }

    @InterfaceC1291270jht(name = "layout-animation-delete-delay")
    public void setLayoutAnimationDeleteDelay(double d) {
        LJLJLLL();
        this.LLLLLLIL.LIZIZ().LIZ.LLILLL = (long) d;
    }

    @InterfaceC1291270jht(name = "layout-animation-delete-duration")
    public void setLayoutAnimationDeleteDuration(double d) {
        LJLJLLL();
        this.LLLLLLIL.LIZIZ().LIZ.LLILLJJLI = (long) d;
    }

    @InterfaceC1291270jht(name = "layout-animation-delete-property")
    public void setLayoutAnimationDeleteProperty(int i) {
        LJLJLLL();
        this.LLLLLLIL.LIZIZ().LIZ.LLILZ = i;
    }

    @InterfaceC1291270jht(name = "layout-animation-delete-timing-function")
    public void setLayoutAnimationDeleteTimingFunc(ReadableArray readableArray) {
        LJLJLLL();
        this.LLLLLLIL.LIZIZ().LIZ.LIZJ(0, readableArray);
    }

    @InterfaceC1291270jht(name = "layout-animation-update-delay")
    public void setLayoutAnimationUpdateDelay(double d) {
        LJLJLLL();
        this.LLLLLLIL.LIZJ().LIZ.LLILLL = (long) d;
    }

    @InterfaceC1291270jht(name = "layout-animation-update-duration")
    public void setLayoutAnimationUpdateDuration(double d) {
        LJLJLLL();
        this.LLLLLLIL.LIZJ().LIZ.LLILLJJLI = (long) d;
    }

    @InterfaceC1291270jht(name = "layout-animation-update-property")
    public void setLayoutAnimationUpdateProperty(int i) {
        LJLJLLL();
        this.LLLLLLIL.LIZJ().LIZ.LLILZ = i;
    }

    @InterfaceC1291270jht(name = "layout-animation-update-timing-function")
    public void setLayoutAnimationUpdateTimingFunc(ReadableArray readableArray) {
        LJLJLLL();
        this.LLLLLLIL.LIZJ().LIZ.LIZJ(0, readableArray);
    }

    @InterfaceC1291270jht(name = "overlap")
    public void setOverlap(InterfaceC1314540kJQ interfaceC1314540kJQ) {
        if (interfaceC1314540kJQ == null) {
            this.LLLLLLL = true;
            return;
        }
        ReadableType type = interfaceC1314540kJQ.getType();
        if (type == ReadableType.Boolean) {
            this.LLLLLLL = interfaceC1314540kJQ.asBoolean();
        } else {
            if (type != ReadableType.String) {
                return;
            }
            this.LLLLLLL = interfaceC1314540kJQ.asString().equalsIgnoreCase("true");
        }
    }

    @InterfaceC1291270jht(name = "hardware-layer")
    public void setRenderToHardwareTexture(boolean z) {
        int i;
        T t = this.LLLLLILLIL;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        t.setLayerType(i, null);
    }

    @InterfaceC1291270jht(name = "sdui-builtin-event-through")
    public void setSDUIBuiltinEventThrough(boolean z) {
        this.LLLLLLLLLL = z;
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    @InterfaceC1291270jht(name = "lynx-test-tag")
    public void setTestID(String str) {
        this.LLLLLILLIL.setTag(str);
    }

    @InterfaceC1291270jht(name = "transform")
    public void setTransform(ReadableArray readableArray) {
        this.LLLIIL = true;
        List<C1313650kHz> listLIZJ = C1313650kHz.LIZJ(readableArray);
        this.LLLIIII = listLIZJ;
        float f = 0.0f;
        if (listLIZJ != null) {
            ArrayList<C1313650kHz> arrayList = (ArrayList) listLIZJ;
            if (!arrayList.isEmpty()) {
                for (C1313650kHz c1313650kHz : arrayList) {
                    int i = c1313650kHz.LIZ;
                    if (i != 8) {
                        if (i == 16) {
                            f = c1313650kHz.LJFF;
                        }
                    } else {
                        f = c1313650kHz.LIZIZ;
                    }
                }
            }
        }
        this.LLILLL = f;
        InterfaceC1298200jt4 interfaceC1298200jt4 = this.LLILZLL;
        if (interfaceC1298200jt4 instanceof C1313490kHj) {
        }
        C1313700kI4 c1313700kI4 = this.LLLLLL;
        if (c1313700kI4 != null) {
            c1313700kI4.LIZ(this.LLLIIII, "Transform");
        }
    }

    @InterfaceC1291270jht(name = "transform-order")
    public void setTransformOrder(InterfaceC1314540kJQ interfaceC1314540kJQ) {
        if (interfaceC1314540kJQ == null) {
            this.LLLLLJIL.LJII = true;
            return;
        }
        ReadableType type = interfaceC1314540kJQ.getType();
        if (type == ReadableType.Boolean) {
            this.LLLLLJIL.LJII = interfaceC1314540kJQ.asBoolean();
        } else {
            if (type != ReadableType.String) {
                return;
            }
            String strAsString = interfaceC1314540kJQ.asString();
            this.LLLLLJIL.LJII = strAsString.equalsIgnoreCase("true");
        }
    }

    @InterfaceC1291270jht(defaultInt = 1, name = "visibility")
    public void setVisibility(int i) {
        C1313510kHl c1313510kHl = this.LLLLLLJ;
        if (c1313510kHl != null && c1313510kHl.LIZIZ(128)) {
            this.LLLLLLJ.LIZ(this, 128, Integer.valueOf(i));
            return;
        }
        int visibility = this.LLLLLILLIL.getVisibility();
        if (i == 1) {
            this.LLLLLJLJLL = true;
            C786410Ut5.LJLLLLLL(0, this.LLLLLILLIL);
            visibility = 0;
        } else if (i == 0) {
            this.LLLLLJLJLL = false;
            C786410Ut5.LJLLLLLL(4, this.LLLLLILLIL);
            visibility = 4;
        }
        InterfaceC1298200jt4 interfaceC1298200jt4 = this.LLILZLL;
        if (interfaceC1298200jt4 instanceof C1313490kHj) {
            AbstractC1313520kHm abstractC1313520kHm = (AbstractC1313520kHm) interfaceC1298200jt4;
            if (visibility == 0) {
                abstractC1313520kHm.LLLLLJLJLL = true;
                C786410Ut5.LJLLLLLL(0, abstractC1313520kHm.LLLLLILLIL);
            } else if (visibility == 4) {
                abstractC1313520kHm.LLLLLJLJLL = false;
                C786410Ut5.LJLLLLLL(4, abstractC1313520kHm.LLLLLILLIL);
            } else {
                abstractC1313520kHm.getClass();
            }
        }
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJJZZIII(int i, String str) {
        this.LLJJ = i;
        this.LLJJI = str;
    }

    public void LJLJL(SDUIBaseUI sDUIBaseUI, SDUIBaseUI sDUIBaseUI2) {
        sDUIBaseUI2.LLIZ = this;
        if (sDUIBaseUI == null) {
            SDUIBaseUI sDUIBaseUI3 = this.LLLLLLLLL;
            if (sDUIBaseUI3 != null) {
                sDUIBaseUI3.LL = sDUIBaseUI2;
                sDUIBaseUI2.LLILLJJLI = sDUIBaseUI3;
            }
            this.LLLLLLLLL = sDUIBaseUI2;
            return;
        }
        SDUIBaseUI sDUIBaseUI4 = sDUIBaseUI.LLILLJJLI;
        if (sDUIBaseUI4 != null) {
            sDUIBaseUI4.LL = sDUIBaseUI2;
            sDUIBaseUI2.LLILLJJLI = sDUIBaseUI4;
        }
        sDUIBaseUI2.LL = sDUIBaseUI;
        sDUIBaseUI.LLILLJJLI = sDUIBaseUI2;
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI, X.InterfaceC1317060kNU
    public final void onFocusChanged(boolean z, boolean z2) {
        if (!z2) {
            C1315530kL1 c1315530kL1LJ = C1315530kL1.LJ();
            if (c1315530kL1LJ.LJ == null) {
                c1315530kL1LJ.LJ = (InputMethodManager) C786410Ut5.G2(c1315530kL1LJ.LIZ, "input_method");
            }
            InputMethodManager inputMethodManager = c1315530kL1LJ.LJ;
            if (inputMethodManager == null) {
                return;
            }
            if (z) {
                inputMethodManager.showSoftInput(this.LLLLLILLIL, 1);
            } else {
                inputMethodManager.hideSoftInputFromWindow(this.LLLLLILLIL.getWindowToken(), 0);
            }
        }
    }
}
