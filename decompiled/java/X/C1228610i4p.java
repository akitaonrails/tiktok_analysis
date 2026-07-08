package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupFragment;
import com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupFragmentParam;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0i4p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1228610i4p {
    public static final Map<String, String> LIZ(C1228620i4q c1228620i4q) {
        String str;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair(Scene.SCENE_SERVICE, c1228620i4q.LJIILIIL);
        pairArr[1] = new Pair("creator_uid", c1228620i4q.LJIIJJI);
        if (c1228620i4q.LJIJJ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[2] = new Pair("hide_title_text", str);
        pairArr[3] = new Pair("tracing_uuid", c1228620i4q.LJI);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public static final void LIZIZ(Context context, C1228620i4q c1228620i4q) throws Exception {
        long jLongValue;
        String string;
        FragmentManager supportFragmentManager;
        float fFloatValue;
        C19EG c19egLIZIZ;
        Long lLJIILIIL = C2095008Iq.LJIILIIL(c1228620i4q.LIZIZ);
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        int iIntValue = 0;
        if (jLongValue > 0) {
            string = context.getString(2131830167);
        } else {
            string = null;
        }
        C1228660i4u c1228660i4u = new Object() { // from class: X.0i4u
        };
        FanGroupChooseGroupFragmentParam fanGroupChooseGroupFragmentParam = new FanGroupChooseGroupFragmentParam(c1228620i4q.LIZ, c1228620i4q.LIZIZ, c1228620i4q.LIZJ, c1228620i4q.LIZLLL, c1228620i4q.LJ, c1228620i4q.LJFF, c1228620i4q.LJI, c1228620i4q.LJII, c1228620i4q.LJIIIIZZ, c1228620i4q.LJIIIZ, c1228620i4q.LJIIJ, c1228620i4q.LJIIJJI, c1228620i4q.LJIIL, c1228620i4q.LJIILIIL, c1228620i4q.LJIILJJIL, c1228620i4q.LJIILL, c1228620i4q.LJIILLIIL, c1228620i4q.LJIIZILJ, c1228620i4q.LJIJ, c1228620i4q.LJIJI, c1228620i4q.LJIJJ, string);
        c1228660i4u.getClass();
        String str = FanGroupChooseGroupFragment._pnsPageId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append('-');
        sbLIZ.append(UUID.randomUUID());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ((ConcurrentHashMap) FanGroupChooseGroupFragment.LLJJI).put(strLIZIZ, fanGroupChooseGroupFragmentParam);
        boolean z = fanGroupChooseGroupFragmentParam.isFullScreen;
        if (!z && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
        } else {
            supportFragmentManager = null;
        }
        if (!z && supportFragmentManager != null) {
            FanGroupChooseGroupFragment fanGroupChooseGroupFragment = new FanGroupChooseGroupFragment();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("fan_group_choose_group_param_uuid", strLIZIZ, bundle);
            fanGroupChooseGroupFragment.setArguments(bundle);
            int iLIZLLL = C1232370iAt.LIZLLL(context);
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIJI = fanGroupChooseGroupFragment;
            c1390920mIc.LJIIIIZZ(1);
            Float f = fanGroupChooseGroupFragmentParam.panelHeightRatio;
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 0.73f;
            }
            int i = (int) (fFloatValue * iLIZLLL);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJL = i;
            tuxSheet.LLJJIJIIJIL = !fanGroupChooseGroupFragmentParam.disableBackgroundMask;
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.LLJLL = true;
            c1390920mIc.LJI(48);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            Integer numValueOf = Integer.valueOf(iIntValue);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJI = numValueOf;
            tuxSheet2.show(supportFragmentManager, "FanGroupChooseGroupFragment");
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//im/fan_group_choose_group");
        smartRouteBuildRoute.withParam("fan_group_choose_group_param_uuid", strLIZIZ);
        smartRouteBuildRoute.open();
    }

    public static final void LIZJ(final Context context, final C1228620i4q c1228620i4q) {
        int value;
        List<EnumC1219960hqs> listSingletonList;
        InterfaceC1228540i4i.LIZ.getClass();
        C1228470i4b c1228470i4bLIZIZ = C1228590i4n.LIZ().LIZIZ(c1228620i4q.LJ, c1228620i4q.LJFF, c1228620i4q.LJIILJJIL);
        Integer numLJIIJJI = C2095008Iq.LJIIJJI(c1228620i4q.LJIIJ);
        if (numLJIIJJI != null) {
            value = numLJIIJJI.intValue();
        } else {
            value = EnumC1219960hqs.UNKNOWN.getValue();
        }
        C1228650i4t c1228650i4t = c1228470i4bLIZIZ.LIZ;
        String str = c1228620i4q.LJIIIIZZ;
        if (str.length() == 0) {
            str = c1228470i4bLIZIZ.LIZ.LIZLLL;
        }
        String value2 = c1228620i4q.LJIIIZ;
        if (value2.length() == 0) {
            value2 = EnumC1228990i5R.PUBLIC_GROUP.getValue();
        }
        EnumC1228990i5R enumC1228990i5R = EnumC1228990i5R.PUBLIC_GROUP;
        String str2 = c1228620i4q.LJIIL;
        boolean z = c1228620i4q.LJIILJJIL;
        Float f = c1228620i4q.LJIILL;
        boolean z2 = c1228620i4q.LJIILLIIL;
        List<Integer> list = c1228620i4q.LJII;
        Map mapLJIIL = C2097608Jq.LJIIL(c1228470i4bLIZIZ.LIZ.LJIIIZ, LIZ(c1228620i4q));
        int value3 = EnumC1228720i50.NONE.getValue();
        int i = c1228620i4q.LJIJI;
        String str3 = c1228620i4q.LJIIZILJ;
        if (str3.length() == 0) {
            str3 = c1228620i4q.LJ;
        }
        int i2 = value;
        String str4 = str;
        String str5 = value2;
        C1228650i4t c1228650i4tLIZ = C1228650i4t.LIZ(c1228650i4t, null, null, str5, str4, i2, new C1228700i4y(value3, i, str3, new InterfaceC1228750i53() { // from class: X.0i4r
            @Override // X.InterfaceC1228750i53
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1228750i53
            public final void LIZ(C0Y8T c0y8t) throws Exception {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onCreateSuccess: convId=");
                sbLIZ.append(c0y8t.getConversationId());
                sbLIZ.append(", opening ChooseGroup");
                C2188811AlT.LIZIZ(sbLIZ);
                C1228610i4p.LIZIZ(context, c1228620i4q);
            }
        }, null, 16), false, null, mapLJIIL, z, f, z2, false, 0, 0, false, false, false, str2, list, false, false, enumC1228990i5R, -671096381, 0);
        if (value != EnumC1219960hqs.UNKNOWN.getValue()) {
            EnumC1219960hqs.Companion.getClass();
            listSingletonList = Collections.singletonList(C1219970hqt.LIZ(value));
        } else {
            listSingletonList = c1228470i4bLIZIZ.LIZIZ.LJIILLIIL;
        }
        C1228810i59 c1228810i59 = c1228470i4bLIZIZ.LIZIZ;
        String str6 = c1228620i4q.LJIIJJI;
        boolean z3 = c1228620i4q.LJIILJJIL;
        boolean z4 = c1228620i4q.LJIILLIIL;
        int i3 = c1228620i4q.LJIJI;
        String str7 = c1228620i4q.LJIIZILJ;
        if (str7.length() == 0) {
            str7 = c1228620i4q.LJ;
        }
        String str8 = c1228620i4q.LJIIIIZZ;
        String value4 = c1228620i4q.LJIIIZ;
        if (value4.length() == 0) {
            value4 = enumC1228990i5R.getValue();
        }
        C1228470i4b c1228470i4b = new C1228470i4b(c1228650i4tLIZ, C1228810i59.LIZ(c1228810i59, str6, z3, z4, value4, C2097608Jq.LJIIL(c1228470i4bLIZIZ.LIZIZ.LJIIJJI, LIZ(c1228620i4q)), i3, str7, str8, listSingletonList));
        IMGroupChatApi.LIZIZ.getClass();
        C1231470i9R c1231470i9R = new C1231470i9R("live", "live_fan_group_awareness", "schema");
        InterfaceC1228540i4i.LIZ.getClass();
        c1231470i9R.LIZLLL(context, c1228470i4b, C1228590i4n.LIZ().LIZ(context, c1228470i4b.LIZ));
    }

    public static final String LIZLLL(Uri uri, String str) {
        Object c098200Yq;
        try {
            c098200Yq = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str2 = (String) c098200Yq;
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public static final boolean LJ(Uri uri, String str, boolean z) {
        Integer numLJIIJJI = C2095008Iq.LJIIJJI(LIZLLL(uri, str));
        if (numLJIIJJI != null) {
            if (numLJIIJJI.intValue() == 1) {
                return true;
            }
            return false;
        }
        return z;
    }
}
