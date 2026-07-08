package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tts.pigeon.GECPigeon;
import com.bytedance.tts.pigeon.paas.detailpage.component.api.PigeonMessageListComponentApi;
import com.bytedance.tts.pigeon.paas.detailpage.container.PigeonConversationDetailContainer;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Zth, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C914190Zth extends C09AY implements InterfaceC1631630sYr {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(2);
    public final int $t;

    public static C914190Zth get$arr$(int i) {
        C914190Zth c914190Zth = (C914190Zth) arr$.get(i);
        if (c914190Zth != null) {
            return c914190Zth;
        }
        arr$.compareAndSet(i, null, new C914190Zth(i));
        return (C914190Zth) arr$.get(i);
    }

    @Override // X.InterfaceC1631630sYr
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
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
    public C914190Zth(int i) {
        super(4);
        this.$t = i;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$0(C914190Zth c914190Zth, Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj2).intValue();
        ((Boolean) obj3).booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$1(C914190Zth c914190Zth, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        String str = (String) obj;
        PigeonConversationDetailContainer pigeonConversationDetailContainer = (PigeonConversationDetailContainer) obj2;
        CompletionBlock completionBlock = (CompletionBlock) obj4;
        PigeonMessageListComponentApi pigeonMessageListComponentApi = (PigeonMessageListComponentApi) C876050YYh.LIZLLL(pigeonConversationDetailContainer, C13LE.LIZ(PigeonMessageListComponentApi.class));
        if (pigeonMessageListComponentApi == null) {
            C2382909Vj.LIZ(completionBlock, 9998, "messageListComponent not found", null, 4);
        } else {
            C054G c054g = pigeonConversationDetailContainer.LLILZ;
            GECPigeon.Companion.getClass();
            C23250099c.LIZLLL(c054g, C872060YIy.LIZ().LIZJ().LIZJ, null, new C319740Cg8(pigeonMessageListComponentApi, null), 2);
            XBaseModel xBaseModelLIZJ = C1549500qQO.LIZJ(str, C13LE.LIZ(InterfaceC875720YXa.class));
            InterfaceC875720YXa interfaceC875720YXa = (InterfaceC875720YXa) xBaseModelLIZJ;
            if (pigeonMessageListComponentApi.LJJIJLIJ().getValue() != C0NZH.NO_MORE) {
                z = true;
            } else {
                z = false;
            }
            interfaceC875720YXa.setHasMore(Boolean.valueOf(z));
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        }
        return Unit.LIZ;
    }
}
