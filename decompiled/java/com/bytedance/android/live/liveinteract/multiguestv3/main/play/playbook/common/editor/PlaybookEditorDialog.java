package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor;

import X.AbstractC21673619ry;
import X.C01GW;
import X.C01JX;
import X.C01NB;
import X.C092O;
import X.C09JN;
import X.C0TVI;
import X.C0UO0;
import X.C0UX6;
import X.C1119170fEJ;
import X.C14K9;
import X.C16FZ;
import X.C174500lj;
import X.C174600lk;
import X.C1848410yCV;
import X.C1911200zpm;
import X.C19487311Lz;
import X.C1AZW;
import X.C20373514nl;
import X.C20374514nv;
import X.C20374614nw;
import X.C20378714ob;
import X.C20379014oe;
import X.C20379114of;
import X.C20379814om;
import X.C20379914on;
import X.C20380014oo;
import X.C20380414os;
import X.C20380514ot;
import X.C20483915Dh;
import X.C20736316Cj;
import X.C2187701Ajg;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C405101hp;
import X.C452501pT;
import X.C480460Ism;
import X.C497740JfY;
import X.C500060JjI;
import X.C500260Jjc;
import X.C500501xD;
import X.C510160Jza;
import X.C515801zg;
import X.C516201zk;
import X.C5182020e;
import X.C758170Tod;
import X.C786410Ut5;
import X.C915190ZvJ;
import X.C951190arN;
import X.C953390auv;
import X.C978360bZC;
import X.InterfaceC170900l9;
import X.InterfaceC20381914p7;
import Y.ACListenerS165S0100000_31;
import Y.AObserverS233S0100000_31;
import Y.ARunnableS131S0100000_31;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import avg.f;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.PlaybookImageWidthHeightConfigSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.IPlaybookApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.BasePlaybookEditorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.PlaybookEditorDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.event.PlaybookEditorInterceptEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.extra.PlaybookEditorBizExtraDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.pgc.PGCPlaybookEditorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.select.PlaybookEditorSelectEntityDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.sort.PlaybookEditorSortDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.tag.PlaybookEditorAddTagDialog;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookCreateInfoParams;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPlaybookUGCAISetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS240S0300000_31;
import kotlin.jvm.internal.AwS275S0300000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS608S0100000_29;
import mf.a;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: loaded from: classes32.dex */
public final class PlaybookEditorDialog extends BasePlaybookSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+HELIOSKSwiZz8/KTxiOSMyMScjJiR9KyohJCA9ZiAoIDs8OmscJS4qKiojIgo3ITEjOws6KSkjLg==";
    public boolean LLLF;
    public View LLLFF;
    public C16FZ LLLFFI;
    public C510160Jza LLLFZ;
    public RecyclerView LLLI;
    public LinearLayoutManager LLLII;
    public C20379814om LLLIIII;
    public C20374614nw LLLIIIIL;
    public DataChannel LLLIIIL;
    public BasePlaybookService<?> LLLIIL;
    public Playbook LLLIILIL;
    public Function0<Unit> LLLIL;
    public boolean LLLILZ;
    public long LLLILZJ;
    public C20379014oe LLLILZLLLI;
    public BasePlaybookSheetFragment LLLLIL;
    public PlaybookEditorSortDialog LLLLILI;
    public PlaybookEditorSelectEntityDialog LLLLJ;
    public PlaybookEditorAddTagDialog LLLLJI;
    public PlaybookEditorBizExtraDialog LLLLL;
    public final boolean LLJZIJLIL = true;
    public final String LLL = "playbook_editor_panel";
    public final C01GW LLLIZZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 147));
    public final C01GW LLLJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 148));
    public final C01GW LLLJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 152));
    public final C01GW LLLJL = C452501pT.LIZIZ(new C5182020e(this, 51));
    public final C01GW LLLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 146));
    public final C01GW LLLLII = C452501pT.LIZIZ(new AwS575S0100000_31(this, 151));
    public final C01GW LLLLIIIILLL = C452501pT.LIZIZ(new C5182020e(this, 49));
    public final C500501xD LLLLIIL = new InterfaceC20381914p7() { // from class: X.01xD
        @Override // X.InterfaceC20381914p7
        public final void LIZIZ() {
            PGCPlaybookEditorViewModel pGCPlaybookEditorViewModel;
            PlaybookEditorDialog playbookEditorDialog = this.LIZ;
            playbookEditorDialog.getClass();
            C20441214yg.LJIIIZ("Editor_PlaybookEditorDialog", "showAddExtraDialog");
            PlaybookEditorBizExtraDialog playbookEditorBizExtraDialog = playbookEditorDialog.LLLLL;
            if (playbookEditorBizExtraDialog == null || !playbookEditorBizExtraDialog.isVisible()) {
                BasePlaybookEditorViewModel basePlaybookEditorViewModelBS = playbookEditorDialog.BS();
                if (!(basePlaybookEditorViewModelBS instanceof PGCPlaybookEditorViewModel) || (pGCPlaybookEditorViewModel = (PGCPlaybookEditorViewModel) basePlaybookEditorViewModelBS) == null) {
                    return;
                }
                String str = PlaybookEditorBizExtraDialog._pnsPageId;
                C5183020f c5183020f = new C5183020f(playbookEditorDialog, 247);
                PlaybookEditorBizExtraDialog playbookEditorBizExtraDialog2 = new PlaybookEditorBizExtraDialog();
                playbookEditorBizExtraDialog2.LLJZIJLIL = pGCPlaybookEditorViewModel;
                playbookEditorBizExtraDialog2.LLL = c5183020f;
                playbookEditorDialog.LLLLL = playbookEditorBizExtraDialog2;
                try {
                    C20484615Do c20484615Do = playbookEditorDialog.LLJJIJIL;
                    if (c20484615Do != null) {
                        c20484615Do.LJIIJ(playbookEditorBizExtraDialog2, "PlaybookEditorBizExtraDialog");
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C20441214yg.LJ("EditorUtils", th.getMessage());
                }
            }
        }
    };
    public final C01GW LLLLIILL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 149));
    public final C01GW LLLLIILLL = C452501pT.LIZIZ(new C5182020e(this, 50));

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final int aS() {
        return 1;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final int getLayoutId() {
        return R.layout.hax;
    }

    public final BasePlaybookEditorViewModel BS() {
        return (BasePlaybookEditorViewModel) this.LLLLIILLL.getValue();
    }

    public final boolean ES() {
        Playbook playbook = this.LLLIILIL;
        return C500260Jjc.LJJJI(playbook != null ? Boolean.valueOf(playbook.LIZ()) : null);
    }

    public final String HS() {
        return this.LLLIILIL == null ? "create" : "edit";
    }

    public final Long JS() {
        Playbook playbook = this.LLLIILIL;
        if (playbook != null) {
            return Long.valueOf(playbook.playbookId);
        }
        return null;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C500060JjI cS() {
        C500060JjI c500060JjI = new C500060JjI();
        final int i = 0;
        c500060JjI.LIZJ = 0;
        ArrayList arrayList = new ArrayList();
        final int i2 = 1;
        if (this.LLLIILIL == null) {
            C510160Jza c510160Jza = new C510160Jza(C497740JfY.LJIJI(2131854938), R.style.ajw, new C092O() { // from class: X.14nk
                @Override // X.C092O
                public final void accept(Object obj) {
                    BasePlaybookEditorViewModel basePlaybookEditorViewModelBS;
                    C510160Jza c510160Jza2 = (C510160Jza) obj;
                    C20374514nv.LIZIZ(this.LIZ.getView());
                    int i3 = i;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                this.LIZ.close(1);
                                return;
                            }
                            return;
                        }
                        PlaybookEditorDialog playbookEditorDialog = this.LIZ;
                        Playbook playbook = playbookEditorDialog.LLLIILIL;
                        if (playbook == null || (basePlaybookEditorViewModelBS = playbookEditorDialog.BS()) == null || !C20374514nv.LIZ(playbookEditorDialog.LLLIIIIL, basePlaybookEditorViewModelBS, new AwS608S0100000_29(playbookEditorDialog, 727))) {
                            return;
                        }
                        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                        C978360bZC.LJIJ("edit_playbook", "save", playbookEditorDialog.JS(), playbookEditorDialog.HS(), playbookEditorDialog.ES(), null, null);
                        if (playbook.totalFavorites > 0) {
                            Context context = playbookEditorDialog.getContext();
                            if (context == null) {
                                return;
                            }
                            C20374514nv.LJIIL(context, C497740JfY.LJIJI(2131854109), C497740JfY.LJIJI(2131854110), C497740JfY.LJIJI(2131851415), C497740JfY.LJIJI(2131854087), false, new AwS240S0300000_31(c510160Jza2, basePlaybookEditorViewModelBS, playbookEditorDialog, 38));
                            return;
                        }
                        PlaybookEditorDialog.GS(c510160Jza2, basePlaybookEditorViewModelBS, playbookEditorDialog);
                        return;
                    }
                    PlaybookEditorDialog playbookEditorDialog2 = this.LIZ;
                    BasePlaybookEditorViewModel basePlaybookEditorViewModelBS2 = playbookEditorDialog2.BS();
                    if (basePlaybookEditorViewModelBS2 == null || !C20374514nv.LIZ(playbookEditorDialog2.LLLIIIIL, basePlaybookEditorViewModelBS2, new AwS608S0100000_29(playbookEditorDialog2, 726))) {
                        return;
                    }
                    C915190ZvJ c915190ZvJ2 = C978360bZC.LIZJ;
                    C978360bZC.LJIJ("edit_playbook", "create", playbookEditorDialog2.JS(), playbookEditorDialog2.HS(), playbookEditorDialog2.ES(), null, null);
                    Boolean boolLIZ = InterfaceC1106030et7.S8.LIZ();
                    if (boolLIZ != null && !boolLIZ.booleanValue()) {
                        PlaybookEditorDialog.FS(c510160Jza2, basePlaybookEditorViewModelBS2, playbookEditorDialog2);
                        return;
                    }
                    Context context2 = playbookEditorDialog2.getContext();
                    if (context2 == null) {
                        return;
                    }
                    C20374514nv.LJIIL(context2, C497740JfY.LJIJI(2131854046), C497740JfY.LJIJI(2131854045), C497740JfY.LJIJI(2131854938), C497740JfY.LJIJI(2131854087), false, new AwS240S0300000_31(c510160Jza2, basePlaybookEditorViewModelBS2, playbookEditorDialog2, 37));
                }
            });
            C20374514nv.LJIIJJI(c510160Jza, false);
            this.LLLFZ = c510160Jza;
            arrayList.add(c510160Jza);
        } else {
            final int i3 = 2;
            arrayList.add(new C510160Jza(C497740JfY.LJIJI(2131854971), R.style.ajx, new C092O() { // from class: X.14nk
                @Override // X.C092O
                public final void accept(Object obj) {
                    BasePlaybookEditorViewModel basePlaybookEditorViewModelBS;
                    C510160Jza c510160Jza2 = (C510160Jza) obj;
                    C20374514nv.LIZIZ(this.LIZ.getView());
                    int i32 = i3;
                    if (i32 != 0) {
                        if (i32 != 1) {
                            if (i32 == 2) {
                                this.LIZ.close(1);
                                return;
                            }
                            return;
                        }
                        PlaybookEditorDialog playbookEditorDialog = this.LIZ;
                        Playbook playbook = playbookEditorDialog.LLLIILIL;
                        if (playbook == null || (basePlaybookEditorViewModelBS = playbookEditorDialog.BS()) == null || !C20374514nv.LIZ(playbookEditorDialog.LLLIIIIL, basePlaybookEditorViewModelBS, new AwS608S0100000_29(playbookEditorDialog, 727))) {
                            return;
                        }
                        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                        C978360bZC.LJIJ("edit_playbook", "save", playbookEditorDialog.JS(), playbookEditorDialog.HS(), playbookEditorDialog.ES(), null, null);
                        if (playbook.totalFavorites > 0) {
                            Context context = playbookEditorDialog.getContext();
                            if (context == null) {
                                return;
                            }
                            C20374514nv.LJIIL(context, C497740JfY.LJIJI(2131854109), C497740JfY.LJIJI(2131854110), C497740JfY.LJIJI(2131851415), C497740JfY.LJIJI(2131854087), false, new AwS240S0300000_31(c510160Jza2, basePlaybookEditorViewModelBS, playbookEditorDialog, 38));
                            return;
                        }
                        PlaybookEditorDialog.GS(c510160Jza2, basePlaybookEditorViewModelBS, playbookEditorDialog);
                        return;
                    }
                    PlaybookEditorDialog playbookEditorDialog2 = this.LIZ;
                    BasePlaybookEditorViewModel basePlaybookEditorViewModelBS2 = playbookEditorDialog2.BS();
                    if (basePlaybookEditorViewModelBS2 == null || !C20374514nv.LIZ(playbookEditorDialog2.LLLIIIIL, basePlaybookEditorViewModelBS2, new AwS608S0100000_29(playbookEditorDialog2, 726))) {
                        return;
                    }
                    C915190ZvJ c915190ZvJ2 = C978360bZC.LIZJ;
                    C978360bZC.LJIJ("edit_playbook", "create", playbookEditorDialog2.JS(), playbookEditorDialog2.HS(), playbookEditorDialog2.ES(), null, null);
                    Boolean boolLIZ = InterfaceC1106030et7.S8.LIZ();
                    if (boolLIZ != null && !boolLIZ.booleanValue()) {
                        PlaybookEditorDialog.FS(c510160Jza2, basePlaybookEditorViewModelBS2, playbookEditorDialog2);
                        return;
                    }
                    Context context2 = playbookEditorDialog2.getContext();
                    if (context2 == null) {
                        return;
                    }
                    C20374514nv.LJIIL(context2, C497740JfY.LJIJI(2131854046), C497740JfY.LJIJI(2131854045), C497740JfY.LJIJI(2131854938), C497740JfY.LJIJI(2131854087), false, new AwS240S0300000_31(c510160Jza2, basePlaybookEditorViewModelBS2, playbookEditorDialog2, 37));
                }
            }));
            C510160Jza c510160Jza2 = new C510160Jza(C497740JfY.LJIJI(2131853960), R.style.ajw, new C092O() { // from class: X.14nk
                @Override // X.C092O
                public final void accept(Object obj) {
                    BasePlaybookEditorViewModel basePlaybookEditorViewModelBS;
                    C510160Jza c510160Jza22 = (C510160Jza) obj;
                    C20374514nv.LIZIZ(this.LIZ.getView());
                    int i32 = i2;
                    if (i32 != 0) {
                        if (i32 != 1) {
                            if (i32 == 2) {
                                this.LIZ.close(1);
                                return;
                            }
                            return;
                        }
                        PlaybookEditorDialog playbookEditorDialog = this.LIZ;
                        Playbook playbook = playbookEditorDialog.LLLIILIL;
                        if (playbook == null || (basePlaybookEditorViewModelBS = playbookEditorDialog.BS()) == null || !C20374514nv.LIZ(playbookEditorDialog.LLLIIIIL, basePlaybookEditorViewModelBS, new AwS608S0100000_29(playbookEditorDialog, 727))) {
                            return;
                        }
                        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                        C978360bZC.LJIJ("edit_playbook", "save", playbookEditorDialog.JS(), playbookEditorDialog.HS(), playbookEditorDialog.ES(), null, null);
                        if (playbook.totalFavorites > 0) {
                            Context context = playbookEditorDialog.getContext();
                            if (context == null) {
                                return;
                            }
                            C20374514nv.LJIIL(context, C497740JfY.LJIJI(2131854109), C497740JfY.LJIJI(2131854110), C497740JfY.LJIJI(2131851415), C497740JfY.LJIJI(2131854087), false, new AwS240S0300000_31(c510160Jza22, basePlaybookEditorViewModelBS, playbookEditorDialog, 38));
                            return;
                        }
                        PlaybookEditorDialog.GS(c510160Jza22, basePlaybookEditorViewModelBS, playbookEditorDialog);
                        return;
                    }
                    PlaybookEditorDialog playbookEditorDialog2 = this.LIZ;
                    BasePlaybookEditorViewModel basePlaybookEditorViewModelBS2 = playbookEditorDialog2.BS();
                    if (basePlaybookEditorViewModelBS2 == null || !C20374514nv.LIZ(playbookEditorDialog2.LLLIIIIL, basePlaybookEditorViewModelBS2, new AwS608S0100000_29(playbookEditorDialog2, 726))) {
                        return;
                    }
                    C915190ZvJ c915190ZvJ2 = C978360bZC.LIZJ;
                    C978360bZC.LJIJ("edit_playbook", "create", playbookEditorDialog2.JS(), playbookEditorDialog2.HS(), playbookEditorDialog2.ES(), null, null);
                    Boolean boolLIZ = InterfaceC1106030et7.S8.LIZ();
                    if (boolLIZ != null && !boolLIZ.booleanValue()) {
                        PlaybookEditorDialog.FS(c510160Jza22, basePlaybookEditorViewModelBS2, playbookEditorDialog2);
                        return;
                    }
                    Context context2 = playbookEditorDialog2.getContext();
                    if (context2 == null) {
                        return;
                    }
                    C20374514nv.LJIIL(context2, C497740JfY.LJIJI(2131854046), C497740JfY.LJIJI(2131854045), C497740JfY.LJIJI(2131854938), C497740JfY.LJIJI(2131854087), false, new AwS240S0300000_31(c510160Jza22, basePlaybookEditorViewModelBS2, playbookEditorDialog2, 37));
                }
            });
            C20374514nv.LJIIJJI(c510160Jza2, false);
            this.LLLFZ = c510160Jza2;
            arrayList.add(c510160Jza2);
        }
        c500060JjI.LIZ(arrayList);
        return c500060JjI;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        if (this.LLLILZ) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C758170Tod(R.attr.d33, new ACListenerS165S0100000_31(this, 23)));
            c1119170fEJ.LJ = arrayList;
        }
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131854043));
        c1119170fEJ.LJI = false;
        if (LinkMicPlaybookUGCAISetting.INSTANCE.isEnable() && this.LLLIILIL == null) {
            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
            C978360bZC.LJIJJ("edit_playbook", "ai_generate_playbook", JS(), HS(), Boolean.valueOf(ES()), 32);
            ArrayList arrayList2 = new ArrayList();
            if (VR() != null) {
                arrayList2.add(new C758170Tod(R.attr.ef8, new ACListenerS165S0100000_31(this, 24)));
            }
            c1119170fEJ.LJFF = arrayList2;
        }
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final void nS() {
        if (this.LLLIILIL != null) {
            C1911200zpm.LIZIZ(this);
            return;
        }
        C20374514nv.LIZIZ(this.LLLFF);
        BasePlaybookEditorViewModel basePlaybookEditorViewModelBS = BS();
        if (basePlaybookEditorViewModelBS == null || C20374514nv.LIZJ(basePlaybookEditorViewModelBS, getContext(), new C20379914on(this))) {
            return;
        }
        super.nS();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void sl() {
        if (this.LLLIILIL != null) {
            C1911200zpm.LIZIZ(this);
            return;
        }
        C20374514nv.LIZIZ(this.LLLFF);
        BasePlaybookEditorViewModel basePlaybookEditorViewModelBS = BS();
        if (basePlaybookEditorViewModelBS == null || C20374514nv.LIZJ(basePlaybookEditorViewModelBS, getContext(), new C20380014oo(this))) {
            return;
        }
        C1911200zpm.LIZIZ(this);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ViewTreeObserver viewTreeObserver;
        super.onDestroy();
        C20379814om c20379814om = this.LLLIIII;
        if (c20379814om != null) {
            View view = c20379814om.LIZ;
            if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) c20379814om.LJ.getValue();
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                C2187701Ajg.LIZIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
            c20379814om.LIZJ = 0;
            c20379814om.LIZIZ = null;
            c20379814om.LIZ = null;
        }
        this.LLLIIII = null;
        ((C951190arN) this.LLLLIILL.getValue()).LLLIIIIL();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final boolean wS() {
        return this.LLJZIJLIL;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final String yS() {
        return this.LLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void NS(kotlin.jvm.functions.Function0<kotlin.Unit> r33) {
        /*
            Method dump skipped, instruction units count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.PlaybookEditorDialog.NS(kotlin.jvm.functions.Function0):void");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.exw, context);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptionsLIZ = C20373514nl.LIZ(this.LLLILZ);
        if (!this.LLLILZ) {
            sheetOptionsLIZ.canceledOnTouchOutside = true;
        }
        return sheetOptionsLIZ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        Function0<Unit> function0 = this.LLLIL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C20378714ob c20378714ob;
        MutableLiveData<Map<String, String>> mutableLiveData;
        C20378714ob c20378714ob2;
        MutableLiveData<Map<Integer, List<Integer>>> mutableLiveData2;
        C20378714ob c20378714ob3;
        MutableLiveData<C20379114of> mutableLiveData3;
        C20378714ob c20378714ob4;
        MutableLiveData<Boolean> mutableLiveData4;
        BasePlaybookEditorViewModel basePlaybookEditorViewModelBS;
        super.onViewCreated(view, bundle);
        if (LinkMicPlaybookUGCAISetting.INSTANCE.isEnable() && this.LLLIILIL == null && (basePlaybookEditorViewModelBS = BS()) != null) {
            C1AZW.LJIIJ(12, "Editor_PlaybookEditorViewModel", "getCreateInfo", null, null);
            basePlaybookEditorViewModelBS.LLILZ.getClass();
            C1AZW.LJIIJ(12, "Editor_PlaybookEditorModel", "getCreateInfo start", null, null);
            C480460Ism.LIZ().getClass();
            IPlaybookApi iPlaybookApi = (IPlaybookApi) C480460Ism.LIZLLL(IPlaybookApi.class);
            PlaybookCreateInfoParams playbookCreateInfoParams = new PlaybookCreateInfoParams();
            playbookCreateInfoParams.roomId = C01JX.LJII();
            C19487311Lz.LIZJ(C01NB.LIZ(C01NB.LIZIZ(iPlaybookApi.getCreateInfo(playbookCreateInfoParams), "Editor_PlaybookEditorModel", "getCreateInfo").LJJ(C405101hp.LIZLLL).LJIILL(new C09JN() { // from class: X.00SV
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("PlaybookEditorModel@872e.getCreateInfo$2");
                    C930480aJy.LIZ.getClass();
                    if (C930480aJy.LJJIFFI((C470590Icr) obj)) {
                        C1AZW.LJIIJ(12, "Editor_PlaybookEditorModel", "getCreateInfo success", null, null);
                    }
                    C1C7U.LIZIZ("PlaybookEditorModel@872e.getCreateInfo$2");
                }
            })).LJFF(new C0UO0()), basePlaybookEditorViewModelBS.LLILZ.LIZLLL(), new C515801zg(basePlaybookEditorViewModelBS, 57), new C516201zk(271), 24);
        }
        if (this.LLLILZ) {
            View viewFindViewById = view.findViewById(R.id.n65);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
            View viewFindViewById2 = view.findViewById(R.id.eqx);
            if (viewFindViewById2 != null) {
                C14K9.LJIJJ(viewFindViewById2, new C0TVI() { // from class: X.14v8
                    @Override // X.C0TVI
                    public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                        view2.setPadding(view2.getPaddingLeft(), c20246014Ju.LIZ(7).LIZIZ, view2.getPaddingRight(), 0);
                        return c20246014Ju;
                    }
                });
                viewFindViewById2.setBackgroundColor(QM(requireContext()));
            }
        }
        this.LLLFF = view;
        C16FZ c16fz = (C16FZ) view.findViewById(R.id.q1x);
        this.LLLFFI = c16fz;
        C500260Jjc.LJLJLJ(c16fz, true);
        BasePlaybookEditorViewModel basePlaybookEditorViewModelBS2 = BS();
        if (basePlaybookEditorViewModelBS2 != null) {
            basePlaybookEditorViewModelBS2.EQ2(this.LLLIILIL);
        }
        this.LLLI = (RecyclerView) view.findViewById(R.id.twc);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
        this.LLLII = linearLayoutManager;
        RecyclerView recyclerView = this.LLLI;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView2 = this.LLLI;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter((AbstractC21673619ry) this.LLLLIILL.getValue());
        }
        RecyclerView recyclerView3 = this.LLLI;
        if (recyclerView3 != null) {
            recyclerView3.setOverScrollMode(2);
        }
        C20483915Dh c20483915Dh = this.LLIZ;
        if (c20483915Dh != null) {
            View.OnClickListener aCListenerS165S0100000_31 = new ACListenerS165S0100000_31(this, 25);
            if (C1848410yCV.LIZ) {
                aCListenerS165S0100000_31 = new f(aCListenerS165S0100000_31);
            }
            a aVar = new a(aCListenerS165S0100000_31);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c20483915Dh);
            }
            c20483915Dh.setOnClickListener(aVar);
        }
        BasePlaybookEditorViewModel basePlaybookEditorViewModelBS3 = BS();
        if (basePlaybookEditorViewModelBS3 != null && (c20378714ob4 = basePlaybookEditorViewModelBS3.LLILLL) != null && (mutableLiveData4 = c20378714ob4.LIZ) != null) {
            mutableLiveData4.observe(this, new AObserverS233S0100000_31(this, 3));
        }
        BasePlaybookEditorViewModel basePlaybookEditorViewModelBS4 = BS();
        if (basePlaybookEditorViewModelBS4 != null && (c20378714ob3 = basePlaybookEditorViewModelBS4.LLILLL) != null && (mutableLiveData3 = c20378714ob3.LIZIZ) != null) {
            mutableLiveData3.observe(this, new AObserverS233S0100000_31(this, 4));
        }
        BasePlaybookEditorViewModel basePlaybookEditorViewModelBS5 = BS();
        if ((basePlaybookEditorViewModelBS5 instanceof PGCPlaybookEditorViewModel) && basePlaybookEditorViewModelBS5 != null && (c20378714ob2 = basePlaybookEditorViewModelBS5.LLILLL) != null && (mutableLiveData2 = c20378714ob2.LJIIIZ) != null) {
            mutableLiveData2.observe(this, new AObserverS233S0100000_31(this, 5));
        }
        BasePlaybookEditorViewModel basePlaybookEditorViewModelBS6 = BS();
        if ((basePlaybookEditorViewModelBS6 instanceof PGCPlaybookEditorViewModel) && basePlaybookEditorViewModelBS6 != null && (c20378714ob = basePlaybookEditorViewModelBS6.LLILLL) != null && (mutableLiveData = c20378714ob.LJIIJ) != null) {
            mutableLiveData.observe(this, new AObserverS233S0100000_31(this, 6));
        }
        this.LLLIIII = new C20379814om(this.LLLFF);
        View view2 = this.LLLFF;
        if (view2 != null) {
            HandlerHook.viewPost(view2, new ARunnableS131S0100000_31(this, 20));
        }
        RedDotExtensionKt.LIZ(C0UX6.PLAYBOOK_UGC_ENTRANCE);
        RedDotExtensionKt.LIZ(C0UX6.PLAYBOOK_UGC_ENTRANCE_DIRECT);
        RedDotExtensionKt.LIZ(C0UX6.PLAYBOOK_UGC_GO_LIVE_ENTRANCE_DIRECT);
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        C978360bZC.LJIJJLI(JS(), "edit_playbook", HS(), null, ES());
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.14ot] */
    public static final void FS(final C510160Jza c510160Jza, final BasePlaybookEditorViewModel basePlaybookEditorViewModel, final PlaybookEditorDialog playbookEditorDialog) {
        List<Long> list;
        C16FZ c16fz = playbookEditorDialog.LLLFFI;
        if (c16fz != null) {
            C786410Ut5.LLLIZZ(c16fz, 0);
        }
        c510160Jza.LIZIZ(false);
        DataChannel dataChannel = playbookEditorDialog.LLLIIIL;
        if (dataChannel != null) {
            dataChannel.LC0(PlaybookEditorInterceptEvent.class, Boolean.TRUE);
        }
        C20374614nw c20374614nw = playbookEditorDialog.LLLIIIIL;
        if (c20374614nw != null) {
            list = c20374614nw.LIZJ;
        } else {
            list = null;
        }
        ?? r5 = new InterfaceC170900l9<Playbook>() { // from class: X.14ot
            /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x010b  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x017e  */
            @Override // X.InterfaceC170900l9
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(webcast.data.multi_guest_play.Playbook r39) {
                /*
                    Method dump skipped, instruction units count: 429
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C20380514ot.LIZ(java.lang.Object):void");
            }

            @Override // X.InterfaceC170900l9
            public final void onFailed(Throwable th) {
                String message;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fail ");
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                sbLIZ.append(message);
                C1AZW.LJIIJ(12, "Editor_PlaybookEditorDialog", C2188811AlT.LIZIZ(sbLIZ), null, null);
                DataChannel dataChannel2 = playbookEditorDialog.LLLIIIL;
                if (dataChannel2 != null) {
                    dataChannel2.LC0(PlaybookEditorInterceptEvent.class, Boolean.FALSE);
                }
                C16FZ c16fz2 = playbookEditorDialog.LLLFFI;
                if (c16fz2 != null) {
                    C786410Ut5.LLLIZZ(c16fz2, 8);
                }
                c510160Jza.LIZIZ(true);
            }
        };
        basePlaybookEditorViewModel.getClass();
        C1AZW.LJIIJ(12, "Editor_PlaybookEditorViewModel", "publishPlaybook", null, null);
        C20374514nv.LJIIIIZZ(0, "publishPlaybook", "start", "", null);
        if (basePlaybookEditorViewModel.LLILZ.LJ()) {
            C20374514nv.LJIIIIZZ(-1, "publishPlaybook", "check", "hasReadyStartRules", null);
            r5.onFailed(new Throwable("You must wait for all feature configuration processes to complete."));
            return;
        }
        AwS275S0300000_31 awS275S0300000_31 = new AwS275S0300000_31(list, basePlaybookEditorViewModel, (C20380514ot) r5, 36);
        String value = basePlaybookEditorViewModel.LLILLL.LIZJ.getValue();
        if (value != null) {
            PlaybookImageWidthHeightConfigSetting playbookImageWidthHeightConfigSetting = PlaybookImageWidthHeightConfigSetting.INSTANCE;
            C953390auv.LIZ(value, playbookImageWidthHeightConfigSetting.getWidth(), playbookImageWidthHeightConfigSetting.getHeight(), new C174500lj(basePlaybookEditorViewModel, awS275S0300000_31, r5));
        } else {
            awS275S0300000_31.invoke();
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.14os] */
    public static final void GS(final C510160Jza c510160Jza, final BasePlaybookEditorViewModel basePlaybookEditorViewModel, final PlaybookEditorDialog playbookEditorDialog) {
        List<Long> list;
        C16FZ c16fz = playbookEditorDialog.LLLFFI;
        if (c16fz != null) {
            C786410Ut5.LLLIZZ(c16fz, 0);
        }
        c510160Jza.LIZIZ(false);
        C20374614nw c20374614nw = playbookEditorDialog.LLLIIIIL;
        if (c20374614nw != null) {
            list = c20374614nw.LIZJ;
        } else {
            list = null;
        }
        ?? r5 = new InterfaceC170900l9<Playbook>() { // from class: X.14os
            /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x010f  */
            @Override // X.InterfaceC170900l9
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(webcast.data.multi_guest_play.Playbook r38) {
                /*
                    Method dump skipped, instruction units count: 406
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C20380414os.LIZ(java.lang.Object):void");
            }

            @Override // X.InterfaceC170900l9
            public final void onFailed(Throwable th) {
                String message;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fail ");
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                sbLIZ.append(message);
                C1AZW.LJIIJ(12, "Editor_PlaybookEditorDialog", C2188811AlT.LIZIZ(sbLIZ), null, null);
                C16FZ c16fz2 = playbookEditorDialog.LLLFFI;
                if (c16fz2 != null) {
                    C786410Ut5.LLLIZZ(c16fz2, 8);
                }
                c510160Jza.LIZIZ(true);
            }
        };
        basePlaybookEditorViewModel.getClass();
        C1AZW.LJIIJ(12, "Editor_PlaybookEditorViewModel", "republishPlaybook", null, null);
        C20374514nv.LJIIIIZZ(0, "republishPlaybook", "start", "", null);
        if (basePlaybookEditorViewModel.LLILZ.LJ()) {
            C20374514nv.LJIIIIZZ(-1, "republishPlaybook", "check", "hasReadyStartRules", null);
            r5.onFailed(new Throwable("You must wait for all feature configuration processes to complete."));
            return;
        }
        AwS275S0300000_31 awS275S0300000_31 = new AwS275S0300000_31(list, basePlaybookEditorViewModel, (C20380414os) r5, 37);
        String value = basePlaybookEditorViewModel.LLILLL.LIZJ.getValue();
        if (value != null) {
            PlaybookImageWidthHeightConfigSetting playbookImageWidthHeightConfigSetting = PlaybookImageWidthHeightConfigSetting.INSTANCE;
            C953390auv.LIZ(value, playbookImageWidthHeightConfigSetting.getWidth(), playbookImageWidthHeightConfigSetting.getHeight(), new C174600lk(basePlaybookEditorViewModel, awS275S0300000_31, r5));
        } else {
            awS275S0300000_31.invoke();
        }
    }
}
