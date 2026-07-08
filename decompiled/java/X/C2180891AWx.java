package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArrayList;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PlayerData;
import com.bytedance.android.livesdk.comp.impl.linkcore.layout.internal.LayoutSlardarMonitor;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicLayoutSlardarCombineSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiHostDividerSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostBgColorAudienceSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AWx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2180891AWx extends C1AX4 implements Function2<C1AYQ, Function1<? super String, ? extends C1AYF>, Unit> {
    public final C1AXO LLIZ;
    public final C1AYR LLIZLLLIL;
    public final C1AXQ LLJ;
    public final String LLJI;
    public final InterfaceC958970b3v LLJIJIL;
    public LayoutSlardarMonitor LLJILJIL;
    public ViewGroup LLJILJILJ;
    public boolean LLJILLL;
    public final ArrayList<C2180911AWz> LLJJ;
    public final C01GW LLJJI;
    public final FrameLayout LLJJIII;
    public WeakReference<View> LLJJIJI;
    public WeakReference<View> LLJJIJIIJIL;
    public final int LLJJIJIL;
    public final Paint LLJJJ;
    public final Path LLJJJIL;
    public final boolean LLJJJJ;
    public final C01GW LLJJJJJIL;
    public String LLJJJJLIIL;
    public final Paint LLJJL;
    public final Path LLJJLIIIJLLLLLLLZ;
    public int LLJL;

    public final Function2<C1AYQ, Function1<? super String, C1AYF>, Unit> getActionCallback() {
        return this;
    }

    @Override // X.C972430bPd, X.C0UUV
    public final boolean LIZ() {
        return this.LLIZLLLIL.LJIIJ();
    }

    public final void LIZJ() {
        WeakReference<View> weakReference = this.LLJJIJI;
        View view = weakReference != null ? weakReference.get() : null;
        if (!this.LLJ.LJJJI()) {
            if (view != null) {
                LJIILLIIL(view);
            }
            this.LLJJIJI = null;
        } else if (view != null) {
            view.setId(R.id.ysq);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 51);
            layoutParams.leftMargin = 0;
            layoutParams.topMargin = 0;
            C786410Ut5.W5(view, layoutParams);
            LJIJ(0, view, getRenderLayer());
            return;
        }
        View viewFindViewById = findViewById(R.id.ysq);
        if (viewFindViewById != null) {
            LJIILLIIL(viewFindViewById);
        }
        this.LLJJIJI = null;
    }

    public final void LIZLLL() {
        View view;
        View view2;
        String strLJIILJJIL = LJIILJJIL(507);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addSubviewBetweenRenderAndUIContainerIfNeed: enable:");
        sbLIZ.append(this.LLIZ.LIZ.LLLLIILLL);
        C20441214yg.LIZIZ(strLJIILJJIL, C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLIZ.LIZ.LLLLIILLL) {
            WeakReference<View> weakReference = this.LLJJIJIIJIL;
            if (weakReference != null && (view2 = weakReference.get()) != null) {
                LJIILLIIL(view2);
            }
            this.LLJJIJIIJIL = null;
            return;
        }
        WeakReference<View> weakReference2 = this.LLJJIJIIJIL;
        if (weakReference2 == null || (view = weakReference2.get()) == null) {
            C20441214yg.LIZIZ(LJIILJJIL(526), "addSubviewBetweenRenderAndUIContainerIfNeed: subView is null");
            return;
        }
        int iIndexOfChild = indexOfChild(getRenderLayer()) + 1;
        LJIJ(iIndexOfChild, view, this);
        if (indexOfChild(this.LLJJIII) <= iIndexOfChild) {
            this.LLJJIII.bringToFront();
        }
        if (view.getParent() != null) {
            String strLJIILJJIL2 = LJIILJJIL(523);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("addSubviewBetweenRenderAndUIContainerIfNeed: add success, parent inst:");
            sbLIZ2.append(view.getParent());
            sbLIZ2.append(", index:");
            sbLIZ2.append(((ViewGroup) view.getParent()).indexOfChild(view));
            C20441214yg.LIZIZ(strLJIILJJIL2, C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public final boolean LJIIL() {
        boolean z = this.LLJJJJ;
        if (z) {
            if (getMActualShowAreaInWindow().width() == getMAllAreaInWindow().width() && getMActualShowAreaInWindow().height() == getMAllAreaInWindow().height()) {
                return false;
            }
        } else {
            if (z) {
                throw new C1954807lC();
            }
            if (getMActualShowAreaInWindow().width() == getWidth() && getMActualShowAreaInWindow().height() == getHeight()) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C1AX4, X.InterfaceC937820aVo
    public Rect getContainerActualRange() {
        Rect rect = new Rect();
        rect.left = getMActualShowAreaInWindow().left + getMAllAreaInWindow().left;
        rect.top = getMActualShowAreaInWindow().top + getMAllAreaInWindow().top;
        rect.right = rect.left + getMActualShowAreaInWindow().width();
        rect.bottom = rect.top + getMActualShowAreaInWindow().height();
        return rect;
    }

    @Override // X.C1AX4, X.InterfaceC937820aVo
    public String getLayoutBusinessType() {
        String str;
        Layout layoutLIZJ = this.LLIZLLLIL.LIZJ(false);
        return (layoutLIZJ == null || (str = layoutLIZJ.businessType) == null) ? EnumC918990a1R.NORMAL.getBusinessType() : str;
    }

    @Override // X.C1AX4, X.InterfaceC937820aVo
    public String getLayoutId() {
        Layout layoutLIZJ = this.LLIZLLLIL.LIZJ(false);
        if (layoutLIZJ != null) {
            return layoutLIZJ.layoutId;
        }
        return null;
    }

    public final C1AY4 getLayoutMixer() {
        return (C1AY4) this.LLJJJJJIL.getValue();
    }

    @Override // X.C1AX4
    public Integer getLayoutScene() {
        Layout layoutLIZJ = this.LLIZLLLIL.LIZJ(false);
        if (layoutLIZJ != null) {
            return Integer.valueOf(layoutLIZJ.scene);
        }
        return null;
    }

    public final FrameLayout getRenderLayer() {
        return (FrameLayout) this.LLJJI.getValue();
    }

    @Override // X.C1AX4, X.InterfaceC937820aVo
    public Rect getContainerAllRange() {
        return getMAllAreaInWindow();
    }

    @Override // X.C1AX4, X.InterfaceC937820aVo
    public String getLayoutName() {
        return C916560ZxW.LIZ(getLayoutBusinessType()).name();
    }

    @Override // X.C1AX4, X.InterfaceC937820aVo
    public Rect getPlayerRange() {
        return getMPlayerAreaRect();
    }

    public final String getTAG() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("linker_layout_sdk_LayoutView");
        sbLIZ.append(this.LLJJIJIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1AX4, X.InterfaceC937820aVo
    public List<InterfaceC937840aVq> getAllLayoutWindows() {
        return this.LLJJ;
    }

    public final String getCurrentDrawLayoutId() {
        return this.LLJJJJLIIL;
    }

    public final boolean getEnableRoundCorner() {
        return this.LLJILLL;
    }

    public final FrameLayout getInteractLayer() {
        return this.LLJJIII;
    }

    public final ViewGroup getLayoutViewContainer() {
        return this.LLJILJILJ;
    }

    public final int getMOffsetY() {
        return this.LLJL;
    }

    public final Path getPath() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final C1AXQ getProvider() {
        return this.LLJ;
    }

    @Override // X.C1AX4, X.InterfaceC937820aVo
    public String getRealDrawLayoutId() {
        return this.LLJJJJLIIL;
    }

    public final ArrayList<C2180911AWz> getWindowList() {
        return this.LLJJ;
    }

    public static final String LJIILJJIL(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.LAYOUT.getValue());
        sbLIZ.append("_LayoutView_");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LJIILLIIL(View view) {
        ViewGroup viewGroup;
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(view, viewGroup);
        }
    }

    public static FrameLayout.LayoutParams LJIJJ(Rect rect) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.width(), rect.height());
        layoutParams.leftMargin = rect.left;
        layoutParams.topMargin = rect.top;
        return layoutParams;
    }

    public final void LJ(Canvas canvas) {
        FrameLayout.LayoutParams layoutParams;
        if (getNotAddViewOpt() >= 2 || canvas == null) {
            return;
        }
        this.LLJJJIL.rewind();
        this.LLJJJIL.addRect(0.0f, 0.0f, getWidth(), getHeight(), Path.Direction.CW);
        Path path = this.LLJJJIL;
        for (C2180911AWz c2180911AWz : this.LLJJ) {
            ViewGroup.LayoutParams layoutParams2 = c2180911AWz.LIZJ.LIZIZ.getLayoutParams();
            if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                layoutParams = (FrameLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = null;
            }
            int i = c2180911AWz.LJIIIZ;
            if (layoutParams != null) {
                if (this.LLJILLL) {
                    Path path2 = new Path();
                    float f = i;
                    path2.addRoundRect(layoutParams.leftMargin, layoutParams.topMargin, r5 + layoutParams.width, r4 + layoutParams.height, f, f, Path.Direction.CW);
                    path.op(path2, Path.Op.DIFFERENCE);
                } else {
                    Path path3 = new Path();
                    path3.addRect(layoutParams.leftMargin, layoutParams.topMargin, r5 + layoutParams.width, r4 + layoutParams.height, Path.Direction.CW);
                    path.op(path3, Path.Op.DIFFERENCE);
                }
            }
        }
        Integer layoutScene = getLayoutScene();
        if (layoutScene != null && layoutScene.intValue() == 4) {
            this.LLJJJ.setColor(-16777216);
        } else {
            this.LLJJJ.setColor(-14873558);
        }
        canvas.drawPath(this.LLJJJIL, this.LLJJJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.13BV] */
    public final void LJFF(Layout layout) {
        int i;
        ?? arrayList;
        List<RectF> list;
        RectF rectF;
        if (getNotAddViewOpt() >= 2) {
            return;
        }
        C1AXO c1axo = this.LLIZ;
        C21614619iS c21614619iS = c1axo.LJ;
        List<RectF> list2 = null;
        if (c21614619iS.LIZ) {
            int iLIZJ = c1axo.LIZJ();
            Rect mActualShowAreaInWindow = getMActualShowAreaInWindow();
            LayoutArrayList layoutMaskConfigListByOnlineMicCount = layout.getLayoutMaskConfigListByOnlineMicCount(iLIZJ);
            if (layoutMaskConfigListByOnlineMicCount != null) {
                list2 = layoutMaskConfigListByOnlineMicCount.divideList;
            }
            c21614619iS.LJFF = 0.0f;
            c21614619iS.LJI = 0.0f;
            if (list2 != null) {
                for (RectF rectF2 : list2) {
                    if (rectF2.width() > rectF2.height()) {
                        float f = c21614619iS.LJI;
                        float fHeight = rectF2.height();
                        if (f < fHeight) {
                            f = fHeight;
                        }
                        c21614619iS.LJI = f;
                    } else {
                        float f2 = c21614619iS.LJFF;
                        float fWidth = rectF2.width();
                        if (f2 < fWidth) {
                            f2 = fWidth;
                        }
                        c21614619iS.LJFF = f2;
                    }
                }
            }
            c21614619iS.LJFF *= mActualShowAreaInWindow.width();
            c21614619iS.LJI *= mActualShowAreaInWindow.height();
            setWillNotDraw(false);
            return;
        }
        this.LLJJLIIIJLLLLLLLZ.reset();
        if (layout.scene == 2 && !this.LLIZLLLIL.LJIIJ() && (!MultiHostDividerSettings.INSTANCE.getValue().enable || LiveCohostBgColorAudienceSetting.INSTANCE.isEnable())) {
            setWillNotDraw(false);
            return;
        }
        if (C949650aot.LIZ()) {
            setWillNotDraw(!this.LLJILLL);
            return;
        }
        C1AXO c1axo2 = this.LLIZ;
        Rect mAllAreaInWindow = getMAllAreaInWindow();
        c1axo2.getClass();
        if (layout.isNormalType()) {
            arrayList = C13BV.INSTANCE;
        } else {
            LayoutArrayList layoutMaskConfigListByOnlineMicCount2 = layout.getLayoutMaskConfigListByOnlineMicCount(c1axo2.LIZJ());
            if (layoutMaskConfigListByOnlineMicCount2 != null && (list = layoutMaskConfigListByOnlineMicCount2.divideList) != null) {
                arrayList = new ArrayList();
                for (RectF rectF3 : list) {
                    if (rectF3 == null) {
                        C1AZW.LJFF(C1AXO.LJIIIIZZ(79), "createLayoutParamsByData return as  layoutArray is null", null, null);
                        rectF = new RectF();
                    } else {
                        rectF = new RectF();
                        rectF.left = rectF3.left * mAllAreaInWindow.width();
                        rectF.top = rectF3.top * mAllAreaInWindow.height();
                        float f3 = 1;
                        rectF.right = rectF.left + (rectF3.width() * mAllAreaInWindow.width()) + f3;
                        rectF.bottom = rectF.top + (rectF3.height() * mAllAreaInWindow.height()) + f3;
                        String strLJIIIIZZ = C1AXO.LJIIIIZZ(88);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("createLayoutParamsByData newRect = ");
                        sbLIZ.append(rectF);
                        C1AZW.LJIIJ(12, strLJIIIIZZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
                    }
                    arrayList.add(rectF);
                }
            } else {
                String strLJIIIIZZ2 = C1AXO.LJIIIIZZ(51);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getAllLineRect return as can't find divideList micCount = ");
                Layout layoutLIZJ = c1axo2.LIZIZ.LIZJ(false);
                if (layoutLIZJ != null) {
                    i = layoutLIZJ.micCount;
                } else {
                    i = 1;
                }
                sbLIZ2.append(i);
                sbLIZ2.append('!');
                C1AZW.LJFF(strLJIIIIZZ2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                arrayList = C13BV.INSTANCE;
            }
        }
        if (arrayList.isEmpty()) {
            setWillNotDraw(!this.LLJILLL);
            return;
        }
        setWillNotDraw(false);
        for (RectF rectF4 : arrayList) {
            Path path = this.LLJJLIIIJLLLLLLLZ;
            boolean zLJIIL = LJIIL();
            if (zLJIIL) {
                rectF4.intersect(new RectF(getMActualShowAreaInWindow()));
            } else if (zLJIIL) {
                throw new C1954807lC();
            }
            C1AZW c1azw = C1AZW.LIZ;
            String strLJIILJJIL = LJIILJJIL(285);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(getTAG());
            sbLIZ3.append(":line rect = ");
            sbLIZ3.append(rectF4);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            c1azw.getClass();
            C1AZW.LIZ(strLJIILJJIL, strLIZIZ, null, null);
            path.addRect(rectF4, Path.Direction.CCW);
        }
    }

    @Override // X.InterfaceC937820aVo
    public final InterfaceC937840aVq LJI(String str) {
        C2180911AWz next;
        C1AZW c1azw = C1AZW.LIZ;
        String strLJIILJJIL = LJIILJJIL(507);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getTAG());
        sbLIZ.append(":getWindowByLinkMicId:");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(strLJIILJJIL, strLIZIZ, null, null);
        Iterator<C2180911AWz> it2 = this.LLJJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LIZJ.LIZ.LIZJ, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public final void LJIIZILJ(C2180911AWz c2180911AWz) {
        SurfaceView surfaceViewLIZLLL = c2180911AWz.LIZLLL();
        if (surfaceViewLIZLLL != null) {
            FrameLayout frameLayout = this.LLJJIII;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(frameLayout, surfaceViewLIZLLL);
            frameLayout.removeViewInLayout(surfaceViewLIZLLL);
        }
        getLayoutMixer().LIZJ(c2180911AWz.LIZ, c2180911AWz.LIZIZ, c2180911AWz.LIZJ);
        try {
            FrameLayout frameLayout2 = this.LLJJIII;
            FrameLayout frameLayout3 = c2180911AWz.LIZJ.LIZIZ;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(frameLayout2, frameLayout3);
            frameLayout2.removeViewInLayout(frameLayout3);
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            String strLJIILJJIL = LJIILJJIL(479);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getTAG());
            sbLIZ.append(":removeViewInLayout throw npe:");
            sbLIZ.append(e);
            C1AZW.LJFF(strLJIILJJIL, C2188811AlT.LIZIZ(sbLIZ), null, null);
        }
    }

    public final void LJIJI(int i) {
        String strLJIILJJIL = LJIILJJIL(274);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getTAG());
        sbLIZ.append(":updateOffsetY offsetY:");
        sbLIZ.append(i);
        C1AZW.LJIIJ(12, strLJIILJJIL, C2188811AlT.LIZIZ(sbLIZ), null, null);
        this.LLJL = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC937820aVo
    public final void LJL(PlayerData playerData) {
        final LayoutSlardarMonitor.Player player;
        int i;
        int i2;
        long jLongValue;
        int iIntValue;
        final ArrayList arrayList = new ArrayList();
        Iterator<C2180911AWz> it2 = this.LLJJ.iterator();
        while (true) {
            player = null;
            if (!it2.hasNext()) {
                break;
            }
            Iterator<View> it3 = new C09RD(it2.next().LIZJ.LIZIZ).iterator();
            while (true) {
                C09RE c09re = (C09RE) it3;
                if (c09re.hasNext()) {
                    View view = (View) c09re.next();
                    if (view instanceof C1AXB) {
                        C1AXB c1axb = (C1AXB) view;
                        if (c1axb != null) {
                            Boolean audioMute = c1axb.getAudioMute();
                            int iIntValue2 = -1;
                            if (audioMute != null) {
                                i = !audioMute.booleanValue() ? 1 : 0;
                            } else {
                                i = -1;
                            }
                            Boolean videoMute = c1axb.getVideoMute();
                            if (videoMute != null) {
                                i2 = !videoMute.booleanValue() ? 1 : 0;
                            } else {
                                i2 = -1;
                            }
                            int i3 = !c1axb.isEmpty() ? 1 : 0;
                            Long uid = c1axb.getUid();
                            if (uid != null) {
                                jLongValue = uid.longValue();
                            } else {
                                jLongValue = -1;
                            }
                            String linkMicId = c1axb.getLinkMicId();
                            if (linkMicId == null) {
                                linkMicId = "";
                            }
                            Integer uiPos = c1axb.getUiPos();
                            if (uiPos != null) {
                                iIntValue = uiPos.intValue();
                            } else {
                                iIntValue = -1;
                            }
                            Integer logicPos = c1axb.getLogicPos();
                            if (logicPos != null) {
                                iIntValue2 = logicPos.intValue();
                            }
                            arrayList.add(new LayoutSlardarMonitor.BizWindow(i3, jLongValue, linkMicId, iIntValue, iIntValue2, i, i2, c1axb.getX(), c1axb.getY(), c1axb.getW(), c1axb.getH()));
                        }
                    }
                }
            }
        }
        final LayoutSlardarMonitor layoutSlardarMonitor = this.LLJILJIL;
        if (layoutSlardarMonitor != null) {
            if (playerData != null) {
                player = new LayoutSlardarMonitor.Player(playerData.streamW, playerData.streamH, playerData.exceptedX, playerData.exceptedY, playerData.exceptedW, playerData.exceptedH, playerData.realX, playerData.realY, playerData.realW, playerData.realH);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("linker_layout_sdk_LayoutView");
            sbLIZ.append(hashCode());
            final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            LayoutSlardarMonitor.LIZLLL(new Runnable() { // from class: X.1AXa
                public final void LIZ() throws JSONException {
                    if (LivesdkLinkmicLayoutSlardarCombineSetting.INSTANCE.isLayoutRenderEnable()) {
                        JSONObject jSONObjectLIZ = layoutSlardarMonitor.LIZ("linkmic_biz_render");
                        List<LayoutSlardarMonitor.BizWindow> list = arrayList;
                        String str = strLIZIZ;
                        LayoutSlardarMonitor.Player player2 = player;
                        try {
                            jSONObjectLIZ.put("biz_windows", new JSONArray(C19748512Ol.LIZIZ.LJIILL(list)));
                            jSONObjectLIZ.put("hash", str);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (player2 != null) {
                            try {
                                jSONObjectLIZ.put("player", new JSONObject(C19748512Ol.LIZIZ.LJIILL(player2)));
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                        }
                        C1CC2.LJIIIIZZ("ttlive_link_interact_layout_event_monitor", 0, jSONObjectLIZ);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LayoutSlardarMonitor@96d1.onBusinessRender$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LayoutSlardarMonitor@96d1.onBusinessRender$1");
                }
            });
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Integer layoutScene;
        if (C949650aot.LIZ() && (layoutScene = getLayoutScene()) != null && layoutScene.intValue() == 4) {
            if (this.LLJILLL && !this.LLIZ.LJ.LIZ) {
                LJ(canvas);
                super.onDraw(canvas);
                return;
            } else {
                super.onDraw(canvas);
                return;
            }
        }
        if (this.LLIZ.LJ.LIZ) {
            C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LayoutView, helper.customDividerHelper.enable=");
            sbLIZ.append(this.LLIZ.LJ.LIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1143300frELJIIJJI.getClass();
            AbstractC1143290frD.LJI("CornerBugLocate", strLIZIZ);
            C21614619iS c21614619iS = this.LLIZ.LJ;
            ArrayList<C2180911AWz> arrayList = this.LLJJ;
            boolean z = this.LLJILLL;
            c21614619iS.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (C2180911AWz c2180911AWz : arrayList) {
                linkedHashMap.put(new C21614719iT(c2180911AWz.LJIIIZ, c2180911AWz.LIZJ.LIZIZ), Boolean.valueOf(TextUtils.isEmpty(c2180911AWz.LJ())));
            }
            Rect rect = new Rect();
            rect.left = getLeft();
            rect.top = getTop();
            rect.right = getLeft() + getWidth();
            rect.bottom = getTop() + getHeight();
            c21614619iS.LIZ(canvas, rect, linkedHashMap, z);
            super.onDraw(canvas);
            return;
        }
        if (!this.LLJJLIIIJLLLLLLLZ.isEmpty()) {
            C1143300frE.LJIIJJI().getClass();
            AbstractC1143290frD.LJI("CornerBugLocate", "LayoutView, drawDivider(canvas)");
            LJ(canvas);
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
        canvas.drawPath(this.LLJJLIIIJLLLLLLLZ, this.LLJJL);
    }

    @Override // android.view.ViewGroup
    public void setClipChildren(boolean z) {
        super.setClipChildren(z);
        this.LLJJIII.setClipChildren(z);
        Iterator<C2180911AWz> it2 = this.LLJJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ.LIZIZ.setClipChildren(z);
        }
    }

    public final void setCurrentDrawLayoutId(String str) {
        this.LLJJJJLIIL = str;
    }

    public void setDividerType(int i) {
        if (i == EnumC938840aXS.DIVIDER_TYPE_SHARED_BG.type) {
            C21614619iS c21614619iS = this.LLIZ.LJ;
            c21614619iS.LIZ = true;
            c21614619iS.LIZIZ(i);
        } else {
            this.LLIZ.LJ.LIZ = false;
        }
        LJIILL(EnumC993190bx7.ChangeDivider, false, null);
        postInvalidate();
    }

    public final void setEnableRoundCorner(boolean z) {
        this.LLJILLL = z;
    }

    public final void setLayoutViewContainer(ViewGroup viewGroup) {
        this.LLJILJILJ = viewGroup;
    }

    public final void setMOffsetY(int i) {
        this.LLJL = i;
    }

    public final void setSubviewBetweenRenderAndUIContainer(View view) {
        View view2;
        String strLJIILJJIL = LJIILJJIL(496);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSubviewBetweenRenderAndUIContainer: enable:");
        sbLIZ.append(this.LLIZ.LIZ.LLLLIILLL);
        sbLIZ.append(", view inst:");
        sbLIZ.append(view.hashCode());
        C20441214yg.LIZIZ(strLJIILJJIL, C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLIZ.LIZ.LLLLIILLL) {
            return;
        }
        WeakReference<View> weakReference = this.LLJJIJIIJIL;
        if (weakReference != null) {
            view2 = weakReference.get();
        } else {
            view2 = null;
        }
        if (!Intrinsics.LJFF(view, view2)) {
            if (view2 != null) {
                LJIILLIIL(view2);
            }
            this.LLJJIJIIJIL = new WeakReference<>(view);
        }
    }

    public void LJIIJJI(C1AYQ c1ayq, Function1<? super String, C1AYF> function1) {
        boolean z;
        boolean z2;
        boolean z3;
        if (c1ayq instanceof C1AYJ) {
            C1AXE c1axe = new C1AXE(this, function1);
            if (Intrinsics.LJFF(getLayoutBusinessType(), EnumC918990a1R.ZOOM_PANEL_FLOAT_GUEST.getBusinessType())) {
                c1axe.invoke();
                return;
            }
            C500260Jjc.LJJLIIIJILLIZJL(new C1AXD(this));
            LJIILL(EnumC993190bx7.UpdateWindow, false, function1);
            if (getParent() != null) {
                HandlerHook.viewPost(this, new Runnable() { // from class: X.1AX9
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LayoutView@2fe4.invoke$3$1");
                        try {
                            this.LL.LLJIJIL.LJJJI();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LayoutView@2fe4.invoke$3$1");
                    }
                });
                return;
            }
            return;
        }
        if (c1ayq instanceof C1AYI) {
            C500260Jjc.LJJLIIIJILLIZJL(new C1AXF(this));
            LJIILL(EnumC993190bx7.SwitchLayout, true, function1);
            Layout layoutLIZ = this.LLIZ.LIZ(false);
            if (layoutLIZ != null && layoutLIZ.scene == 4) {
                z = true;
            } else {
                z = false;
            }
            if (z && Intrinsics.LJFF(this.LLJI, "video_live") && C0IWY.LIZ && !this.LLIZLLLIL.LJIIJ() && this.LLJILJILJ != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (layoutLIZ != null && layoutLIZ.scene == 2 && Intrinsics.LJFF(this.LLJI, "video_live") && C0IWY.LIZ && !this.LLIZLLLIL.LJIIJ() && this.LLJILJILJ != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z2 && !z3) {
                HandlerHook.viewPost(this, new Runnable() { // from class: X.1AX2
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LayoutView@2fe4.invoke$6");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LayoutView@2fe4.invoke$6");
                    }

                    public final void LIZ() {
                        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ControlGroup, layoutViewContainer.width=");
                        ViewGroup layoutViewContainer = this.LL.getLayoutViewContainer();
                        sbLIZ.append(layoutViewContainer != null ? Integer.valueOf(layoutViewContainer.getWidth()) : null);
                        sbLIZ.append(", layoutViewContainer.height=");
                        ViewGroup layoutViewContainer2 = this.LL.getLayoutViewContainer();
                        sbLIZ.append(layoutViewContainer2 != null ? Integer.valueOf(layoutViewContainer2.getHeight()) : null);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c1143300frELJIIJJI.getClass();
                        AbstractC1143290frD.LIZ("LayoutFirstFrameOptLog", strLIZIZ);
                        C2180891AWx c2180891AWx = this.LL;
                        c2180891AWx.LLJIJIL.LLIILII(c2180891AWx, 1);
                    }
                });
                return;
            }
            ViewGroup viewGroup = this.LLJILJILJ;
            if (viewGroup != null) {
                HandlerHook.viewPost(viewGroup, new Runnable() { // from class: X.1AX1
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LayoutView@2fe4.invoke$5");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LayoutView@2fe4.invoke$5");
                    }

                    public final void LIZ() {
                        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("OptGroup, layoutViewContainer.width=");
                        ViewGroup layoutViewContainer = this.LL.getLayoutViewContainer();
                        sbLIZ.append(layoutViewContainer != null ? Integer.valueOf(layoutViewContainer.getWidth()) : null);
                        sbLIZ.append(", layoutViewContainer.height=");
                        ViewGroup layoutViewContainer2 = this.LL.getLayoutViewContainer();
                        sbLIZ.append(layoutViewContainer2 != null ? Integer.valueOf(layoutViewContainer2.getHeight()) : null);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c1143300frELJIIJJI.getClass();
                        AbstractC1143290frD.LIZ("LayoutFirstFrameOptLog", strLIZIZ);
                        C2180891AWx c2180891AWx = this.LL;
                        c2180891AWx.LLJIJIL.LLIILII(c2180891AWx, 1);
                    }
                });
                return;
            }
            return;
        }
        throw new C1954807lC();
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(C1AYQ c1ayq, Function1<? super String, ? extends C1AYF> function1) {
        LJIIJJI(c1ayq, function1);
        return Unit.LIZ;
    }

    @Override // X.InterfaceC937820aVo
    public final void LJIILIIL(View view, boolean z, boolean z2) {
        if (view == null) {
            return;
        }
        if (view instanceof SurfaceView) {
            SurfaceView surfaceView = (SurfaceView) view;
            if (surfaceView.getParent() != null && !(surfaceView.getParent() instanceof InterfaceC937820aVo)) {
                surfaceView.setZOrderMediaOverlay(z2);
                return;
            }
        }
        if (view instanceof FrameLayout) {
            ((ViewGroup) view).setClipChildren(getClipChildren());
        }
        LJIILLIIL(view);
        View viewFindViewWithTag = this.LLJJIII.findViewWithTag(view.getTag());
        if (viewFindViewWithTag != null) {
            C786410Ut5.LJJJZ(viewFindViewWithTag, this.LLJJIII);
        }
        try {
            if (z) {
                this.LLJJIII.addView(view, 0);
                return;
            }
            if (view instanceof SurfaceView) {
                ((SurfaceView) view).setZOrderMediaOverlay(z2);
            }
            this.LLJJIII.addView(view);
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0292 A[PHI: r3
      0x0292: PHI (r3v21 java.util.Map<java.lang.String, com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArray>) = 
      (r3v20 java.util.Map<java.lang.String, com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArray>)
      (r3v26 java.util.Map<java.lang.String, com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArray>)
      (r3v26 java.util.Map<java.lang.String, com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArray>)
      (r3v26 java.util.Map<java.lang.String, com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArray>)
     binds: [B:103:0x0291, B:20:0x00fb, B:22:0x0103, B:24:0x0107] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e9 A[LOOP:3: B:116:0x02e7->B:117:0x02e9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0141 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0284  */
    /* JADX WARN: Type inference failed for: r4v17, types: [X.1AWi] */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.1AWj] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(X.EnumC993190bx7 r33, boolean r34, kotlin.jvm.functions.Function1<? super java.lang.String, X.C1AYF> r35) {
        /*
            Method dump skipped, instruction units count: 1575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2180891AWx.LJIILL(X.0bx7, boolean, kotlin.jvm.functions.Function1):void");
    }

    public final void LJIJ(int i, View view, ViewGroup viewGroup) {
        if (view.getParent() == null) {
            viewGroup.addView(view, i);
        }
        if (Intrinsics.LJFF(view.getParent(), viewGroup)) {
            return;
        }
        LJIILLIIL(view);
        viewGroup.addView(view, i);
    }

    public C2180891AWx(C1AXO c1axo, C1AYR c1ayr, Context context, C1AXQ c1axq, String str, C969020bK8 c969020bK8, LayoutSlardarMonitor layoutSlardarMonitor) {
        super(context);
        this.LLIZ = c1axo;
        this.LLIZLLLIL = c1ayr;
        this.LLJ = c1axq;
        this.LLJI = str;
        this.LLJIJIL = c969020bK8;
        this.LLJILJIL = layoutSlardarMonitor;
        this.LLJJ = new ArrayList<>();
        this.LLJJI = C452501pT.LIZIZ(new C21159317rD(context, this));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.yso);
        this.LLJJIII = frameLayout;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.LLJJJ = paint;
        this.LLJJJIL = new Path();
        this.LLJJJJ = true;
        this.LLJJJJJIL = C452501pT.LIZIZ(new C1AXK(this));
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(-14873558);
        this.LLJJL = paint2;
        this.LLJJLIIIJLLLLLLLZ = new Path();
        C786410Ut5.a6(this.LLJJIII, new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.LLJJIJIL = hashCode();
    }

    public static final void LJIIIIZZ(int i, C2180911AWz c2180911AWz, C2180891AWx c2180891AWx, List<C2180911AWz> list, boolean z, C013C c013c, C1AYF c1ayf, Layout layout) {
        boolean z2;
        boolean z3;
        boolean z4;
        C1AXI c1axi;
        EnumC918810a19 enumC918810a19;
        C2180911AWz c2180911AWz2;
        C1AX3 c1ax3;
        C1AXI c1axi2;
        if (i == 0) {
            c2180911AWz.LJIILIIL = c2180891AWx.LLJL;
        }
        C918060Zzw c918060Zzw = C918060Zzw.LIZ;
        boolean zCurrentUserIsAnchor = LinkCoreModelKt.currentUserIsAnchor();
        c918060Zzw.getClass();
        boolean z5 = false;
        if (C918060Zzw.LIZ(zCurrentUserIsAnchor) && (c2180911AWz2 = (C2180911AWz) C13LP.LJJJLZIJ(i, list)) != null && (c1ax3 = c2180911AWz2.LIZJ) != null && (c1axi2 = c1ax3.LIZ) != null && c1axi2.LJIIIZ == c2180911AWz.LIZJ.LIZ.LJIIIZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        String strLJIILJJIL = LJIILJJIL(377);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c2180891AWx.getTAG());
        sbLIZ.append(":check update pos = ");
        sbLIZ.append(i);
        sbLIZ.append(" linkMicId: ");
        sbLIZ.append(c2180911AWz.LIZJ.LIZ.LIZJ);
        sbLIZ.append("needUpdateState=");
        sbLIZ.append(z);
        sbLIZ.append(" maskWindow.micWindow.micInfo.isStateUpdated()=");
        C1AXI c1axi3 = c2180911AWz.LIZJ.LIZ;
        EnumC918810a19 enumC918810a192 = c1axi3.LIZ;
        if (enumC918810a192 != null && enumC918810a192 != c1axi3.LJI) {
            z3 = true;
        } else {
            z3 = false;
        }
        sbLIZ.append(z3);
        sbLIZ.append(" sizeChange=");
        sbLIZ.append(c013c.element);
        sbLIZ.append(" extraWrapper?.hasChanged=");
        if (c1ayf != null && c1ayf.LIZ) {
            z4 = true;
        } else {
            z4 = false;
        }
        sbLIZ.append(z4);
        sbLIZ.append(" isContentTypeChanged=");
        sbLIZ.append(z2);
        C938510aWv c938510aWv = null;
        C1AZW.LJIIJ(12, strLJIILJJIL, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (z || (((enumC918810a19 = (c1axi = c2180911AWz.LIZJ.LIZ).LIZ) != null && enumC918810a19 != c1axi.LJI) || c013c.element || ((c1ayf != null && c1ayf.LIZ) || z2))) {
            C1AXI c1axi4 = c2180911AWz.LIZJ.LIZ;
            String strLJIILJJIL2 = LJIILJJIL(377);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c2180891AWx.getTAG());
            sbLIZ2.append(":on window state change. pos = ");
            sbLIZ2.append(i);
            sbLIZ2.append(", linkMicId: ");
            sbLIZ2.append(c1axi4.LIZJ);
            sbLIZ2.append(", contentType: ");
            if (layout.scene == 4) {
                z5 = true;
            }
            sbLIZ2.append(c2180911AWz.LIZIZ(z5));
            sbLIZ2.append(", lastState: ");
            sbLIZ2.append(c1axi4.LJI);
            sbLIZ2.append(", state: ");
            sbLIZ2.append(c1axi4.LIZ);
            C1AZW.LJIIJ(12, strLJIILJJIL2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
            C1AXI c1axi5 = c2180911AWz.LIZJ.LIZ;
            EnumC918810a19 enumC918810a193 = c1axi5.LIZ;
            if (enumC918810a193 != null) {
                InterfaceC958970b3v interfaceC958970b3v = c2180891AWx.LLJIJIL;
                EnumC918810a19 enumC918810a194 = c1axi5.LJI;
                if (c1ayf != null) {
                    c938510aWv = c1ayf.LIZIZ;
                }
                interfaceC958970b3v.LJIILL(c2180911AWz, enumC918810a194, enumC918810a193, c938510aWv);
            }
        }
    }

    public final C2180911AWz LJIIJ(int i, int i2, C1AX3 c1ax3, String str, Rect rect, Rect rect2, int i3, boolean z, boolean z2) {
        Object next;
        int i4;
        MicPositionInfo micPositionInfo;
        int i5 = i3;
        Iterator<T> it2 = this.LLIZ.LJFF().values().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                MicPositionInfo micPositionInfo2 = ((OnLineMicInfo) next).micPositionData;
                if (micPositionInfo2 != null && micPositionInfo2.uiPos == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        OnLineMicInfo onLineMicInfo = (OnLineMicInfo) next;
        if (((CopyOnWriteArrayList) this.LLIZLLLIL.LJIIIZ()).isEmpty()) {
            if (onLineMicInfo != null && (micPositionInfo = onLineMicInfo.micPositionData) != null) {
                i4 = micPositionInfo.contentType;
            } else {
                i4 = 0;
            }
        } else {
            i4 = c1ax3.LIZ.LJIIIZ;
        }
        C1AXA c1axa = new C1AXA(c1ax3.LIZ(), new C1850090yFD(rect.left, rect.top, rect.right, rect.bottom), new C1850090yFD(rect2.left, rect2.top, rect2.right, rect2.bottom));
        C2180791AWn c2180791AWn = new C2180791AWn(this);
        Rect rect3 = new Rect();
        rect3.left = rect2.left + getMAllAreaInWindow().left;
        rect3.top = rect2.top + getMAllAreaInWindow().top;
        rect3.right = rect3.left + rect2.width();
        rect3.bottom = rect3.top + rect2.height();
        Rect rectLIZIZ = getLayoutMixer().LIZIZ(rect2, getMAllAreaInWindow());
        if (!this.LLJILLL) {
            i5 = 0;
        }
        return new C2180911AWz(i, i2, c1ax3, str, c1axa, c2180791AWn, rect3, rectLIZIZ, i4, i5, z, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x034b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0313  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(final int r32, int r33, int r34, int r35, final com.bytedance.android.livesdk.comp.api.linkcore.model.Layout r36, final X.C13BV r37, X.EnumC993190bx7 r38, final boolean r39, boolean r40, boolean r41, kotlin.jvm.functions.Function1 r42, boolean r43, boolean r44) {
        /*
            Method dump skipped, instruction units count: 1520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2180891AWx.LJII(int, int, int, int, com.bytedance.android.livesdk.comp.api.linkcore.model.Layout, X.13BV, X.0bx7, boolean, boolean, boolean, kotlin.jvm.functions.Function1, boolean, boolean):void");
    }
}
