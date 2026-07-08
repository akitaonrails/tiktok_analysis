package X;

import Y.ARunnableS26S0201000_20;
import Y.ARunnableS89S0200000_20;
import android.graphics.Canvas;
import android.view.View;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.frame.FrameShadowNode;
import com.lynx.tasm.core.LynxEngineProxy;
import com.lynx.tasm.core.LynxLayoutProxy;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0kBj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1309770kBj extends C1310660kDA {
    public LynxTemplateRender LL;
    public String LLILLJJLI;
    public WeakReference<LynxView> LLILLL;
    public int LLILZ;
    public s LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public TemplateData LLJIJIL;
    public TemplateData LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public InterfaceC1310500kCu LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public Boolean LLJJJ;
    public final C1309840kBq LLJJJIL;

    @Override // X.C1310660kDA
    public C1309760kBi getLynxViewBuilder() {
        LynxTemplateRender lynxTemplateRender = this.LL;
        if (lynxTemplateRender != null) {
            return lynxTemplateRender.LJJI();
        }
        return null;
    }

    @Override // android.view.View
    public LynxView getRootView() {
        WeakReference<LynxView> weakReference = this.LLILLL;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0kBq] */
    public C1309770kBj(s sVar) {
        super(sVar);
        this.LLIZ = true;
        this.LLIZLLLIL = -1;
        this.LLJ = -1;
        this.LLJJ = 1073741824;
        this.LLJJI = 1073741824;
        this.LLJJIJIIJIL = -1;
        this.LLJJIJIL = -1;
        this.LLJJJIL = new C1310070kCD(this) { // from class: X.0kBq
            public final WeakReference<C1309770kBj> LIZ;

            {
                this.LIZ = new WeakReference<>(this);
            }

            @Override // X.C1310070kCD, X.InterfaceC1310470kCr
            public final void onPerformanceEvent(C1310800kDO c1310800kDO) {
                s sVar2;
                LynxBaseUI lynxBaseUILJIILLIIL;
                String str;
                HashMap map;
                C1309770kBj c1309770kBj = this.LIZ.get();
                if (c1309770kBj != null) {
                    boolean z = true;
                    if ("pipeline".equals(c1310800kDO.LIZIZ) && "loadBundle".equals(c1310800kDO.LIZ) && (sVar2 = c1309770kBj.LLILZIL) != null && sVar2.LLIZ != null && sVar2.LJIILIIL() != null && (lynxBaseUILJIILLIIL = c1309770kBj.LLILZIL.LJIILIIL().LJIILLIIL(c1309770kBj.LLILZ)) != null && lynxBaseUILJIILLIIL.getEvents() != null && lynxBaseUILJIILLIIL.getEvents().containsKey("loadmetrics")) {
                        C1298720jtu c1298720jtu = c1309770kBj.LLILZIL.LLIZ;
                        int i = c1309770kBj.LLILZ;
                        String str2 = c1309770kBj.LLILLJJLI;
                        if ((c1309770kBj.LLJJIII & 1) <= 0) {
                            z = false;
                        }
                        HashMap map2 = new HashMap();
                        if (str2 == null) {
                            str2 = "";
                        }
                        map2.put("url", str2);
                        if (z) {
                            str = "embedded";
                        } else {
                            str = "standard";
                        }
                        map2.put("mode", str);
                        if (c1310800kDO.LIZLLL == null) {
                            map = new HashMap();
                        } else {
                            map = new HashMap(c1310800kDO.LIZLLL);
                        }
                        map2.put("entry", map);
                        c1298720jtu.LIZIZ(new C1289960jfm(i, "loadmetrics", map2));
                    }
                }
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a5, code lost:
    
        if (r9.LLJJIJIL != (-1)) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILL(com.lynx.tasm.TemplateBundle r10) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1309770kBj.LJIILL(com.lynx.tasm.TemplateBundle):boolean");
    }

    @Override // X.C1310660kDA, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        LynxTemplateRender lynxTemplateRender = this.LL;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.LJJJIL();
        }
    }

    @Override // X.C1310660kDA
    public final void runOnTasmThread(Runnable runnable) {
        LynxTemplateRender lynxTemplateRender = this.LL;
        if (lynxTemplateRender != null) {
            LynxEngineProxy lynxEngineProxy = lynxTemplateRender.LJJJLL;
            if (lynxEngineProxy == null) {
                LynxLog.i("LynxTemplateRender", "runOnTasmThread failed, engine proxy is null.");
            } else {
                C1289620jfE.LIZLLL(new ARunnableS89S0200000_20(lynxEngineProxy, runnable, 78));
            }
        }
    }

    @Override // X.C1310660kDA
    public void setAttachLynxPageUICallback(InterfaceC1310500kCu interfaceC1310500kCu) {
        LynxTemplateRender lynxTemplateRender = this.LL;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.LJJLL(interfaceC1310500kCu);
        } else {
            this.LLJJIJI = interfaceC1310500kCu;
        }
    }

    public void setAutoHeight(boolean z) {
        int i;
        if (this.LLJILLL == z) {
            return;
        }
        this.LLJILLL = z;
        if (z) {
            i = 0;
        } else {
            i = 1073741824;
        }
        this.LLJJI = i;
        if (this.LLILZLL) {
            int i2 = this.LLIZLLLIL;
            int i3 = this.LLJ;
            if (i2 != -1 && i3 != -1) {
                this.LL.LLD(View.MeasureSpec.makeMeasureSpec(i2, this.LLJJ), View.MeasureSpec.makeMeasureSpec(this.LLJ, this.LLJJI), true);
            }
        }
    }

    public void setAutoWidth(boolean z) {
        int i;
        if (this.LLJILJILJ == z) {
            return;
        }
        this.LLJILJILJ = z;
        if (z) {
            i = 0;
        } else {
            i = 1073741824;
        }
        this.LLJJ = i;
        if (this.LLILZLL) {
            int i2 = this.LLIZLLLIL;
            int i3 = this.LLJ;
            if (i2 != -1 && i3 != -1) {
                this.LL.LLD(View.MeasureSpec.makeMeasureSpec(i2, i), View.MeasureSpec.makeMeasureSpec(this.LLJ, this.LLJJI), true);
            }
        }
    }

    public void setEmbeddedMode(int i) {
        if (this.LLJJIII != 0) {
            LynxLog.e("LynxFrameView", "setEmbeddedMode failed, embeddedMode is already set");
        } else {
            this.LLJJIII = i;
        }
    }

    public void setEnableMultiAsyncThread(Boolean bool) {
        this.LLJJJ = bool;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setGlobalProps(long r7) {
        /*
            r6 = this;
            java.lang.String r0 = "LynxFrameView.setGlobalProps"
            r1 = 0
            com.lynx.tasm.base.TraceEvent.LJIIJ(r1, r0)
            com.lynx.tasm.TemplateData r0 = r6.LLJILJIL
            if (r0 == 0) goto L14
            long r4 = r0.LIZ
            int r3 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r3 == 0) goto L19
            r0.LJIILL()
        L14:
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L1c
            r0 = 0
        L19:
            r6.LLJILJIL = r0
            return
        L1c:
            com.lynx.tasm.TemplateData r0 = new com.lynx.tasm.TemplateData
            r0.<init>(r7)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1309770kBj.setGlobalProps(long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setInitData(long r7) {
        /*
            r6 = this;
            java.lang.String r0 = "LynxFrameView.setInitData"
            r1 = 0
            com.lynx.tasm.base.TraceEvent.LJIIJ(r1, r0)
            com.lynx.tasm.TemplateData r0 = r6.LLJIJIL
            if (r0 == 0) goto L14
            long r4 = r0.LIZ
            int r3 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r3 == 0) goto L19
            r0.LJIILL()
        L14:
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L1c
            r0 = 0
        L19:
            r6.LLJIJIL = r0
            return
        L1c:
            com.lynx.tasm.TemplateData r0 = new com.lynx.tasm.TemplateData
            r0.<init>(r7)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1309770kBj.setInitData(long):void");
    }

    public void setPresetHeight(int i) {
        if (i < 0) {
            return;
        }
        this.LLJJIJIL = i;
    }

    public void setPresetWidth(int i) {
        if (i < 0) {
            return;
        }
        this.LLJJIJIIJIL = i;
    }

    public void setSign(int i) {
        this.LLILZ = i;
    }

    public void setUrl(String str) {
        this.LLILLJJLI = str;
    }

    public void setGlobalProps(TemplateData templateData) {
        TraceEvent.LJIIJ(0L, "LynxFrameView.setGlobalProps");
        this.LLJILJIL = templateData;
    }

    public void setInitData(TemplateData templateData) {
        TraceEvent.LJIIJ(0L, "LynxFrameView.setInitData");
        this.LLJIJIL = templateData;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (TraceController.isTracingStarted()) {
            HashMap map = new HashMap();
            map.put("widthMeasureSpec", View.MeasureSpec.toString(i));
            map.put("heightMeasureSpec", View.MeasureSpec.toString(i2));
            TraceEvent.LJIIL(0L, "LynxFrameView.onMeasure", map);
        }
        if (this.LLILZLL && this.LL != null) {
            int intrinsicWidth = this.LLIZLLLIL;
            int intrinsicHeight = this.LLJ;
            if (!this.LLIZ) {
                if (this.LLJJ != 1073741824) {
                    intrinsicWidth = getIntrinsicWidth();
                }
                if (this.LLJJI != 1073741824) {
                    intrinsicHeight = getIntrinsicHeight();
                }
                this.LLIZ = true;
            }
            if (intrinsicWidth != -1 && intrinsicHeight != -1) {
                if (TraceController.isTracingStarted()) {
                    HashMap map2 = new HashMap();
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(intrinsicWidth, this.LLJJ);
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(intrinsicHeight, this.LLJJI);
                    map2.put("widthMeasureSpec", View.MeasureSpec.toString(iMakeMeasureSpec));
                    map2.put("heightMeasureSpec", View.MeasureSpec.toString(iMakeMeasureSpec2));
                    TraceEvent.LJIIL(0L, "LynxFrameView.onMeasureTarget", map2);
                }
                this.LL.LJJJI(View.MeasureSpec.makeMeasureSpec(intrinsicWidth, this.LLJJ), View.MeasureSpec.makeMeasureSpec(intrinsicHeight, this.LLJJI));
                return;
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // X.C1310660kDA
    public final void sendGlobalEvent(String str, JavaOnlyArray javaOnlyArray) {
        LynxTemplateRender lynxTemplateRender = this.LL;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.LJJLJ(str, javaOnlyArray);
        }
    }

    @Override // X.C1310660kDA
    public final void setIntrinsicContentSize(final int i, final int i2) {
        if (i == getIntrinsicWidth() && i2 == getIntrinsicHeight()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxFrameView::setIntrinsicContentSize width:");
        sbLIZ.append(i);
        sbLIZ.append(" height:");
        sbLIZ.append(i2);
        LynxLog.i("LynxFrameView", C2188811AlT.LIZIZ(sbLIZ));
        if (TraceController.isTracingStarted()) {
            HashMap map = new HashMap();
            map.put("width", String.valueOf(i));
            map.put("height", String.valueOf(i2));
            TraceEvent.LJIIL(0L, "LynxFrameView.setIntrinsicContentSize", map);
        }
        s sVar = this.LLILZIL;
        int i3 = this.LLILZ;
        InterfaceC1309740kBg interfaceC1309740kBg = new InterfaceC1309740kBg() { // from class: X.0kBx
            @Override // X.InterfaceC1309740kBg
            public final void LIZ(ShadowNode shadowNode) {
                int i4 = i;
                int i5 = i2;
                if (shadowNode instanceof FrameShadowNode) {
                    FrameShadowNode frameShadowNode = (FrameShadowNode) shadowNode;
                    frameShadowNode.getClass();
                    if (TraceController.isTracingStarted()) {
                        HashMap map2 = new HashMap();
                        map2.put("sign", String.valueOf(frameShadowNode.LIZIZ));
                        map2.put("old_width", String.valueOf(frameShadowNode.LJIL));
                        map2.put("old_height", String.valueOf(frameShadowNode.LJJ));
                        map2.put("new_width", String.valueOf(i4));
                        map2.put("new_height", String.valueOf(i5));
                        TraceEvent.LJIIL(0L, "FrameIntrinsicTrace.FrameShadowNode.updateIntrinsicContentSize", map2);
                    }
                    if (i4 != frameShadowNode.LJIL || i5 != frameShadowNode.LJJ) {
                        frameShadowNode.LJIL = i4;
                        frameShadowNode.LJJ = i5;
                        frameShadowNode.LJIILLIIL();
                    }
                }
            }
        };
        sVar.getClass();
        ARunnableS26S0201000_20 aRunnableS26S0201000_20 = new ARunnableS26S0201000_20(sVar, i3, interfaceC1309740kBg, 9);
        LynxLayoutProxy lynxLayoutProxy = sVar.LLJILJIL.get();
        if (lynxLayoutProxy != null) {
            lynxLayoutProxy.LIZIZ(aRunnableS26S0201000_20);
        }
        this.LLIZ = false;
        super.setIntrinsicContentSize(i, i2);
    }

    @Override // X.C1310660kDA, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        LynxTemplateRender lynxTemplateRender = this.LL;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.LJJJ();
        }
    }
}
