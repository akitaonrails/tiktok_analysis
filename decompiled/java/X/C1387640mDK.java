package X;

import Y.AObjectS128S0000000_31;
import Y.ARunnableS90S0200000_21;
import com.ss.android.ugc.trill.setting.PushSettingActivity;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0mDK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387640mDK extends C1387670mDN<PushSettingActivity> {
    public int LIZJ;
    public final C20675615vO LIZLLL = new InterfaceC1387630mDJ<String>() { // from class: X.15vO
        @Override // X.InterfaceC1387630mDJ
        public final void LIZ(Exception exc) {
            C844470XAv.LIZ.getClass();
            C1354920lMY.LIZJ(C844470XAv.LIZ(), exc);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.InterfaceC1387630mDJ
        public final void onComplete(Object obj) {
            C1387640mDK c1387640mDK = this.LL;
            View view = c1387640mDK.LIZ;
            if (view != 0) {
                int i = c1387640mDK.LIZJ;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            PushSettingActivity pushSettingActivity = (PushSettingActivity) view;
                            pushSettingActivity.LLILZLL.LJI(new AObjectS128S0000000_31(3));
                            ((AbstractC848400XPy) C0XQ7.LJFF()).LJJLIIIJL(1 ^ (((C19319810iC) pushSettingActivity.LLILZLL.LL).LLJJIJIL ? 1 : 0));
                            pushSettingActivity.LLLLZI("comment_page", ((C19319810iC) pushSettingActivity.LLILZLL.LL).LLJJIJIL);
                            return;
                        }
                        return;
                    }
                    PushSettingActivity pushSettingActivity2 = (PushSettingActivity) view;
                    pushSettingActivity2.LLILZIL.LJI(new AObjectS128S0000000_31(3));
                    ((AbstractC848400XPy) C0XQ7.LJFF()).LJJLIIIJLJLI(1 ^ (((C19319810iC) pushSettingActivity2.LLILZIL.LL).LLJJIJIL ? 1 : 0));
                    pushSettingActivity2.LLLLZI("like", ((C19319810iC) pushSettingActivity2.LLILZIL.LL).LLJJIJIL);
                    return;
                }
                PushSettingActivity pushSettingActivity3 = (PushSettingActivity) view;
                pushSettingActivity3.LLILZ.LJI(new AObjectS128S0000000_31(3));
                ((AbstractC848400XPy) C0XQ7.LJFF()).LJJLIIIJLLLLLLLZ(1 ^ (((C19319810iC) pushSettingActivity3.LLILZ.LL).LLJJIJIL ? 1 : 0));
                pushSettingActivity3.LLLLZI("follow", ((C19319810iC) pushSettingActivity3.LLILZ.LL).LLJJIJIL);
            }
        }
    };

    public final void LIZ(int i, boolean z) {
        this.LIZJ = i;
        if (this.LIZ != 0) {
            String str = C303390Bur.LIZ;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C2259691DcV("shield_type", String.valueOf(i)));
            arrayList.add(new C2259691DcV("is_shield", String.valueOf(z ? 1 : 0)));
            C1387650mDL c1387650mDL = new C1387650mDL(C303390Bur.LIZ, EnumC1387660mDM.POST, arrayList, String.class);
            c1387650mDL.LIZ = this.LIZLLL;
            C844470XAv.LIZ.getClass();
            C810560Vqw.LJ(new ARunnableS90S0200000_21(c1387650mDL, C844470XAv.LIZ(), 26));
        }
    }
}
