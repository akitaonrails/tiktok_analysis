package X;

import Y.ARunnableS106S0100000_6;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.DeclarationOption;
import com.ss.android.ugc.aweme.ogc.declaration.IDeclarationService;
import com.ss.android.ugc.aweme.publish.privacy.PermissionConfigure;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.privacy.ui.EditPageDefaultPrivacySettingFragment;
import com.ss.android.ugc.aweme.shortvideo.privacy.ui.PublishDefaultPermissionFragment;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS118S0110000_32;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.191q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214728191q implements InterfaceC1444370ngp {
    @Override // X.InterfaceC1444370ngp
    public final void LIZIZ(Fragment fragment) {
        PublishDefaultPermissionFragment publishDefaultPermissionFragment;
        if ((fragment instanceof PublishDefaultPermissionFragment) && (publishDefaultPermissionFragment = (PublishDefaultPermissionFragment) fragment) != null) {
            publishDefaultPermissionFragment.qS();
        }
    }

    public static final EditPageDefaultPrivacySettingFragment LIZJ(PermissionConfigure permissionConfigure, Function1 function1) {
        EditPageDefaultPrivacySettingFragment editPageDefaultPrivacySettingFragment = new EditPageDefaultPrivacySettingFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "extra_permission_configure", permissionConfigure);
        editPageDefaultPrivacySettingFragment.setArguments(bundle);
        editPageDefaultPrivacySettingFragment.LLJILJIL = function1;
        return editPageDefaultPrivacySettingFragment;
    }

    public static final void LIZLLL(C539960LFq c539960LFq, BaseScreenAdaptScene baseScreenAdaptScene, VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C1618480sDe publisher;
        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register component ");
        sbLIZ.append(C193L.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(C193M.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, C193M.class, C193L.class, new AwS611S0100000_32(new C0ET4(), c539960LFq, 140));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("register component ");
        sbLIZ2.append(C214789193z.class.getName());
        sbLIZ2.append(" api ");
        sbLIZ2.append(InterfaceC214731191t.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC214731191t.class, C214789193z.class, new AwS601S0100000_22(new C0ET4(), c539960LFq, 191));
        C214734191w.LIZ(c539960LFq, baseScreenAdaptScene, false);
        if (!u4.LJIIJ(videoPublishEditModel) && !u4.LJJZZIII(videoPublishEditModel) && !C1428520nHG.LJIILLIIL(videoPublishEditModel) && !videoPublishEditModel.creativeModel.onThisDayData.isFromOnThisDay()) {
            z = false;
        } else {
            z = true;
        }
        boolean zLJIIJ = C10IZ.LJIIJ(videoPublishEditModel);
        if (!C1428470nHB.LJJZZI(videoPublishEditModel) && C306550Bzx.LIZ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2 && videoPublishEditModel.getVideoLength() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        IDeclarationService.LIZ.getClass();
        IDeclarationService iDeclarationServiceLIZ = C708510Rqj.LIZ();
        if (iDeclarationServiceLIZ != null && (publisher = iDeclarationServiceLIZ.getPublisher()) != null && publisher.LIZ(C2097608Jq.LJIIIIZZ(new Pair(DeclarationOption.AIGC, Boolean.valueOf(zLJIIJ)), new Pair(DeclarationOption.AUDIENCE_CONTROL, Boolean.valueOf(z2))))) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (zLJIIJ) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("register component ");
            sbLIZ3.append(C19224510Ix.class.getName());
            sbLIZ3.append(" api ");
            sbLIZ3.append(InterfaceC855260Xgq.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC855260Xgq.class, C19224510Ix.class, new AwS118S0110000_32(new C0ET4(), c539960LFq, z4, 6));
        }
        if (z3) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("register component ");
            sbLIZ4.append(C19224310Iv.class.getName());
            sbLIZ4.append(" api ");
            sbLIZ4.append(C05YF.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, C05YF.class, C19224310Iv.class, new AwS118S0110000_32(new C0ET4(), c539960LFq, z4, 7));
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("register component ");
        sbLIZ5.append(C905260ZfI.class.getName());
        sbLIZ5.append(" api ");
        sbLIZ5.append(InterfaceC905280ZfK.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ5));
        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC905280ZfK.class, C905260ZfI.class, new AwS380S0200000_14(new C0ET4(), c539960LFq, baseScreenAdaptScene, 68));
        if (!ComplianceServiceProvider.LJIJJ().LJJIIZ()) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("register component ");
            sbLIZ6.append(C192X.class.getName());
            sbLIZ6.append(" api ");
            sbLIZ6.append(C05YF.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ6));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, C05YF.class, C192X.class, new AwS611S0100000_32(new C0ET4(), c539960LFq, 143));
        }
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("register component ");
        sbLIZ7.append(C19219910Hd.class.getName());
        sbLIZ7.append(" api ");
        sbLIZ7.append(C05YF.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ7));
        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, C05YF.class, C19219910Hd.class, new AwS611S0100000_32(new C0ET4(), c539960LFq, 144));
    }

    public static final boolean LJ(C1DRG c1drg, DialogInterface.OnDismissListener onDismissListener, Function1<? super Integer, Unit> function1) {
        InterfaceC214731191t interfaceC214731191t = (InterfaceC214731191t) ((C0ETY) c1drg.LJII(C0ETY.class, null)).MY1(InterfaceC214731191t.class);
        if (interfaceC214731191t != null) {
            interfaceC214731191t.Tl1(onDismissListener, function1);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1444370ngp
    public final C1444440ngw LIZ(C19EG c19eg, VideoPublishEditModel videoPublishEditModel, PermissionConfigure permissionConfigure, DialogInterface.OnDismissListener onDismissListener, Function0 function0, Function1 function1, boolean z, C1DRG c1drg) {
        return new C1444440ngw(c19eg, videoPublishEditModel, permissionConfigure, onDismissListener, new ARunnableS106S0100000_6(function0, 153), function1, z, c1drg);
    }
}
