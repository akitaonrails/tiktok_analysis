package Y;

import X.AbstractC19484711Kz;
import X.AbstractC938650aX9;
import X.C09JN;
import X.C11NZ;
import X.C12ES;
import X.C13BV;
import X.C13LP;
import X.C1533950q1J;
import X.C15438062q;
import X.C19487111Lx;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2262071DgL;
import X.C480460Ism;
import X.C751910TeX;
import X.C786410Ut5;
import X.C916750Zxp;
import X.C917840Zza;
import X.C918130a03;
import X.C930540aK4;
import X.C937310aUz;
import X.C940120aZW;
import X.C940990aav;
import X.C945740aia;
import X.C946690ak7;
import X.C953270auj;
import X.C953290aul;
import X.C953600avG;
import X.C953770avX;
import X.C969680bLC;
import X.C971040bNO;
import X.C971050bNP;
import X.C987170bnP;
import X.C987240bnW;
import X.EnumC919100a1c;
import X.EnumC919170a1j;
import X.EnumC946710ak9;
import X.EnumC946760akE;
import X.InterfaceC1487280oo2;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.INoticeboardApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.CloudDraftItemManager;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardMaterialCreateParams;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.model.PaidCollectionDetailResponse;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import webcast.data.multi_guest_play.NoticeboardMaterialInfo;

