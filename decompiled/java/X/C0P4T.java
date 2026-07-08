package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.bottom.BulletinCreatorEditAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinInputRightContainer;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinVoiceRecordViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinTooltipAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: renamed from: X.0P4T, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P4T implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.$t) {
            case 0:
                return onPreDraw$0(this);
            case 1:
                return onPreDraw$1(this);
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(C0P4T c0p4t) {
        if (((C197039127h) c0p4t.l0).getVisibility() == 0 && ((C197039127h) c0p4t.l0).getWidth() > 0 && ((C197039127h) c0p4t.l0).getHeight() > 0) {
            C786410Ut5.D3(((C197039127h) c0p4t.l0).getViewTreeObserver(), c0p4t);
            BulletinCreatorEditAssem bulletinCreatorEditAssem = (BulletinCreatorEditAssem) c0p4t.l1;
            BulletinTooltipAbility bulletinTooltipAbility = (BulletinTooltipAbility) bulletinCreatorEditAssem.LLJJJIL.getValue();
            if (bulletinTooltipAbility != null) {
                bulletinTooltipAbility.gA2(EnumC619900OTc.VIDEO_TOOLTIP, new C620440OVe(true, bulletinCreatorEditAssem));
            }
        }
        return true;
    }

    public static final boolean onPreDraw$1(C0P4T c0p4t) {
        if (((TuxIconView) c0p4t.l0).getVisibility() == 0 && ((TuxIconView) c0p4t.l0).getWidth() > 0 && ((TuxIconView) c0p4t.l0).getHeight() > 0) {
            C786410Ut5.D3(((TuxIconView) c0p4t.l0).getViewTreeObserver(), c0p4t);
            final BulletinInputRightContainer bulletinInputRightContainer = (BulletinInputRightContainer) c0p4t.l1;
            final TuxIconView tuxIconView = (TuxIconView) c0p4t.l0;
            BulletinTooltipAbility bulletinTooltipAbility = (BulletinTooltipAbility) bulletinInputRightContainer.LLJJJIL.getValue();
            if (bulletinTooltipAbility != null) {
                bulletinTooltipAbility.gA2(EnumC619900OTc.VOICE_TOOLTIP, new InterfaceC619970OTj() { // from class: X.0OWu
                    @Override // X.InterfaceC619970OTj
                    public final boolean isAvailable() {
                        if (!((BulletinProfileViewModel) bulletinInputRightContainer.LLJJIJI.getValue()).To() || tuxIconView.getVisibility() != 0) {
                            return false;
                        }
                        AssemVMLazy assemVMLazy = bulletinInputRightContainer.LLJJIJIL;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BulletinInputRightContainer.LLJJJJJIL;
                        if (((BulletinVoiceRecordViewModel) assemVMLazy.getValue()).LLILZLL.getValue() != EnumC194439115h.INITIAL) {
                            return false;
                        }
                        C0OP4.LIZ.getClass();
                        return C0OP4.LIZ().getBoolean("bulletin_voice_record_guide_tip", false) ^ true;
                    }

                    @Override // X.InterfaceC619970OTj
                    public final void q0(Function0<Unit> function0) {
                        String string = tuxIconView.getContext().getString(2131828182);
                        C450720Hlu c450720Hlu = new C450720Hlu(tuxIconView.getContext());
                        c450720Hlu.LLILZ = string;
                        View view = tuxIconView;
                        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                        c1391600mJi.LIZIZ = view;
                        c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
                        c1391600mJi.LJIIL = true;
                        c450720Hlu.LLILLJJLI.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
                        c450720Hlu.LLILLJJLI.LJFF = -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                        c450720Hlu.LJ(AFwS195S0000000_9.get$arr$(413));
                        c450720Hlu.LIZJ(new AwS588S0100000_9(function0, (Function0<Unit>) 478));
                        c450720Hlu.LLILLJJLI.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
                        c450720Hlu.LIZIZ().show();
                    }
                });
            }
        }
        return true;
    }

    public C0P4T(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
