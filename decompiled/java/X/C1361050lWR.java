package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.DanmakuCompatibleReportAndLoginViewModel;
import com.ss.android.ugc.aweme.DanmakuEntranceAbility;
import com.ss.android.ugc.aweme.core.DanmakuViewModel;
import com.ss.android.ugc.aweme.eventtrack.eventfiles.ClickAddDanmakuEvent;
import com.ss.android.ugc.aweme.eventtrack.eventfiles.ExpandDanmakuEvent;
import com.ss.android.ugc.aweme.eventtrack.eventfiles.HideDanmakuEvent;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeEntrancesControlAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.input.DanmakuInputFragment;
import java.util.Collections;

/* JADX INFO: renamed from: X.0lWR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1361050lWR {
    public static final C1361050lWR LIZ = new C1361050lWR();
    public static boolean LIZIZ;

    public static boolean LIZIZ() {
        return !C1361160lWc.LIZIZ().getBoolean("already_tried_add_danmaku", false) && C1361160lWc.LIZIZ().getInt("danmaku_active_day_count_number", 0) <= C2547409ya.LIZ;
    }

    public static void LIZJ(boolean z, Aweme aweme, String str, EnumC1361130lWZ enumC1361130lWZ, EnumC255700yp enumC255700yp) {
        C1361160lWc.LIZIZ().storeBoolean("danmaku_allow_show", z);
        int i = 5;
        if (z) {
            C1361150lWb.LIZ.getClass();
            C1361150lWb.LJI(new ExpandDanmakuEvent(), Collections.singletonList(new AnonymousClass0078(enumC1361130lWZ.getValue(), enumC255700yp.getValue(), i)), aweme, C0SXF.LJJIFFI(null, Boolean.FALSE, str));
        } else {
            C1361150lWb.LIZ.getClass();
            C1361150lWb.LJI(new HideDanmakuEvent(), Collections.singletonList(new AnonymousClass0078(enumC1361130lWZ.getValue(), enumC255700yp.getValue(), i)), aweme, C0SXF.LJJIFFI(null, Boolean.FALSE, str));
        }
        C1440005kM.LIZ(new C7836034g(z));
    }

    public static void LIZLLL(final C19EG c19eg, final DanmakuViewModel danmakuViewModel, final InterfaceC665370Q7z interfaceC665370Q7z, final EnumC1361130lWZ enumC1361130lWZ, final EnumC255700yp enumC255700yp, DanmakuCompatibleReportAndLoginViewModel danmakuCompatibleReportAndLoginViewModel) {
        final Aweme aweme;
        final String str;
        VideoItemParams item = danmakuViewModel.getItem();
        if (item != null && (aweme = item.getAweme()) != null) {
            VideoItemParams item2 = danmakuViewModel.getItem();
            if (item2 == null || (str = item2.mEventType) == null) {
                str = "";
            }
            final long currentPosition = C1483410ohn.LJLJJI().getCurrentPosition();
            if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                if (danmakuCompatibleReportAndLoginViewModel != null && enumC255700yp != EnumC255700yp.IS_NOT_LANDSCAPE) {
                    danmakuCompatibleReportAndLoginViewModel.LLILLL = true;
                    danmakuCompatibleReportAndLoginViewModel.LLILZLL = str;
                    danmakuCompatibleReportAndLoginViewModel.LLIZ = "add_danmaku";
                    C627150Oin c627150Oin = new C627150Oin();
                    C786410Ut5.LJJJI("group_id", aweme.getAid(), c627150Oin.LIZ);
                    C786410Ut5.LJJJI("author_id", AwemeExtKt.getAuthorUid(aweme), c627150Oin.LIZ);
                    C786410Ut5.LJJJI("log_pb", C735370Ssx.LJIIJJI(aweme.getAid()), c627150Oin.LIZ);
                    danmakuCompatibleReportAndLoginViewModel.LLIZLLLIL = c627150Oin.LIZ;
                    if (c19eg != null) {
                        c19eg.finish();
                        return;
                    }
                    return;
                }
                C627150Oin c627150Oin2 = new C627150Oin();
                C786410Ut5.LJJJI("group_id", aweme.getAid(), c627150Oin2.LIZ);
                C786410Ut5.LJJJI("author_id", AwemeExtKt.getAuthorUid(aweme), c627150Oin2.LIZ);
                C786410Ut5.LJJJI("log_pb", C735370Ssx.LJIIJJI(aweme.getAid()), c627150Oin2.LIZ);
                C0XPD.LIZIZ(c19eg, str, "add_danmaku", c627150Oin2.LIZ, new InterfaceC849390XTt() { // from class: X.0lWS
                    @Override // X.InterfaceC849390XTt
                    public final /* synthetic */ void LIZIZ() {
                    }

                    @Override // X.InterfaceC849390XTt
                    public final void LIZ() {
                        C1361050lWR c1361050lWR = C1361050lWR.LIZ;
                        C19EG c19eg2 = c19eg;
                        Aweme aweme2 = aweme;
                        long j = currentPosition;
                        DanmakuViewModel danmakuViewModel2 = danmakuViewModel;
                        InterfaceC665370Q7z interfaceC665370Q7z2 = interfaceC665370Q7z;
                        String str2 = str;
                        EnumC1361130lWZ enumC1361130lWZ2 = enumC1361130lWZ;
                        EnumC255700yp enumC255700yp2 = enumC255700yp;
                        c1361050lWR.getClass();
                        C1361050lWR.LIZ(c19eg2, aweme2, j, danmakuViewModel2, interfaceC665370Q7z2, str2, enumC1361130lWZ2, enumC255700yp2);
                    }
                });
                return;
            }
            LIZ(c19eg, aweme, currentPosition, danmakuViewModel, interfaceC665370Q7z, str, enumC1361130lWZ, enumC255700yp);
        }
    }

    public static void LIZ(C19EG c19eg, Aweme aweme, long j, DanmakuViewModel danmakuViewModel, InterfaceC665370Q7z interfaceC665370Q7z, String str, EnumC1361130lWZ enumC1361130lWZ, EnumC255700yp enumC255700yp) {
        boolean zLIZIZ;
        C1361150lWb.LIZ.getClass();
        C1361150lWb.LJI(new ClickAddDanmakuEvent(), Collections.singletonList(new AnonymousClass0078(enumC1361130lWZ.getValue(), enumC255700yp.getValue(), 5)), aweme, C0SXF.LJJIFFI(null, Boolean.FALSE, str));
        DanmakuEntranceAbility danmakuEntranceAbility = (DanmakuEntranceAbility) C1558520qew.LIZ(interfaceC665370Q7z, DanmakuEntranceAbility.class, null);
        if (danmakuEntranceAbility != null) {
            zLIZIZ = danmakuEntranceAbility.cO2();
        } else {
            zLIZIZ = LIZIZ();
        }
        C1361160lWc.LIZIZ().storeBoolean("already_tried_add_danmaku", true);
        if (zLIZIZ) {
            try {
                LandscapeEntrancesControlAbility landscapeEntrancesControlAbility = (LandscapeEntrancesControlAbility) C1558520qew.LIZ(interfaceC665370Q7z, LandscapeEntrancesControlAbility.class, null);
                if (landscapeEntrancesControlAbility != null) {
                    landscapeEntrancesControlAbility.nU(null);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        DanmakuInputFragment.LLJILJILJ.getClass();
        if (c19eg != null) {
            new DanmakuInputFragment(interfaceC665370Q7z, danmakuViewModel, new C1361010lWN(aweme, j, "", false, "")).show(c19eg.getSupportFragmentManager(), "DanmakuInputFragment");
        }
    }
}
