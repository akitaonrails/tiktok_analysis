package Y;

import X.AbstractC19484711Kz;
import X.C118300cf;
import X.C11NZ;
import X.C11S5;
import X.C13LP;
import X.C15438062q;
import X.C191300oR;
import X.C19475311Hj;
import X.C20441214yg;
import X.C2188811AlT;
import X.C259800zU;
import X.C480460Ism;
import X.C786410Ut5;
import X.C917840Zza;
import X.C930930aKh;
import X.C930940aKi;
import X.C953270auj;
import X.C953290aul;
import X.C953360aus;
import X.C953770avX;
import X.C954060aw0;
import X.C971050bNP;
import X.C971360bNu;
import X.DialogC971210bNf;
import X.InterfaceC1487280oo2;
import X.InterfaceC300801Eo;
import X.InterfaceC500500Jk0;
import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.IMultiGuestPlayApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.INoticeboardApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.template.MultiGuestBoardTemplateOfficialConfigSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.CloudDraftItemManager;
import com.bytedance.android.live.liveinteract.multilive.model.IdGenResponse;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardOfficialTemplateCreateParams;
import com.bytedance.android.live.liveinteract.multilive.model.StarlingTranslateParams;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;
import kotlin.jvm.internal.AwS76S0500000_15;
import webcast.data.multi_guest_play.SubOfficialMaterialInfo;

