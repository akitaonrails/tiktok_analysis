package X;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.android.live.linkmic.LivePublicScreenClipChannel;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.utils.MultiGuestNewLayoutLayerPanelFixPublicScreenFixSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.utils.MultiGuestPublicScreenBottomFixSetting;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMgPreviewLivePageSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aYG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C939340aYG implements LifecycleOwner {
    public final DataChannel LL;
    public final C939350aYH LLILLJJLI;
    public final LifecycleRegistry LLILLL = new LifecycleRegistry(this);
    public final C11NJ LLILZ = new C11NJ();

    public final void LIZIZ() {
        Object obj;
        Object next;
        PosIdentity posIdentity;
        PosIdentity posIdentity2;
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        if (C937310aUz.LIZJ(C940770aaZ.LIZ().getDataSource()) && this.LL.gg0(SubOnlyLiveAudienceStatusChannel.class) != C0II9.NON_SUBSCRIBER_FORBIDDEN_LIVE) {
            List<C957020b0m> listLJIIIZ = C940770aaZ.LIZ().getDataSource().LJIIIZ();
            ArrayList<C957020b0m> arrayList2 = new ArrayList();
            for (C957020b0m c957020b0m : listLJIIIZ) {
                if (true ^ c957020b0m.LLJIJIL) {
                    arrayList2.add(c957020b0m);
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sendClipEvent size=");
            sbLIZ.append(arrayList2.size());
            C937310aUz.LJII("MultiGuestPublicScreenHelper", C2188811AlT.LIZIZ(sbLIZ));
            float currentCornerRadiusOfAudience = 0.0f;
            for (C957020b0m c957020b0m2 : arrayList2) {
                int[] iArr = new int[2];
                c957020b0m2.getLocationOnScreen(iArr);
                int i = iArr[0];
                Rect rect = new Rect(i, iArr[1], c957020b0m2.getShapeDescriptor().LIZ.width() + i, iArr[1] + c957020b0m2.getShapeDescriptor().LIZ.height());
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("sendClipEvent rect=");
                sbLIZ2.append(rect);
                C937310aUz.LJII("MultiGuestPublicScreenHelper", C2188811AlT.LIZIZ(sbLIZ2));
                if (!C936720aU2.LIZIZ() || (((posIdentity = c957020b0m2.getPosIdentity()) == null || posIdentity.type != 1) && ((posIdentity2 = c957020b0m2.getPosIdentity()) == null || posIdentity2.type != 2))) {
                    arrayList.add(rect);
                } else {
                    int i2 = C939750aYv.LLILZLL;
                    int iLIZ = C938000aW6.LIZ();
                    arrayList.add(new Rect(rect.left - iLIZ, rect.top - iLIZ, rect.right + iLIZ, rect.bottom + iLIZ));
                }
                if (c957020b0m2.getShapeDescriptor().LIZIZ > 0.0f) {
                    currentCornerRadiusOfAudience = c957020b0m2.getShapeDescriptor().LIZIZ;
                } else {
                    C940770aaZ.LIZ().LIZIZ();
                    Iterator it2 = ((ArrayList) C937830aVp.LIZ(c957020b0m2)).iterator();
                    while (true) {
                        obj = null;
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (((AbstractC939840aZ4) next).getElementType() == EnumC939900aZA.BORDER) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    AbstractC939840aZ4 abstractC939840aZ4 = (AbstractC939840aZ4) next;
                    if (abstractC939840aZ4 != null) {
                        currentCornerRadiusOfAudience = ((C940950aar) abstractC939840aZ4).getCurrentCornerRadiusOfAudience();
                    }
                    C940770aaZ.LIZ().LIZIZ();
                    Iterator it3 = ((ArrayList) C937830aVp.LIZ(c957020b0m2)).iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        if (((AbstractC939840aZ4) next2).getElementType() == EnumC939900aZA.NO_GUEST) {
                            obj = next2;
                            break;
                        }
                    }
                    AbstractC939840aZ4 abstractC939840aZ42 = (AbstractC939840aZ4) obj;
                    if (abstractC939840aZ42 != null) {
                        currentCornerRadiusOfAudience = ((C934190aPx) abstractC939840aZ42).getCurrentCornerRadiusOfAudience();
                    }
                }
            }
            f = currentCornerRadiusOfAudience;
        }
        DataChannelGlobal.LLILZ.HQ2(LivePublicScreenClipChannel.class, new C946210ajL(arrayList, f));
    }

    public final void LIZ() {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC940060aZQ interfaceC940060aZQ;
        FrameLayout frameLayoutLL;
        C957020b0m c957020b0m = null;
        if (C500260Jjc.LJJIJLIJ() && LinkMicMgPreviewLivePageSetting.INSTANCE.showLayoutInPreviewLivePage()) {
            interfaceC937900aVwLLIIJLIL = C915980Zwa.LJIIIIZZ().Ci(null);
        } else {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL != null ? interfaceC954180awCLLJLL.LLIIJLIL() : null;
        }
        if (!(interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) || (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL) == null || (frameLayoutLL = interfaceC940060aZQ.LL()) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = frameLayoutLL.getLayoutParams();
        if (layoutParams == null) {
            C937310aUz.LJFF("MultiGuestPublicScreenHelper", "layoutContainer layoutParams is null");
            return;
        }
        List<C957020b0m> listLJIIIZ = C940770aaZ.LIZ().getDataSource().LJIIIZ();
        EnumC918970a1P enumC918970a1PLJII = (MultiGuestPublicScreenBottomFixSetting.INSTANCE.getValue() && C940770aaZ.LIZ().getDataSource().getPanelLayoutType() == 7) ? EnumC918970a1P.GRID_FIX : C916800Zxu.LJII(Integer.valueOf(C940770aaZ.LIZ().getDataSource().LJII()), C940770aaZ.LIZ().getDataSource());
        int size = listLJIIIZ.size() - 1;
        Iterator<C957020b0m> it2 = listLJIIIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C957020b0m next = it2.next();
            C465260IMi c465260IMi = C939890aZ9.LIZ;
            if (C500260Jjc.LJJIIZ(C939890aZ9.LJ(next.getIdentity()))) {
                c957020b0m = next;
                break;
            }
        }
        C957020b0m c957020b0m2 = c957020b0m;
        if (c957020b0m2 == null) {
            C937310aUz.LJII("MultiGuestPublicScreenHelper", "full screen public screen");
            this.LL.zW(MultiLiveRTCLayoutChannel.class, new C1081600eFi(enumC918970a1PLJII, size, 0, (C497740JfY.LJIIZILJ() - layoutParams.width) / 2, false, 20));
            return;
        }
        C465260IMi c465260IMi2 = C939890aZ9.LIZ;
        String strLJ = C939890aZ9.LJ(c957020b0m2.getIdentity());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("postRtcLayoutChannelEvent window.identity=");
        sbLIZ.append(c957020b0m2.getIdentity());
        sbLIZ.append(" shapeDescriptor=");
        sbLIZ.append(c957020b0m2.getShapeDescriptor());
        sbLIZ.append(" publicScreenAlign=");
        sbLIZ.append(strLJ);
        C937310aUz.LJII("MultiGuestPublicScreenHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(strLJ, EnumC939370aYJ.BOTTOM_EXTERNAL.getValue())) {
            Integer numLJLZ = this.LLILLJJLI.LLJJI.LJLZ();
            if (numLJLZ != null) {
                int iIntValue = numLJLZ.intValue();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("BOTTOM_EXTERNAL bottomPadding=");
                sbLIZ2.append(iIntValue);
                C937310aUz.LJII("MultiGuestPublicScreenHelper", C2188811AlT.LIZIZ(sbLIZ2));
                this.LL.zW(MultiLiveRTCLayoutChannel.class, new C1081600eFi(enumC918970a1PLJII, size, iIntValue, 0, MultiGuestPublicScreenBottomFixSetting.INSTANCE.getValue() && C940770aaZ.LIZ().getDataSource().getPanelLayoutType() == 7, 8));
            }
        } else if (Intrinsics.LJFF(strLJ, EnumC939370aYJ.RIGHT_INTERNAL.getValue())) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("RIGHT_INTERNAL layoutWidth==");
            sbLIZ3.append(layoutParams.width);
            sbLIZ3.append(" windowWidth=");
            sbLIZ3.append(c957020b0m2.getShapeDescriptor().LIZ.width());
            C937310aUz.LJII("MultiGuestPublicScreenHelper", C2188811AlT.LIZIZ(sbLIZ3));
            int iLJIIZILJ = C497740JfY.LJIIZILJ();
            int i = layoutParams.width;
            this.LL.zW(MultiLiveRTCLayoutChannel.class, new C1081600eFi(enumC918970a1PLJII, size, 0, (i - ((MultiGuestNewLayoutLayerPanelFixPublicScreenFixSetting.INSTANCE.isFix() ? c957020b0m2.getShapeDescriptor().LIZ.left : 0) + c957020b0m2.getShapeDescriptor().LIZ.width())) + ((iLJIIZILJ - i) / 2), false, 20));
        } else if (Intrinsics.LJFF(strLJ, EnumC939370aYJ.LEFT_EXTERNAL.getValue())) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("LEFT_EXTERNAL screenWidth=");
            sbLIZ4.append(C497740JfY.LJIIZILJ());
            sbLIZ4.append(" layoutWidth=");
            sbLIZ4.append(layoutParams.width);
            C937310aUz.LJII("MultiGuestPublicScreenHelper", C2188811AlT.LIZIZ(sbLIZ4));
            this.LL.zW(MultiLiveRTCLayoutChannel.class, new C1081600eFi(enumC918970a1PLJII, size, 0, c957020b0m2.getShapeDescriptor().LIZ.width() + ((C497740JfY.LJIIZILJ() - layoutParams.width) / 2), false, 20));
        }
        LIZIZ();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILLL;
    }

    public C939340aYG(DataChannel dataChannel, C939350aYH c939350aYH) {
        this.LL = dataChannel;
        this.LLILLJJLI = c939350aYH;
    }
}
