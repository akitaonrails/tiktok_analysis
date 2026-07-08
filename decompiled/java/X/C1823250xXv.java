package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.pcs.data.api.PcsApi;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.SMBPreviewResponse;

/* JADX INFO: renamed from: X.0xXv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1823250xXv extends AbstractC1826160xcc<C1823280xXy, C11NZ<AbstractC509020Jxk>> {
    public final C1822490xWh LIZ;

    public C1823250xXv(C1822490xWh c1822490xWh) {
        this.LIZ = c1822490xWh;
    }

    public final C19476011Hq LIZIZ(final C1823280xXy c1823280xXy) {
        C1822490xWh c1822490xWh = this.LIZ;
        String str = c1823280xXy.LIZ;
        String str2 = c1823280xXy.LIZIZ;
        c1822490xWh.getClass();
        C480460Ism.LIZ().getClass();
        return C1808280x9m.LJFF(((PcsApi) C480460Ism.LIZLLL(PcsApi.class)).getServicePlusPreview(str, str2).LJL(C11S5.LIZ()), C1822490xWh.class.getSimpleName(), "/sub/smb/preview/", null, 12).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.00Gw
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return ((BaseResponse) obj).data;
            }
        }).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0xXx
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                SMBPreviewResponse.ResponseData responseData = (SMBPreviewResponse.ResponseData) obj;
                C1103520ep4 c1103520ep4 = C1103520ep4.LIZ;
                C1823280xXy c1823280xXy2 = c1823280xXy;
                c1103520ep4.LJFF(c1823280xXy2.LIZ, c1823280xXy2.LIZIZ, new C1822320xWQ(responseData));
                return new C509030Jxl(new C1158720gG6(responseData, EnumC1154670g9Z.REMOTE));
            }
        }).LJJLIIIIJ(new InterfaceC1487280oo2() { // from class: X.0JLb
            /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
            @Override // X.InterfaceC1487280oo2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r4) {
                /*
                    r3 = this;
                    java.lang.Throwable r4 = (java.lang.Throwable) r4
                    X.0JLa r2 = new X.0JLa
                    boolean r0 = r4 instanceof java.lang.Exception
                    if (r0 == 0) goto Lb
                    r1 = r4
                    if (r4 != 0) goto L14
                Lb:
                    java.lang.Exception r1 = new java.lang.Exception
                    java.lang.String r0 = r4.getMessage()
                    r1.<init>(r0)
                L14:
                    r2.<init>(r1)
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C490410JLb.apply(java.lang.Object):java.lang.Object");
            }
        });
    }

    public final C11NZ<AbstractC509020Jxk> LIZJ(final C1823280xXy c1823280xXy) {
        C1103510ep3 c1103510ep3;
        C11NZ c19475711Hn;
        C11PQ<AbstractC1103480ep0> c11pq;
        C098D c098dLJJJ;
        int i = C1822500xWi.LIZ[c1823280xXy.LIZLLL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            C11K9 c11k9LIZ = LIZ(c1823280xXy, false);
                            C1103520ep4 c1103520ep4 = C1103520ep4.LIZ;
                            if (!Intrinsics.LJFF(C1103520ep4.LIZLLL(c1823280xXy.LIZ, c1823280xXy.LIZIZ), C1103400eos.LIZ)) {
                                c098dLJJJ = LIZIZ(c1823280xXy);
                            } else {
                                String strLIZ = C1103520ep4.LIZ(c1823280xXy.LIZ, c1823280xXy.LIZIZ);
                                if (strLIZ != null && (c1103510ep3 = C1103520ep4.LIZIZ.get(strLIZ)) != null && (c11pq = c1103510ep3.LIZIZ) != null) {
                                    c19475711Hn = new C19475711Hn(c11pq);
                                } else {
                                    c19475711Hn = C11IR.LL;
                                }
                                c098dLJJJ = c19475711Hn.LJJIL(new InterfaceC19483011Ki() { // from class: X.0ep7
                                    @Override // X.InterfaceC19483011Ki
                                    public final boolean test(Object obj) {
                                        return !Intrinsics.LJFF(obj, C1103400eos.LIZ);
                                    }
                                }).LJLIIL(1L).LJJJ(new InterfaceC1487280oo2() { // from class: X.0xXw
                                    @Override // X.InterfaceC1487280oo2
                                    public final Object apply(Object obj) {
                                        C1103390eor c1103390eor;
                                        Throwable th;
                                        AbstractC1103480ep0 abstractC1103480ep0 = (AbstractC1103480ep0) obj;
                                        if (Intrinsics.LJFF(abstractC1103480ep0, C1103470eoz.LIZ)) {
                                            C1823250xXv c1823250xXv = this.LL;
                                            C1823280xXy c1823280xXy2 = c1823280xXy;
                                            C1822490xWh c1822490xWh = c1823250xXv.LIZ;
                                            C1822510xWj c1822510xWj = new C1822510xWj(c1823280xXy2.LIZ, c1823280xXy2.LIZIZ, c1823280xXy2.LIZJ);
                                            c1822490xWh.getClass();
                                            SMBPreviewResponse.ResponseData responseDataLIZ = C1822490xWh.LIZ(c1822510xWj);
                                            if (responseDataLIZ == null) {
                                                C20441214yg.LIZIZ(C13LE.LIZ(this.LL.getClass()).LJI(), "Catch in-flight request: no cache, request from server");
                                                return this.LL.LIZIZ(c1823280xXy);
                                            }
                                            C20441214yg.LIZIZ(C13LE.LIZ(this.LL.getClass()).LJI(), "Catch in-flight request: success");
                                            return C11NZ.LJJJJZ(new C509030Jxl(new C1158720gG6(responseDataLIZ, EnumC1154670g9Z.REMOTE)));
                                        }
                                        String strLJI = C13LE.LIZ(this.LL.getClass()).LJI();
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("Catch in-flight fail: ");
                                        String message = null;
                                        if ((abstractC1103480ep0 instanceof C1103390eor) && (c1103390eor = (C1103390eor) abstractC1103480ep0) != null && (th = c1103390eor.LIZ) != null) {
                                            message = th.getMessage();
                                        }
                                        sbLIZ.append(message);
                                        C20441214yg.LIZIZ(strLJI, C2188811AlT.LIZIZ(sbLIZ));
                                        return this.LL.LIZIZ(c1823280xXy);
                                    }
                                }, false);
                            }
                            return C11NZ.LJIILL(c11k9LIZ, c098dLJJJ);
                        }
                        throw new C1954807lC();
                    }
                    return LIZ(c1823280xXy, false).LJJJ(new InterfaceC1487280oo2() { // from class: X.0xUs
                        @Override // X.InterfaceC1487280oo2
                        public final Object apply(Object obj) {
                            AbstractC509020Jxk abstractC509020Jxk = (AbstractC509020Jxk) obj;
                            if (!(abstractC509020Jxk instanceof C509040Jxm)) {
                                return C11IR.LL;
                            }
                            if (((C509040Jxm) abstractC509020Jxk).LIZ == null) {
                                C11K9 c11k9LJJJJZ = C11NZ.LJJJJZ(abstractC509020Jxk);
                                C19476011Hq c19476011HqLIZIZ = this.LL.LIZIZ(c1823280xXy);
                                C1701890uOB.LIZ(c19476011HqLIZIZ, "other is null");
                                return C11NZ.LJIILL(c11k9LJJJJZ, c19476011HqLIZIZ);
                            }
                            return C11NZ.LJJJJZ(abstractC509020Jxk);
                        }
                    }, false);
                }
                return LIZ(c1823280xXy, false);
            }
            return C11NZ.LJIILL(LIZ(c1823280xXy, true), LIZIZ(c1823280xXy));
        }
        return C11NZ.LJIILL(LIZ(c1823280xXy, false), LIZIZ(c1823280xXy));
    }

    public final C11K9 LIZ(C1823280xXy c1823280xXy, boolean z) {
        C1158720gG6 c1158720gG6 = null;
        if (!z) {
            C1822490xWh c1822490xWh = this.LIZ;
            C1822510xWj c1822510xWj = new C1822510xWj(c1823280xXy.LIZ, c1823280xXy.LIZIZ, c1823280xXy.LIZJ);
            c1822490xWh.getClass();
            SMBPreviewResponse.ResponseData responseDataLIZ = C1822490xWh.LIZ(c1822510xWj);
            if (responseDataLIZ != null) {
                c1158720gG6 = new C1158720gG6(responseDataLIZ, EnumC1154670g9Z.CACHE);
            }
        }
        return C11NZ.LJJJJZ(new C509040Jxm(c1158720gG6));
    }
}