/* JADX INFO: loaded from: classes16.dex */
public class AkS324S0200000_15 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                return null;
        }
    }

    public static final Object apply$0(AkS324S0200000_15 akS324S0200000_15, Object obj) {
        C19475311Hj c19475311HjLJIJJLI = AbstractC19484711Kz.LJIJJLI((List) akS324S0200000_15.l0);
        long j = MultiGuestBoardTemplateOfficialConfigSetting.INSTANCE.getValue().tosMillSecondInternal;
        List list = (List) akS324S0200000_15.l0;
        return AbstractC19484711Kz.LJJJ(c19475311HjLJIJJLI, C11NZ.LJJJJIZL(C13LP.LLIIL(list)).LJIJ(new C953360aus(j, list, new AwS629S0100000_15((C971050bNP) akS324S0200000_15.l1, 1))).LJLJLLL(), new InterfaceC500500Jk0<List<? extends C917840Zza>, List<? extends C953270auj>, R>() { // from class: X.0aw6
            @Override // X.InterfaceC500500Jk0
            public final R apply(List<? extends C917840Zza> list2, List<? extends C953270auj> list3) {
                return (R) new Pair(list2, list3);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    public static final Object apply$1(AkS324S0200000_15 akS324S0200000_15, Object obj) {
        List list = (List) obj;
        ((C259800zU) akS324S0200000_15.l0).element = ListProtector.get(list, 0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("step 4: upload to Tos finished, currentThread: ");
        sbLIZ.append(C786410Ut5.u3());
        C20441214yg.LIZIZ("starling_template", C2188811AlT.LIZIZ(sbLIZ));
        return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0avv
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<Integer> interfaceC2329309At) {
                C11KT c11kt = (C11KT) interfaceC2329309At;
                C953370aut.LIZ(new AwS559S0100000_15(c11kt, 59), new AwS594S0100000_15(c11kt, 41));
            }
        }).LJJ(C11S5.LIZ()).LJIIZILJ(new AkS324S0200000_15((C971050bNP) akS324S0200000_15.l1, list, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$2(AkS324S0200000_15 akS324S0200000_15, Object obj) {
        long id;
        BaseResponse baseResponse = (BaseResponse) obj;
        C480460Ism.LIZ().getClass();
        INoticeboardApi iNoticeboardApi = (INoticeboardApi) C480460Ism.LIZLLL(INoticeboardApi.class);
        NoticeboardOfficialTemplateCreateParams noticeboardOfficialTemplateCreateParams = new NoticeboardOfficialTemplateCreateParams();
        List<SubOfficialMaterialInfo> list = (List) akS324S0200000_15.l0;
        C118300cf c118300cf = (C118300cf) akS324S0200000_15.l1;
        noticeboardOfficialTemplateCreateParams.subOfficialMaterialInfoList = list;
        noticeboardOfficialTemplateCreateParams.officialMaterialType = c118300cf.element;
        noticeboardOfficialTemplateCreateParams.privateStatus = 1;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room == null && (room = (Room) dataChannelGlobal.gg0(C930930aKh.class)) == null) {
            id = 0;
        } else {
            id = room.getId();
        }
        noticeboardOfficialTemplateCreateParams.roomId = id;
        noticeboardOfficialTemplateCreateParams.noticeboardTemplateId = ((IdGenResponse.ResponseData) baseResponse.data).id;
        return C191300oR.LIZJ(C191300oR.LIZ(iNoticeboardApi.createOfficialTemplate(noticeboardOfficialTemplateCreateParams), "starling_template", "createOfficialTemplate"));
    }

    public static final Object apply$3(AkS324S0200000_15 akS324S0200000_15, Object obj) {
        ((C971050bNP) akS324S0200000_15.l0).LIZ.LJLILLLLZI("step 1/5", "get translated texts...", false);
        if (((List) akS324S0200000_15.l1).isEmpty()) {
            return AbstractC19484711Kz.LJIJJLI(new Pair(obj, null));
        }
        C19475311Hj c19475311HjLJIJJLI = AbstractC19484711Kz.LJIJJLI(obj);
        C480460Ism.LIZ().getClass();
        IMultiGuestPlayApi iMultiGuestPlayApi = (IMultiGuestPlayApi) C480460Ism.LIZLLL(IMultiGuestPlayApi.class);
        StarlingTranslateParams starlingTranslateParams = new StarlingTranslateParams();
        List<String> list = (List) akS324S0200000_15.l1;
        starlingTranslateParams.useReqLocale = false;
        starlingTranslateParams.starlingKeyList = list;
        return C953290aul.LIZ(c19475311HjLJIJJLI, iMultiGuestPlayApi.starlingTranslate(starlingTranslateParams));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$4(AkS324S0200000_15 akS324S0200000_15, Object obj) {
        IndexedValue indexedValue = (IndexedValue) obj;
        final C953770avX c953770avX = (C953770avX) indexedValue.LIZIZ;
        int i = indexedValue.LIZ;
        DialogC971210bNf dialogC971210bNf = ((C971050bNP) akS324S0200000_15.l0).LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("translating draftItem... ");
        sbLIZ.append(i);
        sbLIZ.append('/');
        sbLIZ.append(((List) akS324S0200000_15.l1).size());
        dialogC971210bNf.LJLILLLLZI("step 2/5", C2188811AlT.LIZIZ(sbLIZ), false);
        if (i == 0) {
            return AbstractC19484711Kz.LJIJJLI(c953770avX);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("step 2.4: updateTranslatedTextsAndCapture, textList: ");
        sbLIZ2.append(((C953770avX) ListProtector.get((List) akS324S0200000_15.l1, i)).LJI);
        C20441214yg.LIZIZ("starling_template", C2188811AlT.LIZIZ(sbLIZ2));
        final DialogC971210bNf dialogC971210bNf2 = ((C971050bNP) akS324S0200000_15.l0).LIZ;
        final List<C971360bNu> list = ((C953770avX) ListProtector.get((List) akS324S0200000_15.l1, i - 1)).LJI;
        final List<C971360bNu> list2 = ((C953770avX) ListProtector.get((List) akS324S0200000_15.l1, i)).LJI;
        dialogC971210bNf2.getClass();
        return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0aw5
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<C953770avX> interfaceC2329309At) {
                C500260Jjc.LJJLIIIJILLIZJL(new AwS76S0500000_15(dialogC971210bNf2, list, list2, (C11KT) interfaceC2329309At, c953770avX, 0));
            }
        });
    }

    public static final Object apply$5(AkS324S0200000_15 akS324S0200000_15, Object obj) {
        List<C953770avX> list = (List) obj;
        ((C954060aw0) akS324S0200000_15.l0).LIZ((Context) akS324S0200000_15.l1, "step 3/5", "update draftItem to cloudDraftRecordList...", false);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C953770avX c953770avX : list) {
            BPEAHandler bPEAHandler = CloudDraftItemManager.LIZ;
            arrayList.add(CloudDraftItemManager.LJIIIZ(c953770avX));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("step 3: finished, currentThread: ");
        sbLIZ.append(C786410Ut5.u3());
        C20441214yg.LIZIZ("starling_template", C2188811AlT.LIZIZ(sbLIZ));
        return AbstractC19484711Kz.LJJIL(arrayList, new InterfaceC1487280oo2() { // from class: X.00DV
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$6(AkS324S0200000_15 akS324S0200000_15, Object obj) {
        long id;
        BaseResponse baseResponse = (BaseResponse) obj;
        C480460Ism.LIZ().getClass();
        INoticeboardApi iNoticeboardApi = (INoticeboardApi) C480460Ism.LIZLLL(INoticeboardApi.class);
        NoticeboardOfficialTemplateCreateParams noticeboardOfficialTemplateCreateParams = new NoticeboardOfficialTemplateCreateParams();
        List<SubOfficialMaterialInfo> list = (List) akS324S0200000_15.l0;
        C118300cf c118300cf = (C118300cf) akS324S0200000_15.l1;
        noticeboardOfficialTemplateCreateParams.subOfficialMaterialInfoList = list;
        noticeboardOfficialTemplateCreateParams.officialMaterialType = c118300cf.element;
        noticeboardOfficialTemplateCreateParams.privateStatus = 1;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room == null && (room = (Room) dataChannelGlobal.gg0(C930930aKh.class)) == null) {
            id = 0;
        } else {
            id = room.getId();
        }
        noticeboardOfficialTemplateCreateParams.roomId = id;
        noticeboardOfficialTemplateCreateParams.noticeboardTemplateId = ((IdGenResponse.ResponseData) baseResponse.data).id;
        return C191300oR.LIZJ(C191300oR.LIZ(iNoticeboardApi.createOfficialTemplate(noticeboardOfficialTemplateCreateParams), "starling_template", "createOfficialTemplate"));
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object apply$7(Y.AkS324S0200000_15 r23, java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AkS324S0200000_15.apply$7(Y.AkS324S0200000_15, java.lang.Object):java.lang.Object");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AkS324S0200000_15(X.C971050bNP r2, java.util.List r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            if (r4 == 0) goto Ld
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        L9:
            r0.<init>()
            return
        Ld:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AkS324S0200000_15.<init>(X.0bNP, java.util.List, int):void");
    }

    public AkS324S0200000_15(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