/* JADX INFO: loaded from: classes16.dex */
public class AkS477S0100000_15 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            case 6:
                return apply$6(this, obj);
            case 7:
                return apply$7(this, obj);
            case 8:
                return apply$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return apply$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return apply$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return apply$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return apply$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return apply$13(this, obj);
            case 14:
                return apply$14(this, obj);
            case 15:
                return apply$15(this, obj);
            case 16:
                return apply$16(this, obj);
            default:
                return null;
        }
    }

    public AkS477S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(AkS477S0100000_15 akS477S0100000_15, Object obj) {
        C953770avX c953770avX = (C953770avX) obj;
        BPEAHandler bPEAHandler = CloudDraftItemManager.LIZ;
        return C953290aul.LIZ(CloudDraftItemManager.LJIIIIZZ((NLEEditor) akS477S0100000_15.l0, c953770avX), AbstractC19484711Kz.LJIJJLI(c953770avX));
    }

    public static final Object apply$1(AkS477S0100000_15 akS477S0100000_15, Object obj) {
        List list = (List) obj;
        return C11NZ.LJJJJIZL(C13LP.LLIIL(list)).LJIJJ(new AkS324S0200000_15((C971050bNP) akS477S0100000_15.l0, list, 4)).LJLJLLL();
    }

    public static final Object apply$10(AkS477S0100000_15 akS477S0100000_15, Object obj) {
        if (((FollowPair) obj).LIZIZ() && !C930540aK4.LIZLLL()) {
            C19487111Lx c19487111Lx = ((C946690ak7) akS477S0100000_15.l0).LJIILIIL;
            if (c19487111Lx != null) {
                c19487111Lx.dispose();
            }
            C946690ak7 c946690ak7 = (C946690ak7) akS477S0100000_15.l0;
            EnumC946760akE enumC946760akE = EnumC946760akE.FOLLOW_GUIDE_ACTION;
            EnumC946710ak9 enumC946710ak9 = EnumC946710ak9.FOLLOW;
            C13BV c13bv = C13BV.INSTANCE;
            c946690ak7.LJIIIZ(enumC946760akE, enumC946710ak9, 5, c13bv, c13bv, null);
        }
        return Unit.LIZ;
    }

    public static final Object apply$11(AkS477S0100000_15 akS477S0100000_15, Object obj) {
        Pair pair = (Pair) obj;
        Boolean bool = (Boolean) pair.getFirst();
        List list = (List) pair.getSecond();
        if (!bool.booleanValue() && (!list.isEmpty())) {
            ((AbstractC938650aX9) akS477S0100000_15.l0).LJ(false);
        } else {
            ((AbstractC938650aX9) akS477S0100000_15.l0).LJ(true);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$12(AkS477S0100000_15 akS477S0100000_15, Object obj) {
        long jLongValue;
        boolean z;
        Integer numValueOf;
        Integer numValueOf2;
        Long l;
        BattleSetting battleSetting;
        BaseResponse baseResponse = (BaseResponse) obj;
        Long l2 = ((BattleInfoResponse) baseResponse.data).battleId;
        if (l2 != null) {
            jLongValue = l2.longValue();
        } else {
            jLongValue = 0;
        }
        if (jLongValue > 0 && (battleSetting = ((BattleInfoResponse) baseResponse.data).setting) != null && battleSetting.battleType == EnumC919170a1j.MATCH_TYPE_INDIVIDUAL.getType()) {
            z = false;
        } else {
            z = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isNotInIndividualMatch");
        sbLIZ.append(", result=");
        sbLIZ.append(z);
        sbLIZ.append(", battleId=");
        sbLIZ.append(((BattleInfoResponse) baseResponse.data).battleId);
        sbLIZ.append(", battleType=");
        BattleSetting battleSetting2 = ((BattleInfoResponse) baseResponse.data).setting;
        Integer numValueOf3 = null;
        if (battleSetting2 != null) {
            numValueOf = Integer.valueOf(battleSetting2.battleType);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", status=");
        BattleSetting battleSetting3 = ((BattleInfoResponse) baseResponse.data).setting;
        if (battleSetting3 != null) {
            numValueOf2 = Integer.valueOf(battleSetting3.status);
        } else {
            numValueOf2 = null;
        }
        sbLIZ.append(numValueOf2);
        C20441214yg.LJ("MultiHostCrossAdapter", C2188811AlT.LIZIZ(sbLIZ));
        BattleInfoResponse battleInfoResponse = (BattleInfoResponse) baseResponse.data;
        BattleSetting battleSetting4 = battleInfoResponse.setting;
        if (battleSetting4 != null && ((battleSetting4.status == 3 || battleSetting4.status == 1) && (l = battleInfoResponse.battleId) != null && l.longValue() > 0)) {
            MultiHostCrossAdapterImpl multiHostCrossAdapterImpl = (MultiHostCrossAdapterImpl) akS477S0100000_15.l0;
            multiHostCrossAdapterImpl.getClass();
            MultiHostCrossAdapterImpl multiHostCrossAdapterImpl2 = (MultiHostCrossAdapterImpl) akS477S0100000_15.l0;
            BattleSetting battleSetting5 = ((BattleInfoResponse) baseResponse.data).setting;
            if (battleSetting5 != null) {
                numValueOf3 = Integer.valueOf(battleSetting5.battleType);
            }
            multiHostCrossAdapterImpl2.LLJJL = C918130a03.LIZ(numValueOf3);
            DataChannel dataChannel = ((MultiHostCrossAdapterImpl) akS477S0100000_15.l0).LLJILJIL;
            if (dataChannel != null) {
                dataChannel.SX0(C969680bLC.class, baseResponse.data);
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object apply$13(Y.AkS477S0100000_15 r6, java.lang.Object r7) {
        /*
            X.11H7 r7 = (X.C11H7) r7
            A r0 = r7.LIZ
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r5 = r0.booleanValue()
            B r3 = r7.LIZIZ
            java.util.List r3 = (java.util.List) r3
            C r0 = r7.LIZJ
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L86
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L86
            java.lang.Object r0 = r6.l0
            X.0aaw r0 = (X.C941000aaw) r0
            X.0b0m r0 = r0.getWindow()
            tikcast.linkmic.common.PosIdentity r4 = r0.getPosIdentity()
            r1 = 1
            r2 = 0
            if (r4 == 0) goto L84
            int r0 = r4.type
            if (r0 != r1) goto L84
            java.lang.String r1 = r4.value
        L34:
            com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2 r0 = X.C915980Zwa.LJIIIIZZ()
            X.0awC r0 = r0.LLJLL()
            if (r0 == 0) goto L46
            com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo r0 = r0.G0()
            if (r0 == 0) goto L46
            java.lang.String r2 = r0.linkMicId
        L46:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r2)
            if (r0 != 0) goto L86
            java.lang.Object r0 = r6.l0
            X.0aaw r0 = (X.C941000aaw) r0
            X.0b0m r0 = r0.getWindow()
            boolean r0 = r0.LLJIJIL
            if (r0 == 0) goto L72
            java.lang.Object r1 = r6.l0
            X.0aaw r1 = (X.C941000aaw) r1
            r1.getClass()
            boolean r0 = X.C930540aK4.LIZJ()
            if (r0 == 0) goto L72
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r1.getDataChannel()
            java.lang.Class<com.bytedance.android.live.liveinteract.multiguestv3.StatusBarVisibilityEvent> r1 = com.bytedance.android.live.liveinteract.multiguestv3.StatusBarVisibilityEvent.class
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r2.LC0(r1, r0)
        L72:
            java.lang.Object r2 = r6.l0
            X.0aaw r2 = (X.C941000aaw) r2
            java.lang.Object r1 = X.C13LP.LJJJJZI(r3)
            X.1DgL r1 = (X.C2262071DgL) r1
            r0 = r5 ^ 1
            r2.LJIIJ(r1, r0)
        L81:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L84:
            r1 = r2
            goto L34
        L86:
            java.lang.Object r0 = r6.l0
            X.0aaw r0 = (X.C941000aaw) r0
            java.lang.String r1 = r0.getRealTag()
            java.lang.String r0 = "setVisibilityGone"
            X.C937310aUz.LIZLLL(r1, r0)
            java.lang.Object r1 = r6.l0
            X.0aaw r1 = (X.C941000aaw) r1
            r0 = 0
            r1.setVisibilityOpt(r0)
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AkS477S0100000_15.apply$13(Y.AkS477S0100000_15, java.lang.Object):java.lang.Object");
    }

    public static final Object apply$14(AkS477S0100000_15 akS477S0100000_15, Object obj) {
        Pair pair = (Pair) obj;
        Boolean bool = (Boolean) pair.getFirst();
        List list = (List) pair.getSecond();
        String realTag = ((C940990aav) akS477S0100000_15.l0).getRealTag();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("firstFrameArrived: ");
        sbLIZ.append(bool);
        sbLIZ.append(", user: ");
        sbLIZ.append(list);
        C937310aUz.LIZLLL(realTag, C2188811AlT.LIZIZ(sbLIZ));
        if (!bool.booleanValue() && (!list.isEmpty())) {
            ((C940990aav) akS477S0100000_15.l0).setVisibilityOpt(true);
            ImageModel avatarThumb = ((C2262071DgL) C13LP.LJJJJZI(list)).getAvatarThumb();
            if (avatarThumb != null) {
                C940990aav c940990aav = (C940990aav) akS477S0100000_15.l0;
                ViewGroup prepareContainer = c940990aav.getPrepareContainer();
                if (prepareContainer != null) {
                    C12ES.LJIILL(0, prepareContainer);
                }
                c940990aav.LJIIL(((C2262071DgL) C13LP.LJJJJZI(list)).getId());
                c940990aav.LJIIJJI(avatarThumb);
                c940990aav.LJIIIZ(((C2262071DgL) C13LP.LJJJJZI(list)).LIZIZ, avatarThumb, c940990aav.getPrepareAvatarBackground());
                return Unit.LIZ;
            }
            return null;
        }
        ((C940990aav) akS477S0100000_15.l0).setVisibilityOpt(false);
        return Unit.LIZ;
    }

    public static final Object apply$15(AkS477S0100000_15 akS477S0100000_15, Object obj) {
        Pair pair = (Pair) obj;
        ((C940120aZW) akS477S0100000_15.l0).LJIJJ((List) pair.getFirst());
        ((C940120aZW) akS477S0100000_15.l0).LJIIZILJ(((Number) pair.getSecond()).intValue());
        return Unit.LIZ;
    }

    public static final Object apply$16(AkS477S0100000_15 akS477S0100000_15, Object obj) {
        C20441214yg.LJIIIZ("NoticeBoardDialogPresenter", "save success");
        ((C971040bNO) akS477S0100000_15.l0).LIZ.LJJIII(EnumC919100a1c.DISMISS_SAVE);
        return Unit.LIZ;
    }

    public static final Object apply$2(AkS477S0100000_15 akS477S0100000_15, Object obj) {
        List<C953770avX> list = (List) obj;
        ((C971050bNP) akS477S0100000_15.l0).LIZ.LJLILLLLZI("step 3/5", "update draftItem to cloudDraftRecordList...", false);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C953770avX c953770avX : list) {
            BPEAHandler bPEAHandler = CloudDraftItemManager.LIZ;
            arrayList.add(CloudDraftItemManager.LJIIIZ(c953770avX));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("step 3: finished, currentThread: ");
        sbLIZ.append(C786410Ut5.u3());
        C20441214yg.LIZIZ("starling_template", C2188811AlT.LIZIZ(sbLIZ));
        return AbstractC19484711Kz.LJJIL(arrayList, new InterfaceC1487280oo2() { // from class: X.00DT
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj2) {
                Object[] objArr = (Object[]) obj2;
                ArrayList arrayList2 = new ArrayList(objArr.length);
                for (Object obj3 : objArr) {
                    arrayList2.add(obj3);
                }
                return arrayList2;
            }
        });
    }

    public static final Object apply$3(AkS477S0100000_15 akS477S0100000_15, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C945740aia c945740aia = (C945740aia) akS477S0100000_15.l0;
            c945740aia.getClass();
            return C11NZ.LJIJJLI(new C987240bnW(c945740aia, 5));
        }
        return C11NZ.LJJJJZ(Boolean.FALSE);
    }

    public static final Object apply$4(AkS477S0100000_15 akS477S0100000_15, Object obj) {
        Pair pair = (Pair) obj;
        BPEAHandler bPEAHandler = CloudDraftItemManager.LIZ;
        String str = ((C953600avG) akS477S0100000_15.l0).LIZ;
        String str2 = ((C953270auj) pair.getFirst()).LIZ;
        String str3 = ((C953270auj) pair.getFirst()).LIZIZ;
        String str4 = ((C953270auj) pair.getFirst()).LIZJ;
        C480460Ism.LIZ().getClass();
        INoticeboardApi iNoticeboardApi = (INoticeboardApi) C480460Ism.LIZLLL(INoticeboardApi.class);
        NoticeboardMaterialCreateParams noticeboardMaterialCreateParams = new NoticeboardMaterialCreateParams();
        noticeboardMaterialCreateParams.mediaNodeId = str;
        NoticeboardMaterialInfo noticeboardMaterialInfo = new NoticeboardMaterialInfo();
        noticeboardMaterialInfo.backgroundImageUri = str2;
        noticeboardMaterialInfo.coverImageUri = str3;
        noticeboardMaterialInfo.configJsonUri = str4;
        noticeboardMaterialCreateParams.noticeboardMaterialInfo = noticeboardMaterialInfo;
        return iNoticeboardApi.createNoticeboardMaterial(noticeboardMaterialCreateParams).LJIL(new InterfaceC1487280oo2() { // from class: X.00R2
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj2) {
                BaseResponse baseResponse = (BaseResponse) obj2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("createNoticeboardMaterial success logid=");
                sbLIZ.append(baseResponse.LIZIZ);
                C20441214yg.LJIIIZ("NoticeboardController", C2188811AlT.LIZIZ(sbLIZ));
                return baseResponse.data;
            }
        }).LJIIL(new C09JN() { // from class: X.00Sn
            @Override // X.C09JN
            public final void accept(Object obj2) {
                String str5;
                C1C7U.LIZ("CloudDraftItemManager@9865.createNoticeboardMaterial$3");
                Throwable th = (Throwable) obj2;
                if (th instanceof C477520Io2) {
                    str5 = ((C477520Io2) th).getxTtLogId();
                } else {
                    str5 = "";
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("createNoticeboardMaterial fail logid=");
                sbLIZ.append(str5);
                sbLIZ.append(" throwable=");
                sbLIZ.append(th);
                C20441214yg.LJIIIZ("NoticeboardController", C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("CloudDraftItemManager@9865.createNoticeboardMaterial$3");
            }
        });
    }

    public static final Object apply$5(AkS477S0100000_15 akS477S0100000_15, Object obj) {
        C917840Zza c917840Zza = (C917840Zza) obj;
        BPEAHandler bPEAHandler = CloudDraftItemManager.LIZ;
        return CloudDraftItemManager.LJII(c917840Zza, Long.valueOf(((C916750Zxp) akS477S0100000_15.l0).LIZIZ), c917840Zza.LJFF, "", null);
    }

    public static final Object apply$6(AkS477S0100000_15 akS477S0100000_15, Object obj) {
        C916750Zxp c916750Zxp = (C916750Zxp) akS477S0100000_15.l0;
        if (c916750Zxp.LIZ == 1) {
            long j = c916750Zxp.LIZIZ;
            if (j > 0) {
                CloudDraftItemManager.LIZLLL.put(Long.valueOf(j), obj);
            }
        } else if (C1533950q1J.LJ(c916750Zxp.LIZJ)) {
            CloudDraftItemManager.LIZIZ.put(((C916750Zxp) akS477S0100000_15.l0).LIZJ, obj);
            return obj;
        }
        return obj;
    }

    public static final Object apply$7(AkS477S0100000_15 akS477S0100000_15, Object obj) {
        return AbstractC19484711Kz.LJII(new C987170bnP((C917840Zza) akS477S0100000_15.l0, 5));
    }

    public static final Object apply$8(AkS477S0100000_15 akS477S0100000_15, Object obj) {
        return (PaidCollectionDetailResponse) akS477S0100000_15.l0;
    }

    public static final Object apply$9(AkS477S0100000_15 akS477S0100000_15, Object obj) {
        ((C751910TeX) akS477S0100000_15.l0).LIZ.put(Long.valueOf(((FollowPair) obj).LIZ), Long.valueOf(r4.followStatus));
        return Unit.LIZ;
    }
}
