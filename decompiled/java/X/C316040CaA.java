package X;

import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0CaA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.effect.adapter.EffectProfileViewHolder$findCorrespondingDraftId$2", f = "EffectProfileViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C316040CaA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public final /* synthetic */ InterfaceC318260Cdk LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316040CaA(InterfaceC318260Cdk interfaceC318260Cdk, String str, InterfaceC1364105Vn<? super C316040CaA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC318260Cdk;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C316040CaA(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String draftId;
        CKEDraftInfo next;
        C1C7U.LIZ("EffectProfileViewHolder@e064.findCorrespondingDraftId$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC318260Cdk interfaceC318260Cdk = this.LL;
        C844470XAv.LIZ.getClass();
        List<CKEDraftInfo> listLJII = interfaceC318260Cdk.LJII(C844470XAv.LIZ());
        String str = this.LLILLJJLI;
        Iterator<CKEDraftInfo> it2 = listLJII.iterator();
        while (true) {
            draftId = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getEffectId(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        CKEDraftInfo cKEDraftInfo = next;
        if (cKEDraftInfo != null) {
            draftId = cKEDraftInfo.getDraftId();
        }
        C1C7U.LIZIZ("EffectProfileViewHolder@e064.findCorrespondingDraftId$2");
        return draftId;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
