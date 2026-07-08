package X;

import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.poi.quiz.assem.PoiQuizHomePageMapAssem;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AFwS285S0000000_2;
import kotlin.jvm.internal.AwS14S1210000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: renamed from: X.0glf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1178290glf extends C09AY implements InterfaceC1685430txd<UIAssem, EnumC1182750gsr, EnumC1182690gsl, Boolean, String, C1175020ggO, Unit> {
    public final /* synthetic */ PoiQuizHomePageMapAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1178290glf(PoiQuizHomePageMapAssem poiQuizHomePageMapAssem) {
        super(6);
        this.LL = poiQuizHomePageMapAssem;
    }

    @Override // X.InterfaceC1685430txd
    public final Unit invoke(UIAssem uIAssem, EnumC1182750gsr enumC1182750gsr, EnumC1182690gsl enumC1182690gsl, Boolean bool, String str, C1175020ggO c1175020ggO) {
        C1BSO c1bsoLJJIIZI;
        C1BSO c1bsoLJJIIZI2;
        C1BSO c1bsoLJJIIZI3;
        C1BSO c1bsoLJJIIZI4;
        EnumC1182750gsr enumC1182750gsr2 = enumC1182750gsr;
        EnumC1182690gsl enumC1182690gsl2 = enumC1182690gsl;
        boolean zBooleanValue = bool.booleanValue();
        String str2 = str;
        C1175020ggO c1175020ggO2 = c1175020ggO;
        try {
            if (enumC1182750gsr2 == EnumC1182750gsr.LIST_LOADING) {
                TuxIconView tuxIconView = this.LL.LLJJJJJIL;
                if (tuxIconView != null) {
                    tuxIconView.setEnabled(false);
                }
                this.LL.LLJI.LIZIZ("poi_list_update");
                this.LL.LLJI.LIZIZ("poi_list_finish");
                InterfaceC1177250gjz interfaceC1177250gjz = this.LL.LLJIJIL;
                if (interfaceC1177250gjz != null && (c1bsoLJJIIZI4 = interfaceC1177250gjz.LJJIIZI()) != null) {
                    c1bsoLJJIIZI4.LIZ(false);
                }
                this.LL.LLJI.LIZLLL(Collections.singletonList("map_init"), new AwS384S0200000_18(this.LL, enumC1182750gsr2, 207));
            } else if (enumC1182690gsl2 != null) {
                int i = C1178300glg.LIZ[enumC1182690gsl2.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            PoiQuizHomePageMapAssem poiQuizHomePageMapAssem = this.LL;
                            C1179570gnj c1179570gnj = poiQuizHomePageMapAssem.LLJJJIL;
                            if (c1179570gnj != null) {
                                c1179570gnj.LLILZLL = AFwS285S0000000_2.get$arr$(41);
                            }
                            InterfaceC1177250gjz interfaceC1177250gjz2 = poiQuizHomePageMapAssem.LLJIJIL;
                            if (interfaceC1177250gjz2 != null && (c1bsoLJJIIZI3 = interfaceC1177250gjz2.LJJIIZI()) != null) {
                                c1bsoLJJIIZI3.LIZ(false);
                            }
                            this.LL.Zo(c1175020ggO2);
                            PoiQuizHomePageMapAssem poiQuizHomePageMapAssem2 = this.LL;
                            poiQuizHomePageMapAssem2.LLJJI = enumC1182690gsl2;
                            poiQuizHomePageMapAssem2.LLJJIII = enumC1182750gsr2;
                        }
                    } else {
                        PoiQuizHomePageMapAssem poiQuizHomePageMapAssem3 = this.LL;
                        C1179570gnj c1179570gnj2 = poiQuizHomePageMapAssem3.LLJJJIL;
                        if (c1179570gnj2 != null) {
                            c1179570gnj2.LLILZLL = new AwS632S0100000_18(poiQuizHomePageMapAssem3, 235);
                        }
                        PoiQuizHomePageMapAssem poiQuizHomePageMapAssem4 = this.LL;
                        C1179570gnj c1179570gnj3 = poiQuizHomePageMapAssem4.LLJJJIL;
                        if (c1179570gnj3 != null) {
                            c1179570gnj3.LLILZ = false;
                        }
                        InterfaceC1177250gjz interfaceC1177250gjz3 = poiQuizHomePageMapAssem4.LLJIJIL;
                        if (interfaceC1177250gjz3 != null && (c1bsoLJJIIZI2 = interfaceC1177250gjz3.LJJIIZI()) != null) {
                            c1bsoLJJIIZI2.LIZ(true);
                        }
                        PoiQuizHomePageMapAssem poiQuizHomePageMapAssem5 = this.LL;
                        TuxIconView tuxIconView2 = poiQuizHomePageMapAssem5.LLJJJJJIL;
                        if (tuxIconView2 != null) {
                            tuxIconView2.setEnabled(true);
                        }
                        TuxIconView tuxIconView3 = poiQuizHomePageMapAssem5.LLJJJJJIL;
                        if (tuxIconView3 != null) {
                            C339190DRl.LIZLLL(tuxIconView3);
                        }
                        poiQuizHomePageMapAssem5.LLJI.LIZLLL(Collections.singletonList("map_init"), new AwS14S1210000_18(poiQuizHomePageMapAssem5, c1175020ggO2, zBooleanValue, str2, 1));
                    }
                } else {
                    PoiQuizHomePageMapAssem poiQuizHomePageMapAssem6 = this.LL;
                    C1179570gnj c1179570gnj4 = poiQuizHomePageMapAssem6.LLJJJIL;
                    if (c1179570gnj4 != null) {
                        c1179570gnj4.LLILZ = true;
                    }
                    InterfaceC1177250gjz interfaceC1177250gjz4 = poiQuizHomePageMapAssem6.LLJIJIL;
                    if (interfaceC1177250gjz4 != null && (c1bsoLJJIIZI = interfaceC1177250gjz4.LJJIIZI()) != null) {
                        c1bsoLJJIIZI.LIZ(false);
                    }
                    PoiQuizHomePageMapAssem poiQuizHomePageMapAssem7 = this.LL;
                    TuxIconView tuxIconView4 = poiQuizHomePageMapAssem7.LLJJJJJIL;
                    if (tuxIconView4 != null) {
                        tuxIconView4.setEnabled(true);
                    }
                    TuxIconView tuxIconView5 = poiQuizHomePageMapAssem7.LLJJJJJIL;
                    if (tuxIconView5 != null) {
                        C339190DRl.LIZIZ(tuxIconView5);
                    }
                    poiQuizHomePageMapAssem7.LLJI.LIZ(AFwS256S0000000_18.get$arr$(889));
                    poiQuizHomePageMapAssem7.LLJI.LIZLLL(Collections.singletonList("map_init"), new AwS597S0100000_18(poiQuizHomePageMapAssem7, 783));
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            EnumC1205570hTf enumC1205570hTf = EnumC1205570hTf.POI_QUIZ_MAP_ERROR;
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(enumC1205570hTf, "subscribe", null, e);
        }
        return Unit.LIZ;
    }
}
