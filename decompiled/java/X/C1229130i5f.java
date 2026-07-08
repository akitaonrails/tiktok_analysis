package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics;
import com.ss.android.ugc.aweme.internalshare.api.service.IExternalCreateGroupService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0i5f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1229130i5f implements InterfaceC1370310llN {
    public static final /* synthetic */ int LL = 0;

    @Override // X.InterfaceC1370310llN
    public final float LIZLLL() {
        return -1.0f;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJI() {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        return R.raw.icon_two_person_large_fill;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return R.raw.icon_two_person;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJIIIZ() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJIILJJIL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIJJLI() {
        return 0;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJIJ(ImageView imageView, View view, int i) {
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJIJIIJIL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJIL() {
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final String LJJIZ() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJJI(BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJJJIZL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJJJL() {
        return false;
    }

    @Override // X.InterfaceC1370450llb
    public final int LJJJJLI() {
        return 100;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJJLZIJ() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJLIIIJJIZ() {
        return 2131835353;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJLIIIJL() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final String key() {
        return "im_create_group";
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIJJI() {
        return !enable() ? 1 : 0;
    }

    @Override // X.InterfaceC1370310llN
    public final C0M7Z LJIIJ() {
        return C0M7Z.ShareButton;
    }

    @Override // X.InterfaceC1370310llN
    public final EnumC1216710hld LJJJZ() {
        return EnumC1216710hld.NORMAL;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIJJ(TextView textView) {
        C1370320llO.LJ(this, textView);
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
        return C1370320llO.LIZJ(enumC1369720lkQ);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, final BaseSharePackage baseSharePackage) {
        List listSingletonList;
        String string = baseSharePackage.extras.getString("aid");
        final C259800zU c259800zU = new C259800zU();
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("share_aweme_id", String.valueOf(string)));
        C1226240i10 c1226240i10 = new C1226240i10() { // from class: X.0i5h
            @Override // X.C1226240i10, X.InterfaceC1225830i0L
            public final void LJI() {
                IMConversation iMConversationLJII;
                C0Y8T c0y8t = c259800zU.element;
                if (c0y8t != null) {
                    C1229130i5f c1229130i5f = this;
                    BaseSharePackage baseSharePackage2 = baseSharePackage;
                    c1229130i5f.getClass();
                    if (baseSharePackage2 instanceof SharePackage) {
                        baseSharePackage2.extras.putBoolean("is_new_group", true);
                        C786410Ut5.LJJJI("enter_method", "create_group_button", baseSharePackage2.extras);
                        C1364580lc8 c1364580lc8 = C1364580lc8.LIZ;
                        SharePackage sharePackage = (SharePackage) baseSharePackage2;
                        IMContact[] iMContactArr = new IMContact[1];
                        IIMContactUtilService.LIZ.getClass();
                        IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
                        if (iIMContactUtilServiceLIZ == null || (iMConversationLJII = iIMContactUtilServiceLIZ.LJII(c0y8t)) == null) {
                            return;
                        }
                        iMContactArr[0] = iMConversationLJII;
                        List listLJIILJJIL = C1697810uHb.LJIILJJIL(iMContactArr);
                        Map mapLJ = C2097608Jq.LJ();
                        c1364580lc8.getClass();
                        C1364580lc8.LIZ(sharePackage, listLJIILJJIL, null, null, true, null, null, mapLJ);
                    }
                }
            }
        };
        if (((IExternalCreateGroupService) C1229250i5r.LIZ.getValue()).LJ(baseSharePackage)) {
            C1227920i3i c1227920i3i = new C1227920i3i(baseSharePackage, 30);
            listSingletonList = Collections.singletonList(new C1227920i3i(c1227920i3i.LJFF, c1227920i3i.LJI, c1227920i3i.LJII, EnumC1226770i1r.AVAILABILITY, C0N0C.SELECTED_LIST_NOT_EMPTY));
        } else {
            listSingletonList = C13BV.INSTANCE;
        }
        C1227130i2R.LIZLLL(context, new C1226980i2C(context, mapLIZJ, c1226240i10, "share", "create_group_button", false, null, null, null, false, null, new AwS598S0100000_19(c259800zU, (C259800zU<C1749280vcc>) 565), new AwS598S0100000_19(context, 566), false, null, null, listSingletonList, null, null, false, false, false, EnumC1230500i7s.CREATE_GROUP_FYP_FIX_CREATE_PANEL, 1071545312), "ci", "share_panel", "native");
        ((IIMChatDetailAnalytics) ServiceManager.get().getService(IIMChatDetailAnalytics.class)).LIZ("share");
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
        C0I0B.LJFF.LIZIZ().sendEvent("show_create_group", C2097908Jt.LIZJ(new Pair("enter_from", "share")));
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZ(this, view, baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZIZ(this, view, baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZLLL(context, baseSharePackage, this);
    }
}
