package X;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.guidence.IGuidenceAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.audience.guide.IApplyGuideAbility;
import com.bytedance.android.live.liveinteract.voicechat.main.common.assem.VoiceChatMaskAssem;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.BugFixVoiceChatAvatarSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS416S0200000_15;

/* JADX INFO: renamed from: X.0aPH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C933770aPH implements InterfaceC938700aXE<C938710aXF> {
    public static final /* synthetic */ int LLJIJIL = 0;
    public final InterfaceC937840aVq LL;
    public final LifecycleOwner LLILLJJLI;
    public ViewGroup LLILLL;
    public DataChannel LLILZ;
    public C933460aOm LLILZIL;
    public IGuidenceAbility LLILZLL;
    public C1319900kS4 LLIZ;
    public IApplyGuideAbility LLIZLLLIL;
    public Animator LLJ;
    public boolean LLJI;

    @Override // X.InterfaceC938700aXE
    public final Long LIZ() {
        return null;
    }

    public final void LIZJ() {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        View viewFindViewById4;
        View viewFindViewById5;
        User user;
        ImageModel avatarThumb;
        ViewGroup viewGroup;
        C1324720kZq c1324720kZq;
        View viewFindViewById6;
        View viewFindViewById7;
        View viewFindViewById8;
        View viewFindViewById9;
        View viewFindViewById10;
        User user2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C933770aPH.class.getSimpleName());
        sbLIZ.append("_updateEmptyViewUi uid:");
        C933460aOm c933460aOm = this.LLILZIL;
        sbLIZ.append((c933460aOm == null || (user2 = c933460aOm.LIZ) == null) ? null : user2.getIdStr());
        C20441214yg.LIZIZ("live_guidence", C2188811AlT.LIZIZ(sbLIZ));
        C933460aOm c933460aOm2 = this.LLILZIL;
        if ((c933460aOm2 != null ? c933460aOm2.LIZ : null) == null) {
            ViewGroup viewGroup2 = this.LLILLL;
            if (viewGroup2 != null && (viewFindViewById5 = viewGroup2.findViewById(R.id.h23)) != null) {
                C12ES.LJIILL(0, viewFindViewById5);
            }
            ViewGroup viewGroup3 = this.LLILLL;
            if (viewGroup3 != null && (viewFindViewById4 = viewGroup3.findViewById(R.id.h34)) != null) {
                C12ES.LJIILL(0, viewFindViewById4);
            }
            ViewGroup viewGroup4 = this.LLILLL;
            if (viewGroup4 != null && (viewFindViewById3 = viewGroup4.findViewById(R.id.qt3)) != null) {
                C439101nJ.LJI(viewFindViewById3);
            }
            ViewGroup viewGroup5 = this.LLILLL;
            if (viewGroup5 != null && (viewFindViewById2 = viewGroup5.findViewById(R.id.qt4)) != null) {
                C439101nJ.LJI(viewFindViewById2);
            }
            ViewGroup viewGroup6 = this.LLILLL;
            if (viewGroup6 == null || (viewFindViewById = viewGroup6.findViewById(R.id.jfk)) == null) {
                return;
            }
            C439101nJ.LJI(viewFindViewById);
            return;
        }
        ViewGroup viewGroup7 = this.LLILLL;
        if (viewGroup7 != null && (viewFindViewById10 = viewGroup7.findViewById(R.id.h23)) != null) {
            C439101nJ.LJI(viewFindViewById10);
        }
        ViewGroup viewGroup8 = this.LLILLL;
        if (viewGroup8 != null && (viewFindViewById9 = viewGroup8.findViewById(R.id.h34)) != null) {
            C439101nJ.LJI(viewFindViewById9);
        }
        ViewGroup viewGroup9 = this.LLILLL;
        if (viewGroup9 != null && (viewFindViewById8 = viewGroup9.findViewById(R.id.qt3)) != null) {
            C12ES.LJIILL(0, viewFindViewById8);
        }
        ViewGroup viewGroup10 = this.LLILLL;
        if (viewGroup10 != null && (viewFindViewById7 = viewGroup10.findViewById(R.id.qt4)) != null) {
            C12ES.LJIILL(0, viewFindViewById7);
        }
        ViewGroup viewGroup11 = this.LLILLL;
        if (viewGroup11 != null && (viewFindViewById6 = viewGroup11.findViewById(R.id.jfk)) != null) {
            C12ES.LJIILL(0, viewFindViewById6);
        }
        C933460aOm c933460aOm3 = this.LLILZIL;
        if (c933460aOm3 == null || (user = c933460aOm3.LIZ) == null || (avatarThumb = user.getAvatarThumb()) == null || (viewGroup = this.LLILLL) == null || (c1324720kZq = (C1324720kZq) viewGroup.findViewById(R.id.qt3)) == null) {
            return;
        }
        AwS416S0200000_15 awS416S0200000_15 = new AwS416S0200000_15(avatarThumb, c1324720kZq, 106);
        if (!BugFixVoiceChatAvatarSetting.INSTANCE.enable()) {
            awS416S0200000_15.invoke();
        } else if (!c1324720kZq.isLaidOut() || c1324720kZq.isLayoutRequested()) {
            c1324720kZq.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC986920bn0(awS416S0200000_15, 8));
        } else {
            awS416S0200000_15.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(boolean r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C933770aPH.LIZIZ(boolean, boolean):void");
    }

    public C933770aPH(InterfaceC937840aVq interfaceC937840aVq, Context context, VoiceChatMaskAssem voiceChatMaskAssem) {
        this.LL = interfaceC937840aVq;
        this.LLILLJJLI = voiceChatMaskAssem;
    }
}
