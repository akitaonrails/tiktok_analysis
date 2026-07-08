package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.setting.serverpush.compose.login.PushSettingsLoginVM;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushCategory;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettingDynamicUI;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0iUK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1244420iUK extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1244380iUG LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ LayoutInflater LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ PushSettingsLoginVM LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1244420iUK(C1244380iUG c1244380iUG, Context context, LayoutInflater layoutInflater, boolean z, PushSettingsLoginVM pushSettingsLoginVM) {
        super(0);
        this.LL = c1244380iUG;
        this.LLILLJJLI = context;
        this.LLILLL = layoutInflater;
        this.LLILZ = z;
        this.LLILZIL = pushSettingsLoginVM;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [X.0iVb] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final TuxSheet tuxSheet;
        String str;
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        Activity activityLIZIZ;
        List<PushCategory> list;
        PushCategory pushCategory;
        List<PushItem> list2;
        Activity activityLIZIZ2;
        Activity activityLIZ;
        Resources.Theme theme;
        PushItem pushItem = this.LL.LLJJI;
        if (!pushItem.LIZ() || C824420WVs.LIZIZ(this.LLILLJJLI, "click_bottom_subpage_push_cell")) {
            C1244440iUM c1244440iUM = new Object() { // from class: X.0iUM
            };
            LayoutInflater layoutInflater = this.LLILLL;
            boolean z = this.LLILZ;
            final AwS598S0100000_19 awS598S0100000_19 = new AwS598S0100000_19(this.LLILZIL, 919);
            c1244440iUM.getClass();
            Activity activityLIZ2 = null;
            View viewSd = C786410Ut5.Sd(R.layout.f6u, layoutInflater, null);
            if (!(viewSd instanceof ConstraintLayout)) {
                viewSd = null;
            }
            int iLIZJ = (int) C12ES.LIZJ(6.0f, C0CHQ.LIZ);
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = viewSd != null ? (ViewOnAttachStateChangeListenerC20604515jv) viewSd.findViewById(R.id.siw) : null;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                viewOnAttachStateChangeListenerC20604515jv.setPadding(0, iLIZJ, 0, iLIZJ);
            }
            TuxNavBar tuxNavBar = viewSd != null ? (TuxNavBar) viewSd.findViewById(R.id.y1z) : null;
            C19318810i2 c19318810i2 = viewOnAttachStateChangeListenerC20604515jv != null ? new C19318810i2(viewOnAttachStateChangeListenerC20604515jv) : null;
            if (tuxNavBar != null) {
                C1250250idj c1250250idj = new C1250250idj();
                c1250250idj.LIZJ = pushItem.display.title;
                tuxNavBar.LJIJJ(c1250250idj);
            }
            TypedValue typedValue = new TypedValue();
            int i = z ? R.attr.zp : R.attr.bk;
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ2 = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ2)) != null && (theme = activityLIZ.getTheme()) != null) {
                theme.resolveAttribute(i, typedValue, true);
            }
            if (tuxNavBar != null) {
                tuxNavBar.setNavBackground(typedValue.data);
                tuxNavBar.LJIIZILJ(false);
            }
            if (c19318810i2 != null) {
                c19318810i2.LJ();
            }
            PushSettingDynamicUI pushSettingDynamicUI = pushItem.subPage;
            if (pushSettingDynamicUI != null && (list = pushSettingDynamicUI.categoryList) != null && (pushCategory = (PushCategory) ListProtector.get(list, 0)) != null && (list2 = pushCategory.itemList) != null) {
                for (PushItem pushItem2 : list2) {
                    if (c19318810i2 != null) {
                        c19318810i2.LIZ(new C20695315yZ(pushItem2, new InterfaceC1245230iVd() { // from class: X.0iVb
                            @Override // X.InterfaceC1245230iVd
                            public final void LIZ(int i2, String str2) {
                                C19328310jZ.LIZIZ.f6(i2, str2);
                                awS598S0100000_19.invoke(new C1245220iVc(str2, i2));
                                C1245240iVe.LIZ.getClass();
                                C1245240iVe.LIZ(i2, str2);
                            }
                        }));
                    }
                }
            }
            if (viewSd != null) {
                tuxSheet = new C1390920mIc(false, 0).LIZ;
                tuxSheet.LLJJIII = viewSd;
            } else {
                tuxSheet = null;
            }
            if (tuxNavBar != null) {
                C0OM1 c0om1 = new C0OM1();
                C1250250idj c1250250idj2 = new C1250250idj();
                c1250250idj2.LIZJ = pushItem.display.title;
                c0om1.LIZJ = c1250250idj2;
                C1251150ifB c1251150ifB = new C1251150ifB();
                c1251150ifB.LIZLLL();
                c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
                c1251150ifB.LIZ = new InterfaceC197023126r() { // from class: X.0iUL
                    @Override // X.InterfaceC197023126r
                    public final void LIZ() {
                        TuxSheet tuxSheet2 = tuxSheet;
                        if (tuxSheet2 != null) {
                            tuxSheet2.dismiss();
                        }
                    }
                };
                c0om1.LIZIZ(c1251150ifB);
                tuxNavBar.setNavActions(c0om1);
            }
            if (tuxSheet != null) {
                AbstractC1387200mCc abstractC1387200mCcLIZIZ2 = C1906580ziK.LIZIZ();
                if (abstractC1387200mCcLIZIZ2 != null && (activityLIZIZ = abstractC1387200mCcLIZIZ2.LIZIZ()) != null) {
                    activityLIZ2 = C1388190mED.LIZ(activityLIZIZ);
                }
                if ((activityLIZ2 instanceof C19EG) && (c19eg = (C19EG) activityLIZ2) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null) {
                    tuxSheet.show(supportFragmentManager, "Video Sheet");
                }
            }
            PushSettingDynamicUI pushSettingDynamicUI2 = pushItem.subPage;
            if (pushSettingDynamicUI2 != null && (str = pushSettingDynamicUI2.pageLabel) != null) {
                C1245240iVe.LIZ.getClass();
                C1245240iVe.LIZIZ(str, "");
            }
        }
        return Unit.LIZ;
    }
}
