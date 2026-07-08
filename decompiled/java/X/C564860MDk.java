package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MDk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C564860MDk {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(272));

    public static final void LIZIZ(C539960LFq c539960LFq, ImageEditRootScene imageEditRootScene) {
        C0LEK c0lek = c539960LFq.LIZ;
        C559610Lx9 c559610Lx9 = new C559610Lx9(c0lek, "image_ai_alive");
        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register component ");
        sbLIZ.append(C564850MDj.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(C0MEF.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c0lek.LIZ("image_ai_alive", enumC1642750sqn, null, C0MEF.class, C564850MDj.class, new AwS374S0200000_8(new C0ET4(), c559610Lx9, (C19A3) imageEditRootScene, 101));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("register component ");
        sbLIZ2.append(C565260MEy.class.getName());
        sbLIZ2.append(" api ");
        sbLIZ2.append(C0MEI.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        c0lek.LIZ("image_ai_alive", enumC1642750sqn, null, C0MEI.class, C565260MEy.class, new AwS374S0200000_8(new C0ET4(), c559610Lx9, (C19A3) imageEditRootScene, 102));
        if (C0C64.LJIILLIIL().LJIJ(31744, 1, "studio_ai_alive_show_prompt_list", true) == 1) {
            EnumC1642750sqn enumC1642750sqn2 = EnumC1642750sqn.LAZY;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("register component ");
            sbLIZ3.append(C0MCZ.class.getName());
            sbLIZ3.append(" api ");
            sbLIZ3.append(InterfaceC564820MDg.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
            c0lek.LIZ("image_ai_alive", enumC1642750sqn2, null, InterfaceC564820MDg.class, C0MCZ.class, new AwS587S0100000_8(new C0ET4(), c559610Lx9, 374));
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("register component ");
        sbLIZ4.append(C0MF9.class.getName());
        sbLIZ4.append(" api ");
        sbLIZ4.append(InterfaceC564970MDv.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
        c0lek.LIZ("image_ai_alive", enumC1642750sqn, null, InterfaceC564970MDv.class, C0MF9.class, new AwS587S0100000_8(new C0ET4(), c559610Lx9, 375));
        if (C528260Kng.LIZ()) {
            EnumC1642750sqn enumC1642750sqn3 = EnumC1642750sqn.LAZY;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("register component ");
            sbLIZ5.append(C558700Lvg.class.getName());
            sbLIZ5.append(" api ");
            sbLIZ5.append(C0MEH.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ5));
            c0lek.LIZ("image_ai_alive", enumC1642750sqn3, null, C0MEH.class, C558700Lvg.class, new AwS587S0100000_8(new C0ET4(), c559610Lx9, 377));
        }
        EnumC1642750sqn enumC1642750sqn4 = EnumC1642750sqn.LAZY;
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("register component ");
        sbLIZ6.append(C0ME9.class.getName());
        sbLIZ6.append(" api ");
        sbLIZ6.append(C0MEG.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ6));
        c0lek.LIZ("image_ai_alive", enumC1642750sqn4, null, C0MEG.class, C0ME9.class, new AwS587S0100000_8(new C0ET4(), c559610Lx9, 379));
        C0M8O.LIZ.getClass();
        if (!C0M8O.LIZJ()) {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("register component ");
            sbLIZ7.append(C564880MDm.class.getName());
            sbLIZ7.append(" api ");
            sbLIZ7.append(InterfaceC1460680o78.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ7));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn4, null, InterfaceC1460680o78.class, C564880MDm.class, new AwS374S0200000_8(new C0ET4(), (C559610Lx9) c539960LFq, (C19A3) imageEditRootScene, 98));
        }
        if (C0C06.LIZ()) {
            C1659700tI8.LIZ("register component " + C565960MHq.class.getName() + " api " + C0MEE.class.getName());
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn4, null, C0MEE.class, C565960MHq.class, new AwS374S0200000_8(new C0ET4(), (C559610Lx9) c539960LFq, (C19A3) imageEditRootScene, 99));
        }
    }

    public static final boolean LIZJ(AILivePhotoModel aILivePhotoModel, Activity activity) {
        if (activity == null || !aILivePhotoModel.LJII()) {
            return false;
        }
        C1390390mHl c1390390mHl = C1390390mHl.LIZ;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(2131825310);
        ((C1390360mHi) c1390390mHl.createToast(activity, 6018, creativeToastBuilder)).show();
        return true;
    }

    public static final boolean LIZLLL(AILivePhotoModel aILivePhotoModel, Activity activity) {
        if (activity == null) {
            return false;
        }
        if (!aILivePhotoModel.LJII() && !aILivePhotoModel.LJIIIZ()) {
            return false;
        }
        C1390390mHl c1390390mHl = C1390390mHl.LIZ;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(2131825310);
        ((C1390360mHi) c1390390mHl.createToast(activity, 6018, creativeToastBuilder)).show();
        return true;
    }

    public static final void LJ(Context context, String str, Function0<Unit> function0) {
        int i;
        if (context == null) {
            return;
        }
        if (Intrinsics.LJFF(str, "filter")) {
            i = 2131825315;
        } else {
            i = 2131825314;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LIZ(i);
        c1397580mTM.LJII = false;
        C985403tE.LIZ(c1397580mTM, new AwS587S0100000_8(function0, (Function0<Unit>) 388));
        new C1397510mTF(c1397580mTM).LJ();
    }

    public static final void LIZ(C539960LFq c539960LFq, VideoPublishEditModel videoPublishEditModel, AbstractC1453750nvx abstractC1453750nvx, EnumC371580EhY enumC371580EhY, EnumC1642750sqn enumC1642750sqn, C385670FAf c385670FAf) {
        int i;
        C0LEK c0lek = c539960LFq.LIZ;
        C559610Lx9 c559610Lx9 = new C559610Lx9(c0lek, "ai_alive");
        EnumC1642750sqn enumC1642750sqn2 = EnumC1642750sqn.LAZY;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register component ");
        sbLIZ.append(C564870MDl.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(InterfaceC1455680nz4.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c0lek.LIZ("ai_alive", enumC1642750sqn2, null, InterfaceC1455680nz4.class, C564870MDl.class, new AwS587S0100000_8(new C0ET4(), c559610Lx9, 330));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("register slotUIComponent ");
        sbLIZ2.append(C564830MDh.class.getName());
        sbLIZ2.append(" api ");
        sbLIZ2.append(InterfaceC564900MDo.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        c0lek.LIZIZ("ai_alive", enumC1642750sqn, c385670FAf, InterfaceC564900MDo.class, C564830MDh.class, C0MDX.class, R.id.m89, enumC371580EhY, new AwS374S0200000_8(new C0ET4(), c559610Lx9, abstractC1453750nvx, 97));
        EnumC1642750sqn enumC1642750sqn3 = EnumC1642750sqn.IMMEDIATE;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("register component ");
        sbLIZ3.append(C0ME0.class.getName());
        sbLIZ3.append(" api ");
        sbLIZ3.append(C0MEL.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
        c0lek.LIZ("ai_alive", enumC1642750sqn3, null, C0MEL.class, C0ME0.class, new AwS374S0200000_8(new C0ET4(), c559610Lx9, abstractC1453750nvx, 95));
        if (C0C64.LJIILLIIL().LJIJ(31744, 1, "studio_ai_alive_show_prompt_list", true) == 1) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("register component ");
            sbLIZ4.append(C0MCX.class.getName());
            sbLIZ4.append(" api ");
            sbLIZ4.append(InterfaceC564820MDg.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
            i = 0;
            c0lek.LIZ("ai_alive", enumC1642750sqn2, null, InterfaceC564820MDg.class, C0MCX.class, new AwS587S0100000_8(new C0ET4(), c559610Lx9, 336));
        } else {
            i = 0;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("register component ");
        sbLIZ5.append(C0ME2.class.getName());
        sbLIZ5.append(" api ");
        sbLIZ5.append(C0ME6.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ5));
        c0lek.LIZ("ai_alive", enumC1642750sqn2, null, C0ME6.class, C0ME2.class, new AwS587S0100000_8(new C0ET4(), c559610Lx9, 337));
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("register component ");
        sbLIZ6.append(C564920MDq.class.getName());
        sbLIZ6.append(" api ");
        sbLIZ6.append(C0ME3.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ6));
        c0lek.LIZ("ai_alive", enumC1642750sqn2, null, C0ME3.class, C564920MDq.class, new AwS587S0100000_8(new C0ET4(), c559610Lx9, 338));
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("register component ");
        sbLIZ7.append(C559490Lwx.class.getName());
        sbLIZ7.append(" api ");
        sbLIZ7.append(C0ME1.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ7));
        c0lek.LIZ("ai_alive", enumC1642750sqn2, null, C0ME1.class, C559490Lwx.class, new AwS587S0100000_8(new C0ET4(), c559610Lx9, 340));
        if (C565160MEo.LIZIZ(videoPublishEditModel) && C528260Kng.LIZ()) {
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("register component ");
            sbLIZ8.append(C558700Lvg.class.getName());
            sbLIZ8.append(" api ");
            sbLIZ8.append(C0MEH.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ8));
            c0lek.LIZ("ai_alive", enumC1642750sqn2, null, C0MEH.class, C558700Lvg.class, new AwS587S0100000_8(new C0ET4(), c559610Lx9, 342));
        }
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append("register component ");
        sbLIZ9.append(C0MCB.class.getName());
        sbLIZ9.append(" api ");
        sbLIZ9.append(InterfaceC558740Lvk.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ9));
        c0lek.LIZ("ai_alive", enumC1642750sqn2, null, InterfaceC558740Lvk.class, C0MCB.class, new AwS374S0200000_8(new C0ET4(), c559610Lx9, videoPublishEditModel, 96));
        if (C0C64.LJIILLIIL().LJIJ(31744, i, "studio_ai_alive_error_handle_method", true) > 0) {
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append("register component ");
            sbLIZ10.append(C0ME9.class.getName());
            sbLIZ10.append(" api ");
            sbLIZ10.append(C0MEG.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ10));
            c0lek.LIZ("ai_alive", enumC1642750sqn2, null, C0MEG.class, C0ME9.class, new AwS587S0100000_8(new C0ET4(), c559610Lx9, 348));
            StringBuilder sbLIZ11 = C2188811AlT.LIZ();
            sbLIZ11.append("register component ");
            sbLIZ11.append(C0MCQ.class.getName());
            sbLIZ11.append(" api ");
            sbLIZ11.append(C0MEQ.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ11));
            c0lek.LIZ("ai_alive", enumC1642750sqn2, null, C0MEQ.class, C0MCQ.class, new AwS374S0200000_8(new C0ET4(), c559610Lx9, abstractC1453750nvx, 94));
        } else {
            StringBuilder sbLIZ12 = C2188811AlT.LIZ();
            sbLIZ12.append("register component ");
            sbLIZ12.append(C0MEA.class.getName());
            sbLIZ12.append(" api ");
            sbLIZ12.append(C0MEG.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ12));
            enumC1642750sqn2 = enumC1642750sqn2;
            c0lek.LIZ("ai_alive", enumC1642750sqn2, null, C0MEG.class, C0MEA.class, new AwS587S0100000_8(new C0ET4(), c559610Lx9, 325));
        }
        StringBuilder sbLIZ13 = C2188811AlT.LIZ();
        sbLIZ13.append("register component ");
        sbLIZ13.append(C558710Lvh.class.getName());
        sbLIZ13.append(" api ");
        sbLIZ13.append(InterfaceC564940MDs.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ13));
        c0lek.LIZ("ai_alive", enumC1642750sqn2, null, InterfaceC564940MDs.class, C558710Lvh.class, new AwS587S0100000_8(new C0ET4(), c559610Lx9, 327));
        if (C1414940mvM.LIZJ(videoPublishEditModel)) {
            StringBuilder sbLIZ14 = C2188811AlT.LIZ();
            sbLIZ14.append("register component ");
            sbLIZ14.append(C1414460mua.class.getName());
            sbLIZ14.append(" api ");
            sbLIZ14.append(InterfaceC564930MDr.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ14));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn2, null, InterfaceC564930MDr.class, C1414460mua.class, new AwS587S0100000_8(new C0ET4(), c539960LFq, 392));
        }
        C0M8O.LIZ.getClass();
        if (!C0M8O.LIZJ()) {
            C1659700tI8.LIZ("register component " + C564880MDm.class.getName() + " api " + InterfaceC1460680o78.class.getName());
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn2, null, InterfaceC1460680o78.class, C564880MDm.class, new AwS374S0200000_8(new C0ET4(), c539960LFq, abstractC1453750nvx, 105));
        }
        if (C0C06.LIZ()) {
            C1659700tI8.LIZ("register component " + C0MCI.class.getName() + " api " + C0MCN.class.getName());
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn2, null, C0MCN.class, C0MCI.class, new AwS374S0200000_8(new C0ET4(), c539960LFq, abstractC1453750nvx, 106));
        }
        C1659700tI8.LIZ("register component " + C23227098f.class.getName() + " api " + InterfaceC23228098g.class.getName());
        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn3, null, InterfaceC23228098g.class, C23227098f.class, new AwS587S0100000_8(new C0ET4(), c539960LFq, 405));
    }
}
