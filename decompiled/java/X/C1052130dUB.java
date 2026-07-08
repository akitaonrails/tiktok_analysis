package X;

import Y.ARunnableS75S0200000_6;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.music.model.TicketMasterAnchorExtra;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0dUB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1052130dUB extends AbstractC707180Roa {
    public final TuxTextView LLILZ;
    public final TuxTextView LLILZIL;
    public final SmartImageView LLILZLL;
    public final LinearLayout LLIZ;
    public boolean LLIZLLLIL;
    public long LLJ;
    public InterfaceC1392640mLO LLJI;
    public AnchorCommonStruct LLJIJIL;
    public TicketMasterAnchorExtra LLJILJIL;
    public C2344009Gk LLJILJILJ;

    @Override // X.AbstractC707180Roa
    public final void LJIIIZ() {
        TuxTextView tuxTextView;
        CharSequence text;
        String strLLIIJI;
        Map<String, String> mapLJ;
        String strCf;
        this.LLILLL = true;
        if (this.LLIZLLLIL || (tuxTextView = this.LLILZIL) == null || (text = tuxTextView.getText()) == null || text.length() <= 0) {
            return;
        }
        this.LLIZLLLIL = true;
        LinearLayout linearLayout = this.LLIZ;
        if (linearLayout != null) {
            ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(linearLayout, new ARunnableS75S0200000_6(linearLayout, this, 69));
        }
        InterfaceC1392640mLO interfaceC1392640mLO = this.LLJI;
        String str = "";
        if (interfaceC1392640mLO == null || (strLLIIJI = interfaceC1392640mLO.LLIIJI()) == null) {
            strLLIIJI = "";
        }
        if (strLLIIJI.length() == 0) {
            strLLIIJI = "video_anchor";
        }
        C2344009Gk originalMobParam = getOriginalMobParam();
        C2344009Gk c2344009Gk = this.LLJILJILJ;
        if (c2344009Gk == null || (mapLJ = c2344009Gk.LIZ) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        originalMobParam.LJI(new HashMap(mapLJ));
        InterfaceC1392640mLO interfaceC1392640mLO2 = this.LLJI;
        if (interfaceC1392640mLO2 != null && (strCf = interfaceC1392640mLO2.Cf()) != null) {
            str = strCf;
        }
        originalMobParam.LJIIIIZZ("enter_from", str);
        originalMobParam.LJIIIIZZ("enter_method", strLLIIJI);
        C20684815ws.LJIILLIIL("multi_anchor_entrance_expand", originalMobParam.LIZ);
    }

    private final C2344009Gk getOriginalMobParam() {
        String authorUid;
        Aweme awemeLJJLIIIJJIZ;
        String aid;
        Aweme awemeLJJLIIIJJIZ2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        InterfaceC1392640mLO interfaceC1392640mLO = this.LLJI;
        String str = "";
        if (interfaceC1392640mLO == null || (awemeLJJLIIIJJIZ2 = interfaceC1392640mLO.LJJLIIIJJIZ()) == null || (authorUid = AwemeExtKt.getAuthorUid(awemeLJJLIIIJJIZ2)) == null) {
            authorUid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        InterfaceC1392640mLO interfaceC1392640mLO2 = this.LLJI;
        if (interfaceC1392640mLO2 != null && (awemeLJJLIIIJJIZ = interfaceC1392640mLO2.LJJLIIIJJIZ()) != null && (aid = awemeLJJLIIIJJIZ.getAid()) != null) {
            str = aid;
        }
        c2344009Gk.LJIIIIZZ("group_id", str);
        return c2344009Gk;
    }

    @Override // X.InterfaceC713230RyL
    public final void LIZ() {
        C339190DRl.LIZIZ(this.LLILZIL);
        this.LLIZLLLIL = false;
    }

    public C1052130dUB(Context context) {
        int i;
        super(context);
        View viewSd = C786410Ut5.Sd(R.layout.bau, C786410Ut5.ne(context), this);
        C384050F3z c384050F3z = new C384050F3z();
        if (C1865950yen.LIZ()) {
            i = R.attr.il;
        } else if (C1865950yen.LIZIZ()) {
            i = R.attr.im;
        } else if (C722510SVt.LIZIZ()) {
            i = R.attr.ze;
        } else {
            i = R.attr.bt;
        }
        c384050F3z.LIZIZ = Integer.valueOf(i);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
        viewSd.setBackground(c384050F3z.LIZ(context));
        this.LLIZ = (LinearLayout) findViewById(R.id.nj4);
        this.LLILZ = (TuxTextView) findViewById(R.id.tv_title);
        this.LLILZLL = (SmartImageView) findViewById(R.id.lkw);
        this.LLILZIL = (TuxTextView) findViewById(R.id.tv_sub_title);
    }

    @Override // X.AbstractC707180Roa
    public final boolean LIZJ(C2344009Gk c2344009Gk) {
        this.LLJILJILJ = c2344009Gk;
        return true;
    }

    public final void LJIILIIL(C2344009Gk c2344009Gk) {
        Activity activityLIZIZ;
        AnchorCommonStruct anchorCommonStruct;
        String strCf;
        String strLLIIJI;
        String authorUid;
        String aid;
        String authorUid2;
        String aid2;
        String strCf2;
        String aid3;
        String strCf3;
        String strCf4;
        Aweme awemeLJJLIIIJJIZ;
        Aweme awemeLJJLIIIJJIZ2;
        Aweme awemeLJJLIIIJJIZ3;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LLJI;
        if (interfaceC1392640mLO != null && (activityLIZIZ = interfaceC1392640mLO.LIZIZ()) != null && (anchorCommonStruct = this.LLJIJIL) != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activityLIZIZ, anchorCommonStruct.getSchema());
            InterfaceC1392640mLO interfaceC1392640mLO2 = this.LLJI;
            Aweme awemeLJJLIIIJJIZ4 = null;
            if (interfaceC1392640mLO2 != null) {
                strCf = interfaceC1392640mLO2.Cf();
            } else {
                strCf = null;
            }
            InterfaceC1392640mLO interfaceC1392640mLO3 = this.LLJI;
            if (interfaceC1392640mLO3 != null) {
                awemeLJJLIIIJJIZ4 = interfaceC1392640mLO3.LJJLIIIJJIZ();
            }
            InterfaceC1392640mLO interfaceC1392640mLO4 = this.LLJI;
            String str = "";
            if (interfaceC1392640mLO4 == null || (strLLIIJI = interfaceC1392640mLO4.LLIIJI()) == null) {
                strLLIIJI = "";
            }
            if (strLLIIJI.length() == 0) {
                strLLIIJI = "video_anchor";
            }
            if (strCf == null) {
                strCf = "";
            }
            c2344009Gk.LJIIIIZZ("enter_from", strCf);
            c2344009Gk.LJIIIIZZ("enter_method", strLLIIJI);
            if (awemeLJJLIIIJJIZ4 == null || (authorUid = AwemeExtKt.getAuthorUid(awemeLJJLIIIJJIZ4)) == null) {
                authorUid = "";
            }
            c2344009Gk.LJIIIIZZ("author_id", authorUid);
            if (awemeLJJLIIIJJIZ4 == null || (aid = awemeLJJLIIIJJIZ4.getAid()) == null) {
                aid = "";
            }
            c2344009Gk.LJIIIIZZ("group_id", aid);
            c2344009Gk.LJIIIIZZ("music_id", C735370Ssx.LJIILIIL(awemeLJJLIIIJJIZ4));
            smartRouteBuildRoute.withParam("anchor_event_map", (HashMap) c2344009Gk.LIZ);
            InterfaceC1392640mLO interfaceC1392640mLO5 = this.LLJI;
            if (interfaceC1392640mLO5 == null || (awemeLJJLIIIJJIZ3 = interfaceC1392640mLO5.LJJLIIIJJIZ()) == null || (authorUid2 = AwemeExtKt.getAuthorUid(awemeLJJLIIIJJIZ3)) == null) {
                authorUid2 = "";
            }
            smartRouteBuildRoute.withParam("author_id", authorUid2);
            InterfaceC1392640mLO interfaceC1392640mLO6 = this.LLJI;
            if (interfaceC1392640mLO6 == null || (awemeLJJLIIIJJIZ2 = interfaceC1392640mLO6.LJJLIIIJJIZ()) == null || (aid2 = awemeLJJLIIIJJIZ2.getAid()) == null) {
                aid2 = "";
            }
            smartRouteBuildRoute.withParam("group_id", aid2);
            smartRouteBuildRoute.withParam("anchor_id", anchorCommonStruct.getId());
            InterfaceC1392640mLO interfaceC1392640mLO7 = this.LLJI;
            if (interfaceC1392640mLO7 == null || (strCf2 = interfaceC1392640mLO7.Cf()) == null) {
                strCf2 = "";
            }
            smartRouteBuildRoute.withParam("enter_from", strCf2);
            InterfaceC1392640mLO interfaceC1392640mLO8 = this.LLJI;
            if (interfaceC1392640mLO8 == null || (awemeLJJLIIIJJIZ = interfaceC1392640mLO8.LJJLIIIJJIZ()) == null || (aid3 = awemeLJJLIIIJJIZ.getAid()) == null) {
                aid3 = "";
            }
            smartRouteBuildRoute.withParam("from_group_id", aid3);
            InterfaceC1392640mLO interfaceC1392640mLO9 = this.LLJI;
            if (interfaceC1392640mLO9 == null || (strCf3 = interfaceC1392640mLO9.Cf()) == null) {
                strCf3 = "";
            }
            smartRouteBuildRoute.withParam("previous_page", strCf3);
            InterfaceC1392640mLO interfaceC1392640mLO10 = this.LLJI;
            if (interfaceC1392640mLO10 != null && (strCf4 = interfaceC1392640mLO10.Cf()) != null) {
                str = strCf4;
            }
            smartRouteBuildRoute.withParam("detail_aweme_from", str);
            smartRouteBuildRoute.withParam("anchor_subtype", anchorCommonStruct.subType());
            smartRouteBuildRoute.withParam("anchor_click_time", SystemClock.elapsedRealtime());
            smartRouteBuildRoute.open();
        }
    }

    @C14EU
    public final void onWebViewFinish(C585740MyC c585740MyC) {
        String strLLIIJI;
        Map<String, String> mapLJ;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LLJI;
        if (interfaceC1392640mLO == null || (strLLIIJI = interfaceC1392640mLO.LLIIJI()) == null) {
            strLLIIJI = "";
        }
        if (strLLIIJI.length() == 0) {
            strLLIIJI = "video_anchor";
        }
        C2344009Gk originalMobParam = getOriginalMobParam();
        C2344009Gk c2344009Gk = this.LLJILJILJ;
        if (c2344009Gk == null || (mapLJ = c2344009Gk.LIZ) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        originalMobParam.LJI(new HashMap(mapLJ));
        originalMobParam.LJIIIIZZ("enter_method", strLLIIJI);
        originalMobParam.LIZLLL(c585740MyC.LIZ, "duration");
        C20684815ws.LJIILLIIL("multi_anchor_stay_time", originalMobParam.LIZ);
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.InterfaceC713230RyL
    public final void LJ(C2344009Gk c2344009Gk, Function1<? super Boolean, Unit> function1) {
        Activity activityLIZIZ;
        AnchorCommonStruct anchorCommonStruct;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.LLJ > 300) {
            this.LLJ = jElapsedRealtime;
            this.LLJILJILJ = c2344009Gk;
            EventBus.LIZLLL().LJIJJ(this);
            if (C1052150dUD.LIZ()) {
                LJIILIIL(c2344009Gk);
                return;
            }
            InterfaceC1392640mLO interfaceC1392640mLO = this.LLJI;
            if (interfaceC1392640mLO == null || (activityLIZIZ = interfaceC1392640mLO.LIZIZ()) == null || (anchorCommonStruct = this.LLJIJIL) == null) {
                return;
            }
            try {
                C786410Ut5.Y3(activityLIZIZ.getPackageManager(), "com.ticketmaster.mobile.android.na", 0);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setPackage("com.ticketmaster.mobile.android.na");
                if (C123100dR.LIZ(anchorCommonStruct.getUniversalLink())) {
                    intent.setData(UriProtector.parse(anchorCommonStruct.getUniversalLink()));
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityLIZIZ, intent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent, activityLIZIZ);
                    C2204961BRm.LJIILLIIL(activityLIZIZ, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpuA3SFFktabnE7a7JF/WrqVW4R5jio6dWRpwdx/lFztCi9vQjgQMacMPeg=", null));
                    return;
                }
                if (C123100dR.LIZ(anchorCommonStruct.getDeepLink())) {
                    intent.setData(UriProtector.parse(anchorCommonStruct.getDeepLink()));
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityLIZIZ, intent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent, activityLIZIZ);
                    C2204961BRm.LJIILLIIL(activityLIZIZ, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpuA3SFFktabnE7a7JF/WrqVW4R5jio6dWRpwdx/lFztCi9vQjgQMacMPeg=", null));
                    return;
                }
                LJIILIIL(c2344009Gk);
            } catch (PackageManager.NameNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILIIL(c2344009Gk);
            }
        }
    }

    @Override // X.InterfaceC713230RyL
    public final void LJIIIIZZ(AnchorCommonStruct anchorCommonStruct, InterfaceC1392640mLO interfaceC1392640mLO, int i, Function0 function0) {
        Object objLJII;
        String keyword;
        this.LLJI = interfaceC1392640mLO;
        this.LLJIJIL = anchorCommonStruct;
        C01GW c01gw = C292801Bm.LIZ;
        String str = null;
        try {
            objLJII = ((Gson) C292801Bm.LIZ.getValue()).LJII(anchorCommonStruct.getExtra(), TicketMasterAnchorExtra.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            objLJII = null;
        }
        this.LLJILJIL = (TicketMasterAnchorExtra) objLJII;
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            AnchorCommonStruct anchorCommonStruct2 = this.LLJIJIL;
            if (anchorCommonStruct2 != null) {
                keyword = anchorCommonStruct2.getKeyword();
            } else {
                keyword = null;
            }
            tuxTextView.setText(keyword);
        }
        TuxTextView tuxTextView2 = this.LLILZIL;
        if (tuxTextView2 != null) {
            TicketMasterAnchorExtra ticketMasterAnchorExtra = this.LLJILJIL;
            if (ticketMasterAnchorExtra != null) {
                str = ticketMasterAnchorExtra.subTitle;
            }
            tuxTextView2.setText(str);
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(anchorCommonStruct.getIcon()));
        c1331670kl3LJIIIIZZ.LJJ(this.LLILZLL);
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        if (!interfaceC1392640mLO.LJIIIIZZ() && !C715400S4k.LIZIZ()) {
            C715390S4j.LIZ(this);
        }
    }
}
