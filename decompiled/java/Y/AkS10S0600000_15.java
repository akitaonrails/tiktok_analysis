package Y;

import X.AbstractC19484711Kz;
import X.C118300cf;
import X.C1697810uHb;
import X.C191300oR;
import X.C20441214yg;
import X.C2188811AlT;
import X.C259800zU;
import X.C480460Ism;
import X.C917840Zza;
import X.C930930aKh;
import X.C930940aKi;
import X.C953230auf;
import X.C953270auj;
import X.C953770avX;
import X.C954060aw0;
import X.C971050bNP;
import X.C971360bNu;
import X.InterfaceC1487280oo2;
import X.InterfaceC300801Eo;
import X.InterfaceC971000bNK;
import Y.ACallableS91S0400000_15;
import Y.AfS184S0100000_15;
import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.IMultiGuestPlayApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.INoticeboardApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.template.MultiGuestBoardTemplateOfficialConfigSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.live.liveinteract.multilive.model.IdGenParams;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardOfficialTemplateUpdateParams;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS259S0300000_15;
import webcast.data.multi_guest_play.SubOfficialMaterialInfo;

/* JADX INFO: loaded from: classes16.dex */
public class AkS10S0600000_15 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(AkS10S0600000_15 akS10S0600000_15, Object obj) {
        int i;
        long id;
        Pair pair = (Pair) obj;
        List list = (List) pair.getFirst();
        List list2 = (List) pair.getSecond();
        C20441214yg.LIZIZ("starling_template", "step 5: start");
        ((C971050bNP) akS10S0600000_15.l0).LIZ.LJLILLLLZI("step 5/5", "call server api...", false);
        ArrayList arrayList = new ArrayList();
        C259800zU c259800zU = (C259800zU) akS10S0600000_15.l4;
        List list3 = (List) akS10S0600000_15.l5;
        Iterator it2 = list2.iterator();
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (it2.hasNext()) {
                Object next = it2.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    SubOfficialMaterialInfo subOfficialMaterialInfo = new SubOfficialMaterialInfo();
                    MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
                    String str = ((C953770avX) ListProtector.get((List) c259800zU.element, i2)).LJIIIZ;
                    C917840Zza c917840Zza = (C917840Zza) ListProtector.get(list, i2);
                    multiCanvasUtils.getClass();
                    subOfficialMaterialInfo.materialInfo = MultiCanvasUtils.LIZLLL((C953270auj) next, str, c917840Zza);
                    subOfficialMaterialInfo.locale = (String) ListProtector.get(list3, i2);
                    subOfficialMaterialInfo.mediaNodeId = ((C953770avX) ListProtector.get((List) c259800zU.element, i2)).LJII;
                    if (i2 != 0) {
                        z = false;
                    }
                    subOfficialMaterialInfo.isOriginalContent = z;
                    arrayList.add(subOfficialMaterialInfo);
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                C20441214yg.LIZIZ("starling_template", "step 5.2: start call http request");
                Long l = ((C953770avX) akS10S0600000_15.l1).LJIIL;
                C118300cf c118300cf = (C118300cf) akS10S0600000_15.l2;
                if (!((List) akS10S0600000_15.l3).isEmpty()) {
                    i = 1;
                } else {
                    i = 2;
                }
                c118300cf.element = i;
                if (l != null) {
                    C953230auf c953230auf = C953230auf.LIZ;
                    long jLongValue = l.longValue();
                    c953230auf.getClass();
                    if (C953230auf.LJIILJJIL(jLongValue)) {
                        C480460Ism.LIZ().getClass();
                        INoticeboardApi iNoticeboardApi = (INoticeboardApi) C480460Ism.LIZLLL(INoticeboardApi.class);
                        NoticeboardOfficialTemplateUpdateParams noticeboardOfficialTemplateUpdateParams = new NoticeboardOfficialTemplateUpdateParams();
                        C118300cf c118300cf2 = (C118300cf) akS10S0600000_15.l2;
                        noticeboardOfficialTemplateUpdateParams.subOfficialMaterialInfoList = arrayList;
                        noticeboardOfficialTemplateUpdateParams.officialMaterialType = c118300cf2.element;
                        noticeboardOfficialTemplateUpdateParams.privateStatus = 1;
                        noticeboardOfficialTemplateUpdateParams.noticeboardTemplateId = l.longValue();
                        noticeboardOfficialTemplateUpdateParams.updateType = 2;
                        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                        if (room == null && (room = (Room) dataChannelGlobal.gg0(C930930aKh.class)) == null) {
                            id = 0;
                        } else {
                            id = room.getId();
                        }
                        noticeboardOfficialTemplateUpdateParams.roomId = id;
                        return C191300oR.LIZJ(C191300oR.LIZ(iNoticeboardApi.updateOfficialTemplate(noticeboardOfficialTemplateUpdateParams), "starling_template", "createOfficialTemplate"));
                    }
                }
                C480460Ism.LIZ().getClass();
                return C191300oR.LIZJ(C191300oR.LIZ(((IMultiGuestPlayApi) C480460Ism.LIZLLL(IMultiGuestPlayApi.class)).idGen(new IdGenParams()), "starling_template", "idGen")).LJIIZILJ(new AkS324S0200000_15((C118300cf) akS10S0600000_15.l2, arrayList, 2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$1(AkS10S0600000_15 akS10S0600000_15, Object obj) {
        IndexedValue indexedValue = (IndexedValue) obj;
        final C953770avX c953770avX = (C953770avX) indexedValue.LIZIZ;
        int i = indexedValue.LIZ;
        C954060aw0 c954060aw0 = (C954060aw0) akS10S0600000_15.l0;
        Context context = (Context) akS10S0600000_15.l1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("translating draftItem... ");
        sbLIZ.append(i);
        sbLIZ.append('/');
        sbLIZ.append(((List) akS10S0600000_15.l2).size());
        c954060aw0.LIZ(context, "step 2/5", C2188811AlT.LIZIZ(sbLIZ), false);
        if (i == 0) {
            return AbstractC19484711Kz.LJIJJLI(c953770avX);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("step 2.4: updateTranslatedTextsAndCapture, textList: ");
        sbLIZ2.append(((C953770avX) ListProtector.get((List) akS10S0600000_15.l2, i)).LJI);
        C20441214yg.LIZIZ("starling_template", C2188811AlT.LIZIZ(sbLIZ2));
        C954060aw0 c954060aw02 = (C954060aw0) akS10S0600000_15.l0;
        final InterfaceC971000bNK interfaceC971000bNK = (InterfaceC971000bNK) akS10S0600000_15.l3;
        final List<C971360bNu> list = ((C953770avX) ListProtector.get((List) akS10S0600000_15.l2, i - 1)).LJI;
        final List<C971360bNu> list2 = ((C953770avX) ListProtector.get((List) akS10S0600000_15.l2, i)).LJI;
        final Function0 function0 = (Function0) akS10S0600000_15.l4;
        final Function2 function2 = (Function2) akS10S0600000_15.l5;
        c954060aw02.getClass();
        return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0bNJ
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<C953770avX> interfaceC2329309At) {
                C500260Jjc.LJJLIIIJILLIZJL(new AwS259S0300000_15(interfaceC971000bNK, (InterfaceC971000bNK) list, list2, (List<C971360bNu>) 53));
                final InterfaceC971000bNK interfaceC971000bNK2 = interfaceC971000bNK;
                final List<C971360bNu> list3 = list;
                final List<C971360bNu> list4 = list2;
                final Function0<Bitmap> function02 = function0;
                final Function2<C953770avX, Bitmap, C953770avX> function22 = function2;
                final C953770avX c953770avX2 = c953770avX;
                final C11KT c11kt = (C11KT) interfaceC2329309At;
                C470360IcU.LIZIZ(new Runnable() { // from class: X.0bNL
                    public final void LIZ() {
                        interfaceC971000bNK2.LJJIIZ(list3, list4);
                        try {
                            Bitmap bitmapInvoke = function02.invoke();
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("try to get bitmap, translatedTextList: ");
                            sbLIZ3.append(list4);
                            C20441214yg.LIZIZ("starling_template", C2188811AlT.LIZIZ(sbLIZ3));
                            C11HU c11huLJJ = AbstractC19484711Kz.LJIJI(new ACallableS91S0400000_15(bitmapInvoke, list4, function22, c953770avX2, 1)).LJJIJIIJI(C11S5.LIZ()).LJJ(C11S5.LIZ());
                            InterfaceC2329309At<C953770avX> interfaceC2329309At2 = c11kt;
                            c11huLJJ.LJJIIZ(new AfS184S0100000_15(interfaceC2329309At2, 218), new AfS184S0100000_15(interfaceC2329309At2, 219));
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            c11kt.onError(e);
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("NoticeboardEditorOfficial@3b7a.updateTranslatedTextsAndCapture$1$2");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("NoticeboardEditorOfficial@3b7a.updateTranslatedTextsAndCapture$1$2");
                    }
                }, MultiGuestBoardTemplateOfficialConfigSetting.INSTANCE.getValue().renderMillSecondInternal, TimeUnit.MILLISECONDS);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AkS10S0600000_15(Object obj, C971050bNP c971050bNP, C953770avX c953770avX, C118300cf c118300cf, List<String> list, C259800zU<List<C953770avX>> c259800zU, List<String> list2) {
        this.$t = list2;
        this.l0 = obj;
        this.l1 = c971050bNP;
        this.l2 = c953770avX;
        this.l3 = c118300cf;
        this.l4 = list;
        this.l5 = c259800zU;
    }
}
