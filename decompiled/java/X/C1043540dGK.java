package X;

import Y.ARunnableS6S1400000_16;
import android.os.Bundle;
import android.util.Pair;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.AnoleAutomationParamModel;
import com.ss.android.ugc.aweme.feed.experiment.CommerceSpecificTimeGeckoConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS401S0200000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dGK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1043540dGK {
    public static final C1043540dGK LIZ = new C1043540dGK();
    public static final String LIZIZ = "AdHybridGeckoManager";

    public static void LIZ(final String str, final Map map, final C1029740cu4 c1029740cu4, final EnumC1016560cYo enumC1016560cYo, Map map2, Map map3, Map map4, final InterfaceC1043620dGS interfaceC1043620dGS) {
        AbstractC1552040qUU abstractC1552040qUU = new AbstractC1552040qUU(str, map, c1029740cu4, enumC1016560cYo, interfaceC1043620dGS) { // from class: X.0dGO
            public final String LIZ;
            public final Map<String, String> LIZIZ;
            public final C1029740cu4 LIZJ;
            public final EnumC1016560cYo LIZLLL;
            public final InterfaceC1043620dGS LJ;
            public final String LJFF = "AdHybridGeckoXImpl";
            public final long LJI = System.currentTimeMillis();

            @Override // X.AbstractC1552040qUU, X.InterfaceC1551180qT6
            public final void LIZ(String str2) {
                InterfaceC1043620dGS interfaceC1043620dGS2 = this.LJ;
                if (interfaceC1043620dGS2 != null) {
                    interfaceC1043620dGS2.LIZ(str2);
                }
            }

            @Override // X.AbstractC1552040qUU
            public final void LJFF(UpdatePackage updatePackage) {
                String channel;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("gecko onActivateSuccess(), channel =  ");
                if (updatePackage != null) {
                    channel = updatePackage.getChannel();
                } else {
                    channel = null;
                }
                sbLIZ.append(channel);
                C2188811AlT.LIZIZ(sbLIZ);
                C811103Ev.LIZ(this.LJFF);
                LJJI(this.LIZIZ, this.LIZJ, updatePackage, true);
            }

            @Override // X.AbstractC1552040qUU
            public final void LJIIL(UpdatePackage updatePackage) {
                String channel;
                InterfaceC1043620dGS interfaceC1043620dGS2 = this.LJ;
                if (interfaceC1043620dGS2 != null) {
                    if (updatePackage != null) {
                        channel = updatePackage.getChannel();
                    } else {
                        channel = null;
                    }
                    interfaceC1043620dGS2.LJFF(channel);
                }
            }

            @Override // X.AbstractC1552040qUU
            public final void LJIILJJIL(UpdatePackage updatePackage) {
                InterfaceC1043620dGS interfaceC1043620dGS2 = this.LJ;
                if (interfaceC1043620dGS2 != null) {
                    interfaceC1043620dGS2.LJ(updatePackage.getChannel());
                }
            }

            @Override // X.AbstractC1552040qUU
            public final void LJIILL(UpdatePackage updatePackage) {
                String channel;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("gecko onDownloadSuccess(), channel =  ");
                if (updatePackage != null) {
                    channel = updatePackage.getChannel();
                } else {
                    channel = null;
                }
                sbLIZ.append(channel);
                C2188811AlT.LIZIZ(sbLIZ);
                C811103Ev.LIZ(this.LJFF);
                LJJIFFI(this.LIZIZ, this.LIZJ, updatePackage, true, null, this.LIZLLL);
            }

            @Override // X.AbstractC1552040qUU
            public final void LJIILLIIL(LocalPackageModel localPackageModel) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onLocalNewest() version, channel ");
                sbLIZ.append(localPackageModel.getChannel());
                C2188811AlT.LIZIZ(sbLIZ);
                C811103Ev.LIZ(this.LJFF);
                String str2 = this.LIZIZ.get(localPackageModel.getChannel());
                String channel = localPackageModel.getChannel();
                localPackageModel.getAccessKey();
                Bundle bundle = new Bundle();
                if (str2 == null) {
                    str2 = "";
                }
                C786410Ut5.LJJJI(Scene.SCENE_SERVICE, str2, bundle);
                bundle.putInt("code", 2);
                C1016520cYk c1016520cYk = new C1016520cYk(channel);
                InterfaceC1043620dGS interfaceC1043620dGS2 = this.LJ;
                if (interfaceC1043620dGS2 != null) {
                    interfaceC1043620dGS2.LIZIZ(c1016520cYk);
                }
            }

            @Override // X.AbstractC1552040qUU
            public final void LJIJJLI(UpdatePackage updatePackage) {
                String channel;
                String channel2;
                String str2;
                String channel3;
                String str3;
                String channel4;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("gecko onUpdateStart(), channel =  ");
                if (updatePackage != null) {
                    channel = updatePackage.getChannel();
                } else {
                    channel = null;
                }
                sbLIZ.append(channel);
                C2188811AlT.LIZIZ(sbLIZ);
                C811103Ev.LIZ(this.LJFF);
                InterfaceC1043620dGS interfaceC1043620dGS2 = this.LJ;
                if (interfaceC1043620dGS2 != null) {
                    if (updatePackage != null) {
                        channel4 = updatePackage.getChannel();
                    } else {
                        channel4 = null;
                    }
                    interfaceC1043620dGS2.LIZLLL(channel4);
                }
                Map<String, String> map5 = this.LIZIZ;
                C1029740cu4 c1029740cu42 = this.LIZJ;
                if (C298290Bmd.LIZ() && updatePackage != null && (channel3 = updatePackage.getChannel()) != null && (str3 = map5.get(channel3)) != null) {
                    C1043610dGR.LIZ.getClass();
                    C1043600dGQ c1043600dGQLIZ = C1043610dGR.LIZ(channel3);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("trackGeckoCheckServerSuccess, channel = ");
                    sbLIZ2.append(channel3);
                    sbLIZ2.append(", scene = ");
                    sbLIZ2.append(str3);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C811103Ev.LIZ(this.LJFF);
                    c1043600dGQLIZ.LJJIIZ(new C1043630dGT(str3, channel3, c1029740cu42), "now_request", null, null);
                }
                Map<String, String> map6 = this.LIZIZ;
                C1029740cu4 c1029740cu43 = this.LIZJ;
                if (C298290Bmd.LIZ() && updatePackage != null && (channel2 = updatePackage.getChannel()) != null && (str2 = map6.get(channel2)) != null) {
                    C1043610dGR.LIZ.getClass();
                    C1043600dGQ c1043600dGQLIZ2 = C1043610dGR.LIZ(channel2);
                    C1043630dGT c1043630dGT = new C1043630dGT(str2, channel2, c1029740cu43);
                    c1043600dGQLIZ2.LJ = System.currentTimeMillis();
                    C1015400cWw c1015400cWw = C1015400cWw.LIZ;
                    String str4 = c1029740cu43.LIZ;
                    String str5 = "-1";
                    if (str4 == null) {
                        str4 = "-1";
                    }
                    c1015400cWw.getClass();
                    C1015400cWw.LIZ(str4, str2).LIZJ.put(channel2, "start_downloading");
                    C2274401E0o.LIZ.getClass();
                    C1023960ckk c1023960ckk = C2274401E0o.LIZLLL;
                    String str6 = c1029740cu43.LIZ;
                    if (str6 != null) {
                        str5 = str6;
                    }
                    c1043600dGQLIZ2.logAd(c1023960ckk, str5, c1029740cu43.LIZIZ, c1029740cu43.LIZJ, new AwS401S0200000_35(c1043630dGT, c1043600dGQLIZ2, 50));
                }
            }

            @Override // X.AbstractC1552040qUU
            public final void LJ(UpdatePackage updatePackage, Throwable th) {
                String channel;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("gecko onActivateFail(), channel =  ");
                if (updatePackage != null) {
                    channel = updatePackage.getChannel();
                } else {
                    channel = null;
                }
                sbLIZ.append(channel);
                C2188811AlT.LIZIZ(sbLIZ);
                C811103Ev.LIZ(this.LJFF);
                LJJI(this.LIZIZ, this.LIZJ, updatePackage, false);
            }

            @Override // X.AbstractC1552040qUU
            public final void LJII(Throwable th, Map map5) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("gecko onCheckServerVersionFail,requestMap = ");
                sbLIZ.append(map5);
                C2188811AlT.LIZIZ(sbLIZ);
                C811103Ev.LIZ(this.LJFF);
                if (map5 == null) {
                    return;
                }
                for (Map.Entry entry : map5.entrySet()) {
                    entry.getKey();
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            String str2 = (String) ((Pair) it2.next()).first;
                            new Bundle().putInt("code", 4);
                            C1016520cYk c1016520cYk = new C1016520cYk(str2);
                            InterfaceC1043620dGS interfaceC1043620dGS2 = this.LJ;
                            if (interfaceC1043620dGS2 != null) {
                                interfaceC1043620dGS2.LIZJ(c1016520cYk);
                            }
                        }
                    }
                }
                LJJII(this.LIZ, this.LIZIZ, this.LIZJ, map5, "4");
            }

            @Override // X.AbstractC1552040qUU
            public final void LJIIIIZZ(Map<String, ? extends List<? extends Pair<String, Long>>> map5, Map<String, ? extends List<? extends UpdatePackage>> map6) {
                InterfaceC1043620dGS interfaceC1043620dGS2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("gecko onCheckServerVersionSuccess, requestMap = ");
                sbLIZ.append(map5);
                C2188811AlT.LIZIZ(sbLIZ);
                C811103Ev.LIZ(this.LJFF);
                if (map5 == null || map5.isEmpty()) {
                    if ((map6 == null || map6.isEmpty()) && (interfaceC1043620dGS2 = this.LJ) != null) {
                        interfaceC1043620dGS2.LIZJ(null);
                    }
                }
            }

            @Override // X.AbstractC1552040qUU
            public final void LJIIJJI(UpdatePackage updatePackage, Throwable th) {
                String channel;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("gecko onDownloadFail(), channel =  ");
                if (updatePackage != null) {
                    channel = updatePackage.getChannel();
                } else {
                    channel = null;
                }
                sbLIZ.append(channel);
                C2188811AlT.LIZIZ(sbLIZ);
                C811103Ev.LIZ(this.LJFF);
                LJJIFFI(this.LIZIZ, this.LIZJ, updatePackage, false, th, this.LIZLLL);
            }

            @Override // X.AbstractC1552040qUU
            public final void LJIIZILJ(UpdatePackage updatePackage, EnumC0335009t enumC0335009t) {
                String channel;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("gecko onUpdateBlocked(), channel =  ");
                String channel2 = null;
                if (updatePackage != null) {
                    channel = updatePackage.getChannel();
                } else {
                    channel = null;
                }
                sbLIZ.append(channel);
                C2188811AlT.LIZIZ(sbLIZ);
                C811103Ev.LIZ(this.LJFF);
                InterfaceC1043620dGS interfaceC1043620dGS2 = this.LJ;
                if (interfaceC1043620dGS2 != null) {
                    if (updatePackage != null) {
                        channel2 = updatePackage.getChannel();
                    }
                    interfaceC1043620dGS2.LJI(channel2);
                }
            }

            @Override // X.AbstractC1552040qUU
            public final void LJIJ(UpdatePackage updatePackage, Throwable th) {
                String message;
                String str2;
                long id;
                if (updatePackage != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onUpdateFailed() update channel ");
                    sbLIZ.append(updatePackage.getChannel());
                    sbLIZ.append(" failed, msg: ");
                    String str3 = "";
                    if (th == null || (message = th.getMessage()) == null) {
                        message = "";
                    }
                    sbLIZ.append(message);
                    sbLIZ.append(", callFrom = ");
                    sbLIZ.append(updatePackage.getCallFrom());
                    C2188811AlT.LIZIZ(sbLIZ);
                    C811103Ev.LIZ(updatePackage.tag);
                    String str4 = this.LIZIZ.get(updatePackage.getChannel());
                    String channel = updatePackage.getChannel();
                    if (str4 == null) {
                        str2 = "";
                    } else {
                        str2 = str4;
                    }
                    int iOrdinal = this.LIZLLL.ordinal();
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.LJI;
                    UpdatePackage.Package r0 = updatePackage.getPackage();
                    long length = -1;
                    if (r0 != null) {
                        id = r0.getId();
                    } else {
                        id = -1;
                    }
                    UpdatePackage.Package r02 = updatePackage.getPackage();
                    if (r02 != null) {
                        length = r02.getLength();
                    }
                    C1028410crv.LIZ(this.LIZJ, new C1050680dRq(channel, str2, Long.valueOf(jCurrentTimeMillis), null, 0, 0, null, null, null, null, Integer.valueOf(iOrdinal), Long.valueOf(id), Long.valueOf(length), Intrinsics.LJFF(updatePackage.getCallFrom(), "commerce_ad_format"), 2008));
                    C811103Ev.LIZ(updatePackage.tag);
                    String channel2 = updatePackage.getChannel();
                    updatePackage.getAccessKey();
                    Bundle bundle = new Bundle();
                    if (str4 != null) {
                        str3 = str4;
                    }
                    C786410Ut5.LJJJI(Scene.SCENE_SERVICE, str3, bundle);
                    bundle.putInt("code", 0);
                    C1016520cYk c1016520cYk = new C1016520cYk(channel2);
                    InterfaceC1043620dGS interfaceC1043620dGS2 = this.LJ;
                    if (interfaceC1043620dGS2 != null) {
                        interfaceC1043620dGS2.LIZJ(c1016520cYk);
                    }
                    C1440005kM.LIZ(new AnonymousClass0356(updatePackage.getChannel(), String.valueOf(th)));
                }
            }

            @Override // X.AbstractC1552040qUU
            public final void LJIL(long j, UpdatePackage updatePackage) {
                String str2;
                long id;
                if (updatePackage != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onUpdateSuccess() update channel ");
                    sbLIZ.append(updatePackage.getChannel());
                    sbLIZ.append(" success, callFrom = ");
                    sbLIZ.append(updatePackage.getCallFrom());
                    C2188811AlT.LIZIZ(sbLIZ);
                    C811103Ev.LIZ(updatePackage.tag);
                    String str3 = this.LIZIZ.get(updatePackage.getChannel());
                    String channel = updatePackage.getChannel();
                    if (str3 == null) {
                        str2 = "";
                    } else {
                        str2 = str3;
                    }
                    int iOrdinal = this.LIZLLL.ordinal();
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.LJI;
                    UpdatePackage.Package r0 = updatePackage.getPackage();
                    long length = -1;
                    if (r0 != null) {
                        id = r0.getId();
                    } else {
                        id = -1;
                    }
                    UpdatePackage.Package r02 = updatePackage.getPackage();
                    if (r02 != null) {
                        length = r02.getLength();
                    }
                    C1028410crv.LIZ(this.LIZJ, new C1050680dRq(channel, str2, Long.valueOf(jCurrentTimeMillis), null, 1, 0, null, null, null, null, Integer.valueOf(iOrdinal), Long.valueOf(id), Long.valueOf(length), Intrinsics.LJFF(updatePackage.getCallFrom(), "commerce_ad_format"), 2008));
                    C811103Ev.LIZ(updatePackage.tag);
                    String channel2 = updatePackage.getChannel();
                    updatePackage.getAccessKey();
                    Bundle bundle = new Bundle();
                    if (str3 == null) {
                        str3 = "";
                    }
                    C786410Ut5.LJJJI(Scene.SCENE_SERVICE, str3, bundle);
                    bundle.putInt("code", 1);
                    C1016520cYk c1016520cYk = new C1016520cYk(channel2);
                    InterfaceC1043620dGS interfaceC1043620dGS2 = this.LJ;
                    if (interfaceC1043620dGS2 != null) {
                        interfaceC1043620dGS2.LIZIZ(c1016520cYk);
                    }
                    C1440005kM.LIZ(new AnonymousClass0325(updatePackage.getChannel()));
                }
            }

            @Override // X.AbstractC1552040qUU
            public final void LJI(int i, Throwable th, Map map5) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("gecko onCheckRequestIntercept(), code ");
                sbLIZ.append(i);
                C2188811AlT.LIZIZ(sbLIZ);
                C811103Ev.LIZ(this.LJFF);
                if (map5 == null) {
                    return;
                }
                for (Map.Entry entry : map5.entrySet()) {
                    entry.getKey();
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            String str2 = (String) ((Pair) it2.next()).first;
                            new Bundle().putInt("code", i);
                            C1016520cYk c1016520cYk = new C1016520cYk(str2);
                            InterfaceC1043620dGS interfaceC1043620dGS2 = this.LJ;
                            if (interfaceC1043620dGS2 != null) {
                                interfaceC1043620dGS2.LIZJ(c1016520cYk);
                            }
                        }
                    }
                }
                LJJII(this.LIZ, this.LIZIZ, this.LIZJ, map5, "5");
            }

            public static void LJJI(Map map5, C1029740cu4 c1029740cu42, UpdatePackage updatePackage, boolean z) {
                String channel;
                String str2;
                String str3;
                String str4;
                String str5;
                if (!C298290Bmd.LIZ() || updatePackage == null || (channel = updatePackage.getChannel()) == null || (str2 = (String) map5.get(channel)) == null) {
                    return;
                }
                C1043610dGR.LIZ.getClass();
                C1043600dGQ c1043600dGQLIZ = C1043610dGR.LIZ(channel);
                C1043630dGT c1043630dGT = new C1043630dGT(str2, channel, c1029740cu42);
                if (z) {
                    str3 = "1";
                } else {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                if (!z) {
                    str4 = "-1";
                } else {
                    str4 = null;
                }
                String strValueOf = String.valueOf(updatePackage.getVersion());
                c1043600dGQLIZ.LJI = System.currentTimeMillis();
                C1015400cWw c1015400cWw = C1015400cWw.LIZ;
                String str6 = c1029740cu42.LIZ;
                if (str6 == null) {
                    str6 = "-1";
                }
                c1015400cWw.getClass();
                AnoleAutomationParamModel anoleAutomationParamModelLIZ = C1015400cWw.LIZ(str6, str2);
                Map<String, String> map6 = anoleAutomationParamModelLIZ.LIZJ;
                if (Intrinsics.LJFF(str3, "1")) {
                    str5 = "activate_success";
                } else {
                    str5 = "activate_failed";
                }
                map6.put(channel, str5);
                anoleAutomationParamModelLIZ.LIZLLL.put(channel, str4);
                C2274401E0o.LIZ.getClass();
                C1023960ckk c1023960ckk = C2274401E0o.LJFF;
                String str7 = c1029740cu42.LIZ;
                if (str7 == null) {
                    str7 = "-1";
                }
                c1043600dGQLIZ.logAd(c1023960ckk, str7, c1029740cu42.LIZIZ, c1029740cu42.LIZJ, new C2274421E0q(c1043630dGT, str3, str4, null, strValueOf, c1043600dGQLIZ));
            }

            {
                this.LIZ = str;
                this.LIZIZ = map;
                this.LIZJ = c1029740cu4;
                this.LIZLLL = enumC1016560cYo;
                this.LJ = interfaceC1043620dGS;
            }

            public final void LJJII(String str2, Map map5, C1029740cu4 c1029740cu42, Map map6, String str3) {
                List list;
                if (C298290Bmd.LIZ() && map6 != null && (list = (List) map6.get(str2)) != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        String str4 = (String) ((Pair) it2.next()).first;
                        String str5 = (String) map5.get(str4);
                        if (str5 != null && !C1552050qUV.LIZIZ(str2, str4)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("trackGeckoRequestServerFailed, channel = ");
                            sbLIZ.append(str4);
                            sbLIZ.append(", scene = ");
                            sbLIZ.append(str5);
                            C2188811AlT.LIZIZ(sbLIZ);
                            C811103Ev.LIZ(this.LJFF);
                            C1043610dGR.LIZ.getClass();
                            C1043610dGR.LIZ(str4).LJJIIZ(new C1043630dGT(str5, str4, c1029740cu42), "not_found", str3, null);
                        }
                    }
                }
            }

            public static void LJJIFFI(Map map5, C1029740cu4 c1029740cu42, UpdatePackage updatePackage, boolean z, Throwable th, EnumC1016560cYo enumC1016560cYo2) {
                String channel;
                String str2;
                String str3;
                String str4;
                long length;
                String str5;
                if (!C298290Bmd.LIZ() || updatePackage == null || (channel = updatePackage.getChannel()) == null || (str2 = (String) map5.get(channel)) == null) {
                    return;
                }
                C1043610dGR.LIZ.getClass();
                C1043600dGQ c1043600dGQLIZ = C1043610dGR.LIZ(channel);
                C1043630dGT c1043630dGT = new C1043630dGT(str2, channel, c1029740cu42);
                if (z) {
                    str3 = "1";
                } else {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                String message = null;
                if (!z) {
                    str4 = "-1";
                } else {
                    str4 = null;
                }
                if (th != null) {
                    message = th.getMessage();
                }
                UpdatePackage.Package r3 = updatePackage.getPackage();
                if (r3 != null) {
                    length = r3.getLength();
                } else {
                    length = -1;
                }
                Long lValueOf = Long.valueOf(length);
                Long lValueOf2 = Long.valueOf(enumC1016560cYo2.ordinal());
                Long lValueOf3 = Long.valueOf(updatePackage.getPackage().getId());
                String strValueOf = String.valueOf(updatePackage.getVersion());
                c1043600dGQLIZ.LJFF = System.currentTimeMillis();
                C1015400cWw c1015400cWw = C1015400cWw.LIZ;
                String str6 = c1029740cu42.LIZ;
                if (str6 == null) {
                    str6 = "-1";
                }
                c1015400cWw.getClass();
                AnoleAutomationParamModel anoleAutomationParamModelLIZ = C1015400cWw.LIZ(str6, str2);
                Map<String, String> map6 = anoleAutomationParamModelLIZ.LIZJ;
                if (Intrinsics.LJFF(str3, "1")) {
                    str5 = "download_success";
                } else {
                    str5 = "download_failed";
                }
                map6.put(channel, str5);
                anoleAutomationParamModelLIZ.LIZLLL.put(channel, str4);
                C2274401E0o.LIZ.getClass();
                C1023960ckk c1023960ckk = C2274401E0o.LJ;
                String str7 = c1029740cu42.LIZ;
                if (str7 == null) {
                    str7 = "-1";
                }
                c1043600dGQLIZ.logAd(c1023960ckk, str7, c1029740cu42.LIZIZ, c1029740cu42.LIZJ, new C2274411E0p(c1043630dGT, str3, str4, message, lValueOf, lValueOf2, lValueOf3, strValueOf, c1043600dGQLIZ));
            }
        };
        Collection collectionValues = ((LinkedHashMap) map3).values();
        boolean z = false;
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it2 = collectionValues.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (!((List) it2.next()).isEmpty()) {
                    C1043590dGP.LIZ.getClass();
                    C08UW.LIZIZ.execute(new ARunnableS6S1400000_16(abstractC1552040qUU, c1029740cu4, str, map3, map, 0));
                    map3.toString();
                    C811103Ev.LIZ(LIZIZ);
                    break;
                }
            }
        }
        Collection collectionValues2 = ((LinkedHashMap) map4).values();
        if ((collectionValues2 instanceof Collection) && collectionValues2.isEmpty()) {
            z = true;
        } else {
            Iterator it3 = collectionValues2.iterator();
            while (it3.hasNext()) {
                if (!((List) it3.next()).isEmpty()) {
                    break;
                }
            }
            z = true;
        }
        if (!z) {
            C1043590dGP.LIZ.getClass();
            long j = ((CommerceSpecificTimeGeckoConfig.SpecificTimeGeckoSettingModel) CommerceSpecificTimeGeckoConfig.LIZIZ.getValue()).expireTime;
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            if (j > 0) {
                optionCheckUpdateParams.setCacheConfig(new C1551290qTH(0, EnumC1551280qTG.SPECIFIC_TIME, C13BV.INSTANCE, null, Long.valueOf(j * 1000)));
            }
            optionCheckUpdateParams.setListener(abstractC1552040qUU);
            optionCheckUpdateParams.setFrom("commerce_ad_format");
            C1551950qUL c1551950qULLJIILJJIL = C1552050qUV.LJIILJJIL(str, null);
            if (c1551950qULLJIILJJIL != null) {
                c1551950qULLJIILJJIL.LIZ(null, map4, optionCheckUpdateParams);
            }
            C1043590dGP.LIZLLL(C1043590dGP.LIZ(Integer.valueOf(optionCheckUpdateParams.getChannelUpdatePriority())), c1029740cu4, map);
            C1043590dGP.LIZIZ(str, C1043590dGP.LIZ(Integer.valueOf(optionCheckUpdateParams.getChannelUpdatePriority())), c1029740cu4, map);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("akToChannelTargetMap ");
            sbLIZ.append(map4);
            C811103Ev.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            C844470XAv.LIZ.getClass();
            C811103Ev.LIZIZ(C844470XAv.LIZ(), "load SpecificTime Gecko ");
            map4.toString();
            C811103Ev.LIZ(LIZIZ);
        }
        C1043590dGP.LIZ.getClass();
        final OptionCheckUpdateParams optionCheckUpdateParams2 = new OptionCheckUpdateParams();
        optionCheckUpdateParams2.setListener(abstractC1552040qUU);
        optionCheckUpdateParams2.setFrom("commerce_ad_format_normal");
        C1551950qUL c1551950qULLJIILJJIL2 = C1552050qUV.LJIILJJIL(str, new InterfaceC1551300qTI() { // from class: X.0dGM
            @Override // X.InterfaceC1551300qTI
            public final void LIZ(String str2) {
                C1043590dGP c1043590dGP = C1043590dGP.LIZ;
                Integer numValueOf = Integer.valueOf(optionCheckUpdateParams2.getChannelUpdatePriority());
                c1043590dGP.getClass();
                C1043590dGP.LIZJ(str2, C1043590dGP.LIZ(numValueOf), c1029740cu4, map);
            }
        });
        if (c1551950qULLJIILJJIL2 != null) {
            c1551950qULLJIILJJIL2.LIZ(null, map2, optionCheckUpdateParams2);
        }
        C1043590dGP.LIZLLL(C1043590dGP.LIZ(Integer.valueOf(optionCheckUpdateParams2.getChannelUpdatePriority())), c1029740cu4, map);
        C1043590dGP.LIZIZ(str, C1043590dGP.LIZ(Integer.valueOf(optionCheckUpdateParams2.getChannelUpdatePriority())), c1029740cu4, map);
        C844470XAv.LIZ.getClass();
        C811103Ev.LIZIZ(C844470XAv.LIZ(), "gecko preload old");
        map2.toString();
        C811103Ev.LIZ(LIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(java.lang.String r30, java.lang.String r31, java.util.List r32, java.util.Map r33, X.C1029740cu4 r34, java.util.Map r35, java.util.Map r36, java.util.Map r37) {
        /*
            Method dump skipped, instruction units count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1043540dGK.LIZIZ(java.lang.String, java.lang.String, java.util.List, java.util.Map, X.0cu4, java.util.Map, java.util.Map, java.util.Map):void");
    }
}
