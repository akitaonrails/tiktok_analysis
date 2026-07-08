package X;

import android.content.res.Resources;
import android.view.View;
import com.bytedance.android.live.gift.GiftDialogHeightChannel;
import com.bytedance.android.live.liveinteract.api.BattleBonusTaskAddOnHeightChannel;
import com.bytedance.android.live.liveinteract.api.BattleBonusTaskShowChannel;
import com.bytedance.android.live.liveinteract.api.BattleTaskGuideTipShowChannel;
import com.bytedance.android.live.liveinteract.api.HostGuestListChangeEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.livesdk.dataChannel.CommentPinWidgetVisibility;
import com.bytedance.android.livesdk.dataChannel.GiftTrayPositionChangeEvent;
import com.bytedance.android.livesdk.dataChannel.PublicScreenHeightInsufficient;
import com.bytedance.android.livesdk.layer.InteractiveGiftAdjustSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveBeautyPanelAlphaOptSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveGiftTrayPublicScreenTranslateSetting;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS383S0200000_17;

/* JADX INFO: renamed from: X.0eHM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1082620eHM extends AbstractC1082660eHQ {
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public final int LLIZ;
    public int LLIZLLLIL;
    public C1082560eHG LLJ;
    public final int LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public int LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public ConstraintProperty LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public int LLJZIJLIL;
    public Boolean LLL;
    public final ViewOnLayoutChangeListenerC1151610g4d LLLF;
    public final ViewOnLayoutChangeListenerC1151610g4d LLLFF;
    public final ViewOnLayoutChangeListenerC1151610g4d LLLFFI;
    public final ViewOnLayoutChangeListenerC1151610g4d LLLFZ;
    public final ViewOnLayoutChangeListenerC1151610g4d LLLI;
    public ViewOnLayoutChangeListenerC1151610g4d LLLII;

    @Override // com.bytedance.ies.sdk.widgets.ElementSpecImpl, com.bytedance.ies.sdk.widgets.ElementSpec
    public final void dispose() {
        ConstraintProperty constraintPropertyById;
        View view;
        View view2;
        View view3;
        View viewFindViewById;
        ConstraintProperty constraintPropertyById2;
        View view4;
        View view5;
        super.dispose();
        ConstraintProperty constraintPropertyById3 = this.LL.getConstraintPropertyById(R.id.ea1);
        if (constraintPropertyById3 != null && (view5 = constraintPropertyById3.getView()) != null) {
            view5.removeOnLayoutChangeListener(this.LLLFF);
        }
        if (!this.LL.isAnchor() && (constraintPropertyById2 = this.LL.getConstraintPropertyById(R.id.isf)) != null && (view4 = constraintPropertyById2.getView()) != null) {
            view4.removeOnLayoutChangeListener(this.LLLFFI);
        }
        ViewOnLayoutChangeListenerC1151610g4d viewOnLayoutChangeListenerC1151610g4d = this.LLLII;
        if (viewOnLayoutChangeListenerC1151610g4d != null && (viewFindViewById = this.LL.getContainer().findViewById(R.id.vkw)) != null) {
            viewFindViewById.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1151610g4d);
        }
        ConstraintProperty constraintPropertyById4 = this.LL.getConstraintPropertyById(R.id.vku);
        if (constraintPropertyById4 != null && (view3 = constraintPropertyById4.getView()) != null) {
            view3.removeOnLayoutChangeListener(this.LLLF);
        }
        ConstraintProperty constraintPropertyById5 = this.LL.getConstraintPropertyById(R.id.qhj);
        if (constraintPropertyById5 != null && (view2 = constraintPropertyById5.getView()) != null) {
            view2.removeOnLayoutChangeListener(this.LLLI);
        }
        if (!this.LL.isElementRegistered(R.id.jb9) || (constraintPropertyById = this.LL.getConstraintPropertyById(R.id.jb9)) == null || (view = constraintPropertyById.getView()) == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.LLLFZ);
    }

    public C1082620eHM(AbstractC1080560eE2 abstractC1080560eE2) {
        super(R.id.kwf, abstractC1080560eE2);
        this.LLILZ = abstractC1080560eE2.getContext().getResources().getDimensionPixelSize(R.dimen.ayf);
        this.LLILZIL = abstractC1080560eE2.getContext().getResources().getDimensionPixelSize(R.dimen.alv);
        this.LLILZLL = abstractC1080560eE2.getContext().getResources().getDimensionPixelSize(R.dimen.aor);
        this.LLIZ = abstractC1080560eE2.LIZLLL;
        this.LLJI = (((int) C497740JfY.LIZIZ(24.0f)) * 2) + abstractC1080560eE2.LJFF;
        this.LLJJIJIL = abstractC1080560eE2.getContext().getResources().getDimensionPixelSize(R.dimen.aqo);
        this.LLJJJIL = -1;
        this.LLJLLL = true;
        addSceneObserver(new DataChannelSceneObserver<C937450aVD, GiftDialogHeightChannel>() { // from class: X.0eHS
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<GiftDialogHeightChannel> getType() {
                return GiftDialogHeightChannel.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C937450aVD c937450aVD) {
                boolean z;
                C937450aVD c937450aVD2 = c937450aVD;
                int iLIZ = c937450aVD2.LIZ();
                C1082620eHM c1082620eHM = this.LIZ;
                if (iLIZ == 0) {
                    iLIZ = -1;
                }
                c1082620eHM.LLJJJIL = iLIZ;
                if (c937450aVD2.LIZ == EnumC1998407sE.SHEET_SLIDE) {
                    z = true;
                } else {
                    z = false;
                    c1082620eHM.LIZLLL(constraintProperty);
                }
                C1082620eHM.LIZJ(this.LIZ, false, !z, 1);
            }
        });
        addSceneObserver(new DataChannelSceneObserver<C956380azk, LinkCrossRoomStateChangeEvent>() { // from class: X.0eG8
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<LinkCrossRoomStateChangeEvent> getType() {
                return LinkCrossRoomStateChangeEvent.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C956380azk c956380azk) {
                this.LIZ.getClass();
                C1082620eHM c1082620eHM = this.LIZ;
                c1082620eHM.LLJLIL = C1082910eHp.LIZ(c956380azk, c1082620eHM.LL);
                C1082620eHM.LIZJ(this.LIZ, false, false, 3);
            }
        });
        addSceneObserver(new DataChannelSceneObserver<Boolean, GiftTrayPositionChangeEvent>() { // from class: X.0eG2
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<GiftTrayPositionChangeEvent> getType() {
                return GiftTrayPositionChangeEvent.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
                boolean zBooleanValue = bool.booleanValue();
                if (C500260Jjc.LJJIJIIJIL((Boolean) layeredElementContext.getDataChannel().gg0(PublicScreenHeightInsufficient.class))) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("receive GiftTrayPositionChangeEvent");
                    sbLIZ.append(zBooleanValue);
                    C20441214yg.LJIIIZ("live_host_change", C2188811AlT.LIZIZ(sbLIZ));
                    C1082620eHM c1082620eHM = this.LIZ;
                    c1082620eHM.LLJZ = zBooleanValue;
                    C1082620eHM.LIZJ(c1082620eHM, false, false, 1);
                }
            }
        });
        addSceneObserver(new WidgetHiddenChangedSceneObserver() { // from class: X.0eHT
            {
                super(R.id.vku);
            }

            @Override // com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver
            public final void onHiddenChanged(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, boolean z) {
                View view;
                View view2;
                boolean z2 = !z;
                this.LIZ.LLJIJIL = z2;
                if (z2) {
                    ConstraintProperty constraintPropertyById = layeredElementContext.getConstraintPropertyById(R.id.vku);
                    if (constraintPropertyById != null && (view2 = constraintPropertyById.getView()) != null) {
                        view2.addOnLayoutChangeListener(this.LIZ.LLLF);
                    }
                } else {
                    ConstraintProperty constraintPropertyById2 = layeredElementContext.getConstraintPropertyById(R.id.vku);
                    if (constraintPropertyById2 != null && (view = constraintPropertyById2.getView()) != null) {
                        view.removeOnLayoutChangeListener(this.LIZ.LLLF);
                    }
                }
                C1082620eHM.LIZJ(this.LIZ, false, false, 3);
            }
        });
        addSceneObserver(new WidgetHiddenChangedSceneObserver() { // from class: X.0eHU
            {
                super(R.id.ea1);
            }

            @Override // com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver
            public final void onHiddenChanged(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, boolean z) {
                View view;
                View view2;
                boolean z2 = !z;
                this.LIZ.LLJILJILJ = z2;
                if (z2) {
                    ConstraintProperty constraintPropertyById = layeredElementContext.getConstraintPropertyById(R.id.ea1);
                    if (constraintPropertyById != null && (view2 = constraintPropertyById.getView()) != null) {
                        view2.addOnLayoutChangeListener(this.LIZ.LLLFF);
                    }
                } else {
                    ConstraintProperty constraintPropertyById2 = layeredElementContext.getConstraintPropertyById(R.id.ea1);
                    if (constraintPropertyById2 != null && (view = constraintPropertyById2.getView()) != null) {
                        view.removeOnLayoutChangeListener(this.LIZ.LLLFF);
                    }
                }
                C1082620eHM.LIZJ(this.LIZ, false, false, 3);
            }
        });
        if (!abstractC1080560eE2.isAnchor()) {
            addSceneObserver(new WidgetHiddenChangedSceneObserver() { // from class: X.0eHV
                {
                    super(R.id.isf);
                }

                @Override // com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver
                public final void onHiddenChanged(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, boolean z) {
                    View view;
                    View view2;
                    boolean z2 = !z;
                    this.LIZ.LLJILLL = z2;
                    if (z2) {
                        ConstraintProperty constraintPropertyById = layeredElementContext.getConstraintPropertyById(R.id.isf);
                        if (constraintPropertyById != null && (view2 = constraintPropertyById.getView()) != null) {
                            view2.addOnLayoutChangeListener(this.LIZ.LLLFFI);
                        }
                    } else {
                        ConstraintProperty constraintPropertyById2 = layeredElementContext.getConstraintPropertyById(R.id.isf);
                        if (constraintPropertyById2 != null && (view = constraintPropertyById2.getView()) != null) {
                            view.removeOnLayoutChangeListener(this.LIZ.LLLFFI);
                        }
                    }
                    C1082620eHM.LIZJ(this.LIZ, false, false, 3);
                }
            });
        }
        addSceneObserver(new DataChannelSceneObserver<Boolean, CommentPinWidgetVisibility>() { // from class: X.0eG6
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<CommentPinWidgetVisibility> getType() {
                return CommentPinWidgetVisibility.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
                View view;
                View view2;
                boolean zBooleanValue = bool.booleanValue();
                this.LIZ.LLJJ = zBooleanValue;
                if (zBooleanValue) {
                    ConstraintProperty constraintPropertyById = layeredElementContext.getConstraintPropertyById(R.id.qhj);
                    if (constraintPropertyById != null && (view2 = constraintPropertyById.getView()) != null) {
                        view2.addOnLayoutChangeListener(this.LIZ.LLLI);
                    }
                } else {
                    ConstraintProperty constraintPropertyById2 = layeredElementContext.getConstraintPropertyById(R.id.qhj);
                    if (constraintPropertyById2 != null && (view = constraintPropertyById2.getView()) != null) {
                        view.removeOnLayoutChangeListener(this.LIZ.LLLI);
                    }
                }
                if (C500260Jjc.LJJJI((Boolean) this.LIZ.LL.getDataChannel().gg0(PublicScreenHeightInsufficient.class))) {
                    C1082620eHM.LIZJ(this.LIZ, false, false, 3);
                }
            }
        });
        if (abstractC1080560eE2.isAnchor()) {
            addSceneObserver(new WidgetHiddenChangedSceneObserver() { // from class: X.0eHW
                {
                    super(R.id.jb9);
                }

                @Override // com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver
                public final void onHiddenChanged(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, boolean z) {
                    View view;
                    View view2;
                    boolean z2 = !z;
                    this.LIZ.LLJJIJIIJIL = z2;
                    if (z2) {
                        ConstraintProperty constraintPropertyById = layeredElementContext.getConstraintPropertyById(R.id.jb9);
                        if (constraintPropertyById != null && (view2 = constraintPropertyById.getView()) != null) {
                            view2.addOnLayoutChangeListener(this.LIZ.LLLFZ);
                        }
                    } else {
                        ConstraintProperty constraintPropertyById2 = layeredElementContext.getConstraintPropertyById(R.id.jb9);
                        if (constraintPropertyById2 != null && (view = constraintPropertyById2.getView()) != null) {
                            view.removeOnLayoutChangeListener(this.LIZ.LLLFZ);
                        }
                    }
                    C1082620eHM.LIZJ(this.LIZ, false, false, 3);
                }
            });
        }
        addSceneObserver(new DataChannelSceneObserver<Integer, BattleTaskGuideTipShowChannel>() { // from class: X.0eG4
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<BattleTaskGuideTipShowChannel> getType() {
                return BattleTaskGuideTipShowChannel.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Integer num) {
                int dimensionPixelSize;
                int iIntValue = num.intValue();
                C1082620eHM c1082620eHM = this.LIZ;
                if (iIntValue != 1) {
                    if (iIntValue != 2) {
                        dimensionPixelSize = 0;
                    } else {
                        dimensionPixelSize = layeredElementContext.getContext().getResources().getDimensionPixelSize(R.dimen.akf);
                    }
                } else {
                    dimensionPixelSize = layeredElementContext.getContext().getResources().getDimensionPixelSize(R.dimen.ake);
                }
                c1082620eHM.LLJJL = dimensionPixelSize;
                C1082620eHM.LIZJ(this.LIZ, false, false, 3);
            }
        });
        addSceneObserver(new DataChannelSceneObserver<Boolean, BattleBonusTaskShowChannel>() { // from class: X.0eG7
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<BattleBonusTaskShowChannel> getType() {
                return BattleBonusTaskShowChannel.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
                int dimensionPixelSize;
                if (bool.booleanValue()) {
                    dimensionPixelSize = layeredElementContext.getContext().getResources().getDimensionPixelSize(R.dimen.akd);
                } else {
                    dimensionPixelSize = 0;
                }
                C1082620eHM c1082620eHM = this.LIZ;
                if (dimensionPixelSize != c1082620eHM.LLJJLIIIJLLLLLLLZ) {
                    c1082620eHM.LLJJLIIIJLLLLLLLZ = dimensionPixelSize;
                    C1082620eHM.LIZJ(c1082620eHM, false, false, 3);
                }
            }
        });
        addSceneObserver(new DataChannelSceneObserver<List<? extends C923440a8c>, HostGuestListChangeEvent>() { // from class: X.0eHD
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<HostGuestListChangeEvent> getType() {
                return HostGuestListChangeEvent.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, List<? extends C923440a8c> list) {
                int dimensionPixelSize;
                int i;
                IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
                int size = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).tH2().size();
                int size2 = iInteractService.nr2().size() - size;
                boolean zLJJ = C497740JfY.LJJ();
                if (!(!list.isEmpty()) || (zLJJ ? size2 <= 0 : size <= 0)) {
                    dimensionPixelSize = 0;
                } else {
                    Resources resources = layeredElementContext.getContext().getResources();
                    if (zLJJ) {
                        i = R.dimen.alk;
                    } else {
                        i = R.dimen.alj;
                    }
                    dimensionPixelSize = resources.getDimensionPixelSize(i);
                }
                C1082620eHM c1082620eHM = this.LIZ;
                if (dimensionPixelSize != c1082620eHM.LLJL) {
                    c1082620eHM.LLJL = dimensionPixelSize;
                    C1082620eHM.LIZJ(c1082620eHM, false, false, 3);
                }
            }
        });
        if (InteractiveGiftAdjustSetting.INSTANCE.getValue()) {
            addSceneObserver(new DataChannelSceneObserver<Integer, BattleBonusTaskAddOnHeightChannel>() { // from class: X.0eG3
                @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                public final Class<BattleBonusTaskAddOnHeightChannel> getType() {
                    return BattleBonusTaskAddOnHeightChannel.class;
                }

                {
                    super(true);
                }

                @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Integer num) {
                    int iIntValue = num.intValue();
                    C1082620eHM c1082620eHM = this.LIZ;
                    if (iIntValue != c1082620eHM.LLJLILLLLZIIL) {
                        c1082620eHM.LLJLILLLLZIIL = iIntValue;
                        C1082620eHM.LIZJ(c1082620eHM, false, false, 3);
                    }
                }
            });
        }
        ElementSpecImplKt.onAttach(this, new AwS383S0200000_17(this, abstractC1080560eE2, 112));
        this.LLLF = new ViewOnLayoutChangeListenerC1151610g4d(this, 14);
        this.LLLFF = new ViewOnLayoutChangeListenerC1151610g4d(this, 15);
        this.LLLFFI = new ViewOnLayoutChangeListenerC1151610g4d(this, 18);
        this.LLLFZ = new ViewOnLayoutChangeListenerC1151610g4d(this, 17);
        this.LLLI = new ViewOnLayoutChangeListenerC1151610g4d(this, 16);
    }

    @Override // X.AbstractC1082660eHQ
    public final void LIZ(C1082760eHa c1082760eHa) {
        C770910ULx c770910ULx = c1082760eHa.LIZ;
        boolean z = c770910ULx.LIZ;
        if (this.LLILLL && this.LLJJJJJIL != null) {
            if (z) {
                this.LLILLJJLI = c770910ULx.LIZIZ;
            } else {
                this.LLILLJJLI = 0;
                C770910ULx c770910ULx2 = c1082760eHa.LIZIZ;
                if (c770910ULx2 != null && (LiveGiftTrayPublicScreenTranslateSetting.INSTANCE.canGiftTrayTranslationXfer(c770910ULx2.LIZLLL) || c770910ULx2.LJ == EnumC766540U5c.STICKER_EFFECT_PANEL || (LiveBeautyPanelAlphaOptSetting.INSTANCE.enable() && c770910ULx2.LJ == EnumC766540U5c.BEAUTY_PANEL))) {
                    this.LLILLJJLI = c770910ULx2.LIZIZ;
                }
            }
            ConstraintProperty constraintProperty = this.LLJJJJJIL;
            if (constraintProperty != null) {
                LIZLLL(constraintProperty);
            }
            LIZJ(this, true, false, 2);
        }
    }

    public final void LIZLLL(ConstraintProperty constraintProperty) {
        constraintProperty.removeConstraints(3);
        constraintProperty.removeConstraints(4);
        int i = this.LLJJJIL;
        if (i == -1) {
            if ((!((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad() || !C500260Jjc.LJJII(C497740JfY.LIZ)) && this.LLJJJJLIIL) {
                constraintProperty.connect(4, R.id.video_bottom_guideline, 3, this.LL.LIZLLL);
            } else {
                constraintProperty.connect(4, R.id.kw8, 3, this.LL.LIZLLL);
            }
        } else {
            constraintProperty.connect(4, 0, 4, i + this.LL.LIZLLL);
        }
        constraintProperty.apply();
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZIZ(int r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1082620eHM.LIZIZ(int, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.C1082620eHM r7, boolean r8, boolean r9, int r10) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1082620eHM.LIZJ(X.0eHM, boolean, boolean, int):void");
    }
}
