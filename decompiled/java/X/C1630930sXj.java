package X;

import Y.ACListenerS127S0200000_25;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsModel;
import com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.AVApi;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS597S0100000_18;
import lnn.q;

/* JADX INFO: renamed from: X.0sXj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1630930sXj implements InterfaceC1621070sHp {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0sYU] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0sWE] */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, X.0sjA, java.lang.Object] */
    @Override // X.InterfaceC1621070sHp
    public final C1624260sMy LIZ(final C19GS c19gs, final InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1625410sOp interfaceC1625410sOp, final ShortVideoContext shortVideoContext, final InterfaceC1625000sOA interfaceC1625000sOA, final InterfaceC524950KiL interfaceC524950KiL, final Scene scene, InterfaceC1449160noY interfaceC1449160noY, C1DRG c1drg) {
        final C259800zU c259800zU = new C259800zU();
        final ?? r3 = new InterfaceC362610EJn() { // from class: X.0sWE
            @Override // X.InterfaceC362610EJn
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                if (i == 4) {
                    ViewOnClickListenerC1638020sjA viewOnClickListenerC1638020sjA = c259800zU.element;
                    if (viewOnClickListenerC1638020sjA != null) {
                        viewOnClickListenerC1638020sjA.LJI(true);
                    }
                    return true;
                }
                return false;
            }
        };
        C0CHQ.LIZ().getUiService().getClass();
        ?? viewOnClickListenerC1638020sjA = new ViewOnClickListenerC1638020sjA(AFwS311S0000000_25.get$arr$(42), new AwS569S0100000_25(c19gs, 857), interfaceC1624480sNK, interfaceC1625410sOp, new C1449050noN(shortVideoContext, interfaceC1449160noY), c19gs, new InterfaceC1631100sY0(shortVideoContext, interfaceC524950KiL, c19gs, r3, interfaceC1625000sOA) { // from class: X.0sXz
            public final ShortVideoContext LIZ;
            public final InterfaceC524950KiL LIZIZ;
            public final C19GS LIZJ;
            public final InterfaceC362610EJn LIZLLL;
            public final InterfaceC1625000sOA LJ;

            @Override // X.InterfaceC1631100sY0
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1631100sY0
            public final void LIZIZ() {
                InterfaceC1625000sOA interfaceC1625000sOA2 = this.LJ;
                if (interfaceC1625000sOA2 instanceof q) {
                    ((q) interfaceC1625000sOA2).nE1(true);
                }
            }

            @Override // X.InterfaceC1631100sY0
            public final void LIZLLL() {
                InterfaceC524950KiL interfaceC524950KiL2 = this.LIZIZ;
                if (interfaceC524950KiL2 != null) {
                    interfaceC524950KiL2.b8(this.LIZLLL);
                }
            }

            @Override // X.InterfaceC1631100sY0
            public final void LJFF() {
                C19GS c19gs2 = this.LIZJ;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131857684);
                C1390380mHk.LIZ(c19gs2, 6001, creativeToastBuilder);
            }

            @Override // X.InterfaceC1631100sY0
            public final void LJIIIZ() {
                InterfaceC524950KiL interfaceC524950KiL2 = this.LIZIZ;
                if (interfaceC524950KiL2 != null) {
                    interfaceC524950KiL2.AH(this.LIZLLL);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[PHI: r1
              0x004a: PHI (r1v6 java.lang.String) = (r1v3 java.lang.String), (r1v7 java.lang.String) binds: [B:18:0x0048, B:16:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x005c A[PHI: r1
              0x005c: PHI (r1v8 java.lang.String) = (r1v1 java.lang.String), (r1v9 java.lang.String) binds: [B:11:0x0035, B:9:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.InterfaceC1631100sY0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJI(boolean r7) {
                /*
                    r6 = this;
                    java.lang.String r5 = "click_personal_board"
                    java.lang.String r3 = "enter_method"
                    java.lang.String r2 = "video_shoot_page"
                    java.lang.String r1 = "enter_from"
                    if (r7 == 0) goto L1d
                    X.0LAB r0 = new X.0LAB
                    r0.<init>()
                    r0.LJ(r1, r2)
                    r0.LJ(r3, r5)
                    java.util.Map<java.lang.String, java.lang.String> r1 = r0.LIZ
                    java.lang.String r0 = "follow"
                    X.C20684815ws.LJIILLIIL(r0, r1)
                    return
                L1d:
                    X.0LAB r4 = new X.0LAB
                    r4.<init>()
                    r4.LJ(r1, r2)
                    r4.LJ(r3, r5)
                    X.1D0F r3 = X.C1D0F.LIZ
                    java.lang.String r2 = ""
                    if (r3 == 0) goto L34
                    java.lang.String r1 = r3.LIZ()
                    if (r1 != 0) goto L5c
                L34:
                    r1 = r2
                    if (r3 != 0) goto L5c
                    r0 = 0
                L38:
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                    r4.LJ(r1, r0)
                    if (r3 == 0) goto L47
                    java.lang.String r1 = r3.LIZIZ()
                    if (r1 != 0) goto L4a
                L47:
                    r1 = r2
                    if (r3 == 0) goto L51
                L4a:
                    java.lang.String r0 = r3.LIZJ()
                    if (r0 == 0) goto L51
                    r2 = r0
                L51:
                    r4.LJ(r1, r2)
                    java.util.Map<java.lang.String, java.lang.String> r1 = r4.LIZ
                    java.lang.String r0 = "follow_cancel"
                    X.C20684815ws.LJIILLIIL(r0, r1)
                    return
                L5c:
                    boolean r0 = r3.isConnected()
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    goto L38
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1631090sXz.LJI(boolean):void");
            }

            @Override // X.InterfaceC1631100sY0
            public final int LIZ(String str, String str2) {
                return C0CHQ.LIZ().getAccountService().LJI(str, str2, EnumC1254700iku.STICKER_FLASH_FOLLOW).getFollowerCount();
            }

            @Override // X.InterfaceC1631100sY0
            public final void LJ(String str, AwS391S0200000_25 awS391S0200000_25) {
                ((InterfaceC174900ln) C0CHQ.LIZ().getNetworkService().retrofitCreate(((AVApi) ServiceManager.get().getService(AVApi.class)).LIZ(), InterfaceC174900ln.class)).LIZ(str, 0, 10).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new AnonymousClass0202(awS391S0200000_25, this, 1));
            }

            @Override // X.InterfaceC1631100sY0
            public final void LIZJ(int i, String str, String str2) {
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("creation_id", this.LIZ.getCreationId());
                c0lab.LJ("enter_method", "click_main_panel");
                c0lab.LJ("enter_from", "video_shoot_page");
                c0lab.LJ("prop_id", str);
                c0lab.LJ("shoot_way", this.LIZ.shootWay);
                c0lab.LJ("tab_name", "creator_detail");
                c0lab.LIZ(1, "is_original_prop");
                c0lab.LJ("prop_author_id", str2);
                c0lab.LIZ(i, "order");
                C20684815ws.LJIILLIIL("click_prop_username", c0lab.LIZ);
            }

            @Override // X.InterfaceC1631100sY0
            public final void LJII(int i, String str, String str2, C1637320si2 c1637320si2) {
                C0CHQ.LIZ().getAccountService().LJIIJ(i, str, str2, new AwS597S0100000_18(c1637320si2, 741));
            }

            {
                this.LIZ = shortVideoContext;
                this.LIZIZ = interfaceC524950KiL;
                this.LIZJ = c19gs;
                this.LIZLLL = r3;
                this.LJ = interfaceC1625000sOA;
            }
        }, shortVideoContext.creativeModel, scene, c1drg, C20622515mp.LJIILL(c19gs, scene));
        viewOnClickListenerC1638020sjA.LLLIIL = new ACListenerS127S0200000_25(viewOnClickListenerC1638020sjA, new InterfaceC1636410sgZ() { // from class: X.0sqE
            @Override // X.InterfaceC1636410sgZ
            public final void LIZ(InterfaceC1638030sjB interfaceC1638030sjB) {
                C19724912Fj c19724912FjLIZLLL = C19724912Fj.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("aweme://user/profile/");
                sbLIZ.append(interfaceC1638030sjB.getUid());
                C686150Qvl c686150Qvl = new C686150Qvl(C2188811AlT.LIZIZ(sbLIZ));
                c686150Qvl.LIZIZ("sec_user_id", interfaceC1638030sjB.getSecUid());
                c686150Qvl.LIZIZ("enter_from", "prop_page");
                c19724912FjLIZLLL.LJII(c686150Qvl.LIZJ());
            }
        }, 11);
        c259800zU.element = viewOnClickListenerC1638020sjA;
        C1624260sMy c1624260sMy = new C1624260sMy();
        ArrayList arrayList = new ArrayList();
        arrayList.add(c259800zU.element);
        arrayList.add(new InterfaceC1624270sMz() { // from class: X.0sXw
            public LinearLayout LL;
            public C1322110kVd LLILLJJLI;
            public C19518211Xw LLILLL;
            public C1322110kVd LLILZ;
            public LinearLayout LLILZIL;

            @Override // X.InterfaceC1624270sMz
            public final void LIZ() {
                LinearLayout linearLayout = this.LL;
                if (linearLayout != null) {
                    C786410Ut5.LJZL(8, linearLayout);
                }
            }

            @Override // X.InterfaceC1624270sMz
            public final EnumC992590bw9 priority() {
                return EnumC992590bw9.NormalStickerInfoHandlerPriority;
            }

            @Override // X.InterfaceC1624270sMz
            public final void LIZIZ(View view) {
                C1324800kZy c1324800kZy;
                LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.mfq);
                this.LL = linearLayout;
                if (linearLayout != null) {
                    C786410Ut5.LJZL(0, linearLayout);
                }
                this.LLILLJJLI = (C1322110kVd) view.findViewById(R.id.w64);
                this.LLILLL = (C19518211Xw) view.findViewById(R.id.w6i);
                this.LLILZ = (C1322110kVd) view.findViewById(R.id.p82);
                this.LLILZIL = (LinearLayout) view.findViewById(R.id.p7b);
                C1322110kVd c1322110kVd = this.LLILLJJLI;
                if ((c1322110kVd instanceof C1324800kZy) && (c1324800kZy = (C1324800kZy) c1322110kVd) != null) {
                    C201955140j.LIZLLL(C20012313Rx.LIZIZ, "NormalStickerInfoHandler", "setup CircleDraweeView");
                    int i = C1324800kZy.LLJILLL;
                    c1324800kZy.setClipStyle(1);
                    c1324800kZy.setRectFRadius(c1324800kZy.getResources().getDimension(R.dimen.b6));
                    c1324800kZy.LLJILJIL = true;
                }
            }

            @Override // X.InterfaceC1624270sMz
            public final boolean LIZJ(C1627370sRz c1627370sRz) {
                String str;
                List<String> urlList;
                Effect effect = c1627370sRz.LIZ;
                if (effect != null && ((effect.getSource() == 0 || effect.getSource() == 101 || effect.getSource() == 102) && !C1624570sNT.LJIIL(effect))) {
                    LinearLayout linearLayout = this.LLILZIL;
                    if (linearLayout != null) {
                        C786410Ut5.LJZL(8, linearLayout);
                    }
                    C1322110kVd c1322110kVd = this.LLILZ;
                    if (c1322110kVd != null) {
                        C786410Ut5.LLZZLLIL(c1322110kVd, 8);
                    }
                    C1322110kVd c1322110kVd2 = this.LLILLJJLI;
                    if (c1322110kVd2 != null) {
                        C786410Ut5.LLZZLLIL(c1322110kVd2, 0);
                    }
                    C19518211Xw c19518211Xw = this.LLILLL;
                    if (c19518211Xw != null) {
                        C786410Ut5.D1(c19518211Xw, 0);
                    }
                    LinearLayout linearLayout2 = this.LL;
                    if (linearLayout2 != null) {
                        C786410Ut5.LJZL(0, linearLayout2);
                    }
                    C1322110kVd c1322110kVd3 = this.LLILLJJLI;
                    if (c1322110kVd3 != null) {
                        C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("updateUser, image = ");
                        sbLIZ.append(this.LLILLJJLI);
                        C201955140j.LIZLLL(c20012313Rx, "NormalStickerInfoHandler", C2188811AlT.LIZIZ(sbLIZ));
                        UrlModel iconUrl = effect.getIconUrl();
                        if (iconUrl != null && (urlList = iconUrl.getUrlList()) != null) {
                            str = (String) C13LP.LJJJLL(urlList);
                        } else {
                            str = null;
                        }
                        C1324750kZt.LIZJ(c1322110kVd3, str, -1, -1);
                    }
                    C19518211Xw c19518211Xw2 = this.LLILLL;
                    if (c19518211Xw2 != null) {
                        c19518211Xw2.setText(effect.getName());
                    }
                    return true;
                }
                LIZ();
                return false;
            }
        });
        arrayList.add(((ICommerceToolsStickerService) ServiceManager.get().getService(ICommerceToolsStickerService.class)).LJIIIIZZ(shortVideoContext, new InterfaceC1631050sXv(shortVideoContext) { // from class: X.0sYU
            public final ShortVideoContext LIZ;

            {
                this.LIZ = shortVideoContext;
            }

            @Override // X.InterfaceC1631050sXv
            public final void LIZ(String str) {
                CommerceToolsModel commerceToolsModel = this.LIZ.creativeModel.commerceModel;
                if (commerceToolsModel.isShowedCommerceTransformButton()) {
                    commerceToolsModel.setShowedCommerceTransformButton(false);
                    return;
                }
                Pair[] pairArr = new Pair[3];
                pairArr[0] = new Pair("prop_id", str);
                String str2 = this.LIZ.shootWay;
                if (str2 == null) {
                    str2 = "";
                }
                pairArr[1] = new Pair("shoot_way", str2);
                pairArr[2] = new Pair("carrier_type", "prop_panel");
                C1449260noi.LJ("show_transform_link", C2097608Jq.LJI(pairArr));
                commerceToolsModel.setShowedCommerceTransformButton(true);
                commerceToolsModel.setShowedCommerceTransformBottomButton(true);
            }

            @Override // X.InterfaceC1631050sXv
            public final void LIZIZ(String str) {
                Pair[] pairArr = new Pair[3];
                pairArr[0] = new Pair("prop_id", str);
                String str2 = this.LIZ.shootWay;
                if (str2 == null) {
                    str2 = "";
                }
                pairArr[1] = new Pair("shoot_way", str2);
                pairArr[2] = new Pair("carrier_type", "prop_panel");
                C1449260noi.LJ("click_transform_link", C2097608Jq.LJI(pairArr));
            }

            @Override // X.InterfaceC1631050sXv
            public final void LIZJ(String str) {
                C1449260noi.LJ("show_toast", C2097608Jq.LJI(new Pair("toast_type", "prop"), new Pair("prop_id", str), new Pair("enter_from", "video_shoot_page")));
            }
        }, arrayList));
        C1630940sXk c1630940sXk = new C1630940sXk();
        c1630940sXk.LLILLL = new ACListenerS127S0200000_25(c1630940sXk, new AbstractC1643540ss4(c19gs, interfaceC1624480sNK, interfaceC1625000sOA, scene) { // from class: X.0sXm
            public final InterfaceC1624480sNK LIZLLL;
            public final InterfaceC1625000sOA LJ;

            @Override // X.InterfaceC1630950sXl
            public final void LIZ(Effect effect) {
                String effectId;
                if (effect != null && (effectId = effect.getEffectId()) != null && effectId.length() != 0 && !effect.isBusiness() && !(effect instanceof MobileEffect) && !(effect instanceof DraftEffect)) {
                    LIZLLL(effect);
                }
            }

            @Override // X.AbstractC1643540ss4
            public final void LJI(Effect effect) {
                this.LJ.w4().LIZJ(C1622820sKe.LIZ(null, null, 7));
                new C1624150sMn().LIZ(effect.getEffectId());
                this.LJ.c21(effect);
                C1440005kM.LIZ(new C1630990sXp(effect));
            }

            {
                this.LIZLLL = interfaceC1624480sNK;
                this.LJ = interfaceC1625000sOA;
            }
        }, 10);
        arrayList.add(c1630940sXk);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c1624260sMy.LIZ((InterfaceC1624270sMz) it2.next());
        }
        return c1624260sMy;
    }
}
