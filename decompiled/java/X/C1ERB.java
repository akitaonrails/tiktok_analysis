package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.preview.PreviewImageDialogFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.PreviewEnterFpsOptSetting;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdk.subscribe.model.invite.SubEnable;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostPgcSubsService;
import com.google.gson.n;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS158S0400000_31;

/* JADX INFO: renamed from: X.1ERB, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1ERB extends C09AY implements Function0<C490490JLj> {
    public C1ERB() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0JLj] */
    @Override // kotlin.jvm.functions.Function0
    public final C490490JLj invoke() {
        return new InterfaceC493540JXc() { // from class: X.0JLj
            @Override // X.InterfaceC493540JXc
            public final C492420JSu LIZIZ() {
                return new C492420JSu("creator_tools_page");
            }

            @Override // X.InterfaceC493540JXc
            public final void LIZJ(C523330Kfj c523330Kfj) {
                PreviewImageDialogFragment previewImageDialogFragment = new PreviewImageDialogFragment();
                ((ArrayList) previewImageDialogFragment.LLILZLL).clear();
                ((ArrayList) previewImageDialogFragment.LLILZLL).addAll(c523330Kfj.LIZIZ);
                previewImageDialogFragment.LLIZ = c523330Kfj;
                FragmentManager fragmentManager = c523330Kfj.LIZ;
                if (fragmentManager != null) {
                    previewImageDialogFragment.show(fragmentManager, "PreviewImageDialogFragment");
                }
            }

            @Override // X.InterfaceC493540JXc
            public final void LIZ(String str, final AwS158S0400000_31 awS158S0400000_31) {
                C11NZ c11nzLJJJJZI;
                C11NZ<n> pgcSubscribeInfo;
                C11NZ<n> pgcSubscribeInfo2;
                InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
                IHostPgcSubsService iHostPgcSubsService = (IHostPgcSubsService) C1161920gLG.LIZJ(IHostPgcSubsService.class);
                if (PreviewEnterFpsOptSetting.INSTANCE.enable()) {
                    if (iHostPgcSubsService == null || (pgcSubscribeInfo2 = iHostPgcSubsService.getPgcSubscribeInfo(true, currentUser.getSecUid(), true, str, 0)) == null || (c11nzLJJJJZI = pgcSubscribeInfo2.LJL(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0JKs
                        @Override // X.InterfaceC1487280oo2
                        public final Object apply(Object obj) {
                            C490290JKp.LIZ.getClass();
                            return C490290JKp.LIZ((n) obj);
                        }
                    }).LJJJLZIJ(C1701940uOG.LIZIZ())) == null) {
                        C480460Ism.LIZ().getClass();
                        c11nzLJJJJZI = C510380Jzw.LJIILJJIL(((SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class)).getSubscribeInfo(true, currentUser.getSecUid(), true, str, 0).LJL(C11S5.LIZ()), EnumC510330Jzr.SUBINFO, str, null, C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0JKq
                            @Override // X.InterfaceC1487280oo2
                            public final Object apply(Object obj) {
                                C490290JKp c490290JKp = C490290JKp.LIZ;
                                n nVar = (n) ((BaseResponse) obj).data;
                                c490290JKp.getClass();
                                return C490290JKp.LIZ(nVar);
                            }
                        }).LJJJLZIJ(C1701940uOG.LIZIZ());
                    }
                } else if (iHostPgcSubsService == null || (pgcSubscribeInfo = iHostPgcSubsService.getPgcSubscribeInfo(true, currentUser.getSecUid(), true, str, 0)) == null || (c11nzLJJJJZI = pgcSubscribeInfo.LJIILIIL(new C0UO0()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0JKt
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        C490290JKp.LIZ.getClass();
                        return C490290JKp.LIZ((n) obj);
                    }
                })) == null) {
                    C480460Ism.LIZ().getClass();
                    c11nzLJJJJZI = C510380Jzw.LJIILJJIL(((SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class)).getSubscribeInfo(true, currentUser.getSecUid(), true, str, 0).LJIILIIL(new C0UO0()), EnumC510330Jzr.SUBINFO, str, null, C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0JKr
                        @Override // X.InterfaceC1487280oo2
                        public final Object apply(Object obj) {
                            C490290JKp c490290JKp = C490290JKp.LIZ;
                            n nVar = (n) ((BaseResponse) obj).data;
                            c490290JKp.getClass();
                            return C490290JKp.LIZ(nVar);
                        }
                    });
                }
                c11nzLJJJJZI.LJJLJLI(new C09JN() { // from class: X.0JLk
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("LiveSdkSubscriptionOuterService@ca38.trySubscribeActionIfPermitted$1");
                        SubEnable subEnable = ((GetSubInfoResponse) obj).subEnable;
                        if (subEnable != null && subEnable.canEnable) {
                            awS158S0400000_31.invoke();
                        } else {
                            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131844217));
                        }
                        C1C7U.LIZIZ("LiveSdkSubscriptionOuterService@ca38.trySubscribeActionIfPermitted$1");
                    }
                });
            }
        };
    }
}
