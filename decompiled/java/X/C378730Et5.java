package X;

import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerCompatModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.zhiliaoapp.musically.R;
import ge.i;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Et5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C378730Et5 extends i<C0ERC, C383570F2d, C0EZ5, C378790EtB> implements C0ERC, InterfaceC379610EuV {
    public static final C378760Et8 LLJJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public static final int LLJJJIL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final C01GW LLJJI;
    public final C378740Et6 LLJJIII;
    public final Function0<C0EZ5> LLJJIJI;
    public final Function0<C378790EtB> LLJJIJIIJIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Et8] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C378730Et5.class, "contextData", "getContextData()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/captions/format/ui/CaptionFormatPanelContext;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJIL = new Object() { // from class: X.0Et8
        };
        LLJJJIL = 8;
    }

    private final C0E48 H4() {
        return (C0E48) this.LLJJI.getValue();
    }

    public final C0ERA F4() {
        return (C0ERA) this.LLJJ.getValue(this, LLJJJ[0]);
    }

    public final void K4() {
        t5(EnumC363350EMj.ALL_LOWER);
        Activity activity = this.LLJILJILJ.mActivity;
        if (activity != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131834017);
            creativeToastBuilder.icon(R.raw.icon_tick_circle_fill);
            creativeToastBuilder.iconColorRes(R.attr.a1h);
            creativeToastBuilder.isTuxToastLegacy(true);
            C1390380mHk.LIZ(activity, 9009, creativeToastBuilder);
        }
        C0ERA c0eraF4 = F4();
        C1402610mbT.LJIIJJI(c0eraF4 != null ? c0eraF4.LJIIIIZZ() : null, "click_case_aa");
    }

    @Override // X.C0ERC
    public void LJLJI() {
        i3(AFwS234S0000000_5.get$arr$(279));
    }

    public final void O4() {
        t5(EnumC363350EMj.ALL_UPPER);
        Activity activity = this.LLJILJILJ.mActivity;
        if (activity != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131834019);
            creativeToastBuilder.icon(R.raw.icon_tick_circle_fill);
            creativeToastBuilder.iconColorRes(R.attr.a1h);
            creativeToastBuilder.isTuxToastLegacy(true);
            C1390380mHk.LIZ(activity, 9008, creativeToastBuilder);
        }
        C0ERA c0eraF4 = F4();
        C1402610mbT.LJIIJJI(c0eraF4 != null ? c0eraF4.LJIIIIZZ() : null, "click_case_AA");
    }

    public final void P4() {
        t5(EnumC363350EMj.CAPITALIZE);
        Activity activity = this.LLJILJILJ.mActivity;
        if (activity != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131834018);
            creativeToastBuilder.icon(R.raw.icon_tick_circle_fill);
            creativeToastBuilder.iconColorRes(R.attr.a1h);
            creativeToastBuilder.isTuxToastLegacy(true);
            C1390380mHk.LIZ(activity, 9010, creativeToastBuilder);
        }
        C0ERA c0eraF4 = F4();
        C1402610mbT.LJIIJJI(c0eraF4 != null ? c0eraF4.LJIIIIZZ() : null, "click_case_Aa");
    }

    public final void T4() {
        t5(EnumC363350EMj.DEFAULT);
        Activity activity = this.LLJILJILJ.mActivity;
        if (activity != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131834016);
            creativeToastBuilder.icon(R.raw.icon_tick_circle_fill);
            creativeToastBuilder.iconColorRes(R.attr.a1h);
            creativeToastBuilder.isTuxToastLegacy(true);
            C1390380mHk.LIZ(activity, 9007, creativeToastBuilder);
        }
        C0ERA c0eraF4 = F4();
        C1402610mbT.LJIIJJI(c0eraF4 != null ? c0eraF4.LJIIIIZZ() : null, "click_case_none");
    }

    public final void Z4() {
        C0ERB c0erb;
        View view;
        C19A3 c19a3 = this.LLJILJILJ;
        if ((c19a3 instanceof C0ERB) && (c0erb = (C0ERB) c19a3) != null) {
            View view2 = c0erb.mView;
            if (view2 != null && !view2.isLaidOut() && (view = c0erb.mView) != null) {
                C786410Ut5.T4(view, 0.0f);
            }
            View view3 = c0erb.mView;
            if (view3 != null) {
                if (!view3.isLaidOut() || view3.isLayoutRequested()) {
                    view3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC391530FWt(c0erb, 5));
                } else {
                    c0erb.LLLLL();
                    C214799194j c214799194j = c0erb.LLJJ;
                    if (c214799194j != null) {
                        c214799194j.LLLLIL();
                    }
                }
            }
        }
        C0E1X c0e1x = new C0E1X(C0E1V.FORMAT_CAPTION.getNameId(), null, null, null, null, 30);
        C0E48 c0e48H4 = H4();
        C350410DoV.LIZLLL(c0e48H4 != null ? c0e48H4.LLFII().LJI() : null, true, C051R.LIZIZ(c0e1x), false, true);
    }

    private final void k5() {
        C0E48 c0e48H4 = H4();
        if (c0e48H4 != null) {
            c0e48H4.Bo().LIZLLL(this.LLJJIII);
        }
    }

    private final void n5() {
        C0E55 player;
        C0E48 c0e48H4 = H4();
        if (c0e48H4 != null && (player = c0e48H4.getPlayer()) != null) {
            player.pause(false);
        }
        C0E48 c0e48H42 = H4();
        if (c0e48H42 != null) {
            c0e48H42.Bo().LIZJ(this.LLJJIII);
        }
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        Boolean boolValueOf;
        C0EJ3 c0ej3LJIIIZ;
        List<TextStickerModel> listOo1;
        super.onCreate();
        k5();
        C0ERA c0eraF4 = F4();
        if (c0eraF4 == null || (c0ej3LJIIIZ = c0eraF4.LJIIIZ()) == null || (listOo1 = c0ej3LJIIIZ.Oo1()) == null) {
            boolValueOf = null;
        } else {
            boolean z = false;
            if (!listOo1.isEmpty()) {
                Iterator<TextStickerModel> it2 = listOo1.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    TextStickerModel next = it2.next();
                    if (C1207804o0.LIZ().contains(next.getTextMotionModel().motionResId) && next.getTextMotionModel().motionEnabled == 1) {
                        z = true;
                        break;
                    }
                }
            }
            boolValueOf = Boolean.valueOf(z);
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            i3(new AwS584S0100000_5(this, 547));
        } else {
            i3(new AwS584S0100000_5(this, 548));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        n5();
    }

    @Override // X.C0ERC
    public void LJZI() {
        Z4();
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0EZ5> o2() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C378790EtB> w2() {
        return this.LLJJIJIIJIL;
    }

    private final void t5(EnumC363350EMj enumC363350EMj) {
        C0E55 player;
        C0E55 player2;
        C0EJ3 c0ej3LJIIIZ;
        List<TextStickerModel> listOo1;
        C0EJ3 c0ej3LJIIIZ2;
        C0E55 player3;
        C0E48 c0e48H4 = H4();
        if (c0e48H4 != null && (player3 = c0e48H4.getPlayer()) != null) {
            player3.pause(false);
        }
        C0ERA c0eraF4 = F4();
        if (c0eraF4 != null && (c0ej3LJIIIZ = c0eraF4.LJIIIZ()) != null && (listOo1 = c0ej3LJIIIZ.Oo1()) != null) {
            for (TextStickerModel textStickerModel : listOo1) {
                C0ERA c0eraF42 = F4();
                if (c0eraF42 != null && (c0ej3LJIIIZ2 = c0eraF42.LJIIIZ()) != null) {
                    c0ej3LJIIIZ2.RF(TextStickerModel.copy$default(textStickerModel, null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, TextStickerCompatModel.copy$default(textStickerModel.getCompatModel(), false, false, null, null, null, null, enumC363350EMj, null, null, false, null, null, null, 0, null, 0.0f, null, null, null, null, null, 2097087, null), -1, 32767, null), false);
                }
            }
        }
        C0E48 c0e48H42 = H4();
        if (c0e48H42 != null && (player = c0e48H42.getPlayer()) != null) {
            long jJh = player.Jh();
            C0E48 c0e48H43 = H4();
            if (c0e48H43 != null && (player2 = c0e48H43.getPlayer()) != null) {
                player2.LIZIZ(jJh);
            }
        }
    }

    public final void d5(boolean z) {
        String str;
        VideoPublishEditModel videoPublishEditModelLJIIIIZZ;
        C0EJ3 c0ej3LJIIIZ;
        List<TextStickerModel> listOo1;
        C0EJ3 c0ej3LJIIIZ2;
        C0ERA c0eraF4 = F4();
        if (c0eraF4 != null && (c0ej3LJIIIZ = c0eraF4.LJIIIZ()) != null && (listOo1 = c0ej3LJIIIZ.Oo1()) != null) {
            for (TextStickerModel textStickerModel : listOo1) {
                C0ERA c0eraF42 = F4();
                if (c0eraF42 != null && (c0ej3LJIIIZ2 = c0eraF42.LJIIIZ()) != null) {
                    c0ej3LJIIIZ2.RF(TextStickerModel.copy$default(textStickerModel, null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, TextStickerCompatModel.copy$default(textStickerModel.getCompatModel(), false, false, null, null, null, null, null, Boolean.valueOf(z), null, false, null, null, null, 0, null, 0.0f, null, null, null, null, null, 2097023, null), -1, 32767, null), false);
                }
            }
        }
        if (z) {
            Activity activity = this.LLJILJILJ.mActivity;
            if (activity != null) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131834026);
                creativeToastBuilder.icon(R.raw.icon_tick_circle_fill);
                creativeToastBuilder.iconColorRes(R.attr.a1h);
                creativeToastBuilder.isTuxToastLegacy(true);
                C1390380mHk.LIZ(activity, 9011, creativeToastBuilder);
            }
            str = "click_punctuation_on";
        } else {
            Activity activity2 = this.LLJILJILJ.mActivity;
            if (activity2 != null) {
                CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                creativeToastBuilder2.messageRes(2131834024);
                creativeToastBuilder2.icon(R.raw.icon_tick_circle_fill);
                creativeToastBuilder2.iconColorRes(R.attr.a1h);
                creativeToastBuilder2.isTuxToastLegacy(true);
                C1390380mHk.LIZ(activity2, 9012, creativeToastBuilder2);
            }
            str = "click_punctuation_off";
        }
        C0ERA c0eraF43 = F4();
        if (c0eraF43 != null) {
            videoPublishEditModelLJIIIIZZ = c0eraF43.LJIIIIZZ();
        } else {
            videoPublishEditModelLJIIIIZZ = null;
        }
        C1402610mbT.LJIIJJI(videoPublishEditModelLJIIIIZZ, str);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0Et6] */
    public C378730Et5(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), C0ERA.class, null);
        this.LLJJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 617));
        this.LLJJIII = new C361650EFv() { // from class: X.0Et6
            @Override // X.C361650EFv, X.InterfaceC357170DzP
            public final void LIZJ(EnumC357140DzM enumC357140DzM) {
            }

            @Override // X.InterfaceC357170DzP
            public final void LIZIZ(EnumC357140DzM enumC357140DzM, boolean z) {
                if (z) {
                    this.LIZ.i3(AFwS234S0000000_5.get$arr$(280));
                }
            }
        };
        this.LLJJIJI = new AwS549S0100000_5(this, 616);
        this.LLJJIJIIJIL = new AwS549S0100000_5(this, 618);
    }
}
