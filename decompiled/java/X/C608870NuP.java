package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.assem.share.quickexternalshare.QuickExternalShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NuP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C608870NuP implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    public final C704830Rkn LL;

    public C608870NuP(C704830Rkn c704830Rkn) {
        this.LL = c704830Rkn;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) {
        C19EG c19egLIZ;
        String aid;
        String aid2;
        String aid3;
        String aid4;
        String aid5;
        InterfaceC1369790lkX interfaceC1369790lkX;
        Function0<C690870R8b> function0;
        C690870R8b c690870R8bInvoke;
        VideoItemParams videoItemParams2 = videoItemParams;
        C704830Rkn c704830Rkn = this.LL;
        if (c704830Rkn != null && (function0 = c704830Rkn.LIZ) != null && (c690870R8bInvoke = function0.invoke()) != null) {
            c19egLIZ = C0O0B.LIZ(c690870R8bInvoke);
        } else {
            c19egLIZ = null;
        }
        C608590Ntx c608590Ntx = C608530Ntr.LLJJI;
        C704830Rkn c704830Rkn2 = this.LL;
        c608590Ntx.getClass();
        QuickExternalShareVM quickExternalShareVMLIZ = C608590Ntx.LIZ(c704830Rkn2);
        if (c19egLIZ != null && videoItemParams2 != null) {
            try {
                if (videoItemParams2.getAweme() != null) {
                    Set<String> set = C608890NuR.LIZ;
                    Aweme aweme = videoItemParams2.getAweme();
                    if (aweme != null) {
                        aid = aweme.getAid();
                    } else {
                        aid = null;
                    }
                    String str = "";
                    if (aid == null) {
                        aid = "";
                    }
                    if (!Intrinsics.LJFF(C608890NuR.LIZIZ(aid, "is_first_showed_cache_key"), "1")) {
                        C621180OYa.LIZIZ.LJJLIL(videoItemParams2.getAweme(), c19egLIZ, videoItemParams2.mEventType, new AwS375S0200000_9(videoItemParams2, quickExternalShareVMLIZ, 35));
                    } else {
                        Aweme aweme2 = videoItemParams2.getAweme();
                        if (aweme2 == null || (aid2 = aweme2.getAid()) == null) {
                            aid2 = "";
                        }
                        if (C608890NuR.LIZJ(aid2)) {
                            Aweme aweme3 = videoItemParams2.getAweme();
                            if (aweme3 == null || (aid3 = aweme3.getAid()) == null) {
                                aid3 = "";
                            }
                            String strLIZIZ = C608890NuR.LIZIZ(aid3, "has_showed_trigger_source");
                            Aweme aweme4 = videoItemParams2.getAweme();
                            if (aweme4 == null || (aid4 = aweme4.getAid()) == null) {
                                aid4 = "";
                            }
                            String strLIZIZ2 = C608890NuR.LIZIZ(aid4, "has_showed_channel_key");
                            if (strLIZIZ2.length() == 0 && (quickExternalShareVMLIZ == null || (interfaceC1369790lkX = quickExternalShareVMLIZ.LLILLJJLI) == null || (strLIZIZ2 = interfaceC1369790lkX.key()) == null)) {
                                strLIZIZ2 = "";
                            }
                            Aweme aweme5 = videoItemParams2.getAweme();
                            if (aweme5 == null || (aid5 = aweme5.getAid()) == null) {
                                aid5 = "";
                            }
                            String strLIZIZ3 = C608890NuR.LIZIZ(aid5, "has_showed_pitaya_trace_id_key");
                            C609010Nud c609010Nud = C609010Nud.LIZ;
                            String aid6 = videoItemParams2.getAweme().getAid();
                            if (aid6 == null) {
                                aid6 = "";
                            }
                            String authorUid = AwemeExtKt.getAuthorUid(videoItemParams2.getAweme());
                            String str2 = videoItemParams2.mEventType;
                            Aweme aweme6 = videoItemParams2.getAweme();
                            c609010Nud.getClass();
                            C609010Nud.LIZ(true, aid6, authorUid, strLIZIZ, str2, strLIZIZ2, strLIZIZ3, 1, aweme6);
                            String aid7 = videoItemParams2.getAweme().getAid();
                            if (aid7 != null) {
                                str = aid7;
                            }
                            C608890NuR.LIZ(str, "has_re_showed_cache_key", "1");
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return new C1387205bq(null);
    }
}
