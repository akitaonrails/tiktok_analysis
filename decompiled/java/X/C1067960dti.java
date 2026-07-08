package X;

import Y.ACListenerS119S0200000_16;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.expriment.DisableAudioAnchorABSwitchConfig;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0dti, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1067960dti extends AbstractC1066890drz {
    public AnchorPanelAction LLJ;

    @Override // X.AbstractC1066890drz, X.InterfaceC1392520mLC
    public final String LJIIJ() {
        return "app_page";
    }

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        return new C1400390mXt(new AwS560S0100000_16(this, 702), new AwS560S0100000_16(this, 703), new AwS560S0100000_16(this, 704), null, null, 24);
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1067960dti();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.TTS_VOICE.getTYPE();
    }

    public final C1065100dp6 LJJIJIIJIL() {
        String logExtra;
        AnchorCommonStruct anchorCommonStruct;
        String logExtra2;
        List<AnchorCommonStruct> anchors = LJIIZILJ().getAnchors();
        if (anchors != null && (anchors.isEmpty() ^ true)) {
            logExtra2 = ((AnchorCommonStruct) ListProtector.get(LJIIZILJ().getAnchors(), 0)).getLogExtra();
        } else {
            AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
            if (anchorCommonStruct2 == null || (logExtra = anchorCommonStruct2.getLogExtra()) == null || logExtra.length() <= 0 || (anchorCommonStruct = this.LLIZ) == null) {
                return null;
            }
            logExtra2 = anchorCommonStruct.getLogExtra();
        }
        if (logExtra2 != null) {
            return new C1065100dp6(logExtra2);
        }
        return null;
    }

    public static final C1065100dp6 LJJIJIIJI(AnchorCommonStruct anchorCommonStruct) {
        return new C1065100dp6(anchorCommonStruct.getLogExtra());
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJFF(C2344009Gk c2344009Gk) {
        String strLJJIJIL;
        if (!C04UD.LIZ()) {
            AnchorCommonStruct anchorCommonStruct = this.LLIZ;
            String strLJJIJL = null;
            if (anchorCommonStruct != null) {
                strLJJIJIL = LJJIJIL(anchorCommonStruct);
            } else {
                strLJJIJIL = null;
            }
            c2344009Gk.LJIIIIZZ("audio_tool_origin_from", strLJJIJIL);
            AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
            if (anchorCommonStruct2 != null) {
                strLJJIJL = LJJIJL(anchorCommonStruct2);
            }
            c2344009Gk.LJFF("tts_voice_origin", strLJJIJL);
            LJJIIJ(c2344009Gk);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJJIJIL(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r6) {
        /*
            r5 = this;
            java.lang.String r4 = ""
            X.0dtj r0 = new X.0dtj     // Catch: java.lang.Throwable -> L68
            r0.<init>()     // Catch: java.lang.Throwable -> L68
            java.lang.reflect.Type r2 = r0.getType()     // Catch: java.lang.Throwable -> L68
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.LJIIZILJ()     // Catch: java.lang.Throwable -> L68
            com.ss.android.ugc.aweme.feed.model.ContentModel r0 = r0.getContentModel()     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L60
            com.ss.android.ugc.aweme.feed.model.StandardBusinessModel r0 = r0.standardBusinessModel     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L60
            com.ss.android.ugc.aweme.feed.model.TtsVoiceInfo r0 = r0.getTtsVoiceInfo()     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L60
            java.lang.String r1 = r0.ttsVoiceAttrString     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L60
            com.ss.android.ugc.aweme.utils.GsonProvider r0 = X.C7740030o.LIZ()     // Catch: java.lang.Throwable -> L68
            com.google.gson.Gson r0 = r0.getGson()     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.LJIIIIZZ(r1, r2)     // Catch: java.lang.Throwable -> L68
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L60
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L68
        L37:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L62
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L68
            com.ss.android.ugc.aweme.feed.model.TtsVoiceAttr r2 = (com.ss.android.ugc.aweme.feed.model.TtsVoiceAttr) r2     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = r2.effectId     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L57
            X.0dp6 r0 = LJJIJIIJI(r6)     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = r0.LIZ()     // Catch: java.lang.Throwable -> L68
            boolean r1 = r1.equals(r0)     // Catch: java.lang.Throwable -> L68
            r0 = 1
            if (r1 != r0) goto L57
            goto L58
        L57:
            r0 = 0
        L58:
            if (r0 == 0) goto L37
            java.lang.String r0 = r2.createSource     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L5f
            return r0
        L5f:
            return r4
        L60:
            r0 = 0
            goto L64
        L62:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L68
        L64:
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L68
            return r4
        L68:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1067960dti.LJJIJIL(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJJIJL(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r6) {
        /*
            r5 = this;
            java.lang.String r4 = ""
            X.0dtk r0 = new X.0dtk     // Catch: java.lang.Throwable -> L68
            r0.<init>()     // Catch: java.lang.Throwable -> L68
            java.lang.reflect.Type r2 = r0.getType()     // Catch: java.lang.Throwable -> L68
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.LJIIZILJ()     // Catch: java.lang.Throwable -> L68
            com.ss.android.ugc.aweme.feed.model.ContentModel r0 = r0.getContentModel()     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L60
            com.ss.android.ugc.aweme.feed.model.StandardBusinessModel r0 = r0.standardBusinessModel     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L60
            com.ss.android.ugc.aweme.feed.model.TtsVoiceInfo r0 = r0.getTtsVoiceInfo()     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L60
            java.lang.String r1 = r0.ttsVoiceAttrString     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L60
            com.ss.android.ugc.aweme.utils.GsonProvider r0 = X.C7740030o.LIZ()     // Catch: java.lang.Throwable -> L68
            com.google.gson.Gson r0 = r0.getGson()     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.LJIIIIZZ(r1, r2)     // Catch: java.lang.Throwable -> L68
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L60
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L68
        L37:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L62
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L68
            com.ss.android.ugc.aweme.feed.model.TtsVoiceAttr r2 = (com.ss.android.ugc.aweme.feed.model.TtsVoiceAttr) r2     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = r2.effectId     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L57
            X.0dp6 r0 = LJJIJIIJI(r6)     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = r0.LIZ()     // Catch: java.lang.Throwable -> L68
            boolean r1 = r1.equals(r0)     // Catch: java.lang.Throwable -> L68
            r0 = 1
            if (r1 != r0) goto L57
            goto L58
        L57:
            r0 = 0
        L58:
            if (r0 == 0) goto L37
            java.lang.String r0 = r2.ttsVoiceOrigin     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L5f
            return r0
        L5f:
            return r4
        L60:
            r0 = 0
            goto L64
        L62:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L68
        L64:
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L68
            return r4
        L68:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1067960dti.LJJIJL(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct):java.lang.String");
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        boolean z;
        List<AnchorPanelAction> actions;
        List<AnchorPanelAction> actions2;
        if (((DisableAudioAnchorABSwitchConfig) C1067950dth.LIZIZ.getValue()).disableTTS) {
            ArrayList arrayList = new ArrayList();
            for (AnchorCommonStruct anchorCommonStruct : list) {
                if (anchorCommonStruct.getType() == type()) {
                    arrayList.add(anchorCommonStruct);
                }
            }
            list.removeAll(arrayList);
            return EnumC1050190dR3.NOT_FOUND;
        }
        if (((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getAccountType() == 3) {
            z = true;
        } else {
            z = false;
        }
        AnchorPanelAction anchorPanelAction = null;
        if (z && !C2353809Ke.LIZ) {
            ArrayList arrayList2 = new ArrayList();
            for (AnchorCommonStruct anchorCommonStruct2 : list) {
                AnchorCommonStruct anchorCommonStruct3 = anchorCommonStruct2;
                if (anchorCommonStruct3.getType() == type() && (actions2 = anchorCommonStruct3.getActions()) != null) {
                    Iterator<AnchorPanelAction> it2 = actions2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            AnchorPanelAction next = it2.next();
                            if (next.getActionType() == 1) {
                                if (next != null) {
                                    arrayList2.add(anchorCommonStruct2);
                                }
                            }
                        }
                    }
                }
            }
            list.removeAll(arrayList2);
            return EnumC1050190dR3.NOT_FOUND;
        }
        ArrayList arrayList3 = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct4 : list) {
            AnchorCommonStruct anchorCommonStruct5 = anchorCommonStruct4;
            if (anchorCommonStruct5.getType() == type() && (actions = anchorCommonStruct5.getActions()) != null) {
                Iterator<AnchorPanelAction> it3 = actions.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        AnchorPanelAction next2 = it3.next();
                        if (next2.getActionType() == 1) {
                            if (next2 != null) {
                                arrayList3.add(anchorCommonStruct4);
                            }
                        }
                    }
                }
            }
        }
        if (arrayList3.size() == 0) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct6 = (AnchorCommonStruct) C13LP.LJJJJZI(arrayList3);
        LJIILIIL(anchorCommonStruct6);
        list.remove(anchorCommonStruct6);
        List<AnchorPanelAction> actions3 = anchorCommonStruct6.getActions();
        if (actions3 != null) {
            Iterator<AnchorPanelAction> it4 = actions3.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                AnchorPanelAction next3 = it4.next();
                if (next3.getActionType() == 1) {
                    anchorPanelAction = next3;
                    break;
                }
            }
            anchorPanelAction = anchorPanelAction;
        }
        this.LLJ = anchorPanelAction;
        this.LLIZ = anchorCommonStruct6;
        if (arrayList3.size() > 1) {
            return EnumC1050190dR3.PROCEED;
        }
        return EnumC1050190dR3.DONE;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        String strLJJIJIL;
        if (!C04UD.LIZ()) {
            AnchorCommonStruct anchorCommonStruct = this.LLIZ;
            String strLJJIJL = null;
            if (anchorCommonStruct != null) {
                strLJJIJIL = LJJIJIL(anchorCommonStruct);
            } else {
                strLJJIJIL = null;
            }
            c2344009Gk.getClass();
            c2344009Gk.LJIIIIZZ("audio_tool_origin_from", strLJJIJIL);
            AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
            if (anchorCommonStruct2 != null) {
                strLJJIJL = LJJIJL(anchorCommonStruct2);
            }
            c2344009Gk.LJFF("tts_voice_origin", strLJJIJL);
            LJJIIJZLJL(c2344009Gk);
        }
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        String strLIZ;
        String keyword;
        String strLJ;
        String strLIZ2;
        String strLIZIZ;
        String strLIZ3;
        String strLJJIJIL;
        String strLJJIJL;
        String strLJJIJIL2 = null;
        if (!C04UD.LIZ()) {
            AnchorCommonStruct anchorCommonStruct = this.LLIZ;
            if (anchorCommonStruct != null) {
                strLIZ3 = LJJIJIIJI(anchorCommonStruct).LIZ();
            } else {
                strLIZ3 = null;
            }
            c2344009Gk.getClass();
            c2344009Gk.LJIIIIZZ("tone_list", strLIZ3);
            AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
            if (anchorCommonStruct2 != null) {
                strLJJIJIL = LJJIJIL(anchorCommonStruct2);
            } else {
                strLJJIJIL = null;
            }
            c2344009Gk.LJIIIIZZ("audio_tool_origin_from", strLJJIJIL);
            AnchorCommonStruct anchorCommonStruct3 = this.LLIZ;
            if (anchorCommonStruct3 != null) {
                strLJJIJL = LJJIJL(anchorCommonStruct3);
            } else {
                strLJJIJL = null;
            }
            c2344009Gk.LJFF("tts_voice_origin", strLJJIJL);
            LJJII(c2344009Gk, true, true);
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(LJIILJJIL(), "//ttsvoice/info");
        smartRouteBuildRoute.withParam("anchor_type", "tts");
        AnchorCommonStruct anchorCommonStruct4 = this.LLIZ;
        if (anchorCommonStruct4 != null) {
            strLIZ = LJJIJIIJI(anchorCommonStruct4).LIZ();
        } else {
            strLIZ = null;
        }
        smartRouteBuildRoute.withParam("voice_id", strLIZ);
        AnchorCommonStruct anchorCommonStruct5 = this.LLIZ;
        if (anchorCommonStruct5 == null || (keyword = anchorCommonStruct5.getKeyword()) == null) {
            keyword = "";
        }
        smartRouteBuildRoute.withParam("anchor_name", keyword);
        C1065100dp6 c1065100dp6LJJIJIIJIL = LJJIJIIJIL();
        if (c1065100dp6LJJIJIIJIL != null) {
            strLJ = c1065100dp6LJJIJIIJIL.LJ();
        } else {
            strLJ = null;
        }
        smartRouteBuildRoute.withParam("main_anchor_type", strLJ);
        C1065100dp6 c1065100dp6LJJIJIIJIL2 = LJJIJIIJIL();
        if (c1065100dp6LJJIJIIJIL2 != null) {
            strLIZ2 = c1065100dp6LJJIJIIJIL2.LIZ();
        } else {
            strLIZ2 = null;
        }
        smartRouteBuildRoute.withParam("main_anchor_id", strLIZ2);
        C1065100dp6 c1065100dp6LJJIJIIJIL3 = LJJIJIIJIL();
        if (c1065100dp6LJJIJIIJIL3 != null) {
            strLIZIZ = c1065100dp6LJJIJIIJIL3.LIZIZ();
        } else {
            strLIZIZ = null;
        }
        smartRouteBuildRoute.withParam("main_anchor_name", strLIZIZ);
        smartRouteBuildRoute.withParam("music_model", LJIIZILJ().getMusic());
        AnchorCommonStruct anchorCommonStruct6 = this.LLIZ;
        if (anchorCommonStruct6 != null) {
            strLJJIJIL2 = LJJIJIL(anchorCommonStruct6);
        }
        smartRouteBuildRoute.withParam("audio_tool_origin_from", strLJJIJIL2);
        smartRouteBuildRoute.open();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final View LJJJJIZL(ViewGroup viewGroup, Dialog dialog, C2344009Gk c2344009Gk, int i) {
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        UrlModel icon = null;
        if (anchorCommonStruct == null) {
            return null;
        }
        C1394730mOl c1394730mOlLIZ = C1066980ds8.LIZ(viewGroup.getContext());
        UrlModel thumbnail = anchorCommonStruct.getThumbnail();
        if (thumbnail != null) {
            c1394730mOlLIZ.setIcon(thumbnail);
        }
        c1394730mOlLIZ.setTitle(LIZLLL());
        c1394730mOlLIZ.setSubTitle(anchorCommonStruct.getDescription());
        C786410Ut5.ca(c1394730mOlLIZ, new ACListenerS119S0200000_16(this, c2344009Gk, 19));
        AnchorPanelAction anchorPanelAction = this.LLJ;
        if (anchorPanelAction != null) {
            icon = anchorPanelAction.getIcon();
        }
        c1394730mOlLIZ.setButtonIcon(icon);
        c1394730mOlLIZ.setButtonOnClickListener(new AwS595S0100000_16(this, c2344009Gk, 234));
        viewGroup.addView(c1394730mOlLIZ);
        return c1394730mOlLIZ;
    }
}
