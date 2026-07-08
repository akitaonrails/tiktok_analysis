package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.multilive.model.GetUserPlaySettingsResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UserPlaySettingValue;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.01JX, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01JX {
    public static final long LJI() {
        return C954140aw8.LIZIZ();
    }

    public static final long LJII() {
        return C954140aw8.LIZJ();
    }

    public static final boolean LJIIJ() {
        return C01HE.LJ() == C01FV.AUDIENCE;
    }

    public static final User LJIIIIZZ(long j) {
        InterfaceC917640ZzG interfaceC917640ZzG;
        AbstractC928510aGn abstractC928510aGnLIZ;
        LinkListUser linkListUser;
        InterfaceC302401Fe interfaceC302401Fe;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        LinkPlayerInfo linkPlayerInfo;
        if (LinkCoreModelKt.currentUserIsAnchor()) {
            Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (!(objLJIIIZ instanceof InterfaceC302401Fe) || (interfaceC302401Fe = (InterfaceC302401Fe) objLJIIIZ) == null || (abstractC928510aGnLIZ2 = interfaceC302401Fe.LIZ()) == null || (linkPlayerInfo = (LinkPlayerInfo) abstractC928510aGnLIZ2.LJIILIIL(j)) == null) {
                return null;
            }
            return linkPlayerInfo.mUser;
        }
        Object objLJIIIZ2 = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (!(objLJIIIZ2 instanceof InterfaceC917640ZzG) || (interfaceC917640ZzG = (InterfaceC917640ZzG) objLJIIIZ2) == null || (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) == null || (linkListUser = (LinkListUser) abstractC928510aGnLIZ.LJIILIIL(j)) == null) {
            return null;
        }
        return linkListUser.user;
    }

    public static final String LJIIJJI(LiveEffect liveEffect) {
        String resourceId;
        if (liveEffect == null || (resourceId = liveEffect.getResourceId()) == null || Intrinsics.LJFF(resourceId, CardStruct.IStatusCode.DEFAULT)) {
            return "";
        }
        return resourceId;
    }

    public static final Object LIZLLL(String str, InterfaceC1364105Vn<? super List<String>> interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        LIZJ(str, false, new C5185020h(c23260099m, 28));
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public static final boolean LIZ(User user, User user2, Function1<? super User, Unit> function1) {
        Long lValueOf;
        if (!Intrinsics.LJFF(user2, user)) {
            function1.invoke(user2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("set top1UserLiveData: ");
            if (user2 != null) {
                lValueOf = Long.valueOf(user2.getId());
            } else {
                lValueOf = null;
            }
            sbLIZ.append(lValueOf);
            C20441214yg.LIZIZ("cfaUtil", C2188811AlT.LIZIZ(sbLIZ));
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(String str, String str2, Function1<? super String, Unit> function1) {
        if (!Intrinsics.LJFF(str2, str)) {
            function1.invoke(str2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("set effectId: ");
            sbLIZ.append(str2);
            C20441214yg.LIZIZ("cfaUtil", C2188811AlT.LIZIZ(sbLIZ));
            return true;
        }
        return false;
    }

    public static final void LIZJ(String str, final boolean z, final Function2 function2) {
        if (a0.LJJJIL(str)) {
            if (z) {
                C500260Jjc.LJJLIIIJILLIZJL(new C020Q(function2, (Function2<? super String, ? super LiveEffect, Unit>) str, (String) 8));
                return;
            } else {
                function2.invoke(str, null);
                return;
            }
        }
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider();
        C766720U5u.LJIIIZ(C924240a9u.LIZ().effectPanel, str, new InterfaceC760910Tt3<LiveEffect>() { // from class: X.01Ph
            @Override // X.InterfaceC760910Tt3
            public final void LIZ(String str2) {
                if (z) {
                    C500260Jjc.LJJLIIIJILLIZJL(new C020Q((Function2) function2, (Function2<? super String, ? super LiveEffect, Unit>) str2, (String) 9));
                } else {
                    function2.invoke(str2, null);
                }
            }

            @Override // X.InterfaceC760910Tt3
            public final void LIZIZ(Object obj, String str2) {
                LiveEffect liveEffect = (LiveEffect) obj;
                if (z) {
                    C500260Jjc.LJJLIIIJILLIZJL(new C020G(liveEffect, str2, function2, 2));
                } else {
                    function2.invoke(str2, liveEffect);
                }
            }
        });
    }

    public static final long LJIIIZ(GetUserPlaySettingsResponse.ResponseData responseData, String str, long j) {
        Map<String, UserPlaySettingValue> map;
        UserPlaySettingValue userPlaySettingValue;
        if (responseData != null && (map = responseData.settingsValueMap) != null && (userPlaySettingValue = map.get(str)) != null && userPlaySettingValue.fieldType == 2) {
            return userPlaySettingValue.int64Value;
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final org.json.JSONObject LJ(webcast.data.multi_guest_play.CountdownForAllContent r14, long r15, com.bytedance.android.live.base.model.user.User r17, java.util.List<java.lang.String> r18, long r19) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01JX.LJ(webcast.data.multi_guest_play.CountdownForAllContent, long, com.bytedance.android.live.base.model.user.User, java.util.List, long):org.json.JSONObject");
    }
}
