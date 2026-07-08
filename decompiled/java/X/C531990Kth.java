package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.api.pipeline.TemplateConsumeCoreParam;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.TemplateConsumeData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.interfaces.ITemplateMobService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kth, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C531990Kth {
    public static final C532540Kua<C531970Ktf> LIZ;

    static {
        AFwS239S0000000_8 aFwS239S0000000_8 = AFwS239S0000000_8.get$arr$(7);
        C532360KuI c532360KuI = new C532360KuI("startUseTemplate");
        aFwS239S0000000_8.invoke(c532360KuI);
        LIZ = new C532540Kua<>("startUseTemplate", C13LP.LLIIII(c532360KuI.LIZIZ.values()));
    }

    public static final TemplateConsumeCoreParam LIZ(C531970Ktf c531970Ktf) {
        EnumC1412640mre enumC1412640mre = c531970Ktf.LIZJ;
        if (enumC1412640mre == null) {
            enumC1412640mre = EnumC1412640mre.PUGC_TEMPLATE;
        }
        return new TemplateConsumeCoreParam(c531970Ktf.LIZ, enumC1412640mre, c531970Ktf.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZIZ(Activity activity, EnumC1412640mre enumC1412640mre, ShortVideoContext shortVideoContext, C1412390mrF c1412390mrF, String str) {
        InterfaceC497601wk interfaceC497601wkLIZIZ;
        LifecycleOwner lifecycleOwner;
        CreativeModel creativeModel;
        TemplateConsumeData templateConsumeData;
        if (!activity.isFinishing() && str.length() != 0) {
            if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (templateConsumeData = creativeModel.templateConsumeData) != null) {
                templateConsumeData.templateId = str;
                if (enumC1412640mre != null) {
                    templateConsumeData.templateType = C1412630mrd.LIZLLL(enumC1412640mre);
                }
                templateConsumeData.dispatchType = c1412390mrF.LIZ;
            }
            final C531970Ktf c531970Ktf = new C531970Ktf(activity, enumC1412640mre, shortVideoContext, c1412390mrF, str);
            if (!(activity instanceof LifecycleOwner) || (lifecycleOwner = (LifecycleOwner) activity) == null || (interfaceC497601wkLIZIZ = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
                interfaceC497601wkLIZIZ = C2296808zG.LIZIZ();
            }
            C23250099c.LIZLLL(interfaceC497601wkLIZIZ, null, null, new C532010Ktj(LIZ, c531970Ktf, new InterfaceC532530KuZ(c531970Ktf) { // from class: X.0Ktg
                public final C531970Ktf LIZ;
                public boolean LIZIZ;
                public boolean LIZJ;
                public boolean LIZLLL;
                public String LJ;

                @Override // X.InterfaceC532530KuZ
                public final void LIZ(String str2) {
                }

                {
                    this.LIZ = c531970Ktf;
                }

                @Override // X.InterfaceC532530KuZ
                public final void LIZIZ(String str2, List<String> list) {
                    String str3;
                    String str4;
                    String creationId;
                    CreativeInfo creativeInfo;
                    C532330KuF c532330KuF;
                    if (((ArrayList) list).isEmpty() && this.LJ == null) {
                        C201955140j.LJIILJJIL(C1398350mUb.LIZIZ, "StartUseTemplate graph finish ok");
                        return;
                    }
                    C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("StartUseTemplate graph finish with failed: ");
                    sbLIZ.append(list);
                    C201955140j.LJII(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
                    String str5 = this.LJ;
                    if (str5 == null) {
                        if (this.LIZIZ && !this.LIZJ && !this.LIZLLL) {
                            str5 = "fetch_detail_failed";
                        } else {
                            return;
                        }
                    }
                    EnumC1412640mre enumC1412640mre2 = this.LIZ.LIZJ;
                    if (enumC1412640mre2 == null) {
                        enumC1412640mre2 = EnumC1412640mre.PUGC_TEMPLATE;
                    }
                    ITemplateMobService iTemplateMobService = (ITemplateMobService) PluggableExtentionKt.pluggableSpi$default(ITemplateMobService.class, false, false, false, 14, null);
                    if (iTemplateMobService != null) {
                        String str6 = this.LIZ.LIZ;
                        Integer numValueOf = Integer.valueOf(enumC1412640mre2.getValue());
                        C531550Ksz c531550KszLIZ = C0FQK.LIZ(this.LIZ.LIZ);
                        if (c531550KszLIZ != null && (c532330KuF = c531550KszLIZ.LIZJ) != null) {
                            str3 = c532330KuF.LIZ;
                        } else {
                            str3 = null;
                        }
                        C531970Ktf c531970Ktf2 = this.LIZ;
                        String str7 = c531970Ktf2.LIZIZ.LIZ;
                        ShortVideoContext shortVideoContext2 = c531970Ktf2.LJ;
                        if (shortVideoContext2 != null) {
                            str4 = shortVideoContext2.shootWay;
                            CreativeModel creativeModel2 = shortVideoContext2.creativeModel;
                            if (creativeModel2 != null && (creativeInfo = creativeModel2.creativeInfo) != null) {
                                creationId = creativeInfo.getCreationId();
                            }
                            iTemplateMobService.LJ(str6, numValueOf, str3, str7, "launch_album_blocked", 0L, false, -1, false, str5, null, null, str4, creationId, true, new LinkedHashMap());
                        }
                        str4 = null;
                        creationId = null;
                        iTemplateMobService.LJ(str6, numValueOf, str3, str7, "launch_album_blocked", 0L, false, -1, false, str5, null, null, str4, creationId, true, new LinkedHashMap());
                    }
                }

                @Override // X.InterfaceC532530KuZ
                public final void LIZJ(String str2, String str3, C0L93 c0l93, String str4) {
                    int iHashCode = str3.hashCode();
                    if (iHashCode != -1616724837) {
                        if (iHashCode != 109483947) {
                            if (iHashCode == 1708699315 && str3.equals("prefillAlbumData") && c0l93 == C0L93.SUCCESS) {
                                this.LIZJ = true;
                            }
                        } else if (str3.equals("fetchDetail") && c0l93 == C0L93.FAILED) {
                            this.LIZIZ = true;
                        }
                    } else if (str3.equals("launchMediaSelection")) {
                        int i = C532000Kti.LIZ[c0l93.ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                if (str4 == null) {
                                    str4 = "";
                                }
                                if (!Intrinsics.LJFF(str4, "activity_finishing")) {
                                    if (str4.length() == 0) {
                                        str4 = "launch_media_selection_failed";
                                    }
                                    this.LJ = str4;
                                }
                            }
                        } else {
                            this.LIZLLL = true;
                        }
                    }
                    if (C532000Kti.LIZ[c0l93.ordinal()] == 2) {
                        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("StartUseTemplate node ");
                        sbLIZ.append(str3);
                        sbLIZ.append(" -> ");
                        sbLIZ.append(c0l93);
                        C201955140j.LJII(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("StartUseTemplate node ");
                    sbLIZ2.append(str3);
                    sbLIZ2.append(" -> ");
                    sbLIZ2.append(c0l93);
                    C201955140j.LJIILJJIL(c1398350mUb2, C2188811AlT.LIZIZ(sbLIZ2));
                }
            }, null, null), 3);
            return;
        }
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StartUseTemplate abort: finishing=");
        sbLIZ.append(activity.isFinishing());
        sbLIZ.append(", id=");
        sbLIZ.append(str);
        C201955140j.LJII(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
    }
}
