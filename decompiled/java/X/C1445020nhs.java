package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeCommonModel;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeEditModel;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nhs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1445020nhs extends AbstractC1445310niL {
    public static int LJIIIZ;
    public final C01GW<InterfaceC1660990tKD> LJ;
    public final IMCreativeEditModel LJFF;
    public final C19EG LJI;
    public final InterfaceC1445220niC LJII;
    public final List<Pair<String, Function0<Unit>>> LJIIIIZZ = new ArrayList();

    @Override // X.AbstractC1445340niO
    public final boolean LJII() {
        if (((ArrayList) this.LJIIIIZZ).isEmpty()) {
            return false;
        }
        List<Pair<String, Function0<Unit>>> list = this.LJIIIIZZ;
        ((Function0) ((Pair) ListProtector.remove(list, C1697810uHb.LJIIJ(list))).getSecond()).invoke();
        return true;
    }

    @Override // X.AbstractC1445310niL
    public final void LJIIIZ() {
        C1452370ntj.LIZ(this.LJI);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0064 A[PHI: r8
      0x0064: PHI (r8v6 java.util.List<java.lang.String>) = (r8v3 java.util.List<java.lang.String>), (r8v7 java.util.List<java.lang.String>) binds: [B:12:0x0031, B:10:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC1445310niL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ() {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1445020nhs.LJIIJ():void");
    }

    @Override // X.AbstractC2173821A5s
    public final void LIZIZ() {
        if (LJII()) {
            return;
        }
        LJFF(false);
        FragmentManager supportFragmentManager = this.LIZLLL;
        if (supportFragmentManager == null) {
            supportFragmentManager = this.LJI.getSupportFragmentManager();
        }
        if (supportFragmentManager.LJJLIIIIJ() <= 0) {
            C1452370ntj.LIZ(this.LJI);
        } else {
            supportFragmentManager.LJLLILLLL();
            this.LJII.onEvent(C1445150ni5.LIZIZ);
        }
    }

    public static String LJIIL(CreativeInfo creativeInfo) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C2298208zU.LIZIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228014Cw.SYNTHESISE, null, 12));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append('-');
        int i = LJIIIZ;
        LJIIIZ = i + 1;
        sbLIZ2.append(i);
        sbLIZ2.append("-concat-v");
        sbLIZ.append(LJIILIIL(C2188811AlT.LIZIZ(sbLIZ2)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJIILIIL(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
        Date time = Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(simpleDateFormat.format(time));
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1445340niO
    public final void LJIIIIZZ(String str) {
        for (Object obj : (ArrayList) this.LJIIIIZZ) {
            if (Intrinsics.LJFF(((Pair) obj).getFirst(), "IMEditFilterPanelVM")) {
                if (obj != null) {
                    ((ArrayList) this.LJIIIIZZ).remove(obj);
                    return;
                }
                return;
            }
        }
    }

    public final Map<String, String> LJIIJJI(CreativeModel creativeModel) {
        boolean z;
        Object obj;
        String effect_id;
        String str;
        String effect_id2;
        Effect effect;
        String str2;
        String string;
        Effect effect2;
        DMCameraModel dMCameraModel = creativeModel.initialModel.dmCameraModel;
        if (this.LJFF.photoSwapEditModel != null) {
            z = true;
        } else {
            z = false;
        }
        C13DA c13da = new C13DA();
        boolean z2 = this.LJFF.isFromAlbum;
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (z2) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c13da.put("is_shoot_upload", obj);
        IMEffectModel iMEffectModel = this.LJFF.effectModel;
        if (iMEffectModel == null || (effect2 = iMEffectModel.effect) == null || (effect_id = effect2.getEffect_id()) == null) {
            effect_id = "";
        }
        c13da.put("prop_id", effect_id);
        Long l = dMCameraModel.effectTriggerMsgSentServerTime;
        if (l != null && (string = l.toString()) != null) {
            c13da.put("effect_trigger_msg_timestamp", string);
        }
        String str4 = "photoswap";
        if (z) {
            c13da.put("enter_method", "photoswap");
        }
        String str5 = dMCameraModel.enterMethodType;
        if (str5 != null) {
            c13da.put("enter_method_type", str5);
        }
        String str6 = dMCameraModel.enterDM;
        if (str6 != null) {
            c13da.put("enter_dm", str6);
        }
        if (!z) {
            str4 = "camera";
        }
        c13da.put("dm_camera_tab", str4);
        String str7 = "chat";
        if (C1434160nQM.LIZ(creativeModel)) {
            String str8 = dMCameraModel.enterDM;
            if (str8 != null) {
                c13da.put("enter_method", str8);
            }
            IMCreativeCommonModel iMCreativeCommonModel = this.LJFF.commonModel;
            if (iMCreativeCommonModel != null && (str2 = iMCreativeCommonModel.enterFrom) != null) {
                str7 = str2;
            }
            c13da.put("enter_from", str7);
        } else if (this.LJFF.LIZ()) {
            c13da.put("enter_from", "chat");
            c13da.put("enter_method", "album_floating_layer");
        }
        String str9 = dMCameraModel.searchSessionId;
        if (str9 != null) {
            c13da.put("search_session_id", str9);
        }
        if (dMCameraModel.isFromEffectButton) {
            c13da.put("is_chat_page_icon_effect", "1");
        }
        String str10 = dMCameraModel.initialEffectId;
        if (str10 != null) {
            IMEffectModel iMEffectModel2 = this.LJFF.effectModel;
            if (iMEffectModel2 != null && (effect = iMEffectModel2.effect) != null) {
                effect_id2 = effect.getEffect_id();
            } else {
                effect_id2 = null;
            }
            if (Intrinsics.LJFF(str10, effect_id2)) {
                str3 = "1";
            }
            c13da.put("is_recommended_effect", str3);
        }
        if (creativeModel.initialModel.dmCameraModel.isStoryQuickImmersiveReply) {
            c13da.put("story_type", "story");
            IMCreativeCommonModel iMCreativeCommonModel2 = this.LJFF.commonModel;
            if (iMCreativeCommonModel2 != null && (str = iMCreativeCommonModel2.enterFrom) != null) {
                c13da.put("enter_from", str);
            }
            String str11 = creativeModel.initialModel.dmCameraModel.enterMethodDM;
            if (str11 != null) {
                c13da.put("enter_position", str11);
            }
        }
        return c13da.build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        ((java.util.ArrayList) r4.LJIIIIZZ).add(new kotlin.Pair("IMEditFilterPanelVM", r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        return;
     */
    @Override // X.AbstractC1445340niO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(java.lang.String r5, kotlin.jvm.functions.Function0<kotlin.Unit> r6) {
        /*
            r4 = this;
            java.util.List<kotlin.Pair<java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>>> r0 = r4.LJIIIIZZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r3 = r0.iterator()
        L8:
            boolean r0 = r3.hasNext()
            java.lang.String r2 = "IMEditFilterPanelVM"
            if (r0 == 0) goto L23
            java.lang.Object r1 = r3.next()
            r0 = r1
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.getFirst()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r0 == 0) goto L8
            if (r1 != 0) goto L2f
        L23:
            java.util.List<kotlin.Pair<java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>>> r1 = r4.LJIIIIZZ
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r6)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r0)
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1445020nhs.LJI(java.lang.String, kotlin.jvm.functions.Function0):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1445020nhs(C01GW<? extends InterfaceC1660990tKD> c01gw, IMCreativeEditModel iMCreativeEditModel, C19EG c19eg, InterfaceC1445220niC interfaceC1445220niC) {
        this.LJ = c01gw;
        this.LJFF = iMCreativeEditModel;
        this.LJI = c19eg;
        this.LJII = interfaceC1445220niC;
    }
}
