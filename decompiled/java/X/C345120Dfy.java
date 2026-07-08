package X;

import Y.ACListenerS117S0200000_14;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.MobileEffectTemplateInfo;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS5S1401000_26;

/* JADX INFO: renamed from: X.0Dfy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C345120Dfy {
    public static final Map LIZ(ShortVideoContext shortVideoContext, Effect effect) {
        String templateId;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("effect_id", effect.getEffectId());
        c0lab.LJ("effect_name", effect.getName());
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("enter_from", shortVideoContext.enterFrom);
        if (effect instanceof MobileEffect) {
            MobileEffect mobileEffect = (MobileEffect) effect;
            MobileEffectTemplateInfo templateInfo = mobileEffect.getTemplateInfo();
            String templateName = null;
            if (templateInfo != null) {
                templateId = templateInfo.getTemplateId();
            } else {
                templateId = null;
            }
            c0lab.LJ("template_id", templateId);
            MobileEffectTemplateInfo templateInfo2 = mobileEffect.getTemplateInfo();
            if (templateInfo2 != null) {
                templateName = templateInfo2.getTemplateName();
            }
            c0lab.LJ("template_name", templateName);
        }
        return c0lab.LIZ;
    }

    public static final void LJ(Fragment fragment, C1365870leD c1365870leD) {
        Context context = fragment.getContext();
        if (context == null) {
            return;
        }
        String strLIZ = C345280DgE.LIZ(context, c1365870leD);
        C1389910mGz c1389910mGz = new C1389910mGz(fragment);
        c1389910mGz.LJIIJ(strLIZ);
        c1389910mGz.LJ(3000L);
        c1389910mGz.LJI(R.style.y0);
        C1360890lWB c1360890lWB = c1389910mGz.LIZ;
        c1360890lWB.LIZIZ = 0;
        c1360890lWB.LIZLLL = 0;
        c1360890lWB.LJIIIIZZ = new ACListenerS117S0200000_14(c1365870leD, context, 42);
        c1389910mGz.LJIIJJI();
    }

    public static final Map<String, String> LIZIZ(int i, String str, Effect effect, ShortVideoContext shortVideoContext) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("prop_id", effect.getEffectId());
        c0lab.LJ("tab_key", str);
        c0lab.LIZ(i, "impr_position");
        c0lab.LJ("effect_source", String.valueOf(effect.getSource()));
        c0lab.LJ("shoot_tab_name", shortVideoContext.LJIJJLI());
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("enter_from", shortVideoContext.enterFrom);
        return new LinkedHashMap(c0lab.LIZ);
    }

    public static final void LIZJ(Context context, ShortVideoContext shortVideoContext, Effect effect, int i, int i2, MyEffectsViewModel myEffectsViewModel) {
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJII = false;
        c1397580mTM.LJFF(2131833765);
        c1397580mTM.LIZ(2131833764);
        C985403tE.LIZ(c1397580mTM, new C0DWV(effect, shortVideoContext, myEffectsViewModel, i, i2));
        C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
        C1391850mK7.LIZIZ(c1397510mTF, "298");
        c1397510mTF.LIZLLL();
        C1449260noi.LJ("show_mobile_effect_delete_popup", LIZ(shortVideoContext, effect));
    }

    public static final void LIZLLL(C19EG c19eg, FragmentManager fragmentManager, NewFaceStickerBean newFaceStickerBean, final ShortVideoContext shortVideoContext, final MobileEffect mobileEffect, final int i, int i2, MyEffectsViewModel myEffectsViewModel, final String str) {
        ArrayList arrayList = new ArrayList();
        if (newFaceStickerBean.isEditable) {
            C1247510iZJ c1247510iZJ = new C1247510iZJ();
            c1247510iZJ.LIZIZ(2131833783);
            c1247510iZJ.LIZ(new AwS5S1401000_26(i, c19eg, shortVideoContext, newFaceStickerBean, mobileEffect, str, 1));
            arrayList.add(c1247510iZJ);
        }
        C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
        c1247510iZJ2.LIZ = c19eg.getString(2131833761);
        c1247510iZJ2.LIZJ = 1;
        c1247510iZJ2.LIZ(new C345070Dft(i, i2, c19eg, shortVideoContext, myEffectsViewModel, mobileEffect, str));
        arrayList.add(c1247510iZJ2);
        C1390850mIV c1390850mIV = new C1390850mIV();
        c1390850mIV.LJI(arrayList);
        String str2 = newFaceStickerBean.name;
        TuxActionSheet tuxActionSheet = c1390850mIV.LIZ;
        tuxActionSheet.LLJJIJI = str2;
        tuxActionSheet.LL = new DialogInterface.OnCancelListener() { // from class: X.0Dfu
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                Map<String, String> mapLIZIZ = C345120Dfy.LIZIZ(i, str, mobileEffect, shortVideoContext);
                mapLIZIZ.put("button_name", "cancel");
                C1449260noi.LJ("prop_share_window_click", mapLIZIZ);
            }
        };
        c1390850mIV.LIZJ().show(fragmentManager, "EditAmeEffectFragment");
        C1449260noi.LJ("prop_share_window_show", LIZIZ(i, str, mobileEffect, shortVideoContext));
        C1449260noi.LJ("show_mobile_effect_delete", LIZ(shortVideoContext, mobileEffect));
    }
}
