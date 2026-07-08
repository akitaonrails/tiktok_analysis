package X;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.exp.EntranceHeaderConfig;
import com.ss.android.ugc.aweme.exp.ImGroupChatCreationConfigModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.publicgroup.data.GroupCompositeType;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupEntrance;
import com.ss.android.ugc.tiktok.im.contact.selector.api.AbsContactSelectorFragment;
import com.ss.android.ugc.ur.school.service.UserCampusService;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS563S0100000_19;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0i3j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227930i3j extends C1226700i1k {
    public final boolean LLJI;
    public boolean LLJIJIL;
    public final C01GW LLJILJIL;
    public final GroupCompositeType LLJILJILJ;

    public final String LJJJJL() {
        return (String) this.LLJILJIL.getValue();
    }

    @Override // X.C1226700i1k, X.InterfaceC1224260hxo
    public final void onShow() {
        if (this.LLJIJIL) {
            return;
        }
        C1228760i54.LIZ("show_creator_chat_room_entrance", new Pair[]{new Pair("enter_from", LJJJJL()), new Pair("enter_method", "new_group")}, C0I0B.LJFF.LIZIZ());
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1529005yi(LJJJJL(), "new_group", "campus_group", null), 3);
        this.LLJIJIL = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1226700i1k, X.InterfaceC1224260hxo
    public final void LIZIZ() {
        super.LIZIZ();
        C1229380i64 c1229380i64LJJIJLIJ = C913630Zsn.LJJIJLIJ(C913630Zsn.LJIIJJI, "im", "select_user_panel");
        Context contextLIZIZ = LJJJJJL().LIZIZ();
        int i = 0;
        C1228470i4b c1228470i4b = new C1228470i4b(new C1228650i4t(LJJJJL(), "new_group", EnumC1228990i5R.PUBLIC_GROUP.getValue(), EnumC913760Zt0.CAMPUS_GROUP.getValue(), 0, new C1228700i4y(i, i, LJJJJL(), null, 0 == true ? 1 : 0, 27), false, null, null, true, null, false, null, null, null, null, 0, 0, false, null, null, null, -1072, 1), new C1228810i59(LJJJJL(), "new_group", C461720I8s.LIZIZ(), false, false, null, 0L, null, null, null, 0, null, null, null, null, null, false, null, null, 4194296));
        InterfaceC1228540i4i.LIZ.getClass();
        c1229380i64LJJIJLIJ.LIZLLL(contextLIZIZ, c1228470i4b, C1228590i4n.LIZ().LIZ(contextLIZIZ, c1228470i4b.LIZ));
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1528905yh(LJJJJL(), "new_group", "campus_group", null), 3);
    }

    @Override // X.C1226700i1k, X.InterfaceC1224300hxs
    public final void LJFF() {
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.C1226700i1k, X.InterfaceC1224300hxs
    public final void LJJI() {
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.C1226700i1k, X.InterfaceC1224250hxn
    public final void LJJJ(C1224790hyf c1224790hyf) {
        InterfaceC1226510i1R interfaceC1226510i1R;
        AbsContactSelectorFragment fragment;
        LifecycleCoroutineScope lifecycleScope;
        super.LJJJ(c1224790hyf);
        if (c1224790hyf.LIZ != null && (interfaceC1226510i1R = this.LL.LIZ) != null && (fragment = interfaceC1226510i1R.getFragment()) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragment)) != null) {
            C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C1226800i1u(this, null), 2);
        }
    }

    @Override // X.C1226700i1k
    public final C1224220hxk LJJJJIZL(Context context) {
        String str;
        String str2;
        LayerDrawable layerDrawableLJIILIIL;
        String str3;
        C338000DMw c338000DMwLJFF;
        C0DHZ c0dhz;
        GroupCompositeType groupCompositeType = this.LLJILJILJ;
        C1229040i5W c1229040i5W = C1229040i5W.LL;
        GroupEntrance groupEntrance = (GroupEntrance) ((LinkedHashMap) C1229040i5W.LJII(Collections.singletonList(groupCompositeType))).get(groupCompositeType);
        if (groupEntrance != null) {
            str = groupEntrance.entranceDesc;
        } else {
            str = null;
        }
        ImGroupChatCreationConfigModel imGroupChatCreationConfigModel = C1227970i3n.LIZ;
        EntranceHeaderConfig entranceHeaderConfigLIZIZ = C1227970i3n.LIZIZ(EnumC913760Zt0.CAMPUS_GROUP.getValue());
        UserCampusService userCampusService = (UserCampusService) PluggableExtentionKt.pluggableSpiForReal(UserCampusService.class);
        if (userCampusService != null && (c338000DMwLJFF = userCampusService.LJFF(C461720I8s.LIZIZ())) != null && (c0dhz = c338000DMwLJFF.LIZ) != null) {
            str2 = c0dhz.LIZ;
        } else {
            str2 = null;
        }
        String str4 = "";
        if (C123100dR.LIZ(str2)) {
            str = str2;
        } else if (!C123100dR.LIZ(str) && (entranceHeaderConfigLIZIZ == null || (str = entranceHeaderConfigLIZIZ.subtitle) == null)) {
            str = "";
        }
        if (!this.LLJI) {
            layerDrawableLJIILIIL = null;
        } else {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_person_phd_fill;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
            layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
        }
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_chevron_right_offset_ltr;
        c419910GdJ2.LJ = Integer.valueOf(R.attr.a1k);
        TuxIconDrawable tuxIconDrawableLIZ2 = c419910GdJ2.LIZ(context);
        if (entranceHeaderConfigLIZIZ != null && (str3 = entranceHeaderConfigLIZIZ.title) != null) {
            str4 = str3;
        }
        if (!this.LLJI) {
            str = null;
        }
        return new C1224220hxk("id_header_create_campus_group", layerDrawableLJIILIIL, str4, str, tuxIconDrawableLIZ2, this.LLILLL.LIZIZ(), this.LLILLL.LIZ());
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCloseSelectorEvent(C1228570i4l c1228570i4l) {
        InterfaceC1226510i1R interfaceC1226510i1R = this.LL.LIZ;
        if (interfaceC1226510i1R != null) {
            interfaceC1226510i1R.LJIILL(C343970De7.LIZ, null);
        }
    }

    public C1227930i3j(AbstractC1225770i0F abstractC1225770i0F, C1227900i3g c1227900i3g) {
        super(abstractC1225770i0F, c1227900i3g);
        this.LLJI = c1227900i3g.LJFF;
        this.LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3053));
        this.LLJILJILJ = new GroupCompositeType(EnumC1228990i5R.PUBLIC_GROUP.getValue(), EnumC913760Zt0.CAMPUS_GROUP.getValue(), EnumC1219960hqs.UNKNOWN.getValue());
    }
}
