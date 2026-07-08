package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.prop.api.StickerPropApi;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean;

/* JADX INFO: renamed from: X.111Q, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C111Q extends C1260870iur<AbstractC666100QAu<NewFaceStickerListBean>, InterfaceC614550O8n> {
    public static final StickerPropApi LLJIJIL = (StickerPropApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.LIZ).create(StickerPropApi.class);
    public final IAVEffectService.EffectPlatformLoader LLILZIL;
    public final C19337610l4 LLJI;
    public Boolean LLILZ = Boolean.FALSE;
    public final C11NJ LLILZLL = new C11NJ();
    public InterfaceC2257101DWa LLIZ = null;
    public boolean LLIZLLLIL = false;
    public String LLJ = "";

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onSuccess() {
        T t;
        boolean zLJI = MethodIDManager.LJI(71849);
        K k = this.LLILLJJLI;
        if (k != 0 && (t = this.LL) != 0) {
            ((InterfaceC614550O8n) k).Ul1((NewFaceStickerListBean) t.getData());
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        K k = this.LLILLJJLI;
        if (k != 0) {
            ((InterfaceC614550O8n) k).Cf0(exc);
        }
    }

    public C111Q(C19575011iG c19575011iG, final boolean z) {
        this.LLILZIL = c19575011iG;
        LJIIJ(new AbstractC666100QAu<NewFaceStickerListBean>() { // from class: X.1169
            @Override // X.AbstractC666100QAu
            public final boolean checkParams(Object... objArr) {
                if (objArr != null && objArr.length == 2) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC666100QAu
            public final void handleData(NewFaceStickerListBean newFaceStickerListBean) {
                NewFaceStickerListBean newFaceStickerListBean2 = newFaceStickerListBean;
                super.handleData(newFaceStickerListBean2);
                C116B.LIZ(true);
                C111Q c111q = this.LLILLJJLI;
                if (c111q.LLIZLLLIL && newFaceStickerListBean2 != null) {
                    String str = c111q.LLJ;
                    if (z) {
                        str = str + 1;
                    }
                    if (str != null && C289350BVt.LIZ()) {
                        C116B.LIZJ.LIZLLL(str, new C116A(newFaceStickerListBean2, System.currentTimeMillis() + ((long) C116B.LIZIZ)));
                    }
                }
                this.LLILLJJLI.LLIZLLLIL = false;
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
            @Override // X.AbstractC666100QAu
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean sendRequest(java.lang.Object... r15) {
                /*
                    r14 = this;
                    r0 = 137900(0x21aac, float:1.93239E-40)
                    boolean r13 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
                    r0 = 138010(0x21b1a, float:1.93393E-40)
                    boolean r12 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
                    boolean r0 = super.sendRequest(r15)
                    r4 = 0
                    if (r0 != 0) goto L20
                    if (r12 == 0) goto L1a
                    com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
                L1a:
                    if (r13 == 0) goto L1f
                    com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
                L1f:
                    return r4
                L20:
                    X.111Q r6 = r14.LLILLJJLI
                    com.bytedance.common.utility.collection.WeakHandler r5 = r14.mHandler
                    r7 = r15[r4]
                    java.lang.String r7 = (java.lang.String) r7
                    r3 = 1
                    r0 = r15[r3]
                    java.lang.Integer r0 = (java.lang.Integer) r0
                    r0.intValue()
                    boolean r11 = r2
                    r6.getClass()
                    boolean r0 = X.C10EU.LJIIIIZZ()
                    if (r0 != 0) goto Laa
                    X.C116B.LIZLLL(r3)
                    r6.LLJ = r7
                    java.lang.String r0 = "sd_start_activity_to_request_net_duration"
                    X.C19371010qS.LIZ(r0)
                    boolean r0 = X.C289350BVt.LIZ()
                    if (r0 == 0) goto L7f
                    java.lang.String r1 = r6.LLJ
                    if (r11 == 0) goto L5d
                    java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
                    r0.append(r1)
                    r0.append(r3)
                    java.lang.String r1 = X.C2188811AlT.LIZIZ(r0)
                L5d:
                    if (r1 == 0) goto L7f
                    X.0NmG<java.lang.String, X.116A> r0 = X.C116B.LIZJ     // Catch: java.lang.Throwable -> L7b
                    java.lang.Object r10 = r0.LIZJ(r1)     // Catch: java.lang.Throwable -> L7b
                    X.116A r10 = (X.C116A) r10     // Catch: java.lang.Throwable -> L7b
                    if (r10 == 0) goto L7f
                    long r1 = r10.LIZIZ     // Catch: java.lang.Throwable -> L7b
                    long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L7b
                    int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
                    if (r0 < 0) goto L7f
                    X.C116B.LIZJ(r3)     // Catch: java.lang.Throwable -> L7b
                    com.ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean r1 = r10.LIZ     // Catch: java.lang.Throwable -> L7b
                    if (r1 == 0) goto L7f
                    goto L9f
                L7b:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                L7f:
                    r6.LLIZLLLIL = r3
                    if (r11 == 0) goto L91
                    Y.ACallableS74S1100000_29 r1 = new Y.ACallableS74S1100000_29
                    r0 = 1
                    r1.<init>(r7, r6, r0)
                    X.1BVK r0 = X.C1BVK.LIZIZ()
                    r0.LIZ(r5, r1, r4)
                    goto Laa
                L91:
                    Y.ACallableS74S1100000_29 r1 = new Y.ACallableS74S1100000_29
                    r0 = 2
                    r1.<init>(r7, r6, r0)
                    X.1BVK r0 = X.C1BVK.LIZIZ()
                    r0.LIZ(r5, r1, r4)
                    goto Laa
                L9f:
                    android.os.Message r0 = r5.obtainMessage(r4)
                    r0.obj = r1
                    r0.sendToTarget()
                    r6.LLIZLLLIL = r4
                Laa:
                    if (r12 == 0) goto Laf
                    com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
                Laf:
                    if (r13 == 0) goto Lb4
                    com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
                Lb4:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1169.sendRequest(java.lang.Object[]):boolean");
            }
        });
        this.LLJI = new C19337610l4();
    }

    public final void LJIILL(final String str, final String str2) {
        C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0oA7
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ c09aj) {
                String str3 = str;
                String str4 = str2;
                C1C7U.LIZ("StickerPropDetailPresenter@dd19.getUser$1L");
                c09aj.onNext(C0CHQ.LIZ().getAccountService().LJI(str3, str4, EnumC1254700iku.STICKER_DETAIL));
                c09aj.onComplete();
                C1C7U.LIZIZ("StickerPropDetailPresenter@dd19.getUser$1L");
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C19775112Yr(this, 4));
    }
}
