package X;

import Y.ACListenerS140S0100000_5;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Ebn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368010Ebn extends RelativeLayout {
    public static final C01GW<C384050F3z> LLLIIIIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2315));
    public static final C01GW<C384050F3z> LLLIIIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2316));
    public long LL;
    public final List<C368220Ec8> LLILLJJLI;
    public List<C368220Ec8> LLILLL;
    public final C368010Ebn LLILZ;
    public final List<NLETrackSlot> LLILZIL;
    public InterfaceC368180Ec4 LLILZLL;
    public InterfaceC368620Ecm LLIZ;
    public boolean LLIZLLLIL;
    public Function0<Unit> LLJ;
    public int LLJI;
    public final ImageView LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public C0E6E LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public double LLJJJ;
    public int LLJJJIL;
    public Function0<Boolean> LLJJJJ;
    public Function0<Boolean> LLJJJJJIL;
    public final C368160Ec2 LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public InterfaceC368530Ecd LLJL;
    public InterfaceC369180Edg LLJLIL;
    public final int LLJLILLLLZIIL;
    public final int LLJLL;
    public final int LLJLLIL;
    public final C01GW LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public final C01GW LLL;
    public ImageView LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C368510Ecb LLLFZ;
    public boolean LLLI;
    public final C01GW LLLII;
    public final C368050Ebr LLLIIII;

    public final void setSelectAgainToRoot(boolean z) {
    }

    private final boolean getEnableImportANROpt() {
        return ((Boolean) this.LLLFFI.getValue()).booleanValue();
    }

    private final boolean getEnableTransitionDuration() {
        return ((Boolean) this.LLLFF.getValue()).booleanValue();
    }

    private final NLETrackSlot getSelectedSegment() {
        if (LJ(this.LLJJ)) {
            return (NLETrackSlot) ListProtector.get(this.LLILZIL, this.LLJJ);
        }
        return null;
    }

    private final C368570Ech getTrackTransitionCustomIcon() {
        return (C368570Ech) this.LLLII.getValue();
    }

    public final boolean LIZLLL() {
        return ((Boolean) this.LLJJL.getValue()).booleanValue();
    }

    public final void LJIIIZ() {
        if (!LJ(this.LLJJ)) {
            this.LLJJ = -1;
            LJIIJ();
        } else {
            setNormalType(Integer.valueOf(this.LLJJ));
            this.LLJJ = -1;
            LJIIJ();
        }
    }

    public final void LJIIJ() {
        if (!this.LLILZIL.isEmpty()) {
            int i = 0;
            for (C368220Ec8 c368220Ec8 : this.LLILLJJLI) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                C368220Ec8 c368220Ec82 = c368220Ec8;
                boolean z = i == C1697810uHb.LJIIJ(this.LLILZIL);
                c368220Ec82.setIsLastSlot(z);
                c368220Ec82.setIsAiExtendVisible(z && this.LLIZLLLIL);
                i = i2;
            }
        }
    }

    public final InterfaceC359750E8n getBlackSlotContainer() {
        return (InterfaceC359750E8n) this.LLL.getValue();
    }

    public final InterfaceC369250Edn getHapticFeedback() {
        return (InterfaceC369250Edn) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final C368220Ec8 getLastTrackLayout() {
        return (C368220Ec8) C13LP.LJJLIIIJL(this.LLILLJJLI);
    }

    public final C368220Ec8 getSelectTrackItem() {
        C368220Ec8 next;
        Iterator<C368220Ec8> it2 = this.LLILLJJLI.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.getStyle() == C0E6E.CLIP) {
                break;
            }
        }
        return next;
    }

    public final Bitmap getThumbnailMaskBitmap() {
        return (Bitmap) this.LLJLLL.getValue();
    }

    private final int getSelectedIndex() {
        NLETrackSlot selectedSegment = getSelectedSegment();
        if (selectedSegment != null) {
            Iterator it2 = ((ArrayList) this.LLILZIL).iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (((NLENode) it2.next()).getId() == selectedSegment.getId()) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public final void LJFF() {
        C369030EdR.LIZJ(this, ((C0FU0.LIZJ(getContext()) / 2) - this.LLJLL) - this.LLJLLIL, getPaddingTop(), 0, getPaddingBottom());
    }

    public final int getScreenWidth() {
        return C0FU0.LIZJ(getContext());
    }

    public final boolean getEnableShowTips() {
        return this.LLJJIJIIJIL;
    }

    public final ImageView getFirstTransitionIconView$editor_trackpanel_release() {
        return this.LLLF;
    }

    public final InterfaceC368620Ecm getKeyframeOutListener() {
        return this.LLIZ;
    }

    public final int getMyScrollX() {
        return this.LLJJJIL;
    }

    public final Function0<Unit> getOnSegmentsUpdated() {
        return this.LLJ;
    }

    public final double getScale() {
        return this.LLJJJ;
    }

    public final int getSelectIndex() {
        return this.LLJJ;
    }

    public final C0E6E getSelectedTrackStyle() {
        return this.LLJJI;
    }

    public final InterfaceC369180Edg getTrackScrollHandle$editor_trackpanel_release() {
        return this.LLJLIL;
    }

    private final void setEpilogueEnable(boolean z) {
        C368220Ec8 next;
        if (LJ(((ArrayList) this.LLILLJJLI).size() - 2)) {
            ((C368220Ec8) ListProtector.get(this.LLILLJJLI, ((ArrayList) r1).size() - 2)).setDrawMyTransitionOverlap(z);
            if (z) {
                Iterator<C368220Ec8> it2 = this.LLILLJJLI.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.LLLFF) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C368220Ec8 c368220Ec8 = next;
                if (c368220Ec8 != null) {
                    c368220Ec8.setEpilogueEnable(z);
                    if (this.LLJJI != C0E6E.LINE) {
                        c368220Ec8.LJFF(z);
                    }
                }
            }
        }
    }

    private final void setNormalType(Integer num) {
        int selectedIndex;
        if (num != null) {
            selectedIndex = num.intValue();
        } else {
            selectedIndex = getSelectedIndex();
        }
        if (!LJ(selectedIndex)) {
            return;
        }
        ((C368220Ec8) ListProtector.get(this.LLILLJJLI, selectedIndex)).LJIIJ();
        if (selectedIndex > 0) {
            ((C368220Ec8) ListProtector.get(this.LLILLJJLI, selectedIndex - 1)).setDrawMyTransitionOverlap(true);
        }
        if (selectedIndex < ((ArrayList) this.LLILLJJLI).size() - 1) {
            ((C368220Ec8) ListProtector.get(this.LLILLJJLI, selectedIndex + 1)).setDrawPreTransitionOverlap(true);
        }
        Iterator<C368220Ec8> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().bringToFront();
        }
        Iterator<C368220Ec8> it3 = this.LLILLJJLI.iterator();
        while (it3.hasNext()) {
            it3.next().LJFF(true);
        }
        this.LLJJI = C0E6E.NONE;
    }

    public final long LIZ(int i) {
        NLETrackSlot nLETrackSlot = (NLETrackSlot) ListProtector.get(this.LLILZIL, i - 1);
        long transitionDuration = 0;
        if (!C347020Dj2.LIZIZ(nLETrackSlot)) {
            return 0L;
        }
        NLESegmentTransition endTransition = nLETrackSlot.getEndTransition();
        if (endTransition != null) {
            transitionDuration = endTransition.getTransitionDuration();
        }
        return transitionDuration / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public final long LIZIZ(int i) {
        String resourceFile;
        NLEResourceNode effectSDKTransition;
        int size = this.LLILZIL.size();
        int i2 = i - 1;
        boolean z = false;
        if (i2 >= 0 && i2 < size) {
            z = true;
        }
        long transitionDuration = 0;
        if (!z) {
            return 0L;
        }
        NLETrackSlot nLETrackSlot = (NLETrackSlot) ListProtector.get(this.LLILZIL, i2);
        NLESegmentTransition endTransition = nLETrackSlot.getEndTransition();
        if (endTransition == null || (effectSDKTransition = endTransition.getEffectSDKTransition()) == null || (resourceFile = effectSDKTransition.getResourceFile()) == null) {
            resourceFile = "";
        }
        if (!(!a0.LJJJIL(resourceFile))) {
            return 0L;
        }
        NLESegmentTransition endTransition2 = nLETrackSlot.getEndTransition();
        if (endTransition2 != null) {
            transitionDuration = endTransition2.getTransitionDuration();
        }
        return transitionDuration / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v10 */
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
    public final void LIZJ(List<? extends NLETrackSlot> list) {
        boolean z;
        boolean z2;
        float fLIZ;
        boolean z3;
        int dimension;
        final C368220Ec8 c368220Ec8;
        long jLIZIZ;
        long jLIZ;
        int iLJII;
        ?? r1 = 1;
        if (!this.LLJILJIL) {
            setClipChildren(false);
            this.LLJILJIL = true;
        }
        LJFF();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reload! size = ");
        sbLIZ.append(list.size());
        C355090Dw3.LIZIZ("MultiTrackLayout", C2188811AlT.LIZIZ(sbLIZ));
        C368010Ebn c368010Ebn = this.LLILZ;
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c368010Ebn, null);
        c368010Ebn.removeAllViews();
        ((ArrayList) this.LLILZIL).clear();
        ((ArrayList) this.LLILLJJLI).clear();
        ((ArrayList) this.LLILZIL).addAll(list);
        if (list.size() > 35 && getEnableImportANROpt()) {
            z = true;
            if (this.LLILLL.size() > list.size()) {
                this.LLILLL = this.LLILLL.subList(0, list.size());
            }
        } else {
            z = false;
            this.LLILLL.clear();
        }
        int i = 0;
        for (Object obj : (ArrayList) this.LLILZIL) {
            int i2 = i + 1;
            if (i >= 0) {
                NLETrackSlot nLETrackSlot = (NLETrackSlot) obj;
                this.LLJI++;
                if (z) {
                    c368220Ec8 = (C368220Ec8) C13LP.LJJJLZIJ(i, this.LLILLL);
                    if (c368220Ec8 == null) {
                        c368220Ec8 = new C368220Ec8(getContext());
                        this.LLILLL.add(c368220Ec8);
                    }
                    C786410Ut5.Zc(c368220Ec8, 0.0f);
                } else {
                    c368220Ec8 = new C368220Ec8(getContext());
                }
                c368220Ec8.setId(this.LLJI);
                c368220Ec8.setShowTips(this.LLJJIJIIJIL);
                c368220Ec8.setItemTrackCallback(this.LLLIIII);
                c368220Ec8.setScrollHandler(this.LLJLIL);
                c368220Ec8.setOnDragListener(new C368040Ebq(this, c368220Ec8));
                c368220Ec8.setIndex(i);
                c368220Ec8.setDockerTopLevel(this.LLJJJJ);
                c368220Ec8.setEnableTransitionDuration$editor_trackpanel_release(getEnableTransitionDuration());
                ((ArrayList) this.LLILLJJLI).add(c368220Ec8);
                c368220Ec8.setFrameViewCallback(new InterfaceC369150Edd() { // from class: X.0EcN
                    @Override // X.InterfaceC369130Edb
                    public final boolean LIZ() {
                        InterfaceC368620Ecm keyframeOutListener = this.LIZ.getKeyframeOutListener();
                        return (keyframeOutListener == null || !keyframeOutListener.LIZ() || c368220Ec8.getStyle() == C0E6E.NONE) ? false : true;
                    }

                    @Override // X.InterfaceC369130Edb
                    public final NLETimeSpaceNode LIZIZ() {
                        InterfaceC368620Ecm keyframeOutListener = this.LIZ.getKeyframeOutListener();
                        if (keyframeOutListener != null) {
                            return keyframeOutListener.LIZIZ();
                        }
                        return null;
                    }

                    @Override // X.InterfaceC369150Edd
                    public final int LJII() {
                        InterfaceC368180Ec4 interfaceC368180Ec4 = this.LIZ.LLILZLL;
                        if (interfaceC368180Ec4 != null) {
                            return interfaceC368180Ec4.LJII();
                        }
                        return 0;
                    }

                    @Override // X.InterfaceC369150Edd
                    public final boolean LJIIIIZZ() {
                        return c368220Ec8.getStyle() == C0E6E.CLIP || c368220Ec8.getStyle() == C0E6E.LINE;
                    }
                });
                c368220Ec8.setFrameSelectChangeListener(this.LLLFZ);
                c368220Ec8.setViewAnimCallback(new InterfaceC369560EeI() { // from class: X.0EcZ
                    @Override // X.InterfaceC369560EeI
                    public final boolean LIZ() {
                        InterfaceC368180Ec4 interfaceC368180Ec4 = this.LIZ.LLILZLL;
                        return interfaceC368180Ec4 != null && interfaceC368180Ec4.LIZ() && c368220Ec8.getStyle() == C0E6E.LINE;
                    }
                });
                if (i != 0) {
                    jLIZ = LIZ(i);
                    jLIZIZ = LIZIZ(i);
                } else {
                    jLIZIZ = 0;
                    jLIZ = 0;
                }
                InterfaceC368180Ec4 interfaceC368180Ec4 = this.LLILZLL;
                if (interfaceC368180Ec4 != null) {
                    iLJII = interfaceC368180Ec4.LJII();
                } else {
                    iLJII = 0;
                }
                c368220Ec8.LJIIIIZZ(jLIZ, nLETrackSlot, iLJII, jLIZIZ);
                c368220Ec8.LJIILJJIL(this.LLJJJIL);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C355090Dw3.LJ("MultiTrackLayout", "reload! layoutInitItem");
        int i3 = 0;
        float f = 0.0f;
        for (Object obj2 : (ArrayList) this.LLILLJJLI) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                C368220Ec8 c368220Ec82 = (C368220Ec8) obj2;
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, C360610EBv.LIZLLL + ((this.LLJLILLLLZIIL + this.LLJLLIL) * 2));
                if (i3 != 0) {
                    c368220Ec82.setStartDivider(r1);
                    if (i3 < ((ArrayList) this.LLILLJJLI).size() - r1) {
                        c368220Ec82.setEndDivider(r1);
                    }
                    layoutParams.addRule(17, ((View) ListProtector.get(this.LLILLJJLI, i3 - 1)).getId());
                    fLIZ = LIZ(i3) * C360610EBv.LIZJ();
                    int i5 = (int) (fLIZ + f);
                    f += fLIZ - i5;
                    if (this.LLJJIJIL) {
                        layoutParams.setMarginStart(((this.LLJLL * (-2)) - i5) - 8);
                    } else {
                        layoutParams.setMarginStart(((this.LLJLL * (-2)) - (this.LLJLLIL * 2)) - i5);
                    }
                    c368220Ec82.LJIIJ();
                } else {
                    if (((ArrayList) this.LLILLJJLI).size() > r1) {
                        c368220Ec82.setEndDivider(r1);
                    }
                    fLIZ = 0.0f;
                }
                this.LLILZ.addView(c368220Ec82, layoutParams);
                if (i3 > 0) {
                    NLESegmentTransition endTransition = ((NLETrackSlot) ListProtector.get(this.LLILZIL, i3 - 1)).getEndTransition();
                    int i6 = (int) (fLIZ / 2);
                    int i7 = this.LLJLL + this.LLJLLIL + i6;
                    int iLIZIZ = C814420VxA.LIZIZ(LIZIZ(i3) * C360610EBv.LIZJ());
                    View view = new View(getContext());
                    if (!getEnableTransitionDuration()) {
                        iLIZIZ = C0FU0.LIZ(3.0f);
                    }
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iLIZIZ, C0FU0.LIZ(C368130Ebz.LJIIJ));
                    layoutParams2.addRule(18, c368220Ec82.getId());
                    layoutParams2.setMarginStart(i7 - (iLIZIZ / 2));
                    layoutParams2.addRule(15);
                    C786410Ut5.W5(view, layoutParams2);
                    if (getEnableTransitionDuration()) {
                        view.setBackground(LLLIIIIL.getValue().LIZ(view.getContext()));
                    } else {
                        Integer num = C368130Ebz.LIZJ(view.getContext()).LJ;
                        if (num != null) {
                            view.setBackgroundColor(num.intValue());
                        }
                    }
                    int i8 = this.LLJLL + this.LLJLLIL + i6;
                    if (endTransition != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    ImageView imageView = new ImageView(getContext());
                    Integer num2 = C368130Ebz.LIZJ(imageView.getContext()).LIZ;
                    if (num2 != null) {
                        dimension = num2.intValue();
                    } else {
                        dimension = (int) imageView.getResources().getDimension(R.dimen.aj8);
                    }
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(dimension, dimension);
                    layoutParams3.addRule(18, c368220Ec82.getId());
                    layoutParams3.setMarginStart(i8 - (dimension / 2));
                    layoutParams3.addRule(15);
                    C786410Ut5.c6(imageView, layoutParams3);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    Drawable drawable = getTrackTransitionCustomIcon().LIZJ;
                    if (drawable == null) {
                        drawable = imageView.getContext().getDrawable(R.drawable.bvy);
                    }
                    if (z3 && (drawable = getTrackTransitionCustomIcon().LIZLLL) == null) {
                        drawable = imageView.getContext().getDrawable(R.drawable.c3y);
                    }
                    if (C293810BfP.LIZ()) {
                        ViewGroup.LayoutParams layoutParams4 = imageView.getLayoutParams();
                        if (layoutParams4 != null) {
                            layoutParams4.height = -1;
                            C786410Ut5.W5(imageView, layoutParams4);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                    }
                    Drawable drawable2 = getTrackTransitionCustomIcon().LIZIZ;
                    if (drawable2 != null) {
                        imageView.setBackground(drawable2);
                    }
                    imageView.setImageDrawable(drawable);
                    this.LLILZ.addView(view);
                    this.LLILZ.addView(imageView);
                    boolean z4 = this.LLJZIJLIL;
                    C786410Ut5.Q7(imageView, new ACListenerS140S0100000_5(c368220Ec82, 112));
                    c368220Ec82.LLLIIIL = imageView;
                    imageView.setClickable(z4);
                    boolean z5 = this.LLJZIJLIL;
                    C786410Ut5.I7(new ACListenerS140S0100000_5(c368220Ec82, 130), view);
                    c368220Ec82.LLLIIL = view;
                    view.setClickable(z5);
                    c368220Ec82.LJIILL(EnumC368330EcJ.HIDE);
                    if (i3 == 1) {
                        this.LLLF = imageView;
                    }
                }
                i3 = i4;
                r1 = 1;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            ((C368220Ec8) it2.next()).setTransitionIconForceHidden(this.LLLI);
        }
        setSelectSlotStyle(this.LLJJI);
        int i9 = this.LLJILLL;
        if (i9 != -1 && LJ(i9)) {
            int i10 = 0;
            for (Object obj3 : (ArrayList) this.LLILLJJLI) {
                int i11 = i10 + 1;
                if (i10 >= 0) {
                    C368220Ec8 c368220Ec83 = (C368220Ec8) obj3;
                    if (i10 == this.LLJILLL) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c368220Ec83.setTransitionSelected(z2);
                    i10 = i11;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            for (View view2 : (ArrayList) this.LLILLJJLI) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view2);
                view2.setAlpha(0.34f);
            }
        }
        setEpilogueEnable(true);
        LJIIJ();
        Function0<Unit> function0 = this.LLJ;
        if (function0 != null) {
            function0.invoke();
        }
        Iterator it3 = ((ArrayList) this.LLILLJJLI).iterator();
        while (it3.hasNext()) {
            C368230Ec9 itemFrameViewFromXml = ((C368220Ec8) it3.next()).getItemFrameViewFromXml();
            if (itemFrameViewFromXml != null) {
                itemFrameViewFromXml.setOnBitmapFirstDrawn(null);
            }
        }
        C368220Ec8 c368220Ec84 = (C368220Ec8) C13LP.LJJLIIIJL(this.LLILLJJLI);
        if (c368220Ec84 != null) {
            c368220Ec84.setOnFirstBitmapCallback(new AwS549S0100000_5(this, 1224));
        }
    }

    public final boolean LJ(int i) {
        if ((!this.LLILZIL.isEmpty()) && (!this.LLILLJJLI.isEmpty()) && i >= 0 && i < this.LLILLJJLI.size()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LJFF();
    }

    public final void setAiExtendVisible(boolean z) {
        boolean z2;
        this.LLIZLLLIL = z;
        int i = 0;
        for (C368220Ec8 c368220Ec8 : this.LLILLJJLI) {
            int i2 = i + 1;
            if (i >= 0) {
                C368220Ec8 c368220Ec82 = c368220Ec8;
                if (i == C1697810uHb.LJIIJ(this.LLILLJJLI) && z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c368220Ec82.setIsAiExtendVisible(z2);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final void setClipCallback(InterfaceC368530Ecd interfaceC368530Ecd) {
        this.LLJL = interfaceC368530Ecd;
    }

    public final void setDockerTopLevel(Function0<Boolean> function0) {
        this.LLJJJJ = function0;
    }

    public final void setFirstTransitionIconView$editor_trackpanel_release(ImageView imageView) {
        this.LLLF = imageView;
    }

    public final void setIsCoverMode(boolean z) {
        this.LLJJIJIL = z;
    }

    public final void setItemFrameAlpha(float f) {
        for (View view : (ArrayList) this.LLILLJJLI) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
            view.setAlpha(f);
        }
    }

    public final void setKeyframeListener(InterfaceC368620Ecm interfaceC368620Ecm) {
        this.LLIZ = interfaceC368620Ecm;
    }

    public final void setKeyframeOutListener(InterfaceC368620Ecm interfaceC368620Ecm) {
        this.LLIZ = interfaceC368620Ecm;
    }

    public final void setLongClickEnable$editor_trackpanel_release(boolean z) {
        this.LLJJIII = z;
    }

    public final void setMultiTrackListener(InterfaceC368180Ec4 interfaceC368180Ec4) {
        this.LLILZLL = interfaceC368180Ec4;
    }

    public final void setMuteIcon(boolean z) {
        Iterator<C368220Ec8> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().setMuteIcon(z);
        }
    }

    public final void setOnSegmentsUpdated(Function0<Unit> function0) {
        this.LLJ = function0;
    }

    public final void setPreviewFullScreen(Function0<Boolean> function0) {
        this.LLJJJJJIL = function0;
    }

    public final void setScaleSize(double d) {
        int iLIZ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int dimension;
        this.LLJJJ = d;
        int i = 0;
        float f = 0.0f;
        for (Object obj : (ArrayList) this.LLILLJJLI) {
            int i2 = i + 1;
            RelativeLayout.LayoutParams layoutParams = null;
            if (i >= 0) {
                C368220Ec8 c368220Ec8 = (C368220Ec8) obj;
                c368220Ec8.LJIIJJI();
                if (i != 0) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) c368220Ec8.getLayoutParams();
                    float fLIZ = LIZ(i) * C360610EBv.LIZJ();
                    int i3 = (int) (fLIZ + f);
                    f += fLIZ - i3;
                    ImageView transitionIcon = c368220Ec8.getTransitionIcon();
                    if (transitionIcon != null) {
                        ViewGroup.LayoutParams layoutParams2 = transitionIcon.getLayoutParams();
                        if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                        } else {
                            marginLayoutParams = null;
                        }
                        Integer num = getTrackTransitionCustomIcon().LIZ;
                        if (num != null) {
                            dimension = num.intValue();
                        } else {
                            dimension = (int) getResources().getDimension(R.dimen.aj8);
                        }
                        if (marginLayoutParams != null) {
                            marginLayoutParams.setMarginStart((int) (((this.LLJLL + this.LLJLLIL) + (fLIZ / 2)) - (dimension / 2)));
                        }
                    }
                    View transitionHighlight = c368220Ec8.getTransitionHighlight();
                    if (transitionHighlight != null) {
                        ViewGroup.LayoutParams layoutParams3 = transitionHighlight.getLayoutParams();
                        if (layoutParams3 instanceof RelativeLayout.LayoutParams) {
                            layoutParams = (RelativeLayout.LayoutParams) layoutParams3;
                        }
                        if (getEnableTransitionDuration()) {
                            iLIZ = C814420VxA.LIZIZ(LIZIZ(i) * C360610EBv.LIZJ());
                        } else {
                            iLIZ = C0FU0.LIZ(3.0f);
                        }
                        if (layoutParams != null) {
                            layoutParams.width = iLIZ;
                            layoutParams.setMarginStart((int) (((this.LLJLL + this.LLJLLIL) + (fLIZ / 2)) - (iLIZ / 2)));
                        }
                    }
                    marginLayoutParams2.setMarginStart(((this.LLJLL * (-2)) - i3) - (this.LLJLLIL * 2));
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final void setSelectSlotStyle(C0E6E c0e6e) {
        int i = this.LLJJ;
        if (!LJ(i)) {
            return;
        }
        int i2 = C0E6F.LIZ[c0e6e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    setNormalType(Integer.valueOf(i));
                    return;
                }
                throw new C1954807lC();
            }
            LJII(i, false);
            return;
        }
        LJIIIIZZ(i, null);
    }

    public final void setSelectedTrackStyle(C0E6E c0e6e) {
        this.LLJJI = c0e6e;
    }

    public final void setSlotClickEnable$editor_trackpanel_release(boolean z) {
        this.LLJJIJI = z;
    }

    public final void setTrackScrollHandle$editor_trackpanel_release(InterfaceC369180Edg interfaceC369180Edg) {
        this.LLJLIL = interfaceC369180Edg;
    }

    public final void setTransitionIconForceHidden$editor_trackpanel_release(boolean z) {
        this.LLLI = z;
        Iterator<C368220Ec8> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().setTransitionIconForceHidden(z);
        }
    }

    public final void setTransitionSelect(int i) {
        boolean z;
        if (this.LLJILLL != i) {
            int i2 = 0;
            for (C368220Ec8 c368220Ec8 : this.LLILLJJLI) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C368220Ec8 c368220Ec82 = c368220Ec8;
                    if (i2 == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c368220Ec82.setTransitionSelected(z);
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            this.LLJILLL = i;
        }
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [X.0Ecb] */
    /* JADX WARN: Type inference failed for: r0v33, types: [X.0Ebr] */
    public C368010Ebn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = new ArrayList();
        this.LLILLL = new ArrayList();
        this.LLILZ = this;
        this.LLILZIL = new ArrayList();
        this.LLJI = 1001;
        this.LLJIJIL = new ImageView(context);
        this.LLJILLL = -1;
        this.LLJJ = -1;
        this.LLJJI = C0E6E.NONE;
        this.LLJJIII = true;
        this.LLJJIJI = true;
        this.LLJJIJIIJIL = true;
        this.LLJJJ = 1.0d;
        C368160Ec2 c368160Ec2 = new C368160Ec2();
        c368160Ec2.setDuration(200L);
        c368160Ec2.setFloatValues(0.0f, 1.0f);
        this.LLJJJJLIIL = c368160Ec2;
        this.LLJJL = C452501pT.LIZIZ(new AwS549S0100000_5(context, 1222));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(337));
        C368390EcP c368390EcPLIZ = C368130Ebz.LIZ(context);
        this.LLJLILLLLZIIL = c368390EcPLIZ.LJI;
        this.LLJLL = c368390EcPLIZ.LJFF;
        this.LLJLLIL = c368390EcPLIZ.LJII;
        this.LLJLLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1225));
        this.LLJZ = true;
        this.LLJZIJLIL = true;
        this.LLL = C452501pT.LIZIZ(new AwS406S0200000_5(this, context, 90));
        this.LLLFF = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(336));
        this.LLLFFI = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(335));
        this.LLLFZ = new InterfaceC369190Edh() { // from class: X.0Ecb
            @Override // X.InterfaceC369190Edh
            public final void LJ() {
                InterfaceC368620Ecm keyframeOutListener = this.LIZ.getKeyframeOutListener();
                if (keyframeOutListener != null) {
                    keyframeOutListener.LJ();
                }
            }

            @Override // X.InterfaceC369190Edh
            public final void LIZJ(NLETimeSpaceNode nLETimeSpaceNode) {
                InterfaceC368620Ecm keyframeOutListener = this.LIZ.getKeyframeOutListener();
                if (keyframeOutListener != null) {
                    keyframeOutListener.LIZJ(nLETimeSpaceNode);
                }
            }

            @Override // X.InterfaceC369190Edh
            public final void LIZLLL(long j) {
                InterfaceC368620Ecm keyframeOutListener = this.LIZ.getKeyframeOutListener();
                if (keyframeOutListener != null) {
                    keyframeOutListener.LIZLLL(j);
                }
            }
        };
        this.LLLII = C452501pT.LIZIZ(new AwS549S0100000_5(context, 1226));
        this.LLLIIII = new InterfaceC368360EcM() { // from class: X.0Ebr
            @Override // X.InterfaceC368360EcM
            public final void LJIIJ() {
            }

            @Override // X.InterfaceC368360EcM
            public final Bitmap LJIIIIZZ() {
                return this.LIZ.getThumbnailMaskBitmap();
            }

            @Override // X.InterfaceC368360EcM
            public final void onClipMainToMinDuration() {
                InterfaceC368180Ec4 interfaceC368180Ec4 = this.LIZ.LLILZLL;
                if (interfaceC368180Ec4 != null) {
                    interfaceC368180Ec4.onClipMainToMinDuration();
                }
            }

            @Override // X.InterfaceC368360EcM
            public final void LIZ(int i) {
                NLETrackSlot nLETrackSlot;
                InterfaceC368180Ec4 interfaceC368180Ec4;
                C368010Ebn c368010Ebn = this.LIZ;
                if (c368010Ebn.LLJJIJI && c368010Ebn.LJ(i) && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(i, this.LIZ.LLILZIL)) != null && (interfaceC368180Ec4 = this.LIZ.LLILZLL) != null) {
                    interfaceC368180Ec4.LJFF(i, nLETrackSlot);
                }
            }

            @Override // X.InterfaceC368360EcM
            public final void LIZLLL(int i) {
                C368010Ebn c368010Ebn;
                InterfaceC368530Ecd interfaceC368530Ecd;
                C368010Ebn c368010Ebn2 = this.LIZ;
                if (c368010Ebn2.LLJJIJI && c368010Ebn2.LJ(i) && (interfaceC368530Ecd = (c368010Ebn = this.LIZ).LLJL) != null) {
                    interfaceC368530Ecd.LIZIZ(i, (NLETrackSlot) ListProtector.get(c368010Ebn.LLILZIL, i));
                }
            }

            @Override // X.InterfaceC368360EcM
            public final boolean LJFF(int i) {
                InterfaceC368180Ec4 interfaceC368180Ec4;
                if (C13LP.LJJJLZIJ(i, this.LIZ.LLILZIL) != null && (interfaceC368180Ec4 = this.LIZ.LLILZLL) != null) {
                    interfaceC368180Ec4.LJIIJ();
                }
                return false;
            }

            @Override // X.InterfaceC368360EcM
            public final void LJI(int i) {
                C368010Ebn c368010Ebn = this.LIZ;
                InterfaceC368180Ec4 interfaceC368180Ec4 = c368010Ebn.LLILZLL;
                if (interfaceC368180Ec4 != null) {
                    interfaceC368180Ec4.LIZJ(i, (NLETrackSlot) ListProtector.get(c368010Ebn.LLILZIL, i - 1), (NLETrackSlot) ListProtector.get(this.LIZ.LLILZIL, i));
                }
            }

            @Override // X.InterfaceC368360EcM
            public final boolean LJII(int i) {
                int i2;
                boolean z;
                long j;
                int transitionDuration;
                if (i != 0 && !((ArrayList) this.LIZ.LLILZIL).isEmpty()) {
                    int i3 = i - 1;
                    if (i3 >= 0) {
                        NLETrackSlot nLETrackSlot = (NLETrackSlot) ListProtector.get(this.LIZ.LLILZIL, i3);
                        if (nLETrackSlot.getEndTransition() != null && !TextUtils.isEmpty(nLETrackSlot.getEndTransition().getEffectSDKTransition().getResourceFile())) {
                            return true;
                        }
                    }
                    int i4 = i - 2;
                    if (i4 >= 0) {
                        NLETrackSlot nLETrackSlot2 = (NLETrackSlot) ListProtector.get(this.LIZ.LLILZIL, i4);
                        if (nLETrackSlot2.getEndTransition() != null && !TextUtils.isEmpty(nLETrackSlot2.getEndTransition().getEffectSDKTransition().getResourceFile())) {
                            z = true;
                            NLESegmentTransition endTransition = nLETrackSlot2.getEndTransition();
                            if (endTransition != null) {
                                transitionDuration = (int) endTransition.getTransitionDuration();
                            } else {
                                transitionDuration = 0;
                            }
                            i2 = transitionDuration / LSPassThroughRecordSizeConfig.DEFAULT;
                        } else {
                            z = false;
                            i2 = 0;
                        }
                    } else {
                        i2 = 0;
                        z = false;
                    }
                    if (z) {
                        j = ((long) i2) + 200;
                    } else {
                        j = 200;
                    }
                    long duration = ((NLETimeSpaceNode) ListProtector.get(this.LIZ.LLILZIL, i)).getDuration();
                    long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
                    if (duration / j2 >= 200 && ((NLETimeSpaceNode) ListProtector.get(this.LIZ.LLILZIL, i3)).getDuration() / j2 >= j) {
                        return true;
                    }
                }
                return false;
            }

            @Override // X.InterfaceC368360EcM
            public final void LJIIIZ(int i) {
                C368010Ebn c368010Ebn;
                InterfaceC368530Ecd interfaceC368530Ecd;
                C368010Ebn c368010Ebn2 = this.LIZ;
                if (c368010Ebn2.LLJJIJI && c368010Ebn2.LJ(i) && (interfaceC368530Ecd = (c368010Ebn = this.LIZ).LLJL) != null) {
                    interfaceC368530Ecd.LIZJ((NLETrackSlot) ListProtector.get(c368010Ebn.LLILZIL, i));
                }
            }

            @Override // X.InterfaceC368360EcM
            public final void onUnableToSetTransition(int i) {
                InterfaceC368180Ec4 interfaceC368180Ec4 = this.LIZ.LLILZLL;
                if (interfaceC368180Ec4 != null) {
                    interfaceC368180Ec4.LJI();
                }
            }

            @Override // X.InterfaceC368360EcM
            public final Bitmap LIZIZ(int i, String str) {
                InterfaceC368180Ec4 interfaceC368180Ec4 = this.LIZ.LLILZLL;
                if (interfaceC368180Ec4 != null) {
                    return interfaceC368180Ec4.LIZIZ(i, str);
                }
                return null;
            }

            @Override // X.InterfaceC368360EcM
            public final float LJIIL(int i, long j, EnumC368970EdL enumC368970EdL) {
                List<Long> listLIZ;
                Long l;
                long startTime = (((NLETimeSpaceNode) ListProtector.get(this.LIZ.LLILZIL, i)).getStartTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) + j;
                InterfaceC368530Ecd interfaceC368530Ecd = this.LIZ.LLJL;
                if (interfaceC368530Ecd == null || (listLIZ = interfaceC368530Ecd.LIZ()) == null) {
                    listLIZ = C13BV.INSTANCE;
                }
                float fLIZ = C0FU0.LIZ(5.0f) / C360610EBv.LIZJ();
                if (enumC368970EdL == EnumC368970EdL.START) {
                    for (int size = listLIZ.size() - 1; -1 < size; size--) {
                        if (startTime - fLIZ <= ((Number) ListProtector.get(listLIZ, size)).longValue() && startTime >= ((Number) ListProtector.get(listLIZ, size)).longValue()) {
                            l = (Long) ListProtector.get(listLIZ, size);
                        }
                    }
                    return 0.0f;
                }
                int size2 = listLIZ.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if (startTime + fLIZ >= ((Number) ListProtector.get(listLIZ, i2)).longValue() && startTime <= ((Number) ListProtector.get(listLIZ, i2)).longValue()) {
                        l = (Long) ListProtector.get(listLIZ, i2);
                    }
                }
                return 0.0f;
                if (l != null) {
                    return (l.longValue() - startTime) * C360610EBv.LIZJ();
                }
                return 0.0f;
            }

            @Override // X.InterfaceC368360EcM
            public final void LIZJ(float f, int i, int i2, int i3) {
                int i4;
                C368010Ebn c368010Ebn = this.LIZ;
                if (!c368010Ebn.LLJJIJI) {
                    return;
                }
                InterfaceC368180Ec4 interfaceC368180Ec4 = c368010Ebn.LLILZLL;
                if (interfaceC368180Ec4 != null) {
                    interfaceC368180Ec4.onEditClipChange();
                }
                if (i3 == 0) {
                    for (int i5 = 0; i5 < i; i5++) {
                        if (this.LIZ.LIZLLL()) {
                            i4 = -i2;
                        } else {
                            i4 = i2;
                        }
                        C368220Ec8 c368220Ec8 = (C368220Ec8) ListProtector.get(this.LIZ.LLILLJJLI, i5);
                        float f2 = i4;
                        C786410Ut5.Zc(c368220Ec8, c368220Ec8.getTranslationX() + f2);
                        ImageView transitionIcon = ((C368220Ec8) ListProtector.get(this.LIZ.LLILLJJLI, i5)).getTransitionIcon();
                        if (transitionIcon != null) {
                            C786410Ut5.Lc(transitionIcon, transitionIcon.getTranslationX() + f2);
                        }
                        View transitionHighlight = ((C368220Ec8) ListProtector.get(this.LIZ.LLILLJJLI, i5)).getTransitionHighlight();
                        if (transitionHighlight != null) {
                            C786410Ut5.Jc(transitionHighlight, transitionHighlight.getTranslationX() + f2);
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("this is index is ");
                        sbLIZ.append(i5);
                        sbLIZ.append(" move is ");
                        sbLIZ.append(f);
                        C355090Dw3.LIZIZ("MultiTrackLayout", C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            }

            @Override // X.InterfaceC368360EcM
            public final void LJIIJJI(float f, int i, int i2, int i3) {
                long duration;
                NLEResourceNode resource;
                long duration2;
                NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) ((NLETrackSlot) ListProtector.get(this.LIZ.LLILZIL, i)).getMainSegment());
                if (nLESegmentVideoDynamicCast == null) {
                    return;
                }
                long jAbs = (long) ((Math.abs(i2) / C360610EBv.LIZJ()) * C351220Dpo.LIZ(nLESegmentVideoDynamicCast));
                long jLIZJ = C814420VxA.LIZJ((f / C360610EBv.LIZJ()) * C351220Dpo.LIZ(nLESegmentVideoDynamicCast));
                if (!nLESegmentVideoDynamicCast.getSegCurveSpeedPoints().isEmpty()) {
                    if (i3 == 1) {
                        jAbs = nLESegmentVideoDynamicCast.getTimeClipStart() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                        jLIZJ = C814420VxA.LIZJ((f / C360610EBv.LIZJ()) * C351220Dpo.LIZ(nLESegmentVideoDynamicCast));
                    } else {
                        jAbs = (nLESegmentVideoDynamicCast.getTimeClipEnd() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - C814420VxA.LIZJ((f / C360610EBv.LIZJ()) * C351220Dpo.LIZ(nLESegmentVideoDynamicCast));
                    }
                }
                NLEResourceNode resource2 = nLESegmentVideoDynamicCast.getResource();
                if (resource2 != null) {
                    duration = resource2.getDuration();
                } else {
                    duration = 0;
                }
                long j = LSPassThroughRecordSizeConfig.DEFAULT;
                long j2 = duration / j;
                if (Math.abs(jLIZJ - j2) < 3) {
                    jLIZJ = j2;
                }
                NLETrackSlot nLETrackSlot = (NLETrackSlot) ListProtector.get(this.LIZ.LLILZIL, i);
                C351510DqH.LIZ.getClass();
                if (C351510DqH.LJJIL(nLETrackSlot)) {
                    resource = C351510DqH.LJJIIJZLJL(nLETrackSlot);
                } else {
                    resource = nLETrackSlot.getMainSegment().getResource();
                }
                if (resource != null) {
                    duration2 = resource.getDuration() / j;
                } else {
                    duration2 = 0;
                }
                if (!C351220Dpo.LLJJIJIL(nLETrackSlot) && jAbs + jLIZJ > duration2) {
                    jLIZJ = ((long) (((int) nLESegmentVideoDynamicCast.getResource().getDuration()) / LSPassThroughRecordSizeConfig.DEFAULT)) - jAbs;
                }
                C368010Ebn c368010Ebn = this.LIZ;
                InterfaceC368180Ec4 interfaceC368180Ec4 = c368010Ebn.LLILZLL;
                if (interfaceC368180Ec4 != null) {
                    interfaceC368180Ec4.onStartAndDuration((NLETrackSlot) ListProtector.get(c368010Ebn.LLILZIL, i), jAbs, jLIZJ, i3);
                }
                C368220Ec8 c368220Ec8LIZJ = this.LIZ.getBlackSlotContainer().LIZJ();
                if (c368220Ec8LIZJ != null && i == c368220Ec8LIZJ.getIndex()) {
                    Iterator it2 = ((ArrayList) this.LIZ.LLILLJJLI).iterator();
                    while (it2.hasNext()) {
                        C786410Ut5.Zc((C368220Ec8) it2.next(), 0.0f);
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("start is ");
                sbLIZ.append(jAbs);
                sbLIZ.append(" duration is ");
                sbLIZ.append(jLIZJ);
                C355090Dw3.LIZIZ("MultiTrackLayout", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC368360EcM
            public final void LJ(float f, int i, long j, long j2, int i2, float f2) {
                InterfaceC368530Ecd interfaceC368530Ecd;
                C368010Ebn c368010Ebn = this.LIZ;
                if (c368010Ebn.LLJJIJI && c368010Ebn.LJ(i2) && (!((ArrayList) this.LIZ.LLILZIL).isEmpty())) {
                    NLETrackSlot nLETrackSlot = (NLETrackSlot) ListProtector.get(this.LIZ.LLILZIL, i2);
                    if (i != 0) {
                        if (i == 1 && (interfaceC368530Ecd = this.LIZ.LLJL) != null) {
                            interfaceC368530Ecd.LIZLLL(nLETrackSlot, f, i, j, j2, i2, f2);
                        }
                    } else {
                        InterfaceC368530Ecd interfaceC368530Ecd2 = this.LIZ.LLJL;
                        if (interfaceC368530Ecd2 != null) {
                            interfaceC368530Ecd2.LIZLLL(nLETrackSlot, f, i, j, j2, i2, -f2);
                        }
                    }
                    List<C368220Ec8> list = this.LIZ.LLILLJJLI;
                    ArrayList<C368220Ec8> arrayList = new ArrayList();
                    for (Object obj : (ArrayList) list) {
                        if (((C368220Ec8) obj).getIndex() != i2) {
                            arrayList.add(obj);
                        }
                    }
                    for (C368220Ec8 c368220Ec8 : arrayList) {
                        if (i == 0) {
                            if (c368220Ec8.getIndex() < i2) {
                                c368220Ec8.getItemFrameViewFromXml().invalidate();
                            }
                        } else if (i == 1 && c368220Ec8.getIndex() > i2) {
                            c368220Ec8.getItemFrameViewFromXml().invalidate();
                        }
                    }
                }
            }
        };
    }

    public final void LJII(int i, boolean z) {
        if (!LJ(i)) {
            return;
        }
        ((C368220Ec8) ListProtector.get(this.LLILLJJLI, i)).setClipType(z);
        Iterator<C368220Ec8> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LJFF(true);
        }
        int i2 = i + 1;
        if (LJ(i2)) {
            ((C368220Ec8) ListProtector.get(this.LLILLJJLI, i2)).LJFF(false);
        }
        ((C368220Ec8) ListProtector.get(this.LLILLJJLI, i)).LJFF(false);
        if (i > 0) {
            ((C368220Ec8) ListProtector.get(this.LLILLJJLI, i - 1)).setDrawMyTransitionOverlap(false);
        }
        if (i < ((ArrayList) this.LLILLJJLI).size() - 1) {
            ((C368220Ec8) ListProtector.get(this.LLILLJJLI, i2)).setDrawPreTransitionOverlap(false);
        }
        this.LLJJI = C0E6E.CLIP;
    }

    public final void LJIIIIZZ(int i, Boolean bool) {
        C368210Ec7 animMaskFromXml;
        if (!LJ(i)) {
            return;
        }
        ((C368220Ec8) ListProtector.get(this.LLILLJJLI, i)).setLineType(bool);
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            ((C368220Ec8) it2.next()).LJFF(true);
        }
        NLETrackSlot nLETrackSlot = (NLETrackSlot) ListProtector.get(this.LLILZIL, i);
        C368220Ec8 c368220Ec8 = (C368220Ec8) ListProtector.get(this.LLILLJJLI, i);
        c368220Ec8.LLJJJ = nLETrackSlot;
        if (C351230Dpp.LJ(null) && (animMaskFromXml = c368220Ec8.getAnimMaskFromXml()) != null) {
            animMaskFromXml.LIZJ(nLETrackSlot, c368220Ec8.LLJILJILJ);
        }
        if (C347020Dj2.LIZIZ(nLETrackSlot)) {
            int i2 = i + 1;
            if (LJ(i2)) {
                ((C368220Ec8) ListProtector.get(this.LLILLJJLI, i2)).LJFF(false);
            }
        }
        if (i > 0) {
            ((C368220Ec8) ListProtector.get(this.LLILLJJLI, i - 1)).setDrawMyTransitionOverlap(false);
        }
        if (i < ((ArrayList) this.LLILLJJLI).size() - 1) {
            ((C368220Ec8) ListProtector.get(this.LLILLJJLI, i + 1)).setDrawPreTransitionOverlap(false);
        }
        this.LLJJI = C0E6E.LINE;
    }

    public final void LJI(int i, C0E6E c0e6e, boolean z, Boolean bool) {
        if (!LJ(i)) {
            return;
        }
        int i2 = this.LLJJ;
        if (i2 != i) {
            setNormalType(Integer.valueOf(i2));
        }
        int i3 = C0E6F.LIZ[c0e6e.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                LJII(i, z);
            }
        } else {
            LJIIIIZZ(i, bool);
        }
        this.LLJJ = i;
        LJIIJ();
    }
}
