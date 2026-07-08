package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.android.editor.track.PlayPositionState;
import com.ss.ugc.android.editor.track.TrackShowType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E8m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C359740E8m extends AbstractC1664490tPr<C359400E7e, C359370E7b> implements InterfaceC359430E7h {
    public static final int LLL = C360610EBv.LIZJ * 5;
    public C368000Ebm LLJJJIL;
    public C368010Ebn LLJJJJ;
    public C368630Ecn LLJJJJJIL;
    public C368680Ecs LLJJJJLIIL;
    public C369010EdP LLJJL;
    public InterfaceC359760E8o LLJJLIIIJLLLLLLLZ;
    public long LLJL;
    public C358410E3j LLJLIL;
    public C358500E3s LLJLILLLLZIIL;
    public Function0<Unit> LLJLL;
    public final C359450E7j LLJLLIL = new InterfaceC369210Edj() { // from class: X.0E7j
        @Override // X.InterfaceC369210Edj
        public final void LIZIZ(C368830Ed7 c368830Ed7) {
            C358410E3j c358410E3j = this.LIZ.LLJLIL;
            if (c358410E3j != null) {
                ((ArrayList) c358410E3j.LIZJ).add(c368830Ed7);
            }
        }

        @Override // X.InterfaceC369210Edj
        public final Bitmap LIZ(int i, String str) {
            return this.LIZ.LLLLIL().LIZ.LIZ(i, str);
        }
    };
    public final C0E8O LLJLLL = new InterfaceC21574019bu() { // from class: X.0E8O
        @Override // X.InterfaceC21574019bu
        public final void onScaleBegin() {
            C368010Ebn c368010Ebn = this.LIZ.LLJJJJ;
            if (c368010Ebn != null) {
                Iterator it2 = ((ArrayList) c368010Ebn.LLILLJJLI).iterator();
                while (it2.hasNext()) {
                    it2.next().getClass();
                }
            }
            this.LIZ.LLLLIL().LIZJ.onScaleBegin();
        }

        @Override // X.InterfaceC21574019bu
        public final void onScaleEnd() {
            C368010Ebn c368010Ebn = this.LIZ.LLJJJJ;
            if (c368010Ebn != null) {
                Iterator it2 = ((ArrayList) c368010Ebn.LLILLJJLI).iterator();
                while (it2.hasNext()) {
                    it2.next().getClass();
                }
            }
            this.LIZ.LLLLIL().LIZJ.onScaleEnd();
        }

        @Override // X.InterfaceC21574019bu
        public final boolean LIZ(C21573919bt c21573919bt) {
            Double dValueOf;
            C368000Ebm c368000Ebm = this.LIZ.LLJJJIL;
            Double dValueOf2 = null;
            if (c368000Ebm != null) {
                dValueOf = Double.valueOf(c368000Ebm.getScale());
            } else {
                dValueOf = null;
            }
            if (!Intrinsics.LIZIZ(dValueOf, 0.1d) || c21573919bt.LIZIZ() >= 1.0f) {
                C368000Ebm c368000Ebm2 = this.LIZ.LLJJJIL;
                if (c368000Ebm2 != null) {
                    dValueOf2 = Double.valueOf(c368000Ebm2.getScale());
                }
                if (!Intrinsics.LIZIZ(dValueOf2, 10.0d) || c21573919bt.LIZIZ() <= 1.0f) {
                    C359740E8m c359740E8m = this.LIZ;
                    C368000Ebm c368000Ebm3 = c359740E8m.LLJJJIL;
                    if (c368000Ebm3 != null) {
                        c368000Ebm3.updateScale(c21573919bt.LIZIZ(), true);
                    }
                    C0E8N c0e8n = c359740E8m.LLLLIL().LIZJ;
                    c21573919bt.LIZIZ();
                    c0e8n.LIZ();
                    return true;
                }
            }
            return true;
        }
    };
    public final C359630E8b LLJZ = new InterfaceC368580Eci() { // from class: X.0E8b
        public int LIZ;

        @Override // X.InterfaceC368580Eci
        public final boolean LIZ() {
            return this.LIZIZ.LLLLIL().LJI.LIZJ();
        }

        @Override // X.InterfaceC368580Eci
        public final void LIZLLL() {
            C359740E8m c359740E8m = this.LIZIZ;
            c359740E8m.LLLLLLJ(c359740E8m.LLLLILI().LIZ.LIZJ.LJFF, this.LIZIZ.LLLLILI().LIZ.LJ);
            C359740E8m c359740E8m2 = this.LIZIZ;
            c359740E8m2.LLLLLLIL(c359740E8m2.LLLLILI().LIZ.LIZLLL);
        }

        @Override // X.InterfaceC368580Eci
        public final void LIZIZ(long j) {
            NLEModel nLEModel;
            NLETrack mainTrack;
            int iIntValue;
            C0E75 c0e75 = this.LIZIZ.LLLLILI().LIZ.LIZLLL;
            if (c0e75.LIZ && (nLEModel = this.LIZIZ.LLLLILI().LIZ.LIZJ.LIZ) != null && (mainTrack = nLEModel.getMainTrack()) != null) {
                C0E8N c0e8n = this.LIZIZ.LLLLIL().LIZJ;
                Integer num = c0e75.LIZLLL;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = -1;
                }
                c0e8n.LIZLLL(iIntValue, j, mainTrack);
            }
        }

        @Override // X.InterfaceC368580Eci
        public final void LJ(double d) {
            C368010Ebn c368010Ebn = this.LIZIZ.LLJJJJ;
            if (c368010Ebn != null) {
                c368010Ebn.setScaleSize(d);
            }
            C368010Ebn c368010Ebn2 = this.LIZIZ.LLJJJJ;
            if (c368010Ebn2 != null && !c368010Ebn2.LLJILJILJ) {
                float fLIZJ = c368010Ebn2.LL * C360610EBv.LIZJ();
                ViewGroup.LayoutParams layoutParams = c368010Ebn2.LLJIJIL.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = Math.round(fLIZJ);
                    C786410Ut5.c6(c368010Ebn2.LLJIJIL, layoutParams);
                }
            }
            this.LIZIZ.LLLLIL().LIZ.LIZIZ(false);
            C368010Ebn c368010Ebn3 = this.LIZIZ.LLJJJJ;
            if (c368010Ebn3 != null) {
                c368010Ebn3.requestLayout();
            }
        }

        @Override // X.InterfaceC368580Eci
        public final void LIZJ(int i, boolean z, boolean z2) {
            NLETrackSlot nLETrackSlot;
            C368010Ebn c368010Ebn = this.LIZIZ.LLJJJJ;
            if (c368010Ebn != null) {
                c368010Ebn.LLJJJIL = i;
                Iterator it2 = ((ArrayList) c368010Ebn.LLILLJJLI).iterator();
                while (it2.hasNext()) {
                    ((C368220Ec8) it2.next()).LJIILJJIL(i);
                }
                List<C368220Ec8> list = c368010Ebn.LLILLJJLI;
                ArrayList<C368220Ec8> arrayList = new ArrayList();
                for (Object obj : (ArrayList) list) {
                    if (((C368220Ec8) obj).getStyle() != C0E6E.NONE) {
                        arrayList.add(obj);
                    }
                }
                for (C368220Ec8 c368220Ec8 : arrayList) {
                    if (c368220Ec8.LLJILJILJ != C0E6E.NONE) {
                        C368290EcF c368290EcF = c368220Ec8.LLLIIIIL;
                        if (c368290EcF.getVisibility() == 0 && (nLETrackSlot = c368290EcF.LLILLJJLI) != null) {
                            c368290EcF.LL.LJFF(nLETrackSlot);
                        }
                    }
                }
            }
            if (Math.abs(i - this.LIZ) >= C359740E8m.LLL || z2) {
                this.LIZIZ.LLLLIL().LIZ.LIZIZ(z);
                this.LIZ = i;
            }
        }
    };
    public final C0E8C LLJZIJLIL = new C0E8C(this);

    @Override // X.InterfaceC359430E7h
    public final double A9() {
        C368000Ebm c368000Ebm = this.LLJJJIL;
        if (c368000Ebm != null) {
            return c368000Ebm.getScale();
        }
        return 1.0d;
    }

    @Override // X.InterfaceC359430E7h
    public final void Zv() {
        C368000Ebm c368000Ebm = this.LLJJJIL;
        if (c368000Ebm != null) {
            c368000Ebm.scrollToTrackEnd();
        }
    }

    @Override // X.InterfaceC359430E7h
    public final void ai() {
        C368630Ecn c368630Ecn = this.LLJJJJJIL;
        if (c368630Ecn != null) {
            C368640Eco clipHelper = c368630Ecn.getClipHelper();
            Map<NLETrackSlot, C369110EdZ> map = c368630Ecn.LLLI;
            Pair<? extends NLETrackSlot, C369110EdZ> pair = clipHelper.LJJIJL;
            if (pair != null) {
                clipHelper.LJIILIIL(map, pair);
                clipHelper.LIZ.invalidate();
            }
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        InterfaceC359760E8o interfaceC359760E8o = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC359760E8o != null) {
            interfaceC359760E8o.dispose();
        }
        this.LLJJLIIIJLLLLLLLZ = null;
        super.onDestroyView();
    }

    @Override // X.AbstractC1664490tPr, com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        Function0<Unit> function0 = this.LLJLL;
        if (function0 != null) {
            function0.invoke();
        }
        this.LLJLL = null;
        InterfaceC359760E8o interfaceC359760E8o = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC359760E8o != null) {
            interfaceC359760E8o.LIZIZ();
        }
    }

    @Override // X.InterfaceC359430E7h
    public final View xg() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC359430E7h
    public final InterfaceC368720Ecw Ji(Function1<? super NLETrackSlot, Boolean> function1) {
        C368630Ecn c368630Ecn = this.LLJJJJJIL;
        if (c368630Ecn == null) {
            return null;
        }
        for (Map.Entry entry : ((LinkedHashMap) c368630Ecn.LLLI).entrySet()) {
            Object key = entry.getKey();
            C369110EdZ c369110EdZ = (C369110EdZ) entry.getValue();
            if (function1.invoke(key).booleanValue()) {
                return c369110EdZ.LIZIZ;
            }
        }
        return null;
    }

    public final void LLLLLJIL(long j) {
        long endTime = 0;
        int iLJII = 0;
        if (((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_BLACK_SLOT_OPERATE, Boolean.FALSE)).booleanValue()) {
            C368010Ebn c368010Ebn = this.LLJJJJ;
            if (c368010Ebn != null) {
                c368010Ebn.LLJILJILJ = true;
                NLETrackSlot nLETrackSlotLIZLLL = c368010Ebn.getBlackSlotContainer().LIZLLL();
                C368220Ec8 c368220Ec8LIZJ = c368010Ebn.getBlackSlotContainer().LIZJ();
                C19719512Dh.LIZ(c368010Ebn.LLILZIL).remove(nLETrackSlotLIZLLL);
                C19719512Dh.LIZ(c368010Ebn.LLILLJJLI).remove(c368220Ec8LIZJ);
                if (j == 0) {
                    c368010Ebn.getBlackSlotContainer().LJ();
                    C368010Ebn c368010Ebn2 = c368010Ebn.LLILZ;
                    RemoveViewCausedNPEChecker.recordViewRemovedPoint(c368010Ebn2, c368220Ec8LIZJ);
                    c368010Ebn2.removeView(c368220Ec8LIZJ);
                    c368010Ebn.LJIIJ();
                } else {
                    NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) C13LP.LJJLIIIJL(c368010Ebn.LLILZIL);
                    if (nLETimeSpaceNode != null) {
                        endTime = nLETimeSpaceNode.getEndTime();
                    }
                    NLETrackSlot nLETrackSlotLIZIZ = c368010Ebn.getBlackSlotContainer().LIZIZ(endTime, j);
                    if (c368220Ec8LIZJ == null) {
                        c368220Ec8LIZJ = c368010Ebn.getBlackSlotContainer().LIZ();
                    }
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, C360610EBv.LIZLLL + ((c368010Ebn.LLJLILLLLZIIL + c368010Ebn.LLJLLIL) * 2));
                    View view = (View) C13LP.LJJLIIIJL(c368010Ebn.LLILLJJLI);
                    if (view != null) {
                        layoutParams.addRule(17, view.getId());
                    }
                    layoutParams.setMarginStart((c368010Ebn.LLJLL * (-2)) - (c368010Ebn.LLJLLIL * 2));
                    if (c368220Ec8LIZJ.getParent() == null) {
                        c368220Ec8LIZJ.LJIIJ();
                        c368220Ec8LIZJ.setItemTrackCallback(c368010Ebn.LLLIIII);
                        c368220Ec8LIZJ.setScrollHandler(c368010Ebn.LLJLIL);
                        c368010Ebn.LLILZ.addView(c368220Ec8LIZJ, layoutParams);
                    }
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c368220Ec8LIZJ);
                    c368220Ec8LIZJ.setLayoutParams(layoutParams);
                    InterfaceC368180Ec4 interfaceC368180Ec4 = c368010Ebn.LLILZLL;
                    if (interfaceC368180Ec4 != null) {
                        iLJII = interfaceC368180Ec4.LJII();
                    }
                    c368220Ec8LIZJ.LJIIIIZZ(0L, nLETrackSlotLIZIZ, iLJII, 0L);
                    c368220Ec8LIZJ.setIndex(((ArrayList) c368010Ebn.LLILLJJLI).size());
                    ((ArrayList) c368010Ebn.LLILZIL).add(nLETrackSlotLIZIZ);
                    ((ArrayList) c368010Ebn.LLILLJJLI).add(c368220Ec8LIZJ);
                    c368010Ebn.LJIIJ();
                    c368010Ebn.setSelectSlotStyle(c368010Ebn.LLJJI);
                }
            }
        } else {
            C368010Ebn c368010Ebn3 = this.LLJJJJ;
            if (c368010Ebn3 != null) {
                c368010Ebn3.LLJILJILJ = false;
                c368010Ebn3.LL = j / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                C368010Ebn c368010Ebn4 = c368010Ebn3.LLILZ;
                ImageView imageView = c368010Ebn3.LLJIJIL;
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(c368010Ebn4, imageView);
                c368010Ebn4.removeView(imageView);
                if (j != 0) {
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(Math.round(c368010Ebn3.LL * C360610EBv.LIZJ()), C360610EBv.LIZLLL);
                    if (true ^ ((ArrayList) c368010Ebn3.LLILLJJLI).isEmpty()) {
                        layoutParams2.addRule(17, ((View) C13LP.LJJLIIIJJI(c368010Ebn3.LLILLJJLI)).getId());
                        layoutParams2.setMarginStart(-(c368010Ebn3.LLJLL + c368010Ebn3.LLJLLIL));
                        layoutParams2.addRule(15);
                    }
                    C786410Ut5.V4(c368010Ebn3.LLJIJIL, 0.5f);
                    c368010Ebn3.LLJIJIL.setBackgroundColor(ColorProtector.parseColor("#545454"));
                    c368010Ebn3.LLILZ.addView(c368010Ebn3.LLJIJIL, 0, layoutParams2);
                }
            }
        }
        this.LLJL = j;
    }

    public final void LLLLLJLJLL(List<? extends NLETrackSlot> list) {
        C368010Ebn c368010Ebn = this.LLJJJJ;
        if (c368010Ebn != null) {
            c368010Ebn.LIZJ(list);
        }
        LLLLLJIL(this.LLJL);
        if (((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_MULTITHREADED_OPT, Boolean.FALSE)).booleanValue()) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<? extends NLETrackSlot> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(NLETrackSlot.dynamicCast(it2.next().deepClone()));
            }
            List<? extends NLETrackSlot> listLLIIII = C13LP.LLIIII(arrayList);
            C358500E3s c358500E3s = this.LLJLILLLLZIIL;
            if (c358500E3s != null) {
                c358500E3s.LIZLLL = listLLIIII;
            }
        } else {
            C358500E3s c358500E3s2 = this.LLJLILLLLZIIL;
            if (c358500E3s2 != null) {
                c358500E3s2.LIZLLL = list;
            }
        }
        LLLLIL().LIZ.LIZIZ(false);
    }

    public final void LLLLLLIL(C0E75 c0e75) {
        int iIntValue;
        if (c0e75.LIZIZ != null && c0e75.LIZJ != null) {
            if (c0e75.LIZ) {
                C368010Ebn c368010Ebn = this.LLJJJJ;
                if (c368010Ebn != null) {
                    Integer num = c0e75.LIZLLL;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = -1;
                    }
                    c368010Ebn.LJI(iIntValue, c0e75.LJ, c0e75.LJII, c0e75.LJIIJ);
                }
            } else {
                C368010Ebn c368010Ebn2 = this.LLJJJJ;
                if (c368010Ebn2 != null) {
                    c368010Ebn2.LJIIIZ();
                }
            }
        } else {
            C368010Ebn c368010Ebn3 = this.LLJJJJ;
            if (c368010Ebn3 != null) {
                c368010Ebn3.LJIIIZ();
            }
        }
        C368000Ebm c368000Ebm = this.LLJJJIL;
        if (c368000Ebm != null) {
            c368000Ebm.setSubTrackSelectState(c0e75);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C359780E8q.LIZ("init-TrackPanelV2-Scene", new AwS549S0100000_5(this, 903));
    }

    @Override // X.InterfaceC359430E7h
    public final void pl(float f) {
        C368000Ebm c368000Ebm = this.LLJJJIL;
        if (c368000Ebm != null) {
            c368000Ebm.updateScale(f, true);
        }
    }

    public static Rect LLLLLL(AbstractC368670Ecr abstractC368670Ecr, View view) {
        if (abstractC368670Ecr.isShown() && abstractC368670Ecr.getWidth() > 0 && abstractC368670Ecr.getHeight() > 0) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            if (!view.getGlobalVisibleRect(rect) || !abstractC368670Ecr.getGlobalVisibleRect(rect2)) {
                return null;
            }
            Rect rect3 = new Rect();
            if (!rect3.setIntersect(rect, rect2)) {
                return null;
            }
            rect3.offset(-rect.left, -rect.top);
            if (rect3.width() > 0 && rect3.height() > 0) {
                return rect3;
            }
        }
        return null;
    }

    public final void LLLLLLJ(C0E7P c0e7p, C359620E8a c359620E8a) {
        NLETrackSlot nLETrackSlot;
        C201955140j.LIZLLL(C563650M8t.LIZIZ, "TrackPanelSceneV2", "updateSubTrack-TrackGroup");
        C0E75 c0e75 = LLLLILI().LIZ.LIZLLL;
        NLETrack nLETrack = c0e75.LIZIZ;
        if (nLETrack != null && nLETrack.getMainTrack()) {
            nLETrackSlot = null;
        } else {
            nLETrackSlot = c0e75.LIZJ;
        }
        TrackShowType trackShowType = c359620E8a.LIZ;
        List<C350030Dnt> listLIZ = C0E7O.LIZ(c0e7p, trackShowType);
        C368000Ebm c368000Ebm = this.LLJJJIL;
        if (c368000Ebm != null) {
            c368000Ebm.setSubTrackState(LLLLILI().LIZ.LIZJ.LIZ, listLIZ, nLETrackSlot, trackShowType);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        C368010Ebn multiTrackFromXml;
        C368630Ecn subTrackGroupFromXml;
        C368680Ecs scrollContainerFromXml;
        super.onViewCreated(view, bundle);
        C368000Ebm c368000Ebm = this.LLJJJIL;
        C369010EdP frameScrollerFromXml = null;
        if (c368000Ebm != null) {
            multiTrackFromXml = c368000Ebm.getMultiTrackFromXml();
        } else {
            multiTrackFromXml = null;
        }
        this.LLJJJJ = multiTrackFromXml;
        C368000Ebm c368000Ebm2 = this.LLJJJIL;
        if (c368000Ebm2 != null) {
            subTrackGroupFromXml = c368000Ebm2.getSubTrackGroupFromXml();
        } else {
            subTrackGroupFromXml = null;
        }
        this.LLJJJJJIL = subTrackGroupFromXml;
        C368000Ebm c368000Ebm3 = this.LLJJJIL;
        if (c368000Ebm3 != null) {
            scrollContainerFromXml = c368000Ebm3.getScrollContainerFromXml();
        } else {
            scrollContainerFromXml = null;
        }
        this.LLJJJJLIIL = scrollContainerFromXml;
        C368000Ebm c368000Ebm4 = this.LLJJJIL;
        if (c368000Ebm4 != null) {
            frameScrollerFromXml = c368000Ebm4.getFrameScrollerFromXml();
        }
        this.LLJJL = frameScrollerFromXml;
        if (((Boolean) C275410Aqp.LIZ.getValue()).booleanValue()) {
            this.LLJJLIIIJLLLLLLLZ = C20298714bh.LIZ(view, new AwS584S0100000_5(this, 769));
        }
    }

    @Override // X.InterfaceC359430E7h
    public final void zv(PlayPositionState playPositionState, boolean z) {
        C368000Ebm c368000Ebm = this.LLJJJIL;
        if (c368000Ebm != null) {
            c368000Ebm.updatePlayState(playPositionState, false, z);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C368000Ebm c368000Ebm = new C368000Ebm(requireSceneContext(), (C19EG) requireActivity(), null, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c368000Ebm);
        c368000Ebm.setLayoutParams(layoutParams);
        c368000Ebm.init(layoutInflater);
        this.LLJJJIL = c368000Ebm;
        return c368000Ebm;
    }
}
