package X;

import android.view.ViewStructure;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.net.ConvertOidToUrlResponse;
import com.ss.ugc.effectplatform.model.net.ResourceUrl;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.14dO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20309214dO extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20309214dO(C20000613Nk c20000613Nk, int i) {
        super(4);
        this.$t = i;
        this.l0 = c20000613Nk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20309214dO(ViewStructure viewStructure, int i) {
        super(4);
        this.$t = i;
        this.l0 = viewStructure;
    }

    public static final Object invoke$0(C20309214dO c20309214dO, Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        ((ViewStructure) c20309214dO.l0).setDimens(iIntValue, iIntValue2, 0, 0, ((Number) obj3).intValue() - iIntValue, ((Number) obj4).intValue() - iIntValue2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(C20309214dO c20309214dO, Object obj, Object obj2, Object obj3, Object obj4) {
        final Map map = (Map) obj3;
        final InterfaceC20000513Nj interfaceC20000513Nj = (InterfaceC20000513Nj) obj4;
        C20000613Nk c20000613Nk = (C20000613Nk) c20309214dO.l0;
        c20000613Nk.getClass();
        c20000613Nk.LIZIZ((String) obj, (String) obj2, C13LP.LLIIII(map.keySet()), new C13MA<ConvertOidToUrlResponse>() { // from class: X.13Ni
            @Override // X.C13MA
            public final void onSuccess(ConvertOidToUrlResponse convertOidToUrlResponse) {
                List<ResourceUrl> url_list;
                ConvertOidToUrlResponse convertOidToUrlResponse2 = convertOidToUrlResponse;
                if (convertOidToUrlResponse2 != null && (url_list = convertOidToUrlResponse2.getUrl_list()) != null) {
                    Map<String, Effect> map2 = map;
                    for (ResourceUrl resourceUrl : url_list) {
                        Effect effect = map2.get(resourceUrl.getOid());
                        if (effect != null) {
                            effect.getIcon_url().setUrlList(C13LQ.LJIJI(new String[]{resourceUrl.getMain_url(), resourceUrl.getBackup_url()}));
                        }
                    }
                }
                interfaceC20000513Nj.onSuccess();
            }

            @Override // X.C13MA
            public final /* bridge */ /* synthetic */ void preProcess(ConvertOidToUrlResponse convertOidToUrlResponse) {
            }

            @Override // X.C13MA
            public final void onFail(ConvertOidToUrlResponse convertOidToUrlResponse, C1662010tLr c1662010tLr) {
                interfaceC20000513Nj.LIZ(c1662010tLr);
            }
        });
        return Unit.LIZ;
    }
}
