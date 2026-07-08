package X;

import X.AbstractC1837520xuw;
import X.AbstractC1837530xux;
import android.app.Activity;
import com.bytedance.android.livesdk.chatroom.api.SMBCourse;
import com.bytedance.android.livesdk.comp.impl.pcs.infra.payment.course.model.SMBOrderMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import webcast.api.smb.CreateSMBCourseOrderRequest;
import webcast.api.smb.CreateSMBCourseOrderResponse;
import webcast.api.smb.GetSMBCourseDetailRequest;
import webcast.api.smb.GetSMBCourseDetailResponse;
import webcast.api.smb.GetSMBCourseOrderStatusResponse;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: renamed from: X.1ERO, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1ERO extends C09AY implements Function0<C0KQS> {
    public C1ERO() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0KQS] */
    @Override // kotlin.jvm.functions.Function0
    public final C0KQS invoke() {
        return new C0KQV() { // from class: X.0KQS
            /* JADX WARN: Type inference failed for: r0v0, types: [X.0xvK] */
            @Override // X.C0KQV
            public final C1837760xvK LIZ(final C1837690xvD c1837690xvD) {
                return new AbstractC1837980xvg(c1837690xvD) { // from class: X.0xvK
                    public final EnumC1779440wPG LJFF = EnumC1779440wPG.PCS_COURSE;

                    @Override // X.AbstractC1837770xvL
                    public final EnumC1779440wPG LIZ() {
                        return this.LJFF;
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [X.0xv8] */
                    @Override // X.AbstractC1837980xvg
                    public final C1837640xv8 LIZJ(EnumC1837330xud enumC1837330xud) {
                        return new AbstractC1837650xv9<AbstractC1837700xvE>(enumC1837330xud) { // from class: X.0xv8
                            public final C01GW LLILZLL = C452501pT.LIZIZ(new C0TTL());

                            /* JADX WARN: Removed duplicated region for block: B:12:0x0019 A[PHI: r1
                              0x0019: PHI (r1v3 java.util.List) = (r1v0 java.util.List), (r1v4 java.util.List) binds: [B:11:0x0017, B:9:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
                            @Override // X.AbstractC1837630xv7
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LJII() {
                                /*
                                    r6 = this;
                                    X.0xvJ r5 = r6.LLILZIL
                                    X.0sBX r4 = new X.0sBX
                                    FETCH_DATA extends X.0xv5 r0 = r6.LLILLL
                                    java.lang.String r3 = ""
                                    if (r0 == 0) goto Le
                                    java.lang.String r2 = r0.LIZIZ
                                    if (r2 != 0) goto Lf
                                Le:
                                    r2 = r3
                                Lf:
                                    if (r5 == 0) goto L15
                                    java.util.List<java.lang.String> r1 = r5.LLILLJJLI
                                    if (r1 != 0) goto L19
                                L15:
                                    X.13BV r1 = X.C13BV.INSTANCE
                                    if (r5 == 0) goto L1e
                                L19:
                                    java.lang.String r0 = r5.LL
                                    if (r0 == 0) goto L1e
                                    r3 = r0
                                L1e:
                                    r4.<init>(r2, r1, r3)
                                    X.0xuc r1 = new X.0xuc
                                    r1.<init>()
                                    X.01GW r0 = r6.LLILZLL
                                    java.lang.Object r0 = r0.getValue()
                                    X.0wjP r0 = (X.InterfaceC1791930wjP) r0
                                    r0.LJIIIZ(r1, r4)
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1837640xv8.LJII():void");
                            }
                        };
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [X.0xur] */
                    @Override // X.AbstractC1837980xvg
                    public final C1837470xur LIZLLL(EnumC1837330xud enumC1837330xud) {
                        return new AbstractC1837520xuw<GetSMBCourseDetailResponse.Data, C1837690xvD>(enumC1837330xud) { // from class: X.0xur
                            @Override // X.AbstractC1837520xuw
                            public final C470590Icr<GetSMBCourseDetailResponse.Data> LJIIJ() {
                                C1106750euH c1106750euH = C1106750euH.LIZ;
                                GetSMBCourseDetailRequest getSMBCourseDetailRequest = new GetSMBCourseDetailRequest();
                                C1837690xvD c1837690xvD2 = this.LLILZLL;
                                getSMBCourseDetailRequest.anchorId = c1837690xvD2 != null ? c1837690xvD2.LIZJ : 0L;
                                getSMBCourseDetailRequest.courseId = c1837690xvD2 != null ? c1837690xvD2.LJI : 0L;
                                getSMBCourseDetailRequest.scene = c1837690xvD2 != null ? c1837690xvD2.LJII : 0;
                                getSMBCourseDetailRequest.iapCountryCode = C518500KVc.LIZ();
                                return c1106750euH.LJII(GetSMBCourseDetailResponse.Data.class, "/webcast/smb/course/detail/", getSMBCourseDetailRequest);
                            }

                            @Override // X.AbstractC1837520xuw
                            public final AbstractC1837520xuw<GetSMBCourseDetailResponse.Data, C1837690xvD>.a LJIIIIZZ(GetSMBCourseDetailResponse.Data data) {
                                String str;
                                List<TemplateInfo> list;
                                GetSMBCourseDetailResponse.Data data2 = data;
                                if (data2 != null) {
                                    SMBCourse sMBCourse = data2.course;
                                    if ((sMBCourse != null && sMBCourse.isPurchased) || ((str = data2.blockPurchaseReason) != null && (!a0.LJJJIL(str)))) {
                                        return new AbstractC1837520xuw.a(false, new C1837430xun(null, new AbstractC1837880xvW() { // from class: X.0xvX
                                        }, null));
                                    }
                                    if (data2 != null && (list = data2.templateList) != null && !list.isEmpty()) {
                                        return new AbstractC1837520xuw.a(true, new C1837370xuh("An unknown payment error occurred", null));
                                    }
                                }
                                return new AbstractC1837520xuw.a(false, new C1837430xun(null, new AbstractC1837880xvW() { // from class: X.0xvY
                                }, null));
                            }

                            @Override // X.AbstractC1837520xuw
                            public final void LJIIIZ(GetSMBCourseDetailResponse.Data data) {
                                TemplateInfo templateInfo;
                                List<TemplateInfo> list;
                                GetSMBCourseDetailResponse.Data data2 = data;
                                C1837690xvD c1837690xvD2 = this.LLILZLL;
                                if (c1837690xvD2 != null) {
                                    if (data2 != null && (list = data2.templateList) != null) {
                                        templateInfo = (TemplateInfo) C13LP.LJJJLL(list);
                                    } else {
                                        templateInfo = null;
                                    }
                                    c1837690xvD2.LJIIIZ = templateInfo;
                                }
                            }

                            @Override // X.AbstractC1837520xuw
                            public final Object LJIIJJI(InterfaceC1364105Vn<? super C470590Icr<GetSMBCourseDetailResponse.Data>> interfaceC1364105Vn) {
                                String str;
                                FETCH_PARAM_GLOBAL fetch_param_global = this.LLILZLL;
                                if (fetch_param_global == 0 || (str = fetch_param_global.LJFF) == null) {
                                    str = "";
                                }
                                return C1808280x9m.LIZ.LIZLLL(str, "/smb/course/detail/", C2097608Jq.LJ(), AnonymousClass0207.get$arr$(153), new C1837480xus(this, null), interfaceC1364105Vn);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
                            /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<java.lang.String>] */
                            /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
                            @Override // X.AbstractC1837520xuw
                            public final void LJIIL(Object obj) {
                                ?? arrayList;
                                List<TemplateInfo> list;
                                GetSMBCourseDetailResponse.Data data = (GetSMBCourseDetailResponse.Data) obj;
                                C1837750xvJ c1837750xvJ = this.LLILZIL;
                                if (c1837750xvJ != null) {
                                    if (data != null && (list = data.templateList) != null) {
                                        arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                                        Iterator<TemplateInfo> it2 = list.iterator();
                                        while (it2.hasNext()) {
                                            arrayList.add(it2.next().iapId);
                                        }
                                    } else {
                                        arrayList = C13BV.INSTANCE;
                                    }
                                    c1837750xvJ.LLILLJJLI = arrayList;
                                    c1837750xvJ.LL = "inapp";
                                }
                            }
                        };
                    }

                    @Override // X.AbstractC1837980xvg
                    public final C1837660xvA LJ(EnumC1837330xud enumC1837330xud) {
                        return new C1837660xvA(EnumC1837790xvN.HARD, enumC1837330xud);
                    }
                };
            }

            @Override // X.C0KQV
            public final void LIZIZ(C0KQK c0kqk) {
                for (C0KQI c0kqi : C0KQR.LIZ) {
                    if (c0kqi.LIZLLL(c0kqk)) {
                        c0kqi.LIZJ(c0kqk);
                        return;
                    }
                }
                new C0KQI() { // from class: X.0KQL
                    @Override // X.C0KQI
                    public final boolean LIZLLL(C0KQK c0kqk2) {
                        return true;
                    }

                    @Override // X.C0KQI
                    public final void LIZJ(C0KQK c0kqk2) {
                        Exception exc = c0kqk2.LJFF;
                        if (exc != null) {
                            C501540Jlg.LIZJ(c0kqk2.LIZ, exc);
                        } else {
                            C766270U4b.LIZLLL(2131851936);
                        }
                    }
                }.LIZJ(c0kqk);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [X.0xul] */
            @Override // X.C0KQV
            public final C1837410xul LIZJ(final C1837680xvC c1837680xvC) {
                return new AbstractC1837990xvh(c1837680xvC) { // from class: X.0xul
                    public final EnumC1779440wPG LIZLLL = EnumC1779440wPG.PCS_COURSE;

                    @Override // X.AbstractC1837770xvL
                    public final EnumC1779440wPG LIZ() {
                        return this.LIZLLL;
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [X.0xv4] */
                    @Override // X.AbstractC1837990xvh
                    public final C1837600xv4 LIZJ(final EnumC1837330xud enumC1837330xud) {
                        return new AbstractC1837540xuy<GetSMBCourseOrderStatusResponse.Data, SMBOrderMessage, C1837680xvC>(enumC1837330xud) { // from class: X.0xv4
                            public AbstractC518430KUv<SMBOrderMessage> LLIZLLLIL = new AbstractC518430KUv<SMBOrderMessage>() { // from class: X.0xvV
                                @Override // X.AbstractC518430KUv
                                public final void LIZLLL() {
                                }

                                @Override // X.AbstractC518430KUv
                                public final void LJ() {
                                }

                                @Override // X.AbstractC518430KUv
                                public final String LIZJ(SMBOrderMessage sMBOrderMessage) {
                                    return sMBOrderMessage.contractId;
                                }
                            };

                            @Override // X.AbstractC1837540xuy
                            public final void LJIILIIL() {
                                this.LLIZLLLIL = null;
                            }

                            @Override // X.AbstractC1837540xuy
                            public final AbstractC518430KUv<SMBOrderMessage> LJIIIIZZ() {
                                return this.LLIZLLLIL;
                            }

                            @Override // X.AbstractC1837540xuy
                            public final boolean LJIIIZ(GetSMBCourseOrderStatusResponse.Data data) {
                                if (data.status == 2) {
                                    return true;
                                }
                                return false;
                            }

                            @Override // X.AbstractC1837540xuy
                            public final Object LJIIL(InterfaceC1364105Vn<? super C470590Icr<GetSMBCourseOrderStatusResponse.Data>> interfaceC1364105Vn) {
                                String str;
                                DATA_GLOBAL data_global = this.LLILZLL;
                                if (data_global == 0 || (str = data_global.LJFF) == null) {
                                    str = "";
                                }
                                return C1808280x9m.LIZ.LIZLLL(str, "/smb/course/order/status/", C2097608Jq.LJ(), AnonymousClass0207.get$arr$(153), new C1837550xuz(this, null), interfaceC1364105Vn);
                            }
                        };
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [X.0xut] */
                    @Override // X.AbstractC1837990xvh
                    public final C1837490xut LIZLLL(final EnumC1837330xud enumC1837330xud) {
                        return new AbstractC1837530xux<CreateSMBCourseOrderResponse.Data, C1837680xvC>(enumC1837330xud) { // from class: X.0xut
                            @Override // X.AbstractC1837530xux
                            public final AbstractC1837530xux<CreateSMBCourseOrderResponse.Data, C1837680xvC>.a LJIIIIZZ(CreateSMBCourseOrderResponse.Data data) {
                                String str;
                                String str2;
                                CreateSMBCourseOrderResponse.Data data2 = data;
                                if (data2 != null && (str = data2.contractId) != null && str.length() != 0 && (str2 = data2.iapPayload) != null && str2.length() != 0) {
                                    return new AbstractC1837530xux.a(true, new C1837360xug(C497740JfY.LJIJI(2131851936)));
                                }
                                return new AbstractC1837530xux.a(false, new C1837440xuo(null, new AbstractC1837910xvZ() { // from class: X.0xva
                                }, null));
                            }

                            @Override // X.AbstractC1837530xux
                            public final String LJIIIZ(CreateSMBCourseOrderResponse.Data data) {
                                String str;
                                CreateSMBCourseOrderResponse.Data data2 = data;
                                if (data2 == null || (str = data2.contractId) == null) {
                                    return "";
                                }
                                return str;
                            }

                            @Override // X.AbstractC1837530xux
                            public final String LJIIJ(CreateSMBCourseOrderResponse.Data data) {
                                String str;
                                CreateSMBCourseOrderResponse.Data data2 = data;
                                if (data2 == null || (str = data2.iapPayload) == null) {
                                    return "";
                                }
                                return str;
                            }

                            @Override // X.AbstractC1837530xux
                            public final Object LJIIJJI(InterfaceC1364105Vn<? super C470590Icr<CreateSMBCourseOrderResponse.Data>> interfaceC1364105Vn) {
                                long j;
                                long j2;
                                String str;
                                long j3;
                                String str2;
                                TemplateInfo templateInfo;
                                TemplateInfo templateInfo2;
                                CreateSMBCourseOrderRequest createSMBCourseOrderRequest = new CreateSMBCourseOrderRequest();
                                C1837680xvC c1837680xvC2 = this.LLILZIL;
                                long j4 = 0;
                                if (c1837680xvC2 != null) {
                                    j = c1837680xvC2.LIZJ;
                                } else {
                                    j = 0;
                                }
                                createSMBCourseOrderRequest.anchorId = j;
                                if (c1837680xvC2 != null) {
                                    j2 = c1837680xvC2.LJII;
                                } else {
                                    j2 = 0;
                                }
                                createSMBCourseOrderRequest.courseId = j2;
                                if (c1837680xvC2 != null && (templateInfo2 = c1837680xvC2.LJI) != null) {
                                    str = templateInfo2.packageId;
                                } else {
                                    str = null;
                                }
                                String str3 = "";
                                if (str == null) {
                                    str = "";
                                }
                                createSMBCourseOrderRequest.packageId = str;
                                if (c1837680xvC2 != null && (templateInfo = c1837680xvC2.LJI) != null) {
                                    j3 = templateInfo.planId;
                                } else {
                                    j3 = 0;
                                }
                                createSMBCourseOrderRequest.planId = j3;
                                createSMBCourseOrderRequest.iapCountryCode = C518500KVc.LIZ();
                                DATA_GLOBAL data_global = this.LLILZIL;
                                if (data_global != 0) {
                                    j4 = data_global.LJ;
                                }
                                createSMBCourseOrderRequest.roomId = j4;
                                if (data_global != 0 && (str2 = data_global.LJFF) != null) {
                                    str3 = str2;
                                }
                                return C1808280x9m.LIZ.LIZLLL(str3, "/smb/course/order/create/", C2097608Jq.LJ(), AnonymousClass0207.get$arr$(153), new C512950K9t(createSMBCourseOrderRequest, null), interfaceC1364105Vn);
                            }
                        };
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [X.0wk8] */
                    @Override // X.AbstractC1837990xvh
                    public final C1792380wk8 LJ(EnumC1837330xud enumC1837330xud) {
                        return new AbstractC1837720xvG<C1837680xvC>(enumC1837330xud) { // from class: X.0wk8
                            public final C01GW LLIZ = C452501pT.LIZIZ(new C0TTN());

                            @Override // X.AbstractC1837630xv7
                            public final void LJII() {
                                String str;
                                WeakReference<Activity> weakReference;
                                String str2;
                                C1792750wkj c1792750wkj = this.LLILZLL;
                                String str3 = "";
                                if (c1792750wkj == null || (str = c1792750wkj.LL) == null) {
                                    str = "";
                                }
                                C1791730wj5 c1791730wj5LIZIZ = C0KQG.LIZIZ(str);
                                C1792750wkj c1792750wkj2 = this.LLILZLL;
                                if (c1792750wkj2 != null && (str2 = c1792750wkj2.LL) != null) {
                                    str3 = str2;
                                }
                                C1791720wj4 c1791720wj4 = new C1791720wj4("802BCRYK2801", true, c1791730wj5LIZIZ, C519980KaK.LIZ(str3, String.valueOf(UserService.getInstance().user().getCurrentUserId())));
                                InterfaceC1791700wj2 interfaceC1791700wj2 = new InterfaceC1791700wj2() { // from class: X.0xua
                                    @Override // X.InterfaceC1791700wj2
                                    public final void LIZIZ(C518140KTs c518140KTs) {
                                        String str4;
                                        Map<String, String> mapLJ;
                                        C1837850xvT c1837850xvT = this.LIZ.LLILLJJLI;
                                        if (c1837850xvT != null) {
                                            C1837850xvT.LIZ(c1837850xvT, new AbstractC1837390xuj() { // from class: X.0xuk
                                            });
                                        }
                                        C1792750wkj c1792750wkj3 = this.LIZ.LLILZLL;
                                        if (c1792750wkj3 == null || (str4 = c1792750wkj3.LLILLJJLI) == null) {
                                            str4 = "";
                                        }
                                        C1837340xue c1837340xue = new C1837340xue(str4);
                                        C1792380wk8 c1792380wk8 = this.LIZ;
                                        Map<String, String> map = c1837340xue.LLILLJJLI;
                                        AbstractC1837710xvF abstractC1837710xvF = c1792380wk8.LLILZIL;
                                        if (abstractC1837710xvF != null) {
                                            mapLJ = abstractC1837710xvF.LJIIIZ(c1792380wk8.LL);
                                        } else {
                                            mapLJ = C2097608Jq.LJ();
                                        }
                                        map.putAll(mapLJ);
                                        C1837850xvT c1837850xvT2 = this.LIZ.LLILLJJLI;
                                        if (c1837850xvT2 != null) {
                                            c1837850xvT2.LIZ.LIZJ(c1837340xue, false);
                                        }
                                    }

                                    @Override // X.InterfaceC1791700wj2
                                    public final void LIZJ(C518140KTs c518140KTs) {
                                        Map<String, String> mapLJ;
                                        C1837850xvT c1837850xvT = this.LIZ.LLILLJJLI;
                                        if (c1837850xvT != null) {
                                            C1837850xvT.LIZ(c1837850xvT, new AbstractC1837390xuj() { // from class: X.0xui
                                            });
                                        }
                                        C1837100xuG c1837100xuG = new C1837100xuG(c518140KTs, null);
                                        Map<String, String> logMap = c1837100xuG.getLogMap();
                                        C1792380wk8 c1792380wk8 = this.LIZ;
                                        AbstractC1837710xvF abstractC1837710xvF = c1792380wk8.LLILZIL;
                                        if (abstractC1837710xvF != null) {
                                            mapLJ = abstractC1837710xvF.LJIIIZ(c1792380wk8.LL);
                                        } else {
                                            mapLJ = C2097608Jq.LJ();
                                        }
                                        logMap.putAll(mapLJ);
                                        logMap.put("error_code", String.valueOf(c1837100xuG.getErrorCode()));
                                        logMap.put("detail_error_code", String.valueOf(c1837100xuG.getDetailCode()));
                                        logMap.put("mapped_error_code", c1837100xuG.getResult().LIZLLL);
                                        C1837850xvT c1837850xvT2 = this.LIZ.LLILLJJLI;
                                        if (c1837850xvT2 != null) {
                                            c1837850xvT2.LIZIZ(c1837100xuG);
                                        }
                                    }
                                };
                                InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) this.LLIZ.getValue();
                                DATA_GLOBAL data_global = this.LLILZIL;
                                interfaceC1791930wjP.LJIILL((data_global == 0 || (weakReference = data_global.LIZ) == null) ? null : weakReference.get(), c1791720wj4, interfaceC1791700wj2, null);
                            }
                        };
                    }
                };
            }
        };
    }
}
