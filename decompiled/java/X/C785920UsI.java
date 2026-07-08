package X;

import Y.AcS353S0200000_12;
import Y.AcS495S0100000_12;
import android.view.View;
import android.widget.CompoundButton;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushOffReason;
import com.ss.android.ugc.aweme.setting.serverpush.ui.PushOffReasonBottomSheetFragment;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0UsI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C785920UsI implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                break;
            case 3:
                onCheckedChanged$3(this, compoundButton, z);
                break;
            case 4:
                onCheckedChanged$4(this, compoundButton, z);
                break;
        }
    }

    public C785920UsI(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onCheckedChanged$0(C785920UsI c785920UsI, CompoundButton compoundButton, boolean z) {
        ((C759230TqL) c785920UsI.l0).LIZIZ = z;
        C759310TqT c759310TqT = (C759310TqT) c785920UsI.l1;
        InterfaceC759240TqM interfaceC759240TqM = c759310TqT.LLILLJJLI;
        if (interfaceC759240TqM != null) {
            List<C759230TqL> list = c759310TqT.LLILZLL;
            int i = 0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<C759230TqL> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (it2.next().LIZIZ && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            interfaceC759240TqM.LIZ(i);
        }
    }

    public static final void onCheckedChanged$1(C785920UsI c785920UsI, CompoundButton compoundButton, boolean z) {
        String str;
        C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.v6;
        if (c20337914i1.LIZIZ().booleanValue()) {
            C20337914i1<Boolean> c20337914i12 = InterfaceC1106030et7.w6;
            if (!c20337914i12.LIZIZ().booleanValue()) {
                c20337914i12.LJFF(Boolean.TRUE);
                BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = (BasePreviewSettingMainFragmentSheetInitializer) c785920UsI.l0;
                C20743716Ff c20743716Ff = (C20743716Ff) c785920UsI.l1;
                basePreviewSettingMainFragmentSheetInitializer.getClass();
                C782110Um9 c782110Um9 = new C782110Um9(basePreviewSettingMainFragmentSheetInitializer.LL.getContext());
                c782110Um9.LJIIZILJ(2131842693);
                c782110Um9.LJII(2131842692);
                c782110Um9.LJIILIIL(2131842690, new AcS495S0100000_12(basePreviewSettingMainFragmentSheetInitializer, 41));
                c782110Um9.LJIIJ(2131842691, new AcS353S0200000_12(basePreviewSettingMainFragmentSheetInitializer, c20743716Ff, 6));
                C786410Ut5.E4(c782110Um9.LIZ());
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_caption_off_popup");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJIIZI(basePreviewSettingMainFragmentSheetInitializer.LIZIZ());
                c474500IjALIZ.LJ("show");
                c474500IjALIZ.LIZ();
                return;
            }
        }
        if (!((BasePreviewSettingMainFragmentSheetInitializer) c785920UsI.l0).LLJ) {
            c20337914i1.LJFF(Boolean.valueOf(!c20337914i1.LIZIZ().booleanValue()));
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_anchor_caption_icon_change");
            c474500IjALIZ2.LJIL();
            Map<String, String> mapLIZIZ = ((BasePreviewSettingMainFragmentSheetInitializer) c785920UsI.l0).LIZIZ();
            if (c20337914i1.LIZIZ().booleanValue()) {
                str = "on";
            } else {
                str = "off";
            }
            ((HashMap) mapLIZIZ).put("to_status", str);
            c474500IjALIZ2.LJJIIZI(mapLIZIZ);
            c474500IjALIZ2.LJ("show");
            c474500IjALIZ2.LIZ();
        }
        ((BasePreviewSettingMainFragmentSheetInitializer) c785920UsI.l0).LLJ = false;
    }

    public static final void onCheckedChanged$2(C785920UsI c785920UsI, CompoundButton compoundButton, boolean z) {
        PushOffReasonBottomSheetFragment pushOffReasonBottomSheetFragment = ((C0TV8) c785920UsI.l0).LLILLL;
        if (pushOffReasonBottomSheetFragment != null) {
            pushOffReasonBottomSheetFragment.NR(((PushOffReason) c785920UsI.l1).category, z);
        }
    }

    public static final void onCheckedChanged$3(C785920UsI c785920UsI, CompoundButton compoundButton, boolean z) {
        if (z) {
            ((C0TRX) c785920UsI.l0).LL.invoke(((C0TRZ) c785920UsI.l1).LIZIZ);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void onCheckedChanged$4(C785920UsI c785920UsI, CompoundButton compoundButton, boolean z) {
        C750740Tce c750740Tce;
        boolean zLIZIZ;
        C750380Tc4 c750380Tc4 = (C750380Tc4) c785920UsI.l0;
        if (c750380Tc4.LLJI || c750380Tc4.LLJIJIL || (c750740Tce = c750380Tc4.LLJ) == null) {
            return;
        }
        ((View) c785920UsI.l1).getContext();
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if (!zLIZIZ) {
            C750380Tc4 c750380Tc42 = (C750380Tc4) c785920UsI.l0;
            c750380Tc42.LLJI = true;
            c750380Tc42.LLIZLLLIL.setChecked(!z);
            ((C750380Tc4) c785920UsI.l0).LLJI = false;
            C766270U4b.LJFF(2131843092, ((View) c785920UsI.l1).getContext());
            return;
        }
        C750380Tc4 c750380Tc43 = (C750380Tc4) c785920UsI.l0;
        c750380Tc43.LLJILJIL = z ? 1 : 0;
        c750380Tc43.LLJILJILJ = c750740Tce.LIZ;
        c750380Tc43.LLJIJIL = true;
        c750380Tc43.LLIZLLLIL.setEnabled(false);
        IUserManageService iUserManageService = (IUserManageService) C1161920gLG.LIZJ(IUserManageService.class);
        C750380Tc4 c750380Tc44 = (C750380Tc4) c785920UsI.l0;
        int i = c750380Tc44.LLJILJIL;
        long j = c750740Tce.LIZ;
        long jLongValue = ((Number) c750380Tc44.LLJILLL.getValue()).longValue();
        C750380Tc4 c750380Tc45 = (C750380Tc4) c785920UsI.l0;
        iUserManageService.ac0(c750380Tc44, 8, i, j, jLongValue, c750380Tc45.LLILLJJLI, (String) c750380Tc45.LLJJ.getValue(), c750740Tce.LIZIZ);
    }
}
