package Y;

import X.AbstractC19484711Kz;
import X.C11S5;
import X.C191300oR;
import X.C19475311Hj;
import X.C20441214yg;
import X.C480460Ism;
import X.C953290aul;
import X.C953760avW;
import X.C953770avX;
import X.InterfaceC1487280oo2;
import X.InterfaceC300801Eo;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.INoticeboardApi;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardTemplateSaveParams;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardTemplateSaveResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import webcast.data.multi_guest_play.NoticeboardTemplate;

/* JADX INFO: loaded from: classes16.dex */
public class AkS16S0000100_15 implements InterfaceC1487280oo2 {
    public final int $t;
    public long j0;

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
            default:
                return null;
        }
    }

    public AkS16S0000100_15(long j, int i) {
        this.$t = i;
        this.j0 = j;
    }

    public static final Object apply$0(AkS16S0000100_15 akS16S0000100_15, Object obj) {
        final long j = akS16S0000100_15.j0;
        return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0avn
            /* JADX WARN: Type inference failed for: r3v0, types: [X.0au6, X.0avo] */
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<String> interfaceC2329309At) {
                String str = C953230auf.LJ.get(Long.valueOf(j));
                if (str != null) {
                    interfaceC2329309At.onSuccess(str);
                    return;
                }
                final long j2 = j;
                final C11KT c11kt = (C11KT) interfaceC2329309At;
                final ?? r3 = new InterfaceC952880au6() { // from class: X.0avo
                    @Override // X.InterfaceC952880au6
                    public final void onSuccess() {
                        InterfaceC2329309At<String> interfaceC2329309At2 = c11kt;
                        String str2 = C953230auf.LJ.get(Long.valueOf(j2));
                        if (str2 == null) {
                            str2 = "";
                        }
                        interfaceC2329309At2.onSuccess(str2);
                    }

                    @Override // X.InterfaceC952880au6
                    public final void LIZ(Throwable th) {
                        c11kt.onError(th);
                    }
                };
                C953230auf.LIZ.getClass();
                C953230auf.LIZLLL(1, r3);
                interfaceC2329309At.setCancellable(new C11KX() { // from class: X.0avp
                    @Override // X.C11KX
                    public final void cancel() {
                        C953230auf c953230auf = C953230auf.LIZ;
                        C953940avo c953940avo = r3;
                        c953230auf.getClass();
                        C953230auf.LJIILL(c953940avo);
                    }
                });
            }
        });
    }

    public static final Object apply$1(AkS16S0000100_15 akS16S0000100_15, Object obj) {
        C20441214yg.LJIIIZ("TemplateManager_noticeboard", "delete template success");
        Iterator it2 = ((ArrayList) C953760avW.LIZIZ.LIZ().LJII(akS16S0000100_15.j0)).iterator();
        while (it2.hasNext()) {
            ((C953770avX) it2.next()).LJIILJJIL = true;
        }
        C953760avW.LIZIZ.LIZ().LJIILJJIL();
        return Unit.LIZ;
    }

    public static final Object apply$2(AkS16S0000100_15 akS16S0000100_15, Object obj) {
        C19475311Hj c19475311HjLJIJJLI = AbstractC19484711Kz.LJIJJLI(obj);
        C480460Ism.LIZ().getClass();
        INoticeboardApi iNoticeboardApi = (INoticeboardApi) C480460Ism.LIZLLL(INoticeboardApi.class);
        NoticeboardTemplateSaveParams noticeboardTemplateSaveParams = new NoticeboardTemplateSaveParams();
        noticeboardTemplateSaveParams.noticeboardTemplateId = akS16S0000100_15.j0;
        return C953290aul.LIZ(c19475311HjLJIJJLI, C191300oR.LIZJ(C191300oR.LIZ(iNoticeboardApi.saveTemplate(noticeboardTemplateSaveParams), "TemplateManager_noticeboard", "saveTemplate")).LJJIJIIJI(C11S5.LIZ()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$3(AkS16S0000100_15 akS16S0000100_15, Object obj) {
        NoticeboardTemplate noticeboardTemplate;
        Long lValueOf;
        Pair pair = (Pair) obj;
        NoticeboardTemplateSaveResponse.ResponseData responseData = (NoticeboardTemplateSaveResponse.ResponseData) ((BaseResponse) pair.getSecond()).data;
        if (responseData != null && (noticeboardTemplate = responseData.template) != null && (lValueOf = Long.valueOf(noticeboardTemplate.noticeboardTemplateId)) != null) {
            Iterator it2 = ((ArrayList) C953760avW.LIZIZ.LIZ().LJII(akS16S0000100_15.j0)).iterator();
            while (it2.hasNext()) {
                ((C953770avX) it2.next()).LJIIL = lValueOf;
            }
            C953760avW.LIZIZ.LIZ().LJIILJJIL();
        }
        return pair;
    }
}
