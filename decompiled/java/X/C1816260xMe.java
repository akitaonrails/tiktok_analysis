package X;

import android.content.DialogInterface;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.model.RecommendBoardInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xMe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816260xMe extends C09AY implements Function0<AbstractC233200vC> {
    public C1816260xMe() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.00vC, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final AbstractC233200vC invoke() {
        List listLJIIJJI = C1697810uHb.LJIIJJI(new C1816400xMs(), new C1816340xMm(), new AbstractC233200vC() { // from class: X.0xMa
            @Override // X.AbstractC233200vC
            public final Object LIZ(final C1816270xMf c1816270xMf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                boolean z;
                Object objLIZ;
                RecommendBoardInfo recommendBoardInfo = c1816270xMf.LIZIZ.recommendBoardInfo;
                if (recommendBoardInfo != null && recommendBoardInfo.businessIntent == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (C752520TfW.LIZ().LIZ == 0 && z && Intrinsics.LJFF(C0KPJ.lf.LIZIZ(), true)) {
                    C782110Um9 c782110Um9 = new C782110Um9(c1816270xMf.LIZ, C011Z.LIZ.LJIIIZ());
                    c782110Um9.LJFF(R.drawable.eaz);
                    c782110Um9.LIZJ = C497740JfY.LJIJI(2131851378);
                    c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131851377));
                    C494720Jag c494720Jag = new C494720Jag();
                    C755620TkW c755620TkW = new C755620TkW();
                    c755620TkW.LIZ = C497740JfY.LJIJI(2131851376);
                    c755620TkW.LIZJ = new InterfaceC743640TFa() { // from class: X.0xMb
                        @Override // X.InterfaceC743640TFa
                        public final void LIZ(LiveDialog liveDialog) {
                            C0KPJ.lf.LJFF(Boolean.FALSE);
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoration_popup");
                            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
                            c474500IjALIZ.LJJII(c1816270xMf.LJ.LIZ, "decoration_entrance");
                            c474500IjALIZ.LJJII("click", "action_type");
                            c474500IjALIZ.LJJII("ccToggle", "popup_scene");
                            c474500IjALIZ.LJJII("disclose", "click_position");
                            c474500IjALIZ.LIZ();
                            C1DFH c1dfh = C0PEM.LIZ;
                            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C01KG(this, c1816270xMf, null), 3);
                            liveDialog.dismiss();
                        }
                    };
                    c494720Jag.LIZ(new C0TZ2(c755620TkW));
                    C755630TkX c755630TkX = new C755630TkX();
                    c755630TkX.LIZ = C497740JfY.LJIJI(2131851375);
                    c755630TkX.LIZJ = new InterfaceC743640TFa() { // from class: X.0xMc
                        @Override // X.InterfaceC743640TFa
                        public final void LIZ(LiveDialog liveDialog) {
                            c1816270xMf.LIZJ.qD1(false);
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoration_popup");
                            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
                            c474500IjALIZ.LJJII(c1816270xMf.LJ.LIZ, "decoration_entrance");
                            c474500IjALIZ.LJJII("click", "action_type");
                            c474500IjALIZ.LJJII("ccToggle", "popup_scene");
                            c474500IjALIZ.LJJII("cancel", "click_position");
                            c474500IjALIZ.LIZ();
                            liveDialog.dismiss();
                        }
                    };
                    c494720Jag.LIZ(new C0TZ3(c755630TkX));
                    c494720Jag.LIZIZ = 2;
                    c782110Um9.LIZJ(new C494730Jah(c494720Jag));
                    c782110Um9.LJIIZILJ = new DialogInterface.OnShowListener() { // from class: X.0xMd
                        @Override // android.content.DialogInterface.OnShowListener
                        public final void onShow(DialogInterface dialogInterface) {
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoration_popup");
                            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
                            c474500IjALIZ.LJJII(c1816270xMf.LJ.LIZ, "decoration_entrance");
                            c474500IjALIZ.LJJII("show", "action_type");
                            c474500IjALIZ.LJJII("ccToggle", "popup_scene");
                            c474500IjALIZ.LIZ();
                        }
                    };
                    c782110Um9.LJIILL = false;
                    c782110Um9.LJIJ = new DialogInterface.OnDismissListener() { // from class: X.0xMh
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                        }
                    };
                    C786410Ut5.E4(c782110Um9.LIZ());
                } else {
                    AbstractC233200vC abstractC233200vC = this.LIZ;
                    if (abstractC233200vC != null && (objLIZ = abstractC233200vC.LIZ(c1816270xMf, interfaceC1364105Vn)) == C099R.LJFF()) {
                        return objLIZ;
                    }
                }
                return Unit.LIZ;
            }
        }, new C232900v9(), new AbstractC233200vC() { // from class: X.0xMg
            @Override // X.AbstractC233200vC
            public final Object LIZ(C1816270xMf c1816270xMf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                c1816270xMf.LIZJ.Zm2();
                return Unit.LIZ;
            }
        });
        if (listLJIIJJI.isEmpty()) {
            throw new IllegalStateException();
        }
        int size = listLJIIJJI.size();
        int i = 0;
        while (i < size) {
            AbstractC233200vC abstractC233200vC = (AbstractC233200vC) C13LP.LJJJLZIJ(i, listLJIIJJI);
            i++;
            AbstractC233200vC abstractC233200vC2 = (AbstractC233200vC) C13LP.LJJJLZIJ(i, listLJIIJJI);
            if (abstractC233200vC != null) {
                abstractC233200vC.LIZ = abstractC233200vC2;
            }
        }
        return ListProtector.get(listLJIIJJI, 0);
    }
}
