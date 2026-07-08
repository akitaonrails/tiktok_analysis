package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.livesetting.performance.LiveClickExitRoomOptSetting;
import com.bytedance.android.livesdk.subscribe.model.PreCheckResult;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.TemplateInfo;
import webcast.api.sub.TemplateListData;

/* JADX INFO: renamed from: X.0KKE, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KKE {
    public final C0KJX LIZ;
    public C0KH1 LIZIZ;
    public C0KKQ LIZJ;
    public final C01GW LIZLLL = C292401Bi.LIZ(new C0KKR());
    public final C0KKH LJ = new C0KKH(this);

    public C0KKE(C0KJX c0kjx) {
        this.LIZ = c0kjx;
    }

    public final void LIZ(final C515840KKw c515840KKw, final C0KH1 c0kh1, final C0KKQ c0kkq) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZIZ = c0kh1;
        this.LIZJ = c0kkq;
        InterfaceC420801kM interfaceC420801kMLJJLL = this.LJ.LIZJ().LJJIIJ(new InterfaceC781210Ukh() { // from class: X.0KKN
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                C0KKQ c0kkq2 = c0kkq;
                if (c0kkq2.LIZ != 1) {
                    List<C0KOW> list = C0KNM.LIZ;
                    String strLIZ = C0KNM.LIZ(Integer.valueOf(c0kkq2.LIZIZ), Integer.valueOf(c0kkq.LIZJ), c0kkq.LIZLLL);
                    C0KKQ c0kkq3 = c0kkq;
                    int i = c0kkq3.LIZ;
                    if (i == -1 || i == -2) {
                        this.LIZ.LJIIJ.LIZ(c0kkq3.LIZJ, strLIZ);
                    }
                    C0KKO c0kko = this.LIZ.LJIIJ;
                    C0KKQ c0kkq4 = c0kkq;
                    c0kko.LIZLLL(-1, c0kkq4.LIZIZ, c0kkq4.LIZJ, strLIZ, c0kh1);
                }
            }
        }).LJJLL(new C09JN() { // from class: X.0KKC
            @Override // X.C09JN
            public final void accept(Object obj) {
                List<TemplateInfo> list;
                boolean z;
                C1C7U.LIZ("SubscribeTemplateFetchRepo@8722.fetchTemplate$2");
                BaseResponse baseResponse = (BaseResponse) obj;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                TemplateListData templateListData = (TemplateListData) baseResponse.data;
                PreCheckResult preCheckResult = templateListData.preCheckResult;
                C0KH1 c0kh12 = c0kh1;
                c0kh12.LIZ = templateListData;
                c0kh12.LIZIZ = false;
                c0kh12.LIZJ = templateListData.subScenario;
                c0kh12.LIZLLL = templateListData.activeContract;
                c0kh12.LJ = preCheckResult;
                c0kh12.LJFF = Integer.valueOf(templateListData.planChangeBlockStatus);
                c0kh12.LJI = templateListData.transactionTips;
                C0KKE c0kke = this;
                if (c0kke.LIZ.LJII == EnumC513490KBv.PLAN_CHANGE) {
                    list = templateListData.planChangeOptions;
                } else {
                    list = templateListData.templateList;
                }
                C516120KLy c516120KLyLIZIZ = C0KKE.LIZIZ(c0kke, jCurrentTimeMillis2, list, null, 4);
                this.LJ.getClass();
                AbstractC516030KLp.LIZIZ(c516120KLyLIZIZ);
                C0KKE c0kke2 = this;
                c0kke2.getClass();
                if (list != null && !list.isEmpty()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    C0KH1 c0kh13 = c0kke2.LIZIZ;
                    if (c0kh13 != null) {
                        c0kh13.LJII = true;
                    }
                    C0KKQ c0kkq2 = c0kke2.LIZJ;
                    if (c0kkq2 != null) {
                        C0KKQ.LIZ(c0kkq2, -1, -1001, -1001);
                    }
                } else {
                    TemplateInfo templateInfo = (TemplateInfo) C13LP.LJJJLZIJ(0, list);
                    if (templateInfo != null && templateInfo.payChannel == 2) {
                        c0kke2.LIZ.LJIIJ.LJFF(0L, templateListData);
                        C0KJX c0kjx = this.LIZ;
                        String str = c0kjx.LIZ;
                        int i = c0kjx.LIZJ;
                        EnumC513490KBv enumC513490KBv = c0kjx.LJII;
                        Pair<C470590Icr<TemplateListData>, TemplateListData> pair = new Pair<>(baseResponse, templateListData);
                        String strLIZLLL = C513500KBw.LIZLLL(i, str);
                        Map<String, C510150JzZ> map = C513500KBw.LIZIZ;
                        C510150JzZ c510150JzZ = (C510150JzZ) ((LinkedHashMap) map).get(strLIZLLL);
                        if (c510150JzZ == null) {
                            c510150JzZ = new C510150JzZ(null);
                        }
                        c510150JzZ.LIZ = pair;
                        c510150JzZ.LIZJ.add(enumC513490KBv);
                        List<EnumC513490KBv> list2 = C513500KBw.LIZLLL;
                        if (list2.contains(enumC513490KBv)) {
                            c510150JzZ.LIZJ.addAll(list2);
                        }
                        map.put(strLIZLLL, c510150JzZ);
                        c515840KKw.LIZ(templateListData);
                    } else {
                        C0KH1 c0kh14 = c0kke2.LIZIZ;
                        if (c0kh14 != null) {
                            c0kh14.LJII = true;
                        }
                        C0KKQ c0kkq3 = c0kke2.LIZJ;
                        if (c0kkq3 != null) {
                            C0KKQ.LIZ(c0kkq3, -1, -1001, -1002);
                        }
                    }
                }
                C1C7U.LIZIZ("SubscribeTemplateFetchRepo@8722.fetchTemplate$2");
            }
        }, new C09JN() { // from class: X.0KKK
            @Override // X.C09JN
            public final void accept(Object obj) {
                String prompt;
                C501470JlZ c501470JlZ;
                C1C7U.LIZ("SubscribeTemplateFetchRepo@8722.fetchTemplate$3");
                Throwable th = (Throwable) obj;
                C516120KLy c516120KLyLIZIZ = C0KKE.LIZIZ(this, System.currentTimeMillis() - jCurrentTimeMillis, null, th, 2);
                this.LJ.getClass();
                AbstractC516030KLp.LIZ(c516120KLyLIZIZ);
                this.LIZ.LJIIJ.LIZ(C512300K7g.LIZIZ(th), th.getMessage());
                c0kh1.LJII = true;
                C0KKQ c0kkq2 = c0kkq;
                int iLIZIZ = C512300K7g.LIZIZ(th);
                if (!(th instanceof C501470JlZ) || (c501470JlZ = (C501470JlZ) th) == null || (prompt = c501470JlZ.getPrompt()) == null) {
                    prompt = "";
                }
                c0kkq2.LIZ = -2;
                c0kkq2.LIZIZ = C386801es.DEFAULT;
                c0kkq2.LIZJ = iLIZIZ;
                c0kkq2.LIZLLL = prompt;
                C1C7U.LIZIZ("SubscribeTemplateFetchRepo@8722.fetchTemplate$3");
            }
        });
        if (LiveClickExitRoomOptSetting.INSTANCE.enableApiCancel() && Intrinsics.LJFF(this.LIZ.LIZLLL, "prefetch_sub")) {
            ((C11NJ) this.LIZLLL.getValue()).LIZ(interfaceC420801kMLJJLL);
        }
    }

    public static C516120KLy LIZIZ(C0KKE c0kke, long j, List list, Throwable th, int i) {
        int size;
        String str;
        C501470JlZ c501470JlZ;
        String logId;
        TemplateInfo templateInfo;
        Integer numValueOf = null;
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        c0kke.getClass();
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        String str2 = c0kke.LIZ.LIZLLL;
        String str3 = "";
        if (list == null || (templateInfo = (TemplateInfo) C13LP.LJJJLL(list)) == null || (str = templateInfo.currency) == null) {
            str = "";
        }
        if ((th instanceof C501470JlZ) && (c501470JlZ = (C501470JlZ) th) != null && (logId = c501470JlZ.getLogId()) != null) {
            str3 = logId;
        }
        if (th != null) {
            numValueOf = Integer.valueOf(C512300K7g.LIZIZ(th));
        }
        return new C516120KLy(j, size, str2, str, false, str3, numValueOf, null, 144);
    }
}
