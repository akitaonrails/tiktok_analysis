package X;

import android.view.View;
import com.bytedance.android.livesdk.feed.drawerfeed.search.model.LiveSearchSugEntity;
import com.ss.android.ugc.aweme.explore.topic.ExploreTopicManagementFragment;
import com.ss.android.ugc.aweme.nimblecard.model.Ability;
import com.ss.android.ugc.aweme.nimblecard.model.Component;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoSendBaseAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.carry.userlanding.TakoUserLandingCardAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.send.imagetext.TakoSendImageTextAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.nimblecard.NimbleCardAnswerAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0yce, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class ViewOnLongClickListenerC1864620yce implements View.OnLongClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            case 2:
                return onLongClick$2(this, view);
            case 3:
                return onLongClick$3(this, view);
            case 4:
                return onLongClick$4(this, view);
            case 5:
                return onLongClick$5(this, view);
            case 6:
                return onLongClick$6(this, view);
            case 7:
                return onLongClick$7(this, view);
            case 8:
                return onLongClick$8(this, view);
            default:
                return false;
        }
    }

    public static final boolean onLongClick$0(ViewOnLongClickListenerC1864620yce viewOnLongClickListenerC1864620yce, View view) {
        float clickX;
        float clickY;
        List<Ability> list;
        List<Ability> list2;
        List<Ability> list3;
        List<Ability> list4;
        float clickX2;
        float clickY2;
        List<Ability> list5;
        List<Ability> list6;
        String strLJIIIZ;
        C1857420yR2 c1857420yR2 = C1857420yR2.LIZ;
        C19EG c19egLIZ = C724240Sb0.LIZ((NimbleCardAnswerAssem) viewOnLongClickListenerC1864620yce.l0);
        Message message = ((C1858660yT2) C631370Opb.LIZ((NimbleCardAnswerAssem) viewOnLongClickListenerC1864620yce.l0)).LL.LLILLL;
        C14J2 c14j2Pq = ((NimbleCardAnswerAssem) viewOnLongClickListenerC1864620yce.l0).pq();
        if (c14j2Pq != null) {
            clickX = c14j2Pq.getClickX();
        } else {
            clickX = 0.0f;
        }
        C14J2 c14j2Pq2 = ((NimbleCardAnswerAssem) viewOnLongClickListenerC1864620yce.l0).pq();
        if (c14j2Pq2 != null) {
            clickY = c14j2Pq2.getClickY();
        } else {
            clickY = 0.0f;
        }
        if (C1857420yR2.LJJIIJ(c19egLIZ, view, C1558520qew.LJIIL((NimbleCardAnswerAssem) viewOnLongClickListenerC1864620yce.l0), message, clickX, clickY) || !C1858670yT3.LJIIJ(((C1858660yT2) C631370Opb.LIZ((NimbleCardAnswerAssem) viewOnLongClickListenerC1864620yce.l0)).LL.LLILLL)) {
            return true;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((NimbleCardAnswerAssem) viewOnLongClickListenerC1864620yce.l0);
        Message message2 = ((C1858660yT2) C631370Opb.LIZ((NimbleCardAnswerAssem) viewOnLongClickListenerC1864620yce.l0)).LL.LLILLL;
        NimbleCardAnswerAssem nimbleCardAnswerAssem = (NimbleCardAnswerAssem) viewOnLongClickListenerC1864620yce.l0;
        Component component = (Component) viewOnLongClickListenerC1864620yce.l1;
        Message message3 = ((C1858660yT2) C631370Opb.LIZ(nimbleCardAnswerAssem)).LL.LLILLL;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL((NimbleCardAnswerAssem) viewOnLongClickListenerC1864620yce.l0);
        ArrayList arrayList = new ArrayList();
        C1857420yR2.LJIIIIZZ(view, interfaceC665370Q7zLJIIL2, message3, "long_press", arrayList);
        C1857420yR2.LJ(view, interfaceC665370Q7zLJIIL2, message3, "long_press", arrayList);
        nimbleCardAnswerAssem.LLLZIIL.getClass();
        List<Ability> list7 = null;
        if (component != null) {
            list7 = component.abilities;
        }
        EnumC1857370yQx enumC1857370yQx = EnumC1857370yQx.COPY;
        if (C1857380yQy.LIZ(enumC1857370yQx.getTag(), list7)) {
            C1860130yVP c1860130yVP = nimbleCardAnswerAssem.LLLLZI;
            if (c1860130yVP != null) {
                strLJIIIZ = C1859930yV5.LIZJ(c1860130yVP);
                if (strLJIIIZ == null) {
                    strLJIIIZ = "";
                }
            } else {
                strLJIIIZ = AnonymousClass1418.LJIIIZ(message3.LJIIIZ());
            }
            arrayList = arrayList;
            C1857420yR2.LIZIZ(arrayList, view, strLJIIIZ, message3, interfaceC665370Q7zLJIIL2, null, null, 48);
        }
        nimbleCardAnswerAssem.LLLZIIL.getClass();
        if (component != null) {
            list = component.abilities;
        } else {
            list = null;
        }
        if (C1857380yQy.LIZ(enumC1857370yQx.getTag(), list)) {
            C1857420yR2.LJIILL(arrayList, nimbleCardAnswerAssem.LLLLZI, message3, interfaceC665370Q7zLJIIL2, !nimbleCardAnswerAssem.Eq());
        }
        nimbleCardAnswerAssem.LLLZIIL.getClass();
        if (component != null) {
            list2 = component.abilities;
        } else {
            list2 = null;
        }
        if (C1857380yQy.LIZ(EnumC1857370yQx.SHARE.getTag(), list2)) {
            C1857420yR2.LJIILLIIL(24, view, interfaceC665370Q7zLJIIL2, message3, null, arrayList, null);
        }
        C1919007fQ.LIZ.getClass();
        if (C1919007fQ.LIZLLL()) {
            nimbleCardAnswerAssem.LLLZIIL.getClass();
            if (component != null) {
                list5 = component.abilities;
            } else {
                list5 = null;
            }
            if (C1857380yQy.LIZ(EnumC1857370yQx.DELETE.getTag(), list5)) {
                C1857420yR2.LIZLLL(arrayList, nimbleCardAnswerAssem.getContext(), message3, C1858670yT3.LIZ(message3, (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL2, IMessageAbility.class, null)), interfaceC665370Q7zLJIIL2);
            }
            nimbleCardAnswerAssem.LLLZIIL.getClass();
            if (component != null) {
                list6 = component.abilities;
            } else {
                list6 = null;
            }
            if (C1857380yQy.LIZ(EnumC1857370yQx.REPORT.getTag(), list6)) {
                arrayList = arrayList;
                C1857420yR2.LJIIL(arrayList, view, message3, interfaceC665370Q7zLJIIL2, false, null, 24);
            }
        } else {
            nimbleCardAnswerAssem.LLLZIIL.getClass();
            if (component != null) {
                list3 = component.abilities;
            } else {
                list3 = null;
            }
            if (C1857380yQy.LIZ(EnumC1857370yQx.REPORT.getTag(), list3)) {
                arrayList = arrayList;
                C1857420yR2.LJIIL(arrayList, view, message3, interfaceC665370Q7zLJIIL2, false, null, 24);
            }
            nimbleCardAnswerAssem.LLLZIIL.getClass();
            if (component != null) {
                list4 = component.abilities;
            } else {
                list4 = null;
            }
            if (C1857380yQy.LIZ(EnumC1857370yQx.DELETE.getTag(), list4)) {
                C1857420yR2.LIZLLL(arrayList, nimbleCardAnswerAssem.getContext(), message3, C1858670yT3.LIZ(message3, (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL2, IMessageAbility.class, null)), interfaceC665370Q7zLJIIL2);
            }
        }
        C1857420yR2.LIZJ(interfaceC665370Q7zLJIIL2, arrayList);
        C14J2 c14j2Pq3 = ((NimbleCardAnswerAssem) viewOnLongClickListenerC1864620yce.l0).pq();
        if (c14j2Pq3 != null) {
            clickX2 = c14j2Pq3.getClickX();
        } else {
            clickX2 = 0.0f;
        }
        C14J2 c14j2Pq4 = ((NimbleCardAnswerAssem) viewOnLongClickListenerC1864620yce.l0).pq();
        if (c14j2Pq4 != null) {
            clickY2 = c14j2Pq4.getClickY();
        } else {
            clickY2 = 0.0f;
        }
        C1857420yR2.LJJIII(view, interfaceC665370Q7zLJIIL, message2, arrayList, clickX2, clickY2, false, false, 192);
        return true;
    }

    public static final boolean onLongClick$1(ViewOnLongClickListenerC1864620yce viewOnLongClickListenerC1864620yce, View view) {
        ((C1851120yGs) viewOnLongClickListenerC1864620yce.l0).LLILLJJLI.invoke(((C1851140yGu) viewOnLongClickListenerC1864620yce.l1).LIZ);
        return true;
    }

    public static final boolean onLongClick$2(ViewOnLongClickListenerC1864620yce viewOnLongClickListenerC1864620yce, View view) {
        float clickX;
        float clickY;
        float clickX2;
        C1857420yR2 c1857420yR2 = C1857420yR2.LIZ;
        C19EG c19egLIZ = C724240Sb0.LIZ((TakoSendBaseAssem) viewOnLongClickListenerC1864620yce.l0);
        Message message = ((C1857170yQd) viewOnLongClickListenerC1864620yce.l1).LL.LLILLL;
        InterfaceC1860040yVG interfaceC1860040yVG = ((TakoSendBaseAssem) viewOnLongClickListenerC1864620yce.l0).LLLILZLLLI;
        float clickY2 = 0.0f;
        if (interfaceC1860040yVG != null) {
            clickX = interfaceC1860040yVG.getClickX();
        } else {
            clickX = 0.0f;
        }
        InterfaceC1860040yVG interfaceC1860040yVG2 = ((TakoSendBaseAssem) viewOnLongClickListenerC1864620yce.l0).LLLILZLLLI;
        if (interfaceC1860040yVG2 != null) {
            clickY = interfaceC1860040yVG2.getClickY();
        } else {
            clickY = 0.0f;
        }
        if (C1857420yR2.LJJIIJ(c19egLIZ, view, C1558520qew.LJIIL((TakoSendBaseAssem) viewOnLongClickListenerC1864620yce.l0), message, clickX, clickY) || !C1858670yT3.LJIIJ(((C1857170yQd) viewOnLongClickListenerC1864620yce.l1).LL.LLILLL)) {
            return true;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((TakoSendBaseAssem) viewOnLongClickListenerC1864620yce.l0);
        Message message2 = ((C1857170yQd) viewOnLongClickListenerC1864620yce.l1).LL.LLILLL;
        List listGp = ((TakoSendBaseAssem) viewOnLongClickListenerC1864620yce.l0).Gp(view, C1558520qew.LJIIL((TakoSendBaseAssem) viewOnLongClickListenerC1864620yce.l0), message2);
        InterfaceC1860040yVG interfaceC1860040yVG3 = ((TakoSendBaseAssem) viewOnLongClickListenerC1864620yce.l0).LLLILZLLLI;
        if (interfaceC1860040yVG3 != null) {
            clickX2 = interfaceC1860040yVG3.getClickX();
        } else {
            clickX2 = 0.0f;
        }
        InterfaceC1860040yVG interfaceC1860040yVG4 = ((TakoSendBaseAssem) viewOnLongClickListenerC1864620yce.l0).LLLILZLLLI;
        if (interfaceC1860040yVG4 != null) {
            clickY2 = interfaceC1860040yVG4.getClickY();
        }
        C1857420yR2.LJJIII(view, interfaceC665370Q7zLJIIL, message2, listGp, clickX2, clickY2, false, false, 192);
        return true;
    }

    public static final boolean onLongClick$3(ViewOnLongClickListenerC1864620yce viewOnLongClickListenerC1864620yce, View view) {
        float clickY;
        float clickX;
        float clickY2;
        C1857420yR2 c1857420yR2 = C1857420yR2.LIZ;
        C19EG c19egLIZ = C724240Sb0.LIZ((TakoUserLandingCardAssem) viewOnLongClickListenerC1864620yce.l0);
        Message message = ((C1857090yQV) viewOnLongClickListenerC1864620yce.l1).LL.LLILLL;
        C14J2 c14j2Vr = ((TakoUserLandingCardAssem) viewOnLongClickListenerC1864620yce.l0).Tp();
        float clickX2 = 0.0f;
        if (c14j2Vr != null) {
            clickY = c14j2Vr.getClickY();
        } else {
            clickY = 0.0f;
        }
        C14J2 c14j2Vr2 = ((TakoUserLandingCardAssem) viewOnLongClickListenerC1864620yce.l0).Tp();
        if (c14j2Vr2 != null) {
            clickX = c14j2Vr2.getClickX();
        } else {
            clickX = 0.0f;
        }
        if (C1857420yR2.LJJIIJ(c19egLIZ, view, C1558520qew.LJIIL((TakoUserLandingCardAssem) viewOnLongClickListenerC1864620yce.l0), message, clickY, clickX)) {
            return true;
        }
        Message message2 = ((C1857090yQV) viewOnLongClickListenerC1864620yce.l1).LLJJIJI.LLILLL;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((TakoUserLandingCardAssem) viewOnLongClickListenerC1864620yce.l0);
        List listWp = ((TakoUserLandingCardAssem) viewOnLongClickListenerC1864620yce.l0).Wp(view, C1558520qew.LJIIL((TakoUserLandingCardAssem) viewOnLongClickListenerC1864620yce.l0), ((C1857090yQV) viewOnLongClickListenerC1864620yce.l1).LL.LLILLL);
        C14J2 c14j2Vr3 = ((TakoUserLandingCardAssem) viewOnLongClickListenerC1864620yce.l0).Tp();
        if (c14j2Vr3 != null) {
            clickY2 = c14j2Vr3.getClickY();
        } else {
            clickY2 = 0.0f;
        }
        C14J2 c14j2Vr4 = ((TakoUserLandingCardAssem) viewOnLongClickListenerC1864620yce.l0).Tp();
        if (c14j2Vr4 != null) {
            clickX2 = c14j2Vr4.getClickX();
        }
        C1857420yR2.LJJIII(view, interfaceC665370Q7zLJIIL, message2, listWp, clickX2, clickY2, false, false, 192);
        return true;
    }

    public static final boolean onLongClick$4(ViewOnLongClickListenerC1864620yce viewOnLongClickListenerC1864620yce, View view) {
        float clickX;
        float clickY;
        float clickX2;
        C1857420yR2 c1857420yR2 = C1857420yR2.LIZ;
        C19EG c19egLIZ = C724240Sb0.LIZ((TakoSendImageTextAssem) viewOnLongClickListenerC1864620yce.l0);
        Message message = ((C1857100yQW) viewOnLongClickListenerC1864620yce.l1).LL.LLILLL;
        InterfaceC1860040yVG interfaceC1860040yVG = ((TakoSendImageTextAssem) viewOnLongClickListenerC1864620yce.l0).LLLILZLLLI;
        float clickY2 = 0.0f;
        if (interfaceC1860040yVG != null) {
            clickX = interfaceC1860040yVG.getClickX();
        } else {
            clickX = 0.0f;
        }
        InterfaceC1860040yVG interfaceC1860040yVG2 = ((TakoSendImageTextAssem) viewOnLongClickListenerC1864620yce.l0).LLLILZLLLI;
        if (interfaceC1860040yVG2 != null) {
            clickY = interfaceC1860040yVG2.getClickY();
        } else {
            clickY = 0.0f;
        }
        if (C1857420yR2.LJJIIJ(c19egLIZ, view, C1558520qew.LJIIL((TakoSendImageTextAssem) viewOnLongClickListenerC1864620yce.l0), message, clickX, clickY) || !C1858670yT3.LJIIJ(((C1857100yQW) viewOnLongClickListenerC1864620yce.l1).LL.LLILLL)) {
            return true;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((TakoSendImageTextAssem) viewOnLongClickListenerC1864620yce.l0);
        Message message2 = ((C1857100yQW) viewOnLongClickListenerC1864620yce.l1).LL.LLILLL;
        List listGp = ((TakoSendImageTextAssem) viewOnLongClickListenerC1864620yce.l0).Gp(view, C1558520qew.LJIIL((TakoSendImageTextAssem) viewOnLongClickListenerC1864620yce.l0), message2);
        InterfaceC1860040yVG interfaceC1860040yVG3 = ((TakoSendImageTextAssem) viewOnLongClickListenerC1864620yce.l0).LLLILZLLLI;
        if (interfaceC1860040yVG3 != null) {
            clickX2 = interfaceC1860040yVG3.getClickX();
        } else {
            clickX2 = 0.0f;
        }
        InterfaceC1860040yVG interfaceC1860040yVG4 = ((TakoSendImageTextAssem) viewOnLongClickListenerC1864620yce.l0).LLLILZLLLI;
        if (interfaceC1860040yVG4 != null) {
            clickY2 = interfaceC1860040yVG4.getClickY();
        }
        C1857420yR2.LJJIII(view, interfaceC665370Q7zLJIIL, message2, listGp, clickX2, clickY2, false, false, 192);
        return true;
    }

    public static final boolean onLongClick$5(ViewOnLongClickListenerC1864620yce viewOnLongClickListenerC1864620yce, View view) {
        float clickX;
        float clickY;
        float clickX2;
        C1857420yR2 c1857420yR2 = C1857420yR2.LIZ;
        C19EG c19egLIZ = C724240Sb0.LIZ((TakoSendImageTextAssem) viewOnLongClickListenerC1864620yce.l0);
        Message message = ((C1857100yQW) viewOnLongClickListenerC1864620yce.l1).LL.LLILLL;
        InterfaceC1860040yVG interfaceC1860040yVG = ((TakoSendImageTextAssem) viewOnLongClickListenerC1864620yce.l0).LLLILZLLLI;
        float clickY2 = 0.0f;
        if (interfaceC1860040yVG != null) {
            clickX = interfaceC1860040yVG.getClickX();
        } else {
            clickX = 0.0f;
        }
        InterfaceC1860040yVG interfaceC1860040yVG2 = ((TakoSendImageTextAssem) viewOnLongClickListenerC1864620yce.l0).LLLILZLLLI;
        if (interfaceC1860040yVG2 != null) {
            clickY = interfaceC1860040yVG2.getClickY();
        } else {
            clickY = 0.0f;
        }
        if (C1857420yR2.LJJIIJ(c19egLIZ, view, C1558520qew.LJIIL((TakoSendImageTextAssem) viewOnLongClickListenerC1864620yce.l0), message, clickX, clickY) || !C1858670yT3.LJIIJ(((C1857100yQW) viewOnLongClickListenerC1864620yce.l1).LL.LLILLL)) {
            return true;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((TakoSendImageTextAssem) viewOnLongClickListenerC1864620yce.l0);
        Message message2 = ((C1857100yQW) viewOnLongClickListenerC1864620yce.l1).LL.LLILLL;
        List listGp = ((TakoSendImageTextAssem) viewOnLongClickListenerC1864620yce.l0).Gp(view, C1558520qew.LJIIL((TakoSendImageTextAssem) viewOnLongClickListenerC1864620yce.l0), message2);
        InterfaceC1860040yVG interfaceC1860040yVG3 = ((TakoSendImageTextAssem) viewOnLongClickListenerC1864620yce.l0).LLLILZLLLI;
        if (interfaceC1860040yVG3 != null) {
            clickX2 = interfaceC1860040yVG3.getClickX();
        } else {
            clickX2 = 0.0f;
        }
        InterfaceC1860040yVG interfaceC1860040yVG4 = ((TakoSendImageTextAssem) viewOnLongClickListenerC1864620yce.l0).LLLILZLLLI;
        if (interfaceC1860040yVG4 != null) {
            clickY2 = interfaceC1860040yVG4.getClickY();
        }
        C1857420yR2.LJJIII(view, interfaceC665370Q7zLJIIL, message2, listGp, clickX2, clickY2, false, false, 192);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e A[PHI: r0
      0x004e: PHI (r0v28 java.lang.String) = (r0v21 java.lang.String), (r0v29 java.lang.String) binds: [B:24:0x004c, B:22:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onLongClick$6(X.ViewOnLongClickListenerC1864620yce r21, android.view.View r22) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnLongClickListenerC1864620yce.onLongClick$6(X.0yce, android.view.View):boolean");
    }

    public static final boolean onLongClick$7(ViewOnLongClickListenerC1864620yce viewOnLongClickListenerC1864620yce, View view) {
        int iLIZ;
        C1809150xBB c1809150xBB = (C1809150xBB) viewOnLongClickListenerC1864620yce.l0;
        InterfaceC1809200xBG interfaceC1809200xBG = c1809150xBB.LL;
        if (interfaceC1809200xBG != null) {
            LiveSearchSugEntity liveSearchSugEntity = (LiveSearchSugEntity) viewOnLongClickListenerC1864620yce.l1;
            InterfaceC1809230xBJ interfaceC1809230xBJ = c1809150xBB.LLILZLL;
            if (interfaceC1809230xBJ != null) {
                iLIZ = interfaceC1809230xBJ.LIZ(c1809150xBB.LLILZIL);
            } else {
                iLIZ = -1;
            }
            interfaceC1809200xBG.LIZJ(liveSearchSugEntity, iLIZ, ((C1809150xBB) viewOnLongClickListenerC1864620yce.l0).I5());
        }
        ((C1809150xBB) viewOnLongClickListenerC1864620yce.l0).L5("long_press");
        return true;
    }

    public static final boolean onLongClick$8(ViewOnLongClickListenerC1864620yce viewOnLongClickListenerC1864620yce, View view) {
        ExploreTopicManagementFragment exploreTopicManagementFragment = ((C1841520y1O) viewOnLongClickListenerC1864620yce.l0).LLILLJJLI.get();
        if (exploreTopicManagementFragment != null) {
            C1841510y1N c1841510y1N = (C1841510y1N) viewOnLongClickListenerC1864620yce.l1;
            C1389890mGx c1389890mGx = new C1389890mGx(exploreTopicManagementFragment);
            c1389890mGx.LJIIJ(c1841510y1N.itemView.getContext().getString(2131829902));
            c1389890mGx.LJFF(R.raw.icon_exclamation_mark_circle_fill);
            c1389890mGx.LJII(R.attr.a1h);
            c1389890mGx.LJIIJJI();
            return true;
        }
        return true;
    }

    public ViewOnLongClickListenerC1864620yce(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
